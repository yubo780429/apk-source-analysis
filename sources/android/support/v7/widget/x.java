package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r0 f945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r0 f946c;
    private r0 d;
    private r0 e;
    private r0 f;
    private r0 g;
    private final z h;
    private int i = 0;
    private Typeface j;
    private boolean k;

    class a extends b.b.c.a.d.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f947a;

        a(WeakReference weakReference) {
            this.f947a = weakReference;
        }

        @Override // b.b.c.a.d.f.a
        public void a(int i) {
        }

        @Override // b.b.c.a.d.f.a
        public void a(Typeface typeface) {
            x.this.a(this.f947a, typeface);
        }
    }

    x(TextView textView) {
        this.f944a = textView;
        this.h = new z(this.f944a);
    }

    private static r0 a(Context context, j jVar, int i) {
        ColorStateList colorStateListB = jVar.b(context, i);
        if (colorStateListB == null) {
            return null;
        }
        r0 r0Var = new r0();
        r0Var.d = true;
        r0Var.f913a = colorStateListB;
        return r0Var;
    }

    private void a(Context context, t0 t0Var) {
        String strD;
        Typeface typeface;
        this.i = t0Var.d(b.b.d.a.j.TextAppearance_android_textStyle, this.i);
        if (t0Var.g(b.b.d.a.j.TextAppearance_android_fontFamily) || t0Var.g(b.b.d.a.j.TextAppearance_fontFamily)) {
            this.j = null;
            int i = t0Var.g(b.b.d.a.j.TextAppearance_fontFamily) ? b.b.d.a.j.TextAppearance_fontFamily : b.b.d.a.j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceA = t0Var.a(i, this.i, new a(new WeakReference(this.f944a)));
                    this.j = typefaceA;
                    this.k = typefaceA == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.j != null || (strD = t0Var.d(i)) == null) {
                return;
            }
            this.j = Typeface.create(strD, this.i);
            return;
        }
        if (t0Var.g(b.b.d.a.j.TextAppearance_android_typeface)) {
            this.k = false;
            int iD = t0Var.d(b.b.d.a.j.TextAppearance_android_typeface, 1);
            if (iD == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (iD == 2) {
                typeface = Typeface.SERIF;
            } else if (iD != 3) {
                return;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.j = typeface;
        }
    }

    private void a(Drawable drawable, r0 r0Var) {
        if (drawable == null || r0Var == null) {
            return;
        }
        j.a(drawable, r0Var, this.f944a.getDrawableState());
    }

    private void b(int i, float f) {
        this.h.a(i, f);
    }

    void a() {
        if (this.f945b != null || this.f946c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.f944a.getCompoundDrawables();
            a(compoundDrawables[0], this.f945b);
            a(compoundDrawables[1], this.f946c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f == null && this.g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f944a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    void a(int i) {
        this.h.a(i);
    }

    void a(int i, float f) {
        if (android.support.v4.widget.b.f644a || h()) {
            return;
        }
        b(i, f);
    }

    void a(int i, int i2, int i3, int i4) {
        this.h.a(i, i2, i3, i4);
    }

    void a(Context context, int i) {
        ColorStateList colorStateListA;
        t0 t0VarA = t0.a(context, i, b.b.d.a.j.TextAppearance);
        if (t0VarA.g(b.b.d.a.j.TextAppearance_textAllCaps)) {
            a(t0VarA.a(b.b.d.a.j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && t0VarA.g(b.b.d.a.j.TextAppearance_android_textColor) && (colorStateListA = t0VarA.a(b.b.d.a.j.TextAppearance_android_textColor)) != null) {
            this.f944a.setTextColor(colorStateListA);
        }
        if (t0VarA.g(b.b.d.a.j.TextAppearance_android_textSize) && t0VarA.c(b.b.d.a.j.TextAppearance_android_textSize, -1) == 0) {
            this.f944a.setTextSize(0, 0.0f);
        }
        a(context, t0VarA);
        t0VarA.a();
        Typeface typeface = this.j;
        if (typeface != null) {
            this.f944a.setTypeface(typeface, this.i);
        }
    }

    @SuppressLint({"NewApi"})
    void a(AttributeSet attributeSet, int i) {
        boolean zA;
        boolean z;
        ColorStateList colorStateListA;
        ColorStateList colorStateListA2;
        Context context = this.f944a.getContext();
        j jVarA = j.a();
        t0 t0VarA = t0.a(context, attributeSet, b.b.d.a.j.AppCompatTextHelper, i, 0);
        int iG = t0VarA.g(b.b.d.a.j.AppCompatTextHelper_android_textAppearance, -1);
        if (t0VarA.g(b.b.d.a.j.AppCompatTextHelper_android_drawableLeft)) {
            this.f945b = a(context, jVarA, t0VarA.g(b.b.d.a.j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (t0VarA.g(b.b.d.a.j.AppCompatTextHelper_android_drawableTop)) {
            this.f946c = a(context, jVarA, t0VarA.g(b.b.d.a.j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (t0VarA.g(b.b.d.a.j.AppCompatTextHelper_android_drawableRight)) {
            this.d = a(context, jVarA, t0VarA.g(b.b.d.a.j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (t0VarA.g(b.b.d.a.j.AppCompatTextHelper_android_drawableBottom)) {
            this.e = a(context, jVarA, t0VarA.g(b.b.d.a.j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (t0VarA.g(b.b.d.a.j.AppCompatTextHelper_android_drawableStart)) {
                this.f = a(context, jVarA, t0VarA.g(b.b.d.a.j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (t0VarA.g(b.b.d.a.j.AppCompatTextHelper_android_drawableEnd)) {
                this.g = a(context, jVarA, t0VarA.g(b.b.d.a.j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        t0VarA.a();
        boolean z2 = this.f944a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z3 = true;
        ColorStateList colorStateListA3 = null;
        if (iG != -1) {
            t0 t0VarA2 = t0.a(context, iG, b.b.d.a.j.TextAppearance);
            if (z2 || !t0VarA2.g(b.b.d.a.j.TextAppearance_textAllCaps)) {
                zA = false;
                z = false;
            } else {
                zA = t0VarA2.a(b.b.d.a.j.TextAppearance_textAllCaps, false);
                z = true;
            }
            a(context, t0VarA2);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList colorStateListA4 = t0VarA2.g(b.b.d.a.j.TextAppearance_android_textColor) ? t0VarA2.a(b.b.d.a.j.TextAppearance_android_textColor) : null;
                colorStateListA2 = t0VarA2.g(b.b.d.a.j.TextAppearance_android_textColorHint) ? t0VarA2.a(b.b.d.a.j.TextAppearance_android_textColorHint) : null;
                ColorStateList colorStateList = colorStateListA4;
                colorStateListA = t0VarA2.g(b.b.d.a.j.TextAppearance_android_textColorLink) ? t0VarA2.a(b.b.d.a.j.TextAppearance_android_textColorLink) : null;
                colorStateListA3 = colorStateList;
            } else {
                colorStateListA = null;
                colorStateListA2 = null;
            }
            t0VarA2.a();
        } else {
            zA = false;
            z = false;
            colorStateListA = null;
            colorStateListA2 = null;
        }
        t0 t0VarA3 = t0.a(context, attributeSet, b.b.d.a.j.TextAppearance, i, 0);
        if (z2 || !t0VarA3.g(b.b.d.a.j.TextAppearance_textAllCaps)) {
            z3 = z;
        } else {
            zA = t0VarA3.a(b.b.d.a.j.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (t0VarA3.g(b.b.d.a.j.TextAppearance_android_textColor)) {
                colorStateListA3 = t0VarA3.a(b.b.d.a.j.TextAppearance_android_textColor);
            }
            if (t0VarA3.g(b.b.d.a.j.TextAppearance_android_textColorHint)) {
                colorStateListA2 = t0VarA3.a(b.b.d.a.j.TextAppearance_android_textColorHint);
            }
            if (t0VarA3.g(b.b.d.a.j.TextAppearance_android_textColorLink)) {
                colorStateListA = t0VarA3.a(b.b.d.a.j.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && t0VarA3.g(b.b.d.a.j.TextAppearance_android_textSize) && t0VarA3.c(b.b.d.a.j.TextAppearance_android_textSize, -1) == 0) {
            this.f944a.setTextSize(0, 0.0f);
        }
        a(context, t0VarA3);
        t0VarA3.a();
        if (colorStateListA3 != null) {
            this.f944a.setTextColor(colorStateListA3);
        }
        if (colorStateListA2 != null) {
            this.f944a.setHintTextColor(colorStateListA2);
        }
        if (colorStateListA != null) {
            this.f944a.setLinkTextColor(colorStateListA);
        }
        if (!z2 && z3) {
            a(zA);
        }
        Typeface typeface = this.j;
        if (typeface != null) {
            this.f944a.setTypeface(typeface, this.i);
        }
        this.h.a(attributeSet, i);
        if (android.support.v4.widget.b.f644a && this.h.f() != 0) {
            int[] iArrE = this.h.e();
            if (iArrE.length > 0) {
                if (this.f944a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f944a.setAutoSizeTextTypeUniformWithConfiguration(this.h.c(), this.h.b(), this.h.d(), 0);
                } else {
                    this.f944a.setAutoSizeTextTypeUniformWithPresetSizes(iArrE, 0);
                }
            }
        }
        t0 t0VarA4 = t0.a(context, attributeSet, b.b.d.a.j.AppCompatTextView);
        int iC = t0VarA4.c(b.b.d.a.j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int iC2 = t0VarA4.c(b.b.d.a.j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int iC3 = t0VarA4.c(b.b.d.a.j.AppCompatTextView_lineHeight, -1);
        t0VarA4.a();
        if (iC != -1) {
            android.support.v4.widget.l.a(this.f944a, iC);
        }
        if (iC2 != -1) {
            android.support.v4.widget.l.b(this.f944a, iC2);
        }
        if (iC3 != -1) {
            android.support.v4.widget.l.c(this.f944a, iC3);
        }
    }

    void a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.k) {
            this.j = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.i);
            }
        }
    }

    void a(boolean z) {
        this.f944a.setAllCaps(z);
    }

    void a(boolean z, int i, int i2, int i3, int i4) {
        if (android.support.v4.widget.b.f644a) {
            return;
        }
        b();
    }

    void a(int[] iArr, int i) {
        this.h.a(iArr, i);
    }

    void b() {
        this.h.a();
    }

    int c() {
        return this.h.b();
    }

    int d() {
        return this.h.c();
    }

    int e() {
        return this.h.d();
    }

    int[] f() {
        return this.h.e();
    }

    int g() {
        return this.h.f();
    }

    boolean h() {
        return this.h.g();
    }
}
