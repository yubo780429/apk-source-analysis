package a.a.a.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.location.Jni;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f25a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TelephonyManager f26b;
    public WifiManager d;
    public String f;
    public com.baidu.location.i g;
    public b h;
    public String j;
    public String k;
    public String l;
    public String m;
    public boolean n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.a.a.g.a f27c = new a.a.a.g.a();
    public a.a.a.g.k e = null;
    public String i = null;
    public c o = new c();
    public String p = null;
    public long q = 0;
    public boolean r = false;
    public boolean s = false;

    public class a implements Comparator<d> {
        public a(h hVar) {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            int i = dVar.f32b;
            int i2 = dVar2.f32b;
            if (i > i2) {
                return -1;
            }
            return i == i2 ? 0 : 1;
        }
    }

    public interface b {
        void a(com.baidu.location.c cVar);
    }

    public class c extends a.a.a.i.g {
        public LocationManager j;
        public b k;
        public String i = null;
        public boolean l = false;

        public class a extends TimerTask {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Timer f28b;

            public a(Timer timer) {
                this.f28b = timer;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                c cVar = c.this;
                if (!cVar.l) {
                    cVar.c();
                }
                this.f28b.cancel();
                this.f28b.purge();
            }
        }

        public class b implements LocationListener {
            public b() {
            }

            public /* synthetic */ b(c cVar, a aVar) {
                this();
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                c.this.c();
                c.this.l = true;
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

        public c() {
            this.d = new HashMap();
        }

        @Override // a.a.a.i.g
        public void a() {
            if (h.this.j != null && h.this.k != null) {
                this.i += String.format(Locale.CHINA, "&ki=%s&sn=%s", h.this.j, h.this.k);
            }
            String str = this.i + "&enc=2";
            this.i = str;
            String strF = Jni.f(str);
            this.i = null;
            this.d.put("bloc", strF);
            this.d.put("trtm", String.format(Locale.CHINA, "%d", Long.valueOf(System.currentTimeMillis())));
        }

        public final void a(com.baidu.location.c cVar) {
            try {
                if (cVar.G()) {
                    com.baidu.location.a aVarC = cVar.c();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(aVarC.f1349a);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarC.f1350b);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarC.f1351c);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarC.d);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarC.e);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarC.f);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarC.g);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarC.h);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarC.j);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarC.k);
                    String strEncodeToString = Base64.encodeToString((System.currentTimeMillis() + "_" + stringBuffer.toString()).getBytes("UTF-8"), 0);
                    SharedPreferences sharedPreferencesB = r.b(h.this.f25a);
                    if (sharedPreferencesB != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
                        editorEdit.putString("FirstLocAddr", strEncodeToString);
                        editorEdit.apply();
                    }
                }
            } catch (Exception unused) {
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0046 A[Catch: Exception -> 0x004a, TRY_LEAVE, TryCatch #2 {Exception -> 0x004a, blocks: (B:14:0x0030, B:16:0x0046), top: B:43:0x0030, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x005a  */
        /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: Exception -> 0x00cf, TryCatch #0 {Exception -> 0x00cf, blocks: (B:6:0x000c, B:19:0x0052, B:23:0x005c, B:25:0x0066, B:28:0x0078, B:30:0x0085, B:29:0x007c, B:31:0x00c5, B:18:0x004a, B:13:0x002d, B:8:0x0014, B:10:0x001f, B:14:0x0030, B:16:0x0046), top: B:40:0x000c, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0076  */
        /* JADX WARN: Code duplicated, block: B:29:0x007c A[Catch: Exception -> 0x00cf, TryCatch #0 {Exception -> 0x00cf, blocks: (B:6:0x000c, B:19:0x0052, B:23:0x005c, B:25:0x0066, B:28:0x0078, B:30:0x0085, B:29:0x007c, B:31:0x00c5, B:18:0x004a, B:13:0x002d, B:8:0x0014, B:10:0x001f, B:14:0x0030, B:16:0x0046), top: B:40:0x000c, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00c5 A[Catch: Exception -> 0x00cf, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:6:0x000c, B:19:0x0052, B:23:0x005c, B:25:0x0066, B:28:0x0078, B:30:0x0085, B:29:0x007c, B:31:0x00c5, B:18:0x004a, B:13:0x002d, B:8:0x0014, B:10:0x001f, B:14:0x0030, B:16:0x0046), top: B:40:0x000c, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x0030 A[EXC_TOP_SPLITTER, PHI: r6
  0x0030: PHI (r6v4 java.lang.String) = (r6v2 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String), (r6v29 java.lang.String) binds: [B:7:0x0012, B:13:0x002d, B:9:0x001d, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
        
            r6 = r5.f339c;
         */
        @Override // a.a.a.i.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(boolean r6) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.b.h.c.a(boolean):void");
        }

        public final void b() {
            try {
                LocationManager locationManager = (LocationManager) h.this.f25a.getSystemService("location");
                this.j = locationManager;
                b bVar = new b(this, null);
                this.k = bVar;
                if (locationManager != null) {
                    try {
                        locationManager.requestLocationUpdates("network", 1000L, 0.0f, bVar, Looper.getMainLooper());
                    } catch (SecurityException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        public final void c() {
            LocationManager locationManager;
            b bVar = this.k;
            if (bVar == null || (locationManager = this.j) == null) {
                return;
            }
            try {
                locationManager.removeUpdates(bVar);
            } catch (Exception unused) {
            }
        }

        public void c(String str) {
            this.i = str;
            a(a.a.a.i.d.f324b);
            if (h.this.r) {
                b();
                Timer timer = new Timer();
                timer.schedule(new a(timer), 10000L);
                SharedPreferences.Editor editorEdit = h.this.f25a.getSharedPreferences("cuidRelate", 0).edit();
                editorEdit.putLong("reqtime", System.currentTimeMillis());
                editorEdit.apply();
            }
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f31a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f32b;

        public d(h hVar, String str, int i) {
            this.f31a = str;
            this.f32b = i;
        }
    }

    static {
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.".toCharArray();
    }

    public h(Context context, com.baidu.location.i iVar, b bVar, String str, boolean z) {
        StringBuilder sb;
        String str2 = null;
        this.f25a = null;
        this.f26b = null;
        this.d = null;
        this.f = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = false;
        Context applicationContext = context.getApplicationContext();
        this.f25a = applicationContext;
        try {
            a.a.a.i.i.o0 = applicationContext.getPackageName();
        } catch (Exception unused) {
        }
        this.n = true;
        this.g = new com.baidu.location.i(iVar);
        this.h = bVar;
        this.l = this.f25a.getPackageName();
        this.m = null;
        try {
            this.f26b = (TelephonyManager) this.f25a.getSystemService("phone");
            this.d = (WifiManager) this.f25a.getApplicationContext().getSystemService("wifi");
        } catch (Exception unused2) {
        }
        if (this.g.D == com.baidu.location.i.a.ACCURACY_IN_FIRST_LOC) {
            a.a.a.g.f.w().a(this.f25a);
        }
        String str3 = "&" + this.l + "&" + ((String) null);
        try {
            this.m = c.a.c.a.b.c(this.f25a).a();
        } catch (Throwable unused3) {
            this.m = null;
            this.f26b = null;
            this.d = null;
        }
        if (this.m != null) {
            a.a.a.i.i.l = "" + this.m;
            sb = new StringBuilder();
            sb.append("&prod=");
            sb.append(this.g.f);
            sb.append(":");
            sb.append(this.l);
            sb.append("|&cu=");
            str2 = this.m;
        } else {
            sb = new StringBuilder();
            sb.append("&prod=");
            sb.append(this.g.f);
            sb.append(":");
            sb.append(this.l);
            sb.append("|&im=");
        }
        sb.append(str2);
        sb.append("&coor=");
        sb.append(iVar.f());
        this.f = sb.toString();
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("&fw=");
        stringBuffer.append("9.521");
        stringBuffer.append("&sdk=");
        stringBuffer.append("9.521");
        stringBuffer.append("&lt=1");
        stringBuffer.append("&mb=");
        stringBuffer.append(Build.MODEL);
        stringBuffer.append("&resid=");
        stringBuffer.append("12");
        iVar.c();
        if (iVar.c() != null && iVar.c().equals("all")) {
            this.f += "&addr=allj2";
            if (iVar.t) {
                stringBuffer.append("&adtp=n2");
            }
        }
        if (iVar.o || iVar.p) {
            this.f += "&sema=";
            if (iVar.o) {
                this.f += "aptag|";
            }
            if (iVar.p) {
                this.f += "aptagd2|";
            }
            this.j = a.a.a.a.a.b(this.f25a);
            this.k = a.a.a.a.a.c(this.f25a);
        }
        stringBuffer.append("&first=1");
        if (z) {
            stringBuffer.append("&state=fore");
        }
        stringBuffer.append("&os=A");
        stringBuffer.append(Build.VERSION.SDK);
        this.f += stringBuffer.toString();
    }

    public static boolean a(WifiManager wifiManager) {
        try {
            return wifiManager.isWifiEnabled() || (Build.VERSION.SDK_INT > 17 && wifiManager.isScanAlwaysAvailable());
        } catch (Throwable unused) {
        }
    }

    public final Object a(Object obj, String str) {
        return obj.getClass().getField(str).get(obj);
    }

    public final String a(int i) {
        String strA;
        String strA2;
        a.a.a.g.a aVar;
        try {
            a.a.a.g.a aVarA = a.a.a.g.f.w().a(this.f27c, this.f26b);
            this.f27c = aVarA;
            strA = (aVarA == null || !aVarA.e()) ? null : a.a.a.g.f.w().a(this.f27c);
            try {
                if (!TextUtils.isEmpty(strA) && (aVar = this.f27c) != null && aVar.m != null) {
                    strA = strA + this.f27c.m;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            strA = null;
        }
        try {
            this.e = null;
            if (!a(this.d) || this.g.g == 4) {
                strA2 = null;
            } else {
                this.e = new a.a.a.g.k(this.d.getScanResults(), 0L);
                strA2 = a.a.a.g.f.w().a(this.e, i, c(), this.r, a.a.a.b.a.c().f5c);
                try {
                    com.baidu.location.i iVar = this.g;
                    if (iVar != null && iVar.i()) {
                        this.d.startScan();
                    }
                } catch (Exception unused3) {
                }
            }
        } catch (Exception unused4) {
        }
        if (strA == null && strA2 == null) {
            this.i = null;
            return null;
        }
        if (strA2 != null) {
            if (strA == null) {
                strA = strA2;
            } else {
                strA = strA + strA2;
            }
        }
        if (strA == null) {
            return null;
        }
        this.i = strA;
        if (this.f != null) {
            this.i += this.f;
        }
        h();
        return strA + this.f;
    }

    public final String a(List<WifiConfiguration> list) {
        ArrayList<d> arrayList;
        int iIntValue;
        int i = 0;
        if (list == null || list.size() <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (WifiConfiguration wifiConfiguration : list) {
                String str = wifiConfiguration.SSID;
                try {
                    iIntValue = ((Integer) a(wifiConfiguration, "numAssociation")).intValue();
                } catch (Throwable unused) {
                    iIntValue = 0;
                }
                if (iIntValue > 0 && !TextUtils.isEmpty(str)) {
                    arrayList.add(new d(this, str, iIntValue));
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList, new a(this));
        }
        StringBuffer stringBuffer = new StringBuffer(200);
        for (d dVar : arrayList) {
            stringBuffer.append(dVar.f31a);
            stringBuffer.append(",");
            stringBuffer.append(dVar.f32b);
            stringBuffer.append("|");
            i++;
            if (i == 4) {
                break;
            }
        }
        if (arrayList.size() >= 5) {
            stringBuffer.append(((d) arrayList.get(4)).f31a);
            stringBuffer.append(",");
            stringBuffer.append(((d) arrayList.get(4)).f32b);
        }
        return stringBuffer.toString();
    }

    public void a() {
        com.baidu.location.i iVar;
        com.baidu.location.c cVarA;
        if (this.i == null) {
            int i = 62;
            int iA = a.a.a.i.i.a(this.f25a);
            if (iA == -1) {
                i = 69;
            } else if (iA == -2) {
                i = 70;
            } else if (iA == 0) {
                i = 71;
            }
            b(i);
            return;
        }
        if (this.n) {
            if (this.f25a != null) {
                f.c().a(this.f25a);
                this.i += f.c().b();
            }
            com.baidu.location.c cVar = null;
            if (this.d != null && (iVar = this.g) != null && iVar.d >= 1000 && !iVar.c().equals("all")) {
                com.baidu.location.i iVar2 = this.g;
                if (!iVar2.o && !iVar2.p && !iVar2.i()) {
                    try {
                        String strD = this.f27c != null ? a.a.a.g.f.w().d(this.f27c) : null;
                        WifiManager wifiManager = this.d;
                        if (wifiManager != null) {
                            cVarA = a.a.a.f.a.e().a(strD, this.g.g != 4 ? wifiManager.getScanResults() : null, false);
                            if (cVarA != null && cVarA.r() == 66 && Math.abs(cVarA.q()) < 0.10000000149011612d && Math.abs(cVarA.t()) < 0.10000000149011612d) {
                                cVarA.h(67);
                            }
                        } else {
                            cVarA = null;
                        }
                        if (cVarA != null) {
                            cVarA.r();
                        }
                        if (cVarA != null) {
                            cVarA.r();
                        }
                        if (!this.g.f1370a.equals("gcj02") && cVarA != null && cVarA.r() == 66) {
                            double dT = cVarA.t();
                            double dQ = cVarA.q();
                            if (Math.abs(dT) > 0.10000000149011612d && Math.abs(dQ) > 0.10000000149011612d) {
                                double[] dArrA = Jni.a(dT, dQ, this.g.f1370a);
                                cVarA.d(dArrA[0]);
                                cVarA.c(dArrA[1]);
                                cVarA.e(this.g.f1370a);
                            }
                        }
                        if (cVarA != null && cVarA.r() == 66 && Math.abs(cVarA.q()) > 0.10000000149011612d && Math.abs(cVarA.t()) > 0.10000000149011612d) {
                            if (!this.s) {
                                this.h.a(cVarA);
                            }
                            cVar = cVarA;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            if (cVar == null) {
                this.o.c(this.i);
            }
        }
    }

    public final void a(String str) {
        String[] strArrSplit;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("content");
            String string = jSONObject.has("ideocfre") ? jSONObject.getString("ideocfre") : null;
            if (TextUtils.isEmpty(string) || !string.contains("|") || (strArrSplit = string.split("\\|")) == null || strArrSplit.length < 2) {
                return;
            }
            int i = Integer.parseInt(strArrSplit[0]);
            long j = Long.parseLong(strArrSplit[1]);
            SharedPreferences.Editor editorEdit = this.f25a.getSharedPreferences("cuidRelate", 0).edit();
            editorEdit.putInt("cuidoc", i);
            editorEdit.putLong("cuidfreq", j);
            editorEdit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String b() {
        WifiInfo connectionInfo;
        if (this.d == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.q > 1000 && (connectionInfo = this.d.getConnectionInfo()) != null) {
            this.p = connectionInfo.getBSSID();
            this.q = jCurrentTimeMillis;
        }
        return this.p;
    }

    public final void b(int i) {
        com.baidu.location.i iVar = this.g;
        if (iVar == null || !iVar.i()) {
            return;
        }
        com.baidu.location.c cVar = new com.baidu.location.c();
        cVar.h(i);
        cVar.k(Jni.a(this.l + ";" + this.m + ";" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(System.currentTimeMillis()))));
        b bVar = this.h;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public String c() {
        try {
            String strB = b();
            String strReplace = strB != null ? strB.replace(":", "") : null;
            if (strReplace == null || strReplace.length() == 12) {
                return new String(strReplace);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public String d() {
        try {
            return a(15);
        } catch (Exception unused) {
            return null;
        }
    }

    public final List<WifiConfiguration> e() {
        try {
            WifiManager wifiManager = this.d;
            if (wifiManager != null) {
                return wifiManager.getConfiguredNetworks();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final boolean f() {
        if (a.a.a.b.a.c().f == 0) {
            return false;
        }
        SharedPreferences sharedPreferences = this.f25a.getApplicationContext().getSharedPreferences("cuidRelate", 0);
        if (!sharedPreferences.contains("isInstalled")) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!a.a.a.i.i.b(this.f25a, "com.baidu.map.location")) {
                editorEdit.putInt("isInstalled", 0);
                return false;
            }
            editorEdit.putInt("isInstalled", 1);
            editorEdit.apply();
        } else if (sharedPreferences.getInt("isInstalled", -1) == 0) {
            return false;
        }
        return sharedPreferences.getInt("cuidoc", 1) != 0 && (System.currentTimeMillis() - sharedPreferences.getLong("reqtime", 0L)) / 1000 >= sharedPreferences.getLong("cuidfreq", 60L) && a.a.a.i.i.c(this.f25a) >= 2 && a(this.d) && this.e.c() > 3;
    }

    public void g() {
        d();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
    public final void h() {
        String strA;
        if (!f()) {
            this.r = false;
            return;
        }
        this.r = true;
        a.a.a.g.k kVar = this.e;
        if (kVar == null) {
            strA = null;
        } else if (kVar.c() >= 10) {
            String strA2 = a.a.a.g.f.w().a(this.e, 9, c(), this.r, a.a.a.b.a.c().f5c);
            if (TextUtils.isEmpty(strA2)) {
                strA = null;
            } else {
                strA = a.a.a.i.i.a(strA2.getBytes(), false);
            }
        } else {
            a.a.a.g.f fVarW = a.a.a.g.f.w();
            a.a.a.g.k kVar2 = this.e;
            String strA3 = fVarW.a(kVar2, kVar2.c(), c(), this.r, a.a.a.b.a.c().f5c);
            if (TextUtils.isEmpty(strA3)) {
                strA = null;
            } else {
                strA = a.a.a.i.i.a(strA3.getBytes(), false);
            }
        }
        String strA4 = a(e());
        String strA5 = TextUtils.isEmpty(strA4) ? null : a.a.a.i.i.a(strA4.getBytes(), false);
        if (TextUtils.isEmpty(strA)) {
            this.r = false;
        } else {
            this.i += "&swf5=" + strA;
            this.r = true;
        }
        if (TextUtils.isEmpty(strA5)) {
            return;
        }
        this.i += "&hwf5=" + strA5;
        this.r = true;
    }

    public void i() {
        if ((this.d.isWifiEnabled() || this.d.isScanAlwaysAvailable()) && this.g.g != 4) {
            a.a.a.g.f.w().a(0);
        }
        if (a.a.a.i.i.a(this.f25a, "android.permission.ACCESS_FINE_LOCATION") == 1) {
            a.a.a.g.f.w().a();
        }
    }

    public void j() {
        a.a.a.g.f.w().v();
    }
}
