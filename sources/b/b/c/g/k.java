package b.b.c.g;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewParent f1115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f1116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f1117c;
    private boolean d;
    private int[] e;

    public k(View view) {
        this.f1117c = view;
    }

    private void a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f1115a = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.f1116b = viewParent;
        }
    }

    private ViewParent c(int i) {
        if (i == 0) {
            return this.f1115a;
        }
        if (i != 1) {
            return null;
        }
        return this.f1116b;
    }

    public void a(boolean z) {
        if (this.d) {
            q.n(this.f1117c);
        }
        this.d = z;
    }

    public boolean a() {
        return this.d;
    }

    public boolean a(float f, float f2) {
        ViewParent viewParentC;
        if (!a() || (viewParentC = c(0)) == null) {
            return false;
        }
        return t.a(viewParentC, this.f1117c, f, f2);
    }

    public boolean a(float f, float f2, boolean z) {
        ViewParent viewParentC;
        if (!a() || (viewParentC = c(0)) == null) {
            return false;
        }
        return t.a(viewParentC, this.f1117c, f, f2, z);
    }

    public boolean a(int i) {
        return c(i) != null;
    }

    public boolean a(int i, int i2) {
        if (a(i2)) {
            return true;
        }
        if (!a()) {
            return false;
        }
        View view = this.f1117c;
        for (ViewParent parent = this.f1117c.getParent(); parent != null; parent = parent.getParent()) {
            if (t.b(parent, view, this.f1117c, i, i2)) {
                a(i2, parent);
                t.a(parent, view, this.f1117c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        ViewParent viewParentC;
        int i6;
        int i7;
        if (!a() || (viewParentC = c(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1117c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        t.a(viewParentC, this.f1117c, i, i2, i3, i4, i5);
        if (iArr != null) {
            this.f1117c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentC;
        int i4;
        int i5;
        if (!a() || (viewParentC = c(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f1117c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr = this.e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        t.a(viewParentC, this.f1117c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f1117c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void b(int i) {
        ViewParent viewParentC = c(i);
        if (viewParentC != null) {
            t.a(viewParentC, this.f1117c, i);
            a(i, (ViewParent) null);
        }
    }
}
