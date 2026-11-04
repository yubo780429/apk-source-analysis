package b.b.c.f;

/* JADX INFO: loaded from: classes.dex */
public class l<E> implements Cloneable {
    private static final Object f = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f1098c;
    private Object[] d;
    private int e;

    public l() {
        this(10);
    }

    public l(int i) {
        this.f1097b = false;
        if (i == 0) {
            this.f1098c = c.f1075a;
            this.d = c.f1077c;
        } else {
            int iB = c.b(i);
            this.f1098c = new int[iB];
            this.d = new Object[iB];
        }
        this.e = 0;
    }

    private void c() {
        int i = this.e;
        int[] iArr = this.f1098c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1097b = false;
        this.e = i2;
    }

    public void a() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.f1097b = false;
    }

    public void a(int i) {
        int iA = c.a(this.f1098c, this.e, i);
        if (iA >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[iA];
            Object obj2 = f;
            if (obj != obj2) {
                objArr[iA] = obj2;
                this.f1097b = true;
            }
        }
    }

    public void a(int i, E e) {
        int i2 = this.e;
        if (i2 != 0 && i <= this.f1098c[i2 - 1]) {
            c(i, e);
            return;
        }
        if (this.f1097b && this.e >= this.f1098c.length) {
            c();
        }
        int i3 = this.e;
        if (i3 >= this.f1098c.length) {
            int iB = c.b(i3 + 1);
            int[] iArr = new int[iB];
            Object[] objArr = new Object[iB];
            int[] iArr2 = this.f1098c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1098c = iArr;
            this.d = objArr;
        }
        this.f1098c[i3] = i;
        this.d[i3] = e;
        this.e = i3 + 1;
    }

    public int b() {
        if (this.f1097b) {
            c();
        }
        return this.e;
    }

    public E b(int i) {
        return b(i, null);
    }

    public E b(int i, E e) {
        int iA = c.a(this.f1098c, this.e, i);
        if (iA >= 0) {
            Object[] objArr = this.d;
            if (objArr[iA] != f) {
                return (E) objArr[iA];
            }
        }
        return e;
    }

    public int c(int i) {
        if (this.f1097b) {
            c();
        }
        return this.f1098c[i];
    }

    public void c(int i, E e) {
        int iA = c.a(this.f1098c, this.e, i);
        if (iA >= 0) {
            this.d[iA] = e;
            return;
        }
        int i2 = ~iA;
        if (i2 < this.e) {
            Object[] objArr = this.d;
            if (objArr[i2] == f) {
                this.f1098c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f1097b && this.e >= this.f1098c.length) {
            c();
            i2 = ~c.a(this.f1098c, this.e, i);
        }
        int i3 = this.e;
        if (i3 >= this.f1098c.length) {
            int iB = c.b(i3 + 1);
            int[] iArr = new int[iB];
            Object[] objArr2 = new Object[iB];
            int[] iArr2 = this.f1098c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1098c = iArr;
            this.d = objArr2;
        }
        int i4 = this.e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f1098c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.e - i2);
        }
        this.f1098c[i2] = i;
        this.d[i2] = e;
        this.e++;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public l<E> m2clone() {
        try {
            l<E> lVar = (l) super.clone();
            lVar.f1098c = (int[]) this.f1098c.clone();
            lVar.d = (Object[]) this.d.clone();
            return lVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public void d(int i) {
        a(i);
    }

    public E e(int i) {
        if (this.f1097b) {
            c();
        }
        return (E) this.d[i];
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
            sb.append(c(i));
            sb.append('=');
            E e = e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
