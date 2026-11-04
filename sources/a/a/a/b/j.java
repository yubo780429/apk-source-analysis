package a.a.a.b;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import com.baidu.location.Jni;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public static j H = null;
    public static String I = "0";
    public Handler B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f37b = 0.699999988079071d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38c = "3G|4G";
    public int d = 1;
    public int e = 307200;
    public int f = 15;
    public double g = 3.5d;
    public double h = 3.0d;
    public double i = 0.5d;
    public int j = 300;
    public int k = 60;
    public int l = 0;
    public int m = 60;
    public int n = 0;
    public long o = 0;
    public d p = null;
    public boolean q = false;
    public boolean r = false;
    public int s = 0;
    public float t = 0.0f;
    public float u = 0.0f;
    public long v = 0;
    public int w = 500;
    public long x = 0;
    public Location y = null;
    public Location z = null;
    public long A = 0;
    public byte[] C = new byte[4];
    public byte[] D = null;
    public int E = 0;
    public List<Byte> F = null;
    public boolean G = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Location f39b;

        public a(Location location) {
            this.f39b = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.c(this.f39b);
        }
    }

    public class b extends Thread {
        public b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            j.this.a(new File(a.a.a.i.i.d() + "/baidu/tempdata", "intime.dat"), "https://itsdata.map.baidu.com/long-conn-gps/sdk.php");
        }
    }

    public static class c implements HostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public URL f42a;

        public c(URL url) {
            this.f42a = url;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return this.f42a.getHost().equals(str);
        }
    }

    public class d extends a.a.a.i.g {
        public String i = null;

        public d() {
            this.d = new HashMap();
        }

        @Override // a.a.a.i.g
        public void a() {
            this.f337a = "https://loc.map.baidu.com/cc.php";
            String strB = Jni.b(this.i);
            this.i = null;
            this.d.put("q", strB);
        }

        @Override // a.a.a.i.g
        public void a(boolean z) {
            String str;
            if (z && (str = this.f339c) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("prod", a.a.a.i.b.f);
                    jSONObject.put("uptime", System.currentTimeMillis());
                    j.this.e(jSONObject.toString());
                } catch (Exception unused) {
                }
            }
            Map<String, Object> map = this.d;
            if (map != null) {
                map.clear();
            }
        }

        public void c(String str) {
            this.i = str;
            a("https://loc.map.baidu.com/cc.php");
        }
    }

    public j() {
        this.B = null;
        this.B = new Handler();
    }

    public static j k() {
        if (H == null) {
            H = new j();
        }
        return H;
    }

    public final String a(File file, String str) {
        String string = UUID.randomUUID().toString();
        try {
            try {
                HttpsURLConnection.setDefaultSSLSocketFactory(a.a.a.i.i.g());
                URL url = new URL(str);
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setUseCaches(false);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setRequestProperty("Charset", "utf-8");
                httpsURLConnection.setHostnameVerifier(new c(url));
                httpsURLConnection.setRequestProperty("connection", "close");
                httpsURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + string);
                if (file == null || !file.exists()) {
                    return "0";
                }
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("--");
                stringBuffer.append(string);
                stringBuffer.append("\r\n");
                stringBuffer.append("Content-Disposition: form-data; name=\"location_dat\"; filename=\"" + file.getName() + "\"\r\n");
                StringBuilder sb = new StringBuilder();
                sb.append("Content-Type: application/octet-stream; charset=utf-8");
                sb.append("\r\n");
                stringBuffer.append(sb.toString());
                stringBuffer.append("\r\n");
                dataOutputStream.write(stringBuffer.toString().getBytes());
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    dataOutputStream.write(bArr, 0, i);
                }
                fileInputStream.close();
                dataOutputStream.write("\r\n".getBytes());
                dataOutputStream.write(("--" + string + "--\r\n").getBytes());
                dataOutputStream.flush();
                dataOutputStream.close();
                int responseCode = httpsURLConnection.getResponseCode();
                outputStream.close();
                httpsURLConnection.disconnect();
                int i2 = this.n + 400;
                this.n = i2;
                c(i2);
                return responseCode == 200 ? "1" : "0";
            } catch (Exception e) {
                e.printStackTrace();
                return "0";
            }
        } catch (MalformedURLException | IOException unused) {
            return "0";
        }
    }

    public final void a() {
        if (this.A == 0 || System.currentTimeMillis() - this.A < this.f * 1000) {
            return;
        }
        if (com.baidu.location.f.c().getSharedPreferences("loc_navi_mode", 4).getBoolean("is_navi_on", false)) {
            g();
            return;
        }
        if (this.d == 1 && !e()) {
            g();
            return;
        }
        if (a.a.a.i.b.f.equals("com.ubercab.driver")) {
            if (d()) {
                g();
                return;
            }
        } else if (!a(a.a.a.i.b.f, com.baidu.location.f.c())) {
            g();
            return;
        }
        List<Byte> list = this.F;
        if (list != null) {
            try {
                int size = list.size();
                this.F.set(0, Byte.valueOf((byte) (size & 255)));
                this.F.set(1, Byte.valueOf((byte) ((65280 & size) >> 8)));
                this.F.set(3, Byte.valueOf((byte) (this.E & 255)));
                byte[] bArr = new byte[size];
                for (int i = 0; i < size; i++) {
                    bArr[i] = this.F.get(i).byteValue();
                }
                File file = new File(a.a.a.i.i.d(), "baidu/tempdata");
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (file.exists()) {
                    File file2 = new File(file, "intime.dat");
                    if (file2.exists()) {
                        file2.delete();
                    }
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        new b().start();
                    } catch (Exception unused) {
                    }
                }
                g();
                this.v = System.currentTimeMillis();
            } catch (Exception unused2) {
            }
        }
    }

    public final void a(int i) {
        byte[] bArrB = b(i);
        for (int i2 = 0; i2 < 4; i2++) {
            this.F.add(Byte.valueOf(bArrB[i2]));
        }
    }

    public final void a(Location location) {
        this.A = System.currentTimeMillis();
        a((int) (location.getTime() / 1000));
        a((int) (location.getLongitude() * 1000000.0d));
        a((int) (location.getLatitude() * 1000000.0d));
        int i = !location.hasBearing() ? 1 : 0;
        int i2 = !location.hasSpeed() ? 1 : 0;
        if (i > 0) {
            this.F.add((byte) 32);
        } else {
            this.F.add(Byte.valueOf((byte) (((byte) (((int) (location.getBearing() / 15.0f)) & 255)) & (-33))));
        }
        if (i2 > 0) {
            this.F.add((byte) -128);
        } else {
            this.F.add(Byte.valueOf((byte) (((byte) (((int) ((((double) location.getSpeed()) * 3.6d) / 4.0d)) & 255)) & 127)));
        }
        this.y = location;
    }

    public final boolean a(String str, Context context) {
        return true;
    }

    public final byte[] a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes();
        byte bNextInt = (byte) new SecureRandom().nextInt(255);
        byte bNextInt2 = (byte) new SecureRandom().nextInt(255);
        byte[] bArr = new byte[bytes.length + 2];
        int length = bytes.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = (byte) (bytes[i] ^ bNextInt);
            i++;
            i2++;
        }
        bArr[i2] = bNextInt;
        bArr[i2 + 1] = bNextInt2;
        return bArr;
    }

    public final String b(String str) {
        Calendar calendar = Calendar.getInstance();
        return String.format(str, Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)));
    }

    public final void b() {
        String[] strArrSplit = "9.5.2.1".split("\\.");
        int length = strArrSplit.length;
        byte[] bArr = this.C;
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
        bArr[3] = 0;
        if (length >= 4) {
            length = 4;
        }
        for (int i = 0; i < length; i++) {
            try {
                this.C[i] = (byte) (Integer.valueOf(strArrSplit[i]).intValue() & 255);
            } catch (Exception unused) {
            }
        }
        this.D = a(a.a.a.i.b.f + ":" + a.a.a.i.b.e().f321c);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0119 A[PHI: r3
  0x0119: PHI (r3v17 byte) = (r3v14 byte), (r3v25 byte) binds: [B:37:0x0117, B:32:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    public final void b(Location location) {
        byte bearing;
        List<Byte> list;
        byte bValueOf;
        if (location == null) {
            return;
        }
        int longitude = (int) ((location.getLongitude() - this.y.getLongitude()) * 1000000.0d);
        int latitude = (int) ((location.getLatitude() - this.y.getLatitude()) * 1000000.0d);
        int i = !location.hasBearing() ? 1 : 0;
        int i2 = !location.hasSpeed() ? 1 : 0;
        char c2 = longitude > 0 ? (char) 0 : (char) 1;
        int iAbs = Math.abs(longitude);
        char c3 = latitude > 0 ? (char) 0 : (char) 1;
        int iAbs2 = Math.abs(latitude);
        if (this.E > 1) {
            this.z = null;
            this.z = this.y;
        }
        this.y = location;
        if (location != null && this.z != null && location.getTime() > this.z.getTime() && this.y.getTime() - this.z.getTime() < 5000) {
            long time = this.y.getTime() - this.z.getTime();
            float[] fArr = new float[2];
            Location.distanceBetween(this.y.getAltitude(), this.y.getLongitude(), this.z.getLatitude(), this.z.getLongitude(), fArr);
            double speed = ((fArr[0] - (this.z.getSpeed() * time)) * 2.0f) / (time * time);
            if (speed > this.u) {
                this.u = (float) speed;
            }
        }
        this.F.add(Byte.valueOf((byte) (iAbs & 255)));
        this.F.add(Byte.valueOf((byte) ((iAbs & 65280) >> 8)));
        this.F.add(Byte.valueOf((byte) (iAbs2 & 255)));
        this.F.add(Byte.valueOf((byte) ((iAbs2 & 65280) >> 8)));
        if (i > 0) {
            bearing = c3 > 0 ? (byte) 96 : (byte) 32;
            if (c2 > 0) {
                bearing = (byte) (bearing | (-128));
            }
        } else {
            bearing = (byte) (((byte) (((int) (location.getBearing() / 15.0f)) & 255)) & 31);
            if (c3 > 0) {
                bearing = (byte) (bearing | 64);
            }
            if (c2 > 0) {
                bearing = (byte) (bearing | (-128));
            }
        }
        this.F.add(Byte.valueOf(bearing));
        if (i2 > 0) {
            list = this.F;
            bValueOf = (byte) -128;
        } else {
            byte speed2 = (byte) (((byte) (((int) ((((double) location.getSpeed()) * 3.6d) / 4.0d)) & 255)) & 127);
            list = this.F;
            bValueOf = Byte.valueOf(speed2);
        }
        list.add(bValueOf);
    }

    public final byte[] b(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((16711680 & i) >> 16), (byte) ((i & (-16777216)) >> 24)};
    }

    public final void c() {
        List<Byte> list;
        byte b2;
        this.F.add((byte) 0);
        this.F.add((byte) 0);
        if (I.equals("0")) {
            list = this.F;
            b2 = -82;
        } else {
            list = this.F;
            b2 = -66;
        }
        list.add(Byte.valueOf(b2));
        this.F.add((byte) 0);
        this.F.add(Byte.valueOf(this.C[0]));
        this.F.add(Byte.valueOf(this.C[1]));
        this.F.add(Byte.valueOf(this.C[2]));
        this.F.add(Byte.valueOf(this.C[3]));
        int length = this.D.length;
        this.F.add(Byte.valueOf((byte) ((length + 1) & 255)));
        for (int i = 0; i < length; i++) {
            this.F.add(Byte.valueOf(this.D[i]));
        }
    }

    public final void c(int i) {
        if (i == 0) {
            return;
        }
        try {
            File file = new File(a.a.a.i.h.f353a + "/grtcf.dat");
            if (!file.exists()) {
                File file2 = new File(a.a.a.i.h.f353a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file.createNewFile()) {
                    return;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(2L);
                randomAccessFile.writeInt(0);
                randomAccessFile.seek(8L);
                byte[] bytes = "1980_01_01:0".getBytes();
                randomAccessFile.writeInt(bytes.length);
                randomAccessFile.write(bytes);
                randomAccessFile.seek(200L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.seek(800L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.close();
            }
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            randomAccessFile2.seek(8L);
            byte[] bytes2 = (b("%d_%02d_%02d") + ":" + i).getBytes();
            randomAccessFile2.writeInt(bytes2.length);
            randomAccessFile2.write(bytes2);
            randomAccessFile2.close();
        } catch (Exception unused) {
        }
    }

    public final void c(Location location) {
        d(location);
        a();
    }

    public final void c(String str) {
        try {
            File file = new File(a.a.a.i.h.f353a + "/grtcf.dat");
            if (file.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(2L);
                int i = randomAccessFile.readInt();
                randomAccessFile.seek(8L);
                int i2 = randomAccessFile.readInt();
                if (i2 < 4096) {
                    byte[] bArr = new byte[i2];
                    randomAccessFile.read(bArr, 0, i2);
                    String str2 = new String(bArr);
                    if (str2.contains(b("%d_%02d_%02d")) && str2.contains(":")) {
                        try {
                            String[] strArrSplit = str2.split(":");
                            if (strArrSplit.length > 1) {
                                this.n = Integer.valueOf(strArrSplit[1]).intValue();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                for (int i3 = 1; i3 <= i; i3++) {
                    randomAccessFile.seek(i3 * 2048);
                    int i4 = randomAccessFile.readInt();
                    if (i4 <= 4096) {
                        byte[] bArr2 = new byte[i4];
                        randomAccessFile.read(bArr2, 0, i4);
                        String str3 = new String(bArr2);
                        if (str != null && str3.contains(str)) {
                            d(str3);
                            break;
                        }
                    }
                }
                randomAccessFile.close();
            }
        } catch (Exception unused2) {
        }
    }

    public final void d(Location location) {
        if (System.currentTimeMillis() - this.x < this.w || location == null) {
            return;
        }
        if (location != null && location.hasSpeed() && location.getSpeed() > this.t) {
            this.t = location.getSpeed();
        }
        try {
            if (this.F == null) {
                this.F = new ArrayList();
                c();
                a(location);
            } else {
                b(location);
            }
        } catch (Exception unused) {
        }
        this.E++;
    }

    public final void d(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("on")) {
                    this.f36a = jSONObject.getInt("on");
                }
                if (jSONObject.has("bash")) {
                    this.f37b = jSONObject.getDouble("bash");
                }
                if (jSONObject.has("net")) {
                    this.f38c = jSONObject.getString("net");
                }
                if (jSONObject.has("tcon")) {
                    this.d = jSONObject.getInt("tcon");
                }
                if (jSONObject.has("tcsh")) {
                    this.e = jSONObject.getInt("tcsh");
                }
                if (jSONObject.has("per")) {
                    this.f = jSONObject.getInt("per");
                }
                if (jSONObject.has("chdron")) {
                    jSONObject.getInt("chdron");
                }
                if (jSONObject.has("spsh")) {
                    this.g = jSONObject.getDouble("spsh");
                }
                if (jSONObject.has("acsh")) {
                    this.h = jSONObject.getDouble("acsh");
                }
                if (jSONObject.has("stspsh")) {
                    this.i = jSONObject.getDouble("stspsh");
                }
                if (jSONObject.has("drstsh")) {
                    this.j = jSONObject.getInt("drstsh");
                }
                if (jSONObject.has("stper")) {
                    this.k = jSONObject.getInt("stper");
                }
                if (jSONObject.has("nondron")) {
                    this.l = jSONObject.getInt("nondron");
                }
                if (jSONObject.has("nondrper")) {
                    this.m = jSONObject.getInt("nondrper");
                }
                if (jSONObject.has("uptime")) {
                    this.o = jSONObject.getLong("uptime");
                }
                f();
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0059 A[Catch: Exception -> 0x005c, TRY_LEAVE, TryCatch #3 {Exception -> 0x005c, blocks: (B:25:0x0054, B:27:0x0059), top: B:36:0x0054 }] */
    public final boolean d() throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        Throwable th;
        FileChannel fileChannel = null;
        FileLock fileLockTryLock = null;
        RandomAccessFile randomAccessFile2 = null;
        boolean z = false;
        try {
            File file = new File(a.a.a.i.i.h() + File.separator + "gflk.dat");
            if (!file.exists()) {
                file.createNewFile();
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                try {
                    fileLockTryLock = channel.tryLock();
                } catch (Exception unused) {
                    z = true;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                        } catch (Exception unused2) {
                            throw th;
                        }
                    } else if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
                if (fileLockTryLock != null) {
                    try {
                        fileLockTryLock.release();
                    } catch (Exception unused3) {
                    }
                }
                if (channel != null) {
                    channel.close();
                }
            } catch (Exception unused4) {
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    randomAccessFile = randomAccessFile2;
                }
                return z;
            } catch (Throwable th3) {
                channel = null;
                th = th3;
            }
        } catch (Exception unused5) {
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
        randomAccessFile.close();
        return z;
    }

    public void e(Location location) {
        if (!this.G) {
            h();
        }
        boolean z = ((double) a.a.a.c.c.f().a()) < this.f37b * 100.0d;
        if (this.f36a == 1 && z && this.f38c.contains(a.a.a.g.b.a(a.a.a.g.f.w().f()))) {
            if (this.d != 1 || this.n <= this.e) {
                this.B.post(new a(location));
            }
        }
    }

    public final void e(String str) {
        try {
            File file = new File(a.a.a.i.h.f353a + "/grtcf.dat");
            if (!file.exists()) {
                File file2 = new File(a.a.a.i.h.f353a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file.createNewFile()) {
                    return;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(2L);
                randomAccessFile.writeInt(0);
                randomAccessFile.seek(8L);
                byte[] bytes = "1980_01_01:0".getBytes();
                randomAccessFile.writeInt(bytes.length);
                randomAccessFile.write(bytes);
                randomAccessFile.seek(200L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.seek(800L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.close();
            }
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            randomAccessFile2.seek(2L);
            int i = randomAccessFile2.readInt();
            int i2 = 1;
            while (i2 <= i) {
                randomAccessFile2.seek(i2 * 2048);
                int i3 = randomAccessFile2.readInt();
                byte[] bArr = new byte[i3];
                randomAccessFile2.read(bArr, 0, i3);
                if (new String(bArr).contains(a.a.a.i.b.f)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= i) {
                randomAccessFile2.seek(2L);
                randomAccessFile2.writeInt(i2);
            }
            randomAccessFile2.seek(i2 * 2048);
            byte[] bytes2 = str.getBytes();
            randomAccessFile2.writeInt(bytes2.length);
            randomAccessFile2.write(bytes2);
            randomAccessFile2.close();
        } catch (Exception unused) {
        }
    }

    public final boolean e() {
        if (this.q) {
            if (this.r) {
                if (this.t < this.i) {
                    int i = this.s + this.f;
                    this.s = i;
                    if (i > this.j && System.currentTimeMillis() - this.v <= this.k * 1000) {
                        return false;
                    }
                } else {
                    this.s = 0;
                    this.r = false;
                }
            } else if (this.t < this.i) {
                this.r = true;
                this.s = 0;
                this.s = this.f + 0;
            }
        } else if (this.t >= this.g || this.u >= this.h) {
            this.q = true;
        } else if (this.l != 1 || System.currentTimeMillis() - this.v <= this.m * 1000) {
            return false;
        }
        return true;
    }

    public final void f() {
    }

    public final void g() {
        this.F = null;
        this.A = 0L;
        this.E = 0;
        this.y = null;
        this.z = null;
        this.t = 0.0f;
        this.u = 0.0f;
    }

    public final void h() {
        if (this.G) {
            return;
        }
        this.G = true;
        c(a.a.a.i.b.f);
        j();
        b();
    }

    public void i() {
        if (this.G) {
            this.G = false;
            g();
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.o > 86400000) {
            if (this.p == null) {
                this.p = new d();
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a.a.a.i.b.e().a(false));
            stringBuffer.append(a.a.a.b.c.h().d());
            this.p.c(stringBuffer.toString());
        }
        f();
    }
}
