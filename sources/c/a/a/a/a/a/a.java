package c.a.a.a.a.a;

import android.content.Context;
import c.a.b.f;
import c.a.b.l;
import c.a.b.m;
import c.a.b.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static volatile a h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f1186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f1187c;
    private f d = new f();
    private n.a e;
    private n.a f;
    private long g;

    private a(Context context) {
        this.f1185a = context.getApplicationContext();
        this.f1186b = new n(this.f1185a, new c.a.b.i.a(this.f1185a), this.d);
        this.f1187c = new m(this.f1185a, this.d);
    }

    private n.a a() {
        n.a aVar = this.f;
        if (aVar != null) {
            return aVar;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - this.g) > 3600000) {
            this.f = b();
            this.g = jCurrentTimeMillis;
        }
        n.a aVar2 = this.f;
        if (aVar2 != null) {
            return aVar2;
        }
        if (this.e == null) {
            this.f = d(null);
        }
        return this.f;
    }

    public static String a(Context context) {
        String strB;
        synchronized (a.class) {
            strB = b(context).a().b();
        }
        return strB;
    }

    public static void a(String str) {
        n.c(str);
    }

    static a b(Context context) {
        a aVar;
        synchronized (l.class) {
            if (h == null) {
                h = new a(context);
            }
            aVar = h;
        }
        return aVar;
    }

    private n.a b() {
        return b((String) null);
    }

    private n.a b(String str) {
        n.a aVarA = this.f1186b.a();
        return aVarA == null ? c(str) : aVarA;
    }

    private n.a c(String str) {
        l lVarA = this.f1187c.a(str);
        if (lVarA != null) {
            return this.f1186b.a(lVarA);
        }
        return null;
    }

    private n.a d(String str) {
        return this.f1186b.a(str);
    }
}
