package b.b.d.d;

import android.view.View;
import android.view.animation.Interpolator;
import b.b.c.g.u;
import b.b.c.g.v;
import b.b.c.g.w;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f1180c;
    v d;
    private boolean e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1179b = -1;
    private final w f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<u> f1178a = new ArrayList<>();

    class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1181a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1182b = 0;

        a() {
        }

        void a() {
            this.f1182b = 0;
            this.f1181a = false;
            h.this.b();
        }

        @Override // b.b.c.g.v
        public void a(View view) {
            int i = this.f1182b + 1;
            this.f1182b = i;
            if (i == h.this.f1178a.size()) {
                v vVar = h.this.d;
                if (vVar != null) {
                    vVar.a(null);
                }
                a();
            }
        }

        @Override // b.b.c.g.w, b.b.c.g.v
        public void b(View view) {
            if (this.f1181a) {
                return;
            }
            this.f1181a = true;
            v vVar = h.this.d;
            if (vVar != null) {
                vVar.b(null);
            }
        }
    }

    public h a(long j) {
        if (!this.e) {
            this.f1179b = j;
        }
        return this;
    }

    public h a(Interpolator interpolator) {
        if (!this.e) {
            this.f1180c = interpolator;
        }
        return this;
    }

    public h a(u uVar) {
        if (!this.e) {
            this.f1178a.add(uVar);
        }
        return this;
    }

    public h a(u uVar, u uVar2) {
        this.f1178a.add(uVar);
        uVar2.b(uVar.b());
        this.f1178a.add(uVar2);
        return this;
    }

    public h a(v vVar) {
        if (!this.e) {
            this.d = vVar;
        }
        return this;
    }

    public void a() {
        if (this.e) {
            Iterator<u> it = this.f1178a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.e = false;
        }
    }

    void b() {
        this.e = false;
    }

    public void c() {
        if (this.e) {
            return;
        }
        for (u uVar : this.f1178a) {
            long j = this.f1179b;
            if (j >= 0) {
                uVar.a(j);
            }
            Interpolator interpolator = this.f1180c;
            if (interpolator != null) {
                uVar.a(interpolator);
            }
            if (this.d != null) {
                uVar.a(this.f);
            }
            uVar.c();
        }
        this.e = true;
    }
}
