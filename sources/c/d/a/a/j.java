package c.d.a.a;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public class j extends a {
    private String b() {
        String strA = c.d.a.b.l.a("ro.vivo.hardware_version");
        return (strA == null || strA.isEmpty()) ? "MP_0.1" : strA;
    }

    private String c() {
        return c.d.a.b.l.a(d() ? "ro.vivo.op.entry.version" : "ro.vivo.product.version");
    }

    private boolean d() {
        String upperCase = c.d.a.b.l.a("ro.vivo.op.entry").toUpperCase();
        c.d.a.b.h.a("DeviceInfoReaderVIVO", "isUnicomEntry-->opEntry:" + upperCase);
        return upperCase.contains("UNICOM");
    }

    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(Context context, com.mobiletools.systemhelper.control.b bVar) {
        super.a(context, bVar);
        c.d.a.b.d.e = d(context);
        c.d.a.b.h.a("DeviceInfoReaderVIVO", "GlobalSetting.isUserPermissionOpen" + c.d.a.b.d.e);
        if (!c.d.a.b.d.e) {
            c.d.a.b.h.b("DeviceInfoReaderVIVO", "isUserPermissionOpen==false, do not read!");
            return;
        }
        bVar.f1415c = b();
        bVar.d = c();
        if (Build.VERSION.SDK_INT >= 33) {
            c.d.a.b.h.a("DeviceInfoReaderVIVO", "enter DeviceInfoReaderVIVO read vivo");
            c(context, bVar);
        } else {
            c.d.a.b.h.b("DeviceInfoReaderVIVO", "Unsupported API:" + Build.VERSION.SDK_INT);
        }
    }

    protected boolean d(Context context) {
        boolean z = false;
        Boolean boolValueOf = Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) == 1);
        c.d.a.b.h.a("DeviceInfoReaderVIVO", "isBootWizardCompleted: " + boolValueOf);
        if (boolValueOf.booleanValue()) {
            z = Settings.Secure.getInt(context.getContentResolver(), "operator_service_improve_plan", 0) == 1;
            c.d.a.b.h.a("DeviceInfoReaderVIVO", "checkUserPermission:" + z);
        }
        return z;
    }
}
