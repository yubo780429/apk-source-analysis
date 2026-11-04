package c.b.a.a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f1319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1321c;
    private final OutputStream d = null;

    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private b(byte[] bArr, int i, int i2) {
        this.f1319a = bArr;
        this.f1321c = i;
        this.f1320b = i + i2;
    }

    public static int b(int i, long j) {
        return f(i) + d(j);
    }

    public static int b(int i, c.b.a.a.a aVar) {
        return f(i) + b(aVar);
    }

    public static int b(int i, c cVar) {
        return f(i) + b(cVar);
    }

    public static int b(c.b.a.a.a aVar) {
        return e(aVar.a()) + aVar.a();
    }

    public static int b(c cVar) {
        int iB = cVar.b();
        return e(iB) + iB;
    }

    public static b b(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    public static int c(int i, int i2) {
        return f(i) + d(i2);
    }

    public static int c(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    private void c() throws IOException {
        OutputStream outputStream = this.d;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f1319a, 0, this.f1321c);
        this.f1321c = 0;
    }

    public static int d(int i) {
        if (i >= 0) {
            return e(i);
        }
        return 10;
    }

    public static int d(long j) {
        return c(j);
    }

    public static int e(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int f(int i) {
        return e(d.a(i, 0));
    }

    public void a() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void a(byte b2) throws IOException {
        if (this.f1321c == this.f1320b) {
            c();
        }
        byte[] bArr = this.f1319a;
        int i = this.f1321c;
        this.f1321c = i + 1;
        bArr[i] = b2;
    }

    public void a(int i) throws IOException {
        if (i >= 0) {
            c(i);
        } else {
            a(i);
        }
    }

    public void a(int i, int i2) throws IOException {
        b(i, 0);
        a(i2);
    }

    public void a(int i, long j) throws IOException {
        b(i, 0);
        b(j);
    }

    public void a(int i, c.b.a.a.a aVar) throws IOException {
        b(i, 2);
        a(aVar);
    }

    public void a(int i, c cVar) throws IOException {
        b(i, 2);
        a(cVar);
    }

    public void a(long j) throws IOException {
        while (((-128) & j) != 0) {
            b((((int) j) & 127) | 128);
            j >>>= 7;
        }
        b((int) j);
    }

    public void a(c.b.a.a.a aVar) throws IOException {
        byte[] bArrB = aVar.b();
        c(bArrB.length);
        a(bArrB);
    }

    public void a(c cVar) throws IOException {
        c(cVar.a());
        cVar.a(this);
    }

    public void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    public void a(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f1320b;
        int i4 = this.f1321c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f1319a, i4, i2);
            this.f1321c += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f1319a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f1321c = this.f1320b;
        c();
        if (i7 > this.f1320b) {
            this.d.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, this.f1319a, 0, i7);
            this.f1321c = i7;
        }
    }

    public int b() {
        if (this.d == null) {
            return this.f1320b - this.f1321c;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public void b(int i) throws IOException {
        a((byte) i);
    }

    public void b(int i, int i2) throws IOException {
        c(d.a(i, i2));
    }

    public void b(long j) throws IOException {
        a(j);
    }

    public void c(int i) throws IOException {
        while ((i & (-128)) != 0) {
            b((i & 127) | 128);
            i >>>= 7;
        }
        b(i);
    }
}
