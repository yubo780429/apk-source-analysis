package c.a.b.c;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import c.a.b.n;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends c.a.b.c.a {
    c.a.b.i.a.C0053a f;

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f1215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n.a f1216b;

        a() {
            new c.a.b.k.b();
        }

        private boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f1215a = jSONObject.getLong("pub_lst_ts");
                this.f1216b = n.b(jSONObject.getString("pub_info"));
                jSONObject.getInt("d_form_ver");
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public long a() {
            return this.f1215a;
        }

        public boolean a(PackageInfo packageInfo) {
            return a(d.this.f.a(new File(packageInfo.applicationInfo.dataDir)).a("pub.dat", true));
        }

        public n.a b() {
            return this.f1216b;
        }
    }

    class b extends c.a.b.c.a.b {
        private String d;
        private long e;
        private long f;
        private long g;
        private n.a h;

        public b(d dVar, String str) {
            super(dVar.f, str);
        }

        public void a(a aVar) {
            a(aVar.b());
            b(aVar.a());
        }

        @Override // c.a.b.c.a.b
        public void a(JSONObject jSONObject) throws JSONException {
            this.d = jSONObject.getString("pkg");
            this.f = jSONObject.getInt("tar_pkg_lst_pub_ts");
            this.e = jSONObject.getLong("last_fe_ts");
            this.h = n.b(jSONObject.getString("info"));
            this.g = jSONObject.getLong("tar_pkg_lst_up_ts");
            jSONObject.getInt("d_form_ver");
        }

        public boolean a(long j) {
            if (this.e == j) {
                return false;
            }
            this.e = j;
            a(true);
            return true;
        }

        public boolean a(n.a aVar) {
            if (aVar.equals(this.h)) {
                return false;
            }
            this.h = aVar;
            a(true);
            return true;
        }

        public boolean a(String str) {
            if (str.equals(this.d)) {
                return false;
            }
            this.d = str;
            a(true);
            return true;
        }

        @Override // c.a.b.c.a.b
        public void b(JSONObject jSONObject) throws JSONException {
            jSONObject.put("pkg", this.d);
            jSONObject.put("last_fe_ts", this.e);
            jSONObject.put("tar_pkg_lst_pub_ts", this.f);
            jSONObject.put("info", this.h.a());
            jSONObject.put("tar_pkg_lst_up_ts", this.g);
            jSONObject.put("d_form_ver", 1);
        }

        public boolean b(long j) {
            if (this.f == j) {
                return false;
            }
            this.f = j;
            a(true);
            return true;
        }

        public String c() {
            return this.d;
        }

        public boolean c(long j) {
            if (this.g == j) {
                return false;
            }
            this.g = j;
            a(true);
            return true;
        }

        public n.a d() {
            return this.h;
        }

        public long e() {
            return this.g;
        }
    }

    public d() {
        super("isc", 8000000L);
        new a();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[PHI: r2
  0x0041: PHI (r2v1 c.a.b.c.d$b) = (r2v0 c.a.b.c.d$b), (r2v2 c.a.b.c.d$b), (r2v2 c.a.b.c.d$b) binds: [B:11:0x001a, B:13:0x002c, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    @Override // c.a.b.c.a
    public c.a.b.c.a.e a(String str, c.a.b.c.a.d dVar) {
        PackageInfo packageInfo;
        a aVar;
        n.a aVarB;
        b bVar = null;
        try {
            packageInfo = this.f1203a.f1206a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return c.a.b.c.a.e.a(-2);
        }
        if (dVar.f1211a) {
            bVar = new b(this, str);
            bVar.a();
            if (str.equals(bVar.c()) && packageInfo.lastUpdateTime == bVar.e()) {
                aVarB = bVar.d();
            } else {
                aVar = new a();
                if (!aVar.a(packageInfo)) {
                    return c.a.b.c.a.e.a(-2);
                }
                if (dVar.f1211a && bVar != null) {
                    bVar.a(aVar);
                    bVar.a(System.currentTimeMillis());
                    bVar.c(packageInfo.lastUpdateTime);
                    bVar.a(str);
                    bVar.b();
                }
                aVarB = aVar.b();
            }
        } else {
            aVar = new a();
            if (!aVar.a(packageInfo)) {
                return c.a.b.c.a.e.a(-2);
            }
            if (dVar.f1211a) {
                bVar.a(aVar);
                bVar.a(System.currentTimeMillis());
                bVar.c(packageInfo.lastUpdateTime);
                bVar.a(str);
                bVar.b();
            }
            aVarB = aVar.b();
        }
        return c.a.b.c.a.e.a(aVarB);
    }

    @Override // c.a.b.c.a
    public void a(c.a.b.c.a.c cVar) {
        this.f = this.f1204b.a("isc");
    }
}
