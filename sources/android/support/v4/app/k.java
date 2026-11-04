package android.support.v4.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
final class k extends android.support.v4.app.j implements LayoutInflater.Factory2 {
    static boolean F = false;
    static Field G;
    static final Interpolator H = new DecelerateInterpolator(2.5f);
    static final Interpolator I = new DecelerateInterpolator(1.5f);
    ArrayList<m> C;
    android.support.v4.app.l D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<l> f560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f561c;
    SparseArray<android.support.v4.app.e> f;
    ArrayList<android.support.v4.app.c> g;
    ArrayList<android.support.v4.app.e> h;
    ArrayList<android.support.v4.app.c> i;
    ArrayList<Integer> j;
    ArrayList<android.support.v4.app.j.b> k;
    android.support.v4.app.i n;
    android.support.v4.app.g o;
    android.support.v4.app.e p;
    android.support.v4.app.e q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    String v;
    boolean w;
    ArrayList<android.support.v4.app.c> x;
    ArrayList<Boolean> y;
    ArrayList<android.support.v4.app.e> z;
    int d = 0;
    final ArrayList<android.support.v4.app.e> e = new ArrayList<>();
    private final CopyOnWriteArrayList<j> l = new CopyOnWriteArrayList<>();
    int m = 0;
    Bundle A = null;
    SparseArray<Parcelable> B = null;
    Runnable E = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.n();
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f564c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f564c.g() != null) {
                    b.this.f564c.a((View) null);
                    b bVar = b.this;
                    k kVar = k.this;
                    android.support.v4.app.e eVar = bVar.f564c;
                    kVar.a(eVar, eVar.x(), 0, 0, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Animation.AnimationListener animationListener, ViewGroup viewGroup, android.support.v4.app.e eVar) {
            super(animationListener);
            this.f563b = viewGroup;
            this.f564c = eVar;
        }

        @Override // android.support.v4.app.k.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.f563b.post(new a());
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f568c;

        c(ViewGroup viewGroup, View view, android.support.v4.app.e eVar) {
            this.f566a = viewGroup;
            this.f567b = view;
            this.f568c = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f566a.endViewTransition(this.f567b);
            Animator animatorH = this.f568c.h();
            this.f568c.a((Animator) null);
            if (animatorH == null || this.f566a.indexOfChild(this.f567b) >= 0) {
                return;
            }
            k kVar = k.this;
            android.support.v4.app.e eVar = this.f568c;
            kVar.a(eVar, eVar.x(), 0, 0, false);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f571c;

        d(k kVar, ViewGroup viewGroup, View view, android.support.v4.app.e eVar) {
            this.f569a = viewGroup;
            this.f570b = view;
            this.f571c = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f569a.endViewTransition(this.f570b);
            animator.removeListener(this);
            View view = this.f571c.J;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    private static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f572b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f572b.setLayerType(0, null);
            }
        }

        e(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f572b = view;
        }

        @Override // android.support.v4.app.k.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (b.b.c.g.q.j(this.f572b) || Build.VERSION.SDK_INT >= 24) {
                this.f572b.post(new a());
            } else {
                this.f572b.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    private static class f implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Animation.AnimationListener f574a;

        f(Animation.AnimationListener animationListener) {
            this.f574a = animationListener;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f574a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f574a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f574a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f576b;

        g(Animator animator) {
            this.f575a = null;
            this.f576b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f575a = animation;
            this.f576b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f577a;

        h(View view) {
            this.f577a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f577a.setLayerType(0, null);
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f577a.setLayerType(2, null);
        }
    }

    private static class i extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ViewGroup f578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f579c;
        private boolean d;
        private boolean e;
        private boolean f;

        i(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f = true;
            this.f578b = viewGroup;
            this.f579c = view;
            addAnimation(animation);
            this.f578b.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.d = true;
                u.a(this.f578b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.d = true;
                u.a(this.f578b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d || !this.f) {
                this.f578b.endViewTransition(this.f579c);
                this.e = true;
            } else {
                this.f = false;
                this.f578b.post(this);
            }
        }
    }

    private static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.support.v4.app.j.a f580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f581b;
    }

    /* JADX INFO: renamed from: android.support.v4.app.k$k, reason: collision with other inner class name */
    static class C0028k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f582a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    interface l {
        boolean a(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2);
    }

    static class m implements android.support.v4.app.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.support.v4.app.c f584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f585c;

        m(android.support.v4.app.c cVar, boolean z) {
            this.f583a = z;
            this.f584b = cVar;
        }

        @Override // android.support.v4.app.e.f
        public void a() {
            int i = this.f585c - 1;
            this.f585c = i;
            if (i != 0) {
                return;
            }
            this.f584b.f536a.v();
        }

        @Override // android.support.v4.app.e.f
        public void b() {
            this.f585c++;
        }

        public void c() {
            android.support.v4.app.c cVar = this.f584b;
            cVar.f536a.a(cVar, this.f583a, false, false);
        }

        public void d() {
            boolean z = this.f585c > 0;
            k kVar = this.f584b.f536a;
            int size = kVar.e.size();
            for (int i = 0; i < size; i++) {
                android.support.v4.app.e eVar = kVar.e.get(i);
                eVar.a((android.support.v4.app.e.f) null);
                if (z && eVar.D()) {
                    eVar.Y();
                }
            }
            android.support.v4.app.c cVar = this.f584b;
            cVar.f536a.a(cVar, this.f583a, !z, true);
        }

        public boolean e() {
            return this.f585c == 0;
        }
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    k() {
    }

    private void A() {
        SparseArray<android.support.v4.app.e> sparseArray = this.f;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.app.e eVarValueAt = this.f.valueAt(i2);
            if (eVarValueAt != null) {
                if (eVarValueAt.g() != null) {
                    int iX = eVarValueAt.x();
                    View viewG = eVarValueAt.g();
                    Animation animation = viewG.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        viewG.clearAnimation();
                    }
                    eVarValueAt.a((View) null);
                    a(eVarValueAt, iX, 0, 0, false);
                } else if (eVarValueAt.h() != null) {
                    eVarValueAt.h().end();
                }
            }
        }
    }

    private void B() {
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                this.C.remove(0).d();
            }
        }
    }

    private int a(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, b.b.c.f.b<android.support.v4.app.e> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            android.support.v4.app.c cVar = arrayList.get(i5);
            boolean zBooleanValue = arrayList2.get(i5).booleanValue();
            if (cVar.c() && !cVar.a(arrayList, i5 + 1, i3)) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                m mVar = new m(cVar, zBooleanValue);
                this.C.add(mVar);
                cVar.a(mVar);
                if (zBooleanValue) {
                    cVar.a();
                } else {
                    cVar.a(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, cVar);
                }
                a(bVar);
            }
        }
        return i4;
    }

    static g a(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(I);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g a(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(H);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(I);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private static Animation.AnimationListener a(Animation animation) {
        String str;
        try {
            if (G == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                G = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) G.get(animation);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "Cannot access Animation's mListener field";
            Log.e("FragmentManager", str, e);
            return null;
        } catch (NoSuchFieldException e3) {
            e = e3;
            str = "No field with the name mListener is found in Animation class";
            Log.e("FragmentManager", str, e);
            return null;
        }
    }

    private void a(android.support.v4.app.e eVar, g gVar, int i2) {
        View view = eVar.J;
        ViewGroup viewGroup = eVar.I;
        viewGroup.startViewTransition(view);
        eVar.b(i2);
        if (gVar.f575a != null) {
            i iVar = new i(gVar.f575a, viewGroup, view);
            eVar.a(eVar.J);
            iVar.setAnimationListener(new b(a(iVar), viewGroup, eVar));
            a(view, gVar);
            eVar.J.startAnimation(iVar);
            return;
        }
        Animator animator = gVar.f576b;
        eVar.a(animator);
        animator.addListener(new c(viewGroup, view, eVar));
        animator.setTarget(eVar.J);
        a(eVar.J, gVar);
        animator.start();
    }

    private static void a(android.support.v4.app.l lVar) {
        if (lVar == null) {
            return;
        }
        List<android.support.v4.app.e> listB = lVar.b();
        if (listB != null) {
            Iterator<android.support.v4.app.e> it = listB.iterator();
            while (it.hasNext()) {
                it.next().E = true;
            }
        }
        List<android.support.v4.app.l> listA = lVar.a();
        if (listA != null) {
            Iterator<android.support.v4.app.l> it2 = listA.iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
        }
    }

    private static void a(View view, g gVar) {
        if (view == null || gVar == null || !b(view, gVar)) {
            return;
        }
        Animator animator = gVar.f576b;
        if (animator != null) {
            animator.addListener(new h(view));
            return;
        }
        Animation.AnimationListener animationListenerA = a(gVar.f575a);
        view.setLayerType(2, null);
        gVar.f575a.setAnimationListener(new e(view, animationListenerA));
    }

    private void a(b.b.c.f.b<android.support.v4.app.e> bVar) {
        int i2 = this.m;
        if (i2 < 1) {
            return;
        }
        int iMin = Math.min(i2, 3);
        int size = this.e.size();
        for (int i3 = 0; i3 < size; i3++) {
            android.support.v4.app.e eVar = this.e.get(i3);
            if (eVar.f544b < iMin) {
                a(eVar, iMin, eVar.p(), eVar.q(), false);
                if (eVar.J != null && !eVar.B && eVar.O) {
                    bVar.add(eVar);
                }
            }
        }
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new b.b.c.f.e("FragmentManager"));
        android.support.v4.app.i iVar = this.n;
        try {
            if (iVar != null) {
                iVar.a("  ", null, printWriter, new String[0]);
            } else {
                a("  ", (FileDescriptor) null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[PHI: r0 r2
  0x0031: PHI (r0v6 int) = (r0v4 int), (r0v3 int) binds: [B:29:0x006a, B:15:0x002f] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r2v5 int) = (r2v2 int), (r2v1 int) binds: [B:29:0x006a, B:15:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    private void a(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<m> arrayList3 = this.C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            m mVar = this.C.get(i2);
            if (arrayList != null && !mVar.f583a && (iIndexOf2 = arrayList.indexOf(mVar.f584b)) != -1 && arrayList2.get(iIndexOf2).booleanValue()) {
                mVar.c();
            } else if (mVar.e() || (arrayList != null && mVar.f584b.a(arrayList, 0, arrayList.size()))) {
                this.C.remove(i2);
                i2--;
                size--;
                if (arrayList == null || mVar.f583a || (iIndexOf = arrayList.indexOf(mVar.f584b)) == -1 || !arrayList2.get(iIndexOf).booleanValue()) {
                    mVar.d();
                } else {
                    mVar.c();
                }
            }
            i2++;
        }
    }

    private static void a(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            android.support.v4.app.c cVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                cVar.a(-1);
                cVar.a(i2 == i3 + (-1));
            } else {
                cVar.a(1);
                cVar.a();
            }
            i2++;
        }
    }

    static boolean a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (a(childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean a(g gVar) {
        Animation animation = gVar.f575a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return a(gVar.f576b);
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i2 = 0; i2 < animations.size(); i2++) {
            if (animations.get(i2) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    private boolean a(String str, int i2, int i3) {
        android.support.v4.app.j jVarO;
        n();
        c(true);
        android.support.v4.app.e eVar = this.q;
        if (eVar != null && i2 < 0 && str == null && (jVarO = eVar.O()) != null && jVarO.c()) {
            return true;
        }
        boolean zA = a(this.x, this.y, str, i2, i3);
        if (zA) {
            this.f561c = true;
            try {
                c(this.x, this.y);
                z();
            } catch (Throwable th) {
                z();
                throw th;
            }
        }
        m();
        x();
        return zA;
    }

    public static int b(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? 1 : 2;
        }
        if (i2 == 4099) {
            return z ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    private void b(b.b.c.f.b<android.support.v4.app.e> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.app.e eVarC = bVar.c(i2);
            if (!eVarC.l) {
                View viewY = eVarC.y();
                eVarC.Q = viewY.getAlpha();
                viewY.setAlpha(0.0f);
            }
        }
    }

    private void b(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        boolean z = arrayList.get(i6).s;
        ArrayList<android.support.v4.app.e> arrayList3 = this.z;
        if (arrayList3 == null) {
            this.z = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.z.addAll(this.e);
        android.support.v4.app.e eVarP = p();
        boolean z2 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            android.support.v4.app.c cVar = arrayList.get(i7);
            eVarP = !arrayList2.get(i7).booleanValue() ? cVar.a(this.z, eVarP) : cVar.b(this.z, eVarP);
            z2 = z2 || cVar.i;
        }
        this.z.clear();
        if (!z) {
            p.a(this, arrayList, arrayList2, i2, i3, false);
        }
        a(arrayList, arrayList2, i2, i3);
        if (z) {
            b.b.c.f.b<android.support.v4.app.e> bVar = new b.b.c.f.b<>();
            a(bVar);
            int iA = a(arrayList, arrayList2, i2, i3, bVar);
            b(bVar);
            i4 = iA;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z) {
            p.a(this, arrayList, arrayList2, i2, i4, true);
            a(this.m, true);
        }
        while (i6 < i3) {
            android.support.v4.app.c cVar2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = cVar2.l) >= 0) {
                b(i5);
                cVar2.l = -1;
            }
            cVar2.d();
            i6++;
        }
        if (z2) {
            r();
        }
    }

    static boolean b(View view, g gVar) {
        return view != null && gVar != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && b.b.c.g.q.i(view) && a(gVar);
    }

    private boolean b(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.f560b != null && this.f560b.size() != 0) {
                int size = this.f560b.size();
                boolean zA = false;
                for (int i2 = 0; i2 < size; i2++) {
                    zA |= this.f560b.get(i2).a(arrayList, arrayList2);
                }
                this.f560b.clear();
                this.n.e().removeCallbacks(this.E);
                return zA;
            }
            return false;
        }
    }

    private void c(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        a(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).s) {
                if (i3 != i2) {
                    b(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).s) {
                        i3++;
                    }
                }
                b(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            b(arrayList, arrayList2, i3, size);
        }
    }

    private void c(boolean z) {
        if (this.f561c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.n == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.n.e().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            y();
        }
        if (this.x == null) {
            this.x = new ArrayList<>();
            this.y = new ArrayList<>();
        }
        this.f561c = true;
        try {
            a((ArrayList<android.support.v4.app.c>) null, (ArrayList<Boolean>) null);
        } finally {
            this.f561c = false;
        }
    }

    private void d(int i2) {
        try {
            this.f561c = true;
            a(i2, false);
            this.f561c = false;
            n();
        } catch (Throwable th) {
            this.f561c = false;
            throw th;
        }
    }

    public static int e(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private android.support.v4.app.e p(android.support.v4.app.e eVar) {
        ViewGroup viewGroup = eVar.I;
        View view = eVar.J;
        if (viewGroup != null && view != null) {
            for (int iIndexOf = this.e.indexOf(eVar) - 1; iIndexOf >= 0; iIndexOf--) {
                android.support.v4.app.e eVar2 = this.e.get(iIndexOf);
                if (eVar2.I == viewGroup && eVar2.J != null) {
                    return eVar2;
                }
            }
        }
        return null;
    }

    private void x() {
        SparseArray<android.support.v4.app.e> sparseArray = this.f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f.valueAt(size) == null) {
                    SparseArray<android.support.v4.app.e> sparseArray2 = this.f;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    private void y() {
        if (b()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.v == null) {
            return;
        }
        throw new IllegalStateException("Can not perform this action inside of " + this.v);
    }

    private void z() {
        this.f561c = false;
        this.y.clear();
        this.x.clear();
    }

    public android.support.v4.app.e a(int i2) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            android.support.v4.app.e eVar = this.e.get(size);
            if (eVar != null && eVar.y == i2) {
                return eVar;
            }
        }
        SparseArray<android.support.v4.app.e> sparseArray = this.f;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            android.support.v4.app.e eVarValueAt = this.f.valueAt(size2);
            if (eVarValueAt != null && eVarValueAt.y == i2) {
                return eVarValueAt;
            }
        }
        return null;
    }

    public android.support.v4.app.e a(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        android.support.v4.app.e eVar = this.f.get(i2);
        if (eVar != null) {
            return eVar;
        }
        a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        throw null;
    }

    public android.support.v4.app.e a(String str) {
        if (str != null) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                android.support.v4.app.e eVar = this.e.get(size);
                if (eVar != null && str.equals(eVar.A)) {
                    return eVar;
                }
            }
        }
        SparseArray<android.support.v4.app.e> sparseArray = this.f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            android.support.v4.app.e eVarValueAt = this.f.valueAt(size2);
            if (eVarValueAt != null && str.equals(eVarValueAt.A)) {
                return eVarValueAt;
            }
        }
        return null;
    }

    g a(android.support.v4.app.e eVar, int i2, boolean z, int i3) {
        int iB;
        int iP = eVar.p();
        Animation animationA = eVar.a(i2, z, iP);
        if (animationA != null) {
            return new g(animationA);
        }
        Animator animatorB = eVar.b(i2, z, iP);
        if (animatorB != null) {
            return new g(animatorB);
        }
        if (iP != 0) {
            boolean zEquals = "anim".equals(this.n.c().getResources().getResourceTypeName(iP));
            boolean z2 = false;
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.n.c(), iP);
                    if (animationLoadAnimation != null) {
                        return new g(animationLoadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.n.c(), iP);
                    if (animatorLoadAnimator != null) {
                        return new g(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this.n.c(), iP);
                    if (animationLoadAnimation2 != null) {
                        return new g(animationLoadAnimation2);
                    }
                }
            }
        }
        if (i2 == 0 || (iB = b(i2, z)) < 0) {
            return null;
        }
        switch (iB) {
            case 1:
                return a(this.n.c(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return a(this.n.c(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return a(this.n.c(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return a(this.n.c(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return a(this.n.c(), 0.0f, 1.0f);
            case 6:
                return a(this.n.c(), 1.0f, 0.0f);
            default:
                if (i3 == 0 && this.n.h()) {
                    this.n.g();
                }
                return null;
        }
    }

    @Override // android.support.v4.app.j
    public List<android.support.v4.app.e> a() {
        List<android.support.v4.app.e> list;
        if (this.e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.e) {
            list = (List) this.e.clone();
        }
        return list;
    }

    public void a(int i2, android.support.v4.app.c cVar) {
        synchronized (this) {
            if (this.i == null) {
                this.i = new ArrayList<>();
            }
            int size = this.i.size();
            if (i2 < size) {
                if (F) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + cVar);
                }
                this.i.set(i2, cVar);
            } else {
                while (size < i2) {
                    this.i.add(null);
                    if (this.j == null) {
                        this.j = new ArrayList<>();
                    }
                    if (F) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.j.add(Integer.valueOf(size));
                    size++;
                }
                if (F) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + cVar);
                }
                this.i.add(cVar);
            }
        }
    }

    void a(int i2, boolean z) {
        android.support.v4.app.i iVar;
        if (this.n == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.m) {
            this.m = i2;
            if (this.f != null) {
                int size = this.e.size();
                for (int i3 = 0; i3 < size; i3++) {
                    h(this.e.get(i3));
                }
                int size2 = this.f.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    android.support.v4.app.e eVarValueAt = this.f.valueAt(i4);
                    if (eVarValueAt != null && ((eVarValueAt.m || eVarValueAt.C) && !eVarValueAt.O)) {
                        h(eVarValueAt);
                    }
                }
                w();
                if (this.r && (iVar = this.n) != null && this.m == 4) {
                    iVar.i();
                    this.r = false;
                }
            }
        }
    }

    public void a(Configuration configuration) {
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.e eVar = this.e.get(i2);
            if (eVar != null) {
                eVar.a(configuration);
            }
        }
    }

    public void a(Bundle bundle, String str, android.support.v4.app.e eVar) {
        int i2 = eVar.f;
        if (i2 >= 0) {
            bundle.putInt(str, i2);
            return;
        }
        a(new IllegalStateException("Fragment " + eVar + " is not currently in the FragmentManager"));
        throw null;
    }

    void a(Parcelable parcelable, android.support.v4.app.l lVar) {
        List<android.support.v4.app.l> listA;
        List<android.arch.lifecycle.p> listC;
        if (parcelable == null) {
            return;
        }
        android.support.v4.app.m mVar = (android.support.v4.app.m) parcelable;
        if (mVar.f589b == null) {
            return;
        }
        if (lVar != null) {
            List<android.support.v4.app.e> listB = lVar.b();
            listA = lVar.a();
            listC = lVar.c();
            int size = listB != null ? listB.size() : 0;
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.app.e eVar = listB.get(i2);
                if (F) {
                    Log.v("FragmentManager", "restoreAllState: re-attaching retained " + eVar);
                }
                int i3 = 0;
                while (true) {
                    n[] nVarArr = mVar.f589b;
                    if (i3 >= nVarArr.length || nVarArr[i3].f592c == eVar.f) {
                        break;
                    } else {
                        i3++;
                    }
                }
                n[] nVarArr2 = mVar.f589b;
                if (i3 == nVarArr2.length) {
                    a(new IllegalStateException("Could not find active fragment with index " + eVar.f));
                    throw null;
                }
                n nVar = nVarArr2[i3];
                nVar.m = eVar;
                eVar.d = null;
                eVar.r = 0;
                eVar.o = false;
                eVar.l = false;
                eVar.i = null;
                Bundle bundle = nVar.l;
                if (bundle != null) {
                    bundle.setClassLoader(this.n.c().getClassLoader());
                    eVar.d = nVar.l.getSparseParcelableArray("android:view_state");
                    eVar.f545c = nVar.l;
                }
            }
        } else {
            listA = null;
            listC = null;
        }
        this.f = new SparseArray<>(mVar.f589b.length);
        int i4 = 0;
        while (true) {
            n[] nVarArr3 = mVar.f589b;
            if (i4 >= nVarArr3.length) {
                break;
            }
            n nVar2 = nVarArr3[i4];
            if (nVar2 != null) {
                android.support.v4.app.e eVarA = nVar2.a(this.n, this.o, this.p, (listA == null || i4 >= listA.size()) ? null : listA.get(i4), (listC == null || i4 >= listC.size()) ? null : listC.get(i4));
                if (F) {
                    Log.v("FragmentManager", "restoreAllState: active #" + i4 + ": " + eVarA);
                }
                this.f.put(eVarA.f, eVarA);
                nVar2.m = null;
            }
            i4++;
        }
        if (lVar != null) {
            List<android.support.v4.app.e> listB2 = lVar.b();
            int size2 = listB2 != null ? listB2.size() : 0;
            for (int i5 = 0; i5 < size2; i5++) {
                android.support.v4.app.e eVar2 = listB2.get(i5);
                int i6 = eVar2.j;
                if (i6 >= 0) {
                    android.support.v4.app.e eVar3 = this.f.get(i6);
                    eVar2.i = eVar3;
                    if (eVar3 == null) {
                        Log.w("FragmentManager", "Re-attaching retained fragment " + eVar2 + " target no longer exists: " + eVar2.j);
                    }
                }
            }
        }
        this.e.clear();
        if (mVar.f590c != null) {
            int i7 = 0;
            while (true) {
                int[] iArr = mVar.f590c;
                if (i7 >= iArr.length) {
                    break;
                }
                android.support.v4.app.e eVar4 = this.f.get(iArr[i7]);
                if (eVar4 == null) {
                    a(new IllegalStateException("No instantiated fragment for index #" + mVar.f590c[i7]));
                    throw null;
                }
                eVar4.l = true;
                if (F) {
                    Log.v("FragmentManager", "restoreAllState: added #" + i7 + ": " + eVar4);
                }
                if (this.e.contains(eVar4)) {
                    throw new IllegalStateException("Already added!");
                }
                synchronized (this.e) {
                    this.e.add(eVar4);
                }
                i7++;
            }
        }
        if (mVar.d != null) {
            this.g = new ArrayList<>(mVar.d.length);
            int i8 = 0;
            while (true) {
                android.support.v4.app.d[] dVarArr = mVar.d;
                if (i8 >= dVarArr.length) {
                    break;
                }
                android.support.v4.app.c cVarA = dVarArr[i8].a(this);
                if (F) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + cVarA.l + "): " + cVarA);
                    PrintWriter printWriter = new PrintWriter(new b.b.c.f.e("FragmentManager"));
                    cVarA.a("  ", printWriter, false);
                    printWriter.close();
                }
                this.g.add(cVarA);
                int i9 = cVarA.l;
                if (i9 >= 0) {
                    a(i9, cVarA);
                }
                i8++;
            }
        } else {
            this.g = null;
        }
        int i10 = mVar.e;
        if (i10 >= 0) {
            this.q = this.f.get(i10);
        }
        this.d = mVar.f;
    }

    void a(android.support.v4.app.c cVar) {
        if (this.g == null) {
            this.g = new ArrayList<>();
        }
        this.g.add(cVar);
    }

    void a(android.support.v4.app.c cVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            cVar.a(z3);
        } else {
            cVar.a();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(cVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            p.a(this, (ArrayList<android.support.v4.app.c>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            a(this.m, true);
        }
        SparseArray<android.support.v4.app.e> sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.app.e eVarValueAt = this.f.valueAt(i2);
                if (eVarValueAt != null && eVarValueAt.J != null && eVarValueAt.O && cVar.b(eVarValueAt.z)) {
                    float f2 = eVarValueAt.Q;
                    if (f2 > 0.0f) {
                        eVarValueAt.J.setAlpha(f2);
                    }
                    if (z3) {
                        eVarValueAt.Q = 0.0f;
                    } else {
                        eVarValueAt.Q = -1.0f;
                        eVarValueAt.O = false;
                    }
                }
            }
        }
    }

    public void a(android.support.v4.app.e eVar) {
        if (F) {
            Log.v("FragmentManager", "attach: " + eVar);
        }
        if (eVar.C) {
            eVar.C = false;
            if (eVar.l) {
                return;
            }
            if (this.e.contains(eVar)) {
                throw new IllegalStateException("Fragment already added: " + eVar);
            }
            if (F) {
                Log.v("FragmentManager", "add from attach: " + eVar);
            }
            synchronized (this.e) {
                this.e.add(eVar);
            }
            eVar.l = true;
            if (eVar.F && eVar.G) {
                this.r = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0292  */
    /* JADX WARN: Code duplicated, block: B:136:0x0296  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:191:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:193:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:195:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:196:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:198:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:221:0x041d  */
    /* JADX WARN: Code duplicated, block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:136:0x0296, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:141:0x02b6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:221:0x041d, please report this as an issue */
    void a(android.support.v4.app.e eVar, int i2, int i3, int i4, boolean z) {
        int i5;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        String resourceName;
        int i6;
        int i7 = 1;
        if (!eVar.l || eVar.C) {
            i5 = i2;
            if (i5 > 1) {
                i5 = 1;
            }
        } else {
            i5 = i2;
        }
        if (eVar.m && i5 > (i6 = eVar.f544b)) {
            i5 = (i6 == 0 && eVar.C()) ? 1 : eVar.f544b;
        }
        int i8 = (!eVar.L || eVar.f544b >= 3 || i5 <= 2) ? i5 : 2;
        int i9 = eVar.f544b;
        if (i9 > i8) {
            if (i9 > i8) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 == 4) {
                                if (i8 < 4) {
                                    if (F) {
                                        Log.v("FragmentManager", "movefrom RESUMED: " + eVar);
                                    }
                                    eVar.T();
                                    d(eVar, false);
                                }
                            }
                        }
                        if (i8 < 3) {
                            if (F) {
                                Log.v("FragmentManager", "movefrom STARTED: " + eVar);
                            }
                            eVar.W();
                            g(eVar, false);
                        }
                    }
                    if (i8 < 2) {
                        if (F) {
                            Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + eVar);
                        }
                        if (eVar.J != null && this.n.b(eVar) && eVar.d == null) {
                            m(eVar);
                        }
                        eVar.Q();
                        h(eVar, false);
                        View view = eVar.J;
                        if (view != null && (viewGroup = eVar.I) != null) {
                            viewGroup.endViewTransition(view);
                            eVar.J.clearAnimation();
                            g gVarA = (this.m <= 0 || this.u || eVar.J.getVisibility() != 0 || eVar.Q < 0.0f) ? null : a(eVar, i3, false, i4);
                            eVar.Q = 0.0f;
                            if (gVarA != null) {
                                a(eVar, gVarA, i8);
                            }
                            eVar.I.removeView(eVar.J);
                        }
                        eVar.I = null;
                        eVar.J = null;
                        eVar.V = null;
                        eVar.W.a((android.arch.lifecycle.e) null);
                        eVar.K = null;
                        eVar.o = false;
                    }
                    if (i8 >= 1) {
                        if (this.u) {
                            if (eVar.g() != null) {
                                View viewG = eVar.g();
                                eVar.a((View) null);
                                viewG.clearAnimation();
                            } else if (eVar.h() != null) {
                                Animator animatorH = eVar.h();
                                eVar.a((Animator) null);
                                animatorH.cancel();
                            }
                        }
                        if (eVar.g() == null) {
                        }
                        eVar.b(i8);
                    }
                } else if (i8 >= 1) {
                    if (this.u) {
                        if (eVar.g() != null) {
                            View viewG2 = eVar.g();
                            eVar.a((View) null);
                            viewG2.clearAnimation();
                        } else if (eVar.h() != null) {
                            Animator animatorH2 = eVar.h();
                            eVar.a((Animator) null);
                            animatorH2.cancel();
                        }
                    }
                    if (eVar.g() == null || eVar.h() != null) {
                        eVar.b(i8);
                    } else {
                        if (F) {
                            Log.v("FragmentManager", "movefrom CREATED: " + eVar);
                        }
                        if (eVar.E) {
                            eVar.f544b = 0;
                        } else {
                            eVar.P();
                            b(eVar, false);
                        }
                        eVar.R();
                        c(eVar, false);
                        if (!z) {
                            if (eVar.E) {
                                eVar.t = null;
                                eVar.x = null;
                                eVar.s = null;
                            } else {
                                g(eVar);
                            }
                        }
                    }
                }
            }
            if (eVar.f544b != i7) {
                Log.w("FragmentManager", "moveToState: Fragment state for " + eVar + " not updated inline; expected state " + i7 + " found " + eVar.f544b);
                eVar.f544b = i7;
            }
        }
        if (eVar.n && !eVar.o) {
            return;
        }
        if (eVar.g() != null || eVar.h() != null) {
            eVar.a((View) null);
            eVar.a((Animator) null);
            a(eVar, eVar.x(), 0, 0, true);
        }
        int i10 = eVar.f544b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                    }
                }
                if (i8 > 3) {
                    if (F) {
                        Log.v("FragmentManager", "moveto RESUMED: " + eVar);
                    }
                    eVar.U();
                    e(eVar, false);
                    eVar.f545c = null;
                    eVar.d = null;
                }
            }
            if (i8 > 2) {
                if (F) {
                    Log.v("FragmentManager", "moveto STARTED: " + eVar);
                }
                eVar.V();
                f(eVar, false);
            }
            if (i8 > 3) {
                if (F) {
                    Log.v("FragmentManager", "moveto RESUMED: " + eVar);
                }
                eVar.U();
                e(eVar, false);
                eVar.f545c = null;
                eVar.d = null;
            }
        } else if (i8 > 0) {
            if (F) {
                Log.v("FragmentManager", "moveto CREATED: " + eVar);
            }
            Bundle bundle = eVar.f545c;
            if (bundle != null) {
                bundle.setClassLoader(this.n.c().getClassLoader());
                eVar.d = eVar.f545c.getSparseParcelableArray("android:view_state");
                android.support.v4.app.e eVarA = a(eVar.f545c, "android:target_state");
                eVar.i = eVarA;
                if (eVarA != null) {
                    eVar.k = eVar.f545c.getInt("android:target_req_state", 0);
                }
                Boolean bool = eVar.e;
                if (bool != null) {
                    eVar.M = bool.booleanValue();
                    eVar.e = null;
                } else {
                    eVar.M = eVar.f545c.getBoolean("android:user_visible_hint", true);
                }
                if (!eVar.M) {
                    eVar.L = true;
                    if (i8 > 2) {
                        i8 = 2;
                    }
                }
            }
            android.support.v4.app.i iVar = this.n;
            eVar.t = iVar;
            android.support.v4.app.e eVar2 = this.p;
            eVar.x = eVar2;
            eVar.s = eVar2 != null ? eVar2.u : iVar.d();
            android.support.v4.app.e eVar3 = eVar.i;
            if (eVar3 != null) {
                android.support.v4.app.e eVar4 = this.f.get(eVar3.f);
                android.support.v4.app.e eVar5 = eVar.i;
                if (eVar4 != eVar5) {
                    throw new IllegalStateException("Fragment " + eVar + " declared target fragment " + eVar.i + " that does not belong to this FragmentManager!");
                }
                if (eVar5.f544b < 1) {
                    a(eVar5, 1, 0, 0, true);
                }
            }
            b(eVar, this.n.c(), false);
            eVar.H = false;
            eVar.a(this.n.c());
            if (!eVar.H) {
                throw new w("Fragment " + eVar + " did not call through to super.onAttach()");
            }
            android.support.v4.app.e eVar6 = eVar.x;
            if (eVar6 == null) {
                this.n.a(eVar);
            } else {
                eVar6.a(eVar);
            }
            a(eVar, this.n.c(), false);
            if (eVar.S) {
                eVar.k(eVar.f545c);
                eVar.f544b = 1;
            } else {
                c(eVar, eVar.f545c, false);
                eVar.h(eVar.f545c);
                b(eVar, eVar.f545c, false);
            }
            eVar.E = false;
        }
        d(eVar);
        if (i8 > 1) {
            if (F) {
                Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + eVar);
            }
            if (!eVar.n) {
                int i11 = eVar.z;
                if (i11 == 0) {
                    viewGroup2 = null;
                } else {
                    if (i11 == -1) {
                        a(new IllegalArgumentException("Cannot create fragment " + eVar + " for a container view with no id"));
                        throw null;
                    }
                    viewGroup2 = (ViewGroup) this.o.a(i11);
                    if (viewGroup2 == null && !eVar.p) {
                        try {
                            resourceName = eVar.t().getResourceName(eVar.z);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(eVar.z) + " (" + resourceName + ") for fragment " + eVar));
                        throw null;
                    }
                }
                eVar.I = viewGroup2;
                eVar.b(eVar.i(eVar.f545c), viewGroup2, eVar.f545c);
                View view2 = eVar.J;
                if (view2 != null) {
                    eVar.K = view2;
                    view2.setSaveFromParentEnabled(false);
                    if (viewGroup2 != null) {
                        viewGroup2.addView(eVar.J);
                    }
                    if (eVar.B) {
                        eVar.J.setVisibility(8);
                    }
                    eVar.a(eVar.J, eVar.f545c);
                    a(eVar, eVar.J, eVar.f545c, false);
                    eVar.O = eVar.J.getVisibility() == 0 && eVar.I != null;
                } else {
                    eVar.K = null;
                }
            }
            eVar.g(eVar.f545c);
            a(eVar, eVar.f545c, false);
            if (eVar.J != null) {
                eVar.l(eVar.f545c);
            }
            eVar.f545c = null;
        }
        if (i8 > 2) {
            if (F) {
                Log.v("FragmentManager", "moveto STARTED: " + eVar);
            }
            eVar.V();
            f(eVar, false);
        }
        if (i8 > 3) {
            if (F) {
                Log.v("FragmentManager", "moveto RESUMED: " + eVar);
            }
            eVar.U();
            e(eVar, false);
            eVar.f545c = null;
            eVar.d = null;
        }
        i7 = i8;
        if (eVar.f544b != i7) {
            Log.w("FragmentManager", "moveToState: Fragment state for " + eVar + " not updated inline; expected state " + i7 + " found " + eVar.f544b);
            eVar.f544b = i7;
        }
    }

    void a(android.support.v4.app.e eVar, Context context, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).a(eVar, context, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.a(this, eVar, context);
            }
        }
    }

    void a(android.support.v4.app.e eVar, Bundle bundle, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).a(eVar, bundle, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.a(this, eVar, bundle);
            }
        }
    }

    void a(android.support.v4.app.e eVar, View view, Bundle bundle, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).a(eVar, view, bundle, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.a(this, eVar, view, bundle);
            }
        }
    }

    public void a(android.support.v4.app.e eVar, boolean z) {
        if (F) {
            Log.v("FragmentManager", "add: " + eVar);
        }
        f(eVar);
        if (eVar.C) {
            return;
        }
        if (this.e.contains(eVar)) {
            throw new IllegalStateException("Fragment already added: " + eVar);
        }
        synchronized (this.e) {
            this.e.add(eVar);
        }
        eVar.l = true;
        eVar.m = false;
        if (eVar.J == null) {
            eVar.P = false;
        }
        if (eVar.F && eVar.G) {
            this.r = true;
        }
        if (z) {
            i(eVar);
        }
    }

    public void a(android.support.v4.app.i iVar, android.support.v4.app.g gVar, android.support.v4.app.e eVar) {
        if (this.n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.n = iVar;
        this.o = gVar;
        this.p = eVar;
    }

    public void a(Menu menu) {
        if (this.m < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.e eVar = this.e.get(i2);
            if (eVar != null) {
                eVar.c(menu);
            }
        }
    }

    @Override // android.support.v4.app.j
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<android.support.v4.app.e> sparseArray = this.f;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size5; i2++) {
                android.support.v4.app.e eVarValueAt = this.f.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(eVarValueAt);
                if (eVarValueAt != null) {
                    eVarValueAt.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size6; i3++) {
                android.support.v4.app.e eVar = this.e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(eVar.toString());
            }
        }
        ArrayList<android.support.v4.app.e> arrayList = this.h;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                android.support.v4.app.e eVar2 = this.h.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(eVar2.toString());
            }
        }
        ArrayList<android.support.v4.app.c> arrayList2 = this.g;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                android.support.v4.app.c cVar = this.g.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(cVar.toString());
                cVar.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.i != null && (size2 = this.i.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    Object obj = (android.support.v4.app.c) this.i.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.j != null && this.j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.j.toArray()));
            }
        }
        ArrayList<l> arrayList3 = this.f560b;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = (l) this.f560b.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.o);
        if (this.p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mStopped=");
        printWriter.print(this.t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.u);
        if (this.r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.v);
        }
    }

    public void a(boolean z) {
        int size = this.e.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            android.support.v4.app.e eVar = this.e.get(size);
            if (eVar != null) {
                eVar.d(z);
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.m < 1) {
            return false;
        }
        ArrayList<android.support.v4.app.e> arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.e eVar = this.e.get(i2);
            if (eVar != null && eVar.b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(eVar);
                z = true;
            }
        }
        if (this.h != null) {
            for (int i3 = 0; i3 < this.h.size(); i3++) {
                android.support.v4.app.e eVar2 = this.h.get(i3);
                if (arrayList == null || !arrayList.contains(eVar2)) {
                    eVar2.H();
                }
            }
        }
        this.h = arrayList;
        return z;
    }

    public boolean a(MenuItem menuItem) {
        if (this.m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.e eVar = this.e.get(i2);
            if (eVar != null && eVar.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean a(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<android.support.v4.app.c> arrayList3 = this.g;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.g.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = this.g.size() - 1;
                while (size2 >= 0) {
                    android.support.v4.app.c cVar = this.g.get(size2);
                    if ((str != null && str.equals(cVar.b())) || (i2 >= 0 && i2 == cVar.l)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        android.support.v4.app.c cVar2 = this.g.get(size2);
                        if (str == null || !str.equals(cVar2.b())) {
                            if (i2 < 0 || i2 != cVar2.l) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.g.size() - 1) {
                return false;
            }
            for (int size3 = this.g.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.g.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    public android.support.v4.app.e b(String str) {
        android.support.v4.app.e eVarA;
        SparseArray<android.support.v4.app.e> sparseArray = this.f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            android.support.v4.app.e eVarValueAt = this.f.valueAt(size);
            if (eVarValueAt != null && (eVarA = eVarValueAt.a(str)) != null) {
                return eVarA;
            }
        }
        return null;
    }

    public void b(int i2) {
        synchronized (this) {
            this.i.set(i2, null);
            if (this.j == null) {
                this.j = new ArrayList<>();
            }
            if (F) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.j.add(Integer.valueOf(i2));
        }
    }

    void b(android.support.v4.app.e eVar) {
        Animator animator;
        if (eVar.J != null) {
            g gVarA = a(eVar, eVar.q(), !eVar.B, eVar.r());
            if (gVarA == null || (animator = gVarA.f576b) == null) {
                if (gVarA != null) {
                    a(eVar.J, gVarA);
                    eVar.J.startAnimation(gVarA.f575a);
                    gVarA.f575a.start();
                }
                eVar.J.setVisibility((!eVar.B || eVar.B()) ? 0 : 8);
                if (eVar.B()) {
                    eVar.f(false);
                }
            } else {
                animator.setTarget(eVar.J);
                if (!eVar.B) {
                    eVar.J.setVisibility(0);
                } else if (eVar.B()) {
                    eVar.f(false);
                } else {
                    ViewGroup viewGroup = eVar.I;
                    View view = eVar.J;
                    viewGroup.startViewTransition(view);
                    gVarA.f576b.addListener(new d(this, viewGroup, view, eVar));
                }
                a(eVar.J, gVarA);
                gVarA.f576b.start();
            }
        }
        if (eVar.l && eVar.F && eVar.G) {
            this.r = true;
        }
        eVar.P = false;
        eVar.a(eVar.B);
    }

    void b(android.support.v4.app.e eVar, Context context, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).b(eVar, context, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.b(this, eVar, context);
            }
        }
    }

    void b(android.support.v4.app.e eVar, Bundle bundle, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).b(eVar, bundle, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.b(this, eVar, bundle);
            }
        }
    }

    void b(android.support.v4.app.e eVar, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).b(eVar, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.a(this, eVar);
            }
        }
    }

    public void b(boolean z) {
        int size = this.e.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            android.support.v4.app.e eVar = this.e.get(size);
            if (eVar != null) {
                eVar.e(z);
            }
        }
    }

    @Override // android.support.v4.app.j
    public boolean b() {
        return this.s || this.t;
    }

    public boolean b(Menu menu) {
        if (this.m < 1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.e eVar = this.e.get(i2);
            if (eVar != null && eVar.d(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean b(MenuItem menuItem) {
        if (this.m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.e eVar = this.e.get(i2);
            if (eVar != null && eVar.d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void c(android.support.v4.app.e eVar) {
        if (F) {
            Log.v("FragmentManager", "detach: " + eVar);
        }
        if (eVar.C) {
            return;
        }
        eVar.C = true;
        if (eVar.l) {
            if (F) {
                Log.v("FragmentManager", "remove from detach: " + eVar);
            }
            synchronized (this.e) {
                this.e.remove(eVar);
            }
            if (eVar.F && eVar.G) {
                this.r = true;
            }
            eVar.l = false;
        }
    }

    void c(android.support.v4.app.e eVar, Bundle bundle, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).c(eVar, bundle, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.c(this, eVar, bundle);
            }
        }
    }

    void c(android.support.v4.app.e eVar, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).c(eVar, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.b(this, eVar);
            }
        }
    }

    @Override // android.support.v4.app.j
    public boolean c() {
        y();
        return a((String) null, -1, 0);
    }

    boolean c(int i2) {
        return this.m >= i2;
    }

    public void d() {
        this.s = false;
        this.t = false;
        d(2);
    }

    void d(android.support.v4.app.e eVar) {
        if (!eVar.n || eVar.q) {
            return;
        }
        eVar.b(eVar.i(eVar.f545c), (ViewGroup) null, eVar.f545c);
        View view = eVar.J;
        if (view == null) {
            eVar.K = null;
            return;
        }
        eVar.K = view;
        view.setSaveFromParentEnabled(false);
        if (eVar.B) {
            eVar.J.setVisibility(8);
        }
        eVar.a(eVar.J, eVar.f545c);
        a(eVar, eVar.J, eVar.f545c, false);
    }

    void d(android.support.v4.app.e eVar, Bundle bundle, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).d(eVar, bundle, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.d(this, eVar, bundle);
            }
        }
    }

    void d(android.support.v4.app.e eVar, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).d(eVar, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.c(this, eVar);
            }
        }
    }

    public void e() {
        this.s = false;
        this.t = false;
        d(1);
    }

    public void e(android.support.v4.app.e eVar) {
        if (F) {
            Log.v("FragmentManager", "hide: " + eVar);
        }
        if (eVar.B) {
            return;
        }
        eVar.B = true;
        eVar.P = true ^ eVar.P;
    }

    void e(android.support.v4.app.e eVar, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).e(eVar, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.d(this, eVar);
            }
        }
    }

    public void f() {
        this.u = true;
        n();
        d(0);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    void f(android.support.v4.app.e eVar) {
        if (eVar.f >= 0) {
            return;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        eVar.a(i2, this.p);
        if (this.f == null) {
            this.f = new SparseArray<>();
        }
        this.f.put(eVar.f, eVar);
        if (F) {
            Log.v("FragmentManager", "Allocated fragment index " + eVar);
        }
    }

    void f(android.support.v4.app.e eVar, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).f(eVar, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.e(this, eVar);
            }
        }
    }

    public void g() {
        d(1);
    }

    void g(android.support.v4.app.e eVar) {
        if (eVar.f < 0) {
            return;
        }
        if (F) {
            Log.v("FragmentManager", "Freeing fragment index " + eVar);
        }
        this.f.put(eVar.f, null);
        eVar.z();
    }

    void g(android.support.v4.app.e eVar, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).g(eVar, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.f(this, eVar);
            }
        }
    }

    public void h() {
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.e eVar = this.e.get(i2);
            if (eVar != null) {
                eVar.S();
            }
        }
    }

    void h(android.support.v4.app.e eVar) {
        if (eVar == null) {
            return;
        }
        int iMin = this.m;
        if (eVar.m) {
            iMin = eVar.C() ? Math.min(iMin, 1) : Math.min(iMin, 0);
        }
        a(eVar, iMin, eVar.q(), eVar.r(), false);
        if (eVar.J != null) {
            android.support.v4.app.e eVarP = p(eVar);
            if (eVarP != null) {
                View view = eVarP.J;
                ViewGroup viewGroup = eVar.I;
                int iIndexOfChild = viewGroup.indexOfChild(view);
                int iIndexOfChild2 = viewGroup.indexOfChild(eVar.J);
                if (iIndexOfChild2 < iIndexOfChild) {
                    viewGroup.removeViewAt(iIndexOfChild2);
                    viewGroup.addView(eVar.J, iIndexOfChild);
                }
            }
            if (eVar.O && eVar.I != null) {
                float f2 = eVar.Q;
                if (f2 > 0.0f) {
                    eVar.J.setAlpha(f2);
                }
                eVar.Q = 0.0f;
                eVar.O = false;
                g gVarA = a(eVar, eVar.q(), true, eVar.r());
                if (gVarA != null) {
                    a(eVar.J, gVarA);
                    Animation animation = gVarA.f575a;
                    if (animation != null) {
                        eVar.J.startAnimation(animation);
                    } else {
                        gVarA.f576b.setTarget(eVar.J);
                        gVarA.f576b.start();
                    }
                }
            }
        }
        if (eVar.P) {
            b(eVar);
        }
    }

    void h(android.support.v4.app.e eVar, boolean z) {
        android.support.v4.app.e eVar2 = this.p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarO = eVar2.o();
            if (jVarO instanceof k) {
                ((k) jVarO).h(eVar, true);
            }
        }
        for (j jVar : this.l) {
            if (!z || jVar.f581b) {
                jVar.f580a.g(this, eVar);
            }
        }
    }

    public void i() {
        d(3);
    }

    void i(android.support.v4.app.e eVar) {
        a(eVar, this.m, 0, 0, false);
    }

    public void j() {
        this.s = false;
        this.t = false;
        d(4);
    }

    public void j(android.support.v4.app.e eVar) {
        if (eVar.L) {
            if (this.f561c) {
                this.w = true;
            } else {
                eVar.L = false;
                a(eVar, this.m, 0, 0, false);
            }
        }
    }

    public void k() {
        this.s = false;
        this.t = false;
        d(3);
    }

    public void k(android.support.v4.app.e eVar) {
        if (F) {
            Log.v("FragmentManager", "remove: " + eVar + " nesting=" + eVar.r);
        }
        boolean z = !eVar.C();
        if (!eVar.C || z) {
            synchronized (this.e) {
                this.e.remove(eVar);
            }
            if (eVar.F && eVar.G) {
                this.r = true;
            }
            eVar.l = false;
            eVar.m = true;
        }
    }

    Bundle l(android.support.v4.app.e eVar) {
        if (this.A == null) {
            this.A = new Bundle();
        }
        eVar.j(this.A);
        d(eVar, this.A, false);
        Bundle bundle = null;
        if (!this.A.isEmpty()) {
            Bundle bundle2 = this.A;
            this.A = null;
            bundle = bundle2;
        }
        if (eVar.J != null) {
            m(eVar);
        }
        if (eVar.d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", eVar.d);
        }
        if (!eVar.M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", eVar.M);
        }
        return bundle;
    }

    public void l() {
        this.t = true;
        d(2);
    }

    void m() {
        if (this.w) {
            this.w = false;
            w();
        }
    }

    void m(android.support.v4.app.e eVar) {
        if (eVar.K == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.B;
        if (sparseArray == null) {
            this.B = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        eVar.K.saveHierarchyState(this.B);
        if (this.B.size() > 0) {
            eVar.d = this.B;
            this.B = null;
        }
    }

    public void n(android.support.v4.app.e eVar) {
        if (eVar == null || (this.f.get(eVar.f) == eVar && (eVar.t == null || eVar.o() == this))) {
            this.q = eVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + eVar + " is not an active fragment of FragmentManager " + this);
    }

    public boolean n() {
        c(true);
        boolean z = false;
        while (b(this.x, this.y)) {
            this.f561c = true;
            try {
                c(this.x, this.y);
                z();
                z = true;
            } catch (Throwable th) {
                z();
                throw th;
            }
        }
        m();
        x();
        return z;
    }

    LayoutInflater.Factory2 o() {
        return this;
    }

    public void o(android.support.v4.app.e eVar) {
        if (F) {
            Log.v("FragmentManager", "show: " + eVar);
        }
        if (eVar.B) {
            eVar.B = false;
            eVar.P = !eVar.P;
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0028k.f582a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (!android.support.v4.app.e.a(this.n.c(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        android.support.v4.app.e eVarA = resourceId != -1 ? a(resourceId) : null;
        if (eVarA == null && string != null) {
            eVarA = a(string);
        }
        if (eVarA == null && id != -1) {
            eVarA = a(id);
        }
        if (F) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + eVarA);
        }
        if (eVarA == null) {
            eVarA = this.o.a(context, str2, null);
            eVarA.n = true;
            eVarA.y = resourceId != 0 ? resourceId : id;
            eVarA.z = id;
            eVarA.A = string;
            eVarA.o = true;
            eVarA.s = this;
            android.support.v4.app.i iVar = this.n;
            eVarA.t = iVar;
            eVarA.a(iVar.c(), attributeSet, eVarA.f545c);
            a(eVarA, true);
        } else {
            if (eVarA.o) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            eVarA.o = true;
            android.support.v4.app.i iVar2 = this.n;
            eVarA.t = iVar2;
            if (!eVarA.E) {
                eVarA.a(iVar2.c(), attributeSet, eVarA.f545c);
            }
        }
        android.support.v4.app.e eVar = eVarA;
        if (this.m >= 1 || !eVar.n) {
            i(eVar);
        } else {
            a(eVar, 1, 0, 0, false);
        }
        View view2 = eVar.J;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (eVar.J.getTag() == null) {
                eVar.J.setTag(string);
            }
            return eVar.J;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public android.support.v4.app.e p() {
        return this.q;
    }

    public void q() {
        this.D = null;
        this.s = false;
        this.t = false;
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.app.e eVar = this.e.get(i2);
            if (eVar != null) {
                eVar.F();
            }
        }
    }

    void r() {
        if (this.k != null) {
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                this.k.get(i2).a();
            }
        }
    }

    android.support.v4.app.l s() {
        a(this.D);
        return this.D;
    }

    Parcelable t() {
        int[] iArr;
        int size;
        B();
        A();
        n();
        this.s = true;
        android.support.v4.app.d[] dVarArr = null;
        this.D = null;
        SparseArray<android.support.v4.app.e> sparseArray = this.f;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.f.size();
        n[] nVarArr = new n[size2];
        boolean z = false;
        for (int i2 = 0; i2 < size2; i2++) {
            android.support.v4.app.e eVarValueAt = this.f.valueAt(i2);
            if (eVarValueAt != null) {
                if (eVarValueAt.f < 0) {
                    a(new IllegalStateException("Failure saving state: active " + eVarValueAt + " has cleared index: " + eVarValueAt.f));
                    throw null;
                }
                n nVar = new n(eVarValueAt);
                nVarArr[i2] = nVar;
                if (eVarValueAt.f544b <= 0 || nVar.l != null) {
                    nVar.l = eVarValueAt.f545c;
                } else {
                    Bundle bundleL = l(eVarValueAt);
                    nVar.l = bundleL;
                    android.support.v4.app.e eVar = eVarValueAt.i;
                    if (eVar != null) {
                        if (eVar.f < 0) {
                            a(new IllegalStateException("Failure saving state: " + eVarValueAt + " has target not in fragment manager: " + eVarValueAt.i));
                            throw null;
                        }
                        if (bundleL == null) {
                            nVar.l = new Bundle();
                        }
                        a(nVar.l, "android:target_state", eVarValueAt.i);
                        int i3 = eVarValueAt.k;
                        if (i3 != 0) {
                            nVar.l.putInt("android:target_req_state", i3);
                        }
                    }
                }
                if (F) {
                    Log.v("FragmentManager", "Saved state of " + eVarValueAt + ": " + nVar.l);
                }
                z = true;
            }
        }
        if (!z) {
            if (F) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.e.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i4 = 0; i4 < size3; i4++) {
                iArr[i4] = this.e.get(i4).f;
                if (iArr[i4] < 0) {
                    a(new IllegalStateException("Failure saving state: active " + this.e.get(i4) + " has cleared index: " + iArr[i4]));
                    throw null;
                }
                if (F) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i4 + ": " + this.e.get(i4));
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<android.support.v4.app.c> arrayList = this.g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            dVarArr = new android.support.v4.app.d[size];
            for (int i5 = 0; i5 < size; i5++) {
                dVarArr[i5] = new android.support.v4.app.d(this.g.get(i5));
                if (F) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.g.get(i5));
                }
            }
        }
        android.support.v4.app.m mVar = new android.support.v4.app.m();
        mVar.f589b = nVarArr;
        mVar.f590c = iArr;
        mVar.d = dVarArr;
        android.support.v4.app.e eVar2 = this.q;
        if (eVar2 != null) {
            mVar.e = eVar2.f;
        }
        mVar.f = this.d;
        u();
        return mVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        android.support.v4.app.e eVar = this.p;
        if (eVar != null) {
            b.b.c.f.d.a(eVar, sb);
        } else {
            b.b.c.f.d.a(this.n, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    void u() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        android.support.v4.app.l lVar;
        if (this.f != null) {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                android.support.v4.app.e eVarValueAt = this.f.valueAt(i2);
                if (eVarValueAt != null) {
                    if (eVarValueAt.D) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(eVarValueAt);
                        android.support.v4.app.e eVar = eVarValueAt.i;
                        eVarValueAt.j = eVar != null ? eVar.f : -1;
                        if (F) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + eVarValueAt);
                        }
                    }
                    k kVar = eVarValueAt.u;
                    if (kVar != null) {
                        kVar.u();
                        lVar = eVarValueAt.u.D;
                    } else {
                        lVar = eVarValueAt.v;
                    }
                    if (arrayList2 == null && lVar != null) {
                        arrayList2 = new ArrayList(this.f.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(lVar);
                    }
                    if (arrayList3 == null && eVarValueAt.w != null) {
                        arrayList3 = new ArrayList(this.f.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList3.add(null);
                        }
                    }
                    if (arrayList3 != null) {
                        arrayList3.add(eVarValueAt.w);
                    }
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
        }
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            this.D = null;
        } else {
            this.D = new android.support.v4.app.l(arrayList, arrayList2, arrayList3);
        }
    }

    void v() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = (this.C == null || this.C.isEmpty()) ? false : true;
            if (this.f560b != null && this.f560b.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.n.e().removeCallbacks(this.E);
                this.n.e().post(this.E);
            }
        }
    }

    void w() {
        if (this.f == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            android.support.v4.app.e eVarValueAt = this.f.valueAt(i2);
            if (eVarValueAt != null) {
                j(eVarValueAt);
            }
        }
    }
}
