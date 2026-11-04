package b.b.d.d;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f1162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f1163c;
    private Configuration d;
    private Resources e;

    public d() {
        super(null);
    }

    public d(Context context, int i) {
        super(context);
        this.f1161a = i;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f1162b = theme;
    }

    private Resources b() {
        Resources resources;
        if (this.e == null) {
            Configuration configuration = this.d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.e = resources;
        }
        return this.e;
    }

    private void c() {
        boolean z = this.f1162b == null;
        if (z) {
            this.f1162b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1162b.setTo(theme);
            }
        }
        a(this.f1162b, this.f1161a, z);
    }

    public int a() {
        return this.f1161a;
    }

    protected void a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1163c == null) {
            this.f1163c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1163c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1162b;
        if (theme != null) {
            return theme;
        }
        if (this.f1161a == 0) {
            this.f1161a = b.b.d.a.i.Theme_AppCompat_Light;
        }
        c();
        return this.f1162b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f1161a != i) {
            this.f1161a = i;
            c();
        }
    }
}
