package a.a.a.d;

import a.a.a.b.w;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends a.a.a.i.g {
    public static HashMap<String, Long> s = new HashMap<>();
    public Context k;
    public String m;
    public b o;
    public Handler q;
    public Runnable r;
    public String i = "https://loc.map.baidu.com/indoorlocbuildinginfo.php";
    public final SimpleDateFormat j = new SimpleDateFormat("yyyyMM");
    public String p = null;
    public HashSet<String> n = new HashSet<>();
    public boolean l = false;

    /* JADX INFO: renamed from: a.a.a.d.a$a, reason: collision with other inner class name */
    public class RunnableC0005a implements Runnable {
        public RunnableC0005a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.p != null) {
                a aVar = a.this;
                aVar.m = aVar.p;
                ExecutorService executorServiceB = w.d().b();
                a aVar2 = a.this;
                if (executorServiceB != null) {
                    aVar2.a(executorServiceB, aVar2.i);
                } else {
                    aVar2.a(aVar2.i);
                }
            }
        }
    }

    public interface b {
        void a(boolean z);
    }

    public a(Context context) {
        this.k = context;
        this.d = new HashMap();
        this.q = new Handler();
        this.r = new RunnableC0005a();
    }

    public final String a(Date date) {
        File file = new File(this.k.getCacheDir(), a.a.a.i.i.a((this.m + this.j.format(date)).getBytes(), false));
        if (!file.isFile()) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                str = str + line + "\n";
            }
            bufferedReader.close();
            if (!str.equals("")) {
                return new String(Base64.decode(str.getBytes(), 0));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // a.a.a.i.g
    public void a() {
        this.f337a = this.i;
        this.d.clear();
        this.d.put("bid", "none");
        this.d.put("bldg", this.m);
        this.d.put("mb", Build.MODEL);
        this.d.put("msdk", "2.0");
        this.d.put("cuid", a.a.a.i.b.e().f321c);
        this.d.put("anchors", "v1");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    @Override // a.a.a.i.g
    public void a(boolean z) {
        boolean z2;
        String str;
        String strOptString;
        if (!z || (str = this.f339c) == null) {
            z2 = false;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(str.getBytes(), 0)));
                if (!jSONObject.has("anchorinfo") || (strOptString = jSONObject.optString("anchorinfo")) == null || strOptString.equals("")) {
                    z2 = false;
                } else {
                    this.n.clear();
                    e(strOptString);
                    f(strOptString);
                    try {
                        c();
                    } catch (Exception unused) {
                    }
                    z2 = true;
                }
            } catch (Exception unused2) {
            }
        }
        if (!z2 && this.p == null) {
            this.p = this.m;
            this.q.postDelayed(this.r, 60000L);
        } else if (z2) {
            this.p = null;
        } else {
            g(this.p);
            this.p = null;
            String strA = a(d());
            if (strA != null) {
                e(strA);
                b bVar = this.o;
                if (bVar != null) {
                    bVar.a(true);
                }
            }
        }
        this.l = false;
        b bVar2 = this.o;
        if (bVar2 != null) {
            bVar2.a(z2);
        }
    }

    public boolean a(String str, b bVar) {
        if (!this.l) {
            this.o = bVar;
            this.l = true;
            this.m = str;
            try {
                String strA = a(new Date());
                if (strA == null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (s.get(str) == null || jCurrentTimeMillis - s.get(str).longValue() > 86400000) {
                        s.put(str, Long.valueOf(jCurrentTimeMillis));
                        ExecutorService executorServiceB = w.d().b();
                        if (executorServiceB != null) {
                            a(executorServiceB, this.i);
                        } else {
                            a(this.i);
                        }
                    }
                } else {
                    e(strA);
                    b bVar2 = this.o;
                    if (bVar2 != null) {
                        bVar2.a(true);
                    }
                    this.l = false;
                }
            } catch (Exception unused) {
                this.l = false;
            }
        }
        return false;
    }

    public void b() {
        this.m = null;
        this.n.clear();
    }

    public final void c() {
        try {
            File file = new File(this.k.getCacheDir(), a.a.a.i.i.a((this.m + this.j.format(d())).getBytes(), false));
            if (file.isFile()) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    public boolean c(String str) {
        String str2 = this.m;
        return (str2 == null || !str2.equalsIgnoreCase(str) || this.n.isEmpty()) ? false : true;
    }

    public final Date d() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, -1);
        return calendar.getTime();
    }

    public boolean d(String str) {
        HashSet<String> hashSet;
        return (this.m == null || (hashSet = this.n) == null || hashSet.isEmpty() || !this.n.contains(str)) ? false : true;
    }

    public final void e(String str) {
        for (String str2 : str.split(",")) {
            this.n.add(str2.toLowerCase());
        }
    }

    public boolean e() {
        HashSet<String> hashSet = this.n;
        return (hashSet == null || hashSet.isEmpty()) ? false : true;
    }

    public final void f(String str) {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.k.getCacheDir(), a.a.a.i.i.a((this.m + this.j.format(new Date())).getBytes(), false)));
            fileWriter.write(new String(Base64.encode(str.getBytes(), 0), "UTF-8"));
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException unused) {
        }
    }

    public final void g(String str) {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.k.getCacheDir(), "buildings"), true);
            fileWriter.write(str + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
