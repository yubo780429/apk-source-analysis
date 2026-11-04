package com.baidu.location;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public int A;
    public int B;
    public boolean C;
    public a D;
    public String E;
    public int F;
    public String G;
    public String H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1372c;
    public int d;
    public int e;
    public String f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public b v;
    public int w;
    public float x;
    public int y;
    public int z;

    public enum a {
        SPEED_IN_FIRST_LOC,
        ACCURACY_IN_FIRST_LOC
    }

    public enum b {
        Hight_Accuracy,
        Battery_Saving,
        Device_Sensors,
        Fuzzy_Locating
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1377a;

        static {
            int[] iArr = new int[b.values().length];
            f1377a = iArr;
            try {
                iArr[b.Hight_Accuracy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1377a[b.Battery_Saving.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1377a[b.Device_Sensors.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1377a[b.Fuzzy_Locating.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public i() {
        this.f1370a = "gcj02";
        this.f1371b = "noaddr";
        this.f1372c = false;
        this.d = 0;
        this.e = 12000;
        this.f = "SDK6.0";
        this.g = 1;
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = "com.baidu.location.service_v2.9";
        this.l = true;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = true;
        this.u = false;
        this.w = 0;
        this.x = 0.5f;
        this.y = 0;
        this.z = 0;
        this.A = Integer.MAX_VALUE;
        this.B = 1;
        this.C = false;
        this.D = a.SPEED_IN_FIRST_LOC;
        this.E = null;
        this.F = -1;
        this.G = null;
        this.H = null;
    }

    public i(i iVar) {
        this.f1370a = "gcj02";
        this.f1371b = "noaddr";
        this.f1372c = false;
        this.d = 0;
        this.e = 12000;
        this.f = "SDK6.0";
        this.g = 1;
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = "com.baidu.location.service_v2.9";
        this.l = true;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = true;
        this.u = false;
        this.w = 0;
        this.x = 0.5f;
        this.y = 0;
        this.z = 0;
        this.A = Integer.MAX_VALUE;
        this.B = 1;
        this.C = false;
        this.D = a.SPEED_IN_FIRST_LOC;
        this.E = null;
        this.F = -1;
        this.G = null;
        this.H = null;
        this.f1370a = iVar.f1370a;
        this.f1371b = iVar.f1371b;
        this.f1372c = iVar.f1372c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f = iVar.f;
        this.g = iVar.g;
        this.h = iVar.h;
        this.k = iVar.k;
        this.i = iVar.i;
        this.l = iVar.l;
        this.m = iVar.m;
        this.j = iVar.j;
        this.v = iVar.v;
        this.o = iVar.o;
        this.p = iVar.p;
        this.q = iVar.q;
        this.r = iVar.r;
        this.n = iVar.n;
        this.s = iVar.s;
        this.w = iVar.w;
        this.x = iVar.x;
        this.y = iVar.y;
        this.z = iVar.z;
        this.A = iVar.A;
        this.t = iVar.t;
        this.u = iVar.u;
        this.B = iVar.B;
        this.C = iVar.C;
        this.D = iVar.D;
        this.E = iVar.E;
        this.F = iVar.F;
        this.G = iVar.G;
        this.H = iVar.H;
    }

    public float a() {
        return this.x;
    }

    public void a(int i) {
        if (i >= 0) {
            this.d = i;
        }
    }

    public void a(b bVar) {
        int i = c.f1377a[bVar.ordinal()];
        if (i == 1) {
            this.f1372c = true;
            this.g = 1;
        } else if (i == 2) {
            this.f1372c = false;
            this.g = 3;
        } else if (i == 3) {
            this.g = 2;
            this.f1372c = true;
        } else {
            if (i != 4) {
                throw new IllegalArgumentException("Illegal this mode : " + bVar);
            }
            this.g = 4;
            this.f1372c = false;
        }
        this.v = bVar;
    }

    public void a(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("gcj02") || lowerCase.equals("bd09") || lowerCase.equals("bd09ll")) {
            this.f1370a = lowerCase;
        }
    }

    public void a(boolean z) {
        this.s = z;
    }

    public boolean a(i iVar) {
        return this.f1370a.equals(iVar.f1370a) && this.f1371b.equals(iVar.f1371b) && this.f1372c == iVar.f1372c && this.d == iVar.d && this.e == iVar.e && this.f.equals(iVar.f) && this.h == iVar.h && this.g == iVar.g && this.i == iVar.i && this.l == iVar.l && this.t == iVar.t && this.m == iVar.m && this.o == iVar.o && this.p == iVar.p && this.q == iVar.q && this.r == iVar.r && this.n == iVar.n && this.w == iVar.w && this.x == iVar.x && this.y == iVar.y && this.z == iVar.z && this.A == iVar.A && this.u == iVar.u && this.B == iVar.B && this.C == iVar.C && this.s == iVar.s && this.v == iVar.v && this.j == iVar.j && this.D == iVar.D;
    }

    public int b() {
        return this.w;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public String c() {
        return this.f1371b;
    }

    public void c(boolean z) {
        this.f1372c = z;
    }

    public int d() {
        return this.z;
    }

    public int e() {
        return this.y;
    }

    public String f() {
        return this.f1370a;
    }

    public int g() {
        return this.d;
    }

    public boolean h() {
        return this.i;
    }

    public boolean i() {
        return this.u;
    }
}
