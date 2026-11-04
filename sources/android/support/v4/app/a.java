package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class a extends b.b.c.a.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f533c;

    /* JADX INFO: renamed from: android.support.v4.app.a$a, reason: collision with other inner class name */
    static class RunnableC0026a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f535c;
        final /* synthetic */ int d;

        RunnableC0026a(String[] strArr, Activity activity, int i) {
            this.f534b = strArr;
            this.f535c = activity;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f534b.length];
            PackageManager packageManager = this.f535c.getPackageManager();
            String packageName = this.f535c.getPackageName();
            int length = this.f534b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f534b[i], packageName);
            }
            ((b) this.f535c).onRequestPermissionsResult(this.d, this.f534b, iArr);
        }
    }

    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    public interface c {
        boolean a(Activity activity, int i, int i2, Intent intent);

        boolean a(Activity activity, String[] strArr, int i);
    }

    public interface d {
        void a(int i);
    }

    public static c a() {
        return f533c;
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, String[] strArr, int i) {
        c cVar = f533c;
        if (cVar == null || !cVar.a(activity, strArr, i)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof d) {
                    ((d) activity).a(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof b) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0026a(strArr, activity, i));
            }
        }
    }
}
