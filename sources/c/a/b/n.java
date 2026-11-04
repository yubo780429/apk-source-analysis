package c.a.b;

import android.content.Context;
import android.text.TextUtils;
import c.a.b.c.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class n {
    private static String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f1281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    f f1282c;

    public static class a {
        public static final String[] g = {"V", "O", "0"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f1285c;
        private long d;
        private String e;
        private int f = 1;

        public String a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dik", this.f1283a);
                jSONObject.put("v270fk", this.f1284b);
                jSONObject.put("cck", this.f1285c);
                jSONObject.put("vsk", this.f);
                jSONObject.put("ctk", this.d);
                jSONObject.put("ek", this.e);
                return jSONObject.toString();
            } catch (JSONException e) {
                c.a.b.k.c.a(e);
                return null;
            }
        }

        public String b() {
            String str = this.f1284b;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1283a);
            sb.append("|");
            sb.append(str);
            if ("V".equals(str)) {
                sb.append(this.f1285c);
            }
            if (!TextUtils.isEmpty(this.e)) {
                sb.append(this.e);
            }
            return sb.toString().trim();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f == aVar.f && this.f1283a.equals(aVar.f1283a) && this.f1284b.equals(aVar.f1284b) && this.f1285c.equals(aVar.f1285c)) {
                String str = this.e;
                String str2 = aVar.e;
                if (str == str2) {
                    return true;
                }
                if (str != null && str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f1283a, this.f1284b, this.f1285c, this.e, Integer.valueOf(this.f)});
        }
    }

    public n(Context context, c.a.b.i.a aVar, f fVar) {
        if (context == null) {
            throw new NullPointerException("context should not be null!!!");
        }
        this.f1280a = context.getApplicationContext();
        aVar.b().a("bohrium").a();
        this.f1282c = fVar;
        a(aVar);
    }

    public static a a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                String strD = d(str);
                long jCurrentTimeMillis = System.currentTimeMillis();
                a aVar = new a();
                aVar.f1283a = str;
                aVar.f1285c = strD;
                aVar.d = jCurrentTimeMillis;
                aVar.f = 1;
                aVar.e = str3;
                aVar.f1284b = str2;
                return aVar;
            } catch (Exception e) {
                c.a.b.k.c.a(e);
            }
        }
        return null;
    }

    private String a(Context context) {
        String str = d;
        return TextUtils.isEmpty(str) ? "123456" : str;
    }

    private void a(c.a.b.i.a aVar) {
        c cVar = new c(new b());
        c.a.b.c.a.C0051a c0051a = new c.a.b.c.a.C0051a();
        c0051a.f1206a = this.f1280a;
        c0051a.f1207b = aVar;
        c.a.b.c.a.c cVar2 = new c.a.b.c.a.c();
        for (c.a.b.c.a aVar2 : cVar.a()) {
            aVar2.a(c0051a);
            aVar2.a(cVar2);
        }
        this.f1281b = cVar;
    }

    public static a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("dik", "");
            String strOptString2 = jSONObject.optString("cck", "");
            long jOptLong = jSONObject.optLong("ctk", 0L);
            int iOptInt = jSONObject.optInt("vsk", 1);
            String strOptString3 = jSONObject.optString("ek", "");
            String strOptString4 = jSONObject.optString("v270fk", "V");
            if (!TextUtils.isEmpty(strOptString)) {
                a aVar = new a();
                aVar.f1283a = strOptString;
                aVar.f1285c = strOptString2;
                aVar.d = jOptLong;
                aVar.f = iOptInt;
                aVar.e = strOptString3;
                aVar.f1284b = strOptString4;
                return aVar;
            }
        } catch (Exception e) {
            c.a.b.k.c.a(e);
        }
        return null;
    }

    public static void c(String str) {
        d = str;
    }

    private static String d(String str) {
        try {
            return new c.a.b.k.a("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567=", false, false).a(new c.a.b.a.a().a(str.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public a a() {
        a aVar;
        c.a.b.c.a.d dVar = new c.a.b.c.a.d();
        dVar.f1211a = true;
        List listA = this.f1281b.a();
        Collections.sort(listA, c.a.b.c.a.e);
        List<d> listB = this.f1282c.b(this.f1280a);
        if (listB == null) {
            return null;
        }
        for (d dVar2 : listB) {
            if (!dVar2.d && dVar2.f1233c) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    c.a.b.c.a.e eVarA = ((c.a.b.c.a) it.next()).a(dVar2.f1231a.packageName, dVar);
                    if (eVarA != null && eVarA.a() && (aVar = eVarA.f1212a) != null) {
                        return aVar;
                    }
                }
            }
        }
        return null;
    }

    public a a(l lVar) {
        String str;
        if (lVar == null) {
            throw new IllegalArgumentException("arg non-nullable is expected");
        }
        a aVar = new a();
        aVar.d = System.currentTimeMillis();
        aVar.f = 1;
        try {
            boolean z = false;
            aVar.f1284b = lVar.f1276b.substring(0, 1);
            aVar.f1283a = lVar.f1275a;
            aVar.f1285c = d(lVar.f1275a);
            String[] strArr = a.g;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (strArr[i].equals(aVar.f1284b)) {
                    break;
                }
                i++;
            }
            if (z && (str = lVar.f1276b) != null && str.length() >= 2) {
                aVar.e = lVar.f1276b.substring(1);
            }
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public a a(String str) {
        String strA = c.a.b.g.b.a(("com.baidu" + a(this.f1280a)).getBytes(), true);
        a aVar = new a();
        aVar.d = System.currentTimeMillis();
        aVar.f = 1;
        aVar.f1283a = strA;
        aVar.f1284b = "E";
        aVar.f1285c = d(strA);
        aVar.e = "RO";
        return aVar;
    }
}
