package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class c extends android.support.v7.view.menu.b implements b.b.c.g.c.a {
    RunnableC0033c A;
    private b B;
    final f C;
    int D;
    d j;
    private Drawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private final SparseBooleanArray w;
    private View x;
    e y;
    a z;

    private class a extends android.support.v7.view.menu.n {
        public a(Context context, android.support.v7.view.menu.u uVar, View view) {
            super(context, uVar, view, false, b.b.d.a.a.actionOverflowMenuStyle);
            if (!((android.support.v7.view.menu.j) uVar.getItem()).h()) {
                View view2 = c.this.j;
                a(view2 == null ? (View) ((android.support.v7.view.menu.b) c.this).i : view2);
            }
            a(c.this.C);
        }

        @Override // android.support.v7.view.menu.n
        protected void d() {
            c cVar = c.this;
            cVar.z = null;
            cVar.D = 0;
            super.d();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // android.support.v7.view.menu.ActionMenuItemView.b
        public android.support.v7.view.menu.s a() {
            a aVar = c.this.z;
            if (aVar != null) {
                return aVar.b();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0033c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f836b;

        public RunnableC0033c(e eVar) {
            this.f836b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((android.support.v7.view.menu.b) c.this).d != null) {
                ((android.support.v7.view.menu.b) c.this).d.a();
            }
            View view = (View) ((android.support.v7.view.menu.b) c.this).i;
            if (view != null && view.getWindowToken() != null && this.f836b.f()) {
                c.this.y = this.f836b;
            }
            c.this.A = null;
        }
    }

    private class d extends o implements ActionMenuView.a {

        class a extends f0 {
            a(View view, c cVar) {
                super(view);
            }

            @Override // android.support.v7.widget.f0
            public android.support.v7.view.menu.s a() {
                e eVar = c.this.y;
                if (eVar == null) {
                    return null;
                }
                return eVar.b();
            }

            @Override // android.support.v7.widget.f0
            public boolean b() {
                c.this.i();
                return true;
            }

            @Override // android.support.v7.widget.f0
            public boolean c() {
                c cVar = c.this;
                if (cVar.A != null) {
                    return false;
                }
                cVar.e();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, b.b.d.a.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            v0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.i();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                android.support.v4.graphics.drawable.a.a(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class e extends android.support.v7.view.menu.n {
        public e(Context context, android.support.v7.view.menu.h hVar, View view, boolean z) {
            super(context, hVar, view, z, b.b.d.a.a.actionOverflowMenuStyle);
            a(8388613);
            a(c.this.C);
        }

        @Override // android.support.v7.view.menu.n
        protected void d() {
            if (((android.support.v7.view.menu.b) c.this).d != null) {
                ((android.support.v7.view.menu.b) c.this).d.close();
            }
            c.this.y = null;
            super.d();
        }
    }

    private class f implements android.support.v7.view.menu.o.a {
        f() {
        }

        @Override // android.support.v7.view.menu.o.a
        public void a(android.support.v7.view.menu.h hVar, boolean z) {
            if (hVar instanceof android.support.v7.view.menu.u) {
                hVar.m().a(false);
            }
            android.support.v7.view.menu.o.a aVarA = c.this.a();
            if (aVarA != null) {
                aVarA.a(hVar, z);
            }
        }

        @Override // android.support.v7.view.menu.o.a
        public boolean a(android.support.v7.view.menu.h hVar) {
            if (hVar == null) {
                return false;
            }
            c.this.D = ((android.support.v7.view.menu.u) hVar).getItem().getItemId();
            android.support.v7.view.menu.o.a aVarA = c.this.a();
            if (aVarA != null) {
                return aVarA.a(hVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, b.b.d.a.g.abc_action_menu_layout, b.b.d.a.g.abc_action_menu_item_layout);
        this.w = new SparseBooleanArray();
        this.C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof android.support.v7.view.menu.p.a) && ((android.support.v7.view.menu.p.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.support.v7.view.menu.b
    public View a(android.support.v7.view.menu.j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.f()) {
            actionView = super.a(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.o
    public void a(Context context, android.support.v7.view.menu.h hVar) {
        super.a(context, hVar);
        Resources resources = context.getResources();
        b.b.d.d.a aVarA = b.b.d.d.a.a(context);
        if (!this.n) {
            this.m = aVarA.g();
        }
        if (!this.t) {
            this.o = aVarA.b();
        }
        if (!this.r) {
            this.q = aVarA.c();
        }
        int measuredWidth = this.o;
        if (this.m) {
            if (this.j == null) {
                d dVar = new d(this.f743b);
                this.j = dVar;
                if (this.l) {
                    dVar.setImageDrawable(this.k);
                    this.k = null;
                    this.l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.p = measuredWidth;
        this.v = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.x = null;
    }

    public void a(Configuration configuration) {
        if (!this.r) {
            this.q = b.b.d.d.a.a(this.f744c).c();
        }
        android.support.v7.view.menu.h hVar = this.d;
        if (hVar != null) {
            hVar.b(true);
        }
    }

    public void a(Drawable drawable) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.l = true;
            this.k = drawable;
        }
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.o
    public void a(android.support.v7.view.menu.h hVar, boolean z) {
        b();
        super.a(hVar, z);
    }

    @Override // android.support.v7.view.menu.b
    public void a(android.support.v7.view.menu.j jVar, android.support.v7.view.menu.p.a aVar) {
        aVar.a(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    public void a(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.a(this.d);
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.o
    public void a(boolean z) {
        super.a(z);
        ((View) this.i).requestLayout();
        android.support.v7.view.menu.h hVar = this.d;
        boolean z2 = false;
        if (hVar != null) {
            ArrayList<android.support.v7.view.menu.j> arrayListC = hVar.c();
            int size = arrayListC.size();
            for (int i = 0; i < size; i++) {
                b.b.c.g.c cVarA = arrayListC.get(i).a();
                if (cVarA != null) {
                    cVarA.a(this);
                }
            }
        }
        android.support.v7.view.menu.h hVar2 = this.d;
        ArrayList<android.support.v7.view.menu.j> arrayListJ = hVar2 != null ? hVar2.j() : null;
        if (this.m && arrayListJ != null) {
            int size2 = arrayListJ.size();
            if (size2 == 1) {
                z2 = !arrayListJ.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        d dVar = this.j;
        if (z2) {
            if (dVar == null) {
                this.j = new d(this.f743b);
            }
            ViewGroup viewGroup = (ViewGroup) this.j.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                actionMenuView.addView(this.j, actionMenuView.d());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.i;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.j);
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.m);
    }

    @Override // android.support.v7.view.menu.b
    public boolean a(int i, android.support.v7.view.menu.j jVar) {
        return jVar.h();
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.o
    public boolean a(android.support.v7.view.menu.u uVar) {
        boolean z = false;
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        android.support.v7.view.menu.u uVar2 = uVar;
        while (uVar2.t() != this.d) {
            uVar2 = (android.support.v7.view.menu.u) uVar2.t();
        }
        View viewA = a(uVar2.getItem());
        if (viewA == null) {
            return false;
        }
        uVar.getItem().getItemId();
        int size = uVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = uVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        a aVar = new a(this.f744c, uVar, viewA);
        this.z = aVar;
        aVar.a(z);
        this.z.e();
        super.a(uVar);
        return true;
    }

    @Override // android.support.v7.view.menu.b
    public boolean a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.j) {
            return false;
        }
        return super.a(viewGroup, i);
    }

    @Override // android.support.v7.view.menu.b
    public android.support.v7.view.menu.p b(ViewGroup viewGroup) {
        android.support.v7.view.menu.p pVar = this.i;
        android.support.v7.view.menu.p pVarB = super.b(viewGroup);
        if (pVar != pVarB) {
            ((ActionMenuView) pVarB).setPresenter(this);
        }
        return pVarB;
    }

    public void b(boolean z) {
        this.u = z;
    }

    public boolean b() {
        return f() | e();
    }

    public Drawable c() {
        d dVar = this.j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.l) {
            return this.k;
        }
        return null;
    }

    public void c(boolean z) {
        this.m = z;
        this.n = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v7.widget.c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.support.v7.view.menu.j] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    @Override // android.support.v7.view.menu.o
    public boolean d() {
        ArrayList<android.support.v7.view.menu.j> arrayListN;
        int size;
        int i;
        int iA;
        ?? r0;
        c cVar = this;
        android.support.v7.view.menu.h hVar = cVar.d;
        ?? r2 = 0;
        if (hVar != null) {
            arrayListN = hVar.n();
            size = arrayListN.size();
        } else {
            arrayListN = null;
            size = 0;
        }
        int i2 = cVar.q;
        int i3 = cVar.p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.i;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            android.support.v7.view.menu.j jVar = arrayListN.get(i6);
            if (jVar.k()) {
                i4++;
            } else if (jVar.j()) {
                i5++;
            } else {
                z = true;
            }
            if (cVar.u && jVar.isActionViewExpanded()) {
                i2 = 0;
            }
        }
        if (cVar.m && (z || i5 + i4 > i2)) {
            i2--;
        }
        int i7 = i2 - i4;
        SparseBooleanArray sparseBooleanArray = cVar.w;
        sparseBooleanArray.clear();
        if (cVar.s) {
            int i8 = cVar.v;
            iA = i3 / i8;
            i = i8 + ((i3 % i8) / iA);
        } else {
            i = 0;
            iA = 0;
        }
        int i9 = 0;
        int i10 = 0;
        ?? r1 = cVar;
        while (i9 < size) {
            android.support.v7.view.menu.j jVar2 = arrayListN.get(i9);
            if (jVar2.k()) {
                View viewA = r1.a(jVar2, r1.x, viewGroup);
                if (r1.x == null) {
                    r1.x = viewA;
                }
                if (r1.s) {
                    iA -= ActionMenuView.a(viewA, i, iA, iMakeMeasureSpec, (int) r2);
                } else {
                    viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.d(true);
                r0 = r2;
                size = size;
            } else if (jVar2.j()) {
                int groupId2 = jVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i7 > 0 || z2) && i3 > 0 && (!r1.s || iA > 0);
                boolean z4 = z3;
                if (z3) {
                    View viewA2 = r1.a(jVar2, r1.x, viewGroup);
                    if (r1.x == null) {
                        r1.x = viewA2;
                    }
                    if (r1.s) {
                        int iA2 = ActionMenuView.a(viewA2, i, iA, iMakeMeasureSpec, 0);
                        iA -= iA2;
                        if (iA2 == 0) {
                            z4 = false;
                        }
                    } else {
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z3 = z4 & (!r1.s ? i3 + i10 <= 0 : i3 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i11 = 0; i11 < i9; i11++) {
                        android.support.v7.view.menu.j jVar3 = arrayListN.get(i11);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.h()) {
                                i7++;
                            }
                            jVar3.d(false);
                        }
                    }
                }
                if (z3) {
                    i7--;
                }
                jVar2.d(z3);
                r0 = 0;
            } else {
                r0 = r2;
                size = size;
                jVar2.d(r0);
            }
            i9++;
            r2 = r0;
            size = size;
            r1 = this;
        }
        return true;
    }

    public boolean e() {
        Object obj;
        RunnableC0033c runnableC0033c = this.A;
        if (runnableC0033c != null && (obj = this.i) != null) {
            ((View) obj).removeCallbacks(runnableC0033c);
            this.A = null;
            return true;
        }
        e eVar = this.y;
        if (eVar == null) {
            return false;
        }
        eVar.a();
        return true;
    }

    public boolean f() {
        a aVar = this.z;
        if (aVar == null) {
            return false;
        }
        aVar.a();
        return true;
    }

    public boolean g() {
        return this.A != null || h();
    }

    public boolean h() {
        e eVar = this.y;
        return eVar != null && eVar.c();
    }

    public boolean i() {
        android.support.v7.view.menu.h hVar;
        if (!this.m || h() || (hVar = this.d) == null || this.i == null || this.A != null || hVar.j().isEmpty()) {
            return false;
        }
        RunnableC0033c runnableC0033c = new RunnableC0033c(new e(this.f744c, this.d, this.j, true));
        this.A = runnableC0033c;
        ((View) this.i).post(runnableC0033c);
        super.a((android.support.v7.view.menu.u) null);
        return true;
    }
}
