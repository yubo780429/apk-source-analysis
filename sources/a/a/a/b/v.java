package a.a.a.b;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HandlerThread f85a;

    public static synchronized HandlerThread a() {
        if (f85a == null) {
            try {
                HandlerThread handlerThread = new HandlerThread("ServiceStartArguments", 10);
                f85a = handlerThread;
                handlerThread.start();
            } catch (Throwable th) {
                th.printStackTrace();
                f85a = null;
            }
        }
        return f85a;
    }
}
