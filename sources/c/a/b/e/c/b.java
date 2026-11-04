package c.a.b.e.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f1253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f1254b;

    public static byte[] a() {
        byte[] bArr = f1253a;
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = new BigInteger(a.f1250a).modPow(new BigInteger(a.f1251b), new BigInteger(a.e)).toByteArray();
        f1253a = byteArray;
        return byteArray;
    }

    public static byte[] b() {
        byte[] bArr = f1254b;
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = new BigInteger(a.f1252c).modPow(new BigInteger(a.d), new BigInteger(a.e)).toByteArray();
        f1254b = byteArray;
        return byteArray;
    }
}
