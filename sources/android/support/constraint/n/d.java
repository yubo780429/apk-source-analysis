package android.support.constraint.n;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static boolean r = false;
    public static boolean s = true;
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = false;
    private static int w = 1000;
    public static e x;
    public static long y;
    public static long z;
    private a d;
    android.support.constraint.n.b[] g;
    final c n;
    private a q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f463a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f464b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, i> f465c = null;
    private int e = 32;
    private int f = 32;
    public boolean h = false;
    public boolean i = false;
    private boolean[] j = new boolean[32];
    int k = 1;
    int l = 0;
    private int m = 32;
    private i[] o = new i[w];
    private int p = 0;

    interface a {
        i a(d dVar, boolean[] zArr);

        void a(a aVar);

        void a(i iVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    class b extends android.support.constraint.n.b {
        public b(d dVar, c cVar) {
            this.e = new j(this, cVar);
        }
    }

    public d() {
        this.g = null;
        this.g = new android.support.constraint.n.b[32];
        j();
        c cVar = new c();
        this.n = cVar;
        this.d = new h(cVar);
        this.q = v ? new b(this, this.n) : new android.support.constraint.n.b(this.n);
    }

    private final int a(a aVar, boolean z2) {
        e eVar = x;
        if (eVar != null) {
            eVar.h++;
        }
        for (int i = 0; i < this.k; i++) {
            this.j[i] = false;
        }
        boolean z3 = false;
        int i2 = 0;
        while (!z3) {
            e eVar2 = x;
            if (eVar2 != null) {
                eVar2.i++;
            }
            i2++;
            if (i2 >= this.k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.j[aVar.getKey().f475c] = true;
            }
            i iVarA = aVar.a(this, this.j);
            if (iVarA != null) {
                boolean[] zArr = this.j;
                int i3 = iVarA.f475c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (iVarA != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.l; i5++) {
                    android.support.constraint.n.b bVar = this.g[i5];
                    if (bVar.f457a.j != i.a.UNRESTRICTED && !bVar.f && bVar.b(iVarA)) {
                        float fA = bVar.e.a(iVarA);
                        if (fA < 0.0f) {
                            float f2 = (-bVar.f458b) / fA;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    android.support.constraint.n.b bVar2 = this.g[i4];
                    bVar2.f457a.d = -1;
                    e eVar3 = x;
                    if (eVar3 != null) {
                        eVar3.j++;
                    }
                    bVar2.d(iVarA);
                    i iVar = bVar2.f457a;
                    iVar.d = i4;
                    iVar.a(this, bVar2);
                }
            } else {
                z3 = true;
            }
        }
        return i2;
    }

    public static android.support.constraint.n.b a(d dVar, i iVar, i iVar2, float f) {
        android.support.constraint.n.b bVarB = dVar.b();
        bVarB.a(iVar, iVar2, f);
        return bVarB;
    }

    private i a(i.a aVar, String str) {
        i iVarA = this.n.f462c.a();
        if (iVarA == null) {
            iVarA = new i(aVar, str);
        } else {
            iVarA.a();
        }
        iVarA.a(aVar, str);
        int i = this.p;
        int i2 = w;
        if (i >= i2) {
            int i3 = i2 * 2;
            w = i3;
            this.o = (i[]) Arrays.copyOf(this.o, i3);
        }
        i[] iVarArr = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        iVarArr[i4] = iVarA;
        return iVarA;
    }

    private int b(a aVar) {
        boolean z2;
        int i = 0;
        while (true) {
            if (i >= this.l) {
                z2 = false;
                break;
            }
            android.support.constraint.n.b[] bVarArr = this.g;
            if (bVarArr[i].f457a.j != i.a.UNRESTRICTED && bVarArr[i].f458b < 0.0f) {
                z2 = true;
                break;
            }
            i++;
        }
        if (!z2) {
            return 0;
        }
        boolean z3 = false;
        int i2 = 0;
        while (!z3) {
            e eVar = x;
            if (eVar != null) {
                eVar.k++;
            }
            i2++;
            float f = Float.MAX_VALUE;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < this.l; i6++) {
                android.support.constraint.n.b bVar = this.g[i6];
                if (bVar.f457a.j != i.a.UNRESTRICTED && !bVar.f && bVar.f458b < 0.0f) {
                    int i7 = 9;
                    if (u) {
                        int iB = bVar.e.b();
                        int i8 = 0;
                        while (i8 < iB) {
                            i iVarB = bVar.e.b(i8);
                            float fA = bVar.e.a(iVarB);
                            if (fA > 0.0f) {
                                int i9 = 0;
                                while (i9 < i7) {
                                    float f2 = iVarB.h[i9] / fA;
                                    if ((f2 < f && i9 == i5) || i9 > i5) {
                                        i4 = iVarB.f475c;
                                        i5 = i9;
                                        i3 = i6;
                                        f = f2;
                                    }
                                    i9++;
                                    i7 = 9;
                                }
                            }
                            i8++;
                            i7 = 9;
                        }
                    } else {
                        for (int i10 = 1; i10 < this.k; i10++) {
                            i iVar = this.n.d[i10];
                            float fA2 = bVar.e.a(iVar);
                            if (fA2 > 0.0f) {
                                for (int i11 = 0; i11 < 9; i11++) {
                                    float f3 = iVar.h[i11] / fA2;
                                    if ((f3 < f && i11 == i5) || i11 > i5) {
                                        i4 = i10;
                                        i5 = i11;
                                        i3 = i6;
                                        f = f3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i3 != -1) {
                android.support.constraint.n.b bVar2 = this.g[i3];
                bVar2.f457a.d = -1;
                e eVar2 = x;
                if (eVar2 != null) {
                    eVar2.j++;
                }
                bVar2.d(this.n.d[i4]);
                i iVar2 = bVar2.f457a;
                iVar2.d = i3;
                iVar2.a(this, bVar2);
            } else {
                z3 = true;
            }
            if (i2 > this.k / 2) {
                z3 = true;
            }
        }
        return i2;
    }

    private final void b(android.support.constraint.n.b bVar) {
        int i;
        if (t && bVar.f) {
            bVar.f457a.a(this, bVar.f458b);
        } else {
            android.support.constraint.n.b[] bVarArr = this.g;
            int i2 = this.l;
            bVarArr[i2] = bVar;
            i iVar = bVar.f457a;
            iVar.d = i2;
            this.l = i2 + 1;
            iVar.a(this, bVar);
        }
        if (t && this.f463a) {
            int i3 = 0;
            while (i3 < this.l) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                android.support.constraint.n.b[] bVarArr2 = this.g;
                if (bVarArr2[i3] != null && bVarArr2[i3].f) {
                    android.support.constraint.n.b bVar2 = bVarArr2[i3];
                    bVar2.f457a.a(this, bVar2.f458b);
                    (v ? this.n.f460a : this.n.f461b).a(bVar2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.l;
                        if (i4 >= i) {
                            break;
                        }
                        android.support.constraint.n.b[] bVarArr3 = this.g;
                        int i6 = i4 - 1;
                        bVarArr3[i6] = bVarArr3[i4];
                        if (bVarArr3[i6].f457a.d == i4) {
                            bVarArr3[i6].f457a.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.l--;
                    i3--;
                }
                i3++;
            }
            this.f463a = false;
        }
    }

    private void g() {
        for (int i = 0; i < this.l; i++) {
            android.support.constraint.n.b bVar = this.g[i];
            bVar.f457a.f = bVar.f458b;
        }
    }

    public static e h() {
        return x;
    }

    private void i() {
        int i = this.e * 2;
        this.e = i;
        this.g = (android.support.constraint.n.b[]) Arrays.copyOf(this.g, i);
        c cVar = this.n;
        cVar.d = (i[]) Arrays.copyOf(cVar.d, this.e);
        int i2 = this.e;
        this.j = new boolean[i2];
        this.f = i2;
        this.m = i2;
        e eVar = x;
        if (eVar != null) {
            eVar.d++;
            eVar.o = Math.max(eVar.o, i2);
            e eVar2 = x;
            eVar2.x = eVar2.o;
        }
    }

    private void j() {
        int i = 0;
        if (v) {
            while (i < this.l) {
                android.support.constraint.n.b bVar = this.g[i];
                if (bVar != null) {
                    this.n.f460a.a(bVar);
                }
                this.g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.l) {
            android.support.constraint.n.b bVar2 = this.g[i];
            if (bVar2 != null) {
                this.n.f461b.a(bVar2);
            }
            this.g[i] = null;
            i++;
        }
    }

    public android.support.constraint.n.b a(i iVar, i iVar2, int i, int i2) {
        if (s && i2 == 8 && iVar2.g && iVar.d == -1) {
            iVar.a(this, iVar2.f + i);
            return null;
        }
        android.support.constraint.n.b bVarB = b();
        bVarB.a(iVar, iVar2, i);
        if (i2 != 8) {
            bVarB.a(this, i2);
        }
        a(bVarB);
        return bVarB;
    }

    public i a() {
        e eVar = x;
        if (eVar != null) {
            eVar.n++;
        }
        if (this.k + 1 >= this.f) {
            i();
        }
        i iVarA = a(i.a.SLACK, (String) null);
        int i = this.f464b + 1;
        this.f464b = i;
        this.k++;
        iVarA.f475c = i;
        this.n.d[i] = iVarA;
        return iVarA;
    }

    public i a(int i, String str) {
        e eVar = x;
        if (eVar != null) {
            eVar.l++;
        }
        if (this.k + 1 >= this.f) {
            i();
        }
        i iVarA = a(i.a.ERROR, str);
        int i2 = this.f464b + 1;
        this.f464b = i2;
        this.k++;
        iVarA.f475c = i2;
        iVarA.e = i;
        this.n.d[i2] = iVarA;
        this.d.a(iVarA);
        return iVarA;
    }

    public i a(Object obj) {
        i iVarF = null;
        if (obj == null) {
            return null;
        }
        if (this.k + 1 >= this.f) {
            i();
        }
        if (obj instanceof android.support.constraint.n.k.d) {
            android.support.constraint.n.k.d dVar = (android.support.constraint.n.k.d) obj;
            iVarF = dVar.f();
            if (iVarF == null) {
                dVar.a(this.n);
                iVarF = dVar.f();
            }
            int i = iVarF.f475c;
            if (i == -1 || i > this.f464b || this.n.d[i] == null) {
                if (iVarF.f475c != -1) {
                    iVarF.a();
                }
                int i2 = this.f464b + 1;
                this.f464b = i2;
                this.k++;
                iVarF.f475c = i2;
                iVarF.j = i.a.UNRESTRICTED;
                this.n.d[i2] = iVarF;
            }
        }
        return iVarF;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    public void a(android.support.constraint.n.b bVar) {
        i iVarC;
        if (bVar == null) {
            return;
        }
        e eVar = x;
        if (eVar != null) {
            eVar.f++;
            if (bVar.f) {
                eVar.g++;
            }
        }
        boolean z2 = true;
        if (this.l + 1 >= this.m || this.k + 1 >= this.f) {
            i();
        }
        boolean z3 = false;
        if (!bVar.f) {
            bVar.c(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.a();
            if (bVar.a(this)) {
                i iVarA = a();
                bVar.f457a = iVarA;
                int i = this.l;
                b(bVar);
                if (this.l == i + 1) {
                    this.q.a(bVar);
                    a(this.q, true);
                    if (iVarA.d == -1) {
                        if (bVar.f457a == iVarA && (iVarC = bVar.c(iVarA)) != null) {
                            e eVar2 = x;
                            if (eVar2 != null) {
                                eVar2.j++;
                            }
                            bVar.d(iVarC);
                        }
                        if (!bVar.f) {
                            bVar.f457a.a(this, bVar);
                        }
                        (v ? this.n.f460a : this.n.f461b).a(bVar);
                        this.l--;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (!bVar.b()) {
                return;
            } else {
                z3 = z2;
            }
        }
        if (z3) {
            return;
        }
        b(bVar);
    }

    void a(android.support.constraint.n.b bVar, int i, int i2) {
        bVar.a(a(i2, (String) null), i);
    }

    void a(a aVar) {
        e eVar = x;
        if (eVar != null) {
            eVar.t++;
            eVar.u = Math.max(eVar.u, this.k);
            e eVar2 = x;
            eVar2.v = Math.max(eVar2.v, this.l);
        }
        b(aVar);
        a(aVar, false);
        g();
    }

    public void a(i iVar, int i) {
        android.support.constraint.n.b bVarB;
        if (s && iVar.d == -1) {
            float f = i;
            iVar.a(this, f);
            for (int i2 = 0; i2 < this.f464b + 1; i2++) {
                i iVar2 = this.n.d[i2];
                if (iVar2 != null && iVar2.n && iVar2.o == iVar.f475c) {
                    iVar2.a(this, iVar2.p + f);
                }
            }
            return;
        }
        int i3 = iVar.d;
        if (i3 != -1) {
            android.support.constraint.n.b bVar = this.g[i3];
            if (!bVar.f) {
                if (bVar.e.b() == 0) {
                    bVar.f = true;
                } else {
                    bVarB = b();
                    bVarB.c(iVar, i);
                }
            }
            bVar.f458b = i;
            return;
        }
        bVarB = b();
        bVarB.b(iVar, i);
        a(bVarB);
    }

    public void a(i iVar, i iVar2, int i, float f, i iVar3, i iVar4, int i2, int i3) {
        android.support.constraint.n.b bVarB = b();
        bVarB.a(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i3 != 8) {
            bVarB.a(this, i3);
        }
        a(bVarB);
    }

    public void a(i iVar, i iVar2, int i, boolean z2) {
        android.support.constraint.n.b bVarB = b();
        i iVarC = c();
        iVarC.e = 0;
        bVarB.a(iVar, iVar2, iVarC, i);
        a(bVarB);
    }

    public void a(i iVar, i iVar2, i iVar3, i iVar4, float f, int i) {
        android.support.constraint.n.b bVarB = b();
        bVarB.a(iVar, iVar2, iVar3, iVar4, f);
        if (i != 8) {
            bVarB.a(this, i);
        }
        a(bVarB);
    }

    public void a(android.support.constraint.n.k.e eVar, android.support.constraint.n.k.e eVar2, float f, int i) {
        i iVarA = a(eVar.a(android.support.constraint.n.k.d.b.LEFT));
        i iVarA2 = a(eVar.a(android.support.constraint.n.k.d.b.TOP));
        i iVarA3 = a(eVar.a(android.support.constraint.n.k.d.b.RIGHT));
        i iVarA4 = a(eVar.a(android.support.constraint.n.k.d.b.BOTTOM));
        i iVarA5 = a(eVar2.a(android.support.constraint.n.k.d.b.LEFT));
        i iVarA6 = a(eVar2.a(android.support.constraint.n.k.d.b.TOP));
        i iVarA7 = a(eVar2.a(android.support.constraint.n.k.d.b.RIGHT));
        i iVarA8 = a(eVar2.a(android.support.constraint.n.k.d.b.BOTTOM));
        android.support.constraint.n.b bVarB = b();
        double d = f;
        double d2 = i;
        bVarB.b(iVarA2, iVarA4, iVarA6, iVarA8, (float) (Math.sin(d) * d2));
        a(bVarB);
        android.support.constraint.n.b bVarB2 = b();
        bVarB2.b(iVarA, iVarA3, iVarA5, iVarA7, (float) (Math.cos(d) * d2));
        a(bVarB2);
    }

    public int b(Object obj) {
        i iVarF = ((android.support.constraint.n.k.d) obj).f();
        if (iVarF != null) {
            return (int) (iVarF.f + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[PHI: r0
  0x0038: PHI (r0v6 android.support.constraint.n.b) = (r0v4 android.support.constraint.n.b), (r0v11 android.support.constraint.n.b) binds: [B:8:0x0029, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    public android.support.constraint.n.b b() {
        android.support.constraint.n.b bVarA;
        if (v) {
            bVarA = this.n.f460a.a();
            if (bVarA == null) {
                bVarA = new b(this, this.n);
                z++;
            } else {
                bVarA.c();
            }
        } else {
            bVarA = this.n.f461b.a();
            if (bVarA == null) {
                bVarA = new android.support.constraint.n.b(this.n);
                y++;
            } else {
                bVarA.c();
            }
        }
        i.b();
        return bVarA;
    }

    public void b(i iVar, i iVar2, int i, int i2) {
        android.support.constraint.n.b bVarB = b();
        i iVarC = c();
        iVarC.e = 0;
        bVarB.a(iVar, iVar2, iVarC, i);
        if (i2 != 8) {
            a(bVarB, (int) (bVarB.e.a(iVarC) * (-1.0f)), i2);
        }
        a(bVarB);
    }

    public void b(i iVar, i iVar2, int i, boolean z2) {
        android.support.constraint.n.b bVarB = b();
        i iVarC = c();
        iVarC.e = 0;
        bVarB.b(iVar, iVar2, iVarC, i);
        a(bVarB);
    }

    public i c() {
        e eVar = x;
        if (eVar != null) {
            eVar.m++;
        }
        if (this.k + 1 >= this.f) {
            i();
        }
        i iVarA = a(i.a.SLACK, (String) null);
        int i = this.f464b + 1;
        this.f464b = i;
        this.k++;
        iVarA.f475c = i;
        this.n.d[i] = iVarA;
        return iVarA;
    }

    public void c(i iVar, i iVar2, int i, int i2) {
        android.support.constraint.n.b bVarB = b();
        i iVarC = c();
        iVarC.e = 0;
        bVarB.b(iVar, iVar2, iVarC, i);
        if (i2 != 8) {
            a(bVarB, (int) (bVarB.e.a(iVarC) * (-1.0f)), i2);
        }
        a(bVarB);
    }

    public c d() {
        return this.n;
    }

    public void e() {
        e eVar = x;
        if (eVar != null) {
            eVar.e++;
        }
        if (this.d.isEmpty()) {
            g();
            return;
        }
        if (this.h || this.i) {
            e eVar2 = x;
            if (eVar2 != null) {
                eVar2.q++;
            }
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= this.l) {
                    z2 = true;
                    break;
                } else if (!this.g[i].f) {
                    break;
                } else {
                    i++;
                }
            }
            if (z2) {
                e eVar3 = x;
                if (eVar3 != null) {
                    eVar3.p++;
                }
                g();
                return;
            }
        }
        a(this.d);
    }

    public void f() {
        c cVar;
        int i = 0;
        while (true) {
            cVar = this.n;
            i[] iVarArr = cVar.d;
            if (i >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.a();
            }
            i++;
        }
        cVar.f462c.a(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.d, (Object) null);
        HashMap<String, i> map = this.f465c;
        if (map != null) {
            map.clear();
        }
        this.f464b = 0;
        this.d.clear();
        this.k = 1;
        for (int i2 = 0; i2 < this.l; i2++) {
            android.support.constraint.n.b[] bVarArr = this.g;
            if (bVarArr[i2] != null) {
                bVarArr[i2].f459c = false;
            }
        }
        j();
        this.l = 0;
        this.q = v ? new b(this, this.n) : new android.support.constraint.n.b(this.n);
    }
}
