package a.a.a.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static c f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f108a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f109b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f110c = null;
    public int d = -1;
    public a e;

    public interface a {
        void a(boolean z);
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x005f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0060 A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:3:0x0005, B:5:0x000d, B:8:0x0030, B:16:0x0047, B:28:0x0072, B:30:0x007a, B:24:0x0060, B:25:0x0064, B:27:0x006f, B:26:0x006a, B:17:0x004d, B:18:0x0051, B:19:0x0055, B:9:0x0039), top: B:34:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x006a A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:3:0x0005, B:5:0x000d, B:8:0x0030, B:16:0x0047, B:28:0x0072, B:30:0x007a, B:24:0x0060, B:25:0x0064, B:27:0x006f, B:26:0x006a, B:17:0x004d, B:18:0x0051, B:19:0x0055, B:9:0x0039), top: B:34:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x007a A[Catch: Exception -> 0x008a, TRY_LEAVE, TryCatch #0 {Exception -> 0x008a, blocks: (B:3:0x0005, B:5:0x000d, B:8:0x0030, B:16:0x0047, B:28:0x0072, B:30:0x007a, B:24:0x0060, B:25:0x0064, B:27:0x006f, B:26:0x006a, B:17:0x004d, B:18:0x0051, B:19:0x0055, B:9:0x0039), top: B:34:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c cVar;
            String str;
            c cVar2;
            String str2;
            try {
                if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                    c.this.f108a = false;
                    int intExtra = intent.getIntExtra("status", 0);
                    int intExtra2 = intent.getIntExtra("plugged", 0);
                    int intExtra3 = intent.getIntExtra("level", -1);
                    int intExtra4 = intent.getIntExtra("scale", -1);
                    if (intExtra3 <= 0 || intExtra4 <= 0) {
                        c.this.d = -1;
                    } else {
                        c.this.d = (intExtra3 * 100) / intExtra4;
                    }
                    if (intExtra != 2) {
                        if (intExtra == 3 || intExtra == 4) {
                            cVar = c.this;
                            str = "3";
                        } else {
                            c.this.f109b = null;
                        }
                        if (intExtra2 != 1) {
                            if (intExtra2 != 2) {
                                cVar2 = c.this;
                                str2 = "5";
                            }
                            if (c.this.e != null) {
                                c.this.e.a(c.this.f108a);
                            }
                        }
                        cVar2 = c.this;
                        str2 = "6";
                        cVar2.f109b = str2;
                        c.this.f108a = true;
                        if (c.this.e != null) {
                            c.this.e.a(c.this.f108a);
                        }
                    }
                    cVar = c.this;
                    str = "4";
                    cVar.f109b = str;
                    if (intExtra2 != 1) {
                        if (intExtra2 != 2) {
                            cVar2 = c.this;
                            str2 = "5";
                        }
                        if (c.this.e != null) {
                            c.this.e.a(c.this.f108a);
                        }
                    }
                    cVar2 = c.this;
                    str2 = "6";
                    cVar2.f109b = str2;
                    c.this.f108a = true;
                    if (c.this.e != null) {
                        c.this.e.a(c.this.f108a);
                    }
                }
            } catch (Exception unused) {
                c.this.f109b = null;
            }
        }
    }

    public static synchronized c f() {
        if (f == null) {
            f = new c();
        }
        return f;
    }

    public int a() {
        return this.d;
    }

    public String b() {
        return this.f109b;
    }

    public boolean c() {
        return this.f108a;
    }

    public void d() {
        this.f110c = new b();
        try {
            com.baidu.location.f.c().registerReceiver(this.f110c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception unused) {
        }
    }

    public void e() {
        if (this.f110c != null) {
            try {
                com.baidu.location.f.c().unregisterReceiver(this.f110c);
            } catch (Exception unused) {
            }
        }
        this.f110c = null;
        this.e = null;
    }
}
