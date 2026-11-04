package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class u0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f926c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private c n;
    private int o;
    private int p;
    private Drawable q;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.support.v7.view.menu.a f927b;

        a() {
            this.f927b = new android.support.v7.view.menu.a(u0.this.f924a.getContext(), 0, R.id.home, 0, 0, u0.this.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u0 u0Var = u0.this;
            Window.Callback callback = u0Var.l;
            if (callback == null || !u0Var.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f927b);
        }
    }

    class b extends b.b.c.g.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f929a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f930b;

        b(int i) {
            this.f930b = i;
        }

        @Override // b.b.c.g.v
        public void a(View view) {
            if (this.f929a) {
                return;
            }
            u0.this.f924a.setVisibility(this.f930b);
        }

        @Override // b.b.c.g.w, b.b.c.g.v
        public void b(View view) {
            u0.this.f924a.setVisibility(0);
        }

        @Override // b.b.c.g.w, b.b.c.g.v
        public void c(View view) {
            this.f929a = true;
        }
    }

    public u0(Toolbar toolbar, boolean z) {
        this(toolbar, z, b.b.d.a.h.abc_action_bar_up_description, b.b.d.a.e.abc_ic_ab_back_material);
    }

    public u0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.f924a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        t0 t0VarA = t0.a(toolbar.getContext(), null, b.b.d.a.j.ActionBar, b.b.d.a.a.actionBarStyle, 0);
        this.q = t0VarA.b(b.b.d.a.j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence charSequenceE = t0VarA.e(b.b.d.a.j.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceE)) {
                c(charSequenceE);
            }
            CharSequence charSequenceE2 = t0VarA.e(b.b.d.a.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceE2)) {
                b(charSequenceE2);
            }
            Drawable drawableB = t0VarA.b(b.b.d.a.j.ActionBar_logo);
            if (drawableB != null) {
                a(drawableB);
            }
            Drawable drawableB2 = t0VarA.b(b.b.d.a.j.ActionBar_icon);
            if (drawableB2 != null) {
                setIcon(drawableB2);
            }
            if (this.g == null && (drawable = this.q) != null) {
                b(drawable);
            }
            c(t0VarA.d(b.b.d.a.j.ActionBar_displayOptions, 0));
            int iG = t0VarA.g(b.b.d.a.j.ActionBar_customNavigationLayout, 0);
            if (iG != 0) {
                a(LayoutInflater.from(this.f924a.getContext()).inflate(iG, (ViewGroup) this.f924a, false));
                c(this.f925b | 16);
            }
            int iF = t0VarA.f(b.b.d.a.j.ActionBar_height, 0);
            if (iF > 0) {
                ViewGroup.LayoutParams layoutParams = this.f924a.getLayoutParams();
                layoutParams.height = iF;
                this.f924a.setLayoutParams(layoutParams);
            }
            int iB = t0VarA.b(b.b.d.a.j.ActionBar_contentInsetStart, -1);
            int iB2 = t0VarA.b(b.b.d.a.j.ActionBar_contentInsetEnd, -1);
            if (iB >= 0 || iB2 >= 0) {
                this.f924a.a(Math.max(iB, 0), Math.max(iB2, 0));
            }
            int iG2 = t0VarA.g(b.b.d.a.j.ActionBar_titleTextStyle, 0);
            if (iG2 != 0) {
                Toolbar toolbar2 = this.f924a;
                toolbar2.b(toolbar2.getContext(), iG2);
            }
            int iG3 = t0VarA.g(b.b.d.a.j.ActionBar_subtitleTextStyle, 0);
            if (iG3 != 0) {
                Toolbar toolbar3 = this.f924a;
                toolbar3.a(toolbar3.getContext(), iG3);
            }
            int iG4 = t0VarA.g(b.b.d.a.j.ActionBar_popupTheme, 0);
            if (iG4 != 0) {
                this.f924a.setPopupTheme(iG4);
            }
        } else {
            this.f925b = o();
        }
        t0VarA.a();
        d(i);
        this.k = this.f924a.getNavigationContentDescription();
        this.f924a.setNavigationOnClickListener(new a());
    }

    private void d(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.f925b & 8) != 0) {
            this.f924a.setTitle(charSequence);
        }
    }

    private int o() {
        if (this.f924a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.f924a.getNavigationIcon();
        return 15;
    }

    private void p() {
        if ((this.f925b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.f924a.setNavigationContentDescription(this.p);
            } else {
                this.f924a.setNavigationContentDescription(this.k);
            }
        }
    }

    private void q() {
        if ((this.f925b & 4) == 0) {
            this.f924a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f924a;
        Drawable drawable = this.g;
        if (drawable == null) {
            drawable = this.q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void r() {
        Drawable drawable;
        int i = this.f925b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.f924a.setLogo(drawable);
    }

    @Override // android.support.v7.widget.b0
    public b.b.c.g.u a(int i, long j) {
        b.b.c.g.u uVarA = b.b.c.g.q.a(this.f924a);
        uVarA.a(i == 0 ? 1.0f : 0.0f);
        uVarA.a(j);
        uVarA.a(new b(i));
        return uVarA;
    }

    @Override // android.support.v7.widget.b0
    public void a(int i) {
        this.f924a.setVisibility(i);
    }

    public void a(Drawable drawable) {
        this.f = drawable;
        r();
    }

    @Override // android.support.v7.widget.b0
    public void a(m0 m0Var) {
        View view = this.f926c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f924a;
            if (parent == toolbar) {
                toolbar.removeView(this.f926c);
            }
        }
        this.f926c = m0Var;
        if (m0Var == null || this.o != 2) {
            return;
        }
        this.f924a.addView(m0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f926c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f689a = 8388691;
        m0Var.setAllowCollapse(true);
    }

    @Override // android.support.v7.widget.b0
    public void a(Menu menu, android.support.v7.view.menu.o.a aVar) {
        if (this.n == null) {
            c cVar = new c(this.f924a.getContext());
            this.n = cVar;
            cVar.a(b.b.d.a.f.action_menu_presenter);
        }
        this.n.a(aVar);
        this.f924a.a((android.support.v7.view.menu.h) menu, this.n);
    }

    public void a(View view) {
        View view2 = this.d;
        if (view2 != null && (this.f925b & 16) != 0) {
            this.f924a.removeView(view2);
        }
        this.d = view;
        if (view == null || (this.f925b & 16) == 0) {
            return;
        }
        this.f924a.addView(view);
    }

    public void a(CharSequence charSequence) {
        this.k = charSequence;
        p();
    }

    @Override // android.support.v7.widget.b0
    public void a(boolean z) {
    }

    @Override // android.support.v7.widget.b0
    public boolean a() {
        return this.f924a.k();
    }

    @Override // android.support.v7.widget.b0
    public void b(int i) {
        a(i != 0 ? b.b.d.b.a.a.c(m(), i) : null);
    }

    public void b(Drawable drawable) {
        this.g = drawable;
        q();
    }

    public void b(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f925b & 8) != 0) {
            this.f924a.setSubtitle(charSequence);
        }
    }

    @Override // android.support.v7.widget.b0
    public void b(boolean z) {
        this.f924a.setCollapsible(z);
    }

    @Override // android.support.v7.widget.b0
    public boolean b() {
        return this.f924a.h();
    }

    @Override // android.support.v7.widget.b0
    public void c() {
        this.m = true;
    }

    @Override // android.support.v7.widget.b0
    public void c(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f925b ^ i;
        this.f925b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    p();
                }
                q();
            }
            if ((i2 & 3) != 0) {
                r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f924a.setTitle(this.i);
                    toolbar = this.f924a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f924a.setTitle((CharSequence) null);
                    toolbar = this.f924a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            int i3 = i & 16;
            Toolbar toolbar2 = this.f924a;
            if (i3 != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public void c(CharSequence charSequence) {
        this.h = true;
        d(charSequence);
    }

    @Override // android.support.v7.widget.b0
    public void collapseActionView() {
        this.f924a.c();
    }

    public void d(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (TextUtils.isEmpty(this.f924a.getNavigationContentDescription())) {
            e(this.p);
        }
    }

    @Override // android.support.v7.widget.b0
    public boolean d() {
        return this.f924a.i();
    }

    public void e(int i) {
        a(i == 0 ? null : m().getString(i));
    }

    @Override // android.support.v7.widget.b0
    public boolean e() {
        return this.f924a.b();
    }

    @Override // android.support.v7.widget.b0
    public boolean f() {
        return this.f924a.g();
    }

    @Override // android.support.v7.widget.b0
    public void g() {
        this.f924a.d();
    }

    @Override // android.support.v7.widget.b0
    public CharSequence getTitle() {
        return this.f924a.getTitle();
    }

    @Override // android.support.v7.widget.b0
    public int h() {
        return this.f925b;
    }

    @Override // android.support.v7.widget.b0
    public void i() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.b0
    public boolean j() {
        return this.f924a.f();
    }

    @Override // android.support.v7.widget.b0
    public ViewGroup k() {
        return this.f924a;
    }

    @Override // android.support.v7.widget.b0
    public void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.b0
    public Context m() {
        return this.f924a.getContext();
    }

    @Override // android.support.v7.widget.b0
    public int n() {
        return this.o;
    }

    @Override // android.support.v7.widget.b0
    public void setIcon(int i) {
        setIcon(i != 0 ? b.b.d.b.a.a.c(m(), i) : null);
    }

    @Override // android.support.v7.widget.b0
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        r();
    }

    @Override // android.support.v7.widget.b0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // android.support.v7.widget.b0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        d(charSequence);
    }
}
