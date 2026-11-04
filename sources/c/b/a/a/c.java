package c.b.a.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public abstract int a();

    public abstract void a(b bVar);

    public void a(byte[] bArr, int i, int i2) {
        try {
            b bVarB = b.b(bArr, i, i2);
            a(bVarB);
            bVarB.a();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    public abstract int b();

    public byte[] c() {
        int iB = b();
        byte[] bArr = new byte[iB];
        a(bArr, 0, iB);
        return bArr;
    }
}
