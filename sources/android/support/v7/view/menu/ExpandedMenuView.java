package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.support.v7.widget.t0;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements h.b, p, AdapterView.OnItemClickListener {
    private static final int[] d = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f737c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        t0 t0VarA = t0.a(context, attributeSet, d, i, 0);
        if (t0VarA.g(0)) {
            setBackgroundDrawable(t0VarA.b(0));
        }
        if (t0VarA.g(1)) {
            setDivider(t0VarA.b(1));
        }
        t0VarA.a();
    }

    @Override // android.support.v7.view.menu.p
    public void a(h hVar) {
        this.f736b = hVar;
    }

    @Override // android.support.v7.view.menu.h.b
    public boolean a(j jVar) {
        return this.f736b.a(jVar, 0);
    }

    public int getWindowAnimations() {
        return this.f737c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((j) getAdapter().getItem(i));
    }
}
