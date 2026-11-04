package android.support.v7.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
class q extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f905b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f906a;

    static {
        f905b = Build.VERSION.SDK_INT < 21;
    }

    public q(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        t0 t0VarA = t0.a(context, attributeSet, b.b.d.a.j.PopupWindow, i, i2);
        if (t0VarA.g(b.b.d.a.j.PopupWindow_overlapAnchor)) {
            a(t0VarA.a(b.b.d.a.j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(t0VarA.b(b.b.d.a.j.PopupWindow_android_popupBackground));
        t0VarA.a();
    }

    private void a(boolean z) {
        if (f905b) {
            this.f906a = z;
        } else {
            android.support.v4.widget.j.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f905b && this.f906a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f905b && this.f906a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f905b && this.f906a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
