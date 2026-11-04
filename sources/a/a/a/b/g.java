package a.a.a.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Object f22b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g f23c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24a = -1;

    public static g b() {
        g gVar;
        synchronized (f22b) {
            if (f23c == null) {
                f23c = new g();
            }
            gVar = f23c;
        }
        return gVar;
    }

    public void a() {
        this.f24a = -1;
    }

    public void a(int i, int i2, String str) {
        if (i2 != this.f24a) {
            this.f24a = i2;
            Bundle bundle = new Bundle();
            bundle.putInt("loctype", i);
            bundle.putInt("diagtype", i2);
            bundle.putByteArray("diagmessage", str.getBytes());
            c.h().a(bundle, 303);
        }
    }
}
