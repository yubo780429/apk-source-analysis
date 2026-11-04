package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    public static abstract class a {
        public abstract void a(j jVar, e eVar);

        public abstract void a(j jVar, e eVar, Context context);

        public abstract void a(j jVar, e eVar, Bundle bundle);

        public abstract void a(j jVar, e eVar, View view, Bundle bundle);

        public abstract void b(j jVar, e eVar);

        public abstract void b(j jVar, e eVar, Context context);

        public abstract void b(j jVar, e eVar, Bundle bundle);

        public abstract void c(j jVar, e eVar);

        public abstract void c(j jVar, e eVar, Bundle bundle);

        public abstract void d(j jVar, e eVar);

        public abstract void d(j jVar, e eVar, Bundle bundle);

        public abstract void e(j jVar, e eVar);

        public abstract void f(j jVar, e eVar);

        public abstract void g(j jVar, e eVar);
    }

    public interface b {
        void a();
    }

    public abstract List<e> a();

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract boolean b();

    public abstract boolean c();
}
