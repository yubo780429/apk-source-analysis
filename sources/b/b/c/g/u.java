package b.b.c.g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<View> f1126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Runnable f1127b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Runnable f1128c = null;
    int d = -1;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f1129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1130b;

        a(u uVar, v vVar, View view) {
            this.f1129a = vVar;
            this.f1130b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1129a.c(this.f1130b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1129a.a(this.f1130b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1129a.b(this.f1130b);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f1131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1132b;

        b(u uVar, x xVar, View view) {
            this.f1131a = xVar;
            this.f1132b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f1131a.a(this.f1132b);
        }
    }

    static class c implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        u f1133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f1134b;

        c(u uVar) {
            this.f1133a = uVar;
        }

        @Override // b.b.c.g.v
        public void a(View view) {
            int i = this.f1133a.d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f1133a.d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f1134b) {
                u uVar = this.f1133a;
                Runnable runnable = uVar.f1128c;
                if (runnable != null) {
                    uVar.f1128c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                v vVar = tag instanceof v ? (v) tag : null;
                if (vVar != null) {
                    vVar.a(view);
                }
                this.f1134b = true;
            }
        }

        @Override // b.b.c.g.v
        public void b(View view) {
            this.f1134b = false;
            if (this.f1133a.d > -1) {
                view.setLayerType(2, null);
            }
            u uVar = this.f1133a;
            Runnable runnable = uVar.f1127b;
            if (runnable != null) {
                uVar.f1127b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            v vVar = tag instanceof v ? (v) tag : null;
            if (vVar != null) {
                vVar.b(view);
            }
        }

        @Override // b.b.c.g.v
        public void c(View view) {
            Object tag = view.getTag(2113929216);
            v vVar = tag instanceof v ? (v) tag : null;
            if (vVar != null) {
                vVar.c(view);
            }
        }
    }

    u(View view) {
        this.f1126a = new WeakReference<>(view);
    }

    private void a(View view, v vVar) {
        if (vVar != null) {
            view.animate().setListener(new a(this, vVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public u a(float f) {
        View view = this.f1126a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public u a(long j) {
        View view = this.f1126a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public u a(Interpolator interpolator) {
        View view = this.f1126a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public u a(v vVar) {
        View view = this.f1126a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, vVar);
                vVar = new c(this);
            }
            a(view, vVar);
        }
        return this;
    }

    public u a(x xVar) {
        View view = this.f1126a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(xVar != null ? new b(this, xVar, view) : null);
        }
        return this;
    }

    public void a() {
        View view = this.f1126a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long b() {
        View view = this.f1126a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public u b(float f) {
        View view = this.f1126a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public u b(long j) {
        View view = this.f1126a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public void c() {
        View view = this.f1126a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
