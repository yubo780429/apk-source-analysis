package a.a.a.d;

import a.a.a.b.n;
import a.a.a.b.t;
import a.a.a.b.w;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.baidu.location.Jni;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class i implements SensorEventListener {
    public double A;
    public double B;
    public boolean C;
    public List<l> D;
    public int E;
    public int F;
    public int G;
    public a.a.a.d.a H;
    public String I;
    public a.a.a.d.g J;
    public boolean K;
    public boolean L;
    public a.a.a.d.l M;
    public SimpleDateFormat N;
    public int O;
    public com.baidu.location.c P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public f T;
    public h U;
    public j V;
    public e W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f150c;
    public long d;
    public volatile boolean e;
    public g f;
    public k g;
    public m h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public a.a.a.d.k.c n;
    public int o;
    public String p;
    public String q;
    public a.a.a.d.j r;
    public String s;
    public String t;
    public int u;
    public int v;
    public a.a.a.d.f<String> w;
    public int x;
    public a.a.a.d.f<String> y;
    public double z;

    public class a implements a.a.a.d.l.b {
    }

    public class b implements a.a.a.d.k.c {
        public b() {
        }

        @Override // a.a.a.d.k.c
        public synchronized void a(double d, double d2, double d3, long j, String str) {
            if (i.this.i) {
                i.this.B = 0.4d;
                i.this.U.a(d, d2, d3, j);
                double[] dArrA = a.a.a.d.m.b.a.a(i.this.p, d, d2, d3, str);
                if (dArrA != null && dArrA[0] != -1.0d && dArrA[0] == 0.0d) {
                    i.this.A = dArrA[2];
                    i.this.z = dArrA[1];
                    if (i.this.D.size() > 50) {
                        i.this.D.clear();
                    }
                    i.this.D.add(new l(i.this, a.a.a.d.k.e().d(), d, d3, d2));
                    i.j(i.this);
                    try {
                        com.baidu.location.c cVar = new com.baidu.location.c();
                        cVar.h(161);
                        cVar.c(dArrA[2]);
                        cVar.d(dArrA[1]);
                        cVar.a((float) d3);
                        cVar.n(i.this.N.format(new Date()));
                        cVar.f(i.this.p);
                        cVar.c(i.this.q);
                        cVar.d(i.this.s);
                        cVar.l(i.this.u);
                        cVar.a(true);
                        if (i.this.K) {
                            cVar.b(8.0f);
                        } else {
                            cVar.b(15.0f);
                        }
                        cVar.a("res", dArrA);
                        cVar.b((float) dArrA[5]);
                        cVar.a((float) dArrA[6]);
                        cVar.c((float) dArrA[8]);
                        cVar.l("dr");
                        com.baidu.location.c cVar2 = new com.baidu.location.c(cVar);
                        cVar2.l("dr2");
                        if (i.this.M == null || !i.this.M.a()) {
                            i.this.a(cVar2, 21);
                        } else {
                            i.this.M.a(cVar2);
                        }
                        if (!i.this.U.a(cVar, dArrA[5], "dr")) {
                            i.this.l();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public class c implements a.a.a.d.m.c.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f152a;

        public c(String str, String str2) {
            this.f152a = str2;
        }

        @Override // a.a.a.d.m.c.a.d
        public void a(boolean z, String str) {
            i.this.Q = z;
            if (z) {
                i.this.R = a.a.a.d.m.b.a.a(this.f152a);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float[] f154b;

        public d(i iVar, float[] fArr) {
            this.f154b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.a.a.d.h.a(this.f154b[0], System.currentTimeMillis());
        }
    }

    public class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<Double> f156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<String> f157c;
        public Map<String, Integer> h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f155a = null;
        public Map<String, Double> d = null;
        public int e = 0;
        public int f = 0;
        public String g = null;

        public e(i iVar) {
            this.f156b = null;
            this.f157c = null;
            this.h = null;
            this.f156b = new ArrayList<>();
            this.f157c = new ArrayList<>();
            this.h = new HashMap();
        }

        public final int a(com.baidu.location.c cVar) {
            if (!cVar.e().equals(this.g)) {
                this.g = cVar.e();
                b();
            }
            if (b(cVar.a("p_floor")) != 0) {
                this.f = 0;
                return 1;
            }
            try {
                double dDoubleValue = 0.0d;
                if (this.f157c.size() == 0) {
                    for (Map.Entry<String, Double> entry : this.d.entrySet()) {
                        this.f157c.add(entry.getKey());
                        this.f156b.add(entry.getValue());
                    }
                } else {
                    ArrayList<String> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it = this.f157c.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                        arrayList2.add(Double.valueOf(0.0d));
                    }
                    HashMap map = new HashMap();
                    for (Map.Entry<String, Double> entry2 : this.d.entrySet()) {
                        String key = entry2.getKey();
                        Double value = entry2.getValue();
                        map.put(key, value);
                        if (!this.f157c.contains(key)) {
                            arrayList.add(key);
                            arrayList2.add(value);
                        }
                    }
                    Iterator<Double> it2 = this.d.values().iterator();
                    double dDoubleValue2 = 0.0d;
                    while (it2.hasNext()) {
                        dDoubleValue2 += it2.next().doubleValue();
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList2.set(i, map.containsKey(arrayList.get(i)) ? map.get(arrayList.get(i)) : Double.valueOf((1.0d - dDoubleValue2) / ((double) (this.e - map.size()))));
                    }
                    ArrayList<Double> arrayList3 = new ArrayList<>();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        arrayList3.add(Double.valueOf(0.0d));
                    }
                    for (int i3 = 0; i3 < this.f157c.size(); i3++) {
                        Double d = this.f156b.get(i3);
                        ArrayList<Double> arrayListA = a(arrayList, this.f157c.get(i3));
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            arrayList3.set(i4, Double.valueOf(arrayList3.get(i4).doubleValue() + (d.doubleValue() * arrayListA.get(i4).doubleValue() * ((Double) arrayList2.get(i4)).doubleValue())));
                        }
                    }
                    this.f157c = arrayList;
                    this.f156b = a(arrayList3);
                }
                String str = null;
                for (int i5 = 0; i5 < this.f157c.size(); i5++) {
                    if (this.f156b.get(i5).doubleValue() > dDoubleValue) {
                        dDoubleValue = this.f156b.get(i5).doubleValue();
                        str = this.f157c.get(i5);
                    }
                }
                this.f155a = str;
            } catch (Exception unused) {
                this.f = 0;
            }
            this.f = 1;
            return 0;
        }

        public final int a(String str) {
            int i;
            if (this.h.containsKey(str)) {
                return this.h.get(str).intValue();
            }
            try {
                if (str.startsWith("F") || str.startsWith("f")) {
                    i = Integer.parseInt(str.substring(1)) - 1;
                } else {
                    i = (str.startsWith("B") || str.startsWith("b")) ? -Integer.parseInt(str.substring(1)) : 1000;
                }
            } catch (Exception unused) {
            }
            this.h.put(str, Integer.valueOf(i));
            return i;
        }

        public final String a() {
            return this.f155a;
        }

        public final ArrayList<Double> a(ArrayList<Double> arrayList) {
            ArrayList<Double> arrayList2 = new ArrayList<>();
            Double dValueOf = Double.valueOf(0.0d);
            Iterator<Double> it = arrayList.iterator();
            while (it.hasNext()) {
                dValueOf = Double.valueOf(dValueOf.doubleValue() + it.next().doubleValue());
            }
            Iterator<Double> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(it2.next().doubleValue() / dValueOf.doubleValue()));
            }
            return arrayList2;
        }

        public final ArrayList<Double> a(ArrayList<String> arrayList, String str) {
            int i;
            ArrayList<Double> arrayList2 = new ArrayList<>();
            double[] dArr = {180.0d, 10.0d, 1.0d};
            int iA = a(str);
            if (iA == 1000) {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Double.valueOf(it.next().equals(str) ? dArr[0] : dArr[2]));
                }
                return arrayList2;
            }
            Iterator<String> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int iA2 = a(it2.next());
                if (iA2 == 1000) {
                    i = 2;
                } else {
                    i = iA > iA2 ? iA - iA2 : iA2 - iA;
                }
                if (i > 2) {
                    i = 2;
                }
                arrayList2.add(Double.valueOf(dArr[i]));
            }
            return arrayList2;
        }

        public final int b(String str) {
            try {
                String[] strArrSplit = str.split(";");
                if (strArrSplit.length <= 1) {
                    return 1;
                }
                this.e = Integer.parseInt(strArrSplit[0]);
                this.d = new HashMap();
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].split(":");
                    this.d.put(strArrSplit2[0], Double.valueOf(Double.parseDouble(strArrSplit2[1])));
                }
                return 0;
            } catch (Exception unused) {
                return 1;
            }
        }

        public final void b() {
            this.f156b.clear();
            this.f157c.clear();
            this.h.clear();
        }
    }

    public class f {
        public f(i iVar) {
        }

        public double a(double d, double d2, double d3, double d4) {
            double[] dArrA = a(d2, d3);
            double dAbs = Math.abs(d4 - dArrA[0]);
            return dAbs > dArrA[1] * 2.0d ? d + dAbs : d;
        }

        public double[] a(double d, double d2) {
            return a.a.a.c.a.d().a(d, d2);
        }
    }

    public class g extends Handler {
        public g() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            if (com.baidu.location.f.f) {
                int i = message.what;
                if (i == 21) {
                    i.this.a(message);
                    return;
                }
                if (i == 41) {
                    i.this.h();
                } else if (i != 801) {
                    super.dispatchMessage(message);
                } else {
                    i.this.a((com.baidu.location.c) message.obj);
                }
            }
        }
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f159a = -1.0d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f160b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f161c = 0;
        public long d = 0;
        public long e = 0;
        public long f = 0;
        public long g = 0;
        public long h = 0;
        public double i = 0.0d;
        public double j = 0.0d;
        public double k = 0.0d;
        public double l = 0.0d;
        public int m = 0;
        public int n = 0;
        public a.a.a.g.k o = null;
        public long p = 0;
        public int q = 0;
        public int r = 0;

        public h() {
        }

        public final void a(double d, double d2, double d3, long j) {
            this.g = j;
            this.r = 0;
        }

        public final void a(Location location, boolean z) {
            this.h = System.currentTimeMillis();
            double longitude = location.getLongitude();
            double latitude = location.getLatitude();
            double d = this.i;
            if (d != 0.0d) {
                float[] fArr = new float[2];
                Location.distanceBetween(this.j, d, latitude, longitude, fArr);
                if (fArr[0] < 20.0f) {
                    this.m++;
                } else {
                    this.m = 0;
                }
                if (fArr[0] < 5.0f) {
                    this.n++;
                } else {
                    this.n = 0;
                }
            }
            this.i = longitude;
            this.j = latitude;
            if (location.hasSpeed() && location.getSpeed() > 3.0f) {
                this.e = System.currentTimeMillis();
            }
            if (location.getAccuracy() >= 50.0f || z) {
                this.q = 0;
            } else {
                this.q++;
            }
            if (this.q <= 10 || System.currentTimeMillis() - this.f160b <= 30000) {
                return;
            }
            i.this.l();
        }

        public final boolean a() {
            System.currentTimeMillis();
            if (i.this.i || this.m < 3) {
                return false;
            }
            if (!a.a.a.g.f.w().l().contains("&wifio") && i.this.f148a != 1) {
                return false;
            }
            this.r = 1;
            return true;
        }

        public final boolean a(double d, double d2, double d3) {
            if (!i.this.U.c()) {
                return true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.f161c;
            if (j != 0 && jCurrentTimeMillis - j > 10000) {
                return true;
            }
            if (this.n >= 5 && d3 < 15.0d && jCurrentTimeMillis - this.f160b > 20000) {
                float[] fArr = new float[2];
                Location.distanceBetween(this.l, this.k, d2, d, fArr);
                if (fArr[0] > 30.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean a(com.baidu.location.c cVar, double d, String str) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f = jCurrentTimeMillis;
            this.f159a = d;
            this.k = cVar.t();
            this.l = cVar.q();
            if (str.equals("wifi")) {
                this.f160b = jCurrentTimeMillis;
            }
            str.equals("gps");
            if (b()) {
                this.f161c = jCurrentTimeMillis;
            }
            i iVar = i.this;
            iVar.f149b = iVar.a(cVar.t(), cVar.q());
            if (i.this.f149b || i.this.f148a == 1) {
                this.d = jCurrentTimeMillis;
            }
            long j = this.p;
            if (j != 0 && jCurrentTimeMillis - j > 30000 && jCurrentTimeMillis - this.g < 10000 && jCurrentTimeMillis - this.h < 10000) {
                return false;
            }
            if (this.q > 10 && jCurrentTimeMillis - this.f160b > 30000) {
                return false;
            }
            if (jCurrentTimeMillis - this.d > 10000 && jCurrentTimeMillis - this.f160b > 30000) {
                return false;
            }
            long j2 = this.f161c;
            return j2 == 0 || jCurrentTimeMillis - j2 <= 60000;
        }

        public final boolean b() {
            if (this.r == 1 || !c() || this.f159a > 25.0d || System.currentTimeMillis() - this.f > 30000) {
                return false;
            }
            this.f161c = System.currentTimeMillis();
            return true;
        }

        public final boolean c() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.e < 10000 && jCurrentTimeMillis - this.f160b > 30000) {
                return false;
            }
            if (jCurrentTimeMillis - this.h >= 10000) {
                return true;
            }
            long j = this.g;
            return j == 0 || jCurrentTimeMillis - j <= 16000 || jCurrentTimeMillis - this.f160b <= 30000;
        }

        public final void d() {
            this.f159a = -1.0d;
            this.f160b = 0L;
            this.f161c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = 0.0d;
            this.j = 0.0d;
            this.m = 0;
            this.n = 0;
            this.o = null;
            this.p = 0L;
            this.q = 0;
            this.r = 0;
        }

        public final void e() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            a.a.a.g.k kVarJ = a.a.a.g.f.w().j();
            if (kVarJ.f295a == null) {
                return;
            }
            a.a.a.g.k kVar = this.o;
            if (kVar == null || !kVarJ.a(kVar)) {
                this.p = jCurrentTimeMillis;
                this.o = kVarJ;
            }
        }
    }

    /* JADX INFO: renamed from: a.a.a.d.i$i, reason: collision with other inner class name */
    public static class C0007i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static i f162a = new i(null);
    }

    public class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f163a = 10;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<a> f164b = Collections.synchronizedList(new ArrayList());

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public double f165a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public double f166b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public double f167c;
        }

        public j(i iVar) {
        }

        public String toString() {
            if (this.f164b.size() == 0) {
                return "";
            }
            try {
                StringBuffer stringBuffer = new StringBuffer();
                double d = this.f164b.get(0).f165a;
                double d2 = this.f164b.get(0).f166b;
                int i = 1;
                stringBuffer.append(String.format("%.6f:%.6f:%.1f", Double.valueOf(d), Double.valueOf(d2), Double.valueOf(this.f164b.get(0).f167c)));
                int size = this.f164b.size() > this.f163a ? this.f164b.size() - this.f163a : 0;
                while (true) {
                    size += i;
                    if (size >= this.f164b.size()) {
                        return stringBuffer.toString();
                    }
                    double d3 = d;
                    stringBuffer.append(String.format(";%.0f:%.0f:%.1f", Double.valueOf((this.f164b.get(size).f165a - d) * 1000000.0d), Double.valueOf((this.f164b.get(size).f166b - d2) * 1000000.0d), Double.valueOf(this.f164b.get(size).f167c)));
                    i = 1;
                    d = d3;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
    }

    public class k extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f168b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f169c = 0;
        public long d = 0;

        public k() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            i iVar;
            long j;
            while (this.f168b) {
                if (i.this.f148a != 1 || i.this.f149b) {
                    iVar = i.this;
                    j = 3000;
                } else {
                    iVar = i.this;
                    j = 5000;
                }
                iVar.d = j;
                if (System.currentTimeMillis() - this.f169c > i.this.d) {
                    a.a.a.g.f.w().b(a.a.a.g.f.w().g());
                    this.f169c = System.currentTimeMillis();
                    i.this.e = false;
                }
                if (a.a.a.g.f.w().q()) {
                    this.d = 0L;
                } else {
                    long j2 = this.d + 1;
                    this.d = j2;
                    if (j2 >= 10) {
                        this.f168b = false;
                        i.this.l();
                        return;
                    }
                }
                if (i.this.i && i.this.U != null && System.currentTimeMillis() - i.this.l > 30000 && System.currentTimeMillis() - i.this.U.f161c > 30000) {
                    i.m().l();
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    this.f168b = false;
                    return;
                }
            }
        }
    }

    public class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f172c;
        public int d = 1;
        public double e;

        public l(i iVar, int i, double d, double d2, double d3) {
            this.f170a = i;
            this.f171b = d;
            this.f172c = d2;
            this.e = d3;
        }

        public String toString() {
            return this.f172c == this.e ? String.format("%d:%.1f:%.2f", Integer.valueOf(this.d), Double.valueOf(this.f172c), Double.valueOf(this.f171b)) : String.format("%d:%.1f:%.2f:%.1f", Integer.valueOf(this.d), Double.valueOf(this.f172c), Double.valueOf(this.f171b), Double.valueOf(this.e));
        }
    }

    public class m extends a.a.a.i.g {
        public boolean i = false;
        public boolean j = false;
        public String k = null;
        public String l = null;
        public long m = 0;
        public long n = 0;

        public class a implements a.a.a.d.g.c {
            public a() {
            }

            @Override // a.a.a.d.g.c
            public void a(boolean z, String str, String str2, String str3) {
                if (z) {
                    i.this.I = "&ibuuid=" + str + "&ibname=" + str2 + "&ibfls=" + str3;
                }
            }
        }

        public m() {
            this.d = new HashMap();
        }

        @Override // a.a.a.i.g
        public void a() {
            if (i.this.q == null || i.this.r == null || !i.this.q.equals(i.this.r.a())) {
                this.k = "&nd_idf=1&indoor_polygon=1" + this.k;
            }
            this.f338b = 1;
            if (n.b().a()) {
                this.k += "&enc=2";
            }
            String strK = a.a.a.g.f.w().k();
            if (strK != null) {
                this.f = Jni.f(strK);
            }
            String strF = Jni.f(this.k);
            this.k = null;
            this.d.put("bloc", strF);
            this.n = System.currentTimeMillis();
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
        
            r8 = r7.f339c;
         */
        @Override // a.a.a.i.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(boolean r8) {
            /*
                Method dump skipped, instruction units count: 319
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.d.i.m.a(boolean):void");
        }

        public synchronized void b() {
            if (this.i) {
                return;
            }
            if (this.j) {
                this.j = false;
                c();
            }
        }

        public void c() {
            boolean z;
            String str;
            if (this.i) {
                this.j = true;
                return;
            }
            if (i.this.f148a != 1 || i.this.f149b || System.currentTimeMillis() - this.m >= 30000 || System.currentTimeMillis() - i.this.U.f160b <= 30000) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.n;
                if (jCurrentTimeMillis >= 1000 || jCurrentTimeMillis <= 0) {
                    StringBuffer stringBuffer = new StringBuffer(1024);
                    String strA = a.a.a.g.f.w().a(a.a.a.g.f.w().a());
                    String strF = a.a.a.g.d.n().f();
                    stringBuffer.append(a.a.a.g.d.n().c());
                    i.this.B = 0.5d;
                    if (i.this.J == null || i.this.J.d() == null || !i.this.J.g()) {
                        z = false;
                    } else {
                        stringBuffer.append("&bleand=");
                        stringBuffer.append(i.this.J.d());
                        stringBuffer.append("&bleand_et=");
                        stringBuffer.append(i.this.J.e());
                        z = true;
                    }
                    a.a.a.g.k kVarJ = a.a.a.g.f.w().j();
                    String strA2 = i.this.a(kVarJ);
                    if (strA2 == null) {
                        strA2 = a.a.a.g.f.w().a(i.this.f150c, true, kVarJ, a.a.a.i.i.q0);
                    }
                    if (!z) {
                        if (strA2 == null || strA2.length() < 10) {
                            return;
                        }
                        String str2 = this.l;
                        if (str2 != null && str2.equals(strA2)) {
                            return;
                        }
                    }
                    this.l = strA2;
                    this.i = true;
                    stringBuffer.append(strA);
                    if (strF != null) {
                        stringBuffer.append(strF);
                    }
                    stringBuffer.append("&coor=gcj02");
                    stringBuffer.append("&lt=1");
                    if (strA2 != null && !"null".equals(strA2) && !"".equals(strA2)) {
                        stringBuffer.append(strA2);
                    }
                    String strC = a.a.a.d.k.e().c();
                    if (i.this.F <= 2 && strC != null) {
                        stringBuffer.append("&idsl=" + strC);
                    }
                    int size = i.this.D.size();
                    stringBuffer.append(i.this.a(size));
                    i.this.E = size;
                    i.a(i.this);
                    stringBuffer.append("&drsi=" + i.this.F);
                    stringBuffer.append("&drc=" + i.this.o);
                    if (i.this.z != 0.0d && i.this.A != 0.0d) {
                        stringBuffer.append("&lst_idl=" + String.format(Locale.CHINA, "%.5f:%.5f", Double.valueOf(i.this.z), Double.valueOf(i.this.A)));
                    }
                    i.this.o = 0;
                    stringBuffer.append("&idpfv=1");
                    stringBuffer.append("&iflxy=" + i.this.V.toString());
                    i.this.V.f164b.clear();
                    i.b(i.this);
                    if (i.this.I != null) {
                        stringBuffer.append(i.this.I);
                        i.this.I = null;
                    }
                    String strD = a.a.a.b.c.h().d();
                    if (strD != null) {
                        stringBuffer.append(strD);
                    }
                    stringBuffer.append(a.a.a.i.b.e().a(true));
                    stringBuffer.append(a.a.a.b.f.c().a());
                    stringBuffer.append(a.a.a.i.i.e(com.baidu.location.f.c()));
                    int iC = a.a.a.i.i.c(com.baidu.location.f.c());
                    if (iC >= 0) {
                        stringBuffer.append("&lmd=");
                        stringBuffer.append(iC);
                    }
                    String string = stringBuffer.toString();
                    this.k = string;
                    if (string.length() > a.a.a.i.i.F0) {
                        String[] strArrSplit = this.k.split("&cl_list=");
                        if (strArrSplit.length == 2) {
                            String[] strArrSplit2 = strArrSplit[1].split("&", 2);
                            if (strArrSplit2.length == 2) {
                                str = strArrSplit[0] + "&cl_list=null&" + strArrSplit2[1];
                            } else {
                                str = strArrSplit[0] + "&cl_list=null";
                            }
                            this.k = str;
                        }
                    }
                    ExecutorService executorServiceA = w.d().a();
                    if (executorServiceA != null) {
                        a(executorServiceA, a.a.a.i.d.f324b);
                    } else {
                        a(a.a.a.i.d.f324b);
                    }
                    this.m = System.currentTimeMillis();
                }
            }
        }
    }

    public i() {
        this.f148a = 0;
        this.f149b = false;
        this.f150c = 32;
        this.d = 3000L;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.l = 0L;
        this.m = 0;
        this.o = 0;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.u = 0;
        this.v = 5;
        this.w = null;
        this.x = 20;
        this.y = null;
        this.z = 0.0d;
        this.A = 0.0d;
        this.D = Collections.synchronizedList(new ArrayList());
        this.E = -1;
        this.F = 0;
        this.G = 0;
        this.I = null;
        this.J = null;
        this.K = false;
        this.L = false;
        this.N = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.O = 2;
        this.P = null;
        this.Q = false;
        this.S = false;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.f = new g();
        try {
            a.a.a.d.m.c.a.a(com.baidu.location.f.c());
        } catch (Exception unused) {
        }
        try {
            a.a.a.d.m.c.b.a(com.baidu.location.f.c());
        } catch (Exception unused2) {
        }
        a.a.a.d.l lVar = new a.a.a.d.l();
        this.M = lVar;
        lVar.a(1000L);
        this.n = new b();
        this.h = new m();
        this.w = new a.a.a.d.f<>(this.v);
        this.y = new a.a.a.d.f<>(this.x);
        this.H = new a.a.a.d.a(com.baidu.location.f.c());
        this.T = new f(this);
        this.U = new h();
        this.V = new j(this);
        this.W = new e(this);
    }

    public /* synthetic */ i(a aVar) {
        this();
    }

    public static /* synthetic */ int B(i iVar) {
        int i = iVar.m;
        iVar.m = i + 1;
        return i;
    }

    public static /* synthetic */ int a(i iVar) {
        int i = iVar.F;
        iVar.F = i + 1;
        return i;
    }

    public static /* synthetic */ int b(i iVar) {
        int i = iVar.G;
        iVar.G = i + 1;
        return i;
    }

    public static /* synthetic */ int j(i iVar) {
        int i = iVar.o;
        iVar.o = i + 1;
        return i;
    }

    public static i m() {
        return C0007i.f162a;
    }

    public final String a(int i) {
        if (this.D.size() == 0) {
            return "&dr=0:0";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("&dr=");
            this.D.get(0).d = 1;
            sb.append(this.D.get(0).toString());
            int i2 = this.D.get(0).f170a;
            for (int i3 = 1; i3 < this.D.size() && i3 <= i; i3++) {
                this.D.get(i3).d = this.D.get(i3).f170a - i2;
                sb.append(";");
                sb.append(this.D.get(i3).toString());
                i2 = this.D.get(i3).f170a;
            }
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "&dr=0:0";
        }
    }

    public final String a(a.a.a.g.k kVar) {
        int iC = kVar.c();
        if (iC <= this.f150c) {
            String strA = a.a.a.g.f.w().a(this.f150c, true, kVar, a.a.a.i.i.q0);
            if (strA == null || "null".equals(strA)) {
                return "&aprk=0";
            }
            return strA + "&aprk=0";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < iC; i++) {
            String lowerCase = kVar.f295a.get(i).BSSID.replaceAll(":", "").toLowerCase();
            a.a.a.d.a aVar = this.H;
            if (aVar == null || !aVar.d(lowerCase)) {
                arrayList2.add(kVar.f295a.get(i));
            } else {
                arrayList.add(kVar.f295a.get(i));
            }
        }
        String str = arrayList.size() > 0 ? "&aprk=3" : "";
        if ("".equals(str)) {
            a.a.a.d.a aVar2 = this.H;
            str = (aVar2 == null || !aVar2.e()) ? "&aprk=1" : "&aprk=2";
        }
        arrayList.addAll(arrayList2);
        kVar.f295a = arrayList;
        return a.a.a.g.f.w().a(this.f150c, true, kVar, a.a.a.i.i.q0) + str;
    }

    public synchronized void a() {
        if (this.i) {
            this.w.clear();
        }
    }

    public final void a(Message message) throws Throwable {
        boolean z;
        a.a.a.d.j jVar;
        if (this.i) {
            this.j = false;
            com.baidu.location.c cVar = (com.baidu.location.c) message.obj;
            if (cVar.r() == 161) {
                i();
                if (cVar.p() != null && cVar.n() != null && ((jVar = this.r) == null || !jVar.a().equals(cVar.e()))) {
                    String[] strArrSplit = cVar.p().split("\\|");
                    Location[] locationArr = new Location[strArrSplit.length];
                    for (int i = 0; i < strArrSplit.length; i++) {
                        String[] strArrSplit2 = strArrSplit[i].split(",");
                        Location location = new Location("gps");
                        location.setLatitude(Double.valueOf(strArrSplit2[1]).doubleValue());
                        location.setLongitude(Double.valueOf(strArrSplit2[0]).doubleValue());
                        locationArr[i] = location;
                    }
                    this.r = new a.a.a.d.j(cVar.n(), locationArr);
                }
                if (e() && cVar != null && cVar.r() == 161) {
                    if ("ble".equals(cVar.v())) {
                        a.a.a.d.h.a(cVar.t(), cVar.q(), cVar.k(), cVar.m(), System.currentTimeMillis(), a.a.a.d.e.k().d());
                        this.L = true;
                    } else {
                        a.a.a.d.h.a(0.0d, 0.0d, cVar.k(), cVar.m(), System.currentTimeMillis(), a.a.a.d.e.k().d());
                        this.L = false;
                    }
                }
                this.m = 0;
                if (cVar.e() != null && cVar.k() != null) {
                    this.j = true;
                    cVar.a(true);
                    if (cVar.a("tp") == null || !cVar.a("tp").equalsIgnoreCase("ble")) {
                        this.K = false;
                    } else {
                        cVar.b(8.0f);
                        cVar.l("ble");
                        this.K = true;
                    }
                    this.q = cVar.e();
                    this.s = cVar.f();
                    cVar.v();
                    this.u = cVar.J();
                    this.W.a(cVar);
                    String strK = cVar.k();
                    String strB = b();
                    if (strK != null && strB != null && !strK.equals(strB)) {
                        return;
                    }
                    if (this.p == null) {
                        this.p = cVar.k();
                    }
                    a.a.a.d.m.c.a.d().a(cVar.t(), cVar.q());
                    a(cVar.f(), cVar.k());
                    if (strK != null && strB != null && !strK.equals(strB)) {
                        return;
                    }
                    if (!strK.equalsIgnoreCase(this.p) && this.Q) {
                        this.U.d();
                        a.a.a.d.m.b.a.c();
                        a.a.a.d.m.b.a.a(cVar.k());
                    }
                    this.p = cVar.k();
                    double dA = a.a.a.d.k.e().a();
                    if (dA >= 0.0d && cVar.i() <= 0.0f) {
                        cVar.a((float) dA);
                    }
                    double[] dArrA = a.a.a.d.m.b.a.a(this.L, cVar);
                    if (dArrA != null && dArrA[0] != -1.0d && dArrA[0] == 0.0d) {
                        cVar.d(dArrA[1]);
                        cVar.c(dArrA[2]);
                        cVar.a("res", dArrA);
                        cVar.b((float) dArrA[5]);
                        cVar.a((float) dArrA[6]);
                        cVar.c((float) dArrA[8]);
                        if (!this.U.a(cVar, dArrA[5], "wifi")) {
                            l();
                            return;
                        }
                    }
                } else if (e() && (z = this.L)) {
                    double[] dArrA2 = a.a.a.d.m.b.a.a(z, cVar);
                    if (dArrA2 != null && dArrA2[0] != -1.0d && dArrA2[0] == 0.0d) {
                        cVar.d(dArrA2[1]);
                        cVar.c(dArrA2[2]);
                        cVar.a("res", dArrA2);
                        cVar.b((float) dArrA2[5]);
                        cVar.a((float) dArrA2[6]);
                        cVar.c((float) dArrA2[8]);
                        if (!this.U.a(cVar, dArrA2[5], "wifi")) {
                            l();
                            return;
                        }
                    }
                }
                this.A = cVar.q();
                this.z = cVar.t();
            } else if (cVar.r() == 63) {
                int i2 = this.m + 1;
                this.m = i2;
                if (i2 <= 10) {
                    return;
                } else {
                    l();
                }
            } else {
                this.m = 0;
            }
            if (this.j) {
                if (cVar.C() == null) {
                    cVar.n(this.N.format(new Date()));
                }
                com.baidu.location.c cVar2 = new com.baidu.location.c(cVar);
                cVar2.l(cVar2.v() + "2");
                a.a.a.d.l lVar = this.M;
                if (lVar == null || !lVar.a()) {
                    a(cVar2, 21);
                } else {
                    this.M.a(cVar2);
                }
            }
            this.h.b();
        }
    }

    public final void a(com.baidu.location.c cVar) {
    }

    public final void a(com.baidu.location.c cVar, int i) {
        Location locationE;
        if (cVar == null) {
            return;
        }
        if (e()) {
            int iB = a.a.a.d.h.b(2);
            if (iB == 1 || iB == 2) {
                String str = a.a.a.d.h.a(2).split("_")[0];
                if (str != null && !"".equals(str)) {
                    cVar.f(str.toUpperCase());
                }
                a.a.a.d.b bVarA = a.a.a.d.d.b().a();
                if (bVarA != null) {
                    bVarA.e();
                    throw null;
                }
            } else if (iB == 0) {
                cVar.f((String) null);
                cVar.c((String) null);
            }
            if ((iB == 2 || iB == 0) && a.a.a.g.d.n().j() && (locationE = a.a.a.g.d.n().e()) != null) {
                double[] dArrA = Jni.a(locationE.getLongitude(), locationE.getLatitude(), "gps2gcj");
                cVar.d(dArrA[0]);
                cVar.c(dArrA[1]);
            }
        }
        if (cVar.v().startsWith("vps")) {
            if (cVar.t() == -1.0d && cVar.q() == -1.0d) {
                cVar.n(-1);
            } else {
                cVar.n(1);
            }
            cVar.f(this.O);
            a.a.a.d.b bVarA2 = a.a.a.d.d.b().a();
            if (bVarA2 == null) {
                a.a.a.b.c.h().c(cVar);
                return;
            } else {
                bVarA2.d();
                throw null;
            }
        }
        if (this.P != null) {
            if (cVar.b() == null && this.P.b() != null) {
                cVar.a(this.P.c());
                cVar.b(this.P.b());
            }
            if (cVar.x() == null && this.P.x() != null) {
                cVar.a(this.P.x());
            }
            if (cVar.y() == null && this.P.y() != null) {
                cVar.a(new com.baidu.location.k(this.P.y()));
            }
            if (cVar.s() == null && this.P.s() != null) {
                cVar.j(this.P.s());
            }
            cVar.m(this.P.w());
            cVar.b(this.P.I());
        }
        if (cVar == null) {
            return;
        }
        cVar.n(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(System.currentTimeMillis())));
        if (cVar.v().contains("2")) {
            String strV = cVar.v();
            cVar.l(strV.substring(0, strV.length() - 1));
            cVar.n(1);
            cVar.f(this.O);
            a.a.a.d.b bVarA3 = a.a.a.d.d.b().a();
            if (bVarA3 != null) {
                bVarA3.d();
                throw null;
            }
            a.a.a.b.c.h().c(cVar);
            com.baidu.location.c cVar2 = new com.baidu.location.c(cVar);
            cVar2.b(this.K ? 8.0f : 15.0f);
            Message messageObtainMessage = this.f.obtainMessage(801);
            messageObtainMessage.obj = cVar2;
            messageObtainMessage.sendToTarget();
        }
    }

    public final void a(String str, String str2) {
        String str3 = this.s;
        if (str3 != null && str3.equals(str) && this.Q) {
            return;
        }
        a.a.a.d.m.c.a aVarD = a.a.a.d.m.c.a.d();
        aVarD.k("gcj02");
        aVarD.a(str, new c(str, str2));
    }

    public boolean a(double d2, double d3) {
        Map<String, a.a.a.d.m.c.b.a> mapA;
        if (!a.a.a.d.m.c.b.d().c() || !a.a.a.d.m.c.b.d().b() || (mapA = a.a.a.d.m.c.b.d().a()) == null) {
            return false;
        }
        String str = null;
        try {
            Iterator<String> it = mapA.keySet().iterator();
            while (it.hasNext()) {
                a.a.a.d.m.c.b.a aVar = mapA.get(it.next());
                if (d2 > aVar.f && d2 < aVar.d && d3 > aVar.g && d3 < aVar.e) {
                    String str2 = aVar.f205c;
                    str = aVar.f204b;
                    String str3 = aVar.h;
                    break;
                }
            }
        } catch (ConcurrentModificationException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return str != null;
    }

    public boolean a(Location location, ArrayList<ArrayList<Float>> arrayList) {
        int size = arrayList.size();
        if (e()) {
            double[] dArrA = Jni.a(location.getLongitude(), location.getLatitude(), "gps2gcj");
            a.a.a.d.h.a(dArrA[0], dArrA[1], location.getAccuracy(), location.getSpeed(), location.getBearing(), location.getAltitude(), size, System.currentTimeMillis());
        }
        if (size == 0 || !a.a.a.g.d.n().j() || (!this.i && location.getSpeed() > 3.0f)) {
            return false;
        }
        double[] dArrA2 = Jni.a(location.getLongitude(), location.getLatitude(), "gps2gcj");
        double d2 = dArrA2[0];
        double d3 = dArrA2[1];
        double accuracy = location.getAccuracy();
        location.getBearing();
        double altitude = location.getAltitude();
        location.getSpeed();
        boolean z = a(d2, d3) || this.f148a == 1;
        if (!this.i && !z) {
            return false;
        }
        try {
            this.U.a(location, z);
            if (this.U.a()) {
                k();
                return true;
            }
            if (!f()) {
                return false;
            }
            if (this.U.a(d2, d3, accuracy)) {
                a.a.a.d.m.b.a.c();
            }
            this.T.a(accuracy, d2, d3, altitude);
            return false;
        } catch (Exception unused) {
        }
    }

    public boolean a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        this.f148a = bundle.getInt("mode");
        return true;
    }

    public final String b() {
        String str;
        a.a.a.d.f<String> fVar;
        e eVar = this.W;
        if (eVar.f == 1 && eVar.f155a != null) {
            return eVar.a();
        }
        HashMap map = new HashMap();
        int size = this.w.size();
        String str2 = null;
        int iIntValue = -1;
        String str3 = "";
        for (int i = 0; i < size; i++) {
            try {
                String str4 = this.w.get(i);
                str3 = str3 + str4 + "|";
                map.put(str4, map.containsKey(str4) ? Integer.valueOf(((Integer) map.get(str4)).intValue() + 1) : 1);
            } catch (Exception unused) {
                return this.p;
            }
        }
        for (String str5 : map.keySet()) {
            if (((Integer) map.get(str5)).intValue() > iIntValue) {
                iIntValue = ((Integer) map.get(str5)).intValue();
                str2 = str5;
            }
        }
        if (str2 == null || (str = this.p) == null || str2.equals(str) || (fVar = this.w) == null || fVar.size() != this.v) {
            return str2;
        }
        return (this.w.get(size + (-3)).equals(str2) && this.w.get(size + (-2)).equals(str2) && this.w.get(size - 1).equals(str2)) ? str2 : this.p;
    }

    public String c() {
        return this.q;
    }

    public String d() {
        return this.p;
    }

    public boolean e() {
        return this.S;
    }

    public boolean f() {
        return this.i;
    }

    public boolean g() {
        return this.i && this.U.b();
    }

    public final void h() {
        if (this.i) {
            this.U.e();
            this.h.c();
            System.currentTimeMillis();
        }
    }

    public final void i() {
        for (int i = this.E; i >= 0 && this.D.size() > 0; i--) {
            this.D.remove(0);
        }
        this.E = -1;
    }

    public final void j() {
        this.w.clear();
        this.y.clear();
        this.m = 0;
        this.u = 0;
        this.p = null;
        this.q = null;
        this.s = null;
        this.K = false;
        this.L = false;
        this.z = 0.0d;
        this.A = 0.0d;
        this.F = 0;
        this.o = 0;
        this.l = 0L;
        this.U.d();
        a.a.a.d.m.b.a.c();
        if (this.Q) {
            a.a.a.d.m.c.a.d().a();
        }
        this.Q = false;
        t.e().a(false);
        a.a.a.d.g gVar = this.J;
        if (gVar != null) {
            gVar.i();
        }
    }

    public synchronized void k() {
        if (this.i) {
            return;
        }
        a.a.a.d.m.b.a.b();
        System.currentTimeMillis();
        this.l = System.currentTimeMillis();
        a.a.a.d.k.e().a(this.n);
        k kVar = new k();
        this.g = kVar;
        kVar.start();
        this.j = false;
        this.i = true;
        if (this.J == null) {
            this.J = new a.a.a.d.g(com.baidu.location.f.c());
        }
        this.F = 0;
        this.o = 0;
        t.e().a(true);
    }

    public synchronized void l() {
        if (this.i) {
            this.i = false;
            a.a.a.d.k.e().b(this.n);
            a.a.a.d.l lVar = this.M;
            if (lVar != null && lVar.a()) {
                this.M.c();
            }
            a.a.a.d.a aVar = this.H;
            if (aVar != null) {
                aVar.b();
            }
            a.a.a.d.g gVar = this.J;
            if (gVar != null) {
                gVar.l();
            }
            k kVar = this.g;
            if (kVar != null) {
                kVar.f168b = false;
                this.g.interrupt();
                this.g = null;
            }
            j();
            this.j = false;
            a.a.a.b.c.h().f();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 6) {
            return;
        }
        float[] fArr = (float[]) sensorEvent.values.clone();
        if (e()) {
            try {
                this.f.post(new d(this, fArr));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
