package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class h0 implements android.support.v7.view.menu.s {
    private static Method G;
    private static Method H;
    private static Method I;
    private final c A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ListAdapter f862c;
    d0 d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    int p;
    private View q;
    private int r;
    private DataSetObserver s;
    private View t;
    private Drawable u;
    private AdapterView.OnItemClickListener v;
    private AdapterView.OnItemSelectedListener w;
    final g x;
    private final f y;
    private final e z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewE = h0.this.e();
            if (viewE == null || viewE.getWindowToken() == null) {
                return;
            }
            h0.this.c();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            d0 d0Var;
            if (i == -1 || (d0Var = h0.this.d) == null) {
                return;
            }
            d0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h0.this.d();
        }
    }

    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (h0.this.a()) {
                h0.this.c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            h0.this.dismiss();
        }
    }

    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || h0.this.j() || h0.this.F.getContentView() == null) {
                return;
            }
            h0 h0Var = h0.this;
            h0Var.B.removeCallbacks(h0Var.x);
            h0.this.x.run();
        }
    }

    private class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = h0.this.F) != null && popupWindow.isShowing() && x >= 0 && x < h0.this.F.getWidth() && y >= 0 && y < h0.this.F.getHeight()) {
                h0 h0Var = h0.this;
                h0Var.B.postDelayed(h0Var.x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            h0 h0Var2 = h0.this;
            h0Var2.B.removeCallbacks(h0Var2.x);
            return false;
        }
    }

    private class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0 d0Var = h0.this.d;
            if (d0Var == null || !b.b.c.g.q.j(d0Var) || h0.this.d.getCount() <= h0.this.d.getChildCount()) {
                return;
            }
            int childCount = h0.this.d.getChildCount();
            h0 h0Var = h0.this;
            if (childCount <= h0Var.p) {
                h0Var.F.setInputMethodMode(2);
                h0.this.c();
            }
        }
    }

    static {
        try {
            G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public h0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public h0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = -2;
        this.f = -2;
        this.i = 1002;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = Integer.MAX_VALUE;
        this.r = 0;
        this.x = new g();
        this.y = new f();
        this.z = new e();
        this.A = new c();
        this.C = new Rect();
        this.f861b = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.d.a.j.ListPopupWindow, i, i2);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b.b.d.a.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b.b.d.a.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i, i2);
        this.F = qVar;
        qVar.setInputMethodMode(1);
    }

    private int a(View view, int i, boolean z) {
        Method method = H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.F, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.F.getMaxAvailableHeight(view, i);
    }

    private void c(boolean z) {
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0128 A[PHI: r1
  0x0128: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x011d, B:47:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    private int l() {
        int measuredHeight;
        int i;
        int iMakeMeasureSpec;
        View view;
        int i2;
        int i3 = Integer.MIN_VALUE;
        if (this.d == null) {
            Context context = this.f861b;
            new a();
            d0 d0VarA = a(context, !this.E);
            this.d = d0VarA;
            Drawable drawable = this.u;
            if (drawable != null) {
                d0VarA.setSelector(drawable);
            }
            this.d.setAdapter(this.f862c);
            this.d.setOnItemClickListener(this.v);
            this.d.setFocusable(true);
            this.d.setFocusableInTouchMode(true);
            this.d.setOnItemSelectedListener(new b());
            this.d.setOnScrollListener(this.z);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.w;
            if (onItemSelectedListener != null) {
                this.d.setOnItemSelectedListener(onItemSelectedListener);
            }
            d0 d0Var = this.d;
            View view2 = this.q;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.r;
                if (i4 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(d0Var, layoutParams);
                } else if (i4 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.r);
                } else {
                    linearLayout.addView(d0Var, layoutParams);
                    linearLayout.addView(view2);
                }
                int i5 = this.f;
                if (i5 >= 0) {
                    i2 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i2 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i5, i2), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = d0Var;
            }
            this.F.setContentView(view);
        } else {
            View view3 = this.q;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i6 = rect.top;
            i = rect.bottom + i6;
            if (!this.j) {
                this.h = -i6;
            }
        } else {
            this.C.setEmpty();
            i = 0;
        }
        int iA = a(e(), this.h, this.F.getInputMethodMode() == 2);
        if (this.n || this.e == -1) {
            return iA + i;
        }
        int i7 = this.f;
        if (i7 != -2) {
            i3 = 1073741824;
            if (i7 != -1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
            } else {
                int i8 = this.f861b.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.C;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), i3);
            }
        } else {
            int i9 = this.f861b.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), i3);
        }
        int iA2 = this.d.a(iMakeMeasureSpec, 0, -1, iA - measuredHeight, -1);
        if (iA2 > 0) {
            measuredHeight += i + this.d.getPaddingTop() + this.d.getPaddingBottom();
        }
        return iA2 + measuredHeight;
    }

    private void m() {
        View view = this.q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.q);
            }
        }
    }

    d0 a(Context context, boolean z) {
        return new d0(context, z);
    }

    public void a(int i) {
        this.F.setAnimationStyle(i);
    }

    public void a(Rect rect) {
        this.D = rect;
    }

    public void a(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void a(View view) {
        this.t = view;
    }

    public void a(AdapterView.OnItemClickListener onItemClickListener) {
        this.v = onItemClickListener;
    }

    public void a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.s;
        if (dataSetObserver == null) {
            this.s = new d();
        } else {
            ListAdapter listAdapter2 = this.f862c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f862c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        d0 d0Var = this.d;
        if (d0Var != null) {
            d0Var.setAdapter(this.f862c);
        }
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void a(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
    }

    @Override // android.support.v7.view.menu.s
    public boolean a() {
        return this.F.isShowing();
    }

    @Override // android.support.v7.view.menu.s
    public ListView b() {
        return this.d;
    }

    public void b(int i) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            i(i);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f = rect.left + rect.right + i;
    }

    public void b(boolean z) {
        this.l = true;
        this.k = z;
    }

    @Override // android.support.v7.view.menu.s
    public void c() {
        int iL = l();
        boolean zJ = j();
        android.support.v4.widget.j.a(this.F, this.i);
        if (this.F.isShowing()) {
            if (b.b.c.g.q.j(e())) {
                int width = this.f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = e().getWidth();
                }
                int i = this.e;
                if (i == -1) {
                    if (!zJ) {
                        iL = -1;
                    }
                    if (zJ) {
                        this.F.setWidth(this.f == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i != -2) {
                    iL = i;
                }
                this.F.setOutsideTouchable((this.o || this.n) ? false : true);
                this.F.update(e(), this.g, this.h, width < 0 ? -1 : width, iL < 0 ? -1 : iL);
                return;
            }
            return;
        }
        int width2 = this.f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = e().getWidth();
        }
        int i2 = this.e;
        if (i2 == -1) {
            iL = -1;
        } else if (i2 != -2) {
            iL = i2;
        }
        this.F.setWidth(width2);
        this.F.setHeight(iL);
        c(true);
        this.F.setOutsideTouchable((this.o || this.n) ? false : true);
        this.F.setTouchInterceptor(this.y);
        if (this.l) {
            android.support.v4.widget.j.a(this.F, this.k);
        }
        Method method = I;
        if (method != null) {
            try {
                method.invoke(this.F, this.D);
            } catch (Exception e2) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
            }
        }
        android.support.v4.widget.j.a(this.F, e(), this.g, this.h, this.m);
        this.d.setSelection(-1);
        if (!this.E || this.d.isInTouchMode()) {
            d();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.A);
    }

    public void c(int i) {
        this.m = i;
    }

    public void d() {
        d0 d0Var = this.d;
        if (d0Var != null) {
            d0Var.setListSelectionHidden(true);
            d0Var.requestLayout();
        }
    }

    public void d(int i) {
        this.g = i;
    }

    @Override // android.support.v7.view.menu.s
    public void dismiss() {
        this.F.dismiss();
        m();
        this.F.setContentView(null);
        this.d = null;
        this.B.removeCallbacks(this.x);
    }

    public View e() {
        return this.t;
    }

    public void e(int i) {
        this.F.setInputMethodMode(i);
    }

    public Drawable f() {
        return this.F.getBackground();
    }

    public void f(int i) {
        this.r = i;
    }

    public int g() {
        return this.g;
    }

    public void g(int i) {
        d0 d0Var = this.d;
        if (!a() || d0Var == null) {
            return;
        }
        d0Var.setListSelectionHidden(false);
        d0Var.setSelection(i);
        if (d0Var.getChoiceMode() != 0) {
            d0Var.setItemChecked(i, true);
        }
    }

    public int h() {
        if (this.j) {
            return this.h;
        }
        return 0;
    }

    public void h(int i) {
        this.h = i;
        this.j = true;
    }

    public int i() {
        return this.f;
    }

    public void i(int i) {
        this.f = i;
    }

    public boolean j() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean k() {
        return this.E;
    }
}
