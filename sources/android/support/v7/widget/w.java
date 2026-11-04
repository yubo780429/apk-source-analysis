package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class w extends Spinner implements b.b.c.g.p {
    private static final int[] j = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f933c;
    private f0 d;
    private SpinnerAdapter e;
    private final boolean f;
    c g;
    int h;
    final Rect i;

    class a extends f0 {
        final /* synthetic */ c k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, c cVar) {
            super(view);
            this.k = cVar;
        }

        @Override // android.support.v7.widget.f0
        public android.support.v7.view.menu.s a() {
            return this.k;
        }

        @Override // android.support.v7.widget.f0
        public boolean b() {
            if (w.this.g.a()) {
                return true;
            }
            w.this.g.c();
            return true;
        }
    }

    private static class b implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SpinnerAdapter f934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ListAdapter f935c;

        public b(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f934b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f935c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof p0) {
                    p0 p0Var = (p0) spinnerAdapter;
                    if (p0Var.getDropDownViewTheme() == null) {
                        p0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f935c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f934b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f934b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f934b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f934b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f934b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f935c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f934b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f934b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    private class c extends h0 {
        private CharSequence J;
        ListAdapter K;
        private final Rect L;

        class a implements AdapterView.OnItemClickListener {
            a(w wVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                w.this.setSelection(i);
                if (w.this.getOnItemClickListener() != null) {
                    c cVar = c.this;
                    w.this.performItemClick(view, i, cVar.K.getItemId(i));
                }
                c.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                c cVar = c.this;
                if (!cVar.b(w.this)) {
                    c.this.dismiss();
                } else {
                    c.this.l();
                    c.super.c();
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v7.widget.w$c$c, reason: collision with other inner class name */
        class C0034c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f938b;

            C0034c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f938b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f938b);
                }
            }
        }

        public c(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.L = new Rect();
            a(w.this);
            a(true);
            f(0);
            a(new a(w.this));
        }

        @Override // android.support.v7.widget.h0
        public void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.K = listAdapter;
        }

        public void a(CharSequence charSequence) {
            this.J = charSequence;
        }

        boolean b(View view) {
            return b.b.c.g.q.j(view) && view.getGlobalVisibleRect(this.L);
        }

        @Override // android.support.v7.widget.h0, android.support.v7.view.menu.s
        public void c() {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            l();
            e(2);
            super.c();
            b().setChoiceMode(1);
            g(w.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = w.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            a(new C0034c(bVar));
        }

        /* JADX WARN: Code duplicated, block: B:23:0x008d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0095  */
        void l() {
            int iMax;
            int i;
            Drawable drawableF = f();
            int i2 = 0;
            if (drawableF != null) {
                drawableF.getPadding(w.this.i);
                i2 = z0.a(w.this) ? w.this.i.right : -w.this.i.left;
            } else {
                Rect rect = w.this.i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = w.this.getPaddingLeft();
            int paddingRight = w.this.getPaddingRight();
            int width = w.this.getWidth();
            w wVar = w.this;
            int i3 = wVar.h;
            if (i3 != -2) {
                if (i3 == -1) {
                    iMax = (width - paddingLeft) - paddingRight;
                } else {
                    b(i3);
                }
                if (z0.a(w.this)) {
                    i = i2 + ((width - paddingRight) - i());
                } else {
                    i = i2 + paddingLeft;
                }
                d(i);
            }
            int iA = wVar.a((SpinnerAdapter) this.K, f());
            int i4 = w.this.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = w.this.i;
            int i5 = (i4 - rect2.left) - rect2.right;
            if (iA > i5) {
                iA = i5;
            }
            iMax = Math.max(iA, (width - paddingLeft) - paddingRight);
            b(iMax);
            if (z0.a(w.this)) {
                i = i2 + ((width - paddingRight) - i());
            } else {
                i = i2 + paddingLeft;
            }
            d(i);
        }

        public CharSequence m() {
            return this.J;
        }
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b.d.a.a.spinnerStyle);
    }

    public w(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public w(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[Catch: Exception -> 0x005a, all -> 0x006a, TRY_LEAVE, TryCatch #1 {Exception -> 0x005a, blocks: (B:19:0x004a, B:21:0x0050), top: B:48:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[PHI: r11 r12
  0x0056: PHI (r11v4 int) = (r11v0 int), (r11v6 int) binds: [B:31:0x0067, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r12v13 android.content.res.TypedArray) = (r12v12 android.content.res.TypedArray), (r12v15 android.content.res.TypedArray) binds: [B:31:0x0067, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public w(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) throws Throwable {
        b.b.d.d.d dVar;
        CharSequence[] charSequenceArrF;
        SpinnerAdapter spinnerAdapter;
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.i = new Rect();
        t0 t0VarA = t0.a(context, attributeSet, b.b.d.a.j.Spinner, i, 0);
        this.f932b = new e(this);
        TypedArray typedArray = null;
        if (theme == null) {
            int iG = t0VarA.g(b.b.d.a.j.Spinner_popupTheme, 0);
            if (iG != 0) {
                dVar = new b.b.d.d.d(context, iG);
            } else {
                this.f933c = Build.VERSION.SDK_INT < 23 ? context : null;
            }
            if (this.f933c != null) {
                if (i2 == -1) {
                    try {
                        typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j, i, 0);
                        try {
                            try {
                                i2 = typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getInt(0, 0) : i2;
                                if (typedArrayObtainStyledAttributes != null) {
                                    typedArrayObtainStyledAttributes.recycle();
                                }
                            } catch (Throwable th) {
                                th = th;
                                typedArray = typedArrayObtainStyledAttributes;
                                if (typedArray != null) {
                                    typedArray.recycle();
                                }
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                            if (typedArrayObtainStyledAttributes != null) {
                                typedArrayObtainStyledAttributes.recycle();
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        typedArrayObtainStyledAttributes = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (typedArray != null) {
                            typedArray.recycle();
                        }
                        throw th;
                    }
                }
                if (i2 == 1) {
                    c cVar = new c(this.f933c, attributeSet, i);
                    t0 t0VarA2 = t0.a(this.f933c, attributeSet, b.b.d.a.j.Spinner, i, 0);
                    this.h = t0VarA2.f(b.b.d.a.j.Spinner_android_dropDownWidth, -2);
                    cVar.a(t0VarA2.b(b.b.d.a.j.Spinner_android_popupBackground));
                    cVar.a(t0VarA.d(b.b.d.a.j.Spinner_android_prompt));
                    t0VarA2.a();
                    this.g = cVar;
                    this.d = new a(this, cVar);
                }
            }
            charSequenceArrF = t0VarA.f(b.b.d.a.j.Spinner_android_entries);
            if (charSequenceArrF != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrF);
                arrayAdapter.setDropDownViewResource(b.b.d.a.g.support_simple_spinner_dropdown_item);
                setAdapter((SpinnerAdapter) arrayAdapter);
            }
            t0VarA.a();
            this.f = true;
            spinnerAdapter = this.e;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.e = null;
            }
            this.f932b.a(attributeSet, i);
        }
        dVar = new b.b.d.d.d(context, theme);
        this.f933c = dVar;
        if (this.f933c != null) {
            if (i2 == -1) {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j, i, 0);
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                }
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
            }
            if (i2 == 1) {
                c cVar2 = new c(this.f933c, attributeSet, i);
                t0 t0VarA3 = t0.a(this.f933c, attributeSet, b.b.d.a.j.Spinner, i, 0);
                this.h = t0VarA3.f(b.b.d.a.j.Spinner_android_dropDownWidth, -2);
                cVar2.a(t0VarA3.b(b.b.d.a.j.Spinner_android_popupBackground));
                cVar2.a(t0VarA.d(b.b.d.a.j.Spinner_android_prompt));
                t0VarA3.a();
                this.g = cVar2;
                this.d = new a(this, cVar2);
            }
        }
        charSequenceArrF = t0VarA.f(b.b.d.a.j.Spinner_android_entries);
        if (charSequenceArrF != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrF);
            arrayAdapter2.setDropDownViewResource(b.b.d.a.g.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        t0VarA.a();
        this.f = true;
        spinnerAdapter = this.e;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.e = null;
        }
        this.f932b.a(attributeSet, i);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.i);
        Rect rect = this.i;
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f932b;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.g != null) {
            return this.h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.f();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        if (this.g != null) {
            return this.f933c;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        c cVar = this.g;
        return cVar != null ? cVar.m() : super.getPrompt();
    }

    @Override // b.b.c.g.p
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f932b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // b.b.c.g.p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f932b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.g;
        if (cVar == null || !cVar.a()) {
            return;
        }
        this.g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.d;
        if (f0Var == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        c cVar = this.g;
        if (cVar == null) {
            return super.performClick();
        }
        if (cVar.a()) {
            return true;
        }
        this.g.c();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f) {
            this.e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.g != null) {
            Context context = this.f933c;
            if (context == null) {
                context = getContext();
            }
            this.g.a(new b(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f932b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f932b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.d(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.h(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.g != null) {
            this.h = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(b.b.d.b.a.a.c(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f932b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f932b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }
}
