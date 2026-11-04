package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    f H;
    private final ActionMenuView.e I;
    private u0 J;
    private android.support.v7.widget.c K;
    private d L;
    private android.support.v7.view.menu.o.a M;
    private android.support.v7.view.menu.h.a N;
    private boolean O;
    private final Runnable P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ActionMenuView f819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f820c;
    private TextView d;
    private ImageButton e;
    private ImageView f;
    private Drawable g;
    private CharSequence h;
    ImageButton i;
    View j;
    private Context k;
    private int l;
    private int m;
    private int n;
    int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private l0 u;
    private int v;
    private int w;
    private int x;
    private CharSequence y;
    private CharSequence z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // android.support.v7.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.H;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.k();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.c();
        }
    }

    private class d implements android.support.v7.view.menu.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.support.v7.view.menu.h f824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.support.v7.view.menu.j f825c;

        d() {
        }

        @Override // android.support.v7.view.menu.o
        public void a(Context context, android.support.v7.view.menu.h hVar) {
            android.support.v7.view.menu.j jVar;
            android.support.v7.view.menu.h hVar2 = this.f824b;
            if (hVar2 != null && (jVar = this.f825c) != null) {
                hVar2.a(jVar);
            }
            this.f824b = hVar;
        }

        @Override // android.support.v7.view.menu.o
        public void a(android.support.v7.view.menu.h hVar, boolean z) {
        }

        @Override // android.support.v7.view.menu.o
        public void a(android.support.v7.view.menu.o.a aVar) {
        }

        @Override // android.support.v7.view.menu.o
        public void a(boolean z) {
            if (this.f825c != null) {
                android.support.v7.view.menu.h hVar = this.f824b;
                boolean z2 = false;
                if (hVar != null) {
                    int size = hVar.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f824b.getItem(i) == this.f825c) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                b(this.f824b, this.f825c);
            }
        }

        @Override // android.support.v7.view.menu.o
        public boolean a(android.support.v7.view.menu.h hVar, android.support.v7.view.menu.j jVar) {
            Toolbar.this.e();
            ViewParent parent = Toolbar.this.i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.i);
            }
            Toolbar.this.j = jVar.getActionView();
            this.f825c = jVar;
            ViewParent parent2 = Toolbar.this.j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.j);
                }
                e eVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                eVarGenerateDefaultLayoutParams.f689a = 8388611 | (toolbar4.o & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay);
                eVarGenerateDefaultLayoutParams.f826b = 2;
                toolbar4.j.setLayoutParams(eVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.j);
            }
            Toolbar.this.j();
            Toolbar.this.requestLayout();
            jVar.a(true);
            KeyEvent.Callback callback = Toolbar.this.j;
            if (callback instanceof b.b.d.d.c) {
                ((b.b.d.d.c) callback).a();
            }
            return true;
        }

        @Override // android.support.v7.view.menu.o
        public boolean a(android.support.v7.view.menu.u uVar) {
            return false;
        }

        @Override // android.support.v7.view.menu.o
        public boolean b(android.support.v7.view.menu.h hVar, android.support.v7.view.menu.j jVar) {
            KeyEvent.Callback callback = Toolbar.this.j;
            if (callback instanceof b.b.d.d.c) {
                ((b.b.d.d.c) callback).b();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.j = null;
            toolbar3.a();
            this.f825c = null;
            Toolbar.this.requestLayout();
            jVar.a(false);
            return true;
        }

        @Override // android.support.v7.view.menu.o
        public boolean d() {
            return false;
        }
    }

    public static class e extends android.support.v7.app.a.C0030a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f826b;

        public e(int i, int i2) {
            super(i, i2);
            this.f826b = 0;
            this.f689a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f826b = 0;
        }

        public e(android.support.v7.app.a.C0030a c0030a) {
            super(c0030a);
            this.f826b = 0;
        }

        public e(e eVar) {
            super((android.support.v7.app.a.C0030a) eVar);
            this.f826b = 0;
            this.f826b = eVar.f826b;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f826b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f826b = 0;
            a(marginLayoutParams);
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends b.b.c.g.a {
        public static final Parcelable.Creator<g> CREATOR = new a();
        int d;
        boolean e;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.b.c.g.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b.d.a.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.P = new b();
        t0 t0VarA = t0.a(getContext(), attributeSet, b.b.d.a.j.Toolbar, i, 0);
        this.m = t0VarA.g(b.b.d.a.j.Toolbar_titleTextAppearance, 0);
        this.n = t0VarA.g(b.b.d.a.j.Toolbar_subtitleTextAppearance, 0);
        this.x = t0VarA.e(b.b.d.a.j.Toolbar_android_gravity, this.x);
        this.o = t0VarA.e(b.b.d.a.j.Toolbar_buttonGravity, 48);
        int iB = t0VarA.b(b.b.d.a.j.Toolbar_titleMargin, 0);
        iB = t0VarA.g(b.b.d.a.j.Toolbar_titleMargins) ? t0VarA.b(b.b.d.a.j.Toolbar_titleMargins, iB) : iB;
        this.t = iB;
        this.s = iB;
        this.r = iB;
        this.q = iB;
        int iB2 = t0VarA.b(b.b.d.a.j.Toolbar_titleMarginStart, -1);
        if (iB2 >= 0) {
            this.q = iB2;
        }
        int iB3 = t0VarA.b(b.b.d.a.j.Toolbar_titleMarginEnd, -1);
        if (iB3 >= 0) {
            this.r = iB3;
        }
        int iB4 = t0VarA.b(b.b.d.a.j.Toolbar_titleMarginTop, -1);
        if (iB4 >= 0) {
            this.s = iB4;
        }
        int iB5 = t0VarA.b(b.b.d.a.j.Toolbar_titleMarginBottom, -1);
        if (iB5 >= 0) {
            this.t = iB5;
        }
        this.p = t0VarA.c(b.b.d.a.j.Toolbar_maxButtonHeight, -1);
        int iB6 = t0VarA.b(b.b.d.a.j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int iB7 = t0VarA.b(b.b.d.a.j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int iC = t0VarA.c(b.b.d.a.j.Toolbar_contentInsetLeft, 0);
        int iC2 = t0VarA.c(b.b.d.a.j.Toolbar_contentInsetRight, 0);
        l();
        this.u.a(iC, iC2);
        if (iB6 != Integer.MIN_VALUE || iB7 != Integer.MIN_VALUE) {
            this.u.b(iB6, iB7);
        }
        this.v = t0VarA.b(b.b.d.a.j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.w = t0VarA.b(b.b.d.a.j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.g = t0VarA.b(b.b.d.a.j.Toolbar_collapseIcon);
        this.h = t0VarA.e(b.b.d.a.j.Toolbar_collapseContentDescription);
        CharSequence charSequenceE = t0VarA.e(b.b.d.a.j.Toolbar_title);
        if (!TextUtils.isEmpty(charSequenceE)) {
            setTitle(charSequenceE);
        }
        CharSequence charSequenceE2 = t0VarA.e(b.b.d.a.j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(charSequenceE2)) {
            setSubtitle(charSequenceE2);
        }
        this.k = getContext();
        setPopupTheme(t0VarA.g(b.b.d.a.j.Toolbar_popupTheme, 0));
        Drawable drawableB = t0VarA.b(b.b.d.a.j.Toolbar_navigationIcon);
        if (drawableB != null) {
            setNavigationIcon(drawableB);
        }
        CharSequence charSequenceE3 = t0VarA.e(b.b.d.a.j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(charSequenceE3)) {
            setNavigationContentDescription(charSequenceE3);
        }
        Drawable drawableB2 = t0VarA.b(b.b.d.a.j.Toolbar_logo);
        if (drawableB2 != null) {
            setLogo(drawableB2);
        }
        CharSequence charSequenceE4 = t0VarA.e(b.b.d.a.j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(charSequenceE4)) {
            setLogoDescription(charSequenceE4);
        }
        if (t0VarA.g(b.b.d.a.j.Toolbar_titleTextColor)) {
            setTitleTextColor(t0VarA.a(b.b.d.a.j.Toolbar_titleTextColor, -1));
        }
        if (t0VarA.g(b.b.d.a.j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(t0VarA.a(b.b.d.a.j.Toolbar_subtitleTextColor, -1));
        }
        t0VarA.a();
    }

    private int a(int i) {
        int iD = b.b.c.g.q.d(this);
        int iA = b.b.c.g.d.a(i, iD) & 7;
        if (iA == 1 || iA == 3 || iA == 5) {
            return iA;
        }
        return iD == 1 ? 5 : 3;
    }

    private int a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return b.b.c.g.g.b(marginLayoutParams) + b.b.c.g.g.a(marginLayoutParams);
    }

    private int a(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int iB = b(eVar.f689a);
        if (iB == 48) {
            return getPaddingTop() - i2;
        }
        if (iB == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (iMax < i3) {
            iMax = i3;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i4 < i5) {
                iMax = Math.max(0, iMax - (i5 - i4));
            }
        }
        return paddingTop + iMax;
    }

    private int a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private int a(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iA = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iA, iMax + measuredWidth, view.getMeasuredHeight() + iA);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = list.get(i3);
            e eVar = (e) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i2;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, i5);
            int iMax3 = Math.max(0, -i4);
            int iMax4 = Math.max(0, -i5);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i3++;
            i2 = iMax4;
            i = iMax3;
        }
        return measuredWidth;
    }

    private void a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void a(View view, boolean z) {
        e eVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            eVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        }
        eVarGenerateLayoutParams.f826b = 1;
        if (!z || this.j == null) {
            addView(view, eVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(eVarGenerateLayoutParams);
            this.F.add(view);
        }
    }

    private void a(List<View> list, int i) {
        boolean z = b.b.c.g.q.d(this) == 1;
        int childCount = getChildCount();
        int iA = b.b.c.g.d.a(i, b.b.c.g.q.d(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f826b == 0 && d(childAt) && a(eVar.f689a) == iA) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f826b == 0 && d(childAt2) && a(eVar2.f689a) == iA) {
                list.add(childAt2);
            }
        }
    }

    private int b(int i) {
        int i2 = i & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.x & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay;
    }

    private int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int b(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iA = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iA, iMax, view.getMeasuredHeight() + iA);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private boolean c(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    private boolean d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private MenuInflater getMenuInflater() {
        return new b.b.d.d.g(getContext());
    }

    private void l() {
        if (this.u == null) {
            this.u = new l0();
        }
    }

    private void m() {
        if (this.f == null) {
            this.f = new o(getContext());
        }
    }

    private void n() {
        o();
        if (this.f819b.i() == null) {
            android.support.v7.view.menu.h hVar = (android.support.v7.view.menu.h) this.f819b.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f819b.setExpandedActionViewsExclusive(true);
            hVar.a(this.L, this.k);
        }
    }

    private void o() {
        if (this.f819b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f819b = actionMenuView;
            actionMenuView.setPopupTheme(this.l);
            this.f819b.setOnMenuItemClickListener(this.I);
            this.f819b.a(this.M, this.N);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f689a = 8388613 | (this.o & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay);
            this.f819b.setLayoutParams(eVarGenerateDefaultLayoutParams);
            a((View) this.f819b, false);
        }
    }

    private void p() {
        if (this.e == null) {
            this.e = new m(getContext(), null, b.b.d.a.a.toolbarNavigationButtonStyle);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f689a = 8388611 | (this.o & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay);
            this.e.setLayoutParams(eVarGenerateDefaultLayoutParams);
        }
    }

    private void q() {
        removeCallbacks(this.P);
        post(this.P);
    }

    private boolean r() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    public void a(int i, int i2) {
        l();
        this.u.b(i, i2);
    }

    public void a(Context context, int i) {
        this.n = i;
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void a(android.support.v7.view.menu.h hVar, android.support.v7.widget.c cVar) {
        if (hVar == null && this.f819b == null) {
            return;
        }
        o();
        android.support.v7.view.menu.h hVarI = this.f819b.i();
        if (hVarI == hVar) {
            return;
        }
        if (hVarI != null) {
            hVarI.b(this.K);
            hVarI.b(this.L);
        }
        if (this.L == null) {
            this.L = new d();
        }
        cVar.b(true);
        if (hVar != null) {
            hVar.a(cVar, this.k);
            hVar.a(this.L, this.k);
        } else {
            cVar.a(this.k, (android.support.v7.view.menu.h) null);
            this.L.a(this.k, (android.support.v7.view.menu.h) null);
            cVar.a(true);
            this.L.a(true);
        }
        this.f819b.setPopupTheme(this.l);
        this.f819b.setPresenter(cVar);
        this.K = cVar;
    }

    public void b(Context context, int i) {
        this.m = i;
        TextView textView = this.f820c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public boolean b() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f819b) != null && actionMenuView.h();
    }

    public void c() {
        d dVar = this.L;
        android.support.v7.view.menu.j jVar = dVar == null ? null : dVar.f825c;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public void d() {
        ActionMenuView actionMenuView = this.f819b;
        if (actionMenuView != null) {
            actionMenuView.c();
        }
    }

    void e() {
        if (this.i == null) {
            m mVar = new m(getContext(), null, b.b.d.a.a.toolbarNavigationButtonStyle);
            this.i = mVar;
            mVar.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f689a = 8388611 | (this.o & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay);
            eVarGenerateDefaultLayoutParams.f826b = 2;
            this.i.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.i.setOnClickListener(new c());
        }
    }

    public boolean f() {
        d dVar = this.L;
        return (dVar == null || dVar.f825c == null) ? false : true;
    }

    public boolean g() {
        ActionMenuView actionMenuView = this.f819b;
        return actionMenuView != null && actionMenuView.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof android.support.v7.app.a.C0030a) {
            return new e((android.support.v7.app.a.C0030a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public int getContentInsetEnd() {
        l0 l0Var = this.u;
        if (l0Var != null) {
            return l0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        l0 l0Var = this.u;
        if (l0Var != null) {
            return l0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        l0 l0Var = this.u;
        if (l0Var != null) {
            return l0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        l0 l0Var = this.u;
        if (l0Var != null) {
            return l0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        android.support.v7.view.menu.h hVarI;
        ActionMenuView actionMenuView = this.f819b;
        return actionMenuView != null && (hVarI = actionMenuView.i()) != null && hVarI.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return b.b.c.g.q.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return b.b.c.g.q.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        n();
        return this.f819b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    android.support.v7.widget.c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        n();
        return this.f819b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.k;
    }

    public int getPopupTheme() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    public b0 getWrapper() {
        if (this.J == null) {
            this.J = new u0(this, true);
        }
        return this.J;
    }

    public boolean h() {
        ActionMenuView actionMenuView = this.f819b;
        return actionMenuView != null && actionMenuView.f();
    }

    public boolean i() {
        ActionMenuView actionMenuView = this.f819b;
        return actionMenuView != null && actionMenuView.g();
    }

    void j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f826b != 2 && childAt != this.f819b) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public boolean k() {
        ActionMenuView actionMenuView = this.f819b;
        return actionMenuView != null && actionMenuView.j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0239  */
    /* JADX WARN: Code duplicated, block: B:102:0x025c  */
    /* JADX WARN: Code duplicated, block: B:104:0x025f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0283  */
    /* JADX WARN: Code duplicated, block: B:107:0x0286  */
    /* JADX WARN: Code duplicated, block: B:110:0x0299 A[LOOP:0: B:109:0x0297->B:110:0x0299, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02bb A[LOOP:1: B:112:0x02b9->B:113:0x02bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x02e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:119:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f4 A[LOOP:2: B:121:0x02f2->B:122:0x02f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0162  */
    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177  */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    /* JADX WARN: Code duplicated, block: B:80:0x018e  */
    /* JADX WARN: Code duplicated, block: B:81:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:92:0x0213  */
    /* JADX WARN: Code duplicated, block: B:94:0x0216  */
    /* JADX WARN: Code duplicated, block: B:96:0x021f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0221  */
    /* JADX WARN: Code duplicated, block: B:98:0x0225  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iA;
        int iB;
        int iMax;
        int iMin;
        boolean zD;
        boolean zD2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        e eVar;
        e eVar2;
        boolean z2;
        int i5;
        int i6;
        int paddingTop;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int size;
        int i19;
        int i20;
        int size2;
        int i21;
        int i22;
        int i23;
        int size3;
        ImageView imageView;
        View view;
        ActionMenuView actionMenuView;
        ImageButton imageButton;
        boolean z3 = b.b.c.g.q.d(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i24 = width - paddingRight;
        int[] iArr = this.G;
        iArr[1] = 0;
        iArr[0] = 0;
        int iE = b.b.c.g.q.e(this);
        int iMin2 = iE >= 0 ? Math.min(iE, i4 - i2) : 0;
        if (d(this.e)) {
            ImageButton imageButton2 = this.e;
            if (z3) {
                iB = b(imageButton2, i24, iArr, iMin2);
                iA = paddingLeft;
            } else {
                iA = a(imageButton2, paddingLeft, iArr, iMin2);
            }
            if (d(this.i)) {
                imageButton = this.i;
                if (z3) {
                    iB = b(imageButton, iB, iArr, iMin2);
                } else {
                    iA = a(imageButton, iA, iArr, iMin2);
                }
            }
            if (d(this.f819b)) {
                actionMenuView = this.f819b;
                if (z3) {
                    iA = a(actionMenuView, iA, iArr, iMin2);
                } else {
                    iB = b(actionMenuView, iB, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iA);
            iArr[1] = Math.max(0, currentContentInsetRight - (i24 - iB));
            iMax = Math.max(iA, currentContentInsetLeft);
            iMin = Math.min(iB, i24 - currentContentInsetRight);
            if (d(this.j)) {
                view = this.j;
                if (z3) {
                    iMin = b(view, iMin, iArr, iMin2);
                } else {
                    iMax = a(view, iMax, iArr, iMin2);
                }
            }
            if (d(this.f)) {
                imageView = this.f;
                if (z3) {
                    iMin = b(imageView, iMin, iArr, iMin2);
                } else {
                    iMax = a(imageView, iMax, iArr, iMin2);
                }
            }
            zD = d(this.f820c);
            zD2 = d(this.d);
            if (zD) {
                e eVar3 = (e) this.f820c.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) eVar3).topMargin + this.f820c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zD2) {
                e eVar4 = (e) this.d.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) eVar4).topMargin + this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin;
            }
            if (!zD || zD2) {
                if (zD) {
                    textView = this.f820c;
                } else {
                    textView = this.d;
                }
                if (zD2) {
                    textView2 = this.d;
                } else {
                    textView2 = this.f820c;
                }
                eVar = (e) textView.getLayoutParams();
                eVar2 = (e) textView2.getLayoutParams();
                z2 = (!zD && this.f820c.getMeasuredWidth() > 0) || (zD2 && this.d.getMeasuredWidth() > 0);
                i5 = this.x & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay;
                i6 = paddingLeft;
                if (i5 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.s;
                } else if (i5 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                    i15 = this.s;
                    if (iMax2 < i14 + i15) {
                        iMax2 = i14 + i15;
                    } else {
                        i16 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i17 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                        i18 = this.t;
                        if (i16 < i17 + i18) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i18) - i16));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.t) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.q;
                    } else {
                        i11 = 0;
                    }
                    int i25 = i11 - iArr[1];
                    iMin -= Math.max(0, i25);
                    iArr[1] = Math.max(0, -i25);
                    if (zD) {
                        e eVar5 = (e) this.f820c.getLayoutParams();
                        int measuredWidth = iMin - this.f820c.getMeasuredWidth();
                        int measuredHeight2 = this.f820c.getMeasuredHeight() + paddingTop;
                        this.f820c.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth - this.r;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zD2) {
                        e eVar6 = (e) this.d.getLayoutParams();
                        int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) eVar6).topMargin;
                        this.d.layout(iMin - this.d.getMeasuredWidth(), i26, iMin, this.d.getMeasuredHeight() + i26);
                        i13 = iMin - this.r;
                        int i27 = ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = iMax;
                } else {
                    if (z2) {
                        i8 = this.q;
                        i7 = 0;
                    } else {
                        i7 = 0;
                        i8 = 0;
                    }
                    int i28 = i8 - iArr[i7];
                    iMax += Math.max(i7, i28);
                    iArr[i7] = Math.max(i7, -i28);
                    if (zD) {
                        e eVar7 = (e) this.f820c.getLayoutParams();
                        int measuredWidth2 = this.f820c.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f820c.getMeasuredHeight() + paddingTop;
                        this.f820c.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i9 = measuredWidth2 + this.r;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) eVar7).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zD2) {
                        e eVar8 = (e) this.d.getLayoutParams();
                        int i29 = paddingTop + ((ViewGroup.MarginLayoutParams) eVar8).topMargin;
                        int measuredWidth3 = this.d.getMeasuredWidth() + iMax;
                        this.d.layout(iMax, i29, measuredWidth3, this.d.getMeasuredHeight() + i29);
                        i10 = measuredWidth3 + this.r;
                        int i30 = ((ViewGroup.MarginLayoutParams) eVar8).bottomMargin;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
                a(this.E, 3);
                size = this.E.size();
                for (i19 = i7; i19 < size; i19++) {
                    iMax = a(this.E.get(i19), iMax, iArr, iMin2);
                }
                i20 = iMin2;
                a(this.E, 5);
                size2 = this.E.size();
                for (i21 = i7; i21 < size2; i21++) {
                    iMin = b(this.E.get(i21), iMin, iArr, i20);
                }
                a(this.E, 1);
                int iA2 = a(this.E, iArr);
                i22 = (i6 + (((width - i6) - paddingRight) / 2)) - (iA2 / 2);
                i23 = iA2 + i22;
                if (i22 >= iMax) {
                    if (i23 > iMin) {
                        iMax = i22 - (i23 - iMin);
                    } else {
                        iMax = i22;
                    }
                }
                size3 = this.E.size();
                while (i7 < size3) {
                    iMax = a(this.E.get(i7), iMax, iArr, i20);
                    i7++;
                }
                this.E.clear();
            }
            i6 = paddingLeft;
            iMin2 = iMin2;
            i7 = 0;
            a(this.E, 3);
            size = this.E.size();
            while (i19 < size) {
                iMax = a(this.E.get(i19), iMax, iArr, iMin2);
            }
            i20 = iMin2;
            a(this.E, 5);
            size2 = this.E.size();
            while (i21 < size2) {
                iMin = b(this.E.get(i21), iMin, iArr, i20);
            }
            a(this.E, 1);
            int iA3 = a(this.E, iArr);
            i22 = (i6 + (((width - i6) - paddingRight) / 2)) - (iA3 / 2);
            i23 = iA3 + i22;
            if (i22 >= iMax) {
                if (i23 > iMin) {
                    iMax = i22 - (i23 - iMin);
                } else {
                    iMax = i22;
                }
            }
            size3 = this.E.size();
            while (i7 < size3) {
                iMax = a(this.E.get(i7), iMax, iArr, i20);
                i7++;
            }
            this.E.clear();
        }
        iA = paddingLeft;
        iB = i24;
        if (d(this.i)) {
            imageButton = this.i;
            if (z3) {
                iB = b(imageButton, iB, iArr, iMin2);
            } else {
                iA = a(imageButton, iA, iArr, iMin2);
            }
        }
        if (d(this.f819b)) {
            actionMenuView = this.f819b;
            if (z3) {
                iA = a(actionMenuView, iA, iArr, iMin2);
            } else {
                iB = b(actionMenuView, iB, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iA);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - iB));
        iMax = Math.max(iA, currentContentInsetLeft2);
        iMin = Math.min(iB, i24 - currentContentInsetRight2);
        if (d(this.j)) {
            view = this.j;
            if (z3) {
                iMin = b(view, iMin, iArr, iMin2);
            } else {
                iMax = a(view, iMax, iArr, iMin2);
            }
        }
        if (d(this.f)) {
            imageView = this.f;
            if (z3) {
                iMin = b(imageView, iMin, iArr, iMin2);
            } else {
                iMax = a(imageView, iMax, iArr, iMin2);
            }
        }
        zD = d(this.f820c);
        zD2 = d(this.d);
        if (zD) {
            e eVar9 = (e) this.f820c.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) eVar9).topMargin + this.f820c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar9).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zD2) {
            e eVar10 = (e) this.d.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) eVar10).topMargin + this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar10).bottomMargin;
        }
        if (zD) {
            if (zD) {
                textView = this.f820c;
            } else {
                textView = this.d;
            }
            if (zD2) {
                textView2 = this.d;
            } else {
                textView2 = this.f820c;
            }
            eVar = (e) textView.getLayoutParams();
            eVar2 = (e) textView2.getLayoutParams();
            if (zD) {
            }
            i5 = this.x & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.s;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                i15 = this.s;
                if (iMax2 < i14 + i15) {
                    iMax2 = i14 + i15;
                } else {
                    i16 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i17 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    i18 = this.t;
                    if (i16 < i17 + i18) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i18) - i16));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.t) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i11 = this.q;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zD) {
                    e eVar11 = (e) this.f820c.getLayoutParams();
                    int measuredWidth4 = iMin - this.f820c.getMeasuredWidth();
                    int measuredHeight4 = this.f820c.getMeasuredHeight() + paddingTop;
                    this.f820c.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth4 - this.r;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) eVar11).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zD2) {
                    e eVar12 = (e) this.d.getLayoutParams();
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) eVar12).topMargin;
                    this.d.layout(iMin - this.d.getMeasuredWidth(), i211, iMin, this.d.getMeasuredHeight() + i211);
                    i13 = iMin - this.r;
                    int i212 = ((ViewGroup.MarginLayoutParams) eVar12).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = iMax;
                i7 = 0;
            } else {
                if (z2) {
                    i8 = this.q;
                    i7 = 0;
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                int i213 = i8 - iArr[i7];
                iMax += Math.max(i7, i213);
                iArr[i7] = Math.max(i7, -i213);
                if (zD) {
                    e eVar13 = (e) this.f820c.getLayoutParams();
                    int measuredWidth5 = this.f820c.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f820c.getMeasuredHeight() + paddingTop;
                    this.f820c.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i9 = measuredWidth5 + this.r;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) eVar13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zD2) {
                    e eVar14 = (e) this.d.getLayoutParams();
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) eVar14).topMargin;
                    int measuredWidth6 = this.d.getMeasuredWidth() + iMax;
                    this.d.layout(iMax, i214, measuredWidth6, this.d.getMeasuredHeight() + i214);
                    i10 = measuredWidth6 + this.r;
                    int i31 = ((ViewGroup.MarginLayoutParams) eVar14).bottomMargin;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zD) {
                textView = this.f820c;
            } else {
                textView = this.d;
            }
            if (zD2) {
                textView2 = this.d;
            } else {
                textView2 = this.f820c;
            }
            eVar = (e) textView.getLayoutParams();
            eVar2 = (e) textView2.getLayoutParams();
            if (zD) {
            }
            i5 = this.x & android.support.constraint.k.AppCompatTheme_windowActionBarOverlay;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.s;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                i15 = this.s;
                if (iMax2 < i14 + i15) {
                    iMax2 = i14 + i15;
                } else {
                    i16 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i17 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    i18 = this.t;
                    if (i16 < i17 + i18) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i18) - i16));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.t) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i11 = this.q;
                } else {
                    i11 = 0;
                }
                int i215 = i11 - iArr[1];
                iMin -= Math.max(0, i215);
                iArr[1] = Math.max(0, -i215);
                if (zD) {
                    e eVar15 = (e) this.f820c.getLayoutParams();
                    int measuredWidth7 = iMin - this.f820c.getMeasuredWidth();
                    int measuredHeight6 = this.f820c.getMeasuredHeight() + paddingTop;
                    this.f820c.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth7 - this.r;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) eVar15).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zD2) {
                    e eVar16 = (e) this.d.getLayoutParams();
                    int i216 = paddingTop + ((ViewGroup.MarginLayoutParams) eVar16).topMargin;
                    this.d.layout(iMin - this.d.getMeasuredWidth(), i216, iMin, this.d.getMeasuredHeight() + i216);
                    i13 = iMin - this.r;
                    int i217 = ((ViewGroup.MarginLayoutParams) eVar16).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = iMax;
                i7 = 0;
            } else {
                if (z2) {
                    i8 = this.q;
                    i7 = 0;
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                int i218 = i8 - iArr[i7];
                iMax += Math.max(i7, i218);
                iArr[i7] = Math.max(i7, -i218);
                if (zD) {
                    e eVar17 = (e) this.f820c.getLayoutParams();
                    int measuredWidth8 = this.f820c.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f820c.getMeasuredHeight() + paddingTop;
                    this.f820c.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i9 = measuredWidth8 + this.r;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) eVar17).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zD2) {
                    e eVar18 = (e) this.d.getLayoutParams();
                    int i219 = paddingTop + ((ViewGroup.MarginLayoutParams) eVar18).topMargin;
                    int measuredWidth9 = this.d.getMeasuredWidth() + iMax;
                    this.d.layout(iMax, i219, measuredWidth9, this.d.getMeasuredHeight() + i219);
                    i10 = measuredWidth9 + this.r;
                    int i32 = ((ViewGroup.MarginLayoutParams) eVar18).bottomMargin;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        a(this.E, 3);
        size = this.E.size();
        while (i19 < size) {
            iMax = a(this.E.get(i19), iMax, iArr, iMin2);
        }
        i20 = iMin2;
        a(this.E, 5);
        size2 = this.E.size();
        while (i21 < size2) {
            iMin = b(this.E.get(i21), iMin, iArr, i20);
        }
        a(this.E, 1);
        int iA4 = a(this.E, iArr);
        i22 = (i6 + (((width - i6) - paddingRight) / 2)) - (iA4 / 2);
        i23 = iA4 + i22;
        if (i22 >= iMax) {
            if (i23 > iMin) {
                iMax = i22 - (i23 - iMin);
            } else {
                iMax = i22;
            }
        }
        size3 = this.E.size();
        while (i7 < size3) {
            iMax = a(this.E.get(i7), iMax, iArr, i20);
            i7++;
        }
        this.E.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.G;
        if (z0.a(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (d(this.e)) {
            a(this.e, i, 0, i2, 0, this.p);
            measuredWidth = this.e.getMeasuredWidth() + a(this.e);
            iMax = Math.max(0, this.e.getMeasuredHeight() + b(this.e));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.e.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (d(this.i)) {
            a(this.i, i, 0, i2, 0, this.p);
            measuredWidth = this.i.getMeasuredWidth() + a(this.i);
            iMax = Math.max(iMax, this.i.getMeasuredHeight() + b(this.i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[c3] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (d(this.f819b)) {
            a(this.f819b, i, iMax3, i2, 0, this.p);
            measuredWidth2 = this.f819b.getMeasuredWidth() + a(this.f819b);
            iMax = Math.max(iMax, this.f819b.getMeasuredHeight() + b(this.f819b));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f819b.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[c2] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (d(this.j)) {
            iMax4 += a(this.j, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.j.getMeasuredHeight() + b(this.j));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.j.getMeasuredState());
        }
        if (d(this.f)) {
            iMax4 += a(this.f, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.f.getMeasuredHeight() + b(this.f));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (((e) childAt.getLayoutParams()).f826b == 0 && d(childAt)) {
                iMax4 += a(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + b(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i4 = this.s + this.t;
        int i5 = this.q + this.r;
        if (d(this.f820c)) {
            a(this.f820c, i, iMax4 + i5, i2, i4, iArr);
            int measuredWidth3 = this.f820c.getMeasuredWidth() + a(this.f820c);
            measuredHeight = this.f820c.getMeasuredHeight() + b(this.f820c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f820c.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (d(this.d)) {
            iMax2 = Math.max(iMax2, a(this.d, i, iMax4 + i5, i2, measuredHeight + i4, iArr));
            measuredHeight += this.d.getMeasuredHeight() + b(this.d);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.d.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), r() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f819b;
        android.support.v7.view.menu.h hVarI = actionMenuView != null ? actionMenuView.i() : null;
        int i = gVar.d;
        if (i != 0 && this.L != null && hVarI != null && (menuItemFindItem = hVarI.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gVar.e) {
            q();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        l();
        this.u.a(i == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        android.support.v7.view.menu.j jVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (dVar != null && (jVar = dVar.f825c) != null) {
            gVar.d = jVar.getItemId();
        }
        gVar.e = i();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.w) {
            this.w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(b.b.d.b.a.a.c(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!c(this.f)) {
                a((View) this.f, true);
            }
        } else {
            ImageView imageView = this.f;
            if (imageView != null && c(imageView)) {
                removeView(this.f);
                this.F.remove(this.f);
            }
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            p();
        }
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(b.b.d.b.a.a.c(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            p();
            if (!c(this.e)) {
                a((View) this.e, true);
            }
        } else {
            ImageButton imageButton = this.e;
            if (imageButton != null && c(imageButton)) {
                removeView(this.e);
                this.F.remove(this.e);
            }
        }
        ImageButton imageButton2 = this.e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        p();
        this.e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        n();
        this.f819b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.d;
            if (textView != null && c(textView)) {
                removeView(this.d);
                this.F.remove(this.d);
            }
        } else {
            if (this.d == null) {
                Context context = getContext();
                y yVar = new y(context);
                this.d = yVar;
                yVar.setSingleLine();
                this.d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.n;
                if (i != 0) {
                    this.d.setTextAppearance(context, i);
                }
                int i2 = this.B;
                if (i2 != 0) {
                    this.d.setTextColor(i2);
                }
            }
            if (!c(this.d)) {
                a((View) this.d, true);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.B = i;
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f820c;
            if (textView != null && c(textView)) {
                removeView(this.f820c);
                this.F.remove(this.f820c);
            }
        } else {
            if (this.f820c == null) {
                Context context = getContext();
                y yVar = new y(context);
                this.f820c = yVar;
                yVar.setSingleLine();
                this.f820c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.f820c.setTextAppearance(context, i);
                }
                int i2 = this.A;
                if (i2 != 0) {
                    this.f820c.setTextColor(i2);
                }
            }
            if (!c(this.f820c)) {
                a((View) this.f820c, true);
            }
        }
        TextView textView2 = this.f820c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.A = i;
        TextView textView = this.f820c;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }
}
