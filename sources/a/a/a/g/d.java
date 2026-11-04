package a.a.a.g;

import a.a.a.b.o;
import a.a.a.b.u;
import a.a.a.b.y;
import a.a.a.b.z;
import android.annotation.TargetApi;
import android.content.Context;
import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.GnssStatus;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.location.Jni;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static d U = null;
    public static Location V = null;
    public static int W = -1;
    public static int X = 0;
    public static int Y = 0;
    public static int Z = 0;
    public static int a0 = 0;
    public static int b0 = 0;
    public static int c0 = 0;
    public static int d0 = 0;
    public static int e0 = 0;
    public static int f0 = 0;
    public static int g0 = 0;
    public static long h0 = 0;
    public static String i0 = null;
    public static double j0 = 100.0d;
    public static String k0 = "";
    public static String l0 = "";
    public static float m0 = -1.0f;
    public ArrayList<ArrayList<Float>> A;
    public ArrayList<ArrayList<Float>> B;
    public ArrayList<ArrayList<Float>> C;
    public ArrayList<ArrayList<Float>> D;
    public ArrayList<ArrayList<Float>> E;
    public ArrayList<ArrayList<Float>> F;
    public ArrayList<ArrayList<Float>> G;
    public String H;
    public long I;
    public long J;
    public long K;
    public com.baidu.location.c L;
    public boolean M;
    public boolean N;
    public long O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public long T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f263a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Location f265c;
    public GpsStatus f;
    public C0015d g;
    public boolean h;
    public boolean j;
    public long t;
    public b y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocationManager f264b = null;
    public g d = null;
    public i e = null;
    public e i = null;
    public GpsStatus.NmeaListener k = null;
    public OnNmeaMessageListener l = null;
    public long m = 0;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public long q = 0;
    public double r = 0.0d;
    public double s = 0.0d;
    public long u = 0;
    public long v = 0;
    public f w = null;
    public long x = 0;
    public c z = null;

    public class a implements OnNmeaMessageListener {
        public a() {
        }

        @Override // android.location.OnNmeaMessageListener
        public void onNmeaMessage(String str, long j) {
            if (d.this.w != null) {
                d.this.w.sendMessage(d.this.w.obtainMessage(5, str));
            }
        }
    }

    @TargetApi(24)
    public class b extends GnssMeasurementsEvent.Callback {
    }

    @TargetApi(24)
    public class c extends GnssNavigationMessage.Callback {
        public c() {
        }

        public /* synthetic */ c(d dVar, a aVar) {
            this();
        }

        @Override // android.location.GnssNavigationMessage.Callback
        public void onGnssNavigationMessageReceived(GnssNavigationMessage gnssNavigationMessage) {
            if (d.this.v != 0) {
                z.f().a(gnssNavigationMessage, d.this.v);
            } else {
                z.f().a(gnssNavigationMessage, System.currentTimeMillis() / 1000);
            }
        }

        @Override // android.location.GnssNavigationMessage.Callback
        public void onStatusChanged(int i) {
        }
    }

    /* JADX INFO: renamed from: a.a.a.g.d$d, reason: collision with other inner class name */
    @TargetApi(24)
    public class C0015d extends GnssStatus.Callback {
        public C0015d() {
        }

        public /* synthetic */ C0015d(d dVar, a aVar) {
            this();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            ArrayList arrayList;
            if (d.this.f264b == null || gnssStatus == null) {
                return;
            }
            d.this.x = System.currentTimeMillis();
            int satelliteCount = gnssStatus.getSatelliteCount();
            d.this.D.clear();
            d.this.E.clear();
            d.this.F.clear();
            d.this.G.clear();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < satelliteCount; i4++) {
                i++;
                ArrayList arrayList2 = new ArrayList();
                int constellationType = gnssStatus.getConstellationType(i4);
                arrayList2.add(Float.valueOf(gnssStatus.getAzimuthDegrees(i4)));
                arrayList2.add(Float.valueOf(gnssStatus.getElevationDegrees(i4)));
                arrayList2.add(Float.valueOf(gnssStatus.getCn0DbHz(i4)));
                if (gnssStatus.usedInFix(i4)) {
                    i2++;
                    arrayList2.add(Float.valueOf(1.0f));
                    if (constellationType == 1) {
                        i3++;
                    }
                } else {
                    arrayList2.add(Float.valueOf(0.0f));
                }
                arrayList2.add(Float.valueOf(gnssStatus.getSvid(i4)));
                if (constellationType == 1) {
                    arrayList2.add(Float.valueOf(1.0f));
                    arrayList = d.this.D;
                } else {
                    if (constellationType == 5) {
                        arrayList2.add(Float.valueOf(2.0f));
                        d.this.E.add(arrayList2);
                        d.this.R = System.currentTimeMillis();
                    } else if (constellationType == 3) {
                        arrayList2.add(Float.valueOf(3.0f));
                        arrayList = d.this.F;
                    } else if (constellationType == 6) {
                        arrayList2.add(Float.valueOf(4.0f));
                        arrayList = d.this.G;
                    }
                }
                arrayList.add(arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(d.this.D);
            arrayList3.addAll(d.this.E);
            arrayList3.addAll(d.this.F);
            arrayList3.addAll(d.this.G);
            d.this.a((ArrayList<ArrayList<Float>>) arrayList3);
            d dVar = d.this;
            dVar.A = dVar.a(true, false, false, false, true, -1.0f);
            d dVar2 = d.this;
            d.k0 = dVar2.b((ArrayList<ArrayList<Float>>) dVar2.A);
            d dVar3 = d.this;
            dVar3.B = dVar3.a(true, true, true, true, true, -1.0f);
            d dVar4 = d.this;
            dVar4.C = dVar4.a(true, true, true, true, false, -1.0f);
            d dVar5 = d.this;
            d.l0 = dVar5.b((ArrayList<ArrayList<Float>>) dVar5.C);
            if (a.a.a.b.d.i().F == 1) {
                a.a.a.b.i.d().a(d.this.C);
            }
            d.X = i2;
            int unused = d.Y = i3;
            int unused2 = d.g0 = i;
            long unused3 = d.h0 = System.currentTimeMillis();
            d dVar6 = d.this;
            int unused4 = d.Z = dVar6.a((ArrayList<ArrayList<Float>>) dVar6.F, true, -1.0f).size();
            d dVar7 = d.this;
            int unused5 = d.a0 = dVar7.a((ArrayList<ArrayList<Float>>) dVar7.G, true, -1.0f).size();
            d dVar8 = d.this;
            int unused6 = d.b0 = dVar8.a((ArrayList<ArrayList<Float>>) dVar8.E, true, -1.0f).size();
            d dVar9 = d.this;
            int unused7 = d.c0 = dVar9.a((ArrayList<ArrayList<Float>>) dVar9.D, false, -1.0f).size();
            d dVar10 = d.this;
            int unused8 = d.d0 = dVar10.a((ArrayList<ArrayList<Float>>) dVar10.F, false, -1.0f).size();
            d dVar11 = d.this;
            int unused9 = d.e0 = dVar11.a((ArrayList<ArrayList<Float>>) dVar11.G, false, -1.0f).size();
            d dVar12 = d.this;
            int unused10 = d.f0 = dVar12.a((ArrayList<ArrayList<Float>>) dVar12.E, false, -1.0f).size();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            d.this.b((Location) null);
            d.this.b(false);
            d.X = 0;
            int unused = d.Y = 0;
            int unused2 = d.Z = 0;
            int unused3 = d.a0 = 0;
            int unused4 = d.b0 = 0;
            int unused5 = d.c0 = 0;
            int unused6 = d.d0 = 0;
            int unused7 = d.e0 = 0;
            int unused8 = d.f0 = 0;
            int unused9 = d.g0 = 0;
            int unused10 = d.W = -1;
            Location unused11 = d.V = null;
        }
    }

    public class e implements GpsStatus.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f269a;

        public e() {
            this.f269a = 0L;
        }

        public /* synthetic */ e(d dVar, a aVar) {
            this();
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i) {
            ArrayList arrayList;
            if (d.this.f264b == null) {
                return;
            }
            int i2 = 0;
            if (i == 2) {
                d.this.b((Location) null);
                d.this.b(false);
                d.X = 0;
                int unused = d.Y = 0;
                int unused2 = d.Z = 0;
                int unused3 = d.a0 = 0;
                int unused4 = d.b0 = 0;
                return;
            }
            if (i == 4 && d.this.o) {
                try {
                    if (d.this.f == null) {
                        d dVar = d.this;
                        dVar.f = dVar.f264b.getGpsStatus(null);
                    } else {
                        d.this.f264b.getGpsStatus(d.this.f);
                    }
                    d.this.x = System.currentTimeMillis();
                    d.this.D.clear();
                    d.this.E.clear();
                    d.this.F.clear();
                    d.this.G.clear();
                    int i3 = 0;
                    for (GpsSatellite gpsSatellite : d.this.f.getSatellites()) {
                        ArrayList arrayList2 = new ArrayList();
                        int prn = gpsSatellite.getPrn();
                        arrayList2.add(Float.valueOf(gpsSatellite.getAzimuth()));
                        arrayList2.add(Float.valueOf(gpsSatellite.getElevation()));
                        arrayList2.add(Float.valueOf(gpsSatellite.getSnr()));
                        if (gpsSatellite.usedInFix()) {
                            i2++;
                            arrayList2.add(Float.valueOf(1.0f));
                            if (prn >= 1 && prn <= 32) {
                                i3++;
                            }
                        } else {
                            arrayList2.add(Float.valueOf(0.0f));
                        }
                        arrayList2.add(Float.valueOf(prn));
                        if (prn >= 1 && prn <= 32) {
                            arrayList2.add(Float.valueOf(1.0f));
                            arrayList = d.this.D;
                        } else if (prn >= 201 && prn <= 261) {
                            arrayList2.add(Float.valueOf(2.0f));
                            arrayList = d.this.E;
                        } else if (prn >= 65 && prn <= 96) {
                            arrayList2.add(Float.valueOf(3.0f));
                            arrayList = d.this.F;
                        } else if (prn >= 301 && prn <= 336) {
                            arrayList2.add(Float.valueOf(4.0f));
                            arrayList = d.this.G;
                        }
                        arrayList.add(arrayList2);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(d.this.D);
                    arrayList3.addAll(d.this.E);
                    arrayList3.addAll(d.this.F);
                    arrayList3.addAll(d.this.G);
                    d.this.a((ArrayList<ArrayList<Float>>) arrayList3);
                    d dVar2 = d.this;
                    dVar2.A = dVar2.a(true, false, false, false, true, -1.0f);
                    d dVar3 = d.this;
                    d.k0 = dVar3.b((ArrayList<ArrayList<Float>>) dVar3.A);
                    d dVar4 = d.this;
                    dVar4.B = dVar4.a(true, true, true, true, true, -1.0f);
                    d dVar5 = d.this;
                    dVar5.C = dVar5.a(true, true, true, true, false, -1.0f);
                    d dVar6 = d.this;
                    d.l0 = dVar6.b((ArrayList<ArrayList<Float>>) dVar6.C);
                    if (a.a.a.b.d.i().F == 1) {
                        a.a.a.b.i.d().a(d.this.C);
                    }
                    if (i3 > 0) {
                        int unused5 = d.Y = i3;
                    }
                    if (i2 > 0 || System.currentTimeMillis() - this.f269a > 100) {
                        this.f269a = System.currentTimeMillis();
                        d.X = i2;
                    }
                    long unused6 = d.h0 = System.currentTimeMillis();
                } catch (Exception unused7) {
                }
            }
        }
    }

    public static class f extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<d> f271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f272b;

        public f(d dVar) {
            this.f271a = new WeakReference<>(dVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Location location;
            String str;
            if (com.baidu.location.f.f) {
                d dVar = this.f271a.get();
                this.f272b = dVar;
                if (dVar == null) {
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    Location location2 = (Location) message.obj;
                    this.f272b.a(location2, a.a.a.b.d.i().F == 1 ? a.a.a.b.i.d().b(location2) : -1);
                    return;
                }
                if (i == 3) {
                    location = (Location) message.obj;
                    str = "&og=1";
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        dVar.b((String) message.obj);
                        return;
                    }
                    location = (Location) message.obj;
                    str = "&og=2";
                }
                dVar.a(str, location);
            }
        }
    }

    public class g implements LocationListener {
        public g() {
        }

        public /* synthetic */ g(d dVar, a aVar) {
            this();
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null && a.a.a.i.i.e == 4) {
                return;
            }
            if (a.a.a.i.i.k()) {
                a.a.a.g.c.e().b(location);
                return;
            }
            if (!a.a.a.i.i.a(location) && Math.abs(location.getLatitude()) <= 360.0d && Math.abs(location.getLongitude()) <= 360.0d) {
                d.this.v = location.getTime() / 1000;
                d.this.J = System.currentTimeMillis();
                if (d.this.u != 0) {
                    d.this.t = System.currentTimeMillis() - d.this.u;
                }
                d.this.u = System.currentTimeMillis();
                int i = d.X;
                if (i == 0) {
                    try {
                        i = location.getExtras().getInt("satellites");
                    } catch (Exception unused) {
                    }
                }
                if (i == 0 || o.q().k()) {
                    System.currentTimeMillis();
                    long unused2 = d.this.x;
                }
                d.this.b(true);
                d.this.b(location);
                d.this.n = false;
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            d.this.b((Location) null);
            d.this.b(false);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            if (i == 0) {
                d.this.b((Location) null);
            } else if (i != 1) {
                if (i != 2) {
                    return;
                }
                d.this.n = false;
                return;
            } else {
                d.this.m = System.currentTimeMillis();
                d.this.n = true;
            }
            d.this.b(false);
        }
    }

    public class h implements GpsStatus.NmeaListener {
        public h() {
        }

        public /* synthetic */ h(d dVar, a aVar) {
            this();
        }

        @Override // android.location.GpsStatus.NmeaListener
        public void onNmeaReceived(long j, String str) {
            if (d.this.w != null) {
                d.this.w.sendMessage(d.this.w.obtainMessage(5, str));
            }
        }
    }

    public class i implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f275a;

        public i() {
            this.f275a = 0L;
        }

        public /* synthetic */ i(d dVar, a aVar) {
            this();
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (!(d.this.o && a.a.a.i.i.e == 4) && location != null && TextUtils.equals(location.getProvider(), "gps") && System.currentTimeMillis() - this.f275a >= 10000 && Math.abs(location.getLatitude()) <= 360.0d && Math.abs(location.getLongitude()) <= 360.0d && y.a(location, false)) {
                this.f275a = System.currentTimeMillis();
                if (d.this.w != null) {
                    d.this.T = System.currentTimeMillis();
                    d.this.w.sendMessage(d.this.w.obtainMessage(4, location));
                }
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

    static {
        new ReentrantLock();
    }

    public d() {
        this.h = false;
        this.j = false;
        new ArrayList();
        this.A = new ArrayList<>();
        new ArrayList();
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new ArrayList<>();
        this.H = null;
        this.I = 0L;
        new ArrayList();
        new LinkedHashMap();
        this.J = -1L;
        this.K = -1L;
        this.M = false;
        this.N = false;
        this.O = 0L;
        this.P = false;
        this.Q = false;
        this.R = 0L;
        this.S = false;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                Class.forName("android.location.GnssStatus");
                this.h = true;
            } catch (ClassNotFoundException unused) {
                this.h = false;
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                String str = Build.MANUFACTURER;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.j = false;
    }

    public static boolean a(Location location, Location location2, boolean z) {
        if (location == location2) {
            return false;
        }
        if (location == null || location2 == null) {
            return true;
        }
        float speed = location2.getSpeed();
        if (z && ((a.a.a.i.i.s == 3 || !a.a.a.i.f.a().a(location2.getLongitude(), location2.getLatitude())) && speed < 5.0f)) {
            return true;
        }
        float fDistanceTo = location2.distanceTo(location);
        if (speed > a.a.a.i.i.I) {
            return fDistanceTo > a.a.a.i.i.K;
        }
        if (speed > a.a.a.i.i.H) {
            return fDistanceTo > a.a.a.i.i.J;
        }
        return fDistanceTo > 5.0f;
    }

    public static String d(Location location) {
        String strF = f(location);
        if (strF == null) {
            return strF;
        }
        return strF + "&g_tp=0";
    }

    public static String e(Location location) {
        String strF = f(location);
        if (strF == null) {
            return strF;
        }
        return strF + i0;
    }

    public static String f(Location location) {
        StringBuilder sb;
        if (location == null) {
            return null;
        }
        float speed = (float) (((double) location.getSpeed()) * 3.6d);
        if (!location.hasSpeed()) {
            speed = -1.0f;
        }
        int accuracy = (int) (location.hasAccuracy() ? location.getAccuracy() : -1.0f);
        double altitude = location.hasAltitude() ? location.getAltitude() : 555.0d;
        float bearing = location.hasBearing() ? location.getBearing() : -1.0f;
        String str = m0 < -0.01f ? String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d&ll_sn=%d|%d|%d|%d|%d&ll_asn=%d|%d|%d|%d|%d&ll_snr=%.1f", Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), Float.valueOf(speed), Float.valueOf(bearing), Integer.valueOf(accuracy), Integer.valueOf(X), Double.valueOf(altitude), Long.valueOf(location.getTime() / 1000), Integer.valueOf(X), Integer.valueOf(Y), Integer.valueOf(Z), Integer.valueOf(a0), Integer.valueOf(b0), Integer.valueOf(g0), Integer.valueOf(c0), Integer.valueOf(d0), Integer.valueOf(e0), Integer.valueOf(f0), Double.valueOf(j0)) : String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d&ll_sn=%d|%d|%d|%d|%d&ll_asn=%d|%d|%d|%d|%d&ll_snr=%.1f&ll_bp=%.2f", Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), Float.valueOf(speed), Float.valueOf(bearing), Integer.valueOf(accuracy), Integer.valueOf(X), Double.valueOf(altitude), Long.valueOf(location.getTime() / 1000), Integer.valueOf(X), Integer.valueOf(Y), Integer.valueOf(Z), Integer.valueOf(a0), Integer.valueOf(b0), Integer.valueOf(g0), Integer.valueOf(c0), Integer.valueOf(d0), Integer.valueOf(e0), Integer.valueOf(f0), Double.valueOf(j0), Float.valueOf(m0));
        try {
            if (W != 2 || V == null) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append("&ll_fake=");
                sb.append(W);
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(String.format(Locale.CHINA, "&ll_fake=%d|%.5f|%.5f|%d", Integer.valueOf(W), Double.valueOf(V.getLongitude()), Double.valueOf(V.getLatitude()), Long.valueOf(V.getTime() / 1000)));
            }
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static String m() {
        long jCurrentTimeMillis = System.currentTimeMillis() - h0;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis >= 3000) {
            return null;
        }
        return String.format(Locale.US, "&gsvn=%d&gsfn=%d", Integer.valueOf(g0), Integer.valueOf(X));
    }

    public static synchronized d n() {
        if (U == null) {
            U = new d();
        }
        return U;
    }

    public final int a(Location location) {
        if (location == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT > 17 && location.isFromMockProvider()) {
                return 100;
            }
            if (Math.abs(this.J - this.K) >= 3000) {
                this.K = -1L;
                this.N = false;
                this.M = false;
                this.L = null;
            } else if (this.L == null) {
                if (!this.M) {
                    return 200;
                }
                if (this.N) {
                    return 300;
                }
            } else if (!this.N && this.M) {
                return 400;
            }
            if (this.J > 0 && this.K == -1) {
                return 500;
            }
        } catch (Error | Exception unused) {
        }
        return 0;
    }

    public final ArrayList<ArrayList<Float>> a(ArrayList<ArrayList<Float>> arrayList, boolean z, float f2) {
        ArrayList<ArrayList<Float>> arrayList2 = new ArrayList<>();
        if (arrayList.size() <= 40 && arrayList.size() != 0) {
            for (ArrayList<Float> arrayList3 : arrayList) {
                if (arrayList3.size() == 6) {
                    float fFloatValue = arrayList3.get(3).floatValue();
                    float fFloatValue2 = arrayList3.get(2).floatValue();
                    if (!z || fFloatValue >= 1.0f) {
                        if (f2 <= 0.0f || fFloatValue2 >= f2) {
                            arrayList2.add(arrayList3);
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList<ArrayList<Float>> a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f2) {
        ArrayList<ArrayList<Float>> arrayList = new ArrayList<>();
        if (z) {
            arrayList.addAll(a(this.D, z5, f2));
        }
        if (z2) {
            arrayList.addAll(a(this.E, z5, f2));
        }
        if (z3) {
            arrayList.addAll(a(this.F, z5, f2));
        }
        if (z4) {
            arrayList.addAll(a(this.G, z5, f2));
        }
        return arrayList;
    }

    public synchronized void a() {
        if (com.baidu.location.f.f) {
            Context contextC = com.baidu.location.f.c();
            this.f263a = contextC;
            try {
                this.f264b = (LocationManager) contextC.getSystemService("location");
            } catch (Exception unused) {
            }
            this.w = new f(this);
        }
    }

    public void a(int i2) {
        b bVar;
        LocationManager locationManager;
        if (i2 != 0) {
            if (i2 == 2) {
                this.Q = false;
            } else if (i2 == 1) {
            }
            if (!this.P || this.Q || !this.h || (bVar = this.y) == null || (locationManager = this.f264b) == null) {
                return;
            }
            try {
                locationManager.unregisterGnssMeasurementsCallback(bVar);
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        this.Q = false;
        this.P = false;
        if (this.P) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0155, code lost:
    
        r0.g("bd_beidou");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.location.Location r12, int r13) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.g.d.a(android.location.Location, int):void");
    }

    public void a(com.baidu.location.c cVar) {
        if (a.a.a.i.i.k || a(this.f265c) <= 0) {
            a.a.a.b.c.h().b(cVar);
        } else {
            a.a.a.b.c.h().a(cVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    public final void a(String str, int i2, int i3, int i4) {
        if (TextUtils.isEmpty(str) || !a(str)) {
            return;
        }
        String[] strArrSplit = str.split(",");
        if (str.startsWith("$GPGGA,")) {
            if (strArrSplit.length < 7) {
                return;
            }
        } else if (str.startsWith("$GPRMC,") && strArrSplit.length < 6) {
            return;
        }
        if (TextUtils.isEmpty(strArrSplit[i2].trim()) || strArrSplit[i2].trim().length() <= 2) {
            this.L = null;
        } else {
            try {
                double dDoubleValue = Double.valueOf(strArrSplit[i2].substring(0, 2)).doubleValue() + (Double.valueOf(strArrSplit[i2].substring(2)).doubleValue() / 60.0d);
                if (this.L == null) {
                    this.L = new com.baidu.location.c();
                }
                this.L.c(dDoubleValue);
            } catch (NumberFormatException unused) {
                this.N = true;
            }
        }
        if (this.L == null || TextUtils.isEmpty(strArrSplit[i3].trim()) || strArrSplit[i3].trim().length() <= 3) {
            this.L = null;
        } else {
            try {
                this.L.d(Double.valueOf(strArrSplit[i3].substring(0, 3)).doubleValue() + (Double.valueOf(strArrSplit[i3].substring(3)).doubleValue() / 60.0d));
            } catch (NumberFormatException unused2) {
                this.N = true;
            }
        }
        if (!TextUtils.isEmpty(strArrSplit[i4].trim())) {
            if (i4 == 2) {
                if (TextUtils.equals(strArrSplit[i4], "V")) {
                    this.M = false;
                } else if (TextUtils.equals(strArrSplit[i4], "A")) {
                    this.M = true;
                }
            } else if (i4 == 6) {
                if (TextUtils.equals(strArrSplit[i4], "0")) {
                    this.M = false;
                } else {
                    this.M = true;
                }
            }
        }
        if (this.L != null) {
            this.N = false;
        }
        this.K = System.currentTimeMillis();
    }

    public final void a(String str, Location location) {
        if (location == null) {
            return;
        }
        String str2 = str + a.a.a.b.c.h().d();
        boolean zT = a.a.a.g.f.w().t();
        a.a.a.g.a aVarA = a.a.a.g.f.w().a();
        if (aVarA != null) {
            u.a(new a.a.a.g.a(aVarA));
        }
        u.a(System.currentTimeMillis());
        u.a(new Location(location));
        u.b(str2);
        u.a(a.a.a.b.f.c().a());
        if (zT) {
            return;
        }
        y.a(u.d(), (k) null, u.c(), str2, u.a());
    }

    public final void a(ArrayList<ArrayList<Float>> arrayList) {
        String string;
        if (arrayList == null || arrayList.size() <= 0) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder(100);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.D);
            sb.append(a.a.a.i.c.a(arrayList2));
            sb.append("|");
            sb.append(a.a.a.i.c.b(arrayList2));
            sb.append("|");
            sb.append(a.a.a.i.c.c(arrayList2));
            sb.append("|");
            sb.append(a.a.a.i.c.h(arrayList2));
            sb.append("|");
            sb.append(a.a.a.i.c.d(arrayList2));
            sb.append("|");
            sb.append(a.a.a.i.c.e(arrayList2));
            sb.append("|");
            sb.append(a.a.a.i.c.f(arrayList2));
            sb.append("|");
            sb.append(a.a.a.i.c.g(arrayList2));
            string = sb.toString();
        }
        this.H = string;
        this.I = System.currentTimeMillis();
    }

    public void a(boolean z) {
        if (z) {
            k();
        } else {
            l();
        }
    }

    public final boolean a(String str) {
        int i2;
        if (str.indexOf("*") != -1 && str.indexOf("$") != -1 && str.indexOf("$") <= str.indexOf("*") && str.length() >= str.indexOf("*")) {
            byte[] bytes = str.substring(0, str.indexOf("*")).getBytes();
            int i3 = bytes[1];
            for (int i4 = 2; i4 < bytes.length; i4++) {
                i3 ^= bytes[i4];
            }
            String str2 = String.format("%02x", Integer.valueOf(i3));
            int iIndexOf = str.indexOf("*");
            if (iIndexOf != -1 && str.length() >= (i2 = iIndexOf + 3) && str2.equalsIgnoreCase(str.substring(iIndexOf + 1, i2))) {
                return true;
            }
        }
        return false;
    }

    public final String b(ArrayList<ArrayList<Float>> arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() == 0) {
            return sb.toString();
        }
        boolean z = true;
        for (ArrayList<Float> arrayList2 : arrayList) {
            if (arrayList2.size() == 6) {
                if (z) {
                    z = false;
                } else {
                    sb.append("|");
                }
                sb.append(String.format("%.1f;", arrayList2.get(0)));
                sb.append(String.format("%.1f;", arrayList2.get(1)));
                sb.append(String.format("%.1f;", arrayList2.get(2)));
                sb.append(String.format("%.0f;", arrayList2.get(3)));
                sb.append(String.format("%.0f;", arrayList2.get(4)));
                sb.append(String.format("%.0f", arrayList2.get(5)));
            }
        }
        return sb.toString();
    }

    public synchronized void b() {
        l();
        if (this.f264b == null) {
            return;
        }
        try {
            f fVar = this.w;
            if (fVar != null) {
                fVar.removeCallbacksAndMessages(null);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f264b = null;
        if (a.a.a.b.d.i().F == 1 && a.a.a.b.i.d().c()) {
            a.a.a.b.i.d().a();
        }
    }

    public final void b(Location location) {
        if (this.w == null || System.currentTimeMillis() - this.O <= 3000) {
            return;
        }
        this.w.sendMessage(this.w.obtainMessage(1, location));
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str) || !a(str)) {
            return;
        }
        if (str.startsWith("$GPGGA,")) {
            a(str, 2, 4, 6);
        } else if (str.startsWith("$GPRMC,")) {
            a(str, 3, 5, 2);
        }
    }

    public final void b(boolean z) {
        this.p = z;
        m0 = -1.0f;
    }

    public synchronized String c() {
        String str;
        str = "-2";
        try {
            if (Math.abs(System.currentTimeMillis() - this.I) < 3000) {
                str = this.H;
                if (str == null) {
                    str = "0";
                }
            } else {
                str = "-1";
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "&gnsf=" + str;
    }

    public String d() {
        boolean z;
        if (this.f265c == null) {
            return null;
        }
        String str = "{\"result\":{\"time\":\"" + a.a.a.i.i.i() + "\",\"error\":\"61\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%d\",\"d\":\"%f\",\"s\":\"%f\",\"n\":\"%d\"";
        int accuracy = (int) (this.f265c.hasAccuracy() ? this.f265c.getAccuracy() : 10.0f);
        float speed = (float) (((double) this.f265c.getSpeed()) * 3.6d);
        if (!this.f265c.hasSpeed()) {
            speed = -1.0f;
        }
        double[] dArrA = new double[2];
        if (a.a.a.i.f.a().a(this.f265c.getLongitude(), this.f265c.getLatitude())) {
            dArrA = Jni.a(this.f265c.getLongitude(), this.f265c.getLatitude(), "gps2gcj");
            if (dArrA[0] <= 0.0d && dArrA[1] <= 0.0d) {
                dArrA[0] = this.f265c.getLongitude();
                dArrA[1] = this.f265c.getLatitude();
            }
            z = true;
        } else {
            dArrA[0] = this.f265c.getLongitude();
            dArrA[1] = this.f265c.getLatitude();
            if (dArrA[0] <= 0.0d && dArrA[1] <= 0.0d) {
                dArrA[0] = this.f265c.getLongitude();
                dArrA[1] = this.f265c.getLatitude();
            }
            z = false;
        }
        String str2 = String.format(Locale.CHINA, str, Double.valueOf(dArrA[0]), Double.valueOf(dArrA[1]), Integer.valueOf(accuracy), Float.valueOf(this.f265c.getBearing()), Float.valueOf(speed), Integer.valueOf(X));
        if (!z) {
            str2 = str2 + ",\"in_cn\":\"0\"";
        }
        if (!a.a.a.i.i.k) {
            str2 = str2 + String.format(Locale.CHINA, ",\"is_mock\":%d", Integer.valueOf(a(this.f265c)));
        }
        if (this.f265c.hasAltitude()) {
            return str2 + String.format(Locale.CHINA, ",\"h\":%.2f}}", Double.valueOf(this.f265c.getAltitude()));
        }
        return str2 + "}}";
    }

    public Location e() {
        if (this.f265c != null && Math.abs(System.currentTimeMillis() - this.f265c.getTime()) <= 60000) {
            return this.f265c;
        }
        return null;
    }

    public String f() {
        Location location;
        if (!j() || (location = this.f265c) == null) {
            return null;
        }
        return String.format("%s&idgps_tp=%s", f(location).replaceAll("ll", "idll").replaceAll("&d=", "&idd=").replaceAll("&s", "&ids="), this.f265c.getProvider());
    }

    public com.baidu.location.c g() {
        if (this.L != null && Math.abs(System.currentTimeMillis() - this.K) <= 3000) {
            return this.L;
        }
        return null;
    }

    public boolean h() {
        return this.S;
    }

    public boolean i() {
        try {
            System.currentTimeMillis();
            if (X == 0) {
                try {
                    this.f265c.getExtras().getInt("satellites");
                } catch (Exception unused) {
                }
            }
            Location location = this.f265c;
            return (location == null || location.getLatitude() == 0.0d || this.f265c.getLongitude() == 0.0d) ? false : true;
        } catch (Exception unused2) {
            Location location2 = this.f265c;
            return (location2 == null || location2.getLatitude() == 0.0d || this.f265c.getLongitude() == 0.0d) ? false : true;
        }
    }

    public boolean j() {
        if (!i() || a.a.a.i.i.k() || System.currentTimeMillis() - this.q > 10000) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.n || jCurrentTimeMillis - this.m >= 3000) {
            return this.p;
        }
        return true;
    }

    public void k() {
        if (this.o) {
            return;
        }
        a aVar = null;
        try {
            if (!this.h) {
                e eVar = new e(this, aVar);
                this.i = eVar;
                this.f264b.addGpsStatusListener(eVar);
            } else if (a.a.a.i.i.a(this.f263a, "android.permission.ACCESS_FINE_LOCATION") == 1) {
                C0015d c0015d = new C0015d(this, aVar);
                this.g = c0015d;
                this.f264b.registerGnssStatusCallback(c0015d);
            }
            i iVar = new i(this, aVar);
            this.e = iVar;
            this.f264b.requestLocationUpdates("passive", 9000L, 0.0f, iVar);
        } catch (Exception unused) {
        }
        try {
            this.d = new g(this, aVar);
            try {
                this.f264b.sendExtraCommand("gps", "force_xtra_injection", new Bundle());
            } catch (Exception unused2) {
            }
            if (a.a.a.i.i.a(this.f263a, "android.permission.ACCESS_FINE_LOCATION") == 1) {
                this.f264b.requestLocationUpdates("gps", 1000L, 0.0f, this.d);
                this.S = true;
            }
            if (this.h && this.z == null && a.a.a.i.i.u0 == 1 && new Random().nextDouble() < a.a.a.i.i.t0) {
                this.z = new c(this, aVar);
            }
            c cVar = this.z;
            if (cVar != null) {
                this.f264b.registerGnssNavigationMessageCallback(cVar);
            }
            System.currentTimeMillis();
            if (!a.a.a.i.i.k && a.a.a.i.i.N0 == 1) {
                if (Build.VERSION.SDK_INT >= 24) {
                    a aVar2 = new a();
                    this.l = aVar2;
                    this.f264b.addNmeaListener(aVar2);
                } else {
                    this.k = new h(this, aVar);
                    Class.forName("android.location.LocationManager").getMethod("addNmeaListener", GpsStatus.NmeaListener.class).invoke(this.f264b, this.k);
                }
            }
            this.o = true;
        } catch (Exception unused3) {
        }
    }

    public void l() {
        C0015d c0015d;
        if (this.o) {
            LocationManager locationManager = this.f264b;
            if (locationManager != null) {
                try {
                    e eVar = this.i;
                    if (eVar != null) {
                        locationManager.removeGpsStatusListener(eVar);
                        this.i = null;
                    }
                    if (this.h && (c0015d = this.g) != null) {
                        this.f264b.unregisterGnssStatusCallback(c0015d);
                        this.g = null;
                    }
                    i iVar = this.e;
                    if (iVar != null) {
                        this.f264b.removeUpdates(iVar);
                        this.e = null;
                    }
                } catch (Exception unused) {
                }
                try {
                    g gVar = this.d;
                    if (gVar != null) {
                        this.f264b.removeUpdates(gVar);
                        this.S = false;
                    }
                    OnNmeaMessageListener onNmeaMessageListener = this.l;
                    if (onNmeaMessageListener != null) {
                        this.f264b.removeNmeaListener(onNmeaMessageListener);
                    }
                    if (this.k != null) {
                        Class.forName("android.location.LocationManager").getMethod("removeNmeaListener", GpsStatus.NmeaListener.class).invoke(this.f264b, this.k);
                    }
                    c cVar = this.z;
                    if (cVar != null) {
                        this.f264b.unregisterGnssNavigationMessageCallback(cVar);
                    }
                    a(0);
                } catch (Exception unused2) {
                }
            }
            a.a.a.i.i.f356c = 0;
            a.a.a.i.i.s = 0;
            this.d = null;
            this.o = false;
            b(false);
        }
    }
}
