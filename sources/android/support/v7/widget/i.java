package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f871b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f872c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    i(CompoundButton compoundButton) {
        this.f870a = compoundButton;
    }

    int a(int i) {
        Drawable drawableA;
        return (Build.VERSION.SDK_INT >= 17 || (drawableA = android.support.v4.widget.c.a(this.f870a)) == null) ? i : i + drawableA.getIntrinsicWidth();
    }

    void a() {
        Drawable drawableA = android.support.v4.widget.c.a(this.f870a);
        if (drawableA != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = android.support.v4.graphics.drawable.a.g(drawableA).mutate();
                if (this.d) {
                    android.support.v4.graphics.drawable.a.a(drawableMutate, this.f871b);
                }
                if (this.e) {
                    android.support.v4.graphics.drawable.a.a(drawableMutate, this.f872c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f870a.getDrawableState());
                }
                this.f870a.setButtonDrawable(drawableMutate);
            }
        }
    }

    void a(ColorStateList colorStateList) {
        this.f871b = colorStateList;
        this.d = true;
        a();
    }

    void a(PorterDuff.Mode mode) {
        this.f872c = mode;
        this.e = true;
        a();
    }

    void a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f870a.getContext().obtainStyledAttributes(attributeSet, b.b.d.a.j.CompoundButton, i, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.CompoundButton_android_button) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(b.b.d.a.j.CompoundButton_android_button, 0)) != 0) {
                this.f870a.setButtonDrawable(b.b.d.b.a.a.c(this.f870a.getContext(), resourceId));
            }
            if (typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.CompoundButton_buttonTint)) {
                android.support.v4.widget.c.a(this.f870a, typedArrayObtainStyledAttributes.getColorStateList(b.b.d.a.j.CompoundButton_buttonTint));
            }
            if (typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.CompoundButton_buttonTintMode)) {
                android.support.v4.widget.c.a(this.f870a, c0.a(typedArrayObtainStyledAttributes.getInt(b.b.d.a.j.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    ColorStateList b() {
        return this.f871b;
    }

    PorterDuff.Mode c() {
        return this.f872c;
    }

    void d() {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            a();
        }
    }
}
