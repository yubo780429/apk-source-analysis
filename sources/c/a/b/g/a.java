package c.a.b.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static byte[] a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    public static byte[] a(byte[] bArr, int i) {
        byte b2;
        int i2;
        int i3 = (i / 4) * 3;
        if (i3 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i3];
        int i4 = i;
        int i5 = 0;
        while (true) {
            byte b3 = bArr[i4 - 1];
            b2 = 10;
            if (b3 != 10 && b3 != 13 && b3 != 32 && b3 != 9) {
                if (b3 != 61) {
                    break;
                }
                i5++;
            }
            i4--;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < i4) {
            byte b4 = bArr[i6];
            if (b4 != b2 && b4 != 13 && b4 != 32 && b4 != 9) {
                if (b4 >= 65 && b4 <= 90) {
                    i2 = b4 - 65;
                } else if (b4 >= 97 && b4 <= 122) {
                    i2 = b4 - 71;
                } else if (b4 >= 48 && b4 <= 57) {
                    i2 = b4 + 4;
                } else if (b4 == 43) {
                    i2 = 62;
                } else {
                    if (b4 != 47) {
                        return null;
                    }
                    i2 = 63;
                }
                i8 = ((byte) i2) | (i8 << 6);
                if (i9 % 4 == 3) {
                    int i10 = i7 + 1;
                    bArr2[i7] = (byte) ((16711680 & i8) >> 16);
                    int i11 = i10 + 1;
                    bArr2[i10] = (byte) ((65280 & i8) >> 8);
                    bArr2[i11] = (byte) (i8 & 255);
                    i7 = i11 + 1;
                }
                i9++;
            }
            i6++;
            b2 = 10;
        }
        if (i5 > 0) {
            int i12 = i8 << (i5 * 6);
            int i13 = i7 + 1;
            bArr2[i7] = (byte) ((i12 & 16711680) >> 16);
            if (i5 == 1) {
                i7 = i13 + 1;
                bArr2[i13] = (byte) ((i12 & 65280) >> 8);
            } else {
                i7 = i13;
            }
        }
        byte[] bArr3 = new byte[i7];
        System.arraycopy(bArr2, 0, bArr3, 0, i7);
        return bArr3;
    }
}
