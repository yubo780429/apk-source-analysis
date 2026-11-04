package a.a.a.b;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClient f63a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f64b = null;

    public interface a {
        void a(int i, String str);

        void b(int i, String str);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f65a = new q();
    }

    public q() {
        b();
    }

    public static q c() {
        return b.f65a;
    }

    public final Request.Builder a() {
        Request.Builder builder = new Request.Builder();
        builder.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        String str = a.a.a.i.i.o0;
        if (str != null) {
            builder.addHeader("bd-loc-android", str);
        }
        return builder;
    }

    public final synchronized RequestBody a(Map<String, Object> map) {
        StringBuilder sb;
        sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("&");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), sb.toString());
    }

    public void a(String str) {
        this.f64b = str;
    }

    public void a(Map<String, Object> map, String str, a aVar) {
        int iCode;
        try {
            RequestBody requestBodyA = a(map);
            Request.Builder builderA = a();
            String str2 = this.f64b;
            if (str2 != null) {
                builderA.addHeader("alwd", str2);
            }
            Response responseExecute = this.f63a.newCall(builderA.url(str).post(requestBodyA).build()).execute();
            if (!responseExecute.isSuccessful()) {
                iCode = responseExecute.code();
            } else {
                if (responseExecute.body() != null) {
                    aVar.a(200, responseExecute.body().string());
                    return;
                }
                iCode = 400;
            }
            aVar.b(iCode, responseExecute.message());
        } catch (IOException e) {
            e.printStackTrace();
            if (aVar != null) {
                aVar.b(-100, "e=" + e.getMessage());
            }
        }
    }

    public final synchronized void b() {
        if (this.f63a == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            try {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.f63a = builder.connectTimeout(12000L, timeUnit).readTimeout(12000L, timeUnit).writeTimeout(12000L, timeUnit).build();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
