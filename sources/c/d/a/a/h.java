package c.d.a.a;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public class h extends a {
    private boolean d(Context context) {
        Boolean boolValueOf = Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) == 1);
        c.d.a.b.h.a("DeviceInfoReaderSamSung", "isBootWizardCompleted: " + boolValueOf);
        return boolValueOf.booleanValue();
    }

    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(Context context, com.mobiletools.systemhelper.control.b bVar) {
        super.a(context, bVar);
        c.d.a.b.h.a("DeviceInfoReaderSamSung", "DeviceInfoReaderSamSung module:" + Build.MODEL);
        bVar.d = c.d.a.b.l.a("ril.sw_ver");
        bVar.f1415c = c.d.a.b.l.a("ril.hw_ver");
        c.d.a.b.d.e = d(context);
        c.d.a.b.h.a("DeviceInfoReaderSamSung", "GlobalSetting.isUserPermissionOpen" + c.d.a.b.d.e);
        if (!c.d.a.b.d.e) {
            c.d.a.b.h.b("DeviceInfoReaderSamSung", "isUserPermissionOpen==false, do not read!");
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            b(context, bVar);
            return;
        }
        c.d.a.b.h.b("DeviceInfoReaderSamSung", "Unsupported API:" + Build.VERSION.SDK_INT);
    }
}
