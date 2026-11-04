package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f900a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f901b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f902c = {R.attr.state_focused};
    static final int[] d = {R.attr.state_pressed};
    static final int[] e = {R.attr.state_checked};
    static final int[] f = new int[0];
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        ColorStateList colorStateListC = c(context, i);
        if (colorStateListC != null && colorStateListC.isStateful()) {
            return colorStateListC.getColorForState(f901b, colorStateListC.getDefaultColor());
        }
        TypedValue typedValueA = a();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueA, true);
        return a(context, i, typedValueA.getFloat());
    }

    static int a(Context context, int i, float f2) {
        int iB = b(context, i);
        return b.b.c.b.a.c(iB, Math.round(Color.alpha(iB) * f2));
    }

    private static TypedValue a() {
        TypedValue typedValue = f900a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f900a.set(typedValue2);
        return typedValue2;
    }

    public static int b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        t0 t0VarA = t0.a(context, (AttributeSet) null, iArr);
        try {
            return t0VarA.a(0, 0);
        } finally {
            t0VarA.a();
        }
    }

    public static ColorStateList c(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        t0 t0VarA = t0.a(context, (AttributeSet) null, iArr);
        try {
            return t0VarA.a(0);
        } finally {
            t0VarA.a();
        }
    }
}
