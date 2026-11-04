package b.b.d.b.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.j;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1138a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<C0048a>> f1139b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f1140c = new Object();

    /* JADX INFO: renamed from: b.b.d.b.a.a$a, reason: collision with other inner class name */
    private static class C0048a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ColorStateList f1141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Configuration f1142b;

        C0048a(ColorStateList colorStateList, Configuration configuration) {
            this.f1141a = colorStateList;
            this.f1142b = configuration;
        }
    }

    private static ColorStateList a(Context context, int i) {
        C0048a c0048a;
        synchronized (f1140c) {
            SparseArray<C0048a> sparseArray = f1139b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0048a = sparseArray.get(i)) != null) {
                if (c0048a.f1142b.equals(context.getResources().getConfiguration())) {
                    return c0048a.f1141a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    private static TypedValue a() {
        TypedValue typedValue = f1138a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1138a.set(typedValue2);
        return typedValue2;
    }

    private static void a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f1140c) {
            SparseArray<C0048a> sparseArray = f1139b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f1139b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0048a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    public static ColorStateList b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList colorStateListA = a(context, i);
        if (colorStateListA != null) {
            return colorStateListA;
        }
        ColorStateList colorStateListD = d(context, i);
        if (colorStateListD == null) {
            return b.b.c.a.a.a(context, i);
        }
        a(context, i, colorStateListD);
        return colorStateListD;
    }

    public static Drawable c(Context context, int i) {
        return j.a().a(context, i);
    }

    private static ColorStateList d(Context context, int i) {
        if (e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return b.b.c.a.d.a.a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static boolean e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue typedValueA = a();
        resources.getValue(i, typedValueA, true);
        int i2 = typedValueA.type;
        return i2 >= 28 && i2 <= 31;
    }
}
