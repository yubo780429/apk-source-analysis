package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f370a;

    CompositeGeneratedAdaptersObserver(b[] bVarArr) {
        this.f370a = bVarArr;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(e eVar, c.a aVar) {
        i iVar = new i();
        for (b bVar : this.f370a) {
            bVar.a(eVar, aVar, false, iVar);
        }
        for (b bVar2 : this.f370a) {
            bVar2.a(eVar, aVar, true, iVar);
        }
    }
}
