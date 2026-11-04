package c.a.b.i;

import android.content.Context;
import c.a.b.e.b.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0053a f1268b;

    /* JADX INFO: renamed from: c.a.b.i.a$a, reason: collision with other inner class name */
    public final class C0053a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f1269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0053a f1271c;
        private boolean d;

        C0053a(File file) {
            this.d = false;
            this.d = true;
            this.f1269a = file;
            this.f1270b = file.getName();
        }

        C0053a(String str, C0053a c0053a) {
            this.d = false;
            this.f1270b = str;
            this.f1271c = c0053a;
            this.d = false;
        }

        public C0053a a(File file) {
            if (this.d) {
                throw new IllegalStateException("isolate session is not support");
            }
            ArrayList arrayList = new ArrayList();
            C0053a c0053aD = this;
            do {
                arrayList.add(c0053aD.c());
                c0053aD = c0053aD.d();
            } while (c0053aD != null);
            int size = arrayList.size() - 1;
            while (size >= 0) {
                File file2 = new File(file, (String) arrayList.get(size));
                size--;
                file = file2;
            }
            return a.this.new C0053a(file);
        }

        public C0053a a(String str) {
            return a.this.new C0053a(str, this);
        }

        public String a(String str, boolean z) {
            return a.a(b(), str, "UTF-8", z);
        }

        public void a() {
            b().mkdirs();
        }

        public boolean a(String str, String str2, boolean z) {
            return a.a(b(), str, str2, "UTF-8", z);
        }

        public File b() {
            File file = this.f1269a;
            if (file != null) {
                return file;
            }
            File file2 = this.f1271c == null ? new File(a.this.a(), this.f1270b) : new File(this.f1271c.b(), this.f1270b);
            this.f1269a = file2;
            return file2;
        }

        public String c() {
            return this.f1270b;
        }

        public C0053a d() {
            return this.f1271c;
        }
    }

    public a(Context context) {
        this.f1267a = context;
        c().mkdirs();
    }

    public static String a(File file, String str, String str2, boolean z) throws Throwable {
        FileInputStream fileInputStream;
        a(file);
        File file2 = new File(file, str);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                fileInputStream = new FileInputStream(file2);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr, 0, i);
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    if (z) {
                        byteArray = new c().b(byteArray);
                    }
                    String str3 = new String(byteArray, str2);
                    c.a.b.k.c.a(fileInputStream);
                    c.a.b.k.c.a(byteArrayOutputStream2);
                    return str3;
                } catch (Exception unused) {
                    byteArrayOutputStream = byteArrayOutputStream2;
                    c.a.b.k.c.a(fileInputStream);
                    c.a.b.k.c.a(byteArrayOutputStream);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    c.a.b.k.c.a(fileInputStream);
                    c.a.b.k.c.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                fileInputStream = null;
                byteArrayOutputStream = byteArrayOutputStream2;
                th = th2;
            }
        } catch (Exception unused3) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static void a(File file) {
        file.mkdirs();
    }

    public static boolean a(File file, String str, String str2, String str3, boolean z) throws Throwable {
        a(file);
        File file2 = new File(file, str);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            try {
                if (z) {
                    fileOutputStream2.write(new c().a(str2.getBytes()));
                } else {
                    fileOutputStream2.write(str2.getBytes(str3));
                }
                c.a.b.k.c.a(fileOutputStream2);
                return true;
            } catch (Exception unused) {
                fileOutputStream = fileOutputStream2;
                c.a.b.k.c.a(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                c.a.b.k.c.a(fileOutputStream);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private File c() {
        return new File(a(), ".cesium");
    }

    public File a() {
        return new File(this.f1267a.getApplicationInfo().dataDir);
    }

    public synchronized C0053a b() {
        if (this.f1268b == null) {
            this.f1268b = new C0053a(".cesium", null);
        }
        return this.f1268b;
    }
}
