package android.support.v4.app;

import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
class LoaderManagerImpl extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f528c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.arch.lifecycle.e f529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LoaderViewModel f530b;

    static class LoaderViewModel extends android.arch.lifecycle.n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final android.arch.lifecycle.o.a f531b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b.b.c.f.l<a> f532a = new b.b.c.f.l<>();

        static class a implements android.arch.lifecycle.o.a {
            a() {
            }

            @Override // android.arch.lifecycle.o.a
            public <T extends android.arch.lifecycle.n> T a(Class<T> cls) {
                return new LoaderViewModel();
            }
        }

        LoaderViewModel() {
        }

        static LoaderViewModel a(android.arch.lifecycle.p pVar) {
            return (LoaderViewModel) new android.arch.lifecycle.o(pVar, f531b).a(LoaderViewModel.class);
        }

        @Override // android.arch.lifecycle.n
        protected void a() {
            super.a();
            int iB = this.f532a.b();
            b.b.c.f.l<a> lVar = this.f532a;
            if (iB <= 0) {
                lVar.a();
            } else {
                lVar.e(0).a(true);
                throw null;
            }
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f532a.b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f532a.b() <= 0) {
                    return;
                }
                a aVarE = this.f532a.e(0);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f532a.c(0));
                printWriter.print(": ");
                printWriter.println(aVarE.toString());
                aVarE.a(str2, fileDescriptor, printWriter, strArr);
                throw null;
            }
        }

        void b() {
            int iB = this.f532a.b();
            for (int i = 0; i < iB; i++) {
                this.f532a.e(i).d();
            }
        }
    }

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<D>] */
    public static class a<D> extends android.arch.lifecycle.j<D> {
        private final int j;
        private final Bundle k;
        private final b.b.c.a.b<D> l;
        private android.arch.lifecycle.e m;
        private b<D> n;
        private b.b.c.a.b<D> o;

        b.b.c.a.b<D> a(boolean z) {
            if (LoaderManagerImpl.f528c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.l.a();
            throw null;
        }

        @Override // android.arch.lifecycle.LiveData
        protected void a() {
            if (LoaderManagerImpl.f528c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.l.c();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.arch.lifecycle.LiveData
        public void a(android.arch.lifecycle.k<? super D> kVar) {
            super.a((android.arch.lifecycle.k) kVar);
            this.m = null;
            this.n = null;
        }

        @Override // android.arch.lifecycle.j, android.arch.lifecycle.LiveData
        public void a(D d) {
            super.a(d);
            b.b.c.a.b<D> bVar = this.o;
            if (bVar == null) {
                return;
            }
            bVar.b();
            throw null;
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.j);
            printWriter.print(" mArgs=");
            printWriter.println(this.k);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.l);
            this.l.a(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        @Override // android.arch.lifecycle.LiveData
        protected void b() {
            if (LoaderManagerImpl.f528c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.l.d();
            throw null;
        }

        void d() {
            android.arch.lifecycle.e eVar = this.m;
            b<D> bVar = this.n;
            if (eVar == null || bVar == null) {
                return;
            }
            super.a((android.arch.lifecycle.k) bVar);
            a(eVar, bVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.j);
            sb.append(" : ");
            b.b.c.f.d.a(this.l, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    static class b<D> implements android.arch.lifecycle.k<D> {
    }

    LoaderManagerImpl(android.arch.lifecycle.e eVar, android.arch.lifecycle.p pVar) {
        this.f529a = eVar;
        this.f530b = LoaderViewModel.a(pVar);
    }

    @Override // android.support.v4.app.s
    public void a() {
        this.f530b.b();
    }

    @Override // android.support.v4.app.s
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f530b.a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        b.b.c.f.d.a(this.f529a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
