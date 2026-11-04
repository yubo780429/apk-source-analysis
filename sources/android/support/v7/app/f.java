package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.t;
import android.support.v7.view.menu.p;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.a0;
import android.support.v7.widget.e0;
import android.support.v7.widget.t0;
import android.support.v7.widget.y0;
import android.support.v7.widget.z0;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import b.b.c.g.o;
import b.b.c.g.q;
import b.b.c.g.u;
import b.b.c.g.v;
import b.b.c.g.w;
import b.b.c.g.y;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
class f extends android.support.v7.app.e implements android.support.v7.view.menu.h.a, LayoutInflater.Factory2 {
    private static final boolean T;
    private static final int[] U;
    private static boolean V;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    private boolean E;
    private m[] F;
    private m G;
    private boolean H;
    boolean I;
    private boolean K;
    private k L;
    boolean M;
    int N;
    private boolean P;
    private Rect Q;
    private Rect R;
    private AppCompatViewInflater S;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f693c;
    final Window d;
    final Window.Callback e;
    final Window.Callback f;
    final android.support.v7.app.d g;
    android.support.v7.app.a h;
    MenuInflater i;
    private CharSequence j;
    private a0 k;
    private h l;
    private n m;
    b.b.d.d.b n;
    ActionBarContextView o;
    PopupWindow p;
    Runnable q;
    private boolean t;
    private ViewGroup u;
    private TextView v;
    private View w;
    private boolean x;
    private boolean y;
    boolean z;
    u r = null;
    private boolean s = true;
    private int J = -100;
    private final Runnable O = new b();

    static class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f694a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f694a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!a(th)) {
                this.f694a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f694a.uncaughtException(thread, notFoundException);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            if ((fVar.N & 1) != 0) {
                fVar.e(0);
            }
            f fVar2 = f.this;
            if ((fVar2.N & 4096) != 0) {
                fVar2.e(108);
            }
            f fVar3 = f.this;
            fVar3.M = false;
            fVar3.N = 0;
        }
    }

    class c implements o {
        c() {
        }

        @Override // b.b.c.g.o
        public y a(View view, y yVar) {
            int iD = yVar.d();
            int i = f.this.i(iD);
            if (iD != i) {
                yVar = yVar.a(yVar.b(), i, yVar.c(), yVar.a());
            }
            return q.a(view, yVar);
        }
    }

    class d implements e0.a {
        d() {
        }

        @Override // android.support.v7.widget.e0.a
        public void a(Rect rect) {
            rect.top = f.this.i(rect.top);
        }
    }

    class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // android.support.v7.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // android.support.v7.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            f.this.k();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.f$f, reason: collision with other inner class name */
    class RunnableC0031f implements Runnable {

        /* JADX INFO: renamed from: android.support.v7.app.f$f$a */
        class a extends w {
            a() {
            }

            @Override // b.b.c.g.v
            public void a(View view) {
                f.this.o.setAlpha(1.0f);
                f.this.r.a((v) null);
                f.this.r = null;
            }

            @Override // b.b.c.g.w, b.b.c.g.v
            public void b(View view) {
                f.this.o.setVisibility(0);
            }
        }

        RunnableC0031f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.p.showAtLocation(fVar.o, 55, 0, 0);
            f.this.l();
            if (!f.this.s()) {
                f.this.o.setAlpha(1.0f);
                f.this.o.setVisibility(0);
                return;
            }
            f.this.o.setAlpha(0.0f);
            f fVar2 = f.this;
            u uVarA = q.a(fVar2.o);
            uVarA.a(1.0f);
            fVar2.r = uVarA;
            f.this.r.a(new a());
        }
    }

    class g extends w {
        g() {
        }

        @Override // b.b.c.g.v
        public void a(View view) {
            f.this.o.setAlpha(1.0f);
            f.this.r.a((v) null);
            f.this.r = null;
        }

        @Override // b.b.c.g.w, b.b.c.g.v
        public void b(View view) {
            f.this.o.setVisibility(0);
            f.this.o.sendAccessibilityEvent(32);
            if (f.this.o.getParent() instanceof View) {
                q.m((View) f.this.o.getParent());
            }
        }
    }

    private final class h implements android.support.v7.view.menu.o.a {
        h() {
        }

        @Override // android.support.v7.view.menu.o.a
        public void a(android.support.v7.view.menu.h hVar, boolean z) {
            f.this.b(hVar);
        }

        @Override // android.support.v7.view.menu.o.a
        public boolean a(android.support.v7.view.menu.h hVar) {
            Window.Callback callbackO = f.this.o();
            if (callbackO == null) {
                return true;
            }
            callbackO.onMenuOpened(108, hVar);
            return true;
        }
    }

    class i implements b.b.d.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b.b.d.d.b.a f703a;

        class a extends w {
            a() {
            }

            @Override // b.b.c.g.v
            public void a(View view) {
                f.this.o.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.p;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.o.getParent() instanceof View) {
                    q.m((View) f.this.o.getParent());
                }
                f.this.o.removeAllViews();
                f.this.r.a((v) null);
                f.this.r = null;
            }
        }

        public i(b.b.d.d.b.a aVar) {
            this.f703a = aVar;
        }

        @Override // b.b.d.d.b.a
        public void a(b.b.d.d.b bVar) {
            this.f703a.a(bVar);
            f fVar = f.this;
            if (fVar.p != null) {
                fVar.d.getDecorView().removeCallbacks(f.this.q);
            }
            f fVar2 = f.this;
            if (fVar2.o != null) {
                fVar2.l();
                f fVar3 = f.this;
                u uVarA = q.a(fVar3.o);
                uVarA.a(0.0f);
                fVar3.r = uVarA;
                f.this.r.a(new a());
            }
            f fVar4 = f.this;
            android.support.v7.app.d dVar = fVar4.g;
            if (dVar != null) {
                dVar.b(fVar4.n);
            }
            f.this.n = null;
        }

        @Override // b.b.d.d.b.a
        public boolean a(b.b.d.d.b bVar, Menu menu) {
            return this.f703a.a(bVar, menu);
        }

        @Override // b.b.d.d.b.a
        public boolean a(b.b.d.d.b bVar, MenuItem menuItem) {
            return this.f703a.a(bVar, menuItem);
        }

        @Override // b.b.d.d.b.a
        public boolean b(b.b.d.d.b bVar, Menu menu) {
            return this.f703a.b(bVar, menu);
        }
    }

    class j extends b.b.d.d.i {
        j(Window.Callback callback) {
            super(callback);
        }

        final ActionMode a(ActionMode.Callback callback) {
            b.b.d.d.f.a aVar = new b.b.d.d.f.a(f.this.f693c, callback);
            b.b.d.d.b bVarA = f.this.a(aVar);
            if (bVarA != null) {
                return aVar.b(bVarA);
            }
            return null;
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.b(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof android.support.v7.view.menu.h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            f.this.g(i);
            return true;
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            f.this.h(i);
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            android.support.v7.view.menu.h hVar = menu instanceof android.support.v7.view.menu.h ? (android.support.v7.view.menu.h) menu : null;
            if (i == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.c(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (hVar != null) {
                hVar.c(false);
            }
            return zOnPreparePanel;
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            android.support.v7.view.menu.h hVar;
            m mVarA = f.this.a(0, true);
            if (mVarA == null || (hVar = mVarA.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, hVar, i);
            }
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return f.this.p() ? a(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (f.this.p() && i == 0) ? a(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.support.v7.app.j f707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private BroadcastReceiver f709c;
        private IntentFilter d;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                k.this.b();
            }
        }

        k(android.support.v7.app.j jVar) {
            this.f707a = jVar;
            this.f708b = jVar.a();
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f709c;
            if (broadcastReceiver != null) {
                f.this.f693c.unregisterReceiver(broadcastReceiver);
                this.f709c = null;
            }
        }

        void b() {
            boolean zA = this.f707a.a();
            if (zA != this.f708b) {
                this.f708b = zA;
                f.this.a();
            }
        }

        int c() {
            boolean zA = this.f707a.a();
            this.f708b = zA;
            return zA ? 2 : 1;
        }

        void d() {
            a();
            if (this.f709c == null) {
                this.f709c = new a();
            }
            if (this.d == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.d = intentFilter;
                intentFilter.addAction("android.intent.action.TIME_SET");
                this.d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.d.addAction("android.intent.action.TIME_TICK");
            }
            f.this.f693c.registerReceiver(this.f709c, this.d);
        }
    }

    private class l extends ContentFrameLayout {
        public l(Context context) {
            super(context);
        }

        private boolean a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.d(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(b.b.d.b.a.a.c(getContext(), i));
        }
    }

    protected static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f713c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        android.support.v7.view.menu.h j;
        android.support.v7.view.menu.f k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        m(int i) {
            this.f711a = i;
        }

        p a(android.support.v7.view.menu.o.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                android.support.v7.view.menu.f fVar = new android.support.v7.view.menu.f(this.l, b.b.d.a.g.abc_list_menu_item_layout);
                this.k = fVar;
                fVar.a(aVar);
                this.j.a(this.k);
            }
            return this.k.a(this.g);
        }

        void a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(b.b.d.a.a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                themeNewTheme.applyStyle(i, true);
            }
            themeNewTheme.resolveAttribute(b.b.d.a.a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = b.b.d.a.i.Theme_AppCompat_CompactMenu;
            }
            themeNewTheme.applyStyle(i2, true);
            b.b.d.d.d dVar = new b.b.d.d.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(b.b.d.a.j.AppCompatTheme);
            this.f712b = typedArrayObtainStyledAttributes.getResourceId(b.b.d.a.j.AppCompatTheme_panelBackground, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(b.b.d.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(android.support.v7.view.menu.h hVar) {
            android.support.v7.view.menu.f fVar;
            android.support.v7.view.menu.h hVar2 = this.j;
            if (hVar == hVar2) {
                return;
            }
            if (hVar2 != null) {
                hVar2.b(this.k);
            }
            this.j = hVar;
            if (hVar == null || (fVar = this.k) == null) {
                return;
            }
            hVar.a(fVar);
        }

        public boolean a() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.a().getCount() > 0;
        }
    }

    private final class n implements android.support.v7.view.menu.o.a {
        n() {
        }

        @Override // android.support.v7.view.menu.o.a
        public void a(android.support.v7.view.menu.h hVar, boolean z) {
            android.support.v7.view.menu.h hVarM = hVar.m();
            boolean z2 = hVarM != hVar;
            f fVar = f.this;
            if (z2) {
                hVar = hVarM;
            }
            m mVarA = fVar.a((Menu) hVar);
            if (mVarA != null) {
                if (!z2) {
                    f.this.a(mVarA, z);
                } else {
                    f.this.a(mVarA.f711a, mVarA, hVarM);
                    f.this.a(mVarA, true);
                }
            }
        }

        @Override // android.support.v7.view.menu.o.a
        public boolean a(android.support.v7.view.menu.h hVar) {
            Window.Callback callbackO;
            if (hVar != null) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.z || (callbackO = fVar.o()) == null || f.this.I) {
                return true;
            }
            callbackO.onMenuOpened(108, hVar);
            return true;
        }
    }

    static {
        boolean z = Build.VERSION.SDK_INT < 21;
        T = z;
        U = new int[]{R.attr.windowBackground};
        if (!z || V) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        V = true;
    }

    f(Context context, Window window, android.support.v7.app.d dVar) {
        this.f693c = context;
        this.d = window;
        this.g = dVar;
        Window.Callback callback = window.getCallback();
        this.e = callback;
        if (callback instanceof j) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        j jVar = new j(callback);
        this.f = jVar;
        this.d.setCallback(jVar);
        t0 t0VarA = t0.a(context, (AttributeSet) null, U);
        Drawable drawableC = t0VarA.c(0);
        if (drawableC != null) {
            this.d.setBackgroundDrawable(drawableC);
        }
        t0VarA.a();
    }

    private void A() {
        if (this.t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void a(m mVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (mVar.o || this.I) {
            return;
        }
        if (mVar.f711a == 0) {
            if ((this.f693c.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackO = o();
        if (callbackO != null && !callbackO.onMenuOpened(mVar.f711a, mVar.j)) {
            a(mVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f693c.getSystemService("window");
        if (windowManager != null && b(mVar, keyEvent)) {
            if (mVar.g != null && !mVar.q) {
                View view = mVar.i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                mVar.n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, mVar.d, mVar.e, 1002, 8519680, -3);
                layoutParams2.gravity = mVar.f713c;
                layoutParams2.windowAnimations = mVar.f;
                windowManager.addView(mVar.g, layoutParams2);
                mVar.o = true;
            }
            ViewGroup viewGroup = mVar.g;
            if (viewGroup == null) {
                if (!b(mVar) || mVar.g == null) {
                    return;
                }
            } else if (mVar.q && viewGroup.getChildCount() > 0) {
                mVar.g.removeAllViews();
            }
            if (!a(mVar) || !mVar.a()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = mVar.h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            mVar.g.setBackgroundResource(mVar.f712b);
            ViewParent parent = mVar.h.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(mVar.h);
            }
            mVar.g.addView(mVar.h, layoutParams3);
            if (!mVar.h.hasFocus()) {
                mVar.h.requestFocus();
            }
            i2 = -2;
            mVar.n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i2, -2, mVar.d, mVar.e, 1002, 8519680, -3);
            layoutParams4.gravity = mVar.f713c;
            layoutParams4.windowAnimations = mVar.f;
            windowManager.addView(mVar.g, layoutParams4);
            mVar.o = true;
        }
    }

    private void a(android.support.v7.view.menu.h hVar, boolean z) {
        a0 a0Var = this.k;
        if (a0Var == null || !a0Var.e() || (ViewConfiguration.get(this.f693c).hasPermanentMenuKey() && !this.k.b())) {
            m mVarA = a(0, true);
            mVarA.q = true;
            a(mVarA, false);
            a(mVarA, (KeyEvent) null);
            return;
        }
        Window.Callback callbackO = o();
        if (this.k.d() && z) {
            this.k.f();
            if (this.I) {
                return;
            }
            callbackO.onPanelClosed(108, a(0, true).j);
            return;
        }
        if (callbackO == null || this.I) {
            return;
        }
        if (this.M && (this.N & 1) != 0) {
            this.d.getDecorView().removeCallbacks(this.O);
            this.O.run();
        }
        m mVarA2 = a(0, true);
        android.support.v7.view.menu.h hVar2 = mVarA2.j;
        if (hVar2 == null || mVarA2.r || !callbackO.onPreparePanel(0, mVarA2.i, hVar2)) {
            return;
        }
        callbackO.onMenuOpened(108, mVarA2.j);
        this.k.a();
    }

    private boolean a(m mVar) {
        View view = mVar.i;
        if (view != null) {
            mVar.h = view;
            return true;
        }
        if (mVar.j == null) {
            return false;
        }
        if (this.m == null) {
            this.m = new n();
        }
        View view2 = (View) mVar.a(this.m);
        mVar.h = view2;
        return view2 != null;
    }

    private boolean a(m mVar, int i2, KeyEvent keyEvent, int i3) {
        android.support.v7.view.menu.h hVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((mVar.m || b(mVar, keyEvent)) && (hVar = mVar.j) != null) {
            zPerformShortcut = hVar.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.k == null) {
            a(mVar, true);
        }
        return zPerformShortcut;
    }

    private boolean a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.d.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || q.j((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean b(m mVar) {
        mVar.a(m());
        mVar.g = new l(mVar.l);
        mVar.f713c = 81;
        return true;
    }

    private boolean b(m mVar, KeyEvent keyEvent) {
        a0 a0Var;
        a0 a0Var2;
        a0 a0Var3;
        if (this.I) {
            return false;
        }
        if (mVar.m) {
            return true;
        }
        m mVar2 = this.G;
        if (mVar2 != null && mVar2 != mVar) {
            a(mVar2, false);
        }
        Window.Callback callbackO = o();
        if (callbackO != null) {
            mVar.i = callbackO.onCreatePanelView(mVar.f711a);
        }
        int i2 = mVar.f711a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (a0Var3 = this.k) != null) {
            a0Var3.c();
        }
        if (mVar.i == null) {
            if (z) {
                r();
            }
            if (mVar.j == null || mVar.r) {
                if (mVar.j == null && (!c(mVar) || mVar.j == null)) {
                    return false;
                }
                if (z && this.k != null) {
                    if (this.l == null) {
                        this.l = new h();
                    }
                    this.k.a(mVar.j, this.l);
                }
                mVar.j.s();
                if (!callbackO.onCreatePanelMenu(mVar.f711a, mVar.j)) {
                    mVar.a((android.support.v7.view.menu.h) null);
                    if (z && (a0Var = this.k) != null) {
                        a0Var.a(null, this.l);
                    }
                    return false;
                }
                mVar.r = false;
            }
            mVar.j.s();
            Bundle bundle = mVar.s;
            if (bundle != null) {
                mVar.j.a(bundle);
                mVar.s = null;
            }
            if (!callbackO.onPreparePanel(0, mVar.i, mVar.j)) {
                if (z && (a0Var2 = this.k) != null) {
                    a0Var2.a(null, this.l);
                }
                mVar.j.r();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            mVar.p = z2;
            mVar.j.setQwertyMode(z2);
            mVar.j.r();
        }
        mVar.m = true;
        mVar.n = false;
        this.G = mVar;
        return true;
    }

    private boolean c(m mVar) {
        Context context = this.f693c;
        int i2 = mVar.f711a;
        if ((i2 == 0 || i2 == 108) && this.k != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(b.b.d.a.a.actionBarTheme, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(b.b.d.a.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(b.b.d.a.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                b.b.d.d.d dVar = new b.b.d.d.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        android.support.v7.view.menu.h hVar = new android.support.v7.view.menu.h(context);
        hVar.a(this);
        mVar.a(hVar);
        return true;
    }

    private boolean d(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        m mVarA = a(i2, true);
        if (mVarA.o) {
            return false;
        }
        return b(mVarA, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean e(int i2, KeyEvent keyEvent) {
        boolean zB;
        a0 a0Var;
        if (this.n != null) {
            return false;
        }
        boolean zF = true;
        m mVarA = a(i2, true);
        if (i2 != 0 || (a0Var = this.k) == null || !a0Var.e() || ViewConfiguration.get(this.f693c).hasPermanentMenuKey()) {
            if (mVarA.o || mVarA.n) {
                boolean z = mVarA.o;
                a(mVarA, true);
                zF = z;
            } else if (mVarA.m) {
                if (mVarA.r) {
                    mVarA.m = false;
                    zB = b(mVarA, keyEvent);
                } else {
                    zB = true;
                }
                if (zB) {
                    a(mVarA, keyEvent);
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
        } else if (this.k.d()) {
            zF = this.k.f();
        } else if (this.I || !b(mVarA, keyEvent)) {
            zF = false;
        } else {
            zF = this.k.a();
        }
        if (zF) {
            AudioManager audioManager = (AudioManager) this.f693c.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return zF;
    }

    private void j(int i2) {
        this.N = (1 << i2) | this.N;
        if (this.M) {
            return;
        }
        q.a(this.d.getDecorView(), this.O);
        this.M = true;
    }

    private int k(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean l(int i2) {
        Resources resources = this.f693c.getResources();
        Configuration configuration = resources.getConfiguration();
        int i3 = configuration.uiMode & 48;
        int i4 = i2 == 2 ? 32 : 16;
        if (i3 == i4) {
            return false;
        }
        if (z()) {
            ((Activity) this.f693c).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
        resources.updateConfiguration(configuration2, displayMetrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        android.support.v7.app.h.a(resources);
        return true;
    }

    private void t() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.u.findViewById(R.id.content);
        View decorView = this.d.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f693c.obtainStyledAttributes(b.b.d.a.j.AppCompatTheme);
        typedArrayObtainStyledAttributes.getValue(b.b.d.a.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(b.b.d.a.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes.getValue(b.b.d.a.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes.getValue(b.b.d.a.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes.getValue(b.b.d.a.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes.getValue(b.b.d.a.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.Window] */
    private ViewGroup u() {
        ?? r0;
        ?? r1;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        TypedArray typedArrayObtainStyledAttributes = this.f693c.obtainStyledAttributes(b.b.d.a.j.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(b.b.d.a.j.AppCompatTheme_windowNoTitle, false)) {
            b(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(b.b.d.a.j.AppCompatTheme_windowActionBar, false)) {
            b(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(b.b.d.a.j.AppCompatTheme_windowActionBarOverlay, false)) {
            b(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(b.b.d.a.j.AppCompatTheme_windowActionModeOverlay, false)) {
            b(10);
        }
        this.C = typedArrayObtainStyledAttributes.getBoolean(b.b.d.a.j.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        this.d.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f693c);
        if (this.D) {
            r0 = (ViewGroup) layoutInflaterFrom.inflate(this.B ? b.b.d.a.g.abc_screen_simple_overlay_action_mode : b.b.d.a.g.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                q.a((View) r0, new c());
            } else {
                ((e0) r0).setOnFitSystemWindowsListener(new d());
            }
        } else if (this.C) {
            viewGroup2 = (ViewGroup) layoutInflaterFrom.inflate(b.b.d.a.g.abc_dialog_title_material, (ViewGroup) null);
            this.A = false;
            this.z = false;
        } else if (this.z) {
            TypedValue typedValue = new TypedValue();
            this.f693c.getTheme().resolveAttribute(b.b.d.a.a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new b.b.d.d.d(this.f693c, typedValue.resourceId) : this.f693c).inflate(b.b.d.a.g.abc_screen_toolbar, (ViewGroup) null);
            a0 a0Var = (a0) viewGroup.findViewById(b.b.d.a.f.decor_content_parent);
            this.k = a0Var;
            a0Var.setWindowCallback(o());
            if (this.A) {
                this.k.a(109);
            }
            if (this.x) {
                this.k.a(2);
            }
            r1 = viewGroup;
            if (this.y) {
                this.k.a(5);
            }
        } else {
            r1 = 0;
        }
        if (r1 == 0) {
            r1 = r0;
            r1 = r0;
            r1 = viewGroup;
            r1 = viewGroup2;
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.z + ", windowActionBarOverlay: " + this.A + ", android:windowIsFloating: " + this.C + ", windowActionModeOverlay: " + this.B + ", windowNoTitle: " + this.D + " }");
        }
        r1 = r0;
        r1 = r0;
        r1 = viewGroup;
        if (this.k == null) {
            r1 = viewGroup2;
            this.v = (TextView) r1.findViewById(b.b.d.a.f.title);
        }
        r1 = viewGroup2;
        z0.b(r1);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) r1.findViewById(b.b.d.a.f.action_bar_activity_content);
        ViewGroup viewGroup3 = (ViewGroup) this.d.findViewById(R.id.content);
        if (viewGroup3 != null) {
            while (viewGroup3.getChildCount() > 0) {
                View childAt = viewGroup3.getChildAt(0);
                viewGroup3.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup3.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup3 instanceof FrameLayout) {
                ((FrameLayout) viewGroup3).setForeground(null);
            }
        }
        this.d.setContentView(r1);
        contentFrameLayout.setAttachListener(new e());
        return r1;
    }

    private void v() {
        if (this.L == null) {
            this.L = new k(android.support.v7.app.j.a(this.f693c));
        }
    }

    private void w() {
        if (this.t) {
            return;
        }
        this.u = u();
        CharSequence charSequenceN = n();
        if (!TextUtils.isEmpty(charSequenceN)) {
            a0 a0Var = this.k;
            if (a0Var != null) {
                a0Var.setWindowTitle(charSequenceN);
            } else if (r() != null) {
                r().a(charSequenceN);
            } else {
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(charSequenceN);
                }
            }
        }
        t();
        a(this.u);
        this.t = true;
        m mVarA = a(0, false);
        if (this.I) {
            return;
        }
        if (mVarA == null || mVarA.j == null) {
            j(108);
        }
    }

    private int x() {
        int i2 = this.J;
        return i2 != -100 ? i2 : android.support.v7.app.e.j();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    private void y() {
        android.support.v7.app.k kVar;
        android.support.v7.app.a aVar;
        w();
        if (this.z && this.h == null) {
            Window.Callback callback = this.e;
            if (!(callback instanceof Activity)) {
                if (callback instanceof Dialog) {
                    kVar = new android.support.v7.app.k((Dialog) this.e);
                }
                aVar = this.h;
                if (aVar != null) {
                    aVar.c(this.P);
                }
            }
            kVar = new android.support.v7.app.k((Activity) this.e, this.A);
            this.h = kVar;
            aVar = this.h;
            if (aVar != null) {
                aVar.c(this.P);
            }
        }
    }

    private boolean z() {
        if (this.K) {
            Context context = this.f693c;
            if (context instanceof Activity) {
                try {
                    return (context.getPackageManager().getActivityInfo(new ComponentName(this.f693c, this.f693c.getClass()), 0).configChanges & 512) == 0;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    return true;
                }
            }
        }
        return false;
    }

    protected m a(int i2, boolean z) {
        m[] mVarArr = this.F;
        if (mVarArr == null || mVarArr.length <= i2) {
            m[] mVarArr2 = new m[i2 + 1];
            if (mVarArr != null) {
                System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
            }
            this.F = mVarArr2;
            mVarArr = mVarArr2;
        }
        m mVar = mVarArr[i2];
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(i2);
        mVarArr[i2] = mVar2;
        return mVar2;
    }

    m a(Menu menu) {
        m[] mVarArr = this.F;
        int length = mVarArr != null ? mVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            m mVar = mVarArr[i2];
            if (mVar != null && mVar.j == menu) {
                return mVar;
            }
        }
        return null;
    }

    @Override // android.support.v7.app.e
    public <T extends View> T a(int i2) {
        w();
        return (T) this.d.findViewById(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        AppCompatViewInflater appCompatViewInflater;
        boolean zA = false;
        if (this.S == null) {
            String string = this.f693c.obtainStyledAttributes(b.b.d.a.j.AppCompatTheme).getString(b.b.d.a.j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.S = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                    this.S = appCompatViewInflater;
                }
            }
            this.S = appCompatViewInflater;
        }
        if (T) {
            if (!(attributeSet instanceof XmlPullParser)) {
                zA = a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                zA = true;
            }
        }
        return this.S.a(view, str, context, attributeSet, zA, T, true, y0.b());
    }

    public b.b.d.d.b a(b.b.d.d.b.a aVar) {
        android.support.v7.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        b.b.d.d.b bVar = this.n;
        if (bVar != null) {
            bVar.a();
        }
        i iVar = new i(aVar);
        android.support.v7.app.a aVarC = c();
        if (aVarC != null) {
            b.b.d.d.b bVarA = aVarC.a(iVar);
            this.n = bVarA;
            if (bVarA != null && (dVar = this.g) != null) {
                dVar.a(bVarA);
            }
        }
        if (this.n == null) {
            this.n = b(iVar);
        }
        return this.n;
    }

    void a(int i2, m mVar, Menu menu) {
        if (menu == null) {
            if (mVar == null && i2 >= 0) {
                m[] mVarArr = this.F;
                if (i2 < mVarArr.length) {
                    mVar = mVarArr[i2];
                }
            }
            if (mVar != null) {
                menu = mVar.j;
            }
        }
        if ((mVar == null || mVar.o) && !this.I) {
            this.e.onPanelClosed(i2, menu);
        }
    }

    @Override // android.support.v7.app.e
    public void a(Configuration configuration) {
        android.support.v7.app.a aVarC;
        if (this.z && this.t && (aVarC = c()) != null) {
            aVarC.a(configuration);
        }
        android.support.v7.widget.j.a().a(this.f693c);
        a();
    }

    @Override // android.support.v7.app.e
    public void a(Bundle bundle) {
        Window.Callback callback = this.e;
        if (callback instanceof Activity) {
            String strB = null;
            try {
                strB = t.b((Activity) callback);
            } catch (IllegalArgumentException unused) {
            }
            if (strB != null) {
                android.support.v7.app.a aVarR = r();
                if (aVarR == null) {
                    this.P = true;
                } else {
                    aVarR.c(true);
                }
            }
        }
        if (bundle == null || this.J != -100) {
            return;
        }
        this.J = bundle.getInt("appcompat:local_night_mode", -100);
    }

    void a(m mVar, boolean z) {
        ViewGroup viewGroup;
        a0 a0Var;
        if (z && mVar.f711a == 0 && (a0Var = this.k) != null && a0Var.d()) {
            b(mVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f693c.getSystemService("window");
        if (windowManager != null && mVar.o && (viewGroup = mVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                a(mVar.f711a, mVar, null);
            }
        }
        mVar.m = false;
        mVar.n = false;
        mVar.o = false;
        mVar.h = null;
        mVar.q = true;
        if (this.G == mVar) {
            this.G = null;
        }
    }

    @Override // android.support.v7.view.menu.h.a
    public void a(android.support.v7.view.menu.h hVar) {
        a(hVar, true);
    }

    @Override // android.support.v7.app.e
    public void a(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.e.onContentChanged();
    }

    @Override // android.support.v7.app.e
    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ((ViewGroup) this.u.findViewById(R.id.content)).addView(view, layoutParams);
        this.e.onContentChanged();
    }

    void a(ViewGroup viewGroup) {
    }

    @Override // android.support.v7.app.e
    public final void a(CharSequence charSequence) {
        this.j = charSequence;
        a0 a0Var = this.k;
        if (a0Var != null) {
            a0Var.setWindowTitle(charSequence);
            return;
        }
        if (r() != null) {
            r().a(charSequence);
            return;
        }
        TextView textView = this.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.support.v7.app.e
    public boolean a() {
        int iX = x();
        int iF = f(iX);
        boolean zL = iF != -1 ? l(iF) : false;
        if (iX == 0) {
            v();
            this.L.d();
        }
        this.K = true;
        return zL;
    }

    boolean a(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.H = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            d(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // android.support.v7.view.menu.h.a
    public boolean a(android.support.v7.view.menu.h hVar, MenuItem menuItem) {
        m mVarA;
        Window.Callback callbackO = o();
        if (callbackO == null || this.I || (mVarA = a((Menu) hVar.m())) == null) {
            return false;
        }
        return callbackO.onMenuItemSelected(mVarA.f711a, menuItem);
    }

    boolean a(KeyEvent keyEvent) {
        View decorView;
        Window.Callback callback = this.e;
        if (((callback instanceof b.b.c.g.e.a) || (callback instanceof android.support.v7.app.g)) && (decorView = this.d.getDecorView()) != null && b.b.c.g.e.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.e.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? a(keyCode, keyEvent) : c(keyCode, keyEvent);
    }

    @Override // android.support.v7.app.e
    public MenuInflater b() {
        if (this.i == null) {
            y();
            android.support.v7.app.a aVar = this.h;
            this.i = new b.b.d.d.g(aVar != null ? aVar.h() : this.f693c);
        }
        return this.i;
    }

    b.b.d.d.b b(b.b.d.d.b.a aVar) {
        b.b.d.d.b bVarA;
        Context dVar;
        android.support.v7.app.d dVar2;
        l();
        b.b.d.d.b bVar = this.n;
        if (bVar != null) {
            bVar.a();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        android.support.v7.app.d dVar3 = this.g;
        if (dVar3 == null || this.I) {
            bVarA = null;
        } else {
            try {
                bVarA = dVar3.a(aVar);
            } catch (AbstractMethodError unused) {
                bVarA = null;
            }
        }
        if (bVarA != null) {
            this.n = bVarA;
        } else {
            if (this.o == null) {
                if (this.C) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f693c.getTheme();
                    theme.resolveAttribute(b.b.d.a.a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f693c.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new b.b.d.d.d(this.f693c, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f693c;
                    }
                    this.o = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, b.b.d.a.a.actionModePopupWindowStyle);
                    this.p = popupWindow;
                    android.support.v4.widget.j.a(popupWindow, 2);
                    this.p.setContentView(this.o);
                    this.p.setWidth(-1);
                    dVar.getTheme().resolveAttribute(b.b.d.a.a.actionBarSize, typedValue, true);
                    this.o.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.p.setHeight(-2);
                    this.q = new RunnableC0031f();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.u.findViewById(b.b.d.a.f.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m()));
                        this.o = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.o != null) {
                l();
                this.o.c();
                b.b.d.d.e eVar = new b.b.d.d.e(this.o.getContext(), this.o, aVar, this.p == null);
                if (aVar.b(eVar, eVar.c())) {
                    eVar.i();
                    this.o.a(eVar);
                    this.n = eVar;
                    if (s()) {
                        this.o.setAlpha(0.0f);
                        u uVarA = q.a(this.o);
                        uVarA.a(1.0f);
                        this.r = uVarA;
                        uVarA.a(new g());
                    } else {
                        this.o.setAlpha(1.0f);
                        this.o.setVisibility(0);
                        this.o.sendAccessibilityEvent(32);
                        if (this.o.getParent() instanceof View) {
                            q.m((View) this.o.getParent());
                        }
                    }
                    if (this.p != null) {
                        this.d.getDecorView().post(this.q);
                    }
                } else {
                    this.n = null;
                }
            }
        }
        b.b.d.d.b bVar2 = this.n;
        if (bVar2 != null && (dVar2 = this.g) != null) {
            dVar2.a(bVar2);
        }
        return this.n;
    }

    @Override // android.support.v7.app.e
    public void b(Bundle bundle) {
        w();
    }

    void b(android.support.v7.view.menu.h hVar) {
        if (this.E) {
            return;
        }
        this.E = true;
        this.k.g();
        Window.Callback callbackO = o();
        if (callbackO != null && !this.I) {
            callbackO.onPanelClosed(108, hVar);
        }
        this.E = false;
    }

    @Override // android.support.v7.app.e
    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.e.onContentChanged();
    }

    @Override // android.support.v7.app.e
    public boolean b(int i2) {
        int iK = k(i2);
        if (this.D && iK == 108) {
            return false;
        }
        if (this.z && iK == 1) {
            this.z = false;
        }
        if (iK == 1) {
            A();
            this.D = true;
            return true;
        }
        if (iK == 2) {
            A();
            this.x = true;
            return true;
        }
        if (iK == 5) {
            A();
            this.y = true;
            return true;
        }
        if (iK == 10) {
            A();
            this.B = true;
            return true;
        }
        if (iK == 108) {
            A();
            this.z = true;
            return true;
        }
        if (iK != 109) {
            return this.d.requestFeature(iK);
        }
        A();
        this.A = true;
        return true;
    }

    boolean b(int i2, KeyEvent keyEvent) {
        android.support.v7.app.a aVarC = c();
        if (aVarC != null && aVarC.a(i2, keyEvent)) {
            return true;
        }
        m mVar = this.G;
        if (mVar != null && a(mVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            m mVar2 = this.G;
            if (mVar2 != null) {
                mVar2.n = true;
            }
            return true;
        }
        if (this.G == null) {
            m mVarA = a(0, true);
            b(mVarA, keyEvent);
            boolean zA = a(mVarA, keyEvent.getKeyCode(), keyEvent, 1);
            mVarA.m = false;
            if (zA) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.app.e
    public android.support.v7.app.a c() {
        y();
        return this.h;
    }

    @Override // android.support.v7.app.e
    public void c(int i2) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f693c).inflate(i2, viewGroup);
        this.e.onContentChanged();
    }

    @Override // android.support.v7.app.e
    public void c(Bundle bundle) {
        int i2 = this.J;
        if (i2 != -100) {
            bundle.putInt("appcompat:local_night_mode", i2);
        }
    }

    boolean c(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.H;
            this.H = false;
            m mVarA = a(0, false);
            if (mVarA != null && mVarA.o) {
                if (!z) {
                    a(mVarA, true);
                }
                return true;
            }
            if (q()) {
                return true;
            }
        } else if (i2 == 82) {
            e(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // android.support.v7.app.e
    public void d() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f693c);
        if (layoutInflaterFrom.getFactory() == null) {
            b.b.c.g.f.b(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof f) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    void d(int i2) {
        a(a(i2, true), true);
    }

    @Override // android.support.v7.app.e
    public void e() {
        android.support.v7.app.a aVarC = c();
        if (aVarC == null || !aVarC.i()) {
            j(0);
        }
    }

    void e(int i2) {
        m mVarA;
        m mVarA2 = a(i2, true);
        if (mVarA2.j != null) {
            Bundle bundle = new Bundle();
            mVarA2.j.b(bundle);
            if (bundle.size() > 0) {
                mVarA2.s = bundle;
            }
            mVarA2.j.s();
            mVarA2.j.clear();
        }
        mVarA2.r = true;
        mVarA2.q = true;
        if ((i2 != 108 && i2 != 0) || this.k == null || (mVarA = a(0, false)) == null) {
            return;
        }
        mVarA.m = false;
        b(mVarA, (KeyEvent) null);
    }

    int f(int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f693c.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        v();
        return this.L.c();
    }

    @Override // android.support.v7.app.e
    public void f() {
        if (this.M) {
            this.d.getDecorView().removeCallbacks(this.O);
        }
        this.I = true;
        android.support.v7.app.a aVar = this.h;
        if (aVar != null) {
            aVar.j();
        }
        k kVar = this.L;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // android.support.v7.app.e
    public void g() {
        android.support.v7.app.a aVarC = c();
        if (aVarC != null) {
            aVarC.d(true);
        }
    }

    void g(int i2) {
        android.support.v7.app.a aVarC;
        if (i2 != 108 || (aVarC = c()) == null) {
            return;
        }
        aVarC.b(true);
    }

    @Override // android.support.v7.app.e
    public void h() {
        a();
    }

    void h(int i2) {
        if (i2 == 108) {
            android.support.v7.app.a aVarC = c();
            if (aVarC != null) {
                aVarC.b(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            m mVarA = a(i2, true);
            if (mVarA.o) {
                a(mVarA, false);
            }
        }
    }

    int i(int i2) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.o;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            boolean z3 = true;
            if (this.o.isShown()) {
                if (this.Q == null) {
                    this.Q = new Rect();
                    this.R = new Rect();
                }
                Rect rect = this.Q;
                Rect rect2 = this.R;
                rect.set(0, i2, 0, 0);
                z0.a(this.u, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.w;
                    if (view == null) {
                        View view2 = new View(this.f693c);
                        this.w = view2;
                        view2.setBackgroundColor(this.f693c.getResources().getColor(b.b.d.a.c.abc_input_method_navigation_guard));
                        this.u.addView(this.w, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.w.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = this.w != null;
                if (!this.B && z3) {
                    i2 = 0;
                }
                boolean z4 = z3;
                z3 = z2;
                z = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.o.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.w;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        return i2;
    }

    @Override // android.support.v7.app.e
    public void i() {
        android.support.v7.app.a aVarC = c();
        if (aVarC != null) {
            aVarC.d(false);
        }
        k kVar = this.L;
        if (kVar != null) {
            kVar.a();
        }
    }

    void k() {
        android.support.v7.view.menu.h hVar;
        a0 a0Var = this.k;
        if (a0Var != null) {
            a0Var.g();
        }
        if (this.p != null) {
            this.d.getDecorView().removeCallbacks(this.q);
            if (this.p.isShowing()) {
                try {
                    this.p.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.p = null;
        }
        l();
        m mVarA = a(0, false);
        if (mVarA == null || (hVar = mVarA.j) == null) {
            return;
        }
        hVar.close();
    }

    void l() {
        u uVar = this.r;
        if (uVar != null) {
            uVar.a();
        }
    }

    final Context m() {
        android.support.v7.app.a aVarC = c();
        Context contextH = aVarC != null ? aVarC.h() : null;
        return contextH == null ? this.f693c : contextH;
    }

    final CharSequence n() {
        Window.Callback callback = this.e;
        return callback instanceof Activity ? ((Activity) callback).getTitle() : this.j;
    }

    final Window.Callback o() {
        return this.d.getCallback();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public boolean p() {
        return this.s;
    }

    boolean q() {
        b.b.d.d.b bVar = this.n;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        android.support.v7.app.a aVarC = c();
        return aVarC != null && aVarC.f();
    }

    final android.support.v7.app.a r() {
        return this.h;
    }

    final boolean s() {
        ViewGroup viewGroup;
        return this.t && (viewGroup = this.u) != null && q.k(viewGroup);
    }
}
