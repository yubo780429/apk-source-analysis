package android.support.constraint.n.k.m;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<android.support.constraint.n.k.e> f499a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f500b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.support.constraint.n.k.f f501c;

    public static class a {
        public static int k = 0;
        public static int l = 1;
        public static int m = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.support.constraint.n.k.e.b f502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public android.support.constraint.n.k.e.b f503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f504c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* JADX INFO: renamed from: android.support.constraint.n.k.m.b$b, reason: collision with other inner class name */
    public interface InterfaceC0025b {
        void a();

        void a(android.support.constraint.n.k.e eVar, a aVar);
    }

    public b(android.support.constraint.n.k.f fVar) {
        this.f501c = fVar;
    }

    private void a(android.support.constraint.n.k.f fVar, String str, int i, int i2) {
        int iU = fVar.u();
        int iT = fVar.t();
        fVar.q(0);
        fVar.p(0);
        fVar.t(i);
        fVar.l(i2);
        fVar.q(iU);
        fVar.p(iT);
        this.f501c.S();
    }

    private boolean a(InterfaceC0025b interfaceC0025b, android.support.constraint.n.k.e eVar, int i) {
        this.f500b.f502a = eVar.n();
        this.f500b.f503b = eVar.z();
        this.f500b.f504c = eVar.C();
        this.f500b.d = eVar.k();
        a aVar = this.f500b;
        aVar.i = false;
        aVar.j = i;
        boolean z = aVar.f502a == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
        boolean z2 = this.f500b.f503b == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
        boolean z3 = z && eVar.U > 0.0f;
        boolean z4 = z2 && eVar.U > 0.0f;
        if (z3 && eVar.p[0] == 4) {
            this.f500b.f502a = android.support.constraint.n.k.e.b.FIXED;
        }
        if (z4 && eVar.p[1] == 4) {
            this.f500b.f503b = android.support.constraint.n.k.e.b.FIXED;
        }
        interfaceC0025b.a(eVar, this.f500b);
        eVar.t(this.f500b.e);
        eVar.l(this.f500b.f);
        eVar.a(this.f500b.h);
        eVar.h(this.f500b.g);
        a aVar2 = this.f500b;
        aVar2.j = a.k;
        return aVar2.i;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x009e A[PHI: r9
  0x009e: PHI (r9v3 boolean) = (r9v2 boolean), (r9v2 boolean), (r9v2 boolean), (r9v5 boolean), (r9v5 boolean) binds: [B:32:0x0062, B:34:0x0068, B:36:0x006c, B:57:0x009b, B:55:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    private void b(android.support.constraint.n.k.f fVar) {
        boolean z;
        l lVar;
        n nVar;
        int size = fVar.p0.size();
        boolean zW = fVar.w(64);
        InterfaceC0025b interfaceC0025bU = fVar.U();
        for (int i = 0; i < size; i++) {
            android.support.constraint.n.k.e eVar = fVar.p0.get(i);
            if (!(eVar instanceof android.support.constraint.n.k.g) && !(eVar instanceof android.support.constraint.n.k.a) && !eVar.K() && (!zW || (lVar = eVar.d) == null || (nVar = eVar.e) == null || !lVar.e.j || !nVar.e.j)) {
                android.support.constraint.n.k.e.b bVarB = eVar.b(0);
                android.support.constraint.n.k.e.b bVarB2 = eVar.b(1);
                android.support.constraint.n.k.e.b bVar = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
                boolean z2 = bVarB == bVar && eVar.n != 1 && bVarB2 == bVar && eVar.o != 1;
                if (!z2 && fVar.w(1) && !(eVar instanceof android.support.constraint.n.k.k)) {
                    android.support.constraint.n.k.e.b bVar2 = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
                    if (bVarB == bVar2 && eVar.n == 0 && bVarB2 != bVar2 && !eVar.H()) {
                        z2 = true;
                    }
                    android.support.constraint.n.k.e.b bVar3 = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
                    if (bVarB2 == bVar3 && eVar.o == 0 && bVarB != bVar3 && !eVar.H()) {
                        z2 = true;
                    }
                    android.support.constraint.n.k.e.b bVar4 = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
                    z = (!(bVarB == bVar4 || bVarB2 == bVar4) || eVar.U <= 0.0f) ? z2 : true;
                }
                if (!z) {
                    a(interfaceC0025bU, eVar, a.k);
                    android.support.constraint.n.e eVar2 = fVar.u0;
                    if (eVar2 != null) {
                        eVar2.f466a++;
                    }
                }
            }
        }
        interfaceC0025bU.a();
    }

    public long a(android.support.constraint.n.k.f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zA;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        boolean z3;
        int i12;
        InterfaceC0025b interfaceC0025b;
        boolean z4;
        android.support.constraint.n.e eVar;
        InterfaceC0025b interfaceC0025bU = fVar.U();
        int size = fVar.p0.size();
        int iC = fVar.C();
        int iK = fVar.k();
        boolean zA2 = android.support.constraint.n.k.j.a(i, 128);
        boolean z5 = zA2 || android.support.constraint.n.k.j.a(i, 64);
        if (z5) {
            for (int i13 = 0; i13 < size; i13++) {
                android.support.constraint.n.k.e eVar2 = fVar.p0.get(i13);
                boolean z6 = (eVar2.n() == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) && (eVar2.z() == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) && eVar2.i() > 0.0f;
                if ((eVar2.H() && z6) || ((eVar2.J() && z6) || (eVar2 instanceof android.support.constraint.n.k.k) || eVar2.H() || eVar2.J())) {
                    z5 = false;
                    break;
                }
            }
        }
        if (z5 && (eVar = android.support.constraint.n.d.x) != null) {
            eVar.f468c++;
        }
        boolean z7 = z5 & ((i4 == 1073741824 && i6 == 1073741824) || zA2);
        int i14 = 2;
        if (z7) {
            int iMin = Math.min(fVar.s(), i5);
            int iMin2 = Math.min(fVar.r(), i7);
            if (i4 == 1073741824 && fVar.C() != iMin) {
                fVar.t(iMin);
                fVar.X();
            }
            if (i6 == 1073741824 && fVar.k() != iMin2) {
                fVar.l(iMin2);
                fVar.X();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                zA = fVar.e(zA2);
                i10 = 2;
            } else {
                boolean zF = fVar.f(zA2);
                if (i4 == 1073741824) {
                    zF &= fVar.a(zA2, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    zA = fVar.a(zA2, 1) & zF;
                    i10++;
                } else {
                    zA = zF;
                }
            }
            if (zA) {
                fVar.a(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            zA = false;
            i10 = 0;
        }
        if (zA && i10 == 2) {
            return 0L;
        }
        int iV = fVar.V();
        if (size > 0) {
            b(fVar);
        }
        a(fVar);
        int size2 = this.f499a.size();
        if (size > 0) {
            a(fVar, "First pass", iC, iK);
        }
        if (size2 > 0) {
            boolean z8 = fVar.n() == android.support.constraint.n.k.e.b.WRAP_CONTENT;
            boolean z9 = fVar.z() == android.support.constraint.n.k.e.b.WRAP_CONTENT;
            int iMax = Math.max(fVar.C(), this.f501c.u());
            int iMax2 = Math.max(fVar.k(), this.f501c.t());
            int i15 = 0;
            boolean zS = false;
            while (i15 < size2) {
                android.support.constraint.n.k.e eVar3 = this.f499a.get(i15);
                if (eVar3 instanceof android.support.constraint.n.k.k) {
                    int iC2 = eVar3.C();
                    int iK2 = eVar3.k();
                    boolean zA3 = a(interfaceC0025bU, eVar3, a.l) | zS;
                    android.support.constraint.n.e eVar4 = fVar.u0;
                    if (eVar4 != null) {
                        eVar4.f467b++;
                    }
                    int iC3 = eVar3.C();
                    int iK3 = eVar3.k();
                    if (iC3 != iC2) {
                        eVar3.t(iC3);
                        if (z8 && eVar3.w() > iMax) {
                            iMax = Math.max(iMax, eVar3.w() + eVar3.a(android.support.constraint.n.k.d.b.RIGHT).c());
                        }
                        z4 = true;
                    }
                    if (iK3 != iK2) {
                        z4 = zA3;
                        eVar3.l(iK3);
                        if (z9 && eVar3.f() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar3.f() + eVar3.a(android.support.constraint.n.k.d.b.BOTTOM).c());
                        }
                        z4 = true;
                    }
                    z4 = zA3;
                    zS = z4 | ((android.support.constraint.n.k.k) eVar3).S();
                }
                i15++;
                iV = iV;
                iC = iC;
                iK = iK;
                i14 = 2;
            }
            int i16 = iV;
            int i17 = iC;
            int i18 = iK;
            int i19 = i14;
            int i20 = 0;
            while (i20 < i19) {
                int i21 = 0;
                while (i21 < size2) {
                    android.support.constraint.n.k.e eVar5 = this.f499a.get(i21);
                    if (((eVar5 instanceof android.support.constraint.n.k.h) && !(eVar5 instanceof android.support.constraint.n.k.k)) || (eVar5 instanceof android.support.constraint.n.k.g) || eVar5.B() == 8 || ((z7 && eVar5.d.e.j && eVar5.e.e.j) || (eVar5 instanceof android.support.constraint.n.k.k))) {
                        z3 = z7;
                        i12 = size2;
                        interfaceC0025b = interfaceC0025bU;
                    } else {
                        int iC4 = eVar5.C();
                        int iK4 = eVar5.k();
                        int iE = eVar5.e();
                        int i22 = a.l;
                        z3 = z7;
                        if (i20 == 1) {
                            i22 = a.m;
                        }
                        boolean zA4 = a(interfaceC0025bU, eVar5, i22) | zS;
                        android.support.constraint.n.e eVar6 = fVar.u0;
                        i12 = size2;
                        interfaceC0025b = interfaceC0025bU;
                        if (eVar6 != null) {
                            eVar6.f467b++;
                        }
                        int iC5 = eVar5.C();
                        int iK5 = eVar5.k();
                        if (iC5 != iC4) {
                            eVar5.t(iC5);
                            if (z8 && eVar5.w() > iMax) {
                                iMax = Math.max(iMax, eVar5.w() + eVar5.a(android.support.constraint.n.k.d.b.RIGHT).c());
                            }
                            zA4 = true;
                        }
                        if (iK5 != iK4) {
                            eVar5.l(iK5);
                            if (z9 && eVar5.f() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar5.f() + eVar5.a(android.support.constraint.n.k.d.b.BOTTOM).c());
                            }
                            zA4 = true;
                        }
                        zS = (!eVar5.F() || iE == eVar5.e()) ? zA4 : true;
                    }
                    i21++;
                    size2 = i12;
                    interfaceC0025bU = interfaceC0025b;
                    z7 = z3;
                }
                boolean z10 = z7;
                int i23 = size2;
                InterfaceC0025b interfaceC0025b2 = interfaceC0025bU;
                if (!zS) {
                    break;
                }
                a(fVar, "intermediate pass", i17, i18);
                i20++;
                interfaceC0025bU = interfaceC0025b2;
                z7 = z10;
                i19 = 2;
                zS = false;
                size2 = i23;
            }
            if (zS) {
                a(fVar, "2nd pass", i17, i18);
                if (fVar.C() < iMax) {
                    fVar.t(iMax);
                    z = true;
                } else {
                    z = false;
                }
                if (fVar.k() < iMax2) {
                    fVar.l(iMax2);
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    a(fVar, "3rd pass", i17, i18);
                }
            }
            i11 = i16;
        } else {
            i11 = iV;
        }
        fVar.x(i11);
        return 0L;
    }

    public void a(android.support.constraint.n.k.f fVar) {
        this.f499a.clear();
        int size = fVar.p0.size();
        for (int i = 0; i < size; i++) {
            android.support.constraint.n.k.e eVar = fVar.p0.get(i);
            if (eVar.n() == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT || eVar.z() == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) {
                this.f499a.add(eVar);
            }
        }
        fVar.X();
    }
}
