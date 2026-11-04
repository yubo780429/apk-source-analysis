package c.d.a.a;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class f extends a {
    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(Context context, com.mobiletools.systemhelper.control.b bVar) {
        super.a(context, bVar);
        bVar.d = Build.DISPLAY.split("\\s+")[1];
        bVar.f1415c = c.d.a.b.l.a("ro.board.hardware_version");
        if (!c.d.a.b.d.e) {
            c.d.a.b.h.b("DeviceInfoReaderPTAC", "isUserPermissionOpen==false, do not read!");
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            b(context, bVar);
            return;
        }
        c.d.a.b.h.b("DeviceInfoReaderPTAC", "Unsupported API:" + Build.VERSION.SDK_INT);
    }
}
