package android.arch.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, n> f404a = new HashMap<>();

    final n a(String str) {
        return this.f404a.get(str);
    }

    public final void a() {
        Iterator<n> it = this.f404a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f404a.clear();
    }

    final void a(String str, n nVar) {
        n nVarPut = this.f404a.put(str, nVar);
        if (nVarPut != null) {
            nVarPut.a();
        }
    }
}
