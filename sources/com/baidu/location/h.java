package com.baidu.location;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h implements a.a.a.b.h.b {
    public static String J = null;
    public static boolean K = false;
    public Boolean A;
    public Boolean B;
    public boolean C;
    public a.a.a.b.h D;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public ServiceConnection I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f1363b;
    public Context e;
    public c g;
    public final Messenger h;
    public boolean q;
    public Boolean z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1362a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f1364c = new i();
    public boolean d = false;
    public Messenger f = null;
    public ArrayList<com.baidu.location.d> i = null;
    public ArrayList<com.baidu.location.b> j = null;
    public com.baidu.location.c k = null;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public d p = null;
    public final Object r = new Object();
    public long s = 0;
    public long t = 0;
    public long u = -1;
    public a.a.a.e.a v = null;
    public com.baidu.location.d w = null;
    public boolean x = false;
    public boolean y = true;

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            h.this.f = new Messenger(iBinder);
            if (h.this.f == null) {
                return;
            }
            h.this.d = true;
            if (h.this.y) {
                h.this.g.obtainMessage(2).sendToTarget();
                return;
            }
            try {
                Message messageObtain = Message.obtain((Handler) null, 11);
                messageObtain.replyTo = h.this.h;
                messageObtain.setData(h.this.b());
                h.this.f.send(messageObtain);
                h.this.d = true;
                if (h.this.f1363b != null) {
                    h.this.B.booleanValue();
                    h.this.g.obtainMessage(4).sendToTarget();
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            h.this.f = null;
            h.this.d = false;
        }
    }

    public class b extends Thread {
        public b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (h.this.D != null) {
                    if (a.a.a.i.i.a(h.this.e) > 0) {
                        h.this.D.g();
                    }
                    h.this.D.a();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<h> f1367a;

        public c(Looper looper, h hVar) {
            super(looper);
            this.f1367a = new WeakReference<>(hVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            h hVar = this.f1367a.get();
            if (hVar == null) {
                return;
            }
            int i = message.what;
            int i2 = 26;
            if (i != 26) {
                if (i == 27) {
                    hVar.a(message);
                    return;
                }
                if (i == 54) {
                    if (hVar.f1363b.h) {
                        hVar.q = true;
                        return;
                    }
                    return;
                }
                if (i == 55) {
                    if (hVar.f1363b.h) {
                        hVar.q = false;
                        return;
                    }
                    return;
                }
                try {
                    if (i == 703) {
                        Bundle data = message.getData();
                        int i3 = data.getInt("id", 0);
                        if (i3 > 0) {
                            hVar.a(i3, (Notification) data.getParcelable("notification"));
                            return;
                        }
                        return;
                    }
                    if (i == 704) {
                        hVar.a(message.getData().getBoolean("removenotify"));
                        return;
                    }
                    switch (i) {
                        case 1:
                            hVar.f();
                            return;
                        case 2:
                            hVar.g();
                            return;
                        case 3:
                            hVar.g(message);
                            return;
                        case 4:
                            hVar.c();
                            return;
                        case 5:
                            hVar.b(message);
                            return;
                        case 6:
                            hVar.h(message);
                            return;
                        case 7:
                            return;
                        case 8:
                            hVar.e(message);
                            return;
                        case 9:
                            hVar.d(message);
                            return;
                        case 10:
                            hVar.f(message);
                            return;
                        case 11:
                            hVar.d();
                            return;
                        case 12:
                            hVar.e();
                            return;
                        default:
                            i2 = 21;
                            if (i != 21) {
                                if (i == 303) {
                                    Bundle data2 = message.getData();
                                    int i4 = data2.getInt("loctype");
                                    int i5 = data2.getInt("diagtype");
                                    byte[] byteArray = data2.getByteArray("diagmessage");
                                    if (i4 <= 0 || i5 <= 0 || byteArray == null || hVar.j == null) {
                                        return;
                                    }
                                    Iterator it = hVar.j.iterator();
                                    while (it.hasNext()) {
                                        ((com.baidu.location.b) it.next()).a(i4, i5, new String(byteArray, "UTF-8"));
                                    }
                                    return;
                                }
                                if (i == 406) {
                                    Bundle data3 = message.getData();
                                    byte[] byteArray2 = data3.getByteArray("mac");
                                    String str = byteArray2 != null ? new String(byteArray2, "UTF-8") : null;
                                    int i6 = data3.getInt("hotspot", -1);
                                    if (hVar.j != null) {
                                        Iterator it2 = hVar.j.iterator();
                                        while (it2.hasNext()) {
                                            ((com.baidu.location.b) it2.next()).a(str, i6);
                                        }
                                        return;
                                    }
                                    return;
                                }
                                if (i == 701) {
                                    hVar.b((com.baidu.location.c) message.obj);
                                    return;
                                }
                                if (i == 708) {
                                    hVar.a((String) message.obj);
                                    return;
                                }
                                if (i != 804) {
                                    if (i == 1300) {
                                        hVar.c(message);
                                        return;
                                    } else if (i != 1400) {
                                        super.handleMessage(message);
                                        return;
                                    } else {
                                        hVar.i(message);
                                        return;
                                    }
                                }
                                Bundle data4 = message.getData();
                                data4.setClassLoader(com.baidu.location.c.class.getClassLoader());
                                com.baidu.location.c cVar = (com.baidu.location.c) data4.getParcelable("vdr_location");
                                if (hVar.j != null) {
                                    Iterator it3 = hVar.j.iterator();
                                    while (it3.hasNext()) {
                                        ((com.baidu.location.b) it3.next()).b(cVar);
                                    }
                                    return;
                                }
                                return;
                            }
                            Bundle data5 = message.getData();
                            data5.setClassLoader(com.baidu.location.c.class.getClassLoader());
                            com.baidu.location.c cVar2 = (com.baidu.location.c) data5.getParcelable("locStr");
                            if (!hVar.F && hVar.E && cVar2.r() == 66) {
                                return;
                            }
                            if (!hVar.F && hVar.E) {
                                hVar.F = true;
                                return;
                            } else if (!hVar.F) {
                                hVar.F = true;
                            }
                            break;
                            break;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            hVar.a(message, i2);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public /* synthetic */ d(h hVar, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (h.this.r) {
                h.this.o = false;
                if (h.this.f != null && h.this.h != null) {
                    if ((h.this.i != null && h.this.i.size() >= 1) || (h.this.j != null && h.this.j.size() >= 1)) {
                        if (!h.this.m) {
                            h.this.g.obtainMessage(4).sendToTarget();
                            return;
                        }
                        if (h.this.p == null) {
                            h hVar = h.this;
                            hVar.p = hVar.new d();
                        }
                        h.this.g.postDelayed(h.this.p, h.this.f1363b.d);
                    }
                }
            }
        }
    }

    public class e extends Thread {
        public e() {
        }

        public /* synthetic */ e(h hVar, a aVar) {
            this();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (h.this.B.booleanValue()) {
                    if (h.this.D == null) {
                        a.a.a.g.f.w().m();
                        h.this.D = new a.a.a.b.h(h.this.e, h.this.f1364c, h.this, null, false);
                    }
                    h hVar = h.this;
                    hVar.H = hVar.D.b();
                    if (h.this.f1364c.D == i.a.ACCURACY_IN_FIRST_LOC) {
                        h.this.D.i();
                        h.this.D.j();
                    }
                }
                h.this.g.obtainMessage(1).sendToTarget();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public h(Context context) throws Exception {
        this.f1363b = new i();
        this.e = null;
        Boolean bool = Boolean.FALSE;
        this.z = bool;
        this.A = bool;
        this.B = Boolean.TRUE;
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = null;
        this.I = new a();
        a();
        this.e = context;
        this.f1363b = new i();
        this.g = new c(Looper.getMainLooper(), this);
        this.h = new Messenger(this.g);
    }

    public static void b(boolean z) {
        K = z;
    }

    public final void a() throws Exception {
        if (K) {
            return;
        }
        Log.e("baidu_location_Client", "The location function has been stopped because you do not agree with the privacy compliance policy. Please recheck the setAgreePrivacy interface");
        throw new Exception("The location function has been stopped because you do not agree with the privacy compliance policy. Please recheck the setAgreePrivacy interface");
    }

    public final void a(int i) {
        if (this.k.h() == null) {
            this.k.e(this.f1363b.f1370a);
        }
        if (this.l || ((this.f1363b.h && this.k.r() == 61) || this.k.r() == 66 || this.k.r() == 67 || this.x || this.k.r() == 161)) {
            if (this.n || this.u == -1 || System.currentTimeMillis() - this.u >= h().g() - 300) {
                ArrayList<com.baidu.location.d> arrayList = this.i;
                if (arrayList != null) {
                    Iterator<com.baidu.location.d> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().a(this.k);
                    }
                }
                ArrayList<com.baidu.location.b> arrayList2 = this.j;
                if (arrayList2 != null) {
                    Iterator<com.baidu.location.b> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().a(this.k);
                    }
                }
                this.u = System.currentTimeMillis();
                if (this.n) {
                    this.n = false;
                }
            }
            if (this.k.r() == 66 || this.k.r() == 67) {
                return;
            }
            this.l = false;
            this.t = System.currentTimeMillis();
        }
    }

    public final void a(int i, Notification notification) {
        try {
            Intent intent = new Intent(this.e, (Class<?>) f.class);
            intent.putExtra("notification", notification);
            intent.putExtra("id", i);
            intent.putExtra("command", 1);
            if (Build.VERSION.SDK_INT >= 26) {
                this.e.startForegroundService(intent);
            } else {
                this.e.startService(intent);
            }
            this.G = true;
        } catch (Exception unused) {
        }
    }

    public final void a(Message message) {
        try {
            Bundle data = message.getData();
            data.setClassLoader(com.baidu.location.c.class.getClassLoader());
            com.baidu.location.c cVar = (com.baidu.location.c) data.getParcelable("locStr");
            if (this.w != null) {
                i iVar = this.f1363b;
                if (iVar != null && iVar.h() && cVar.r() == 65) {
                    return;
                }
                this.w.a(cVar);
            }
        } catch (Exception unused) {
        }
    }

    public final void a(Message message, int i) {
        if (this.d) {
            try {
                Bundle data = message.getData();
                data.setClassLoader(com.baidu.location.c.class.getClassLoader());
                com.baidu.location.c cVar = (com.baidu.location.c) data.getParcelable("locStr");
                this.k = cVar;
                if (cVar.r() == 61) {
                    this.s = System.currentTimeMillis();
                }
                if (this.k.r() == 61 || this.k.r() == 161) {
                    a.a.a.b.a.c().a(this.k.q(), this.k.t(), this.k.h());
                }
                a(i);
            } catch (Exception unused) {
            }
        }
    }

    public void a(com.baidu.location.b bVar) {
        if (bVar == null) {
            throw new IllegalStateException("please set a non-null listener");
        }
        Message messageObtainMessage = this.g.obtainMessage(1300);
        messageObtainMessage.obj = bVar;
        messageObtainMessage.sendToTarget();
    }

    @Override // a.a.a.b.h.b
    public void a(com.baidu.location.c cVar) {
        if ((!this.F || this.E) && cVar != null) {
            Message messageObtainMessage = this.g.obtainMessage(701);
            messageObtainMessage.obj = cVar;
            messageObtainMessage.sendToTarget();
        }
    }

    public void a(com.baidu.location.d dVar) {
        Message messageObtainMessage = this.g.obtainMessage(8);
        messageObtainMessage.obj = dVar;
        messageObtainMessage.sendToTarget();
    }

    public void a(i iVar) {
        if (iVar == null) {
            iVar = new i();
        }
        if (iVar.b() > 0) {
            iVar.a(0);
            iVar.b(true);
        }
        this.f1364c = new i(iVar);
        Message messageObtainMessage = this.g.obtainMessage(3);
        messageObtainMessage.obj = iVar;
        messageObtainMessage.sendToTarget();
    }

    public final void a(String str) {
        ArrayList<com.baidu.location.b> arrayList = this.j;
        if (arrayList != null) {
            Iterator<com.baidu.location.b> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(str);
            }
        }
    }

    public final void a(boolean z) {
        try {
            Intent intent = new Intent(this.e, (Class<?>) f.class);
            intent.putExtra("removenotify", z);
            intent.putExtra("command", 2);
            this.e.startService(intent);
            this.G = true;
        } catch (Exception unused) {
        }
    }

    public final Bundle b() {
        if (this.f1363b == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("packName", this.f1362a);
        bundle.putString("prodName", this.f1363b.f);
        bundle.putString("coorType", this.f1363b.f1370a);
        bundle.putString("addrType", this.f1363b.f1371b);
        bundle.putBoolean("openGPS", this.f1363b.f1372c);
        bundle.putBoolean("location_change_notify", this.f1363b.h);
        bundle.putInt("scanSpan", this.f1363b.d);
        bundle.putBoolean("enableSimulateGps", this.f1363b.j);
        bundle.putInt("timeOut", this.f1363b.e);
        bundle.putInt("priority", this.f1363b.g);
        bundle.putBoolean("map", this.z.booleanValue());
        bundle.putBoolean("import", this.A.booleanValue());
        bundle.putBoolean("needDirect", this.f1363b.n);
        bundle.putBoolean("isneedaptag", this.f1363b.o);
        bundle.putBoolean("isneedpoiregion", this.f1363b.q);
        bundle.putBoolean("isneedregular", this.f1363b.r);
        bundle.putBoolean("isneedaptagd", this.f1363b.p);
        bundle.putBoolean("isneedaltitude", this.f1363b.s);
        bundle.putBoolean("isneednewrgc", this.f1363b.t);
        bundle.putInt("autoNotifyMaxInterval", this.f1363b.b());
        bundle.putInt("autoNotifyMinTimeInterval", this.f1363b.e());
        bundle.putInt("autoNotifyMinDistance", this.f1363b.d());
        bundle.putFloat("autoNotifyLocSensitivity", this.f1363b.a());
        bundle.putInt("wifitimeout", this.f1363b.A);
        bundle.putInt("wfnum", a.a.a.b.a.c().f5c);
        bundle.putBoolean("ischeckper", a.a.a.b.a.c().f4b);
        bundle.putFloat("wfsm", (float) a.a.a.b.a.c().e);
        bundle.putDouble("gnmcrm", a.a.a.b.a.c().h);
        bundle.putInt("gnmcon", a.a.a.b.a.c().i);
        bundle.putInt("iupl", a.a.a.b.a.c().j);
        bundle.putInt("lpcs", a.a.a.b.a.c().g);
        bundle.putInt("hpdts", a.a.a.b.a.c().l);
        bundle.putInt("oldts", a.a.a.b.a.c().m);
        bundle.putBoolean("isEnableBeidouMode", this.f1363b.C);
        bundle.putInt("onic", a.a.a.b.a.c().n);
        bundle.putInt("nlcs", a.a.a.b.a.c().o);
        bundle.putFloat("ncsr", a.a.a.b.a.c().p);
        bundle.putFloat("cscr", a.a.a.b.a.c().q);
        bundle.putString("connectBssid", this.H);
        bundle.putInt("cls", a.a.a.b.a.c().r);
        bundle.putIntArray("ocs", a.a.a.b.a.c().s);
        bundle.putInt("topCellNumber", a.a.a.b.a.c().t);
        bundle.putInt("locStrLength", a.a.a.b.a.c().u);
        return bundle;
    }

    public final void b(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        com.baidu.location.d dVar = (com.baidu.location.d) obj;
        if (this.i == null) {
            this.i = new ArrayList<>();
        }
        if (this.i.contains(dVar)) {
            return;
        }
        this.i.add(dVar);
    }

    public final void b(com.baidu.location.c cVar) {
        if (this.y) {
            return;
        }
        this.k = cVar;
        if (!this.F && cVar.r() == 161) {
            this.E = true;
            a.a.a.b.a.c().a(cVar.q(), cVar.t(), cVar.h());
        }
        ArrayList<com.baidu.location.d> arrayList = this.i;
        if (arrayList != null) {
            Iterator<com.baidu.location.d> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(cVar);
            }
        }
        ArrayList<com.baidu.location.b> arrayList2 = this.j;
        if (arrayList2 != null) {
            Iterator<com.baidu.location.b> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().a(cVar);
            }
        }
    }

    public final void c() {
        int i;
        int i2;
        i iVar;
        if (this.f == null) {
            return;
        }
        int iA = a.a.a.i.i.a(this.e);
        a aVar = null;
        if ((System.currentTimeMillis() - this.s > 3000 || (!((iVar = this.f1363b) == null || iVar.h) || this.m)) && iA == 1) {
            if (!this.x || System.currentTimeMillis() - this.t > 20000 || this.m) {
                Message messageObtain = Message.obtain((Handler) null, 22);
                if (this.m) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("isWaitingLocTag", this.m);
                    this.m = false;
                    messageObtain.setData(bundle);
                }
                try {
                    messageObtain.replyTo = this.h;
                    this.f.send(messageObtain);
                    System.currentTimeMillis();
                    this.l = true;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else if (iA < 1) {
            com.baidu.location.c cVar = new com.baidu.location.c();
            if (iA == -1) {
                i2 = 69;
            } else if (iA == -2) {
                i2 = 70;
            } else {
                if (iA == 0) {
                    i2 = 71;
                }
                c(cVar);
            }
            cVar.h(i2);
            c(cVar);
        }
        synchronized (this.r) {
            i iVar2 = this.f1363b;
            if (iVar2 != null && (i = iVar2.d) >= 1000 && !this.o) {
                if (this.p == null) {
                    this.p = new d(this, aVar);
                }
                this.g.postDelayed(this.p, i);
                this.o = true;
            }
        }
    }

    public final void c(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        com.baidu.location.b bVar = (com.baidu.location.b) obj;
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        if (this.j.contains(bVar)) {
            return;
        }
        this.j.add(bVar);
    }

    public final void c(com.baidu.location.c cVar) {
        ArrayList<com.baidu.location.d> arrayList = this.i;
        if (arrayList != null) {
            Iterator<com.baidu.location.d> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(cVar);
            }
        }
        ArrayList<com.baidu.location.b> arrayList2 = this.j;
        if (arrayList2 != null) {
            Iterator<com.baidu.location.b> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().a(cVar);
            }
        }
    }

    public final void d() {
        if (this.f == null) {
            return;
        }
        Message messageObtain = Message.obtain((Handler) null, 22);
        try {
            messageObtain.replyTo = this.h;
            this.f.send(messageObtain);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void d(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        com.baidu.location.e eVar = (com.baidu.location.e) obj;
        if (this.v == null) {
            this.v = new a.a.a.e.a(this.e, this);
        }
        this.v.a(eVar);
    }

    public final void e() {
        Message messageObtain = Message.obtain((Handler) null, 28);
        try {
            messageObtain.replyTo = this.h;
            this.f.send(messageObtain);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void e(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        this.w = (com.baidu.location.d) obj;
    }

    public final void f() {
        if (this.d) {
            return;
        }
        if (this.B.booleanValue()) {
            boolean zG = a.a.a.i.i.g(this.e);
            if (this.f1364c.i()) {
                zG = true;
            }
            if (zG) {
                try {
                    new b().start();
                } catch (Throwable unused) {
                }
            }
        }
        if (this.f1364c.i()) {
            return;
        }
        this.B = Boolean.FALSE;
        this.f1362a = this.e.getPackageName();
        String str = this.f1362a + "_bdls_v2.9";
        Intent intent = new Intent(this.e, (Class<?>) f.class);
        try {
            intent.putExtra("debug_dev", this.C);
        } catch (Exception unused2) {
        }
        if (this.f1363b == null) {
            this.f1363b = new i();
        }
        intent.putExtra("cache_exception", this.f1363b.l);
        intent.putExtra("kill_process", this.f1363b.m);
        intent.putExtra("auth_key", J);
        try {
            this.e.bindService(intent, this.I, 1);
        } catch (Exception e2) {
            e2.printStackTrace();
            this.d = false;
        }
    }

    public final void f(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        com.baidu.location.e eVar = (com.baidu.location.e) obj;
        a.a.a.e.a aVar = this.v;
        if (aVar != null) {
            aVar.b(eVar);
        }
    }

    public final void g() {
        if (!this.d || this.f == null) {
            return;
        }
        Message messageObtain = Message.obtain((Handler) null, 12);
        messageObtain.replyTo = this.h;
        try {
            this.f.send(messageObtain);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            this.e.unbindService(this.I);
            if (this.G) {
                try {
                    this.e.stopService(new Intent(this.e, (Class<?>) f.class));
                } catch (Exception unused) {
                }
                this.G = false;
            }
        } catch (Exception unused2) {
        }
        synchronized (this.r) {
            try {
                if (this.o) {
                    this.g.removeCallbacks(this.p);
                    this.o = false;
                }
            } catch (Exception unused3) {
            }
        }
        a.a.a.e.a aVar = this.v;
        if (aVar != null) {
            aVar.c();
        }
        this.f = null;
        this.m = false;
        this.x = false;
        this.d = false;
        this.E = false;
        this.F = false;
        this.u = -1L;
        this.n = false;
        this.B = Boolean.TRUE;
    }

    public final void g(Message message) {
        Object obj;
        this.m = false;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        i iVar = (i) obj;
        if (this.f1363b.a(iVar)) {
            return;
        }
        a aVar = null;
        if (this.f1363b.d != iVar.d) {
            try {
                synchronized (this.r) {
                    try {
                        if (this.o) {
                            this.g.removeCallbacks(this.p);
                            this.o = false;
                        }
                        int i = iVar.d;
                        if (i >= 1000 && !this.o) {
                            if (this.p == null) {
                                this.p = new d(this, aVar);
                            }
                            this.g.postDelayed(this.p, i);
                            this.o = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception unused) {
            }
        }
        this.f1363b = new i(iVar);
        if (this.f != null && a.a.a.i.i.a(this.e) >= 1) {
            try {
                Message messageObtain = Message.obtain((Handler) null, 15);
                messageObtain.replyTo = this.h;
                messageObtain.setData(b());
                this.f.send(messageObtain);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public i h() {
        return this.f1363b;
    }

    public final void h(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        com.baidu.location.d dVar = (com.baidu.location.d) obj;
        ArrayList<com.baidu.location.d> arrayList = this.i;
        if (arrayList == null || !arrayList.contains(dVar)) {
            return;
        }
        this.i.remove(dVar);
    }

    public void i() {
        this.g.obtainMessage(11).sendToTarget();
    }

    public final void i(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        com.baidu.location.b bVar = (com.baidu.location.b) obj;
        ArrayList<com.baidu.location.b> arrayList = this.j;
        if (arrayList == null || !arrayList.contains(bVar)) {
            return;
        }
        this.j.remove(bVar);
    }

    public void j() {
        this.y = false;
        if (a.a.a.i.i.l()) {
            return;
        }
        c.a.c.a.b.c(this.e.getApplicationContext()).a(K);
        a.a.a.b.a.c().a(this.e, this.f1364c, (String) null);
        new e(this, null).start();
    }
}
