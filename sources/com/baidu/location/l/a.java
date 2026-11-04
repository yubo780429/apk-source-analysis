package com.baidu.location.l;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c.b.a.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1384b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1385c;
    private c.b.a.a.a d;
    private boolean e;
    private c.b.a.a.a f;
    private boolean g;
    private int h;
    private boolean i;
    private long j;
    private boolean k;
    private int l;
    private int m;

    public a() {
        c.b.a.a.a aVar = c.b.a.a.a.f1316c;
        this.d = aVar;
        this.f = aVar;
        this.h = 0;
        this.j = 0L;
        this.l = 0;
        this.m = -1;
    }

    @Override // c.b.a.a.c
    public int a() {
        if (this.m < 0) {
            b();
        }
        return this.m;
    }

    public a a(int i) {
        this.f1383a = true;
        this.f1384b = i;
        return this;
    }

    public a a(long j) {
        this.i = true;
        this.j = j;
        return this;
    }

    public a a(c.b.a.a.a aVar) {
        this.f1385c = true;
        this.d = aVar;
        return this;
    }

    @Override // c.b.a.a.c
    public void a(c.b.a.a.b bVar) throws IOException {
        if (j()) {
            bVar.a(1, d());
        }
        if (l()) {
            bVar.a(2, f());
        }
        if (m()) {
            bVar.a(3, g());
        }
        if (n()) {
            bVar.a(4, h());
        }
        if (o()) {
            bVar.a(5, i());
        }
        if (k()) {
            bVar.a(6, e());
        }
    }

    @Override // c.b.a.a.c
    public int b() {
        int iC = j() ? 0 + c.b.a.a.b.c(1, d()) : 0;
        if (l()) {
            iC += c.b.a.a.b.b(2, f());
        }
        if (m()) {
            iC += c.b.a.a.b.b(3, g());
        }
        if (n()) {
            iC += c.b.a.a.b.c(4, h());
        }
        if (o()) {
            iC += c.b.a.a.b.b(5, i());
        }
        if (k()) {
            iC += c.b.a.a.b.c(6, e());
        }
        this.m = iC;
        return iC;
    }

    public a b(int i) {
        this.k = true;
        this.l = i;
        return this;
    }

    public a b(c.b.a.a.a aVar) {
        this.e = true;
        this.f = aVar;
        return this;
    }

    public a c(int i) {
        this.g = true;
        this.h = i;
        return this;
    }

    public int d() {
        return this.f1384b;
    }

    public int e() {
        return this.l;
    }

    public c.b.a.a.a f() {
        return this.d;
    }

    public c.b.a.a.a g() {
        return this.f;
    }

    public int h() {
        return this.h;
    }

    public long i() {
        return this.j;
    }

    public boolean j() {
        return this.f1383a;
    }

    public boolean k() {
        return this.k;
    }

    public boolean l() {
        return this.f1385c;
    }

    public boolean m() {
        return this.e;
    }

    public boolean n() {
        return this.g;
    }

    public boolean o() {
        return this.i;
    }
}
