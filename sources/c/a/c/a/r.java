package c.a.c.a;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
class r extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Handler f1313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f1314c;
    private boolean d;

    r(String str) {
        super(str);
        this.f1313b = null;
        this.f1314c = new Object();
        this.d = false;
    }

    public void a() {
        if (d.f1289a) {
            d.a("Looper thread quit()");
        }
        Handler handler = this.f1313b;
        if (handler == null || handler.getLooper() == null) {
            return;
        }
        this.f1313b.getLooper().quit();
    }

    public void b() {
        synchronized (this.f1314c) {
            try {
                if (!this.d) {
                    this.f1314c.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void c() {
        synchronized (this.f1314c) {
            this.d = true;
            this.f1314c.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f1313b = new Handler();
        if (d.f1289a) {
            d.a("new Handler() finish!!");
        }
        Looper.loop();
        if (d.f1289a) {
            d.a("LooperThread run() thread id:" + String.valueOf(Thread.currentThread().getId()));
        }
    }
}
