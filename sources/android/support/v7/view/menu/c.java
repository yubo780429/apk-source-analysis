package android.support.v7.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class c<T> extends d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<b.b.c.c.a.b, MenuItem> f746c;
    private Map<b.b.c.c.a.c, SubMenu> d;

    c(Context context, T t) {
        super(t);
        this.f745b = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof b.b.c.c.a.b)) {
            return menuItem;
        }
        b.b.c.c.a.b bVar = (b.b.c.c.a.b) menuItem;
        if (this.f746c == null) {
            this.f746c = new b.b.c.f.a();
        }
        MenuItem menuItem2 = this.f746c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem menuItemA = q.a(this.f745b, bVar);
        this.f746c.put(bVar, menuItemA);
        return menuItemA;
    }

    final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof b.b.c.c.a.c)) {
            return subMenu;
        }
        b.b.c.c.a.c cVar = (b.b.c.c.a.c) subMenu;
        if (this.d == null) {
            this.d = new b.b.c.f.a();
        }
        SubMenu subMenu2 = this.d.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu subMenuA = q.a(this.f745b, cVar);
        this.d.put(cVar, subMenuA);
        return subMenuA;
    }

    final void a(int i) {
        Map<b.b.c.c.a.b, MenuItem> map = this.f746c;
        if (map == null) {
            return;
        }
        Iterator<b.b.c.c.a.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    final void b() {
        Map<b.b.c.c.a.b, MenuItem> map = this.f746c;
        if (map != null) {
            map.clear();
        }
        Map<b.b.c.c.a.c, SubMenu> map2 = this.d;
        if (map2 != null) {
            map2.clear();
        }
    }

    final void b(int i) {
        Map<b.b.c.c.a.b, MenuItem> map = this.f746c;
        if (map == null) {
            return;
        }
        Iterator<b.b.c.c.a.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
