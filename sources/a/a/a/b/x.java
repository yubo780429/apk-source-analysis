package a.a.a.b;

import android.annotation.TargetApi;
import android.location.GnssNavigationMessage;
import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f89a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f90b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f91c = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static x f92a = new x();
    }

    public class b extends a.a.a.i.g {
        public boolean i = false;
        public String j = null;
        public long k = 0;

        public b(x xVar) {
            this.d = new HashMap();
        }

        @Override // a.a.a.i.g
        public void a() {
            String strA = a.a.a.i.b.e().a();
            if (strA != null) {
                strA = strA + "&gnsst=" + this.k;
            }
            String strB = n.b().b(strA);
            String strReplaceAll = !TextUtils.isEmpty(strB) ? strB.trim().replaceAll("\r|\n", "") : "null";
            String strB2 = n.b().b(this.j);
            String strReplaceAll2 = TextUtils.isEmpty(strB2) ? "null" : strB2.trim().replaceAll("\r|\n", "");
            try {
                this.d.put("info", URLEncoder.encode(strReplaceAll, "utf-8"));
                this.d.put("enl", URLEncoder.encode(strReplaceAll2, "utf-8"));
            } catch (Exception unused) {
            }
        }

        public void a(String str, long j) {
            if (this.i) {
                return;
            }
            this.i = true;
            this.j = str;
            this.k = j;
            ExecutorService executorServiceB = w.d().b();
            if (executorServiceB != null) {
                a(executorServiceB, "https://ofloc.map.baidu.com/locnu");
            } else {
                a("https://ofloc.map.baidu.com/locnu");
            }
        }

        @Override // a.a.a.i.g
        public void a(boolean z) {
            if (z && this.f339c != null) {
                try {
                    new JSONObject(this.f339c);
                } catch (Throwable unused) {
                }
            }
            Map<String, Object> map = this.d;
            if (map != null) {
                map.clear();
            }
            this.i = false;
        }

        public boolean b() {
            return this.i;
        }
    }

    public static x b() {
        return a.f92a;
    }

    public void a() {
        ArrayList<String> arrayListA;
        if (this.f90b == 0 || Math.abs(System.currentTimeMillis() - this.f90b) >= 20000) {
            return;
        }
        if (this.f89a == null) {
            this.f89a = new b(this);
        }
        b bVar = this.f89a;
        if (bVar == null || bVar.b() || (arrayListA = s.c().a()) == null || arrayListA.size() <= 0) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        Iterator<String> it = arrayListA.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            i++;
            if (i != arrayListA.size()) {
                stringBuffer.append(";");
            }
        }
        this.f89a.a(stringBuffer.toString(), this.f91c);
    }

    @TargetApi(24)
    public void a(GnssNavigationMessage gnssNavigationMessage, long j) {
        s.c().a(gnssNavigationMessage, j);
        this.f90b = System.currentTimeMillis();
        this.f91c = j;
    }
}
