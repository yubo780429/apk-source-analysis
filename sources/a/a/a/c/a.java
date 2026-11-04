package a.a.a.c;

import a.a.a.b.w;
import a.a.a.i.g;
import a.a.a.i.i;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.baidu.location.Jni;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static a h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f100a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f101b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0003a f102c = null;
    public String d;
    public double e;
    public double f;
    public static Object g = new Object();
    public static final String i = i.c() + "/gal.db";
    public static Lock j = new ReentrantLock();

    /* JADX INFO: renamed from: a.a.a.c.a$a, reason: collision with other inner class name */
    public class C0003a extends g {
        public int i;
        public int j;
        public int k;
        public int l;

        public C0003a() {
            this.d = new HashMap();
        }

        @Override // a.a.a.i.g
        public void a() {
            Map<String, Object> map;
            String str;
            this.f337a = "https://loc.map.baidu.com/gpsz";
            String str2 = String.format(Locale.CHINESE, "&is_vdr=1&x=%d&y=%d%s", Integer.valueOf(this.i), Integer.valueOf(this.j), a.a.a.i.b.e().a());
            String strB = Jni.b(str2);
            if (strB.contains("err!")) {
                try {
                    strB = new String(Base64.encode(str2.getBytes(), 0), "UTF-8");
                } catch (Exception unused) {
                    strB = "err2!";
                }
                map = this.d;
                str = "gpszb";
            } else {
                map = this.d;
                str = "gpsz";
            }
            map.put(str, strB);
        }

        public void a(double d, double d2, double d3) {
            if (a.this.f101b) {
                return;
            }
            double[] dArrA = Jni.a(d, d2, "gcj2wgs");
            this.i = (int) Math.floor(dArrA[0] * 100.0d);
            this.j = (int) Math.floor(dArrA[1] * 100.0d);
            this.k = (int) Math.floor(d * 100.0d);
            this.l = (int) Math.floor(d2 * 100.0d);
            a.this.f101b = true;
            if (i.l()) {
                return;
            }
            ExecutorService executorServiceB = w.d().b();
            if (executorServiceB != null) {
                a(executorServiceB, "https://loc.map.baidu.com/gpsz");
            } else {
                a("https://loc.map.baidu.com/gpsz");
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0123 A[Catch: Exception -> 0x012f, TRY_LEAVE, TryCatch #0 {Exception -> 0x012f, blocks: (B:33:0x0104, B:35:0x0123), top: B:78:0x0104 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x0155  */
        /* JADX WARN: Code duplicated, block: B:89:0x012f A[SYNTHETIC] */
        @Override // a.a.a.i.g
        public void a(boolean z) {
            String str;
            String str2;
            String str3;
            String[] strArr;
            Double dValueOf;
            String str4;
            String str5 = "locStateData";
            String str6 = ":";
            String str7 = "info";
            if (z && this.f339c != null) {
                a.j.lock();
                try {
                    JSONObject jSONObject = new JSONObject(this.f339c);
                    String str8 = "E";
                    String str9 = ",";
                    if (jSONObject.has("height")) {
                        String string = jSONObject.getString("height");
                        if (string.contains(",")) {
                            String[] strArrSplit = string.trim().split(",");
                            int length = strArrSplit.length;
                            int iSqrt = (int) Math.sqrt(length);
                            if (iSqrt * iSqrt == length) {
                                int i = iSqrt - 1;
                                int i2 = this.k - (i / 2);
                                int i3 = this.l - (i / 2);
                                for (int i4 = 0; i4 < iSqrt; i4++) {
                                    int i5 = 0;
                                    while (i5 < iSqrt) {
                                        String str10 = str9;
                                        ContentValues contentValues = new ContentValues();
                                        int i6 = (i4 * iSqrt) + i5;
                                        int i7 = iSqrt;
                                        String str11 = str8;
                                        String str12 = str7;
                                        try {
                                            if (strArrSplit[i6].contains(str8)) {
                                                contentValues.put("aldata", Double.valueOf(10000.0d));
                                            } else {
                                                if (strArrSplit[i6].contains(str6)) {
                                                    String[] strArrSplit2 = strArrSplit[i6].split(str6);
                                                    str3 = str6;
                                                    strArr = strArrSplit;
                                                    if (strArrSplit2.length == 2) {
                                                        contentValues.put("aldata", Double.valueOf(strArrSplit2[0]));
                                                        contentValues.put("sigma", strArrSplit2[1]);
                                                    } else {
                                                        contentValues.put("aldata", Double.valueOf(10000.0d));
                                                        dValueOf = Double.valueOf(10000.0d);
                                                        contentValues.put("sigma", dValueOf);
                                                    }
                                                } else {
                                                    contentValues.put("aldata", Double.valueOf(strArrSplit[i6]));
                                                }
                                                contentValues.put("tt", Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
                                                str4 = String.format(Locale.CHINESE, "%d,%d", Integer.valueOf(i2 + i5), Integer.valueOf(i3 + i4));
                                                if (a.this.f100a.update("galdata_new", contentValues, "id = \"" + str4 + "\"", null) <= 0) {
                                                    contentValues.put("id", str4);
                                                    a.this.f100a.insert("galdata_new", null, contentValues);
                                                }
                                                i5++;
                                                str9 = str10;
                                                str6 = str3;
                                                iSqrt = i7;
                                                str8 = str11;
                                                str7 = str12;
                                                strArrSplit = strArr;
                                            }
                                            if (a.this.f100a.update("galdata_new", contentValues, "id = \"" + str4 + "\"", null) <= 0) {
                                                contentValues.put("id", str4);
                                                a.this.f100a.insert("galdata_new", null, contentValues);
                                            }
                                        } catch (Exception unused) {
                                        }
                                        dValueOf = Double.valueOf(10000.0d);
                                        str3 = str6;
                                        strArr = strArrSplit;
                                        contentValues.put("sigma", dValueOf);
                                        contentValues.put("tt", Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
                                        str4 = String.format(Locale.CHINESE, "%d,%d", Integer.valueOf(i2 + i5), Integer.valueOf(i3 + i4));
                                        i5++;
                                        str9 = str10;
                                        str6 = str3;
                                        iSqrt = i7;
                                        str8 = str11;
                                        str7 = str12;
                                        strArrSplit = strArr;
                                    }
                                }
                            }
                            str = str7;
                        } else {
                            str5 = "locStateData";
                            str = "info";
                        }
                    } else {
                        str5 = "locStateData";
                        str = "info";
                    }
                    String str13 = str8;
                    String str14 = str9;
                    String str15 = str;
                    if (jSONObject.has(str15)) {
                        String string2 = jSONObject.getString(str15);
                        if (string2.contains(str14)) {
                            String[] strArrSplit3 = string2.trim().split(str14);
                            int length2 = strArrSplit3.length;
                            int iSqrt2 = (int) Math.sqrt(length2);
                            if (iSqrt2 * iSqrt2 == length2) {
                                int i8 = iSqrt2 - 1;
                                int i9 = this.k - (i8 / 2);
                                int i10 = this.l - (i8 / 2);
                                int i11 = 0;
                                while (i11 < iSqrt2) {
                                    int i12 = 0;
                                    while (i12 < iSqrt2) {
                                        ContentValues contentValues2 = new ContentValues();
                                        int i13 = (i11 * iSqrt2) + i12;
                                        String str16 = str13;
                                        contentValues2.put("state", strArrSplit3[i13].contains(str16) ? -1 : Integer.valueOf(Integer.valueOf(strArrSplit3[i13]).intValue()));
                                        String[] strArr2 = strArrSplit3;
                                        int i14 = i9;
                                        String str17 = String.format(Locale.CHINESE, "%d,%d", Integer.valueOf(i9 + i12), Integer.valueOf(i10 + i11));
                                        try {
                                            str2 = str5;
                                            try {
                                                if (a.this.f100a.update(str2, contentValues2, "id = \"" + str17 + "\"", null) <= 0) {
                                                    contentValues2.put("id", str17);
                                                    a.this.f100a.insert(str2, null, contentValues2);
                                                }
                                            } catch (Exception unused2) {
                                            }
                                        } catch (Exception unused3) {
                                            str2 = str5;
                                        }
                                        i12++;
                                        str13 = str16;
                                        str5 = str2;
                                        strArrSplit3 = strArr2;
                                        i9 = i14;
                                    }
                                    i11++;
                                    strArrSplit3 = strArrSplit3;
                                }
                            }
                        }
                    }
                } catch (Exception unused4) {
                }
                a.j.unlock();
            }
            Map<String, Object> map = this.d;
            if (map != null) {
                map.clear();
            }
            a.this.f101b = false;
        }
    }

    public a() {
        new HashMap();
        this.d = null;
        this.e = Double.MAX_VALUE;
        this.f = Double.MAX_VALUE;
    }

    public static a d() {
        a aVar;
        synchronized (g) {
            if (h == null) {
                h = new a();
            }
            aVar = h;
        }
        return aVar;
    }

    public int a(com.baidu.location.c cVar) {
        double d;
        float fZ;
        if (cVar != null) {
            fZ = cVar.z();
            d = cVar.d();
        } else {
            d = 0.0d;
            fZ = 0.0f;
        }
        if (this.f100a == null || fZ <= 0.0f || d <= 0.0d || cVar == null) {
            return 0;
        }
        double d2 = a(cVar.t(), cVar.q())[0];
        if (d2 == Double.MAX_VALUE) {
            return 0;
        }
        double dA = Jni.a(fZ, d, d2);
        if (dA > 50.0d) {
            return 3;
        }
        return dA > 20.0d ? 2 : 1;
    }

    public void a() {
        SQLiteDatabase sQLiteDatabase;
        String str;
        try {
            File file = new File(i);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.exists()) {
                SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
                this.f100a = sQLiteDatabaseOpenOrCreateDatabase;
                Cursor cursorRawQuery = sQLiteDatabaseOpenOrCreateDatabase.rawQuery("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='galdata'", null);
                if (cursorRawQuery.moveToFirst()) {
                    if (cursorRawQuery.getInt(0) == 0) {
                        sQLiteDatabase = this.f100a;
                        str = "CREATE TABLE IF NOT EXISTS galdata_new(id CHAR(40) PRIMARY KEY,aldata DOUBLE, sigma DOUBLE,tt INT);";
                    } else {
                        this.f100a.execSQL("DROP TABLE galdata");
                        sQLiteDatabase = this.f100a;
                        str = "CREATE TABLE galdata_new(id CHAR(40) PRIMARY KEY,aldata DOUBLE, sigma DOUBLE,tt INT);";
                    }
                    sQLiteDatabase.execSQL(str);
                    this.f100a.execSQL("CREATE TABLE IF NOT EXISTS locStateData(id CHAR(40) PRIMARY KEY,state INT);");
                }
                this.f100a.setVersion(1);
                cursorRawQuery.close();
            }
        } catch (Exception unused) {
            this.f100a = null;
        }
    }

    public final void a(double d, double d2, double d3) {
        if (this.f102c == null) {
            this.f102c = new C0003a();
        }
        this.f102c.a(d, d2, d3);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed A[Catch: all -> 0x0101, Exception -> 0x0105, TRY_LEAVE, TryCatch #3 {all -> 0x0101, blocks: (B:34:0x00c2, B:36:0x00c9, B:47:0x00e9, B:49:0x00ed), top: B:87:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0113  */
    /* JADX WARN: Code duplicated, block: B:66:0x0119  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:73:0x012e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0135  */
    /* JADX WARN: Code duplicated, block: B:77:0x0139  */
    public double[] a(double d, double d2) throws Throwable {
        double d3;
        double d4;
        double d5;
        Cursor cursor;
        double d6;
        double[] dArr = new double[2];
        double d7 = Double.MAX_VALUE;
        if (this.f100a != null && d > 0.1d && d2 > 0.1d) {
            String str = String.format(Locale.CHINESE, "%d,%d", Integer.valueOf((int) Math.floor(d * 100.0d)), Integer.valueOf((int) Math.floor(100.0d * d2)));
            String str2 = this.d;
            if (str2 == null || !str2.equals(str)) {
                j.lock();
                Cursor cursor2 = null;
                try {
                    Cursor cursorRawQuery = this.f100a.rawQuery("select * from galdata_new where id = \"" + str + "\";", null);
                    try {
                        if (cursorRawQuery != null) {
                            try {
                                try {
                                    if (cursorRawQuery.moveToFirst()) {
                                        double d8 = cursorRawQuery.getDouble(1);
                                        try {
                                            d5 = cursorRawQuery.getDouble(2);
                                            try {
                                                int i2 = cursorRawQuery.getInt(3);
                                                if (d8 == 10000.0d) {
                                                    d8 = Double.MAX_VALUE;
                                                }
                                                d7 = d5 > 0.0d ? d5 : Double.MAX_VALUE;
                                                try {
                                                    long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - ((long) i2);
                                                    if (this.f101b || jCurrentTimeMillis <= 604800) {
                                                        d6 = d8;
                                                        cursorRawQuery = cursorRawQuery;
                                                    } else {
                                                        d6 = d8;
                                                        cursorRawQuery = cursorRawQuery;
                                                        try {
                                                            a(d, d2, 9.520999908447266d);
                                                        } catch (Exception unused) {
                                                            d5 = d7;
                                                            d7 = d6;
                                                            cursor2 = cursorRawQuery;
                                                            if (cursor2 != null) {
                                                                cursor = cursor2;
                                                                d3 = d5;
                                                            } else {
                                                                d3 = d5;
                                                            }
                                                            j.unlock();
                                                            d4 = 10000.0d;
                                                            if (d7 > d4) {
                                                                dArr[0] = d4;
                                                            } else {
                                                                dArr[0] = d7;
                                                            }
                                                            if (d3 > d4) {
                                                                dArr[1] = d4;
                                                            } else {
                                                                dArr[1] = d3;
                                                            }
                                                            return dArr;
                                                        }
                                                    }
                                                    this.d = str;
                                                    this.e = d6;
                                                    this.f = d7;
                                                    d3 = d7;
                                                    d7 = d6;
                                                } catch (Exception unused2) {
                                                    d6 = d8;
                                                    cursorRawQuery = cursorRawQuery;
                                                }
                                            } catch (Exception unused3) {
                                                d7 = d8;
                                                cursor2 = cursorRawQuery;
                                                if (cursor2 != null) {
                                                    cursor = cursor2;
                                                    d3 = d5;
                                                    try {
                                                        cursor.close();
                                                    } catch (Exception unused4) {
                                                    }
                                                } else {
                                                    d3 = d5;
                                                }
                                                j.unlock();
                                                d4 = 10000.0d;
                                                if (d7 > d4) {
                                                    dArr[0] = d4;
                                                } else {
                                                    dArr[0] = d7;
                                                }
                                                if (d3 > d4) {
                                                    dArr[1] = d4;
                                                } else {
                                                    dArr[1] = d3;
                                                }
                                                return dArr;
                                            }
                                        } catch (Exception unused5) {
                                            d5 = Double.MAX_VALUE;
                                        }
                                    } else {
                                        cursorRawQuery = cursorRawQuery;
                                        try {
                                            if (!this.f101b) {
                                                a(d, d2, 9.520999908447266d);
                                            }
                                            d3 = Double.MAX_VALUE;
                                        } catch (Exception unused6) {
                                            d5 = Double.MAX_VALUE;
                                            cursor2 = cursorRawQuery;
                                            if (cursor2 != null) {
                                                cursor = cursor2;
                                                d3 = d5;
                                            } else {
                                                d3 = d5;
                                            }
                                            j.unlock();
                                            d4 = 10000.0d;
                                            if (d7 > d4) {
                                                dArr[0] = d4;
                                            } else {
                                                dArr[0] = d7;
                                            }
                                            if (d3 > d4) {
                                                dArr[1] = d4;
                                            } else {
                                                dArr[1] = d3;
                                            }
                                            return dArr;
                                        }
                                    }
                                } catch (Exception unused7) {
                                    cursorRawQuery = cursorRawQuery;
                                    d5 = Double.MAX_VALUE;
                                    cursor2 = cursorRawQuery;
                                    if (cursor2 != null) {
                                        cursor = cursor2;
                                        d3 = d5;
                                        cursor.close();
                                    } else {
                                        d3 = d5;
                                    }
                                    j.unlock();
                                    d4 = 10000.0d;
                                    if (d7 > d4) {
                                        dArr[0] = d4;
                                    } else {
                                        dArr[0] = d7;
                                    }
                                    if (d3 > d4) {
                                        dArr[1] = d4;
                                    } else {
                                        dArr[1] = d3;
                                    }
                                    return dArr;
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = cursorRawQuery;
                                if (cursor2 != null) {
                                    try {
                                        cursor2.close();
                                    } catch (Exception unused8) {
                                    }
                                }
                                throw th;
                            }
                        } else {
                            cursorRawQuery = cursorRawQuery;
                            if (!this.f101b) {
                                a(d, d2, 9.520999908447266d);
                            }
                            d3 = Double.MAX_VALUE;
                        }
                        if (cursorRawQuery != null) {
                            cursor = cursorRawQuery;
                            cursor.close();
                        }
                        j.unlock();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception unused9) {
                    d5 = Double.MAX_VALUE;
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                d7 = this.e;
                d3 = this.f;
                d4 = 10000.0d;
            }
            if (d7 > d4) {
                dArr[0] = d4;
            } else {
                dArr[0] = d7;
            }
            if (d3 > d4) {
                dArr[1] = d4;
            } else {
                dArr[1] = d3;
            }
            return dArr;
        }
        d3 = Double.MAX_VALUE;
        d4 = 10000.0d;
        if (d7 > d4) {
            dArr[0] = d4;
        } else {
            dArr[0] = d7;
        }
        if (d3 > d4) {
            dArr[1] = d4;
        } else {
            dArr[1] = d3;
        }
        return dArr;
    }

    public void b() {
        SQLiteDatabase sQLiteDatabase = this.f100a;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
            } finally {
                this.f100a = null;
            }
        }
    }
}
