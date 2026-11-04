package c.a.b.a;

/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f1200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f1201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1202c;
    private int d;
    private int e;

    protected k() {
        this(0);
    }

    protected k(int i) {
        this.f1200a = new int[4];
        this.f1201b = new byte[16];
        this.f1202c = i;
        b();
    }

    private static int a(byte[] bArr, int i) {
        return (int) (b(bArr, i, 4) & 4294967295L);
    }

    private static long b(byte[] bArr, int i, int i2) {
        if (i2 > 8) {
            throw new IllegalArgumentException("can't read more than eight bytes into a long value");
        }
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= (((long) bArr[i + i3]) & 255) << (i3 * 8);
        }
        return j;
    }

    private void b() {
        int[] iArr = this.f1200a;
        int i = this.f1202c;
        iArr[0] = (i - 1640531535) - 2048144777;
        iArr[1] = (-2048144777) + i;
        iArr[2] = i;
        iArr[3] = i - (-1640531535);
    }

    private void b(byte[] bArr, int i) {
        int[] iArr = this.f1200a;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int iRotateLeft = Integer.rotateLeft(i2 + (a(bArr, i) * (-2048144777)), 13) * (-1640531535);
        int iRotateLeft2 = Integer.rotateLeft(i3 + (a(bArr, i + 4) * (-2048144777)), 13) * (-1640531535);
        int iRotateLeft3 = Integer.rotateLeft(i4 + (a(bArr, i + 8) * (-2048144777)), 13) * (-1640531535);
        int iRotateLeft4 = Integer.rotateLeft(i5 + (a(bArr, i + 12) * (-2048144777)), 13) * (-1640531535);
        int[] iArr2 = this.f1200a;
        iArr2[0] = iRotateLeft;
        iArr2[1] = iRotateLeft2;
        iArr2[2] = iRotateLeft3;
        iArr2[3] = iRotateLeft4;
        this.e = 0;
    }

    protected long a() {
        int i = 0;
        int iRotateLeft = (this.d > 16 ? Integer.rotateLeft(this.f1200a[0], 1) + Integer.rotateLeft(this.f1200a[1], 7) + Integer.rotateLeft(this.f1200a[2], 12) + Integer.rotateLeft(this.f1200a[3], 18) : this.f1200a[2] + 374761393) + this.d;
        int i2 = this.e - 4;
        while (i <= i2) {
            iRotateLeft = Integer.rotateLeft(iRotateLeft + (a(this.f1201b, i) * (-1028477379)), 17) * 668265263;
            i += 4;
        }
        while (i < this.e) {
            iRotateLeft = Integer.rotateLeft(iRotateLeft + ((this.f1201b[i] & 255) * 374761393), 11) * (-1640531535);
            i++;
        }
        int i3 = ((iRotateLeft >>> 15) ^ iRotateLeft) * (-2048144777);
        int i4 = (i3 ^ (i3 >>> 13)) * (-1028477379);
        return ((long) (i4 ^ (i4 >>> 16))) & 4294967295L;
    }

    protected void a(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        this.d += i2;
        int i3 = i + i2;
        int i4 = this.e;
        if (i4 + i2 < 16) {
            System.arraycopy(bArr, i, this.f1201b, i4, i2);
            this.e += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = 16 - i4;
            System.arraycopy(bArr, i, this.f1201b, i4, i5);
            b(this.f1201b, 0);
            i += i5;
        }
        int i6 = i3 - 16;
        while (i <= i6) {
            b(bArr, i);
            i += 16;
        }
        if (i < i3) {
            int i7 = i3 - i;
            this.e = i7;
            System.arraycopy(bArr, i, this.f1201b, 0, i7);
        }
    }
}
