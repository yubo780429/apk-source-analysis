package c.a.b.e.a;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile byte[] f1245a;

    public static byte[] a() {
        if (f1245a == null) {
            synchronized (g.class) {
                if (f1245a == null) {
                    byte[] bArr = new byte[16];
                    System.arraycopy(c.a.b.e.c.b.b(), 0, bArr, 0, 16);
                    c cVar = new c();
                    cVar.a(2, bArr, bArr);
                    f1245a = cVar.a(new byte[]{-71, -100, -115, 26, 39, -124, 14, 14, -31, -46, -56, 1, 25, -127, -99, -107, -54, 51, 46, 14, 68, -68, -19, 28, 66, 19, -113, 5, 25, -11, -123, 50});
                }
            }
        }
        return f1245a;
    }
}
