package a.a.a.b;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f43a = "Temp_in.dat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static File f44b = new File(a.a.a.i.h.f353a, f43a);

    public static boolean a() {
        if (f44b.exists()) {
            f44b.delete();
        }
        if (!f44b.getParentFile().exists()) {
            f44b.getParentFile().mkdirs();
        }
        try {
            f44b.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(f44b, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(1);
            randomAccessFile.close();
            c();
            return f44b.exists();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean a(int i, int i2, int i3) {
        int i4;
        int i5;
        return i >= 0 && i <= (i4 = a.a.a.i.i.Z) && i2 >= 0 && i2 <= (i5 = i + 1) && i3 >= 1 && i3 <= i5 && i3 <= i4;
    }

    public static String b() {
        File file = f44b;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(f44b, "rw");
            randomAccessFile.seek(0L);
            int i = randomAccessFile.readInt();
            int i2 = randomAccessFile.readInt();
            int i3 = randomAccessFile.readInt();
            if (!a(i, i2, i3)) {
                randomAccessFile.close();
                a();
                return null;
            }
            if (i2 != 0 && i2 != i3) {
                long j = ((long) (((i2 - 1) * 1024) + 12)) + 0;
                randomAccessFile.seek(j);
                int i4 = randomAccessFile.readInt();
                byte[] bArr = new byte[i4];
                randomAccessFile.seek(j + 4);
                for (int i5 = 0; i5 < i4; i5++) {
                    bArr[i5] = randomAccessFile.readByte();
                }
                String str = new String(bArr);
                int i6 = a.a.a.i.i.Z;
                int i7 = 1;
                if (i < i6 || i2 != i6) {
                    i7 = 1 + i2;
                }
                randomAccessFile.seek(4L);
                randomAccessFile.writeInt(i7);
                randomAccessFile.close();
                return str;
            }
            randomAccessFile.close();
            return null;
        } catch (IOException unused) {
        }
    }

    public static void c() {
    }
}
