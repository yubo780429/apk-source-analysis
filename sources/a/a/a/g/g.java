package a.a.a.g;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.telephony.TelephonyManager;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {
    public static boolean d = false;
    public static e e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f286a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f287b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f288c = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f289a;

        static {
            int[] iArr = new int[b.values().length];
            f289a = iArr;
            try {
                iArr[b.ONLY_CELL_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f289a[b.ONLY_WIFI_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f289a[b.GET_ALL_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        ONLY_CELL_MODE,
        ONLY_WIFI_MODE,
        GET_ALL_DATA
    }

    public static boolean g() {
        return d;
    }

    public static e h() {
        return e;
    }

    public a.a.a.g.a a(int i) {
        if (this.f288c && this.f286a) {
            return a.a.a.g.l.a.i().a(i);
        }
        return null;
    }

    public a.a.a.g.a a(a.a.a.g.a aVar, TelephonyManager telephonyManager) {
        return a.a.a.g.l.a.i().a(aVar, telephonyManager);
    }

    public WifiInfo a() {
        return a.a.a.g.l.b.i().a();
    }

    public String a(int i, boolean z, k kVar, int i2) {
        return a.a.a.g.l.b.i().a(i, z, kVar, i2);
    }

    public String a(a.a.a.g.a aVar) {
        return a.a.a.g.l.a.i().b(aVar);
    }

    public String a(k kVar, int i, String str, boolean z, int i2) {
        return a.a.a.g.l.b.i().a(kVar, i, str, z, i2);
    }

    public String a(WifiInfo wifiInfo, String str) {
        return a.a.a.g.l.b.i().a(wifiInfo, str);
    }

    public void a(e eVar) {
        e = eVar;
    }

    public void a(b bVar) {
        int i = a.f289a[bVar.ordinal()];
        if (i == 1) {
            this.f286a = true;
            this.f287b = false;
            return;
        }
        if (i == 2) {
            this.f286a = false;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Illegal this mode : " + bVar);
            }
            this.f286a = true;
        }
        this.f287b = true;
    }

    public void a(Context context, List<String> list) {
        if (this.f286a) {
            a.a.a.g.l.a.i().a(context);
        }
        if (this.f287b) {
            a.a.a.g.l.b.i().a(context, list);
        }
        this.f288c = true;
    }

    public void a(boolean z) {
        a.a.a.g.l.a.i().a(z);
    }

    public boolean a(a.a.a.g.a aVar, a.a.a.g.a aVar2) {
        return a.a.a.g.l.a.i().a(aVar, aVar2);
    }

    public k b(int i) {
        if (this.f288c && this.f287b) {
            return a.a.a.g.l.b.i().b(i);
        }
        return null;
    }

    public String b() {
        return a.a.a.g.l.b.i().b();
    }

    public String b(a.a.a.g.a aVar) {
        return a.a.a.g.l.a.i().c(aVar);
    }

    public void b(boolean z) {
        a.a.a.g.l.a.i().b(z);
    }

    public k c() {
        return a.a.a.g.l.b.i().c();
    }

    public HashSet<String> c(a.a.a.g.a aVar) {
        return a.a.a.g.l.a.i().d(aVar);
    }

    public void c(int i) {
        a.a.a.g.l.a.i().b(Math.max(i, 29));
    }

    public long d() {
        return a.a.a.g.l.b.i().e();
    }

    public void d(int i) {
        if (i >= 0) {
            a.a.a.g.l.a.i().c(i);
        }
    }

    public void e(int i) {
        if (i >= 0) {
            a.a.a.g.l.b.i().a(i);
        }
    }

    public boolean e() {
        return a.a.a.g.l.a.i().b();
    }

    public void f() {
        if (this.f286a) {
            a.a.a.g.l.a.i().f();
        }
        if (this.f287b) {
            a.a.a.g.l.b.i().h();
        }
        this.f288c = false;
    }
}
