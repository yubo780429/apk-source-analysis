package com.baidu.location.l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c extends c.b.a.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b> f1389a = Collections.emptyList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1390b = -1;

    @Override // c.b.a.a.c
    public int a() {
        if (this.f1390b < 0) {
            b();
        }
        return this.f1390b;
    }

    public c a(b bVar) {
        if (bVar == null) {
            return this;
        }
        if (this.f1389a.isEmpty()) {
            this.f1389a = new ArrayList();
        }
        this.f1389a.add(bVar);
        return this;
    }

    @Override // c.b.a.a.c
    public void a(c.b.a.a.b bVar) throws IOException {
        Iterator<b> it = d().iterator();
        while (it.hasNext()) {
            bVar.a(1, it.next());
        }
    }

    @Override // c.b.a.a.c
    public int b() {
        Iterator<b> it = d().iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB += c.b.a.a.b.b(1, it.next());
        }
        this.f1390b = iB;
        return iB;
    }

    public List<b> d() {
        return this.f1389a;
    }
}
