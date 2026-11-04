package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class i<E> extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f559c;
    final k d;

    i(Activity activity, Context context, Handler handler, int i) {
        this.d = new k();
        this.f557a = activity;
        b.b.c.f.j.a(context, "context == null");
        this.f558b = context;
        b.b.c.f.j.a(handler, "handler == null");
        this.f559c = handler;
    }

    i(f fVar) {
        this(fVar, fVar, fVar.f552c, 0);
    }

    abstract void a(e eVar);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    Activity b() {
        return this.f557a;
    }

    public abstract boolean b(e eVar);

    Context c() {
        return this.f558b;
    }

    k d() {
        return this.d;
    }

    Handler e() {
        return this.f559c;
    }

    public abstract LayoutInflater f();

    public abstract int g();

    public abstract boolean h();

    public abstract void i();
}
