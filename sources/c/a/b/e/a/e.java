package c.a.b.e.a;

import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f1239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1241c;
    private int e;
    private i f;
    private f g;
    private int d = 0;
    private int h = 1;
    private boolean i = false;

    public e(b bVar, int i) {
        this.f1239a = null;
        this.f1240b = 0;
        this.f1241c = 0;
        this.e = 0;
        this.f = null;
        this.g = null;
        this.f1240b = i;
        this.f1241c = i;
        this.e = i;
        this.f1239a = new byte[i * 2];
        this.g = new d(bVar);
        this.f = new h(this.f1240b);
    }

    private int a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) throws IllegalBlockSizeException {
        if (bArr == null || i3 == 0) {
            return 0;
        }
        int i4 = this.h;
        if (i4 == 2 || i4 == 3 || i3 % this.f1241c == 0 || i4 == 6) {
            if (this.i) {
                this.g.d(bArr, i, i3, bArr2, i2);
            } else {
                this.g.c(bArr, i, i3, bArr2, i2);
            }
            return i3;
        }
        if (this.f != null) {
            throw new IllegalBlockSizeException("Input length (with padding) not multiple of " + this.f1241c + " bytes");
        }
        throw new IllegalBlockSizeException("Input length not multiple of " + this.f1241c + " bytes");
    }

    int a(int i) {
        int i2 = this.d + i;
        i iVar = this.f;
        if (iVar == null || this.i) {
            return i2;
        }
        int i3 = this.f1241c;
        int i4 = this.f1240b;
        if (i3 == i4) {
            return i2 + iVar.a(i2);
        }
        int i5 = this.e;
        return i2 < i5 ? i5 : (i2 + i4) - ((i2 - i5) % i4);
    }

    int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int iA;
        byte[] bArr3;
        int i4;
        i iVar;
        int iA2;
        int i5 = this.d + i2;
        int i6 = this.f1241c;
        int i7 = this.f1240b;
        if (i6 != i7) {
            int i8 = this.e;
            iA = i5 < i8 ? i8 - i5 : i7 - ((i5 - i8) % i7);
        } else {
            i iVar2 = this.f;
            iA = iVar2 != null ? iVar2.a(i5) : 0;
        }
        if (iA > 0 && iA != this.f1240b && this.f != null && this.i) {
            throw new IllegalBlockSizeException("Input length must be multiple of " + this.f1240b + " when decrypting with padded cipher");
        }
        int i9 = (this.i || this.f == null) ? i5 : i5 + iA;
        if (bArr2 == null) {
            throw new ShortBufferException("Output buffer is null");
        }
        int length = bArr2.length - i3;
        if (((!this.i || this.f == null) && length < i9) || (this.i && length < i9 - this.f1240b)) {
            throw new ShortBufferException("Output buffer too short: " + length + " bytes given, " + i9 + " bytes needed");
        }
        if (this.d == 0 && (this.i || this.f == null)) {
            bArr3 = bArr;
            i4 = i;
        } else {
            byte[] bArr4 = new byte[i9];
            int i10 = this.d;
            if (i10 != 0) {
                System.arraycopy(this.f1239a, 0, bArr4, 0, i10);
            }
            if (i2 != 0) {
                System.arraycopy(bArr, i, bArr4, this.d, i2);
            }
            if (!this.i && (iVar = this.f) != null) {
                iVar.a(bArr4, i5, iA);
            }
            bArr3 = bArr4;
            i4 = 0;
        }
        if (this.i) {
            if (length < i9) {
                this.g.b();
            }
            byte[] bArr5 = new byte[i5];
            iA2 = a(bArr3, i4, bArr5, 0, i5);
            i iVar3 = this.f;
            if (iVar3 != null && (iA2 = iVar3.b(bArr5, 0, iA2)) < 0) {
                throw new BadPaddingException("Given final block not properly padded");
            }
            if (bArr2.length - i3 < iA2) {
                this.g.c();
                throw new ShortBufferException("Output buffer too short: " + (bArr2.length - i3) + " bytes given, " + iA2 + " bytes needed");
            }
            for (int i11 = 0; i11 < iA2; i11++) {
                bArr2[i3 + i11] = bArr5[i11];
            }
        } else {
            iA2 = a(bArr3, i4, bArr2, i3, i9);
        }
        this.d = 0;
        this.e = this.f1240b;
        if (this.h != 0) {
            this.g.a();
        }
        return iA2;
    }

    public void a(int i, byte[] bArr, byte[] bArr2, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        boolean z = i == 2 || i == 4;
        this.i = z;
        if (this.h == 0) {
            if (bArr2 != null) {
                throw new InvalidAlgorithmParameterException("ECB mode cannot use IV");
            }
        } else if (bArr2 == null) {
            if (z) {
                throw new InvalidAlgorithmParameterException("Parameters missing");
            }
            if (secureRandom == null) {
                secureRandom = c.f1237b;
            }
            bArr2 = new byte[this.f1240b];
            secureRandom.nextBytes(bArr2);
        }
        this.d = 0;
        this.e = this.f1240b;
        this.g.a(this.i, "", bArr, bArr2);
    }

    public byte[] a(byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException {
        try {
            int iA = a(i2);
            byte[] bArr2 = new byte[iA];
            int iA2 = a(bArr, i, i2, bArr2, 0);
            if (iA2 >= iA) {
                return bArr2;
            }
            byte[] bArr3 = new byte[iA2];
            if (iA2 != 0) {
                try {
                    System.arraycopy(bArr2, 0, bArr3, 0, iA2);
                } catch (ShortBufferException unused) {
                }
            }
            return bArr3;
        } catch (ShortBufferException unused2) {
            return null;
        }
    }
}
