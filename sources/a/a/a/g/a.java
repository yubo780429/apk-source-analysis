package a.a.a.g;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f256c;
    public int d;
    public int e;
    public int f;
    public long g;
    public int h;
    public char i;
    public int j;
    public int k;
    public int l;
    public String m;
    public String n;
    public String o;

    public a() {
        this.f254a = -1;
        this.f255b = -1L;
        this.f256c = -1;
        this.d = -1;
        this.e = Integer.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = 0L;
        this.h = -1;
        this.i = '0';
        this.j = Integer.MAX_VALUE;
        this.k = 0;
        this.l = 0;
        this.m = null;
        this.n = null;
        this.o = null;
        this.g = System.currentTimeMillis();
    }

    public a(int i, long j, int i2, int i3, int i4, char c2, int i5) {
        this.f254a = -1;
        this.f255b = -1L;
        this.f256c = -1;
        this.d = -1;
        this.e = Integer.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = 0L;
        this.h = -1;
        this.i = '0';
        this.j = Integer.MAX_VALUE;
        this.k = 0;
        this.l = 0;
        this.m = null;
        this.n = null;
        this.o = null;
        this.f254a = i;
        this.f255b = j;
        this.f256c = i2;
        this.d = i3;
        this.h = i4;
        this.i = c2;
        this.g = System.currentTimeMillis();
        this.j = i5;
    }

    public a(a aVar) {
        this(aVar.f254a, aVar.f255b, aVar.f256c, aVar.d, aVar.h, aVar.i, aVar.j);
        this.g = aVar.g;
        this.m = aVar.m;
        this.k = aVar.k;
        this.o = aVar.o;
        this.l = aVar.l;
        this.n = aVar.n;
    }

    public boolean a() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.g;
        return jCurrentTimeMillis > 0 && jCurrentTimeMillis < 3000;
    }

    public boolean a(a aVar) {
        if (this.f254a != aVar.f254a || this.f255b != aVar.f255b || this.d != aVar.d || this.f256c != aVar.f256c) {
            return false;
        }
        String str = this.n;
        if (str == null || !str.equals(aVar.n)) {
            return this.n == null && aVar.n == null;
        }
        return true;
    }

    public boolean b() {
        return this.f254a == -1 && this.f255b == -1 && this.d == -1 && this.f256c == -1;
    }

    public boolean c() {
        return this.f254a > -1 && this.f255b > -1 && this.d == -1 && this.f256c == -1;
    }

    public boolean d() {
        return this.f254a > -1 && this.f255b > -1 && this.d > -1 && this.f256c > -1;
    }

    public boolean e() {
        return this.f254a > -1 && this.f255b > 0;
    }
}
