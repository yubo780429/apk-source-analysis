package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f1300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1301c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ i f;

    j(i iVar, String str, int i, String str2, String str3) {
        this.f = iVar;
        this.f1300b = str;
        this.f1301c = i;
        this.d = str2;
        this.e = str3;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        i iVar = this.f;
        iVar.a(iVar.f1298b, this.f1300b, this.f1301c, this.d, this.e);
    }
}
