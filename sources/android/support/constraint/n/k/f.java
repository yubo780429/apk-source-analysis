package android.support.constraint.n.k;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class f extends l {
    public android.support.constraint.n.e u0;
    int w0;
    int x0;
    android.support.constraint.n.k.m.b q0 = new android.support.constraint.n.k.m.b(this);
    public android.support.constraint.n.k.m.e r0 = new android.support.constraint.n.k.m.e(this);
    protected android.support.constraint.n.k.m.b.InterfaceC0025b s0 = null;
    private boolean t0 = false;
    protected android.support.constraint.n.d v0 = new android.support.constraint.n.d();
    public int y0 = 0;
    public int z0 = 0;
    c[] A0 = new c[4];
    c[] B0 = new c[4];
    private int C0 = 257;
    private boolean D0 = false;
    private boolean E0 = false;
    private WeakReference<d> F0 = null;
    private WeakReference<d> G0 = null;
    private WeakReference<d> H0 = null;
    private WeakReference<d> I0 = null;
    public android.support.constraint.n.k.m.b.a J0 = new android.support.constraint.n.k.m.b.a();

    private void a(d dVar, android.support.constraint.n.i iVar) {
        this.v0.b(iVar, this.v0.a(dVar), 0, 5);
    }

    public static boolean a(e eVar, android.support.constraint.n.k.m.b.InterfaceC0025b interfaceC0025b, android.support.constraint.n.k.m.b.a aVar, int i) {
        int i2;
        int i3;
        if (interfaceC0025b == null) {
            return false;
        }
        aVar.f502a = eVar.n();
        aVar.f503b = eVar.z();
        aVar.f504c = eVar.C();
        aVar.d = eVar.k();
        aVar.i = false;
        aVar.j = i;
        boolean z = aVar.f502a == e.b.MATCH_CONSTRAINT;
        boolean z2 = aVar.f503b == e.b.MATCH_CONSTRAINT;
        boolean z3 = z && eVar.U > 0.0f;
        boolean z4 = z2 && eVar.U > 0.0f;
        if (z && eVar.g(0) && eVar.n == 0 && !z3) {
            aVar.f502a = e.b.WRAP_CONTENT;
            if (z2 && eVar.o == 0) {
                aVar.f502a = e.b.FIXED;
            }
            z = false;
        }
        if (z2 && eVar.g(1) && eVar.o == 0 && !z4) {
            aVar.f503b = e.b.WRAP_CONTENT;
            if (z && eVar.n == 0) {
                aVar.f503b = e.b.FIXED;
            }
            z2 = false;
        }
        if (eVar.M()) {
            aVar.f502a = e.b.FIXED;
            z = false;
        }
        if (eVar.N()) {
            aVar.f503b = e.b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (eVar.p[0] == 4) {
                aVar.f502a = e.b.FIXED;
            } else if (!z2) {
                if (aVar.f503b == e.b.FIXED) {
                    i3 = aVar.d;
                } else {
                    aVar.f502a = e.b.WRAP_CONTENT;
                    interfaceC0025b.a(eVar, aVar);
                    i3 = aVar.f;
                }
                aVar.f502a = e.b.FIXED;
                int i4 = eVar.V;
                aVar.f504c = (int) ((i4 == 0 || i4 == -1) ? eVar.i() * i3 : eVar.i() / i3);
            }
        }
        if (z4) {
            if (eVar.p[1] == 4) {
                aVar.f503b = e.b.FIXED;
            } else if (!z) {
                if (aVar.f502a == e.b.FIXED) {
                    i2 = aVar.f504c;
                } else {
                    aVar.f503b = e.b.WRAP_CONTENT;
                    interfaceC0025b.a(eVar, aVar);
                    i2 = aVar.e;
                }
                aVar.f503b = e.b.FIXED;
                int i5 = eVar.V;
                aVar.d = (int) ((i5 == 0 || i5 == -1) ? i2 / eVar.i() : i2 * eVar.i());
            }
        }
        interfaceC0025b.a(eVar, aVar);
        eVar.t(aVar.e);
        eVar.l(aVar.f);
        eVar.a(aVar.h);
        eVar.h(aVar.g);
        aVar.j = android.support.constraint.n.k.m.b.a.k;
        return aVar.i;
    }

    private void b(d dVar, android.support.constraint.n.i iVar) {
        this.v0.b(this.v0.a(dVar), iVar, 0, 5);
    }

    private void d(e eVar) {
        int i = this.y0 + 1;
        c[] cVarArr = this.B0;
        if (i >= cVarArr.length) {
            this.B0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.B0[this.y0] = new c(eVar, 0, a0());
        this.y0++;
    }

    private void d0() {
        this.y0 = 0;
        this.z0 = 0;
    }

    private void e(e eVar) {
        int i = this.z0 + 1;
        c[] cVarArr = this.A0;
        if (i >= cVarArr.length) {
            this.A0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.A0[this.z0] = new c(eVar, 1, a0());
        this.z0++;
    }

    @Override // android.support.constraint.n.k.l, android.support.constraint.n.k.e
    public void P() {
        this.v0.f();
        this.w0 = 0;
        this.x0 = 0;
        super.P();
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0314 A[PHI: r0 r13
  0x0314: PHI (r0v20 ??) = (r0v19 ??), (r0v22 ??), (r0v22 ??), (r0v22 ??) binds: [B:144:0x02d6, B:152:0x02fc, B:153:0x02fe, B:155:0x0304] A[DONT_GENERATE, DONT_INLINE]
  0x0314: PHI (r13v9 boolean) = (r13v8 boolean), (r13v11 boolean), (r13v11 boolean), (r13v11 boolean) binds: [B:144:0x02d6, B:152:0x02fc, B:153:0x02fe, B:155:0x0304] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    @Override // android.support.constraint.n.k.l
    public void S() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        ?? r6;
        boolean z4;
        ?? r0;
        ?? r14;
        boolean z5;
        boolean z6;
        e.b bVar;
        int i3 = 0;
        this.W = 0;
        this.X = 0;
        this.D0 = false;
        this.E0 = false;
        int size = this.p0.size();
        int iMax = Math.max(0, C());
        int iMax2 = Math.max(0, k());
        e.b[] bVarArr = this.Q;
        e.b bVar2 = bVarArr[1];
        e.b bVar3 = bVarArr[0];
        android.support.constraint.n.e eVar = this.u0;
        if (eVar != null) {
            eVar.z++;
        }
        if (j.a(this.C0, 1)) {
            android.support.constraint.n.k.m.h.a(this, U());
            for (int i4 = 0; i4 < size; i4++) {
                e eVar2 = this.p0.get(i4);
                if (eVar2.L() && !(eVar2 instanceof g) && !(eVar2 instanceof a) && !(eVar2 instanceof k) && !eVar2.K()) {
                    e.b bVarB = eVar2.b(0);
                    e.b bVarB2 = eVar2.b(1);
                    e.b bVar4 = e.b.MATCH_CONSTRAINT;
                    if (!(bVarB == bVar4 && eVar2.n != 1 && bVarB2 == bVar4 && eVar2.o != 1)) {
                        a(eVar2, this.s0, new android.support.constraint.n.k.m.b.a(), android.support.constraint.n.k.m.b.a.k);
                    }
                }
            }
        }
        if (size <= 2 || !((bVar3 == (bVar = e.b.WRAP_CONTENT) || bVar2 == bVar) && j.a(this.C0, 1024) && android.support.constraint.n.k.m.i.a(this, U()))) {
            i = iMax2;
            i2 = iMax;
            z = false;
        } else {
            if (bVar3 == e.b.WRAP_CONTENT) {
                if (iMax >= C() || iMax <= 0) {
                    iMax = C();
                } else {
                    t(iMax);
                    this.D0 = true;
                }
            }
            if (bVar2 == e.b.WRAP_CONTENT) {
                if (iMax2 >= k() || iMax2 <= 0) {
                    iMax2 = k();
                } else {
                    l(iMax2);
                    this.E0 = true;
                }
            }
            i = iMax2;
            i2 = iMax;
            z = true;
        }
        boolean z7 = w(64) || w(128);
        android.support.constraint.n.d dVar = this.v0;
        dVar.h = false;
        dVar.i = false;
        if (this.C0 != 0 && z7) {
            dVar.i = true;
        }
        ArrayList<e> arrayList = this.p0;
        boolean z8 = n() == e.b.WRAP_CONTENT || z() == e.b.WRAP_CONTENT;
        d0();
        for (int i5 = 0; i5 < size; i5++) {
            e eVar3 = this.p0.get(i5);
            if (eVar3 instanceof l) {
                ((l) eVar3).S();
            }
        }
        boolean zW = w(64);
        boolean z9 = z;
        int i6 = 0;
        ?? B = 1;
        while (B != 0) {
            int i7 = i6 + 1;
            try {
                this.v0.f();
                d0();
                a(this.v0);
                for (int i8 = i3; i8 < size; i8++) {
                    this.p0.get(i8).a(this.v0);
                }
                B = b(this.v0);
                if (this.F0 != null && this.F0.get() != null) {
                    b(this.F0.get(), this.v0.a(this.G));
                    this.F0 = null;
                }
                if (this.H0 != null && this.H0.get() != null) {
                    a(this.H0.get(), this.v0.a(this.I));
                    this.H0 = null;
                }
                if (this.G0 != null && this.G0.get() != null) {
                    b(this.G0.get(), this.v0.a(this.F));
                    this.G0 = null;
                }
                if (this.I0 != null && this.I0.get() != null) {
                    a(this.I0.get(), this.v0.a(this.H));
                    this.I0 = null;
                }
                if (B != 0) {
                    this.v0.e();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("EXCEPTION : " + e);
            }
            android.support.constraint.n.d dVar2 = this.v0;
            if (B != 0) {
                a(dVar2, j.f498a);
            } else {
                b(dVar2, zW);
                for (int i9 = 0; i9 < size; i9++) {
                    this.p0.get(i9).b(this.v0, zW);
                }
            }
            if (z8 && i7 < 8 && j.f498a[2]) {
                int iMax3 = 0;
                int iMax4 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    e eVar4 = this.p0.get(i10);
                    iMax3 = Math.max(iMax3, eVar4.W + eVar4.C());
                    iMax4 = Math.max(iMax4, eVar4.X + eVar4.k());
                }
                int iMax5 = Math.max(this.Z, iMax3);
                int iMax6 = Math.max(this.a0, iMax4);
                if (bVar3 != e.b.WRAP_CONTENT || C() >= iMax5) {
                    z5 = false;
                    z6 = z9;
                } else {
                    t(iMax5);
                    this.Q[0] = e.b.WRAP_CONTENT;
                    z5 = true;
                    z6 = true;
                }
                z2 = z5;
                z3 = z6;
                if (bVar2 == e.b.WRAP_CONTENT && k() < iMax6) {
                    z2 = z5;
                    z3 = z6;
                    l(iMax6);
                    this.Q[1] = e.b.WRAP_CONTENT;
                    z2 = true;
                    z3 = true;
                }
            } else {
                z2 = false;
                z3 = z9;
            }
            z2 = z5;
            z3 = z6;
            int iMax7 = Math.max(this.Z, C());
            boolean z10 = z2;
            boolean z11 = z3;
            if (iMax7 > C()) {
                t(iMax7);
                this.Q[0] = e.b.FIXED;
                z10 = true;
                z11 = true;
            }
            int iMax8 = Math.max(this.a0, k());
            if (iMax8 > k()) {
                l(iMax8);
                r6 = 1;
                this.Q[1] = e.b.FIXED;
                r0 = 1;
                z4 = true;
            } else {
                r6 = 1;
            }
            if (z4) {
                r0 = z10;
                z4 = z11;
                r14 = r0;
            } else {
                r0 = z10;
                z4 = z11;
                if (this.Q[0] == e.b.WRAP_CONTENT && i2 > 0) {
                    r0 = r0;
                    z4 = z4;
                    if (C() > i2) {
                        this.D0 = r6;
                        this.Q[0] = e.b.FIXED;
                        t(i2);
                        ?? r1 = r6;
                        z4 = r1 == true ? 1 : 0;
                        r0 = r1;
                    }
                }
                r0 = r0;
                r0 = r0;
                z4 = z4;
                z4 = z4;
                if (this.Q[r6] != e.b.WRAP_CONTENT || i <= 0 || k() <= i) {
                    r0 = z10;
                    z4 = z11;
                    r14 = r0;
                } else {
                    this.E0 = r6;
                    this.Q[r6] = e.b.FIXED;
                    l(i);
                    z4 = true;
                    r14 = 1;
                }
            }
            i6 = i7;
            i3 = 0;
            z9 = z4;
            B = r14;
        }
        this.p0 = arrayList;
        if (z9) {
            e.b[] bVarArr2 = this.Q;
            bVarArr2[0] = bVar3;
            bVarArr2[1] = bVar2;
        }
        a(this.v0.d());
    }

    public android.support.constraint.n.k.m.b.InterfaceC0025b U() {
        return this.s0;
    }

    public int V() {
        return this.C0;
    }

    public android.support.constraint.n.d W() {
        return this.v0;
    }

    public void X() {
        this.r0.b();
    }

    public void Y() {
        this.r0.c();
    }

    public boolean Z() {
        return this.E0;
    }

    public long a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.w0 = i8;
        this.x0 = i9;
        return this.q0.a(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public void a(android.support.constraint.n.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zW = w(64);
        b(dVar, zW);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            this.p0.get(i).b(dVar, zW);
        }
    }

    public void a(d dVar) {
        WeakReference<d> weakReference = this.I0;
        if (weakReference == null || weakReference.get() == null || dVar.b() > this.I0.get().b()) {
            this.I0 = new WeakReference<>(dVar);
        }
    }

    void a(e eVar, int i) {
        if (i == 0) {
            d(eVar);
        } else if (i == 1) {
            e(eVar);
        }
    }

    public void a(android.support.constraint.n.k.m.b.InterfaceC0025b interfaceC0025b) {
        this.s0 = interfaceC0025b;
        this.r0.a(interfaceC0025b);
    }

    @Override // android.support.constraint.n.k.e
    public void a(boolean z, boolean z2) {
        super.a(z, z2);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            this.p0.get(i).a(z, z2);
        }
    }

    public boolean a(boolean z, int i) {
        return this.r0.a(z, i);
    }

    public boolean a0() {
        return this.t0;
    }

    public void b(d dVar) {
        WeakReference<d> weakReference = this.G0;
        if (weakReference == null || weakReference.get() == null || dVar.b() > this.G0.get().b()) {
            this.G0 = new WeakReference<>(dVar);
        }
    }

    public boolean b(android.support.constraint.n.d dVar) {
        boolean zW = w(64);
        a(dVar, zW);
        int size = this.p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            e eVar = this.p0.get(i);
            eVar.a(0, false);
            eVar.a(1, false);
            if (eVar instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                e eVar2 = this.p0.get(i2);
                if (eVar2 instanceof a) {
                    ((a) eVar2).W();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            e eVar3 = this.p0.get(i3);
            if (eVar3.b()) {
                eVar3.a(dVar, zW);
            }
        }
        if (android.support.constraint.n.d.r) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar4 = this.p0.get(i4);
                if (!eVar4.b()) {
                    hashSet.add(eVar4);
                }
            }
            a(this, dVar, hashSet, n() == e.b.WRAP_CONTENT ? 0 : 1, false);
            for (e eVar5 : hashSet) {
                j.a(this, dVar, eVar5);
                eVar5.a(dVar, zW);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                e eVar6 = this.p0.get(i5);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.Q;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    if (bVar == e.b.WRAP_CONTENT) {
                        eVar6.a(e.b.FIXED);
                    }
                    if (bVar2 == e.b.WRAP_CONTENT) {
                        eVar6.b(e.b.FIXED);
                    }
                    eVar6.a(dVar, zW);
                    if (bVar == e.b.WRAP_CONTENT) {
                        eVar6.a(bVar);
                    }
                    if (bVar2 == e.b.WRAP_CONTENT) {
                        eVar6.b(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar6);
                    if (!eVar6.b()) {
                        eVar6.a(dVar, zW);
                    }
                }
            }
        }
        if (this.y0 > 0) {
            b.a(this, dVar, null, 0);
        }
        if (this.z0 > 0) {
            b.a(this, dVar, null, 1);
        }
        return true;
    }

    public boolean b0() {
        return this.D0;
    }

    void c(d dVar) {
        WeakReference<d> weakReference = this.H0;
        if (weakReference == null || weakReference.get() == null || dVar.b() > this.H0.get().b()) {
            this.H0 = new WeakReference<>(dVar);
        }
    }

    public void c0() {
        this.q0.a(this);
    }

    void d(d dVar) {
        WeakReference<d> weakReference = this.F0;
        if (weakReference == null || weakReference.get() == null || dVar.b() > this.F0.get().b()) {
            this.F0 = new WeakReference<>(dVar);
        }
    }

    public boolean e(boolean z) {
        return this.r0.a(z);
    }

    public boolean f(boolean z) {
        return this.r0.b(z);
    }

    public void g(boolean z) {
        this.t0 = z;
    }

    public boolean w(int i) {
        return (this.C0 & i) == i;
    }

    public void x(int i) {
        this.C0 = i;
        android.support.constraint.n.d.r = w(512);
    }
}
