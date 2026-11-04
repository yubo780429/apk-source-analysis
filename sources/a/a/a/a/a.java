package a.a.a.a;

import android.content.Context;
import c.a.c.a.b;
import c.a.c.a.c;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a implements c {
    public static Object d = new Object();
    public static a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f0a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f1b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2c = 0;

    public static a b() {
        a aVar;
        synchronized (d) {
            if (e == null) {
                e = new a();
            }
            aVar = e;
        }
        return aVar;
    }

    public static String b(Context context) {
        try {
            return b.c(context).a(context);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String c(Context context) {
        try {
            return b.c(context).b();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // c.a.c.a.c
    public void a(int i, String str) {
        this.f0a = i;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("token") && jSONObject.getString("token") != null) {
                    jSONObject.getString("token");
                }
                if (!jSONObject.has("ak_permission") || jSONObject.getInt("ak_permission") == 0) {
                    return;
                }
                jSONObject.getInt("ak_permission");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void a(Context context) {
        this.f1b = context;
        b.c(context).a(false, "lbs_locsdk", null, this);
        this.f2c = System.currentTimeMillis();
    }

    public void a(Context context, String str) {
        b.c(context).a(str);
    }

    public boolean a() {
        int i = this.f0a;
        boolean z = i == 0 || i == 602 || i == 601 || i == -10 || i == -11;
        if (this.f1b != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f2c;
            if (!z ? jCurrentTimeMillis < 0 || jCurrentTimeMillis > 10000 : jCurrentTimeMillis > 86400000) {
                b.c(this.f1b).a(false, "lbs_locsdk", null, this);
                this.f2c = System.currentTimeMillis();
            }
        }
        return z;
    }
}
