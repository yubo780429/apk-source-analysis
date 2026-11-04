package c.d.a.a;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class l extends a {
    private String a(com.mobiletools.systemhelper.control.b bVar) {
        return c.d.a.b.l.a(bVar.f1414b.equals("2106118C") ? "ro.build.hardware.version" : "ro.miui.cust_hardware");
    }

    private boolean d(Context context) {
        Boolean boolValueOf = Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) == 1);
        c.d.a.b.h.a("DeviceInfoReaderXiaomi", "isBootWizardCompleted: " + boolValueOf);
        return boolValueOf.booleanValue();
    }

    private String g(Context context) {
        String string = Settings.Global.getString(context.getContentResolver(), "miui_version_name");
        String strA = c.d.a.b.l.a("ro.build.version.incremental");
        if (!TextUtils.isEmpty(string) && string.length() > 1) {
            return string.replaceAll("\r|\n", "");
        }
        if (strA == null || strA.length() == 0) {
            return strA;
        }
        int iLastIndexOf = strA.lastIndexOf(".");
        String strSubstring = strA.substring(1, iLastIndexOf);
        return "MIUI " + strSubstring.substring(0, strSubstring.indexOf(".", strSubstring.indexOf(".", strSubstring.indexOf(".") + 1) + 1)) + strSubstring + "(" + strA.substring(iLastIndexOf + 1) + ")";
    }

    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(Context context, com.mobiletools.systemhelper.control.b bVar) {
        super.a(context, bVar);
        boolean zD = d(context);
        c.d.a.b.d.e = zD;
        if (zD) {
            c.d.a.b.h.a("DeviceInfoReaderXiaomi", "GlobalSetting.isUserPermissionOpen" + c.d.a.b.d.e);
            bVar.f1415c = a(bVar);
            bVar.d = g(context);
            if (Build.VERSION.SDK_INT >= 33) {
                b(context, bVar);
                return;
            }
            c.d.a.b.h.b("DeviceInfoReaderXiaomi", "Unsupported API:" + Build.VERSION.SDK_INT);
        }
    }
}
