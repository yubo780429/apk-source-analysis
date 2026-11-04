package a.a.a.d.m.c;

import a.a.a.i.i;
import android.content.Context;
import android.location.Location;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.URL;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static a j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f189b;
    public String d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f190c = false;
    public String e = "gcj02";
    public boolean f = false;
    public e i = null;
    public HashMap<String, e> g = new HashMap<>();
    public HashMap<String, double[][]> h = new HashMap<>();

    /* JADX INFO: renamed from: a.a.a.d.m.c.a$a, reason: collision with other inner class name */
    public class C0008a implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f191a;

        public C0008a(String str) {
            this.f191a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            a aVar = a.this;
            String str2 = this.f191a;
            a.a(aVar, str2);
            sb.append(str2);
            sb.append("_");
            return str.startsWith(sb.toString());
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f195c;
        public double d;
        public double e;
        public double f;
        public double g;
        public double h;

        public b(String str) {
            a(str);
        }

        public void a(String str) {
            String[] strArrSplit = str.trim().split("\\|");
            this.f193a = Double.valueOf(strArrSplit[0]).doubleValue();
            this.f194b = Double.valueOf(strArrSplit[1]).doubleValue();
            this.f195c = Double.valueOf(strArrSplit[2]).doubleValue();
            this.d = Double.valueOf(strArrSplit[3]).doubleValue();
            this.e = Double.valueOf(strArrSplit[4]).doubleValue();
            this.f = Double.valueOf(strArrSplit[5]).doubleValue();
            this.g = Double.valueOf(strArrSplit[6]).doubleValue();
            this.h = Double.valueOf(strArrSplit[7]).doubleValue();
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f197c;

        public c(String str, String str2) {
            this.f196b = str;
            this.f197c = str2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            String str;
            boolean zC;
            try {
                File file = new File(a.this.d);
                if (!file.exists() || !file.isDirectory()) {
                    file.mkdirs();
                }
                HttpsURLConnection.setDefaultSSLSocketFactory(i.g());
                URL url = new URL(a.a.a.i.d.d);
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setHostnameVerifier(new f(url));
                httpsURLConnection.addRequestProperty("Accept-encoding", "gzip");
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                StringBuilder sb = new StringBuilder();
                sb.append("bldg=");
                sb.append(this.f196b);
                sb.append("&md5=");
                String str2 = this.f197c;
                if (str2 == null) {
                    str2 = "null";
                }
                sb.append(str2);
                outputStream.write(sb.toString().getBytes());
                int responseCode = httpsURLConnection.getResponseCode();
                String str3 = null;
                if (responseCode == 200) {
                    String headerField = httpsURLConnection.getHeaderField("Hash");
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    File file2 = new File(file, a.this.b(this.f196b, headerField));
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i < 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i);
                        }
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    if (a.a(file2).equalsIgnoreCase(headerField)) {
                        a.this.a(this.f196b, this.f197c);
                        a.this.f189b = this.f196b;
                        zC = a.this.c();
                        str3 = "OK";
                    } else {
                        file2.delete();
                        str = "Download failed";
                        str3 = str;
                        zC = false;
                    }
                } else if (responseCode == 304) {
                    a.this.f189b = this.f196b;
                    zC = a.this.c();
                    str3 = "No roadnet update for " + this.f196b + "," + this.f197c;
                } else {
                    if (responseCode == 204) {
                        str = "Not found bldg " + this.f196b;
                        a.this.f = true;
                        str3 = str;
                    }
                    zC = false;
                }
                if (a.this.f188a != null) {
                    a.this.f188a.a(zC, str3);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            a.this.f190c = false;
        }
    }

    public interface d {
        void a(boolean z, String str);
    }

    public static class e implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f198b;
        public b d;
        public b f;
        public short[][] h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f199c = "0|3";
        public b e;
        public b g = this.e;
        public String i = "gcj02";

        public e(String str) {
        }

        public double a(double d) {
            b bVar = this.g;
            return (d + bVar.f) * bVar.e;
        }

        public b a() {
            return this.g;
        }

        public void a(String str) {
            String[] strArrSplit = str.split("\\t");
            this.f198b = strArrSplit[1];
            this.d = new b(strArrSplit[2]);
            this.f = new b(strArrSplit[3]);
            b bVar = new b(strArrSplit[4]);
            this.e = bVar;
            this.g = bVar;
            this.h = (short[][]) Array.newInstance((Class<?>) short.class, (int) bVar.g, (int) bVar.h);
            for (int i = 0; i < this.g.g; i++) {
                int i2 = 0;
                while (true) {
                    double d = i2;
                    double d2 = this.g.h;
                    if (d < d2) {
                        this.h[i][i2] = (short) (strArrSplit[5].charAt((((int) d2) * i) + i2) - '0');
                        i2++;
                    }
                }
            }
            if (strArrSplit.length >= 7) {
                this.f199c = strArrSplit[6];
            }
        }

        public double b(double d) {
            b bVar = this.g;
            return (d + bVar.d) * bVar.f195c;
        }

        public void b(String str) {
            b bVar;
            if (str != null) {
                String lowerCase = str.toLowerCase();
                this.i = lowerCase;
                if (lowerCase.startsWith("wgs84")) {
                    bVar = this.d;
                } else if (this.i.startsWith("bd09")) {
                    bVar = this.f;
                } else if (!this.i.startsWith("gcj02")) {
                    return;
                } else {
                    bVar = this.e;
                }
                this.g = bVar;
            }
        }

        public double c(double d) {
            b bVar = this.g;
            return (d / bVar.f195c) - bVar.d;
        }

        public double d(double d) {
            b bVar = this.g;
            return (d / bVar.e) - bVar.f;
        }
    }

    public static class f implements HostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public URL f200a;

        public f(URL url) {
            this.f200a = url;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return this.f200a.getHost().equals(str);
        }
    }

    public a(Context context) {
        this.d = "rn";
        this.d = new File(context.getCacheDir(), this.d).getAbsolutePath();
    }

    public static a a(Context context) {
        if (j == null) {
            j = new a(context);
        }
        return j;
    }

    public static /* synthetic */ String a(a aVar, String str) {
        aVar.b(str);
        return str;
    }

    public static String a(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(map);
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            fileInputStream.close();
            for (int length = 32 - string.length(); length > 0; length--) {
                string = "0" + string;
            }
            return string;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static a d() {
        return j;
    }

    public void a() {
        this.g.clear();
        this.h.clear();
        this.f189b = null;
        this.f190c = false;
    }

    public void a(double d2, double d3) {
        if (this.i == null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            Location.distanceBetween(d3, d2, d3, d2 + 0.01d, fArr);
            double d4 = ((double) fArr[0]) / 0.01d;
            Location.distanceBetween(d3, d2, d3 + 0.01d, d2, fArr2);
            double d5 = ((double) fArr2[0]) / 0.01d;
            e eVar = new e("outdoor");
            this.i = eVar;
            eVar.f198b = "out";
            eVar.g = new b("0|1.0|" + d4 + "|" + (-d2) + "|" + d5 + "|" + (-d3) + "|0|0");
        }
    }

    public final void a(String str) {
        if (this.f190c) {
            return;
        }
        this.f190c = true;
        new c(str, d(str)).start();
    }

    public void a(String str, d dVar) {
        String str2 = this.f189b;
        if ((str2 == null || !str.equals(str2)) && !this.f) {
            this.f188a = dVar;
            if (!h(str) || i(str)) {
                a(str);
                return;
            }
            this.f189b = str;
            c();
            d dVar2 = this.f188a;
            if (dVar2 != null) {
                dVar2.a(true, "OK");
            }
        }
    }

    public final void a(String str, String str2) {
        try {
            File file = new File(this.d + "/" + b(str, str2));
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public e b() {
        return this.i;
    }

    public final String b(String str) {
        return str;
    }

    public final String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        b(str);
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    public final ArrayList<Double> c(String str) {
        double dDoubleValue;
        ArrayList<Double> arrayList = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ',') {
                int i2 = i + 1;
                i += 2;
                dDoubleValue = Integer.valueOf(str.substring(i2, i)).intValue();
            } else if (str.charAt(i) == '.') {
                int i3 = i + 1;
                i += 4;
                dDoubleValue = Double.valueOf(str.substring(i3, i)).doubleValue();
            } else {
                int i4 = i + 2;
                double dIntValue = Integer.valueOf(str.substring(i, i4)).intValue();
                i = i4;
                dDoubleValue = dIntValue;
            }
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    public final boolean c() {
        String str = this.f189b;
        if (str == null) {
            return false;
        }
        File fileE = e(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (!a.a.a.d.m.c.c.a(fileE, byteArrayOutputStream)) {
            return false;
        }
        this.g.clear();
        this.h.clear();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.split("\\t")[1].split("_")[0].equals("geo")) {
                    j(line);
                } else {
                    e eVar = new e(this.f189b);
                    eVar.a(line);
                    eVar.b(this.e);
                    this.g.put(eVar.f198b.toLowerCase(), eVar);
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        bufferedReader.close();
        return true;
    }

    public final String d(String str) {
        File file = new File(this.d);
        if (file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles(new C0008a(str));
            if (fileArrListFiles != null && fileArrListFiles.length == 1) {
                String[] strArrSplit = fileArrListFiles[0].getName().split("_");
                if (strArrSplit.length < 2) {
                    return null;
                }
                return strArrSplit[1];
            }
            for (int i = 0; fileArrListFiles != null && i < fileArrListFiles.length; i++) {
                fileArrListFiles[i].delete();
            }
        }
        return null;
    }

    public final File e(String str) {
        return new File(this.d + "/" + b(str, d(str)));
    }

    public double[][] f(String str) {
        return this.h.get(str.toLowerCase());
    }

    public e g(String str) {
        return this.g.get(str.toLowerCase());
    }

    public final boolean h(String str) {
        File fileE = e(str);
        return fileE.exists() && fileE.length() > 0;
    }

    public final boolean i(String str) {
        return System.currentTimeMillis() - e(str).lastModified() > 1296000000;
    }

    public final void j(String str) {
        String[] strArrSplit = str.split("\\t");
        String lowerCase = strArrSplit[1].split("_")[1].toLowerCase();
        try {
            if (this.g.containsKey(lowerCase)) {
                ArrayList<Double> arrayListC = c(strArrSplit[5]);
                int length = this.g.get(lowerCase).h.length;
                int length2 = this.g.get(lowerCase).h[0].length;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) double.class, length, length2);
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (this.g.get(lowerCase).h[i2][i3] <= 0 || this.g.get(lowerCase).h[i2][i3] == 9) {
                            dArr[i2][i3] = 0.0d;
                        } else {
                            dArr[i2][i3] = arrayListC.get(i).doubleValue();
                            i++;
                        }
                    }
                }
                this.h.put(lowerCase.toLowerCase(), dArr);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void k(String str) {
        this.e = str;
    }
}
