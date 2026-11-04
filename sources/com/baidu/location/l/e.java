package com.baidu.location.l;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c.b.a.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1394a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1396c;
    private boolean e;
    private boolean g;
    private boolean i;
    private boolean k;
    private boolean m;
    private boolean o;
    private boolean q;
    private boolean s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1395b = 0;
    private int d = 0;
    private int f = 0;
    private int h = 0;
    private int j = 0;
    private int l = 0;
    private int n = 0;
    private int p = 0;
    private int r = 0;
    private int t = 0;
    private int u = -1;

    @Override // c.b.a.a.c
    public int a() {
        if (this.u < 0) {
            b();
        }
        return this.u;
    }

    public e a(int i) {
        this.o = true;
        this.p = i;
        return this;
    }

    public e a(long j) {
        this.f1394a = true;
        this.f1395b = j;
        return this;
    }

    @Override // c.b.a.a.c
    public void a(c.b.a.a.b bVar) throws IOException {
        if (n()) {
            bVar.a(1, d());
        }
        if (s()) {
            bVar.a(2, i());
        }
        if (w()) {
            bVar.a(3, m());
        }
        if (r()) {
            bVar.a(4, h());
        }
        if (t()) {
            bVar.a(5, j());
        }
        if (u()) {
            bVar.a(6, k());
        }
        if (v()) {
            bVar.a(7, l());
        }
        if (o()) {
            bVar.a(8, e());
        }
        if (p()) {
            bVar.a(9, f());
        }
        if (q()) {
            bVar.a(10, g());
        }
    }

    @Override // c.b.a.a.c
    public int b() {
        int iB = n() ? 0 + c.b.a.a.b.b(1, d()) : 0;
        if (s()) {
            iB += c.b.a.a.b.c(2, i());
        }
        if (w()) {
            iB += c.b.a.a.b.c(3, m());
        }
        if (r()) {
            iB += c.b.a.a.b.c(4, h());
        }
        if (t()) {
            iB += c.b.a.a.b.c(5, j());
        }
        if (u()) {
            iB += c.b.a.a.b.c(6, k());
        }
        if (v()) {
            iB += c.b.a.a.b.c(7, l());
        }
        if (o()) {
            iB += c.b.a.a.b.c(8, e());
        }
        if (p()) {
            iB += c.b.a.a.b.c(9, f());
        }
        if (q()) {
            iB += c.b.a.a.b.c(10, g());
        }
        this.u = iB;
        return iB;
    }

    public e b(int i) {
        this.q = true;
        this.r = i;
        return this;
    }

    public e c(int i) {
        this.s = true;
        this.t = i;
        return this;
    }

    public long d() {
        return this.f1395b;
    }

    public e d(int i) {
        this.g = true;
        this.h = i;
        return this;
    }

    public int e() {
        return this.p;
    }

    public e e(int i) {
        this.f1396c = true;
        this.d = i;
        return this;
    }

    public int f() {
        return this.r;
    }

    public e f(int i) {
        this.i = true;
        this.j = i;
        return this;
    }

    public int g() {
        return this.t;
    }

    public e g(int i) {
        this.k = true;
        this.l = i;
        return this;
    }

    public int h() {
        return this.h;
    }

    public e h(int i) {
        this.m = true;
        this.n = i;
        return this;
    }

    public int i() {
        return this.d;
    }

    public e i(int i) {
        this.e = true;
        this.f = i;
        return this;
    }

    public int j() {
        return this.j;
    }

    public int k() {
        return this.l;
    }

    public int l() {
        return this.n;
    }

    public int m() {
        return this.f;
    }

    public boolean n() {
        return this.f1394a;
    }

    public boolean o() {
        return this.o;
    }

    public boolean p() {
        return this.q;
    }

    public boolean q() {
        return this.s;
    }

    public boolean r() {
        return this.g;
    }

    public boolean s() {
        return this.f1396c;
    }

    public boolean t() {
        return this.i;
    }

    public boolean u() {
        return this.k;
    }

    public boolean v() {
        return this.m;
    }

    public boolean w() {
        return this.e;
    }
}
