package a.a.a.b;

import android.content.Intent;
import android.location.Location;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.LruCache;
import com.baidu.location.Jni;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static long i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<b> f8a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10c;
    public com.baidu.location.c d;
    public com.baidu.location.c e;
    public Object f;
    public LruCache<String, JSONObject> g;
    public boolean h;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Messenger f12b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.baidu.location.i f13c = new com.baidu.location.i();
        public int d = 0;

        public b(c cVar, Message message) {
            this.f11a = null;
            this.f12b = null;
            this.f12b = message.replyTo;
            this.f11a = message.getData().getString("packName");
            this.f13c.f = message.getData().getString("prodName");
            a.a.a.i.b.e().a(this.f13c.f, this.f11a);
            this.f13c.f1370a = message.getData().getString("coorType");
            this.f13c.f1371b = message.getData().getString("addrType");
            this.f13c.j = message.getData().getBoolean("enableSimulateGps", false);
            a.a.a.i.i.k = a.a.a.i.i.k || this.f13c.j;
            if (!a.a.a.i.i.d.equals("all")) {
                a.a.a.i.i.d = this.f13c.f1371b;
            }
            this.f13c.f1372c = message.getData().getBoolean("openGPS");
            this.f13c.d = message.getData().getInt("scanSpan");
            this.f13c.e = message.getData().getInt("timeOut");
            this.f13c.g = message.getData().getInt("priority");
            this.f13c.h = message.getData().getBoolean("location_change_notify");
            this.f13c.n = message.getData().getBoolean("needDirect", false);
            this.f13c.s = message.getData().getBoolean("isneedaltitude", false);
            this.f13c.t = message.getData().getBoolean("isneednewrgc", false);
            a.a.a.i.i.g = a.a.a.i.i.g || this.f13c.t;
            a.a.a.i.i.f = a.a.a.i.i.f || message.getData().getBoolean("isneedaptag", false);
            a.a.a.i.i.h = a.a.a.i.i.h || message.getData().getBoolean("isneedaptagd", false);
            a.a.a.i.i.O = message.getData().getFloat("autoNotifyLocSensitivity", 0.5f);
            int i = message.getData().getInt("wfnum", a.a.a.i.i.q0);
            float f = message.getData().getFloat("wfsm", a.a.a.i.i.s0);
            int i2 = message.getData().getInt("gnmcon", a.a.a.i.i.u0);
            double d = message.getData().getDouble("gnmcrm", a.a.a.i.i.t0);
            int i3 = message.getData().getInt("iupl", 1);
            a.a.a.i.i.H0 = message.getData().getInt("ct", 10);
            a.a.a.i.i.I0 = message.getData().getInt("suci", 3);
            a.a.a.i.i.K0 = message.getData().getDoubleArray("cgs");
            a.a.a.i.i.L0 = message.getData().getInt("ums", 1);
            a.a.a.i.i.J0 = message.getData().getInt("smn", 40);
            if (i3 <= 0) {
                a.a.a.i.i.G0 = 0;
            } else if (a.a.a.i.i.G0 == -1) {
                a.a.a.i.i.G0 = 1;
            }
            if (message.getData().getInt("opetco", 1) == 0) {
                a.a.a.i.i.M0 = 0;
            }
            if (message.getData().getInt("lpcs", a.a.a.i.i.N0) == 0) {
                a.a.a.i.i.N0 = 0;
            }
            if (i2 == 1) {
                a.a.a.i.i.u0 = 1;
            }
            if (d > a.a.a.i.i.t0) {
                a.a.a.i.i.t0 = d;
            }
            a.a.a.i.i.p0 = a.a.a.i.i.p0 || message.getData().getBoolean("ischeckper", false);
            boolean z = message.getData().getBoolean("isEnableBeidouMode", false);
            if (Build.VERSION.SDK_INT >= 28) {
                a.a.a.i.i.P0 = a.a.a.i.i.P0 || z;
            }
            if (i > a.a.a.i.i.q0) {
                a.a.a.i.i.q0 = i;
            }
            if (f > a.a.a.i.i.s0) {
                a.a.a.i.i.s0 = f;
            }
            int i4 = message.getData().getInt("wifitimeout", Integer.MAX_VALUE);
            if (i4 < a.a.a.i.i.a0) {
                a.a.a.i.i.a0 = i4;
            }
            int i5 = message.getData().getInt("autoNotifyMaxInterval", 0);
            if (i5 >= a.a.a.i.i.T) {
                a.a.a.i.i.T = i5;
            }
            int i6 = message.getData().getInt("autoNotifyMinDistance", 0);
            if (i6 >= a.a.a.i.i.V) {
                a.a.a.i.i.V = i6;
            }
            int i7 = message.getData().getInt("autoNotifyMinTimeInterval", 0);
            if (i7 >= a.a.a.i.i.U) {
                a.a.a.i.i.U = i7;
            }
            com.baidu.location.i iVar = this.f13c;
            if (iVar.n || iVar.s) {
                t.e().b(this.f13c.n);
                t.e().c();
            }
            cVar.f10c = cVar.f10c || this.f13c.s;
            if (message.getData().getInt("hpdts", a.a.a.i.i.v0) == 1) {
                a.a.a.i.i.v0 = 1;
            } else {
                a.a.a.i.i.v0 = 0;
            }
            if (message.getData().getInt("oldts", a.a.a.i.i.w0) == 1) {
                a.a.a.i.i.w0 = 1;
            } else {
                a.a.a.i.i.w0 = 0;
            }
            int i8 = message.getData().getInt("onic", a.a.a.i.i.x0);
            if (i8 == 0) {
                a.a.a.i.i.x0 = i8;
            }
            int i9 = message.getData().getInt("nlcs", a.a.a.i.i.y0);
            if (i9 == 1) {
                a.a.a.i.i.y0 = i9;
            }
            a.a.a.i.i.z0 = message.getData().getFloat("ncsr", a.a.a.i.i.z0);
            a.a.a.i.i.A0 = message.getData().getFloat("cscr", a.a.a.i.i.A0);
            a.a.a.i.i.B0 = message.getData().getInt("cls", a.a.a.i.i.B0);
            int[] intArray = message.getData().getIntArray("ocs");
            a.a.a.i.i.C0 = intArray;
            a.a.a.i.i.D0 = a.a.a.i.i.a(intArray);
            a.a.a.i.i.E0 = message.getData().getInt("topCellNumber");
            a.a.a.i.i.F0 = message.getData().getInt("locStrLength");
            a.a.a.g.f.w().a((WifiInfo) null, message.getData().getString("connectBssid", null));
        }

        public final double a(boolean z, com.baidu.location.c cVar, com.baidu.location.c cVar2) {
            double d;
            double dA;
            double dQ;
            double dT;
            double dQ2;
            double dT2;
            double[] dArrA;
            double[] dArrA2;
            if (!z) {
                if (!TextUtils.equals(cVar2.h(), cVar.h())) {
                    double[] dArrA3 = Jni.a(cVar.t(), cVar.q(), "gcj2wgs");
                    cVar.c(dArrA3[1]);
                    d = dArrA3[0];
                    cVar.d(d);
                    cVar.n(a.a.a.i.i.i());
                    cVar.e("wgs84");
                    dA = a.a.a.i.i.a(cVar2.q(), cVar2.t(), cVar.q(), cVar.t());
                }
                dQ = cVar2.q();
                dT = cVar2.t();
                dQ2 = cVar.q();
                dT2 = cVar.t();
                dA = a.a.a.i.i.a(dQ, dT, dQ2, dT2);
            } else if (TextUtils.equals(cVar2.h(), cVar.h())) {
                if (TextUtils.equals("bd09", cVar2.h())) {
                    double[] dArrA4 = Jni.a(cVar2.t(), cVar2.q(), "bd092gcj");
                    double[] dArrA5 = Jni.a(cVar.t(), cVar.q(), "bd092gcj");
                    dQ = dArrA4[1];
                    dT = dArrA4[0];
                    dQ2 = dArrA5[1];
                    dT2 = dArrA5[0];
                } else {
                    dQ = cVar2.q();
                    dT = cVar2.t();
                    dQ2 = cVar.q();
                    dT2 = cVar.t();
                }
                dA = a.a.a.i.i.a(dQ, dT, dQ2, dT2);
            } else {
                if (TextUtils.equals("wgs84", cVar.h())) {
                    dArrA = new double[]{cVar.t(), cVar.q()};
                } else {
                    if (TextUtils.equals("bd09", cVar.h())) {
                        dArrA2 = Jni.a(cVar.t(), cVar.q(), "bd092gcj");
                    } else {
                        dArrA2 = TextUtils.equals("bd09ll", cVar.h()) ? Jni.a(cVar.t(), cVar.q(), "bd09ll2gcj") : new double[]{cVar.t(), cVar.q()};
                    }
                    dArrA = Jni.a(dArrA2[0], dArrA2[1], "gcj2wgs");
                }
                cVar.c(dArrA[1]);
                d = dArrA[0];
                cVar.d(d);
                cVar.n(a.a.a.i.i.i());
                cVar.e("wgs84");
                dA = a.a.a.i.i.a(cVar2.q(), cVar2.t(), cVar.q(), cVar.t());
            }
            cVar2.b(dA);
            if (cVar != null) {
                cVar2.a(cVar);
            }
            return dA;
        }

        public final int a(double d) {
            if (d >= 0.0d && d <= 10.0d) {
                return 0;
            }
            if (d <= 10.0d || d > 100.0d) {
                return (d <= 100.0d || d > 200.0d) ? 3 : 2;
            }
            return 1;
        }

        public int a(int i, boolean z, com.baidu.location.c cVar) {
            double dA;
            if (i == 100) {
                if (z) {
                    com.baidu.location.c cVarC = c();
                    if (cVarC == null) {
                        return 3;
                    }
                    a(true, cVarC, cVar);
                    return 3;
                }
                com.baidu.location.c cVarD = d();
                if (cVarD == null) {
                    return 3;
                }
                a(false, cVarD, cVar);
                return 3;
            }
            if (i == 200 || i == 300) {
                return 1;
            }
            if (i != 400) {
                return i == 500 ? 1 : 0;
            }
            if (z) {
                com.baidu.location.c cVarC2 = c();
                if (cVarC2 == null) {
                    return -1;
                }
                dA = a(true, cVarC2, cVar);
            } else {
                com.baidu.location.c cVarD2 = d();
                if (cVarD2 == null) {
                    return -1;
                }
                dA = a(false, cVarD2, cVar);
            }
            return a(dA);
        }

        public void a() {
            if (this.f13c.h) {
                a(a.a.a.i.i.f355b ? 54 : 55);
            }
        }

        public final void a(int i) {
            Message messageObtain = Message.obtain((Handler) null, i);
            try {
                Messenger messenger = this.f12b;
                if (messenger != null) {
                    messenger.send(messageObtain);
                }
                this.d = 0;
            } catch (Exception e) {
                if (e instanceof DeadObjectException) {
                    this.d++;
                }
            }
        }

        public final void a(int i, Bundle bundle) {
            Message messageObtain = Message.obtain((Handler) null, i);
            messageObtain.setData(bundle);
            try {
                Messenger messenger = this.f12b;
                if (messenger != null) {
                    messenger.send(messageObtain);
                }
                this.d = 0;
            } catch (Exception e) {
                if (e instanceof DeadObjectException) {
                    this.d++;
                }
                e.printStackTrace();
            }
        }

        public final void a(int i, String str, com.baidu.location.c cVar) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(str, cVar);
            bundle.setClassLoader(com.baidu.location.c.class.getClassLoader());
            Message messageObtain = Message.obtain((Handler) null, i);
            messageObtain.setData(bundle);
            try {
                Messenger messenger = this.f12b;
                if (messenger != null) {
                    messenger.send(messageObtain);
                }
                this.d = 0;
            } catch (Exception e) {
                if (e instanceof DeadObjectException) {
                    this.d++;
                }
            }
        }

        public void a(com.baidu.location.c cVar) {
            a(cVar, 21);
        }

        public void a(com.baidu.location.c cVar, int i) {
            int iA;
            String str;
            com.baidu.location.c cVar2 = new com.baidu.location.c(cVar);
            if (a.a.a.d.i.m().f()) {
                cVar2.a(true);
            }
            if (i == 21) {
                a(27, "locStr", cVar2);
            }
            String str2 = this.f13c.f1370a;
            if (str2 != null && !str2.equals("gcj02")) {
                double dT = cVar2.t();
                double dQ = cVar2.q();
                if (dT != Double.MIN_VALUE && dQ != Double.MIN_VALUE) {
                    if ((cVar2.h() != null && cVar2.h().equals("gcj02")) || cVar2.h() == null) {
                        double[] dArrA = Jni.a(dT, dQ, this.f13c.f1370a);
                        cVar2.d(dArrA[0]);
                        cVar2.c(dArrA[1]);
                        str = this.f13c.f1370a;
                    } else if (cVar2.h() != null && cVar2.h().equals("wgs84") && !this.f13c.f1370a.equals("bd09ll")) {
                        double[] dArrA2 = Jni.a(dT, dQ, "wgs842mc");
                        cVar2.d(dArrA2[0]);
                        cVar2.c(dArrA2[1]);
                        str = "wgs84mc";
                    }
                    cVar2.e(str);
                }
                if (!a.a.a.i.i.k && cVar2.u() > 0) {
                    iA = a(cVar2.u(), true, cVar2);
                    cVar2.j(iA);
                }
            } else if (!a.a.a.i.i.k && cVar2.u() > 0) {
                iA = a(cVar2.u(), false, cVar2);
                cVar2.j(iA);
            }
            a(i, "locStr", cVar2);
        }

        public void b() {
            a(111);
        }

        public final com.baidu.location.c c() {
            com.baidu.location.c cVarG = a.a.a.g.d.n().g();
            if (cVarG == null) {
                return null;
            }
            double[] dArrA = Jni.a(cVarG.t(), cVarG.q(), "gps2gcj");
            double[] dArrA2 = Jni.a(dArrA[0], dArrA[1], this.f13c.f1370a);
            com.baidu.location.c cVar = new com.baidu.location.c();
            cVar.d(dArrA2[0]);
            cVar.c(dArrA2[1]);
            cVar.n(a.a.a.i.i.i());
            cVar.h(61);
            cVar.e(this.f13c.f1370a);
            return cVar;
        }

        public final com.baidu.location.c d() {
            com.baidu.location.c cVarG = a.a.a.g.d.n().g();
            if (cVarG == null) {
                return null;
            }
            double[] dArrA = Jni.a(cVarG.t(), cVarG.q(), "gps2gcj");
            com.baidu.location.c cVar = new com.baidu.location.c();
            cVar.d(dArrA[0]);
            cVar.c(dArrA[1]);
            cVar.n(a.a.a.i.i.i());
            cVar.h(61);
            cVar.e("gcj02");
            return cVar;
        }
    }

    /* JADX INFO: renamed from: a.a.a.b.c$c, reason: collision with other inner class name */
    public static class C0002c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static c f14a = new c();
    }

    public c() {
        this.f8a = null;
        this.f9b = false;
        this.f10c = false;
        this.d = null;
        this.e = null;
        this.f = new Object();
        this.h = false;
        this.f8a = new ArrayList<>();
        this.g = new LruCache<>(3);
        r.a().a("sp_loc_map_end_str", "");
        r.a().a("sp_loc_navi_end_str", "");
        r.a().a("sp_loc_last_navi_end_str", "");
        String strA = r.a().a("sp_bluetooth_info", "");
        if (strA == null || "".equals(strA)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(strA);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                this.g.put(jSONObject.getString("mac"), jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static c h() {
        return C0002c.f14a;
    }

    public final b a(Messenger messenger) {
        if (this.f8a == null) {
            return null;
        }
        try {
            synchronized (this.f) {
                for (b bVar : this.f8a) {
                    if (bVar.f12b.equals(messenger)) {
                        return bVar;
                    }
                }
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a() throws Throwable {
        boolean z = false;
        try {
            try {
                synchronized (this.f) {
                    try {
                        Iterator<b> it = this.f8a.iterator();
                        z = false;
                        while (it.hasNext()) {
                            com.baidu.location.i iVar = it.next().f13c;
                            if (iVar.f1372c) {
                                z = true;
                            }
                            if (iVar.h) {
                                z = true;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                throw th;
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                a.a.a.i.i.f354a = z;
                if (this.f9b != z || (!a.a.a.g.d.n().h() && this.f9b)) {
                    this.f9b = z;
                    a.a.a.g.d.n().a(this.f9b);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void a(b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.f) {
            if (a(bVar.f12b) != null) {
                bVar.a(14);
            } else {
                this.f8a.add(bVar);
                bVar.a(13);
            }
        }
    }

    public void a(Bundle bundle, int i2) {
        synchronized (this.f) {
            Iterator<b> it = this.f8a.iterator();
            while (it.hasNext()) {
                try {
                    b next = it.next();
                    next.a(i2, bundle);
                    if (next.d > 4) {
                        it.remove();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public void a(com.baidu.location.c cVar) {
        com.baidu.location.a aVarA = o.q().a(cVar);
        String strH = o.q().h();
        List<com.baidu.location.j> listI = o.q().i();
        com.baidu.location.k kVarJ = o.q().j();
        if (aVarA != null) {
            cVar.a(aVarA);
        }
        if (strH != null) {
            cVar.j(strH);
        }
        if (listI != null) {
            cVar.a(listI);
        }
        if (kVarJ != null) {
            cVar.a(kVarJ);
        }
        if (a.a.a.d.i.m().g() && a.a.a.d.i.m().d() != null) {
            cVar.f(a.a.a.d.i.m().d());
            cVar.a(true);
            if (a.a.a.d.i.m().c() != null) {
                cVar.c(a.a.a.d.i.m().c());
            }
        }
        c(cVar);
        o.q().d(cVar);
    }

    public final void a(String str) {
        Intent intent = new Intent("com.baidu.location.flp.log");
        intent.setPackage("com.baidu.baidulocationdemo");
        intent.putExtra("data", str);
        intent.putExtra("pack", a.a.a.i.b.f);
        intent.putExtra("tag", "state");
        com.baidu.location.f.c().sendBroadcast(intent);
    }

    public void a(boolean z) {
    }

    public boolean a(Message message) {
        b bVarA = a(message.replyTo);
        boolean z = false;
        if (bVarA == null) {
            return false;
        }
        com.baidu.location.i iVar = bVarA.f13c;
        int i2 = iVar.d;
        iVar.d = message.getData().getInt("scanSpan", bVarA.f13c.d);
        if (bVarA.f13c.d < 1000) {
            t.e().d();
        }
        com.baidu.location.i iVar2 = bVarA.f13c;
        if (iVar2.d > 999 && i2 < 1000) {
            if (iVar2.n || iVar2.s) {
                t.e().b(bVarA.f13c.n);
                t.e().c();
            }
            this.f10c = this.f10c || bVarA.f13c.s;
            z = true;
        }
        bVarA.f13c.f1372c = message.getData().getBoolean("openGPS", bVarA.f13c.f1372c);
        String string = message.getData().getString("coorType");
        com.baidu.location.i iVar3 = bVarA.f13c;
        if (string == null || string.equals("")) {
            string = bVarA.f13c.f1370a;
        }
        iVar3.f1370a = string;
        String string2 = message.getData().getString("addrType");
        com.baidu.location.i iVar4 = bVarA.f13c;
        if (string2 == null || string2.equals("")) {
            string2 = bVarA.f13c.f1371b;
        }
        iVar4.f1371b = string2;
        if (!a.a.a.i.i.d.equals(bVarA.f13c.f1371b)) {
            o.q().c();
        }
        bVarA.f13c.e = message.getData().getInt("timeOut", bVarA.f13c.e);
        bVarA.f13c.h = message.getData().getBoolean("location_change_notify", bVarA.f13c.h);
        bVarA.f13c.g = message.getData().getInt("priority", bVarA.f13c.g);
        a.a.a.i.i.e = bVarA.f13c.g;
        int i3 = message.getData().getInt("wifitimeout", Integer.MAX_VALUE);
        if (i3 < a.a.a.i.i.a0) {
            a.a.a.i.i.a0 = i3;
        }
        b();
        return z;
    }

    public int b(Message message) {
        Messenger messenger;
        b bVarA;
        if (message == null || (messenger = message.replyTo) == null || (bVarA = a(messenger)) == null || bVarA.f13c == null) {
            return 1;
        }
        return a.a.a.i.i.e;
    }

    public final void b() throws Throwable {
        a();
        e();
        g();
    }

    public void b(com.baidu.location.c cVar) {
        a(cVar);
    }

    public int c(Message message) {
        Messenger messenger;
        b bVarA;
        com.baidu.location.i iVar;
        if (message == null || (messenger = message.replyTo) == null || (bVarA = a(messenger)) == null || (iVar = bVarA.f13c) == null) {
            return 1000;
        }
        return iVar.d;
    }

    public void c() {
        synchronized (this.f) {
            try {
                ArrayList<b> arrayList = this.f8a;
                if (arrayList != null) {
                    arrayList.clear();
                }
            } catch (Throwable unused) {
            }
        }
        this.d = null;
        b();
    }

    public void c(com.baidu.location.c cVar) {
        d(cVar);
    }

    public String d() {
        StringBuilder sb;
        StringBuffer stringBuffer = new StringBuffer(256);
        if (this.f8a.isEmpty()) {
            return "&prod=" + a.a.a.i.b.g + ":" + a.a.a.i.b.f;
        }
        String string = stringBuffer.toString();
        try {
            b bVar = this.f8a.get(0);
            String str = bVar.f13c.f;
            if (str != null) {
                stringBuffer.append(str);
            }
            if (bVar.f11a != null) {
                stringBuffer.append(":");
                stringBuffer.append(bVar.f11a);
                stringBuffer.append("|");
            }
            if (string == null || string.equals("")) {
                sb = new StringBuilder();
                sb.append("&prod=");
                sb.append(a.a.a.i.b.g);
                sb.append(":");
                sb.append(a.a.a.i.b.f);
            } else {
                sb = new StringBuilder();
                sb.append("&prod=");
                sb.append(string);
            }
            return sb.toString();
        } catch (Exception unused) {
            return "&prod=" + a.a.a.i.b.g + ":" + a.a.a.i.b.f;
        }
    }

    public void d(Message message) {
        if (message == null || message.replyTo == null) {
            return;
        }
        i = System.currentTimeMillis();
        a.a.a.g.f.w().r();
        a(new b(this, message));
        b();
        if (this.h) {
            a("start");
        }
    }

    public void d(com.baidu.location.c cVar) {
        com.baidu.location.c cVar2;
        if (cVar == null || cVar.r() != 161 || a.a.a.a.a.b().a()) {
            if (!cVar.H() && this.f10c && (cVar.r() == 161 || cVar.r() == 66)) {
                double d = a.a.a.c.a.d().a(cVar.t(), cVar.q())[0];
                a.a.a.c.a.d();
                if (d < 9999.0d) {
                    cVar.a(d);
                }
            }
            if (cVar.r() == 61) {
                cVar.a(a.a.a.c.a.d().a(cVar));
            }
            synchronized (this.f) {
                Iterator<b> it = this.f8a.iterator();
                while (it.hasNext()) {
                    try {
                        b next = it.next();
                        next.a(cVar);
                        if (next.d > 4) {
                            it.remove();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } else {
            if (this.e == null) {
                com.baidu.location.c cVar3 = new com.baidu.location.c();
                this.e = cVar3;
                cVar3.h(505);
            }
            synchronized (this.f) {
                Iterator<b> it2 = this.f8a.iterator();
                while (it2.hasNext()) {
                    try {
                        b next2 = it2.next();
                        next2.a(this.e);
                        if (next2.d > 4) {
                            it2.remove();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        if (cVar != null && (cVar.r() == 61 || cVar.r() == 161 || cVar.r() == 66)) {
            d.i().a(cVar.q(), cVar.t());
            d.i().c(cVar.g());
        }
        boolean z = o.a0;
        if (z) {
            o.a0 = false;
        }
        if (a.a.a.i.i.T >= 10000) {
            if (cVar.r() == 61 || cVar.r() == 161 || cVar.r() == 66) {
                com.baidu.location.c cVar4 = this.d;
                if (cVar4 != null) {
                    float[] fArr = new float[1];
                    Location.distanceBetween(cVar4.q(), this.d.t(), cVar.q(), cVar.t(), fArr);
                    if (fArr[0] <= a.a.a.i.i.V && !z) {
                        return;
                    }
                    this.d = null;
                    cVar2 = new com.baidu.location.c(cVar);
                } else {
                    cVar2 = new com.baidu.location.c(cVar);
                }
                this.d = cVar2;
            }
        }
    }

    public void e() {
        try {
            synchronized (this.f) {
                Iterator<b> it = this.f8a.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void e(Message message) {
        synchronized (this.f) {
            b bVarA = a(message.replyTo);
            if (bVarA != null) {
                this.f8a.remove(bVarA);
            }
        }
        t.e().d();
        b();
        if (this.h) {
            a("stop");
        }
    }

    public void f() {
        synchronized (this.f) {
            Iterator<b> it = this.f8a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public final void g() {
        try {
            Iterator<b> it = this.f8a.iterator();
            while (it.hasNext()) {
                a.a.a.i.i.e = Math.min(a.a.a.i.i.e, it.next().f13c.g);
            }
            if (com.baidu.location.f.f) {
                return;
            }
            a.a.a.i.i.e = 4;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
