package c.a.c.a;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap f1293b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f1294c = null;

    interface a {
        void a(Object obj);
    }

    protected g(Context context) {
        this.f1292a = context;
    }

    private HashMap a(HashMap map) {
        HashMap map2 = new HashMap();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String string = ((String) it.next()).toString();
            map2.put(string, map.get(string));
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
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
        a aVar = this.f1294c;
        if (aVar != null) {
            aVar.a(jSONObject.toString());
        }
    }

    protected void a(HashMap map, String str, int i, String str2, String str3, a aVar) {
        this.f1293b = a(map);
        this.f1294c = aVar;
        new Thread(new h(this, str, i, str2, str3)).start();
    }
}
