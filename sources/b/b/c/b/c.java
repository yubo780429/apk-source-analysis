package b.b.c.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f1028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b.b.c.f.g<String, Typeface> f1029b;

    static {
        h dVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            dVar = new g();
        } else if (i >= 26) {
            dVar = new f();
        } else if (i < 24 || !e.a()) {
            dVar = Build.VERSION.SDK_INT >= 21 ? new d() : new h();
        } else {
            dVar = new e();
        }
        f1028a = dVar;
        f1029b = new b.b.c.f.g<>(16);
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface typefaceA = f1028a.a(context, resources, i, str, i2);
        if (typefaceA != null) {
            f1029b.a(a(resources, i, i2), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b.b.c.d.b.f[] fVarArr, int i) {
        return f1028a.a(context, cancellationSignal, fVarArr, i);
    }

    public static Typeface a(Context context, b.b.c.a.d.c.a aVar, Resources resources, int i, int i2, b.b.c.a.d.f.a aVar2, Handler handler, boolean z) {
        Typeface typefaceA;
        if (aVar instanceof b.b.c.a.d.c.d) {
            b.b.c.a.d.c.d dVar = (b.b.c.a.d.c.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.a() == 0) {
                z2 = true;
            }
            typefaceA = b.b.c.d.b.a(context, dVar.b(), aVar2, handler, z2, z ? dVar.c() : -1, i2);
        } else {
            typefaceA = f1028a.a(context, (b.b.c.a.d.c.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typefaceA != null) {
                    aVar2.a(typefaceA, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f1029b.a(a(resources, i, i2), typefaceA);
        }
        return typefaceA;
    }

    private static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface b(Resources resources, int i, int i2) {
        return f1029b.b(a(resources, i, i2));
    }
}
