package c.a.b;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class h implements Comparator {
    h(f fVar) {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(d dVar, d dVar2) {
        int i = dVar2.f1232b - dVar.f1232b;
        if (i != 0) {
            return i;
        }
        if (dVar.d && dVar2.d) {
            return 0;
        }
        if (dVar.d) {
            return -1;
        }
        if (dVar2.d) {
            return 1;
        }
        return i;
    }
}
