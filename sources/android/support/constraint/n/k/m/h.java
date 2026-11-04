package android.support.constraint.n.k.m;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b.a f513a = new b.a();

    private static void a(android.support.constraint.n.k.a aVar, b.InterfaceC0025b interfaceC0025b, int i, boolean z) {
        if (aVar.R()) {
            if (i == 0) {
                a(aVar, interfaceC0025b, z);
            } else {
                a(aVar, interfaceC0025b);
            }
        }
    }

    private static void a(android.support.constraint.n.k.e eVar, b.InterfaceC0025b interfaceC0025b) {
        android.support.constraint.n.k.d dVar;
        android.support.constraint.n.k.d dVar2;
        android.support.constraint.n.k.d dVar3;
        android.support.constraint.n.k.d dVar4;
        android.support.constraint.n.k.d dVar5;
        if (!(eVar instanceof android.support.constraint.n.k.f) && eVar.L() && a(eVar)) {
            android.support.constraint.n.k.f.a(eVar, interfaceC0025b, new b.a(), b.a.k);
        }
        android.support.constraint.n.k.d dVarA = eVar.a(android.support.constraint.n.k.d.b.TOP);
        android.support.constraint.n.k.d dVarA2 = eVar.a(android.support.constraint.n.k.d.b.BOTTOM);
        int iB = dVarA.b();
        int iB2 = dVarA2.b();
        if (dVarA.a() != null && dVarA.k()) {
            Iterator<android.support.constraint.n.k.d> it = dVarA.a().iterator();
            while (it.hasNext()) {
                android.support.constraint.n.k.d next = it.next();
                android.support.constraint.n.k.e eVar2 = next.d;
                boolean zA = a(eVar2);
                if (eVar2.L() && zA) {
                    android.support.constraint.n.k.f.a(eVar2, interfaceC0025b, new b.a(), b.a.k);
                }
                if (eVar2.z() != android.support.constraint.n.k.e.b.MATCH_CONSTRAINT || zA) {
                    if (!eVar2.L()) {
                        android.support.constraint.n.k.d dVar6 = eVar2.G;
                        if (next == dVar6 && eVar2.I.f == null) {
                            int iC = dVar6.c() + iB;
                            eVar2.b(iC, eVar2.k() + iC);
                        } else {
                            android.support.constraint.n.k.d dVar7 = eVar2.I;
                            if (next == dVar7 && dVar7.f == null) {
                                int iC2 = iB - dVar7.c();
                                eVar2.b(iC2 - eVar2.k(), iC2);
                            } else if (next == eVar2.G && (dVar3 = eVar2.I.f) != null && dVar3.k()) {
                                a(interfaceC0025b, eVar2);
                            }
                        }
                        a(eVar2, interfaceC0025b);
                    }
                } else if (eVar2.z() == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && eVar2.u >= 0 && eVar2.t >= 0 && (eVar2.B() == 8 || (eVar2.o == 0 && eVar2.i() == 0.0f))) {
                    if (!eVar2.J() && !eVar2.K()) {
                        if (((next == eVar2.G && (dVar5 = eVar2.I.f) != null && dVar5.k()) || (next == eVar2.I && (dVar4 = eVar2.G.f) != null && dVar4.k())) && !eVar2.J()) {
                            a(eVar, interfaceC0025b, eVar2);
                        }
                    }
                }
            }
        }
        if (eVar instanceof android.support.constraint.n.k.g) {
            return;
        }
        if (dVarA2.a() != null && dVarA2.k()) {
            Iterator<android.support.constraint.n.k.d> it2 = dVarA2.a().iterator();
            while (it2.hasNext()) {
                android.support.constraint.n.k.d next2 = it2.next();
                android.support.constraint.n.k.e eVar3 = next2.d;
                boolean zA2 = a(eVar3);
                if (eVar3.L() && zA2) {
                    android.support.constraint.n.k.f.a(eVar3, interfaceC0025b, new b.a(), b.a.k);
                }
                boolean z = (next2 == eVar3.G && (dVar2 = eVar3.I.f) != null && dVar2.k()) || (next2 == eVar3.I && (dVar = eVar3.G.f) != null && dVar.k());
                if (eVar3.z() != android.support.constraint.n.k.e.b.MATCH_CONSTRAINT || zA2) {
                    if (!eVar3.L()) {
                        android.support.constraint.n.k.d dVar8 = eVar3.G;
                        if (next2 == dVar8 && eVar3.I.f == null) {
                            int iC3 = dVar8.c() + iB2;
                            eVar3.b(iC3, eVar3.k() + iC3);
                        } else {
                            android.support.constraint.n.k.d dVar9 = eVar3.I;
                            if (next2 == dVar9 && eVar3.G.f == null) {
                                int iC4 = iB2 - dVar9.c();
                                eVar3.b(iC4 - eVar3.k(), iC4);
                            } else if (z && !eVar3.J()) {
                                a(interfaceC0025b, eVar3);
                            }
                        }
                        a(eVar3, interfaceC0025b);
                    }
                } else if (eVar3.z() == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && eVar3.u >= 0 && eVar3.t >= 0 && (eVar3.B() == 8 || (eVar3.o == 0 && eVar3.i() == 0.0f))) {
                    if (!eVar3.J() && !eVar3.K() && z && !eVar3.J()) {
                        a(eVar, interfaceC0025b, eVar3);
                    }
                }
            }
        }
        android.support.constraint.n.k.d dVarA3 = eVar.a(android.support.constraint.n.k.d.b.BASELINE);
        if (dVarA3.a() == null || !dVarA3.k()) {
            return;
        }
        int iB3 = dVarA3.b();
        for (android.support.constraint.n.k.d dVar10 : dVarA3.a()) {
            android.support.constraint.n.k.e eVar4 = dVar10.d;
            boolean zA3 = a(eVar4);
            if (eVar4.L() && zA3) {
                android.support.constraint.n.k.f.a(eVar4, interfaceC0025b, new b.a(), b.a.k);
            }
            if (eVar4.z() != android.support.constraint.n.k.e.b.MATCH_CONSTRAINT || zA3) {
                if (!eVar4.L() && dVar10 == eVar4.J) {
                    eVar4.i(iB3);
                    a(eVar4, interfaceC0025b);
                }
            }
        }
    }

    private static void a(android.support.constraint.n.k.e eVar, b.InterfaceC0025b interfaceC0025b, android.support.constraint.n.k.e eVar2) {
        float fX = eVar2.x();
        int iB = eVar2.G.f.b() + eVar2.G.c();
        int iB2 = eVar2.I.f.b() - eVar2.I.c();
        if (iB2 >= iB) {
            int iK = eVar2.k();
            if (eVar2.B() != 8) {
                int i = eVar2.o;
                if (i == 2) {
                    if (!(eVar instanceof android.support.constraint.n.k.f)) {
                        eVar = eVar.v();
                    }
                    iK = (int) (fX * 0.5f * eVar.k());
                } else if (i == 0) {
                    iK = iB2 - iB;
                }
                iK = Math.max(eVar2.t, iK);
                int i2 = eVar2.u;
                if (i2 > 0) {
                    iK = Math.min(i2, iK);
                }
            }
            int i3 = iB + ((int) ((fX * ((iB2 - iB) - iK)) + 0.5f));
            eVar2.b(i3, iK + i3);
            a(eVar2, interfaceC0025b);
        }
    }

    private static void a(android.support.constraint.n.k.e eVar, b.InterfaceC0025b interfaceC0025b, android.support.constraint.n.k.e eVar2, boolean z) {
        float fL = eVar2.l();
        int iB = eVar2.F.f.b() + eVar2.F.c();
        int iB2 = eVar2.H.f.b() - eVar2.H.c();
        if (iB2 >= iB) {
            int iC = eVar2.C();
            if (eVar2.B() != 8) {
                int i = eVar2.n;
                if (i == 2) {
                    if (!(eVar instanceof android.support.constraint.n.k.f)) {
                        eVar = eVar.v();
                    }
                    iC = (int) (eVar2.l() * 0.5f * eVar.C());
                } else if (i == 0) {
                    iC = iB2 - iB;
                }
                iC = Math.max(eVar2.q, iC);
                int i2 = eVar2.r;
                if (i2 > 0) {
                    iC = Math.min(i2, iC);
                }
            }
            int i3 = iB + ((int) ((fL * ((iB2 - iB) - iC)) + 0.5f));
            eVar2.a(i3, iC + i3);
            a(eVar2, interfaceC0025b, z);
        }
    }

    private static void a(android.support.constraint.n.k.e eVar, b.InterfaceC0025b interfaceC0025b, boolean z) {
        android.support.constraint.n.k.d dVar;
        android.support.constraint.n.k.d dVar2;
        android.support.constraint.n.k.d dVar3;
        android.support.constraint.n.k.d dVar4;
        android.support.constraint.n.k.d dVar5;
        if (!(eVar instanceof android.support.constraint.n.k.f) && eVar.L() && a(eVar)) {
            android.support.constraint.n.k.f.a(eVar, interfaceC0025b, new b.a(), b.a.k);
        }
        android.support.constraint.n.k.d dVarA = eVar.a(android.support.constraint.n.k.d.b.LEFT);
        android.support.constraint.n.k.d dVarA2 = eVar.a(android.support.constraint.n.k.d.b.RIGHT);
        int iB = dVarA.b();
        int iB2 = dVarA2.b();
        if (dVarA.a() != null && dVarA.k()) {
            Iterator<android.support.constraint.n.k.d> it = dVarA.a().iterator();
            while (it.hasNext()) {
                android.support.constraint.n.k.d next = it.next();
                android.support.constraint.n.k.e eVar2 = next.d;
                boolean zA = a(eVar2);
                if (eVar2.L() && zA) {
                    android.support.constraint.n.k.f.a(eVar2, interfaceC0025b, new b.a(), b.a.k);
                }
                if (eVar2.n() != android.support.constraint.n.k.e.b.MATCH_CONSTRAINT || zA) {
                    if (!eVar2.L()) {
                        android.support.constraint.n.k.d dVar6 = eVar2.F;
                        if (next == dVar6 && eVar2.H.f == null) {
                            int iC = dVar6.c() + iB;
                            eVar2.a(iC, eVar2.C() + iC);
                        } else {
                            android.support.constraint.n.k.d dVar7 = eVar2.H;
                            if (next == dVar7 && eVar2.F.f == null) {
                                int iC2 = iB - dVar7.c();
                                eVar2.a(iC2 - eVar2.C(), iC2);
                            } else if (next == eVar2.F && (dVar3 = eVar2.H.f) != null && dVar3.k() && !eVar2.H()) {
                                a(interfaceC0025b, eVar2, z);
                            }
                        }
                        a(eVar2, interfaceC0025b, z);
                    }
                } else if (eVar2.n() == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && eVar2.r >= 0 && eVar2.q >= 0 && (eVar2.B() == 8 || (eVar2.n == 0 && eVar2.i() == 0.0f))) {
                    if (!eVar2.H() && !eVar2.K()) {
                        if (((next == eVar2.F && (dVar5 = eVar2.H.f) != null && dVar5.k()) || (next == eVar2.H && (dVar4 = eVar2.F.f) != null && dVar4.k())) && !eVar2.H()) {
                            a(eVar, interfaceC0025b, eVar2, z);
                        }
                    }
                }
            }
        }
        if ((eVar instanceof android.support.constraint.n.k.g) || dVarA2.a() == null || !dVarA2.k()) {
            return;
        }
        Iterator<android.support.constraint.n.k.d> it2 = dVarA2.a().iterator();
        while (it2.hasNext()) {
            android.support.constraint.n.k.d next2 = it2.next();
            android.support.constraint.n.k.e eVar3 = next2.d;
            boolean zA2 = a(eVar3);
            if (eVar3.L() && zA2) {
                android.support.constraint.n.k.f.a(eVar3, interfaceC0025b, new b.a(), b.a.k);
            }
            boolean z2 = (next2 == eVar3.F && (dVar2 = eVar3.H.f) != null && dVar2.k()) || (next2 == eVar3.H && (dVar = eVar3.F.f) != null && dVar.k());
            if (eVar3.n() != android.support.constraint.n.k.e.b.MATCH_CONSTRAINT || zA2) {
                if (!eVar3.L()) {
                    android.support.constraint.n.k.d dVar8 = eVar3.F;
                    if (next2 == dVar8 && eVar3.H.f == null) {
                        int iC3 = dVar8.c() + iB2;
                        eVar3.a(iC3, eVar3.C() + iC3);
                    } else {
                        android.support.constraint.n.k.d dVar9 = eVar3.H;
                        if (next2 == dVar9 && eVar3.F.f == null) {
                            int iC4 = iB2 - dVar9.c();
                            eVar3.a(iC4 - eVar3.C(), iC4);
                        } else if (z2 && !eVar3.H()) {
                            a(interfaceC0025b, eVar3, z);
                        }
                    }
                    a(eVar3, interfaceC0025b, z);
                }
            } else if (eVar3.n() == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && eVar3.r >= 0 && eVar3.q >= 0 && (eVar3.B() == 8 || (eVar3.n == 0 && eVar3.i() == 0.0f))) {
                if (!eVar3.H() && !eVar3.K() && z2 && !eVar3.H()) {
                    a(eVar, interfaceC0025b, eVar3, z);
                }
            }
        }
    }

    public static void a(android.support.constraint.n.k.f fVar, b.InterfaceC0025b interfaceC0025b) {
        int iV;
        int iV2;
        android.support.constraint.n.k.e.b bVarN = fVar.n();
        android.support.constraint.n.k.e.b bVarZ = fVar.z();
        fVar.Q();
        ArrayList<android.support.constraint.n.k.e> arrayListR = fVar.R();
        int size = arrayListR.size();
        for (int i = 0; i < size; i++) {
            arrayListR.get(i).Q();
        }
        boolean zA0 = fVar.a0();
        if (bVarN == android.support.constraint.n.k.e.b.FIXED) {
            fVar.a(0, fVar.C());
        } else {
            fVar.j(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            android.support.constraint.n.k.e eVar = arrayListR.get(i2);
            if (eVar instanceof android.support.constraint.n.k.g) {
                android.support.constraint.n.k.g gVar = (android.support.constraint.n.k.g) eVar;
                if (gVar.S() == 1) {
                    if (gVar.T() != -1) {
                        iV2 = gVar.T();
                    } else if (gVar.U() == -1 || !fVar.M()) {
                        if (fVar.M()) {
                            iV2 = (int) ((gVar.V() * fVar.C()) + 0.5f);
                        }
                        z = true;
                    } else {
                        iV2 = fVar.C() - gVar.U();
                    }
                    gVar.w(iV2);
                    z = true;
                }
            } else if ((eVar instanceof android.support.constraint.n.k.a) && ((android.support.constraint.n.k.a) eVar).V() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                android.support.constraint.n.k.e eVar2 = arrayListR.get(i3);
                if (eVar2 instanceof android.support.constraint.n.k.g) {
                    android.support.constraint.n.k.g gVar2 = (android.support.constraint.n.k.g) eVar2;
                    if (gVar2.S() == 1) {
                        a(gVar2, interfaceC0025b, zA0);
                    }
                }
            }
        }
        a(fVar, interfaceC0025b, zA0);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                android.support.constraint.n.k.e eVar3 = arrayListR.get(i4);
                if (eVar3 instanceof android.support.constraint.n.k.a) {
                    android.support.constraint.n.k.a aVar = (android.support.constraint.n.k.a) eVar3;
                    if (aVar.V() == 0) {
                        a(aVar, interfaceC0025b, 0, zA0);
                    }
                }
            }
        }
        if (bVarZ == android.support.constraint.n.k.e.b.FIXED) {
            fVar.b(0, fVar.k());
        } else {
            fVar.k(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            android.support.constraint.n.k.e eVar4 = arrayListR.get(i5);
            if (eVar4 instanceof android.support.constraint.n.k.g) {
                android.support.constraint.n.k.g gVar3 = (android.support.constraint.n.k.g) eVar4;
                if (gVar3.S() == 0) {
                    if (gVar3.T() != -1) {
                        iV = gVar3.T();
                    } else if (gVar3.U() == -1 || !fVar.N()) {
                        if (fVar.N()) {
                            iV = (int) ((gVar3.V() * fVar.k()) + 0.5f);
                        }
                        z3 = true;
                    } else {
                        iV = fVar.k() - gVar3.U();
                    }
                    gVar3.w(iV);
                    z3 = true;
                }
            } else if ((eVar4 instanceof android.support.constraint.n.k.a) && ((android.support.constraint.n.k.a) eVar4).V() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                android.support.constraint.n.k.e eVar5 = arrayListR.get(i6);
                if (eVar5 instanceof android.support.constraint.n.k.g) {
                    android.support.constraint.n.k.g gVar4 = (android.support.constraint.n.k.g) eVar5;
                    if (gVar4.S() == 0) {
                        a(gVar4, interfaceC0025b);
                    }
                }
            }
        }
        a((android.support.constraint.n.k.e) fVar, interfaceC0025b);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                android.support.constraint.n.k.e eVar6 = arrayListR.get(i7);
                if (eVar6 instanceof android.support.constraint.n.k.a) {
                    android.support.constraint.n.k.a aVar2 = (android.support.constraint.n.k.a) eVar6;
                    if (aVar2.V() == 1) {
                        a(aVar2, interfaceC0025b, 1, zA0);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            android.support.constraint.n.k.e eVar7 = arrayListR.get(i8);
            if (eVar7.L() && a(eVar7)) {
                android.support.constraint.n.k.f.a(eVar7, interfaceC0025b, f513a, b.a.k);
                a(eVar7, interfaceC0025b, zA0);
                a(eVar7, interfaceC0025b);
            }
        }
    }

    private static void a(b.InterfaceC0025b interfaceC0025b, android.support.constraint.n.k.e eVar) {
        float fX = eVar.x();
        int iB = eVar.G.f.b();
        int iB2 = eVar.I.f.b();
        int iC = eVar.G.c() + iB;
        int iC2 = iB2 - eVar.I.c();
        if (iB == iB2) {
            fX = 0.5f;
        } else {
            iB = iC;
            iB2 = iC2;
        }
        int iK = eVar.k();
        int i = (iB2 - iB) - iK;
        if (iB > iB2) {
            i = (iB - iB2) - iK;
        }
        int i2 = (int) ((fX * i) + 0.5f);
        int i3 = iB + i2;
        int i4 = i3 + iK;
        if (iB > iB2) {
            i3 = iB - i2;
            i4 = i3 - iK;
        }
        eVar.b(i3, i4);
        a(eVar, interfaceC0025b);
    }

    private static void a(b.InterfaceC0025b interfaceC0025b, android.support.constraint.n.k.e eVar, boolean z) {
        float fL = eVar.l();
        int iB = eVar.F.f.b();
        int iB2 = eVar.H.f.b();
        int iC = eVar.F.c() + iB;
        int iC2 = iB2 - eVar.H.c();
        if (iB == iB2) {
            fL = 0.5f;
        } else {
            iB = iC;
            iB2 = iC2;
        }
        int iC3 = eVar.C();
        int i = (iB2 - iB) - iC3;
        if (iB > iB2) {
            i = (iB - iB2) - iC3;
        }
        int i2 = ((int) ((fL * i) + 0.5f)) + iB;
        int i3 = i2 + iC3;
        if (iB > iB2) {
            i3 = i2 - iC3;
        }
        eVar.a(i2, i3);
        a(eVar, interfaceC0025b, z);
    }

    private static boolean a(android.support.constraint.n.k.e eVar) {
        android.support.constraint.n.k.e.b bVarN = eVar.n();
        android.support.constraint.n.k.e.b bVarZ = eVar.z();
        android.support.constraint.n.k.f fVar = eVar.v() != null ? (android.support.constraint.n.k.f) eVar.v() : null;
        if (fVar != null) {
            fVar.n();
            android.support.constraint.n.k.e.b bVar = android.support.constraint.n.k.e.b.FIXED;
        }
        if (fVar != null) {
            fVar.z();
            android.support.constraint.n.k.e.b bVar2 = android.support.constraint.n.k.e.b.FIXED;
        }
        boolean z = bVarN == android.support.constraint.n.k.e.b.FIXED || bVarN == android.support.constraint.n.k.e.b.WRAP_CONTENT || (bVarN == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && eVar.n == 0 && eVar.U == 0.0f && eVar.g(0)) || eVar.M();
        boolean z2 = bVarZ == android.support.constraint.n.k.e.b.FIXED || bVarZ == android.support.constraint.n.k.e.b.WRAP_CONTENT || (bVarZ == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && eVar.o == 0 && eVar.U == 0.0f && eVar.g(1)) || eVar.N();
        if (eVar.U <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }
}
