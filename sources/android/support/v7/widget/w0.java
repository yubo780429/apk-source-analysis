package android.support.v7.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
class w0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static w0 k;
    private static w0 l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f941c;
    private final int d;
    private final Runnable e = new a();
    private final Runnable f = new b();
    private int g;
    private int h;
    private x0 i;
    private boolean j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w0.this.a(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w0.this.a();
        }
    }

    private w0(View view, CharSequence charSequence) {
        this.f940b = view;
        this.f941c = charSequence;
        this.d = b.b.c.g.r.a(ViewConfiguration.get(view.getContext()));
        c();
        this.f940b.setOnLongClickListener(this);
        this.f940b.setOnHoverListener(this);
    }

    private static void a(w0 w0Var) {
        w0 w0Var2 = k;
        if (w0Var2 != null) {
            w0Var2.b();
        }
        k = w0Var;
        if (w0Var != null) {
            w0Var.d();
        }
    }

    public static void a(View view, CharSequence charSequence) {
        w0 w0Var = k;
        if (w0Var != null && w0Var.f940b == view) {
            a((w0) null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new w0(view, charSequence);
            return;
        }
        w0 w0Var2 = l;
        if (w0Var2 != null && w0Var2.f940b == view) {
            w0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.g) <= this.d && Math.abs(y - this.h) <= this.d) {
            return false;
        }
        this.g = x;
        this.h = y;
        return true;
    }

    private void b() {
        this.f940b.removeCallbacks(this.e);
    }

    private void c() {
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }

    private void d() {
        this.f940b.postDelayed(this.e, ViewConfiguration.getLongPressTimeout());
    }

    void a() {
        if (l == this) {
            l = null;
            x0 x0Var = this.i;
            if (x0Var != null) {
                x0Var.a();
                this.i = null;
                c();
                this.f940b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            a((w0) null);
        }
        this.f940b.removeCallbacks(this.f);
    }

    void a(boolean z) {
        long longPressTimeout;
        if (b.b.c.g.q.j(this.f940b)) {
            a((w0) null);
            w0 w0Var = l;
            if (w0Var != null) {
                w0Var.a();
            }
            l = this;
            this.j = z;
            x0 x0Var = new x0(this.f940b.getContext());
            this.i = x0Var;
            x0Var.a(this.f940b, this.g, this.h, this.j, this.f941c);
            this.f940b.addOnAttachStateChangeListener(this);
            if (this.j) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((b.b.c.g.q.g(this.f940b) & 1) == 1 ? 3000L : 15000L) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f940b.removeCallbacks(this.f);
            this.f940b.postDelayed(this.f, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.i != null && this.j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f940b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                a();
            }
        } else if (this.f940b.isEnabled() && this.i == null && a(motionEvent)) {
            a(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.g = view.getWidth() / 2;
        this.h = view.getHeight() / 2;
        a(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
