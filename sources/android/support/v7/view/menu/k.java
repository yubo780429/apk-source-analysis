package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class k extends android.support.v7.view.menu.c<b.b.c.c.a.b> implements MenuItem {
    private Method e;

    class a extends b.b.c.g.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ActionProvider f772b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f772b = actionProvider;
        }

        @Override // b.b.c.g.c
        public void a(SubMenu subMenu) {
            this.f772b.onPrepareSubMenu(k.this.a(subMenu));
        }

        @Override // b.b.c.g.c
        public boolean a() {
            return this.f772b.hasSubMenu();
        }

        @Override // b.b.c.g.c
        public View c() {
            return this.f772b.onCreateActionView();
        }

        @Override // b.b.c.g.c
        public boolean d() {
            return this.f772b.onPerformDefaultAction();
        }
    }

    static class b extends FrameLayout implements b.b.d.d.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CollapsibleActionView f774b;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f774b = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // b.b.d.d.c
        public void a() {
            this.f774b.onActionViewExpanded();
        }

        @Override // b.b.d.d.c
        public void b() {
            this.f774b.onActionViewCollapsed();
        }

        View c() {
            return (View) this.f774b;
        }
    }

    private class c extends android.support.v7.view.menu.d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f747a).onMenuItemActionCollapse(k.this.a(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f747a).onMenuItemActionExpand(k.this.a(menuItem));
        }
    }

    private class d extends android.support.v7.view.menu.d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f747a).onMenuItemClick(k.this.a(menuItem));
        }
    }

    k(Context context, b.b.c.c.a.b bVar) {
        super(context, bVar);
    }

    a a(ActionProvider actionProvider) {
        return new a(this.f745b, actionProvider);
    }

    public void a(boolean z) {
        try {
            if (this.e == null) {
                this.e = ((b.b.c.c.a.b) this.f747a).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.e.invoke(this.f747a, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((b.b.c.c.a.b) this.f747a).collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((b.b.c.c.a.b) this.f747a).expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        b.b.c.g.c cVarA = ((b.b.c.c.a.b) this.f747a).a();
        if (cVarA instanceof a) {
            return ((a) cVarA).f772b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = ((b.b.c.c.a.b) this.f747a).getActionView();
        return actionView instanceof b ? ((b) actionView).c() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return ((b.b.c.c.a.b) this.f747a).getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((b.b.c.c.a.b) this.f747a).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return ((b.b.c.c.a.b) this.f747a).getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((b.b.c.c.a.b) this.f747a).getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return ((b.b.c.c.a.b) this.f747a).getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return ((b.b.c.c.a.b) this.f747a).getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return ((b.b.c.c.a.b) this.f747a).getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return ((b.b.c.c.a.b) this.f747a).getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((b.b.c.c.a.b) this.f747a).getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((b.b.c.c.a.b) this.f747a).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return ((b.b.c.c.a.b) this.f747a).getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((b.b.c.c.a.b) this.f747a).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((b.b.c.c.a.b) this.f747a).getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return a(((b.b.c.c.a.b) this.f747a).getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return ((b.b.c.c.a.b) this.f747a).getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return ((b.b.c.c.a.b) this.f747a).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return ((b.b.c.c.a.b) this.f747a).getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((b.b.c.c.a.b) this.f747a).hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((b.b.c.c.a.b) this.f747a).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((b.b.c.c.a.b) this.f747a).isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((b.b.c.c.a.b) this.f747a).isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((b.b.c.c.a.b) this.f747a).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((b.b.c.c.a.b) this.f747a).isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((b.b.c.c.a.b) this.f747a).a(actionProvider != null ? a(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        ((b.b.c.c.a.b) this.f747a).setActionView(i);
        View actionView = ((b.b.c.c.a.b) this.f747a).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((b.b.c.c.a.b) this.f747a).setActionView(new b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        ((b.b.c.c.a.b) this.f747a).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        ((b.b.c.c.a.b) this.f747a).setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        ((b.b.c.c.a.b) this.f747a).setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        ((b.b.c.c.a.b) this.f747a).setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        ((b.b.c.c.a.b) this.f747a).setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        ((b.b.c.c.a.b) this.f747a).setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        ((b.b.c.c.a.b) this.f747a).setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        ((b.b.c.c.a.b) this.f747a).setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((b.b.c.c.a.b) this.f747a).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((b.b.c.c.a.b) this.f747a).setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((b.b.c.c.a.b) this.f747a).setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        ((b.b.c.c.a.b) this.f747a).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        ((b.b.c.c.a.b) this.f747a).setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        ((b.b.c.c.a.b) this.f747a).setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((b.b.c.c.a.b) this.f747a).setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((b.b.c.c.a.b) this.f747a).setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        ((b.b.c.c.a.b) this.f747a).setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        ((b.b.c.c.a.b) this.f747a).setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        ((b.b.c.c.a.b) this.f747a).setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        ((b.b.c.c.a.b) this.f747a).setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        ((b.b.c.c.a.b) this.f747a).setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((b.b.c.c.a.b) this.f747a).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((b.b.c.c.a.b) this.f747a).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        ((b.b.c.c.a.b) this.f747a).setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return ((b.b.c.c.a.b) this.f747a).setVisible(z);
    }
}
