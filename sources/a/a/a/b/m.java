package a.a.a.b;

import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.location.Jni;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static String l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.a.a.g.k f48a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a.a.a.g.a f49b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashSet<String> f50c = null;
    public boolean d = true;
    public boolean e = true;
    public boolean f = false;
    public final Handler g = new b();
    public String h = null;
    public String i = null;
    public boolean j = false;
    public long k = 0;

    public static class a extends a.a.a.i.g {
        public long i;
        public int j;

        public a() {
            this.d = new HashMap();
        }

        @Override // a.a.a.i.g
        public void a() {
            StringBuffer stringBuffer = new StringBuffer(256);
            stringBuffer.append("os=A");
            stringBuffer.append(Build.VERSION.SDK_INT);
            stringBuffer.append("&prod=");
            stringBuffer.append(a.a.a.i.b.f);
            stringBuffer.append("&resid=");
            stringBuffer.append("12");
            String str = a.a.a.i.b.j;
            if (str == null) {
                str = "";
            }
            stringBuffer.append("&mapver=");
            stringBuffer.append(str);
            stringBuffer.append(a.a.a.i.i.d(com.baidu.location.f.c()));
            stringBuffer.append("&cu=");
            stringBuffer.append(a.a.a.i.b.e().b());
            stringBuffer.append("&error=");
            stringBuffer.append(this.j);
            if (this.i > 0) {
                stringBuffer.append("&tm=");
                stringBuffer.append(this.i);
            }
            this.d.put("info", Jni.f(stringBuffer.toString()));
            this.d.put("qt", "monitor");
        }

        @Override // a.a.a.i.g
        public void a(boolean z) {
            Map<String, Object> map = this.d;
            if (map != null) {
                map.clear();
            }
        }
    }

    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (com.baidu.location.f.f) {
                int i = message.what;
                if (i == 21) {
                    m.this.a(message);
                } else if (i == 62 || i == 63) {
                    m.this.b();
                }
            }
        }
    }

    public class c extends a.a.a.i.g {
        public String i = null;
        public String j = null;
        public long k = 0;
        public long l = 0;

        public c() {
            this.d = new HashMap();
        }

        @Override // a.a.a.i.g
        public void a() {
            if ((a.a.a.i.i.f || a.a.a.i.i.h) && m.this.h != null && m.this.i != null) {
                this.j += String.format(Locale.CHINA, "&ki=%s&sn=%s", m.this.h, m.this.i);
            }
            if (n.b().a()) {
                this.j += "&enc=2";
            }
            String strK = a.a.a.g.f.w().k();
            if (strK != null) {
                this.f = Jni.f(strK);
            }
            String strF = Jni.f(this.j);
            this.j = null;
            if (this.i == null) {
                this.i = y.f();
            }
            this.d.put("bloc", strF);
            String str = this.i;
            if (str != null) {
                this.d.put("up", str);
            }
            this.d.put("trtm", String.format(Locale.CHINA, "%d", Long.valueOf(System.currentTimeMillis())));
        }

        public void a(String str, long j) {
            this.j = str;
            this.l = System.currentTimeMillis();
            this.k = j;
            ExecutorService executorServiceA = w.d().a();
            if (a.a.a.i.i.l()) {
                a(executorServiceA, false, null);
            } else if (executorServiceA != null) {
                a(executorServiceA, a.a.a.i.d.f324b);
            } else {
                a(a.a.a.i.d.f324b);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
        
            r12 = r11.f339c;
         */
        @Override // a.a.a.i.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(boolean r12) {
            /*
                Method dump skipped, instruction units count: 286
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.b.m.c.a(boolean):void");
        }
    }

    public String a() {
        String strD = a.a.a.b.c.h().d();
        String str = a.a.a.g.f.w().p() ? "&cn=32" : String.format(Locale.CHINA, "&cn=%d", Integer.valueOf(a.a.a.g.f.w().f()));
        long jCurrentTimeMillis = System.currentTimeMillis() - this.k;
        if (Build.VERSION.SDK_INT >= 18 && jCurrentTimeMillis > 60000) {
            this.k = System.currentTimeMillis();
            String strB = a.a.a.i.i.b();
            if (!TextUtils.isEmpty(strB)) {
                str = str + "&qcip6c=" + strB;
            }
        }
        if (this.d) {
            this.d = false;
        } else if (!this.f) {
            String strD2 = y.d();
            if (strD2 != null) {
                str = str + strD2;
            }
            this.f = true;
        }
        return str + strD;
    }

    public String a(String str) {
        a.a.a.g.k kVar;
        String strD;
        if (this.h == null) {
            this.h = a.a.a.a.a.b(com.baidu.location.f.c());
        }
        if (this.i == null) {
            this.i = a.a.a.a.a.c(com.baidu.location.f.c());
        }
        a.a.a.g.a aVar = this.f49b;
        if (aVar == null || !aVar.a()) {
            this.f49b = a.a.a.g.f.w().a();
        }
        a.a.a.g.k kVar2 = this.f48a;
        if (kVar2 == null || !kVar2.b()) {
            this.f48a = a.a.a.g.f.w().j();
        }
        Location locationE = a.a.a.g.d.n().j() ? a.a.a.g.d.n().e() : null;
        a.a.a.g.a aVar2 = this.f49b;
        if ((aVar2 == null || aVar2.c() || this.f49b.b()) && (((kVar = this.f48a) == null || kVar.c() == 0) && locationE == null)) {
            return null;
        }
        String strA = a();
        if (l.f().a() == -2) {
            strA = strA + "&imo=1";
        }
        int iC = a.a.a.i.i.c(com.baidu.location.f.c());
        if (iC >= 0) {
            strA = strA + "&lmd=" + iC;
            if (Build.VERSION.SDK_INT >= 28 && !this.j) {
                this.j = true;
                try {
                    if (com.baidu.location.f.c().getPackageManager().hasSystemFeature("android.hardware.wifi.rtt")) {
                        strA = strA + "&rtt=1";
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        a.a.a.g.k kVar3 = this.f48a;
        if ((kVar3 == null || kVar3.c() == 0) && (strD = a.a.a.g.f.w().d()) != null) {
            strA = strD + strA;
        }
        if (a.a.a.g.f.w().o()) {
            strA = strA + "&wf_freq=1";
        }
        String str2 = strA;
        if (!this.e) {
            return a.a.a.i.i.a(this.f49b, this.f48a, locationE, str2, 0);
        }
        this.e = false;
        return a.a.a.i.i.a(this.f49b, this.f48a, locationE, str2, 0, true);
    }

    public abstract void a(Message message);

    public abstract void b();
}
