package android.support.constraint.n.k;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f483c;
    protected e d;
    protected e e;
    protected e f;
    protected e g;
    protected ArrayList<e> h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    int l;
    int m;
    int n;
    private int o;
    private boolean p;
    protected boolean q;
    protected boolean r;
    protected boolean s;
    private boolean t;

    public c(e eVar, int i, boolean z) {
        this.p = false;
        this.f481a = eVar;
        this.o = i;
        this.p = z;
    }

    private static boolean a(e eVar, int i) {
        if (eVar.B() != 8 && eVar.Q[i] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.p;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        int i = this.o * 2;
        e eVar = this.f481a;
        boolean z = false;
        e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            e[] eVarArr = eVar.l0;
            int i2 = this.o;
            e eVar3 = null;
            eVarArr[i2] = null;
            eVar.k0[i2] = null;
            if (eVar.B() != 8) {
                this.l++;
                if (eVar.b(this.o) != e.b.MATCH_CONSTRAINT) {
                    this.m += eVar.c(this.o);
                }
                int iC = this.m + eVar.N[i].c();
                this.m = iC;
                int i3 = i + 1;
                this.m = iC + eVar.N[i3].c();
                int iC2 = this.n + eVar.N[i].c();
                this.n = iC2;
                this.n = iC2 + eVar.N[i3].c();
                if (this.f482b == null) {
                    this.f482b = eVar;
                }
                this.d = eVar;
                e.b[] bVarArr = eVar.Q;
                int i4 = this.o;
                if (bVarArr[i4] == e.b.MATCH_CONSTRAINT) {
                    int[] iArr = eVar.p;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.j++;
                        float[] fArr = eVar.j0;
                        int i5 = this.o;
                        float f = fArr[i5];
                        if (f > 0.0f) {
                            this.k += fArr[i5];
                        }
                        if (a(eVar, this.o)) {
                            if (f < 0.0f) {
                                this.q = true;
                            } else {
                                this.r = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(eVar);
                        }
                        if (this.f == null) {
                            this.f = eVar;
                        }
                        e eVar4 = this.g;
                        if (eVar4 != null) {
                            eVar4.k0[this.o] = eVar;
                        }
                        this.g = eVar;
                    }
                    if (this.o == 0) {
                        if (eVar.n == 0 && eVar.q == 0) {
                            int i6 = eVar.r;
                        }
                    } else if (eVar.o == 0 && eVar.t == 0) {
                        int i7 = eVar.u;
                    }
                    int i8 = (eVar.U > 0.0f ? 1 : (eVar.U == 0.0f ? 0 : -1));
                }
            }
            if (eVar2 != eVar) {
                eVar2.l0[this.o] = eVar;
            }
            d dVar = eVar.N[i + 1].f;
            if (dVar != null) {
                e eVar5 = dVar.d;
                d[] dVarArr = eVar5.N;
                if (dVarArr[i].f != null && dVarArr[i].f.d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f482b;
        if (eVar6 != null) {
            this.m -= eVar6.N[i].c();
        }
        e eVar7 = this.d;
        if (eVar7 != null) {
            this.m -= eVar7.N[i + 1].c();
        }
        this.f483c = eVar;
        if (this.o == 0 && this.p) {
            this.e = eVar;
        } else {
            this.e = this.f481a;
        }
        if (this.r && this.q) {
            z = true;
        }
        this.s = z;
    }

    public void a() {
        if (!this.t) {
            b();
        }
        this.t = true;
    }
}
