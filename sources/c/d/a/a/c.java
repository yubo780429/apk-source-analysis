package c.d.a.a;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public class c extends a {
    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(Context context, com.mobiletools.systemhelper.control.b bVar) {
        super.a(context, bVar);
        if (!c.d.a.b.d.e) {
            c.d.a.b.h.b("DeviceInfoReaderNubia", "isUserPermissionOpen==false, do not read!");
            return;
        }
        if (!bVar.f1414b.equals("NX659J") && !bVar.f1414b.equals("NX651J") && !bVar.f1414b.equals("angelcare N9") && !bVar.f1414b.equals("NX724J")) {
            c.d.a.b.h.b("DeviceInfoReaderNubia", "DeviceInfoReaderNubia model unknow!!!");
            return;
        }
        c.d.a.b.h.a("DeviceInfoReaderNubia", "model : angelcare N9");
        bVar.d = c.d.a.b.l.a("ro.build.display.id");
        bVar.f1415c = c.d.a.b.l.a("ro.product.hardware");
        b(context, bVar);
    }
}
