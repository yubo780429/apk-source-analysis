package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {
    private static final Object i = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f373a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.a.a.b.b<k<T>, LiveData<T>.b> f374b = new b.a.a.b.b<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f375c = 0;
    private volatile Object d = i;
    private volatile Object e = i;
    private int f = -1;
    private boolean g;
    private boolean h;

    class LifecycleBoundObserver extends LiveData<T>.b implements GenericLifecycleObserver {
        final e e;

        LifecycleBoundObserver(e eVar, k<T> kVar) {
            super(kVar);
            this.e = eVar;
        }

        @Override // android.arch.lifecycle.LiveData.b
        void a() {
            this.e.a().b(this);
        }

        @Override // android.arch.lifecycle.GenericLifecycleObserver
        public void a(e eVar, c.a aVar) {
            if (this.e.a().a() == c.b.DESTROYED) {
                LiveData.this.a((k) this.f377a);
            } else {
                a(b());
            }
        }

        @Override // android.arch.lifecycle.LiveData.b
        boolean b() {
            return this.e.a().a().a(c.b.STARTED);
        }

        @Override // android.arch.lifecycle.LiveData.b
        boolean g(e eVar) {
            return this.e == eVar;
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f373a) {
                obj = LiveData.this.e;
                LiveData.this.e = LiveData.i;
            }
            LiveData.this.a(obj);
        }
    }

    private abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k<T> f377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f379c = -1;

        b(k<T> kVar) {
            this.f377a = kVar;
        }

        void a() {
        }

        void a(boolean z) {
            if (z == this.f378b) {
                return;
            }
            this.f378b = z;
            boolean z2 = LiveData.this.f375c == 0;
            LiveData.this.f375c += this.f378b ? 1 : -1;
            if (z2 && this.f378b) {
                LiveData.this.a();
            }
            if (LiveData.this.f375c == 0 && !this.f378b) {
                LiveData.this.b();
            }
            if (this.f378b) {
                LiveData.this.b(this);
            }
        }

        abstract boolean b();

        boolean g(e eVar) {
            return false;
        }
    }

    public LiveData() {
        new a();
    }

    private void a(LiveData<T>.b bVar) {
        if (bVar.f378b) {
            if (!bVar.b()) {
                bVar.a(false);
                return;
            }
            int i2 = bVar.f379c;
            int i3 = this.f;
            if (i2 >= i3) {
                return;
            }
            bVar.f379c = i3;
            bVar.f377a.a((T) this.d);
        }
    }

    private static void a(String str) {
        if (b.a.a.a.a.b().a()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(LiveData<T>.b bVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (bVar != null) {
                a((b) bVar);
                bVar = null;
            } else {
                b.a.a.b.b<k<T>, LiveData<T>.b>.e eVarC = this.f374b.c();
                while (eVarC.hasNext()) {
                    a((b) eVarC.next().getValue());
                    if (this.h) {
                        break;
                    }
                }
            }
        } while (this.h);
        this.g = false;
    }

    protected void a() {
    }

    public void a(e eVar, k<T> kVar) {
        if (eVar.a().a() == c.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(eVar, kVar);
        LiveData<T>.b bVarB = this.f374b.b(kVar, lifecycleBoundObserver);
        if (bVarB != null && !bVarB.g(eVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (bVarB != null) {
            return;
        }
        eVar.a().a(lifecycleBoundObserver);
    }

    public void a(k<T> kVar) {
        a("removeObserver");
        LiveData<T>.b bVarRemove = this.f374b.remove(kVar);
        if (bVarRemove == null) {
            return;
        }
        bVarRemove.a();
        bVarRemove.a(false);
    }

    protected void a(T t) {
        a("setValue");
        this.f++;
        this.d = t;
        b((b) null);
    }

    protected void b() {
    }
}
