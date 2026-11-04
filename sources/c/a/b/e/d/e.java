package c.a.b.e.d;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f1260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f1261b;

    public e(byte[] bArr, byte[] bArr2) {
        this.f1260a = new BigInteger(bArr);
        this.f1261b = new BigInteger(bArr2);
    }

    @Override // c.a.b.e.d.d
    public BigInteger a() {
        return this.f1260a;
    }

    @Override // c.a.b.e.d.d
    public BigInteger b() {
        return this.f1261b;
    }
}
