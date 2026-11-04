package b.b.c.f;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends k<K, V> implements Map<K, V> {
    h<K, V> i;

    /* JADX INFO: renamed from: b.b.c.f.a$a, reason: collision with other inner class name */
    class C0046a extends h<K, V> {
        C0046a() {
        }

        @Override // b.b.c.f.h
        protected int a(Object obj) {
            return a.this.a(obj);
        }

        @Override // b.b.c.f.h
        protected Object a(int i, int i2) {
            return a.this.f1096c[(i << 1) + i2];
        }

        @Override // b.b.c.f.h
        protected V a(int i, V v) {
            return a.this.a(i, v);
        }

        @Override // b.b.c.f.h
        protected void a() {
            a.this.clear();
        }

        @Override // b.b.c.f.h
        protected void a(int i) {
            a.this.c(i);
        }

        @Override // b.b.c.f.h
        protected void a(K k, V v) {
            a.this.put(k, v);
        }

        @Override // b.b.c.f.h
        protected int b(Object obj) {
            return a.this.b(obj);
        }

        @Override // b.b.c.f.h
        protected Map<K, V> b() {
            return a.this;
        }

        @Override // b.b.c.f.h
        protected int c() {
            return a.this.d;
        }
    }

    public a() {
    }

    public a(int i) {
        super(i);
    }

    private h<K, V> b() {
        if (this.i == null) {
            this.i = new C0046a();
        }
        return this.i;
    }

    public boolean a(Collection<?> collection) {
        return h.c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().e();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return b().f();
    }
}
