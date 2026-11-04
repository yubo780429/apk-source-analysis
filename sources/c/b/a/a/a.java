package c.b.a.a;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1316c = new a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f1317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f1318b = 0;

    private a(byte[] bArr) {
        this.f1317a = bArr;
    }

    public static a a(String str) {
        try {
            return new a(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported?");
        }
    }

    public int a() {
        return this.f1317a.length;
    }

    public byte[] b() {
        byte[] bArr = this.f1317a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        byte[] bArr = this.f1317a;
        int length = bArr.length;
        byte[] bArr2 = ((a) obj).f1317a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f1318b;
        if (i == 0) {
            byte[] bArr = this.f1317a;
            int length = bArr.length;
            for (byte b2 : bArr) {
                length = (length * 31) + b2;
            }
            i = length == 0 ? 1 : length;
            this.f1318b = i;
        }
        return i;
    }
}
