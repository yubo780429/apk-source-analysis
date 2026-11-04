package a.a.a.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.location.Jni;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static String B = "BDLocConfigManager";
    public Context A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f3a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5c;
    public long d;
    public double e;
    public int f;
    public int g;
    public double h;
    public int i;
    public int j;
    public double[] k;
    public int l;
    public int m;
    public int n;
    public int o;
    public float p;
    public float q;
    public int r;
    public int[] s;
    public int t;
    public int u;
    public b v;
    public boolean w;
    public String x;
    public String y;
    public String z;

    public class b extends a.a.a.i.g {
        public String i = null;
        public boolean j = false;

        public b() {
            this.d = new HashMap();
        }

        @Override // a.a.a.i.g
        public void a() {
            this.f338b = 2;
            String strB = Jni.b(this.i);
            this.i = null;
            this.d.put("qt", "conf");
            this.d.put("req", strB);
        }

        @Override // a.a.a.i.g
        public void a(boolean z) {
            if (z && this.f339c != null) {
                try {
                    new JSONObject(this.f339c);
                    if (a.this.f3a != null) {
                        SharedPreferences.Editor editorEdit = a.this.f3a.edit();
                        editorEdit.putString(a.B + "_newConfig", Base64.encodeToString(a.a.a.i.i.a(this.f339c.getBytes()), 0));
                        editorEdit.apply();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Map<String, Object> map = this.d;
            if (map != null) {
                map.clear();
            }
            this.j = false;
        }

        public void c(String str) {
            if (this.j) {
                return;
            }
            this.j = true;
            this.i = str;
            a(a.a.a.i.d.f325c);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6a = new a();
    }

    public a() {
        this.f3a = null;
        this.f4b = false;
        this.f5c = 16;
        this.d = 300L;
        this.e = 0.75d;
        this.f = 0;
        this.g = 1;
        this.h = -0.10000000149011612d;
        this.i = 0;
        this.j = 1;
        this.l = 0;
        this.m = 1;
        this.n = 1;
        this.o = 0;
        this.p = 0.2f;
        this.q = 0.8f;
        this.r = 0;
        this.s = null;
        this.t = 8;
        this.u = 4000;
        this.v = null;
        this.w = false;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
    }

    public static a c() {
        return c.f6a;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("v9.521|");
        sb.append(this.y);
        sb.append("|");
        String str = Build.MODEL;
        sb.append(str);
        sb.append("&cu=");
        sb.append(this.y);
        sb.append("&mb=");
        sb.append(str);
        return sb.toString();
    }

    public synchronized void a(double d, double d2, String str) {
        SharedPreferences sharedPreferences;
        try {
            if (this.z == null && str != null) {
                try {
                    if (str.equals("bd09") || str.equals("wgs84mc")) {
                        double[] dArrA = Jni.a(d2, d, "bd092gcj");
                        double d3 = dArrA[1];
                        double d4 = dArrA[0];
                        d = d3;
                        d2 = d4;
                    }
                    String str2 = String.format(Locale.US, "%.5f|%.5f", Double.valueOf(d2), Double.valueOf(d));
                    this.z = str2;
                    String strEncodeToString = Base64.encodeToString(str2.getBytes("UTF-8"), 0);
                    if (strEncodeToString != null && (sharedPreferences = this.f3a) != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(B + "_loc", strEncodeToString);
                        editorEdit.apply();
                    }
                } catch (Exception unused) {
                    this.z = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(Context context, com.baidu.location.i iVar, String str) {
        if (!this.w && context != null) {
            this.w = true;
            this.A = context;
            if (iVar == null) {
                iVar = new com.baidu.location.i();
            }
            this.x = context.getPackageName();
            try {
                this.y = c.a.c.a.b.c(context).a();
            } catch (Throwable unused) {
                this.y = null;
            }
            if (this.f3a == null) {
                this.f3a = context.getSharedPreferences(B + "BDLocConfig", 0);
            }
            SharedPreferences sharedPreferences = this.f3a;
            if (sharedPreferences != null) {
                long j = sharedPreferences.getLong(B + "_lastCheckTime", 0L);
                String string = this.f3a.getString(B + "_config", "");
                String string2 = this.f3a.getString(B + "_newConfig", "");
                if (!TextUtils.isEmpty(string2)) {
                    a(new String(a.a.a.i.i.b(Base64.decode(string2, 0))));
                } else if (!TextUtils.isEmpty(string)) {
                    a(string);
                    SharedPreferences.Editor editorEdit = this.f3a.edit();
                    editorEdit.remove(B + "_config");
                    editorEdit.apply();
                }
                if (Math.abs((System.currentTimeMillis() / 1000) - j) > this.d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    SharedPreferences.Editor editorEdit2 = this.f3a.edit();
                    editorEdit2.putLong(B + "_lastCheckTime", jCurrentTimeMillis);
                    editorEdit2.apply();
                    a(iVar);
                }
            }
        }
    }

    public final void a(com.baidu.location.i iVar) throws Throwable {
        String str = "&ver=" + a.a.a.i.i.v + "&usr=" + a() + "&app=" + this.x + "&prod=" + iVar.f + "&newwf=1";
        String strSubstring = Build.VERSION.RELEASE;
        if (strSubstring != null && strSubstring.length() > 6) {
            strSubstring = strSubstring.substring(0, 6);
        }
        String str2 = str + "&sv=" + strSubstring;
        String strC = a.a.a.i.i.c("ro.miui.ui.version.name");
        if (!TextUtils.isEmpty(strC)) {
            str2 = str2 + "&miui=" + strC;
        }
        String strF = a.a.a.i.i.f();
        if (!TextUtils.isEmpty(strF)) {
            str2 = str2 + "&mtk=" + strF;
        }
        SharedPreferences sharedPreferencesB = r.b(this.A);
        String string = sharedPreferencesB != null ? sharedPreferencesB.getString("mapcity", null) : null;
        if (!TextUtils.isEmpty(string)) {
            str2 = str2 + "&city=" + string;
        }
        String string2 = this.f3a.getString(B + "_loc", null);
        if (!TextUtils.isEmpty(string2)) {
            try {
                str2 = str2 + "&loc=" + new String(Base64.decode(string2, 0), "UTF-8");
            } catch (Exception unused) {
            }
        }
        if (this.v == null) {
            this.v = new b();
        }
        this.v.c(str2);
    }

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("is_check_Per") && jSONObject.getInt("is_check_Per") > 0) {
                this.f4b = true;
            }
            if (jSONObject.has("wfnum")) {
                this.f5c = jSONObject.getInt("wfnum");
            }
            if (jSONObject.has("freq")) {
                this.d = jSONObject.getLong("freq");
            }
            if (jSONObject.has("wfsm")) {
                this.e = jSONObject.getDouble("wfsm");
            }
            if (jSONObject.has("idmoc")) {
                this.f = jSONObject.getInt("idmoc");
            }
            if (jSONObject.has("gnmcrm")) {
                this.h = jSONObject.getDouble("gnmcrm");
            }
            if (jSONObject.has("gnmcon")) {
                this.i = jSONObject.getInt("gnmcon");
            }
            if (jSONObject.has("lpcs")) {
                this.g = jSONObject.getInt("lpcs");
            }
            if (jSONObject.has("iupl")) {
                this.j = jSONObject.getInt("iupl");
            }
            if (jSONObject.has("opetco")) {
                jSONObject.getInt("opetco");
            }
            if (jSONObject.has("ct")) {
                jSONObject.getInt("ct");
            }
            if (jSONObject.has("suci")) {
                jSONObject.getInt("suci");
            }
            if (jSONObject.has("smn")) {
                jSONObject.getInt("smn");
            }
            if (jSONObject.has("bcar")) {
                a(jSONObject);
            }
            if (jSONObject.has("ums")) {
                jSONObject.getInt("ums");
            }
            if (jSONObject.has("hpdts")) {
                this.l = jSONObject.getInt("hpdts");
            }
            if (jSONObject.has("oldts")) {
                this.m = jSONObject.getInt("oldts");
            }
            if (jSONObject.has("nlp_loc_coarse")) {
                this.n = jSONObject.optInt("nlp_loc_coarse");
            }
            if (jSONObject.has("new_loc_cache_switch")) {
                this.o = jSONObject.optInt("new_loc_cache_switch");
            }
            if (jSONObject.has("nc_same_rate")) {
                this.p = (float) jSONObject.optDouble("nc_same_rate", 0.8d);
            }
            if (jSONObject.has("cl_str_change_rate")) {
                this.q = (float) jSONObject.optDouble("cl_str_change_rate", 0.2d);
            }
            if (jSONObject.has("cl_list_switch")) {
                this.r = jSONObject.optInt("cl_list_switch", 0);
            }
            if (jSONObject.has("cl_str_switch")) {
                String[] strArrSplit = jSONObject.optString("cl_str_switch", "").split(",");
                this.s = new int[strArrSplit.length];
                int i = 0;
                for (String str2 : strArrSplit) {
                    this.s[i] = 0;
                    if (str2.length() > 0) {
                        try {
                            this.s[i] = Integer.parseInt(str2);
                        } catch (Throwable unused) {
                        }
                    }
                    i++;
                }
            }
            if (jSONObject.has("cell_number")) {
                this.t = jSONObject.optInt("cell_number", 10);
            }
            if (jSONObject.has("loc_str_length")) {
                this.u = jSONObject.optInt("loc_str_length", 4000);
            }
            if (jSONObject.has("loc_to_foreground")) {
                jSONObject.optInt("loc_to_foreground", 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            double[] dArr = this.k;
            if (dArr != null && dArr.length > 0) {
                this.k = null;
            }
            try {
                if (!jSONObject.has("bcar") || (jSONArray = jSONObject.getJSONArray("bcar")) == null || jSONArray.length() <= 0) {
                    return;
                }
                if (this.k == null) {
                    this.k = new double[jSONArray.length() * 4];
                }
                int i = 0;
                int i2 = 0;
                while (i < jSONArray.length()) {
                    int i3 = i2 + 1;
                    this.k[i2] = jSONArray.getJSONObject(i).getDouble("x1");
                    int i4 = i3 + 1;
                    this.k[i3] = jSONArray.getJSONObject(i).getDouble("y1");
                    int i5 = i4 + 1;
                    this.k[i4] = jSONArray.getJSONObject(i).getDouble("x2");
                    int i6 = i5 + 1;
                    this.k[i5] = jSONArray.getJSONObject(i).getDouble("y2");
                    i++;
                    i2 = i6;
                }
            } catch (Exception unused) {
            }
        }
    }
}
