package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
class j extends p {
    public j(android.support.constraint.n.k.e eVar) {
        super(eVar);
        eVar.d.c();
        eVar.e.c();
        this.f = ((android.support.constraint.n.k.g) eVar).S();
    }

    private void a(f fVar) {
        this.h.k.add(fVar);
        fVar.l.add(this.h);
    }

    @Override // android.support.constraint.n.k.m.p
    void a() {
        f fVar;
        p pVar;
        f fVar2;
        android.support.constraint.n.k.g gVar = (android.support.constraint.n.k.g) this.f523b;
        int iT = gVar.T();
        int iU = gVar.U();
        gVar.V();
        if (gVar.S() == 1) {
            f fVar3 = this.h;
            if (iT != -1) {
                fVar3.l.add(this.f523b.R.d.h);
                this.f523b.R.d.h.k.add(this.h);
                fVar2 = this.h;
            } else {
                if (iU != -1) {
                    fVar3.l.add(this.f523b.R.d.i);
                    this.f523b.R.d.i.k.add(this.h);
                    fVar2 = this.h;
                    iT = -iU;
                } else {
                    fVar3.f509b = true;
                    fVar3.l.add(this.f523b.R.d.i);
                    this.f523b.R.d.i.k.add(this.h);
                }
                a(this.f523b.d.h);
                pVar = this.f523b.d;
            }
            fVar2.f = iT;
            a(this.f523b.d.h);
            pVar = this.f523b.d;
        } else {
            f fVar4 = this.h;
            if (iT != -1) {
                fVar4.l.add(this.f523b.R.e.h);
                this.f523b.R.e.h.k.add(this.h);
                fVar = this.h;
            } else {
                if (iU != -1) {
                    fVar4.l.add(this.f523b.R.e.i);
                    this.f523b.R.e.i.k.add(this.h);
                    fVar = this.h;
                    iT = -iU;
                } else {
                    fVar4.f509b = true;
                    fVar4.l.add(this.f523b.R.e.i);
                    this.f523b.R.e.i.k.add(this.h);
                }
                a(this.f523b.e.h);
                pVar = this.f523b.e;
            }
            fVar.f = iT;
            a(this.f523b.e.h);
            pVar = this.f523b.e;
        }
        a(pVar.i);
    }

    @Override // android.support.constraint.n.k.m.p, android.support.constraint.n.k.m.d
    public void a(d dVar) {
        f fVar = this.h;
        if (fVar.f510c && !fVar.j) {
            this.h.a((int) ((fVar.l.get(0).g * ((android.support.constraint.n.k.g) this.f523b).V()) + 0.5f));
        }
    }

    @Override // android.support.constraint.n.k.m.p
    public void b() {
        if (((android.support.constraint.n.k.g) this.f523b).S() == 1) {
            this.f523b.u(this.h.g);
        } else {
            this.f523b.v(this.h.g);
        }
    }

    @Override // android.support.constraint.n.k.m.p
    void c() {
        this.h.a();
    }

    @Override // android.support.constraint.n.k.m.p
    boolean f() {
        return false;
    }
}
