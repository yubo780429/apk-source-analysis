package com.baidu.location;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class f extends Service {
    public static Context e = null;
    public static boolean f = false;
    public static boolean g = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f1360b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f1361c = null;
    public g d = null;

    public static float a() {
        return 9.521f;
    }

    public static String b() {
        return "app.jar";
    }

    public static Context c() {
        return e;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        g gVar = this.d;
        if (gVar != null) {
            return gVar.onBind(intent);
        }
        return null;
    }

    @Override // android.app.Service
    @SuppressLint({"NewApi"})
    public void onCreate() {
        if (f) {
            Log.d("baidu_location_service", "baidu location service can not start again ...20190306..." + Process.myPid());
            return;
        }
        e = getApplicationContext();
        System.currentTimeMillis();
        this.f1361c = new a.a.a.h.a();
        g gVar = this.f1360b;
        if (gVar == null || gVar.a() < this.f1361c.a()) {
            this.d = this.f1361c;
            this.f1360b = null;
        } else {
            this.d = this.f1360b;
            this.f1361c = null;
        }
        f = true;
        this.d.a(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        f = false;
        g gVar = this.d;
        if (gVar != null) {
            gVar.onDestroy();
        }
        if (g) {
            stopForeground(true);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra("command", 0);
                if (intExtra == 1) {
                    startForeground(intent.getIntExtra("id", 0), (Notification) intent.getParcelableExtra("notification"));
                    g = true;
                } else if (intExtra == 2) {
                    stopForeground(intent.getBooleanExtra("removenotify", true));
                    g = false;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        g gVar = this.d;
        if (gVar == null) {
            return 2;
        }
        return gVar.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        g gVar = this.d;
        if (gVar != null) {
            gVar.onTaskRemoved(intent);
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return false;
    }
}
