package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class u extends h implements SubMenu {
    private h B;
    private j C;

    public u(Context context, h hVar, j jVar) {
        super(context);
        this.B = hVar;
        this.C = jVar;
    }

    @Override // android.support.v7.view.menu.h
    public void a(h.a aVar) {
        this.B.a(aVar);
    }

    @Override // android.support.v7.view.menu.h
    boolean a(h hVar, MenuItem menuItem) {
        return super.a(hVar, menuItem) || this.B.a(hVar, menuItem);
    }

    @Override // android.support.v7.view.menu.h
    public boolean a(j jVar) {
        return this.B.a(jVar);
    }

    @Override // android.support.v7.view.menu.h
    public boolean b(j jVar) {
        return this.B.b(jVar);
    }

    @Override // android.support.v7.view.menu.h
    public String d() {
        j jVar = this.C;
        int itemId = jVar != null ? jVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.d() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.C;
    }

    @Override // android.support.v7.view.menu.h
    public h m() {
        return this.B.m();
    }

    @Override // android.support.v7.view.menu.h
    public boolean o() {
        return this.B.o();
    }

    @Override // android.support.v7.view.menu.h
    public boolean p() {
        return this.B.p();
    }

    @Override // android.support.v7.view.menu.h
    public boolean q() {
        return this.B.q();
    }

    @Override // android.support.v7.view.menu.h, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        super.d(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        super.a(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        super.e(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.a(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.C.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    @Override // android.support.v7.view.menu.h, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.B.setQwertyMode(z);
    }

    public Menu t() {
        return this.B;
    }
}
