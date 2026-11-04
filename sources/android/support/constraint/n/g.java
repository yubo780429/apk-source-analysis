package android.support.constraint.n;

/* JADX INFO: loaded from: classes.dex */
class g<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f470b;

    g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f469a = new Object[i];
    }

    @Override // android.support.constraint.n.f
    public T a() {
        int i = this.f470b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f469a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f470b = i - 1;
        return t;
    }

    @Override // android.support.constraint.n.f
    public void a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f470b;
            Object[] objArr = this.f469a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f470b = i3 + 1;
            }
        }
    }

    @Override // android.support.constraint.n.f
    public boolean a(T t) {
        int i = this.f470b;
        Object[] objArr = this.f469a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f470b = i + 1;
        return true;
    }
}
