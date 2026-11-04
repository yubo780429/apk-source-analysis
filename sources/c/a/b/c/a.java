package c.a.b.c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import c.a.b.n;
import java.util.Comparator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Comparator e = new c.a.b.c.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected C0051a f1203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected c.a.b.i.a.C0053a f1204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1205c;
    private long d;

    /* JADX INFO: renamed from: c.a.b.c.a$a, reason: collision with other inner class name */
    public static class C0051a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f1206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.a.b.i.a f1207b;
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c.a.b.i.a.C0053a f1208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1210c = true;

        public b(c.a.b.i.a.C0053a c0053a, String str) {
            this.f1208a = c0053a;
            this.f1209b = "target-pkg-" + Base64.encodeToString(str.getBytes(), 3);
        }

        public abstract void a(JSONObject jSONObject);

        public void a(boolean z) {
            this.f1210c = z;
        }

        public boolean a() {
            String strA = this.f1208a.a(this.f1209b, true);
            if (!TextUtils.isEmpty(strA)) {
                try {
                    a(new JSONObject(strA));
                    a(false);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        public abstract void b(JSONObject jSONObject);

        public boolean b() {
            if (this.f1210c) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    b(jSONObject);
                    this.f1208a.a(this.f1209b, jSONObject.toString(), true);
                    a(false);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    public static class c {
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1211a;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n.a f1212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1213b;

        public e(int i, n.a aVar, Exception exc) {
            this.f1213b = i;
            this.f1212a = aVar;
        }

        public static e a(int i) {
            return new e(i, null, null);
        }

        public static e a(n.a aVar) {
            return new e(0, aVar, null);
        }

        public static e b() {
            return new e(-1, null, null);
        }

        public boolean a() {
            return this.f1213b == 0;
        }
    }

    public a(String str, long j) {
        this.f1205c = str;
        this.d = j;
    }

    public abstract e a(String str, d dVar);

    public String a() {
        return this.f1205c;
    }

    public final void a(C0051a c0051a) {
        this.f1203a = c0051a;
        this.f1204b = c0051a.f1207b.b().a("cs");
    }

    public abstract void a(c cVar);

    public long b() {
        return this.d;
    }
}
