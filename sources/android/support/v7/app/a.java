package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: android.support.v7.app.a$a, reason: collision with other inner class name */
    public static class C0030a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f689a;

        public C0030a(int i, int i2) {
            super(i, i2);
            this.f689a = 0;
            this.f689a = 8388627;
        }

        public C0030a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f689a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.d.a.j.ActionBarLayout);
            this.f689a = typedArrayObtainStyledAttributes.getInt(b.b.d.a.j.ActionBarLayout_android_layout_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0030a(C0030a c0030a) {
            super((ViewGroup.MarginLayoutParams) c0030a);
            this.f689a = 0;
            this.f689a = c0030a.f689a;
        }

        public C0030a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f689a = 0;
        }
    }

    public interface b {
        void a(boolean z);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public abstract b.b.d.d.b a(b.b.d.d.b.a aVar);

    public abstract void a(Configuration configuration);

    public abstract void a(CharSequence charSequence);

    public abstract boolean a(int i, KeyEvent keyEvent);

    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    public abstract void b(boolean z);

    public abstract void c(boolean z);

    public abstract void d(boolean z);

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public abstract int g();

    public abstract Context h();

    public boolean i() {
        return false;
    }

    void j() {
    }

    public boolean k() {
        return false;
    }
}
