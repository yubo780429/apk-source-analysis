package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f907c = new Object();
    private static ArrayList<WeakReference<q0>> d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f909b;

    private q0(Context context) {
        super(context);
        if (!y0.b()) {
            this.f908a = new s0(this, context.getResources());
            this.f909b = null;
            return;
        }
        y0 y0Var = new y0(this, context.getResources());
        this.f908a = y0Var;
        Resources.Theme themeNewTheme = y0Var.newTheme();
        this.f909b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        if ((context instanceof q0) || (context.getResources() instanceof s0) || (context.getResources() instanceof y0)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || y0.b();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f907c) {
            if (d == null) {
                d = new ArrayList<>();
            } else {
                for (int size = d.size() - 1; size >= 0; size--) {
                    WeakReference<q0> weakReference = d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        d.remove(size);
                    }
                }
                for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<q0> weakReference2 = d.get(size2);
                    q0 q0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (q0Var != null && q0Var.getBaseContext() == context) {
                        return q0Var;
                    }
                }
            }
            q0 q0Var2 = new q0(context);
            d.add(new WeakReference<>(q0Var2));
            return q0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f908a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f908a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f909b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f909b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
