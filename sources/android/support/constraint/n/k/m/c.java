package android.support.constraint.n.k.m;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c extends p {
    ArrayList<p> k;
    private int l;

    public c(android.support.constraint.n.k.e eVar, int i) {
        super(eVar);
        this.k = new ArrayList<>();
        this.f = i;
        g();
    }

    private void g() {
        android.support.constraint.n.k.e eVar;
        android.support.constraint.n.k.e eVarE = this.f523b;
        do {
            eVar = eVarE;
            eVarE = eVarE.e(this.f);
        } while (eVarE != null);
        this.f523b = eVar;
        this.k.add(eVar.f(this.f));
        android.support.constraint.n.k.e eVarD = eVar.d(this.f);
        while (eVarD != null) {
            this.k.add(eVarD.f(this.f));
            eVarD = eVarD.d(this.f);
        }
        for (p pVar : this.k) {
            int i = this.f;
            if (i == 0) {
                pVar.f523b.f491b = this;
            } else if (i == 1) {
                pVar.f523b.f492c = this;
            }
        }
        if ((this.f == 0 && ((android.support.constraint.n.k.f) this.f523b.v()).a0()) && this.k.size() > 1) {
            ArrayList<p> arrayList = this.k;
            this.f523b = arrayList.get(arrayList.size() - 1).f523b;
        }
        this.l = this.f == 0 ? this.f523b.m() : this.f523b.y();
    }

    private android.support.constraint.n.k.e h() {
        for (int i = 0; i < this.k.size(); i++) {
            p pVar = this.k.get(i);
            if (pVar.f523b.B() != 8) {
                return pVar.f523b;
            }
        }
        return null;
    }

    private android.support.constraint.n.k.e i() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            p pVar = this.k.get(size);
            if (pVar.f523b.B() != 8) {
                return pVar.f523b;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a5 A[PHI: r0 r1
  0x00a5: PHI (r0v13 int) = (r0v10 int), (r0v19 int) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r1v3 android.support.constraint.n.k.m.f) = (r1v2 android.support.constraint.n.k.m.f), (r1v7 android.support.constraint.n.k.m.f) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.support.constraint.n.k.m.p
    void a() {
        f fVarA;
        int iC;
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        int size = this.k.size();
        if (size < 1) {
            return;
        }
        android.support.constraint.n.k.e eVar = this.k.get(0).f523b;
        android.support.constraint.n.k.e eVar2 = this.k.get(size - 1).f523b;
        if (this.f == 0) {
            android.support.constraint.n.k.d dVar = eVar.F;
            android.support.constraint.n.k.d dVar2 = eVar2.H;
            f fVarA2 = a(dVar, 0);
            int iC2 = dVar.c();
            android.support.constraint.n.k.e eVarH = h();
            if (eVarH != null) {
                iC2 = eVarH.F.c();
            }
            if (fVarA2 != null) {
                a(this.h, fVarA2, iC2);
            }
            fVarA = a(dVar2, 0);
            iC = dVar2.c();
            android.support.constraint.n.k.e eVarI = i();
            if (eVarI != null) {
                iC = eVarI.H.c();
            }
            if (fVarA != null) {
                a(this.i, fVarA, -iC);
            }
        } else {
            android.support.constraint.n.k.d dVar3 = eVar.G;
            android.support.constraint.n.k.d dVar4 = eVar2.I;
            f fVarA3 = a(dVar3, 1);
            int iC3 = dVar3.c();
            android.support.constraint.n.k.e eVarH2 = h();
            if (eVarH2 != null) {
                iC3 = eVarH2.G.c();
            }
            if (fVarA3 != null) {
                a(this.h, fVarA3, iC3);
            }
            fVarA = a(dVar4, 1);
            iC = dVar4.c();
            android.support.constraint.n.k.e eVarI2 = i();
            if (eVarI2 != null) {
                iC = eVarI2.I.c();
            }
            if (fVarA != null) {
                a(this.i, fVarA, -iC);
            }
        }
        this.h.f508a = this;
        this.i.f508a = this;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01c1 A[PHI: r7 r19 r20 r21
  0x01c1: PHI (r7v59 int) = (r7v57 int), (r7v65 int) binds: [B:116:0x01bf, B:107:0x0197] A[DONT_GENERATE, DONT_INLINE]
  0x01c1: PHI (r19v3 float) = (r19v2 float), (r19v5 float) binds: [B:116:0x01bf, B:107:0x0197] A[DONT_GENERATE, DONT_INLINE]
  0x01c1: PHI (r20v5 int) = (r20v4 int), (r20v7 int) binds: [B:116:0x01bf, B:107:0x0197] A[DONT_GENERATE, DONT_INLINE]
  0x01c1: PHI (r21v6 int) = (r21v5 int), (r21v8 int) binds: [B:116:0x01bf, B:107:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.support.constraint.n.k.m.p, android.support.constraint.n.k.m.d
    public void a(d dVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        float f2;
        int i10;
        int iMax;
        if (this.h.j && this.i.j) {
            android.support.constraint.n.k.e eVarV = this.f523b.v();
            boolean zA0 = (eVarV == null || !(eVarV instanceof android.support.constraint.n.k.f)) ? false : ((android.support.constraint.n.k.f) eVarV).a0();
            int i11 = this.i.g - this.h.g;
            int size = this.k.size();
            int i12 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i12 >= size) {
                    i12 = -1;
                    break;
                } else if (this.k.get(i12).f523b.B() != 8) {
                    break;
                } else {
                    i12++;
                }
            }
            int i13 = size - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                if (this.k.get(i14).f523b.B() != 8) {
                    i = i14;
                    break;
                }
            }
            int i15 = 0;
            while (true) {
                if (i15 >= 2) {
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    f = 0.0f;
                    break;
                }
                int i16 = 0;
                i4 = 0;
                i5 = 0;
                int i17 = 0;
                f = 0.0f;
                while (i16 < size) {
                    p pVar = this.k.get(i16);
                    if (pVar.f523b.B() != i2) {
                        i17++;
                        if (i16 > 0 && i16 >= i12) {
                            i4 += pVar.h.f;
                        }
                        int i18 = pVar.e.g;
                        boolean z = pVar.d != android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
                        if (!z) {
                            if (pVar.f522a == 1 && i15 == 0) {
                                i18 = pVar.e.m;
                                i5++;
                            } else if (pVar.e.j) {
                            }
                            z = true;
                        } else {
                            if (this.f == 0 && !pVar.f523b.d.e.j) {
                                return;
                            }
                            if (this.f == 1 && !pVar.f523b.e.e.j) {
                                return;
                            }
                        }
                        if (z) {
                            i4 += i18;
                        } else {
                            i5++;
                            float f3 = pVar.f523b.j0[this.f];
                            if (f3 >= 0.0f) {
                                f += f3;
                            }
                        }
                        if (i16 < i13 && i16 < i) {
                            i4 += -pVar.i.f;
                        }
                    }
                    i16++;
                    i2 = 8;
                }
                if (i4 < i11 || i5 == 0) {
                    i3 = i17;
                    break;
                } else {
                    i15++;
                    i2 = 8;
                }
            }
            int i19 = this.h.g;
            if (zA0) {
                i19 = this.i.g;
            }
            if (i4 > i11) {
                int i20 = (int) (((i4 - i11) / 2.0f) + 0.5f);
                i19 = zA0 ? i19 + i20 : i19 - i20;
            }
            if (i5 > 0) {
                float f4 = i11 - i4;
                int i21 = (int) ((f4 / i5) + 0.5f);
                int i22 = 0;
                int i23 = 0;
                while (i22 < size) {
                    p pVar2 = this.k.get(i22);
                    int i24 = i21;
                    if (pVar2.f523b.B() == 8 || pVar2.d != android.support.constraint.n.k.e.b.MATCH_CONSTRAINT || pVar2.e.j) {
                        i9 = i19;
                        f2 = f4;
                        i10 = i4;
                    } else {
                        int i25 = f > 0.0f ? (int) (((pVar2.f523b.j0[this.f] * f4) / f) + 0.5f) : i24;
                        if (this.f == 0) {
                            android.support.constraint.n.k.e eVar = pVar2.f523b;
                            f2 = f4;
                            int i26 = eVar.r;
                            i10 = i4;
                            i9 = i19;
                            iMax = Math.max(eVar.q, pVar2.f522a == 1 ? Math.min(i25, pVar2.e.m) : i25);
                            if (i26 > 0) {
                                iMax = Math.min(i26, iMax);
                            }
                            if (iMax != i25) {
                                i23++;
                                i25 = iMax;
                            }
                        } else {
                            i9 = i19;
                            f2 = f4;
                            i10 = i4;
                            android.support.constraint.n.k.e eVar2 = pVar2.f523b;
                            int i27 = eVar2.u;
                            iMax = Math.max(eVar2.t, pVar2.f522a == 1 ? Math.min(i25, pVar2.e.m) : i25);
                            if (i27 > 0) {
                                iMax = Math.min(i27, iMax);
                            }
                            if (iMax != i25) {
                                i23++;
                                i25 = iMax;
                            }
                        }
                        pVar2.e.a(i25);
                    }
                    i22++;
                    i21 = i24;
                    f4 = f2;
                    i4 = i10;
                    i19 = i9;
                }
                i6 = i19;
                int i28 = i4;
                if (i23 > 0) {
                    i5 -= i23;
                    int i29 = 0;
                    for (int i30 = 0; i30 < size; i30++) {
                        p pVar3 = this.k.get(i30);
                        if (pVar3.f523b.B() != 8) {
                            if (i30 > 0 && i30 >= i12) {
                                i29 += pVar3.h.f;
                            }
                            i29 += pVar3.e.g;
                            if (i30 < i13 && i30 < i) {
                                i29 += -pVar3.i.f;
                            }
                        }
                    }
                    i4 = i29;
                } else {
                    i4 = i28;
                }
                i8 = 2;
                if (this.l == 2 && i23 == 0) {
                    i7 = 0;
                    this.l = 0;
                } else {
                    i7 = 0;
                }
            } else {
                i6 = i19;
                i7 = 0;
                i8 = 2;
            }
            if (i4 > i11) {
                this.l = i8;
            }
            if (i3 > 0 && i5 == 0 && i12 == i) {
                this.l = i8;
            }
            int i31 = this.l;
            if (i31 == 1) {
                int i32 = i3 > 1 ? (i11 - i4) / (i3 - 1) : i3 == 1 ? (i11 - i4) / 2 : i7;
                if (i5 > 0) {
                    i32 = i7;
                }
                int i33 = i6;
                for (int i34 = i7; i34 < size; i34++) {
                    p pVar4 = this.k.get(zA0 ? size - (i34 + 1) : i34);
                    if (pVar4.f523b.B() == 8) {
                        pVar4.h.a(i33);
                        pVar4.i.a(i33);
                    } else {
                        if (i34 > 0) {
                            i33 = zA0 ? i33 - i32 : i33 + i32;
                        }
                        if (i34 > 0 && i34 >= i12) {
                            int i35 = pVar4.h.f;
                            i33 = zA0 ? i33 - i35 : i33 + i35;
                        }
                        (zA0 ? pVar4.i : pVar4.h).a(i33);
                        g gVar = pVar4.e;
                        int i36 = gVar.g;
                        if (pVar4.d == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && pVar4.f522a == 1) {
                            i36 = gVar.m;
                        }
                        i33 = zA0 ? i33 - i36 : i33 + i36;
                        (zA0 ? pVar4.h : pVar4.i).a(i33);
                        pVar4.g = true;
                        if (i34 < i13 && i34 < i) {
                            int i37 = -pVar4.i.f;
                            i33 = zA0 ? i33 - i37 : i33 + i37;
                        }
                    }
                }
                return;
            }
            if (i31 == 0) {
                int i38 = (i11 - i4) / (i3 + 1);
                if (i5 > 0) {
                    i38 = i7;
                }
                int i39 = i6;
                for (int i40 = i7; i40 < size; i40++) {
                    p pVar5 = this.k.get(zA0 ? size - (i40 + 1) : i40);
                    if (pVar5.f523b.B() == 8) {
                        pVar5.h.a(i39);
                        pVar5.i.a(i39);
                    } else {
                        int i41 = zA0 ? i39 - i38 : i39 + i38;
                        if (i40 > 0 && i40 >= i12) {
                            int i42 = pVar5.h.f;
                            i41 = zA0 ? i41 - i42 : i41 + i42;
                        }
                        (zA0 ? pVar5.i : pVar5.h).a(i41);
                        g gVar2 = pVar5.e;
                        int iMin = gVar2.g;
                        if (pVar5.d == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && pVar5.f522a == 1) {
                            iMin = Math.min(iMin, gVar2.m);
                        }
                        i39 = zA0 ? i41 - iMin : i41 + iMin;
                        (zA0 ? pVar5.h : pVar5.i).a(i39);
                        if (i40 < i13 && i40 < i) {
                            int i43 = -pVar5.i.f;
                            i39 = zA0 ? i39 - i43 : i39 + i43;
                        }
                    }
                }
                return;
            }
            if (i31 == 2) {
                float fL = this.f == 0 ? this.f523b.l() : this.f523b.x();
                if (zA0) {
                    fL = 1.0f - fL;
                }
                int i44 = (int) (((i11 - i4) * fL) + 0.5f);
                if (i44 < 0 || i5 > 0) {
                    i44 = i7;
                }
                int i45 = zA0 ? i6 - i44 : i6 + i44;
                for (int i46 = i7; i46 < size; i46++) {
                    p pVar6 = this.k.get(zA0 ? size - (i46 + 1) : i46);
                    if (pVar6.f523b.B() == 8) {
                        pVar6.h.a(i45);
                        pVar6.i.a(i45);
                    } else {
                        if (i46 > 0 && i46 >= i12) {
                            int i47 = pVar6.h.f;
                            i45 = zA0 ? i45 - i47 : i45 + i47;
                        }
                        (zA0 ? pVar6.i : pVar6.h).a(i45);
                        g gVar3 = pVar6.e;
                        int i48 = gVar3.g;
                        if (pVar6.d == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && pVar6.f522a == 1) {
                            i48 = gVar3.m;
                        }
                        i45 = zA0 ? i45 - i48 : i45 + i48;
                        (zA0 ? pVar6.h : pVar6.i).a(i45);
                        if (i46 < i13 && i46 < i) {
                            int i49 = -pVar6.i.f;
                            i45 = zA0 ? i45 - i49 : i45 + i49;
                        }
                    }
                }
            }
        }
    }

    @Override // android.support.constraint.n.k.m.p
    public void b() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).b();
        }
    }

    @Override // android.support.constraint.n.k.m.p
    void c() {
        this.f524c = null;
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // android.support.constraint.n.k.m.p
    public long d() {
        int size = this.k.size();
        long jD = 0;
        for (int i = 0; i < size; i++) {
            p pVar = this.k.get(i);
            jD = jD + ((long) pVar.h.f) + pVar.d() + ((long) pVar.i.f);
        }
        return jD;
    }

    @Override // android.support.constraint.n.k.m.p
    boolean f() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).f()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        String string = sb.toString();
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + it.next()) + "> ";
        }
        return string;
    }
}
