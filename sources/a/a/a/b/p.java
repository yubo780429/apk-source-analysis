package a.a.a.b;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<d> f58a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocationManager f59b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f60c = null;
    public boolean d = false;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static p f61a = new p();
    }

    public class c implements LocationListener {
        public c() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            Iterator<d> it = p.this.f58a.iterator();
            while (it.hasNext()) {
                it.next().a(location);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    public interface d {
        void a(Location location);
    }

    public static p c() {
        return b.f61a;
    }

    public void a() {
        LocationManager locationManager;
        c cVar = this.f60c;
        if (cVar == null || (locationManager = this.f59b) == null) {
            return;
        }
        locationManager.removeUpdates(cVar);
        this.f60c = null;
    }

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        if (!this.f58a.contains(dVar)) {
            this.f58a.add(dVar);
        }
        if (this.f58a.size() != 1 || this.d) {
            return;
        }
        b();
        this.d = true;
    }

    public void b() {
        try {
            if (this.f59b == null) {
                this.f59b = (LocationManager) com.baidu.location.f.c().getSystemService("location");
            }
            if (this.f60c == null) {
                this.f60c = new c();
            }
            LocationManager locationManager = this.f59b;
            if (locationManager == null || !locationManager.isProviderEnabled("network")) {
                return;
            }
            this.f59b.requestLocationUpdates("network", 1000L, 0.0f, this.f60c);
        } catch (Exception unused) {
        }
    }

    public void b(d dVar) {
        if (dVar == null) {
            return;
        }
        this.f58a.remove(dVar);
        if (this.f58a.size() == 0 && this.d) {
            a();
            this.d = false;
        }
    }
}
