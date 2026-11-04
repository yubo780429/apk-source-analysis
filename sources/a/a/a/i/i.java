package a.a.a.i;

import a.a.a.g.k;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.baidu.location.Jni;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static int A = 3;
    public static float A0 = 0.2f;
    public static int B = 10;
    public static int B0 = 0;
    public static int C = 2;
    public static int[] C0 = null;
    public static int D = 7;
    public static boolean D0 = false;
    public static int E = 20;
    public static int E0 = 8;
    public static int F = 70;
    public static int F0 = 4000;
    public static int G = 120;
    public static int G0 = -1;
    public static float H = 2.0f;
    public static int H0 = 10;
    public static float I = 10.0f;
    public static int I0 = 3;
    public static float J = 50.0f;
    public static int J0 = 40;
    public static float K = 200.0f;
    public static double[] K0 = null;
    public static int L = 16;
    public static int L0 = 1;
    public static float M = 0.9f;
    public static int M0 = 1;
    public static int N = 10000;
    public static int N0 = 1;
    public static float O = 0.5f;
    public static float P = 0.0f;
    public static float Q = 0.1f;
    public static int R = 30;
    public static int S = 100;
    public static int T = 0;
    public static int U = 0;
    public static int V = 0;
    public static boolean W = true;
    public static boolean X = true;
    public static int Y = 20;
    public static int Z = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f354a = false;
    public static int a0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f355b = false;
    public static long b0 = 900000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f356c = 0;
    public static long c0 = 15;
    public static String d = "no";
    public static long d0 = 300000;
    public static int e = 4;
    public static int e0 = 1000;
    public static boolean f = false;
    public static int f0 = 0;
    public static boolean g = false;
    public static int g0 = 30000;
    public static boolean h = false;
    public static int h0 = 30000;
    public static boolean i = false;
    public static float i0 = 10.0f;
    public static boolean j = false;
    public static float j0 = 6.0f;
    public static boolean k = false;
    public static float k0 = 10.0f;
    public static String l = "";
    public static int l0 = 60;
    public static boolean m = true;
    public static int m0 = 70;
    public static int n = 3;
    public static int n0 = 6;
    public static double o = 0.0d;
    public static String o0 = null;
    public static double p = 0.0d;
    public static boolean p0 = false;
    public static double q = 0.0d;
    public static int q0 = 16;
    public static double r = 0.0d;
    public static int r0 = 15;
    public static int s = 0;
    public static float s0 = 0.75f;
    public static byte[] t = null;
    public static double t0 = -0.10000000149011612d;
    public static boolean u = false;
    public static int u0 = 0;
    public static int v = 0;
    public static int v0 = 0;
    public static float w = 1.1f;
    public static int w0 = 1;
    public static float x = 2.2f;
    public static int x0 = 1;
    public static float y = 2.3f;
    public static int y0 = 0;
    public static float z = 3.8f;
    public static float z0 = 0.8f;
    public static String O0 = Build.MANUFACTURER;
    public static boolean P0 = false;
    public static String Q0 = null;
    public static int R0 = -1;
    public static String S0 = null;
    public static String T0 = null;

    public static class a implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateNotYetValidException, CertificateExpiredException {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                x509Certificate.checkValidity();
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static double a(double d2, double d3, double d4, double d5) {
        float[] fArr = new float[1];
        Location.distanceBetween(d2, d3, d4, d5, fArr);
        return fArr[0];
    }

    public static int a(Context context) {
        int iA = a(context, "android.permission.ACCESS_FINE_LOCATION") | a(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (c(context) != 0 && iA == 1) {
            return 1;
        }
        if (c(context) == 0 || iA == 1) {
            return (c(context) >= 1 || iA != 1) ? 0 : -1;
        }
        return -2;
    }

    public static int a(Context context, String str) {
        return !(context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) ? 0 : 1;
    }

    public static int a(String str, String str2, String str3) {
        int iIndexOf;
        int length;
        int iIndexOf2;
        String strSubstring;
        if (str != null && !str.equals("") && (iIndexOf = str.indexOf(str2)) != -1 && (iIndexOf2 = str.indexOf(str3, (length = iIndexOf + str2.length()))) != -1 && (strSubstring = str.substring(length, iIndexOf2)) != null && !strSubstring.equals("")) {
            try {
                return Integer.parseInt(strSubstring);
            } catch (NumberFormatException unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public static long a(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str).getTime() / 1000;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static Object a(Object obj, String str) throws NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    public static String a() {
        String path;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    path = Environment.getExternalStorageDirectory().getPath();
                } else {
                    path = null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            path = null;
        }
        if (path == null && Build.VERSION.SDK_INT > 28 && com.baidu.location.f.c() != null) {
            try {
                path = com.baidu.location.f.c().getExternalFilesDir(Environment.DIRECTORY_MOVIES).getAbsolutePath();
            } catch (Exception unused) {
                path = null;
            }
        }
        if (path != null) {
            try {
                File file = new File(path + "/baidu/tempdata");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                return null;
            }
        }
        return path;
    }

    public static String a(a.a.a.g.a aVar, k kVar, Location location, String str, int i2) {
        return a(aVar, kVar, location, str, i2, false);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00de A[Catch: Exception -> 0x00e1, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e1, blocks: (B:43:0x009f, B:47:0x00bd, B:50:0x00c3, B:51:0x00c6, B:56:0x00d2, B:58:0x00d6, B:60:0x00da, B:61:0x00de), top: B:65:0x009f }] */
    public static String a(a.a.a.g.a aVar, k kVar, Location location, String str, int i2, boolean z2) {
        String strA;
        StringBuffer stringBuffer = new StringBuffer(2048);
        if (aVar != null && (strA = a.a.a.g.f.w().a(aVar)) != null) {
            stringBuffer.append(strA);
        }
        if (kVar != null) {
            String strA2 = a.a.a.g.f.w().a(i2 == 0 ? L : r0, true, kVar, q0);
            if (strA2 != null) {
                stringBuffer.append(strA2);
            }
        }
        if (location != null) {
            String strD = (f356c == 0 || i2 == 0) ? a.a.a.g.d.d(location) : a.a.a.g.d.e(location);
            if (strD != null) {
                stringBuffer.append(strD);
            }
        }
        String strA3 = b.e().a(i2 == 0);
        if (strA3 != null) {
            stringBuffer.append(strA3);
        }
        if (str != null) {
            stringBuffer.append(str);
        }
        String strB = a.a.a.c.c.f().b();
        if (!TextUtils.isEmpty(strB)) {
            stringBuffer.append("&bc=");
            stringBuffer.append(strB);
        }
        stringBuffer.append(a.a.a.g.d.n().c());
        String strB2 = a.a.a.g.f.w().b(aVar);
        if (strB2 != null && strB2.length() + stringBuffer.length() < 2000) {
            stringBuffer.append(strB2);
        }
        String string = stringBuffer.toString();
        if (location == null || kVar == null) {
            n = 3;
        } else {
            try {
                float speed = location.getSpeed();
                int i3 = f356c;
                int iD = a.a.a.g.f.w().d(kVar);
                int iC = kVar.c();
                boolean z3 = kVar.d;
                if (speed < j0 && ((i3 == 1 || i3 == 0) && (iD < l0 || z3))) {
                    n = 1;
                } else if (speed >= k0 || (!(i3 == 1 || i3 == 0 || i3 == 3) || (iD >= m0 && iC <= n0))) {
                    n = 3;
                } else {
                    n = 2;
                }
            } catch (Exception unused) {
                n = 3;
            }
        }
        return string;
    }

    public static String a(byte[] bArr, String str, boolean z2) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (z2) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
            sb.append(str);
        }
        return sb.toString();
    }

    public static String a(byte[] bArr, boolean z2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return a(messageDigest.digest(), "", z2);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean a(double d2, double d3) {
        return Math.abs(d2 - d3) <= 1.192092896E-7d;
    }

    public static boolean a(float f2, float f3) {
        return Math.abs(f2 - f3) <= 1.1920929E-7f;
    }

    public static boolean a(Location location) {
        String str;
        if (location == null || (str = O0) == null || !"huawei".equalsIgnoreCase(str)) {
            return false;
        }
        try {
            Bundle extras = location.getExtras();
            return extras != null && (extras.getInt("SourceType") & 128) == 128;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(com.baidu.location.c cVar) {
        int iR = cVar.r();
        return (iR > 100 && iR < 200) || iR == 62;
    }

    public static boolean a(int[] iArr) {
        if (iArr != null && iArr.length >= 18) {
            for (int i2 : iArr) {
                if (i2 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int b(Context context) {
        try {
            if (Build.VERSION.SDK_INT > 17) {
                return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
            }
            return 2;
        } catch (Exception unused) {
            return 2;
        }
    }

    public static int b(Object obj, String str) throws NoSuchMethodException {
        Method declaredMethod = obj.getClass().getDeclaredMethod(str, null);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return ((Integer) declaredMethod.invoke(obj, null)).intValue();
    }

    public static String b() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet6Address) && inetAddressNextElement.getHostAddress() != null && !inetAddressNextElement.getHostAddress().startsWith("fe80:")) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(String str) {
        return Jni.a(l + ";" + str);
    }

    public static boolean b(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] b(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        IOException e2;
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                try {
                    byte[] bArr2 = new byte[2048];
                    while (true) {
                        int i2 = gZIPInputStream.read(bArr2);
                        if (i2 < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, i2);
                    }
                } catch (Throwable th) {
                    th = th;
                    gZIPInputStream2 = gZIPInputStream;
                    if (gZIPInputStream2 != null) {
                        try {
                            gZIPInputStream2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e2 = e4;
                e2.printStackTrace();
                if (gZIPInputStream != null) {
                    try {
                        gZIPInputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return byteArrayOutputStream.toByteArray();
            }
        } catch (IOException e6) {
            gZIPInputStream = null;
            e2 = e6;
        } catch (Throwable th2) {
            th = th2;
            if (gZIPInputStream2 != null) {
                gZIPInputStream2.close();
            }
            throw th;
        }
        gZIPInputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static int c(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return -2;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode", -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String c() {
        try {
            File file = new File(com.baidu.location.f.c().getFilesDir() + File.separator + "lldt");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file.getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                if (TextUtils.isEmpty(line)) {
                    return null;
                }
                return line;
            } catch (Exception unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String d() {
        try {
            File file = new File(com.baidu.location.f.c().getFilesDir() + File.separator + "/baidu/tempdata");
            if (!file.exists()) {
                file.mkdirs();
            }
            return com.baidu.location.f.c().getFilesDir().getPath();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String d(Context context) {
        int type = -1;
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                    type = activeNetworkInfo.getType();
                }
            } catch (Throwable unused) {
            }
        }
        return "&netc=" + type;
    }

    public static String e() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(com.baidu.location.f.c().getFilesDir());
            String str = File.separator;
            sb.append(str);
            sb.append("/baidu/tempdata");
            File file = new File(sb.toString());
            if (!file.exists()) {
                file.mkdirs();
            }
            return com.baidu.location.f.c().getFilesDir().getPath() + str + "/baidu/tempdata";
        } catch (Exception unused) {
            return null;
        }
    }

    public static String e(Context context) {
        int iA = a(context, "android.permission.ACCESS_COARSE_LOCATION");
        int iA2 = a(context, "android.permission.ACCESS_FINE_LOCATION");
        int iA3 = a(context, "android.permission.READ_PHONE_STATE");
        if (Build.VERSION.SDK_INT < 29) {
            return "&per=" + iA + "|" + iA2 + "|" + iA3;
        }
        return "&per=" + iA + "|" + iA2 + "|" + iA3 + "|" + a(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    public static String f() {
        return c("ro.mediatek.platform");
    }

    public static String f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static SSLSocketFactory g() throws NoSuchAlgorithmException, KeyManagementException {
        TrustManager[] trustManagerArr = {new a()};
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, trustManagerArr, new SecureRandom());
        return sSLContext.getSocketFactory();
    }

    public static boolean g(Context context) {
        int iA;
        if (context == null) {
            return true;
        }
        try {
            iA = a(context, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception e2) {
            e2.printStackTrace();
            iA = 1;
        }
        boolean z2 = iA == 1;
        if (z2 && Build.VERSION.SDK_INT >= 23) {
            try {
                if (Settings.Secure.getInt(context.getContentResolver(), "location_mode", 1) == 0) {
                    return false;
                }
            } catch (Exception unused) {
            }
        }
        return z2;
    }

    public static String h() {
        String strA = a();
        if (strA == null) {
            return null;
        }
        return strA + "/baidu/tempdata";
    }

    public static boolean h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo[] allNetworkInfo = null;
            try {
                allNetworkInfo = connectivityManager.getAllNetworkInfo();
            } catch (Exception unused) {
            }
            if (allNetworkInfo != null) {
                for (NetworkInfo networkInfo : allNetworkInfo) {
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String i() {
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(5);
        return String.format(Locale.CHINA, "%d-%02d-%02d %02d:%02d:%02d", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(i2), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)));
    }

    public static String j() {
        return d.g;
    }

    public static boolean k() {
        if (com.baidu.location.f.c() == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 31 && a(com.baidu.location.f.c(), "android.permission.ACCESS_FINE_LOCATION") == 0 && a(com.baidu.location.f.c(), "android.permission.ACCESS_COARSE_LOCATION") == 1;
    }

    public static boolean l() {
        return false;
    }
}
