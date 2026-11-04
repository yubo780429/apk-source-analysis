package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class e implements ComponentCallbacks, View.OnCreateContextMenuListener, android.arch.lifecycle.e, android.arch.lifecycle.q {
    private static final b.b.c.f.k<String, Class<?>> X = new b.b.c.f.k<>();
    static final Object Y = new Object();
    String A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean H;
    ViewGroup I;
    View J;
    View K;
    boolean L;
    d N;
    boolean O;
    boolean P;
    float Q;
    LayoutInflater R;
    boolean S;
    android.arch.lifecycle.f U;
    android.arch.lifecycle.e V;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Bundle f545c;
    SparseArray<Parcelable> d;
    Boolean e;
    String g;
    Bundle h;
    e i;
    int k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    k s;
    i t;
    k u;
    l v;
    android.arch.lifecycle.p w;
    e x;
    int y;
    int z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f544b = 0;
    int f = -1;
    int j = -1;
    boolean G = true;
    boolean M = true;
    android.arch.lifecycle.f T = new android.arch.lifecycle.f(this);
    android.arch.lifecycle.j<android.arch.lifecycle.e> W = new android.arch.lifecycle.j<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.c();
        }
    }

    class b extends g {
        b() {
        }

        @Override // android.support.v4.app.g
        public e a(Context context, String str, Bundle bundle) {
            return e.this.t.a(context, str, bundle);
        }

        @Override // android.support.v4.app.g
        public View a(int i) {
            View view = e.this.J;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        @Override // android.support.v4.app.g
        public boolean a() {
            return e.this.J != null;
        }
    }

    class c implements android.arch.lifecycle.e {
        c() {
        }

        @Override // android.arch.lifecycle.e
        public android.arch.lifecycle.c a() {
            e eVar = e.this;
            if (eVar.U == null) {
                eVar.U = new android.arch.lifecycle.f(eVar.V);
            }
            return e.this.U;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Animator f550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f551c;
        int d;
        int e;
        int f;
        Object g = null;
        Object h;
        Object i;
        Object j;
        Object k;
        Object l;
        Boolean m;
        Boolean n;
        v o;
        v p;
        boolean q;
        f r;
        boolean s;

        d() {
            Object obj = e.Y;
            this.h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.app.e$e, reason: collision with other inner class name */
    public static class C0027e extends RuntimeException {
        public C0027e(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface f {
        void a();

        void b();
    }

    private d Z() {
        if (this.N == null) {
            this.N = new d();
        }
        return this.N;
    }

    public static e a(Context context, String str, Bundle bundle) {
        try {
            Class<?> clsLoadClass = X.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                X.put(str, clsLoadClass);
            }
            e eVar = (e) clsLoadClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(eVar.getClass().getClassLoader());
                eVar.m(bundle);
            }
            return eVar;
        } catch (ClassNotFoundException e) {
            throw new C0027e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0027e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new C0027e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0027e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new C0027e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    static boolean a(Context context, String str) {
        try {
            Class<?> clsLoadClass = X.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                X.put(str, clsLoadClass);
            }
            return e.class.isAssignableFrom(clsLoadClass);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    void A() {
        if (this.t == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        k kVar = new k();
        this.u = kVar;
        kVar.a(this.t, new b(), this);
    }

    boolean B() {
        d dVar = this.N;
        if (dVar == null) {
            return false;
        }
        return dVar.s;
    }

    final boolean C() {
        return this.r > 0;
    }

    boolean D() {
        d dVar = this.N;
        if (dVar == null) {
            return false;
        }
        return dVar.q;
    }

    public final boolean E() {
        k kVar = this.s;
        if (kVar == null) {
            return false;
        }
        return kVar.b();
    }

    void F() {
        k kVar = this.u;
        if (kVar != null) {
            kVar.q();
        }
    }

    public void G() {
        this.H = true;
        android.support.v4.app.f fVarD = d();
        boolean z = fVarD != null && fVarD.isChangingConfigurations();
        android.arch.lifecycle.p pVar = this.w;
        if (pVar == null || z) {
            return;
        }
        pVar.a();
    }

    public void H() {
    }

    public void I() {
        this.H = true;
    }

    public void J() {
        this.H = true;
    }

    public void K() {
        this.H = true;
    }

    public void L() {
        this.H = true;
    }

    public void M() {
        this.H = true;
    }

    public void N() {
        this.H = true;
    }

    j O() {
        return this.u;
    }

    void P() {
        this.T.a(android.arch.lifecycle.c.a.ON_DESTROY);
        k kVar = this.u;
        if (kVar != null) {
            kVar.f();
        }
        this.f544b = 0;
        this.H = false;
        this.S = false;
        G();
        if (this.H) {
            this.u = null;
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void Q() {
        if (this.J != null) {
            this.U.a(android.arch.lifecycle.c.a.ON_DESTROY);
        }
        k kVar = this.u;
        if (kVar != null) {
            kVar.g();
        }
        this.f544b = 1;
        this.H = false;
        I();
        if (this.H) {
            s.a(this).a();
            this.q = false;
        } else {
            throw new w("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void R() {
        this.H = false;
        J();
        this.R = null;
        if (!this.H) {
            throw new w("Fragment " + this + " did not call through to super.onDetach()");
        }
        k kVar = this.u;
        if (kVar != null) {
            if (this.E) {
                kVar.f();
                this.u = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
        }
    }

    void S() {
        onLowMemory();
        k kVar = this.u;
        if (kVar != null) {
            kVar.h();
        }
    }

    void T() {
        if (this.J != null) {
            this.U.a(android.arch.lifecycle.c.a.ON_PAUSE);
        }
        this.T.a(android.arch.lifecycle.c.a.ON_PAUSE);
        k kVar = this.u;
        if (kVar != null) {
            kVar.i();
        }
        this.f544b = 3;
        this.H = false;
        K();
        if (this.H) {
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onPause()");
    }

    void U() {
        k kVar = this.u;
        if (kVar != null) {
            kVar.q();
            this.u.n();
        }
        this.f544b = 4;
        this.H = false;
        L();
        if (!this.H) {
            throw new w("Fragment " + this + " did not call through to super.onResume()");
        }
        k kVar2 = this.u;
        if (kVar2 != null) {
            kVar2.j();
            this.u.n();
        }
        this.T.a(android.arch.lifecycle.c.a.ON_RESUME);
        if (this.J != null) {
            this.U.a(android.arch.lifecycle.c.a.ON_RESUME);
        }
    }

    void V() {
        k kVar = this.u;
        if (kVar != null) {
            kVar.q();
            this.u.n();
        }
        this.f544b = 3;
        this.H = false;
        M();
        if (!this.H) {
            throw new w("Fragment " + this + " did not call through to super.onStart()");
        }
        k kVar2 = this.u;
        if (kVar2 != null) {
            kVar2.k();
        }
        this.T.a(android.arch.lifecycle.c.a.ON_START);
        if (this.J != null) {
            this.U.a(android.arch.lifecycle.c.a.ON_START);
        }
    }

    void W() {
        if (this.J != null) {
            this.U.a(android.arch.lifecycle.c.a.ON_STOP);
        }
        this.T.a(android.arch.lifecycle.c.a.ON_STOP);
        k kVar = this.u;
        if (kVar != null) {
            kVar.l();
        }
        this.f544b = 2;
        this.H = false;
        N();
        if (this.H) {
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onStop()");
    }

    public final Context X() {
        Context contextJ = j();
        if (contextJ != null) {
            return contextJ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void Y() {
        k kVar = this.s;
        if (kVar == null || kVar.n == null) {
            Z().q = false;
        } else if (Looper.myLooper() != this.s.n.e().getLooper()) {
            this.s.n.e().postAtFrontOfQueue(new a());
        } else {
            c();
        }
    }

    @Override // android.arch.lifecycle.e
    public android.arch.lifecycle.c a() {
        return this.T;
    }

    e a(String str) {
        if (str.equals(this.g)) {
            return this;
        }
        k kVar = this.u;
        if (kVar != null) {
            return kVar.b(str);
        }
        return null;
    }

    @Deprecated
    public LayoutInflater a(Bundle bundle) {
        i iVar = this.t;
        if (iVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterF = iVar.f();
        i();
        k kVar = this.u;
        kVar.o();
        b.b.c.g.f.b(layoutInflaterF, kVar);
        return layoutInflaterF;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public Animation a(int i, boolean z, int i2) {
        return null;
    }

    void a(int i) {
        if (this.N == null && i == 0) {
            return;
        }
        Z().d = i;
    }

    void a(int i, int i2) {
        if (this.N == null && i == 0 && i2 == 0) {
            return;
        }
        Z();
        d dVar = this.N;
        dVar.e = i;
        dVar.f = i2;
    }

    public void a(int i, int i2, Intent intent) {
    }

    final void a(int i, e eVar) {
        StringBuilder sb;
        String str;
        this.f = i;
        if (eVar != null) {
            sb = new StringBuilder();
            sb.append(eVar.g);
            str = ":";
        } else {
            sb = new StringBuilder();
            str = "android:fragment:";
        }
        sb.append(str);
        sb.append(this.f);
        this.g = sb.toString();
    }

    public void a(int i, String[] strArr, int[] iArr) {
    }

    void a(Animator animator) {
        Z().f550b = animator;
    }

    @Deprecated
    public void a(Activity activity) {
        this.H = true;
    }

    @Deprecated
    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.H = true;
    }

    public void a(Context context) {
        this.H = true;
        i iVar = this.t;
        Activity activityB = iVar == null ? null : iVar.b();
        if (activityB != null) {
            this.H = false;
            a(activityB);
        }
    }

    public void a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.H = true;
        i iVar = this.t;
        Activity activityB = iVar == null ? null : iVar.b();
        if (activityB != null) {
            this.H = false;
            a(activityB, attributeSet, bundle);
        }
    }

    void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        k kVar = this.u;
        if (kVar != null) {
            kVar.a(configuration);
        }
    }

    void a(f fVar) {
        Z();
        f fVar2 = this.N.r;
        if (fVar == fVar2) {
            return;
        }
        if (fVar != null && fVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        d dVar = this.N;
        if (dVar.q) {
            dVar.r = fVar;
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    public void a(e eVar) {
    }

    public void a(Menu menu) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    void a(View view) {
        Z().f549a = view;
    }

    public void a(View view, Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.z));
        printWriter.print(" mTag=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f544b);
        printWriter.print(" mIndex=");
        printWriter.print(this.f);
        printWriter.print(" mWho=");
        printWriter.print(this.g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.B);
        printWriter.print(" mDetached=");
        printWriter.print(this.C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.G);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.F);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.D);
        printWriter.print(" mRetaining=");
        printWriter.print(this.E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.M);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.s);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.t);
        }
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.x);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.h);
        }
        if (this.f545c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f545c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.d);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.k);
        }
        if (p() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(p());
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.J);
        }
        if (g() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(g());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(x());
        }
        if (j() != null) {
            s.a(this).a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.u + ":");
            this.u.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public void a(boolean z) {
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    public Animator b(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.arch.lifecycle.q
    public android.arch.lifecycle.p b() {
        if (j() == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.w == null) {
            this.w = new android.arch.lifecycle.p();
        }
        return this.w;
    }

    void b(int i) {
        Z().f551c = i;
    }

    public void b(Bundle bundle) {
        this.H = true;
    }

    void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k kVar = this.u;
        if (kVar != null) {
            kVar.q();
        }
        this.q = true;
        this.V = new c();
        this.U = null;
        View viewA = a(layoutInflater, viewGroup, bundle);
        this.J = viewA;
        if (viewA != null) {
            this.V.a();
            this.W.a(this.V);
        } else {
            if (this.U != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.V = null;
        }
    }

    public void b(Menu menu) {
    }

    public void b(boolean z) {
    }

    boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.B) {
            return false;
        }
        if (this.F && this.G) {
            a(menu, menuInflater);
            z = true;
        }
        k kVar = this.u;
        return kVar != null ? z | kVar.a(menu, menuInflater) : z;
    }

    public boolean b(MenuItem menuItem) {
        return false;
    }

    void c() {
        d dVar = this.N;
        f fVar = null;
        if (dVar != null) {
            dVar.q = false;
            f fVar2 = dVar.r;
            dVar.r = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public void c(Bundle bundle) {
        this.H = true;
        k(bundle);
        k kVar = this.u;
        if (kVar == null || kVar.c(1)) {
            return;
        }
        this.u.e();
    }

    void c(Menu menu) {
        if (this.B) {
            return;
        }
        if (this.F && this.G) {
            a(menu);
        }
        k kVar = this.u;
        if (kVar != null) {
            kVar.a(menu);
        }
    }

    public void c(boolean z) {
    }

    boolean c(MenuItem menuItem) {
        if (this.B) {
            return false;
        }
        if (a(menuItem)) {
            return true;
        }
        k kVar = this.u;
        return kVar != null && kVar.a(menuItem);
    }

    public final android.support.v4.app.f d() {
        i iVar = this.t;
        if (iVar == null) {
            return null;
        }
        return (android.support.v4.app.f) iVar.b();
    }

    public LayoutInflater d(Bundle bundle) {
        return a(bundle);
    }

    void d(boolean z) {
        b(z);
        k kVar = this.u;
        if (kVar != null) {
            kVar.a(z);
        }
    }

    boolean d(Menu menu) {
        boolean z = false;
        if (this.B) {
            return false;
        }
        if (this.F && this.G) {
            b(menu);
            z = true;
        }
        k kVar = this.u;
        return kVar != null ? z | kVar.b(menu) : z;
    }

    boolean d(MenuItem menuItem) {
        if (this.B) {
            return false;
        }
        if (this.F && this.G && b(menuItem)) {
            return true;
        }
        k kVar = this.u;
        return kVar != null && kVar.b(menuItem);
    }

    public void e(Bundle bundle) {
    }

    void e(boolean z) {
        c(z);
        k kVar = this.u;
        if (kVar != null) {
            kVar.b(z);
        }
    }

    public boolean e() {
        Boolean bool;
        d dVar = this.N;
        if (dVar == null || (bool = dVar.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f(Bundle bundle) {
        this.H = true;
    }

    void f(boolean z) {
        Z().s = z;
    }

    public boolean f() {
        Boolean bool;
        d dVar = this.N;
        if (dVar == null || (bool = dVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View g() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.f549a;
    }

    void g(Bundle bundle) {
        k kVar = this.u;
        if (kVar != null) {
            kVar.q();
        }
        this.f544b = 2;
        this.H = false;
        b(bundle);
        if (this.H) {
            k kVar2 = this.u;
            if (kVar2 != null) {
                kVar2.d();
                return;
            }
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    Animator h() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.f550b;
    }

    void h(Bundle bundle) {
        k kVar = this.u;
        if (kVar != null) {
            kVar.q();
        }
        this.f544b = 1;
        this.H = false;
        c(bundle);
        this.S = true;
        if (this.H) {
            this.T.a(android.arch.lifecycle.c.a.ON_CREATE);
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final j i() {
        if (this.u == null) {
            A();
            int i = this.f544b;
            if (i >= 4) {
                this.u.j();
            } else if (i >= 3) {
                this.u.k();
            } else if (i >= 2) {
                this.u.d();
            } else if (i >= 1) {
                this.u.e();
            }
        }
        return this.u;
    }

    LayoutInflater i(Bundle bundle) {
        LayoutInflater layoutInflaterD = d(bundle);
        this.R = layoutInflaterD;
        return layoutInflaterD;
    }

    public Context j() {
        i iVar = this.t;
        if (iVar == null) {
            return null;
        }
        return iVar.c();
    }

    void j(Bundle bundle) {
        Parcelable parcelableT;
        e(bundle);
        k kVar = this.u;
        if (kVar == null || (parcelableT = kVar.t()) == null) {
            return;
        }
        bundle.putParcelable("android:support:fragments", parcelableT);
    }

    public Object k() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.g;
    }

    void k(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        if (this.u == null) {
            A();
        }
        this.u.a(parcelable, this.v);
        this.v = null;
        this.u.e();
    }

    v l() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.o;
    }

    final void l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.d;
        if (sparseArray != null) {
            this.K.restoreHierarchyState(sparseArray);
            this.d = null;
        }
        this.H = false;
        f(bundle);
        if (this.H) {
            if (this.J != null) {
                this.U.a(android.arch.lifecycle.c.a.ON_CREATE);
            }
        } else {
            throw new w("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public Object m() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.i;
    }

    public void m(Bundle bundle) {
        if (this.f >= 0 && E()) {
            throw new IllegalStateException("Fragment already active and state has been saved");
        }
        this.h = bundle;
    }

    v n() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.p;
    }

    public final j o() {
        return this.s;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        d().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.H = true;
    }

    int p() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.d;
    }

    int q() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.e;
    }

    int r() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f;
    }

    public Object s() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.j;
        return obj == Y ? m() : obj;
    }

    public final Resources t() {
        return X().getResources();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        b.b.c.f.d.a(this, sb);
        if (this.f >= 0) {
            sb.append(" #");
            sb.append(this.f);
        }
        if (this.y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.y));
        }
        if (this.A != null) {
            sb.append(" ");
            sb.append(this.A);
        }
        sb.append('}');
        return sb.toString();
    }

    public Object u() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.h;
        return obj == Y ? k() : obj;
    }

    public Object v() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.k;
    }

    public Object w() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.l;
        return obj == Y ? v() : obj;
    }

    int x() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f551c;
    }

    public View y() {
        return this.J;
    }

    void z() {
        this.f = -1;
        this.g = null;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = 0;
        this.s = null;
        this.u = null;
        this.t = null;
        this.y = 0;
        this.z = 0;
        this.A = null;
        this.B = false;
        this.C = false;
        this.E = false;
    }
}
