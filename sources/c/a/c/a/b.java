package c.a.c.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private static Context e = null;
    private static String f = null;
    private static int g = -1;
    private static String h;
    private static String i;
    private static r j;
    private static int k;
    private static b m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f1286a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f1287b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1288c = false;
    private final Handler d = new n(this, Looper.getMainLooper());
    private static Hashtable l = new Hashtable();
    private static String n = "";
    private static String o = "";
    private static boolean p = false;
    private static String q = null;

    private b(Context context) {
        e = context;
        r rVar = j;
        if (rVar != null && !rVar.isAlive()) {
            j = null;
        }
        d.b("BaiduApiAuth SDK Version:1.0.29");
        j();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0035 A[PHI: r4 r5
  0x0035: PHI (r4v7 java.lang.String) = (r4v1 java.lang.String), (r4v1 java.lang.String), (r4v13 java.lang.String) binds: [B:34:0x0070, B:42:0x0080, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r5v10 java.io.FileInputStream) = (r5v8 java.io.FileInputStream), (r5v9 java.io.FileInputStream), (r5v13 java.io.FileInputStream) binds: [B:34:0x0070, B:42:0x0080, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    private String a(int i2) throws Throwable {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable th;
        FileInputStream fileInputStream;
        String line = null;
        try {
            fileInputStream = new FileInputStream(new File("/proc/" + i2 + "/cmdline"));
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        line = bufferedReader.readLine();
                        bufferedReader.close();
                        inputStreamReader.close();
                    } catch (FileNotFoundException unused) {
                        if (bufferedReader != 0) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStream != null) {
                        }
                        return line;
                    } catch (IOException unused2) {
                        if (bufferedReader != 0) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStream != null) {
                        }
                        return line;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != 0) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused3) {
                    bufferedReader = 0;
                } catch (IOException unused4) {
                    bufferedReader = 0;
                } catch (Throwable th3) {
                    bufferedReader = 0;
                    th = th3;
                }
            } catch (FileNotFoundException unused5) {
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                if (bufferedReader != 0) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return line;
            } catch (IOException unused6) {
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                if (bufferedReader != 0) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return line;
            } catch (Throwable th4) {
                bufferedReader = 0;
                th = th4;
                inputStreamReader = null;
            }
        } catch (FileNotFoundException unused7) {
            fileInputStream = null;
            inputStreamReader = null;
        } catch (IOException unused8) {
            fileInputStream = null;
            inputStreamReader = null;
        } catch (Throwable th5) {
            inputStreamReader = null;
            bufferedReader = 0;
            th = th5;
            fileInputStream = null;
        }
        fileInputStream.close();
        return line;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047 A[Catch: NameNotFoundException -> 0x005a, TryCatch #0 {NameNotFoundException -> 0x005a, blocks: (B:14:0x0041, B:16:0x0047, B:18:0x0051), top: B:26:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[Catch: NameNotFoundException -> 0x005a, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x005a, blocks: (B:14:0x0041, B:16:0x0047, B:18:0x0051), top: B:26:0x0041 }] */
    private String a(Context context, String str) {
        c cVar;
        String str2 = "";
        if (!TextUtils.isEmpty(n)) {
            return n;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                String string = applicationInfo.metaData.getString("com.baidu.lbsapi.API_KEY");
                if (string != null) {
                    try {
                        if (string.equals("")) {
                            cVar = (c) l.get(str);
                            if (cVar != null) {
                                cVar.a(101, a.a(101, "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"));
                            }
                        }
                        str2 = string;
                    } catch (PackageManager.NameNotFoundException unused) {
                        str2 = string;
                        c cVar2 = (c) l.get(str);
                        if (cVar2 != null) {
                            cVar2.a(101, a.a(101, "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"));
                        }
                    }
                } else {
                    cVar = (c) l.get(str);
                    if (cVar != null) {
                        cVar.a(101, a.a(101, "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"));
                    }
                    str2 = string;
                }
                return str2;
            }
            c cVar3 = (c) l.get(str);
            if (cVar3 != null) {
                cVar3.a(101, a.a(101, "AndroidManifest.xml的application中没有meta-data标签"));
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return str2;
    }

    private void a(HashMap map, String str, String str2) {
        if (map == null || map.size() <= 0 || str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return;
        }
        try {
            String strA = t.a(str2);
            if (strA == null || strA.length() <= 0) {
                map.put(str, str2);
            } else {
                map.put(str, strA);
            }
        } catch (Exception e2) {
            map.put(str, str2);
            Log.e("LBSAuthManager", "encodeAuthParam", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0 || !jSONObject.has("en")) {
            return;
        }
        if (jSONObject.optInt("en", 0) == 0) {
            if (jSONObject.optString("ck").length() > 0) {
                e.a(jSONObject.optString("ck").getBytes(StandardCharsets.UTF_8));
            }
        } else {
            a(jSONObject, "ak");
            a(jSONObject, "ck");
            a(jSONObject, "sk");
            a(jSONObject, "uid");
            b(jSONObject);
        }
    }

    private void a(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.length() <= 0 || str == null || str.length() <= 0 || !jSONObject.has(str)) {
            return;
        }
        try {
            byte[] bArrB = t.b(jSONObject.optString(str));
            if (bArrB != null && bArrB.length > 0) {
                jSONObject.put(str, new String(bArrB, StandardCharsets.UTF_8));
                "ck".equals(str);
                return;
            }
            jSONObject.put(str, "");
            jSONObject.put("decode_status", -1);
        } catch (Exception e2) {
            Log.e("LBSAuthManager", " decodeAuthResult ", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, String str, Hashtable hashtable, String str2, String str3, int i2, String str4, String str5) {
        String strA;
        StringBuilder sb;
        int i3;
        String strA2 = a(e, str2);
        if (strA2 == null || strA2.equals("")) {
            return;
        }
        HashMap map = new HashMap();
        t.a();
        map.put("pk", t.b() != null ? t.b() : "");
        map.put("url", "https://api.map.baidu.com/sdkcs/verify");
        d.a("url:https://api.map.baidu.com/sdkcs/verify");
        map.put("output", "json");
        a(map, "ak", strA2);
        d.a("ak:" + ((String) map.get("ak")));
        a(map, "mcode", f.a(e));
        map.put("from", "lbs_yunsdk");
        if (hashtable != null && hashtable.size() > 0) {
            for (Map.Entry entry : hashtable.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
                    map.put(str6, str7);
                }
            }
        }
        String strA3 = !TextUtils.isEmpty(o) ? a() : q;
        d.a("cuid:" + q);
        if (TextUtils.isEmpty(strA3)) {
            map.put("cuid", "");
        } else {
            map.put("cuid", strA3);
        }
        map.put("pcn", e.getPackageName());
        map.put("version", "1.0.29");
        map.put("macaddr", "");
        try {
            strA = f.a();
        } catch (Exception unused) {
            strA = "";
        }
        if (TextUtils.isEmpty(strA)) {
            map.put("language", "");
        } else {
            map.put("language", strA);
        }
        if (z) {
            if (z) {
                sb = new StringBuilder();
                i3 = 1;
            } else {
                sb = new StringBuilder();
                i3 = 0;
            }
            sb.append(i3);
            sb.append("");
            map.put("force", sb.toString());
        }
        if (str == null) {
            map.put("from_service", "");
        } else {
            map.put("from_service", str);
        }
        String strK = k();
        if (!TextUtils.isEmpty(strK)) {
            map.put("extend", strK);
        }
        g gVar = new g(e);
        this.f1286a = gVar;
        gVar.a(map, str3, i2, str4, str5, new p(this, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, String str, Hashtable hashtable, String[] strArr, String str2, String str3, int i2, String str4, String str5) {
        String strA;
        StringBuilder sb;
        String strA2 = a(e, str2);
        if (strA2 == null || strA2.equals("")) {
            return;
        }
        HashMap map = new HashMap();
        t.a();
        map.put("pk", t.b() != null ? t.b() : "");
        map.put("url", "https://api.map.baidu.com/sdkcs/verify");
        map.put("output", "json");
        a(map, "ak", strA2);
        map.put("from", "lbs_yunsdk");
        if (hashtable != null && hashtable.size() > 0) {
            for (Map.Entry entry : hashtable.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
                    map.put(str6, str7);
                }
            }
        }
        String strA3 = !TextUtils.isEmpty(o) ? a() : q;
        d.a("sendAuthRequests : cuid: " + strA3);
        if (TextUtils.isEmpty(strA3)) {
            map.put("cuid", "");
        } else {
            map.put("cuid", strA3);
        }
        map.put("pcn", e.getPackageName());
        map.put("version", "1.0.29");
        map.put("macaddr", "");
        try {
            strA = f.a();
        } catch (Exception unused) {
            strA = "";
        }
        if (TextUtils.isEmpty(strA)) {
            map.put("language", "");
        } else {
            map.put("language", strA);
        }
        if (z) {
            if (z) {
                sb = new StringBuilder();
                sb.append(1);
            } else {
                sb = new StringBuilder();
                sb.append(0);
            }
            sb.append("");
            map.put("force", sb.toString());
        }
        if (str == null) {
            map.put("from_service", "");
        } else {
            map.put("from_service", str);
        }
        String strK = k();
        if (!TextUtils.isEmpty(strK)) {
            map.put("extend", strK);
        }
        String[] strArr2 = new String[strArr.length];
        for (int i3 = 0; strArr != null && i3 < strArr.length; i3++) {
            String strA4 = t.a(strArr[i3]);
            if (strA4 == null || strA4.length() <= 0) {
                strArr2[i3] = strArr[i3];
            } else {
                strArr2[i3] = strA4;
            }
        }
        i iVar = new i(e);
        this.f1287b = iVar;
        iVar.a(map, strArr2, str3, i2, str4, str5, new q(this, str2));
    }

    private int b(String str) {
        int i2 = -1;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
            i2 = jSONObject.getInt("status");
            if (jSONObject.has("current") && i2 == 0) {
                long j2 = jSONObject.getLong("current");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if ((jCurrentTimeMillis - j2) / 3600000.0d >= 24.0d) {
                    i2 = 601;
                } else if (this.f1288c) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    if (!simpleDateFormat.format(Long.valueOf(jCurrentTimeMillis)).equals(simpleDateFormat.format(Long.valueOf(j2)))) {
                        i2 = 601;
                    }
                    return i2;
                }
            }
            if (jSONObject.has("current") && i2 == 602) {
                if ((System.currentTimeMillis() - jSONObject.getLong("current")) / 1000 > 180.0d) {
                    return 601;
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return i2;
    }

    private String b(Context context) throws Throwable {
        String strA;
        try {
            strA = a(Process.myPid());
        } catch (IOException unused) {
            strA = null;
        }
        return strA != null ? strA : e.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0028 A[Catch: JSONException -> 0x0062, all -> 0x00b8, TryCatch #0 {JSONException -> 0x0062, blocks: (B:7:0x000e, B:9:0x001b, B:10:0x0020, B:12:0x0028, B:13:0x0031, B:15:0x0040, B:16:0x0045), top: B:33:0x000e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[Catch: JSONException -> 0x0062, all -> 0x00b8, TryCatch #0 {JSONException -> 0x0062, blocks: (B:7:0x000e, B:9:0x001b, B:10:0x0020, B:12:0x0028, B:13:0x0031, B:15:0x0040, B:16:0x0045), top: B:33:0x000e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0085 A[Catch: all -> 0x00b8, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x0007, B:7:0x000e, B:9:0x001b, B:10:0x0020, B:12:0x0028, B:13:0x0031, B:15:0x0040, B:16:0x0045, B:20:0x0081, B:22:0x0085, B:23:0x008a, B:25:0x00aa, B:27:0x00ae, B:19:0x0063), top: B:35:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[Catch: JSONException -> 0x0062, all -> 0x00b8, TryCatch #0 {JSONException -> 0x0062, blocks: (B:7:0x000e, B:9:0x001b, B:10:0x0020, B:12:0x0028, B:13:0x0031, B:15:0x0040, B:16:0x0045), top: B:33:0x000e, outer: #1 }] */
    public synchronized void b(String str, String str2) {
        Message messageObtainMessage;
        int i2;
        JSONObject jSONObject;
        if (str == null) {
            str = l();
            messageObtainMessage = this.d.obtainMessage();
            i2 = -1;
            try {
                jSONObject = new JSONObject(str);
                if (!jSONObject.has("status")) {
                    jSONObject.put("status", -1);
                }
                if (!jSONObject.has("current")) {
                    jSONObject.put("current", System.currentTimeMillis());
                }
                d(jSONObject.toString());
                if (jSONObject.has("current")) {
                    jSONObject.remove("current");
                }
                i2 = jSONObject.getInt("status");
                messageObtainMessage.what = i2;
                messageObtainMessage.obj = jSONObject;
                Bundle bundle = new Bundle();
                bundle.putString("listenerKey", str2);
                messageObtainMessage.setData(bundle);
                this.d.sendMessage(messageObtainMessage);
            } catch (JSONException e2) {
                e2.printStackTrace();
                messageObtainMessage.what = i2;
                messageObtainMessage.obj = new JSONObject();
                Bundle bundle2 = new Bundle();
                bundle2.putString("listenerKey", str2);
                messageObtainMessage.setData(bundle2);
                this.d.sendMessage(messageObtainMessage);
            }
            if (j != null) {
                j.c();
            }
            k--;
            d.a("httpRequest called mAuthCounter-- = " + k);
            if (k == 0 && j != null) {
                j.a();
                j = null;
            }
        } else {
            messageObtainMessage = this.d.obtainMessage();
            i2 = -1;
            jSONObject = new JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
            if (!jSONObject.has("current")) {
                jSONObject.put("current", System.currentTimeMillis());
            }
            d(jSONObject.toString());
            if (jSONObject.has("current")) {
                jSONObject.remove("current");
            }
            i2 = jSONObject.getInt("status");
            messageObtainMessage.what = i2;
            messageObtainMessage.obj = jSONObject;
            Bundle bundle3 = new Bundle();
            bundle3.putString("listenerKey", str2);
            messageObtainMessage.setData(bundle3);
            this.d.sendMessage(messageObtainMessage);
            if (j != null) {
                j.c();
            }
            k--;
            d.a("httpRequest called mAuthCounter-- = " + k);
            if (k == 0) {
                j.a();
                j = null;
            }
        }
        throw th;
    }

    private void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        if (jSONObject.has("ck")) {
            jSONObject.remove("ck");
        }
        if (jSONObject.has("en")) {
            jSONObject.remove("en");
        }
    }

    public static b c(Context context) {
        if (m == null) {
            synchronized (b.class) {
                if (m == null) {
                    m = new b(context);
                }
            }
        } else if (context != null) {
            e = context;
        } else if (d.f1289a) {
            d.c("input context is null");
            new RuntimeException("here").printStackTrace();
        }
        return m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        String string;
        String strA = a(e, str);
        try {
            JSONObject jSONObject = new JSONObject(l());
            if (!jSONObject.has("ak")) {
                return true;
            }
            string = jSONObject.getString("ak");
        } catch (JSONException e2) {
            e2.printStackTrace();
            string = "";
        }
        return (strA == null || string == null || strA.equals(string)) ? false : true;
    }

    private void d(String str) {
        e.getSharedPreferences("authStatus_" + b(e), 0).edit().putString("status", str).apply();
    }

    private void j() {
        synchronized (b.class) {
            if (j == null) {
                r rVar = new r("auth");
                j = rVar;
                rVar.start();
                while (j.f1313b == null) {
                    try {
                        d.a("wait for create auth thread.");
                        Thread.sleep(3L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    private String k() {
        try {
            JSONObject jSONObject = new JSONObject(l());
            return !jSONObject.has("extend") ? "" : jSONObject.getString("extend");
        } catch (JSONException unused) {
            return "";
        }
    }

    private String l() {
        return e.getSharedPreferences("authStatus_" + b(e), 0).getString("status", "{\"status\":601}");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036 A[Catch: all -> 0x00e2, TryCatch #0 {, blocks: (B:6:0x0007, B:9:0x0012, B:12:0x001d, B:14:0x0036, B:15:0x003b, B:17:0x0043, B:20:0x004d, B:23:0x0088, B:27:0x00a1, B:29:0x00a8, B:32:0x00af, B:33:0x00d9, B:36:0x00dc, B:26:0x009e, B:39:0x00e0), top: B:44:0x0007, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public int a(boolean z, String str, Hashtable hashtable, c cVar) {
        String str2;
        String strA;
        int iB;
        synchronized (b.class) {
            boolean z2 = false;
            if (hashtable == null) {
                this.f1288c = z2;
                str2 = System.currentTimeMillis() + "";
                if (cVar != null) {
                    l.put(str2, cVar);
                }
                strA = a(e, str2);
                if (strA != null) {
                    k++;
                    d.a(" mAuthCounter  ++ = " + k);
                    String strL = l();
                    d.a("getAuthMessage from cache:" + strL);
                    iB = b(strL);
                    if (iB == 601) {
                        d(new JSONObject().put("status", 602).toString());
                    }
                    j();
                    if (j != null) {
                        d.a("mThreadLooper.mHandler = " + j.f1313b);
                        j.f1313b.post(new o(this, iB, z, str2, str, hashtable));
                        return iB;
                    }
                    return -1;
                }
                return 101;
            }
            String str3 = (String) hashtable.get("zero_auth");
            if (str3 != null && Integer.valueOf(str3).intValue() == 1) {
                z2 = true;
            }
            this.f1288c = z2;
            str2 = System.currentTimeMillis() + "";
            if (cVar != null) {
                l.put(str2, cVar);
            }
            strA = a(e, str2);
            if (strA != null && !strA.equals("")) {
                k++;
                d.a(" mAuthCounter  ++ = " + k);
                String strL2 = l();
                d.a("getAuthMessage from cache:" + strL2);
                iB = b(strL2);
                if (iB == 601) {
                    try {
                        d(new JSONObject().put("status", 602).toString());
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                j();
                if (j != null && j.f1313b != null) {
                    d.a("mThreadLooper.mHandler = " + j.f1313b);
                    j.f1313b.post(new o(this, iB, z, str2, str, hashtable));
                    return iB;
                }
                return -1;
            }
            return 101;
            throw th;
        }
    }

    public String a() {
        if (!TextUtils.isEmpty(q)) {
            return q;
        }
        if (e == null) {
            return "";
        }
        try {
            d.a("mIsPrivacyMode " + p);
            if (p) {
                if (!TextUtils.isEmpty(o)) {
                    c.a.a.a.a.a.a.a(o);
                }
                String strA = c.a.a.a.a.a.a.a(e);
                q = strA;
                d.a("getCUID: " + strA);
                return strA;
            }
            SharedPreferences sharedPreferences = e.getSharedPreferences("Map_Privacy", 0);
            if (sharedPreferences.contains("cuid")) {
                return sharedPreferences.getString("cuid", "");
            }
            String str = s.a(UUID.randomUUID().toString().getBytes(), true) + "|MAPSDK001";
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("cuid", str);
            editorEdit.apply();
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String a(Context context) {
        if (!TextUtils.isEmpty(n)) {
            return n;
        }
        return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.baidu.lbsapi.API_KEY");
    }

    public void a(String str) {
        if (e == null || TextUtils.isEmpty(str)) {
            return;
        }
        n = str;
    }

    public void a(String str, int i2) {
        f = str;
        g = i2;
    }

    public void a(String str, String str2) {
        h = str;
        i = str2;
    }

    public void a(boolean z) {
        Context context = e;
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("Map_Privacy", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (!z) {
            p = sharedPreferences.getBoolean("privacyMode", false);
            return;
        }
        editorEdit.putBoolean("privacyMode", z);
        editorEdit.apply();
        p = z;
    }

    public String b() {
        Context context = e;
        return context == null ? "" : f.a(context);
    }
}
