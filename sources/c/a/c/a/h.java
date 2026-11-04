package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f1295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1296c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ g f;

    h(g gVar, String str, int i, String str2, String str3) {
        this.f = gVar;
        this.f1295b = str;
        this.f1296c = i;
        this.d = str2;
        this.e = str3;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        d.a("postWithHttps start Thread id = " + String.valueOf(Thread.currentThread().getId()));
        this.f.a(new k(this.f.f1292a).a(this.f.f1293b, this.f1295b, this.f1296c, this.d, this.e));
    }
}
