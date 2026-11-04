package android.support.constraint.n.k;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l extends e {
    public ArrayList<e> p0 = new ArrayList<>();

    @Override // android.support.constraint.n.k.e
    public void P() {
        this.p0.clear();
        super.P();
    }

    public ArrayList<e> R() {
        return this.p0;
    }

    public void S() {
        ArrayList<e> arrayList = this.p0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e eVar = this.p0.get(i);
            if (eVar instanceof l) {
                ((l) eVar).S();
            }
        }
    }

    public void T() {
        this.p0.clear();
    }

    @Override // android.support.constraint.n.k.e
    public void a(android.support.constraint.n.c cVar) {
        super.a(cVar);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            this.p0.get(i).a(cVar);
        }
    }

    public void a(e eVar) {
        this.p0.add(eVar);
        if (eVar.v() != null) {
            ((l) eVar.v()).c(eVar);
        }
        eVar.b(this);
    }

    public void c(e eVar) {
        this.p0.remove(eVar);
        eVar.P();
    }
}
