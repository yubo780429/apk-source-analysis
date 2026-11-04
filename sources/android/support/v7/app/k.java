package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.b0;
import android.support.v7.widget.m0;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import b.b.c.g.q;
import b.b.c.g.u;
import b.b.c.g.v;
import b.b.c.g.w;
import b.b.c.g.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class k extends android.support.v7.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();
    final x A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ActionBarOverlayLayout f732c;
    ActionBarContainer d;
    b0 e;
    ActionBarContextView f;
    View g;
    m0 h;
    private boolean i;
    d j;
    b.b.d.d.b k;
    b.b.d.d.b.a l;
    private boolean m;
    private ArrayList<android.support.v7.app.a.b> n;
    private boolean o;
    private int p;
    boolean q;
    boolean r;
    boolean s;
    private boolean t;
    private boolean u;
    b.b.d.d.h v;
    private boolean w;
    boolean x;
    final v y;
    final v z;

    class a extends w {
        a() {
        }

        @Override // b.b.c.g.v
        public void a(View view) {
            View view2;
            k kVar = k.this;
            if (kVar.q && (view2 = kVar.g) != null) {
                view2.setTranslationY(0.0f);
                k.this.d.setTranslationY(0.0f);
            }
            k.this.d.setVisibility(8);
            k.this.d.setTransitioning(false);
            k kVar2 = k.this;
            kVar2.v = null;
            kVar2.l();
            ActionBarOverlayLayout actionBarOverlayLayout = k.this.f732c;
            if (actionBarOverlayLayout != null) {
                q.m(actionBarOverlayLayout);
            }
        }
    }

    class b extends w {
        b() {
        }

        @Override // b.b.c.g.v
        public void a(View view) {
            k kVar = k.this;
            kVar.v = null;
            kVar.d.requestLayout();
        }
    }

    class c implements x {
        c() {
        }

        @Override // b.b.c.g.x
        public void a(View view) {
            ((View) k.this.d.getParent()).invalidate();
        }
    }

    public class d extends b.b.d.d.b implements android.support.v7.view.menu.h.a {
        private final Context d;
        private final android.support.v7.view.menu.h e;
        private b.b.d.d.b.a f;
        private WeakReference<View> g;

        public d(Context context, b.b.d.d.b.a aVar) {
            this.d = context;
            this.f = aVar;
            android.support.v7.view.menu.h hVar = new android.support.v7.view.menu.h(context);
            hVar.c(1);
            this.e = hVar;
            hVar.a(this);
        }

        @Override // b.b.d.d.b
        public void a() {
            k kVar = k.this;
            if (kVar.j != this) {
                return;
            }
            if (k.a(kVar.r, kVar.s, false)) {
                this.f.a(this);
            } else {
                k kVar2 = k.this;
                kVar2.k = this;
                kVar2.l = this.f;
            }
            this.f = null;
            k.this.e(false);
            k.this.f.a();
            k.this.e.k().sendAccessibilityEvent(32);
            k kVar3 = k.this;
            kVar3.f732c.setHideOnContentScrollEnabled(kVar3.x);
            k.this.j = null;
        }

        @Override // b.b.d.d.b
        public void a(int i) {
            a((CharSequence) k.this.f730a.getResources().getString(i));
        }

        @Override // android.support.v7.view.menu.h.a
        public void a(android.support.v7.view.menu.h hVar) {
            if (this.f == null) {
                return;
            }
            i();
            k.this.f.d();
        }

        @Override // b.b.d.d.b
        public void a(View view) {
            k.this.f.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // b.b.d.d.b
        public void a(CharSequence charSequence) {
            k.this.f.setSubtitle(charSequence);
        }

        @Override // b.b.d.d.b
        public void a(boolean z) {
            super.a(z);
            k.this.f.setTitleOptional(z);
        }

        @Override // android.support.v7.view.menu.h.a
        public boolean a(android.support.v7.view.menu.h hVar, MenuItem menuItem) {
            b.b.d.d.b.a aVar = this.f;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // b.b.d.d.b
        public View b() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // b.b.d.d.b
        public void b(int i) {
            b(k.this.f730a.getResources().getString(i));
        }

        @Override // b.b.d.d.b
        public void b(CharSequence charSequence) {
            k.this.f.setTitle(charSequence);
        }

        @Override // b.b.d.d.b
        public Menu c() {
            return this.e;
        }

        @Override // b.b.d.d.b
        public MenuInflater d() {
            return new b.b.d.d.g(this.d);
        }

        @Override // b.b.d.d.b
        public CharSequence e() {
            return k.this.f.getSubtitle();
        }

        @Override // b.b.d.d.b
        public CharSequence g() {
            return k.this.f.getTitle();
        }

        @Override // b.b.d.d.b
        public void i() {
            if (k.this.j != this) {
                return;
            }
            this.e.s();
            try {
                this.f.a(this, this.e);
            } finally {
                this.e.r();
            }
        }

        @Override // b.b.d.d.b
        public boolean j() {
            return k.this.f.b();
        }

        public boolean k() {
            this.e.s();
            try {
                return this.f.b(this, this.e);
            } finally {
                this.e.r();
            }
        }
    }

    public k(Activity activity, boolean z) {
        new ArrayList();
        this.n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public k(Dialog dialog) {
        new ArrayList();
        this.n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        b(dialog.getWindow().getDecorView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b0 a(View view) {
        if (view instanceof b0) {
            return (b0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    static boolean a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private void b(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(b.b.d.a.f.decor_content_parent);
        this.f732c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.e = a(view.findViewById(b.b.d.a.f.action_bar));
        this.f = (ActionBarContextView) view.findViewById(b.b.d.a.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(b.b.d.a.f.action_bar_container);
        this.d = actionBarContainer;
        b0 b0Var = this.e;
        if (b0Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(k.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f730a = b0Var.m();
        boolean z = (this.e.h() & 4) != 0;
        if (z) {
            this.i = true;
        }
        b.b.d.d.a aVarA = b.b.d.d.a.a(this.f730a);
        j(aVarA.a() || z);
        k(aVarA.f());
        TypedArray typedArrayObtainStyledAttributes = this.f730a.obtainStyledAttributes(null, b.b.d.a.j.ActionBar, b.b.d.a.a.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(b.b.d.a.j.ActionBar_hideOnContentScroll, false)) {
            i(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b.b.d.a.j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            a(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void k(boolean z) {
        this.o = z;
        if (z) {
            this.d.setTabContainer(null);
            this.e.a(this.h);
        } else {
            this.e.a((m0) null);
            this.d.setTabContainer(this.h);
        }
        boolean z2 = m() == 2;
        m0 m0Var = this.h;
        if (m0Var != null) {
            if (z2) {
                m0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f732c;
                if (actionBarOverlayLayout != null) {
                    q.m(actionBarOverlayLayout);
                }
            } else {
                m0Var.setVisibility(8);
            }
        }
        this.e.b(!this.o && z2);
        this.f732c.setHasNonEmbeddedTabs(!this.o && z2);
    }

    private void l(boolean z) {
        if (a(this.r, this.s, this.t)) {
            if (this.u) {
                return;
            }
            this.u = true;
            g(z);
            return;
        }
        if (this.u) {
            this.u = false;
            f(z);
        }
    }

    private void n() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f732c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            l(false);
        }
    }

    private boolean o() {
        return q.k(this.d);
    }

    private void p() {
        if (this.t) {
            return;
        }
        this.t = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f732c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        l(false);
    }

    @Override // android.support.v7.app.a
    public b.b.d.d.b a(b.b.d.d.b.a aVar) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.a();
        }
        this.f732c.setHideOnContentScrollEnabled(false);
        this.f.c();
        d dVar2 = new d(this.f.getContext(), aVar);
        if (!dVar2.k()) {
            return null;
        }
        this.j = dVar2;
        dVar2.i();
        this.f.a(dVar2);
        e(true);
        this.f.sendAccessibilityEvent(32);
        return dVar2;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void a() {
        b.b.d.d.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
            this.v = null;
        }
    }

    public void a(float f) {
        q.a(this.d, f);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void a(int i) {
        this.p = i;
    }

    public void a(int i, int i2) {
        int iH = this.e.h();
        if ((i2 & 4) != 0) {
            this.i = true;
        }
        this.e.c((i & i2) | ((~i2) & iH));
    }

    @Override // android.support.v7.app.a
    public void a(Configuration configuration) {
        k(b.b.d.d.a.a(this.f730a).f());
    }

    @Override // android.support.v7.app.a
    public void a(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void a(boolean z) {
        this.q = z;
    }

    @Override // android.support.v7.app.a
    public boolean a(int i, KeyEvent keyEvent) {
        Menu menuC;
        d dVar = this.j;
        if (dVar == null || (menuC = dVar.c()) == null) {
            return false;
        }
        menuC.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuC.performShortcut(i, keyEvent, 0);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void b() {
        if (this.s) {
            return;
        }
        this.s = true;
        l(true);
    }

    @Override // android.support.v7.app.a
    public void b(boolean z) {
        if (z == this.m) {
            return;
        }
        this.m = z;
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).a(z);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void c() {
        if (this.s) {
            this.s = false;
            l(true);
        }
    }

    @Override // android.support.v7.app.a
    public void c(boolean z) {
        if (this.i) {
            return;
        }
        h(z);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void d() {
    }

    @Override // android.support.v7.app.a
    public void d(boolean z) {
        b.b.d.d.h hVar;
        this.w = z;
        if (z || (hVar = this.v) == null) {
            return;
        }
        hVar.a();
    }

    public void e(boolean z) {
        u uVarA;
        u uVarA2;
        if (z) {
            p();
        } else {
            n();
        }
        if (!o()) {
            if (z) {
                this.e.a(4);
                this.f.setVisibility(0);
                return;
            } else {
                this.e.a(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z) {
            uVarA = this.e.a(4, 100L);
            uVarA2 = this.f.a(0, 200L);
        } else {
            u uVarA3 = this.e.a(0, 200L);
            uVarA = this.f.a(8, 100L);
            uVarA2 = uVarA3;
        }
        b.b.d.d.h hVar = new b.b.d.d.h();
        hVar.a(uVarA, uVarA2);
        hVar.c();
    }

    public void f(boolean z) {
        View view;
        b.b.d.d.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        if (this.p != 0 || (!this.w && !z)) {
            this.y.a(null);
            return;
        }
        this.d.setAlpha(1.0f);
        this.d.setTransitioning(true);
        b.b.d.d.h hVar2 = new b.b.d.d.h();
        float f = -this.d.getHeight();
        if (z) {
            int[] iArr = {0, 0};
            this.d.getLocationInWindow(iArr);
            f -= iArr[1];
        }
        u uVarA = q.a(this.d);
        uVarA.b(f);
        uVarA.a(this.A);
        hVar2.a(uVarA);
        if (this.q && (view = this.g) != null) {
            u uVarA2 = q.a(view);
            uVarA2.b(f);
            hVar2.a(uVarA2);
        }
        hVar2.a(B);
        hVar2.a(250L);
        hVar2.a(this.y);
        this.v = hVar2;
        hVar2.c();
    }

    @Override // android.support.v7.app.a
    public boolean f() {
        b0 b0Var = this.e;
        if (b0Var == null || !b0Var.j()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // android.support.v7.app.a
    public int g() {
        return this.e.h();
    }

    public void g(boolean z) {
        View view;
        View view2;
        b.b.d.d.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        this.d.setVisibility(0);
        if (this.p == 0 && (this.w || z)) {
            this.d.setTranslationY(0.0f);
            float f = -this.d.getHeight();
            if (z) {
                int[] iArr = {0, 0};
                this.d.getLocationInWindow(iArr);
                f -= iArr[1];
            }
            this.d.setTranslationY(f);
            b.b.d.d.h hVar2 = new b.b.d.d.h();
            u uVarA = q.a(this.d);
            uVarA.b(0.0f);
            uVarA.a(this.A);
            hVar2.a(uVarA);
            if (this.q && (view2 = this.g) != null) {
                view2.setTranslationY(f);
                u uVarA2 = q.a(this.g);
                uVarA2.b(0.0f);
                hVar2.a(uVarA2);
            }
            hVar2.a(C);
            hVar2.a(250L);
            hVar2.a(this.z);
            this.v = hVar2;
            hVar2.c();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.q && (view = this.g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f732c;
        if (actionBarOverlayLayout != null) {
            q.m(actionBarOverlayLayout);
        }
    }

    @Override // android.support.v7.app.a
    public Context h() {
        if (this.f731b == null) {
            TypedValue typedValue = new TypedValue();
            this.f730a.getTheme().resolveAttribute(b.b.d.a.a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f731b = new ContextThemeWrapper(this.f730a, i);
            } else {
                this.f731b = this.f730a;
            }
        }
        return this.f731b;
    }

    public void h(boolean z) {
        a(z ? 4 : 0, 4);
    }

    public void i(boolean z) {
        if (z && !this.f732c.i()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.x = z;
        this.f732c.setHideOnContentScrollEnabled(z);
    }

    public void j(boolean z) {
        this.e.a(z);
    }

    void l() {
        b.b.d.d.b.a aVar = this.l;
        if (aVar != null) {
            aVar.a(this.k);
            this.k = null;
            this.l = null;
        }
    }

    public int m() {
        return this.e.n();
    }
}
