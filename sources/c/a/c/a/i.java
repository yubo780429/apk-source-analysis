package c.a.c.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f1298b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f1299c = null;

    interface a {
        void a(Object obj);
    }

    protected i(Context context) {
        this.f1297a = context;
    }

    private List a(HashMap map, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        if (strArr == null || strArr.length <= 0) {
            HashMap map2 = new HashMap();
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                String string = ((String) it.next()).toString();
                map2.put(string, map.get(string));
            }
            arrayList.add(map2);
        } else {
            for (String str : strArr) {
                HashMap map3 = new HashMap();
                Iterator it2 = map.keySet().iterator();
                while (it2.hasNext()) {
                    String string2 = ((String) it2.next()).toString();
                    map3.put(string2, map.get(string2));
                }
                map3.put("mcode", str);
                arrayList.add(map3);
            }
        }
        return arrayList;
    }

    private void a(String str) {
        JSONObject jSONObject;
        if (str == null) {
            str = "";
        }
        try {
            jSONObject = new JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("status", -1);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        a aVar = this.f1299c;
        if (aVar != null) {
            aVar.a(jSONObject.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list, String str, int i, String str2, String str3) throws Throwable {
        int i2;
        d.a("syncConnect start Thread id = " + String.valueOf(Thread.currentThread().getId()));
        if (list == null || list.size() == 0) {
            d.c("syncConnect failed,params list is null or size is 0");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < list.size()) {
            d.a("syncConnect resuest " + i3 + "  start!!!");
            HashMap map = (HashMap) list.get(i3);
            k kVar = new k(this.f1297a);
            if (kVar.a()) {
                String strA = kVar.a(map, str, i, str2, str3);
                if (strA == null) {
                    strA = "";
                }
                d.a("syncConnect resuest " + i3 + "  result:" + strA);
                arrayList.add(strA);
                try {
                    JSONObject jSONObject = new JSONObject(strA);
                    if (jSONObject.has("status") && jSONObject.getInt("status") == 0) {
                        d.a("auth end and break");
                        a(strA);
                        return;
                    }
                } catch (JSONException unused) {
                    d.a("continue-------------------------------");
                }
            } else {
                d.a("Current network is not available.");
                arrayList.add(c.a.c.a.a.a("Current network is not available."));
            }
            d.a("syncConnect end");
            i3++;
        }
        d.a("--iiiiii:" + i3 + "<><>paramList.size():" + list.size() + "<><>authResults.size():" + arrayList.size());
        if (list.size() <= 0 || i3 != list.size() || arrayList.size() <= 0 || i3 != arrayList.size() || (i2 = i3 - 1) <= 0) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject((String) arrayList.get(i2));
            if (!jSONObject2.has("status") || jSONObject2.getInt("status") == 0) {
                return;
            }
            d.a("i-1 result is not 0,return first result");
            a((String) arrayList.get(0));
        } catch (JSONException e) {
            a(c.a.c.a.a.a("JSONException:" + e.getMessage()));
        }
    }

    protected void a(HashMap map, String[] strArr, String str, int i, String str2, String str3, a aVar) {
        this.f1298b = a(map, strArr);
        this.f1299c = aVar;
        new Thread(new j(this, str, i, str2, str3)).start();
    }
}
