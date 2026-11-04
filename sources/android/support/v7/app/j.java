package android.support.v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class j {
    private static j d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f726c = new a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f729c;
        long d;
        long e;
        long f;

        a() {
        }
    }

    j(Context context, LocationManager locationManager) {
        this.f724a = context;
        this.f725b = locationManager;
    }

    private Location a(String str) {
        try {
            if (this.f725b.isProviderEnabled(str)) {
                return this.f725b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    static j a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new j(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }

    private void a(Location location) {
        long j;
        long j2;
        a aVar = this.f726c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        i iVarA = i.a();
        iVarA.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = iVarA.f721a;
        iVarA.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = iVarA.f723c == 1;
        long j4 = iVarA.f722b;
        long j5 = iVarA.f721a;
        iVarA.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j6 = iVarA.f722b;
        if (j4 == -1 || j5 == -1) {
            j = 43200000 + jCurrentTimeMillis;
        } else {
            if (jCurrentTimeMillis > j5) {
                j2 = 0 + j6;
            } else {
                j2 = jCurrentTimeMillis > j4 ? 0 + j5 : 0 + j4;
            }
            j = j2 + 60000;
        }
        aVar.f727a = z;
        aVar.f728b = j3;
        aVar.f729c = j4;
        aVar.d = j5;
        aVar.e = j6;
        aVar.f = j;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationA = b.b.c.a.c.a(this.f724a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? a("network") : null;
        Location locationA2 = b.b.c.a.c.a(this.f724a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? a("gps") : null;
        if (locationA2 == null || locationA == null) {
            return locationA2 != null ? locationA2 : locationA;
        }
        return locationA2.getTime() > locationA.getTime() ? locationA2 : locationA;
    }

    private boolean c() {
        return this.f726c.f > System.currentTimeMillis();
    }

    boolean a() {
        a aVar = this.f726c;
        if (c()) {
            return aVar.f727a;
        }
        Location locationB = b();
        if (locationB != null) {
            a(locationB);
            return aVar.f727a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
