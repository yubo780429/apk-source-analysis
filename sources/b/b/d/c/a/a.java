package b.b.d.c.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import b.b.b.a.i;
import b.b.c.f.l;
import b.b.d.a.j;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class a extends b.b.d.c.a.d {
    private c p;
    private g q;
    private int r;
    private int s;
    private boolean t;

    private static class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Animatable f1143a;

        b(Animatable animatable) {
            super();
            this.f1143a = animatable;
        }

        @Override // b.b.d.c.a.a.g
        public void c() {
            this.f1143a.start();
        }

        @Override // b.b.d.c.a.a.g
        public void d() {
            this.f1143a.stop();
        }
    }

    static class c extends b.b.d.c.a.d.a {
        b.b.c.f.f<Long> K;
        l<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            l<Integer> lVar;
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                lVar = cVar.L;
            } else {
                this.K = new b.b.c.f.f<>();
                lVar = new l<>();
            }
            this.L = lVar;
        }

        private static long f(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        int a(int i, int i2, Drawable drawable, boolean z) {
            int iA = super.a(drawable);
            long jF = f(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = iA;
            this.K.a(jF, Long.valueOf(j2 | j));
            if (z) {
                this.K.a(f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return iA;
        }

        int a(int[] iArr, Drawable drawable, int i) {
            int iA = super.a(iArr, drawable);
            this.L.c(iA, Integer.valueOf(i));
            return iA;
        }

        int b(int[] iArr) {
            int iA = super.a(iArr);
            return iA >= 0 ? iA : super.a(StateSet.WILD_CARD);
        }

        int c(int i, int i2) {
            return (int) this.K.b(f(i, i2), -1L).longValue();
        }

        int d(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.b(i, 0).intValue();
        }

        boolean d(int i, int i2) {
            return (this.K.b(f(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        boolean e(int i, int i2) {
            return (this.K.b(f(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // b.b.d.c.a.d.a, b.b.d.c.a.b.c
        void m() {
            this.K = this.K.m1clone();
            this.L = this.L.m2clone();
        }

        @Override // b.b.d.c.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // b.b.d.c.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    private static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b.b.b.a.c f1144a;

        d(b.b.b.a.c cVar) {
            super();
            this.f1144a = cVar;
        }

        @Override // b.b.d.c.a.a.g
        public void c() {
            this.f1144a.start();
        }

        @Override // b.b.d.c.a.a.g
        public void d() {
            this.f1144a.stop();
        }
    }

    private static class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f1145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f1146b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                objectAnimatorOfInt.setAutoCancel(true);
            }
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f1146b = z2;
            this.f1145a = objectAnimatorOfInt;
        }

        @Override // b.b.d.c.a.a.g
        public boolean a() {
            return this.f1146b;
        }

        @Override // b.b.d.c.a.a.g
        public void b() {
            this.f1145a.reverse();
        }

        @Override // b.b.d.c.a.a.g
        public void c() {
            this.f1145a.start();
        }

        @Override // b.b.d.c.a.a.g
        public void d() {
            this.f1145a.cancel();
        }
    }

    private static class f implements TimeInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f1147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1149c;

        f(AnimationDrawable animationDrawable, boolean z) {
            a(animationDrawable, z);
        }

        int a() {
            return this.f1149c;
        }

        int a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f1148b = numberOfFrames;
            int[] iArr = this.f1147a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f1147a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f1147a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f1149c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f1149c) + 0.5f);
            int i2 = this.f1148b;
            int[] iArr = this.f1147a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f1149c : 0.0f);
        }
    }

    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    a(c cVar, Resources resources) {
        super(null);
        this.r = -1;
        this.s = -1;
        a(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    private void a(TypedArray typedArray) {
        c cVar = this.p;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.d |= typedArray.getChangingConfigurations();
        }
        cVar.b(typedArray.getBoolean(j.AnimatedStateListDrawableCompat_android_variablePadding, cVar.i));
        cVar.a(typedArray.getBoolean(j.AnimatedStateListDrawableCompat_android_constantSize, cVar.l));
        cVar.b(typedArray.getInt(j.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.A));
        cVar.c(typedArray.getInt(j.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.B));
        setDither(typedArray.getBoolean(j.AnimatedStateListDrawableCompat_android_dither, cVar.x));
    }

    public static a b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.a(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private boolean b(int i) {
        int iB;
        int iC;
        g bVar;
        g gVar = this.q;
        if (gVar == null) {
            iB = b();
        } else {
            if (i == this.r) {
                return true;
            }
            if (i == this.s && gVar.a()) {
                gVar.b();
                this.r = this.s;
                this.s = i;
                return true;
            }
            iB = this.r;
            gVar.d();
        }
        this.q = null;
        this.s = -1;
        this.r = -1;
        c cVar = this.p;
        int iD = cVar.d(iB);
        int iD2 = cVar.d(i);
        if (iD2 == 0 || iD == 0 || (iC = cVar.c(iD, iD2)) < 0) {
            return false;
        }
        boolean zE = cVar.e(iD, iD2);
        a(iC);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.d(iD, iD2), zE);
        } else {
            if (!(current instanceof b.b.b.a.c)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((b.b.b.a.c) current);
        }
        bVar.c();
        this.q = bVar;
        this.s = iB;
        this.r = i;
        return true;
    }

    private void c() {
        onStateChange(getState());
    }

    private void c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    d(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    e(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private int d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayA = b.b.c.a.d.g.a(resources, theme, attributeSet, j.AnimatedStateListDrawableItem);
        int resourceId = typedArrayA.getResourceId(j.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = typedArrayA.getResourceId(j.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable drawableC = resourceId2 > 0 ? b.b.d.b.a.a.c(context, resourceId2) : null;
        typedArrayA.recycle();
        int[] iArrA = a(attributeSet);
        if (drawableC == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            if (xmlPullParser.getName().equals("vector")) {
                drawableC = i.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawableC = Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawableC != null) {
            return this.p.a(iArrA, drawableC, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayA = b.b.c.a.d.g.a(resources, theme, attributeSet, j.AnimatedStateListDrawableTransition);
        int resourceId = typedArrayA.getResourceId(j.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = typedArrayA.getResourceId(j.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = typedArrayA.getResourceId(j.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable drawableC = resourceId3 > 0 ? b.b.d.b.a.a.c(context, resourceId3) : null;
        boolean z = typedArrayA.getBoolean(j.AnimatedStateListDrawableTransition_android_reversible, false);
        typedArrayA.recycle();
        if (drawableC == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            if (xmlPullParser.getName().equals("animated-vector")) {
                drawableC = b.b.b.a.c.a(context, resources, xmlPullParser, attributeSet, theme);
            } else {
                drawableC = Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawableC == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.p.a(resourceId, resourceId2, drawableC, z);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b.b.d.c.a.d, b.b.d.c.a.b
    public c a() {
        return new c(this.p, this, null);
    }

    public void a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayA = b.b.c.a.d.g.a(resources, theme, attributeSet, j.AnimatedStateListDrawableCompat);
        setVisible(typedArrayA.getBoolean(j.AnimatedStateListDrawableCompat_android_visible, true), true);
        a(typedArrayA);
        a(resources);
        typedArrayA.recycle();
        c(context, resources, xmlPullParser, attributeSet, theme);
        c();
    }

    @Override // b.b.d.c.a.d, b.b.d.c.a.b
    protected void a(b.b.d.c.a.b.c cVar) {
        super.a(cVar);
        if (cVar instanceof c) {
            this.p = (c) cVar;
        }
    }

    @Override // b.b.d.c.a.d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // b.b.d.c.a.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.q;
        if (gVar != null) {
            gVar.d();
            this.q = null;
            a(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    @Override // b.b.d.c.a.d, b.b.d.c.a.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.p.m();
                this.t = true;
            }
        }
        return this;
    }

    @Override // b.b.d.c.a.d, b.b.d.c.a.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iB = this.p.b(iArr);
        boolean z = iB != b() && (b(iB) || a(iB));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // b.b.d.c.a.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.q != null && (visible || z2)) {
            if (z) {
                this.q.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
