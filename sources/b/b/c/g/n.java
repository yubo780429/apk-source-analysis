package b.b.c.g;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1118a;

    public n(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f1118a;
    }

    public void a(View view, int i) {
        this.f1118a = 0;
    }

    public void a(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    public void a(View view, View view2, int i, int i2) {
        this.f1118a = i;
    }
}
