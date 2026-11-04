package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import b.b.c.g.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int s = ViewConfiguration.getTapTimeout();
    final View d;
    private Runnable e;
    private int h;
    private int i;
    private boolean m;
    boolean n;
    boolean o;
    boolean p;
    private boolean q;
    private boolean r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C0029a f638b = new C0029a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Interpolator f639c = new AccelerateInterpolator();
    private float[] f = {0.0f, 0.0f};
    private float[] g = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] j = {0.0f, 0.0f};
    private float[] k = {0.0f, 0.0f};
    private float[] l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: android.support.v4.widget.a$a, reason: collision with other inner class name */
    private static class C0029a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f642c;
        private float d;
        private float j;
        private int k;
        private long e = Long.MIN_VALUE;
        private long i = -1;
        private long f = 0;
        private int g = 0;
        private int h = 0;

        C0029a() {
        }

        private float a(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        private float a(long j) {
            if (j < this.e) {
                return 0.0f;
            }
            long j2 = this.i;
            if (j2 < 0 || j < j2) {
                return a.a((j - this.e) / this.f640a, 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.j;
            return (1.0f - f) + (f * a.a(j3 / this.k, 0.0f, 1.0f));
        }

        public void a() {
            if (this.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fA = a(a(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f;
            this.f = jCurrentAnimationTimeMillis;
            float f = j * fA;
            this.g = (int) (this.f642c * f);
            this.h = (int) (f * this.d);
        }

        public void a(float f, float f2) {
            this.f642c = f;
            this.d = f2;
        }

        public void a(int i) {
            this.f641b = i;
        }

        public int b() {
            return this.g;
        }

        public void b(int i) {
            this.f640a = i;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f = this.f642c;
            return (int) (f / Math.abs(f));
        }

        public int e() {
            float f = this.d;
            return (int) (f / Math.abs(f));
        }

        public boolean f() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public void g() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.a((int) (jCurrentAnimationTimeMillis - this.e), 0, this.f641b);
            this.j = a(jCurrentAnimationTimeMillis);
            this.i = jCurrentAnimationTimeMillis;
        }

        public void h() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = jCurrentAnimationTimeMillis;
            this.i = -1L;
            this.f = jCurrentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.p) {
                if (aVar.n) {
                    aVar.n = false;
                    aVar.f638b.h();
                }
                C0029a c0029a = a.this.f638b;
                if (c0029a.f() || !a.this.b()) {
                    a.this.p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.o) {
                    aVar2.o = false;
                    aVar2.a();
                }
                c0029a.a();
                a.this.a(c0029a.b(), c0029a.c());
                q.a(a.this.d, this);
            }
        }
    }

    public a(View view) {
        this.d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        b(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        c(f3, f3);
        d(1);
        a(Float.MAX_VALUE, Float.MAX_VALUE);
        d(0.2f, 0.2f);
        e(1.0f, 1.0f);
        c(s);
        f(500);
        e(500);
    }

    static float a(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    private float a(float f, float f2, float f3, float f4) {
        float interpolation;
        float fA = a(f * f2, 0.0f, f3);
        float f5 = f(f2 - f4, fA) - f(f4, fA);
        if (f5 < 0.0f) {
            interpolation = -this.f639c.getInterpolation(-f5);
        } else {
            if (f5 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f639c.getInterpolation(f5);
        }
        return a(interpolation, -1.0f, 1.0f);
    }

    private float a(int i, float f, float f2, float f3) {
        float fA = a(this.f[i], f2, this.g[i], f);
        if (fA == 0.0f) {
            return 0.0f;
        }
        float f4 = this.j[i];
        float f5 = this.k[i];
        float f6 = this.l[i];
        float f7 = f4 * f3;
        return fA > 0.0f ? a(fA * f7, f5, f6) : -a((-fA) * f7, f5, f6);
    }

    static int a(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    private void c() {
        if (this.n) {
            this.p = false;
        } else {
            this.f638b.g();
        }
    }

    private void d() {
        int i;
        if (this.e == null) {
            this.e = new b();
        }
        this.p = true;
        this.n = true;
        if (this.m || (i = this.i) <= 0) {
            this.e.run();
        } else {
            q.a(this.d, this.e, i);
        }
        this.m = true;
    }

    private float f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.p && this.h == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public a a(float f, float f2) {
        float[] fArr = this.g;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public a a(boolean z) {
        if (this.q && !z) {
            c();
        }
        this.q = z;
        return this;
    }

    void a() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.d.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void a(int i, int i2);

    public abstract boolean a(int i);

    public a b(float f, float f2) {
        float[] fArr = this.l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    boolean b() {
        C0029a c0029a = this.f638b;
        int iE = c0029a.e();
        int iD = c0029a.d();
        return (iE != 0 && b(iE)) || (iD != 0 && a(iD));
    }

    public abstract boolean b(int i);

    public a c(float f, float f2) {
        float[] fArr = this.k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public a c(int i) {
        this.i = i;
        return this;
    }

    public a d(float f, float f2) {
        float[] fArr = this.f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public a d(int i) {
        this.h = i;
        return this;
    }

    public a e(float f, float f2) {
        float[] fArr = this.j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public a e(int i) {
        this.f638b.a(i);
        return this;
    }

    public a f(int i) {
        this.f638b.b(i);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.q) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                c();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    c();
                }
            }
            return this.r && this.p;
        }
        this.o = true;
        this.m = false;
        this.f638b.a(a(0, motionEvent.getX(), view.getWidth(), this.d.getWidth()), a(1, motionEvent.getY(), view.getHeight(), this.d.getHeight()));
        if (!this.p && b()) {
            d();
        }
        if (this.r) {
            return false;
        }
    }
}
