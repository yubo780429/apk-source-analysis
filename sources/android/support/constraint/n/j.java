package android.support.constraint.n;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {
    private static float m = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f478a = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f479b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f480c = new int[16];
    int[] d = new int[16];
    int[] e = new int[16];
    float[] f = new float[16];
    int[] g = new int[16];
    int[] h = new int[16];
    int i = 0;
    int j = -1;
    private final b k;
    protected final c l;

    j(b bVar, c cVar) {
        this.k = bVar;
        this.l = cVar;
        clear();
    }

    private void a(int i, i iVar, float f) {
        this.e[i] = iVar.f475c;
        this.f[i] = f;
        this.g[i] = -1;
        this.h[i] = -1;
        iVar.a(this.k);
        iVar.m++;
        this.i++;
    }

    private void a(i iVar, int i) {
        int[] iArr;
        int i2 = iVar.f475c % this.f479b;
        int[] iArr2 = this.f480c;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.d;
                if (iArr[i3] == -1) {
                    break;
                } else {
                    i3 = iArr[i3];
                }
            }
            iArr[i3] = i;
        }
        this.d[i] = -1;
    }

    private void b(int i, i iVar, float f) {
        int iC = c();
        a(iC, iVar, f);
        if (i != -1) {
            this.g[iC] = i;
            int[] iArr = this.h;
            iArr[iC] = iArr[i];
            iArr[i] = iC;
        } else {
            this.g[iC] = -1;
            if (this.i > 0) {
                this.h[iC] = this.j;
                this.j = iC;
            } else {
                this.h[iC] = -1;
            }
        }
        int[] iArr2 = this.h;
        if (iArr2[iC] != -1) {
            this.g[iArr2[iC]] = iC;
        }
        a(iVar, iC);
    }

    private int c() {
        for (int i = 0; i < this.f478a; i++) {
            if (this.e[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void d() {
        int i = this.f478a * 2;
        this.e = Arrays.copyOf(this.e, i);
        this.f = Arrays.copyOf(this.f, i);
        this.g = Arrays.copyOf(this.g, i);
        this.h = Arrays.copyOf(this.h, i);
        this.d = Arrays.copyOf(this.d, i);
        for (int i2 = this.f478a; i2 < i; i2++) {
            this.e[i2] = -1;
            this.d[i2] = -1;
        }
        this.f478a = i;
    }

    private void d(i iVar) {
        int i = iVar.f475c;
        int i2 = i % this.f479b;
        int[] iArr = this.f480c;
        int i3 = iArr[i2];
        if (i3 == -1) {
            return;
        }
        if (this.e[i3] == i) {
            int[] iArr2 = this.d;
            iArr[i2] = iArr2[i3];
            iArr2[i3] = -1;
            return;
        }
        while (true) {
            int[] iArr3 = this.d;
            if (iArr3[i3] == -1 || this.e[iArr3[i3]] == i) {
                break;
            } else {
                i3 = iArr3[i3];
            }
        }
        int[] iArr4 = this.d;
        int i4 = iArr4[i3];
        if (i4 == -1 || this.e[i4] != i) {
            return;
        }
        iArr4[i3] = iArr4[i4];
        iArr4[i4] = -1;
    }

    @Override // android.support.constraint.n.b.a
    public float a(int i) {
        int i2 = this.i;
        int i3 = this.j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f[i3];
            }
            i3 = this.h[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // android.support.constraint.n.b.a
    public float a(b bVar, boolean z) {
        float fA = a(bVar.f457a);
        a(bVar.f457a, z);
        j jVar = (j) bVar.e;
        int iB = jVar.b();
        int i = jVar.j;
        int i2 = 0;
        int i3 = 0;
        while (i2 < iB) {
            int[] iArr = jVar.e;
            if (iArr[i3] != -1) {
                a(this.l.d[iArr[i3]], jVar.f[i3] * fA, z);
                i2++;
            }
            i3++;
        }
        return fA;
    }

    @Override // android.support.constraint.n.b.a
    public float a(i iVar) {
        int iC = c(iVar);
        if (iC != -1) {
            return this.f[iC];
        }
        return 0.0f;
    }

    @Override // android.support.constraint.n.b.a
    public float a(i iVar, boolean z) {
        int iC = c(iVar);
        if (iC == -1) {
            return 0.0f;
        }
        d(iVar);
        float f = this.f[iC];
        if (this.j == iC) {
            this.j = this.h[iC];
        }
        this.e[iC] = -1;
        int[] iArr = this.g;
        if (iArr[iC] != -1) {
            int[] iArr2 = this.h;
            iArr2[iArr[iC]] = iArr2[iC];
        }
        int[] iArr3 = this.h;
        if (iArr3[iC] != -1) {
            int[] iArr4 = this.g;
            iArr4[iArr3[iC]] = iArr4[iC];
        }
        this.i--;
        iVar.m--;
        if (z) {
            iVar.b(this.k);
        }
        return f;
    }

    @Override // android.support.constraint.n.b.a
    public void a() {
        int i = this.i;
        int i2 = this.j;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.h[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // android.support.constraint.n.b.a
    public void a(float f) {
        int i = this.i;
        int i2 = this.j;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f;
            fArr[i2] = fArr[i2] / f;
            i2 = this.h[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // android.support.constraint.n.b.a
    public void a(i iVar, float f) {
        float f2 = m;
        if (f > (-f2) && f < f2) {
            a(iVar, true);
            return;
        }
        if (this.i == 0) {
            a(0, iVar, f);
            a(iVar, 0);
            this.j = 0;
            return;
        }
        int iC = c(iVar);
        if (iC != -1) {
            this.f[iC] = f;
            return;
        }
        if (this.i + 1 >= this.f478a) {
            d();
        }
        int i = this.i;
        int i2 = this.j;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr = this.e;
            int i5 = iArr[i2];
            int i6 = iVar.f475c;
            if (i5 == i6) {
                this.f[i2] = f;
                return;
            }
            if (iArr[i2] < i6) {
                i3 = i2;
            }
            i2 = this.h[i2];
            if (i2 == -1) {
                break;
            }
        }
        b(i3, iVar, f);
    }

    @Override // android.support.constraint.n.b.a
    public void a(i iVar, float f, boolean z) {
        float f2 = m;
        if (f <= (-f2) || f >= f2) {
            int iC = c(iVar);
            if (iC == -1) {
                a(iVar, f);
                return;
            }
            float[] fArr = this.f;
            fArr[iC] = fArr[iC] + f;
            float f3 = fArr[iC];
            float f4 = m;
            if (f3 <= (-f4) || fArr[iC] >= f4) {
                return;
            }
            fArr[iC] = 0.0f;
            a(iVar, z);
        }
    }

    @Override // android.support.constraint.n.b.a
    public int b() {
        return this.i;
    }

    @Override // android.support.constraint.n.b.a
    public i b(int i) {
        int i2 = this.i;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.l.d[this.e[i3]];
            }
            i3 = this.h[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // android.support.constraint.n.b.a
    public boolean b(i iVar) {
        return c(iVar) != -1;
    }

    public int c(i iVar) {
        if (this.i != 0 && iVar != null) {
            int i = iVar.f475c;
            int i2 = this.f480c[i % this.f479b];
            if (i2 == -1) {
                return -1;
            }
            if (this.e[i2] == i) {
                return i2;
            }
            while (true) {
                int[] iArr = this.d;
                if (iArr[i2] == -1 || this.e[iArr[i2]] == i) {
                    break;
                }
                i2 = iArr[i2];
            }
            int[] iArr2 = this.d;
            if (iArr2[i2] != -1 && this.e[iArr2[i2]] == i) {
                return iArr2[i2];
            }
        }
        return -1;
    }

    @Override // android.support.constraint.n.b.a
    public void clear() {
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            i iVarB = b(i2);
            if (iVarB != null) {
                iVarB.b(this.k);
            }
        }
        for (int i3 = 0; i3 < this.f478a; i3++) {
            this.e[i3] = -1;
            this.d[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f479b; i4++) {
            this.f480c[i4] = -1;
        }
        this.i = 0;
        this.j = -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            i iVarB = b(i2);
            if (iVarB != null) {
                String str2 = str + iVarB + " = " + a(i2) + " ";
                int iC = c(iVarB);
                String str3 = str2 + "[p: ";
                if (this.g[iC] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.l.d[this.e[this.g[iC]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.h[iC] != -1 ? str4 + this.l.d[this.e[this.h[iC]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
