package c.d.a.b;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f1329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f1330c = 0;
    private long d = 0;
    private long e = 0;
    private long f = 0;
    private int g = -1;
    private long h = 0;
    private long i = 0;
    private long j = 0;
    private long k = 0;

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        String strA = l.a();
        try {
            if (this.f1329b == null) {
                this.f1329b = "";
            }
            jSONObject.put("appLabel", this.f1329b);
            if (this.f1328a == null) {
                this.f1328a = "";
            }
            jSONObject.put("pkgName", this.f1328a);
            jSONObject.put("Time", strA);
            jSONObject.put("runTime", this.f1330c + "min");
            jSONObject.put("tx1", this.h + "KB");
            jSONObject.put("rx1", this.i + "KB");
            jSONObject.put("tx2", this.j + "KB");
            jSONObject.put("rx2", this.k + "KB");
            jSONObject.put("totalData1", this.d + "KB");
            jSONObject.put("totalData2", this.e + "KB");
            jSONObject.put("totalDataWiFi", this.f + "MB");
        } catch (JSONException e) {
            h.b("AppInfo", "getJsonObject->" + e.getMessage());
        }
        return jSONObject;
    }

    public void a(int i) {
        this.g = i;
    }

    public void a(long j) {
        this.f1330c = j;
    }

    public void a(String str) {
        this.f1329b = str;
    }

    public int b() {
        return this.g;
    }

    public void b(long j) {
        this.i = j;
    }

    public void b(String str) {
        this.f1328a = str;
    }

    public void c(long j) {
        this.k = j;
    }

    public void d(long j) {
    }

    public void e(long j) {
        this.d = j;
    }

    public void f(long j) {
        this.e = j;
    }

    public void g(long j) {
        this.f = j;
    }

    public void h(long j) {
        this.h = j;
    }

    public void i(long j) {
        this.j = j;
    }

    public void j(long j) {
    }
}
