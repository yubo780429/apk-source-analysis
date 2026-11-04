package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
class g extends f {
    public int m;

    public g(p pVar) {
        super(pVar);
        this.e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // android.support.constraint.n.k.m.f
    public void a(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }
}
