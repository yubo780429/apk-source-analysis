package c.d.a.a;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class m extends a {
    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(Context context, com.mobiletools.systemhelper.control.b bVar) {
        super.a(context, bVar);
        bVar.f1415c = c.d.a.b.l.b("ro.product.hardware", "UnKnow");
        bVar.d = Build.DISPLAY;
        if (!c.d.a.b.d.e) {
            c.d.a.b.h.b("DeviceInfoReaderZTE", "isUserPermissionOpen==false, do not read!");
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            b(context, bVar);
            return;
        }
        c.d.a.b.h.b("DeviceInfoReaderZTE", "Unsupported API:" + Build.VERSION.SDK_INT);
    }
}
