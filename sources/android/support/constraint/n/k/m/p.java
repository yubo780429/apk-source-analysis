package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.support.constraint.n.k.e f523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    m f524c;
    protected android.support.constraint.n.k.e.b d;
    g e = new g(this);
    public int f = 0;
    boolean g = false;
    public f h = new f(this);
    public f i = new f(this);
    protected b j = b.NONE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f525a;

        static {
            int[] iArr = new int[android.support.constraint.n.k.d.b.values().length];
            f525a = iArr;
            try {
                iArr[android.support.constraint.n.k.d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f525a[android.support.constraint.n.k.d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f525a[android.support.constraint.n.k.d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f525a[android.support.constraint.n.k.d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f525a[android.support.constraint.n.k.d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(android.support.constraint.n.k.e eVar) {
        this.f523b = eVar;
    }

    private void b(int i, int i2) {
        g gVar;
        int iMin;
        int i3 = this.f522a;
        if (i3 != 0) {
            if (i3 == 1) {
                int iA = a(this.e.m, i);
                gVar = this.e;
                iMin = Math.min(iA, i2);
            } else if (i3 == 2) {
                android.support.constraint.n.k.e eVarV = this.f523b.v();
                if (eVarV == null) {
                    return;
                }
                p pVar = i == 0 ? eVarV.d : eVarV.e;
                if (!pVar.e.j) {
                    return;
                }
                android.support.constraint.n.k.e eVar = this.f523b;
                i2 = (int) ((pVar.e.g * (i == 0 ? eVar.s : eVar.v)) + 0.5f);
            } else {
                if (i3 != 3) {
                    return;
                }
                android.support.constraint.n.k.e eVar2 = this.f523b;
                l lVar = eVar2.d;
                android.support.constraint.n.k.e.b bVar = lVar.d;
                android.support.constraint.n.k.e.b bVar2 = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && lVar.f522a == 3) {
                    n nVar = eVar2.e;
                    if (nVar.d == bVar2 && nVar.f522a == 3) {
                        return;
                    }
                }
                android.support.constraint.n.k.e eVar3 = this.f523b;
                p pVar2 = i == 0 ? eVar3.e : eVar3.d;
                if (!pVar2.e.j) {
                    return;
                }
                float fI = this.f523b.i();
                iMin = i == 1 ? (int) ((pVar2.e.g / fI) + 0.5f) : (int) ((fI * pVar2.e.g) + 0.5f);
                gVar = this.e;
            }
            gVar.a(iMin);
            return;
        }
        this.e.a(a(i2, i));
    }

    protected final int a(int i, int i2) {
        int iMax;
        android.support.constraint.n.k.e eVar = this.f523b;
        if (i2 == 0) {
            int i3 = eVar.r;
            iMax = Math.max(eVar.q, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            int i4 = eVar.u;
            iMax = Math.max(eVar.t, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    protected final f a(android.support.constraint.n.k.d dVar) {
        p pVar;
        p pVar2;
        android.support.constraint.n.k.d dVar2 = dVar.f;
        if (dVar2 == null) {
            return null;
        }
        android.support.constraint.n.k.e eVar = dVar2.d;
        int i = a.f525a[dVar2.e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                pVar2 = eVar.d;
            } else if (i == 3) {
                pVar = eVar.e;
            } else {
                if (i == 4) {
                    return eVar.e.k;
                }
                if (i != 5) {
                    return null;
                }
                pVar2 = eVar.e;
            }
            return pVar2.i;
        }
        pVar = eVar.d;
        return pVar.h;
    }

    protected final f a(android.support.constraint.n.k.d dVar, int i) {
        android.support.constraint.n.k.d dVar2 = dVar.f;
        if (dVar2 == null) {
            return null;
        }
        android.support.constraint.n.k.e eVar = dVar2.d;
        p pVar = i == 0 ? eVar.d : eVar.e;
        int i2 = a.f525a[dVar.f.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return pVar.i;
        }
        return pVar.h;
    }

    abstract void a();

    @Override // android.support.constraint.n.k.m.d
    public void a(d dVar) {
    }

    protected void a(d dVar, android.support.constraint.n.k.d dVar2, android.support.constraint.n.k.d dVar3, int i) {
        f fVarA = a(dVar2);
        f fVarA2 = a(dVar3);
        if (fVarA.j && fVarA2.j) {
            int iC = fVarA.g + dVar2.c();
            int iC2 = fVarA2.g - dVar3.c();
            int i2 = iC2 - iC;
            if (!this.e.j && this.d == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) {
                b(i, i2);
            }
            g gVar = this.e;
            if (gVar.j) {
                if (gVar.g == i2) {
                    this.h.a(iC);
                    this.i.a(iC2);
                    return;
                }
                android.support.constraint.n.k.e eVar = this.f523b;
                float fL = i == 0 ? eVar.l() : eVar.x();
                if (fVarA == fVarA2) {
                    iC = fVarA.g;
                    iC2 = fVarA2.g;
                    fL = 0.5f;
                }
                this.h.a((int) (iC + 0.5f + (((iC2 - iC) - this.e.g) * fL)));
                this.i.a(this.h.g + this.e.g);
            }
        }
    }

    protected final void a(f fVar, f fVar2, int i) {
        fVar.l.add(fVar2);
        fVar.f = i;
        fVar2.k.add(fVar);
    }

    protected final void a(f fVar, f fVar2, int i, g gVar) {
        fVar.l.add(fVar2);
        fVar.l.add(this.e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    abstract void b();

    protected void b(d dVar) {
    }

    abstract void c();

    protected void c(d dVar) {
    }

    public long d() {
        g gVar = this.e;
        if (gVar.j) {
            return gVar.g;
        }
        return 0L;
    }

    public boolean e() {
        return this.g;
    }

    abstract boolean f();
}
