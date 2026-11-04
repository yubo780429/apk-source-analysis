package a.a.a.f;

import a.a.a.b.w;
import a.a.a.i.i;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.baidu.location.Jni;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f226b;
    public boolean u = true;
    public long v = 8000;
    public long w = 5000;
    public long x = 5000;
    public long y = 5000;
    public long z = 5000;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean j = false;
    public boolean k = false;
    public int l = 6;
    public int m = 30;
    public int n = 30;
    public double o = 0.0d;
    public double p = 0.0d;
    public double q = 0.0d;
    public double r = 0.0d;
    public double s = 0.0d;
    public int t = 8;
    public String[] i = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f227c = new b();

    public final class b extends a.a.a.i.g {
        public int i;
        public long j;
        public long k;
        public boolean l;
        public final String m;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ExecutorService executorServiceB = w.d().b();
                b bVar = b.this;
                if (executorServiceB != null) {
                    bVar.a(executorServiceB, "https://ofloc.map.baidu.com/offline_loc");
                } else {
                    bVar.a("https://ofloc.map.baidu.com/offline_loc");
                }
            }
        }

        public b() {
            this.i = 0;
            this.l = false;
            this.j = -1L;
            this.k = -1L;
            this.d = new HashMap();
            this.m = Jni.e(String.format(Locale.US, "&ver=%s&cuid=%s&prod=%s:%s&sdk=%.2f&mb=%s&os=A%s", "1", a.a.a.i.b.e().f321c, a.a.a.i.b.g, a.a.a.i.b.f, Float.valueOf(9.521f), Build.MODEL, Build.VERSION.SDK));
        }

        @Override // a.a.a.i.g
        public void a() {
            this.d.clear();
            this.d.put("qt", "conf");
            this.d.put("req", this.m);
            this.f337a = d.j;
        }

        @Override // a.a.a.i.g
        public void a(boolean z) {
            String str;
            String str2 = "ver";
            if (!z || (str = this.f339c) == null) {
                this.i++;
                this.j = System.currentTimeMillis();
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    long j = jSONObject.has("ofl") ? jSONObject.getLong("ofl") : 0L;
                    String string = jSONObject.has("ver") ? jSONObject.getString("ver") : "1";
                    if ((j & 1) == 1) {
                        c.this.d = true;
                    }
                    if ((j & 2) == 2) {
                        c.this.e = true;
                    }
                    if ((j & 4) == 4) {
                        c.this.f = true;
                    }
                    if ((j & 8) == 8) {
                        c.this.g = true;
                    }
                    if ((j & 16) == 16) {
                        c.this.h = true;
                    }
                    if ((j & 32) == 32) {
                        c.this.j = true;
                    }
                    if ((j & 64) == 64) {
                        c.this.k = true;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    if (jSONObject.has("cplist")) {
                        c.this.i = jSONObject.getString("cplist").split(";");
                        jSONObject2.put("cplist", jSONObject.getString("cplist"));
                    }
                    if (jSONObject.has("bklist")) {
                        c.this.a(jSONObject.getString("bklist").split(";"));
                    }
                    String str3 = "poiup";
                    String str4 = "addrup";
                    String str5 = string;
                    if (jSONObject.has("para")) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject("para");
                        if (jSONObject3.has("rgcgp")) {
                            c.this.l = jSONObject3.getInt("rgcgp");
                        }
                        if (jSONObject3.has("addrup")) {
                            c.this.n = jSONObject3.getInt("addrup");
                        }
                        if (jSONObject3.has("poiup")) {
                            c.this.m = jSONObject3.getInt("poiup");
                        }
                        if (jSONObject3.has("oflp")) {
                            JSONObject jSONObject4 = jSONObject3.getJSONObject("oflp");
                            if (jSONObject4.has("0")) {
                                c.this.o = jSONObject4.getDouble("0");
                            }
                            if (jSONObject4.has("1")) {
                                c.this.p = jSONObject4.getDouble("1");
                            }
                            if (jSONObject4.has("2")) {
                                c.this.q = jSONObject4.getDouble("2");
                            }
                            if (jSONObject4.has("3")) {
                                c.this.r = jSONObject4.getDouble("3");
                            }
                            if (jSONObject4.has("4")) {
                                c.this.s = jSONObject4.getDouble("4");
                            }
                        } else {
                            str3 = "poiup";
                            str4 = "addrup";
                        }
                        if (jSONObject3.has("onlt")) {
                            JSONObject jSONObject5 = jSONObject3.getJSONObject("onlt");
                            if (jSONObject5.has("0")) {
                                c.this.z = jSONObject5.getLong("0");
                            }
                            if (jSONObject5.has("1")) {
                                c.this.y = jSONObject5.getLong("1");
                            }
                            if (jSONObject5.has("2")) {
                                c.this.v = jSONObject5.getLong("2");
                            }
                            if (jSONObject5.has("3")) {
                                c.this.w = jSONObject5.getLong("3");
                            }
                            if (jSONObject5.has("4")) {
                                c.this.x = jSONObject5.getLong("4");
                            }
                        }
                        if (jSONObject3.has("minapn")) {
                            c.this.t = jSONObject3.getInt("minapn");
                        }
                    } else {
                        str2 = "ver";
                        str3 = "poiup";
                        str4 = "addrup";
                    }
                    jSONObject2.put("ol", c.this.d);
                    jSONObject2.put("olv2", c.this.k);
                    jSONObject2.put("fl", c.this.e);
                    jSONObject2.put("on", c.this.f);
                    jSONObject2.put("wn", c.this.g);
                    jSONObject2.put("oc", c.this.h);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.k = jCurrentTimeMillis;
                    jSONObject2.put("t", jCurrentTimeMillis);
                    jSONObject2.put(str2, str5);
                    jSONObject2.put("rgcon", c.this.j);
                    jSONObject2.put("rgcgp", c.this.l);
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("0", c.this.o);
                    jSONObject6.put("1", c.this.p);
                    jSONObject6.put("2", c.this.q);
                    jSONObject6.put("3", c.this.r);
                    jSONObject6.put("4", c.this.s);
                    jSONObject2.put("oflp", jSONObject6);
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("0", c.this.z);
                    jSONObject7.put("1", c.this.y);
                    jSONObject7.put("2", c.this.v);
                    jSONObject7.put("3", c.this.w);
                    jSONObject7.put("4", c.this.x);
                    jSONObject2.put("onlt", jSONObject7);
                    jSONObject2.put(str4, c.this.n);
                    jSONObject2.put(str3, c.this.m);
                    jSONObject2.put("minapn", c.this.t);
                    File file = new File(c.this.f225a.h(), "ofl.config");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write(jSONObject2.toString());
                    fileWriter.close();
                } catch (Exception unused) {
                    this.i++;
                    this.j = System.currentTimeMillis();
                }
            }
            this.l = false;
        }

        public final void b() {
            boolean z;
            if (this.l) {
                return;
            }
            try {
                File file = new File(c.this.f225a.h(), "ofl.config");
                if (this.k == -1 && file.exists()) {
                    Scanner scanner = new Scanner(file);
                    String next = scanner.next();
                    scanner.close();
                    JSONObject jSONObject = new JSONObject(next);
                    c.this.d = jSONObject.getBoolean("ol");
                    c.this.e = jSONObject.getBoolean("fl");
                    c.this.f = jSONObject.getBoolean("on");
                    c.this.g = jSONObject.getBoolean("wn");
                    c.this.h = jSONObject.getBoolean("oc");
                    this.k = jSONObject.getLong("t");
                    if (jSONObject.has("ol")) {
                        c.this.k = jSONObject.getBoolean("olv2");
                    }
                    if (jSONObject.has("cplist")) {
                        c.this.i = jSONObject.getString("cplist").split(";");
                    }
                    if (jSONObject.has("rgcgp")) {
                        c.this.l = jSONObject.getInt("rgcgp");
                    }
                    if (jSONObject.has("rgcon")) {
                        c.this.j = jSONObject.getBoolean("rgcon");
                    }
                    if (jSONObject.has("addrup")) {
                        c.this.n = jSONObject.getInt("addrup");
                    }
                    if (jSONObject.has("poiup")) {
                        c.this.m = jSONObject.getInt("poiup");
                    }
                    if (jSONObject.has("oflp")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("oflp");
                        if (jSONObject2.has("0")) {
                            c.this.o = jSONObject2.getDouble("0");
                        }
                        if (jSONObject2.has("1")) {
                            c.this.p = jSONObject2.getDouble("1");
                        }
                        if (jSONObject2.has("2")) {
                            c.this.q = jSONObject2.getDouble("2");
                        }
                        if (jSONObject2.has("3")) {
                            c.this.r = jSONObject2.getDouble("3");
                        }
                        if (jSONObject2.has("4")) {
                            c.this.s = jSONObject2.getDouble("4");
                        }
                    }
                    if (jSONObject.has("onlt")) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject("onlt");
                        if (jSONObject3.has("0")) {
                            c.this.z = jSONObject3.getLong("0");
                        }
                        if (jSONObject3.has("1")) {
                            c.this.y = jSONObject3.getLong("1");
                        }
                        if (jSONObject3.has("2")) {
                            c.this.v = jSONObject3.getLong("2");
                        }
                        if (jSONObject3.has("3")) {
                            c.this.w = jSONObject3.getLong("3");
                        }
                        if (jSONObject3.has("4")) {
                            c.this.x = jSONObject3.getLong("4");
                        }
                    }
                    if (jSONObject.has("minapn")) {
                        c.this.t = jSONObject.getInt("minapn");
                    }
                }
                if (this.k == -1) {
                    file.exists();
                }
                long j = this.k;
                z = j != -1 && j + 86400000 <= System.currentTimeMillis();
            } catch (Exception unused) {
            }
            if ((this.k == -1 || z) && c() && i.h(c.this.f225a.d())) {
                this.l = true;
                if (i.l()) {
                    return;
                }
                a.a.a.h.a.e().postDelayed(new a(), 1000L);
            }
        }

        public final boolean c() {
            if (this.i < 2) {
                return true;
            }
            if (this.j + 86400000 >= System.currentTimeMillis()) {
                return false;
            }
            this.i = 0;
            this.j = -1L;
            return true;
        }
    }

    public c(d dVar, SQLiteDatabase sQLiteDatabase) {
        this.f225a = dVar;
        this.f226b = sQLiteDatabase;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS BLACK (name VARCHAR(100) PRIMARY KEY);");
            } catch (Exception unused) {
            }
        }
        a();
    }

    public long a(String str) {
        if (str.equals("2G")) {
            return this.v;
        }
        if (str.equals("3G")) {
            return this.w;
        }
        if (str.equals("4G")) {
            return this.x;
        }
        if (str.equals("WIFI")) {
            return this.y;
        }
        if (str.equals("unknown")) {
            return this.z;
        }
        return 5000L;
    }

    public void a() {
        b bVar = this.f227c;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void a(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(",");
            }
            stringBuffer.append("(\"");
            stringBuffer.append(strArr[i]);
            stringBuffer.append("\")");
        }
        SQLiteDatabase sQLiteDatabase = this.f226b;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || stringBuffer.length() <= 0) {
            return;
        }
        try {
            this.f226b.execSQL(String.format(Locale.US, "INSERT OR IGNORE INTO BLACK VALUES %s;", stringBuffer.toString()));
        } catch (Exception unused) {
        }
    }

    public int b() {
        return this.n;
    }

    public int c() {
        return this.l;
    }

    public int d() {
        return this.t;
    }

    public int e() {
        return this.m;
    }

    public double f() {
        return this.q;
    }

    public double g() {
        return this.r;
    }

    public double h() {
        return this.s;
    }

    public double i() {
        return this.o;
    }

    public double j() {
        return this.p;
    }

    public String[] k() {
        return this.i;
    }

    public boolean l() {
        return this.e;
    }

    public boolean m() {
        return this.d;
    }

    public boolean n() {
        return this.j;
    }

    public boolean o() {
        return this.u;
    }

    public boolean p() {
        return this.g;
    }

    public boolean q() {
        return this.f;
    }
}
