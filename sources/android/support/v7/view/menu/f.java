package android.support.v7.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f implements o, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    LayoutInflater f758c;
    h d;
    ExpandedMenuView e;
    int f;
    int g;
    int h;
    private o.a i;
    a j;

    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f759b = -1;

        public a() {
            a();
        }

        void a() {
            j jVarF = f.this.d.f();
            if (jVarF != null) {
                ArrayList<j> arrayListJ = f.this.d.j();
                int size = arrayListJ.size();
                for (int i = 0; i < size; i++) {
                    if (arrayListJ.get(i) == jVarF) {
                        this.f759b = i;
                        return;
                    }
                }
            }
            this.f759b = -1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = f.this.d.j().size() - f.this.f;
            return this.f759b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public j getItem(int i) {
            ArrayList<j> arrayListJ = f.this.d.j();
            int i2 = i + f.this.f;
            int i3 = this.f759b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayListJ.get(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                f fVar = f.this;
                view = fVar.f758c.inflate(fVar.h, viewGroup, false);
            }
            ((p.a) view).a(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public f(int i, int i2) {
        this.h = i;
        this.g = i2;
    }

    public f(Context context, int i) {
        this(i, 0);
        this.f757b = context;
        this.f758c = LayoutInflater.from(context);
    }

    public p a(ViewGroup viewGroup) {
        if (this.e == null) {
            this.e = (ExpandedMenuView) this.f758c.inflate(b.b.d.a.g.abc_expanded_menu_layout, viewGroup, false);
            if (this.j == null) {
                this.j = new a();
            }
            this.e.setAdapter((ListAdapter) this.j);
            this.e.setOnItemClickListener(this);
        }
        return this.e;
    }

    public ListAdapter a() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.support.v7.view.menu.o
    public void a(Context context, h hVar) {
        LayoutInflater layoutInflaterFrom;
        a aVar;
        if (this.g == 0) {
            if (this.f757b != null) {
                this.f757b = context;
                if (this.f758c == null) {
                    layoutInflaterFrom = LayoutInflater.from(context);
                }
            }
            this.d = hVar;
            aVar = this.j;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.g);
        this.f757b = contextThemeWrapper;
        layoutInflaterFrom = LayoutInflater.from(contextThemeWrapper);
        this.f758c = layoutInflaterFrom;
        this.d = hVar;
        aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.o
    public void a(h hVar, boolean z) {
        o.a aVar = this.i;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    @Override // android.support.v7.view.menu.o
    public void a(o.a aVar) {
        this.i = aVar;
    }

    @Override // android.support.v7.view.menu.o
    public void a(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.o
    public boolean a(h hVar, j jVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.o
    public boolean a(u uVar) {
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        new i(uVar).a((IBinder) null);
        o.a aVar = this.i;
        if (aVar == null) {
            return true;
        }
        aVar.a(uVar);
        return true;
    }

    @Override // android.support.v7.view.menu.o
    public boolean b(h hVar, j jVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.o
    public boolean d() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.d.a(this.j.getItem(i), this, 0);
    }
}
