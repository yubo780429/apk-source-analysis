package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.j0;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
final class t extends m implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, o, View.OnKeyListener {
    private static final int w = b.b.d.a.g.abc_popup_menu_item_layout;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f782c;
    private final h d;
    private final g e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;
    final j0 j;
    private PopupWindow.OnDismissListener m;
    private View n;
    View o;
    private o.a p;
    ViewTreeObserver q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean v;
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private int u = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!t.this.a() || t.this.j.k()) {
                return;
            }
            View view = t.this.o;
            if (view == null || !view.isShown()) {
                t.this.dismiss();
            } else {
                t.this.j.c();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = t.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    t.this.q = view.getViewTreeObserver();
                }
                t tVar = t.this;
                tVar.q.removeGlobalOnLayoutListener(tVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public t(Context context, h hVar, View view, int i, int i2, boolean z) {
        this.f782c = context;
        this.d = hVar;
        this.f = z;
        this.e = new g(hVar, LayoutInflater.from(context), this.f, w);
        this.h = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(b.b.d.a.d.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new j0(this.f782c, null, this.h, this.i);
        hVar.a(this, context);
    }

    private boolean g() {
        View view;
        if (a()) {
            return true;
        }
        if (this.r || (view = this.n) == null) {
            return false;
        }
        this.o = view;
        this.j.a((PopupWindow.OnDismissListener) this);
        this.j.a((AdapterView.OnItemClickListener) this);
        this.j.a(true);
        View view2 = this.o;
        boolean z = this.q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.k);
        }
        view2.addOnAttachStateChangeListener(this.l);
        this.j.a(view2);
        this.j.c(this.u);
        if (!this.s) {
            this.t = m.a(this.e, null, this.f782c, this.g);
            this.s = true;
        }
        this.j.b(this.t);
        this.j.e(2);
        this.j.a(f());
        this.j.c();
        ListView listViewB = this.j.b();
        listViewB.setOnKeyListener(this);
        if (this.v && this.d.h() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f782c).inflate(b.b.d.a.g.abc_popup_menu_header_item_layout, (ViewGroup) listViewB, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.d.h());
            }
            frameLayout.setEnabled(false);
            listViewB.addHeaderView(frameLayout, null, false);
        }
        this.j.a((ListAdapter) this.e);
        this.j.c();
        return true;
    }

    @Override // android.support.v7.view.menu.m
    public void a(int i) {
        this.u = i;
    }

    @Override // android.support.v7.view.menu.m
    public void a(h hVar) {
    }

    @Override // android.support.v7.view.menu.o
    public void a(h hVar, boolean z) {
        if (hVar != this.d) {
            return;
        }
        dismiss();
        o.a aVar = this.p;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    @Override // android.support.v7.view.menu.o
    public void a(o.a aVar) {
        this.p = aVar;
    }

    @Override // android.support.v7.view.menu.m
    public void a(View view) {
        this.n = view;
    }

    @Override // android.support.v7.view.menu.m
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // android.support.v7.view.menu.o
    public void a(boolean z) {
        this.s = false;
        g gVar = this.e;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.s
    public boolean a() {
        return !this.r && this.j.a();
    }

    @Override // android.support.v7.view.menu.o
    public boolean a(u uVar) {
        if (uVar.hasVisibleItems()) {
            n nVar = new n(this.f782c, uVar, this.o, this.f, this.h, this.i);
            nVar.a(this.p);
            nVar.a(m.b(uVar));
            nVar.a(this.m);
            this.m = null;
            this.d.a(false);
            int iG = this.j.g();
            int iH = this.j.h();
            if ((Gravity.getAbsoluteGravity(this.u, b.b.c.g.q.d(this.n)) & 7) == 5) {
                iG += this.n.getWidth();
            }
            if (nVar.a(iG, iH)) {
                o.a aVar = this.p;
                if (aVar == null) {
                    return true;
                }
                aVar.a(uVar);
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.view.menu.s
    public ListView b() {
        return this.j.b();
    }

    @Override // android.support.v7.view.menu.m
    public void b(int i) {
        this.j.d(i);
    }

    @Override // android.support.v7.view.menu.m
    public void b(boolean z) {
        this.e.a(z);
    }

    @Override // android.support.v7.view.menu.s
    public void c() {
        if (!g()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // android.support.v7.view.menu.m
    public void c(int i) {
        this.j.h(i);
    }

    @Override // android.support.v7.view.menu.m
    public void c(boolean z) {
        this.v = z;
    }

    @Override // android.support.v7.view.menu.o
    public boolean d() {
        return false;
    }

    @Override // android.support.v7.view.menu.s
    public void dismiss() {
        if (a()) {
            this.j.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.r = true;
        this.d.close();
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
