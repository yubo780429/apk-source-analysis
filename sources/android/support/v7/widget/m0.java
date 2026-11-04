package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Runnable f884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f885c;
    g0 d;
    private Spinner e;
    private boolean f;
    int g;
    int h;
    private int i;
    private int j;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f886b;

        a(View view) {
            this.f886b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.this.smoothScrollTo(this.f886b.getLeft() - ((m0.this.getWidth() - this.f886b.getWidth()) / 2), 0);
            m0.this.f884b = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return m0.this.d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) m0.this.d.getChildAt(i)).a();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return m0.this.a((android.support.v7.app.a.c) getItem(i), true);
            }
            ((d) view).a((android.support.v7.app.a.c) getItem(i));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).a().e();
            int childCount = m0.this.d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = m0.this.d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private android.support.v7.app.a.c f891c;
        private TextView d;
        private ImageView e;
        private View f;

        public d(Context context, android.support.v7.app.a.c cVar, boolean z) {
            super(context, null, b.b.d.a.a.actionBarTabStyle);
            int[] iArr = {R.attr.background};
            this.f890b = iArr;
            this.f891c = cVar;
            t0 t0VarA = t0.a(context, null, iArr, b.b.d.a.a.actionBarTabStyle, 0);
            if (t0VarA.g(0)) {
                setBackgroundDrawable(t0VarA.b(0));
            }
            t0VarA.a();
            if (z) {
                setGravity(8388627);
            }
            b();
        }

        public android.support.v7.app.a.c a() {
            return this.f891c;
        }

        public void a(android.support.v7.app.a.c cVar) {
            this.f891c = cVar;
            b();
        }

        public void b() {
            android.support.v7.app.a.c cVar = this.f891c;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f = viewB;
                TextView textView = this.d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f;
            if (view != null) {
                removeView(view);
                this.f = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.e == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.e = oVar;
                }
                this.e.setImageDrawable(drawableC);
                this.e.setVisibility(0);
            } else {
                ImageView imageView2 = this.e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceD);
            if (z) {
                if (this.d == null) {
                    y yVar = new y(getContext(), null, b.b.d.a.a.actionBarTabTextStyle);
                    yVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    yVar.setLayoutParams(layoutParams2);
                    addView(yVar);
                    this.d = yVar;
                }
                this.d.setText(charSequenceD);
                this.d.setVisibility(0);
            } else {
                TextView textView2 = this.d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            v0.a(this, z ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(android.support.v7.app.a.c.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(android.support.v7.app.a.c.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (m0.this.g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = m0.this.g;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner a() {
        w wVar = new w(getContext(), null, b.b.d.a.a.actionDropDownStyle);
        wVar.setLayoutParams(new g0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean b() {
        Spinner spinner = this.e;
        return spinner != null && spinner.getParent() == this;
    }

    private void c() {
        if (b()) {
            return;
        }
        if (this.e == null) {
            this.e = a();
        }
        removeView(this.d);
        addView(this.e, new ViewGroup.LayoutParams(-2, -1));
        if (this.e.getAdapter() == null) {
            this.e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f884b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f884b = null;
        }
        this.e.setSelection(this.j);
    }

    private boolean d() {
        if (!b()) {
            return false;
        }
        removeView(this.e);
        addView(this.d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.e.getSelectedItemPosition());
        return false;
    }

    d a(android.support.v7.app.a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.i));
        } else {
            dVar.setFocusable(true);
            if (this.f885c == null) {
                this.f885c = new c();
            }
            dVar.setOnClickListener(this.f885c);
        }
        return dVar;
    }

    public void a(int i) {
        View childAt = this.d.getChildAt(i);
        Runnable runnable = this.f884b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f884b = aVar;
        post(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f884b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b.b.d.d.a aVarA = b.b.d.d.a.a(getContext());
        setContentHeight(aVarA.e());
        this.h = aVarA.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f884b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((d) view).a().e();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMin;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            iMin = -1;
        } else {
            if (childCount > 2) {
                this.g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.g = View.MeasureSpec.getSize(i) / 2;
            }
            iMin = Math.min(this.g, this.h);
        }
        this.g = iMin;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        if (!z && this.f) {
            this.d.measure(0, iMakeMeasureSpec);
            if (this.d.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                c();
            } else {
                d();
            }
        } else {
            d();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.j);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f = z;
    }

    public void setContentHeight(int i) {
        this.i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.j = i;
        int childCount = this.d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                a(i);
            }
            i2++;
        }
        Spinner spinner = this.e;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
