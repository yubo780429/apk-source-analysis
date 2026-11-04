package a.a.a.d;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f<T> extends ArrayList<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f137b;

    public f(int i) {
        this.f137b = 0;
        this.f137b = i;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        synchronized (this) {
            if (size() == this.f137b) {
                remove(0);
            }
            add(size(), t);
        }
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        synchronized (this) {
            if (size() <= 3) {
                return;
            }
            int size = size() / 2;
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    return;
                }
                remove(0);
                size = i;
            }
        }
    }
}
