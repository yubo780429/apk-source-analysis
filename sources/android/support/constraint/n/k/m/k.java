package android.support.constraint.n.k.m;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class k extends p {
    public k(android.support.constraint.n.k.e eVar) {
        super(eVar);
    }

    private void a(f fVar) {
        this.h.k.add(fVar);
        fVar.l.add(this.h);
    }

    @Override // android.support.constraint.n.k.m.p
    void a() {
        p pVar;
        android.support.constraint.n.k.e eVar = this.f523b;
        if (eVar instanceof android.support.constraint.n.k.a) {
            this.h.f509b = true;
            android.support.constraint.n.k.a aVar = (android.support.constraint.n.k.a) eVar;
            int iT = aVar.T();
            boolean zS = aVar.S();
            int i = 0;
            if (iT != 0) {
                if (iT != 1) {
                    if (iT == 2) {
                        this.h.e = f.a.TOP;
                        while (i < aVar.q0) {
                            android.support.constraint.n.k.e eVar2 = aVar.p0[i];
                            if (zS || eVar2.B() != 8) {
                                f fVar = eVar2.e.h;
                                fVar.k.add(this.h);
                                this.h.l.add(fVar);
                            }
                            i++;
                        }
                    } else {
                        if (iT != 3) {
                            return;
                        }
                        this.h.e = f.a.BOTTOM;
                        while (i < aVar.q0) {
                            android.support.constraint.n.k.e eVar3 = aVar.p0[i];
                            if (zS || eVar3.B() != 8) {
                                f fVar2 = eVar3.e.i;
                                fVar2.k.add(this.h);
                                this.h.l.add(fVar2);
                            }
                            i++;
                        }
                    }
                    a(this.f523b.e.h);
                    pVar = this.f523b.e;
                } else {
                    this.h.e = f.a.RIGHT;
                    while (i < aVar.q0) {
                        android.support.constraint.n.k.e eVar4 = aVar.p0[i];
                        if (zS || eVar4.B() != 8) {
                            f fVar3 = eVar4.d.i;
                            fVar3.k.add(this.h);
                            this.h.l.add(fVar3);
                        }
                        i++;
                    }
                }
                a(pVar.i);
            }
            this.h.e = f.a.LEFT;
            while (i < aVar.q0) {
                android.support.constraint.n.k.e eVar5 = aVar.p0[i];
                if (zS || eVar5.B() != 8) {
                    f fVar4 = eVar5.d.h;
                    fVar4.k.add(this.h);
                    this.h.l.add(fVar4);
                }
                i++;
            }
            a(this.f523b.d.h);
            pVar = this.f523b.d;
            a(pVar.i);
        }
    }

    @Override // android.support.constraint.n.k.m.p, android.support.constraint.n.k.m.d
    public void a(d dVar) {
        android.support.constraint.n.k.a aVar = (android.support.constraint.n.k.a) this.f523b;
        int iT = aVar.T();
        Iterator<f> it = this.h.l.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = it.next().g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iT == 0 || iT == 2) {
            this.h.a(i2 + aVar.U());
        } else {
            this.h.a(i + aVar.U());
        }
    }

    @Override // android.support.constraint.n.k.m.p
    public void b() {
        android.support.constraint.n.k.e eVar = this.f523b;
        if (eVar instanceof android.support.constraint.n.k.a) {
            int iT = ((android.support.constraint.n.k.a) eVar).T();
            if (iT == 0 || iT == 1) {
                this.f523b.u(this.h.g);
            } else {
                this.f523b.v(this.h.g);
            }
        }
    }

    @Override // android.support.constraint.n.k.m.p
    void c() {
        this.f524c = null;
        this.h.a();
    }

    @Override // android.support.constraint.n.k.m.p
    boolean f() {
        return false;
    }
}
