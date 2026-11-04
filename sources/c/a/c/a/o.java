package c.a.c.a;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f1308c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ Hashtable f;
    final /* synthetic */ b g;

    o(b bVar, int i, boolean z, String str, String str2, Hashtable hashtable) {
        this.g = bVar;
        this.f1307b = i;
        this.f1308c = z;
        this.d = str;
        this.e = str2;
        this.f = hashtable;
    }

    @Override // java.lang.Runnable
    public void run() {
        d.a("status = " + this.f1307b + "; forced = " + this.f1308c + "checkAK = " + this.g.c(this.d));
        int i = this.f1307b;
        if (i != 601 && !this.f1308c && i != -1 && !this.g.c(this.d)) {
            if (602 == this.f1307b) {
                d.a("authenticate wait ");
                if (b.j != null) {
                    b.j.b();
                }
            } else {
                d.a("authenticate else");
            }
            this.g.b(null, this.d);
            return;
        }
        d.a("authenticate sendAuthRequest");
        String[] strArrB = f.b(b.e);
        if (strArrB == null || strArrB.length <= 1) {
            this.g.a(this.f1308c, this.e, this.f, this.d, b.f, b.g, b.h, b.i);
            return;
        }
        d.a("authStrings.length:" + strArrB.length);
        d.a("more sha1 auth");
        this.g.a(this.f1308c, this.e, this.f, strArrB, this.d, b.f, b.g, b.h, b.i);
    }
}
