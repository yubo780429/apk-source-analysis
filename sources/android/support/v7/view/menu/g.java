package android.support.v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    h f761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f762c = -1;
    private boolean d;
    private final boolean e;
    private final LayoutInflater f;
    private final int g;

    public g(h hVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.e = z;
        this.f = layoutInflater;
        this.f761b = hVar;
        this.g = i;
        a();
    }

    void a() {
        j jVarF = this.f761b.f();
        if (jVarF != null) {
            ArrayList<j> arrayListJ = this.f761b.j();
            int size = arrayListJ.size();
            for (int i = 0; i < size; i++) {
                if (arrayListJ.get(i) == jVarF) {
                    this.f762c = i;
                    return;
                }
            }
        }
        this.f762c = -1;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public h b() {
        return this.f761b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<j> arrayListJ = this.e ? this.f761b.j() : this.f761b.n();
        return this.f762c < 0 ? arrayListJ.size() : arrayListJ.size() - 1;
    }

    @Override // android.widget.Adapter
    public j getItem(int i) {
        ArrayList<j> arrayListJ = this.e ? this.f761b.j() : this.f761b.n();
        int i2 = this.f762c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListJ.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f.inflate(this.g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f761b.o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        p.a aVar = (p.a) view;
        if (this.d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
