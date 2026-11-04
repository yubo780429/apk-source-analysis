package android.support.constraint.n.k.m;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class o {
    static int f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f521c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<android.support.constraint.n.k.e> f519a = new ArrayList<>();
    ArrayList<a> d = null;
    private int e = -1;

    class a {
        public a(o oVar, android.support.constraint.n.k.e eVar, android.support.constraint.n.d dVar, int i) {
            new WeakReference(eVar);
            dVar.b(eVar.F);
            dVar.b(eVar.G);
            dVar.b(eVar.H);
            dVar.b(eVar.I);
            dVar.b(eVar.J);
        }
    }

    public o(int i) {
        this.f520b = -1;
        this.f521c = 0;
        int i2 = f;
        f = i2 + 1;
        this.f520b = i2;
        this.f521c = i;
    }

    private int a(android.support.constraint.n.d dVar, ArrayList<android.support.constraint.n.k.e> arrayList, int i) {
        int iB;
        android.support.constraint.n.k.d dVar2;
        android.support.constraint.n.k.f fVar = (android.support.constraint.n.k.f) arrayList.get(0).v();
        dVar.f();
        fVar.a(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).a(dVar, false);
        }
        if (i == 0 && fVar.y0 > 0) {
            android.support.constraint.n.k.b.a(fVar, dVar, arrayList, 0);
        }
        if (i == 1 && fVar.z0 > 0) {
            android.support.constraint.n.k.b.a(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.e();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.d.add(new a(this, arrayList.get(i3), dVar, i));
        }
        if (i == 0) {
            iB = dVar.b(fVar.F);
            dVar2 = fVar.H;
        } else {
            iB = dVar.b(fVar.G);
            dVar2 = fVar.I;
        }
        int iB2 = dVar.b(dVar2);
        dVar.f();
        return iB2 - iB;
    }

    private String c() {
        int i = this.f521c;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        return i == 2 ? "Both" : "Unknown";
    }

    public int a() {
        return this.f520b;
    }

    public int a(android.support.constraint.n.d dVar, int i) {
        if (this.f519a.size() == 0) {
            return 0;
        }
        return a(dVar, this.f519a, i);
    }

    public void a(int i) {
        this.f521c = i;
    }

    public void a(int i, o oVar) {
        for (android.support.constraint.n.k.e eVar : this.f519a) {
            oVar.a(eVar);
            int iA = oVar.a();
            if (i == 0) {
                eVar.m0 = iA;
            } else {
                eVar.n0 = iA;
            }
        }
        this.e = oVar.f520b;
    }

    public void a(ArrayList<o> arrayList) {
        int size = this.f519a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o oVar = arrayList.get(i);
                if (this.e == oVar.f520b) {
                    a(this.f521c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void a(boolean z) {
    }

    public boolean a(android.support.constraint.n.k.e eVar) {
        if (this.f519a.contains(eVar)) {
            return false;
        }
        this.f519a.add(eVar);
        return true;
    }

    public int b() {
        return this.f521c;
    }

    public String toString() {
        String str = c() + " [" + this.f520b + "] <";
        Iterator<android.support.constraint.n.k.e> it = this.f519a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().h();
        }
        return str + " >";
    }
}
