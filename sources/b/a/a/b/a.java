package b.a.a.b;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b<K, V> {
    private HashMap<K, b.d<K, V>> f = new HashMap<>();

    @Override // b.a.a.b.b
    protected b.d<K, V> a(K k) {
        return this.f.get(k);
    }

    @Override // b.a.a.b.b
    public V b(K k, V v) {
        b.d<K, V> dVarA = a(k);
        if (dVarA != null) {
            return dVarA.f973c;
        }
        this.f.put(k, a(k, v));
        return null;
    }

    public Map.Entry<K, V> b(K k) {
        if (contains(k)) {
            return this.f.get(k).e;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f.containsKey(k);
    }

    @Override // b.a.a.b.b
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.f.remove(k);
        return v;
    }
}
