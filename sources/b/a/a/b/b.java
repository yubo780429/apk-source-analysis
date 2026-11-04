package b.a.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d<K, V> f970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d<K, V> f971c;
    private WeakHashMap<g<K, V>, Boolean> d = new WeakHashMap<>();
    private int e = 0;

    /* JADX INFO: renamed from: b.a.a.b.b$b, reason: collision with other inner class name */
    static class C0036b<K, V> extends f<K, V> {
        C0036b(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        @Override // b.a.a.b.b.f
        d<K, V> b(d<K, V> dVar) {
            return dVar.e;
        }

        @Override // b.a.a.b.b.f
        d<K, V> c(d<K, V> dVar) {
            return dVar.d;
        }
    }

    private static class c<K, V> extends f<K, V> {
        c(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        @Override // b.a.a.b.b.f
        d<K, V> b(d<K, V> dVar) {
            return dVar.d;
        }

        @Override // b.a.a.b.b.f
        d<K, V> c(d<K, V> dVar) {
            return dVar.e;
        }
    }

    static class d<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final K f972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final V f973c;
        d<K, V> d;
        d<K, V> e;

        d(K k, V v) {
            this.f972b = k;
            this.f973c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f972b.equals(dVar.f972b) && this.f973c.equals(dVar.f973c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f972b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f973c;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f972b + "=" + this.f973c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class e implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d<K, V> f974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f975c;

        private e() {
            this.f975c = true;
        }

        @Override // b.a.a.b.b.g
        public void a(d<K, V> dVar) {
            d<K, V> dVar2 = this.f974b;
            if (dVar == dVar2) {
                d<K, V> dVar3 = dVar2.e;
                this.f974b = dVar3;
                this.f975c = dVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f975c) {
                return b.this.f970b != null;
            }
            d<K, V> dVar = this.f974b;
            return (dVar == null || dVar.d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            d<K, V> dVar;
            if (this.f975c) {
                this.f975c = false;
                dVar = b.this.f970b;
            } else {
                d<K, V> dVar2 = this.f974b;
                dVar = dVar2 != null ? dVar2.d : null;
            }
            this.f974b = dVar;
            return this.f974b;
        }
    }

    private static abstract class f<K, V> implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d<K, V> f976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        d<K, V> f977c;

        f(d<K, V> dVar, d<K, V> dVar2) {
            this.f976b = dVar2;
            this.f977c = dVar;
        }

        private d<K, V> a() {
            d<K, V> dVar = this.f977c;
            d<K, V> dVar2 = this.f976b;
            if (dVar == dVar2 || dVar2 == null) {
                return null;
            }
            return c(dVar);
        }

        @Override // b.a.a.b.b.g
        public void a(d<K, V> dVar) {
            if (this.f976b == dVar && dVar == this.f977c) {
                this.f977c = null;
                this.f976b = null;
            }
            d<K, V> dVar2 = this.f976b;
            if (dVar2 == dVar) {
                this.f976b = b(dVar2);
            }
            if (this.f977c == dVar) {
                this.f977c = a();
            }
        }

        abstract d<K, V> b(d<K, V> dVar);

        abstract d<K, V> c(d<K, V> dVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f977c != null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            d<K, V> dVar = this.f977c;
            this.f977c = a();
            return dVar;
        }
    }

    interface g<K, V> {
        void a(d<K, V> dVar);
    }

    protected d<K, V> a(K k) {
        d<K, V> dVar = this.f970b;
        while (dVar != null && !dVar.f972b.equals(k)) {
            dVar = dVar.d;
        }
        return dVar;
    }

    protected d<K, V> a(K k, V v) {
        d<K, V> dVar = new d<>(k, v);
        this.e++;
        d<K, V> dVar2 = this.f971c;
        if (dVar2 == null) {
            this.f970b = dVar;
        } else {
            dVar2.d = dVar;
            dVar.e = dVar2;
        }
        this.f971c = dVar;
        return dVar;
    }

    public Iterator<Map.Entry<K, V>> a() {
        c cVar = new c(this.f971c, this.f970b);
        this.d.put(cVar, false);
        return cVar;
    }

    public V b(K k, V v) {
        d<K, V> dVarA = a(k);
        if (dVarA != null) {
            return dVarA.f973c;
        }
        a(k, v);
        return null;
    }

    public Map.Entry<K, V> b() {
        return this.f970b;
    }

    public b<K, V>.e c() {
        b<K, V>.e eVar = new e();
        this.d.put(eVar, false);
        return eVar;
    }

    public Map.Entry<K, V> d() {
        return this.f971c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C0036b c0036b = new C0036b(this.f970b, this.f971c);
        this.d.put(c0036b, false);
        return c0036b;
    }

    public V remove(K k) {
        d<K, V> dVarA = a(k);
        if (dVarA == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            Iterator<g<K, V>> it = this.d.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(dVarA);
            }
        }
        d<K, V> dVar = dVarA.e;
        if (dVar != null) {
            dVar.d = dVarA.d;
        } else {
            this.f970b = dVarA.d;
        }
        d<K, V> dVar2 = dVarA.d;
        if (dVar2 != null) {
            dVar2.e = dVarA.e;
        } else {
            this.f971c = dVarA.e;
        }
        dVarA.d = null;
        dVarA.e = null;
        return dVarA.f973c;
    }

    public int size() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
