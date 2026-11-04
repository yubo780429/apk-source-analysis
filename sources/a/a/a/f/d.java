package a.a.a.f;

import a.a.a.g.k;
import a.a.a.i.i;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static Context g = null;
    public static volatile d h = null;
    public static Object i = new Object();
    public static final String j = "http://ofloc.map.baidu.com/offline_loc";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.a.a.f.b f231c;
    public final g d;
    public final a.a.a.f.c e;
    public ExecutorService f = null;

    public class a implements Callable<com.baidu.location.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f232a;

        public a(String[] strArr) {
            this.f232a = strArr;
        }

        /* JADX WARN: Code duplicated, block: B:57:0x005e A[EXC_TOP_SPLITTER, PHI: r2 r11
  0x005e: PHI (r2v6 com.baidu.location.c) = (r2v15 com.baidu.location.c), (r2v5 com.baidu.location.c), (r2v17 com.baidu.location.c), (r2v12 com.baidu.location.c) binds: [B:25:0x005c, B:16:0x004e, B:40:0x0085, B:31:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x005e: PHI (r11v4 android.database.Cursor) = 
  (r11v2 android.database.Cursor)
  (r11v3 android.database.Cursor)
  (r11v8 android.database.Cursor)
  (r11v11 android.database.Cursor)
 binds: [B:25:0x005c, B:16:0x004e, B:40:0x0085, B:31:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.baidu.location.c call() throws Throwable {
            Cursor cursorQuery;
            com.baidu.location.c cVar = new com.baidu.location.c();
            if (this.f232a.length > 0) {
                Cursor cursor = null;
                cVarA = null;
                cVarA = null;
                cVarA = null;
                com.baidu.location.c cVarA = null;
                Cursor cursor2 = null;
                ProviderInfo providerInfoResolveContentProvider = null;
                for (String str : d.this.e.k()) {
                    try {
                        providerInfoResolveContentProvider = d.g.getPackageManager().resolveContentProvider(str, 0);
                    } catch (Exception unused) {
                        providerInfoResolveContentProvider = null;
                    }
                    if (providerInfoResolveContentProvider != null) {
                        break;
                    }
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        cursorQuery = d.g.getContentResolver().query(d.c(providerInfoResolveContentProvider.authority), this.f232a, null, null, null);
                        try {
                            cVarA = e.a(cursorQuery);
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Exception unused2) {
                                }
                            }
                        } catch (Exception unused3) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception unused5) {
                        cursorQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    try {
                        cursorQuery = d.this.f231c.a(new e.a(this.f232a));
                        try {
                            cVarA = e.a(cursorQuery);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (Exception unused6) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = cursorQuery;
                            if (cursor2 != null) {
                                try {
                                    cursor2.close();
                                } catch (Exception unused7) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception unused8) {
                        cursorQuery = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                cVar = cVarA;
                if (cVar != null && cVar.r() != 67) {
                    cVar.h(66);
                }
            }
            return cVar;
        }
    }

    public enum b {
        NEED_TO_LOG,
        NO_NEED_TO_LOG
    }

    public enum c {
        IS_MIX_MODE,
        IS_NOT_MIX_MODE
    }

    /* JADX INFO: renamed from: a.a.a.f.d$d, reason: collision with other inner class name */
    public enum EnumC0012d {
        NETWORK_UNKNOWN,
        NETWORK_WIFI,
        NETWORK_2G,
        NETWORK_3G,
        NETWORK_4G
    }

    public d() {
        File file = null;
        try {
            File file2 = new File(g.getFilesDir(), "ofld");
            try {
                if (!file2.exists()) {
                    file2.mkdir();
                }
            } catch (Exception unused) {
            }
            file = file2;
        } catch (Exception unused2) {
        }
        this.f229a = file;
        a.a.a.f.b bVar = new a.a.a.f.b(this);
        this.f231c = bVar;
        this.f230b = new f(bVar.a());
        a.a.a.f.c cVar = new a.a.a.f.c(this, bVar.a());
        this.e = cVar;
        this.d = new g(this, bVar.a(), cVar.c());
    }

    public static void a(Context context) {
        if (g == null) {
            g = context;
            a.a.a.i.b.e().a(g);
        }
    }

    public static final Uri c(String str) {
        return Uri.parse(String.format("content://%s/", str));
    }

    public static d r() {
        d dVar;
        synchronized (i) {
            if (h == null) {
                if (g == null) {
                    a(com.baidu.location.f.c());
                }
                h = new d();
            }
            h.a();
            dVar = h;
        }
        return dVar;
    }

    public long a(String str) {
        return this.e.a(str);
    }

    public com.baidu.location.c a(a.a.a.g.a aVar, k kVar, com.baidu.location.c cVar, c cVar2, b bVar) {
        int iD;
        String strC;
        if (cVar2 == c.IS_MIX_MODE) {
            iD = this.e.d();
            strC = a.a.a.i.b.e().c() + "&mixMode=1";
        } else {
            iD = 0;
            strC = a.a.a.i.b.e().c();
        }
        String[] strArrA = e.a(aVar, kVar, cVar, strC, (bVar == b.NEED_TO_LOG ? Boolean.TRUE : Boolean.FALSE).booleanValue(), iD);
        com.baidu.location.c cVarA = null;
        if (strArrA.length > 0 && (cVarA = a(strArrA)) != null) {
            cVarA.r();
        }
        return cVarA;
    }

    public final com.baidu.location.c a(String[] strArr) {
        new com.baidu.location.c();
        if (this.f == null) {
            this.f = Executors.newSingleThreadExecutor();
        }
        FutureTask futureTask = (FutureTask) this.f.submit(new a(strArr));
        try {
            return (com.baidu.location.c) futureTask.get(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            futureTask.cancel(true);
            return null;
        }
    }

    public final void a() {
        this.e.a();
    }

    public void b() {
    }

    public a.a.a.f.c c() {
        return this.e;
    }

    public Context d() {
        return g;
    }

    public f e() {
        return this.f230b;
    }

    public double f() {
        NetworkInfo activeNetworkInfo;
        EnumC0012d enumC0012d;
        try {
            activeNetworkInfo = ((ConnectivityManager) g.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            th.printStackTrace();
            activeNetworkInfo = null;
        }
        EnumC0012d enumC0012d2 = EnumC0012d.NETWORK_UNKNOWN;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            enumC0012d = enumC0012d2;
        } else {
            enumC0012d = activeNetworkInfo.getType() == 1 ? EnumC0012d.NETWORK_WIFI : enumC0012d2;
            if (activeNetworkInfo.getType() == 0) {
                int subtype = activeNetworkInfo.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    enumC0012d = EnumC0012d.NETWORK_2G;
                } else if (subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14 || subtype == 15) {
                    enumC0012d = EnumC0012d.NETWORK_3G;
                } else if (subtype == 13) {
                    enumC0012d = EnumC0012d.NETWORK_4G;
                }
            }
        }
        if (enumC0012d == enumC0012d2) {
            return this.e.i();
        }
        if (enumC0012d == EnumC0012d.NETWORK_WIFI) {
            return this.e.j();
        }
        if (enumC0012d == EnumC0012d.NETWORK_2G) {
            return this.e.f();
        }
        if (enumC0012d == EnumC0012d.NETWORK_3G) {
            return this.e.g();
        }
        if (enumC0012d == EnumC0012d.NETWORK_4G) {
            return this.e.h();
        }
        return 0.0d;
    }

    public g g() {
        return this.d;
    }

    public File h() {
        return this.f229a;
    }

    public boolean i() {
        return this.e.l();
    }

    public boolean j() {
        return this.e.m();
    }

    public boolean k() {
        return this.e.o();
    }

    public final boolean l() {
        String packageName = g.getPackageName();
        ProviderInfo providerInfoResolveContentProvider = null;
        for (String str : this.e.k()) {
            try {
                providerInfoResolveContentProvider = g.getPackageManager().resolveContentProvider(str, 0);
            } catch (Exception unused) {
                providerInfoResolveContentProvider = null;
            }
            if (providerInfoResolveContentProvider != null) {
                break;
            }
        }
        return providerInfoResolveContentProvider == null || packageName.equals(providerInfoResolveContentProvider.packageName);
    }

    public boolean m() {
        return this.e.p();
    }

    public boolean n() {
        return this.e.q();
    }

    public void o() {
        if (!l() || i.l()) {
            return;
        }
        this.f231c.b();
    }

    public void p() {
        if (i.l()) {
            return;
        }
        this.f230b.b();
    }
}
