package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f780c;
    private final int d;
    private final int e;
    private View f;
    private int g;
    private boolean h;
    private o.a i;
    private m j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            n.this.d();
        }
    }

    public n(Context context, h hVar, View view, boolean z, int i) {
        this(context, hVar, view, z, i, 0);
    }

    public n(Context context, h hVar, View view, boolean z, int i, int i2) {
        this.g = 8388611;
        this.l = new a();
        this.f778a = context;
        this.f779b = hVar;
        this.f = view;
        this.f780c = z;
        this.d = i;
        this.e = i2;
    }

    private void a(int i, int i2, boolean z, boolean z2) {
        m mVarB = b();
        mVarB.c(z2);
        if (z) {
            if ((b.b.c.g.d.a(this.g, b.b.c.g.q.d(this.f)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            mVarB.b(i);
            mVarB.c(i2);
            int i3 = (int) ((this.f778a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            mVarB.a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        mVarB.c();
    }

    private m g() {
        Display defaultDisplay = ((WindowManager) this.f778a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        m eVar = Math.min(point.x, point.y) >= this.f778a.getResources().getDimensionPixelSize(b.b.d.a.d.abc_cascading_menus_min_smallest_width) ? new e(this.f778a, this.f, this.d, this.e, this.f780c) : new t(this.f778a, this.f779b, this.f, this.d, this.e, this.f780c);
        eVar.a(this.f779b);
        eVar.a(this.l);
        eVar.a(this.f);
        eVar.a(this.i);
        eVar.b(this.h);
        eVar.a(this.g);
        return eVar;
    }

    public void a() {
        if (c()) {
            this.j.dismiss();
        }
    }

    public void a(int i) {
        this.g = i;
    }

    public void a(o.a aVar) {
        this.i = aVar;
        m mVar = this.j;
        if (mVar != null) {
            mVar.a(aVar);
        }
    }

    public void a(View view) {
        this.f = view;
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void a(boolean z) {
        this.h = z;
        m mVar = this.j;
        if (mVar != null) {
            mVar.b(z);
        }
    }

    public boolean a(int i, int i2) {
        if (c()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        a(i, i2, true, true);
        return true;
    }

    public m b() {
        if (this.j == null) {
            this.j = g();
        }
        return this.j;
    }

    public boolean c() {
        m mVar = this.j;
        return mVar != null && mVar.a();
    }

    protected void d() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void e() {
        if (!f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean f() {
        if (c()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }
}
