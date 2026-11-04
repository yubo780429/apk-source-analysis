package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f786c;
    private View d;
    private View e;
    Drawable f;
    Drawable g;
    Drawable h;
    boolean i;
    boolean j;
    private int k;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b.b.c.g.q.a(this, new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.d.a.j.ActionBar);
        this.f = typedArrayObtainStyledAttributes.getDrawable(b.b.d.a.j.ActionBar_background);
        this.g = typedArrayObtainStyledAttributes.getDrawable(b.b.d.a.j.ActionBar_backgroundStacked);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(b.b.d.a.j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == b.b.d.a.f.split_action_bar) {
            this.i = true;
            this.h = typedArrayObtainStyledAttributes.getDrawable(b.b.d.a.j.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.i ? this.f != null || this.g != null : this.h != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f;
        if (drawable != null && drawable.isStateful()) {
            this.f.setState(getDrawableState());
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.g.setState(getDrawableState());
        }
        Drawable drawable3 = this.h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f786c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.d = findViewById(b.b.d.a.f.action_bar);
        this.e = findViewById(b.b.d.a.f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f785b || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
  0x0048: PHI (r0v9 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:32:0x009d, B:34:0x00a1, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f786c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            view2.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.i) {
            Drawable drawable3 = this.h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = z3;
            }
        } else {
            if (this.f != null) {
                if (this.d.getVisibility() == 0) {
                    drawable2 = this.f;
                    left = this.d.getLeft();
                    top = this.d.getTop();
                    right = this.d.getRight();
                    view = this.d;
                } else {
                    View view3 = this.e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f.setBounds(0, 0, 0, 0);
                    } else {
                        drawable2 = this.f;
                        left = this.e.getLeft();
                        top = this.e.getTop();
                        right = this.e.getRight();
                        view = this.e;
                    }
                    z3 = true;
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.j = z4;
            if (!z4 || (drawable = this.g) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iA;
        View view;
        int size;
        int i3;
        if (this.d == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.k) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view2 = this.f786c;
        if (view2 == null || view2.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.d)) {
            if (b(this.e)) {
                iA = 0;
            } else {
                view = this.e;
            }
            if (mode == Integer.MIN_VALUE) {
                size = View.MeasureSpec.getSize(i2);
            } else {
                size = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f786c), size));
        }
        view = this.d;
        iA = a(view);
        if (mode == Integer.MIN_VALUE) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            size = Integer.MAX_VALUE;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f786c), size));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.d;
            if (view != null) {
                this.f.setBounds(view.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
            }
        }
        boolean z = true;
        if (!this.i ? this.f != null || this.g != null : this.h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.h);
        }
        this.h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.i && (drawable2 = this.h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.i ? !(this.f != null || this.g != null) : this.h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.g);
        }
        this.g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.j && (drawable2 = this.g) != null) {
                drawable2.setBounds(this.f786c.getLeft(), this.f786c.getTop(), this.f786c.getRight(), this.f786c.getBottom());
            }
        }
        boolean z = true;
        if (!this.i ? this.f != null || this.g != null : this.h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(m0 m0Var) {
        View view = this.f786c;
        if (view != null) {
            removeView(view);
        }
        this.f786c = m0Var;
        if (m0Var != null) {
            addView(m0Var);
            ViewGroup.LayoutParams layoutParams = m0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            m0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f785b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f && !this.i) || (drawable == this.g && this.j) || ((drawable == this.h && this.i) || super.verifyDrawable(drawable));
    }
}
