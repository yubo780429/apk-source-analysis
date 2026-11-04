package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f845a;
    private r0 d;
    private r0 e;
    private r0 f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f847c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f846b = j.a();

    e(View view) {
        this.f845a = view;
    }

    private boolean b(Drawable drawable) {
        if (this.f == null) {
            this.f = new r0();
        }
        r0 r0Var = this.f;
        r0Var.a();
        ColorStateList colorStateListB = b.b.c.g.q.b(this.f845a);
        if (colorStateListB != null) {
            r0Var.d = true;
            r0Var.f913a = colorStateListB;
        }
        PorterDuff.Mode modeC = b.b.c.g.q.c(this.f845a);
        if (modeC != null) {
            r0Var.f915c = true;
            r0Var.f914b = modeC;
        }
        if (!r0Var.d && !r0Var.f915c) {
            return false;
        }
        j.a(drawable, r0Var, this.f845a.getDrawableState());
        return true;
    }

    private boolean d() {
        int i = Build.VERSION.SDK_INT;
        if (i > 21) {
            return this.d != null;
        }
        return i == 21;
    }

    void a() {
        Drawable background = this.f845a.getBackground();
        if (background != null) {
            if (d() && b(background)) {
                return;
            }
            r0 r0Var = this.e;
            if (r0Var != null) {
                j.a(background, r0Var, this.f845a.getDrawableState());
                return;
            }
            r0 r0Var2 = this.d;
            if (r0Var2 != null) {
                j.a(background, r0Var2, this.f845a.getDrawableState());
            }
        }
    }

    void a(int i) {
        this.f847c = i;
        j jVar = this.f846b;
        a(jVar != null ? jVar.b(this.f845a.getContext(), i) : null);
        a();
    }

    void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new r0();
            }
            r0 r0Var = this.d;
            r0Var.f913a = colorStateList;
            r0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    void a(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new r0();
        }
        r0 r0Var = this.e;
        r0Var.f914b = mode;
        r0Var.f915c = true;
        a();
    }

    void a(Drawable drawable) {
        this.f847c = -1;
        a((ColorStateList) null);
        a();
    }

    void a(AttributeSet attributeSet, int i) {
        t0 t0VarA = t0.a(this.f845a.getContext(), attributeSet, b.b.d.a.j.ViewBackgroundHelper, i, 0);
        try {
            if (t0VarA.g(b.b.d.a.j.ViewBackgroundHelper_android_background)) {
                this.f847c = t0VarA.g(b.b.d.a.j.ViewBackgroundHelper_android_background, -1);
                ColorStateList colorStateListB = this.f846b.b(this.f845a.getContext(), this.f847c);
                if (colorStateListB != null) {
                    a(colorStateListB);
                }
            }
            if (t0VarA.g(b.b.d.a.j.ViewBackgroundHelper_backgroundTint)) {
                b.b.c.g.q.a(this.f845a, t0VarA.a(b.b.d.a.j.ViewBackgroundHelper_backgroundTint));
            }
            if (t0VarA.g(b.b.d.a.j.ViewBackgroundHelper_backgroundTintMode)) {
                b.b.c.g.q.a(this.f845a, c0.a(t0VarA.d(b.b.d.a.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            t0VarA.a();
        }
    }

    ColorStateList b() {
        r0 r0Var = this.e;
        if (r0Var != null) {
            return r0Var.f913a;
        }
        return null;
    }

    void b(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new r0();
        }
        r0 r0Var = this.e;
        r0Var.f913a = colorStateList;
        r0Var.d = true;
        a();
    }

    PorterDuff.Mode c() {
        r0 r0Var = this.e;
        if (r0Var != null) {
            return r0Var.f914b;
        }
        return null;
    }
}
