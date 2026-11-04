package c.a.b.e.a;

/* JADX INFO: loaded from: classes.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f1242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f1243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    byte[] f1244c;

    f(b bVar) {
        this.f1242a = bVar;
        this.f1243b = bVar.a();
    }

    abstract void a();

    abstract void a(boolean z, String str, byte[] bArr, byte[] bArr2);

    abstract void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    abstract void b();

    abstract void b(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    abstract void c();

    void c(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        a(bArr, i, i2, bArr2, i3);
    }

    void d(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        b(bArr, i, i2, bArr2, i3);
    }
}
