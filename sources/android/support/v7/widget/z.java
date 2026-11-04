package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class z {
    private static final RectF k = new RectF();
    private static ConcurrentHashMap<String, Method> l = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f956a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f957b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f958c = -1.0f;
    private float d = -1.0f;
    private float e = -1.0f;
    private int[] f = new int[0];
    private boolean g = false;
    private TextPaint h;
    private final TextView i;
    private final Context j;

    z(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
    }

    private int a(RectF rectF) {
        int length = this.f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 0;
        int i2 = 1;
        int i3 = length - 1;
        while (true) {
            int i4 = i2;
            int i5 = i;
            i = i4;
            while (i <= i3) {
                int i6 = (i + i3) / 2;
                if (a(this.f[i6], rectF)) {
                    i2 = i6 + 1;
                } else {
                    i5 = i6 - 1;
                    i3 = i5;
                }
            }
            return this.f[i5];
        }
    }

    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        float fFloatValue;
        float fFloatValue2;
        boolean zBooleanValue;
        if (Build.VERSION.SDK_INT >= 16) {
            fFloatValue = this.i.getLineSpacingMultiplier();
            fFloatValue2 = this.i.getLineSpacingExtra();
            zBooleanValue = this.i.getIncludeFontPadding();
        } else {
            fFloatValue = ((Float) a(this.i, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            fFloatValue2 = ((Float) a(this.i, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            zBooleanValue = ((Boolean) a(this.i, "getIncludeFontPadding", true)).booleanValue();
        }
        return new StaticLayout(charSequence, this.h, i, alignment, fFloatValue, fFloatValue2, zBooleanValue);
    }

    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) a(this.i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.h, i).setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    private <T> T a(Object obj, String str, T t) {
        try {
            return (T) a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    private Method a(String str) {
        try {
            Method declaredMethod = l.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                l.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    private void a(float f) {
        if (f != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f);
            boolean zIsInLayout = Build.VERSION.SDK_INT >= 18 ? this.i.isInLayout() : false;
            if (this.i.getLayout() != null) {
                this.f957b = false;
                try {
                    Method methodA = a("nullLayouts");
                    if (methodA != null) {
                        methodA.invoke(this.i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    this.i.forceLayout();
                } else {
                    this.i.requestLayout();
                }
                this.i.invalidate();
            }
        }
    }

    private void a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f956a = 1;
        this.d = f;
        this.e = f2;
        this.f958c = f3;
        this.g = false;
    }

    private void a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f = a(iArr);
            j();
        }
    }

    private boolean a(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.i)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.i.getMaxLines() : -1;
        TextPaint textPaint = this.h;
        if (textPaint == null) {
            this.h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize(i);
        Layout.Alignment alignment = (Layout.Alignment) a(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        StaticLayout staticLayoutA = Build.VERSION.SDK_INT >= 23 ? a(text, alignment, Math.round(rectF.right), maxLines) : a(text, alignment, Math.round(rectF.right));
        return (maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && ((float) staticLayoutA.getHeight()) <= rectF.bottom;
    }

    private int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    private void h() {
        this.f956a = 0;
        this.d = -1.0f;
        this.e = -1.0f;
        this.f958c = -1.0f;
        this.f = new int[0];
        this.f957b = false;
    }

    private boolean i() {
        if (k() && this.f956a == 1) {
            if (!this.g || this.f.length == 0) {
                float fRound = Math.round(this.d);
                int i = 1;
                while (Math.round(this.f958c + fRound) <= Math.round(this.e)) {
                    i++;
                    fRound += this.f958c;
                }
                int[] iArr = new int[i];
                float f = this.d;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f958c;
                }
                this.f = a(iArr);
            }
            this.f957b = true;
        } else {
            this.f957b = false;
        }
        return this.f957b;
    }

    private boolean j() {
        int length = this.f.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.f956a = 1;
            int[] iArr = this.f;
            this.d = iArr[0];
            this.e = iArr[length - 1];
            this.f958c = -1.0f;
        }
        return this.g;
    }

    private boolean k() {
        return !(this.i instanceof k);
    }

    void a() {
        if (g()) {
            if (this.f957b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = ((Boolean) a(this.i, "getHorizontallyScrolling", false)).booleanValue() ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (k) {
                    k.setEmpty();
                    k.right = measuredWidth;
                    k.bottom = height;
                    float fA = a(k);
                    if (fA != this.i.getTextSize()) {
                        a(0, fA);
                    }
                }
            }
            this.f957b = true;
        }
    }

    void a(int i) {
        if (k()) {
            if (i == 0) {
                h();
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (i()) {
                a();
            }
        }
    }

    void a(int i, float f) {
        Context context = this.j;
        a(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    void a(int i, int i2, int i3, int i4) {
        if (k()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (i()) {
                a();
            }
        }
    }

    void a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.j.obtainStyledAttributes(attributeSet, b.b.d.a.j.AppCompatTextView, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.AppCompatTextView_autoSizeTextType)) {
            this.f956a = typedArrayObtainStyledAttributes.getInt(b.b.d.a.j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes.getDimension(b.b.d.a.j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes.getDimension(b.b.d.a.j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes.getDimension(b.b.d.a.j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.AppCompatTextView_autoSizePresetSizes) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(b.b.d.a.j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            a(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!k()) {
            this.f956a = 0;
            return;
        }
        if (this.f956a == 1) {
            if (!this.g) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                a(dimension2, dimension3, dimension);
            }
            i();
        }
    }

    void a(int[] iArr, int i) {
        if (k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f = a(iArrCopyOf);
                if (!j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.g = false;
            }
            if (i()) {
                a();
            }
        }
    }

    int b() {
        return Math.round(this.e);
    }

    int c() {
        return Math.round(this.d);
    }

    int d() {
        return Math.round(this.f958c);
    }

    int[] e() {
        return this.f;
    }

    int f() {
        return this.f956a;
    }

    boolean g() {
        return k() && this.f956a != 0;
    }
}
