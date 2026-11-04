package b.b.c.f;

/* JADX INFO: loaded from: classes.dex */
public class f<E> implements Cloneable {
    private static final Object f = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f1081c;
    private Object[] d;
    private int e;

    public f() {
        this(10);
    }

    public f(int i) {
        this.f1080b = false;
        if (i == 0) {
            this.f1081c = c.f1076b;
            this.d = c.f1077c;
        } else {
            int iC = c.c(i);
            this.f1081c = new long[iC];
            this.d = new Object[iC];
        }
        this.e = 0;
    }

    private void c() {
        int i = this.e;
        long[] jArr = this.f1081c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1080b = false;
        this.e = i2;
    }

    public long a(int i) {
        if (this.f1080b) {
            c();
        }
        return this.f1081c[i];
    }

    public void a() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.f1080b = false;
    }

    public void a(long j) {
        int iA = c.a(this.f1081c, this.e, j);
        if (iA >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[iA];
            Object obj2 = f;
            if (obj != obj2) {
                objArr[iA] = obj2;
                this.f1080b = true;
            }
        }
    }

    public void a(long j, E e) {
        int i = this.e;
        if (i != 0 && j <= this.f1081c[i - 1]) {
            c(j, e);
            return;
        }
        if (this.f1080b && this.e >= this.f1081c.length) {
            c();
        }
        int i2 = this.e;
        if (i2 >= this.f1081c.length) {
            int iC = c.c(i2 + 1);
            long[] jArr = new long[iC];
            Object[] objArr = new Object[iC];
            long[] jArr2 = this.f1081c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1081c = jArr;
            this.d = objArr;
        }
        this.f1081c[i2] = j;
        this.d[i2] = e;
        this.e = i2 + 1;
    }

    public int b() {
        if (this.f1080b) {
            c();
        }
        return this.e;
    }

    public E b(int i) {
        if (this.f1080b) {
            c();
        }
        return (E) this.d[i];
    }

    public E b(long j) {
        return b(j, null);
    }

    public E b(long j, E e) {
        int iA = c.a(this.f1081c, this.e, j);
        if (iA >= 0) {
            Object[] objArr = this.d;
            if (objArr[iA] != f) {
                return (E) objArr[iA];
            }
        }
        return e;
    }

    public void c(long j, E e) {
        int iA = c.a(this.f1081c, this.e, j);
        if (iA >= 0) {
            this.d[iA] = e;
            return;
        }
        int i = ~iA;
        if (i < this.e) {
            Object[] objArr = this.d;
            if (objArr[i] == f) {
                this.f1081c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f1080b && this.e >= this.f1081c.length) {
            c();
            i = ~c.a(this.f1081c, this.e, j);
        }
        int i2 = this.e;
        if (i2 >= this.f1081c.length) {
            int iC = c.c(i2 + 1);
            long[] jArr = new long[iC];
            Object[] objArr2 = new Object[iC];
            long[] jArr2 = this.f1081c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1081c = jArr;
            this.d = objArr2;
        }
        int i3 = this.e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f1081c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i, objArr4, i4, this.e - i);
        }
        this.f1081c[i] = j;
        this.d[i] = e;
        this.e++;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public f<E> m1clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f1081c = (long[]) this.f1081c.clone();
            fVar.d = (Object[]) this.d.clone();
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            E eB = b(i);
            if (eB != this) {
                sb.append(eB);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
