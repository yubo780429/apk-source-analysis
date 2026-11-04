package a.a.a.d.m;

import android.os.Build;
import com.baidu.location.indoor.mapversion.IndoorJni;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Lock f186a = new ReentrantLock();

    public static synchronized String a(int i, float[] fArr, long j) {
        String strPhs;
        strPhs = null;
        f186a.lock();
        try {
            if (a() && fArr != null && fArr.length >= 3) {
                strPhs = IndoorJni.phs(i, fArr[0], fArr[1], fArr[2], j);
            }
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } catch (Throwable th2) {
                f186a.unlock();
                throw th2;
            }
        }
        f186a.unlock();
        return strPhs;
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        return IndoorJni.f1378a;
    }

    public static float b() {
        float fPgo;
        f186a.lock();
        try {
            fPgo = IndoorJni.pgo();
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                fPgo = -1.0f;
            } finally {
                f186a.unlock();
            }
        }
        return fPgo;
    }

    public static void c() {
        f186a.lock();
        try {
            IndoorJni.startPdr();
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } finally {
                f186a.unlock();
            }
        }
    }

    public static void d() {
        f186a.lock();
        try {
            IndoorJni.stopPdr();
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } finally {
                f186a.unlock();
            }
        }
    }
}
