package a.a.a.g.l;

import a.a.a.g.e;
import a.a.a.g.g;
import a.a.a.g.k;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.DhcpInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class b implements a.a.a.g.m.a {
    public Context g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f306c = false;
    public WifiManager d = null;
    public c e = null;
    public k f = null;
    public int h = 2000;
    public long i = 0;
    public long j = 0;
    public long k = 0;
    public long l = 0;
    public String m = null;
    public final Object n = new Object();
    public final Object o = new Object();
    public Handler p = null;
    public String q = null;

    /* JADX INFO: renamed from: a.a.a.g.l.b$b, reason: collision with other inner class name */
    public static class C0018b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static b f307a = new b();
    }

    public class c extends BroadcastReceiver {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f();
                synchronized (b.this.n) {
                    b.this.n.notifyAll();
                    if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                        g.h().a("WifiScan finished, in callback.");
                    }
                }
            }
        }

        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null) {
                return;
            }
            if ((!a.a.a.g.m.a.f311b || g.h().a(intent)) && intent.getAction().equals("android.net.wifi.SCAN_RESULTS")) {
                b.this.i = System.currentTimeMillis() / 1000;
                b.this.p.post(new a());
            }
        }
    }

    public static boolean a(k kVar, k kVar2, float f) {
        if (kVar != null && kVar2 != null) {
            List<ScanResult> list = kVar.f295a;
            List<ScanResult> list2 = kVar2.f295a;
            if (list == list2) {
                return true;
            }
            if (list != null && list2 != null) {
                int size = list.size();
                int size2 = list2.size();
                if (size == 0 && size2 == 0) {
                    return true;
                }
                if (size != 0 && size2 != 0) {
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        String str = list.get(i2) != null ? list.get(i2).BSSID : null;
                        if (str != null) {
                            for (int i3 = 0; i3 < size2; i3++) {
                                String str2 = list2.get(i3) != null ? list2.get(i3).BSSID : null;
                                if (str2 != null && str.equals(str2)) {
                                    i++;
                                    break;
                                }
                            }
                        }
                    }
                    if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                        g.h().a("wifi same!" + (i / size));
                    }
                    if (i >= size * f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static b i() {
        return C0018b.f307a;
    }

    public final k a(k kVar) {
        if (kVar != null) {
            return new k(kVar.f295a, kVar.f296b);
        }
        return null;
    }

    public WifiInfo a() {
        try {
            WifiManager wifiManager = this.d;
            WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
            String strA = a(connectionInfo, (String) null);
            if (connectionInfo != null && strA != null && connectionInfo.getRssi() > -100) {
                if (strA != null) {
                    String strReplace = strA.replace(":", "");
                    if ("000000000000".equals(strReplace) || "".equals(strReplace) || "020000000000".equals(strReplace)) {
                        return null;
                    }
                }
                return connectionInfo;
            }
        } catch (Error | Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x031c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0348 A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0364  */
    /* JADX WARN: Code duplicated, block: B:152:0x036f A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x037a A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:173:0x03dd A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x03f5 A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0403  */
    /* JADX WARN: Code duplicated, block: B:182:0x0422 A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0455 A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x045d A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0466 A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0474 A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0482 A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x04c9 A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x04d8 A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x04e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:245:0x047a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5 A[Catch: Error | Exception -> 0x04e9, Error | Exception -> 0x04e9, TRY_LEAVE, TryCatch #0 {Error | Exception -> 0x04e9, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:21:0x008b, B:21:0x008b, B:24:0x0095, B:37:0x00b2, B:37:0x00b2, B:47:0x00db, B:47:0x00db, B:49:0x00e5, B:49:0x00e5, B:53:0x00f5, B:55:0x00ff, B:66:0x0118, B:66:0x0118, B:68:0x011c, B:68:0x011c, B:70:0x0120, B:70:0x0120, B:72:0x0141, B:72:0x0141, B:75:0x014e, B:75:0x014e, B:78:0x016f, B:78:0x016f, B:93:0x019d, B:93:0x019d, B:95:0x01a2, B:95:0x01a2, B:97:0x01b0, B:97:0x01b0, B:99:0x01bc, B:99:0x01bc, B:102:0x01d5, B:102:0x01d5, B:104:0x01ef, B:104:0x01ef, B:106:0x01f5, B:106:0x01f5, B:113:0x021c, B:115:0x0223, B:117:0x022f, B:119:0x023f, B:144:0x0327, B:144:0x0327, B:132:0x02b8, B:132:0x02b8, B:134:0x02bc, B:134:0x02bc, B:124:0x026e, B:126:0x0276, B:128:0x0282, B:130:0x0292, B:135:0x02c0, B:135:0x02c0, B:137:0x02c8, B:137:0x02c8, B:139:0x02cc, B:139:0x02cc, B:140:0x02ee, B:140:0x02ee, B:96:0x01aa, B:96:0x01aa, B:62:0x010f, B:62:0x010f, B:64:0x0113, B:64:0x0113, B:145:0x0338, B:145:0x0338, B:147:0x0348, B:147:0x0348, B:150:0x0367, B:150:0x0367, B:152:0x036f, B:152:0x036f, B:154:0x037a, B:154:0x037a, B:158:0x0389, B:158:0x0389, B:160:0x0393, B:160:0x0393, B:162:0x039f, B:162:0x039f, B:165:0x03b3, B:165:0x03b3, B:171:0x03d4, B:171:0x03d4, B:159:0x0390, B:159:0x0390, B:173:0x03dd, B:173:0x03dd, B:175:0x03f5, B:175:0x03f5, B:179:0x0408, B:179:0x0408, B:182:0x0422, B:182:0x0422, B:184:0x0428, B:184:0x0428, B:186:0x0437, B:186:0x0437, B:187:0x044f, B:187:0x044f, B:189:0x0455, B:189:0x0455, B:191:0x045d, B:191:0x045d, B:195:0x047a, B:195:0x047a, B:192:0x0466, B:192:0x0466, B:194:0x0474, B:194:0x0474, B:196:0x047e, B:196:0x047e, B:198:0x0482, B:198:0x0482, B:200:0x0486, B:200:0x0486, B:201:0x04a2, B:201:0x04a2, B:202:0x04a9, B:202:0x04a9, B:204:0x04c9, B:204:0x04c9, B:206:0x04d8, B:206:0x04d8, B:207:0x04e2, B:207:0x04e2), top: B:219:0x0014 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:147:0x0348, please report this as an issue */
    @SuppressLint({"NewApi"})
    public String a(int i, boolean z, k kVar, int i2) {
        String str;
        int rssi;
        String strReplace;
        long jElapsedRealtimeNanos;
        boolean z2;
        int size;
        boolean z3;
        int i3;
        long j;
        int i4;
        int i5;
        StringBuffer stringBuffer;
        char c2;
        int i6;
        boolean z4;
        b bVar;
        int i7;
        boolean z5;
        String str2;
        int i8;
        StringBuffer stringBuffer2;
        Long l;
        boolean z6;
        long jLongValue;
        int i9;
        Random random;
        String str3;
        char c3;
        b bVar2;
        int i10;
        String str4;
        long j2;
        Throwable th;
        boolean z7;
        b bVar3 = this;
        int i11 = i;
        if (kVar == null || kVar.c() < 1) {
            return null;
        }
        try {
            Random random2 = new Random();
            StringBuffer stringBuffer3 = new StringBuffer(512);
            StringBuilder sb = new StringBuilder();
            ArrayList<Long> arrayList = new ArrayList();
            WifiInfo wifiInfoA = a();
            String strA = bVar3.a(wifiInfoA, (String) null);
            String str5 = ":";
            if (wifiInfoA == null || strA == null) {
                str = null;
                rssi = -1;
                strReplace = null;
            } else {
                strReplace = strA.replace(":", "");
                rssi = wifiInfoA.getRssi();
                String strD = i().d();
                if (rssi < 0) {
                    rssi = -rssi;
                }
                if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                    g.h().a("wifi connected mac = " + strReplace);
                    g.h().a("wifi connected mac rssi= " + rssi);
                }
                str = strD;
            }
            String str6 = str;
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
                } catch (Error unused) {
                    jElapsedRealtimeNanos = 0;
                }
                z2 = jElapsedRealtimeNanos > 0;
                if (z2) {
                    if (z2 || !z) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
                size = kVar.f295a.size();
                if (size > i11) {
                    z3 = i11 < i2;
                    i3 = rssi;
                    j = 0;
                    i4 = 0;
                    i5 = 0;
                    stringBuffer = null;
                    c2 = 0;
                    i6 = 0;
                    int i12 = 0;
                    z4 = true;
                    while (i5 < i11) {
                        i6++;
                        int i13 = i11;
                        boolean z8 = z3;
                        if (kVar.f295a.get(i5) != null || kVar.f295a.get(i5).level == 0) {
                            random = random2;
                            z2 = z2;
                            str3 = str5;
                            c3 = c2;
                            bVar2 = bVar3;
                            i10 = i4;
                        } else {
                            if (z2) {
                                try {
                                    str4 = str5;
                                    try {
                                        j2 = (jElapsedRealtimeNanos - kVar.f295a.get(i5).timestamp) / 1000000;
                                    } catch (Exception e) {
                                        e = e;
                                        Exception exc = e;
                                        if (a.a.a.g.m.a.f310a) {
                                            exc.printStackTrace();
                                        }
                                        j2 = 0;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    str4 = str5;
                                }
                                boolean z9 = a.a.a.g.m.a.f310a;
                                if (z9 && a.a.a.g.m.a.f311b) {
                                    g.h().a("wifi noUpdateTime = " + j2);
                                }
                                arrayList.add(Long.valueOf(j2));
                                if (j2 > j) {
                                    if (z9) {
                                        g.h().a("wifi maxScanTime = " + j2);
                                    }
                                    j = j2;
                                }
                            } else {
                                random2 = random2;
                                z2 = z2;
                                str4 = str5;
                            }
                            if (Build.VERSION.SDK_INT >= 23) {
                                try {
                                    if (kVar.f295a.get(i5).is80211mcResponder()) {
                                        StringBuffer stringBuffer4 = stringBuffer == null ? new StringBuffer() : stringBuffer;
                                        try {
                                            stringBuffer4.append(i5);
                                            stringBuffer4.append("|");
                                            stringBuffer = stringBuffer4;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            stringBuffer = stringBuffer4;
                                            th.printStackTrace();
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            if (z4) {
                                stringBuffer3.append("&wf=");
                                z4 = false;
                            } else {
                                stringBuffer3.append("|");
                                sb.append("|");
                            }
                            String str7 = kVar.f295a.get(i5).BSSID;
                            if (str7 != null) {
                                str3 = str4;
                                String strReplace2 = str7.replace(str3, "");
                                stringBuffer3.append(strReplace2);
                                sb.append(strReplace2);
                                int i14 = kVar.f295a.get(i5).level;
                                if (i14 < 0) {
                                    i14 = -i14;
                                }
                                String str8 = String.format(Locale.CHINA, ";%d;", Integer.valueOf(i14));
                                stringBuffer3.append(str8);
                                sb.append(str8);
                                i12++;
                                if (strReplace == null || !strReplace.equals(strReplace2)) {
                                    bVar2 = this;
                                    i10 = i4;
                                    z7 = false;
                                } else {
                                    bVar2 = this;
                                    kVar.e = bVar2.a(kVar.f295a.get(i5).capabilities);
                                    i10 = i12;
                                    z7 = true;
                                }
                                if (z7) {
                                    c3 = c2;
                                    random = random2;
                                    if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                                        g.h().a("wifi str add connected ssid = " + kVar.f295a.get(i5).SSID);
                                    }
                                    stringBuffer3.append(bVar2.b(kVar.f295a.get(i5).SSID));
                                    sb.append(bVar2.b(kVar.f295a.get(i5).SSID));
                                } else {
                                    c3 = c2;
                                    if (c3 == 0) {
                                        random = random2;
                                        try {
                                            if (random.nextInt(10) == 2 && kVar.f295a.get(i5).SSID != null && kVar.f295a.get(i5).SSID.length() < 30) {
                                                stringBuffer3.append(bVar2.b(kVar.f295a.get(i5).SSID));
                                                sb.append(bVar2.b(kVar.f295a.get(i5).SSID));
                                                c2 = 1;
                                            }
                                        } catch (Exception e3) {
                                            if (a.a.a.g.m.a.f310a) {
                                                e3.printStackTrace();
                                            }
                                        }
                                    } else {
                                        random = random2;
                                        if (c3 == 1 && random.nextInt(20) == 1 && kVar.f295a.get(i5).SSID != null && kVar.f295a.get(i5).SSID.length() < 30) {
                                            stringBuffer3.append(bVar2.b(kVar.f295a.get(i5).SSID));
                                            sb.append(bVar2.b(kVar.f295a.get(i5).SSID));
                                            c2 = 2;
                                        }
                                    }
                                }
                            } else {
                                bVar2 = this;
                                str3 = str4;
                                random = random2;
                                i10 = i4;
                            }
                            i5++;
                            str5 = str3;
                            bVar3 = bVar2;
                            i4 = i10;
                            random2 = random;
                            z3 = z8;
                            z2 = z2;
                            i11 = i13;
                        }
                        c2 = c3;
                        i5++;
                        str5 = str3;
                        bVar3 = bVar2;
                        i4 = i10;
                        random2 = random;
                        z3 = z8;
                        z2 = z2;
                        i11 = i13;
                    }
                    bVar = bVar3;
                    i7 = i11;
                    z5 = z3;
                    str2 = str5;
                    bVar.q = sb.toString();
                    if (a.a.a.g.m.a.f310a) {
                        g.h().a("last wifi str = " + bVar.q);
                    }
                    if (z5) {
                        i9 = i7;
                        boolean z10 = true;
                        while (i9 < kVar.f295a.size()) {
                            int i15 = i6 + 1;
                            if (kVar.f295a.get(i9) == null && kVar.f295a.get(i9).level != 0) {
                                if (z10) {
                                    stringBuffer3.append("&wf2=");
                                    z10 = false;
                                } else {
                                    stringBuffer3.append("|");
                                }
                                String str9 = kVar.f295a.get(i9).BSSID;
                                if (str9 != null) {
                                    stringBuffer3.append(str9.replace(str2, ""));
                                    int i16 = kVar.f295a.get(i9).level;
                                    if (i16 < 0) {
                                        i16 = -i16;
                                    }
                                    stringBuffer3.append(String.format(Locale.CHINA, ";%d;", Integer.valueOf(i16)));
                                }
                                if (i15 >= i2) {
                                    break;
                                }
                            } else {
                                str2 = str2;
                            }
                            i9++;
                            i6 = i15;
                            str2 = str2;
                        }
                    }
                    if (!z4) {
                        return null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("&wf_n=");
                    i8 = i4;
                    sb2.append(i8);
                    stringBuffer3.append(sb2.toString());
                    if (stringBuffer != null) {
                        stringBuffer3.append("&wf_mc=");
                        stringBuffer3.append(stringBuffer.toString());
                    }
                    if (strReplace != null && i3 != -1) {
                        stringBuffer3.append("&wf_rs=" + i3);
                    }
                    if (j > 10 && arrayList.size() > 0 && ((Long) arrayList.get(0)).longValue() > 0) {
                        stringBuffer2 = new StringBuffer(128);
                        stringBuffer2.append("&wf_ut=");
                        l = (Long) arrayList.get(0);
                        z6 = true;
                        for (Long l2 : arrayList) {
                            if (z6) {
                                stringBuffer2.append(l2.longValue());
                                z6 = false;
                            } else {
                                jLongValue = l2.longValue() - l.longValue();
                                if (jLongValue != 0) {
                                    stringBuffer2.append("");
                                    stringBuffer2.append(jLongValue);
                                }
                            }
                            stringBuffer2.append("|");
                        }
                        if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                            g.h().a("wifi scantime list str = " + stringBuffer2.toString());
                        }
                        stringBuffer3.append(stringBuffer2.toString());
                    }
                    stringBuffer3.append("&wf_st=");
                    stringBuffer3.append(kVar.f296b);
                    stringBuffer3.append("&wf_et=");
                    stringBuffer3.append(kVar.f297c);
                    stringBuffer3.append("&wf_vt=");
                    stringBuffer3.append(bVar.i);
                    if (i8 > 0) {
                        kVar.d = true;
                        stringBuffer3.append("&wf_en=");
                        stringBuffer3.append(kVar.e ? 1 : 0);
                    }
                    if (str6 != null) {
                        stringBuffer3.append("&wf_gw=");
                        stringBuffer3.append(str6);
                    }
                    return stringBuffer3.toString();
                }
                i11 = size;
                i3 = rssi;
                j = 0;
                i4 = 0;
                i5 = 0;
                stringBuffer = null;
                c2 = 0;
                i6 = 0;
                int i17 = 0;
                z4 = true;
                while (i5 < i11) {
                    i6++;
                    int i18 = i11;
                    boolean z11 = z3;
                    if (kVar.f295a.get(i5) != null) {
                        random = random2;
                        z2 = z2;
                        str3 = str5;
                        c3 = c2;
                        bVar2 = bVar3;
                        i10 = i4;
                        c2 = c3;
                    } else {
                        random = random2;
                        z2 = z2;
                        str3 = str5;
                        c3 = c2;
                        bVar2 = bVar3;
                        i10 = i4;
                        c2 = c3;
                    }
                    i5++;
                    str5 = str3;
                    bVar3 = bVar2;
                    i4 = i10;
                    random2 = random;
                    z3 = z11;
                    z2 = z2;
                    i11 = i18;
                }
                bVar = bVar3;
                i7 = i11;
                z5 = z3;
                str2 = str5;
                bVar.q = sb.toString();
                if (a.a.a.g.m.a.f310a) {
                    g.h().a("last wifi str = " + bVar.q);
                }
                if (z5) {
                    i9 = i7;
                    boolean z12 = true;
                    while (i9 < kVar.f295a.size()) {
                        int i19 = i6 + 1;
                        if (kVar.f295a.get(i9) == null) {
                            str2 = str2;
                        } else {
                            str2 = str2;
                        }
                        i9++;
                        i6 = i19;
                        str2 = str2;
                    }
                }
                if (!z4) {
                    return null;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("&wf_n=");
                i8 = i4;
                sb3.append(i8);
                stringBuffer3.append(sb3.toString());
                if (stringBuffer != null) {
                    stringBuffer3.append("&wf_mc=");
                    stringBuffer3.append(stringBuffer.toString());
                }
                if (strReplace != null) {
                    stringBuffer3.append("&wf_rs=" + i3);
                }
                if (j > 10) {
                    stringBuffer2 = new StringBuffer(128);
                    stringBuffer2.append("&wf_ut=");
                    l = (Long) arrayList.get(0);
                    z6 = true;
                    while (r5.hasNext()) {
                        if (z6) {
                            stringBuffer2.append(l2.longValue());
                            z6 = false;
                        } else {
                            jLongValue = l2.longValue() - l.longValue();
                            if (jLongValue != 0) {
                                stringBuffer2.append("");
                                stringBuffer2.append(jLongValue);
                            }
                        }
                        stringBuffer2.append("|");
                    }
                    if (a.a.a.g.m.a.f310a) {
                        g.h().a("wifi scantime list str = " + stringBuffer2.toString());
                    }
                    stringBuffer3.append(stringBuffer2.toString());
                }
                stringBuffer3.append("&wf_st=");
                stringBuffer3.append(kVar.f296b);
                stringBuffer3.append("&wf_et=");
                stringBuffer3.append(kVar.f297c);
                stringBuffer3.append("&wf_vt=");
                stringBuffer3.append(bVar.i);
                if (i8 > 0) {
                    kVar.d = true;
                    stringBuffer3.append("&wf_en=");
                    stringBuffer3.append(kVar.e ? 1 : 0);
                }
                if (str6 != null) {
                    stringBuffer3.append("&wf_gw=");
                    stringBuffer3.append(str6);
                }
                return stringBuffer3.toString();
            }
            jElapsedRealtimeNanos = 0;
            if (z2) {
                if (z2) {
                    z2 = false;
                } else {
                    z2 = false;
                }
            }
            size = kVar.f295a.size();
            if (size > i11) {
                if (i11 < i2) {
                }
                i3 = rssi;
                j = 0;
                i4 = 0;
                i5 = 0;
                stringBuffer = null;
                c2 = 0;
                i6 = 0;
                int i110 = 0;
                z4 = true;
                while (i5 < i11) {
                    i6++;
                    int i111 = i11;
                    boolean z13 = z3;
                    if (kVar.f295a.get(i5) != null) {
                        random = random2;
                        z2 = z2;
                        str3 = str5;
                        c3 = c2;
                        bVar2 = bVar3;
                        i10 = i4;
                        c2 = c3;
                    } else {
                        random = random2;
                        z2 = z2;
                        str3 = str5;
                        c3 = c2;
                        bVar2 = bVar3;
                        i10 = i4;
                        c2 = c3;
                    }
                    i5++;
                    str5 = str3;
                    bVar3 = bVar2;
                    i4 = i10;
                    random2 = random;
                    z3 = z13;
                    z2 = z2;
                    i11 = i111;
                }
                bVar = bVar3;
                i7 = i11;
                z5 = z3;
                str2 = str5;
                bVar.q = sb.toString();
                if (a.a.a.g.m.a.f310a) {
                    g.h().a("last wifi str = " + bVar.q);
                }
                if (z5) {
                    i9 = i7;
                    boolean z14 = true;
                    while (i9 < kVar.f295a.size()) {
                        int i112 = i6 + 1;
                        if (kVar.f295a.get(i9) == null) {
                            str2 = str2;
                        } else {
                            str2 = str2;
                        }
                        i9++;
                        i6 = i112;
                        str2 = str2;
                    }
                }
                if (!z4) {
                    return null;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("&wf_n=");
                i8 = i4;
                sb4.append(i8);
                stringBuffer3.append(sb4.toString());
                if (stringBuffer != null) {
                    stringBuffer3.append("&wf_mc=");
                    stringBuffer3.append(stringBuffer.toString());
                }
                if (strReplace != null) {
                    stringBuffer3.append("&wf_rs=" + i3);
                }
                if (j > 10) {
                    stringBuffer2 = new StringBuffer(128);
                    stringBuffer2.append("&wf_ut=");
                    l = (Long) arrayList.get(0);
                    z6 = true;
                    while (r5.hasNext()) {
                        if (z6) {
                            stringBuffer2.append(l2.longValue());
                            z6 = false;
                        } else {
                            jLongValue = l2.longValue() - l.longValue();
                            if (jLongValue != 0) {
                                stringBuffer2.append("");
                                stringBuffer2.append(jLongValue);
                            }
                        }
                        stringBuffer2.append("|");
                    }
                    if (a.a.a.g.m.a.f310a) {
                        g.h().a("wifi scantime list str = " + stringBuffer2.toString());
                    }
                    stringBuffer3.append(stringBuffer2.toString());
                }
                stringBuffer3.append("&wf_st=");
                stringBuffer3.append(kVar.f296b);
                stringBuffer3.append("&wf_et=");
                stringBuffer3.append(kVar.f297c);
                stringBuffer3.append("&wf_vt=");
                stringBuffer3.append(bVar.i);
                if (i8 > 0) {
                    kVar.d = true;
                    stringBuffer3.append("&wf_en=");
                    stringBuffer3.append(kVar.e ? 1 : 0);
                }
                if (str6 != null) {
                    stringBuffer3.append("&wf_gw=");
                    stringBuffer3.append(str6);
                }
                return stringBuffer3.toString();
            }
            i11 = size;
            i3 = rssi;
            j = 0;
            i4 = 0;
            i5 = 0;
            stringBuffer = null;
            c2 = 0;
            i6 = 0;
            int i113 = 0;
            z4 = true;
            while (i5 < i11) {
                i6++;
                int i114 = i11;
                boolean z15 = z3;
                if (kVar.f295a.get(i5) != null) {
                    random = random2;
                    z2 = z2;
                    str3 = str5;
                    c3 = c2;
                    bVar2 = bVar3;
                    i10 = i4;
                    c2 = c3;
                } else {
                    random = random2;
                    z2 = z2;
                    str3 = str5;
                    c3 = c2;
                    bVar2 = bVar3;
                    i10 = i4;
                    c2 = c3;
                }
                i5++;
                str5 = str3;
                bVar3 = bVar2;
                i4 = i10;
                random2 = random;
                z3 = z15;
                z2 = z2;
                i11 = i114;
            }
            bVar = bVar3;
            i7 = i11;
            z5 = z3;
            str2 = str5;
            bVar.q = sb.toString();
            if (a.a.a.g.m.a.f310a) {
                g.h().a("last wifi str = " + bVar.q);
            }
            if (z5) {
                i9 = i7;
                boolean z16 = true;
                while (i9 < kVar.f295a.size()) {
                    int i115 = i6 + 1;
                    if (kVar.f295a.get(i9) == null) {
                        str2 = str2;
                    } else {
                        str2 = str2;
                    }
                    i9++;
                    i6 = i115;
                    str2 = str2;
                }
            }
            if (!z4) {
                return null;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("&wf_n=");
            i8 = i4;
            sb5.append(i8);
            stringBuffer3.append(sb5.toString());
            if (stringBuffer != null) {
                stringBuffer3.append("&wf_mc=");
                stringBuffer3.append(stringBuffer.toString());
            }
            if (strReplace != null) {
                stringBuffer3.append("&wf_rs=" + i3);
            }
            if (j > 10) {
                stringBuffer2 = new StringBuffer(128);
                stringBuffer2.append("&wf_ut=");
                l = (Long) arrayList.get(0);
                z6 = true;
                while (r5.hasNext()) {
                    if (z6) {
                        stringBuffer2.append(l2.longValue());
                        z6 = false;
                    } else {
                        jLongValue = l2.longValue() - l.longValue();
                        if (jLongValue != 0) {
                            stringBuffer2.append("");
                            stringBuffer2.append(jLongValue);
                        }
                    }
                    stringBuffer2.append("|");
                }
                if (a.a.a.g.m.a.f310a) {
                    g.h().a("wifi scantime list str = " + stringBuffer2.toString());
                }
                stringBuffer3.append(stringBuffer2.toString());
            }
            stringBuffer3.append("&wf_st=");
            stringBuffer3.append(kVar.f296b);
            stringBuffer3.append("&wf_et=");
            stringBuffer3.append(kVar.f297c);
            stringBuffer3.append("&wf_vt=");
            stringBuffer3.append(bVar.i);
            if (i8 > 0) {
                kVar.d = true;
                stringBuffer3.append("&wf_en=");
                stringBuffer3.append(kVar.e ? 1 : 0);
            }
            if (str6 != null) {
                stringBuffer3.append("&wf_gw=");
                stringBuffer3.append(str6);
            }
            return stringBuffer3.toString();
        } catch (Error | Exception e4) {
            if (!a.a.a.g.m.a.f310a) {
                return null;
            }
            e4.printStackTrace();
            return null;
        }
    }

    public final String a(long j) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf((int) (j & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j >> 8) & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j >> 16) & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j >> 24) & 255)));
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0203  */
    /* JADX WARN: Code duplicated, block: B:106:0x020f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0216  */
    /* JADX WARN: Code duplicated, block: B:109:0x0221  */
    /* JADX WARN: Code duplicated, block: B:113:0x023b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x01c6 A[EDGE_INSN: B:129:0x01c6->B:92:0x01c6 BREAK  A[LOOP:1: B:79:0x017b->B:89:0x01be], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:71:0x015f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0166  */
    /* JADX WARN: Code duplicated, block: B:76:0x0170  */
    /* JADX WARN: Code duplicated, block: B:78:0x0178  */
    /* JADX WARN: Code duplicated, block: B:80:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x017f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01be A[LOOP:1: B:79:0x017b->B:89:0x01be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d0  */
    /* JADX WARN: Instruction removed from duplicated block: B:109:0x0221, please report this as an issue */
    public String a(k kVar, int i, String str, boolean z, int i2) {
        long jElapsedRealtimeNanos;
        boolean z2;
        StringBuffer stringBuffer;
        int size;
        boolean z3;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        String str2;
        int i7;
        int i8;
        int i9;
        String str3;
        boolean z4;
        StringBuffer stringBuffer2;
        Long l;
        Iterator it;
        long jLongValue;
        long jLongValue2;
        int i10;
        int i11;
        int i12;
        String str4;
        boolean z5;
        long j2;
        if (kVar.c() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
                while (true) {
                    if (i3 < size) {
                        str2 = ";%d;";
                        i7 = size;
                        i8 = i5;
                        break;
                    }
                    i7 = size;
                    if (kVar.f295a.get(i3) != null || kVar.f295a.get(i3).level == 0) {
                        z2 = z2;
                        jElapsedRealtimeNanos = jElapsedRealtimeNanos;
                    } else {
                        int i13 = i4 + 1;
                        if (z3) {
                            stringBuffer.append("&wf=");
                            z5 = false;
                        } else {
                            stringBuffer.append("|");
                            z5 = z3;
                        }
                        String strReplace = kVar.f295a.get(i3).BSSID.replace(":", "");
                        stringBuffer.append(strReplace);
                        if (str != 0 && strReplace.equals(str)) {
                            i6 = i13;
                        }
                        int i14 = kVar.f295a.get(i3).level;
                        if (i14 < 0) {
                            i14 = -i14;
                        }
                        stringBuffer.append(String.format(Locale.CHINA, ";%d;", Integer.valueOf(i14)));
                        i8 = i5 + 1;
                        if (z2) {
                            try {
                                str2 = ";%d;";
                                try {
                                    j2 = (jElapsedRealtimeNanos - kVar.f295a.get(i3).timestamp) / 1000000;
                                } catch (Throwable th) {
                                    th = th;
                                    if (a.a.a.g.m.a.f310a) {
                                        th.printStackTrace();
                                    }
                                    j2 = 0;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = ";%d;";
                            }
                            boolean z6 = a.a.a.g.m.a.f310a;
                            if (z6 && a.a.a.g.m.a.f311b) {
                                g.h().a("wifi noUpdateTime = " + j2);
                            }
                            arrayList.add(Long.valueOf(j2));
                            if (j2 > j) {
                                if (z6 && a.a.a.g.m.a.f311b) {
                                    g.h().a("wifi maxScanTime = " + j2);
                                }
                                j = j2;
                            }
                        } else {
                            str2 = ";%d;";
                            z2 = z2;
                            jElapsedRealtimeNanos = jElapsedRealtimeNanos;
                        }
                        if (i8 > i) {
                            z3 = z5;
                            break;
                        }
                        i5 = i8;
                        z3 = z5;
                        i4 = i13;
                    }
                    i3++;
                    size = i7;
                    z2 = z2;
                    jElapsedRealtimeNanos = jElapsedRealtimeNanos;
                }
            } catch (Error unused) {
                jElapsedRealtimeNanos = 0;
            }
            z2 = jElapsedRealtimeNanos > 0;
            stringBuffer = new StringBuffer(512);
            size = kVar.f295a.size();
            z3 = true;
            j = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i9 = i6;
            if (z) {
                return stringBuffer.toString();
            }
            if (i9 > 0) {
                stringBuffer.append("&wf_n=");
                stringBuffer.append(i9);
            }
            if (i8 > i) {
                str3 = "|";
                if (i2 > i + 1) {
                    i10 = i8;
                    i11 = i7;
                    while (true) {
                        if (i10 < i11) {
                            if (i10 == i8) {
                                stringBuffer.append("&wf2=");
                            } else {
                                stringBuffer.append(str3);
                            }
                            stringBuffer.append(kVar.f295a.get(i10).BSSID.replace(":", ""));
                            i12 = kVar.f295a.get(i10).level;
                            if (i12 < 0) {
                                i12 = -i12;
                            }
                            Locale locale = Locale.CHINA;
                            z4 = true;
                            Object[] objArr = {Integer.valueOf(i12)};
                            str4 = str2;
                            stringBuffer.append(String.format(locale, str4, objArr));
                            if (i10 >= i2) {
                                break;
                            }
                            i10++;
                            str2 = str4;
                        }
                    }
                }
                if (z3) {
                    return null;
                }
                if (j > 10 && arrayList.size() > 0 && ((Long) arrayList.get(0)).longValue() > 0) {
                    stringBuffer2 = new StringBuffer(128);
                    stringBuffer2.append("&wf_ut=");
                    l = (Long) arrayList.get(0);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        jLongValue = ((Long) it.next()).longValue();
                        if (z4) {
                            stringBuffer2.append(jLongValue);
                            z4 = false;
                        } else {
                            jLongValue2 = jLongValue - l.longValue();
                            if (jLongValue2 != 0) {
                                stringBuffer2.append("" + jLongValue2);
                            }
                        }
                        stringBuffer2.append(str3);
                    }
                    if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                        g.h().a("wifi scantime list str = " + stringBuffer2.toString());
                    }
                    stringBuffer.append(stringBuffer2.toString());
                }
                return stringBuffer.toString();
            }
            str3 = r4;
            z4 = true;
            if (z3) {
                return null;
            }
            if (j > 10) {
                stringBuffer2 = new StringBuffer(128);
                stringBuffer2.append("&wf_ut=");
                l = (Long) arrayList.get(0);
                it = arrayList.iterator();
                while (it.hasNext()) {
                    jLongValue = ((Long) it.next()).longValue();
                    if (z4) {
                        stringBuffer2.append(jLongValue);
                        z4 = false;
                    } else {
                        jLongValue2 = jLongValue - l.longValue();
                        if (jLongValue2 != 0) {
                            stringBuffer2.append("" + jLongValue2);
                        }
                    }
                    stringBuffer2.append(str3);
                }
                if (a.a.a.g.m.a.f310a) {
                    g.h().a("wifi scantime list str = " + stringBuffer2.toString());
                }
                stringBuffer.append(stringBuffer2.toString());
            }
            return stringBuffer.toString();
        }
        jElapsedRealtimeNanos = 0;
        stringBuffer = new StringBuffer(512);
        size = kVar.f295a.size();
        z3 = true;
        j = 0;
        i3 = 0;
        i4 = 0;
        i5 = 0;
        i6 = 0;
        while (true) {
            if (i3 < size) {
                str2 = ";%d;";
                i7 = size;
                i8 = i5;
                break;
            }
            i7 = size;
            if (kVar.f295a.get(i3) != null) {
                z2 = z2;
                jElapsedRealtimeNanos = jElapsedRealtimeNanos;
            } else {
                z2 = z2;
                jElapsedRealtimeNanos = jElapsedRealtimeNanos;
            }
            i3++;
            size = i7;
            z2 = z2;
            jElapsedRealtimeNanos = jElapsedRealtimeNanos;
        }
        i9 = i6;
        if (z) {
            return stringBuffer.toString();
        }
        if (i9 > 0) {
            stringBuffer.append("&wf_n=");
            stringBuffer.append(i9);
        }
        if (i8 > i) {
            str3 = "|";
            if (i2 > i + 1) {
                i10 = i8;
                i11 = i7;
                while (true) {
                    if (i10 < i11) {
                        if (i10 == i8) {
                            stringBuffer.append("&wf2=");
                        } else {
                            stringBuffer.append(str3);
                        }
                        stringBuffer.append(kVar.f295a.get(i10).BSSID.replace(":", ""));
                        i12 = kVar.f295a.get(i10).level;
                        if (i12 < 0) {
                            i12 = -i12;
                        }
                        Locale locale2 = Locale.CHINA;
                        z4 = true;
                        Object[] objArr2 = {Integer.valueOf(i12)};
                        str4 = str2;
                        stringBuffer.append(String.format(locale2, str4, objArr2));
                        if (i10 >= i2) {
                            break;
                            break;
                        }
                        i10++;
                        str2 = str4;
                    }
                }
            }
            if (z3) {
                return null;
            }
            if (j > 10) {
                stringBuffer2 = new StringBuffer(128);
                stringBuffer2.append("&wf_ut=");
                l = (Long) arrayList.get(0);
                it = arrayList.iterator();
                while (it.hasNext()) {
                    jLongValue = ((Long) it.next()).longValue();
                    if (z4) {
                        stringBuffer2.append(jLongValue);
                        z4 = false;
                    } else {
                        jLongValue2 = jLongValue - l.longValue();
                        if (jLongValue2 != 0) {
                            stringBuffer2.append("" + jLongValue2);
                        }
                    }
                    stringBuffer2.append(str3);
                }
                if (a.a.a.g.m.a.f310a) {
                    g.h().a("wifi scantime list str = " + stringBuffer2.toString());
                }
                stringBuffer.append(stringBuffer2.toString());
            }
            return stringBuffer.toString();
        }
        str3 = r4;
        z4 = true;
        if (z3) {
            return null;
        }
        if (j > 10) {
            stringBuffer2 = new StringBuffer(128);
            stringBuffer2.append("&wf_ut=");
            l = (Long) arrayList.get(0);
            it = arrayList.iterator();
            while (it.hasNext()) {
                jLongValue = ((Long) it.next()).longValue();
                if (z4) {
                    stringBuffer2.append(jLongValue);
                    z4 = false;
                } else {
                    jLongValue2 = jLongValue - l.longValue();
                    if (jLongValue2 != 0) {
                        stringBuffer2.append("" + jLongValue2);
                    }
                }
                stringBuffer2.append(str3);
            }
            if (a.a.a.g.m.a.f310a) {
                g.h().a("wifi scantime list str = " + stringBuffer2.toString());
            }
            stringBuffer.append(stringBuffer2.toString());
        }
        return stringBuffer.toString();
    }

    public synchronized String a(WifiInfo wifiInfo, String str) {
        if (wifiInfo == null && str == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.l > 1000) {
            if (wifiInfo != null) {
                this.m = wifiInfo.getBSSID();
            } else {
                this.m = str;
            }
            this.l = jCurrentTimeMillis;
        }
        return this.m;
    }

    public void a(int i) {
        this.h = i;
    }

    public void a(Context context, List<String> list) {
        if (this.f306c) {
            return;
        }
        this.g = context;
        this.d = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.e = new c();
        if (this.p == null) {
            this.p = new Handler(Looper.getMainLooper());
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!list.contains("android.net.wifi.SCAN_RESULTS")) {
            list.add("android.net.wifi.SCAN_RESULTS");
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.g.registerReceiver(this.e, new IntentFilter(it.next()));
            }
        } catch (Exception e) {
            if (a.a.a.g.m.a.f310a) {
                e.printStackTrace();
            }
        }
        this.f306c = true;
        if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
            g.h().a("wifimanager start ...");
        }
    }

    public boolean a(k kVar, k kVar2) {
        List<ScanResult> list = kVar.f295a;
        if (list == null || kVar2 == null || kVar2.f295a == null) {
            return false;
        }
        int iMin = Math.min(list.size(), kVar2.f295a.size());
        for (int i = 0; i < iMin; i++) {
            try {
                if (kVar.f295a.get(i) != null) {
                    String str = kVar.f295a.get(i).BSSID;
                    String str2 = kVar2.f295a.get(i).BSSID;
                    if (!TextUtils.isEmpty(str) && !str.equals(str2)) {
                        return false;
                    }
                }
            } catch (Exception e) {
                if (a.a.a.g.m.a.f310a) {
                    e.printStackTrace();
                }
                return false;
            }
        }
        return true;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("wpa|wep", 2).matcher(str).find();
    }

    public k b(long j) {
        e eVarH;
        String str;
        if (this.d != null && j < 2147483647L) {
            boolean z = a.a.a.g.m.a.f310a;
            if (z && a.a.a.g.m.a.f311b) {
                g.h().a("Wi-Fi diffTime = " + j + "mLastDiffTime = " + this.k);
            }
            if (j == this.k) {
                if (z && a.a.a.g.m.a.f311b) {
                    g.h().a("System.currentTimeMillis() = " + System.currentTimeMillis() + "wifi diffTime = " + j + ", mScanTime = " + this.j);
                }
                if (System.currentTimeMillis() - this.j > j) {
                    if (z && a.a.a.g.m.a.f311b) {
                        eVarH = g.h();
                        str = "time is over";
                        eVarH.a(str);
                    }
                    g();
                }
            } else {
                if (z && a.a.a.g.m.a.f311b) {
                    eVarH = g.h();
                    str = "diffTime is changed";
                    eVarH.a(str);
                }
                g();
            }
        }
        this.k = j;
        return this.f;
    }

    public String b() {
        StringBuffer stringBuffer = new StringBuffer();
        WifiInfo wifiInfoA = i().a();
        String strA = a(wifiInfoA, (String) null);
        if (wifiInfoA == null || strA == null) {
            return null;
        }
        String strReplace = strA.replace(":", "");
        int rssi = wifiInfoA.getRssi();
        String strD = i().d();
        if (rssi < 0) {
            rssi = -rssi;
        }
        if (strReplace == null || rssi >= 100 || "020000000000".equals(strReplace)) {
            return null;
        }
        stringBuffer.append("&wf=");
        stringBuffer.append(strReplace);
        stringBuffer.append(";");
        stringBuffer.append("" + rssi + ";");
        String ssid = wifiInfoA.getSSID();
        if (ssid != null && (ssid.contains("&") || ssid.contains(";"))) {
            ssid = ssid.replace("&", "_");
        }
        stringBuffer.append(ssid);
        stringBuffer.append("&wf_n=1");
        if (strD != null) {
            stringBuffer.append("&wf_gw=");
            stringBuffer.append(strD);
        }
        return stringBuffer.toString();
    }

    public final String b(String str) {
        if (str != null) {
            return (str.contains("&") || str.contains(";")) ? str.replace("&", "_").replace(";", "_") : str;
        }
        return str;
    }

    public k c() {
        k kVarA;
        synchronized (this.o) {
            kVarA = a(this.f);
        }
        if (kVarA == null || !kVarA.b()) {
            try {
                WifiManager wifiManager = this.d;
                kVarA = wifiManager != null ? new k(wifiManager.getScanResults(), this.j) : new k(null, 0L);
            } catch (Exception e) {
                if (a.a.a.g.m.a.f310a) {
                    e.printStackTrace();
                }
            }
        }
        return kVarA;
    }

    public final String d() {
        DhcpInfo dhcpInfo;
        WifiManager wifiManager = this.d;
        if (wifiManager == null || (dhcpInfo = wifiManager.getDhcpInfo()) == null) {
            return null;
        }
        return a(dhcpInfo.gateway);
    }

    public long e() {
        return this.j;
    }

    public final void f() {
        WifiManager wifiManager = this.d;
        if (wifiManager == null) {
            return;
        }
        try {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (scanResults != null && scanResults.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    long j = 0;
                    for (int i = 0; i < scanResults.size(); i++) {
                        if (i == 0) {
                            try {
                                j = (jCurrentTimeMillis - scanResults.get(0).timestamp) / 1000000;
                            } catch (Exception e) {
                                e.printStackTrace();
                                j = 0;
                            }
                            sb.append(scanResults.get(0).BSSID + ";" + Math.abs(scanResults.get(0).level) + ";" + scanResults.get(0).SSID.trim() + ";" + scanResults.get(0).frequency + ";" + j + "|");
                        }
                        sb.append(scanResults.get(i).BSSID + ";" + Math.abs(scanResults.get(i).level) + ";" + scanResults.get(i).SSID.trim() + ";" + scanResults.get(i).frequency + ";" + (((jCurrentTimeMillis - scanResults.get(i).timestamp) / 1000000) - j) + "|");
                    }
                    sb.append("\t");
                    sb.append(simpleDateFormat.format(new Date(jCurrentTimeMillis)));
                    sb.append("\t");
                    sb.append(jCurrentTimeMillis);
                    sb.append("\tnull\n");
                    g.h().a(sb.toString());
                }
            }
            if (scanResults != null) {
                k kVar = new k(scanResults, System.currentTimeMillis());
                synchronized (this.o) {
                    k kVar2 = this.f;
                    if (kVar2 == null || !a(kVar, kVar2)) {
                        this.f = kVar;
                    }
                }
            }
        } catch (Exception e2) {
            if (a.a.a.g.m.a.f310a) {
                e2.printStackTrace();
            }
        }
    }

    public final void g() {
        try {
            if (this.d.isWifiEnabled() || (Build.VERSION.SDK_INT > 17 && this.d.isScanAlwaysAvailable())) {
                this.d.startScan();
                if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                    g.h().a("wifimanager start scan ...");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.j = System.currentTimeMillis();
        synchronized (this.n) {
            try {
                int i = this.h;
                if (i != 0) {
                    this.n.wait(i);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void h() {
        if (this.f306c) {
            try {
                this.g.unregisterReceiver(this.e);
                this.i = 0L;
            } catch (Exception e) {
                if (a.a.a.g.m.a.f310a) {
                    e.printStackTrace();
                }
            }
            this.e = null;
            this.d = null;
            this.f306c = false;
            if (a.a.a.g.m.a.f310a && a.a.a.g.m.a.f311b) {
                g.h().a("wifimanager stop ...");
            }
        }
    }
}
