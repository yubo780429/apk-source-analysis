package a.a.a.c;

import a.a.a.b.w;
import a.a.a.i.g;
import a.a.a.i.i;
import android.net.wifi.WifiConfiguration;
import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import com.baidu.location.Jni;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static Object f = new Object();
    public static f g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f118a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f119b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f120c = 24;
    public b d = null;
    public long e = 0;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            f.this.c();
        }
    }

    public class b extends g {
        public boolean i = false;
        public int j = 0;
        public JSONArray k = null;
        public JSONArray l = null;

        public b() {
            this.d = new HashMap();
        }

        @Override // a.a.a.i.g
        public void a() {
            this.f337a = i.j();
            this.d.clear();
            this.d.put("qt", "cltrw");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("data", this.k);
                jSONObject.put("frt", this.j);
            } catch (Exception e) {
                e.printStackTrace();
            }
            String strE = Jni.e(jSONObject.toString());
            this.d.put("cltr[0]", "" + strE);
            this.d.put("cfg", 1);
            this.d.put("info", Jni.b(a.a.a.i.b.e().a()));
            this.d.put("trtm", String.format(Locale.CHINA, "%d", Long.valueOf(System.currentTimeMillis())));
        }

        @Override // a.a.a.i.g
        public void a(boolean z) {
            JSONObject jSONObject;
            boolean z2;
            if (z && this.f339c != null) {
                try {
                    jSONObject = new JSONObject(this.f339c);
                    z2 = true;
                } catch (Exception unused) {
                    jSONObject = null;
                    z2 = false;
                }
                if (z2 && jSONObject != null) {
                    try {
                        jSONObject.put("tt", System.currentTimeMillis());
                        jSONObject.put("data", this.l);
                        try {
                            File file = new File(f.this.f119b, "wcnf.dat");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
                            bufferedWriter.write(new String(Base64.encode(jSONObject.toString().getBytes(), 0), "UTF-8"));
                            bufferedWriter.flush();
                            bufferedWriter.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            this.i = false;
        }

        public void a(boolean z, JSONArray jSONArray, JSONArray jSONArray2) {
            if (this.i) {
                return;
            }
            this.i = true;
            if (z) {
                this.j = 1;
            } else {
                this.j = 0;
            }
            this.k = jSONArray;
            this.l = jSONArray2;
            ExecutorService executorServiceB = w.d().b();
            if (executorServiceB != null) {
                a(executorServiceB, i.j());
            } else {
                a(i.j());
            }
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f123b;

        public c(f fVar, String str, int i) {
            this.f122a = null;
            this.f123b = 0;
            this.f122a = str;
            this.f123b = i;
        }
    }

    public static f d() {
        f fVar;
        synchronized (f) {
            if (g == null) {
                g = new f();
            }
            fVar = g;
        }
        return fVar;
    }

    public final List<c> a(List<WifiConfiguration> list) {
        int iIntValue;
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (WifiConfiguration wifiConfiguration : list) {
            String str = wifiConfiguration.SSID;
            try {
                iIntValue = ((Integer) i.a(wifiConfiguration, "numAssociation")).intValue();
            } catch (Throwable unused) {
                iIntValue = 0;
            }
            if (iIntValue > 0 && str != null) {
                arrayList.add(new c(this, str, iIntValue));
            }
        }
        return arrayList;
    }

    public void a() {
        Handler handler;
        if (System.currentTimeMillis() - this.e <= 3600000 || (handler = this.f118a) == null) {
            return;
        }
        handler.sendEmptyMessage(1);
        this.e = System.currentTimeMillis();
    }

    public final void a(boolean z, JSONArray jSONArray, JSONArray jSONArray2) {
        if (this.d == null) {
            this.d = new b();
        }
        if (i.l()) {
            return;
        }
        this.d.a(z, jSONArray, jSONArray2);
    }

    public void b() {
        if (this.f118a == null) {
            this.f118a = new a();
        }
        this.f119b = i.h();
    }

    /* JADX WARN: Code duplicated, block: B:116:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd A[ADDED_TO_REGION] */
    public final void c() {
        boolean z;
        HashMap map;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        boolean z2;
        if (this.f119b != null) {
            try {
                File file = new File(this.f119b, "wcnf.dat");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (file.exists()) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        StringBuffer stringBuffer = new StringBuffer();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            } else {
                                stringBuffer.append(line);
                            }
                            map = null;
                            e.printStackTrace();
                        }
                        bufferedReader.close();
                        String string = stringBuffer.toString();
                        if (string != null) {
                            JSONObject jSONObject = new JSONObject(new String(Base64.decode(string.getBytes(), 0)));
                            z = (jSONObject.has("ison") && jSONObject.getInt("ison") == 0) ? false : true;
                            try {
                                if (jSONObject.has("cfg")) {
                                    JSONObject jSONObject2 = jSONObject.getJSONObject("cfg");
                                    if (jSONObject2.has("frq")) {
                                        this.f120c = jSONObject2.getInt("frq");
                                    }
                                }
                                if (jSONObject.has("tt")) {
                                    jCurrentTimeMillis = jSONObject.getLong("tt");
                                }
                                if (jSONObject.has("data")) {
                                    JSONArray jSONArray3 = jSONObject.getJSONArray("data");
                                    map = new HashMap();
                                    try {
                                        int length = jSONArray3.length();
                                        for (int i = 0; i < length; i++) {
                                            JSONObject jSONObject3 = jSONArray3.getJSONObject(i);
                                            if (jSONObject3.has("ssid") && jSONObject3.has("num")) {
                                                map.put(jSONObject3.getString("ssid"), new c(this, jSONObject3.getString("ssid"), jSONObject3.getInt("num")));
                                            }
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        e.printStackTrace();
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                map = null;
                            }
                        } else {
                            z = true;
                        }
                        map = null;
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                    }
                } else {
                    jCurrentTimeMillis = 0;
                    map = null;
                    z = true;
                }
                if (!z) {
                    this.f120c *= 4;
                }
                if (System.currentTimeMillis() - jCurrentTimeMillis > this.f120c * 60 * 60 * 1000) {
                    List<c> listA = a(a.a.a.g.f.w().i());
                    if (jCurrentTimeMillis == 0) {
                        if (listA != null && listA.size() > 0) {
                            JSONArray jSONArray4 = new JSONArray();
                            jSONArray = new JSONArray();
                            for (c cVar : listA) {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("ssid", cVar.f122a);
                                jSONObject4.put("num", cVar.f123b);
                                jSONArray4.put(jSONObject4);
                                jSONArray.put(jSONObject4);
                            }
                            jSONArray2 = jSONArray4;
                            z2 = true;
                        }
                        if (jSONArray2 != null || jSONArray == null) {
                        }
                        a(z2, jSONArray2, jSONArray);
                        return;
                    }
                    if (listA != null && listA.size() > 0) {
                        jSONArray = new JSONArray();
                        if (map != null && map.size() > 0) {
                            JSONArray jSONArray5 = null;
                            for (c cVar2 : listA) {
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("ssid", cVar2.f122a);
                                jSONObject5.put("num", cVar2.f123b);
                                jSONArray.put(jSONObject5);
                                if ((map.containsKey(cVar2.f122a) && cVar2.f123b == ((c) map.get(cVar2.f122a)).f123b) ? false : true) {
                                    if (jSONArray5 == null) {
                                        jSONArray5 = new JSONArray();
                                    }
                                    JSONArray jSONArray6 = jSONArray5;
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.put("ssid", cVar2.f122a);
                                    jSONObject6.put("num", cVar2.f123b);
                                    jSONArray6.put(jSONObject6);
                                    jSONArray5 = jSONArray6;
                                }
                            }
                            jSONArray2 = jSONArray5;
                        }
                        z2 = false;
                        if (jSONArray2 != null) {
                        }
                    }
                    jSONArray2 = null;
                    z2 = false;
                    if (jSONArray2 != null) {
                    }
                    jSONArray = null;
                    jSONArray2 = null;
                    z2 = false;
                    if (jSONArray2 != null) {
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }
}
