package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f593a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r f594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r f595c;

    static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f596b;

        a(ArrayList arrayList) {
            this.f596b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.a((ArrayList<View>) this.f596b, 4);
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f598c;
        final /* synthetic */ View d;
        final /* synthetic */ android.support.v4.app.e e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ ArrayList g;
        final /* synthetic */ ArrayList h;
        final /* synthetic */ Object i;

        b(Object obj, r rVar, View view, android.support.v4.app.e eVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f597b = obj;
            this.f598c = rVar;
            this.d = view;
            this.e = eVar;
            this.f = arrayList;
            this.g = arrayList2;
            this.h = arrayList3;
            this.i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f597b;
            if (obj != null) {
                this.f598c.b(obj, this.d);
                this.g.addAll(p.a(this.f598c, this.f597b, this.e, (ArrayList<View>) this.f, this.d));
            }
            if (this.h != null) {
                if (this.i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.d);
                    this.f598c.a(this.i, this.h, arrayList);
                }
                this.h.clear();
                this.h.add(this.d);
            }
        }
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f600c;
        final /* synthetic */ boolean d;
        final /* synthetic */ b.b.c.f.a e;
        final /* synthetic */ View f;
        final /* synthetic */ r g;
        final /* synthetic */ Rect h;

        c(android.support.v4.app.e eVar, android.support.v4.app.e eVar2, boolean z, b.b.c.f.a aVar, View view, r rVar, Rect rect) {
            this.f599b = eVar;
            this.f600c = eVar2;
            this.d = z;
            this.e = aVar;
            this.f = view;
            this.g = rVar;
            this.h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.a(this.f599b, this.f600c, this.d, (b.b.c.f.a<String, View>) this.e, false);
            View view = this.f;
            if (view != null) {
                this.g.a(view, this.h);
            }
        }
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b.b.c.f.a f602c;
        final /* synthetic */ Object d;
        final /* synthetic */ e e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ View g;
        final /* synthetic */ android.support.v4.app.e h;
        final /* synthetic */ android.support.v4.app.e i;
        final /* synthetic */ boolean j;
        final /* synthetic */ ArrayList k;
        final /* synthetic */ Object l;
        final /* synthetic */ Rect m;

        d(r rVar, b.b.c.f.a aVar, Object obj, e eVar, ArrayList arrayList, View view, android.support.v4.app.e eVar2, android.support.v4.app.e eVar3, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f601b = rVar;
            this.f602c = aVar;
            this.d = obj;
            this.e = eVar;
            this.f = arrayList;
            this.g = view;
            this.h = eVar2;
            this.i = eVar3;
            this.j = z;
            this.k = arrayList2;
            this.l = obj2;
            this.m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.b.c.f.a<String, View> aVarA = p.a(this.f601b, (b.b.c.f.a<String, String>) this.f602c, this.d, this.e);
            if (aVarA != null) {
                this.f.addAll(aVarA.values());
                this.f.add(this.g);
            }
            p.a(this.h, this.i, this.j, aVarA, false);
            Object obj = this.d;
            if (obj != null) {
                this.f601b.b(obj, this.k, this.f);
                View viewA = p.a(aVarA, this.e, this.l, this.j);
                if (viewA != null) {
                    this.f601b.a(viewA, this.m);
                }
            }
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.support.v4.app.e f603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public android.support.v4.app.c f605c;
        public android.support.v4.app.e d;
        public boolean e;
        public android.support.v4.app.c f;

        e() {
        }
    }

    static {
        f594b = Build.VERSION.SDK_INT >= 21 ? new q() : null;
        f595c = a();
    }

    private static e a(e eVar, SparseArray<e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i, eVar2);
        return eVar2;
    }

    private static r a() {
        try {
            return (r) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static r a(android.support.v4.app.e eVar, android.support.v4.app.e eVar2) {
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            Object objM = eVar.m();
            if (objM != null) {
                arrayList.add(objM);
            }
            Object objU = eVar.u();
            if (objU != null) {
                arrayList.add(objU);
            }
            Object objW = eVar.w();
            if (objW != null) {
                arrayList.add(objW);
            }
        }
        if (eVar2 != null) {
            Object objK = eVar2.k();
            if (objK != null) {
                arrayList.add(objK);
            }
            Object objS = eVar2.s();
            if (objS != null) {
                arrayList.add(objS);
            }
            Object objV = eVar2.v();
            if (objV != null) {
                arrayList.add(objV);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        r rVar = f594b;
        if (rVar != null && a(rVar, arrayList)) {
            return f594b;
        }
        r rVar2 = f595c;
        if (rVar2 != null && a(rVar2, arrayList)) {
            return f595c;
        }
        if (f594b == null && f595c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static View a(b.b.c.f.a<String, View> aVar, e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        android.support.v4.app.c cVar = eVar.f605c;
        if (obj == null || aVar == null || (arrayList = cVar.q) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? cVar.q : cVar.r).get(0));
    }

    private static b.b.c.f.a<String, String> a(int i, ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        b.b.c.f.a<String, String> aVar = new b.b.c.f.a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            android.support.v4.app.c cVar = arrayList.get(i4);
            if (cVar.b(i)) {
                boolean zBooleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = cVar.q;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = cVar.q;
                        arrayList4 = cVar.r;
                    } else {
                        ArrayList<String> arrayList6 = cVar.q;
                        arrayList3 = cVar.r;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String strRemove = aVar.remove(str2);
                        if (strRemove != null) {
                            aVar.put(str, strRemove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    static b.b.c.f.a<String, View> a(r rVar, b.b.c.f.a<String, String> aVar, Object obj, e eVar) {
        v vVarL;
        ArrayList<String> arrayList;
        String strA;
        android.support.v4.app.e eVar2 = eVar.f603a;
        View viewY = eVar2.y();
        if (aVar.isEmpty() || obj == null || viewY == null) {
            aVar.clear();
            return null;
        }
        b.b.c.f.a<String, View> aVar2 = new b.b.c.f.a<>();
        rVar.a((Map<String, View>) aVar2, viewY);
        android.support.v4.app.c cVar = eVar.f605c;
        if (eVar.f604b) {
            vVarL = eVar2.n();
            arrayList = cVar.q;
        } else {
            vVarL = eVar2.l();
            arrayList = cVar.r;
        }
        if (arrayList != null) {
            aVar2.a((Collection<?>) arrayList);
            aVar2.a((Collection<?>) aVar.values());
        }
        if (vVarL != null) {
            vVarL.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String strA2 = a(aVar, str);
                    if (strA2 != null) {
                        aVar.remove(strA2);
                    }
                } else if (!str.equals(b.b.c.g.q.f(view)) && (strA = a(aVar, str)) != null) {
                    aVar.put(strA, b.b.c.g.q.f(view));
                }
            }
        } else {
            a(aVar, aVar2);
        }
        return aVar2;
    }

    private static Object a(r rVar, android.support.v4.app.e eVar, android.support.v4.app.e eVar2, boolean z) {
        if (eVar == null || eVar2 == null) {
            return null;
        }
        return rVar.c(rVar.b(z ? eVar2.w() : eVar.v()));
    }

    private static Object a(r rVar, android.support.v4.app.e eVar, boolean z) {
        if (eVar == null) {
            return null;
        }
        return rVar.b(z ? eVar.s() : eVar.k());
    }

    private static Object a(r rVar, ViewGroup viewGroup, View view, b.b.c.f.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        android.support.v4.app.e eVar2 = eVar.f603a;
        android.support.v4.app.e eVar3 = eVar.d;
        if (eVar2 == null || eVar3 == null) {
            return null;
        }
        boolean z = eVar.f604b;
        Object objA = aVar.isEmpty() ? null : a(rVar, eVar2, eVar3, z);
        b.b.c.f.a<String, View> aVarB = b(rVar, aVar, objA, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarB.values());
            obj3 = objA;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        a(eVar2, eVar3, z, aVarB, true);
        if (obj3 != null) {
            rect = new Rect();
            rVar.b(obj3, view, arrayList);
            a(rVar, obj3, obj2, aVarB, eVar.e, eVar.f);
            if (obj != null) {
                rVar.a(obj, rect);
            }
        } else {
            rect = null;
        }
        u.a(viewGroup, new d(rVar, aVar, obj3, eVar, arrayList2, view, eVar2, eVar3, z, arrayList, obj, rect));
        return obj3;
    }

    private static Object a(r rVar, Object obj, Object obj2, Object obj3, android.support.v4.app.e eVar, boolean z) {
        boolean zF;
        if (obj == null || obj2 == null || eVar == null) {
            zF = true;
        } else {
            zF = z ? eVar.f() : eVar.e();
        }
        return zF ? rVar.b(obj2, obj, obj3) : rVar.a(obj2, obj, obj3);
    }

    private static String a(b.b.c.f.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.d(i))) {
                return aVar.b(i);
            }
        }
        return null;
    }

    static ArrayList<View> a(r rVar, Object obj, android.support.v4.app.e eVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View viewY = eVar.y();
        if (viewY != null) {
            rVar.a(arrayList2, viewY);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        rVar.a(obj, arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x005f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0076  */
    /* JADX WARN: Code duplicated, block: B:56:0x0078  */
    /* JADX WARN: Code duplicated, block: B:62:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0087  */
    /* JADX WARN: Code duplicated, block: B:64:0x008a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0092  */
    /* JADX WARN: Code duplicated, block: B:69:0x0094  */
    private static void a(android.support.v4.app.c cVar, android.support.v4.app.c.a aVar, SparseArray<e> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        View view;
        boolean z7;
        android.support.v4.app.e eVar = aVar.f540b;
        if (eVar == null || (i = eVar.z) == 0) {
            return;
        }
        int i2 = z ? f593a[aVar.f539a] : aVar.f539a;
        boolean z8 = false;
        if (i2 == 1) {
            if (z2) {
                z3 = eVar.O;
            } else if (!eVar.l || eVar.B) {
                z3 = false;
            } else {
                z3 = true;
            }
            z4 = false;
            z5 = false;
            z8 = z3;
            z6 = true;
        } else if (i2 == 3) {
            boolean z9 = eVar.l;
            if (z2 ? !z9 || eVar.B : z9 || (view = eVar.J) == null || view.getVisibility() != 0 || eVar.Q < 0.0f) {
                z7 = false;
            } else {
                z7 = true;
            }
            z5 = z7;
            z6 = false;
            z4 = true;
        } else if (i2 == 4) {
            if (!z2 ? !(!eVar.l || eVar.B) : eVar.P && eVar.l && eVar.B) {
                z7 = false;
            } else {
                z7 = true;
            }
            z5 = z7;
            z6 = false;
            z4 = true;
        } else if (i2 == 5) {
            if (!z2) {
                z3 = eVar.B;
            } else if (eVar.P && !eVar.B && eVar.l) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = false;
            z5 = false;
            z8 = z3;
            z6 = true;
        } else if (i2 == 6) {
            boolean z10 = eVar.l;
            if (z2) {
                z7 = false;
            } else {
                z7 = false;
            }
            z5 = z7;
            z6 = false;
            z4 = true;
        } else if (i2 != 7) {
            z6 = false;
            z4 = false;
            z5 = false;
        } else {
            if (z2) {
                z3 = eVar.O;
            } else {
                if (eVar.l) {
                }
                z3 = false;
            }
            z4 = false;
            z5 = false;
            z8 = z3;
            z6 = true;
        }
        e eVarA = sparseArray.get(i);
        if (z8) {
            eVarA = a(eVarA, sparseArray, i);
            eVarA.f603a = eVar;
            eVarA.f604b = z;
            eVarA.f605c = cVar;
        }
        e eVarA2 = eVarA;
        if (!z2 && z6) {
            if (eVarA2 != null && eVarA2.d == eVar) {
                eVarA2.d = null;
            }
            k kVar = cVar.f536a;
            if (eVar.f544b < 1 && kVar.m >= 1 && !cVar.s) {
                kVar.f(eVar);
                kVar.a(eVar, 1, 0, 0, false);
            }
        }
        if (z5 && (eVarA2 == null || eVarA2.d == null)) {
            eVarA2 = a(eVarA2, sparseArray, i);
            eVarA2.d = eVar;
            eVarA2.e = z;
            eVarA2.f = cVar;
        }
        if (z2 || !z4 || eVarA2 == null || eVarA2.f603a != eVar) {
            return;
        }
        eVarA2.f603a = null;
    }

    public static void a(android.support.v4.app.c cVar, SparseArray<e> sparseArray, boolean z) {
        int size = cVar.f537b.size();
        for (int i = 0; i < size; i++) {
            a(cVar, cVar.f537b.get(i), sparseArray, false, z);
        }
    }

    static void a(android.support.v4.app.e eVar, android.support.v4.app.e eVar2, boolean z, b.b.c.f.a<String, View> aVar, boolean z2) {
        v vVarL = z ? eVar2.l() : eVar.l();
        if (vVarL != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.b(i));
                arrayList.add(aVar.d(i));
            }
            if (z2) {
                vVarL.b(arrayList2, arrayList, null);
            } else {
                vVarL.a(arrayList2, arrayList, null);
            }
        }
    }

    private static void a(k kVar, int i, e eVar, View view, b.b.c.f.a<String, String> aVar) {
        android.support.v4.app.e eVar2;
        android.support.v4.app.e eVar3;
        r rVarA;
        Object obj;
        ViewGroup viewGroup = kVar.o.a() ? (ViewGroup) kVar.o.a(i) : null;
        if (viewGroup == null || (rVarA = a((eVar3 = eVar.d), (eVar2 = eVar.f603a))) == null) {
            return;
        }
        boolean z = eVar.f604b;
        boolean z2 = eVar.e;
        Object objA = a(rVarA, eVar2, z);
        Object objB = b(rVarA, eVar3, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objA2 = a(rVarA, viewGroup, view, aVar, eVar, (ArrayList<View>) arrayList, arrayList2, objA, objB);
        if (objA == null && objA2 == null) {
            obj = objB;
            if (obj == null) {
                return;
            }
        } else {
            obj = objB;
        }
        ArrayList<View> arrayListA = a(rVarA, obj, eVar3, (ArrayList<View>) arrayList, view);
        Object obj2 = (arrayListA == null || arrayListA.isEmpty()) ? null : obj;
        rVarA.a(objA, view);
        Object objA3 = a(rVarA, objA, obj2, objA2, eVar2, eVar.f604b);
        if (objA3 != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            rVarA.a(objA3, objA, arrayList3, obj2, arrayListA, objA2, arrayList2);
            a(rVarA, viewGroup, eVar2, view, arrayList2, objA, arrayList3, obj2, arrayListA);
            rVarA.a((View) viewGroup, arrayList2, (Map<String, String>) aVar);
            rVarA.a(viewGroup, objA3);
            rVarA.a(viewGroup, arrayList2, (Map<String, String>) aVar);
        }
    }

    static void a(k kVar, ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (kVar.m < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            android.support.v4.app.c cVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                b(cVar, (SparseArray<e>) sparseArray, z);
            } else {
                a(cVar, (SparseArray<e>) sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(kVar.n.c());
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int iKeyAt = sparseArray.keyAt(i4);
                b.b.c.f.a<String, String> aVarA = a(iKeyAt, arrayList, arrayList2, i, i2);
                e eVar = (e) sparseArray.valueAt(i4);
                if (z) {
                    b(kVar, iKeyAt, eVar, view, aVarA);
                } else {
                    a(kVar, iKeyAt, eVar, view, aVarA);
                }
            }
        }
    }

    private static void a(r rVar, ViewGroup viewGroup, android.support.v4.app.e eVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        u.a(viewGroup, new b(obj, rVar, view, eVar, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void a(r rVar, Object obj, android.support.v4.app.e eVar, ArrayList<View> arrayList) {
        if (eVar != null && obj != null && eVar.l && eVar.B && eVar.P) {
            eVar.f(true);
            rVar.a(obj, eVar.y(), arrayList);
            u.a(eVar.I, new a(arrayList));
        }
    }

    private static void a(r rVar, Object obj, Object obj2, b.b.c.f.a<String, View> aVar, boolean z, android.support.v4.app.c cVar) {
        ArrayList<String> arrayList = cVar.q;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z ? cVar.r : cVar.q).get(0));
        rVar.c(obj, view);
        if (obj2 != null) {
            rVar.c(obj2, view);
        }
    }

    private static void a(b.b.c.f.a<String, String> aVar, b.b.c.f.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.d(size))) {
                aVar.c(size);
            }
        }
    }

    static void a(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    private static void a(ArrayList<View> arrayList, b.b.c.f.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewD = aVar.d(size);
            if (collection.contains(b.b.c.g.q.f(viewD))) {
                arrayList.add(viewD);
            }
        }
    }

    private static boolean a(r rVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!rVar.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static b.b.c.f.a<String, View> b(r rVar, b.b.c.f.a<String, String> aVar, Object obj, e eVar) {
        v vVarN;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        android.support.v4.app.e eVar2 = eVar.d;
        b.b.c.f.a<String, View> aVar2 = new b.b.c.f.a<>();
        rVar.a((Map<String, View>) aVar2, eVar2.y());
        android.support.v4.app.c cVar = eVar.f;
        if (eVar.e) {
            vVarN = eVar2.l();
            arrayList = cVar.r;
        } else {
            vVarN = eVar2.n();
            arrayList = cVar.q;
        }
        aVar2.a((Collection<?>) arrayList);
        if (vVarN != null) {
            vVarN.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(b.b.c.g.q.f(view))) {
                    aVar.put(b.b.c.g.q.f(view), aVar.remove(str));
                }
            }
        } else {
            aVar.a((Collection<?>) aVar2.keySet());
        }
        return aVar2;
    }

    private static Object b(r rVar, android.support.v4.app.e eVar, boolean z) {
        if (eVar == null) {
            return null;
        }
        return rVar.b(z ? eVar.u() : eVar.m());
    }

    private static Object b(r rVar, ViewGroup viewGroup, View view, b.b.c.f.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        android.support.v4.app.e eVar2 = eVar.f603a;
        android.support.v4.app.e eVar3 = eVar.d;
        if (eVar2 != null) {
            eVar2.y().setVisibility(0);
        }
        if (eVar2 == null || eVar3 == null) {
            return null;
        }
        boolean z = eVar.f604b;
        Object objA = aVar.isEmpty() ? null : a(rVar, eVar2, eVar3, z);
        b.b.c.f.a<String, View> aVarB = b(rVar, aVar, objA, eVar);
        b.b.c.f.a<String, View> aVarA = a(rVar, aVar, objA, eVar);
        if (aVar.isEmpty()) {
            if (aVarB != null) {
                aVarB.clear();
            }
            if (aVarA != null) {
                aVarA.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarB, aVar.keySet());
            a(arrayList2, aVarA, aVar.values());
            obj3 = objA;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        a(eVar2, eVar3, z, aVarB, true);
        if (obj3 != null) {
            arrayList2.add(view);
            rVar.b(obj3, view, arrayList);
            a(rVar, obj3, obj2, aVarB, eVar.e, eVar.f);
            Rect rect2 = new Rect();
            View viewA = a(aVarA, eVar, obj, z);
            if (viewA != null) {
                rVar.a(obj, rect2);
            }
            rect = rect2;
            view2 = viewA;
        } else {
            view2 = null;
            rect = null;
        }
        u.a(viewGroup, new c(eVar2, eVar3, z, aVarA, view2, rVar, rect));
        return obj3;
    }

    public static void b(android.support.v4.app.c cVar, SparseArray<e> sparseArray, boolean z) {
        if (cVar.f536a.o.a()) {
            for (int size = cVar.f537b.size() - 1; size >= 0; size--) {
                a(cVar, cVar.f537b.get(size), sparseArray, true, z);
            }
        }
    }

    private static void b(k kVar, int i, e eVar, View view, b.b.c.f.a<String, String> aVar) {
        android.support.v4.app.e eVar2;
        android.support.v4.app.e eVar3;
        r rVarA;
        Object obj;
        ViewGroup viewGroup = kVar.o.a() ? (ViewGroup) kVar.o.a(i) : null;
        if (viewGroup == null || (rVarA = a((eVar3 = eVar.d), (eVar2 = eVar.f603a))) == null) {
            return;
        }
        boolean z = eVar.f604b;
        boolean z2 = eVar.e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objA = a(rVarA, eVar2, z);
        Object objB = b(rVarA, eVar3, z2);
        Object objB2 = b(rVarA, viewGroup, view, aVar, eVar, arrayList2, arrayList, objA, objB);
        if (objA == null && objB2 == null) {
            obj = objB;
            if (obj == null) {
                return;
            }
        } else {
            obj = objB;
        }
        ArrayList<View> arrayListA = a(rVarA, obj, eVar3, arrayList2, view);
        ArrayList<View> arrayListA2 = a(rVarA, objA, eVar2, arrayList, view);
        a(arrayListA2, 4);
        Object objA2 = a(rVarA, objA, obj, objB2, eVar2, z);
        if (objA2 != null) {
            a(rVarA, obj, eVar3, arrayListA);
            ArrayList<String> arrayListA3 = rVarA.a(arrayList);
            rVarA.a(objA2, objA, arrayListA2, obj, arrayListA, objB2, arrayList);
            rVarA.a(viewGroup, objA2);
            rVarA.a(viewGroup, arrayList2, arrayList, arrayListA3, aVar);
            a(arrayListA2, 0);
            rVarA.b(objB2, arrayList2, arrayList);
        }
    }
}
