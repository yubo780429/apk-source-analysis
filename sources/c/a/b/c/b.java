package c.a.b.c;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class b implements Comparator {
    b() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(a aVar, a aVar2) {
        long jB = aVar.b() - aVar2.b();
        if (jB != 0) {
            return jB > 0 ? -1 : 1;
        }
        return aVar.a().compareTo(aVar2.a());
    }
}
