package android.support.constraint.n;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class h extends android.support.constraint.n.b {
    private int g;
    private i[] h;
    private i[] i;
    private int j;
    b k;

    class a implements Comparator<i> {
        a(h hVar) {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f475c - iVar2.f475c;
        }
    }

    class b implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        i f471b;

        public b(h hVar) {
        }

        public void a(i iVar) {
            this.f471b = iVar;
        }

        public final boolean a() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f471b.i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public boolean a(i iVar, float f) {
            boolean z = true;
            if (!this.f471b.f473a) {
                for (int i = 0; i < 9; i++) {
                    float f2 = iVar.i[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.f471b.i[i] = f3;
                    } else {
                        this.f471b.i[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f471b.i;
                fArr[i2] = fArr[i2] + (iVar.i[i2] * f);
                if (Math.abs(fArr[i2]) < 1.0E-4f) {
                    this.f471b.i[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                h.this.f(this.f471b);
            }
            return false;
        }

        public void b() {
            Arrays.fill(this.f471b.i, 0.0f);
        }

        public final boolean b(i iVar) {
            for (int i = 8; i >= 0; i--) {
                float f = iVar.i[i];
                float f2 = this.f471b.i[i];
                if (f2 != f) {
                    if (f2 < f) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f471b.f475c - ((i) obj).f475c;
        }

        public String toString() {
            String str = "[ ";
            if (this.f471b != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f471b.i[i] + " ";
                }
            }
            return str + "] " + this.f471b;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.g = 128;
        this.h = new i[128];
        this.i = new i[128];
        this.j = 0;
        this.k = new b(this);
    }

    private final void e(i iVar) {
        int i;
        int i2 = this.j + 1;
        i[] iVarArr = this.h;
        if (i2 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.h = iVarArr2;
            this.i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.h;
        int i3 = this.j;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 > 1 && iVarArr3[i4 - 1].f475c > iVar.f475c) {
            int i5 = 0;
            while (true) {
                i = this.j;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new a(this));
            for (int i6 = 0; i6 < this.j; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        iVar.f473a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(i iVar) {
        int i = 0;
        while (i < this.j) {
            if (this.h[i] == iVar) {
                while (true) {
                    int i2 = this.j;
                    if (i >= i2 - 1) {
                        this.j = i2 - 1;
                        iVar.f473a = false;
                        return;
                    } else {
                        i[] iVarArr = this.h;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    @Override // android.support.constraint.n.b, android.support.constraint.n.d.a
    public i a(d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.j; i2++) {
            i iVar = this.h[i2];
            if (!zArr[iVar.f475c]) {
                this.k.a(iVar);
                b bVar = this.k;
                if (i == -1) {
                    if (bVar.a()) {
                        i = i2;
                    }
                } else if (bVar.b(this.h[i])) {
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    @Override // android.support.constraint.n.b
    public void a(d dVar, android.support.constraint.n.b bVar, boolean z) {
        i iVar = bVar.f457a;
        if (iVar == null) {
            return;
        }
        android.support.constraint.n.b.a aVar = bVar.e;
        int iB = aVar.b();
        for (int i = 0; i < iB; i++) {
            i iVarB = aVar.b(i);
            float fA = aVar.a(i);
            this.k.a(iVarB);
            if (this.k.a(iVar, fA)) {
                e(iVarB);
            }
            this.f458b += bVar.f458b * fA;
        }
        f(iVar);
    }

    @Override // android.support.constraint.n.b, android.support.constraint.n.d.a
    public void a(i iVar) {
        this.k.a(iVar);
        this.k.b();
        iVar.i[iVar.e] = 1.0f;
        e(iVar);
    }

    @Override // android.support.constraint.n.b, android.support.constraint.n.d.a
    public void clear() {
        this.j = 0;
        this.f458b = 0.0f;
    }

    @Override // android.support.constraint.n.b, android.support.constraint.n.d.a
    public boolean isEmpty() {
        return this.j == 0;
    }

    @Override // android.support.constraint.n.b
    public String toString() {
        String str = " goal -> (" + this.f458b + ") : ";
        for (int i = 0; i < this.j; i++) {
            this.k.a(this.h[i]);
            str = str + this.k + " ";
        }
        return str;
    }
}
