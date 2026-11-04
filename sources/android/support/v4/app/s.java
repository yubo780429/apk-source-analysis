package android.support.v4.app;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static <T extends android.arch.lifecycle.e & android.arch.lifecycle.q> s a(T t) {
        return new LoaderManagerImpl(t, t.b());
    }

    public abstract void a();

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
