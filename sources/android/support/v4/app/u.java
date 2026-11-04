package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
class u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver f620c;
    private final Runnable d;

    private u(View view, Runnable runnable) {
        this.f619b = view;
        this.f620c = view.getViewTreeObserver();
        this.d = runnable;
    }

    public static u a(View view, Runnable runnable) {
        u uVar = new u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(uVar);
        view.addOnAttachStateChangeListener(uVar);
        return uVar;
    }

    public void a() {
        (this.f620c.isAlive() ? this.f620c : this.f619b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f619b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        a();
        this.d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f620c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
