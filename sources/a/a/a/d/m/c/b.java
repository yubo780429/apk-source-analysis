package a.a.a.d.m.c;

import android.content.Context;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static b e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f202b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f201a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f203c = "";
    public Map<String, a> d = Collections.synchronizedMap(new HashMap());

    public static class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f205c;
        public double d;
        public double e;
        public double f;
        public double g;
        public String h;
    }

    public b(Context context) {
        this.f202b = "slr";
        this.f202b = new File(context.getCacheDir(), this.f202b).getAbsolutePath();
    }

    public static b a(Context context) {
        if (e == null) {
            e = new b(context);
        }
        return e;
    }

    public static synchronized b d() {
        return e;
    }

    public Map<String, a> a() {
        return this.d;
    }

    public boolean b() {
        return this.f201a;
    }

    public boolean c() {
        return this.f203c.equals("on");
    }
}
