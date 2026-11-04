package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f922c;

    private t0(Context context, TypedArray typedArray) {
        this.f920a = context;
        this.f921b = typedArray;
    }

    public static t0 a(Context context, int i, int[] iArr) {
        return new t0(context, context.obtainStyledAttributes(i, iArr));
    }

    public static t0 a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new t0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static t0 a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new t0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public float a(int i, float f) {
        return this.f921b.getFloat(i, f);
    }

    public int a(int i, int i2) {
        return this.f921b.getColor(i, i2);
    }

    public ColorStateList a(int i) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!this.f921b.hasValue(i) || (resourceId = this.f921b.getResourceId(i, 0)) == 0 || (colorStateListB = b.b.d.b.a.a.b(this.f920a, resourceId)) == null) ? this.f921b.getColorStateList(i) : colorStateListB;
    }

    public Typeface a(int i, int i2, b.b.c.a.d.f.a aVar) {
        int resourceId = this.f921b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f922c == null) {
            this.f922c = new TypedValue();
        }
        return b.b.c.a.d.f.a(this.f920a, resourceId, this.f922c, i2, aVar);
    }

    public void a() {
        this.f921b.recycle();
    }

    public boolean a(int i, boolean z) {
        return this.f921b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.f921b.getDimensionPixelOffset(i, i2);
    }

    public Drawable b(int i) {
        int resourceId;
        return (!this.f921b.hasValue(i) || (resourceId = this.f921b.getResourceId(i, 0)) == 0) ? this.f921b.getDrawable(i) : b.b.d.b.a.a.c(this.f920a, resourceId);
    }

    public int c(int i, int i2) {
        return this.f921b.getDimensionPixelSize(i, i2);
    }

    public Drawable c(int i) {
        int resourceId;
        if (!this.f921b.hasValue(i) || (resourceId = this.f921b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return j.a().a(this.f920a, resourceId, true);
    }

    public int d(int i, int i2) {
        return this.f921b.getInt(i, i2);
    }

    public String d(int i) {
        return this.f921b.getString(i);
    }

    public int e(int i, int i2) {
        return this.f921b.getInteger(i, i2);
    }

    public CharSequence e(int i) {
        return this.f921b.getText(i);
    }

    public int f(int i, int i2) {
        return this.f921b.getLayoutDimension(i, i2);
    }

    public CharSequence[] f(int i) {
        return this.f921b.getTextArray(i);
    }

    public int g(int i, int i2) {
        return this.f921b.getResourceId(i, i2);
    }

    public boolean g(int i) {
        return this.f921b.hasValue(i);
    }
}
