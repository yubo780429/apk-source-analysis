package a.a.a.g;

import a.a.a.b.o;
import a.a.a.b.u;
import a.a.a.b.z;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TelephonyManager f278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConnectivityManager f279c = null;
    public WifiManager d = null;
    public Handler e = null;
    public String f = null;
    public boolean g = false;
    public long h = 0;
    public long i = 0;
    public long j = 0;
    public long k = 0;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f280a = new f();
    }

    public class c extends a.a.a.g.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f281a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f282b = false;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f284b;

            public a(boolean z) {
                this.f284b = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!f.this.g) {
                    f.this.g = this.f284b;
                }
                o.q().m();
                if (a.a.a.d.i.m().f()) {
                    a.a.a.d.i.m().f.obtainMessage(41).sendToTarget();
                }
                if (System.currentTimeMillis() - u.e() <= 5000) {
                    z.f().e();
                }
            }
        }

        public c() {
        }

        @Override // a.a.a.g.e
        public void a(String str) {
        }

        @Override // a.a.a.g.e
        public boolean a(Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                boolean booleanExtra = intent.getBooleanExtra("resultsUpdated", true);
                f.this.i = System.currentTimeMillis() / 1000;
                if (f.this.e == null) {
                    return true;
                }
                f.this.e.post(new a(booleanExtra));
            } else if (action.equals("android.net.wifi.STATE_CHANGE")) {
                if (!((NetworkInfo) intent.getParcelableExtra("networkInfo")).getState().equals(NetworkInfo.State.CONNECTED) || System.currentTimeMillis() - this.f281a < 5000) {
                    return false;
                }
                this.f281a = System.currentTimeMillis();
                if (!this.f282b) {
                    this.f282b = true;
                    return false;
                }
                if (f.this.e == null) {
                    return false;
                }
            }
            return true;
        }

        @Override // a.a.a.g.e
        public boolean a(List<CellInfo> list) {
            a.a.a.c.b.g().b();
            return true;
        }
    }

    public static class d implements Comparator<ScanResult> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult2.level - scanResult.level;
        }
    }

    public static class e implements Comparator<h> {
        public e() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(h hVar, h hVar2) {
            return hVar.g - hVar2.g;
        }
    }

    public static List<h> a(List<h> list, int i) {
        if (list.size() == 0) {
            return null;
        }
        if (list.size() == 1) {
            return list;
        }
        Collections.sort(list.subList(1, list.size()), new e());
        list.size();
        return list.subList(0, Math.min(list.size(), i));
    }

    public static f w() {
        return b.f280a;
    }

    public int a(CellIdentityNr cellIdentityNr) {
        try {
            return a.a.a.i.i.b(cellIdentityNr, "getHwTac");
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0028  */
    /* JADX WARN: Code duplicated, block: B:21:0x0032  */
    /* JADX WARN: Code duplicated, block: B:24:0x0036  */
    @SuppressLint({"NewApi"})
    public long a(k kVar) {
        long jElapsedRealtimeNanos;
        boolean z;
        int size;
        long j;
        List<ScanResult> list = kVar.f295a;
        if (list == null || list.size() == 0) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
            } catch (Error | Exception unused) {
                jElapsedRealtimeNanos = 0;
            }
            z = jElapsedRealtimeNanos > 0;
            if (!z) {
                return 0L;
            }
            size = kVar.f295a.size();
            if (size > 16) {
                size = 16;
            }
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                if (kVar.f295a.get(i) == null && kVar.f295a.get(i).level != 0 && z) {
                    try {
                        j = (jElapsedRealtimeNanos - kVar.f295a.get(i).timestamp) / 1000000;
                    } catch (Error | Exception unused2) {
                        j = 0;
                    }
                    if (j > j2) {
                        j2 = j;
                    }
                }
            }
            return j2;
        }
        jElapsedRealtimeNanos = 0;
        if (!z) {
            return 0L;
        }
        size = kVar.f295a.size();
        if (size > 16) {
            size = 16;
        }
        long j3 = 0;
        while (i < size) {
            if (kVar.f295a.get(i) == null) {
            }
        }
        return j3;
    }

    public synchronized a.a.a.g.a a() {
        if (this.f277a == null) {
            return null;
        }
        a(this.f278b, a.a.a.i.i.B0, a.a.a.i.i.C0, a.a.a.i.i.D0, a.a.a.i.i.E0);
        return this.f277a.a(30000);
    }

    public a.a.a.g.a a(a.a.a.g.a aVar, TelephonyManager telephonyManager) {
        g gVar = this.f277a;
        if (gVar != null) {
            return gVar.a(aVar, telephonyManager);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [a.a.a.g.f] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v39, types: [a.a.a.g.h] */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [a.a.a.g.h] */
    /* JADX WARN: Type inference failed for: r1v22, types: [a.a.a.g.h] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9, types: [a.a.a.g.h] */
    public final h a(CellInfo cellInfo, TelephonyManager telephonyManager) {
        long jElapsedRealtime;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        int i = Build.VERSION.SDK_INT;
        ?? r1 = 0;
        CellIdentityNr cellIdentityNr = null;
        if (i < 17) {
            return null;
        }
        try {
            if (cellInfo instanceof CellInfoGsm) {
                h hVar = new h();
                CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
                hVar.f292a = 1;
                if (cellInfo.isRegistered()) {
                    hVar.d = 1;
                }
                if (i >= 28) {
                    hVar.f293b = cellIdentity.getMccString();
                    hVar.f294c = cellIdentity.getMncString();
                    hVar.f = cellInfo.getCellConnectionStatus();
                } else {
                    hVar.f293b = cellIdentity.getMcc() == Integer.MAX_VALUE ? null : String.valueOf(cellIdentity.getMcc());
                    hVar.f294c = cellIdentity.getMnc() != Integer.MAX_VALUE ? String.valueOf(cellIdentity.getMnc()) : null;
                }
                jCurrentTimeMillis2 = System.currentTimeMillis() - (i >= 30 ? SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis() : (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000);
                this = hVar;
            } else if (cellInfo instanceof CellInfoCdma) {
                h hVar2 = new h();
                CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                hVar2.f292a = 2;
                hVar2.f294c = cellIdentity2.getSystemId() != Integer.MAX_VALUE ? String.valueOf(cellIdentity2.getSystemId()) : null;
                if (cellInfo.isRegistered()) {
                    hVar2.d = 1;
                }
                if (i >= 28) {
                    hVar2.f = cellInfo.getCellConnectionStatus();
                }
                try {
                    String networkOperator = telephonyManager.getNetworkOperator();
                    if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
                        hVar2.f293b = networkOperator.substring(0, 3);
                    }
                } catch (Exception unused) {
                }
                jCurrentTimeMillis2 = System.currentTimeMillis() - (i >= 30 ? SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis() : (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000);
                this = hVar2;
            } else if (cellInfo instanceof CellInfoWcdma) {
                h hVar3 = new h();
                CellIdentityWcdma cellIdentity3 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                hVar3.f292a = 4;
                if (cellInfo.isRegistered()) {
                    hVar3.d = 1;
                }
                if (i >= 28) {
                    hVar3.f293b = cellIdentity3.getMccString();
                    hVar3.f294c = cellIdentity3.getMncString();
                    hVar3.f = cellInfo.getCellConnectionStatus();
                } else {
                    hVar3.f293b = cellIdentity3.getMcc() == Integer.MAX_VALUE ? null : String.valueOf(cellIdentity3.getMcc());
                    hVar3.f294c = cellIdentity3.getMnc() != Integer.MAX_VALUE ? String.valueOf(cellIdentity3.getMnc()) : null;
                }
                jCurrentTimeMillis2 = System.currentTimeMillis() - (i >= 30 ? SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis() : (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000);
                this = hVar3;
            } else {
                try {
                    if (i >= 29 && (cellInfo instanceof CellInfoTdscdma)) {
                        h hVar4 = new h();
                        CellIdentityTdscdma cellIdentity4 = ((CellInfoTdscdma) cellInfo).getCellIdentity();
                        hVar4.f292a = 5;
                        if (cellInfo.isRegistered()) {
                            hVar4.d = 1;
                        }
                        hVar4.f293b = cellIdentity4.getMccString();
                        hVar4.f294c = cellIdentity4.getMncString();
                        hVar4.f = cellInfo.getCellConnectionStatus();
                        jElapsedRealtime = i >= 30 ? SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis() : (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        r1 = hVar4;
                    } else {
                        if (!(cellInfo instanceof CellInfoLte)) {
                            if (i < 29 || !(cellInfo instanceof CellInfoNr)) {
                                return null;
                            }
                            j jVar = new j();
                            try {
                                cellIdentityNr = (CellIdentityNr) ((CellInfoNr) cellInfo).getCellIdentity();
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                            CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                            if (cellIdentityNr != null) {
                                jVar.f292a = 6;
                                jVar.f293b = cellIdentityNr.getMccString();
                                jVar.f294c = cellIdentityNr.getMncString();
                                jVar.h = cellIdentityNr.getNci();
                                jVar.i = cellIdentityNr.getPci();
                                int tac = cellIdentityNr.getTac();
                                jVar.j = tac;
                                if (tac == Integer.MAX_VALUE) {
                                    try {
                                        jVar.j = a(cellIdentityNr);
                                    } catch (Throwable unused2) {
                                    }
                                }
                                if (jVar.j == Integer.MAX_VALUE) {
                                    try {
                                        jVar.j = b(cellIdentityNr.toString());
                                    } catch (Throwable unused3) {
                                    }
                                }
                                jVar.k = cellIdentityNr.getNrarfcn();
                            }
                            if (cellInfo.isRegistered()) {
                                jVar.d = 1;
                            }
                            jVar.f = cellInfo.getCellConnectionStatus();
                            jVar.l = Math.abs(cellSignalStrengthNr.getSsRsrp());
                            jVar.g = Math.abs(cellSignalStrengthNr.getSsRsrp());
                            jVar.m = Math.abs(cellSignalStrengthNr.getSsRsrq());
                            jVar.n = cellSignalStrengthNr.getSsSinr();
                            jVar.o = Math.abs(cellSignalStrengthNr.getCsiRsrp());
                            jVar.p = Math.abs(cellSignalStrengthNr.getCsiRsrq());
                            jVar.q = cellSignalStrengthNr.getCsiSinr();
                            try {
                                jVar.e = System.currentTimeMillis() - (i >= 30 ? SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis() : (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000);
                                return jVar;
                            } catch (Error unused4) {
                                r1 = jVar;
                                r1.e = System.currentTimeMillis();
                                return r1;
                            }
                        }
                        i iVar = new i();
                        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                        CellIdentityLte cellIdentity5 = cellInfoLte.getCellIdentity();
                        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
                        iVar.f292a = 3;
                        if (cellInfo.isRegistered()) {
                            iVar.d = 1;
                        }
                        iVar.h = cellIdentity5.getCi();
                        iVar.i = cellIdentity5.getPci();
                        iVar.j = cellIdentity5.getTac();
                        iVar.r = cellSignalStrength.getTimingAdvance();
                        if (i >= 28) {
                            iVar.f293b = cellIdentity5.getMccString();
                            iVar.f294c = cellIdentity5.getMncString();
                            iVar.f = cellInfo.getCellConnectionStatus();
                            iVar.l = cellIdentity5.getBandwidth();
                        } else {
                            if (cellIdentity5.getMcc() != Integer.MAX_VALUE) {
                                iVar.f293b = String.valueOf(cellIdentity5.getMcc());
                            }
                            if (cellIdentity5.getMnc() != Integer.MAX_VALUE) {
                                iVar.f294c = String.valueOf(cellIdentity5.getMnc());
                            }
                        }
                        if (i >= 24) {
                            iVar.k = cellIdentity5.getEarfcn();
                        }
                        if (i >= 29) {
                            iVar.m = Math.abs(cellSignalStrength.getRssi());
                        }
                        if (i >= 26) {
                            iVar.n = Math.abs(cellSignalStrength.getRsrp());
                            iVar.g = Math.abs(cellSignalStrength.getRsrp());
                            iVar.o = cellSignalStrength.getRsrq();
                            int rssnr = cellSignalStrength.getRssnr();
                            if (rssnr == Integer.MAX_VALUE && cellInfo.isRegistered()) {
                                rssnr = e();
                            }
                            iVar.p = rssnr;
                            iVar.q = cellSignalStrength.getCqi();
                        }
                        jElapsedRealtime = i >= 30 ? SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis() : (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        r1 = iVar;
                    }
                    r1.e = jCurrentTimeMillis - jElapsedRealtime;
                    return r1;
                } catch (Error unused5) {
                }
            }
            this.e = jCurrentTimeMillis2;
            return this;
        } catch (Error unused6) {
            r1 = this;
        }
    }

    public k a(int i) {
        g gVar = this.f277a;
        if (gVar != null) {
            return gVar.b(i);
        }
        return null;
    }

    public String a(int i, k kVar) {
        if (i == 0) {
            return null;
        }
        int i2 = 1;
        if (kVar.c() < 1) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(256);
        int size = kVar.f295a.size();
        int i3 = a.a.a.i.i.L;
        if (size > i3) {
            size = i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            if (kVar.f295a.get(i5) != null) {
                if ((i2 & i) != 0 && kVar.f295a.get(i5).BSSID != null) {
                    stringBuffer.append(i4 == 0 ? "&ssid=" : "|");
                    stringBuffer.append(kVar.f295a.get(i5).BSSID.replace(":", ""));
                    stringBuffer.append(";");
                    stringBuffer.append(c(kVar.f295a.get(i5).SSID));
                    i4++;
                }
                i2 <<= 1;
            }
        }
        return stringBuffer.toString();
    }

    public String a(int i, boolean z, k kVar, int i2) {
        g gVar = this.f277a;
        if (gVar != null) {
            return gVar.a(i, z, kVar, i2);
        }
        return null;
    }

    public String a(a.a.a.g.a aVar) {
        if (this.f277a == null) {
            return null;
        }
        return this.f277a.a(aVar) + "&cl_list=" + b();
    }

    public String a(k kVar, int i, String str, boolean z, int i2) {
        g gVar = this.f277a;
        if (gVar != null) {
            return gVar.a(kVar, i, str, z, i2);
        }
        return null;
    }

    public String a(WifiInfo wifiInfo, String str) {
        g gVar = this.f277a;
        if (gVar != null) {
            return gVar.a(wifiInfo, str);
        }
        return null;
    }

    public final String a(String str) {
        if (str != null && str.length() > a.a.a.b.d.i().K) {
            str = str.substring(0, a.a.a.b.d.i().K);
        }
        if (str != null) {
            return (str.contains("&") || str.contains(";")) ? str.replace("&", "_").replace(";", "_") : str;
        }
        return str;
    }

    public final String a(List<CellInfo> list, TelephonyManager telephonyManager, int i, int[] iArr, boolean z, int i2) {
        ArrayList arrayList = new ArrayList();
        if (i != 1 && a.a.a.b.d.i().H != 1) {
            return null;
        }
        boolean z2 = a.a.a.b.d.i().H != 1 && z;
        Iterator<CellInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next(), telephonyManager));
        }
        return a(a(arrayList, i2), iArr, z2);
    }

    public final String a(List<h> list, int[] iArr, boolean z) {
        if (list == null || list.size() == 0) {
            return null;
        }
        com.baidu.location.l.c cVar = new com.baidu.location.l.c();
        for (h hVar : list) {
            com.baidu.location.l.b bVar = new com.baidu.location.l.b();
            com.baidu.location.l.a aVar = new com.baidu.location.l.a();
            aVar.a(hVar.f292a);
            String str = hVar.f293b;
            if (str != null) {
                aVar.a(c.b.a.a.a.a(str));
            }
            String str2 = hVar.f294c;
            if (str2 != null) {
                aVar.b(c.b.a.a.a.a(str2));
            }
            aVar.c(hVar.d);
            aVar.a(hVar.e);
            int i = hVar.f;
            if (i != Integer.MAX_VALUE) {
                aVar.b(i);
            }
            if (!z) {
                bVar.a(aVar);
            }
            if (hVar instanceof i) {
                com.baidu.location.l.d dVar = new com.baidu.location.l.d();
                i iVar = (i) hVar;
                int i2 = iVar.h;
                if (i2 != Integer.MAX_VALUE && (!z || iArr[0] == 1)) {
                    dVar.b(i2);
                }
                int i3 = iVar.i;
                if (i3 != Integer.MAX_VALUE && (!z || iArr[1] == 1)) {
                    dVar.e(i3);
                }
                int i4 = iVar.j;
                if (i4 != Integer.MAX_VALUE && (!z || iArr[2] == 1)) {
                    dVar.j(i4);
                }
                int i5 = iVar.k;
                if (i5 != Integer.MAX_VALUE && (!z || iArr[3] == 1)) {
                    dVar.d(i5);
                }
                int i6 = iVar.l;
                if (i6 != Integer.MAX_VALUE && (!z || iArr[4] == 1)) {
                    dVar.a(i6);
                }
                int i7 = iVar.m;
                if (i7 != Integer.MAX_VALUE && (!z || iArr[5] == 1)) {
                    dVar.h(i7);
                }
                int i8 = iVar.n;
                if (i8 != Integer.MAX_VALUE && (!z || iArr[6] == 1)) {
                    dVar.f(i8);
                }
                int i9 = iVar.o;
                if (i9 != Integer.MAX_VALUE && (!z || iArr[7] == 1)) {
                    dVar.g(i9);
                }
                int i10 = iVar.p;
                if (i10 != Integer.MAX_VALUE && (!z || iArr[8] == 1)) {
                    dVar.i(i10);
                }
                int i11 = iVar.q;
                if (i11 != Integer.MAX_VALUE && (!z || iArr[9] == 1)) {
                    dVar.c(i11);
                }
                int i12 = iVar.r;
                if (i12 != Integer.MAX_VALUE && (!z || iArr[10] == 1)) {
                    dVar.k(i12);
                }
                bVar.a(dVar);
            } else if (hVar instanceof j) {
                com.baidu.location.l.e eVar = new com.baidu.location.l.e();
                j jVar = (j) hVar;
                long j = jVar.h;
                if (j != Long.MAX_VALUE && (!z || iArr[0] == 1)) {
                    eVar.a(j);
                }
                int i13 = jVar.i;
                if (i13 != Integer.MAX_VALUE && (!z || iArr[1] == 1)) {
                    eVar.e(i13);
                }
                int i14 = jVar.j;
                if (i14 != Integer.MAX_VALUE && (!z || iArr[2] == 1)) {
                    eVar.i(i14);
                }
                int i15 = jVar.k;
                if (i15 != Integer.MAX_VALUE && (!z || iArr[11] == 1)) {
                    eVar.d(i15);
                }
                int i16 = jVar.l;
                if (i16 != Integer.MAX_VALUE && (!z || iArr[12] == 1)) {
                    eVar.f(i16);
                }
                int i17 = jVar.m;
                if (i17 != Integer.MAX_VALUE && (!z || iArr[13] == 1)) {
                    eVar.g(i17);
                }
                int i18 = jVar.n;
                if (i18 != Integer.MAX_VALUE && (!z || iArr[14] == 1)) {
                    eVar.h(i18);
                }
                int i19 = jVar.o;
                if (i19 != Integer.MAX_VALUE && (!z || iArr[15] == 1)) {
                    eVar.a(i19);
                }
                int i20 = jVar.p;
                if (i20 != Integer.MAX_VALUE && (!z || iArr[16] == 1)) {
                    eVar.b(i20);
                }
                int i21 = jVar.q;
                if (i21 != Integer.MAX_VALUE && (!z || iArr[17] == 1)) {
                    eVar.c(i21);
                }
                bVar.a(eVar);
            }
            cVar.a(bVar);
        }
        return Base64.encodeToString(cVar.c(), 0);
    }

    public synchronized void a(Context context) {
        if (this.f277a == null) {
            return;
        }
        try {
            this.f278b = (TelephonyManager) context.getSystemService("phone");
            this.d = (WifiManager) context.getSystemService("wifi");
            this.f279c = (ConnectivityManager) context.getSystemService("connectivity");
            if (Looper.myLooper() != null) {
                this.e = new Handler();
            }
            this.f277a.a(g.b.GET_ALL_DATA);
            this.f277a.d(100);
            this.f277a.e(2000);
            this.f277a.b(true);
            this.f277a.c(30);
            this.f277a.a(false);
            this.f277a.a(context, new ArrayList());
        } catch (Exception unused) {
        }
    }

    public final void a(TelephonyManager telephonyManager, int i, int[] iArr, boolean z, int i2) {
        if (telephonyManager != null) {
            try {
                this.f = a(telephonyManager.getAllCellInfo(), telephonyManager, i, iArr, z, i2);
            } catch (Throwable unused) {
            }
        }
    }

    @SuppressLint({"NewApi"})
    public boolean a(long j) {
        k kVarJ;
        try {
            return (this.d.isWifiEnabled() || (Build.VERSION.SDK_INT > 17 && this.d.isScanAlwaysAvailable())) && !p() && (kVarJ = j()) != null && a(kVarJ, j);
        } catch (Exception | NoSuchMethodError unused) {
            return false;
        }
    }

    public boolean a(a.a.a.g.a aVar, a.a.a.g.a aVar2) {
        g gVar = this.f277a;
        if (gVar != null) {
            return gVar.a(aVar, aVar2);
        }
        return false;
    }

    public final boolean a(k kVar, long j) {
        long jElapsedRealtimeNanos;
        boolean z;
        List<ScanResult> list;
        long j2;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
            } catch (Error | Exception unused) {
                jElapsedRealtimeNanos = 0;
            }
            z = jElapsedRealtimeNanos > 0;
        } else {
            z = false;
            jElapsedRealtimeNanos = 0;
        }
        if (!z || (list = kVar.f295a) == null || list.size() == 0) {
            return false;
        }
        int size = kVar.f295a.size();
        if (size > 16) {
            size = 16;
        }
        long j3 = 0;
        long j4 = 0;
        for (int i = 0; i < size; i++) {
            if (kVar.f295a.get(i) != null && kVar.f295a.get(i).level != 0 && z) {
                try {
                    j2 = (jElapsedRealtimeNanos - kVar.f295a.get(i).timestamp) / 1000000;
                } catch (Error | Exception unused2) {
                    j2 = 0;
                }
                j4 += j2;
                if (j2 > j3) {
                    j3 = j2;
                }
            }
        }
        return j3 * 1000 > j || (j4 / ((long) size)) * 1000 > j;
    }

    public boolean a(k kVar, k kVar2, float f) {
        boolean zA = kVar2.a(kVar, f);
        long jCurrentTimeMillis = System.currentTimeMillis() - a.a.a.b.c.i;
        if (jCurrentTimeMillis <= 0 || jCurrentTimeMillis >= 30000 || !zA || b(kVar2) - b(kVar) <= 30) {
            return zA;
        }
        return false;
    }

    public int b(String str) {
        if (str == null || !str.contains("mNrTac")) {
            return -1;
        }
        Matcher matcher = Pattern.compile("mNrTac=(.+?)\\}").matcher(str.replace(" ", ""));
        while (true) {
            int i = -1;
            while (matcher.find()) {
                if (matcher.groupCount() >= 1) {
                    try {
                        i = Integer.parseInt(matcher.group(1));
                    } catch (Throwable unused) {
                    }
                }
            }
            return i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public long b(k kVar) {
        long jElapsedRealtimeNanos;
        boolean z;
        int size;
        long j;
        long j2;
        long j3;
        long j4;
        if (kVar.c() == 0) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
            } catch (Error | Exception unused) {
                jElapsedRealtimeNanos = 0;
            }
            z = jElapsedRealtimeNanos > 0;
            if (!z) {
                return 0L;
            }
            size = kVar.f295a.size();
            if (size > 16) {
                size = 16;
            }
            j = 0;
            j2 = 0;
            j3 = 0;
            for (int i = 0; i < size; i++) {
                if (kVar.f295a.get(i) == null && kVar.f295a.get(i).level != 0 && z) {
                    try {
                        j4 = (jElapsedRealtimeNanos - kVar.f295a.get(i).timestamp) / 1000000;
                    } catch (Error | Exception unused2) {
                        j4 = 0;
                    }
                    j2 += j4;
                    j++;
                    if (j4 > j3) {
                        j3 = j4;
                    }
                }
            }
            if (j > 1) {
                return (j2 - j3) / (j - 1);
            }
            return j3;
        }
        jElapsedRealtimeNanos = 0;
        if (!z) {
            return 0L;
        }
        size = kVar.f295a.size();
        if (size > 16) {
            size = 16;
        }
        j = 0;
        j2 = 0;
        j3 = 0;
        while (i < size) {
            if (kVar.f295a.get(i) == null) {
            }
        }
        if (j > 1) {
            return (j2 - j3) / (j - 1);
        }
        return j3;
    }

    public final synchronized String b() {
        String strReplace;
        strReplace = null;
        String str = this.f;
        if (str != null && str.length() != 0) {
            strReplace = this.f.replace("\n", "");
        }
        return strReplace;
    }

    public String b(int i, k kVar) {
        if (kVar.c() < 1) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(512);
        int size = kVar.f295a.size();
        if (size <= i) {
            i = size;
        }
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            if (kVar.f295a.get(i2) != null && kVar.f295a.get(i2).level != 0 && kVar.f295a.get(i2).BSSID != null) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append("|");
                }
                stringBuffer.append(kVar.f295a.get(i2).BSSID.replace(":", ""));
                int i3 = kVar.f295a.get(i2).level;
                if (i3 < 0) {
                    i3 = -i3;
                }
                stringBuffer.append(String.format(Locale.CHINA, ";%d;", Integer.valueOf(i3)));
            }
        }
        if (z) {
            return null;
        }
        return stringBuffer.toString();
    }

    public String b(a.a.a.g.a aVar) {
        g gVar = this.f277a;
        if (gVar != null) {
            return gVar.b(aVar);
        }
        return null;
    }

    public boolean b(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.j;
        if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= 2000) {
            return false;
        }
        this.j = System.currentTimeMillis();
        if (a.a.a.i.i.e != 4) {
            a(0);
        }
        g gVar = this.f277a;
        return gVar != null && gVar.d() - j > 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"NewApi"})
    public long c(k kVar) {
        long jElapsedRealtimeNanos;
        boolean z;
        int size;
        long j;
        List<ScanResult> list = kVar.f295a;
        if (list == null || list.size() == 0) {
            return 0L;
        }
        long j2 = 2147483647L;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
            } catch (Error | Exception unused) {
                jElapsedRealtimeNanos = 0;
            }
            z = jElapsedRealtimeNanos > 0;
            if (!z) {
                return 0L;
            }
            size = kVar.f295a.size();
            if (size > 16) {
                size = 16;
            }
            for (int i = 0; i < size; i++) {
                if (kVar.f295a.get(i) == null && kVar.f295a.get(i).level != 0 && z) {
                    try {
                        j = (jElapsedRealtimeNanos - kVar.f295a.get(i).timestamp) / 1000000;
                    } catch (Error | Exception unused2) {
                        j = 0;
                    }
                    if (j < j2) {
                        j2 = j;
                    }
                }
            }
            if (!z) {
                j2 = 0;
            }
            if (j2 < 0) {
                return 0L;
            }
            return j2;
        }
        jElapsedRealtimeNanos = 0;
        if (!z) {
            return 0L;
        }
        size = kVar.f295a.size();
        if (size > 16) {
            size = 16;
        }
        while (i < size) {
            if (kVar.f295a.get(i) == null) {
            }
        }
        if (!z) {
            j2 = 0;
        }
        if (j2 < 0) {
            return 0L;
        }
        return j2;
    }

    public WifiInfo c() {
        g gVar;
        if (a.a.a.i.i.e == 4 || (gVar = this.f277a) == null) {
            return null;
        }
        return gVar.a();
    }

    public final String c(String str) {
        if (str != null) {
            return (str.contains("&") || str.contains(";")) ? str.replace("&", "_").replace(";", "_") : str;
        }
        return str;
    }

    public HashSet<String> c(a.a.a.g.a aVar) {
        g gVar = this.f277a;
        if (gVar != null) {
            return gVar.c(aVar);
        }
        return null;
    }

    public int d(k kVar) {
        int i;
        for (int i2 = 0; i2 < kVar.c(); i2++) {
            if (kVar.f295a.get(i2) != null && (i = -kVar.f295a.get(i2).level) > 0) {
                return i;
            }
        }
        return 0;
    }

    public String d() {
        g gVar = this.f277a;
        if (gVar == null || a.a.a.i.i.e == 4) {
            return null;
        }
        return gVar.b();
    }

    public String d(a.a.a.g.a aVar) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append(aVar.f255b + 23);
        stringBuffer.append("H");
        stringBuffer.append(aVar.f254a + 45);
        stringBuffer.append("K");
        stringBuffer.append(aVar.d + 54);
        stringBuffer.append("Q");
        stringBuffer.append(aVar.f256c + 203);
        return stringBuffer.toString();
    }

    public final int e() {
        try {
            TelephonyManager telephonyManager = this.f278b;
            if (telephonyManager != null) {
                return a.a.a.i.i.b(telephonyManager.getSignalStrength(), "getLteRssnr");
            }
        } catch (Exception unused) {
        }
        return Integer.MAX_VALUE;
    }

    public int f() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = this.f279c;
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 0;
            }
            return activeNetworkInfo.getSubtype();
        } catch (Exception unused) {
            return 0;
        }
    }

    public long g() {
        g gVar = this.f277a;
        if (gVar != null) {
            return gVar.d();
        }
        return 0L;
    }

    public String h() {
        int simState = -1;
        try {
            TelephonyManager telephonyManager = this.f278b;
            if (telephonyManager != null) {
                simState = telephonyManager.getSimState();
            }
        } catch (Exception unused) {
        }
        return "&sim=" + simState;
    }

    public List<WifiConfiguration> i() {
        try {
            WifiManager wifiManager = this.d;
            if (wifiManager != null) {
                return wifiManager.getConfiguredNetworks();
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public k j() {
        g gVar = this.f277a;
        return (gVar == null || a.a.a.i.i.e == 4) ? new k(null, 0L) : gVar.c();
    }

    public String k() {
        k kVarJ;
        if (a.a.a.b.d.i().J == 0 || (kVarJ = j()) == null || kVarJ.c() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ScanResult scanResult : kVarJ.f295a) {
            if (scanResult != null && scanResult.level != 0 && scanResult.BSSID != null) {
                arrayList.add(scanResult);
            }
        }
        Collections.sort(arrayList, new d());
        int iMin = Math.min(a.a.a.b.d.i().L, arrayList.size());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iMin; i++) {
            sb.append(((ScanResult) arrayList.get(i)).BSSID.replace(":", "") + "," + a(((ScanResult) arrayList.get(i)).SSID));
            sb.append(";");
        }
        return sb.toString();
    }

    @SuppressLint({"NewApi"})
    public String l() {
        WifiManager wifiManager = this.d;
        if (wifiManager == null) {
            return "";
        }
        try {
            return (wifiManager.isWifiEnabled() || (Build.VERSION.SDK_INT > 17 && this.d.isScanAlwaysAvailable())) ? "&wifio=1" : "";
        } catch (Exception | NoSuchMethodError unused) {
            return "";
        }
    }

    public void m() {
        if (this.f277a == null) {
            this.f277a = new g();
        }
        this.f277a.a(new c());
    }

    public boolean n() {
        g gVar = this.f277a;
        if (gVar != null) {
            return gVar.e();
        }
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        try {
            ConnectivityManager connectivityManager = this.f279c;
            if (connectivityManager != null) {
                return connectivityManager.getNetworkInfo(1).isConnected();
            }
        } catch (Error | Exception unused) {
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public boolean q() {
        try {
            if (this.d.isWifiEnabled()) {
                return true;
            }
            return Build.VERSION.SDK_INT > 17 && this.d.isScanAlwaysAvailable();
        } catch (Exception | NoSuchMethodError unused) {
            return false;
        }
    }

    public void r() {
        this.k = 0L;
    }

    public boolean s() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        g gVar = this.f277a;
        long jD = gVar != null ? gVar.d() : 0L;
        long j = jCurrentTimeMillis - jD;
        if (j > 0) {
            long j2 = this.k + 5000;
            if (j <= j2 || jCurrentTimeMillis - (this.i * 1000) <= j2) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 28 && j < 25000) {
                return false;
            }
            if (p() && !o() && j <= this.k + 10000) {
                return false;
            }
        }
        return b(jD);
    }

    public boolean t() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.h;
        if (j > 0 && j <= 5000) {
            return false;
        }
        this.h = jCurrentTimeMillis;
        r();
        return s();
    }

    public synchronized void u() {
        v();
        if (this.f277a != null) {
            this.f277a = null;
        }
        this.f278b = null;
        this.d = null;
    }

    public void v() {
        g gVar = this.f277a;
        if (gVar != null) {
            gVar.f();
        }
    }
}
