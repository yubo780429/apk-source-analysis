package android.support.constraint.n.k;

/* JADX INFO: loaded from: classes.dex */
public class a extends i {
    private int r0 = 0;
    private boolean s0 = true;
    private int t0 = 0;
    boolean u0 = false;

    @Override // android.support.constraint.n.k.e
    public boolean M() {
        return this.u0;
    }

    @Override // android.support.constraint.n.k.e
    public boolean N() {
        return this.u0;
    }

    public boolean R() {
        int i;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.q0;
            if (i4 >= i) {
                break;
            }
            e eVar = this.p0[i4];
            if ((this.s0 || eVar.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && !eVar.M()) || (((i3 = this.r0) == 2 || i3 == 3) && !eVar.N()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.q0; i5++) {
            e eVar2 = this.p0[i5];
            if (this.s0 || eVar2.c()) {
                if (!z2) {
                    int i6 = this.r0;
                    if (i6 == 0) {
                        bVar3 = d.b.LEFT;
                    } else if (i6 == 1) {
                        bVar3 = d.b.RIGHT;
                    } else if (i6 == 2) {
                        bVar3 = d.b.TOP;
                    } else {
                        if (i6 == 3) {
                            bVar3 = d.b.BOTTOM;
                        }
                        z2 = true;
                    }
                    iMax = eVar2.a(bVar3).b();
                    z2 = true;
                }
                int i7 = this.r0;
                if (i7 == 0) {
                    bVar2 = d.b.LEFT;
                } else {
                    if (i7 == 1) {
                        bVar = d.b.RIGHT;
                    } else if (i7 == 2) {
                        bVar2 = d.b.TOP;
                    } else if (i7 == 3) {
                        bVar = d.b.BOTTOM;
                    }
                    iMax = Math.max(iMax, eVar2.a(bVar).b());
                }
                iMax = Math.min(iMax, eVar2.a(bVar2).b());
            }
        }
        int i8 = iMax + this.t0;
        int i9 = this.r0;
        if (i9 == 0 || i9 == 1) {
            a(i8, i8);
        } else {
            b(i8, i8);
        }
        this.u0 = true;
        return true;
    }

    public boolean S() {
        return this.s0;
    }

    public int T() {
        return this.r0;
    }

    public int U() {
        return this.t0;
    }

    public int V() {
        int i = this.r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    protected void W() {
        for (int i = 0; i < this.q0; i++) {
            e eVar = this.p0[i];
            int i2 = this.r0;
            if (i2 == 0 || i2 == 1) {
                eVar.a(0, true);
            } else if (i2 == 2 || i2 == 3) {
                eVar.a(1, true);
            }
        }
    }

    @Override // android.support.constraint.n.k.e
    public void a(android.support.constraint.n.d dVar, boolean z) {
        d[] dVarArr;
        boolean z2;
        android.support.constraint.n.i iVar;
        d dVar2;
        int i;
        int i2;
        android.support.constraint.n.i iVar2;
        int i3;
        d[] dVarArr2 = this.N;
        dVarArr2[0] = this.F;
        dVarArr2[2] = this.G;
        dVarArr2[1] = this.H;
        dVarArr2[3] = this.I;
        int i4 = 0;
        while (true) {
            dVarArr = this.N;
            if (i4 >= dVarArr.length) {
                break;
            }
            dVarArr[i4].i = dVar.a(dVarArr[i4]);
            i4++;
        }
        int i5 = this.r0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i5];
        if (!this.u0) {
            R();
        }
        if (this.u0) {
            this.u0 = false;
            int i6 = this.r0;
            if (i6 == 0 || i6 == 1) {
                dVar.a(this.F.i, this.W);
                iVar2 = this.H.i;
                i3 = this.W;
            } else {
                if (i6 != 2 && i6 != 3) {
                    return;
                }
                dVar.a(this.G.i, this.X);
                iVar2 = this.I.i;
                i3 = this.X;
            }
            dVar.a(iVar2, i3);
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.q0) {
                z2 = false;
                break;
            }
            e eVar = this.p0[i7];
            if ((this.s0 || eVar.c()) && ((((i = this.r0) == 0 || i == 1) && eVar.n() == e.b.MATCH_CONSTRAINT && eVar.F.f != null && eVar.H.f != null) || (((i2 = this.r0) == 2 || i2 == 3) && eVar.z() == e.b.MATCH_CONSTRAINT && eVar.G.f != null && eVar.I.f != null))) {
                z2 = true;
                break;
            }
            i7++;
        }
        boolean z3 = this.F.i() || this.H.i();
        boolean z4 = this.G.i() || this.I.i();
        int i8 = !z2 && ((this.r0 == 0 && z3) || ((this.r0 == 2 && z4) || ((this.r0 == 1 && z3) || (this.r0 == 3 && z4)))) ? 5 : 4;
        for (int i9 = 0; i9 < this.q0; i9++) {
            e eVar2 = this.p0[i9];
            if (this.s0 || eVar2.c()) {
                android.support.constraint.n.i iVarA = dVar.a(eVar2.N[this.r0]);
                d[] dVarArr3 = eVar2.N;
                int i10 = this.r0;
                dVarArr3[i10].i = iVarA;
                int i11 = (dVarArr3[i10].f == null || dVarArr3[i10].f.d != this) ? 0 : dVarArr3[i10].g + 0;
                int i12 = this.r0;
                if (i12 == 0 || i12 == 2) {
                    dVar.b(dVar3.i, iVarA, this.t0 - i11, z2);
                } else {
                    dVar.a(dVar3.i, iVarA, this.t0 + i11, z2);
                }
                dVar.a(dVar3.i, iVarA, this.t0 + i11, i8);
            }
        }
        int i13 = this.r0;
        if (i13 == 0) {
            dVar.a(this.H.i, this.F.i, 0, 8);
            dVar.a(this.F.i, this.R.H.i, 0, 4);
            iVar = this.F.i;
            dVar2 = this.R.F;
        } else if (i13 == 1) {
            dVar.a(this.F.i, this.H.i, 0, 8);
            dVar.a(this.F.i, this.R.F.i, 0, 4);
            iVar = this.F.i;
            dVar2 = this.R.H;
        } else if (i13 == 2) {
            dVar.a(this.I.i, this.G.i, 0, 8);
            dVar.a(this.G.i, this.R.I.i, 0, 4);
            iVar = this.G.i;
            dVar2 = this.R.G;
        } else {
            if (i13 != 3) {
                return;
            }
            dVar.a(this.G.i, this.I.i, 0, 8);
            dVar.a(this.G.i, this.R.G.i, 0, 4);
            iVar = this.G.i;
            dVar2 = this.R.I;
        }
        dVar.a(iVar, dVar2.i, 0, 0);
    }

    @Override // android.support.constraint.n.k.e
    public boolean c() {
        return true;
    }

    public void e(boolean z) {
        this.s0 = z;
    }

    @Override // android.support.constraint.n.k.e
    public String toString() {
        String str = "[Barrier] " + h() + " {";
        for (int i = 0; i < this.q0; i++) {
            e eVar = this.p0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + eVar.h();
        }
        return str + "}";
    }

    public void x(int i) {
        this.r0 = i;
    }

    public void y(int i) {
        this.t0 = i;
    }
}
