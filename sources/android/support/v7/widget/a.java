package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C0032a f829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Context f830c;
    protected ActionMenuView d;
    protected c e;
    protected int f;
    protected b.b.c.g.u g;
    private boolean h;
    private boolean i;

    /* JADX INFO: renamed from: android.support.v7.widget.a$a, reason: collision with other inner class name */
    protected class C0032a implements b.b.c.g.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f831a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f832b;

        protected C0032a() {
        }

        public C0032a a(b.b.c.g.u uVar, int i) {
            a.this.g = uVar;
            this.f832b = i;
            return this;
        }

        @Override // b.b.c.g.v
        public void a(View view) {
            if (this.f831a) {
                return;
            }
            a aVar = a.this;
            aVar.g = null;
            a.super.setVisibility(this.f832b);
        }

        @Override // b.b.c.g.v
        public void b(View view) {
            a.super.setVisibility(0);
            this.f831a = false;
        }

        @Override // b.b.c.g.v
        public void c(View view) {
            this.f831a = true;
        }
    }

    a(Context context) {
        this(context, null);
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f829b = new C0032a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(b.b.d.a.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f830c = context;
        } else {
            this.f830c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    protected int a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    protected int a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public b.b.c.g.u a(int i, long j) {
        b.b.c.g.u uVar = this.g;
        if (uVar != null) {
            uVar.a();
        }
        if (i != 0) {
            b.b.c.g.u uVarA = b.b.c.g.q.a(this);
            uVarA.a(0.0f);
            uVarA.a(j);
            C0032a c0032a = this.f829b;
            c0032a.a(uVarA, i);
            uVarA.a(c0032a);
            return uVarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        b.b.c.g.u uVarA2 = b.b.c.g.q.a(this);
        uVarA2.a(1.0f);
        uVarA2.a(j);
        C0032a c0032a2 = this.f829b;
        c0032a2.a(uVarA2, i);
        uVarA2.a(c0032a2);
        return uVarA2;
    }

    public int getAnimatedVisibility() {
        return this.g != null ? this.f829b.f832b : getVisibility();
    }

    public int getContentHeight() {
        return this.f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, b.b.d.a.j.ActionBar, b.b.d.a.a.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(b.b.d.a.j.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.e;
        if (cVar != null) {
            cVar.a(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            b.b.c.g.u uVar = this.g;
            if (uVar != null) {
                uVar.a();
            }
            super.setVisibility(i);
        }
    }
}
