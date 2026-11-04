package android.support.constraint.n.k;

/* JADX INFO: loaded from: classes.dex */
public class g extends e {
    protected float p0 = -1.0f;
    protected int q0 = -1;
    protected int r0 = -1;
    private d s0 = this.G;
    private int t0 = 0;
    private boolean u0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f497a;

        static {
            int[] iArr = new int[d.b.values().length];
            f497a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f497a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f497a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f497a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f497a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f497a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f497a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f497a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f497a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.O.clear();
        this.O.add(this.s0);
        int length = this.N.length;
        for (int i = 0; i < length; i++) {
            this.N[i] = this.s0;
        }
    }

    @Override // android.support.constraint.n.k.e
    public boolean M() {
        return this.u0;
    }

    @Override // android.support.constraint.n.k.e
    public boolean N() {
        return this.u0;
    }

    public d R() {
        return this.s0;
    }

    public int S() {
        return this.t0;
    }

    public int T() {
        return this.q0;
    }

    public int U() {
        return this.r0;
    }

    public float V() {
        return this.p0;
    }

    @Override // android.support.constraint.n.k.e
    public d a(d.b bVar) {
        switch (a.f497a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.t0 == 1) {
                    return this.s0;
                }
                break;
            case 3:
            case 4:
                if (this.t0 == 0) {
                    return this.s0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }

    @Override // android.support.constraint.n.k.e
    public void a(android.support.constraint.n.d dVar, boolean z) {
        f fVar = (f) v();
        if (fVar == null) {
            return;
        }
        d dVarA = fVar.a(d.b.LEFT);
        d dVarA2 = fVar.a(d.b.RIGHT);
        e eVar = this.R;
        boolean z2 = eVar != null && eVar.Q[0] == e.b.WRAP_CONTENT;
        if (this.t0 == 0) {
            dVarA = fVar.a(d.b.TOP);
            dVarA2 = fVar.a(d.b.BOTTOM);
            e eVar2 = this.R;
            z2 = eVar2 != null && eVar2.Q[1] == e.b.WRAP_CONTENT;
        }
        if (this.u0 && this.s0.k()) {
            android.support.constraint.n.i iVarA = dVar.a(this.s0);
            dVar.a(iVarA, this.s0.b());
            if (this.q0 != -1) {
                if (z2) {
                    dVar.b(dVar.a(dVarA2), iVarA, 0, 5);
                }
            } else if (this.r0 != -1 && z2) {
                android.support.constraint.n.i iVarA2 = dVar.a(dVarA2);
                dVar.b(iVarA, dVar.a(dVarA), 0, 5);
                dVar.b(iVarA2, iVarA, 0, 5);
            }
            this.u0 = false;
            return;
        }
        if (this.q0 != -1) {
            android.support.constraint.n.i iVarA3 = dVar.a(this.s0);
            dVar.a(iVarA3, dVar.a(dVarA), this.q0, 8);
            if (z2) {
                dVar.b(dVar.a(dVarA2), iVarA3, 0, 5);
                return;
            }
            return;
        }
        if (this.r0 == -1) {
            if (this.p0 != -1.0f) {
                dVar.a(android.support.constraint.n.d.a(dVar, dVar.a(this.s0), dVar.a(dVarA2), this.p0));
                return;
            }
            return;
        }
        android.support.constraint.n.i iVarA4 = dVar.a(this.s0);
        android.support.constraint.n.i iVarA5 = dVar.a(dVarA2);
        dVar.a(iVarA4, iVarA5, -this.r0, 8);
        if (z2) {
            dVar.b(iVarA4, dVar.a(dVarA), 0, 5);
            dVar.b(iVarA5, iVarA4, 0, 5);
        }
    }

    @Override // android.support.constraint.n.k.e
    public void b(android.support.constraint.n.d dVar, boolean z) {
        if (v() == null) {
            return;
        }
        int iB = dVar.b(this.s0);
        if (this.t0 == 1) {
            u(iB);
            v(0);
            l(v().k());
            t(0);
            return;
        }
        u(0);
        v(iB);
        t(v().C());
        l(0);
    }

    @Override // android.support.constraint.n.k.e
    public boolean c() {
        return true;
    }

    public void e(float f) {
        if (f > -1.0f) {
            this.p0 = f;
            this.q0 = -1;
            this.r0 = -1;
        }
    }

    public void w(int i) {
        this.s0.a(i);
        this.u0 = true;
    }

    public void x(int i) {
        if (i > -1) {
            this.p0 = -1.0f;
            this.q0 = i;
            this.r0 = -1;
        }
    }

    public void y(int i) {
        if (i > -1) {
            this.p0 = -1.0f;
            this.q0 = -1;
            this.r0 = i;
        }
    }

    public void z(int i) {
        if (this.t0 == i) {
            return;
        }
        this.t0 = i;
        this.O.clear();
        this.s0 = this.t0 == 1 ? this.F : this.G;
        this.O.add(this.s0);
        int length = this.N.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.N[i2] = this.s0;
        }
    }
}
