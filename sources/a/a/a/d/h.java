package a.a.a.d;

import android.os.Build;
import com.baidu.location.indoor.mapversion.IndoorJni;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Lock f147a = new ReentrantLock();

    public static String a(int i) {
        String floor = "";
        if (a()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f147a.lock();
            try {
                floor = IndoorJni.getFloor(jCurrentTimeMillis, i);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f147a.unlock();
                }
            }
        }
        return floor;
    }

    public static void a(double d, double d2, float f, float f2, float f3, double d3, int i, long j) {
        if (a()) {
            f147a.lock();
            try {
                IndoorJni.setGps(d, d2, f, f2, f3, d3, i, j);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f147a.unlock();
                }
            }
        }
    }

    public static void a(double d, double d2, String str, int i, long j, int i2) {
        String str2 = str;
        if (a()) {
            if (str2 == null || "".equals(str)) {
                str2 = "unknow";
            }
            String str3 = str2;
            f147a.lock();
            try {
                IndoorJni.setBleLoc4Scenario(d, d2, str3, i, j, i2);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f147a.unlock();
                }
            }
        }
    }

    public static void a(float f, long j) {
        if (a()) {
            f147a.lock();
            try {
                IndoorJni.setBarometers(f, j);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f147a.unlock();
                }
            }
        }
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        return IndoorJni.f1378a;
    }

    public static int b(int i) {
        int inout = -1;
        if (a()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f147a.lock();
            try {
                inout = IndoorJni.getInout(jCurrentTimeMillis, i);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f147a.unlock();
                }
            }
        }
        return inout;
    }
}
