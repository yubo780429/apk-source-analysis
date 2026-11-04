package com.baidu.location;

/* JADX INFO: loaded from: classes.dex */
public class Jni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f1346a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f1347b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f1348c = 2;
    public static int d = 11;
    public static int e = 12;
    public static int f = 13;
    public static int g = 15;
    public static int h = 1024;
    public static boolean i = false;

    static {
        try {
            System.loadLibrary("locSDK8b");
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            i = true;
        }
    }

    public static double a(float f2, double d2, double d3) {
        if (i) {
            return 0.0d;
        }
        try {
            return gsr(f2, d2, d3);
        } catch (UnsatisfiedLinkError unused) {
            return 0.0d;
        }
    }

    public static String a() {
        if (i) {
            return null;
        }
        try {
            return ldkaiv();
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String a(String str) {
        if (i) {
            return "err!";
        }
        if (str == null) {
            return "null";
        }
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[h];
        int length = bytes.length;
        if (length > 740) {
            length = 740;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (bytes[i3] != 0) {
                bArr[i2] = bytes[i3];
                i2++;
            }
        }
        try {
            return a(bArr, 132456);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return "err!";
        }
    }

    public static native String a(byte[] bArr, int i2);

    public static double[] a(double d2, double d3, String str) {
        double[] dArr = {0.0d, 0.0d};
        if (i) {
            return dArr;
        }
        int i2 = -1;
        if (str.equals("bd09")) {
            i2 = f1346a;
        } else if (str.equals("bd09ll")) {
            i2 = f1347b;
        } else if (str.equals("gcj02")) {
            i2 = f1348c;
        } else if (str.equals("gps2gcj")) {
            i2 = d;
        } else if (str.equals("bd092gcj")) {
            i2 = e;
        } else if (str.equals("bd09ll2gcj")) {
            i2 = f;
        } else if (str.equals("wgs842mc")) {
            i2 = g;
        }
        if (str.equals("gcj2wgs")) {
            i2 = 16;
        }
        try {
            String[] strArrSplit = b(d2, d3, i2, 132456).split(":");
            dArr[0] = Double.parseDouble(strArrSplit[0]);
            dArr[1] = Double.parseDouble(strArrSplit[1]);
        } catch (Throwable unused) {
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
        }
        return dArr;
    }

    public static native String b(double d2, double d3, int i2, int i3);

    public static String b(String str) {
        if (i) {
            return "err!";
        }
        return a(str) + "|tp=3";
    }

    public static String c(String str) {
        if (i) {
            return "err!";
        }
        if (str == null) {
            return "null";
        }
        try {
            return c(str.getBytes(), 132456);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return "err!";
        }
    }

    public static native String c(byte[] bArr, int i2);

    public static Long d(String str) {
        String str2;
        if (i) {
            return null;
        }
        try {
            str2 = new String(str.getBytes(), "UTF-8");
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            return Long.valueOf(murmur(str2));
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String e(String str) {
        String str2;
        String strEncodeNotLimit = "err!";
        if (i) {
            return "err!";
        }
        try {
            str2 = new String(str.getBytes(), "UTF-8");
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            strEncodeNotLimit = encodeNotLimit(str2, 132456);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
        return strEncodeNotLimit + "|tp=3";
    }

    public static native String ee(String str, int i2);

    public static native String encodeNotLimit(String str, int i2);

    public static String f(String str) {
        String str2;
        String strEe = "err!";
        if (i) {
            return "err!";
        }
        try {
            str2 = new String(str.getBytes(), "UTF-8");
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            strEe = ee(str2, 132456);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
        return strEe + "|tp=4";
    }

    public static native double gsr(float f2, double d2, double d3);

    public static native String ldkaiv();

    public static native long murmur(String str);
}
