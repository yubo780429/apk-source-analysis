package c.a.b;

import android.text.TextUtils;
import c.a.b.e.a.g;
import c.a.b.g.a;
import c.a.b.k.c;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1277c = 0;

    public static l a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        l lVar = new l();
        lVar.f1275a = str;
        int length = TextUtils.isEmpty(str2) ? 0 : str2.length();
        lVar.f1277c = length;
        if (length < 14) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "0";
            }
            lVar.f1276b = str2;
        }
        return lVar;
    }

    public static boolean a(int i) {
        return i >= 14;
    }

    public static boolean a(String str) {
        return TextUtils.isEmpty(str);
    }

    public static l b(String str) {
        return c(e(str));
    }

    private static l c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            String str2 = "0";
            String strOptString = "0";
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!d("ZGV2aWNlaWQ=").equals(next) && !d("dmVy").equals(next)) {
                    strOptString = jSONObject.optString(next, "0");
                }
            }
            String string = jSONObject.getString(d("ZGV2aWNlaWQ="));
            jSONObject.getInt(d("dmVy"));
            int length = TextUtils.isEmpty(strOptString) ? 0 : strOptString.length();
            if (!TextUtils.isEmpty(string)) {
                l lVar = new l();
                lVar.f1275a = string;
                lVar.f1277c = length;
                if (length < 14) {
                    if (!TextUtils.isEmpty(strOptString)) {
                        str2 = strOptString;
                    }
                    lVar.f1276b = str2;
                }
                lVar.c();
                return lVar;
            }
        } catch (JSONException e) {
            c.a(e);
        }
        return null;
    }

    private static String d(String str) {
        return new String(a.a(str.getBytes()));
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrA = g.a();
            return new String(c.a.b.e.a.c.a(bArrA, bArrA, a.a(str.getBytes())));
        } catch (Exception e) {
            c.a(e);
            return "";
        }
    }

    boolean a() {
        return a(this.f1276b);
    }

    boolean b() {
        return a(this.f1277c);
    }

    boolean c() {
        String str;
        if (b()) {
            str = "O";
        } else {
            if (!a()) {
                return false;
            }
            str = "0";
        }
        this.f1276b = str;
        return true;
    }
}
