package a.a.a.g.l;

import a.a.a.g.g;
import android.annotation.SuppressLint;
import android.content.Context;
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
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthNr;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class a implements a.a.a.g.m.a {
    public static Class<?> G;
    public static int H;
    public d q;
    public b r;
    public c s;
    public Context t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f298c = 30;
    public int d = 100;
    public float e = 0.2f;
    public boolean f = true;
    public boolean g = false;
    public TelephonyManager h = null;
    public TelephonyManager i = null;
    public TelephonyManager j = null;
    public SubscriptionManager k = null;
    public a.a.a.g.a l = new a.a.a.g.a();
    public a.a.a.g.a m = null;
    public List<a.a.a.g.a> n = null;
    public Executor o = null;
    public e p = null;
    public boolean u = false;
    public int v = 0;
    public boolean w = false;
    public long x = 0;
    public long y = 0;
    public boolean z = false;
    public boolean A = true;
    public boolean B = false;
    public Handler C = null;
    public int D = -1;
    public int E = -1;
    public final Object F = new Object();

    /* JADX INFO: renamed from: a.a.a.g.l.a$a, reason: collision with other inner class name */
    public class RunnableC0016a implements Runnable {
        public RunnableC0016a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.g();
                synchronized (a.this.F) {
                    a.this.F.notifyAll();
                    if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                        g.h().a("update mCellInfo completed");
                    }
                }
            } catch (Exception e) {
                if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                    g.h().a("handleCellInfo error = " + e);
                }
            }
        }
    }

    public class b extends TelephonyManager.CellInfoCallback {
        public b() {
        }

        public /* synthetic */ b(a aVar, RunnableC0016a runnableC0016a) {
            this();
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            boolean z = a.a.a.g.m.a.f310a;
            if (z && a.a.a.g.m.a.f311b) {
                g.h().a("onCellInfo");
            }
            if (list == null) {
                return;
            }
            boolean z2 = a.a.a.g.m.a.f311b;
            if (!z2 || g.h().a(list)) {
                if (z && z2) {
                    g.h().a("request sim1 cellInfo");
                }
                if (a.this.z) {
                    a aVar = a.this;
                    aVar.A = !aVar.A;
                }
                if (!a.this.z || a.this.A) {
                    a.this.a();
                }
            }
        }
    }

    public class c extends TelephonyManager.CellInfoCallback {
        public c() {
        }

        public /* synthetic */ c(a aVar, RunnableC0016a runnableC0016a) {
            this();
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            if (list == null) {
                return;
            }
            boolean z = a.a.a.g.m.a.f311b;
            if (!z || g.h().a(list)) {
                if (a.a.a.g.m.a.f310a && z) {
                    g.h().a("request sim2 cellInfo");
                }
                if (a.this.z) {
                    a aVar = a.this;
                    aVar.A = !aVar.A;
                }
                if (!a.this.z || a.this.A) {
                    a.this.a();
                }
            }
        }
    }

    public class d extends TelephonyManager.CellInfoCallback {
        public d() {
        }

        public /* synthetic */ d(a aVar, RunnableC0016a runnableC0016a) {
            this();
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            if (list == null) {
                return;
            }
            if (!a.a.a.g.m.a.f311b || g.h().a(list)) {
                a.this.a();
            }
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onError(int i, Throwable th) {
            if (th != null) {
                th.printStackTrace();
            }
            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                g.h().a("cell onError = " + i);
            }
        }
    }

    public class e extends PhoneStateListener {

        /* JADX INFO: renamed from: a.a.a.g.l.a$e$a, reason: collision with other inner class name */
        public class RunnableC0017a implements Runnable {
            public RunnableC0017a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                        g.h().a("cell received cellinfo change");
                    }
                    a.this.g();
                } catch (Exception e) {
                    if (a.a.a.g.m.a.f310a) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public e() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCellInfoChanged(List<CellInfo> list) {
            if (list == null) {
                return;
            }
            a.this.C.post(new RunnableC0017a());
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            a.a.a.g.a aVar;
            int cdmaDbm;
            if (a.this.l != null) {
                if (a.this.l.i != 'g') {
                    if (a.this.l.i == 'c') {
                        aVar = a.this.l;
                        cdmaDbm = signalStrength.getCdmaDbm();
                    }
                    if (a.a.a.g.m.a.f310a || !a.a.a.g.m.a.f311b) {
                    }
                    g.h().a("cell strength===== cell singal strength changed : " + a.this.l.h);
                    return;
                }
                aVar = a.this.l;
                cdmaDbm = signalStrength.getGsmSignalStrength();
                aVar.h = cdmaDbm;
                if (a.a.a.g.m.a.f310a) {
                }
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f305a = new a();
    }

    public static int a(CellIdentityNr cellIdentityNr) {
        try {
            int iA = a.a.a.g.m.b.a(cellIdentityNr, "getHwTac");
            if (!a.a.a.g.m.a.f310a || !a.a.a.g.m.a.f311b) {
                return iA;
            }
            g.h().a(" get hw tac = " + iA);
            return iA;
        } catch (Throwable th) {
            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                g.h().a(" get hw tac exception !" + th);
            }
            return -1;
        }
    }

    public static int b(String str) {
        if (str == null || !str.contains("mNrTac")) {
            return -1;
        }
        Matcher matcher = Pattern.compile("mNrTac=(.+?)\\}").matcher(str.replace(" ", ""));
        while (true) {
            int i = -1;
            while (matcher.find()) {
                if (matcher.groupCount() >= 1) {
                    String strGroup = matcher.group(1);
                    if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                        g.h().a(" pasrse mnrtac = " + strGroup);
                    }
                    try {
                        i = Integer.parseInt(strGroup);
                    } catch (Throwable th) {
                        if (a.a.a.g.m.a.f310a) {
                            th.printStackTrace();
                        }
                    }
                }
            }
            return i;
        }
    }

    public static int d(int i) {
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    public static a i() {
        return f.f305a;
    }

    public final int a(String str) {
        if (str != null && str.contains("cl_s2")) {
            try {
                Matcher matcher = Pattern.compile("cl_s2=[0-9]{1,}").matcher(str);
                if (matcher.find()) {
                    String strGroup = matcher.group();
                    return Integer.parseInt(strGroup.substring(strGroup.indexOf("cl_s2=") + 6, strGroup.length()));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return -1;
    }

    public a.a.a.g.a a(int i) {
        a.a.a.g.e eVarH;
        String str;
        a.a.a.g.a aVar;
        if (this.h != null) {
            try {
                g();
                boolean z = a.a.a.g.m.a.f310a;
                if (z && a.a.a.g.m.a.f311b) {
                    g.h().a(" lastDiffTime = " + this.y + ", diffTime = " + i);
                }
                if (Build.VERSION.SDK_INT >= 29 && this.w) {
                    if (i < Integer.MAX_VALUE) {
                        long j = i;
                        if (j != this.y) {
                            if (z && a.a.a.g.m.a.f311b) {
                                eVarH = g.h();
                                str = "diff time is changed";
                                eVarH.a(str);
                            }
                            e();
                        } else if (System.currentTimeMillis() - this.x > j) {
                            if (z && a.a.a.g.m.a.f311b) {
                                eVarH = g.h();
                                str = " over diff time";
                                eVarH.a(str);
                            }
                            e();
                        }
                    }
                    this.y = i;
                }
            } catch (Exception e2) {
                if (a.a.a.g.m.a.f310a) {
                    e2.printStackTrace();
                }
            }
        }
        a.a.a.g.a aVar2 = this.l;
        if (aVar2 != null && aVar2.d()) {
            this.m = null;
            this.m = new a.a.a.g.a(this.l);
        }
        a.a.a.g.a aVar3 = this.l;
        if (aVar3 != null && aVar3.c() && (aVar = this.m) != null) {
            a.a.a.g.a aVar4 = this.l;
            if (aVar4.i == 'g') {
                aVar4.d = aVar.d;
                aVar4.f256c = aVar.f256c;
            }
        }
        return this.l;
    }

    public a.a.a.g.a a(a.a.a.g.a aVar, TelephonyManager telephonyManager) {
        CellLocation cellLocation;
        a.a.a.g.a aVarB = b(aVar, telephonyManager);
        if (Build.VERSION.SDK_INT <= 28 && (aVarB == null || !aVarB.e())) {
            try {
                cellLocation = telephonyManager.getCellLocation();
            } catch (Throwable unused) {
                cellLocation = null;
            }
            if (cellLocation != null) {
                aVarB = a(cellLocation);
            }
            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b && aVarB != null) {
                g.h().a("main process: old cell api = " + f(aVarB));
            }
        }
        return aVarB;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:140:0x0353 A[Catch: Exception -> 0x0474, TRY_LEAVE, TryCatch #8 {Exception -> 0x0474, blocks: (B:69:0x01e0, B:71:0x01e5, B:73:0x01f0, B:75:0x01f4, B:76:0x01fd, B:78:0x023b, B:107:0x02ca, B:79:0x0241, B:81:0x0247, B:83:0x024c, B:85:0x0257, B:87:0x025b, B:88:0x0264, B:96:0x0281, B:104:0x029e, B:101:0x0297, B:103:0x029b, B:93:0x027a, B:95:0x027e, B:108:0x02ce, B:118:0x0306, B:120:0x030a, B:122:0x030e, B:124:0x0319, B:132:0x0336, B:140:0x0353, B:154:0x0393, B:168:0x03cf, B:170:0x03d4, B:171:0x03da, B:173:0x03e7, B:174:0x03ed, B:176:0x03f6, B:177:0x03fc, B:179:0x0411, B:181:0x0417, B:165:0x03c8, B:167:0x03cc, B:151:0x038c, B:153:0x0390, B:137:0x034c, B:139:0x0350, B:129:0x032f, B:131:0x0333, B:117:0x0302, B:110:0x02d2, B:112:0x02df, B:114:0x02e3, B:98:0x0287, B:157:0x0398, B:159:0x03a4, B:161:0x03a8, B:162:0x03c0, B:90:0x026a, B:143:0x0360, B:145:0x0368, B:147:0x036c, B:148:0x0384, B:134:0x033c, B:126:0x031f), top: B:237:0x01e0, inners: #0, #3, #4, #5, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0368 A[Catch: all -> 0x038b, TryCatch #6 {all -> 0x038b, blocks: (B:143:0x0360, B:145:0x0368, B:147:0x036c, B:148:0x0384), top: B:233:0x0360, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0393 A[Catch: Exception -> 0x0474, TRY_LEAVE, TryCatch #8 {Exception -> 0x0474, blocks: (B:69:0x01e0, B:71:0x01e5, B:73:0x01f0, B:75:0x01f4, B:76:0x01fd, B:78:0x023b, B:107:0x02ca, B:79:0x0241, B:81:0x0247, B:83:0x024c, B:85:0x0257, B:87:0x025b, B:88:0x0264, B:96:0x0281, B:104:0x029e, B:101:0x0297, B:103:0x029b, B:93:0x027a, B:95:0x027e, B:108:0x02ce, B:118:0x0306, B:120:0x030a, B:122:0x030e, B:124:0x0319, B:132:0x0336, B:140:0x0353, B:154:0x0393, B:168:0x03cf, B:170:0x03d4, B:171:0x03da, B:173:0x03e7, B:174:0x03ed, B:176:0x03f6, B:177:0x03fc, B:179:0x0411, B:181:0x0417, B:165:0x03c8, B:167:0x03cc, B:151:0x038c, B:153:0x0390, B:137:0x034c, B:139:0x0350, B:129:0x032f, B:131:0x0333, B:117:0x0302, B:110:0x02d2, B:112:0x02df, B:114:0x02e3, B:98:0x0287, B:157:0x0398, B:159:0x03a4, B:161:0x03a8, B:162:0x03c0, B:90:0x026a, B:143:0x0360, B:145:0x0368, B:147:0x036c, B:148:0x0384, B:134:0x033c, B:126:0x031f), top: B:237:0x01e0, inners: #0, #3, #4, #5, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x03a4 A[Catch: all -> 0x03c7, TryCatch #4 {all -> 0x03c7, blocks: (B:157:0x0398, B:159:0x03a4, B:161:0x03a8, B:162:0x03c0), top: B:229:0x0398, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x03d4 A[Catch: Exception -> 0x0474, TryCatch #8 {Exception -> 0x0474, blocks: (B:69:0x01e0, B:71:0x01e5, B:73:0x01f0, B:75:0x01f4, B:76:0x01fd, B:78:0x023b, B:107:0x02ca, B:79:0x0241, B:81:0x0247, B:83:0x024c, B:85:0x0257, B:87:0x025b, B:88:0x0264, B:96:0x0281, B:104:0x029e, B:101:0x0297, B:103:0x029b, B:93:0x027a, B:95:0x027e, B:108:0x02ce, B:118:0x0306, B:120:0x030a, B:122:0x030e, B:124:0x0319, B:132:0x0336, B:140:0x0353, B:154:0x0393, B:168:0x03cf, B:170:0x03d4, B:171:0x03da, B:173:0x03e7, B:174:0x03ed, B:176:0x03f6, B:177:0x03fc, B:179:0x0411, B:181:0x0417, B:165:0x03c8, B:167:0x03cc, B:151:0x038c, B:153:0x0390, B:137:0x034c, B:139:0x0350, B:129:0x032f, B:131:0x0333, B:117:0x0302, B:110:0x02d2, B:112:0x02df, B:114:0x02e3, B:98:0x0287, B:157:0x0398, B:159:0x03a4, B:161:0x03a8, B:162:0x03c0, B:90:0x026a, B:143:0x0360, B:145:0x0368, B:147:0x036c, B:148:0x0384, B:134:0x033c, B:126:0x031f), top: B:237:0x01e0, inners: #0, #3, #4, #5, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x03e7 A[Catch: Exception -> 0x0474, TryCatch #8 {Exception -> 0x0474, blocks: (B:69:0x01e0, B:71:0x01e5, B:73:0x01f0, B:75:0x01f4, B:76:0x01fd, B:78:0x023b, B:107:0x02ca, B:79:0x0241, B:81:0x0247, B:83:0x024c, B:85:0x0257, B:87:0x025b, B:88:0x0264, B:96:0x0281, B:104:0x029e, B:101:0x0297, B:103:0x029b, B:93:0x027a, B:95:0x027e, B:108:0x02ce, B:118:0x0306, B:120:0x030a, B:122:0x030e, B:124:0x0319, B:132:0x0336, B:140:0x0353, B:154:0x0393, B:168:0x03cf, B:170:0x03d4, B:171:0x03da, B:173:0x03e7, B:174:0x03ed, B:176:0x03f6, B:177:0x03fc, B:179:0x0411, B:181:0x0417, B:165:0x03c8, B:167:0x03cc, B:151:0x038c, B:153:0x0390, B:137:0x034c, B:139:0x0350, B:129:0x032f, B:131:0x0333, B:117:0x0302, B:110:0x02d2, B:112:0x02df, B:114:0x02e3, B:98:0x0287, B:157:0x0398, B:159:0x03a4, B:161:0x03a8, B:162:0x03c0, B:90:0x026a, B:143:0x0360, B:145:0x0368, B:147:0x036c, B:148:0x0384, B:134:0x033c, B:126:0x031f), top: B:237:0x01e0, inners: #0, #3, #4, #5, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x03f6 A[Catch: Exception -> 0x0474, TryCatch #8 {Exception -> 0x0474, blocks: (B:69:0x01e0, B:71:0x01e5, B:73:0x01f0, B:75:0x01f4, B:76:0x01fd, B:78:0x023b, B:107:0x02ca, B:79:0x0241, B:81:0x0247, B:83:0x024c, B:85:0x0257, B:87:0x025b, B:88:0x0264, B:96:0x0281, B:104:0x029e, B:101:0x0297, B:103:0x029b, B:93:0x027a, B:95:0x027e, B:108:0x02ce, B:118:0x0306, B:120:0x030a, B:122:0x030e, B:124:0x0319, B:132:0x0336, B:140:0x0353, B:154:0x0393, B:168:0x03cf, B:170:0x03d4, B:171:0x03da, B:173:0x03e7, B:174:0x03ed, B:176:0x03f6, B:177:0x03fc, B:179:0x0411, B:181:0x0417, B:165:0x03c8, B:167:0x03cc, B:151:0x038c, B:153:0x0390, B:137:0x034c, B:139:0x0350, B:129:0x032f, B:131:0x0333, B:117:0x0302, B:110:0x02d2, B:112:0x02df, B:114:0x02e3, B:98:0x0287, B:157:0x0398, B:159:0x03a4, B:161:0x03a8, B:162:0x03c0, B:90:0x026a, B:143:0x0360, B:145:0x0368, B:147:0x036c, B:148:0x0384, B:134:0x033c, B:126:0x031f), top: B:237:0x01e0, inners: #0, #3, #4, #5, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x0411 A[Catch: Exception -> 0x0474, TRY_LEAVE, TryCatch #8 {Exception -> 0x0474, blocks: (B:69:0x01e0, B:71:0x01e5, B:73:0x01f0, B:75:0x01f4, B:76:0x01fd, B:78:0x023b, B:107:0x02ca, B:79:0x0241, B:81:0x0247, B:83:0x024c, B:85:0x0257, B:87:0x025b, B:88:0x0264, B:96:0x0281, B:104:0x029e, B:101:0x0297, B:103:0x029b, B:93:0x027a, B:95:0x027e, B:108:0x02ce, B:118:0x0306, B:120:0x030a, B:122:0x030e, B:124:0x0319, B:132:0x0336, B:140:0x0353, B:154:0x0393, B:168:0x03cf, B:170:0x03d4, B:171:0x03da, B:173:0x03e7, B:174:0x03ed, B:176:0x03f6, B:177:0x03fc, B:179:0x0411, B:181:0x0417, B:165:0x03c8, B:167:0x03cc, B:151:0x038c, B:153:0x0390, B:137:0x034c, B:139:0x0350, B:129:0x032f, B:131:0x0333, B:117:0x0302, B:110:0x02d2, B:112:0x02df, B:114:0x02e3, B:98:0x0287, B:157:0x0398, B:159:0x03a4, B:161:0x03a8, B:162:0x03c0, B:90:0x026a, B:143:0x0360, B:145:0x0368, B:147:0x036c, B:148:0x0384, B:134:0x033c, B:126:0x031f), top: B:237:0x01e0, inners: #0, #3, #4, #5, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x0287 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0398 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0360 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x033c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01d1  */
    public final a.a.a.g.a a(CellInfo cellInfo, a.a.a.g.a aVar, TelephonyManager telephonyManager) {
        boolean z;
        int iIntValue;
        a.a.a.g.e eVarH;
        StringBuilder sb;
        String str;
        int i;
        a.a.a.g.e eVarH2;
        StringBuilder sb2;
        CellIdentityNr cellIdentityNr;
        int iD;
        int iA;
        int iB;
        CellSignalStrengthNr cellSignalStrengthNr;
        int i2 = Build.VERSION.SDK_INT;
        int iIntValue2 = Integer.valueOf(i2).intValue();
        if (iIntValue2 < 17) {
            return null;
        }
        a.a.a.g.a aVar2 = new a.a.a.g.a();
        if (cellInfo instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                g.h().a("CellInfoGsm");
            }
            aVar2.f256c = d(cellIdentity.getMcc());
            aVar2.d = d(cellIdentity.getMnc());
            aVar2.f254a = d(cellIdentity.getLac());
            aVar2.f255b = d(cellIdentity.getCid());
            aVar2.i = 'g';
            aVar2.h = cellInfoGsm.getCellSignalStrength().getAsuLevel();
            aVar2.k = 2;
            if (i2 >= 28) {
                aVar2.j = cellInfo.getCellConnectionStatus();
            }
            z = true;
        } else {
            if (cellInfo instanceof CellInfoCdma) {
                CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
                boolean z2 = a.a.a.g.m.a.f310a;
                if (z2 && a.a.a.g.m.a.f311b) {
                    g.h().a("CellInfoCdma");
                    g.h().a("lat = " + cellIdentity2.getLatitude());
                    g.h().a("lon = " + cellIdentity2.getLongitude());
                }
                aVar2.e = cellIdentity2.getLatitude();
                aVar2.f = cellIdentity2.getLongitude();
                aVar2.d = d(cellIdentity2.getSystemId());
                aVar2.f254a = d(cellIdentity2.getNetworkId());
                aVar2.f255b = d(cellIdentity2.getBasestationId());
                aVar2.i = 'c';
                aVar2.h = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                aVar2.k = 1;
                if (i2 >= 28) {
                    aVar2.j = cellInfo.getCellConnectionStatus();
                }
                if (aVar == null || (i = aVar.f256c) <= 0) {
                    try {
                        String networkOperator = telephonyManager.getNetworkOperator();
                        if (networkOperator == null || networkOperator.length() <= 0 || networkOperator.length() < 3 || (iIntValue = Integer.valueOf(networkOperator.substring(0, 3)).intValue()) < 0) {
                            iIntValue = -1;
                        }
                    } catch (Exception e2) {
                        if (a.a.a.g.m.a.f310a) {
                            e2.printStackTrace();
                        }
                    }
                    if (iIntValue > 0) {
                        aVar2.f256c = iIntValue;
                        if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                            eVarH = g.h();
                            sb = new StringBuilder();
                            str = "cdma set old mcc = ";
                            sb.append(str);
                            sb.append(aVar2.f256c);
                            eVarH.a(sb.toString());
                        }
                    }
                } else {
                    aVar2.f256c = i;
                    if (z2 && a.a.a.g.m.a.f311b) {
                        eVarH = g.h();
                        sb = new StringBuilder();
                        str = "cdma set old cellinfo mcc = ";
                        sb.append(str);
                        sb.append(aVar2.f256c);
                        eVarH.a(sb.toString());
                    }
                }
            } else if (cellInfo instanceof CellInfoLte) {
                CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                    g.h().a("CellInfoLte");
                }
                aVar2.f256c = d(cellIdentity3.getMcc());
                aVar2.d = d(cellIdentity3.getMnc());
                aVar2.f254a = d(cellIdentity3.getTac());
                aVar2.f255b = d(cellIdentity3.getCi());
                aVar2.i = 'g';
                aVar2.h = cellInfoLte.getCellSignalStrength().getAsuLevel();
                aVar2.k = 3;
                if (i2 >= 28) {
                    aVar2.j = cellInfo.getCellConnectionStatus();
                }
            } else {
                z = false;
            }
            z = true;
        }
        if (iIntValue2 >= 18 && !z) {
            try {
                if (cellInfo instanceof CellInfoWcdma) {
                    CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                    if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                        g.h().a("CellInfoWcdma");
                    }
                    aVar2.f256c = d(cellIdentity4.getMcc());
                    aVar2.d = d(cellIdentity4.getMnc());
                    aVar2.f254a = d(cellIdentity4.getLac());
                    aVar2.f255b = d(cellIdentity4.getCid());
                    aVar2.i = 'g';
                    aVar2.h = ((CellInfoWcdma) cellInfo).getCellSignalStrength().getAsuLevel();
                    aVar2.k = 4;
                    if (Build.VERSION.SDK_INT >= 28) {
                        aVar2.j = cellInfo.getCellConnectionStatus();
                    }
                } else if (Build.VERSION.SDK_INT >= 29) {
                    if (cellInfo instanceof CellInfoTdscdma) {
                        CellIdentityTdscdma cellIdentity5 = ((CellInfoTdscdma) cellInfo).getCellIdentity();
                        if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                            g.h().a("CellInfoTdscdma");
                        }
                        if (cellIdentity5.getMccString() != null) {
                            try {
                                aVar2.f256c = Integer.valueOf(cellIdentity5.getMccString()).intValue();
                            } catch (Throwable th) {
                                if (a.a.a.g.m.a.f310a) {
                                    th.printStackTrace();
                                }
                            }
                            if (cellIdentity5.getMncString() != null) {
                                try {
                                    aVar2.d = Integer.valueOf(cellIdentity5.getMncString()).intValue();
                                } catch (Throwable th2) {
                                    if (a.a.a.g.m.a.f310a) {
                                        th2.printStackTrace();
                                    }
                                }
                            }
                            aVar2.f254a = d(cellIdentity5.getLac());
                            aVar2.f255b = d(cellIdentity5.getCid());
                            aVar2.i = 'g';
                            aVar2.h = ((CellInfoTdscdma) cellInfo).getCellSignalStrength().getAsuLevel();
                            aVar2.k = 5;
                            if (Build.VERSION.SDK_INT >= 28) {
                                aVar2.j = cellInfo.getCellConnectionStatus();
                            }
                        } else {
                            if (cellIdentity5.getMncString() != null) {
                                aVar2.d = Integer.valueOf(cellIdentity5.getMncString()).intValue();
                            }
                            aVar2.f254a = d(cellIdentity5.getLac());
                            aVar2.f255b = d(cellIdentity5.getCid());
                            aVar2.i = 'g';
                            aVar2.h = ((CellInfoTdscdma) cellInfo).getCellSignalStrength().getAsuLevel();
                            aVar2.k = 5;
                            if (Build.VERSION.SDK_INT >= 28) {
                                aVar2.j = cellInfo.getCellConnectionStatus();
                            }
                        }
                    } else if (cellInfo instanceof CellInfoNr) {
                        try {
                            CellIdentityNr cellIdentityNr2 = (CellIdentityNr) ((CellInfoNr) cellInfo).getCellIdentity();
                            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                                g.h().a(" get cell nr = " + cellIdentityNr2.toString());
                            }
                            cellIdentityNr = cellIdentityNr2;
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                            cellIdentityNr = null;
                        }
                        if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                            g.h().a("CellInfoNr");
                        }
                        if (cellIdentityNr != null) {
                            if (cellIdentityNr.getMccString() != null) {
                                try {
                                    aVar2.f256c = Integer.valueOf(cellIdentityNr.getMccString()).intValue();
                                } catch (Throwable th4) {
                                    if (a.a.a.g.m.a.f310a) {
                                        th4.printStackTrace();
                                    }
                                }
                                if (cellIdentityNr.getMncString() != null) {
                                    try {
                                        aVar2.d = Integer.valueOf(cellIdentityNr.getMncString()).intValue();
                                    } catch (Throwable th5) {
                                        if (a.a.a.g.m.a.f310a) {
                                            th5.printStackTrace();
                                        }
                                    }
                                    iD = d(cellIdentityNr.getTac());
                                    aVar2.f254a = iD;
                                    if (iD == -1) {
                                        try {
                                            iA = a(cellIdentityNr);
                                            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                                                g.h().a(" get nrtac for huawei = " + iA);
                                            }
                                            aVar2.f254a = d(iA);
                                        } catch (Throwable th6) {
                                            if (a.a.a.g.m.a.f310a) {
                                                th6.printStackTrace();
                                            }
                                        }
                                        if (aVar2.f254a == -1) {
                                            try {
                                                iB = b(cellIdentityNr.toString());
                                                if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                                                    g.h().a(" get nrtac for samsung = " + iB);
                                                }
                                                aVar2.f254a = d(iB);
                                            } catch (Throwable th7) {
                                                if (a.a.a.g.m.a.f310a) {
                                                    th7.printStackTrace();
                                                }
                                            }
                                        }
                                        if (aVar2.f254a == -1) {
                                            aVar2.f254a = cellIdentityNr.getTac();
                                        }
                                        if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                            aVar2.f255b = cellIdentityNr.getNci();
                                        }
                                        aVar2.i = 'g';
                                        aVar2.k = 6;
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            aVar2.j = cellInfo.getCellConnectionStatus();
                                        }
                                        cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                        aVar2.h = cellSignalStrengthNr.getAsuLevel();
                                        if (aVar2.e()) {
                                            aVar2.o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                        }
                                    } else {
                                        if (aVar2.f254a == -1) {
                                            iB = b(cellIdentityNr.toString());
                                            if (a.a.a.g.m.a.f310a) {
                                                g.h().a(" get nrtac for samsung = " + iB);
                                            }
                                            aVar2.f254a = d(iB);
                                        }
                                        if (aVar2.f254a == -1) {
                                            aVar2.f254a = cellIdentityNr.getTac();
                                        }
                                        if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                            aVar2.f255b = cellIdentityNr.getNci();
                                        }
                                        aVar2.i = 'g';
                                        aVar2.k = 6;
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            aVar2.j = cellInfo.getCellConnectionStatus();
                                        }
                                        cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                        aVar2.h = cellSignalStrengthNr.getAsuLevel();
                                        if (aVar2.e()) {
                                            aVar2.o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                        }
                                    }
                                } else {
                                    iD = d(cellIdentityNr.getTac());
                                    aVar2.f254a = iD;
                                    if (iD == -1) {
                                        iA = a(cellIdentityNr);
                                        if (a.a.a.g.m.a.f310a) {
                                            g.h().a(" get nrtac for huawei = " + iA);
                                        }
                                        aVar2.f254a = d(iA);
                                        if (aVar2.f254a == -1) {
                                            iB = b(cellIdentityNr.toString());
                                            if (a.a.a.g.m.a.f310a) {
                                                g.h().a(" get nrtac for samsung = " + iB);
                                            }
                                            aVar2.f254a = d(iB);
                                        }
                                        if (aVar2.f254a == -1) {
                                            aVar2.f254a = cellIdentityNr.getTac();
                                        }
                                        if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                            aVar2.f255b = cellIdentityNr.getNci();
                                        }
                                        aVar2.i = 'g';
                                        aVar2.k = 6;
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            aVar2.j = cellInfo.getCellConnectionStatus();
                                        }
                                        cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                        aVar2.h = cellSignalStrengthNr.getAsuLevel();
                                        if (aVar2.e()) {
                                            aVar2.o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                        }
                                    } else {
                                        if (aVar2.f254a == -1) {
                                            iB = b(cellIdentityNr.toString());
                                            if (a.a.a.g.m.a.f310a) {
                                                g.h().a(" get nrtac for samsung = " + iB);
                                            }
                                            aVar2.f254a = d(iB);
                                        }
                                        if (aVar2.f254a == -1) {
                                            aVar2.f254a = cellIdentityNr.getTac();
                                        }
                                        if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                            aVar2.f255b = cellIdentityNr.getNci();
                                        }
                                        aVar2.i = 'g';
                                        aVar2.k = 6;
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            aVar2.j = cellInfo.getCellConnectionStatus();
                                        }
                                        cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                        aVar2.h = cellSignalStrengthNr.getAsuLevel();
                                        if (aVar2.e()) {
                                            aVar2.o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                        }
                                    }
                                }
                            } else if (cellIdentityNr.getMncString() != null) {
                                aVar2.d = Integer.valueOf(cellIdentityNr.getMncString()).intValue();
                                iD = d(cellIdentityNr.getTac());
                                aVar2.f254a = iD;
                                if (iD == -1) {
                                    iA = a(cellIdentityNr);
                                    if (a.a.a.g.m.a.f310a) {
                                        g.h().a(" get nrtac for huawei = " + iA);
                                    }
                                    aVar2.f254a = d(iA);
                                    if (aVar2.f254a == -1) {
                                        iB = b(cellIdentityNr.toString());
                                        if (a.a.a.g.m.a.f310a) {
                                            g.h().a(" get nrtac for samsung = " + iB);
                                        }
                                        aVar2.f254a = d(iB);
                                    }
                                    if (aVar2.f254a == -1) {
                                        aVar2.f254a = cellIdentityNr.getTac();
                                    }
                                    if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                        aVar2.f255b = cellIdentityNr.getNci();
                                    }
                                    aVar2.i = 'g';
                                    aVar2.k = 6;
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        aVar2.j = cellInfo.getCellConnectionStatus();
                                    }
                                    cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                    aVar2.h = cellSignalStrengthNr.getAsuLevel();
                                    if (aVar2.e()) {
                                        aVar2.o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                    }
                                } else {
                                    if (aVar2.f254a == -1) {
                                        iB = b(cellIdentityNr.toString());
                                        if (a.a.a.g.m.a.f310a) {
                                            g.h().a(" get nrtac for samsung = " + iB);
                                        }
                                        aVar2.f254a = d(iB);
                                    }
                                    if (aVar2.f254a == -1) {
                                        aVar2.f254a = cellIdentityNr.getTac();
                                    }
                                    if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                        aVar2.f255b = cellIdentityNr.getNci();
                                    }
                                    aVar2.i = 'g';
                                    aVar2.k = 6;
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        aVar2.j = cellInfo.getCellConnectionStatus();
                                    }
                                    cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                    aVar2.h = cellSignalStrengthNr.getAsuLevel();
                                    if (aVar2.e()) {
                                        aVar2.o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                    }
                                }
                            } else {
                                iD = d(cellIdentityNr.getTac());
                                aVar2.f254a = iD;
                                if (iD == -1) {
                                    iA = a(cellIdentityNr);
                                    if (a.a.a.g.m.a.f310a) {
                                        g.h().a(" get nrtac for huawei = " + iA);
                                    }
                                    aVar2.f254a = d(iA);
                                    if (aVar2.f254a == -1) {
                                        iB = b(cellIdentityNr.toString());
                                        if (a.a.a.g.m.a.f310a) {
                                            g.h().a(" get nrtac for samsung = " + iB);
                                        }
                                        aVar2.f254a = d(iB);
                                    }
                                    if (aVar2.f254a == -1) {
                                        aVar2.f254a = cellIdentityNr.getTac();
                                    }
                                    if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                        aVar2.f255b = cellIdentityNr.getNci();
                                    }
                                    aVar2.i = 'g';
                                    aVar2.k = 6;
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        aVar2.j = cellInfo.getCellConnectionStatus();
                                    }
                                    cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                    aVar2.h = cellSignalStrengthNr.getAsuLevel();
                                    if (aVar2.e()) {
                                        aVar2.o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                    }
                                } else {
                                    if (aVar2.f254a == -1) {
                                        iB = b(cellIdentityNr.toString());
                                        if (a.a.a.g.m.a.f310a) {
                                            g.h().a(" get nrtac for samsung = " + iB);
                                        }
                                        aVar2.f254a = d(iB);
                                    }
                                    if (aVar2.f254a == -1) {
                                        aVar2.f254a = cellIdentityNr.getTac();
                                    }
                                    if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                        aVar2.f255b = cellIdentityNr.getNci();
                                    }
                                    aVar2.i = 'g';
                                    aVar2.k = 6;
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        aVar2.j = cellInfo.getCellConnectionStatus();
                                    }
                                    cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                    aVar2.h = cellSignalStrengthNr.getAsuLevel();
                                    if (aVar2.e()) {
                                        aVar2.o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                if (a.a.a.g.m.a.f310a) {
                    e3.printStackTrace();
                }
            }
        }
        try {
            if (iIntValue2 >= 30) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis();
                boolean z3 = a.a.a.g.m.a.f310a;
                if (z3 && a.a.a.g.m.a.f311b) {
                    g.h().a("new cell delta1 time(ms) = " + SystemClock.elapsedRealtime());
                    g.h().a("new cell delta2 time(ms) = " + cellInfo.getTimestampMillis());
                    g.h().a("new cell delta3 time(ms) = " + jElapsedRealtime);
                }
                aVar2.g = System.currentTimeMillis() - jElapsedRealtime;
                if (z3) {
                    eVarH2 = g.h();
                    sb2 = new StringBuilder();
                    sb2.append("new cell time apilevel up 30 (ms) = ");
                    sb2.append(aVar2.g);
                    eVarH2.a(sb2.toString());
                }
            } else {
                long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000;
                boolean z4 = a.a.a.g.m.a.f310a;
                if (z4 && a.a.a.g.m.a.f311b) {
                    g.h().a("new cell delta1 time(ns) = " + SystemClock.elapsedRealtimeNanos());
                    g.h().a("new cell delta2 time(ns) = " + cellInfo.getTimeStamp());
                    g.h().a("new cell delta3 time(ms) = " + jElapsedRealtimeNanos);
                }
                aVar2.g = System.currentTimeMillis() - jElapsedRealtimeNanos;
                if (z4 && a.a.a.g.m.a.f311b) {
                    eVarH2 = g.h();
                    sb2 = new StringBuilder();
                    sb2.append("new cell time(ms) = ");
                    sb2.append(aVar2.g);
                    eVarH2.a(sb2.toString());
                }
            }
        } catch (Error e4) {
            if (a.a.a.g.m.a.f310a) {
                e4.printStackTrace();
            }
            aVar2.g = System.currentTimeMillis();
        }
        if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
            g.h().a("mcc = " + aVar2.f256c);
            g.h().a("mnc = " + aVar2.d);
            g.h().a("lac = " + aVar2.f254a);
            g.h().a("cid = " + aVar2.f255b);
            g.h().a("cs = " + aVar2.j);
        }
        return aVar2;
    }

    public final a.a.a.g.a a(CellLocation cellLocation) {
        return a(cellLocation, false);
    }

    public final a.a.a.g.a a(CellLocation cellLocation, boolean z) {
        if (cellLocation == null || this.h == null) {
            return null;
        }
        if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
            g.h().a("set cell info..");
        }
        a.a.a.g.a aVar = new a.a.a.g.a();
        aVar.l = 1;
        aVar.g = System.currentTimeMillis();
        try {
            String networkOperator = this.h.getNetworkOperator();
            if (networkOperator != null && networkOperator.length() > 0) {
                int iIntValue = -1;
                if (networkOperator.length() >= 3) {
                    iIntValue = Integer.valueOf(networkOperator.substring(0, 3)).intValue();
                    aVar.f256c = iIntValue < 0 ? this.l.f256c : iIntValue;
                }
                String strSubstring = networkOperator.substring(3);
                if (strSubstring != null) {
                    char[] charArray = strSubstring.toCharArray();
                    int i = 0;
                    while (i < charArray.length && Character.isDigit(charArray[i])) {
                        i++;
                    }
                    iIntValue = Integer.valueOf(strSubstring.substring(0, i)).intValue();
                }
                if (iIntValue < 0) {
                    iIntValue = this.l.d;
                }
                aVar.d = iIntValue;
            }
            this.v = this.h.getSimState();
            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                g.h().a("sim state:" + this.v);
            }
        } catch (Exception e2) {
            if (a.a.a.g.m.a.f310a) {
                e2.printStackTrace();
            }
            H = 1;
        }
        if (cellLocation instanceof GsmCellLocation) {
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            aVar.f254a = gsmCellLocation.getLac();
            aVar.f255b = gsmCellLocation.getCid();
            aVar.i = 'g';
            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                g.h().a("bslocation mNetworkType = 'g'");
            }
        } else if (cellLocation instanceof CdmaCellLocation) {
            aVar.i = 'c';
            boolean z2 = a.a.a.g.m.a.f310a;
            if (z2 && a.a.a.g.m.a.f311b) {
                g.h().a("bslocation mNetworkType = 'c'");
            }
            if (G == null) {
                try {
                    G = Class.forName("android.telephony.cdma.CdmaCellLocation");
                } catch (Exception unused) {
                    G = null;
                    return aVar;
                }
            }
            Class<?> cls = G;
            if (cls != null && cls.isInstance(cellLocation)) {
                try {
                    int systemId = ((CdmaCellLocation) cellLocation).getSystemId();
                    if (systemId < 0) {
                        systemId = this.l.d;
                    }
                    aVar.d = systemId;
                    aVar.f255b = ((CdmaCellLocation) cellLocation).getBaseStationId();
                    aVar.f254a = ((CdmaCellLocation) cellLocation).getNetworkId();
                    int baseStationLatitude = ((CdmaCellLocation) cellLocation).getBaseStationLatitude();
                    if (z2 && a.a.a.g.m.a.f311b) {
                        g.h().a("bslocation lat " + (((double) baseStationLatitude) / 14400.0d));
                    }
                    if (baseStationLatitude < Integer.MAX_VALUE) {
                        aVar.e = baseStationLatitude;
                    }
                    int baseStationLongitude = ((CdmaCellLocation) cellLocation).getBaseStationLongitude();
                    if (z2 && a.a.a.g.m.a.f311b) {
                        g.h().a("bslocation lon" + (((double) baseStationLongitude) / 14400.0d));
                    }
                    if (baseStationLongitude < Integer.MAX_VALUE) {
                        aVar.f = baseStationLongitude;
                    }
                } catch (Exception e3) {
                    if (a.a.a.g.m.a.f310a) {
                        e3.printStackTrace();
                    }
                    H = 3;
                    return aVar;
                }
            }
        }
        g(aVar);
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00dd, please report this as an issue */
    @SuppressLint({"NewApi"})
    public final String a(a.a.a.g.a aVar) {
        a.a.a.g.a aVarA;
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = null;
        if (Integer.valueOf(Build.VERSION.SDK_INT).intValue() >= 17) {
            try {
                List<CellInfo> allCellInfo = this.h.getAllCellInfo();
                if (allCellInfo != null && allCellInfo.size() > 0) {
                    sb2.append("&nc=");
                    for (CellInfo cellInfo : allCellInfo) {
                        if (!cellInfo.isRegistered() && (aVarA = a(cellInfo, this.l, this.h)) != null) {
                            if (aVarA.f254a != -1 && aVarA.f255b != -1) {
                                sb2.append(aVarA.f256c);
                                sb2.append("|");
                                sb2.append(aVarA.d);
                                sb2.append("|");
                                sb2.append(aVarA.f254a);
                                sb2.append("|");
                                sb2.append(aVarA.f255b);
                                sb2.append("|");
                                sb2.append(aVarA.h);
                                sb2.append(";");
                            }
                            if (Build.VERSION.SDK_INT > 28 && aVarA.k == 6 && aVarA.o != null && aVarA.e()) {
                                if (sb3 == null) {
                                    sb = new StringBuilder();
                                    try {
                                        sb.append("&ncnr=");
                                        sb3 = sb;
                                    } catch (Throwable th) {
                                        th = th;
                                        sb3 = sb;
                                        if (a.a.a.g.m.a.f310a) {
                                            th.printStackTrace();
                                        }
                                        if (sb3 == null) {
                                            return sb2.toString();
                                        }
                                        return sb2.toString() + sb3.toString();
                                    }
                                }
                                try {
                                    sb3.append(f(aVarA));
                                    sb3.append("_");
                                    sb3.append(aVarA.o);
                                    sb3.append(";");
                                } catch (Throwable th2) {
                                    th = th2;
                                    sb = sb3;
                                    sb3 = sb;
                                    if (a.a.a.g.m.a.f310a) {
                                        th.printStackTrace();
                                    }
                                    if (sb3 == null) {
                                        return sb2.toString();
                                    }
                                    return sb2.toString() + sb3.toString();
                                }
                            }
                        }
                    }
                } else if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                    g.h().a("getAllCellInfo = null");
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        if (sb3 == null) {
            return sb2.toString();
        }
        return sb2.toString() + sb3.toString();
    }

    public final void a() {
        this.C.post(new RunnableC0016a());
    }

    public void a(Context context) {
        e eVar;
        if (this.u) {
            return;
        }
        this.t = context;
        this.h = (TelephonyManager) context.getSystemService("phone");
        this.n = new LinkedList();
        if (Looper.myLooper() != null) {
            this.p = new e();
        }
        if (this.C == null) {
            this.C = new Handler(Looper.getMainLooper());
        }
        if (this.g) {
            c();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= this.f298c) {
            if (this.o == null) {
                this.o = this.t.getMainExecutor();
            }
            this.w = a.a.a.g.m.b.a("android.telephony.TelephonyManager$CellInfoCallback");
            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                g.h().a("isCellinfoCallbackExist = " + this.w);
            }
        }
        TelephonyManager telephonyManager = this.h;
        if (telephonyManager == null || (eVar = this.p) == null) {
            return;
        }
        if (i < this.f298c || !this.w) {
            try {
                telephonyManager.listen(eVar, 1280);
            } catch (Exception unused) {
            }
        }
        if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
            g.h().a("cell manager start...");
        }
        this.u = true;
    }

    public void a(boolean z) {
        this.f = z;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    public boolean a(a.a.a.g.a aVar, a.a.a.g.a aVar2) {
        boolean z;
        if (aVar == null && aVar2 == null) {
            return false;
        }
        if (aVar == null || aVar2 == null) {
            return true;
        }
        float fAbs = Math.abs(aVar.h - aVar2.h);
        int i = aVar.h;
        if (i == 0) {
            i = -1;
        }
        float f2 = fAbs / i;
        boolean z2 = a.a.a.g.m.a.f310a;
        if (z2 && a.a.a.g.m.a.f311b) {
            g.h().a("cl-cache, str, old:" + aVar.h + " new:" + aVar2.h);
            a.a.a.g.e eVarH = g.h();
            StringBuilder sb = new StringBuilder();
            sb.append("cl-cache, str, diffRate:");
            sb.append(f2);
            eVarH.a(sb.toString());
        }
        String str = aVar.m;
        if (str == null || aVar2.m == null) {
            z = false;
        } else {
            int iA = a(str);
            if (Math.abs(Math.abs(iA - a(aVar2.m)) / (iA != 0 ? iA : -1)) > this.e) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z2 && a.a.a.g.m.a.f311b) {
            g.h().a("cl-cache, isStrengthChange2:" + z);
        }
        return f2 > this.e || z;
    }

    public a.a.a.g.a b(a.a.a.g.a aVar, TelephonyManager telephonyManager) {
        if (Integer.valueOf(Build.VERSION.SDK_INT).intValue() < 17) {
            return null;
        }
        try {
            this.v = telephonyManager.getSimState();
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo == null || allCellInfo.size() <= 0) {
                if (!a.a.a.g.m.a.f310a || !a.a.a.g.m.a.f311b) {
                    return null;
                }
                g.h().a("getAllCellInfo=null");
                return null;
            }
            a.a.a.g.a aVar2 = null;
            for (CellInfo cellInfo : allCellInfo) {
                if (cellInfo.isRegistered()) {
                    boolean z = aVar2 != null;
                    a.a.a.g.a aVarA = a(cellInfo, aVar, telephonyManager);
                    if (aVarA != null) {
                        if (aVarA.e()) {
                            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                                g.h().a(" cell res.isValid() = " + f(aVarA));
                            }
                            if (z && aVar2 != null) {
                                aVar2.m = e(aVarA);
                                aVar2.n = f(aVarA);
                            }
                        } else {
                            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                                g.h().a("res.isValid()");
                            }
                            aVarA = null;
                        }
                        if (aVar2 == null) {
                            aVar2 = aVarA;
                        }
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            if (!a.a.a.g.m.a.f310a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public String b(a.a.a.g.a aVar) {
        int i;
        if (aVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("&nw=");
        stringBuffer.append(aVar.i);
        stringBuffer.append(String.format(Locale.CHINA, "&cl=%d|%d|%d|%d&cl_s=%d", Integer.valueOf(aVar.f256c), Integer.valueOf(aVar.d), Integer.valueOf(aVar.f254a), Long.valueOf(aVar.f255b), Integer.valueOf(aVar.h)));
        if (aVar.e < Integer.MAX_VALUE && (i = aVar.f) < Integer.MAX_VALUE) {
            stringBuffer.append(String.format(Locale.CHINA, "&cdmall=%.6f|%.6f", Double.valueOf(((double) i) / 14400.0d), Double.valueOf(((double) aVar.e) / 14400.0d)));
        }
        stringBuffer.append("&cl_t=");
        stringBuffer.append(aVar.g);
        stringBuffer.append("&cl_api=");
        stringBuffer.append(aVar.l);
        stringBuffer.append("&clp=");
        stringBuffer.append(aVar.k);
        if (aVar.o != null) {
            stringBuffer.append("&clnrs=");
            stringBuffer.append(aVar.o);
        }
        if (Build.VERSION.SDK_INT >= 28 && aVar.j != Integer.MAX_VALUE) {
            stringBuffer.append("&cl_cs=");
            stringBuffer.append(aVar.j);
        }
        try {
            List<a.a.a.g.a> list = this.n;
            if (list != null && list.size() > 0) {
                int size = this.n.size();
                stringBuffer.append("&clt=");
                for (int i2 = 0; i2 < size; i2++) {
                    a.a.a.g.a aVar2 = this.n.get(i2);
                    if (aVar2 != null) {
                        int i3 = aVar2.f256c;
                        if (i3 != aVar.f256c) {
                            stringBuffer.append(i3);
                        }
                        stringBuffer.append("|");
                        int i4 = aVar2.d;
                        if (i4 != aVar.d) {
                            stringBuffer.append(i4);
                        }
                        stringBuffer.append("|");
                        int i5 = aVar2.f254a;
                        if (i5 != aVar.f254a) {
                            stringBuffer.append(i5);
                        }
                        stringBuffer.append("|");
                        long j = aVar2.f255b;
                        if (j != aVar.f255b) {
                            stringBuffer.append(j);
                        }
                        stringBuffer.append("|");
                        stringBuffer.append((System.currentTimeMillis() - aVar2.g) / 1000);
                        stringBuffer.append(";");
                    }
                }
            }
        } catch (Exception e2) {
            if (a.a.a.g.m.a.f310a) {
                e2.printStackTrace();
            }
        }
        if (this.v > 100) {
            this.v = 0;
        }
        int i6 = this.v + (H << 8);
        boolean z = a.a.a.g.m.a.f310a;
        if (z && a.a.a.g.m.a.f311b) {
            g.h().a("sim state:" + this.v + "," + i6);
        }
        stringBuffer.append("&cs=" + i6);
        String str = aVar.m;
        if (str != null) {
            stringBuffer.append(str);
        }
        if (z && a.a.a.g.m.a.f311b) {
            g.h().a("cell sb.toString() = " + stringBuffer.toString());
        }
        return stringBuffer.toString();
    }

    public void b(int i) {
        this.f298c = i;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public boolean b() {
        return this.B;
    }

    public String c(a.a.a.g.a aVar) {
        String str = "";
        try {
            String strA = a(aVar);
            int iIntValue = Integer.valueOf(Build.VERSION.SDK_INT).intValue();
            if ((strA != null && !"".equals(strA) && !"&nc=".equals(strA)) || iIntValue >= 17) {
                return strA;
            }
            str = strA;
            if (str == null || !"&nc=".equals(str)) {
                return str;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void c() {
        a.a.a.g.e eVarH;
        String str;
        String strB = a.a.a.g.m.b.b(this.t);
        if (strB == null) {
            return;
        }
        File file = new File(strB + File.separator + "lcvif2.dat");
        if (file.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(0L);
                long j = randomAccessFile.readLong();
                if (System.currentTimeMillis() - j > 60000) {
                    if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                        g.h().a("cellbuffer System.currentTimeMillis() - time > 1 *60 *1000" + j);
                    }
                    randomAccessFile.close();
                    file.delete();
                    return;
                }
                randomAccessFile.readInt();
                for (int i = 0; i < 3; i++) {
                    long j2 = randomAccessFile.readLong();
                    int i2 = randomAccessFile.readInt();
                    int i3 = randomAccessFile.readInt();
                    int i4 = randomAccessFile.readInt();
                    long j3 = randomAccessFile.readLong();
                    int i5 = randomAccessFile.readInt();
                    boolean z = a.a.a.g.m.a.f310a;
                    if (z && a.a.a.g.m.a.f311b) {
                        g.h().a("cellbuffer cell info = " + j2 + " " + i2 + " " + i3 + " " + i4 + " " + j3 + " " + i5);
                    }
                    char c2 = i5 == 1 ? 'g' : (char) 0;
                    if (i5 == 2) {
                        c2 = 'c';
                    }
                    char c3 = c2;
                    if (j2 != 0) {
                        a.a.a.g.a aVar = new a.a.a.g.a(i4, j3, i2, i3, 0, c3, -1);
                        aVar.g = j2;
                        if (aVar.e()) {
                            this.B = true;
                            this.n.add(aVar);
                        }
                        if (z && a.a.a.g.m.a.f311b) {
                            eVarH = g.h();
                            str = "loc cell " + b(aVar);
                            eVarH.a(str);
                        }
                    } else if (z && a.a.a.g.m.a.f311b) {
                        eVarH = g.h();
                        str = "loc cell time1 == 0";
                        eVarH.a(str);
                    }
                }
                randomAccessFile.close();
            } catch (Exception e2) {
                if (a.a.a.g.m.a.f310a) {
                    e2.printStackTrace();
                }
                file.delete();
            }
        }
    }

    public void c(int i) {
        this.d = i;
    }

    public HashSet<String> d(a.a.a.g.a aVar) {
        a.a.a.g.a aVarA;
        StringBuilder sb;
        HashSet<String> hashSet = new HashSet<>();
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                List<CellInfo> allCellInfo = this.h.getAllCellInfo();
                if (allCellInfo != null && allCellInfo.size() > 0) {
                    for (CellInfo cellInfo : allCellInfo) {
                        if (!cellInfo.isRegistered() && (aVarA = a(cellInfo, this.l, this.h)) != null) {
                            int i = aVarA.f254a;
                            String string = "";
                            if (i != -1 && aVarA.f255b != -1) {
                                if (aVar.f254a != i) {
                                    sb = new StringBuilder();
                                    sb.append(aVarA.f254a);
                                    sb.append("|");
                                    sb.append(aVarA.f255b);
                                } else {
                                    sb = new StringBuilder();
                                    sb.append(aVarA.f255b);
                                    sb.append("");
                                }
                                string = sb.toString();
                            }
                            hashSet.add(string);
                        }
                    }
                } else if (a.a.a.g.m.a.f310a) {
                    Log.d("getAllCellInfo", "=null");
                }
            } catch (Exception | NoSuchMethodError e2) {
                e2.printStackTrace();
            }
        }
        return hashSet;
    }

    public final void d() {
        if (this.q == null) {
            this.q = new d(this, null);
        }
        Executor executor = this.o;
        if (executor != null) {
            this.h.requestCellInfoUpdate(executor, this.q);
        }
    }

    public final String e(a.a.a.g.a aVar) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("&nw2=");
        stringBuffer.append(aVar.i);
        stringBuffer.append(String.format(Locale.CHINA, "&cl2=%d|%d|%d|%d&cl_s2=%d&clp2=%d&cl_t2=%d", Integer.valueOf(aVar.f256c), Integer.valueOf(aVar.d), Integer.valueOf(aVar.f254a), Long.valueOf(aVar.f255b), Integer.valueOf(aVar.h), Integer.valueOf(aVar.k), Long.valueOf(aVar.g)));
        if (aVar.j != Integer.MAX_VALUE) {
            stringBuffer.append("&cl_cs2=");
            stringBuffer.append(aVar.j);
        }
        if (aVar.o != null) {
            stringBuffer.append("&clnrs2=");
            stringBuffer.append(aVar.o);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a9 A[Catch: Exception -> 0x00fe, TryCatch #0 {Exception -> 0x00fe, blocks: (B:6:0x000d, B:8:0x0011, B:9:0x001d, B:11:0x002d, B:13:0x0030, B:16:0x0036, B:18:0x0039, B:19:0x003b, B:21:0x0041, B:23:0x0047, B:25:0x004c, B:27:0x0050, B:29:0x0054, B:30:0x0088, B:32:0x008f, B:34:0x0093, B:35:0x0095, B:39:0x00a3, B:40:0x00a5, B:42:0x00a9, B:43:0x00b0, B:45:0x00b4, B:47:0x00b8, B:49:0x00c1, B:51:0x00c7, B:53:0x00cb, B:54:0x00cd, B:58:0x00db, B:59:0x00dd, B:61:0x00e1, B:62:0x00e8, B:64:0x00ec, B:66:0x00f0, B:68:0x00f9, B:55:0x00d2, B:57:0x00d6, B:67:0x00f7, B:36:0x009a, B:38:0x009e, B:48:0x00bf, B:24:0x004a), top: B:97:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1 A[Catch: Exception -> 0x00fe, TryCatch #0 {Exception -> 0x00fe, blocks: (B:6:0x000d, B:8:0x0011, B:9:0x001d, B:11:0x002d, B:13:0x0030, B:16:0x0036, B:18:0x0039, B:19:0x003b, B:21:0x0041, B:23:0x0047, B:25:0x004c, B:27:0x0050, B:29:0x0054, B:30:0x0088, B:32:0x008f, B:34:0x0093, B:35:0x0095, B:39:0x00a3, B:40:0x00a5, B:42:0x00a9, B:43:0x00b0, B:45:0x00b4, B:47:0x00b8, B:49:0x00c1, B:51:0x00c7, B:53:0x00cb, B:54:0x00cd, B:58:0x00db, B:59:0x00dd, B:61:0x00e1, B:62:0x00e8, B:64:0x00ec, B:66:0x00f0, B:68:0x00f9, B:55:0x00d2, B:57:0x00d6, B:67:0x00f7, B:36:0x009a, B:38:0x009e, B:48:0x00bf, B:24:0x004a), top: B:97:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0108  */
    public final void e() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        Executor executor;
        TelephonyManager telephonyManager3;
        TelephonyManager telephonyManager4;
        Executor executor2;
        this.x = System.currentTimeMillis();
        if (this.f) {
            boolean z = false;
            try {
                if (this.k == null) {
                    this.k = (SubscriptionManager) this.t.getSystemService("telephony_subscription_service");
                }
                int[] subscriptionIds = this.k.getSubscriptionIds(0);
                int[] subscriptionIds2 = this.k.getSubscriptionIds(1);
                int i = -1;
                int i2 = (subscriptionIds == null || subscriptionIds.length <= 0) ? -1 : subscriptionIds[0];
                if (subscriptionIds2 != null && subscriptionIds2.length > 0) {
                    i = subscriptionIds2[0];
                }
                if (SubscriptionManager.isValidSubscriptionId(i2) && SubscriptionManager.isValidSubscriptionId(i)) {
                    this.z = true;
                } else {
                    this.z = false;
                }
                if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                    g.h().a("getCellInfo: subId0 = " + i2 + ", subId1 = " + i + ", mLastSubId0 = " + this.D + ", mLastSubId1 = " + this.E);
                }
                RunnableC0016a runnableC0016a = null;
                if (SubscriptionManager.isValidSubscriptionId(i2)) {
                    if (this.i == null) {
                        telephonyManager3 = this.h;
                    } else if (this.D != i2) {
                        this.i = null;
                        telephonyManager3 = this.h;
                    } else {
                        if (this.r == null) {
                            this.r = new b(this, runnableC0016a);
                        }
                        telephonyManager4 = this.i;
                        if (telephonyManager4 != null && (executor2 = this.o) != null) {
                            telephonyManager4.requestCellInfoUpdate(executor2, this.r);
                            z = true;
                        }
                    }
                    this.i = telephonyManager3.createForSubscriptionId(i2);
                    if (this.r == null) {
                        this.r = new b(this, runnableC0016a);
                    }
                    telephonyManager4 = this.i;
                    if (telephonyManager4 != null) {
                        telephonyManager4.requestCellInfoUpdate(executor2, this.r);
                        z = true;
                    }
                } else {
                    this.i = null;
                }
                if (SubscriptionManager.isValidSubscriptionId(i)) {
                    if (this.j == null) {
                        telephonyManager = this.h;
                    } else if (this.E != i) {
                        this.j = null;
                        telephonyManager = this.h;
                    } else {
                        if (this.s == null) {
                            this.s = new c(this, runnableC0016a);
                        }
                        telephonyManager2 = this.j;
                        if (telephonyManager2 != null && (executor = this.o) != null) {
                            telephonyManager2.requestCellInfoUpdate(executor, this.s);
                            z = true;
                        }
                    }
                    this.j = telephonyManager.createForSubscriptionId(i);
                    if (this.s == null) {
                        this.s = new c(this, runnableC0016a);
                    }
                    telephonyManager2 = this.j;
                    if (telephonyManager2 != null) {
                        telephonyManager2.requestCellInfoUpdate(executor, this.s);
                        z = true;
                    }
                } else {
                    this.j = null;
                }
                this.D = i2;
                this.E = i;
            } catch (Exception e2) {
                if (a.a.a.g.m.a.f310a) {
                    e2.printStackTrace();
                }
            }
            if (!z) {
                d();
            }
        } else {
            d();
        }
        synchronized (this.F) {
            try {
                if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                    g.h().a("start waiting update to finish");
                }
                int i3 = this.d;
                if (i3 != 0) {
                    this.F.wait(i3);
                }
            } catch (InterruptedException e3) {
                if (a.a.a.g.m.a.f310a) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public final String f(a.a.a.g.a aVar) {
        return String.format(Locale.CHINA, "%d|%d|%d|%d", Integer.valueOf(aVar.f256c), Integer.valueOf(aVar.d), Integer.valueOf(aVar.f254a), Long.valueOf(aVar.f255b));
    }

    public void f() {
        TelephonyManager telephonyManager;
        if (this.u) {
            try {
                e eVar = this.p;
                if (eVar != null && (telephonyManager = this.h) != null) {
                    telephonyManager.listen(eVar, 0);
                }
                this.p = null;
                this.h = null;
                this.i = null;
                this.j = null;
                List<a.a.a.g.a> list = this.n;
                if (list != null) {
                    list.clear();
                    this.n = null;
                }
                if (this.g) {
                    h();
                }
            } catch (Exception e2) {
                if (a.a.a.g.m.a.f310a) {
                    e2.printStackTrace();
                }
            }
            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                g.h().a("cell manager stop ...");
            }
            this.u = false;
        }
    }

    public final synchronized void g() {
        CellLocation cellLocation;
        a.a.a.g.a aVarB = b(this.l, this.h);
        if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b && aVarB != null) {
            g.h().a("new cell api = " + f(aVarB));
        }
        if (aVarB != null) {
            g(aVarB);
        }
        if (Build.VERSION.SDK_INT <= 28 && (aVarB == null || !aVarB.e())) {
            try {
                cellLocation = this.h.getCellLocation();
            } catch (Throwable unused) {
                cellLocation = null;
            }
            a.a.a.g.a aVarA = cellLocation != null ? a(cellLocation) : null;
            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b && aVarA != null) {
                g.h().a(" old cell api = " + f(aVarA));
            }
        }
    }

    public final void g(a.a.a.g.a aVar) {
        a.a.a.g.a aVar2;
        a.a.a.g.a aVar3 = this.l;
        if (aVar.e() && ((aVar2 = this.l) == null || !aVar2.a(aVar) || a(this.l, aVar))) {
            this.l = aVar;
        }
        if (aVar.e()) {
            if (aVar3 == null || !aVar3.a(aVar)) {
                if (!aVar.e()) {
                    List<a.a.a.g.a> list = this.n;
                    if (list != null) {
                        list.clear();
                        return;
                    }
                    return;
                }
                int size = this.n.size();
                a.a.a.g.a aVar4 = size == 0 ? null : this.n.get(size - 1);
                if (aVar4 != null) {
                    long j = aVar4.f255b;
                    a.a.a.g.a aVar5 = this.l;
                    if (j == aVar5.f255b && aVar4.f254a == aVar5.f254a) {
                        return;
                    }
                }
                this.n.add(this.l);
                if (this.n.size() > 3) {
                    this.n.remove(0);
                }
                if (this.g) {
                    h();
                }
                this.B = false;
            }
        }
    }

    public final void h() {
        List<a.a.a.g.a> list = this.n;
        if (list == null && this.m == null) {
            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                g.h().a("cellbuffer mTrackList == null");
                return;
            }
            return;
        }
        if (list == null && this.m != null) {
            LinkedList linkedList = new LinkedList();
            this.n = linkedList;
            linkedList.add(this.m);
        }
        String strB = a.a.a.g.m.b.b(this.t);
        if (strB == null || this.n == null) {
            return;
        }
        File file = new File(strB + File.separator + "lcvif2.dat");
        int size = this.n.size();
        try {
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.writeLong(this.n.get(size - 1).g);
            randomAccessFile.writeInt(size);
            for (int i = 0; i < 3 - size; i++) {
                randomAccessFile.writeLong(0L);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeLong(-1L);
                randomAccessFile.writeInt(2);
            }
            for (int i2 = 0; i2 < size; i2++) {
                randomAccessFile.writeLong(this.n.get(i2).g);
                randomAccessFile.writeInt(this.n.get(i2).f256c);
                randomAccessFile.writeInt(this.n.get(i2).d);
                randomAccessFile.writeInt(this.n.get(i2).f254a);
                randomAccessFile.writeLong(this.n.get(i2).f255b);
                if (this.n.get(i2).i == 'g') {
                    randomAccessFile.writeInt(1);
                } else if (this.n.get(i2).i == 'c') {
                    randomAccessFile.writeInt(2);
                } else {
                    randomAccessFile.writeInt(3);
                }
            }
            randomAccessFile.close();
        } catch (Exception e2) {
            if (a.a.a.g.m.a.f310a) {
                e2.printStackTrace();
            }
        }
    }
}
