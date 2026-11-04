package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
class v extends r {
    private final SeekBar d;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;

    v(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    private void d() {
        if (this.e != null) {
            if (this.h || this.i) {
                Drawable drawableG = android.support.v4.graphics.drawable.a.g(this.e.mutate());
                this.e = drawableG;
                if (this.h) {
                    android.support.v4.graphics.drawable.a.a(drawableG, this.f);
                }
                if (this.i) {
                    android.support.v4.graphics.drawable.a.a(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    void a(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void a(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.d);
            android.support.v4.graphics.drawable.a.a(drawable, b.b.c.g.q.d(this.d));
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            d();
        }
        this.d.invalidate();
    }

    @Override // android.support.v7.widget.r
    void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        t0 t0VarA = t0.a(this.d.getContext(), attributeSet, b.b.d.a.j.AppCompatSeekBar, i, 0);
        Drawable drawableC = t0VarA.c(b.b.d.a.j.AppCompatSeekBar_android_thumb);
        if (drawableC != null) {
            this.d.setThumb(drawableC);
        }
        a(t0VarA.b(b.b.d.a.j.AppCompatSeekBar_tickMark));
        if (t0VarA.g(b.b.d.a.j.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = c0.a(t0VarA.d(b.b.d.a.j.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if (t0VarA.g(b.b.d.a.j.AppCompatSeekBar_tickMarkTint)) {
            this.f = t0VarA.a(b.b.d.a.j.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        t0VarA.a();
        d();
    }

    void b() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
