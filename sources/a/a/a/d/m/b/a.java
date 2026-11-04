package a.a.a.d.m.b;

import a.a.a.d.e;
import a.a.a.d.h;
import android.os.Build;
import com.baidu.location.c;
import com.baidu.location.indoor.mapversion.IndoorJni;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lock f187a = new ReentrantLock();

    public static boolean a() {
        return IndoorJni.f1378a && Build.VERSION.SDK_INT > 19;
    }

    public static synchronized boolean a(String str) throws Throwable {
        Object obj;
        try {
            if (!a()) {
                return false;
            }
            a.a.a.d.m.c.a.e eVarG = a.a.a.d.m.c.a.d().g(str);
            double[][] dArrF = a.a.a.d.m.c.a.d().f(str);
            if (eVarG == null) {
                return false;
            }
            eVarG.b("gcj02");
            short[][] sArr = eVarG.h;
            double d = eVarG.a().f193a;
            double d2 = eVarG.a().f194b;
            a.a.a.d.m.c.a.e eVarB = a.a.a.d.m.c.a.d().b();
            if (eVarB == null) {
                return false;
            }
            try {
                double dB = eVarB.b(-eVarG.a().d);
                double dA = eVarB.a(-eVarG.a().f);
                Lock lock = f187a;
                lock.lock();
                try {
                    a.a.a.d.m.c.a.b bVar = eVarG.g;
                    obj = a.class;
                    try {
                        IndoorJni.setPfRdnt(str, sArr, d, d2, (int) bVar.g, (int) bVar.h, dB, dA, eVarG.f199c);
                        a.a.a.d.m.c.a.b bVar2 = eVarG.g;
                        IndoorJni.setPfGeoMap(dArrF, str, (int) bVar2.g, (int) bVar2.h);
                        lock.unlock();
                    } catch (Throwable th) {
                        th = th;
                        try {
                            th.printStackTrace();
                            f187a.unlock();
                        } catch (Throwable th2) {
                            f187a.unlock();
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = a.class;
                }
                return true;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            obj = a.class;
        }
        throw th;
    }

    public static double[] a(double d, double d2, double d3, double d4, String str, String str2, long j, int i, String str3) {
        String str4 = str;
        double[] pfBle = {-1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d};
        if (a()) {
            if (str4 == null || "".equals(str4)) {
                str4 = "unknow";
            }
            String str5 = str4;
            Lock lock = f187a;
            lock.lock();
            try {
                pfBle = IndoorJni.setPfBle(d, d2, d3, d4, str5, str2, j, i, str3);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    lock = f187a;
                } catch (Throwable th2) {
                    f187a.unlock();
                    throw th2;
                }
            }
            lock.unlock();
        }
        return pfBle;
    }

    public static synchronized double[] a(String str, double d, double d2, double d3, String str2) {
        if (!a()) {
            return null;
        }
        a.a.a.d.m.c.a.e eVarB = a.a.a.d.m.c.a.d().b();
        double[] pfDr = {-1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d};
        if (eVarB != null) {
            Lock lock = f187a;
            lock.lock();
            try {
                pfDr = IndoorJni.setPfDr(d2, d3, str2, System.currentTimeMillis());
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    lock = f187a;
                } catch (Throwable th2) {
                    f187a.unlock();
                    throw th2;
                }
            }
            lock.unlock();
            if (pfDr[0] == 0.0d) {
                double dC = eVarB.c(pfDr[1]);
                double d4 = eVarB.d(pfDr[2]);
                pfDr[1] = dC;
                pfDr[2] = d4;
            }
        }
        return pfDr;
    }

    public static synchronized double[] a(boolean z, c cVar) {
        if (!a()) {
            return null;
        }
        a.a.a.d.m.c.a.e eVarB = a.a.a.d.m.c.a.d().b();
        double[] pfWf = {-1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d};
        if (eVarB != null) {
            double dB = eVarB.b(cVar.t());
            double dA = eVarB.a(cVar.q());
            if (z) {
                String strA = h.a(2);
                if (strA != null || !"".equals(strA)) {
                    strA = strA.split("_")[0];
                }
                if (strA == null || "".equals(strA)) {
                    strA = "unknow";
                }
                String str = strA;
                String strC = e.k().c();
                if (strC == null || "".equals(strC)) {
                    strC = "unknow";
                }
                String str2 = strC;
                str.toUpperCase();
                int iB = h.b(2);
                String strF = cVar.f();
                if (strF == null || "".equals(strF)) {
                    strF = "unknown";
                }
                pfWf = a(dB, dA, cVar.z(), cVar.a(), str, str2, System.currentTimeMillis(), iB, strF);
            } else {
                Lock lock = f187a;
                lock.lock();
                try {
                    pfWf = IndoorJni.setPfWf(dB, dA, 8.0d, System.currentTimeMillis());
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                        lock = f187a;
                    } catch (Throwable th2) {
                        f187a.unlock();
                        throw th2;
                    }
                }
                lock.unlock();
            }
            if (pfWf[0] == 0.0d) {
                double dC = eVarB.c(pfWf[1]);
                double d = eVarB.d(pfWf[2]);
                pfWf[1] = dC;
                pfWf[2] = d;
            }
        }
        return pfWf;
    }

    public static void b() {
        if (a()) {
            Lock lock = f187a;
            lock.lock();
            try {
                IndoorJni.initPf();
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    lock = f187a;
                } catch (Throwable th2) {
                    f187a.unlock();
                    throw th2;
                }
            }
            lock.unlock();
        }
    }

    public static void c() {
        if (a()) {
            Lock lock = f187a;
            lock.lock();
            try {
                IndoorJni.resetPf();
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    lock = f187a;
                } catch (Throwable th2) {
                    f187a.unlock();
                    throw th2;
                }
            }
            lock.unlock();
        }
    }
}
