package c.a.b.e.a;

import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
class d extends f {
    protected byte[] d;
    private byte[] e;
    private byte[] f;

    d(b bVar) {
        super(bVar);
        this.f = null;
        int i = this.f1243b;
        this.e = new byte[i];
        this.d = new byte[i];
    }

    @Override // c.a.b.e.a.f
    void a() {
        System.arraycopy(this.f1244c, 0, this.d, 0, this.f1243b);
    }

    @Override // c.a.b.e.a.f
    void a(boolean z, String str, byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr == null || bArr2 == null || bArr2.length != this.f1243b) {
            throw new InvalidKeyException("Internal error");
        }
        this.f1244c = bArr2;
        a();
        this.f1242a.a(z, str, bArr);
    }

    @Override // c.a.b.e.a.f
    void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 + i;
        while (i < i4) {
            for (int i5 = 0; i5 < this.f1243b; i5++) {
                this.e[i5] = (byte) (bArr[i5 + i] ^ this.d[i5]);
            }
            this.f1242a.a(this.e, 0, bArr2, i3);
            System.arraycopy(bArr2, i3, this.d, 0, this.f1243b);
            int i6 = this.f1243b;
            i += i6;
            i3 += i6;
        }
    }

    @Override // c.a.b.e.a.f
    void b() {
        if (this.f == null) {
            this.f = new byte[this.f1243b];
        }
        System.arraycopy(this.d, 0, this.f, 0, this.f1243b);
    }

    @Override // c.a.b.e.a.f
    void b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        int i5 = i2 + i;
        byte[] bArr3 = (bArr != bArr2 || i < i3 || i - i3 >= this.f1243b) ? null : (byte[]) bArr.clone();
        while (i < i5) {
            this.f1242a.b(bArr, i, this.e, 0);
            int i6 = 0;
            while (true) {
                i4 = this.f1243b;
                if (i6 >= i4) {
                    break;
                }
                bArr2[i6 + i3] = (byte) (this.e[i6] ^ this.d[i6]);
                i6++;
            }
            byte[] bArr4 = this.d;
            if (bArr3 == null) {
                System.arraycopy(bArr, i, bArr4, 0, i4);
            } else {
                System.arraycopy(bArr3, i, bArr4, 0, i4);
            }
            int i7 = this.f1243b;
            i += i7;
            i3 += i7;
        }
    }

    @Override // c.a.b.e.a.f
    void c() {
        System.arraycopy(this.f, 0, this.d, 0, this.f1243b);
    }
}
