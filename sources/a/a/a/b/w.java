package a.a.a.b;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExecutorService f86a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExecutorService f87b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static w f88a = new w();
    }

    public w() {
        this.f86a = null;
        this.f87b = null;
    }

    public static w d() {
        return b.f88a;
    }

    public synchronized ExecutorService a() {
        return this.f86a;
    }

    public synchronized ExecutorService b() {
        return this.f87b;
    }

    public void c() {
        ExecutorService executorService = this.f86a;
        if (executorService != null) {
            executorService.shutdown();
        }
        ExecutorService executorService2 = this.f87b;
        if (executorService2 != null) {
            executorService2.shutdown();
        }
    }
}
