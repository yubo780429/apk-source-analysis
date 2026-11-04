package a.a.a.c;

import a.a.a.b.w;
import a.a.a.i.g;
import a.a.a.i.h;
import a.a.a.i.i;
import android.content.SharedPreferences;
import com.baidu.location.Jni;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static d d;
    public static final String e = h.f353a + "/conlts.dat";
    public static int f = -1;
    public static int g = -1;
    public static int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f112a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f113b = 604800;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f114c = true;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a();
        }
    }

    public class b extends g {
        public String i = null;
        public boolean j = false;
        public boolean k = false;

        public b() {
            this.d = new HashMap();
        }

        @Override // a.a.a.i.g
        public void a() {
            Map<String, Object> map;
            String str;
            this.f338b = 2;
            String strB = Jni.b(this.i);
            this.i = null;
            if (this.j) {
                map = this.d;
                str = "grid";
            } else {
                map = this.d;
                str = "conf";
            }
            map.put("qt", str);
            this.d.put("req", strB);
        }

        public void a(String str, boolean z) {
            if (this.k) {
                return;
            }
            this.k = true;
            this.i = str;
            this.j = z;
            ExecutorService executorServiceB = w.d().b();
            if (z) {
                a(executorServiceB, true, "loc.map.baidu.com");
            } else if (executorServiceB != null) {
                a(executorServiceB, a.a.a.i.d.f325c);
            } else {
                a(a.a.a.i.d.f325c);
            }
        }

        @Override // a.a.a.i.g
        public void a(boolean z) {
            String str;
            if (!z || (str = this.f339c) == null) {
                d.this.b((String) null);
            } else if (this.j) {
                d.this.a(this.e);
            } else {
                d.this.b(str);
            }
            Map<String, Object> map = this.d;
            if (map != null) {
                map.clear();
            }
            this.k = false;
        }
    }

    public static d j() {
        if (d == null) {
            d = new d();
        }
        return d;
    }

    public final void a() {
        String str = "&ver=" + i.v + "&usr=" + a.a.a.i.b.e().d() + "&app=" + a.a.a.i.b.f + "&prod=" + a.a.a.i.b.g;
        if (this.f112a == null) {
            this.f112a = new b();
        }
        if (i.l()) {
            return;
        }
        this.f112a.a(str, false);
    }

    public final void a(int i) {
        this.f114c = (i & 1) == 1;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        boolean z = true;
        try {
            if (jSONObject.has("ipen") && jSONObject.getInt("ipen") == 0) {
                z = false;
            }
            int i = jSONObject.has("ipvt") ? jSONObject.getInt("ipvt") : 14400000;
            int i2 = jSONObject.has("ipvn") ? jSONObject.getInt("ipvn") : 10;
            SharedPreferences.Editor editorEdit = com.baidu.location.f.c().getSharedPreferences("MapCoreServicePre", 0).edit();
            editorEdit.putBoolean("ipLocInfoUpload", z);
            editorEdit.putInt("ipValidTime", i);
            editorEdit.putInt("ipLocInfoUploadTimesPerDay", i2);
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }

    public final void a(byte[] bArr) {
        int i = 0;
        if (bArr != null) {
            try {
                if (bArr.length < 640) {
                    i.u = false;
                    i.r = i.p + 0.025d;
                    i.q = i.o - 0.025d;
                } else {
                    i.u = true;
                    i.q = Double.longBitsToDouble(((((long) bArr[7]) & 255) << 56) | ((((long) bArr[6]) & 255) << 48) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[1]) & 255) << 8) | (((long) bArr[0]) & 255));
                    i.r = Double.longBitsToDouble(((((long) bArr[15]) & 255) << 56) | ((((long) bArr[14]) & 255) << 48) | ((((long) bArr[13]) & 255) << 40) | ((((long) bArr[12]) & 255) << 32) | ((((long) bArr[11]) & 255) << 24) | ((((long) bArr[10]) & 255) << 16) | ((((long) bArr[9]) & 255) << 8) | (255 & ((long) bArr[8])));
                    i.t = new byte[625];
                    while (i < 625) {
                        i.t[i] = bArr[i + 16];
                        i++;
                    }
                }
                i = 1;
            } catch (Exception unused) {
                return;
            }
        }
        if (i != 0) {
            g();
        }
    }

    public final boolean a(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("ipconf")) {
                    try {
                        a(jSONObject.getJSONObject("ipconf"));
                    } catch (Exception unused) {
                    }
                }
                if (jSONObject.has("is_check_Per")) {
                    try {
                        if (jSONObject.getInt("is_check_Per") > 0) {
                            i.p0 = true;
                        }
                    } catch (Exception unused2) {
                    }
                }
                int i = Integer.parseInt(jSONObject.getString("ver"));
                if (i > i.v) {
                    i.v = i;
                    if (jSONObject.has("gps")) {
                        String[] strArrSplit = jSONObject.getString("gps").split("\\|");
                        if (strArrSplit.length > 10) {
                            if (strArrSplit[0] != null && !strArrSplit[0].equals("")) {
                                i.w = Float.parseFloat(strArrSplit[0]);
                            }
                            if (strArrSplit[1] != null && !strArrSplit[1].equals("")) {
                                i.x = Float.parseFloat(strArrSplit[1]);
                            }
                            if (strArrSplit[2] != null && !strArrSplit[2].equals("")) {
                                i.y = Float.parseFloat(strArrSplit[2]);
                            }
                            if (strArrSplit[3] != null && !strArrSplit[3].equals("")) {
                                i.z = Float.parseFloat(strArrSplit[3]);
                            }
                            if (strArrSplit[4] != null && !strArrSplit[4].equals("")) {
                                i.A = Integer.parseInt(strArrSplit[4]);
                            }
                            if (strArrSplit[5] != null && !strArrSplit[5].equals("")) {
                                i.B = Integer.parseInt(strArrSplit[5]);
                            }
                            if (strArrSplit[6] != null && !strArrSplit[6].equals("")) {
                                i.C = Integer.parseInt(strArrSplit[6]);
                            }
                            if (strArrSplit[7] != null && !strArrSplit[7].equals("")) {
                                i.D = Integer.parseInt(strArrSplit[7]);
                            }
                            if (strArrSplit[8] != null && !strArrSplit[8].equals("")) {
                                i.E = Integer.parseInt(strArrSplit[8]);
                            }
                            if (strArrSplit[9] != null && !strArrSplit[9].equals("")) {
                                i.F = Integer.parseInt(strArrSplit[9]);
                            }
                            if (strArrSplit[10] != null && !strArrSplit[10].equals("")) {
                                i.G = Integer.parseInt(strArrSplit[10]);
                            }
                        }
                    }
                    if (jSONObject.has("up")) {
                        String[] strArrSplit2 = jSONObject.getString("up").split("\\|");
                        if (strArrSplit2.length > 3) {
                            if (strArrSplit2[0] != null && !strArrSplit2[0].equals("")) {
                                i.H = Float.parseFloat(strArrSplit2[0]);
                            }
                            if (strArrSplit2[1] != null && !strArrSplit2[1].equals("")) {
                                i.I = Float.parseFloat(strArrSplit2[1]);
                            }
                            if (strArrSplit2[2] != null && !strArrSplit2[2].equals("")) {
                                i.J = Float.parseFloat(strArrSplit2[2]);
                            }
                            if (strArrSplit2[3] != null && !strArrSplit2[3].equals("")) {
                                i.K = Float.parseFloat(strArrSplit2[3]);
                            }
                        }
                    }
                    if (jSONObject.has("wf")) {
                        String[] strArrSplit3 = jSONObject.getString("wf").split("\\|");
                        if (strArrSplit3.length > 3) {
                            if (strArrSplit3[0] != null && !strArrSplit3[0].equals("")) {
                                i.L = Integer.parseInt(strArrSplit3[0]);
                            }
                            if (strArrSplit3[1] != null && !strArrSplit3[1].equals("")) {
                                i.M = Float.parseFloat(strArrSplit3[1]);
                            }
                            if (strArrSplit3[2] != null && !strArrSplit3[2].equals("")) {
                                i.N = Integer.parseInt(strArrSplit3[2]);
                            }
                            if (strArrSplit3[3] != null && !strArrSplit3[3].equals("")) {
                                i.O = Float.parseFloat(strArrSplit3[3]);
                            }
                        }
                    }
                    if (jSONObject.has("ab")) {
                        String[] strArrSplit4 = jSONObject.getString("ab").split("\\|");
                        if (strArrSplit4.length > 3) {
                            if (strArrSplit4[0] != null && !strArrSplit4[0].equals("")) {
                                i.P = Float.parseFloat(strArrSplit4[0]);
                            }
                            if (strArrSplit4[1] != null && !strArrSplit4[1].equals("")) {
                                i.Q = Float.parseFloat(strArrSplit4[1]);
                            }
                            if (strArrSplit4[2] != null && !strArrSplit4[2].equals("")) {
                                i.R = Integer.parseInt(strArrSplit4[2]);
                            }
                            if (strArrSplit4[3] != null && !strArrSplit4[3].equals("")) {
                                i.S = Integer.parseInt(strArrSplit4[3]);
                            }
                        }
                    }
                    if (jSONObject.has("zxd")) {
                        String[] strArrSplit5 = jSONObject.getString("zxd").split("\\|");
                        if (strArrSplit5.length > 4) {
                            if (strArrSplit5[0] != null && !strArrSplit5[0].equals("")) {
                                i.j0 = Float.parseFloat(strArrSplit5[0]);
                            }
                            if (strArrSplit5[1] != null && !strArrSplit5[1].equals("")) {
                                i.k0 = Float.parseFloat(strArrSplit5[1]);
                            }
                            if (strArrSplit5[2] != null && !strArrSplit5[2].equals("")) {
                                i.l0 = Integer.parseInt(strArrSplit5[2]);
                            }
                            if (strArrSplit5[3] != null && !strArrSplit5[3].equals("")) {
                                i.m0 = Integer.parseInt(strArrSplit5[3]);
                            }
                            if (strArrSplit5[4] != null && !strArrSplit5[4].equals("")) {
                                i.n0 = Integer.parseInt(strArrSplit5[4]);
                            }
                        }
                    }
                    if (jSONObject.has("gpc")) {
                        String[] strArrSplit6 = jSONObject.getString("gpc").split("\\|");
                        if (strArrSplit6.length > 5) {
                            if (strArrSplit6[0] != null && !strArrSplit6[0].equals("")) {
                                if (Integer.parseInt(strArrSplit6[0]) > 0) {
                                    i.W = true;
                                } else {
                                    i.W = false;
                                }
                            }
                            if (strArrSplit6[1] != null && !strArrSplit6[1].equals("")) {
                                if (Integer.parseInt(strArrSplit6[1]) > 0) {
                                    i.X = true;
                                } else {
                                    i.X = false;
                                }
                            }
                            if (strArrSplit6[2] != null && !strArrSplit6[2].equals("")) {
                                i.Y = Integer.parseInt(strArrSplit6[2]);
                            }
                            if (strArrSplit6[3] != null && !strArrSplit6[3].equals("")) {
                                i.Z = Integer.parseInt(strArrSplit6[3]);
                            }
                            if (strArrSplit6[4] != null && !strArrSplit6[4].equals("")) {
                                int i2 = Integer.parseInt(strArrSplit6[4]);
                                if (i2 > 0) {
                                    long j = i2;
                                    i.c0 = j;
                                    long j2 = j * 1000 * 60;
                                    i.b0 = j2;
                                    i.d0 = j2 >> 2;
                                } else {
                                    i.m = false;
                                }
                            }
                            if (strArrSplit6[5] != null && !strArrSplit6[5].equals("")) {
                                i.f0 = Integer.parseInt(strArrSplit6[5]);
                            }
                        }
                    }
                    if (jSONObject.has("shak")) {
                        String[] strArrSplit7 = jSONObject.getString("shak").split("\\|");
                        if (strArrSplit7.length > 2) {
                            if (strArrSplit7[0] != null && !strArrSplit7[0].equals("")) {
                                i.g0 = Integer.parseInt(strArrSplit7[0]);
                            }
                            if (strArrSplit7[1] != null && !strArrSplit7[1].equals("")) {
                                i.h0 = Integer.parseInt(strArrSplit7[1]);
                            }
                            if (strArrSplit7[2] != null && !strArrSplit7[2].equals("")) {
                                i.i0 = Float.parseFloat(strArrSplit7[2]);
                            }
                        }
                    }
                    if (!jSONObject.has("dmx")) {
                        return true;
                    }
                    i.e0 = jSONObject.getInt("dmx");
                    return true;
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    public final void b() {
        try {
            File file = new File(e);
            if (file.exists()) {
                return;
            }
            File file2 = new File(h.f353a);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (!file.createNewFile()) {
                file = null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(128);
            randomAccessFile.writeInt(0);
            randomAccessFile.close();
        } catch (Exception unused) {
        }
    }

    public final void b(int i) {
        File file = new File(e);
        if (!file.exists()) {
            b();
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(4L);
            int i2 = randomAccessFile.readInt();
            int i3 = randomAccessFile.readInt();
            randomAccessFile.seek((i2 * h) + 128);
            byte[] bytes = (a.a.a.i.b.f + (char) 0).getBytes();
            randomAccessFile.writeInt(bytes.length);
            randomAccessFile.write(bytes, 0, bytes.length);
            randomAccessFile.writeInt(i);
            if (i3 == h) {
                randomAccessFile.seek(8L);
                randomAccessFile.writeInt(i3 + 1);
            }
            randomAccessFile.close();
        } catch (Exception unused) {
        }
    }

    public final void b(String str) {
        g = -1;
        if (str != null) {
            try {
                if (a(str)) {
                    f();
                }
            } catch (Exception unused) {
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("ctr")) {
                    g = Integer.parseInt(jSONObject.getString("ctr"));
                }
            } catch (Exception unused2) {
            }
            try {
                e();
                int i = g;
                if (i != -1) {
                    b(i);
                } else {
                    i = f;
                    if (i == -1) {
                        i = -1;
                    }
                }
                if (i != -1) {
                    a(i);
                }
            } catch (Exception unused3) {
            }
        }
    }

    public void c() {
        if (System.currentTimeMillis() - a.a.a.i.e.c().b() > this.f113b * 1000) {
            a.a.a.i.e.c().b(System.currentTimeMillis());
            a.a.a.h.a.e().postDelayed(new a(), 1000L);
        }
    }

    public final void d() {
        try {
            File file = new File(h.f353a + "/config.dat");
            if (file.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                if (randomAccessFile.readBoolean()) {
                    randomAccessFile.seek(2L);
                    int i = randomAccessFile.readInt();
                    byte[] bArr = new byte[i];
                    randomAccessFile.read(bArr, 0, i);
                    a(new String(bArr));
                }
                randomAccessFile.seek(1L);
                if (randomAccessFile.readBoolean()) {
                    randomAccessFile.seek(1024L);
                    i.q = randomAccessFile.readDouble();
                    i.r = randomAccessFile.readDouble();
                    boolean z = randomAccessFile.readBoolean();
                    i.u = z;
                    if (z) {
                        byte[] bArr2 = new byte[625];
                        i.t = bArr2;
                        randomAccessFile.read(bArr2, 0, 625);
                    }
                }
                randomAccessFile.close();
            }
        } catch (Exception unused) {
        }
        if (i.m) {
            boolean z2 = com.baidu.location.f.f;
        }
    }

    public final void e() {
        try {
            File file = new File(e);
            if (file.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(4L);
                int i = randomAccessFile.readInt();
                if (i > 3000) {
                    randomAccessFile.close();
                    h = 0;
                    b();
                    return;
                }
                int i2 = randomAccessFile.readInt();
                randomAccessFile.seek(128L);
                byte[] bArr = new byte[i];
                int i3 = 0;
                while (i3 < i2) {
                    randomAccessFile.seek((i * i3) + 128);
                    int i4 = randomAccessFile.readInt();
                    if (i4 > 0 && i4 < i) {
                        randomAccessFile.read(bArr, 0, i4);
                        int i5 = i4 - 1;
                        if (bArr[i5] == 0) {
                            String str = new String(bArr, 0, i5);
                            a.a.a.i.b.e();
                            if (str.equals(a.a.a.i.b.f)) {
                                f = randomAccessFile.readInt();
                                h = i3;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i3++;
                }
                if (i3 == i2) {
                    h = i2;
                }
                randomAccessFile.close();
            }
        } catch (Exception unused) {
        }
    }

    public final void f() {
        String str = h.f353a + "/config.dat";
        byte[] bytes = String.format(Locale.CHINA, "{\"ver\":\"%d\",\"gps\":\"%.1f|%.1f|%.1f|%.1f|%d|%d|%d|%d|%d|%d|%d\",\"up\":\"%.1f|%.1f|%.1f|%.1f\",\"wf\":\"%d|%.1f|%d|%.1f\",\"ab\":\"%.2f|%.2f|%d|%d\",\"gpc\":\"%d|%d|%d|%d|%d|%d\",\"zxd\":\"%.1f|%.1f|%d|%d|%d\",\"shak\":\"%d|%d|%.1f\",\"dmx\":%d}", Integer.valueOf(i.v), Float.valueOf(i.w), Float.valueOf(i.x), Float.valueOf(i.y), Float.valueOf(i.z), Integer.valueOf(i.A), Integer.valueOf(i.B), Integer.valueOf(i.C), Integer.valueOf(i.D), Integer.valueOf(i.E), Integer.valueOf(i.F), Integer.valueOf(i.G), Float.valueOf(i.H), Float.valueOf(i.I), Float.valueOf(i.J), Float.valueOf(i.K), Integer.valueOf(i.L), Float.valueOf(i.M), Integer.valueOf(i.N), Float.valueOf(i.O), Float.valueOf(i.P), Float.valueOf(i.Q), Integer.valueOf(i.R), Integer.valueOf(i.S), Integer.valueOf(i.W ? 1 : 0), Integer.valueOf(i.X ? 1 : 0), Integer.valueOf(i.Y), Integer.valueOf(i.Z), Long.valueOf(i.c0), Integer.valueOf(i.f0), Float.valueOf(i.j0), Float.valueOf(i.k0), Integer.valueOf(i.l0), Integer.valueOf(i.m0), Integer.valueOf(i.n0), Integer.valueOf(i.g0), Integer.valueOf(i.h0), Float.valueOf(i.i0), Integer.valueOf(i.e0)).getBytes();
        try {
            File file = new File(str);
            if (!file.exists()) {
                File file2 = new File(h.f353a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file.createNewFile()) {
                    return;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(0L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.close();
            }
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            randomAccessFile2.seek(0L);
            randomAccessFile2.writeBoolean(true);
            randomAccessFile2.seek(2L);
            randomAccessFile2.writeInt(bytes.length);
            randomAccessFile2.write(bytes);
            randomAccessFile2.close();
        } catch (Exception unused) {
        }
    }

    public final void g() {
        byte[] bArr;
        try {
            File file = new File(h.f353a + "/config.dat");
            if (!file.exists()) {
                File file2 = new File(h.f353a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file.createNewFile()) {
                    return;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(0L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.close();
            }
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            randomAccessFile2.seek(1L);
            randomAccessFile2.writeBoolean(true);
            randomAccessFile2.seek(1024L);
            randomAccessFile2.writeDouble(i.q);
            randomAccessFile2.writeDouble(i.r);
            randomAccessFile2.writeBoolean(i.u);
            if (i.u && (bArr = i.t) != null) {
                randomAccessFile2.write(bArr);
            }
            randomAccessFile2.close();
        } catch (Exception unused) {
        }
    }

    public void h() {
        d();
    }

    public void i() {
    }
}
