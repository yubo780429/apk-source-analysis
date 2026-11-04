package a.a.a.h;

import a.a.a.b.c;
import a.a.a.b.l;
import a.a.a.b.o;
import a.a.a.b.v;
import a.a.a.b.w;
import a.a.a.b.y;
import a.a.a.b.z;
import a.a.a.c.d;
import a.a.a.c.e;
import a.a.a.d.i;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.support.constraint.k;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.location.f;
import com.baidu.location.g;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class a extends Service implements g {
    public static b g;
    public static long h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Messenger f312b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Looper f313c = null;
    public boolean d = true;
    public int e = 0;
    public boolean f = true;

    /* JADX INFO: renamed from: a.a.a.h.a$a, reason: collision with other inner class name */
    public class RunnableC0019a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WeakReference f314b;

        public RunnableC0019a(a aVar, WeakReference weakReference) {
            this.f314b = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = (a) this.f314b.get();
            if (aVar == null || aVar.e != 3) {
                return;
            }
            Log.d("baidu_location_service", "baidu location service force stopped ...");
            aVar.f = false;
            aVar.c();
        }
    }

    public static class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f315a;

        public b(Looper looper, a aVar) {
            super(looper);
            this.f315a = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = this.f315a.get();
            if (aVar == null) {
                return;
            }
            if (f.f) {
                int i = message.what;
                if (i == 11) {
                    aVar.b(message);
                } else if (i == 12) {
                    aVar.c(message);
                } else if (i == 15) {
                    aVar.a(message);
                } else if (i == 22) {
                    o.q().f(message);
                } else if (i == 28) {
                    o.q().a(true, true);
                } else if (i == 41) {
                    o.q().m();
                } else if (i == 114) {
                    Object obj = message.obj;
                    if (obj != null) {
                        i.m().a((Bundle) obj);
                    }
                } else if (i == 401) {
                    try {
                        message.getData();
                    } catch (Exception unused) {
                    }
                } else if (i == 406) {
                    l.f().b();
                } else if (i != 705) {
                    switch (i) {
                        case 110:
                            i.m().k();
                            break;
                        case 111:
                            i.m().l();
                            break;
                        case k.AppCompatTheme_windowActionBarOverlay /* 112 */:
                            i.m().a();
                            break;
                    }
                } else {
                    c.h().a(message.getData().getBoolean("foreground"));
                }
            }
            if (message.what == 1) {
                aVar.c();
            }
            if (message.what == 0) {
                aVar.b();
            }
            super.handleMessage(message);
        }
    }

    public static long d() {
        return h;
    }

    public static Handler e() {
        return g;
    }

    @Override // com.baidu.location.g
    public double a() {
        return 9.520999908447266d;
    }

    @Override // com.baidu.location.g
    public void a(Context context) {
        a.a.a.b.b.a().a(context);
        c.a.c.a.b.c(f.c()).a(true);
        try {
            a.a.a.i.i.o0 = context.getPackageName();
        } catch (Exception unused) {
        }
        h = System.currentTimeMillis();
        HandlerThread handlerThreadA = v.a();
        if (handlerThreadA != null) {
            this.f313c = handlerThreadA.getLooper();
        }
        g = this.f313c == null ? new b(Looper.getMainLooper(), this) : new b(this.f313c, this);
        System.currentTimeMillis();
        this.f312b = new Messenger(g);
        g.sendEmptyMessage(0);
        this.e = 1;
    }

    public final void a(Message message) {
        c.h().a(message);
    }

    public final void b() {
        d.j().h();
        a.a.a.i.b.e();
        a.a.a.b.f.c().a(f.c());
        a.a.a.b.d.i().b(false);
        a.a.a.b.d.i().h();
        try {
            z.f().a();
        } catch (Exception unused) {
        }
        l.f().d();
        a.a.a.g.d.n().a();
        a.a.a.g.f.w().m();
        a.a.a.g.f.w().a(f.c());
        o.q().n();
        a.a.a.f.a.e().c();
        a.a.a.c.c.f().d();
        e.b().a();
        a.a.a.c.a.d().a();
        this.e = 2;
    }

    public final void b(Message message) {
        c.h().d(message);
        a.a.a.f.d.r();
        d.j().c();
    }

    public final void c() {
        a.a.a.g.d.n().b();
        if (this.f) {
            a.a.a.f.d.r().b();
        }
        z.f().b();
        d.j().i();
        a.a.a.c.c.f().e();
        a.a.a.c.b.g().f();
        a.a.a.c.a.d().b();
        a.a.a.b.g.b().a();
        a.a.a.g.f.w().u();
        o.q().o();
        i.m().l();
        l.f().e();
        if (this.f) {
            y.b();
        }
        c.h().c();
        try {
            w.d().c();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.e = 4;
        if (this.d) {
            return;
        }
        Process.killProcess(Process.myPid());
    }

    public final void c(Message message) {
        c.h().e(message);
    }

    @Override // android.app.Service, com.baidu.location.g
    public IBinder onBind(Intent intent) {
        boolean z;
        String string;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            a.a.a.i.b.i = extras.getString("key");
            a.a.a.i.b.h = extras.getString("sign");
            this.d = extras.getBoolean("kill_process");
            z = extras.getBoolean("cache_exception");
            string = extras.getString("auth_key");
            a.a.a.i.i.Q0 = extras.getString("proxyHost");
            a.a.a.i.i.R0 = extras.getInt("proxyPort");
            a.a.a.i.i.S0 = extras.getString("username");
            a.a.a.i.i.T0 = extras.getString("password");
        } else {
            z = false;
            string = null;
        }
        if (string != null) {
            a.a.a.a.a.b().a(f.c(), string);
        }
        if (!TextUtils.isEmpty(a.a.a.i.i.Q0) && a.a.a.i.i.R0 != -1) {
            c.a.c.a.b.c(f.c()).a(a.a.a.i.i.Q0, a.a.a.i.i.R0);
        }
        if (!TextUtils.isEmpty(a.a.a.i.i.S0) && !TextUtils.isEmpty(a.a.a.i.i.T0)) {
            c.a.c.a.b.c(f.c()).a(a.a.a.i.i.S0, a.a.a.i.i.T0);
        }
        a.a.a.a.a.b().a(f.c());
        if (!z) {
            Thread.setDefaultUncaughtExceptionHandler(e.b());
        }
        return this.f312b.getBinder();
    }

    @Override // android.app.Service, com.baidu.location.g
    public void onDestroy() {
        try {
            g.sendEmptyMessage(1);
        } catch (Exception unused) {
            Log.d("baidu_location_service", "baidu location service stop exception...");
            this.f = false;
            c();
            Process.killProcess(Process.myPid());
        }
        this.e = 3;
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0019a(this, new WeakReference(this)), 1000L);
    }

    @Override // android.app.Service, com.baidu.location.g
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.Service, com.baidu.location.g
    public void onTaskRemoved(Intent intent) {
        Log.d("baidu_location_service", "baidu location service remove task...");
    }
}
