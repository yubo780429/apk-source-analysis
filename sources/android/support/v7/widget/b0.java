package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public interface b0 {
    b.b.c.g.u a(int i, long j);

    void a(int i);

    void a(m0 m0Var);

    void a(Menu menu, android.support.v7.view.menu.o.a aVar);

    void a(boolean z);

    boolean a();

    void b(int i);

    void b(boolean z);

    boolean b();

    void c();

    void c(int i);

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    void g();

    CharSequence getTitle();

    int h();

    void i();

    boolean j();

    ViewGroup k();

    void l();

    Context m();

    int n();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
