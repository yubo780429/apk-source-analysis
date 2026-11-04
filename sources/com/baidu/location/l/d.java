package com.baidu.location.l;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c.b.a.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1391a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1393c;
    private boolean e;
    private boolean g;
    private boolean i;
    private boolean k;
    private boolean m;
    private boolean o;
    private boolean q;
    private boolean s;
    private boolean u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1392b = 0;
    private int d = 0;
    private int f = 0;
    private int h = 0;
    private int j = 0;
    private int l = 0;
    private int n = 0;
    private int p = 0;
    private int r = 0;
    private int t = 0;
    private int v = 0;
    private int w = -1;

    @Override // c.b.a.a.c
    public int a() {
        if (this.w < 0) {
            b();
        }
        return this.w;
    }

    public d a(int i) {
        this.i = true;
        this.j = i;
        return this;
    }

    @Override // c.b.a.a.c
    public void a(c.b.a.a.b bVar) throws IOException {
        if (p()) {
            bVar.a(1, e());
        }
        if (s()) {
            bVar.a(2, h());
        }
        if (x()) {
            bVar.a(3, m());
        }
        if (r()) {
            bVar.a(4, g());
        }
        if (o()) {
            bVar.a(5, d());
        }
        if (v()) {
            bVar.a(6, k());
        }
        if (t()) {
            bVar.a(7, i());
        }
        if (u()) {
            bVar.a(8, j());
        }
        if (w()) {
            bVar.a(9, l());
        }
        if (q()) {
            bVar.a(10, f());
        }
        if (y()) {
            bVar.a(11, n());
        }
    }

    @Override // c.b.a.a.c
    public int b() {
        int iC = p() ? 0 + c.b.a.a.b.c(1, e()) : 0;
        if (s()) {
            iC += c.b.a.a.b.c(2, h());
        }
        if (x()) {
            iC += c.b.a.a.b.c(3, m());
        }
        if (r()) {
            iC += c.b.a.a.b.c(4, g());
        }
        if (o()) {
            iC += c.b.a.a.b.c(5, d());
        }
        if (v()) {
            iC += c.b.a.a.b.c(6, k());
        }
        if (t()) {
            iC += c.b.a.a.b.c(7, i());
        }
        if (u()) {
            iC += c.b.a.a.b.c(8, j());
        }
        if (w()) {
            iC += c.b.a.a.b.c(9, l());
        }
        if (q()) {
            iC += c.b.a.a.b.c(10, f());
        }
        if (y()) {
            iC += c.b.a.a.b.c(11, n());
        }
        this.w = iC;
        return iC;
    }

    public d b(int i) {
        this.f1391a = true;
        this.f1392b = i;
        return this;
    }

    public d c(int i) {
        this.s = true;
        this.t = i;
        return this;
    }

    public int d() {
        return this.j;
    }

    public d d(int i) {
        this.g = true;
        this.h = i;
        return this;
    }

    public int e() {
        return this.f1392b;
    }

    public d e(int i) {
        this.f1393c = true;
        this.d = i;
        return this;
    }

    public int f() {
        return this.t;
    }

    public d f(int i) {
        this.m = true;
        this.n = i;
        return this;
    }

    public int g() {
        return this.h;
    }

    public d g(int i) {
        this.o = true;
        this.p = i;
        return this;
    }

    public int h() {
        return this.d;
    }

    public d h(int i) {
        this.k = true;
        this.l = i;
        return this;
    }

    public int i() {
        return this.n;
    }

    public d i(int i) {
        this.q = true;
        this.r = i;
        return this;
    }

    public int j() {
        return this.p;
    }

    public d j(int i) {
        this.e = true;
        this.f = i;
        return this;
    }

    public int k() {
        return this.l;
    }

    public d k(int i) {
        this.u = true;
        this.v = i;
        return this;
    }

    public int l() {
        return this.r;
    }

    public int m() {
        return this.f;
    }

    public int n() {
        return this.v;
    }

    public boolean o() {
        return this.i;
    }

    public boolean p() {
        return this.f1391a;
    }

    public boolean q() {
        return this.s;
    }

    public boolean r() {
        return this.g;
    }

    public boolean s() {
        return this.f1393c;
    }

    public boolean t() {
        return this.m;
    }

    public boolean u() {
        return this.o;
    }

    public boolean v() {
        return this.k;
    }

    public boolean w() {
        return this.q;
    }

    public boolean x() {
        return this.e;
    }

    public boolean y() {
        return this.u;
    }
}
