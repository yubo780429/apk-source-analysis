package b.b.c.f;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f1082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1084c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1084c = i;
        this.f1082a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int c(K k, V v) {
        int iB = b(k, v);
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    protected V a(K k) {
        return null;
    }

    public final V a(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.d++;
            this.f1083b += c(k, v);
            vPut = this.f1082a.put(k, v);
            if (vPut != null) {
                this.f1083b -= c(k, vPut);
            }
        }
        if (vPut != null) {
            a(false, k, vPut, v);
        }
        a(this.f1084c);
        return vPut;
    }

    public void a(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.f1083b < 0 || (this.f1082a.isEmpty() && this.f1083b != 0)) {
                    break;
                }
                if (this.f1083b > i && !this.f1082a.isEmpty()) {
                    Map.Entry<K, V> next = this.f1082a.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.f1082a.remove(key);
                    this.f1083b -= c(key, value);
                    this.f++;
                }
                return;
            }
            a(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    protected void a(boolean z, K k, V v, V v2) {
    }

    protected int b(K k, V v) {
        return 1;
    }

    public final V b(K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f1082a.get(k);
            if (v != null) {
                this.g++;
                return v;
            }
            this.h++;
            V vA = a(k);
            if (vA == null) {
                return null;
            }
            synchronized (this) {
                this.e++;
                vPut = this.f1082a.put(k, vA);
                if (vPut != null) {
                    this.f1082a.put(k, vPut);
                } else {
                    this.f1083b += c(k, vA);
                }
            }
            if (vPut != null) {
                a(false, k, vA, vPut);
                return vPut;
            }
            a(this.f1084c);
            return vA;
        }
    }

    public final synchronized String toString() {
        int i;
        i = this.g + this.h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1084c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i != 0 ? (this.g * 100) / i : 0));
    }
}
