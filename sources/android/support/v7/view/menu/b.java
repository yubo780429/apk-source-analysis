package android.support.v7.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f744c;
    protected h d;
    protected LayoutInflater e;
    private o.a f;
    private int g;
    private int h;
    protected p i;

    public b(Context context, int i, int i2) {
        this.f743b = context;
        this.e = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    public o.a a() {
        return this.f;
    }

    public p.a a(ViewGroup viewGroup) {
        return (p.a) this.e.inflate(this.h, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View a(j jVar, View view, ViewGroup viewGroup) {
        p.a aVarA = view instanceof p.a ? (p.a) view : a(viewGroup);
        a(jVar, aVarA);
        return (View) aVarA;
    }

    public void a(int i) {
    }

    @Override // android.support.v7.view.menu.o
    public void a(Context context, h hVar) {
        this.f744c = context;
        LayoutInflater.from(context);
        this.d = hVar;
    }

    @Override // android.support.v7.view.menu.o
    public void a(h hVar, boolean z) {
        o.a aVar = this.f;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    public abstract void a(j jVar, p.a aVar);

    @Override // android.support.v7.view.menu.o
    public void a(o.a aVar) {
        this.f = aVar;
    }

    protected void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.view.menu.o
    public void a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        h hVar = this.d;
        int i = 0;
        if (hVar != null) {
            hVar.b();
            ArrayList<j> arrayListN = this.d.n();
            int size = arrayListN.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                j jVar = arrayListN.get(i3);
                if (a(i2, jVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    j itemData = childAt instanceof p.a ? ((p.a) childAt).getItemData() : null;
                    View viewA = a(jVar, childAt, viewGroup);
                    if (jVar != itemData) {
                        viewA.setPressed(false);
                        viewA.jumpDrawablesToCurrentState();
                    }
                    if (viewA != childAt) {
                        a(viewA, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!a(viewGroup, i)) {
                i++;
            }
        }
    }

    public abstract boolean a(int i, j jVar);

    @Override // android.support.v7.view.menu.o
    public boolean a(h hVar, j jVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.o
    public boolean a(u uVar) {
        o.a aVar = this.f;
        if (aVar != null) {
            return aVar.a(uVar);
        }
        return false;
    }

    protected boolean a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public p b(ViewGroup viewGroup) {
        if (this.i == null) {
            p pVar = (p) this.e.inflate(this.g, viewGroup, false);
            this.i = pVar;
            pVar.a(this.d);
            a(true);
        }
        return this.i;
    }

    @Override // android.support.v7.view.menu.o
    public boolean b(h hVar, j jVar) {
        return false;
    }
}
