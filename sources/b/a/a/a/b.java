package b.a.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f967a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f968b = Executors.newFixedThreadPool(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Handler f969c;

    @Override // b.a.a.a.c
    public void a(Runnable runnable) {
        this.f968b.execute(runnable);
    }

    @Override // b.a.a.a.c
    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // b.a.a.a.c
    public void b(Runnable runnable) {
        if (this.f969c == null) {
            synchronized (this.f967a) {
                if (this.f969c == null) {
                    this.f969c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f969c.post(runnable);
    }
}
