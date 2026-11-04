package a.a.a.b;

import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o extends m {
    public static o Z = null;
    public static boolean a0 = false;
    public double F;
    public double G;
    public m.c n;
    public boolean m = true;
    public String o = null;
    public com.baidu.location.c p = null;
    public com.baidu.location.c q = null;
    public Location r = null;
    public a.a.a.g.k s = null;
    public a.a.a.g.a t = null;
    public HashSet<String> u = null;
    public a.a.a.g.a v = null;
    public boolean w = true;
    public volatile boolean x = false;
    public boolean y = false;
    public long z = 0;
    public long A = 0;
    public com.baidu.location.a B = null;
    public String C = null;
    public List<com.baidu.location.j> D = null;
    public com.baidu.location.k E = null;
    public boolean H = false;
    public long I = 0;
    public b J = null;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public final Handler N = new m.b();
    public boolean O = false;
    public boolean P = false;
    public c Q = null;
    public boolean R = false;
    public int S = 0;
    public long T = 0;
    public boolean U = false;
    public boolean V = false;
    public long W = 0;
    public com.baidu.location.a X = null;
    public boolean Y = true;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.d((Message) null);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public /* synthetic */ b(o oVar, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o.this.K) {
                o.this.K = false;
                if (o.this.L || a.a.a.g.d.n().j()) {
                    return;
                }
                o.this.a(false, false);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public /* synthetic */ c(o oVar, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o.this.R) {
                o.this.R = false;
            }
            if (o.this.y) {
                o.this.y = false;
                o.this.g(null);
            }
        }
    }

    public o() {
        this.n = null;
        this.n = new m.c();
        new m.a();
    }

    public static synchronized o q() {
        if (Z == null) {
            Z = new o();
        }
        return Z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    public com.baidu.location.a a(com.baidu.location.c cVar) {
        com.baidu.location.a aVarA;
        if (a.a.a.i.i.d.equals("all") || a.a.a.i.i.f || a.a.a.i.i.h) {
            float[] fArr = new float[2];
            Location.distanceBetween(this.G, this.F, cVar.q(), cVar.t(), fArr);
            if (fArr[0] >= 100.0d) {
                if (this.B == null) {
                    if (System.currentTimeMillis() - this.W < 3000) {
                        aVarA = this.X;
                    } else {
                        aVarA = null;
                    }
                } else if (fArr[0] < 1000.0d) {
                    com.baidu.location.a.C0056a c0056a = new com.baidu.location.a.C0056a();
                    c0056a.d(this.B.f1349a);
                    c0056a.e(this.B.f1350b);
                    c0056a.g(this.B.f1351c);
                    c0056a.b(this.B.d);
                    c0056a.c(this.B.e);
                    c0056a.f(this.B.f);
                    c0056a.a(this.B.j);
                    c0056a.j(this.B.k);
                    aVarA = c0056a.a();
                } else {
                    aVarA = null;
                }
                this.C = null;
                this.D = null;
                this.E = null;
                this.H = true;
                this.N.post(new a());
                return aVarA;
            }
            com.baidu.location.a aVar = this.B;
            if (aVar != null) {
                return aVar;
            }
        }
        return null;
    }

    @Override // a.a.a.b.m
    public void a(Message message) {
        b bVar = this.J;
        if (bVar != null && this.K) {
            this.K = false;
            this.N.removeCallbacks(bVar);
        }
        com.baidu.location.c cVar = (com.baidu.location.c) message.obj;
        int i = message.arg1;
        if (cVar != null && cVar.r() == 161) {
            b(cVar.E());
            e(cVar);
            if (i == 1) {
                f.c().a(cVar, "gcj02", null);
            }
        }
        if (cVar != null && cVar.r() == 167 && this.P) {
            cVar.h(62);
        }
        if (!this.U && cVar != null && cVar.r() == 161) {
            String strG = cVar.g();
            if (!TextUtils.isEmpty(strG)) {
                r.a().b("mapcity", strG);
                d.i().c(strG);
                this.U = true;
            }
        }
        c(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public void a(boolean z, boolean z2) {
        com.baidu.location.c cVarB;
        if (a.a.a.f.d.r().j() && a.a.a.f.d.r().i()) {
            cVarB = a.a.a.f.d.r().a(a.a.a.g.f.w().a(), a.a.a.g.f.w().j(), null, a.a.a.f.d.c.IS_NOT_MIX_MODE, a.a.a.f.d.b.NEED_TO_LOG);
            if ((cVarB == null || cVarB.r() == 67) && z && a.a.a.f.a.e().k) {
                cVarB = a.a.a.f.a.e().b(false);
            }
        } else if (z && a.a.a.f.a.e().k) {
            cVarB = a.a.a.f.a.e().b(false);
        } else {
            cVarB = null;
        }
        if (cVarB == null || cVarB.r() != 66) {
            return;
        }
        boolean z3 = true;
        if (a.a.a.i.i.d.equals("all") && cVarB.b() == null) {
            z3 = false;
        }
        if (a.a.a.i.i.f && cVarB.s() == null) {
            z3 = false;
        }
        if (((a.a.a.i.i.h && cVarB.x() == null) ? false : z3) || z2) {
            a.a.a.b.c.h().c(cVarB);
        }
    }

    public final boolean a(a.a.a.g.a aVar) {
        if (aVar == null) {
            return false;
        }
        a.a.a.g.a aVar2 = this.v;
        if (aVar2 == null) {
            return true;
        }
        return !aVar.a(aVar2);
    }

    public final boolean a(a.a.a.g.a aVar, a.a.a.g.a aVar2) {
        if (aVar2 == aVar) {
            return false;
        }
        if (aVar2 == null || aVar == null) {
            return true;
        }
        return true ^ aVar.a(aVar2);
    }

    public final boolean a(a.a.a.g.a aVar, HashSet<String> hashSet) {
        a.a.a.g.a aVarA = a.a.a.g.f.w().a();
        this.f49b = aVarA;
        boolean zA = a(aVar, aVarA);
        if (a.a.a.i.i.y0 == 0) {
            return zA;
        }
        boolean z = zA || a.a.a.g.f.w().a(aVar, this.f49b);
        HashSet<String> hashSetC = a.a.a.g.f.w().c(this.f49b);
        this.f50c = hashSetC;
        return z || a(hashSet, hashSetC);
    }

    public final boolean a(a.a.a.g.k kVar) {
        a.a.a.g.k kVarJ = a.a.a.g.f.w().j();
        this.f48a = kVarJ;
        if (kVar == kVarJ) {
            return false;
        }
        if (kVarJ == null || kVar == null) {
            return true;
        }
        return !a.a.a.g.f.w().a(this.f48a, kVar, a.a.a.i.i.s0);
    }

    public final boolean a(HashSet<String> hashSet, HashSet<String> hashSet2) {
        if ((hashSet == null || hashSet.isEmpty()) && (hashSet2 == null || hashSet2.isEmpty())) {
            return false;
        }
        if (hashSet == null || hashSet.isEmpty() || hashSet2 == null || hashSet2.isEmpty()) {
            return true;
        }
        int size = hashSet.size();
        Iterator<String> it = hashSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (hashSet2.contains(it.next())) {
                i++;
            }
        }
        return ((float) i) < ((float) size) * a.a.a.i.i.z0;
    }

    @Override // a.a.a.b.m
    public void b() {
        com.baidu.location.c cVar;
        b bVar = this.J;
        if (bVar != null && this.K) {
            this.K = false;
            this.N.removeCallbacks(bVar);
        }
        if (a.a.a.g.d.n().j()) {
            com.baidu.location.c cVar2 = new com.baidu.location.c(a.a.a.g.d.n().d());
            Location locationE = a.a.a.g.d.n().e();
            if (locationE != null && "bd_beidou".equals(locationE.getProvider())) {
                cVar2.g("bd_beidou");
            }
            if (locationE != null) {
                cVar2.a(locationE.getExtras());
            }
            if (a.a.a.i.i.d.equals("all") || a.a.a.i.i.f || a.a.a.i.i.h) {
                float[] fArr = new float[2];
                Location.distanceBetween(this.G, this.F, cVar2.q(), cVar2.t(), fArr);
                if (fArr[0] < 100.0f) {
                    com.baidu.location.a aVar = this.B;
                    if (aVar != null) {
                        cVar2.a(aVar);
                    }
                    String str = this.C;
                    if (str != null) {
                        cVar2.j(str);
                    }
                    List<com.baidu.location.j> list = this.D;
                    if (list != null) {
                        cVar2.a(list);
                    }
                    com.baidu.location.k kVar = this.E;
                    if (kVar != null) {
                        cVar2.a(kVar);
                    }
                }
            }
            a.a.a.b.c.h().c(cVar2);
        } else {
            if (this.L) {
                d();
                return;
            }
            if (a.a.a.f.d.r().j() && a.a.a.f.d.r().n()) {
                cVar = a.a.a.f.d.r().a(a.a.a.g.f.w().a(), a.a.a.g.f.w().j(), null, a.a.a.f.d.c.IS_NOT_MIX_MODE, a.a.a.f.d.b.NEED_TO_LOG);
                if (cVar != null && cVar.r() == 66) {
                    a.a.a.b.c.h().c(cVar);
                }
            } else {
                cVar = null;
            }
            if (cVar == null || cVar.r() == 67) {
                if (this.m || this.p == null) {
                    if (a.a.a.f.a.e().k) {
                        cVar = a.a.a.f.a.e().b(false);
                    } else if (cVar == null) {
                        cVar = new com.baidu.location.c();
                        cVar.h(67);
                    }
                    if (cVar != null) {
                        a.a.a.b.c.h().c(cVar);
                        if (cVar.r() == 67 && !this.P) {
                            g.b().a(67, 3, "Offline location failed, please check the net (wifi/cell)!");
                        }
                        boolean z = true;
                        if (a.a.a.i.i.d.equals("all") && cVar.b() == null) {
                            z = false;
                        }
                        if (a.a.a.i.i.f && cVar.s() == null) {
                            z = false;
                        }
                        if (!((a.a.a.i.i.h && cVar.x() == null) ? false : z)) {
                            cVar.h(67);
                        }
                    }
                } else {
                    a.a.a.b.c.h().c(this.p);
                }
            }
            this.q = null;
        }
        d();
    }

    public final void b(Message message) {
        com.baidu.location.c cVar = new com.baidu.location.c(a.a.a.g.d.n().d());
        Location locationE = a.a.a.g.d.n().e();
        if (locationE != null && "bd_beidou".equals(locationE.getProvider())) {
            cVar.g("bd_beidou");
        }
        if (locationE != null) {
            cVar.a(locationE.getExtras());
        }
        if (a.a.a.i.i.d.equals("all") || a.a.a.i.i.f || a.a.a.i.i.h) {
            float[] fArr = new float[2];
            Location.distanceBetween(this.G, this.F, cVar.q(), cVar.t(), fArr);
            if (fArr[0] < 100.0f) {
                com.baidu.location.a aVar = this.B;
                if (aVar != null) {
                    cVar.a(aVar);
                }
                String str = this.C;
                if (str != null) {
                    cVar.j(str);
                }
                List<com.baidu.location.j> list = this.D;
                if (list != null) {
                    cVar.a(list);
                }
                com.baidu.location.k kVar = this.E;
                if (kVar != null) {
                    cVar.a(kVar);
                }
            } else {
                this.H = true;
                d((Message) null);
            }
        }
        this.p = cVar;
        this.q = null;
        b(cVar);
    }

    public final void b(com.baidu.location.c cVar) {
        if (a.a.a.i.i.k || cVar.u() <= 0) {
            a.a.a.b.c.h().c(cVar);
        } else {
            a.a.a.b.c.h().a(cVar);
        }
    }

    public final void b(String str) {
        if (str != null) {
            "subway".equals(str.toLowerCase());
        }
    }

    public void c() {
        this.p = null;
    }

    public final void c(Message message) {
        if (a.a.a.g.d.n().j()) {
            b(message);
            t.e().d();
        } else {
            d(message);
            t.e().c();
        }
    }

    public void c(com.baidu.location.c cVar) {
        g gVarB;
        int i;
        String str;
        String strL;
        int iC;
        com.baidu.location.c cVar2;
        com.baidu.location.c cVar3 = new com.baidu.location.c(cVar);
        if (cVar.G()) {
            com.baidu.location.a aVarC = cVar.c();
            this.B = aVarC;
            if (aVarC != null && aVarC.e != null) {
                System.currentTimeMillis();
            }
            this.F = cVar.t();
            this.G = cVar.q();
        }
        if (cVar.s() != null) {
            this.C = cVar.s();
            this.F = cVar.t();
            this.G = cVar.q();
        }
        if (cVar.x() != null) {
            this.D = cVar.x();
            this.F = cVar.t();
            this.G = cVar.q();
        }
        if (cVar.y() != null) {
            this.E = cVar.y();
            this.F = cVar.t();
            this.G = cVar.q();
        }
        boolean z = false;
        if (a.a.a.g.d.n().j()) {
            com.baidu.location.c cVar4 = new com.baidu.location.c(a.a.a.g.d.n().d());
            Location locationE = a.a.a.g.d.n().e();
            if (locationE != null && "bd_beidou".equals(locationE.getProvider())) {
                cVar4.g("bd_beidou");
            }
            if (locationE != null) {
                cVar4.a(locationE.getExtras());
            }
            if (a.a.a.i.i.d.equals("all") || a.a.a.i.i.f || a.a.a.i.i.h) {
                float[] fArr = new float[2];
                Location.distanceBetween(this.G, this.F, cVar4.q(), cVar4.t(), fArr);
                if (fArr[0] < 100.0f) {
                    com.baidu.location.a aVar = this.B;
                    if (aVar != null) {
                        cVar4.a(aVar);
                    }
                    String str2 = this.C;
                    if (str2 != null) {
                        cVar4.j(str2);
                    }
                    List<com.baidu.location.j> list = this.D;
                    if (list != null) {
                        cVar4.a(list);
                    }
                    com.baidu.location.k kVar = this.E;
                    if (kVar != null) {
                        cVar4.a(kVar);
                    }
                }
            }
            b(cVar4);
            d();
            return;
        }
        if (this.L) {
            float[] fArr2 = new float[2];
            com.baidu.location.c cVar5 = this.p;
            if (cVar5 != null) {
                Location.distanceBetween(cVar5.q(), this.p.t(), cVar.q(), cVar.t(), fArr2);
            }
            if (fArr2[0] > 10.0f) {
                this.p = cVar;
                if (!this.M) {
                    this.M = false;
                    a.a.a.b.c.h().c(cVar);
                }
            } else if (cVar.F() > -1) {
                this.p = cVar;
                a.a.a.b.c.h().c(cVar);
            }
            d();
            return;
        }
        if (cVar.r() == 167) {
            g.b().a(167, 8, "NetWork location failed because baidu location service can not caculate the location!");
        } else if (cVar.r() == 161) {
            if (Build.VERSION.SDK_INT >= 19 && ((iC = a.a.a.i.i.c(com.baidu.location.f.c())) == 0 || iC == 2)) {
                g.b().a(161, 1, "NetWork location successful, open gps will be better!");
            } else if (cVar.z() >= 100.0f && cVar.v() != null && cVar.v().equals("cl") && (strL = a.a.a.g.f.w().l()) != null && !strL.equals("&wifio=1")) {
                g.b().a(161, 2, "NetWork location successful, open wifi will be better!");
            }
        } else {
            int i2 = 160;
            if (cVar.r() == 160) {
                gVarB = g.b();
                i = 10;
                str = "Coarse location successful, open Accurately locate permission will be better!";
            } else if (a.a.a.i.i.k()) {
                i2 = 62;
                if (cVar.r() == 62) {
                    gVarB = g.b();
                    i = 11;
                    str = "Coarse location failed because we can not get any loc result";
                }
            }
            gVarB.a(i2, i, str);
        }
        String strA = null;
        this.q = null;
        if (cVar.r() == 161 && "cl".equals(cVar.v()) && (cVar2 = this.p) != null && cVar2.r() == 161 && "wf".equals(this.p.v()) && System.currentTimeMillis() - this.A < 30000) {
            this.q = cVar;
            z = true;
        }
        a.a.a.b.c cVarH = a.a.a.b.c.h();
        if (z) {
            cVarH.c(this.p);
        } else {
            cVarH.c(cVar);
            this.A = System.currentTimeMillis();
        }
        if (!a.a.a.i.i.a(cVar)) {
            this.p = null;
        } else if (!z) {
            this.p = cVar;
        }
        int iA = a.a.a.i.i.a(m.l, "ssid\":\"", "\"");
        if (iA != Integer.MIN_VALUE && this.s != null) {
            strA = a.a.a.g.f.w().a(iA, this.s);
        }
        this.o = strA;
        if (a.a.a.f.d.r().j() && cVar.r() == 161 && "cl".equals(cVar.v()) && a(this.t)) {
            a.a.a.f.d.r().a(this.t, null, cVar3, a.a.a.f.d.c.IS_NOT_MIX_MODE, a.a.a.f.d.b.NO_NEED_TO_LOG);
            this.v = this.t;
        }
        if (a.a.a.f.d.r().j() && cVar.r() == 161 && "wf".equals(cVar.v())) {
            a.a.a.f.d.r().a(null, this.s, cVar3, a.a.a.f.d.c.IS_NOT_MIX_MODE, a.a.a.f.d.b.NO_NEED_TO_LOG);
        }
        if (this.t != null && this.s != null) {
            a.a.a.f.a.e().a(m.l, this.t, this.s, cVar3);
        }
        if (a.a.a.g.f.w().p()) {
            a.a.a.f.d.r().p();
            a.a.a.f.d.r().o();
        }
        d();
    }

    public final void d() {
        this.x = false;
        this.L = false;
        this.M = false;
        this.H = false;
        p();
        if (this.Y) {
            this.Y = false;
        }
    }

    public final void d(Message message) {
        this.S = 0;
        if (!this.w) {
            h(message);
            SystemClock.uptimeMillis();
            return;
        }
        this.S = 1;
        SystemClock.uptimeMillis();
        if (a.a.a.g.f.w().a(a.a.a.i.i.a0)) {
            h(message);
        } else {
            g(message);
        }
    }

    public void d(com.baidu.location.c cVar) {
        this.p = new com.baidu.location.c(cVar);
    }

    public final void e(Message message) {
        if (a.a.a.i.i.p0 && !a.a.a.i.i.g(com.baidu.location.f.c())) {
            com.baidu.location.c cVar = new com.baidu.location.c();
            cVar.h(62);
            a.a.a.b.c.h().c(cVar);
            return;
        }
        if (a.a.a.i.i.l()) {
            Log.d("baidu_location_service", "isInforbiddenTime on request location ...");
        }
        if (message.getData().getBoolean("isWaitingLocTag", false)) {
            a0 = true;
        }
        if (a.a.a.d.i.m().g()) {
            return;
        }
        a.a.a.g.c.e().b();
        int iB = a.a.a.b.c.h().b(message);
        if (iB == 1) {
            c(message);
            return;
        }
        if (iB == 2) {
            if (a.a.a.g.d.n().j()) {
                b(message);
            }
        } else {
            if (iB != 3 && iB != 4) {
                throw new IllegalArgumentException(String.format("this type %d is illegal", Integer.valueOf(iB)));
            }
            d(message);
        }
    }

    public final void e(com.baidu.location.c cVar) {
        this.V = cVar != null && cVar.I();
    }

    public boolean e() {
        return this.m;
    }

    public void f(Message message) {
        if (this.O) {
            e(message);
        }
    }

    public final String[] f() {
        boolean z;
        g gVarB;
        int i;
        String[] strArr = {"", "Location failed beacuse we can not get any loc information!"};
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("&apl=");
        int iB = a.a.a.i.i.b(com.baidu.location.f.c());
        String str = "Location failed beacuse we can not get any loc information in airplane mode, you can turn it off and try again!!";
        if (iB == 1) {
            strArr[1] = "Location failed beacuse we can not get any loc information in airplane mode, you can turn it off and try again!!";
        }
        stringBuffer.append(iB);
        String strE = a.a.a.i.i.e(com.baidu.location.f.c());
        if (strE.contains("per=0|0|")) {
            strArr[1] = "Location failed beacuse we can not get any loc information without any location permission!";
        }
        stringBuffer.append(strE);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            stringBuffer.append("&loc=");
            int iC = a.a.a.i.i.c(com.baidu.location.f.c());
            if (iC == 0) {
                strArr[1] = "Location failed beacuse we can not get any loc information with the phone loc mode is off, you can turn it on and try again!";
                z = true;
            } else {
                z = false;
            }
            stringBuffer.append(iC);
        } else {
            z = false;
        }
        if (i2 >= 19) {
            stringBuffer.append("&lmd=");
            int iC2 = a.a.a.i.i.c(com.baidu.location.f.c());
            if (iC2 >= 0) {
                stringBuffer.append(iC2);
            }
        }
        String strH = a.a.a.g.f.w().h();
        String strL = a.a.a.g.f.w().l();
        stringBuffer.append(strL);
        stringBuffer.append(strH);
        stringBuffer.append(a.a.a.i.i.d(com.baidu.location.f.c()));
        if (iB != 1) {
            if (strE.contains("per=0|0|")) {
                g.b().a(62, 4, "Location failed beacuse we can not get any loc information without any location permission!");
            } else if (z) {
                g.b().a(62, 5, "Location failed beacuse we can not get any loc information with the phone loc mode is off, you can turn it on and try again!");
            } else if (strH != null && strL != null && strH.equals("&sim=1") && !strL.equals("&wifio=1")) {
                gVarB = g.b();
                i = 6;
                str = "Location failed beacuse we can not get any loc information , you can insert a sim card or open wifi and try again!";
            } else if (!a.a.a.i.i.k()) {
                g.b().a(62, 9, "Location failed beacuse we can not get any loc information!");
            }
            strArr[0] = stringBuffer.toString();
            return strArr;
        }
        gVarB = g.b();
        i = 7;
        gVarB.a(62, i, str);
        strArr[0] = stringBuffer.toString();
        return strArr;
    }

    public final void g() {
        try {
            String str = null;
            String strA = r.a().a("FirstLocAddr", (String) null);
            if (strA != null) {
                String[] strArrSplit = new String(Base64.decode(strA.getBytes(), 0)).split("_");
                if (strArrSplit.length == 2) {
                    this.W = Long.parseLong(strArrSplit[0]);
                    str = strArrSplit[1];
                }
                if (str != null) {
                    String[] strArrSplit2 = str.split(";");
                    if (strArrSplit2.length == 10) {
                        com.baidu.location.a.C0056a c0056a = new com.baidu.location.a.C0056a();
                        c0056a.d(strArrSplit2[0]);
                        c0056a.e(strArrSplit2[1]);
                        c0056a.g(strArrSplit2[2]);
                        c0056a.b(strArrSplit2[3]);
                        c0056a.c(strArrSplit2[4]);
                        c0056a.f(strArrSplit2[5]);
                        c0056a.h(strArrSplit2[6]);
                        c0056a.i(strArrSplit2[7]);
                        c0056a.a(strArrSplit2[8]);
                        c0056a.j(strArrSplit2[9]);
                        this.X = c0056a.a();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    public final void g(Message message) {
        Location locationA;
        boolean zA;
        String str;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.z;
        if (!this.x || jCurrentTimeMillis2 > 12000) {
            if (System.currentTimeMillis() - this.z > 0 && System.currentTimeMillis() - this.z < 1000) {
                if (this.p != null) {
                    a.a.a.b.c.h().c(this.p);
                }
                d();
                return;
            }
            this.x = true;
            this.m = a(this.t, this.u);
            boolean zA2 = a(this.s);
            boolean zK = a.a.a.i.i.k();
            a aVar = null;
            if (zK) {
                locationA = a.a.a.g.c.e().a();
                zA = a.a.a.g.c.e().a(this.r, locationA);
            } else {
                locationA = null;
                zA = false;
            }
            if (!zA2 && !this.m && this.p != null && !this.H && !a.a.a.g.f.w().o() && !zA) {
                if (this.q != null && System.currentTimeMillis() - this.A > 30000) {
                    this.p = this.q;
                    this.q = null;
                }
                if (t.e().b()) {
                    this.p.a(t.e().a());
                }
                if (this.p.r() == 62) {
                    jCurrentTimeMillis = System.currentTimeMillis() - this.T;
                    if (jCurrentTimeMillis <= 0) {
                        jCurrentTimeMillis = 0;
                    }
                } else {
                    jCurrentTimeMillis = 0;
                }
                if (this.p.r() == 61 || this.p.r() == 161 || this.p.r() == 160 || (this.p.r() == 62 && jCurrentTimeMillis < 15000)) {
                    a.a.a.b.c.h().c(this.p);
                    d();
                    return;
                }
            }
            this.z = System.currentTimeMillis();
            String strA = a((String) null);
            this.P = false;
            if (strA == null) {
                this.P = true;
                this.T = System.currentTimeMillis();
                String[] strArrF = new String[2];
                try {
                    strArrF = f();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                if (jCurrentTimeMillis3 - this.I > 60000) {
                    this.I = jCurrentTimeMillis3;
                }
                String strD = a.a.a.g.f.w().d();
                if (strD != null) {
                    str = strD + a() + strArrF[0];
                } else {
                    str = "" + a() + strArrF[0];
                }
                if (this.f49b != null && a.a.a.g.f.w().a(this.f49b) != null) {
                    str = a.a.a.g.f.w().a(this.f49b) + str;
                }
                String strA2 = a.a.a.i.b.e().a(true);
                if (strA2 != null) {
                    str = str + strA2;
                }
            } else {
                str = strA + a.a.a.i.i.e(com.baidu.location.f.c());
            }
            if (zK) {
                String strA3 = a.a.a.g.c.e().a(locationA);
                if (strA3 != null) {
                    str = str + strA3 + "&per_c=1";
                }
                this.r = locationA;
            }
            if (this.o != null) {
                str = str + this.o;
                this.o = null;
            }
            String str2 = str + f.c().a();
            long jC = this.f48a != null ? a.a.a.g.f.w().c(this.f48a) : 0L;
            if (str2.length() > a.a.a.i.i.F0) {
                String[] strArrSplit = str2.split("&cl_list=");
                if (strArrSplit.length == 2) {
                    String[] strArrSplit2 = strArrSplit[1].split("&", 2);
                    if (strArrSplit2.length == 2) {
                        str2 = strArrSplit[0] + "&cl_list=null&" + strArrSplit2[1];
                    } else {
                        str2 = strArrSplit[0] + "&cl_list=null";
                    }
                }
            }
            this.n.a(str2, jC);
            this.t = this.f49b;
            this.u = this.f50c;
            this.s = this.f48a;
            if (!a.a.a.g.d.n().j()) {
                l();
            }
            if (a.a.a.f.d.r().k()) {
                if (this.J == null) {
                    this.J = new b(this, aVar);
                }
                this.N.postDelayed(this.J, a.a.a.f.d.r().a(a.a.a.g.b.a(a.a.a.g.f.w().f())));
                this.K = true;
            }
            if (this.w) {
                this.w = false;
                if (a.a.a.g.f.w().p() && message != null && a.a.a.b.c.h().c(message) < 1000 && a.a.a.f.d.r().j()) {
                    a.a.a.f.d.r().p();
                }
                a.a.a.c.b.g().e();
            }
            int i = this.S;
            if (i > 0) {
                if (i == 2) {
                    a.a.a.g.f.w().s();
                }
                this.S = 0;
            }
        }
    }

    public String h() {
        return this.C;
    }

    public final void h(Message message) {
        c cVar;
        if (!a.a.a.g.f.w().s()) {
            g(message);
            return;
        }
        this.y = true;
        if (this.Q == null) {
            this.Q = new c(this, null);
        }
        if (this.R && (cVar = this.Q) != null) {
            this.N.removeCallbacks(cVar);
        }
        this.N.postDelayed(this.Q, 3500L);
        this.R = true;
    }

    public List<com.baidu.location.j> i() {
        return this.D;
    }

    public com.baidu.location.k j() {
        return this.E;
    }

    public boolean k() {
        return this.V;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    public final boolean l() {
        boolean z;
        double dRandom = Math.random();
        SystemClock.uptimeMillis();
        a.a.a.g.a aVarA = a.a.a.g.f.w().a();
        a.a.a.g.k kVarJ = a.a.a.g.f.w().j();
        long jA = (kVarJ == null || kVarJ.c() <= 0) ? 0L : a.a.a.g.f.w().a(kVarJ);
        boolean z2 = aVarA != null && aVarA.d() && (kVarJ == null || kVarJ.c() == 0);
        com.baidu.location.c cVar = null;
        if (a.a.a.f.d.r().j() && a.a.a.f.d.r().m() && jA < 60 && (z2 || (0.0d < dRandom && dRandom < a.a.a.f.d.r().f()))) {
            com.baidu.location.c cVarA = a.a.a.f.d.r().a(a.a.a.g.f.w().a(), a.a.a.g.f.w().j(), null, a.a.a.f.d.c.IS_MIX_MODE, a.a.a.f.d.b.NEED_TO_LOG);
            if (cVarA != null) {
                z = (a.a.a.i.i.d.equals("all") && cVarA.b() == null) ? false : true;
                if (a.a.a.i.i.f && cVarA.s() == null) {
                    z = false;
                }
                if (a.a.a.i.i.h && cVarA.x() == null) {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                cVar = cVarA;
            }
        }
        if (cVar != null && cVar.r() == 66 && this.x) {
            com.baidu.location.c cVar2 = new com.baidu.location.c(cVar);
            cVar2.h(161);
            if (this.x) {
                this.L = true;
                a.a.a.b.c.h().c(cVar2);
                this.p = cVar2;
                return true;
            }
        }
        return false;
    }

    public void m() {
        if (!this.y) {
            a.a.a.c.b.g().c();
        } else {
            g(null);
            this.y = false;
        }
    }

    public void n() {
        this.w = true;
        this.x = false;
        this.O = true;
        g();
    }

    public void o() {
        this.x = false;
        this.y = false;
        this.L = false;
        this.M = true;
        c();
        this.O = false;
    }

    public final void p() {
        if (this.p == null || !a.a.a.g.f.w().p()) {
            return;
        }
        z.f().c();
    }
}
