package b.b.d.d;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements android.support.v7.view.menu.h.a {
    private Context d;
    private ActionBarContextView e;
    private b.a f;
    private WeakReference<View> g;
    private boolean h;
    private android.support.v7.view.menu.h i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.d = context;
        this.e = actionBarContextView;
        this.f = aVar;
        android.support.v7.view.menu.h hVar = new android.support.v7.view.menu.h(actionBarContextView.getContext());
        hVar.c(1);
        this.i = hVar;
        hVar.a(this);
    }

    @Override // b.b.d.d.b
    public void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.sendAccessibilityEvent(32);
        this.f.a(this);
    }

    @Override // b.b.d.d.b
    public void a(int i) {
        a((CharSequence) this.d.getString(i));
    }

    @Override // android.support.v7.view.menu.h.a
    public void a(android.support.v7.view.menu.h hVar) {
        i();
        this.e.d();
    }

    @Override // b.b.d.d.b
    public void a(View view) {
        this.e.setCustomView(view);
        this.g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // b.b.d.d.b
    public void a(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    @Override // b.b.d.d.b
    public void a(boolean z) {
        super.a(z);
        this.e.setTitleOptional(z);
    }

    @Override // android.support.v7.view.menu.h.a
    public boolean a(android.support.v7.view.menu.h hVar, MenuItem menuItem) {
        return this.f.a(this, menuItem);
    }

    @Override // b.b.d.d.b
    public View b() {
        WeakReference<View> weakReference = this.g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // b.b.d.d.b
    public void b(int i) {
        b(this.d.getString(i));
    }

    @Override // b.b.d.d.b
    public void b(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // b.b.d.d.b
    public Menu c() {
        return this.i;
    }

    @Override // b.b.d.d.b
    public MenuInflater d() {
        return new g(this.e.getContext());
    }

    @Override // b.b.d.d.b
    public CharSequence e() {
        return this.e.getSubtitle();
    }

    @Override // b.b.d.d.b
    public CharSequence g() {
        return this.e.getTitle();
    }

    @Override // b.b.d.d.b
    public void i() {
        this.f.a(this, this.i);
    }

    @Override // b.b.d.d.b
    public boolean j() {
        return this.e.b();
    }
}
