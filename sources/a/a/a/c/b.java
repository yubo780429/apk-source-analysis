package a.a.a.c;

import a.a.a.b.o;
import a.a.a.i.i;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static b g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f103a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f104b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AlarmManager f105c = null;
    public C0004b d = null;
    public PendingIntent e = null;
    public long f = 0;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            try {
                if (i == 1) {
                    b.this.d();
                } else if (i != 2) {
                } else {
                    b.this.a();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a.a.a.c.b$b, reason: collision with other inner class name */
    public class C0004b extends BroadcastReceiver {
        public C0004b() {
        }

        public /* synthetic */ C0004b(b bVar, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (b.this.f103a && intent.getAction().equals("com.baidu.location.autonotifyloc_9.5.2.1") && b.this.f104b != null) {
                b.this.e = null;
                b.this.f104b.sendEmptyMessage(1);
            }
        }
    }

    public static synchronized b g() {
        if (g == null) {
            g = new b();
        }
        return g;
    }

    public final void a() {
        if (this.f103a) {
            try {
                PendingIntent pendingIntent = this.e;
                if (pendingIntent != null) {
                    this.f105c.cancel(pendingIntent);
                    this.e = null;
                }
                com.baidu.location.f.c().unregisterReceiver(this.d);
            } catch (Exception unused) {
            }
            this.f105c = null;
            this.d = null;
            this.f104b = null;
            this.f103a = false;
        }
    }

    public void b() {
        Handler handler;
        if (this.f103a && (handler = this.f104b) != null) {
            handler.sendEmptyMessage(1);
        }
    }

    public void c() {
        Handler handler;
        if (this.f103a && (handler = this.f104b) != null) {
            handler.sendEmptyMessage(1);
        }
    }

    public final void d() {
        if (System.currentTimeMillis() - this.f < 1000) {
            return;
        }
        PendingIntent pendingIntent = this.e;
        if (pendingIntent != null) {
            this.f105c.cancel(pendingIntent);
            this.e = null;
        }
        if (this.e == null) {
            this.e = PendingIntent.getBroadcast(com.baidu.location.f.c(), 0, new Intent("com.baidu.location.autonotifyloc_9.5.2.1"), 201326592);
            this.f105c.set(0, System.currentTimeMillis() + ((long) i.T), this.e);
        }
        Message message = new Message();
        message.what = 22;
        if (System.currentTimeMillis() - this.f < i.U) {
            return;
        }
        this.f = System.currentTimeMillis();
        if (a.a.a.g.d.n().j()) {
            return;
        }
        o.q().f(message);
    }

    public void e() {
        if (!this.f103a && i.T >= 10000) {
            if (this.f104b == null) {
                this.f104b = new a();
            }
            this.f105c = (AlarmManager) com.baidu.location.f.c().getSystemService("alarm");
            this.d = new C0004b(this, null);
            com.baidu.location.f.c().registerReceiver(this.d, new IntentFilter("com.baidu.location.autonotifyloc_9.5.2.1"), "android.permission.ACCESS_FINE_LOCATION", null);
            this.e = PendingIntent.getBroadcast(com.baidu.location.f.c(), 0, new Intent("com.baidu.location.autonotifyloc_9.5.2.1"), 201326592);
            this.f105c.set(0, System.currentTimeMillis() + ((long) i.T), this.e);
            this.f103a = true;
            this.f = System.currentTimeMillis();
        }
    }

    public void f() {
        Handler handler;
        if (this.f103a && (handler = this.f104b) != null) {
            handler.sendEmptyMessage(2);
        }
    }
}
