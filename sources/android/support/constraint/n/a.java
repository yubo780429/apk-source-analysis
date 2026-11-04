package android.support.constraint.n;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {
    private static float l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f456c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f454a = 0;
    private int d = 8;
    private i e = null;
    private int[] f = new int[8];
    private int[] g = new int[8];
    private float[] h = new float[8];
    private int i = -1;
    private int j = -1;
    private boolean k = false;

    a(b bVar, c cVar) {
        this.f455b = bVar;
        this.f456c = cVar;
    }

    @Override // android.support.constraint.n.b.a
    public float a(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f454a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    @Override // android.support.constraint.n.b.a
    public float a(b bVar, boolean z) {
        float fA = a(bVar.f457a);
        a(bVar.f457a, z);
        b.a aVar = bVar.e;
        int iB = aVar.b();
        for (int i = 0; i < iB; i++) {
            i iVarB = aVar.b(i);
            a(iVarB, aVar.a(iVarB) * fA, z);
        }
        return fA;
    }

    @Override // android.support.constraint.n.b.a
    public final float a(i iVar) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f454a; i2++) {
            if (this.f[i] == iVar.f475c) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // android.support.constraint.n.b.a
    public final float a(i iVar, boolean z) {
        if (this.e == iVar) {
            this.e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f454a) {
            if (this.f[i] == iVar.f475c) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.b(this.f455b);
                }
                iVar.m--;
                this.f454a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // android.support.constraint.n.b.a
    public void a() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f454a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.g[i];
        }
    }

    @Override // android.support.constraint.n.b.a
    public void a(float f) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f454a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
        }
    }

    @Override // android.support.constraint.n.b.a
    public final void a(i iVar, float f) {
        if (f == 0.0f) {
            a(iVar, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = iVar.f475c;
            this.g[0] = -1;
            iVar.m++;
            iVar.a(this.f455b);
            this.f454a++;
            if (this.k) {
                return;
            }
            int i2 = this.j + 1;
            this.j = i2;
            int[] iArr = this.f;
            if (i2 >= iArr.length) {
                this.k = true;
                this.j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f454a; i4++) {
            int[] iArr2 = this.f;
            int i5 = iArr2[i];
            int i6 = iVar.f475c;
            if (i5 == i6) {
                this.h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.g[i];
        }
        int length = this.j;
        int i7 = length + 1;
        if (this.k) {
            int[] iArr3 = this.f;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i7;
        }
        int[] iArr4 = this.f;
        if (length >= iArr4.length && this.f454a < iArr4.length) {
            int i8 = 0;
            while (true) {
                int[] iArr5 = this.f;
                if (i8 >= iArr5.length) {
                    break;
                }
                if (iArr5[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr6 = this.f;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i9 = this.d * 2;
            this.d = i9;
            this.k = false;
            this.j = length - 1;
            this.h = Arrays.copyOf(this.h, i9);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[length] = iVar.f475c;
        this.h[length] = f;
        int[] iArr7 = this.g;
        if (i3 != -1) {
            iArr7[length] = iArr7[i3];
            iArr7[i3] = length;
        } else {
            iArr7[length] = this.i;
            this.i = length;
        }
        iVar.m++;
        iVar.a(this.f455b);
        this.f454a++;
        if (!this.k) {
            this.j++;
        }
        if (this.f454a >= this.f.length) {
            this.k = true;
        }
        int i10 = this.j;
        int[] iArr8 = this.f;
        if (i10 >= iArr8.length) {
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    @Override // android.support.constraint.n.b.a
    public void a(i iVar, float f, boolean z) {
        float f2 = l;
        if (f <= (-f2) || f >= f2) {
            int i = this.i;
            if (i == -1) {
                this.i = 0;
                this.h[0] = f;
                this.f[0] = iVar.f475c;
                this.g[0] = -1;
                iVar.m++;
                iVar.a(this.f455b);
                this.f454a++;
                if (this.k) {
                    return;
                }
                int i2 = this.j + 1;
                this.j = i2;
                int[] iArr = this.f;
                if (i2 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f454a; i4++) {
                int[] iArr2 = this.f;
                int i5 = iArr2[i];
                int i6 = iVar.f475c;
                if (i5 == i6) {
                    float f3 = this.h[i] + f;
                    float f4 = l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    this.h[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.i) {
                            this.i = this.g[i];
                        } else {
                            int[] iArr3 = this.g;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            iVar.b(this.f455b);
                        }
                        if (this.k) {
                            this.j = i;
                        }
                        iVar.m--;
                        this.f454a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.g[i];
            }
            int length = this.j;
            int i7 = length + 1;
            if (this.k) {
                int[] iArr4 = this.f;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i7;
            }
            int[] iArr5 = this.f;
            if (length >= iArr5.length && this.f454a < iArr5.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr6 = this.f;
                    if (i8 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr7 = this.f;
            if (length >= iArr7.length) {
                length = iArr7.length;
                int i9 = this.d * 2;
                this.d = i9;
                this.k = false;
                this.j = length - 1;
                this.h = Arrays.copyOf(this.h, i9);
                this.f = Arrays.copyOf(this.f, this.d);
                this.g = Arrays.copyOf(this.g, this.d);
            }
            this.f[length] = iVar.f475c;
            this.h[length] = f;
            int[] iArr8 = this.g;
            if (i3 != -1) {
                iArr8[length] = iArr8[i3];
                iArr8[i3] = length;
            } else {
                iArr8[length] = this.i;
                this.i = length;
            }
            iVar.m++;
            iVar.a(this.f455b);
            this.f454a++;
            if (!this.k) {
                this.j++;
            }
            int i10 = this.j;
            int[] iArr9 = this.f;
            if (i10 >= iArr9.length) {
                this.k = true;
                this.j = iArr9.length - 1;
            }
        }
    }

    @Override // android.support.constraint.n.b.a
    public int b() {
        return this.f454a;
    }

    @Override // android.support.constraint.n.b.a
    public i b(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f454a; i3++) {
            if (i3 == i) {
                return this.f456c.d[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    @Override // android.support.constraint.n.b.a
    public boolean b(i iVar) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f454a; i2++) {
            if (this.f[i] == iVar.f475c) {
                return true;
            }
            i = this.g[i];
        }
        return false;
    }

    @Override // android.support.constraint.n.b.a
    public final void clear() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f454a; i2++) {
            i iVar = this.f456c.d[this.f[i]];
            if (iVar != null) {
                iVar.b(this.f455b);
            }
            i = this.g[i];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f454a = 0;
    }

    public String toString() {
        int i = this.i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f454a; i2++) {
            str = ((str + " -> ") + this.h[i] + " : ") + this.f456c.d[this.f[i]];
            i = this.g[i];
        }
        return str;
    }
}
