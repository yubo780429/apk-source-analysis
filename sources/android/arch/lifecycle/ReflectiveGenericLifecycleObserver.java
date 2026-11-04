package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.C0022a f381b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f380a = obj;
        this.f381b = a.f383c.a(obj.getClass());
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(e eVar, c.a aVar) {
        this.f381b.a(eVar, aVar, this.f380a);
    }
}
