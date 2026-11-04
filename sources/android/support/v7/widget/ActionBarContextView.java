package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends android.support.v7.widget.a {
    private CharSequence j;
    private CharSequence k;
    private View l;
    private View m;
    private LinearLayout n;
    private TextView o;
    private TextView p;
    private int q;
    private int r;
    private boolean s;
    private int t;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.b.d.d.b f787b;

        a(ActionBarContextView actionBarContextView, b.b.d.d.b bVar) {
            this.f787b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f787b.a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b.d.a.a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0 t0VarA = t0.a(context, attributeSet, b.b.d.a.j.ActionMode, i, 0);
        b.b.c.g.q.a(this, t0VarA.b(b.b.d.a.j.ActionMode_background));
        this.q = t0VarA.g(b.b.d.a.j.ActionMode_titleTextStyle, 0);
        this.r = t0VarA.g(b.b.d.a.j.ActionMode_subtitleTextStyle, 0);
        this.f = t0VarA.f(b.b.d.a.j.ActionMode_height, 0);
        this.t = t0VarA.g(b.b.d.a.j.ActionMode_closeItemLayout, b.b.d.a.g.abc_action_mode_close_item_material);
        t0VarA.a();
    }

    private void e() {
        if (this.n == null) {
            LayoutInflater.from(getContext()).inflate(b.b.d.a.g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.n = linearLayout;
            this.o = (TextView) linearLayout.findViewById(b.b.d.a.f.action_bar_title);
            this.p = (TextView) this.n.findViewById(b.b.d.a.f.action_bar_subtitle);
            if (this.q != 0) {
                this.o.setTextAppearance(getContext(), this.q);
            }
            if (this.r != 0) {
                this.p.setTextAppearance(getContext(), this.r);
            }
        }
        this.o.setText(this.j);
        this.p.setText(this.k);
        boolean z = !TextUtils.isEmpty(this.j);
        boolean z2 = !TextUtils.isEmpty(this.k);
        int i = 0;
        this.p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.n;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.n.getParent() == null) {
            addView(this.n);
        }
    }

    public void a() {
        if (this.l == null) {
            c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    public void a(b.b.d.d.b bVar) {
        View viewInflate;
        c cVar;
        View view = this.l;
        if (view != null) {
            if (view.getParent() == null) {
                viewInflate = this.l;
            }
            this.l.findViewById(b.b.d.a.f.action_mode_close_button).setOnClickListener(new a(this, bVar));
            android.support.v7.view.menu.h hVar = (android.support.v7.view.menu.h) bVar.c();
            cVar = this.e;
            if (cVar != null) {
                cVar.b();
            }
            c cVar2 = new c(getContext());
            this.e = cVar2;
            cVar2.c(true);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
            hVar.a(this.e, this.f830c);
            ActionMenuView actionMenuView = (ActionMenuView) this.e.b(this);
            this.d = actionMenuView;
            b.b.c.g.q.a(actionMenuView, (Drawable) null);
            addView(this.d, layoutParams);
        }
        viewInflate = LayoutInflater.from(getContext()).inflate(this.t, (ViewGroup) this, false);
        this.l = viewInflate;
        addView(viewInflate);
        this.l.findViewById(b.b.d.a.f.action_mode_close_button).setOnClickListener(new a(this, bVar));
        android.support.v7.view.menu.h hVar2 = (android.support.v7.view.menu.h) bVar.c();
        cVar = this.e;
        if (cVar != null) {
            cVar.b();
        }
        c cVar3 = new c(getContext());
        this.e = cVar3;
        cVar3.c(true);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        hVar2.a(this.e, this.f830c);
        ActionMenuView actionMenuView2 = (ActionMenuView) this.e.b(this);
        this.d = actionMenuView2;
        b.b.c.g.q.a(actionMenuView2, (Drawable) null);
        addView(this.d, layoutParams2);
    }

    public boolean b() {
        return this.s;
    }

    public void c() {
        removeAllViews();
        this.m = null;
        this.d = null;
    }

    public boolean d() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.i();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.k;
    }

    public CharSequence getTitle() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.e;
        if (cVar != null) {
            cVar.e();
            this.e.f();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(ActionBarContextView.class.getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zA = z0.a(this);
        int paddingRight = zA ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            int i5 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iA = android.support.v7.widget.a.a(paddingRight, i5, zA);
            paddingRight = android.support.v7.widget.a.a(iA + a(this.l, iA, paddingTop, paddingTop2, zA), i6, zA);
        }
        int iA2 = paddingRight;
        LinearLayout linearLayout = this.n;
        if (linearLayout != null && this.m == null && linearLayout.getVisibility() != 8) {
            iA2 += a(this.n, iA2, paddingTop, paddingTop2, zA);
        }
        int i7 = iA2;
        View view2 = this.m;
        if (view2 != null) {
            a(view2, i7, paddingTop, paddingTop2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.d;
        if (actionMenuView != null) {
            a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zA);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.l;
        if (view != null) {
            int iA = a(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            paddingLeft = iA - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = a(this.d, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.n;
        if (linearLayout != null && this.m == null) {
            if (this.s) {
                this.n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = a(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            int i4 = layoutParams.width;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i5 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            int i6 = layoutParams.height;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(iMin, i5));
        }
        if (this.f > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.support.v7.widget.a
    public void setContentHeight(int i) {
        this.f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.m;
        if (view2 != null) {
            removeView(view2);
        }
        this.m = view;
        if (view != null && (linearLayout = this.n) != null) {
            removeView(linearLayout);
            this.n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.k = charSequence;
        e();
    }

    public void setTitle(CharSequence charSequence) {
        this.j = charSequence;
        e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.s) {
            requestLayout();
        }
        this.s = z;
    }

    @Override // android.support.v7.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
