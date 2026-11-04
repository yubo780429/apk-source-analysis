package android.support.constraint.n.k.m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.support.constraint.n.k.f f505a;
    private android.support.constraint.n.k.f d;
    private b.InterfaceC0025b f;
    private b.a g;
    ArrayList<m> h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f506b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f507c = true;
    private ArrayList<p> e = new ArrayList<>();

    public e(android.support.constraint.n.k.f fVar) {
        new ArrayList();
        this.f = null;
        this.g = new b.a();
        this.h = new ArrayList<>();
        this.f505a = fVar;
        this.d = fVar;
    }

    private int a(android.support.constraint.n.k.f fVar, int i) {
        int size = this.h.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, this.h.get(i2).a(fVar, i));
        }
        return (int) jMax;
    }

    private void a(android.support.constraint.n.k.e eVar, android.support.constraint.n.k.e.b bVar, int i, android.support.constraint.n.k.e.b bVar2, int i2) {
        b.a aVar = this.g;
        aVar.f502a = bVar;
        aVar.f503b = bVar2;
        aVar.f504c = i;
        aVar.d = i2;
        this.f.a(eVar, aVar);
        eVar.t(this.g.e);
        eVar.l(this.g.f);
        eVar.a(this.g.h);
        eVar.h(this.g.g);
    }

    private void a(f fVar, int i, int i2, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.d;
        if (pVar.f524c == null) {
            android.support.constraint.n.k.f fVar3 = this.f505a;
            if (pVar == fVar3.d || pVar == fVar3.e) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i2);
                arrayList.add(mVar);
            }
            pVar.f524c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.h.k) {
                if (dVar instanceof f) {
                    a((f) dVar, i, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.i.k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i, 1, fVar2, arrayList, mVar);
                }
            }
            if (i == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).k.k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.h.l) {
                if (fVar4 == fVar2) {
                    mVar.f515a = true;
                }
                a(fVar4, i, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.i.l) {
                if (fVar5 == fVar2) {
                    mVar.f515a = true;
                }
                a(fVar5, i, 1, fVar2, arrayList, mVar);
            }
            if (i == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).k.l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    private void a(p pVar, int i, ArrayList<m> arrayList) {
        for (d dVar : pVar.h.k) {
            if (dVar instanceof f) {
                a((f) dVar, i, 0, pVar.i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).h, i, 0, pVar.i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.i.k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i, 1, pVar.h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).i, i, 1, pVar.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (d dVar3 : ((n) pVar).k.k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:183:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0006 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    private boolean a(android.support.constraint.n.k.f fVar) {
        int iC;
        android.support.constraint.n.k.e.b bVar;
        int iK;
        android.support.constraint.n.k.e.b bVar2;
        int i;
        float f;
        float fK;
        g gVar;
        int iK2;
        int iK3;
        for (android.support.constraint.n.k.e eVar : fVar.p0) {
            android.support.constraint.n.k.e.b[] bVarArr = eVar.Q;
            android.support.constraint.n.k.e.b bVar3 = bVarArr[0];
            android.support.constraint.n.k.e.b bVar4 = bVarArr[1];
            if (eVar.B() != 8) {
                if (eVar.s < 1.0f && bVar3 == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) {
                    eVar.n = 2;
                }
                if (eVar.v < 1.0f && bVar4 == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) {
                    eVar.o = 2;
                }
                if (eVar.i() > 0.0f) {
                    if (bVar3 == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && (bVar4 == android.support.constraint.n.k.e.b.WRAP_CONTENT || bVar4 == android.support.constraint.n.k.e.b.FIXED)) {
                        eVar.n = 3;
                    } else if (bVar4 == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && (bVar3 == android.support.constraint.n.k.e.b.WRAP_CONTENT || bVar3 == android.support.constraint.n.k.e.b.FIXED)) {
                        eVar.o = 3;
                    } else {
                        android.support.constraint.n.k.e.b bVar5 = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
                        if (bVar3 == bVar5 && bVar4 == bVar5) {
                            if (eVar.n == 0) {
                                eVar.n = 3;
                            }
                            if (eVar.o == 0) {
                                eVar.o = 3;
                            }
                        }
                    }
                }
                if (bVar3 == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && eVar.n == 1 && (eVar.F.f == null || eVar.H.f == null)) {
                    bVar3 = android.support.constraint.n.k.e.b.WRAP_CONTENT;
                }
                android.support.constraint.n.k.e.b bVar6 = bVar3;
                if (bVar4 == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && eVar.o == 1 && (eVar.G.f == null || eVar.I.f == null)) {
                    bVar4 = android.support.constraint.n.k.e.b.WRAP_CONTENT;
                }
                android.support.constraint.n.k.e.b bVar7 = bVar4;
                l lVar = eVar.d;
                lVar.d = bVar6;
                lVar.f522a = eVar.n;
                n nVar = eVar.e;
                nVar.d = bVar7;
                nVar.f522a = eVar.o;
                if ((bVar6 == android.support.constraint.n.k.e.b.MATCH_PARENT || bVar6 == android.support.constraint.n.k.e.b.FIXED || bVar6 == android.support.constraint.n.k.e.b.WRAP_CONTENT) && (bVar7 == android.support.constraint.n.k.e.b.MATCH_PARENT || bVar7 == android.support.constraint.n.k.e.b.FIXED || bVar7 == android.support.constraint.n.k.e.b.WRAP_CONTENT)) {
                    int iC2 = eVar.C();
                    if (bVar6 == android.support.constraint.n.k.e.b.MATCH_PARENT) {
                        iC = (fVar.C() - eVar.F.g) - eVar.H.g;
                        bVar6 = android.support.constraint.n.k.e.b.FIXED;
                    } else {
                        iC = iC2;
                    }
                    int iK4 = eVar.k();
                    if (bVar7 == android.support.constraint.n.k.e.b.MATCH_PARENT) {
                        iK = (fVar.k() - eVar.G.g) - eVar.I.g;
                        bVar = android.support.constraint.n.k.e.b.FIXED;
                    } else {
                        bVar = bVar7;
                        iK = iK4;
                    }
                    a(eVar, bVar6, iC, bVar, iK);
                    eVar.d.e.a(eVar.C());
                    eVar.e.e.a(eVar.k());
                } else if (bVar6 == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && (bVar7 == android.support.constraint.n.k.e.b.WRAP_CONTENT || bVar7 == android.support.constraint.n.k.e.b.FIXED)) {
                    int i2 = eVar.n;
                    if (i2 == 3) {
                        android.support.constraint.n.k.e.b bVar8 = android.support.constraint.n.k.e.b.WRAP_CONTENT;
                        if (bVar7 == bVar8) {
                            a(eVar, bVar8, 0, bVar8, 0);
                        }
                        iK = eVar.k();
                        iC = (int) ((iK * eVar.U) + 0.5f);
                    } else {
                        if (i2 == 1) {
                            a(eVar, android.support.constraint.n.k.e.b.WRAP_CONTENT, 0, bVar7, 0);
                            gVar = eVar.d.e;
                            iK2 = eVar.C();
                        } else {
                            if (i2 == 2) {
                                android.support.constraint.n.k.e.b[] bVarArr2 = fVar.Q;
                                if (bVarArr2[0] == android.support.constraint.n.k.e.b.FIXED || bVarArr2[0] == android.support.constraint.n.k.e.b.MATCH_PARENT) {
                                    iC = (int) ((eVar.s * fVar.C()) + 0.5f);
                                    iK3 = eVar.k();
                                    bVar6 = android.support.constraint.n.k.e.b.FIXED;
                                    bVar = bVar7;
                                    iK = iK3;
                                    a(eVar, bVar6, iC, bVar, iK);
                                    eVar.d.e.a(eVar.C());
                                    eVar.e.e.a(eVar.k());
                                }
                            } else {
                                android.support.constraint.n.k.d[] dVarArr = eVar.N;
                                if (dVarArr[0].f == null || dVarArr[1].f == null) {
                                }
                                bVar6 = android.support.constraint.n.k.e.b.WRAP_CONTENT;
                                iC = 0;
                                iK3 = 0;
                                bVar = bVar7;
                                iK = iK3;
                                a(eVar, bVar6, iC, bVar, iK);
                                eVar.d.e.a(eVar.C());
                                eVar.e.e.a(eVar.k());
                            }
                            if (bVar7 == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) {
                                bVar2 = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
                                if (bVar6 != bVar2) {
                                }
                            } else {
                                bVar2 = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
                                if (bVar6 != bVar2) {
                                }
                            }
                        }
                        gVar.m = iK2;
                    }
                    bVar = android.support.constraint.n.k.e.b.FIXED;
                    bVar6 = bVar;
                    a(eVar, bVar6, iC, bVar, iK);
                    eVar.d.e.a(eVar.C());
                    eVar.e.e.a(eVar.k());
                } else if (bVar7 == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT || !(bVar6 == android.support.constraint.n.k.e.b.WRAP_CONTENT || bVar6 == android.support.constraint.n.k.e.b.FIXED)) {
                    bVar2 = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
                    if (bVar6 != bVar2 && bVar7 == bVar2) {
                        int i3 = eVar.n;
                        if (i3 == 1 || (i = eVar.o) == 1) {
                            android.support.constraint.n.k.e.b bVar9 = android.support.constraint.n.k.e.b.WRAP_CONTENT;
                            a(eVar, bVar9, 0, bVar9, 0);
                            eVar.d.e.m = eVar.C();
                            gVar = eVar.e.e;
                            iK2 = eVar.k();
                            gVar.m = iK2;
                        } else if (i == 2 && i3 == 2) {
                            android.support.constraint.n.k.e.b[] bVarArr3 = fVar.Q;
                            android.support.constraint.n.k.e.b bVar10 = bVarArr3[0];
                            android.support.constraint.n.k.e.b bVar11 = android.support.constraint.n.k.e.b.FIXED;
                            if (bVar10 == bVar11 || bVarArr3[0] == bVar11) {
                                android.support.constraint.n.k.e.b[] bVarArr4 = fVar.Q;
                                android.support.constraint.n.k.e.b bVar12 = bVarArr4[1];
                                android.support.constraint.n.k.e.b bVar13 = android.support.constraint.n.k.e.b.FIXED;
                                if (bVar12 == bVar13 || bVarArr4[1] == bVar13) {
                                    float f2 = eVar.s;
                                    f = eVar.v;
                                    iC = (int) ((f2 * fVar.C()) + 0.5f);
                                    fK = fVar.k();
                                    iK = (int) ((f * fK) + 0.5f);
                                    bVar = android.support.constraint.n.k.e.b.FIXED;
                                    bVar6 = bVar;
                                    a(eVar, bVar6, iC, bVar, iK);
                                    eVar.d.e.a(eVar.C());
                                    eVar.e.e.a(eVar.k());
                                }
                            }
                        }
                    }
                } else {
                    int i4 = eVar.o;
                    if (i4 == 3) {
                        android.support.constraint.n.k.e.b bVar14 = android.support.constraint.n.k.e.b.WRAP_CONTENT;
                        if (bVar6 == bVar14) {
                            a(eVar, bVar14, 0, bVar14, 0);
                        }
                        iC = eVar.C();
                        fK = eVar.U;
                        if (eVar.j() == -1) {
                            fK = 1.0f / fK;
                        }
                        f = iC;
                    } else {
                        if (i4 == 1) {
                            a(eVar, bVar6, 0, android.support.constraint.n.k.e.b.WRAP_CONTENT, 0);
                        } else {
                            if (i4 == 2) {
                                android.support.constraint.n.k.e.b[] bVarArr5 = fVar.Q;
                                if (bVarArr5[1] == android.support.constraint.n.k.e.b.FIXED || bVarArr5[1] == android.support.constraint.n.k.e.b.MATCH_PARENT) {
                                    float f3 = eVar.v;
                                    iC = eVar.C();
                                    iK = (int) ((f3 * fVar.k()) + 0.5f);
                                    bVar = android.support.constraint.n.k.e.b.FIXED;
                                    a(eVar, bVar6, iC, bVar, iK);
                                    eVar.d.e.a(eVar.C());
                                    eVar.e.e.a(eVar.k());
                                }
                            } else {
                                android.support.constraint.n.k.d[] dVarArr2 = eVar.N;
                                if (dVarArr2[2].f == null || dVarArr2[3].f == null) {
                                    bVar6 = android.support.constraint.n.k.e.b.WRAP_CONTENT;
                                    iC = 0;
                                    iK3 = 0;
                                    bVar = bVar7;
                                    iK = iK3;
                                    a(eVar, bVar6, iC, bVar, iK);
                                    eVar.d.e.a(eVar.C());
                                    eVar.e.e.a(eVar.k());
                                }
                            }
                            bVar2 = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
                            if (bVar6 != bVar2) {
                            }
                        }
                        gVar = eVar.e.e;
                        iK2 = eVar.k();
                        gVar.m = iK2;
                    }
                    iK = (int) ((f * fK) + 0.5f);
                    bVar = android.support.constraint.n.k.e.b.FIXED;
                    bVar6 = bVar;
                    a(eVar, bVar6, iC, bVar, iK);
                    eVar.d.e.a(eVar.C());
                    eVar.e.e.a(eVar.k());
                }
            }
            eVar.f490a = true;
        }
        return false;
    }

    public void a() {
        a(this.e);
        this.h.clear();
        m.d = 0;
        a(this.f505a.d, 0, this.h);
        a(this.f505a.e, 1, this.h);
        this.f506b = false;
    }

    public void a(b.InterfaceC0025b interfaceC0025b) {
        this.f = interfaceC0025b;
    }

    public void a(ArrayList<p> arrayList) {
        p jVar;
        arrayList.clear();
        this.d.d.c();
        this.d.e.c();
        arrayList.add(this.d.d);
        arrayList.add(this.d.e);
        HashSet hashSet = null;
        for (android.support.constraint.n.k.e eVar : this.d.p0) {
            if (eVar instanceof android.support.constraint.n.k.g) {
                jVar = new j(eVar);
            } else {
                if (eVar.H()) {
                    if (eVar.f491b == null) {
                        eVar.f491b = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f491b);
                } else {
                    arrayList.add(eVar.d);
                }
                if (eVar.J()) {
                    if (eVar.f492c == null) {
                        eVar.f492c = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f492c);
                } else {
                    arrayList.add(eVar.e);
                }
                if (eVar instanceof android.support.constraint.n.k.i) {
                    jVar = new k(eVar);
                }
            }
            arrayList.add(jVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        for (p pVar : arrayList) {
            if (pVar.f523b != this.d) {
                pVar.a();
            }
        }
    }

    public boolean a(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f506b || this.f507c) {
            for (android.support.constraint.n.k.e eVar : this.f505a.p0) {
                eVar.d();
                eVar.f490a = false;
                eVar.d.g();
                eVar.e.g();
            }
            this.f505a.d();
            android.support.constraint.n.k.f fVar = this.f505a;
            fVar.f490a = false;
            fVar.d.g();
            this.f505a.e.g();
            this.f507c = false;
        }
        if (a(this.d)) {
            return false;
        }
        this.f505a.u(0);
        this.f505a.v(0);
        android.support.constraint.n.k.e.b bVarB = this.f505a.b(0);
        android.support.constraint.n.k.e.b bVarB2 = this.f505a.b(1);
        if (this.f506b) {
            a();
        }
        int iD = this.f505a.D();
        int iE = this.f505a.E();
        this.f505a.d.h.a(iD);
        this.f505a.e.h.a(iE);
        d();
        android.support.constraint.n.k.e.b bVar = android.support.constraint.n.k.e.b.WRAP_CONTENT;
        if (bVarB == bVar || bVarB2 == bVar) {
            if (z4) {
                Iterator<p> it = this.e.iterator();
                while (it.hasNext()) {
                    if (!it.next().f()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && bVarB == android.support.constraint.n.k.e.b.WRAP_CONTENT) {
                this.f505a.a(android.support.constraint.n.k.e.b.FIXED);
                android.support.constraint.n.k.f fVar2 = this.f505a;
                fVar2.t(a(fVar2, 0));
                android.support.constraint.n.k.f fVar3 = this.f505a;
                fVar3.d.e.a(fVar3.C());
            }
            if (z4 && bVarB2 == android.support.constraint.n.k.e.b.WRAP_CONTENT) {
                this.f505a.b(android.support.constraint.n.k.e.b.FIXED);
                android.support.constraint.n.k.f fVar4 = this.f505a;
                fVar4.l(a(fVar4, 1));
                android.support.constraint.n.k.f fVar5 = this.f505a;
                fVar5.e.e.a(fVar5.k());
            }
        }
        android.support.constraint.n.k.e.b[] bVarArr = this.f505a.Q;
        if (bVarArr[0] == android.support.constraint.n.k.e.b.FIXED || bVarArr[0] == android.support.constraint.n.k.e.b.MATCH_PARENT) {
            int iC = this.f505a.C() + iD;
            this.f505a.d.i.a(iC);
            this.f505a.d.e.a(iC - iD);
            d();
            android.support.constraint.n.k.e.b[] bVarArr2 = this.f505a.Q;
            if (bVarArr2[1] == android.support.constraint.n.k.e.b.FIXED || bVarArr2[1] == android.support.constraint.n.k.e.b.MATCH_PARENT) {
                int iK = this.f505a.k() + iE;
                this.f505a.e.i.a(iK);
                this.f505a.e.e.a(iK - iE);
            }
            d();
            z2 = true;
        } else {
            z2 = false;
        }
        for (p pVar : this.e) {
            if (pVar.f523b != this.f505a || pVar.g) {
                pVar.b();
            }
        }
        for (p pVar2 : this.e) {
            if (z2 || pVar2.f523b != this.f505a) {
                if (!pVar2.h.j || ((!pVar2.i.j && !(pVar2 instanceof j)) || (!pVar2.e.j && !(pVar2 instanceof c) && !(pVar2 instanceof j)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f505a.a(bVarB);
        this.f505a.b(bVarB2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    public boolean a(boolean z, int i) {
        boolean z2;
        android.support.constraint.n.k.e.b bVar;
        g gVar;
        int iK;
        boolean z3 = true;
        boolean z4 = z & true;
        android.support.constraint.n.k.e.b bVarB = this.f505a.b(0);
        android.support.constraint.n.k.e.b bVarB2 = this.f505a.b(1);
        int iD = this.f505a.D();
        int iE = this.f505a.E();
        if (z4 && (bVarB == (bVar = android.support.constraint.n.k.e.b.WRAP_CONTENT) || bVarB2 == bVar)) {
            for (p pVar : this.e) {
                if (pVar.f == i && !pVar.f()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && bVarB == android.support.constraint.n.k.e.b.WRAP_CONTENT) {
                    this.f505a.a(android.support.constraint.n.k.e.b.FIXED);
                    android.support.constraint.n.k.f fVar = this.f505a;
                    fVar.t(a(fVar, 0));
                    android.support.constraint.n.k.f fVar2 = this.f505a;
                    gVar = fVar2.d.e;
                    iK = fVar2.C();
                    gVar.a(iK);
                }
            } else if (z4 && bVarB2 == android.support.constraint.n.k.e.b.WRAP_CONTENT) {
                this.f505a.b(android.support.constraint.n.k.e.b.FIXED);
                android.support.constraint.n.k.f fVar3 = this.f505a;
                fVar3.l(a(fVar3, 1));
                android.support.constraint.n.k.f fVar4 = this.f505a;
                gVar = fVar4.e.e;
                iK = fVar4.k();
                gVar.a(iK);
            }
        }
        android.support.constraint.n.k.e.b[] bVarArr = this.f505a.Q;
        if (i == 0) {
            if (bVarArr[0] == android.support.constraint.n.k.e.b.FIXED || bVarArr[0] == android.support.constraint.n.k.e.b.MATCH_PARENT) {
                int iC = this.f505a.C() + iD;
                this.f505a.d.i.a(iC);
                this.f505a.d.e.a(iC - iD);
                z2 = true;
            } else {
                z2 = false;
            }
        } else if (bVarArr[1] == android.support.constraint.n.k.e.b.FIXED || bVarArr[1] == android.support.constraint.n.k.e.b.MATCH_PARENT) {
            int iK2 = this.f505a.k() + iE;
            this.f505a.e.i.a(iK2);
            this.f505a.e.e.a(iK2 - iE);
            z2 = true;
        } else {
            z2 = false;
        }
        d();
        for (p pVar2 : this.e) {
            if (pVar2.f == i && (pVar2.f523b != this.f505a || pVar2.g)) {
                pVar2.b();
            }
        }
        for (p pVar3 : this.e) {
            if (pVar3.f == i && (z2 || pVar3.f523b != this.f505a)) {
                if (!pVar3.h.j || !pVar3.i.j || (!(pVar3 instanceof c) && !pVar3.e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f505a.a(bVarB);
        this.f505a.b(bVarB2);
        return z3;
    }

    public void b() {
        this.f506b = true;
    }

    public boolean b(boolean z) {
        if (this.f506b) {
            for (android.support.constraint.n.k.e eVar : this.f505a.p0) {
                eVar.d();
                eVar.f490a = false;
                l lVar = eVar.d;
                lVar.e.j = false;
                lVar.g = false;
                lVar.g();
                n nVar = eVar.e;
                nVar.e.j = false;
                nVar.g = false;
                nVar.g();
            }
            this.f505a.d();
            android.support.constraint.n.k.f fVar = this.f505a;
            fVar.f490a = false;
            l lVar2 = fVar.d;
            lVar2.e.j = false;
            lVar2.g = false;
            lVar2.g();
            n nVar2 = this.f505a.e;
            nVar2.e.j = false;
            nVar2.g = false;
            nVar2.g();
            a();
        }
        if (a(this.d)) {
            return false;
        }
        this.f505a.u(0);
        this.f505a.v(0);
        this.f505a.d.h.a(0);
        this.f505a.e.h.a(0);
        return true;
    }

    public void c() {
        this.f507c = true;
    }

    public void d() {
        g gVar;
        int iC;
        g gVar2;
        int iC2;
        g gVar3;
        for (android.support.constraint.n.k.e eVar : this.f505a.p0) {
            if (!eVar.f490a) {
                android.support.constraint.n.k.e.b[] bVarArr = eVar.Q;
                boolean z = false;
                android.support.constraint.n.k.e.b bVar = bVarArr[0];
                android.support.constraint.n.k.e.b bVar2 = bVarArr[1];
                int i = eVar.n;
                int i2 = eVar.o;
                boolean z2 = bVar == android.support.constraint.n.k.e.b.WRAP_CONTENT || (bVar == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == android.support.constraint.n.k.e.b.WRAP_CONTENT || (bVar2 == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                g gVar4 = eVar.d.e;
                boolean z3 = gVar4.j;
                g gVar5 = eVar.e.e;
                boolean z4 = gVar5.j;
                if (z3 && z4) {
                    android.support.constraint.n.k.e.b bVar3 = android.support.constraint.n.k.e.b.FIXED;
                    a(eVar, bVar3, gVar4.g, bVar3, gVar5.g);
                } else {
                    if (z3 && z) {
                        a(eVar, android.support.constraint.n.k.e.b.FIXED, eVar.d.e.g, android.support.constraint.n.k.e.b.WRAP_CONTENT, eVar.e.e.g);
                        if (bVar2 == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) {
                            gVar2 = eVar.e.e;
                            iC2 = eVar.k();
                            gVar2.m = iC2;
                        } else {
                            gVar = eVar.e.e;
                            iC = eVar.k();
                            gVar.a(iC);
                        }
                    } else if (z4 && z2) {
                        a(eVar, android.support.constraint.n.k.e.b.WRAP_CONTENT, eVar.d.e.g, android.support.constraint.n.k.e.b.FIXED, eVar.e.e.g);
                        if (bVar == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) {
                            gVar2 = eVar.d.e;
                            iC2 = eVar.C();
                            gVar2.m = iC2;
                        } else {
                            gVar = eVar.d.e;
                            iC = eVar.C();
                            gVar.a(iC);
                        }
                    }
                    if (!eVar.f490a && (gVar3 = eVar.e.l) != null) {
                        gVar3.a(eVar.e());
                    }
                }
                eVar.f490a = true;
                if (!eVar.f490a) {
                }
            }
        }
    }
}
