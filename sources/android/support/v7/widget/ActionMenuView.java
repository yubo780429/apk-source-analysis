package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends g0 implements android.support.v7.view.menu.h.b, android.support.v7.view.menu.p {
    private int A;
    e B;
    private android.support.v7.view.menu.h q;
    private Context r;
    private int s;
    private boolean t;
    private android.support.v7.widget.c u;
    private android.support.v7.view.menu.o.a v;
    android.support.v7.view.menu.h.a w;
    private boolean x;
    private int y;
    private int z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements android.support.v7.view.menu.o.a {
        b() {
        }

        @Override // android.support.v7.view.menu.o.a
        public void a(android.support.v7.view.menu.h hVar, boolean z) {
        }

        @Override // android.support.v7.view.menu.o.a
        public boolean a(android.support.v7.view.menu.h hVar) {
            return false;
        }
    }

    public static class c extends g0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f793c;

        @ViewDebug.ExportedProperty
        public int d;

        @ViewDebug.ExportedProperty
        public int e;

        @ViewDebug.ExportedProperty
        public boolean f;

        @ViewDebug.ExportedProperty
        public boolean g;
        boolean h;

        public c(int i, int i2) {
            super(i, i2);
            this.f793c = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(c cVar) {
            super(cVar);
            this.f793c = cVar.f793c;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private class d implements android.support.v7.view.menu.h.a {
        d() {
        }

        @Override // android.support.v7.view.menu.h.a
        public void a(android.support.v7.view.menu.h hVar) {
            android.support.v7.view.menu.h.a aVar = ActionMenuView.this.w;
            if (aVar != null) {
                aVar.a(hVar);
            }
        }

        @Override // android.support.v7.view.menu.h.a
        public boolean a(android.support.v7.view.menu.h hVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.B;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.z = (int) (56.0f * f);
        this.A = (int) (f * 4.0f);
        this.r = context;
        this.s = 0;
    }

    static int a(View view, int i, int i2, int i3, int i4) {
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = actionMenuItemView != null && actionMenuItemView.d();
        int i5 = 2;
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z || i6 >= 2) {
                i5 = i6;
            }
        }
        cVar.f = !cVar.f793c && z;
        cVar.d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), iMakeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void c(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i5 = size - paddingLeft;
        int i6 = this.z;
        int i7 = i5 / i6;
        int i8 = i5 % i6;
        if (i7 == 0) {
            setMeasuredDimension(i5, 0);
            return;
        }
        int i9 = i6 + (i8 / i7);
        int childCount = getChildCount();
        int iMax = 0;
        int i10 = 0;
        boolean z3 = false;
        int i11 = 0;
        int iMax2 = 0;
        int i12 = 0;
        long j = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            int i13 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z4 = childAt instanceof ActionMenuItemView;
                int i14 = i11 + 1;
                if (z4) {
                    int i15 = this.A;
                    r14 = 0;
                    childAt.setPadding(i15, 0, i15, 0);
                } else {
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.h = r14;
                cVar.e = r14;
                cVar.d = r14;
                cVar.f = r14;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r14;
                cVar.g = z4 && ((ActionMenuItemView) childAt).d();
                int iA = a(childAt, i9, cVar.f793c ? 1 : i7, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iA);
                if (cVar.f) {
                    i12++;
                }
                if (cVar.f793c) {
                    z3 = true;
                }
                i7 -= iA;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iA == 1) {
                    j |= (long) (1 << i10);
                    iMax = iMax;
                }
                i11 = i14;
            }
            i10++;
            size2 = i13;
        }
        int i16 = size2;
        boolean z5 = z3 && i11 == 2;
        boolean z6 = false;
        while (true) {
            if (i12 <= 0 || i7 <= 0) {
                z = z6;
                i3 = iMax;
                break;
            }
            int i17 = Integer.MAX_VALUE;
            int i18 = 0;
            int i19 = 0;
            long j2 = 0;
            while (i19 < childCount) {
                boolean z7 = z6;
                c cVar2 = (c) getChildAt(i19).getLayoutParams();
                int i20 = iMax;
                if (cVar2.f) {
                    int i21 = cVar2.d;
                    if (i21 < i17) {
                        j2 = 1 << i19;
                        i17 = i21;
                        i18 = 1;
                    } else if (i21 == i17) {
                        i18++;
                        j2 |= 1 << i19;
                    }
                }
                i19++;
                iMax = i20;
                z6 = z7;
            }
            z = z6;
            i3 = iMax;
            j |= j2;
            if (i18 > i7) {
                break;
            }
            int i22 = i17 + 1;
            int i23 = 0;
            while (i23 < childCount) {
                View childAt2 = getChildAt(i23);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i24 = i5;
                int i25 = mode;
                long j3 = 1 << i23;
                if ((j2 & j3) == 0) {
                    if (cVar3.d == i22) {
                        j |= j3;
                    }
                    z5 = z5;
                } else {
                    if (z5 && cVar3.g && i7 == 1) {
                        int i26 = this.A;
                        childAt2.setPadding(i26 + i9, 0, i26, 0);
                    }
                    cVar3.d++;
                    cVar3.h = true;
                    i7--;
                }
                i23++;
                mode = i25;
                i5 = i24;
                z5 = z5;
            }
            iMax = i3;
            z6 = true;
        }
        boolean z8 = !z3 && i11 == 1;
        if (i7 <= 0 || j == 0 || (i7 >= i11 - 1 && !z8 && iMax2 <= 1)) {
            i4 = 0;
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j);
            if (z8) {
                i4 = 0;
            } else {
                i4 = 0;
                if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).g) {
                    fBitCount -= 0.5f;
                }
                int i27 = childCount - 1;
                if ((j & ((long) (1 << i27))) != 0 && !((c) getChildAt(i27).getLayoutParams()).g) {
                    fBitCount -= 0.5f;
                }
            }
            int i28 = fBitCount > 0.0f ? (int) ((i7 * i9) / fBitCount) : i4;
            z2 = z;
            for (int i29 = i4; i29 < childCount; i29++) {
                if ((j & ((long) (1 << i29))) != 0) {
                    View childAt3 = getChildAt(i29);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.e = i28;
                        cVar4.h = true;
                        if (i29 == 0 && !cVar4.g) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = (-i28) / 2;
                        }
                        z2 = true;
                    } else if (cVar4.f793c) {
                        cVar4.e = i28;
                        cVar4.h = true;
                        ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = (-i28) / 2;
                        z2 = true;
                    } else {
                        if (i29 != 0) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = i28 / 2;
                        }
                        if (i29 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = i28 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i30 = i4; i30 < childCount; i30++) {
                View childAt4 = getChildAt(i30);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.d * i9) + cVar5.e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i5, mode != 1073741824 ? i3 : i16);
    }

    @Override // android.support.v7.view.menu.p
    public void a(android.support.v7.view.menu.h hVar) {
        this.q = hVar;
    }

    public void a(android.support.v7.view.menu.o.a aVar, android.support.v7.view.menu.h.a aVar2) {
        this.v = aVar;
        this.w = aVar2;
    }

    @Override // android.support.v7.view.menu.h.b
    public boolean a(android.support.v7.view.menu.j jVar) {
        return this.q.a(jVar, 0);
    }

    public void c() {
        android.support.v7.widget.c cVar = this.u;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof c);
    }

    public c d() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f793c = true;
        return cVarGenerateDefaultLayoutParams;
    }

    protected boolean d(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            zB = false | ((a) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? zB : zB | ((a) childAt2).a();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public boolean e() {
        android.support.v7.widget.c cVar = this.u;
        return cVar != null && cVar.e();
    }

    public boolean f() {
        android.support.v7.widget.c cVar = this.u;
        return cVar != null && cVar.g();
    }

    public boolean g() {
        android.support.v7.widget.c cVar = this.u;
        return cVar != null && cVar.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f858b = 16;
        return cVar;
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f858b <= 0) {
            cVar.f858b = 16;
        }
        return cVar;
    }

    public Menu getMenu() {
        if (this.q == null) {
            Context context = getContext();
            android.support.v7.view.menu.h hVar = new android.support.v7.view.menu.h(context);
            this.q = hVar;
            hVar.a(new d());
            android.support.v7.widget.c cVar = new android.support.v7.widget.c(context);
            this.u = cVar;
            cVar.c(true);
            android.support.v7.widget.c cVar2 = this.u;
            android.support.v7.view.menu.o.a bVar = this.v;
            if (bVar == null) {
                bVar = new b();
            }
            cVar2.a(bVar);
            this.q.a(this.u, this.r);
            this.u.a(this);
        }
        return this.q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.u.c();
    }

    public int getPopupTheme() {
        return this.s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public boolean h() {
        return this.t;
    }

    public android.support.v7.view.menu.h i() {
        return this.q;
    }

    public boolean j() {
        android.support.v7.widget.c cVar = this.u;
        return cVar != null && cVar.i();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.support.v7.widget.c cVar = this.u;
        if (cVar != null) {
            cVar.a(false);
            if (this.u.h()) {
                this.u.e();
                this.u.i();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zA = z0.a(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f793c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (d(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    d(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f793c) {
                    int i15 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f793c) {
                int i18 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = i18 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // android.support.v7.widget.g0, android.view.View
    protected void onMeasure(int i, int i2) {
        android.support.v7.view.menu.h hVar;
        boolean z = this.x;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.x = z2;
        if (z != z2) {
            this.y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.x && (hVar = this.q) != null && size != this.y) {
            this.y = size;
            hVar.b(true);
        }
        int childCount = getChildCount();
        if (this.x && childCount > 0) {
            c(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            c cVar = (c) getChildAt(i3).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.u.b(z);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.u.a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.t = z;
    }

    public void setPopupTheme(int i) {
        if (this.s != i) {
            this.s = i;
            if (i == 0) {
                this.r = getContext();
            } else {
                this.r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(android.support.v7.widget.c cVar) {
        this.u = cVar;
        cVar.a(this);
    }
}
