package a.a.a.e;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import com.baidu.location.Jni;
import com.baidu.location.c;
import com.baidu.location.d;
import com.baidu.location.e;
import com.baidu.location.h;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public h e;
    public Context f;
    public AlarmManager k;
    public C0009a l;
    public boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<e> f206a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f207b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f208c = null;
    public long d = 0;
    public int g = 0;
    public long h = 0;
    public boolean i = false;
    public PendingIntent j = null;

    /* JADX INFO: renamed from: a.a.a.e.a$a, reason: collision with other inner class name */
    public class C0009a extends BroadcastReceiver {
        public C0009a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (a.this.f206a == null || a.this.f206a.isEmpty()) {
                return;
            }
            a.this.e.i();
        }
    }

    public class b implements d {
        public b() {
        }

        @Override // com.baidu.location.d
        public void a(c cVar) {
            if (a.this.f206a == null || a.this.f206a.size() <= 0) {
                return;
            }
            a.this.a(cVar);
        }
    }

    public a(Context context, h hVar) {
        this.e = null;
        this.f = null;
        this.k = null;
        this.l = null;
        b bVar = new b();
        this.m = false;
        this.f = context;
        this.e = hVar;
        hVar.a(bVar);
        this.k = (AlarmManager) this.f.getSystemService("alarm");
        this.l = new C0009a();
        this.m = false;
    }

    public int a(e eVar) {
        if (this.f206a == null) {
            this.f206a = new ArrayList<>();
        }
        this.f206a.add(eVar);
        eVar.h = true;
        eVar.i = this;
        if (!this.m) {
            this.f.registerReceiver(this.l, new IntentFilter("android.com.baidu.location.TIMER.NOTIFY"), "android.permission.ACCESS_FINE_LOCATION", null);
            this.m = true;
        }
        String str = eVar.d;
        if (str == null) {
            return 1;
        }
        if (!str.equals("gcj02")) {
            double[] dArrA = Jni.a(eVar.f1358b, eVar.f1357a, eVar.d + "2gcj");
            eVar.f = dArrA[0];
            eVar.e = dArrA[1];
        }
        if (this.f208c == null || System.currentTimeMillis() - this.d > 30000) {
            this.e.i();
        } else {
            float[] fArr = new float[1];
            Location.distanceBetween(this.f208c.q(), this.f208c.t(), eVar.e, eVar.f, fArr);
            float fZ = (fArr[0] - eVar.f1359c) - this.f208c.z();
            if (fZ <= 0.0f) {
                int i = eVar.g;
                if (i < 3) {
                    eVar.g = i + 1;
                    eVar.a(this.f208c, fArr[0]);
                    if (eVar.g < 3) {
                        this.i = true;
                    }
                }
            } else if (fZ < this.f207b) {
                this.f207b = fZ;
            }
        }
        b();
        return 1;
    }

    public final void a(long j) {
        try {
            PendingIntent pendingIntent = this.j;
            if (pendingIntent != null) {
                this.k.cancel(pendingIntent);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f, 0, new Intent("android.com.baidu.location.TIMER.NOTIFY"), 201326592);
            this.j = broadcast;
            if (broadcast == null) {
                return;
            }
            this.k.set(0, System.currentTimeMillis() + j, this.j);
        } catch (Exception unused) {
        }
    }

    public final void a(c cVar) {
        if (cVar.r() != 61 && cVar.r() != 161 && cVar.r() != 65) {
            a(120000L);
            return;
        }
        if (System.currentTimeMillis() - this.d < 5000 || this.f206a == null) {
            return;
        }
        this.f208c = cVar;
        this.d = System.currentTimeMillis();
        float[] fArr = new float[1];
        float f = Float.MAX_VALUE;
        for (e eVar : this.f206a) {
            Location.distanceBetween(cVar.q(), cVar.t(), eVar.e, eVar.f, fArr);
            float fZ = (fArr[0] - eVar.f1359c) - cVar.z();
            if (fZ <= 0.0f) {
                int i = eVar.g;
                if (i < 3) {
                    eVar.g = i + 1;
                    eVar.a(cVar, fArr[0]);
                    if (eVar.g < 3) {
                        this.i = true;
                    }
                }
            } else if (fZ < f) {
                f = fZ;
            }
        }
        if (f < this.f207b) {
            this.f207b = f;
        }
        this.g = 0;
        b();
    }

    public final boolean a() {
        ArrayList<e> arrayList = this.f206a;
        boolean z = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<e> it = this.f206a.iterator();
            while (it.hasNext()) {
                if (it.next().g < 3) {
                    z = true;
                }
            }
        }
        return z;
    }

    public int b(e eVar) {
        PendingIntent pendingIntent;
        ArrayList<e> arrayList = this.f206a;
        if (arrayList == null) {
            return 0;
        }
        if (arrayList.contains(eVar)) {
            this.f206a.remove(eVar);
        }
        if (this.f206a.size() != 0 || (pendingIntent = this.j) == null) {
            return 1;
        }
        this.k.cancel(pendingIntent);
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    public final void b() {
        int i;
        boolean z;
        if (a()) {
            float f = this.f207b;
            int i2 = 10000;
            if (f > 5000.0f) {
                i = 600000;
            } else if (f > 1000.0f) {
                i = 120000;
            } else {
                i = f > 500.0f ? 60000 : 10000;
            }
            if (this.i) {
                this.i = false;
            } else {
                i2 = i;
            }
            int i3 = this.g;
            if (i3 != 0) {
                z = ((long) i2) <= (this.h + ((long) i3)) - System.currentTimeMillis();
            }
            if (z) {
                this.g = i2;
                this.h = System.currentTimeMillis();
                a(this.g);
            }
        }
    }

    public void c() {
        PendingIntent pendingIntent = this.j;
        if (pendingIntent != null) {
            this.k.cancel(pendingIntent);
        }
        this.f208c = null;
        this.d = 0L;
        if (this.m) {
            this.f.unregisterReceiver(this.l);
        }
        this.m = false;
    }
}
