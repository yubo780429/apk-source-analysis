package a.a.a.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import com.baidu.location.Jni;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l {
    public static l g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f45a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f47c = null;
    public String d = null;
    public int e = -2;
    public static Object f = new Object();
    public static final String h = a.a.a.i.i.c() + "/hst.db";

    public class a extends a.a.a.i.g {
        public String i = null;
        public String j = null;
        public boolean k = true;

        public a() {
            this.d = new HashMap();
        }

        @Override // a.a.a.i.g
        public void a() {
            this.f338b = 1;
            String strK = a.a.a.g.f.w().k();
            if (strK != null) {
                this.f = Jni.f(strK);
            }
            String strF = Jni.f(this.j);
            this.j = null;
            this.d.put("bloc", strF);
        }

        public void a(String str, String str2) {
            if (l.this.f46b) {
                return;
            }
            l.this.f46b = true;
            this.i = str;
            if (n.b().a()) {
                this.j = str2 + "&enc=2";
            } else {
                this.j = str2;
            }
            ExecutorService executorServiceB = w.d().b();
            if (executorServiceB != null) {
                a(executorServiceB, a.a.a.i.d.f324b);
            } else {
                a(a.a.a.i.d.f324b);
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003c A[Catch: Exception -> 0x00f3, PHI: r11
  0x003c: PHI (r11v6 java.lang.String) = 
  (r11v5 java.lang.String)
  (r11v5 java.lang.String)
  (r11v5 java.lang.String)
  (r11v5 java.lang.String)
  (r11v15 java.lang.String)
 binds: [B:7:0x0014, B:9:0x001e, B:15:0x0039, B:11:0x0029, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x00f3, blocks: (B:6:0x0010, B:8:0x0016, B:15:0x0039, B:16:0x003c, B:18:0x0040, B:20:0x004c, B:23:0x0054, B:25:0x005a, B:27:0x0082, B:29:0x0089, B:31:0x009a, B:35:0x00d1, B:10:0x0020, B:12:0x002b), top: B:49:0x0010, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:18:0x0040 A[Catch: Exception -> 0x00f3, TryCatch #1 {Exception -> 0x00f3, blocks: (B:6:0x0010, B:8:0x0016, B:15:0x0039, B:16:0x003c, B:18:0x0040, B:20:0x004c, B:23:0x0054, B:25:0x005a, B:27:0x0082, B:29:0x0089, B:31:0x009a, B:35:0x00d1, B:10:0x0020, B:12:0x002b), top: B:49:0x0010, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x004c A[Catch: Exception -> 0x00f3, TryCatch #1 {Exception -> 0x00f3, blocks: (B:6:0x0010, B:8:0x0016, B:15:0x0039, B:16:0x003c, B:18:0x0040, B:20:0x004c, B:23:0x0054, B:25:0x005a, B:27:0x0082, B:29:0x0089, B:31:0x009a, B:35:0x00d1, B:10:0x0020, B:12:0x002b), top: B:49:0x0010, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0054 A[Catch: Exception -> 0x00f3, TryCatch #1 {Exception -> 0x00f3, blocks: (B:6:0x0010, B:8:0x0016, B:15:0x0039, B:16:0x003c, B:18:0x0040, B:20:0x004c, B:23:0x0054, B:25:0x005a, B:27:0x0082, B:29:0x0089, B:31:0x009a, B:35:0x00d1, B:10:0x0020, B:12:0x002b), top: B:49:0x0010, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0082 A[Catch: Exception -> 0x00f3, TRY_LEAVE, TryCatch #1 {Exception -> 0x00f3, blocks: (B:6:0x0010, B:8:0x0016, B:15:0x0039, B:16:0x003c, B:18:0x0040, B:20:0x004c, B:23:0x0054, B:25:0x005a, B:27:0x0082, B:29:0x0089, B:31:0x009a, B:35:0x00d1, B:10:0x0020, B:12:0x002b), top: B:49:0x0010, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00c3 A[Catch: Exception -> 0x00d1, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d1, blocks: (B:32:0x00a1, B:34:0x00c3), top: B:51:0x00a1 }] */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
        
            r11 = r10.f339c;
         */
        @Override // a.a.a.i.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(boolean r11) {
            /*
                Method dump skipped, instruction units count: 257
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.b.l.a.a(boolean):void");
        }
    }

    public static l f() {
        l lVar;
        synchronized (f) {
            if (g == null) {
                g = new l();
            }
            lVar = g;
        }
        return lVar;
    }

    public synchronized int a() {
        int i;
        int i2 = -3;
        if (this.f46b) {
            return -3;
        }
        try {
            if (a.a.a.g.f.w().p() && this.f45a != null) {
                WifiInfo wifiInfoC = a.a.a.g.f.w().c();
                Cursor cursorRawQuery = null;
                String strA = a.a.a.g.f.w().a(wifiInfoC, (String) null);
                if (wifiInfoC != null && strA != null) {
                    String strReplace = strA.replace(":", "");
                    Long lD = Jni.d(strReplace);
                    String str = this.d;
                    if (str == null || !strReplace.equals(str) || (i = this.e) <= -2) {
                        try {
                            cursorRawQuery = this.f45a.rawQuery("select * from hstdata where id = ?", new String[]{String.valueOf(lD)});
                            if (cursorRawQuery == null || !cursorRawQuery.moveToFirst()) {
                                i2 = -2;
                            } else {
                                i2 = cursorRawQuery.getInt(1);
                                this.d = strReplace;
                                this.e = i2;
                            }
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                        } catch (Exception unused) {
                            if (cursorRawQuery != null) {
                            }
                        } catch (Throwable th) {
                            if (cursorRawQuery != null) {
                                try {
                                    cursorRawQuery.close();
                                } catch (Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        i2 = i;
                    }
                }
            }
        } catch (Exception unused3) {
        }
        this.e = i2;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0096  */
    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x00bf, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00d8, please report this as an issue */
    public final String a(boolean z) {
        String strD;
        int iC;
        String string;
        String[] strArrSplit;
        String[] strArrSplit2;
        a.a.a.g.a aVarA = a.a.a.g.f.w().a();
        a.a.a.g.k kVarJ = a.a.a.g.f.w().j();
        StringBuffer stringBuffer = new StringBuffer(1024);
        if (aVarA != null && aVarA.e()) {
            stringBuffer.append(a.a.a.g.f.w().a(aVarA));
        }
        if (kVarJ == null || kVarJ.c() <= 1) {
            strD = a.a.a.g.f.w().d();
            if (strD != null) {
            }
            if (z) {
                stringBuffer.append("&imo=1");
            }
            stringBuffer.append(a.a.a.g.d.n().c());
            stringBuffer.append(a.a.a.i.b.e().a(false));
            stringBuffer.append(c.h().d());
            stringBuffer.append(f.c().a());
            stringBuffer.append(a.a.a.i.i.e(com.baidu.location.f.c()));
            iC = a.a.a.i.i.c(com.baidu.location.f.c());
            if (iC >= 0) {
                stringBuffer.append("&lmd=");
                stringBuffer.append(iC);
            }
            string = stringBuffer.toString();
            if (string.length() > a.a.a.i.i.F0) {
                return string;
            }
            strArrSplit = string.split("&cl_list=");
            if (strArrSplit.length == 2) {
                return string;
            }
            strArrSplit2 = strArrSplit[1].split("&", 2);
            if (strArrSplit2.length == 2) {
                return strArrSplit[0] + "&cl_list=null";
            }
            return strArrSplit[0] + "&cl_list=null&" + strArrSplit2[1];
        }
        strD = a.a.a.g.f.w().a(15, false, kVarJ, a.a.a.i.i.q0);
        stringBuffer.append(strD);
        if (z) {
            stringBuffer.append("&imo=1");
        }
        stringBuffer.append(a.a.a.g.d.n().c());
        stringBuffer.append(a.a.a.i.b.e().a(false));
        stringBuffer.append(c.h().d());
        stringBuffer.append(f.c().a());
        stringBuffer.append(a.a.a.i.i.e(com.baidu.location.f.c()));
        iC = a.a.a.i.i.c(com.baidu.location.f.c());
        if (iC >= 0) {
            stringBuffer.append("&lmd=");
            stringBuffer.append(iC);
        }
        string = stringBuffer.toString();
        if (string.length() > a.a.a.i.i.F0) {
            return string;
        }
        strArrSplit = string.split("&cl_list=");
        if (strArrSplit.length == 2) {
            return string;
        }
        strArrSplit2 = strArrSplit[1].split("&", 2);
        if (strArrSplit2.length == 2) {
            return strArrSplit[0] + "&cl_list=null";
        }
        return strArrSplit[0] + "&cl_list=null&" + strArrSplit2[1];
    }

    public final void a(Bundle bundle) {
        c.h().a(bundle, 406);
    }

    public void a(String str) {
        if (this.f46b) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has("content") ? jSONObject.getJSONObject("content") : null;
            if (jSONObject2 == null || !jSONObject2.has("imo")) {
                return;
            }
            Long lValueOf = Long.valueOf(jSONObject2.getJSONObject("imo").getString("mac"));
            int i = jSONObject2.getJSONObject("imo").getInt("mv");
            ContentValues contentValues = new ContentValues();
            contentValues.put("tt", Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
            contentValues.put("hst", Integer.valueOf(i));
            if (this.f45a.update("hstdata", contentValues, "id = \"" + lValueOf + "\"", null) <= 0) {
                contentValues.put("id", lValueOf);
                this.f45a.insert("hstdata", null, contentValues);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008c A[EXC_TOP_SPLITTER, PHI: r2 r3
  0x008c: PHI (r2v4 android.database.Cursor) = (r2v3 android.database.Cursor), (r2v5 android.database.Cursor) binds: [B:35:0x008a, B:29:0x0080] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r3v1 boolean) = (r3v0 boolean), (r3v4 boolean) binds: [B:35:0x008a, B:29:0x0080] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public void b() {
        WifiInfo wifiInfoC;
        if (this.f46b) {
            return;
        }
        try {
            if (!a.a.a.g.f.w().p() || this.f45a == null || (wifiInfoC = a.a.a.g.f.w().c()) == null || wifiInfoC.getBSSID() == null) {
                c();
                return;
            }
            String strReplace = wifiInfoC.getBSSID().replace(":", "");
            Cursor cursorRawQuery = null;
            boolean z = false;
            try {
                cursorRawQuery = this.f45a.rawQuery("select * from hstdata where id = ?", new String[]{String.valueOf(Jni.d(strReplace))});
                if (cursorRawQuery == null || !cursorRawQuery.moveToFirst()) {
                    z = true;
                } else {
                    int i = cursorRawQuery.getInt(1);
                    if ((System.currentTimeMillis() / 1000) - ((long) cursorRawQuery.getInt(2)) > 259200) {
                        z = true;
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("mac", strReplace.getBytes());
                        bundle.putInt("hotspot", i);
                        a(bundle);
                    }
                }
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
            if (z) {
                if (this.f47c == null) {
                    this.f47c = new a();
                }
                a aVar = this.f47c;
                if (aVar != null) {
                    aVar.a(strReplace, a(true));
                }
            }
        } catch (Exception unused4) {
        }
    }

    public final void c() {
        Bundle bundle = new Bundle();
        bundle.putInt("hotspot", -1);
        a(bundle);
    }

    public void d() {
        try {
            File file = new File(h);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.exists()) {
                SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
                this.f45a = sQLiteDatabaseOpenOrCreateDatabase;
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS hstdata(id Long PRIMARY KEY,hst INT,tt INT);");
                this.f45a.setVersion(1);
            }
        } catch (Exception unused) {
            this.f45a = null;
        }
    }

    public void e() {
        SQLiteDatabase sQLiteDatabase = this.f45a;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
            } finally {
                this.f45a = null;
            }
        }
    }
}
