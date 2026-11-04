package a.a.a.g;

import a.a.a.b.p;
import android.location.Location;
import android.os.Build;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0014c f257a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Location f258b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Location f259c = null;
    public long d = 0;
    public long e = 0;
    public Timer f = null;
    public TimerTask g = null;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            c.this.c();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static c f261a = new c();
    }

    /* JADX INFO: renamed from: a.a.a.g.c$c, reason: collision with other inner class name */
    public class C0014c implements p.d {
        public C0014c() {
        }

        public /* synthetic */ C0014c(c cVar, a aVar) {
            this();
        }

        @Override // a.a.a.b.p.d
        public void a(Location location) {
            if (location == null) {
                return;
            }
            c cVar = c.this;
            cVar.f258b = location;
            cVar.e = System.currentTimeMillis();
        }
    }

    public static c e() {
        return b.f261a;
    }

    public Location a() {
        return System.currentTimeMillis() - this.d < 30000 ? this.f259c : System.currentTimeMillis() - this.e < 30000 ? this.f258b : null;
    }

    public String a(Location location) {
        if (location != null) {
            return String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_n=%d&ll_t=%d&ll_r=%d", Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), Float.valueOf((float) (((double) location.getSpeed()) * 3.6d)), Float.valueOf(location.getBearing()), 0, Long.valueOf(location.getTime() / 1000), Integer.valueOf((int) (location.hasAccuracy() ? location.getAccuracy() : -1.0f)));
        }
        return null;
    }

    public boolean a(Location location, Location location2) {
        if (location2 == null) {
            return false;
        }
        if (location == null) {
            return true;
        }
        try {
            float[] fArr = new float[2];
            Location.distanceBetween(location.getLatitude(), location.getLongitude(), location2.getLatitude(), location2.getLongitude(), fArr);
            return fArr[0] >= 100.0f;
        } catch (Exception unused) {
        }
    }

    public void b() {
        if (Build.VERSION.SDK_INT >= 31 && a.a.a.i.i.x0 != 0) {
            if (!a.a.a.i.i.k()) {
                c();
                return;
            }
            d();
            if (this.f == null && this.g == null) {
                this.f = new Timer();
                a aVar = new a();
                this.g = aVar;
                this.f.schedule(aVar, 60000L);
            }
            if (this.f257a == null) {
                this.f257a = new C0014c(this, null);
                p.c().a(this.f257a);
            }
        }
    }

    public void b(Location location) {
        this.f259c = location;
        this.d = System.currentTimeMillis();
    }

    public synchronized void c() {
        if (this.f257a != null) {
            p.c().b(this.f257a);
            this.f257a = null;
        }
        d();
    }

    public final synchronized void d() {
        TimerTask timerTask = this.g;
        if (timerTask != null) {
            timerTask.cancel();
            this.g = null;
        }
        Timer timer = this.f;
        if (timer != null) {
            timer.cancel();
            this.f.purge();
            this.f = null;
        }
    }
}
