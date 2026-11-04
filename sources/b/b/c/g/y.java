package b.b.c.g;

import android.os.Build;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1135a;

    private y(Object obj) {
        this.f1135a = obj;
    }

    static y a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new y(obj);
    }

    static Object a(y yVar) {
        if (yVar == null) {
            return null;
        }
        return yVar.f1135a;
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1135a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public y a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new y(((WindowInsets) this.f1135a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1135a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1135a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1135a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        Object obj2 = this.f1135a;
        if (obj2 == null) {
            return yVar.f1135a == null;
        }
        return obj2.equals(yVar.f1135a);
    }

    public int hashCode() {
        Object obj = this.f1135a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
