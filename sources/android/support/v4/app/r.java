package android.support.v4.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f614c;
        final /* synthetic */ ArrayList d;
        final /* synthetic */ ArrayList e;
        final /* synthetic */ ArrayList f;

        a(r rVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f613b = i;
            this.f614c = arrayList;
            this.d = arrayList2;
            this.e = arrayList3;
            this.f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f613b; i++) {
                b.b.c.g.q.a((View) this.f614c.get(i), (String) this.d.get(i));
                b.b.c.g.q.a((View) this.e.get(i), (String) this.f.get(i));
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f616c;

        b(r rVar, ArrayList arrayList, Map map) {
            this.f615b = arrayList;
            this.f616c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f615b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f615b.get(i);
                String strF = b.b.c.g.q.f(view);
                if (strF != null) {
                    b.b.c.g.q.a(view, r.a((Map<String, String>) this.f616c, strF));
                }
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f618c;

        c(r rVar, ArrayList arrayList, Map map) {
            this.f617b = arrayList;
            this.f618c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f617b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f617b.get(i);
                b.b.c.g.q.a(view, (String) this.f618c.get(b.b.c.g.q.f(view)));
            }
        }
    }

    static String a(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected static void a(List<View> list, View view) {
        int size = list.size();
        if (a(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!a(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    protected static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    private static boolean a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public abstract Object a(Object obj, Object obj2, Object obj3);

    ArrayList<String> a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(b.b.c.g.q.f(view));
            b.b.c.g.q.a(view, (String) null);
        }
        return arrayList2;
    }

    protected void a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    void a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String strF = b.b.c.g.q.f(view2);
            arrayList4.add(strF);
            if (strF != null) {
                b.b.c.g.q.a(view2, (String) null);
                String str = map.get(strF);
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equals(arrayList3.get(i2))) {
                        b.b.c.g.q.a(arrayList2.get(i2), strF);
                        break;
                    }
                }
            }
        }
        u.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    void a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        u.a(view, new b(this, arrayList, map));
    }

    public abstract void a(ViewGroup viewGroup, Object obj);

    void a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        u.a(viewGroup, new c(this, arrayList, map));
    }

    public abstract void a(Object obj, Rect rect);

    public abstract void a(Object obj, View view);

    public abstract void a(Object obj, View view, ArrayList<View> arrayList);

    public abstract void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void a(Object obj, ArrayList<View> arrayList);

    public abstract void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    void a(ArrayList<View> arrayList, View view) {
        View view2;
        ViewGroup viewGroup;
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
                if (!b.b.c.g.s.a(viewGroup)) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        view2 = view;
                        view2 = viewGroup;
                        a(arrayList, viewGroup.getChildAt(i));
                    }
                    view2 = view;
                    view2 = viewGroup;
                    return;
                }
            }
            view2 = view;
            view2 = viewGroup;
            view2 = view;
            arrayList.add(view2);
        }
    }

    void a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String strF = b.b.c.g.q.f(view);
            if (strF != null) {
                map.put(strF, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public abstract boolean a(Object obj);

    public abstract Object b(Object obj);

    public abstract Object b(Object obj, Object obj2, Object obj3);

    public abstract void b(Object obj, View view);

    public abstract void b(Object obj, View view, ArrayList<View> arrayList);

    public abstract void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object c(Object obj);

    public abstract void c(Object obj, View view);
}
