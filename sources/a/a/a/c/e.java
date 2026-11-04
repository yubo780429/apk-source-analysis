package a.a.a.c;

import a.a.a.i.i;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import com.baidu.location.Jni;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class e implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f116b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f117a = 0;

    public static e b() {
        if (f116b == null) {
            f116b = new e();
        }
        return f116b;
    }

    public final String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        return stringWriter.toString();
    }

    public void a() {
        String str;
        try {
            File file = new File((Environment.getExternalStorageDirectory().getPath() + "/traces") + "/error_fs2.dat");
            if (file.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(280L);
                if (1326 == randomAccessFile.readInt()) {
                    randomAccessFile.seek(308L);
                    int i = randomAccessFile.readInt();
                    String str2 = null;
                    if (i <= 0 || i >= 2048) {
                        str = null;
                    } else {
                        byte[] bArr = new byte[i];
                        randomAccessFile.read(bArr, 0, i);
                        str = new String(bArr, 0, i);
                    }
                    randomAccessFile.seek(600L);
                    int i2 = randomAccessFile.readInt();
                    if (i2 > 0 && i2 < 2048) {
                        byte[] bArr2 = new byte[i2];
                        randomAccessFile.read(bArr2, 0, i2);
                        str2 = new String(bArr2, 0, i2);
                    }
                    if (a(str, str2)) {
                        randomAccessFile.seek(280L);
                        randomAccessFile.writeInt(12346);
                    }
                }
                randomAccessFile.close();
            }
        } catch (Exception unused) {
        }
    }

    public final void a(File file, String str, String str2) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(280L);
            randomAccessFile.writeInt(12346);
            randomAccessFile.seek(300L);
            randomAccessFile.writeLong(System.currentTimeMillis());
            byte[] bytes = str.getBytes();
            randomAccessFile.writeInt(bytes.length);
            randomAccessFile.write(bytes, 0, bytes.length);
            randomAccessFile.seek(600L);
            byte[] bytes2 = str2.getBytes();
            randomAccessFile.writeInt(bytes2.length);
            randomAccessFile.write(bytes2, 0, bytes2.length);
            if (!a(str, str2)) {
                randomAccessFile.seek(280L);
                randomAccessFile.writeInt(1326);
            }
            randomAccessFile.close();
        } catch (Exception unused) {
        }
    }

    public final boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !a.a.a.g.f.w().p()) {
            return false;
        }
        try {
            URL url = new URL(a.a.a.i.d.f323a);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("e0");
            stringBuffer.append("=");
            stringBuffer.append(str);
            stringBuffer.append("&");
            stringBuffer.append("e1");
            stringBuffer.append("=");
            stringBuffer.append(str2);
            stringBuffer.append("&");
            if (stringBuffer.length() > 0) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setConnectTimeout(a.a.a.i.a.f316a);
            httpsURLConnection.setReadTimeout(a.a.a.i.a.f316a);
            httpsURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
            httpsURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(stringBuffer.toString().getBytes());
            outputStream.flush();
            outputStream.close();
            return httpsURLConnection.getResponseCode() == 200;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8 A[Catch: Exception -> 0x00b4, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b4, blocks: (B:19:0x007d, B:23:0x0087, B:25:0x00a8), top: B:49:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ed A[Catch: Exception -> 0x0009, TryCatch #0 {Exception -> 0x0009, blocks: (B:31:0x00b8, B:33:0x00ed, B:35:0x00f8, B:36:0x00fb, B:40:0x0103, B:41:0x0108, B:43:0x0124, B:44:0x0127), top: B:48:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8 A[Catch: Exception -> 0x0009, TryCatch #0 {Exception -> 0x0009, blocks: (B:31:0x00b8, B:33:0x00ed, B:35:0x00f8, B:36:0x00fb, B:40:0x0103, B:41:0x0108, B:43:0x0124, B:44:0x0127), top: B:48:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0101  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:41:0x0108 A[Catch: Exception -> 0x0009, TryCatch #0 {Exception -> 0x0009, blocks: (B:31:0x00b8, B:33:0x00ed, B:35:0x00f8, B:36:0x00fb, B:40:0x0103, B:41:0x0108, B:43:0x0124, B:44:0x0127), top: B:48:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0124 A[Catch: Exception -> 0x0009, TryCatch #0 {Exception -> 0x0009, blocks: (B:31:0x00b8, B:33:0x00ed, B:35:0x00f8, B:36:0x00fb, B:40:0x0103, B:41:0x0108, B:43:0x0124, B:44:0x0127), top: B:48:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        String strA;
        String str;
        String strB;
        String str2;
        File file;
        RandomAccessFile randomAccessFile;
        File file2;
        String str3;
        boolean z = true;
        int i = this.f117a + 1;
        this.f117a = i;
        if (i <= 2) {
            if (System.currentTimeMillis() - a.a.a.h.a.d() < 10000 && 9.521f > com.baidu.location.f.a()) {
                if (System.currentTimeMillis() - a.a.a.i.e.c().a() < 40000) {
                    File file3 = new File(i.c() + File.separator + com.baidu.location.f.b());
                    if (file3.exists()) {
                        file3.delete();
                    }
                } else {
                    a.a.a.i.e.c().a(System.currentTimeMillis());
                }
            }
            boolean z2 = false;
            File file4 = null;
            try {
                strA = a(th);
                if (strA != null) {
                    try {
                        if (!strA.contains("com.baidu.location")) {
                            z = false;
                        }
                        str3 = a.a.a.i.b.e().a(false) + a.a.a.b.c.h().d();
                        if (str3 != null) {
                            strB = Jni.b(str3);
                            z2 = z;
                            str = strA;
                        } else {
                            z2 = z;
                            str = strA;
                            strB = null;
                        }
                    } catch (Exception unused) {
                    }
                    if (z2) {
                        try {
                            str2 = Environment.getExternalStorageDirectory().getPath() + "/traces";
                            file = new File(str2 + "/error_fs2.dat");
                            if (file.exists()) {
                                randomAccessFile = new RandomAccessFile(file, "rw");
                                randomAccessFile.seek(300L);
                                if (System.currentTimeMillis() - randomAccessFile.readLong() > 86400000) {
                                    a(file, strB, str);
                                }
                                randomAccessFile.close();
                            } else {
                                file2 = new File(str2);
                                if (!file2.exists()) {
                                    file2.mkdirs();
                                }
                                if (!file.createNewFile()) {
                                    file4 = file;
                                }
                                a(file4, strB, str);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                } else {
                    z = false;
                    str3 = a.a.a.i.b.e().a(false) + a.a.a.b.c.h().d();
                    if (str3 != null) {
                        strB = Jni.b(str3);
                        z2 = z;
                        str = strA;
                    } else {
                        z2 = z;
                        str = strA;
                        strB = null;
                    }
                    if (z2) {
                        str2 = Environment.getExternalStorageDirectory().getPath() + "/traces";
                        file = new File(str2 + "/error_fs2.dat");
                        if (file.exists()) {
                            file2 = new File(str2);
                            if (!file2.exists()) {
                                file2.mkdirs();
                            }
                            if (!file.createNewFile()) {
                                file4 = file;
                            }
                            a(file4, strB, str);
                        } else {
                            randomAccessFile = new RandomAccessFile(file, "rw");
                            randomAccessFile.seek(300L);
                            if (System.currentTimeMillis() - randomAccessFile.readLong() > 86400000) {
                                a(file, strB, str);
                            }
                            randomAccessFile.close();
                        }
                    }
                }
            } catch (Exception unused3) {
                strA = null;
            }
        }
        Process.killProcess(Process.myPid());
    }
}
