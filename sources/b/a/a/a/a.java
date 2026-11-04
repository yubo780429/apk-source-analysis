package b.a.a.a;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f964c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f966b;

    /* JADX INFO: renamed from: b.a.a.a.a$a, reason: collision with other inner class name */
    static class ExecutorC0035a implements Executor {
        ExecutorC0035a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.b().b(runnable);
        }
    }

    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.b().a(runnable);
        }
    }

    static {
        new ExecutorC0035a();
        new b();
    }

    private a() {
        b.a.a.a.b bVar = new b.a.a.a.b();
        this.f966b = bVar;
        this.f965a = bVar;
    }

    public static a b() {
        if (f964c != null) {
            return f964c;
        }
        synchronized (a.class) {
            if (f964c == null) {
                f964c = new a();
            }
        }
        return f964c;
    }

    @Override // b.a.a.a.c
    public void a(Runnable runnable) {
        this.f965a.a(runnable);
    }

    @Override // b.a.a.a.c
    public boolean a() {
        return this.f965a.a();
    }

    @Override // b.a.a.a.c
    public void b(Runnable runnable) {
        this.f965a.b(runnable);
    }
}
