package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<?> f556a;

    private h(i<?> iVar) {
        this.f556a = iVar;
    }

    public static h a(i<?> iVar) {
        return new h(iVar);
    }

    public e a(String str) {
        return this.f556a.d.b(str);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f556a.d.onCreateView(view, str, context, attributeSet);
    }

    public void a() {
        this.f556a.d.d();
    }

    public void a(Configuration configuration) {
        this.f556a.d.a(configuration);
    }

    public void a(Parcelable parcelable, l lVar) {
        this.f556a.d.a(parcelable, lVar);
    }

    public void a(e eVar) {
        i<?> iVar = this.f556a;
        iVar.d.a(iVar, iVar, eVar);
    }

    public void a(Menu menu) {
        this.f556a.d.a(menu);
    }

    public void a(boolean z) {
        this.f556a.d.a(z);
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        return this.f556a.d.a(menu, menuInflater);
    }

    public boolean a(MenuItem menuItem) {
        return this.f556a.d.a(menuItem);
    }

    public void b() {
        this.f556a.d.e();
    }

    public void b(boolean z) {
        this.f556a.d.b(z);
    }

    public boolean b(Menu menu) {
        return this.f556a.d.b(menu);
    }

    public boolean b(MenuItem menuItem) {
        return this.f556a.d.b(menuItem);
    }

    public void c() {
        this.f556a.d.f();
    }

    public void d() {
        this.f556a.d.h();
    }

    public void e() {
        this.f556a.d.i();
    }

    public void f() {
        this.f556a.d.j();
    }

    public void g() {
        this.f556a.d.k();
    }

    public void h() {
        this.f556a.d.l();
    }

    public boolean i() {
        return this.f556a.d.n();
    }

    public j j() {
        return this.f556a.d();
    }

    public void k() {
        this.f556a.d.q();
    }

    public l l() {
        return this.f556a.d.s();
    }

    public Parcelable m() {
        return this.f556a.d.t();
    }
}
