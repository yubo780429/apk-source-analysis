package android.support.constraint.n;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f459c;
    public a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f457a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f458b = 0.0f;
    ArrayList<i> d = new ArrayList<>();
    boolean f = false;

    public interface a {
        float a(int i);

        float a(b bVar, boolean z);

        float a(i iVar);

        float a(i iVar, boolean z);

        void a();

        void a(float f);

        void a(i iVar, float f);

        void a(i iVar, float f, boolean z);

        int b();

        i b(int i);

        boolean b(i iVar);

        void clear();
    }

    public b() {
    }

    public b(c cVar) {
        this.e = new android.support.constraint.n.a(this, cVar);
    }

    private i a(boolean[] zArr, i iVar) {
        i.a aVar;
        int iB = this.e.b();
        i iVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < iB; i++) {
            float fA = this.e.a(i);
            if (fA < 0.0f) {
                i iVarB = this.e.b(i);
                if ((zArr == null || !zArr[iVarB.f475c]) && iVarB != iVar && (((aVar = iVarB.j) == i.a.SLACK || aVar == i.a.ERROR) && fA < f)) {
                    f = fA;
                    iVar2 = iVarB;
                }
            }
        }
        return iVar2;
    }

    private boolean a(i iVar, d dVar) {
        return iVar.m <= 1;
    }

    public b a(float f, float f2, float f3, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f458b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.e.a(iVar, 1.0f);
            this.e.a(iVar2, -1.0f);
            this.e.a(iVar4, 1.0f);
            this.e.a(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.e.a(iVar, 1.0f);
            this.e.a(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.e.a(iVar3, 1.0f);
            this.e.a(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.e.a(iVar, 1.0f);
            this.e.a(iVar2, -1.0f);
            this.e.a(iVar4, f4);
            this.e.a(iVar3, -f4);
        }
        return this;
    }

    public b a(d dVar, int i) {
        this.e.a(dVar.a(i, "ep"), 1.0f);
        this.e.a(dVar.a(i, "em"), -1.0f);
        return this;
    }

    b a(i iVar, int i) {
        this.e.a(iVar, i);
        return this;
    }

    b a(i iVar, i iVar2, float f) {
        this.e.a(iVar, -1.0f);
        this.e.a(iVar2, f);
        return this;
    }

    public b a(i iVar, i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f458b = i;
        }
        if (z) {
            this.e.a(iVar, 1.0f);
            this.e.a(iVar2, -1.0f);
        } else {
            this.e.a(iVar, -1.0f);
            this.e.a(iVar2, 1.0f);
        }
        return this;
    }

    b a(i iVar, i iVar2, int i, float f, i iVar3, i iVar4, int i2) {
        float f2;
        int i3;
        if (iVar2 == iVar3) {
            this.e.a(iVar, 1.0f);
            this.e.a(iVar4, 1.0f);
            this.e.a(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.e.a(iVar, 1.0f);
            this.e.a(iVar2, -1.0f);
            this.e.a(iVar3, -1.0f);
            this.e.a(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                i3 = (-i) + i2;
                f2 = i3;
                this.f458b = f2;
            }
        } else {
            if (f <= 0.0f) {
                this.e.a(iVar, -1.0f);
                this.e.a(iVar2, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                this.e.a(iVar4, -1.0f);
                this.e.a(iVar3, 1.0f);
                i3 = -i2;
                f2 = i3;
            } else {
                float f3 = 1.0f - f;
                this.e.a(iVar, f3 * 1.0f);
                this.e.a(iVar2, f3 * (-1.0f));
                this.e.a(iVar3, (-1.0f) * f);
                this.e.a(iVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    f2 = ((-i) * f3) + (i2 * f);
                }
            }
            this.f458b = f2;
        }
        return this;
    }

    public b a(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f458b = i;
        }
        if (z) {
            this.e.a(iVar, 1.0f);
            this.e.a(iVar2, -1.0f);
            this.e.a(iVar3, -1.0f);
        } else {
            this.e.a(iVar, -1.0f);
            this.e.a(iVar2, 1.0f);
            this.e.a(iVar3, 1.0f);
        }
        return this;
    }

    public b a(i iVar, i iVar2, i iVar3, i iVar4, float f) {
        this.e.a(iVar, -1.0f);
        this.e.a(iVar2, 1.0f);
        this.e.a(iVar3, f);
        this.e.a(iVar4, -f);
        return this;
    }

    @Override // android.support.constraint.n.d.a
    public i a(d dVar, boolean[] zArr) {
        return a(zArr, (i) null);
    }

    void a() {
        float f = this.f458b;
        if (f < 0.0f) {
            this.f458b = f * (-1.0f);
            this.e.a();
        }
    }

    @Override // android.support.constraint.n.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f457a = null;
            this.e.clear();
            for (int i = 0; i < bVar.e.b(); i++) {
                this.e.a(bVar.e.b(i), bVar.e.a(i), true);
            }
        }
    }

    public void a(d dVar, b bVar, boolean z) {
        this.f458b += bVar.f458b * this.e.a(bVar, z);
        if (z) {
            bVar.f457a.b(this);
        }
        if (d.t && this.f457a != null && this.e.b() == 0) {
            this.f = true;
            dVar.f463a = true;
        }
    }

    public void a(d dVar, i iVar, boolean z) {
        if (iVar.g) {
            this.f458b += iVar.f * this.e.a(iVar);
            this.e.a(iVar, z);
            if (z) {
                iVar.b(this);
            }
            if (d.t && iVar != null && this.e.b() == 0) {
                this.f = true;
                dVar.f463a = true;
            }
        }
    }

    @Override // android.support.constraint.n.d.a
    public void a(i iVar) {
        int i = iVar.e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.e.a(iVar, f);
    }

    boolean a(d dVar) {
        boolean z;
        i iVarB = b(dVar);
        if (iVarB == null) {
            z = true;
        } else {
            d(iVarB);
            z = false;
        }
        if (this.e.b() == 0) {
            this.f = true;
        }
        return z;
    }

    b b(i iVar, int i) {
        this.f457a = iVar;
        float f = i;
        iVar.f = f;
        this.f458b = f;
        this.f = true;
        return this;
    }

    public b b(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f458b = i;
        }
        if (z) {
            this.e.a(iVar, 1.0f);
            this.e.a(iVar2, -1.0f);
            this.e.a(iVar3, 1.0f);
        } else {
            this.e.a(iVar, -1.0f);
            this.e.a(iVar2, 1.0f);
            this.e.a(iVar3, -1.0f);
        }
        return this;
    }

    public b b(i iVar, i iVar2, i iVar3, i iVar4, float f) {
        this.e.a(iVar3, 0.5f);
        this.e.a(iVar4, 0.5f);
        this.e.a(iVar, -0.5f);
        this.e.a(iVar2, -0.5f);
        this.f458b = -f;
        return this;
    }

    i b(d dVar) {
        int iB = this.e.b();
        i iVar = null;
        boolean zA = false;
        boolean zA2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        i iVar2 = null;
        for (int i = 0; i < iB; i++) {
            float fA = this.e.a(i);
            i iVarB = this.e.b(i);
            if (iVarB.j == i.a.UNRESTRICTED) {
                if (iVar == null || f > fA) {
                    zA = a(iVarB, dVar);
                    f = fA;
                    iVar = iVarB;
                } else if (!zA && a(iVarB, dVar)) {
                    f = fA;
                    iVar = iVarB;
                    zA = true;
                }
            } else if (iVar == null && fA < 0.0f) {
                if (iVar2 == null || f2 > fA) {
                    zA2 = a(iVarB, dVar);
                    f2 = fA;
                    iVar2 = iVarB;
                } else if (!zA2 && a(iVarB, dVar)) {
                    f2 = fA;
                    iVar2 = iVarB;
                    zA2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public void b(d dVar, i iVar, boolean z) {
        if (iVar.n) {
            float fA = this.e.a(iVar);
            this.f458b += iVar.p * fA;
            this.e.a(iVar, z);
            if (z) {
                iVar.b(this);
            }
            this.e.a(dVar.n.d[iVar.o], fA, z);
            if (d.t && iVar != null && this.e.b() == 0) {
                this.f = true;
                dVar.f463a = true;
            }
        }
    }

    boolean b() {
        i iVar = this.f457a;
        return iVar != null && (iVar.j == i.a.UNRESTRICTED || this.f458b >= 0.0f);
    }

    boolean b(i iVar) {
        return this.e.b(iVar);
    }

    public b c(i iVar, int i) {
        a aVar;
        float f;
        if (i < 0) {
            this.f458b = i * (-1);
            aVar = this.e;
            f = 1.0f;
        } else {
            this.f458b = i;
            aVar = this.e;
            f = -1.0f;
        }
        aVar.a(iVar, f);
        return this;
    }

    public i c(i iVar) {
        return a((boolean[]) null, iVar);
    }

    public void c() {
        this.f457a = null;
        this.e.clear();
        this.f458b = 0.0f;
        this.f = false;
    }

    public void c(d dVar) {
        if (dVar.g.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int iB = this.e.b();
            for (int i = 0; i < iB; i++) {
                i iVarB = this.e.b(i);
                if (iVarB.d != -1 || iVarB.g || iVarB.n) {
                    this.d.add(iVarB);
                }
            }
            int size = this.d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = this.d.get(i2);
                    if (iVar.g) {
                        a(dVar, iVar, true);
                    } else if (iVar.n) {
                        b(dVar, iVar, true);
                    } else {
                        a(dVar, dVar.g[iVar.d], true);
                    }
                }
                this.d.clear();
            } else {
                z = true;
            }
        }
        if (d.t && this.f457a != null && this.e.b() == 0) {
            this.f = true;
            dVar.f463a = true;
        }
    }

    @Override // android.support.constraint.n.d.a
    public void clear() {
        this.e.clear();
        this.f457a = null;
        this.f458b = 0.0f;
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    java.lang.String d() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.n.b.d():java.lang.String");
    }

    void d(i iVar) {
        i iVar2 = this.f457a;
        if (iVar2 != null) {
            this.e.a(iVar2, -1.0f);
            this.f457a.d = -1;
            this.f457a = null;
        }
        float fA = this.e.a(iVar, true) * (-1.0f);
        this.f457a = iVar;
        if (fA == 1.0f) {
            return;
        }
        this.f458b /= fA;
        this.e.a(fA);
    }

    @Override // android.support.constraint.n.d.a
    public i getKey() {
        return this.f457a;
    }

    @Override // android.support.constraint.n.d.a
    public boolean isEmpty() {
        return this.f457a == null && this.f458b == 0.0f && this.e.b() == 0;
    }

    public String toString() {
        return d();
    }
}
