package b.b.d.d;

import android.content.Context;
import android.support.v7.view.menu.q;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import b.b.c.f.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f1164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f1165b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f1166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f1167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<f> f1168c = new ArrayList<>();
        final k<Menu, Menu> d = new k<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f1167b = context;
            this.f1166a = callback;
        }

        private Menu a(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu menuA = q.a(this.f1167b, (b.b.c.c.a.a) menu);
            this.d.put(menu, menuA);
            return menuA;
        }

        @Override // b.b.d.d.b.a
        public void a(b bVar) {
            this.f1166a.onDestroyActionMode(b(bVar));
        }

        @Override // b.b.d.d.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f1166a.onPrepareActionMode(b(bVar), a(menu));
        }

        @Override // b.b.d.d.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f1166a.onActionItemClicked(b(bVar), q.a(this.f1167b, (b.b.c.c.a.b) menuItem));
        }

        public ActionMode b(b bVar) {
            int size = this.f1168c.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.f1168c.get(i);
                if (fVar != null && fVar.f1165b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f1167b, bVar);
            this.f1168c.add(fVar2);
            return fVar2;
        }

        @Override // b.b.d.d.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f1166a.onCreateActionMode(b(bVar), a(menu));
        }
    }

    public f(Context context, b bVar) {
        this.f1164a = context;
        this.f1165b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f1165b.a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f1165b.b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return q.a(this.f1164a, (b.b.c.c.a.a) this.f1165b.c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f1165b.d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f1165b.e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f1165b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f1165b.g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f1165b.h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f1165b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f1165b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f1165b.a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f1165b.a(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f1165b.a(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f1165b.a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f1165b.b(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f1165b.b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f1165b.a(z);
    }
}
