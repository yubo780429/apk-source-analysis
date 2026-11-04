package a.a.a.b;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a.a.a.b.b$b, reason: collision with other inner class name */
    public static class C0001b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7a = new b();
    }

    public b() {
    }

    public static b a() {
        return C0001b.f7a;
    }

    public void a(Context context) {
        Log.d("UrlConfigManger", "updateUrl");
        if (context == null) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getExternalFilesDir(Environment.DIRECTORY_MOVIES));
            String str = File.separator;
            sb.append(str);
            sb.append("baiduLocDev");
            sb.append(str);
            sb.append("loc_local_config");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            try {
                if (!new File(string).exists()) {
                    Log.d("baidu_location_dev", "loc_local_config not exit...");
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(string);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        fileInputStream.close();
                        a(sb2.toString());
                        return;
                    }
                    sb2.append(new String(bArr, 0, i));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final void a(String str, String str2, String str3) {
        Log.d("UrlConfigManger", "setConfig");
        Log.d("baidu_location_dev", "type:" + str + ", owner: " + str2 + " ,url: " + str3);
        if (str2.contains("default_owner") || "default_url".equals(str3) || !str3.contains("https")) {
            Log.d("baidu_location_dev", "url 不合法");
            return;
        }
        str.hashCode();
        switch (str) {
            case "indoor_roadnet":
                a.a.a.i.d.d = str3;
                break;
            case "vdr_log_update":
                a.a.a.i.d.g = str3;
                break;
            case "hdyawupdate":
                a.a.a.i.d.h = str3;
                break;
            case "basement_inout":
                a.a.a.i.d.i = str3;
                break;
            case "indoor_poi_data":
                a.a.a.i.d.f = str3;
                break;
            case "loc":
                a.a.a.i.d.f324b = str3;
                break;
            case "cfgs":
                a.a.a.i.d.f325c = str3;
                break;
            case "indoor_rects":
                a.a.a.i.d.e = str3;
                break;
        }
    }

    public final boolean a(String str) {
        JSONArray jSONArrayOptJSONArray;
        Log.d("UrlConfigManger", "parseConfig");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("url_config") || (jSONArrayOptJSONArray = jSONObject.optJSONArray("url_config")) == null) {
                return true;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                a(jSONObjectOptJSONObject.optString("type"), jSONObjectOptJSONObject.optString("owner"), jSONObjectOptJSONObject.optString("url"));
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }
}
