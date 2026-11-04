package com.baidu.location.l;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c.b.a.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1386a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1388c;
    private boolean e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f1387b = null;
    private d d = null;
    private e f = null;
    private int g = -1;

    @Override // c.b.a.a.c
    public int a() {
        if (this.g < 0) {
            b();
        }
        return this.g;
    }

    public b a(a aVar) {
        if (aVar == null) {
            d();
            return this;
        }
        this.f1386a = true;
        this.f1387b = aVar;
        return this;
    }

    public b a(d dVar) {
        if (dVar == null) {
            e();
            return this;
        }
        this.f1388c = true;
        this.d = dVar;
        return this;
    }

    public b a(e eVar) {
        if (eVar == null) {
            f();
            return this;
        }
        this.e = true;
        this.f = eVar;
        return this;
    }

    @Override // c.b.a.a.c
    public void a(c.b.a.a.b bVar) throws IOException {
        if (j()) {
            bVar.a(1, g());
        }
        if (k()) {
            bVar.a(2, h());
        }
        if (l()) {
            bVar.a(3, i());
        }
    }

    @Override // c.b.a.a.c
    public int b() {
        int iB = j() ? 0 + c.b.a.a.b.b(1, g()) : 0;
        if (k()) {
            iB += c.b.a.a.b.b(2, h());
        }
        if (l()) {
            iB += c.b.a.a.b.b(3, i());
        }
        this.g = iB;
        return iB;
    }

    public b d() {
        this.f1386a = false;
        this.f1387b = null;
        return this;
    }

    public b e() {
        this.f1388c = false;
        this.d = null;
        return this;
    }

    public b f() {
        this.e = false;
        this.f = null;
        return this;
    }

    public a g() {
        return this.f1387b;
    }

    public d h() {
        return this.d;
    }

    public e i() {
        return this.f;
    }

    public boolean j() {
        return this.f1386a;
    }

    public boolean k() {
        return this.f1388c;
    }

    public boolean l() {
        return this.e;
    }
}
