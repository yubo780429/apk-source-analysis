package android.support.constraint.n.k.m;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {
    p d;
    int f;
    public int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f508a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f509b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f510c = false;
    a e = a.UNKNOWN;
    int h = 1;
    g i = null;
    public boolean j = false;
    List<d> k = new ArrayList();
    List<f> l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.d = pVar;
    }

    public void a() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.f510c = false;
        this.f509b = false;
    }

    public void a(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }

    @Override // android.support.constraint.n.k.m.d
    public void a(d dVar) {
        Iterator<f> it = this.l.iterator();
        while (it.hasNext()) {
            if (!it.next().j) {
                return;
            }
        }
        this.f510c = true;
        d dVar2 = this.f508a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f509b) {
            this.d.a(this);
            return;
        }
        f fVar = null;
        int i = 0;
        for (f fVar2 : this.l) {
            if (!(fVar2 instanceof g)) {
                i++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i == 1 && fVar.j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.j) {
                    return;
                } else {
                    this.f = this.h * gVar.g;
                }
            }
            a(fVar.g + this.f);
        }
        d dVar3 = this.f508a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.k.add(dVar);
        if (this.j) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f523b.h());
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
