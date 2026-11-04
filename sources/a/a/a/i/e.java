package a.a.a.i;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static e e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f326a = "firll.dat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f327b = 3164;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f328c = 20;
    public int d = 60;

    public static e c() {
        if (e == null) {
            e = new e();
        }
        return e;
    }

    public long a() {
        return a(this.f328c);
    }

    public final long a(int i) throws Throwable {
        RandomAccessFile randomAccessFile;
        String strC = i.c();
        if (strC == null) {
            return -1L;
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(strC + File.separator + this.f326a, "rw");
            try {
                randomAccessFile.seek(i);
                int i2 = randomAccessFile.readInt();
                long j = randomAccessFile.readLong();
                if (i2 == randomAccessFile.readInt()) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused) {
                    }
                    return j;
                }
            } catch (Exception unused2) {
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    randomAccessFile = randomAccessFile2;
                }
                return -1L;
            } catch (Throwable th) {
                th = th;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            randomAccessFile.close();
        } catch (IOException unused5) {
        }
        return -1L;
    }

    public final void a(int i, long j) {
        String strC = i.c();
        if (strC == null) {
            return;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(strC + File.separator + this.f326a, "rw");
            randomAccessFile.seek(i);
            randomAccessFile.writeInt(this.f327b);
            randomAccessFile.writeLong(j);
            randomAccessFile.writeInt(this.f327b);
            randomAccessFile.close();
        } catch (Exception unused) {
        }
    }

    public void a(long j) {
        a(this.f328c, j);
    }

    public long b() {
        return a(this.d);
    }

    public void b(long j) {
        a(this.d, j);
    }
}
