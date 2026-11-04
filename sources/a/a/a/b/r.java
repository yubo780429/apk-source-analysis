package a.a.a.b;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Object f66c = new Object();
    public static r d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f67a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f68b = null;

    public r() {
        this.f67a = null;
        if (com.baidu.location.f.c() != null) {
            this.f67a = b(com.baidu.location.f.c());
        }
    }

    public static r a() {
        r rVar;
        synchronized (f66c) {
            if (d == null) {
                d = new r();
            }
            rVar = d;
        }
        return rVar;
    }

    public static SharedPreferences b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences("MapCoreServicePreIA", 0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public synchronized long a(String str, long j) {
        SharedPreferences sharedPreferences = this.f67a;
        if (sharedPreferences != null) {
            try {
                j = sharedPreferences.getLong(str, j);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public SharedPreferences a(Context context) {
        if (this.f68b == null && context != null) {
            try {
                this.f68b = context.getSharedPreferences("MapCoreServicePregck", 0);
            } catch (Exception e) {
                e.printStackTrace();
                this.f68b = null;
            }
        }
        return this.f68b;
    }

    public synchronized String a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f67a;
        if (sharedPreferences != null) {
            try {
                str2 = sharedPreferences.getString(str, str2);
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public synchronized void b(String str, long j) {
        SharedPreferences sharedPreferences = this.f67a;
        if (sharedPreferences != null) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(str, j);
                editorEdit.commit();
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void b(String str, String str2) {
        SharedPreferences sharedPreferences = this.f67a;
        if (sharedPreferences != null) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(str, str2);
                editorEdit.commit();
            } catch (Exception unused) {
            }
        }
    }
}
