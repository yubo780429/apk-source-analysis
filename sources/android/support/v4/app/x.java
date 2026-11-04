package android.support.v4.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class x extends Activity implements android.arch.lifecycle.e, b.b.c.g.e.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.arch.lifecycle.f f621b;

    public x() {
        new b.b.c.f.k();
        this.f621b = new android.arch.lifecycle.f(this);
    }

    public android.arch.lifecycle.c a() {
        return this.f621b;
    }

    @Override // b.b.c.g.e.a
    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !b.b.c.g.e.a(decorView, keyEvent)) {
            return b.b.c.g.e.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !b.b.c.g.e.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        android.arch.lifecycle.m.a(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f621b.a(android.arch.lifecycle.c.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
