package android.support.constraint.n.k.m;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l extends p {
    private static int[] k = new int[2];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f514a;

        static {
            int[] iArr = new int[p.b.values().length];
            f514a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f514a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f514a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(android.support.constraint.n.k.e eVar) {
        super(eVar);
        this.h.e = f.a.LEFT;
        this.i.e = f.a.RIGHT;
        this.f = 0;
    }

    private void a(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else {
            if (i6 > i6 || i9 > i7) {
                return;
            }
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0350  */
    /* JADX WARN: Code duplicated, block: B:106:0x0358  */
    /* JADX WARN: Code duplicated, block: B:107:0x0368  */
    /* JADX WARN: Code duplicated, block: B:109:0x036e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0376  */
    /* JADX WARN: Code duplicated, block: B:112:0x038c  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01da  */
    /* JADX WARN: Code duplicated, block: B:76:0x01df  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x024d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0255  */
    /* JADX WARN: Code duplicated, block: B:84:0x026e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0275  */
    /* JADX WARN: Code duplicated, block: B:88:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:91:0x02cc  */
    @Override // android.support.constraint.n.k.m.p
    void a() {
        android.support.constraint.n.k.e eVarV;
        android.support.constraint.n.k.d[] dVarArr;
        android.support.constraint.n.k.e eVar;
        android.support.constraint.n.k.d[] dVarArr2;
        f fVarA;
        f fVar;
        f fVar2;
        f fVarA2;
        f fVar3;
        android.support.constraint.n.k.d dVar;
        android.support.constraint.n.k.e eVar2;
        int i;
        android.support.constraint.n.k.e eVarV2;
        List<d> list;
        d dVar2;
        f fVar4;
        f fVar5;
        f fVar6;
        int i2;
        android.support.constraint.n.k.e eVarV3;
        android.support.constraint.n.k.e eVar3 = this.f523b;
        if (eVar3.f490a) {
            this.e.a(eVar3.C());
        }
        if (!this.e.j) {
            android.support.constraint.n.k.e.b bVarN = this.f523b.n();
            this.d = bVarN;
            if (bVarN != android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) {
                if (bVarN == android.support.constraint.n.k.e.b.MATCH_PARENT && (((eVarV3 = this.f523b.v()) != null && eVarV3.n() == android.support.constraint.n.k.e.b.FIXED) || eVarV3.n() == android.support.constraint.n.k.e.b.MATCH_PARENT)) {
                    int iC = (eVarV3.C() - this.f523b.F.c()) - this.f523b.H.c();
                    a(this.h, eVarV3.d.h, this.f523b.F.c());
                    a(this.i, eVarV3.d.i, -this.f523b.H.c());
                    this.e.a(iC);
                    return;
                }
                if (this.d == android.support.constraint.n.k.e.b.FIXED) {
                    this.e.a(this.f523b.C());
                }
            }
        } else if (this.d == android.support.constraint.n.k.e.b.MATCH_PARENT && (((eVarV = this.f523b.v()) != null && eVarV.n() == android.support.constraint.n.k.e.b.FIXED) || eVarV.n() == android.support.constraint.n.k.e.b.MATCH_PARENT)) {
            a(this.h, eVarV.d.h, this.f523b.F.c());
            a(this.i, eVarV.d.i, -this.f523b.H.c());
            return;
        }
        int i3 = 1;
        if (!this.e.j) {
            if (this.d == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) {
                eVar2 = this.f523b;
                i = eVar2.n;
                if (i != 2) {
                    eVarV2 = eVar2.v();
                    if (eVarV2 != null) {
                        g gVar = eVarV2.e.e;
                        this.e.l.add(gVar);
                        gVar.k.add(this.e);
                        g gVar2 = this.e;
                        gVar2.f509b = true;
                        gVar2.k.add(this.h);
                        list = this.e.k;
                        dVar2 = this.i;
                        list.add(dVar2);
                    }
                } else if (i == 3) {
                    if (eVar2.o == 3) {
                        this.h.f508a = this;
                        this.i.f508a = this;
                        n nVar = eVar2.e;
                        nVar.h.f508a = this;
                        nVar.i.f508a = this;
                        this.e.f508a = this;
                        if (eVar2.J()) {
                            this.e.l.add(this.f523b.e.e);
                            this.f523b.e.e.k.add(this.e);
                            n nVar2 = this.f523b.e;
                            nVar2.e.f508a = this;
                            this.e.l.add(nVar2.h);
                            this.e.l.add(this.f523b.e.i);
                            this.f523b.e.h.k.add(this.e);
                            list = this.f523b.e.i.k;
                            dVar2 = this.e;
                        } else if (this.f523b.H()) {
                            this.f523b.e.e.l.add(this.e);
                            list = this.e.k;
                            dVar2 = this.f523b.e.e;
                        } else {
                            fVar4 = this.f523b.e.e;
                        }
                        list.add(dVar2);
                    } else {
                        g gVar3 = eVar2.e.e;
                        this.e.l.add(gVar3);
                        gVar3.k.add(this.e);
                        this.f523b.e.h.k.add(this.e);
                        this.f523b.e.i.k.add(this.e);
                        g gVar4 = this.e;
                        gVar4.f509b = true;
                        gVar4.k.add(this.h);
                        this.e.k.add(this.i);
                        this.h.l.add(this.e);
                        fVar4 = this.i;
                    }
                    list = fVar4.l;
                    dVar2 = this.e;
                    list.add(dVar2);
                }
            }
            android.support.constraint.n.k.e eVar4 = this.f523b;
            dVarArr = eVar4.N;
            if (dVarArr[0].f != null) {
            }
            eVar = this.f523b;
            dVarArr2 = eVar.N;
            if (dVarArr2[0].f != null) {
                if (dVarArr2[1].f == null) {
                    if (eVar instanceof android.support.constraint.n.k.h) {
                        return;
                    } else {
                        return;
                    }
                }
                fVarA = a(dVarArr2[1]);
                if (fVarA != null) {
                    return;
                }
                a(this.i, fVarA, -this.f523b.N[1].c());
                fVar = this.h;
                fVar2 = this.i;
                i3 = -1;
                a(fVar, fVar2, i3, this.e);
                return;
            }
            fVarA2 = a(dVarArr2[0]);
            if (fVarA2 != null) {
                return;
            } else {
                a(this.h, fVarA2, this.f523b.N[0].c());
            }
            fVar = this.i;
            fVar2 = this.h;
            a(fVar, fVar2, i3, this.e);
            return;
        }
        android.support.constraint.n.k.e eVar5 = this.f523b;
        if (eVar5.f490a) {
            android.support.constraint.n.k.d[] dVarArr3 = eVar5.N;
            if (dVarArr3[0].f == null || dVarArr3[1].f == null) {
                android.support.constraint.n.k.e eVar6 = this.f523b;
                android.support.constraint.n.k.d[] dVarArr4 = eVar6.N;
                if (dVarArr4[0].f == null) {
                    if (dVarArr4[1].f != null) {
                        f fVarA3 = a(dVarArr4[1]);
                        if (fVarA3 == null) {
                            return;
                        }
                        a(this.i, fVarA3, -this.f523b.N[1].c());
                        fVar5 = this.h;
                        fVar6 = this.i;
                        i2 = -this.e.g;
                    } else if ((eVar6 instanceof android.support.constraint.n.k.h) || eVar6.v() == null || this.f523b.a(android.support.constraint.n.k.d.b.CENTER).f != null) {
                        return;
                    } else {
                        a(this.h, this.f523b.v().d.h, this.f523b.D());
                    }
                    a(fVar5, fVar6, i2);
                    return;
                }
                f fVarA4 = a(dVarArr4[0]);
                if (fVarA4 == null) {
                    return;
                } else {
                    a(this.h, fVarA4, this.f523b.N[0].c());
                }
                fVar5 = this.i;
                fVar6 = this.h;
                i2 = this.e.g;
                a(fVar5, fVar6, i2);
                return;
            }
            if (!eVar5.H()) {
                f fVarA5 = a(this.f523b.N[0]);
                if (fVarA5 != null) {
                    a(this.h, fVarA5, this.f523b.N[0].c());
                }
                f fVarA6 = a(this.f523b.N[1]);
                if (fVarA6 != null) {
                    a(this.i, fVarA6, -this.f523b.N[1].c());
                }
                this.h.f509b = true;
                this.i.f509b = true;
                return;
            }
            this.h.f = this.f523b.N[0].c();
            fVar3 = this.i;
            dVar = this.f523b.N[1];
        } else {
            if (this.d == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT) {
                eVar2 = this.f523b;
                i = eVar2.n;
                if (i != 2) {
                    eVarV2 = eVar2.v();
                    if (eVarV2 != null) {
                        g gVar5 = eVarV2.e.e;
                        this.e.l.add(gVar5);
                        gVar5.k.add(this.e);
                        g gVar6 = this.e;
                        gVar6.f509b = true;
                        gVar6.k.add(this.h);
                        list = this.e.k;
                        dVar2 = this.i;
                        list.add(dVar2);
                    }
                } else if (i == 3) {
                    if (eVar2.o == 3) {
                        this.h.f508a = this;
                        this.i.f508a = this;
                        n nVar3 = eVar2.e;
                        nVar3.h.f508a = this;
                        nVar3.i.f508a = this;
                        this.e.f508a = this;
                        if (eVar2.J()) {
                            this.e.l.add(this.f523b.e.e);
                            this.f523b.e.e.k.add(this.e);
                            n nVar4 = this.f523b.e;
                            nVar4.e.f508a = this;
                            this.e.l.add(nVar4.h);
                            this.e.l.add(this.f523b.e.i);
                            this.f523b.e.h.k.add(this.e);
                            list = this.f523b.e.i.k;
                            dVar2 = this.e;
                        } else if (this.f523b.H()) {
                            this.f523b.e.e.l.add(this.e);
                            list = this.e.k;
                            dVar2 = this.f523b.e.e;
                        } else {
                            fVar4 = this.f523b.e.e;
                        }
                        list.add(dVar2);
                    } else {
                        g gVar7 = eVar2.e.e;
                        this.e.l.add(gVar7);
                        gVar7.k.add(this.e);
                        this.f523b.e.h.k.add(this.e);
                        this.f523b.e.i.k.add(this.e);
                        g gVar8 = this.e;
                        gVar8.f509b = true;
                        gVar8.k.add(this.h);
                        this.e.k.add(this.i);
                        this.h.l.add(this.e);
                        fVar4 = this.i;
                    }
                    list = fVar4.l;
                    dVar2 = this.e;
                    list.add(dVar2);
                }
            }
            android.support.constraint.n.k.e eVar7 = this.f523b;
            dVarArr = eVar7.N;
            if (dVarArr[0].f != null || dVarArr[1].f == null) {
                eVar = this.f523b;
                dVarArr2 = eVar.N;
                if (dVarArr2[0].f != null) {
                    if (dVarArr2[1].f == null) {
                        fVarA = a(dVarArr2[1]);
                        if (fVarA != null) {
                            return;
                        }
                        a(this.i, fVarA, -this.f523b.N[1].c());
                        fVar = this.h;
                        fVar2 = this.i;
                        i3 = -1;
                    } else if ((eVar instanceof android.support.constraint.n.k.h) || eVar.v() == null) {
                        return;
                    } else {
                        a(this.h, this.f523b.v().d.h, this.f523b.D());
                    }
                    a(fVar, fVar2, i3, this.e);
                    return;
                }
                fVarA2 = a(dVarArr2[0]);
                if (fVarA2 != null) {
                    return;
                } else {
                    a(this.h, fVarA2, this.f523b.N[0].c());
                }
                fVar = this.i;
                fVar2 = this.h;
                a(fVar, fVar2, i3, this.e);
                return;
            }
            if (!eVar7.H()) {
                f fVarA7 = a(this.f523b.N[0]);
                f fVarA8 = a(this.f523b.N[1]);
                fVarA7.b(this);
                fVarA8.b(this);
                this.j = p.b.CENTER;
                return;
            }
            this.h.f = this.f523b.N[0].c();
            fVar3 = this.i;
            dVar = this.f523b.N[1];
        }
        fVar3.f = -dVar.c();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x029c, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // android.support.constraint.n.k.m.p, android.support.constraint.n.k.m.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.support.constraint.n.k.m.d r17) {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.n.k.m.l.a(android.support.constraint.n.k.m.d):void");
    }

    @Override // android.support.constraint.n.k.m.p
    public void b() {
        f fVar = this.h;
        if (fVar.j) {
            this.f523b.u(fVar.g);
        }
    }

    @Override // android.support.constraint.n.k.m.p
    void c() {
        this.f524c = null;
        this.h.a();
        this.i.a();
        this.e.a();
        this.g = false;
    }

    @Override // android.support.constraint.n.k.m.p
    boolean f() {
        return this.d != android.support.constraint.n.k.e.b.MATCH_CONSTRAINT || this.f523b.n == 0;
    }

    void g() {
        this.g = false;
        this.h.a();
        this.h.j = false;
        this.i.a();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f523b.h();
    }
}
