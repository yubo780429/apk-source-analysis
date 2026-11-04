package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f879a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f880b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f881c = Integer.MIN_VALUE;
    private int d = Integer.MIN_VALUE;
    private int e = 0;
    private int f = 0;
    private boolean g = false;
    private boolean h = false;

    l0() {
    }

    public int a() {
        return this.g ? this.f879a : this.f880b;
    }

    public void a(int i, int i2) {
        this.h = false;
        if (i != Integer.MIN_VALUE) {
            this.e = i;
            this.f879a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f = i2;
            this.f880b = i2;
        }
    }

    public void a(boolean z) {
        int i;
        if (z == this.g) {
            return;
        }
        this.g = z;
        if (this.h) {
            if (z) {
                int i2 = this.d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.e;
                }
                this.f879a = i2;
                i = this.f881c;
                if (i == Integer.MIN_VALUE) {
                }
            } else {
                int i3 = this.f881c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.e;
                }
                this.f879a = i3;
                i = this.d;
                if (i == Integer.MIN_VALUE) {
                }
            }
            this.f880b = i;
        }
        this.f879a = this.e;
        i = this.f;
        this.f880b = i;
    }

    public int b() {
        return this.f879a;
    }

    public void b(int i, int i2) {
        this.f881c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f879a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f880b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f879a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f880b = i2;
        }
    }

    public int c() {
        return this.f880b;
    }

    public int d() {
        return this.g ? this.f880b : this.f879a;
    }
}
