package a.a.a.b;

import android.os.Build;
import com.baidu.location.indoor.mapversion.IndoorJni;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lock f17a = new ReentrantLock();

    public static int a(String str) {
        if (str != null && !"".equals(str) && a()) {
            Lock lock = f17a;
            lock.lock();
            try {
                int gpsStatus = IndoorJni.getGpsStatus(0, str);
                lock.unlock();
                return gpsStatus;
            } catch (Throwable unused) {
                f17a.unlock();
            }
        }
        return -1;
    }

    public static int a(String str, String str2) {
        if (str == null || "".equals(str)) {
            return -100;
        }
        if (str2 == null || "".equals(str2)) {
            str2 = "default";
        }
        if (!a()) {
            return -101;
        }
        Lock lock = f17a;
        lock.lock();
        try {
            int iInitGpsChecker = IndoorJni.initGpsChecker(0, str, str2);
            lock.unlock();
            return iInitGpsChecker;
        } catch (Throwable unused) {
            f17a.unlock();
            return -101;
        }
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        return IndoorJni.f1378a;
    }

    public static int b() {
        if (!a()) {
            return 0;
        }
        Lock lock = f17a;
        lock.lock();
        try {
            int iDestroyGpsChecker = IndoorJni.destroyGpsChecker();
            lock.unlock();
            return iDestroyGpsChecker;
        } catch (Throwable unused) {
            f17a.unlock();
            return 0;
        }
    }
}
