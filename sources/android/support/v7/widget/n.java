package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r0 f893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r0 f894c;
    private r0 d;

    public n(ImageView imageView) {
        this.f892a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new r0();
        }
        r0 r0Var = this.d;
        r0Var.a();
        ColorStateList colorStateListA = android.support.v4.widget.g.a(this.f892a);
        if (colorStateListA != null) {
            r0Var.d = true;
            r0Var.f913a = colorStateListA;
        }
        PorterDuff.Mode modeB = android.support.v4.widget.g.b(this.f892a);
        if (modeB != null) {
            r0Var.f915c = true;
            r0Var.f914b = modeB;
        }
        if (!r0Var.d && !r0Var.f915c) {
            return false;
        }
        j.a(drawable, r0Var, this.f892a.getDrawableState());
        return true;
    }

    private boolean e() {
        int i = Build.VERSION.SDK_INT;
        if (i > 21) {
            return this.f893b != null;
        }
        return i == 21;
    }

    void a() {
        Drawable drawable = this.f892a.getDrawable();
        if (drawable != null) {
            c0.b(drawable);
        }
        if (drawable != null) {
            if (e() && a(drawable)) {
                return;
            }
            r0 r0Var = this.f894c;
            if (r0Var != null) {
                j.a(drawable, r0Var, this.f892a.getDrawableState());
                return;
            }
            r0 r0Var2 = this.f893b;
            if (r0Var2 != null) {
                j.a(drawable, r0Var2, this.f892a.getDrawableState());
            }
        }
    }

    public void a(int i) {
        if (i != 0) {
            Drawable drawableC = b.b.d.b.a.a.c(this.f892a.getContext(), i);
            if (drawableC != null) {
                c0.b(drawableC);
            }
            this.f892a.setImageDrawable(drawableC);
        } else {
            this.f892a.setImageDrawable(null);
        }
        a();
    }

    void a(ColorStateList colorStateList) {
        if (this.f894c == null) {
            this.f894c = new r0();
        }
        r0 r0Var = this.f894c;
        r0Var.f913a = colorStateList;
        r0Var.d = true;
        a();
    }

    void a(PorterDuff.Mode mode) {
        if (this.f894c == null) {
            this.f894c = new r0();
        }
        r0 r0Var = this.f894c;
        r0Var.f914b = mode;
        r0Var.f915c = true;
        a();
    }

    public void a(AttributeSet attributeSet, int i) {
        int iG;
        t0 t0VarA = t0.a(this.f892a.getContext(), attributeSet, b.b.d.a.j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f892a.getDrawable();
            if (drawable == null && (iG = t0VarA.g(b.b.d.a.j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = b.b.d.b.a.a.c(this.f892a.getContext(), iG)) != null) {
                this.f892a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                c0.b(drawable);
            }
            if (t0VarA.g(b.b.d.a.j.AppCompatImageView_tint)) {
                android.support.v4.widget.g.a(this.f892a, t0VarA.a(b.b.d.a.j.AppCompatImageView_tint));
            }
            if (t0VarA.g(b.b.d.a.j.AppCompatImageView_tintMode)) {
                android.support.v4.widget.g.a(this.f892a, c0.a(t0VarA.d(b.b.d.a.j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            t0VarA.a();
        }
    }

    ColorStateList b() {
        r0 r0Var = this.f894c;
        if (r0Var != null) {
            return r0Var.f913a;
        }
        return null;
    }

    PorterDuff.Mode c() {
        r0 r0Var = this.f894c;
        if (r0Var != null) {
            return r0Var.f914b;
        }
        return null;
    }

    boolean d() {
        return Build.VERSION.SDK_INT < 21 || !(this.f892a.getBackground() instanceof RippleDrawable);
    }
}
