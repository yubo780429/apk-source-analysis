package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class g extends Dialog implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b.b.c.g.e.a f716c;

    class a implements b.b.c.g.e.a {
        a() {
        }

        @Override // b.b.c.g.e.a
        public boolean a(KeyEvent keyEvent) {
            return g.this.a(keyEvent);
        }
    }

    public g(Context context, int i) {
        super(context, a(context, i));
        this.f716c = new a();
        a().a((Bundle) null);
        a().a();
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(b.b.d.a.a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public e a() {
        if (this.f715b == null) {
            this.f715b = e.a(this, this);
        }
        return this.f715b;
    }

    @Override // android.support.v7.app.d
    public b.b.d.d.b a(b.b.d.d.b.a aVar) {
        return null;
    }

    @Override // android.support.v7.app.d
    public void a(b.b.d.d.b bVar) {
    }

    public boolean a(int i) {
        return a().b(i);
    }

    boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    @Override // android.support.v7.app.d
    public void b(b.b.d.d.b bVar) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return b.b.c.g.e.a(this.f716c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) a().a(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().e();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().d();
        super.onCreate(bundle);
        a().a(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().i();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().c(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }
}
