package android.support.constraint.n.k;

import android.support.constraint.n.k.m.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f486c;
    public final e d;
    public final b e;
    public d f;
    android.support.constraint.n.i i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<d> f484a = null;
    public int g = 0;
    int h = -1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f487a;

        static {
            int[] iArr = new int[b.values().length];
            f487a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f487a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f487a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f487a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f487a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f487a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f487a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f487a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f487a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.d = eVar;
        this.e = bVar;
    }

    public HashSet<d> a() {
        return this.f484a;
    }

    public void a(int i) {
        this.f485b = i;
        this.f486c = true;
    }

    public void a(int i, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f484a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                android.support.constraint.n.k.m.i.a(it.next().d, i, arrayList, oVar);
            }
        }
    }

    public void a(android.support.constraint.n.c cVar) {
        android.support.constraint.n.i iVar = this.i;
        if (iVar == null) {
            this.i = new android.support.constraint.n.i(android.support.constraint.n.i.a.UNRESTRICTED, null);
        } else {
            iVar.a();
        }
    }

    public boolean a(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarH = dVar.h();
        b bVar = this.e;
        if (bVarH == bVar) {
            return bVar != b.BASELINE || (dVar.e().F() && e().F());
        }
        switch (a.f487a[bVar.ordinal()]) {
            case 1:
                return (bVarH == b.BASELINE || bVarH == b.CENTER_X || bVarH == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = bVarH == b.LEFT || bVarH == b.RIGHT;
                if (dVar.e() instanceof g) {
                    return z || bVarH == b.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = bVarH == b.TOP || bVarH == b.BOTTOM;
                if (dVar.e() instanceof g) {
                    return z2 || bVarH == b.CENTER_Y;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public boolean a(d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            m();
            return true;
        }
        if (!z && !a(dVar)) {
            return false;
        }
        this.f = dVar;
        if (dVar.f484a == null) {
            dVar.f484a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f.f484a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.g = i;
        } else {
            this.g = 0;
        }
        this.h = i2;
        return true;
    }

    public int b() {
        if (this.f486c) {
            return this.f485b;
        }
        return 0;
    }

    public int c() {
        d dVar;
        if (this.d.B() == 8) {
            return 0;
        }
        return (this.h <= -1 || (dVar = this.f) == null || dVar.d.B() != 8) ? this.g : this.h;
    }

    public final d d() {
        switch (a.f487a[this.e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.d.H;
            case 3:
                return this.d.F;
            case 4:
                return this.d.I;
            case 5:
                return this.d.G;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public e e() {
        return this.d;
    }

    public android.support.constraint.n.i f() {
        return this.i;
    }

    public d g() {
        return this.f;
    }

    public b h() {
        return this.e;
    }

    public boolean i() {
        HashSet<d> hashSet = this.f484a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().d().l()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        HashSet<d> hashSet = this.f484a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean k() {
        return this.f486c;
    }

    public boolean l() {
        return this.f != null;
    }

    public void m() {
        HashSet<d> hashSet;
        d dVar = this.f;
        if (dVar != null && (hashSet = dVar.f484a) != null) {
            hashSet.remove(this);
            if (this.f.f484a.size() == 0) {
                this.f.f484a = null;
            }
        }
        this.f484a = null;
        this.f = null;
        this.g = 0;
        this.h = -1;
        this.f486c = false;
        this.f485b = 0;
    }

    public void n() {
        this.f486c = false;
        this.f485b = 0;
    }

    public String toString() {
        return this.d.h() + ":" + this.e.toString();
    }
}
