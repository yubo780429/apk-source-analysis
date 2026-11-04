package android.arch.lifecycle;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<e> f394c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b.a.a.b.a<d, b> f392a = new b.a.a.b.a<>();
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<c.b> g = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c.b f393b = c.b.INITIALIZED;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f396b;

        static {
            int[] iArr = new int[c.b.values().length];
            f396b = iArr;
            try {
                iArr[c.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f396b[c.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f396b[c.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f396b[c.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f396b[c.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[c.a.values().length];
            f395a = iArr2;
            try {
                iArr2[c.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f395a[c.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f395a[c.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f395a[c.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f395a[c.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f395a[c.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f395a[c.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c.b f397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        GenericLifecycleObserver f398b;

        b(d dVar, c.b bVar) {
            this.f398b = h.a(dVar);
            this.f397a = bVar;
        }

        void a(e eVar, c.a aVar) {
            c.b bVarB = f.b(aVar);
            this.f397a = f.a(this.f397a, bVarB);
            this.f398b.a(eVar, aVar);
            this.f397a = bVarB;
        }
    }

    public f(e eVar) {
        this.f394c = new WeakReference<>(eVar);
    }

    static c.b a(c.b bVar, c.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void a(e eVar) {
        Iterator<Map.Entry<d, b>> itA = this.f392a.a();
        while (itA.hasNext() && !this.f) {
            Map.Entry<d, b> next = itA.next();
            b value = next.getValue();
            while (value.f397a.compareTo(this.f393b) > 0 && !this.f && this.f392a.contains(next.getKey())) {
                c.a aVarB = b(value.f397a);
                d(b(aVarB));
                value.a(eVar, aVarB);
                c();
            }
        }
    }

    private static c.a b(c.b bVar) {
        int i = a.f396b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        if (i == 2) {
            return c.a.ON_DESTROY;
        }
        if (i == 3) {
            return c.a.ON_STOP;
        }
        if (i == 4) {
            return c.a.ON_PAUSE;
        }
        if (i == 5) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    static c.b b(c.a aVar) {
        switch (a.f395a[aVar.ordinal()]) {
            case 1:
            case 2:
                return c.b.CREATED;
            case 3:
            case 4:
                return c.b.STARTED;
            case 5:
                return c.b.RESUMED;
            case 6:
                return c.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private void b(e eVar) {
        b.a.a.b.b<d, b>.e eVarC = this.f392a.c();
        while (eVarC.hasNext() && !this.f) {
            Map.Entry next = eVarC.next();
            b bVar = (b) next.getValue();
            while (bVar.f397a.compareTo(this.f393b) < 0 && !this.f && this.f392a.contains((d) next.getKey())) {
                d(bVar.f397a);
                bVar.a(eVar, e(bVar.f397a));
                c();
            }
        }
    }

    private boolean b() {
        if (this.f392a.size() == 0) {
            return true;
        }
        c.b bVar = this.f392a.b().getValue().f397a;
        c.b bVar2 = this.f392a.d().getValue().f397a;
        return bVar == bVar2 && this.f393b == bVar2;
    }

    private c.b c(d dVar) {
        Map.Entry<d, b> entryB = this.f392a.b(dVar);
        c.b bVar = null;
        c.b bVar2 = entryB != null ? entryB.getValue().f397a : null;
        if (!this.g.isEmpty()) {
            ArrayList<c.b> arrayList = this.g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.f393b, bVar2), bVar);
    }

    private void c() {
        ArrayList<c.b> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void c(c.b bVar) {
        if (this.f393b == bVar) {
            return;
        }
        this.f393b = bVar;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        d();
        this.e = false;
    }

    private void d() {
        e eVar = this.f394c.get();
        if (eVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (true) {
            boolean zB = b();
            this.f = false;
            if (zB) {
                return;
            }
            if (this.f393b.compareTo(this.f392a.b().getValue().f397a) < 0) {
                a(eVar);
            }
            Map.Entry<d, b> entryD = this.f392a.d();
            if (!this.f && entryD != null && this.f393b.compareTo(entryD.getValue().f397a) > 0) {
                b(eVar);
            }
        }
    }

    private void d(c.b bVar) {
        this.g.add(bVar);
    }

    private static c.a e(c.b bVar) {
        int i = a.f396b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return c.a.ON_START;
            }
            if (i == 3) {
                return c.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return c.a.ON_CREATE;
    }

    @Override // android.arch.lifecycle.c
    public c.b a() {
        return this.f393b;
    }

    public void a(c.a aVar) {
        c(b(aVar));
    }

    public void a(c.b bVar) {
        c(bVar);
    }

    @Override // android.arch.lifecycle.c
    public void a(d dVar) {
        e eVar;
        c.b bVar = this.f393b;
        c.b bVar2 = c.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = c.b.INITIALIZED;
        }
        b bVar3 = new b(dVar, bVar2);
        if (this.f392a.b(dVar, bVar3) == null && (eVar = this.f394c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            c.b bVarC = c(dVar);
            this.d++;
            while (bVar3.f397a.compareTo(bVarC) < 0 && this.f392a.contains(dVar)) {
                d(bVar3.f397a);
                bVar3.a(eVar, e(bVar3.f397a));
                c();
                bVarC = c(dVar);
            }
            if (!z) {
                d();
            }
            this.d--;
        }
    }

    @Override // android.arch.lifecycle.c
    public void b(d dVar) {
        this.f392a.remove(dVar);
    }
}
