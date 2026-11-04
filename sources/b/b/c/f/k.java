package b.b.c.f;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k<K, V> {
    static Object[] e;
    static int f;
    static Object[] g;
    static int h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f1095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object[] f1096c;
    int d;

    public k() {
        this.f1095b = c.f1075a;
        this.f1096c = c.f1077c;
        this.d = 0;
    }

    public k(int i) {
        if (i == 0) {
            this.f1095b = c.f1075a;
            this.f1096c = c.f1077c;
        } else {
            e(i);
        }
        this.d = 0;
    }

    private static int a(int[] iArr, int i, int i2) {
        try {
            return c.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (a.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (a.class) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        }
    }

    private void e(int i) {
        if (i == 8) {
            synchronized (a.class) {
                if (g != null) {
                    Object[] objArr = g;
                    this.f1096c = objArr;
                    g = (Object[]) objArr[0];
                    this.f1095b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (a.class) {
                if (e != null) {
                    Object[] objArr2 = e;
                    this.f1096c = objArr2;
                    e = (Object[]) objArr2[0];
                    this.f1095b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f--;
                    return;
                }
            }
        }
        this.f1095b = new int[i];
        this.f1096c = new Object[i << 1];
    }

    int a() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int iA = a(this.f1095b, i, 0);
        if (iA < 0 || this.f1096c[iA << 1] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.f1095b[i2] == 0) {
            if (this.f1096c[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.f1095b[i3] == 0; i3--) {
            if (this.f1096c[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    int a(Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int iA = a(this.f1095b, i2, i);
        if (iA < 0 || obj.equals(this.f1096c[iA << 1])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.f1095b[i3] == i) {
            if (obj.equals(this.f1096c[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.f1095b[i4] == i; i4--) {
            if (obj.equals(this.f1096c[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public V a(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f1096c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public void a(int i) {
        int i2 = this.d;
        int[] iArr = this.f1095b;
        if (iArr.length < i) {
            Object[] objArr = this.f1096c;
            e(i);
            if (this.d > 0) {
                System.arraycopy(iArr, 0, this.f1095b, 0, i2);
                System.arraycopy(objArr, 0, this.f1096c, 0, i2 << 1);
            }
            a(iArr, objArr, i2);
        }
        if (this.d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    int b(Object obj) {
        int i = this.d * 2;
        Object[] objArr = this.f1096c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public K b(int i) {
        return (K) this.f1096c[i << 1];
    }

    public V c(int i) {
        Object[] objArr = this.f1096c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.d;
        int i4 = 0;
        if (i3 <= 1) {
            a(this.f1095b, objArr, i3);
            this.f1095b = c.f1075a;
            this.f1096c = c.f1077c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f1095b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.f1095b;
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr2 = this.f1096c;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f1096c;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                int i9 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr3 = this.f1095b;
                Object[] objArr4 = this.f1096c;
                e(i9);
                if (i3 != this.d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f1095b, 0, i);
                    System.arraycopy(objArr4, 0, this.f1096c, 0, i2);
                }
                if (i < i5) {
                    int i10 = i + 1;
                    int i11 = i5 - i;
                    System.arraycopy(iArr3, i10, this.f1095b, i, i11);
                    System.arraycopy(objArr4, i10 << 1, this.f1096c, i2, i11 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.d) {
            throw new ConcurrentModificationException();
        }
        this.d = i4;
        return v;
    }

    public void clear() {
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f1095b;
            Object[] objArr = this.f1096c;
            this.f1095b = c.f1075a;
            this.f1096c = c.f1077c;
            this.d = 0;
            a(iArr, objArr, i);
        }
        if (this.d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public V d(int i) {
        return (V) this.f1096c[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (size() != kVar.size()) {
                return false;
            }
            for (int i = 0; i < this.d; i++) {
                try {
                    K kB = b(i);
                    V vD = d(i);
                    Object obj2 = kVar.get(kB);
                    if (vD == null) {
                        if (obj2 != null || !kVar.containsKey(kB)) {
                            return false;
                        }
                    } else if (!vD.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.d; i2++) {
                try {
                    K kB2 = b(i2);
                    V vD2 = d(i2);
                    Object obj3 = map.get(kB2);
                    if (vD2 == null) {
                        if (obj3 != null || !map.containsKey(kB2)) {
                            return false;
                        }
                    } else if (!vD2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int iA = a(obj);
        if (iA >= 0) {
            return (V) this.f1096c[(iA << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f1095b;
        Object[] objArr = this.f1096c;
        int i = this.d;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.d <= 0;
    }

    public V put(K k, V v) {
        int i;
        int iA;
        int i2 = this.d;
        if (k == null) {
            iA = a();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iA = a(k, iHashCode);
        }
        if (iA >= 0) {
            int i3 = (iA << 1) + 1;
            Object[] objArr = this.f1096c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~iA;
        if (i2 >= this.f1095b.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f1095b;
            Object[] objArr2 = this.f1096c;
            e(i5);
            if (i2 != this.d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1095b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1096c, 0, objArr2.length);
            }
            a(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f1095b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f1096c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.d - i4) << 1);
        }
        int i7 = this.d;
        if (i2 == i7) {
            int[] iArr4 = this.f1095b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f1096c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int iA = a(obj);
        if (iA >= 0) {
            return c(iA);
        }
        return null;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kB = b(i);
            if (kB != this) {
                sb.append(kB);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vD = d(i);
            if (vD != this) {
                sb.append(vD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
