package b.b.c.d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HandlerThread f1056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f1057c;
    private final int f;
    private final int g;
    private final String h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1055a = new Object();
    private Handler.Callback e = new a();
    private int d = 0;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c.this.a();
                return true;
            }
            if (i != 1) {
                return true;
            }
            c.this.a((Runnable) message.obj);
            return true;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f1059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Handler f1060c;
        final /* synthetic */ d d;

        class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f1061b;

            a(Object obj) {
                this.f1061b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.d.a(this.f1061b);
            }
        }

        b(c cVar, Callable callable, Handler handler, d dVar) {
            this.f1059b = callable;
            this.f1060c = handler;
            this.d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f1059b.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f1060c.post(new a(objCall));
        }
    }

    /* JADX INFO: renamed from: b.b.c.d.c$c, reason: collision with other inner class name */
    class RunnableC0043c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f1063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callable f1064c;
        final /* synthetic */ ReentrantLock d;
        final /* synthetic */ AtomicBoolean e;
        final /* synthetic */ Condition f;

        RunnableC0043c(c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f1063b = atomicReference;
            this.f1064c = callable;
            this.d = reentrantLock;
            this.e = atomicBoolean;
            this.f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1063b.set(this.f1064c.call());
            } catch (Exception unused) {
            }
            this.d.lock();
            try {
                this.e.set(false);
                this.f.signal();
            } finally {
                this.d.unlock();
            }
        }
    }

    public interface d<T> {
        void a(T t);
    }

    public c(String str, int i, int i2) {
        this.h = str;
        this.g = i;
        this.f = i2;
    }

    private void b(Runnable runnable) {
        synchronized (this.f1055a) {
            if (this.f1056b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.f1056b = handlerThread;
                handlerThread.start();
                this.f1057c = new Handler(this.f1056b.getLooper(), this.e);
                this.d++;
            }
            this.f1057c.removeMessages(0);
            this.f1057c.sendMessage(this.f1057c.obtainMessage(1, runnable));
        }
    }

    public <T> T a(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        b(new RunnableC0043c(this, atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                T t = (T) atomicReference.get();
                reentrantLock.unlock();
                return t;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t2 = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t2;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    void a() {
        synchronized (this.f1055a) {
            if (this.f1057c.hasMessages(1)) {
                return;
            }
            this.f1056b.quit();
            this.f1056b = null;
            this.f1057c = null;
        }
    }

    void a(Runnable runnable) {
        runnable.run();
        synchronized (this.f1055a) {
            this.f1057c.removeMessages(0);
            this.f1057c.sendMessageDelayed(this.f1057c.obtainMessage(0), this.f);
        }
    }

    public <T> void a(Callable<T> callable, d<T> dVar) {
        b(new b(this, callable, new Handler(), dVar));
    }
}
