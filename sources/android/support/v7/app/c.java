package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.t;
import android.support.v4.app.y;
import android.support.v7.widget.y0;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class c extends android.support.v4.app.f implements d, y.a {
    private e n;
    private int o = 0;
    private Resources p;

    private boolean a(int i, KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // android.support.v7.app.d
    public b.b.d.d.b a(b.b.d.d.b.a aVar) {
        return null;
    }

    public void a(Intent intent) {
        t.a(this, intent);
    }

    public void a(y yVar) {
        yVar.a((Activity) this);
    }

    @Override // android.support.v7.app.d
    public void a(b.b.d.d.b bVar) {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h().a(view, layoutParams);
    }

    public void b(y yVar) {
    }

    @Override // android.support.v7.app.d
    public void b(b.b.d.d.b bVar) {
    }

    public boolean b(Intent intent) {
        return t.b(this, intent);
    }

    @Override // android.support.v4.app.y.a
    public Intent c() {
        return t.a(this);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a aVarI = i();
        if (getWindow().hasFeature(0)) {
            if (aVarI == null || !aVarI.e()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // android.support.v4.app.x, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a aVarI = i();
        if (keyCode == 82 && aVarI != null && aVarI.a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) h().a(i);
    }

    @Override // android.support.v4.app.f
    public void g() {
        h().e();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return h().b();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.p == null && y0.b()) {
            this.p = new y0(this, super.getResources());
        }
        Resources resources = this.p;
        return resources == null ? super.getResources() : resources;
    }

    public e h() {
        if (this.n == null) {
            this.n = e.a(this, this);
        }
        return this.n;
    }

    public a i() {
        return h().c();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        h().e();
    }

    @Deprecated
    public void j() {
    }

    public boolean k() {
        Intent intentC = c();
        if (intentC == null) {
            return false;
        }
        if (!b(intentC)) {
            a(intentC);
            return true;
        }
        y yVarA = y.a((Context) this);
        a(yVarA);
        b(yVarA);
        yVarA.a();
        try {
            android.support.v4.app.a.a(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.support.v4.app.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h().a(configuration);
        if (this.p != null) {
            this.p.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        j();
    }

    @Override // android.support.v4.app.f, android.support.v4.app.x, android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i;
        e eVarH = h();
        eVarH.d();
        eVarH.a(bundle);
        if (eVarH.a() && (i = this.o) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.o, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.support.v4.app.f, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        h().f();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.v4.app.f, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a aVarI = i();
        if (menuItem.getItemId() != 16908332 || aVarI == null || (aVarI.g() & 4) == 0) {
            return false;
        }
        return k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // android.support.v4.app.f, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        h().b(bundle);
    }

    @Override // android.support.v4.app.f, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        h().g();
    }

    @Override // android.support.v4.app.f, android.support.v4.app.x, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        h().c(bundle);
    }

    @Override // android.support.v4.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        h().h();
    }

    @Override // android.support.v4.app.f, android.app.Activity
    protected void onStop() {
        super.onStop();
        h().i();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        h().a(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a aVarI = i();
        if (getWindow().hasFeature(0)) {
            if (aVarI == null || !aVarI.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        h().c(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h().a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h().b(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        this.o = i;
    }
}
