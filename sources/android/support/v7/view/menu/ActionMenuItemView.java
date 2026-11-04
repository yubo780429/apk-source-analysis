package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.f0;
import android.support.v7.widget.v0;
import android.support.v7.widget.y;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends y implements p.a, View.OnClickListener, ActionMenuView.a {
    j e;
    private CharSequence f;
    private Drawable g;
    h.b h;
    private f0 i;
    b j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    private class a extends f0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // android.support.v7.widget.f0
        public s a() {
            b bVar = ActionMenuItemView.this.j;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // android.support.v7.widget.f0
        protected boolean b() {
            s sVarA;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            h.b bVar = actionMenuItemView.h;
            return bVar != null && bVar.a(actionMenuItemView.e) && (sVarA = a()) != null && sVarA.a();
        }
    }

    public static abstract class b {
        public abstract s a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.k = e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.d.a.j.ActionMenuItemView, i, 0);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(b.b.d.a.j.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.n = -1;
        setSaveEnabled(false);
    }

    private boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f);
        if (this.g != null && (!this.e.n() || (!this.k && !this.l))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f : null);
        CharSequence contentDescription = this.e.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.e.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.e.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            v0.a(this, z3 ? null : this.e.getTitle());
        } else {
            v0.a(this, tooltipText);
        }
    }

    @Override // android.support.v7.view.menu.p.a
    public void a(j jVar, int i) {
        this.e = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.a(this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.i == null) {
            this.i = new a();
        }
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public boolean a() {
        return d() && this.e.getIcon() == null;
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public boolean b() {
        return d();
    }

    @Override // android.support.v7.view.menu.p.a
    public boolean c() {
        return true;
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.support.v7.view.menu.p.a
    public j getItemData() {
        return this.e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        h.b bVar = this.h;
        if (bVar != null) {
            bVar.a(this.e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k = e();
        f();
    }

    @Override // android.support.v7.widget.y, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        boolean zD = d();
        if (zD && (i3 = this.n) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.m) : this.m;
        if (mode != 1073741824 && this.m > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zD || this.g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var;
        if (this.e.hasSubMenu() && (f0Var = this.i) != null && f0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.l != z) {
            this.l = z;
            j jVar = this.e;
            if (jVar != null) {
                jVar.b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.o;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            int i2 = this.o;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(h.b bVar) {
        this.h = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.n = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.j = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f = charSequence;
        f();
    }
}
