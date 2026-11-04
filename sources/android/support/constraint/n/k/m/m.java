package android.support.constraint.n.k.m;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class m {
    public static int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    p f516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList<p> f517c = new ArrayList<>();

    public m(p pVar, int i) {
        this.f516b = null;
        d++;
        this.f516b = pVar;
    }

    private long a(f fVar, long j) {
        p pVar = fVar.d;
        if (pVar instanceof k) {
            return j;
        }
        int size = fVar.k.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != pVar) {
                    jMin = Math.min(jMin, a(fVar2, ((long) fVar2.f) + j));
                }
            }
        }
        if (fVar != pVar.i) {
            return jMin;
        }
        long jD = j - pVar.d();
        return Math.min(Math.min(jMin, a(pVar.h, jD)), jD - ((long) pVar.h.f));
    }

    private long b(f fVar, long j) {
        p pVar = fVar.d;
        if (pVar instanceof k) {
            return j;
        }
        int size = fVar.k.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != pVar) {
                    jMax = Math.max(jMax, b(fVar2, ((long) fVar2.f) + j));
                }
            }
        }
        if (fVar != pVar.h) {
            return jMax;
        }
        long jD = j + pVar.d();
        return Math.max(Math.max(jMax, b(pVar.i, jD)), jD - ((long) pVar.i.f));
    }

    public long a(android.support.constraint.n.k.f fVar, int i) {
        p pVar = this.f516b;
        if (pVar instanceof c) {
            if (((c) pVar).f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i == 0 ? fVar.d : fVar.e).h;
        f fVar3 = (i == 0 ? fVar.d : fVar.e).i;
        boolean zContains = this.f516b.h.l.contains(fVar2);
        boolean zContains2 = this.f516b.i.l.contains(fVar3);
        long jD = this.f516b.d();
        if (!zContains || !zContains2) {
            if (zContains) {
                f fVar4 = this.f516b.h;
                return Math.max(b(fVar4, fVar4.f), ((long) this.f516b.h.f) + jD);
            }
            if (!zContains2) {
                p pVar2 = this.f516b;
                return (((long) pVar2.h.f) + pVar2.d()) - ((long) this.f516b.i.f);
            }
            f fVar5 = this.f516b.i;
            return Math.max(-a(fVar5, fVar5.f), ((long) (-this.f516b.i.f)) + jD);
        }
        long jB = b(this.f516b.h, 0L);
        long jA = a(this.f516b.i, 0L);
        long j = jB - jD;
        int i2 = this.f516b.i.f;
        if (j >= (-i2)) {
            j += (long) i2;
        }
        int i3 = this.f516b.h.f;
        long j2 = ((-jA) - jD) - ((long) i3);
        if (j2 >= i3) {
            j2 -= (long) i3;
        }
        float fA = this.f516b.f523b.a(i);
        float f = fA > 0.0f ? (long) ((j2 / fA) + (j / (1.0f - fA))) : 0L;
        long j3 = ((long) ((f * fA) + 0.5f)) + jD + ((long) ((f * (1.0f - fA)) + 0.5f));
        p pVar3 = this.f516b;
        return (((long) pVar3.h.f) + j3) - ((long) pVar3.i.f);
    }

    public void a(p pVar) {
        this.f517c.add(pVar);
    }
}
