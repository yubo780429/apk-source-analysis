package c.a.b.e.a;

import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SecureRandom f1237b = new SecureRandom();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f1238a;

    public c() {
        this.f1238a = null;
        this.f1238a = new e(new b(), 16);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws InvalidAlgorithmParameterException {
        c cVar = new c();
        cVar.a(2, bArr, bArr2);
        return cVar.a(bArr3);
    }

    public void a(int i, byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.f1238a.a(i, bArr, bArr2, f1237b);
    }

    public final byte[] a(byte[] bArr) {
        if (bArr != null) {
            return this.f1238a.a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Null input buffer");
    }
}
