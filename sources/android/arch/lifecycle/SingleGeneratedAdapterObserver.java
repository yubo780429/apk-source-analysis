package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements GenericLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f382a;

    SingleGeneratedAdapterObserver(b bVar) {
        this.f382a = bVar;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(e eVar, c.a aVar) {
        this.f382a.a(eVar, aVar, false, null);
        this.f382a.a(eVar, aVar, true, null);
    }
}
