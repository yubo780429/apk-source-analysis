package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.i0;
import android.support.v7.widget.j0;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class e extends m implements o, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = b.b.d.a.g.abc_cascading_menu_item_layout;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f748c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    final Handler h;
    private View p;
    View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private o.a y;
    ViewTreeObserver z;
    private final List<h> i = new ArrayList();
    final List<d> j = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private final i0 m = new c();
    private int n = 0;
    private int o = 0;
    private boolean w = false;
    private int r = h();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!e.this.a() || e.this.j.size() <= 0 || e.this.j.get(0).f754a.k()) {
                return;
            }
            View view = e.this.q;
            if (view == null || !view.isShown()) {
                e.this.dismiss();
                return;
            }
            Iterator<d> it = e.this.j.iterator();
            while (it.hasNext()) {
                it.next().f754a.c();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = e.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    e.this.z = view.getViewTreeObserver();
                }
                e eVar = e.this;
                eVar.z.removeGlobalOnLayoutListener(eVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements i0 {

        class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f752b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MenuItem f753c;
            final /* synthetic */ h d;

            a(d dVar, MenuItem menuItem, h hVar) {
                this.f752b = dVar;
                this.f753c = menuItem;
                this.d = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f752b;
                if (dVar != null) {
                    e.this.B = true;
                    dVar.f755b.a(false);
                    e.this.B = false;
                }
                if (this.f753c.isEnabled() && this.f753c.hasSubMenu()) {
                    this.d.a(this.f753c, 4);
                }
            }
        }

        c() {
        }

        @Override // android.support.v7.widget.i0
        public void a(h hVar, MenuItem menuItem) {
            e.this.h.removeCallbacksAndMessages(null);
            int size = e.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (hVar == e.this.j.get(i).f755b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            e.this.h.postAtTime(new a(i2 < e.this.j.size() ? e.this.j.get(i2) : null, menuItem, hVar), hVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // android.support.v7.widget.i0
        public void b(h hVar, MenuItem menuItem) {
            e.this.h.removeCallbacksAndMessages(hVar);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0 f754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f756c;

        public d(j0 j0Var, h hVar, int i) {
            this.f754a = j0Var;
            this.f755b = hVar;
            this.f756c = i;
        }

        public ListView a() {
            return this.f754a.b();
        }
    }

    public e(Context context, View view, int i, int i2, boolean z) {
        this.f748c = context;
        this.p = view;
        this.e = i;
        this.f = i2;
        this.g = z;
        Resources resources = context.getResources();
        this.d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(b.b.d.a.d.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    private MenuItem a(h hVar, h hVar2) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View a(d dVar, h hVar) {
        g gVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemA = a(dVar.f755b, hVar);
        if (menuItemA == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            gVar = (g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (g) adapter;
            headersCount = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemA == gVar.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int c(h hVar) {
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (hVar == this.j.get(i).f755b) {
                return i;
            }
        }
        return -1;
    }

    private int d(int i) {
        List<d> list = this.j;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        if (this.r == 1) {
            return (iArr[0] + listViewA.getWidth()) + i > rect.right ? 0 : 1;
        }
        return iArr[0] - i < 0 ? 1 : 0;
    }

    private void d(h hVar) {
        d dVar;
        View viewA;
        int i;
        int i2;
        int i3;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f748c);
        g gVar = new g(hVar, layoutInflaterFrom, this.g, C);
        if (!a() && this.w) {
            gVar.a(true);
        } else if (a()) {
            gVar.a(m.b(hVar));
        }
        int iA = m.a(gVar, null, this.f748c, this.d);
        j0 j0VarG = g();
        j0VarG.a((ListAdapter) gVar);
        j0VarG.b(iA);
        j0VarG.c(this.o);
        if (this.j.size() > 0) {
            List<d> list = this.j;
            dVar = list.get(list.size() - 1);
            viewA = a(dVar, hVar);
        } else {
            dVar = null;
            viewA = null;
        }
        if (viewA != null) {
            j0VarG.c(false);
            j0VarG.a((Object) null);
            int iD = d(iA);
            boolean z = iD == 1;
            this.r = iD;
            if (Build.VERSION.SDK_INT >= 26) {
                j0VarG.a(viewA);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewA.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + viewA.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) == 5) {
                if (z) {
                    i3 = i + iA;
                } else {
                    iA = viewA.getWidth();
                    i3 = i - iA;
                }
            } else if (z) {
                iA = viewA.getWidth();
                i3 = i + iA;
            } else {
                i3 = i - iA;
            }
            j0VarG.d(i3);
            j0VarG.b(true);
            j0VarG.h(i2);
        } else {
            if (this.s) {
                j0VarG.d(this.u);
            }
            if (this.t) {
                j0VarG.h(this.v);
            }
            j0VarG.a(f());
        }
        this.j.add(new d(j0VarG, hVar, this.r));
        j0VarG.c();
        ListView listViewB = j0VarG.b();
        listViewB.setOnKeyListener(this);
        if (dVar == null && this.x && hVar.h() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(b.b.d.a.g.abc_popup_menu_header_item_layout, (ViewGroup) listViewB, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(hVar.h());
            listViewB.addHeaderView(frameLayout, null, false);
            j0VarG.c();
        }
    }

    private j0 g() {
        j0 j0Var = new j0(this.f748c, null, this.e, this.f);
        j0Var.a(this.m);
        j0Var.a((AdapterView.OnItemClickListener) this);
        j0Var.a((PopupWindow.OnDismissListener) this);
        j0Var.a(this.p);
        j0Var.c(this.o);
        j0Var.a(true);
        j0Var.e(2);
        return j0Var;
    }

    private int h() {
        return b.b.c.g.q.d(this.p) == 1 ? 0 : 1;
    }

    @Override // android.support.v7.view.menu.m
    public void a(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = b.b.c.g.d.a(i, b.b.c.g.q.d(this.p));
        }
    }

    @Override // android.support.v7.view.menu.m
    public void a(h hVar) {
        hVar.a(this, this.f748c);
        if (a()) {
            d(hVar);
        } else {
            this.i.add(hVar);
        }
    }

    @Override // android.support.v7.view.menu.o
    public void a(h hVar, boolean z) {
        int iC = c(hVar);
        if (iC < 0) {
            return;
        }
        int i = iC + 1;
        if (i < this.j.size()) {
            this.j.get(i).f755b.a(false);
        }
        d dVarRemove = this.j.remove(iC);
        dVarRemove.f755b.b(this);
        if (this.B) {
            dVarRemove.f754a.b((Object) null);
            dVarRemove.f754a.a(0);
        }
        dVarRemove.f754a.dismiss();
        int size = this.j.size();
        this.r = size > 0 ? this.j.get(size - 1).f756c : h();
        if (size != 0) {
            if (z) {
                this.j.get(0).f755b.a(false);
                return;
            }
            return;
        }
        dismiss();
        o.a aVar = this.y;
        if (aVar != null) {
            aVar.a(hVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.k);
            }
            this.z = null;
        }
        this.q.removeOnAttachStateChangeListener(this.l);
        this.A.onDismiss();
    }

    @Override // android.support.v7.view.menu.o
    public void a(o.a aVar) {
        this.y = aVar;
    }

    @Override // android.support.v7.view.menu.m
    public void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = b.b.c.g.d.a(this.n, b.b.c.g.q.d(view));
        }
    }

    @Override // android.support.v7.view.menu.m
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // android.support.v7.view.menu.o
    public void a(boolean z) {
        Iterator<d> it = this.j.iterator();
        while (it.hasNext()) {
            m.a(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.s
    public boolean a() {
        return this.j.size() > 0 && this.j.get(0).f754a.a();
    }

    @Override // android.support.v7.view.menu.o
    public boolean a(u uVar) {
        for (d dVar : this.j) {
            if (uVar == dVar.f755b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        a((h) uVar);
        o.a aVar = this.y;
        if (aVar != null) {
            aVar.a(uVar);
        }
        return true;
    }

    @Override // android.support.v7.view.menu.s
    public ListView b() {
        if (this.j.isEmpty()) {
            return null;
        }
        List<d> list = this.j;
        return list.get(list.size() - 1).a();
    }

    @Override // android.support.v7.view.menu.m
    public void b(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.support.v7.view.menu.m
    public void b(boolean z) {
        this.w = z;
    }

    @Override // android.support.v7.view.menu.s
    public void c() {
        if (a()) {
            return;
        }
        Iterator<h> it = this.i.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
        this.i.clear();
        View view = this.p;
        this.q = view;
        if (view != null) {
            boolean z = this.z == null;
            ViewTreeObserver viewTreeObserver = this.q.getViewTreeObserver();
            this.z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.k);
            }
            this.q.addOnAttachStateChangeListener(this.l);
        }
    }

    @Override // android.support.v7.view.menu.m
    public void c(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // android.support.v7.view.menu.m
    public void c(boolean z) {
        this.x = z;
    }

    @Override // android.support.v7.view.menu.o
    public boolean d() {
        return false;
    }

    @Override // android.support.v7.view.menu.s
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.j.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.f754a.a()) {
                    dVar.f754a.dismiss();
                }
            }
        }
    }

    @Override // android.support.v7.view.menu.m
    protected boolean e() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.j.get(i);
            if (!dVar.f754a.a()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.f755b.a(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
