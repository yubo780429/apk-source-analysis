package a.a.a.f;

import a.a.a.b.o;
import a.a.a.g.k;
import a.a.a.i.h;
import a.a.a.i.i;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.os.AsyncTask;
import android.os.Handler;
import com.baidu.location.Jni;
import java.io.File;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static a l;
    public static final String m = h.f353a;
    public static final String n = h.f353a + "/ls.db";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f211a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f212b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f213c = false;
    public double d = 0.0d;
    public double e = 0.0d;
    public double f = 0.0d;
    public double g = 0.0d;
    public double h = 0.0d;
    public volatile boolean i = false;
    public Handler j = null;
    public boolean k = false;

    /* JADX INFO: renamed from: a.a.a.f.a$a, reason: collision with other inner class name */
    public class RunnableC0010a implements Runnable {
        public RunnableC0010a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.baidu.location.f.f) {
                a.this.a();
            }
        }
    }

    public class b extends AsyncTask<Boolean, Void, Boolean> {
        public b(a aVar) {
        }

        public /* synthetic */ b(a aVar, RunnableC0010a runnableC0010a) {
            this(aVar);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Boolean... boolArr) {
            if (boolArr.length != 4) {
                return Boolean.FALSE;
            }
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = null;
            try {
                sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(a.n, (SQLiteDatabase.CursorFactory) null);
            } catch (Exception unused) {
            }
            if (sQLiteDatabaseOpenOrCreateDatabase == null) {
                return Boolean.FALSE;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() >> 28);
            try {
                sQLiteDatabaseOpenOrCreateDatabase.beginTransaction();
                if (boolArr[0].booleanValue()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("delete from wof where ac < ");
                    sb.append(iCurrentTimeMillis - 35);
                    try {
                        sQLiteDatabaseOpenOrCreateDatabase.execSQL(sb.toString());
                    } catch (Exception unused2) {
                    }
                }
                if (boolArr[1].booleanValue()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("delete from bdcltb09 where ac is NULL or ac < ");
                    sb2.append(iCurrentTimeMillis - 130);
                    try {
                        sQLiteDatabaseOpenOrCreateDatabase.execSQL(sb2.toString());
                    } catch (Exception unused3) {
                    }
                }
                sQLiteDatabaseOpenOrCreateDatabase.setTransactionSuccessful();
                sQLiteDatabaseOpenOrCreateDatabase.endTransaction();
                sQLiteDatabaseOpenOrCreateDatabase.close();
            } catch (Exception unused4) {
            }
            return Boolean.TRUE;
        }
    }

    public class c extends AsyncTask<Object, Void, Boolean> {
        public c() {
        }

        public /* synthetic */ c(a aVar, RunnableC0010a runnableC0010a) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Object... objArr) {
            if (objArr.length != 4) {
                a.this.i = false;
                return Boolean.FALSE;
            }
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = null;
            try {
                sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(a.n, (SQLiteDatabase.CursorFactory) null);
            } catch (Exception unused) {
            }
            if (sQLiteDatabaseOpenOrCreateDatabase == null) {
                a.this.i = false;
                return Boolean.FALSE;
            }
            try {
                sQLiteDatabaseOpenOrCreateDatabase.beginTransaction();
                a.this.a((String) objArr[0], (a.a.a.g.a) objArr[1], sQLiteDatabaseOpenOrCreateDatabase);
                a.this.a((k) objArr[2], (com.baidu.location.c) objArr[3], sQLiteDatabaseOpenOrCreateDatabase);
                sQLiteDatabaseOpenOrCreateDatabase.setTransactionSuccessful();
                sQLiteDatabaseOpenOrCreateDatabase.endTransaction();
                sQLiteDatabaseOpenOrCreateDatabase.close();
            } catch (Exception unused2) {
            }
            a.this.i = false;
            return Boolean.TRUE;
        }
    }

    public a() {
        b();
    }

    public static synchronized a e() {
        if (l == null) {
            l = new a();
        }
        return l;
    }

    public com.baidu.location.c a(String str, List<ScanResult> list, boolean z) {
        if (!this.k) {
            return new com.baidu.location.c("{\"result\":{\"time\":\"" + i.i() + "\",\"error\":\"67\"}}");
        }
        String str2 = "{\"result\":{\"time\":\"" + i.i() + "\",\"error\":\"67\"}}";
        try {
            a(str, list);
            String strA = a(true);
            if (strA != null) {
                str2 = strA;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return new com.baidu.location.c(str2);
    }

    public final String a(boolean z) {
        double d;
        double d2;
        boolean z2;
        boolean z3;
        StringBuilder sb;
        String str;
        double d3 = 0.0d;
        if (this.f213c) {
            double d4 = this.g;
            d = this.h;
            z2 = true;
            z3 = true;
            d3 = 246.4d;
            d2 = d4;
        } else if (this.f212b) {
            double d5 = this.e;
            z2 = true;
            z3 = true;
            d = this.f;
            d2 = d5;
            d3 = this.d;
        } else {
            d = 0.0d;
            d2 = 0.0d;
            z2 = false;
            z3 = false;
        }
        if (!z2) {
            if (z) {
                sb = new StringBuilder();
                sb.append("{\"result\":{\"time\":\"");
                sb.append(i.i());
                str = "\",\"error\":\"67\"}}";
            } else {
                sb = new StringBuilder();
                sb.append("{\"result\":{\"time\":\"");
                sb.append(i.i());
                str = "\",\"error\":\"63\"}}";
            }
            sb.append(str);
            return sb.toString();
        }
        if (z) {
            return String.format(Locale.CHINA, "{\"result\":{\"time\":\"" + i.i() + "\",\"error\":\"66\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%f\",\"isCellChanged\":\"%b\"}}", Double.valueOf(d2), Double.valueOf(d), Double.valueOf(d3), Boolean.TRUE);
        }
        return String.format(Locale.CHINA, "{\"result\":{\"time\":\"" + i.i() + "\",\"error\":\"66\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%f\",\"isCellChanged\":\"%b\"}}", Double.valueOf(d2), Double.valueOf(d), Double.valueOf(d3), Boolean.valueOf(z3));
    }

    public final void a() {
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase;
        RunnableC0010a runnableC0010a = null;
        try {
            sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(n, (SQLiteDatabase.CursorFactory) null);
        } catch (Exception unused) {
            sQLiteDatabaseOpenOrCreateDatabase = null;
        }
        if (sQLiteDatabaseOpenOrCreateDatabase == null) {
            return;
        }
        try {
            long jQueryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabaseOpenOrCreateDatabase, "wof");
            long jQueryNumEntries2 = DatabaseUtils.queryNumEntries(sQLiteDatabaseOpenOrCreateDatabase, "bdcltb09");
            boolean z = jQueryNumEntries > 10000;
            boolean z2 = jQueryNumEntries2 > 10000;
            sQLiteDatabaseOpenOrCreateDatabase.close();
            if (z || z2) {
                new b(this, runnableC0010a).execute(Boolean.valueOf(z), Boolean.valueOf(z2));
            }
        } catch (Exception unused2) {
        }
    }

    public final void a(k kVar, com.baidu.location.c cVar, SQLiteDatabase sQLiteDatabase) {
        double d;
        double d2;
        boolean z;
        int i;
        int i2;
        Integer numValueOf;
        String str;
        if (cVar == null || cVar.r() != 161) {
            return;
        }
        if (("wf".equals(cVar.v()) || cVar.z() < 300.0f) && kVar.f295a != null) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() >> 28);
            System.currentTimeMillis();
            char c2 = 0;
            int i3 = 0;
            for (ScanResult scanResult : kVar.f295a) {
                if (scanResult.level != 0) {
                    int i4 = i3 + 1;
                    if (i4 > 6) {
                        return;
                    }
                    ContentValues contentValues = new ContentValues();
                    String strC = Jni.c(scanResult.BSSID.replace(":", ""));
                    try {
                        String[] strArr = new String[1];
                        strArr[c2] = strC;
                        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select * from wof where id = ?", strArr);
                        if (cursorRawQuery == null || !cursorRawQuery.moveToFirst()) {
                            d = 0.0d;
                            d2 = 0.0d;
                            z = false;
                            i = 0;
                            i2 = 0;
                        } else {
                            double d3 = cursorRawQuery.getDouble(1) - 113.2349d;
                            double d4 = cursorRawQuery.getDouble(2) - 432.1238d;
                            int i5 = cursorRawQuery.getInt(4);
                            d2 = d3;
                            d = d4;
                            i2 = cursorRawQuery.getInt(5);
                            i = i5;
                            z = true;
                        }
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        if (z) {
                            if (i2 != 0) {
                                float[] fArr = new float[1];
                                Location.distanceBetween(d, d2, cVar.q(), cVar.t(), fArr);
                                if (fArr[0] > 1500.0f) {
                                    int i6 = i2 + 1;
                                    if (i6 <= 10 || i6 <= i * 3) {
                                        numValueOf = Integer.valueOf(i6);
                                        str = "cc";
                                    } else {
                                        contentValues.put("mktime", Double.valueOf(cVar.t() + 113.2349d));
                                        contentValues.put("time", Double.valueOf(cVar.q() + 432.1238d));
                                        contentValues.put("bc", (Integer) 1);
                                        contentValues.put("cc", (Integer) 1);
                                        str = "ac";
                                        numValueOf = Integer.valueOf(iCurrentTimeMillis);
                                    }
                                } else {
                                    double d5 = i;
                                    int i7 = i + 1;
                                    double d6 = i7;
                                    double dT = ((d2 * d5) + cVar.t()) / d6;
                                    double dQ = ((d * d5) + cVar.q()) / d6;
                                    contentValues.put("mktime", Double.valueOf(dT + 113.2349d));
                                    contentValues.put("time", Double.valueOf(dQ + 432.1238d));
                                    contentValues.put("bc", Integer.valueOf(i7));
                                    numValueOf = Integer.valueOf(iCurrentTimeMillis);
                                    str = "ac";
                                }
                                try {
                                    contentValues.put(str, numValueOf);
                                    sQLiteDatabase.update("wof", contentValues, "id = \"" + strC + "\"", null);
                                } catch (Exception unused) {
                                }
                            }
                            i3 = i4;
                            c2 = 0;
                        } else {
                            contentValues.put("mktime", Double.valueOf(cVar.t() + 113.2349d));
                            contentValues.put("time", Double.valueOf(cVar.q() + 432.1238d));
                            contentValues.put("bc", (Integer) 1);
                            contentValues.put("cc", (Integer) 1);
                            contentValues.put("ac", Integer.valueOf(iCurrentTimeMillis));
                            contentValues.put("id", strC);
                            sQLiteDatabase.insert("wof", null, contentValues);
                        }
                    } catch (Exception unused2) {
                    }
                    i4 = i4;
                    i3 = i4;
                    c2 = 0;
                }
            }
        }
    }

    public void a(String str, a.a.a.g.a aVar, k kVar, com.baidu.location.c cVar) {
        if (this.k) {
            boolean z = (aVar.e() && o.q().e()) ? false : true;
            boolean z2 = cVar == null || cVar.r() != 161 || (!"wf".equals(cVar.v()) && cVar.z() >= 300.0f);
            if (kVar.f295a == null) {
                z2 = true;
            }
            if ((z && z2) || this.i) {
                return;
            }
            this.i = true;
            new c(this, null).execute(str, aVar, kVar, cVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:28:0x0124 A[Catch: Exception -> 0x012c, TRY_LEAVE, TryCatch #0 {Exception -> 0x012c, blocks: (B:8:0x002c, B:11:0x0052, B:13:0x005e, B:15:0x006a, B:17:0x00a7, B:26:0x010c, B:28:0x0124, B:16:0x008c, B:20:0x00b6), top: B:31:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public final void a(String str, a.a.a.g.a aVar, SQLiteDatabase sQLiteDatabase) {
        double d;
        ContentValues contentValues;
        String string;
        double d2;
        double d3;
        if (aVar.e() && o.q().e()) {
            System.currentTimeMillis();
            float f = 0.0f;
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() >> 28);
            String strD = a.a.a.g.f.w().d(aVar);
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = Integer.parseInt(jSONObject.getJSONObject("result").getString("error"));
                boolean z = false;
                double d4 = 0.0d;
                if (i == 161) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                    if (jSONObject2.has("clf")) {
                        String string2 = jSONObject2.getString("clf");
                        if (string2.equals("0")) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("point");
                            double d5 = Double.parseDouble(jSONObject3.getString("x"));
                            d2 = Double.parseDouble(jSONObject3.getString("y"));
                            string = jSONObject2.getString("radius");
                            d3 = d5;
                        } else {
                            String[] strArrSplit = string2.split("\\|");
                            double d6 = Double.parseDouble(strArrSplit[0]);
                            double d7 = Double.parseDouble(strArrSplit[1]);
                            string = strArrSplit[2];
                            d2 = d7;
                            d3 = d6;
                        }
                        f = Float.parseFloat(string);
                        d = d3;
                        d4 = d2;
                    }
                    if (z) {
                        return;
                    }
                    contentValues = new ContentValues();
                    contentValues.put("time", Double.valueOf(d + 1235.4323d));
                    contentValues.put("tag", Float.valueOf(f + 4326.0f));
                    contentValues.put("type", Double.valueOf(d4 + 2367.3217d));
                    contentValues.put("ac", Integer.valueOf(iCurrentTimeMillis));
                    if (sQLiteDatabase.update("bdcltb09", contentValues, "id = \"" + strD + "\"", null) <= 0) {
                        contentValues.put("id", strD);
                        sQLiteDatabase.insert("bdcltb09", null, contentValues);
                    }
                }
                if (i == 167) {
                    sQLiteDatabase.delete("bdcltb09", "id = \"" + strD + "\"", null);
                    return;
                }
                z = true;
                d = 0.0d;
                if (z) {
                    return;
                }
                contentValues = new ContentValues();
                contentValues.put("time", Double.valueOf(d + 1235.4323d));
                contentValues.put("tag", Float.valueOf(f + 4326.0f));
                contentValues.put("type", Double.valueOf(d4 + 2367.3217d));
                contentValues.put("ac", Integer.valueOf(iCurrentTimeMillis));
                if (sQLiteDatabase.update("bdcltb09", contentValues, "id = \"" + strD + "\"", null) <= 0) {
                    contentValues.put("id", strD);
                    sQLiteDatabase.insert("bdcltb09", null, contentValues);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(String str, SQLiteDatabase sQLiteDatabase) {
        if (str == null || str.equals(this.f211a)) {
            return;
        }
        this.f212b = false;
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("select * from bdcltb09 where id = ?", new String[]{str});
            this.f211a = str;
            if (cursorRawQuery.moveToFirst()) {
                this.e = cursorRawQuery.getDouble(1) - 1235.4323d;
                this.d = cursorRawQuery.getDouble(2) - 4326.0d;
                this.f = cursorRawQuery.getDouble(3) - 2367.3217d;
                this.f212b = true;
            }
        } catch (Exception unused) {
        } finally {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public final void a(String str, List<ScanResult> list) {
        this.f212b = false;
        this.f213c = false;
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = null;
        try {
            sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(n, (SQLiteDatabase.CursorFactory) null);
        } catch (Throwable unused) {
        }
        if (str != null && sQLiteDatabaseOpenOrCreateDatabase != null) {
            a(str, sQLiteDatabaseOpenOrCreateDatabase);
        }
        if (list != null && sQLiteDatabaseOpenOrCreateDatabase != null) {
            a(list, sQLiteDatabaseOpenOrCreateDatabase);
        }
        if (sQLiteDatabaseOpenOrCreateDatabase == null || !sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
            return;
        }
        sQLiteDatabaseOpenOrCreateDatabase.close();
    }

    public final void a(List<ScanResult> list, SQLiteDatabase sQLiteDatabase) {
        double[] dArr;
        boolean z;
        int i;
        int i2;
        System.currentTimeMillis();
        this.f213c = false;
        if (list == null || list.size() == 0 || sQLiteDatabase == null || list == null) {
            return;
        }
        int i3 = 8;
        double[] dArr2 = new double[8];
        StringBuffer stringBuffer = new StringBuffer();
        int i4 = 0;
        for (ScanResult scanResult : list) {
            if (i4 > 10) {
                break;
            }
            if (i4 > 0) {
                stringBuffer.append(",");
            }
            i4++;
            String strC = Jni.c(scanResult.BSSID.replace(":", ""));
            stringBuffer.append("\"");
            stringBuffer.append(strC);
            stringBuffer.append("\"");
        }
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("select * from wof where id in (" + stringBuffer.toString() + ");", null);
            if (cursorRawQuery.moveToFirst()) {
                double d = 0.0d;
                boolean z2 = false;
                boolean z3 = false;
                int i5 = 0;
                int i6 = 0;
                double d2 = 0.0d;
                while (!cursorRawQuery.isAfterLast()) {
                    double d3 = cursorRawQuery.getDouble(1) - 113.2349d;
                    double d4 = cursorRawQuery.getDouble(2) - 432.1238d;
                    int i7 = cursorRawQuery.getInt(4);
                    int i8 = cursorRawQuery.getInt(5);
                    if (i8 <= i3 || i8 <= i7) {
                        if (this.f212b) {
                            float[] fArr = new float[1];
                            dArr = dArr2;
                            Location.distanceBetween(d4, d3, this.f, this.e, fArr);
                            if (fArr[0] <= this.d + 2000.0d) {
                                d += d3;
                                d2 += d4;
                                i6++;
                                z2 = true;
                                i = 8;
                                i2 = 4;
                                z = false;
                            }
                        } else {
                            dArr = dArr2;
                            if (z2) {
                                float[] fArr2 = new float[1];
                                double d5 = i6;
                                Location.distanceBetween(d4, d3, d2 / d5, d / d5, fArr2);
                                if (fArr2[0] <= 1000.0f) {
                                    i = 8;
                                    i2 = 4;
                                    z = false;
                                }
                                cursorRawQuery.moveToNext();
                                i3 = i;
                                dArr2 = dArr;
                            } else if (z3) {
                                for (int i9 = 0; i9 < i5; i9 += 2) {
                                    float[] fArr3 = new float[1];
                                    int i10 = i9 + 1;
                                    Location.distanceBetween(d4, d3, dArr[i10], dArr[i9], fArr3);
                                    if (fArr3[0] < 1000.0f) {
                                        d += dArr[i9];
                                        d2 += dArr[i10];
                                        i6++;
                                        z2 = true;
                                    }
                                }
                                z = false;
                                if (!z2) {
                                    i = 8;
                                    if (i5 >= 8) {
                                        break;
                                    }
                                    int i11 = i5 + 1;
                                    dArr[i5] = d3;
                                    i5 = i11 + 1;
                                    dArr[i11] = d4;
                                } else {
                                    d += d3;
                                    d2 += d4;
                                    i6++;
                                    i = 8;
                                }
                                i2 = 4;
                            } else {
                                int i12 = i5 + 1;
                                dArr[i5] = d3;
                                i5 = i12 + 1;
                                dArr[i12] = d4;
                                i = 8;
                                i2 = 4;
                                z3 = true;
                                z = false;
                            }
                        }
                        if (i6 > i2) {
                            break;
                        }
                        cursorRawQuery.moveToNext();
                        i3 = i;
                        dArr2 = dArr;
                    } else {
                        dArr = dArr2;
                    }
                    i = 8;
                    z = false;
                    cursorRawQuery.moveToNext();
                    i3 = i;
                    dArr2 = dArr;
                }
                if (i6 > 0) {
                    this.f213c = true;
                    double d6 = i6;
                    this.g = d / d6;
                    this.h = d2 / d6;
                }
            }
        } catch (Exception unused) {
        } finally {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public com.baidu.location.c b(boolean z) {
        if (!this.k) {
            return new com.baidu.location.c("{\"result\":{\"time\":\"" + i.i() + "\",\"error\":\"67\"}}");
        }
        a.a.a.g.a aVarA = a.a.a.g.f.w().a();
        String strD = (aVarA == null || !aVarA.d()) ? null : a.a.a.g.f.w().d(aVarA);
        k kVarJ = a.a.a.g.f.w().j();
        com.baidu.location.c cVarA = kVarJ != null ? a(strD, kVarJ.f295a, true) : null;
        if (cVarA != null && cVarA.r() == 66) {
            StringBuffer stringBuffer = new StringBuffer(1024);
            stringBuffer.append(String.format(Locale.CHINA, "&ofl=%f|%f|%f", Double.valueOf(cVarA.q()), Double.valueOf(cVarA.t()), Float.valueOf(cVarA.z())));
            if (kVarJ != null && kVarJ.c() > 0) {
                stringBuffer.append("&wf=");
                stringBuffer.append(a.a.a.g.f.w().b(15, kVarJ));
            }
            if (aVarA != null) {
                stringBuffer.append(a.a.a.g.f.w().a(aVarA));
            }
            stringBuffer.append("&uptype=oldoff");
            stringBuffer.append(i.d(com.baidu.location.f.c()));
            stringBuffer.append(a.a.a.i.b.e().a(false));
            stringBuffer.append(a.a.a.b.c.h().d());
            stringBuffer.toString();
        }
        return cVarA;
    }

    public void b() {
        try {
            File file = new File(m);
            File file2 = new File(n);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            if (file2.exists()) {
                SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file2, (SQLiteDatabase.CursorFactory) null);
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS bdcltb09(id CHAR(40) PRIMARY KEY,time DOUBLE,tag DOUBLE, type DOUBLE , ac INT);");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS wof(id CHAR(15) PRIMARY KEY,mktime DOUBLE,time DOUBLE, ac INT, bc INT, cc INT);");
                sQLiteDatabaseOpenOrCreateDatabase.setVersion(1);
                sQLiteDatabaseOpenOrCreateDatabase.close();
            }
            this.k = true;
        } catch (Throwable unused) {
            this.k = false;
        }
    }

    public void c() {
        if (this.j == null) {
            this.j = new Handler();
        }
        this.j.postDelayed(new RunnableC0010a(), 3000L);
    }
}
