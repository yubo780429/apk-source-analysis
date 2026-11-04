package android.support.v7.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f851c;
    private final int d;
    final View e;
    private Runnable f;
    private Runnable g;
    private boolean h;
    private int i;
    private final int[] j = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = f0.this.e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.this.d();
        }
    }

    public f0(View view) {
        this.e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f850b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f851c = tapTimeout;
        this.d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private boolean a(MotionEvent motionEvent) {
        d0 d0Var;
        View view = this.e;
        android.support.v7.view.menu.s sVarA = a();
        if (sVarA == null || !sVarA.a() || (d0Var = (d0) sVarA.b()) == null || !d0Var.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        a(view, motionEventObtainNoHistory);
        b(d0Var, motionEventObtainNoHistory);
        boolean zA = d0Var.a(motionEventObtainNoHistory, this.i);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zA && (actionMasked != 1 && actionMasked != 3);
    }

    private static boolean a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean a(View view, MotionEvent motionEvent) {
        int[] iArr = this.j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean b(MotionEvent motionEvent) {
        View view = this.e;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.i = motionEvent.getPointerId(0);
            if (this.f == null) {
                this.f = new a();
            }
            view.postDelayed(this.f, this.f851c);
            if (this.g == null) {
                this.g = new b();
            }
            view.postDelayed(this.g, this.d);
        } else if (actionMasked == 1) {
            e();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.i);
            if (iFindPointerIndex >= 0 && !a(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f850b)) {
                e();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            e();
        }
        return false;
    }

    private boolean b(View view, MotionEvent motionEvent) {
        int[] iArr = this.j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    private void e() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f;
        if (runnable2 != null) {
            this.e.removeCallbacks(runnable2);
        }
    }

    public abstract android.support.v7.view.menu.s a();

    protected abstract boolean b();

    protected boolean c() {
        android.support.v7.view.menu.s sVarA = a();
        if (sVarA == null || !sVarA.a()) {
            return true;
        }
        sVarA.dismiss();
        return true;
    }

    void d() {
        e();
        View view = this.e;
        if (view.isEnabled() && !view.isLongClickable() && b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.h = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.h;
        if (z2) {
            z = a(motionEvent) || !c();
        } else {
            z = b(motionEvent) && b();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.e.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.h = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.i = -1;
        Runnable runnable = this.f;
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
        }
    }
}
