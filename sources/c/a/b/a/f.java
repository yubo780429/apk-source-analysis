package c.a.b.a;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f1191b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f1192c = 40;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f1193a;

    public f() {
        b bVar = new b(f1192c);
        this.f1193a = bVar;
        bVar.a(0, f1192c, true);
    }

    public void a(b bVar, int i, int i2, int i3) {
        b bVarC = this.f1193a.c(i, i + i2);
        if (i3 == 0) {
            bVarC.a(bVar);
        } else if (i3 == 2) {
            bVarC.d(bVar);
        } else if (i3 != 3) {
            bVarC.c(bVar);
        } else {
            bVarC.b(bVar);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            this.f1193a.a(i + i4, bVarC.c(i4));
        }
    }

    public byte[] a() {
        return this.f1193a.a();
    }
}
