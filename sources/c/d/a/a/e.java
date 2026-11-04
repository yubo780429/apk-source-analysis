package c.d.a.a;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class e extends a {
    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(Context context, com.mobiletools.systemhelper.control.b bVar) {
        super.a(context, bVar);
        if (Build.VERSION.SDK_INT >= 33) {
            b(context, bVar);
            return;
        }
        c.d.a.b.h.b("DeviceInfoReaderOnePlus", "Unsupported API:" + Build.VERSION.SDK_INT);
    }
}
