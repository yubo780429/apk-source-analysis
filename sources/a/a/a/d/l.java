package a.a.a.d;

import android.location.Location;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f182a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.baidu.location.c f184c;
    public com.baidu.location.c e;
    public boolean f;
    public Handler g;
    public Runnable h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f183b = 450;
    public c d = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l.this.e != null && l.this.f182a != null) {
                com.baidu.location.c cVar = new com.baidu.location.c(l.this.f184c);
                cVar.c(l.this.e.q());
                cVar.d(l.this.e.t());
                l.this.f182a.a(cVar);
            }
            l.this.g.postDelayed(l.this.h, l.this.f183b);
        }
    }

    public interface b {
        void a(com.baidu.location.c cVar);
    }

    public class c {
        public c(l lVar) {
        }

        public c(l lVar, double d, double d2) {
        }
    }

    public l() {
        new c(this);
        new c(this);
        new c(this);
        this.e = null;
        this.f = false;
        this.g = new Handler();
        this.h = new a();
    }

    public void a(long j) {
        this.f183b = j;
    }

    public synchronized void a(com.baidu.location.c cVar) {
        double dQ = cVar.q();
        double dT = cVar.t();
        this.f184c = cVar;
        new c(this, dQ, dT);
        if (this.d == null) {
            this.d = new c(this, dQ, dT);
        }
        com.baidu.location.c cVar2 = this.e;
        if (cVar2 == null) {
            this.e = new com.baidu.location.c(cVar);
        } else {
            double dQ2 = cVar2.q();
            double dT2 = this.e.t();
            double dQ3 = cVar.q();
            double dT3 = cVar.t();
            float[] fArr = new float[2];
            Location.distanceBetween(dQ2, dT2, dQ3, dT3, fArr);
            if (fArr[0] > 10.0f) {
                this.e.c(dQ3);
                this.e.d(dT3);
            } else {
                this.e.c((dQ2 + dQ3) / 2.0d);
                this.e.d((dT2 + dT3) / 2.0d);
            }
        }
    }

    public boolean a() {
        return this.f;
    }

    public void b() {
        this.d = null;
        new c(this);
        new c(this);
        new c(this);
    }

    public void c() {
        if (this.f) {
            this.f = false;
            this.g.removeCallbacks(this.h);
            b();
        }
    }
}
