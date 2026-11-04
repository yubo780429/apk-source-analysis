package c.a.b.a;

import java.io.ObjectStreamField;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b implements Serializable, Cloneable {
    static final /* synthetic */ boolean e = !b.class.desiredAssertionStatus();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f1189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f1190c;
    private transient boolean d;

    static {
        new ObjectStreamField("bits", long[].class);
    }

    public b() {
        this.f1190c = 0;
        this.d = false;
        g(64);
        this.d = false;
    }

    public b(int i) {
        this.f1190c = 0;
        this.d = false;
        if (i >= 0) {
            g(i);
            this.d = true;
        } else {
            throw new NegativeArraySizeException("nbits < 0: " + i);
        }
    }

    private b(long[] jArr) {
        this.f1190c = 0;
        this.d = false;
        this.f1189b = jArr;
        this.f1190c = jArr.length;
        d();
    }

    public static b a(long[] jArr) {
        int length = jArr.length;
        while (length > 0 && jArr[length - 1] == 0) {
            length--;
        }
        return new b(Arrays.copyOf(jArr, length));
    }

    private void d() {
        int i;
        int i2;
        if (!e && (i2 = this.f1190c) != 0 && this.f1189b[i2 - 1] == 0) {
            throw new AssertionError();
        }
        if (!e && ((i = this.f1190c) < 0 || i > this.f1189b.length)) {
            throw new AssertionError();
        }
        if (e) {
            return;
        }
        int i3 = this.f1190c;
        long[] jArr = this.f1189b;
        if (i3 != jArr.length && jArr[i3] != 0) {
            throw new AssertionError();
        }
    }

    private static void d(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + i);
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("toIndex < 0: " + i2);
        }
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + " > toIndex: " + i2);
    }

    private void e() {
        int i = this.f1190c - 1;
        while (i >= 0 && this.f1189b[i] == 0) {
            i--;
        }
        this.f1190c = i + 1;
    }

    private static int f(int i) {
        return i >> 6;
    }

    private void f() {
        int i = this.f1190c;
        long[] jArr = this.f1189b;
        if (i != jArr.length) {
            this.f1189b = Arrays.copyOf(jArr, i);
            d();
        }
    }

    private void g(int i) {
        this.f1189b = new long[f(i - 1) + 1];
    }

    private void h(int i) {
        long[] jArr = this.f1189b;
        if (jArr.length < i) {
            this.f1189b = Arrays.copyOf(this.f1189b, Math.max(jArr.length * 2, i));
            this.d = false;
        }
    }

    private void i(int i) {
        int i2 = i + 1;
        if (this.f1190c < i2) {
            h(i2);
            this.f1190c = i2;
        }
    }

    public void a(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + i);
        }
        int iF = f(i);
        i(iF);
        long[] jArr = this.f1189b;
        jArr[iF] = jArr[iF] | (1 << i);
        d();
    }

    public void a(int i, int i2) {
        d(i, i2);
        if (i == i2) {
            return;
        }
        int iF = f(i);
        int iF2 = f(i2 - 1);
        i(iF2);
        long j = (-1) << i;
        long j2 = (-1) >>> (-i2);
        if (iF == iF2) {
            long[] jArr = this.f1189b;
            jArr[iF] = (j2 & j) | jArr[iF];
        } else {
            long[] jArr2 = this.f1189b;
            jArr2[iF] = j | jArr2[iF];
            while (true) {
                iF++;
                if (iF >= iF2) {
                    break;
                } else {
                    this.f1189b[iF] = -1;
                }
            }
            long[] jArr3 = this.f1189b;
            jArr3[iF2] = j2 | jArr3[iF2];
        }
        d();
    }

    public void a(int i, int i2, boolean z) {
        if (z) {
            a(i, i2);
        } else {
            b(i, i2);
        }
    }

    public void a(int i, boolean z) {
        if (z) {
            a(i);
        } else {
            b(i);
        }
    }

    public void a(b bVar) {
        if (this == bVar) {
            return;
        }
        while (true) {
            int i = this.f1190c;
            if (i <= bVar.f1190c) {
                break;
            }
            long[] jArr = this.f1189b;
            int i2 = i - 1;
            this.f1190c = i2;
            jArr[i2] = 0;
        }
        for (int i3 = 0; i3 < this.f1190c; i3++) {
            long[] jArr2 = this.f1189b;
            jArr2[i3] = jArr2[i3] & bVar.f1189b[i3];
        }
        e();
        d();
    }

    public byte[] a() {
        int i = this.f1190c;
        if (i == 0) {
            return new byte[0];
        }
        int i2 = i - 1;
        int i3 = i2 * 8;
        for (long j = this.f1189b[i2]; j != 0; j >>>= 8) {
            i3++;
        }
        byte[] bArr = new byte[i3];
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        for (int i4 = 0; i4 < i2; i4++) {
            byteBufferOrder.putLong(this.f1189b[i4]);
        }
        for (long j2 = this.f1189b[i2]; j2 != 0; j2 >>>= 8) {
            byteBufferOrder.put((byte) (255 & j2));
        }
        return bArr;
    }

    public int b() {
        int i = this.f1190c;
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        return (i2 * 64) + (64 - Long.numberOfLeadingZeros(this.f1189b[i2]));
    }

    public void b(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + i);
        }
        int iF = f(i);
        if (iF >= this.f1190c) {
            return;
        }
        long[] jArr = this.f1189b;
        jArr[iF] = jArr[iF] & (~(1 << i));
        e();
        d();
    }

    public void b(int i, int i2) {
        int iF;
        d(i, i2);
        if (i != i2 && (iF = f(i)) < this.f1190c) {
            int iF2 = f(i2 - 1);
            if (iF2 >= this.f1190c) {
                i2 = b();
                iF2 = this.f1190c - 1;
            }
            long j = (-1) << i;
            long j2 = (-1) >>> (-i2);
            if (iF == iF2) {
                long[] jArr = this.f1189b;
                jArr[iF] = (~(j2 & j)) & jArr[iF];
            } else {
                long[] jArr2 = this.f1189b;
                jArr2[iF] = (~j) & jArr2[iF];
                while (true) {
                    iF++;
                    if (iF >= iF2) {
                        break;
                    } else {
                        this.f1189b[iF] = 0;
                    }
                }
                long[] jArr3 = this.f1189b;
                jArr3[iF2] = (~j2) & jArr3[iF2];
            }
            e();
            d();
        }
    }

    public void b(b bVar) {
        if (this == bVar) {
            return;
        }
        int iMin = Math.min(this.f1190c, bVar.f1190c);
        int i = this.f1190c;
        int i2 = bVar.f1190c;
        if (i < i2) {
            h(i2);
            this.f1190c = bVar.f1190c;
        }
        for (int i3 = 0; i3 < iMin; i3++) {
            long[] jArr = this.f1189b;
            jArr[i3] = jArr[i3] | bVar.f1189b[i3];
        }
        if (iMin < bVar.f1190c) {
            System.arraycopy(bVar.f1189b, iMin, this.f1189b, iMin, this.f1190c - iMin);
        }
        d();
    }

    public int c() {
        int iBitCount = 0;
        for (int i = 0; i < this.f1190c; i++) {
            iBitCount += Long.bitCount(this.f1189b[i]);
        }
        return iBitCount;
    }

    public b c(int i, int i2) {
        int i3;
        long j;
        d(i, i2);
        d();
        int iB = b();
        int i4 = 0;
        if (iB <= i || i == i2) {
            return new b(0);
        }
        if (i2 > iB) {
            i2 = iB;
        }
        int i5 = i2 - i;
        b bVar = new b(i5);
        int iF = f(i5 - 1) + 1;
        int iF2 = f(i);
        int i6 = i & 63;
        boolean z = i6 == 0;
        while (true) {
            i3 = iF - 1;
            if (i4 >= i3) {
                break;
            }
            long[] jArr = bVar.f1189b;
            long[] jArr2 = this.f1189b;
            jArr[i4] = z ? jArr2[iF2] : (jArr2[iF2] >>> i) | (jArr2[iF2 + 1] << (-i));
            i4++;
            iF2++;
        }
        long j2 = (-1) >>> (-i2);
        long[] jArr3 = bVar.f1189b;
        int i7 = (i2 - 1) & 63;
        long[] jArr4 = this.f1189b;
        if (i7 < i6) {
            j = ((jArr4[iF2 + 1] & j2) << (-i)) | (jArr4[iF2] >>> i);
        } else {
            j = (jArr4[iF2] & j2) >>> i;
        }
        jArr3[i3] = j;
        bVar.f1190c = iF;
        bVar.e();
        bVar.d();
        return bVar;
    }

    public void c(b bVar) {
        int iMin = Math.min(this.f1190c, bVar.f1190c);
        int i = this.f1190c;
        int i2 = bVar.f1190c;
        if (i < i2) {
            h(i2);
            this.f1190c = bVar.f1190c;
        }
        for (int i3 = 0; i3 < iMin; i3++) {
            long[] jArr = this.f1189b;
            jArr[i3] = jArr[i3] ^ bVar.f1189b[i3];
        }
        int i4 = bVar.f1190c;
        if (iMin < i4) {
            System.arraycopy(bVar.f1189b, iMin, this.f1189b, iMin, i4 - iMin);
        }
        e();
        d();
    }

    public boolean c(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + i);
        }
        d();
        int iF = f(i);
        if (iF < this.f1190c) {
            if (((1 << i) & this.f1189b[iF]) != 0) {
                return true;
            }
        }
        return false;
    }

    public Object clone() {
        if (!this.d) {
            f();
        }
        try {
            b bVar = (b) super.clone();
            bVar.f1189b = (long[]) this.f1189b.clone();
            bVar.d();
            return bVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public int d(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + i);
        }
        d();
        int iF = f(i);
        if (iF >= this.f1190c) {
            return -1;
        }
        long j = this.f1189b[iF] & ((-1) << i);
        while (j == 0) {
            iF++;
            if (iF == this.f1190c) {
                return -1;
            }
            j = this.f1189b[iF];
        }
        return (iF * 64) + Long.numberOfTrailingZeros(j);
    }

    public void d(b bVar) {
        for (int iMin = Math.min(this.f1190c, bVar.f1190c) - 1; iMin >= 0; iMin--) {
            long[] jArr = this.f1189b;
            jArr[iMin] = jArr[iMin] & (~bVar.f1189b[iMin]);
        }
        e();
        d();
    }

    public int e(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + i);
        }
        d();
        int iF = f(i);
        if (iF >= this.f1190c) {
            return i;
        }
        long j = (~this.f1189b[iF]) & ((-1) << i);
        while (j == 0) {
            iF++;
            int i2 = this.f1190c;
            if (iF == i2) {
                return i2 * 64;
            }
            j = ~this.f1189b[iF];
        }
        return (iF * 64) + Long.numberOfTrailingZeros(j);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        b bVar = (b) obj;
        d();
        bVar.d();
        if (this.f1190c != bVar.f1190c) {
            return false;
        }
        for (int i = 0; i < this.f1190c; i++) {
            if (this.f1189b[i] != bVar.f1189b[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f1190c;
        long j = 1234;
        while (true) {
            i--;
            if (i < 0) {
                return (int) ((j >> 32) ^ j);
            }
            j ^= this.f1189b[i] * ((long) (i + 1));
        }
    }

    public String toString() {
        d();
        int i = this.f1190c;
        StringBuilder sb = new StringBuilder(((i > 128 ? c() : i * 64) * 6) + 2);
        sb.append('{');
        int iD = d(0);
        if (iD != -1) {
            sb.append(iD);
            while (true) {
                iD = d(iD + 1);
                if (iD < 0) {
                    break;
                }
                int iE = e(iD);
                do {
                    sb.append(", ");
                    sb.append(iD);
                    iD++;
                } while (iD < iE);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
