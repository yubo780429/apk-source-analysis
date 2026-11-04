package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
public class n extends p {
    public f k;
    g l;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f518a;

        static {
            int[] iArr = new int[p.b.values().length];
            f518a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f518a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f518a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(android.support.constraint.n.k.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.k = fVar;
        this.l = null;
        this.h.e = f.a.TOP;
        this.i.e = f.a.BOTTOM;
        fVar.e = f.a.BASELINE;
        this.f = 1;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x03fb A[PHI: r0
  0x03fb: PHI (r0v39 android.support.constraint.n.k.m.l) = (r0v28 android.support.constraint.n.k.m.l), (r0v55 android.support.constraint.n.k.m.l) binds: [B:152:0x03f9, B:126:0x034e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ed, code lost:
    
        if (r9.f523b.F() != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02ef, code lost:
    
        r0 = r9.k;
        r1 = r9.h;
        r2 = r9.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0380, code lost:
    
        if (r9.f523b.F() != false) goto L112;
     */
    @Override // android.support.constraint.n.k.m.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a() {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.n.k.m.n.a():void");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    @Override // android.support.constraint.n.k.m.p, android.support.constraint.n.k.m.d
    public void a(d dVar) {
        int i;
        float fI;
        int i2 = a.f518a[this.j.ordinal()];
        if (i2 == 1) {
            c(dVar);
        } else if (i2 == 2) {
            b(dVar);
        } else if (i2 == 3) {
            android.support.constraint.n.k.e eVar = this.f523b;
            a(dVar, eVar.G, eVar.I, 1);
            return;
        }
        g gVar = this.e;
        if (gVar.f510c && !gVar.j && this.d == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) {
            android.support.constraint.n.k.e eVar2 = this.f523b;
            int i3 = eVar2.o;
            if (i3 == 2) {
                android.support.constraint.n.k.e eVarV = eVar2.v();
                if (eVarV != null) {
                    g gVar2 = eVarV.e.e;
                    if (gVar2.j) {
                        i = (int) ((gVar2.g * this.f523b.v) + 0.5f);
                        this.e.a(i);
                    }
                }
            } else if (i3 == 3 && eVar2.d.e.j) {
                int iJ = eVar2.j();
                if (iJ == -1) {
                    android.support.constraint.n.k.e eVar3 = this.f523b;
                    fI = eVar3.d.e.g / eVar3.i();
                    i = (int) (fI + 0.5f);
                } else if (iJ == 0) {
                    android.support.constraint.n.k.e eVar4 = this.f523b;
                    fI = eVar4.d.e.g * eVar4.i();
                    i = (int) (fI + 0.5f);
                } else if (iJ != 1) {
                    i = 0;
                } else {
                    android.support.constraint.n.k.e eVar5 = this.f523b;
                    fI = eVar5.d.e.g / eVar5.i();
                    i = (int) (fI + 0.5f);
                }
                this.e.a(i);
            }
        }
        f fVar = this.h;
        if (fVar.f510c) {
            f fVar2 = this.i;
            if (fVar2.f510c) {
                if (fVar.j && fVar2.j && this.e.j) {
                    return;
                }
                if (!this.e.j && this.d == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) {
                    android.support.constraint.n.k.e eVar6 = this.f523b;
                    if (eVar6.n == 0 && !eVar6.J()) {
                        f fVar3 = this.h.l.get(0);
                        f fVar4 = this.i.l.get(0);
                        int i4 = fVar3.g;
                        f fVar5 = this.h;
                        int i5 = i4 + fVar5.f;
                        int i6 = fVar4.g + this.i.f;
                        fVar5.a(i5);
                        this.i.a(i6);
                        this.e.a(i6 - i5);
                        return;
                    }
                }
                if (!this.e.j && this.d == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT && this.f522a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    f fVar6 = this.h.l.get(0);
                    int i7 = (this.i.l.get(0).g + this.i.f) - (fVar6.g + this.h.f);
                    g gVar3 = this.e;
                    int i8 = gVar3.m;
                    if (i7 < i8) {
                        gVar3.a(i7);
                    } else {
                        gVar3.a(i8);
                    }
                }
                if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    f fVar7 = this.h.l.get(0);
                    f fVar8 = this.i.l.get(0);
                    int i9 = fVar7.g + this.h.f;
                    int i10 = fVar8.g + this.i.f;
                    float fX = this.f523b.x();
                    if (fVar7 == fVar8) {
                        i9 = fVar7.g;
                        i10 = fVar8.g;
                        fX = 0.5f;
                    }
                    this.h.a((int) (i9 + 0.5f + (((i10 - i9) - this.e.g) * fX)));
                    this.i.a(this.h.g + this.e.g);
                }
            }
        }
    }

    @Override // android.support.constraint.n.k.m.p
    public void b() {
        f fVar = this.h;
        if (fVar.j) {
            this.f523b.v(fVar.g);
        }
    }

    @Override // android.support.constraint.n.k.m.p
    void c() {
        this.f524c = null;
        this.h.a();
        this.i.a();
        this.k.a();
        this.e.a();
        this.g = false;
    }

    @Override // android.support.constraint.n.k.m.p
    boolean f() {
        return this.d != android.support.constraint.n.k.e.b.MATCH_CONSTRAINT || this.f523b.o == 0;
    }

    void g() {
        this.g = false;
        this.h.a();
        this.h.j = false;
        this.i.a();
        this.i.j = false;
        this.k.a();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f523b.h();
    }
}
