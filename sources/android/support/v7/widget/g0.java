package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f856c;
    private int d;
    private int e;
    private int f;
    private int g;
    private float h;
    private boolean i;
    private int[] j;
    private int[] k;
    private Drawable l;
    private int m;
    private int n;
    private int o;
    private int p;

    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f858b;

        public a(int i, int i2) {
            super(i, i2);
            this.f858b = -1;
            this.f857a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f858b = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.d.a.j.LinearLayoutCompat_Layout);
            this.f857a = typedArrayObtainStyledAttributes.getFloat(b.b.d.a.j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f858b = typedArrayObtainStyledAttributes.getInt(b.b.d.a.j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f858b = -1;
        }
    }

    public g0(Context context) {
        this(context, null);
    }

    public g0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f855b = true;
        this.f856c = -1;
        this.d = 0;
        this.f = 8388659;
        t0 t0VarA = t0.a(context, attributeSet, b.b.d.a.j.LinearLayoutCompat, i, 0);
        int iD = t0VarA.d(b.b.d.a.j.LinearLayoutCompat_android_orientation, -1);
        if (iD >= 0) {
            setOrientation(iD);
        }
        int iD2 = t0VarA.d(b.b.d.a.j.LinearLayoutCompat_android_gravity, -1);
        if (iD2 >= 0) {
            setGravity(iD2);
        }
        boolean zA = t0VarA.a(b.b.d.a.j.LinearLayoutCompat_android_baselineAligned, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.h = t0VarA.a(b.b.d.a.j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f856c = t0VarA.d(b.b.d.a.j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.i = t0VarA.a(b.b.d.a.j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(t0VarA.b(b.b.d.a.j.LinearLayoutCompat_divider));
        this.o = t0VarA.d(b.b.d.a.j.LinearLayoutCompat_showDividers, 0);
        this.p = t0VarA.c(b.b.d.a.j.LinearLayoutCompat_dividerPadding, 0);
        t0VarA.a();
    }

    private void a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    private void c(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewA = a(i3);
            if (viewA.getVisibility() != 8) {
                a aVar = (a) viewA.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = viewA.getMeasuredWidth();
                    measureChildWithMargins(viewA, i2, 0, iMakeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i4;
                }
            }
        }
    }

    private void d(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewA = a(i3);
            if (viewA.getVisibility() != 8) {
                a aVar = (a) viewA.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = viewA.getMeasuredHeight();
                    measureChildWithMargins(viewA, iMakeMeasureSpec, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i4;
                }
            }
        }
    }

    int a(View view) {
        return 0;
    }

    int a(View view, int i) {
        return 0;
    }

    View a(int i) {
        return getChildAt(i);
    }

    /* JADX WARN: Code duplicated, block: B:169:0x03b4 A[PHI: r3
  0x03b4: PHI (r3v36 int) = (r3v32 int), (r3v37 int) binds: [B:168:0x03b2, B:164:0x03a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:198:0x0442  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:70:0x0195  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d9  */
    void a(int i, int i2) {
        int[] iArr;
        int i3;
        int iMax;
        int iMax2;
        int i4;
        int i5;
        int baseline;
        int i6;
        int i7;
        byte b2;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        View view;
        int iMax3;
        int i10;
        boolean z3;
        int i11;
        int measuredHeight;
        int iA;
        int baseline2;
        int i12;
        this.g = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.j == null || this.k == null) {
            this.j = new int[4];
            this.k = new int[4];
        }
        int[] iArr2 = this.j;
        int[] iArr3 = this.k;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z4 = this.f855b;
        boolean z5 = this.i;
        int i13 = 1073741824;
        boolean z6 = mode == 1073741824;
        int iA2 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        int iMax6 = 0;
        int iMax7 = 0;
        boolean z7 = false;
        int iCombineMeasuredStates = 0;
        boolean z8 = false;
        boolean z9 = true;
        float f = 0.0f;
        while (true) {
            iArr = iArr3;
            if (iA2 >= virtualChildCount) {
                break;
            }
            View viewA = a(iA2);
            if (viewA == null) {
                this.g += c(iA2);
            } else {
                if (viewA.getVisibility() == 8) {
                    iA2 += a(viewA, iA2);
                } else {
                    if (b(iA2)) {
                        this.g += this.m;
                    }
                    a aVar = (a) viewA.getLayoutParams();
                    float f2 = aVar.f857a;
                    float f3 = f + f2;
                    if (mode == i13 && ((ViewGroup.MarginLayoutParams) aVar).width == 0 && f2 > 0.0f) {
                        int i14 = this.g;
                        this.g = z6 ? i14 + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : Math.max(i14, ((ViewGroup.MarginLayoutParams) aVar).leftMargin + i14 + ((ViewGroup.MarginLayoutParams) aVar).rightMargin);
                        if (z4) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i9 = iA2;
                            z = z5;
                            z2 = z4;
                            view = viewA;
                        } else {
                            i9 = iA2;
                            z = z5;
                            z2 = z4;
                            view = viewA;
                            z7 = true;
                            i10 = 1073741824;
                        }
                        if (mode2 == i10 && ((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                            z3 = true;
                            z8 = true;
                        } else {
                            z3 = false;
                        }
                        i11 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i11;
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        if (z2 && (baseline2 = view.getBaseline()) != -1) {
                            i12 = aVar.f858b;
                            if (i12 < 0) {
                                i12 = this.f;
                            }
                            int i15 = (((i12 & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay) >> 4) & (-2)) >> 1;
                            iArr2[i15] = Math.max(iArr2[i15], baseline2);
                            iArr[i15] = Math.max(iArr[i15], measuredHeight - baseline2);
                        }
                        iMax5 = Math.max(iMax5, measuredHeight);
                        if (z9 || ((ViewGroup.MarginLayoutParams) aVar).height != -1) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (aVar.f857a > 0.0f) {
                            if (!z3) {
                                i11 = measuredHeight;
                            }
                            iMax7 = Math.max(iMax7, i11);
                        } else {
                            int i16 = iMax7;
                            if (!z3) {
                                i11 = measuredHeight;
                            }
                            iMax6 = Math.max(iMax6, i11);
                            iMax7 = i16;
                        }
                        int i17 = i9;
                        iA = a(view, i17) + i17;
                        f = f3;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) aVar).width != 0 || aVar.f857a <= 0.0f) {
                            b2 = -2;
                            i8 = Integer.MIN_VALUE;
                        } else {
                            b2 = -2;
                            ((ViewGroup.MarginLayoutParams) aVar).width = -2;
                            i8 = 0;
                        }
                        i9 = iA2;
                        int i18 = i8;
                        z = z5;
                        z2 = z4;
                        a(viewA, i9, i, f3 == 0.0f ? this.g : 0, i2, 0);
                        if (i18 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) aVar).width = i18;
                        }
                        int measuredWidth = viewA.getMeasuredWidth();
                        if (z6) {
                            view = viewA;
                            iMax3 = this.g + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + b(view);
                        } else {
                            view = viewA;
                            int i19 = this.g;
                            iMax3 = Math.max(i19, i19 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + b(view));
                        }
                        this.g = iMax3;
                        if (z) {
                            iMax4 = Math.max(measuredWidth, iMax4);
                        }
                    }
                    i10 = 1073741824;
                    if (mode2 == i10) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    i11 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i11;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z2) {
                        i12 = aVar.f858b;
                        if (i12 < 0) {
                            i12 = this.f;
                        }
                        int i110 = (((i12 & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay) >> 4) & (-2)) >> 1;
                        iArr2[i110] = Math.max(iArr2[i110], baseline2);
                        iArr[i110] = Math.max(iArr[i110], measuredHeight - baseline2);
                    }
                    iMax5 = Math.max(iMax5, measuredHeight);
                    if (z9) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (aVar.f857a > 0.0f) {
                        if (!z3) {
                            i11 = measuredHeight;
                        }
                        iMax7 = Math.max(iMax7, i11);
                    } else {
                        int i111 = iMax7;
                        if (!z3) {
                            i11 = measuredHeight;
                        }
                        iMax6 = Math.max(iMax6, i11);
                        iMax7 = i111;
                    }
                    int i112 = i9;
                    iA = a(view, i112) + i112;
                    f = f3;
                }
                int i20 = iA + 1;
                iArr3 = iArr;
                z5 = z;
                z4 = z2;
                i13 = i10;
                iA2 = i20;
            }
            z = z5;
            z2 = z4;
            int i21 = i13;
            iA = iA2;
            i10 = i21;
            int i22 = iA + 1;
            iArr3 = iArr;
            z5 = z;
            z4 = z2;
            i13 = i10;
            iA2 = i22;
        }
        boolean z10 = z5;
        boolean z11 = z4;
        int i23 = iMax5;
        int i24 = iMax6;
        int i25 = iMax7;
        int i26 = iCombineMeasuredStates;
        if (this.g > 0 && b(virtualChildCount)) {
            this.g += this.m;
        }
        int iMax8 = (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i23 : Math.max(i23, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z10 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.g = 0;
            int iA3 = 0;
            while (iA3 < virtualChildCount) {
                View viewA2 = a(iA3);
                if (viewA2 == null) {
                    this.g += c(iA3);
                } else if (viewA2.getVisibility() == 8) {
                    iA3 += a(viewA2, iA3);
                } else {
                    a aVar2 = (a) viewA2.getLayoutParams();
                    int i27 = this.g;
                    if (z6) {
                        this.g = i27 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + iMax4 + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin + b(viewA2);
                    } else {
                        this.g = Math.max(i27, i27 + iMax4 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin + b(viewA2));
                    }
                    iA3++;
                    iMax8 = iMax8;
                }
                iA3++;
                iMax8 = iMax8;
            }
        }
        int i28 = iMax8;
        int paddingLeft = this.g + getPaddingLeft() + getPaddingRight();
        this.g = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
        int i29 = (16777215 & iResolveSizeAndState) - this.g;
        if (z7 || (i29 != 0 && f > 0.0f)) {
            float f4 = this.h;
            if (f4 > 0.0f) {
                f = f4;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.g = 0;
            int i30 = i24;
            int iMax9 = -1;
            int iCombineMeasuredStates2 = i26;
            int i31 = 0;
            while (i31 < virtualChildCount) {
                View viewA3 = a(i31);
                if (viewA3 == null || viewA3.getVisibility() == 8) {
                    i4 = i29;
                    virtualChildCount = virtualChildCount;
                } else {
                    a aVar3 = (a) viewA3.getLayoutParams();
                    float f5 = aVar3.f857a;
                    if (f5 > 0.0f) {
                        int measuredWidth2 = (int) ((i29 * f5) / f);
                        float f6 = f - f5;
                        int i32 = i29 - measuredWidth2;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin, ((ViewGroup.MarginLayoutParams) aVar3).height);
                        if (((ViewGroup.MarginLayoutParams) aVar3).width == 0) {
                            i7 = 1073741824;
                            if (mode == 1073741824) {
                                if (measuredWidth2 <= 0) {
                                    measuredWidth2 = 0;
                                }
                            }
                            viewA3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i7), childMeasureSpec);
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewA3.getMeasuredState() & (-16777216));
                            f = f6;
                            i4 = i32;
                        } else {
                            i7 = 1073741824;
                        }
                        measuredWidth2 = viewA3.getMeasuredWidth() + measuredWidth2;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewA3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i7), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewA3.getMeasuredState() & (-16777216));
                        f = f6;
                        i4 = i32;
                    } else {
                        i4 = i29;
                    }
                    int i33 = this.g;
                    if (z6) {
                        this.g = i33 + viewA3.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + b(viewA3);
                    } else {
                        this.g = Math.max(i33, viewA3.getMeasuredWidth() + i33 + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + b(viewA3));
                    }
                    boolean z12 = mode2 != 1073741824 && ((ViewGroup.MarginLayoutParams) aVar3).height == -1;
                    int i34 = ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewA3.getMeasuredHeight() + i34;
                    iMax9 = Math.max(iMax9, measuredHeight2);
                    if (!z12) {
                        i34 = measuredHeight2;
                    }
                    int iMax10 = Math.max(i30, i34);
                    if (z9) {
                        i5 = -1;
                        boolean z13 = ((ViewGroup.MarginLayoutParams) aVar3).height == -1;
                        if (z11 && (baseline = viewA3.getBaseline()) != i5) {
                            i6 = aVar3.f858b;
                            if (i6 < 0) {
                                i6 = this.f;
                            }
                            int i35 = (((i6 & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay) >> 4) & (-2)) >> 1;
                            iArr2[i35] = Math.max(iArr2[i35], baseline);
                            iArr[i35] = Math.max(iArr[i35], measuredHeight2 - baseline);
                        }
                        z9 = z13;
                        i30 = iMax10;
                        f = f;
                    } else {
                        i5 = -1;
                    }
                    if (z11) {
                        i6 = aVar3.f858b;
                        if (i6 < 0) {
                            i6 = this.f;
                        }
                        int i36 = (((i6 & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay) >> 4) & (-2)) >> 1;
                        iArr2[i36] = Math.max(iArr2[i36], baseline);
                        iArr[i36] = Math.max(iArr[i36], measuredHeight2 - baseline);
                    }
                    z9 = z13;
                    i30 = iMax10;
                    f = f;
                }
                i31++;
                i29 = i4;
                virtualChildCount = virtualChildCount;
            }
            i3 = virtualChildCount;
            this.g += getPaddingLeft() + getPaddingRight();
            iMax = (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax9 : Math.max(iMax9, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            iMax2 = i30;
            i26 = iCombineMeasuredStates2;
        } else {
            iMax2 = Math.max(i24, i25);
            if (z10 && mode != 1073741824) {
                for (int i37 = 0; i37 < virtualChildCount; i37++) {
                    View viewA4 = a(i37);
                    if (viewA4 != null && viewA4.getVisibility() != 8 && ((a) viewA4.getLayoutParams()).f857a > 0.0f) {
                        viewA4.measure(View.MeasureSpec.makeMeasureSpec(iMax4, 1073741824), View.MeasureSpec.makeMeasureSpec(viewA4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = virtualChildCount;
            iMax = i28;
        }
        if (z9 || mode2 == 1073741824) {
            iMax2 = iMax;
        }
        setMeasuredDimension(iResolveSizeAndState | (i26 & (-16777216)), View.resolveSizeAndState(Math.max(iMax2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i26 << 16));
        if (z8) {
            c(i3, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    void a(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        boolean z;
        int baseline;
        int i7;
        int i8;
        int measuredHeight;
        boolean zA = z0.a(this);
        int paddingTop = getPaddingTop();
        int i9 = i4 - i2;
        int paddingBottom = i9 - getPaddingBottom();
        int paddingBottom2 = (i9 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i10 = this.f;
        int i11 = i10 & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay;
        boolean z2 = this.f855b;
        int[] iArr = this.j;
        int[] iArr2 = this.k;
        int iA = b.b.c.g.d.a(8388615 & i10, b.b.c.g.q.d(this));
        boolean z3 = true;
        if (iA != 1) {
            paddingLeft = iA != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.g;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.g) / 2);
        }
        if (zA) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int iA2 = 0;
        while (iA2 < virtualChildCount) {
            int i12 = i5 + (i6 * iA2);
            View viewA = a(i12);
            if (viewA == null) {
                paddingLeft += c(i12);
                z = z3;
            } else {
                if (viewA.getVisibility() != 8) {
                    int measuredWidth = viewA.getMeasuredWidth();
                    int measuredHeight2 = viewA.getMeasuredHeight();
                    a aVar = (a) viewA.getLayoutParams();
                    int i13 = iA2;
                    if (z2) {
                        virtualChildCount = virtualChildCount;
                        baseline = ((ViewGroup.MarginLayoutParams) aVar).height != -1 ? viewA.getBaseline() : -1;
                        i7 = aVar.f858b;
                        if (i7 < 0) {
                            i7 = i11;
                        }
                        i8 = i7 & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay;
                        i11 = i11;
                        if (i8 != 16) {
                            if (i8 != 48) {
                                measuredHeight = ((ViewGroup.MarginLayoutParams) aVar).topMargin + paddingTop;
                                if (baseline != -1) {
                                    z = true;
                                    measuredHeight += iArr[1] - baseline;
                                }
                            } else if (i8 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                measuredHeight = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight -= iArr2[2] - (viewA.getMeasuredHeight() - baseline);
                                }
                            }
                            z = true;
                        } else {
                            z = true;
                            measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((ViewGroup.MarginLayoutParams) aVar).topMargin) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        }
                        if (b(i12)) {
                            paddingLeft += this.m;
                        }
                        int i14 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                        paddingTop = paddingTop;
                        a(viewA, i14 + a(viewA), measuredHeight, measuredWidth, measuredHeight2);
                        int iB = i14 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + b(viewA);
                        iA2 = i13 + a(viewA, i12);
                        paddingLeft = iB;
                    } else {
                        virtualChildCount = virtualChildCount;
                    }
                    i7 = aVar.f858b;
                    if (i7 < 0) {
                        i7 = i11;
                    }
                    i8 = i7 & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay;
                    i11 = i11;
                    if (i8 != 16) {
                        if (i8 != 48) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) aVar).topMargin + paddingTop;
                            if (baseline != -1) {
                                z = true;
                                measuredHeight += iArr[1] - baseline;
                            }
                        } else if (i8 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (viewA.getMeasuredHeight() - baseline);
                            }
                        }
                        z = true;
                    } else {
                        z = true;
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((ViewGroup.MarginLayoutParams) aVar).topMargin) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                    }
                    if (b(i12)) {
                        paddingLeft += this.m;
                    }
                    int i15 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                    paddingTop = paddingTop;
                    a(viewA, i15 + a(viewA), measuredHeight, measuredWidth, measuredHeight2);
                    int iB2 = i15 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + b(viewA);
                    iA2 = i13 + a(viewA, i12);
                    paddingLeft = iB2;
                } else {
                    z = true;
                }
                iA2++;
                virtualChildCount = virtualChildCount;
                i11 = i11;
                z3 = z;
                paddingTop = paddingTop;
            }
            iA2++;
            virtualChildCount = virtualChildCount;
            i11 = i11;
            z3 = z;
            paddingTop = paddingTop;
        }
    }

    void a(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zA = z0.a(this);
        for (int i = 0; i < virtualChildCount; i++) {
            View viewA = a(i);
            if (viewA != null && viewA.getVisibility() != 8 && b(i)) {
                a aVar = (a) viewA.getLayoutParams();
                b(canvas, zA ? viewA.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (viewA.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.m);
            }
        }
        if (b(virtualChildCount)) {
            View viewA2 = a(virtualChildCount - 1);
            if (viewA2 != null) {
                a aVar2 = (a) viewA2.getLayoutParams();
                if (zA) {
                    left = viewA2.getLeft();
                    paddingRight = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    right = (left - paddingRight) - this.m;
                } else {
                    right = viewA2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.m;
            }
            b(canvas, right);
        }
    }

    void a(Canvas canvas, int i) {
        this.l.setBounds(getPaddingLeft() + this.p, i, (getWidth() - getPaddingRight()) - this.p, this.n + i);
        this.l.draw(canvas);
    }

    void a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    int b(View view) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02de A[PHI: r10
  0x02de: PHI (r10v21 int) = (r10v19 int), (r10v22 int) binds: [B:135:0x02dc, B:131:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x031d  */
    /* JADX WARN: Code duplicated, block: B:154:0x032b  */
    void b(int i, int i2) {
        int i3;
        int iCombineMeasuredStates;
        int iMax;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        int i7;
        int iMax2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view;
        int iMax3;
        boolean z3;
        int iMax4;
        this.g = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i16 = this.f856c;
        boolean z4 = this.i;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int iMax5 = 0;
        int i20 = 0;
        int iA = 0;
        boolean z5 = false;
        boolean z6 = false;
        float f = 0.0f;
        boolean z7 = true;
        while (true) {
            int i21 = 8;
            int i22 = iMax5;
            if (iA >= virtualChildCount) {
                int i23 = i17;
                int i24 = i19;
                int i25 = i20;
                int i26 = virtualChildCount;
                int i27 = mode2;
                int iMax6 = i18;
                if (this.g > 0) {
                    i3 = i26;
                    if (b(i3)) {
                        this.g += this.n;
                    }
                } else {
                    i3 = i26;
                }
                if (z4 && (i27 == Integer.MIN_VALUE || i27 == 0)) {
                    this.g = 0;
                    int iA2 = 0;
                    while (iA2 < i3) {
                        View viewA = a(iA2);
                        if (viewA == null) {
                            iMax2 = this.g + c(iA2);
                        } else {
                            if (viewA.getVisibility() == i21) {
                                iA2 += a(viewA, iA2);
                            } else {
                                a aVar = (a) viewA.getLayoutParams();
                                int i28 = this.g;
                                iMax2 = Math.max(i28, i28 + i24 + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + b(viewA));
                            }
                            iA2++;
                            i21 = 8;
                        }
                        this.g = iMax2;
                        iA2++;
                        i21 = 8;
                    }
                }
                int paddingTop = this.g + getPaddingTop() + getPaddingBottom();
                this.g = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
                int i29 = (16777215 & iResolveSizeAndState) - this.g;
                if (z5 || (i29 != 0 && f > 0.0f)) {
                    float f2 = this.h;
                    if (f2 > 0.0f) {
                        f = f2;
                    }
                    this.g = 0;
                    int i30 = i29;
                    int i31 = i25;
                    iCombineMeasuredStates = i23;
                    int i32 = 0;
                    while (i32 < i3) {
                        View viewA2 = a(i32);
                        if (viewA2.getVisibility() == 8) {
                            i4 = i30;
                        } else {
                            a aVar2 = (a) viewA2.getLayoutParams();
                            float f3 = aVar2.f857a;
                            if (f3 > 0.0f) {
                                int measuredHeight = (int) ((i30 * f3) / f);
                                float f4 = f - f3;
                                i4 = i30 - measuredHeight;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin, ((ViewGroup.MarginLayoutParams) aVar2).width);
                                if (((ViewGroup.MarginLayoutParams) aVar2).height == 0) {
                                    i7 = 1073741824;
                                    if (i27 == 1073741824) {
                                        if (measuredHeight <= 0) {
                                            measuredHeight = 0;
                                        }
                                    }
                                    viewA2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i7));
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewA2.getMeasuredState() & (-256));
                                    f = f4;
                                } else {
                                    i7 = 1073741824;
                                }
                                measuredHeight = viewA2.getMeasuredHeight() + measuredHeight;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewA2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i7));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewA2.getMeasuredState() & (-256));
                                f = f4;
                            } else {
                                i4 = i30;
                            }
                            int i33 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewA2.getMeasuredWidth() + i33;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            float f5 = f;
                            if (mode != 1073741824) {
                                i5 = iCombineMeasuredStates;
                                i6 = -1;
                                z = ((ViewGroup.MarginLayoutParams) aVar2).width == -1;
                                if (!z) {
                                    i33 = measuredWidth;
                                }
                                int iMax7 = Math.max(i31, i33);
                                if (z7 || ((ViewGroup.MarginLayoutParams) aVar2).width != i6) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                int i34 = this.g;
                                this.g = Math.max(i34, viewA2.getMeasuredHeight() + i34 + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin + b(viewA2));
                                z7 = z2;
                                iCombineMeasuredStates = i5;
                                i31 = iMax7;
                                f = f5;
                            } else {
                                i5 = iCombineMeasuredStates;
                                i6 = -1;
                            }
                            if (!z) {
                                i33 = measuredWidth;
                            }
                            int iMax8 = Math.max(i31, i33);
                            if (z7) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            int i35 = this.g;
                            this.g = Math.max(i35, viewA2.getMeasuredHeight() + i35 + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin + b(viewA2));
                            z7 = z2;
                            iCombineMeasuredStates = i5;
                            i31 = iMax8;
                            f = f5;
                        }
                        i32++;
                        i30 = i4;
                    }
                    this.g += getPaddingTop() + getPaddingBottom();
                    iMax = i31;
                } else {
                    iMax = Math.max(i25, i22);
                    if (z4 && i27 != 1073741824) {
                        for (int i36 = 0; i36 < i3; i36++) {
                            View viewA3 = a(i36);
                            if (viewA3 != null && viewA3.getVisibility() != 8 && ((a) viewA3.getLayoutParams()).f857a > 0.0f) {
                                viewA3.measure(View.MeasureSpec.makeMeasureSpec(viewA3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i24, 1073741824));
                            }
                        }
                    }
                    iCombineMeasuredStates = i23;
                }
                if (z7 || mode == 1073741824) {
                    iMax = iMax6;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates), iResolveSizeAndState);
                if (z6) {
                    d(i3, i2);
                    return;
                }
                return;
            }
            View viewA4 = a(iA);
            if (viewA4 == null) {
                this.g += c(iA);
                i11 = virtualChildCount;
                i12 = mode2;
                iMax5 = i22;
            } else {
                int i37 = i17;
                if (viewA4.getVisibility() == 8) {
                    iA += a(viewA4, iA);
                    i11 = virtualChildCount;
                    iMax5 = i22;
                    i17 = i37;
                    i12 = mode2;
                } else {
                    if (b(iA)) {
                        this.g += this.n;
                    }
                    a aVar3 = (a) viewA4.getLayoutParams();
                    float f6 = aVar3.f857a;
                    float f7 = f + f6;
                    if (mode2 == 1073741824 && ((ViewGroup.MarginLayoutParams) aVar3).height == 0 && f6 > 0.0f) {
                        int i38 = this.g;
                        this.g = Math.max(i38, ((ViewGroup.MarginLayoutParams) aVar3).topMargin + i38 + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin);
                        iMax3 = i19;
                        view = viewA4;
                        i14 = i20;
                        z5 = true;
                        i9 = i37;
                        i10 = i18;
                        i11 = virtualChildCount;
                        i12 = mode2;
                        i13 = i22;
                        i15 = iA;
                    } else {
                        int i39 = i18;
                        if (((ViewGroup.MarginLayoutParams) aVar3).height != 0 || aVar3.f857a <= 0.0f) {
                            i8 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) aVar3).height = -2;
                            i8 = 0;
                        }
                        i9 = i37;
                        int i40 = i8;
                        i10 = i39;
                        int i41 = i19;
                        i11 = virtualChildCount;
                        i12 = mode2;
                        i13 = i22;
                        i14 = i20;
                        i15 = iA;
                        a(viewA4, iA, i, 0, i2, f7 == 0.0f ? this.g : 0);
                        if (i40 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) aVar3).height = i40;
                        }
                        int measuredHeight2 = viewA4.getMeasuredHeight();
                        int i42 = this.g;
                        view = viewA4;
                        this.g = Math.max(i42, i42 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin + b(view));
                        iMax3 = z4 ? Math.max(measuredHeight2, i41) : i41;
                    }
                    if (i16 >= 0 && i16 == i15 + 1) {
                        this.d = this.g;
                    }
                    if (i15 < i16 && aVar3.f857a > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((ViewGroup.MarginLayoutParams) aVar3).width != -1) {
                        z3 = false;
                    } else {
                        z3 = true;
                        z6 = true;
                    }
                    int i43 = ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i43;
                    int iMax9 = Math.max(i10, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i9, view.getMeasuredState());
                    z7 = z7 && ((ViewGroup.MarginLayoutParams) aVar3).width == -1;
                    if (aVar3.f857a > 0.0f) {
                        if (!z3) {
                            i43 = measuredWidth2;
                        }
                        iMax5 = Math.max(i13, i43);
                        iMax4 = i14;
                    } else {
                        if (!z3) {
                            i43 = measuredWidth2;
                        }
                        iMax4 = Math.max(i14, i43);
                        iMax5 = i13;
                    }
                    int iA3 = a(view, i15) + i15;
                    i19 = iMax3;
                    f = f7;
                    i20 = iMax4;
                    i17 = iCombineMeasuredStates2;
                    iA = iA3;
                    i18 = iMax9;
                }
            }
            iA++;
            mode2 = i12;
            virtualChildCount = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    void b(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.f;
        int i10 = i9 & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay;
        int i11 = i9 & 8388615;
        if (i10 != 16) {
            paddingTop = i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.g;
        } else {
            paddingTop = getPaddingTop() + (((i4 - i2) - this.g) / 2);
        }
        int iA = 0;
        while (iA < virtualChildCount) {
            View viewA = a(iA);
            if (viewA == null) {
                paddingTop += c(iA);
            } else {
                if (viewA.getVisibility() != 8) {
                    int measuredWidth = viewA.getMeasuredWidth();
                    int measuredHeight = viewA.getMeasuredHeight();
                    a aVar = (a) viewA.getLayoutParams();
                    int i12 = aVar.f858b;
                    if (i12 < 0) {
                        i12 = i11;
                    }
                    int iA2 = b.b.c.g.d.a(i12, b.b.c.g.q.d(this)) & 7;
                    if (iA2 != 1) {
                        if (iA2 != 5) {
                            i6 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            i5 = paddingRight - measuredWidth;
                        }
                        int i13 = i6;
                        if (b(iA)) {
                            paddingTop += this.n;
                        }
                        int i14 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        a(viewA, i13, i14 + a(viewA), measuredWidth, measuredHeight);
                        int iB = i14 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + b(viewA);
                        iA += a(viewA, iA);
                        paddingTop = iB;
                        i7 = 1;
                    } else {
                        i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                    }
                    i6 = i5 - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                    int i15 = i6;
                    if (b(iA)) {
                        paddingTop += this.n;
                    }
                    int i16 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                    a(viewA, i15, i16 + a(viewA), measuredWidth, measuredHeight);
                    int iB2 = i16 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + b(viewA);
                    iA += a(viewA, iA);
                    paddingTop = iB2;
                    i7 = 1;
                }
                iA += i7;
            }
            i7 = 1;
            iA += i7;
        }
    }

    void b(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View viewA = a(i);
            if (viewA != null && viewA.getVisibility() != 8 && b(i)) {
                a(canvas, (viewA.getTop() - ((ViewGroup.MarginLayoutParams) ((a) viewA.getLayoutParams())).topMargin) - this.n);
            }
        }
        if (b(virtualChildCount)) {
            View viewA2 = a(virtualChildCount - 1);
            a(canvas, viewA2 == null ? (getHeight() - getPaddingBottom()) - this.n : viewA2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) viewA2.getLayoutParams())).bottomMargin);
        }
    }

    void b(Canvas canvas, int i) {
        this.l.setBounds(i, getPaddingTop() + this.p, this.m + i, (getHeight() - getPaddingBottom()) - this.p);
        this.l.draw(canvas);
    }

    protected boolean b(int i) {
        if (i == 0) {
            return (this.o & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.o & 4) != 0;
        }
        if ((this.o & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    int c(int i) {
        return 0;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        int i = this.e;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f856c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f856c;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f856c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.d;
        if (this.e == 1 && (i = this.f & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.g) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.g;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f856c;
    }

    public Drawable getDividerDrawable() {
        return this.l;
    }

    public int getDividerPadding() {
        return this.p;
    }

    public int getDividerWidth() {
        return this.m;
    }

    public int getGravity() {
        return this.f;
    }

    public int getOrientation() {
        return this.e;
    }

    public int getShowDividers() {
        return this.o;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.l == null) {
            return;
        }
        if (this.e == 1) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(g0.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(g0.class.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.e == 1) {
            b(i, i2, i3, i4);
        } else {
            a(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.e == 1) {
            b(i, i2);
        } else {
            a(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f855b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f856c = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.l) {
            return;
        }
        this.l = drawable;
        if (drawable != null) {
            this.m = drawable.getIntrinsicWidth();
            this.n = drawable.getIntrinsicHeight();
        } else {
            this.m = 0;
            this.n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.p = i;
    }

    public void setGravity(int i) {
        if (this.f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay) == 0) {
                i |= 48;
            }
            this.f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f;
        if ((8388615 & i3) != i2) {
            this.f = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.i = z;
    }

    public void setOrientation(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.o) {
            requestLayout();
        }
        this.o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay;
        int i3 = this.f;
        if ((i3 & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay) != i2) {
            this.f = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.h = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
