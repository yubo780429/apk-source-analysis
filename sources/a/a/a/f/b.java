package a.a.a.f;

import a.a.a.b.w;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.baidu.location.Jni;
import com.baidu.location.j;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.a.a.f.d f216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f218c;
    public double d;
    public Long e;
    public final SQLiteDatabase h;
    public final SQLiteDatabase i;
    public boolean p = false;
    public final d f = new d(this, true);
    public final d g = new d(this, false);
    public StringBuffer o = new StringBuffer();
    public StringBuffer j = null;
    public StringBuffer k = null;
    public HashSet<Long> l = new HashSet<>();
    public ConcurrentMap<Long, Integer> m = new ConcurrentHashMap();
    public ConcurrentMap<Long, String> n = new ConcurrentHashMap();

    public class a extends c {
        public a(b bVar, String str, Long l, com.baidu.location.c cVar, com.baidu.location.c cVar2, com.baidu.location.c cVar3, String str2, LinkedHashMap linkedHashMap) {
            super(bVar, str, l, cVar, cVar2, cVar3, str2, linkedHashMap, null);
        }
    }

    /* JADX INFO: renamed from: a.a.a.f.b$b, reason: collision with other inner class name */
    public static final class C0011b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f221c;

        public C0011b(double d, double d2, double d3) {
            this.f219a = d;
            this.f220b = d2;
            this.f221c = d3;
        }

        public /* synthetic */ C0011b(double d, double d2, double d3, a aVar) {
            this(d, d2, d3);
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f223c;
        public com.baidu.location.c d;
        public com.baidu.location.c e;
        public com.baidu.location.c f;
        public String g;
        public LinkedHashMap<String, Integer> h;

        public c(String str, Long l, com.baidu.location.c cVar, com.baidu.location.c cVar2, com.baidu.location.c cVar3, String str2, LinkedHashMap<String, Integer> linkedHashMap) {
            this.f222b = str;
            this.f223c = l;
            this.d = cVar;
            this.e = cVar2;
            this.f = cVar3;
            this.g = str2;
            this.h = linkedHashMap;
        }

        public /* synthetic */ c(b bVar, String str, Long l, com.baidu.location.c cVar, com.baidu.location.c cVar2, com.baidu.location.c cVar3, String str2, LinkedHashMap linkedHashMap, a aVar) {
            this(str, l, cVar, cVar2, cVar3, str2, linkedHashMap);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                b.this.a(this.f222b, this.f223c, this.d);
                b.this.j = null;
                b.this.k = null;
                b.this.a(this.h);
                b.this.a(this.f, this.d, this.e, this.f222b, this.f223c);
                if (this.g != null) {
                    b.this.f216a.e().a(this.g);
                }
            } catch (Exception unused) {
            }
            this.h = null;
            this.f222b = null;
            this.g = null;
            this.f223c = null;
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }

    public final class d extends a.a.a.i.g {
        public String i;
        public final String j;
        public String k;
        public b l;
        public boolean m = false;
        public int n = 0;
        public long o = -1;
        public long p = -1;
        public long q = -1;
        public long r = -1;

        public class a extends Thread {
            public a() {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                JSONObject jSONObject2;
                JSONObject jSONObject3;
                b bVar;
                String str;
                String str2;
                String str3;
                String str4;
                JSONObject jSONObject4;
                int i;
                String str5 = "DELETE FROM %s WHERE id NOT IN (SELECT id FROM %s ORDER BY timestamp DESC, frequency DESC LIMIT %d);";
                String str6 = "CL";
                super.run();
                if (b.this.h == null || b.this.i == null || !b.this.h.isOpen() || !b.this.i.isOpen()) {
                    d.this.m = false;
                    return;
                }
                try {
                    String str7 = d.this.f339c;
                    if (str7 != null) {
                        jSONObject2 = new JSONObject(str7);
                        try {
                            jSONObject = jSONObject2.has("model") ? jSONObject2.getJSONObject("model") : null;
                            try {
                                jSONObject3 = jSONObject2.has("rgc") ? jSONObject2.getJSONObject("rgc") : null;
                            } catch (Exception e) {
                                e = e;
                                e.printStackTrace();
                            }
                        } catch (Exception e2) {
                            e = e2;
                            jSONObject = null;
                        }
                    } else {
                        jSONObject3 = null;
                        jSONObject = null;
                        jSONObject2 = null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    jSONObject = null;
                    jSONObject2 = null;
                }
                try {
                    b.this.h.beginTransaction();
                    b.this.i.beginTransaction();
                } catch (Exception unused) {
                }
                try {
                    try {
                        if (jSONObject3 != null) {
                            b.this.f216a.g().a(jSONObject3);
                        }
                        if (jSONObject2 != null && jSONObject2.has("type") && jSONObject2.getString("type").equals("0")) {
                            d.this.p = System.currentTimeMillis();
                        }
                        if (jSONObject2 != null && jSONObject2.has("bdlist")) {
                            d.this.l.a(jSONObject2.getString("bdlist").split(";"));
                        }
                        if (jSONObject2 != null && jSONObject2.has("loadurl")) {
                            d.this.l.a(jSONObject2.getJSONObject("loadurl").getString("host"), jSONObject2.getJSONObject("loadurl").getString("module"), jSONObject2.getJSONObject("loadurl").getString("req"));
                        }
                        String str8 = "cell";
                        String str9 = ",";
                        char c2 = 3;
                        if (jSONObject == null || !jSONObject.has("cell")) {
                            str = "cell";
                            str2 = "CL";
                        } else {
                            JSONObject jSONObject5 = jSONObject.getJSONObject("cell");
                            Iterator<String> itKeys = jSONObject5.keys();
                            StringBuffer stringBuffer = new StringBuffer();
                            StringBuffer stringBuffer2 = new StringBuffer();
                            StringBuffer stringBuffer3 = new StringBuffer();
                            int i2 = 0;
                            boolean z = true;
                            int i3 = 0;
                            int i4 = 0;
                            boolean z2 = true;
                            boolean z3 = true;
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String string = jSONObject5.getString(next);
                                Double dValueOf = Double.valueOf(string.split(",")[c2]);
                                if (z) {
                                    z = false;
                                } else {
                                    stringBuffer2.append(',');
                                }
                                stringBuffer2.append(next);
                                int i5 = i2 + 1;
                                if (dValueOf.doubleValue() > 0.0d) {
                                    if (z3) {
                                        z3 = false;
                                    } else {
                                        stringBuffer3.append(',');
                                    }
                                    stringBuffer3.append('(');
                                    stringBuffer3.append(next);
                                    stringBuffer3.append(',');
                                    stringBuffer3.append(string);
                                    stringBuffer3.append("," + (System.currentTimeMillis() / 1000));
                                    stringBuffer3.append(')');
                                    i3++;
                                } else {
                                    jSONObject5 = jSONObject5;
                                    if (z2) {
                                        z2 = false;
                                    } else {
                                        stringBuffer.append(',');
                                    }
                                    stringBuffer.append(next);
                                    i4++;
                                }
                                int i6 = i3;
                                int i7 = i4;
                                if (i5 >= 100) {
                                    b.this.i.execSQL(String.format("DELETE FROM CL WHERE id IN (%s);", stringBuffer2.toString()));
                                    stringBuffer2.setLength(0);
                                    i2 = i5 - 100;
                                    i = 100;
                                    z = true;
                                } else {
                                    i2 = i5;
                                    i = 100;
                                }
                                if (i6 >= i) {
                                    b.this.h.execSQL(String.format("INSERT OR REPLACE INTO CL (id,x,y,r,cl,timestamp) VALUES %s;", stringBuffer3.toString()));
                                    stringBuffer3.setLength(0);
                                    i3 = i6 - 100;
                                    i = 100;
                                    z3 = true;
                                } else {
                                    i3 = i6;
                                }
                                if (i7 >= i) {
                                    b.this.h.execSQL(String.format("DELETE FROM CL WHERE id IN (%s);", stringBuffer.toString()));
                                    stringBuffer.setLength(0);
                                    i4 = i7 - 100;
                                    c2 = 3;
                                    z2 = true;
                                } else {
                                    i4 = i7;
                                    c2 = 3;
                                }
                            }
                            str = str8;
                            str2 = str6;
                            if (i2 > 0) {
                                b.this.i.execSQL(String.format("DELETE FROM CL WHERE id IN (%s);", stringBuffer2.toString()));
                            }
                            if (i3 > 0) {
                                b.this.h.execSQL(String.format("INSERT OR REPLACE INTO CL (id,x,y,r,cl,timestamp) VALUES %s;", stringBuffer3.toString()));
                            }
                            if (i4 > 0) {
                                b.this.h.execSQL(String.format("DELETE FROM CL WHERE id IN (%s);", stringBuffer.toString()));
                            }
                        }
                        String str10 = "ap";
                        if (jSONObject == null || !jSONObject.has("ap")) {
                            str3 = "ap";
                            str4 = "DELETE FROM %s WHERE id NOT IN (SELECT id FROM %s ORDER BY timestamp DESC, frequency DESC LIMIT %d);";
                            jSONObject4 = jSONObject;
                        } else {
                            JSONObject jSONObject6 = jSONObject.getJSONObject("ap");
                            Iterator<String> itKeys2 = jSONObject6.keys();
                            StringBuffer stringBuffer4 = new StringBuffer();
                            StringBuffer stringBuffer5 = new StringBuffer();
                            StringBuffer stringBuffer6 = new StringBuffer();
                            int i8 = 0;
                            boolean z4 = true;
                            int i9 = 0;
                            int i10 = 0;
                            boolean z5 = true;
                            boolean z6 = true;
                            while (true) {
                                str3 = str10;
                                jSONObject4 = jSONObject;
                                if (!itKeys2.hasNext()) {
                                    break;
                                }
                                Iterator<String> it = itKeys2;
                                String next2 = itKeys2.next();
                                String str11 = str5;
                                String string2 = jSONObject6.getString(next2);
                                Double dValueOf2 = Double.valueOf(string2.split(str9)[3]);
                                if (z4) {
                                    z4 = false;
                                } else {
                                    stringBuffer5.append(',');
                                }
                                stringBuffer5.append(next2);
                                i8++;
                                if (dValueOf2.doubleValue() > 0.0d) {
                                    if (z6) {
                                        z6 = false;
                                    } else {
                                        stringBuffer6.append(',');
                                    }
                                    stringBuffer6.append('(');
                                    stringBuffer6.append(next2);
                                    stringBuffer6.append(',');
                                    stringBuffer6.append(string2);
                                    stringBuffer6.append(str9 + (System.currentTimeMillis() / 1000));
                                    stringBuffer6.append(')');
                                    i9++;
                                } else {
                                    if (z5) {
                                        z5 = false;
                                    } else {
                                        stringBuffer4.append(',');
                                    }
                                    stringBuffer4.append(next2);
                                    i10++;
                                }
                                int i11 = 100;
                                if (i8 >= 100) {
                                    b.this.i.execSQL(String.format("DELETE FROM AP WHERE id IN (%s);", stringBuffer5.toString()));
                                    stringBuffer5.setLength(0);
                                    i8 -= 100;
                                    i11 = 100;
                                    z4 = true;
                                }
                                if (i9 >= i11) {
                                    b.this.h.execSQL(String.format("INSERT OR REPLACE INTO AP (id,x,y,r,cl,timestamp) VALUES %s;", stringBuffer6.toString()));
                                    stringBuffer6.setLength(0);
                                    i9 -= 100;
                                    z6 = true;
                                }
                                if (i10 > 0) {
                                    b.this.h.execSQL(String.format("DELETE FROM AP WHERE id IN (%s);", stringBuffer4.toString()));
                                }
                                str5 = str11;
                                str10 = str3;
                                jSONObject = jSONObject4;
                                itKeys2 = it;
                                str9 = str9;
                                jSONObject6 = jSONObject6;
                            }
                            str4 = str5;
                            if (i8 > 0) {
                                b.this.i.execSQL(String.format("DELETE FROM AP WHERE id IN (%s);", stringBuffer5.toString()));
                            }
                            if (i9 > 0) {
                                b.this.h.execSQL(String.format("INSERT OR REPLACE INTO AP (id,x,y,r,cl,timestamp) VALUES %s;", stringBuffer6.toString()));
                            }
                            if (i10 > 0) {
                                b.this.h.execSQL(String.format("DELETE FROM AP WHERE id IN (%s);", stringBuffer4.toString()));
                            }
                        }
                        String str12 = str4;
                        b.this.h.execSQL(String.format(str12, "AP", "AP", 200000));
                        b.this.h.execSQL(String.format(str12, str2, str2, 200000));
                        b.this.i.execSQL(String.format("DELETE FROM %s WHERE id NOT IN (SELECT id FROM %s ORDER BY frequency DESC LIMIT %d);", "AP", "AP", 10000));
                        b.this.i.execSQL(String.format("DELETE FROM %s WHERE id NOT IN (SELECT id FROM %s ORDER BY frequency DESC LIMIT %d);", str2, str2, 10000));
                        if (jSONObject4 != null) {
                            JSONObject jSONObject7 = jSONObject4;
                            if (!jSONObject7.has(str3) && !jSONObject7.has(str)) {
                                d.this.b();
                            }
                        }
                        b.this.h.setTransactionSuccessful();
                        b.this.i.setTransactionSuccessful();
                        if (b.this.h != null && b.this.h.isOpen()) {
                            b.this.h.endTransaction();
                        }
                        if (b.this.i != null && b.this.i.isOpen()) {
                            bVar = b.this;
                            bVar.i.endTransaction();
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    d.this.b();
                    if (b.this.h != null && b.this.h.isOpen()) {
                        b.this.h.endTransaction();
                    }
                    if (b.this.i != null && b.this.i.isOpen()) {
                        bVar = b.this;
                    }
                } finally {
                    try {
                        if (b.this.h != null && b.this.h.isOpen()) {
                            b.this.h.endTransaction();
                        }
                        if (b.this.i != null && b.this.i.isOpen()) {
                            b.this.i.endTransaction();
                        }
                    } catch (Exception unused4) {
                    }
                    d dVar = d.this;
                    dVar.f339c = null;
                    dVar.m = false;
                }
            }
        }

        public d(b bVar, boolean z) {
            this.l = bVar;
            this.j = z ? "load" : "update";
            this.d = new HashMap();
            this.i = a.a.a.f.d.j;
        }

        @Override // a.a.a.i.g
        public void a() {
            this.m = true;
            this.f337a = this.i;
            this.d.clear();
            this.d.put("qt", this.j);
            this.d.put("req", this.k);
        }

        public final void a(String str, String str2, String str3) {
            this.k = str3;
            this.i = String.format("http://%s/%s", str, str2);
            a(false, "ofloc.map.baidu.com");
        }

        @Override // a.a.a.i.g
        public void a(boolean z) {
            if (z && this.f339c != null) {
                new a().start();
            } else {
                this.m = false;
                b();
            }
        }

        public final void b() {
            this.n++;
            this.o = System.currentTimeMillis();
        }

        public final String c() {
            JSONObject jSONObject;
            try {
                jSONObject = new JSONObject();
                jSONObject.put("type", "0");
                jSONObject.put("cuid", a.a.a.i.b.e().f321c);
                jSONObject.put("ver", "1");
                jSONObject.put("prod", a.a.a.i.b.g + ":" + a.a.a.i.b.f);
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return Jni.e(jSONObject.toString());
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:104:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:110:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:112:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:17:0x006a  */
        /* JADX WARN: Code duplicated, block: B:24:0x0094 A[Catch: all -> 0x00f4, Exception -> 0x0116, TryCatch #16 {Exception -> 0x0116, all -> 0x00f4, blocks: (B:22:0x008e, B:24:0x0094, B:25:0x009d, B:27:0x00a3, B:28:0x00ae, B:29:0x00b3, B:31:0x00ba, B:33:0x00ca, B:36:0x00e9), top: B:104:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:27:0x00a3 A[Catch: all -> 0x00f4, Exception -> 0x0116, LOOP:0: B:25:0x009d->B:27:0x00a3, LOOP_END, TryCatch #16 {Exception -> 0x0116, all -> 0x00f4, blocks: (B:22:0x008e, B:24:0x0094, B:25:0x009d, B:27:0x00a3, B:28:0x00ae, B:29:0x00b3, B:31:0x00ba, B:33:0x00ca, B:36:0x00e9), top: B:104:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e9 A[Catch: all -> 0x00f4, Exception -> 0x0116, TRY_LEAVE, TryCatch #16 {Exception -> 0x0116, all -> 0x00f4, blocks: (B:22:0x008e, B:24:0x0094, B:25:0x009d, B:27:0x00a3, B:28:0x00ae, B:29:0x00b3, B:31:0x00ba, B:33:0x00ca, B:36:0x00e9), top: B:104:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0122  */
        /* JADX WARN: Code duplicated, block: B:71:0x014b  */
        /* JADX WARN: Code duplicated, block: B:73:0x014e  */
        /* JADX WARN: Code duplicated, block: B:86:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x011d A[EXC_TOP_SPLITTER, PHI: r6 r7 r8
  0x011d: PHI (r6v2 org.json.JSONObject) = (r6v1 org.json.JSONObject), (r6v4 org.json.JSONObject) binds: [B:61:0x011b, B:39:0x00f1] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r7v4 android.database.Cursor) = (r7v3 android.database.Cursor), (r7v8 android.database.Cursor) binds: [B:61:0x011b, B:39:0x00f1] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r8v3 android.database.Cursor) = (r8v2 android.database.Cursor), (r8v13 android.database.Cursor) binds: [B:61:0x011b, B:39:0x00f1] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        public final String d() throws Throwable {
            Cursor cursor;
            Cursor cursorRawQuery;
            JSONObject jSONObject;
            Cursor cursorRawQuery2;
            String str;
            int count;
            JSONArray jSONArray;
            Cursor cursor2 = null;
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject = new JSONObject();
                    try {
                        int count2 = 0;
                        cursorRawQuery2 = b.this.i.rawQuery(String.format("SELECT * FROM %s WHERE frequency>%d ORDER BY frequency DESC LIMIT %d;", "CL", 5, 50), null);
                        if (cursorRawQuery2 != null) {
                            try {
                                try {
                                    if (cursorRawQuery2.moveToFirst()) {
                                        count = cursorRawQuery2.getCount();
                                        JSONArray jSONArray2 = new JSONArray();
                                        while (!cursorRawQuery2.isAfterLast()) {
                                            try {
                                                jSONArray2.put(cursorRawQuery2.getString(1));
                                                cursorRawQuery2.moveToNext();
                                                cursor2 = null;
                                            } catch (Exception unused) {
                                                cursor = null;
                                                cursorRawQuery = cursor;
                                                if (cursorRawQuery != null) {
                                                    try {
                                                        cursorRawQuery.close();
                                                    } catch (Exception unused2) {
                                                    }
                                                }
                                                if (cursorRawQuery2 != null) {
                                                    try {
                                                        cursorRawQuery2.close();
                                                    } catch (Exception unused3) {
                                                    }
                                                }
                                                if (jSONObject != null) {
                                                    str = cursor;
                                                } else {
                                                    str = cursor;
                                                }
                                                if (jSONObject == null) {
                                                    return str;
                                                }
                                            }
                                        }
                                        jSONObject2.put("cell", jSONArray2);
                                    } else {
                                        count = 0;
                                    }
                                    try {
                                        cursor = null;
                                        try {
                                            cursorRawQuery = b.this.i.rawQuery(String.format("SELECT * FROM %s WHERE frequency>%d ORDER BY frequency DESC LIMIT %d;", "AP", 5, 50), null);
                                            if (cursorRawQuery != null) {
                                                try {
                                                    if (cursorRawQuery.moveToFirst()) {
                                                        count2 = cursorRawQuery.getCount();
                                                        jSONArray = new JSONArray();
                                                        while (!cursorRawQuery.isAfterLast()) {
                                                            jSONArray.put(cursorRawQuery.getString(1));
                                                            cursorRawQuery.moveToNext();
                                                        }
                                                        jSONObject2.put("ap", jSONArray);
                                                    }
                                                } catch (Exception unused4) {
                                                    if (cursorRawQuery != null) {
                                                        cursorRawQuery.close();
                                                    }
                                                    if (cursorRawQuery2 != null) {
                                                        cursorRawQuery2.close();
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cursor2 = cursorRawQuery;
                                                    if (cursor2 != null) {
                                                        try {
                                                            cursor2.close();
                                                        } catch (Exception unused5) {
                                                        }
                                                    }
                                                    if (cursorRawQuery2 == null) {
                                                        throw th;
                                                    }
                                                    try {
                                                        cursorRawQuery2.close();
                                                        throw th;
                                                    } catch (Exception unused6) {
                                                        throw th;
                                                    }
                                                }
                                            }
                                            jSONObject.put("type", "1");
                                            jSONObject.put("cuid", a.a.a.i.b.e().f321c);
                                            jSONObject.put("ver", "1");
                                            jSONObject.put("prod", a.a.a.i.b.g + ":" + a.a.a.i.b.f);
                                            if (count == 0 || count2 != 0) {
                                                jSONObject.put("model", jSONObject2);
                                            }
                                            if (cursorRawQuery != null) {
                                                try {
                                                    cursorRawQuery.close();
                                                } catch (Exception unused7) {
                                                }
                                            }
                                            if (cursorRawQuery2 != null) {
                                                cursorRawQuery2.close();
                                            }
                                        } catch (Exception unused8) {
                                            cursorRawQuery = cursor;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (cursorRawQuery2 != null) {
                                                cursorRawQuery2.close();
                                            }
                                            if (jSONObject != null) {
                                                str = cursor;
                                            } else {
                                                str = cursor;
                                            }
                                            if (jSONObject == null) {
                                                return str;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (cursorRawQuery2 == null) {
                                                throw th;
                                            }
                                            cursorRawQuery2.close();
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursor = null;
                                    }
                                } catch (Exception unused9) {
                                    cursor = cursor2;
                                    cursorRawQuery = cursor;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (cursorRawQuery2 != null) {
                                        cursorRawQuery2.close();
                                    }
                                    if (jSONObject != null) {
                                        str = cursor;
                                    } else {
                                        str = cursor;
                                    }
                                    if (jSONObject == null) {
                                        return str;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cursor2 = null;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (cursorRawQuery2 == null) {
                                    throw th;
                                }
                                cursorRawQuery2.close();
                                throw th;
                            }
                        } else {
                            count = 0;
                            cursor = null;
                            cursorRawQuery = b.this.i.rawQuery(String.format("SELECT * FROM %s WHERE frequency>%d ORDER BY frequency DESC LIMIT %d;", "AP", 5, 50), null);
                            if (cursorRawQuery != null) {
                                if (cursorRawQuery.moveToFirst()) {
                                    count2 = cursorRawQuery.getCount();
                                    jSONArray = new JSONArray();
                                    while (!cursorRawQuery.isAfterLast()) {
                                        jSONArray.put(cursorRawQuery.getString(1));
                                        cursorRawQuery.moveToNext();
                                    }
                                    jSONObject2.put("ap", jSONArray);
                                }
                            }
                            jSONObject.put("type", "1");
                            jSONObject.put("cuid", a.a.a.i.b.e().f321c);
                            jSONObject.put("ver", "1");
                            jSONObject.put("prod", a.a.a.i.b.g + ":" + a.a.a.i.b.f);
                            if (count == 0) {
                                jSONObject.put("model", jSONObject2);
                            } else {
                                jSONObject.put("model", jSONObject2);
                            }
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            if (cursorRawQuery2 != null) {
                                cursorRawQuery2.close();
                            }
                        }
                    } catch (Exception unused10) {
                        cursor = null;
                        cursorRawQuery = null;
                        cursorRawQuery2 = null;
                    }
                } catch (Exception unused11) {
                    cursor = null;
                    cursorRawQuery = null;
                    jSONObject = null;
                    cursorRawQuery2 = null;
                }
                if (jSONObject != null || jSONObject.has("model")) {
                    str = cursor;
                } else {
                    long j = this.r;
                    if (j == -1 || j + 86400000 < System.currentTimeMillis()) {
                        String strE = Jni.e(jSONObject.toString());
                        this.r = System.currentTimeMillis();
                        str = strE;
                    } else {
                        str = cursor;
                    }
                }
                return (jSONObject == null || !jSONObject.has("model")) ? str : Jni.e(jSONObject.toString());
            } catch (Throwable th5) {
                th = th5;
                cursorRawQuery2 = null;
            }
        }

        public final String e() {
            JSONObject jSONObject;
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", "2");
                    jSONObject.put("ver", "1");
                    jSONObject.put("cuid", a.a.a.i.b.e().f321c);
                    jSONObject.put("prod", a.a.a.i.b.g + ":" + a.a.a.i.b.f);
                    this.q = System.currentTimeMillis();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return Jni.e(jSONObject.toString());
            }
            return null;
        }

        public final String f() {
            JSONObject jSONObject;
            try {
                JSONObject jSONObjectA = b.this.f216a.g().a();
                if (jSONObjectA != null) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", "3");
                        jSONObject.put("ver", "1");
                        jSONObject.put("cuid", a.a.a.i.b.e().f321c);
                        jSONObject.put("prod", a.a.a.i.b.g + ":" + a.a.a.i.b.f);
                        jSONObject.put("rgc", jSONObjectA);
                        this.q = System.currentTimeMillis();
                    } catch (Exception unused) {
                    }
                } else {
                    jSONObject = null;
                }
            } catch (Exception unused2) {
            }
            if (jSONObject != null) {
                return Jni.e(jSONObject.toString());
            }
            return null;
        }

        public final boolean g() throws Throwable {
            Cursor cursor;
            Cursor cursor2;
            Cursor cursorRawQuery = null;
            boolean z = true;
            try {
                Cursor cursorRawQuery2 = b.this.h.rawQuery("SELECT COUNT(*) FROM AP;", null);
                try {
                    cursorRawQuery = b.this.h.rawQuery("SELECT COUNT(*) FROM CL", null);
                    if (cursorRawQuery2 != null && cursorRawQuery2.moveToFirst() && cursorRawQuery != null && cursorRawQuery.moveToFirst() && (cursorRawQuery2.getInt(0) != 0 || cursorRawQuery.getInt(0) != 0)) {
                        z = false;
                    }
                    if (cursorRawQuery2 != null) {
                        try {
                            cursorRawQuery2.close();
                        } catch (Exception unused) {
                        }
                    }
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Exception unused3) {
                    cursor2 = cursorRawQuery;
                    cursorRawQuery = cursorRawQuery2;
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused4) {
                        }
                    }
                    if (cursor2 != null) {
                        cursorRawQuery = cursor2;
                        cursorRawQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    cursorRawQuery = cursorRawQuery2;
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (cursor == null) {
                        throw th;
                    }
                    try {
                        cursor.close();
                        throw th;
                    } catch (Exception unused6) {
                        throw th;
                    }
                }
            } catch (Exception unused7) {
                cursor2 = null;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
            return z;
        }

        public final boolean h() {
            if (this.n < 2) {
                return true;
            }
            if (this.o + 43200000 >= System.currentTimeMillis()) {
                return false;
            }
            this.n = 0;
            this.o = -1L;
            return true;
        }

        public void i() throws Throwable {
            if (!h() || this.m) {
                return;
            }
            b.this.g.j();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002c  */
        /* JADX WARN: Code duplicated, block: B:17:0x003b  */
        /* JADX WARN: Code duplicated, block: B:19:0x004b  */
        /* JADX WARN: Code duplicated, block: B:20:0x0050  */
        /* JADX WARN: Code duplicated, block: B:24:0x005a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0066  */
        /* JADX WARN: Code duplicated, block: B:27:0x006a  */
        /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
        public final void j() throws Throwable {
            String strD;
            ExecutorService executorServiceB;
            long j;
            String strF;
            this.k = null;
            if (g()) {
                long j2 = this.p;
                if (j2 == -1 || j2 + 86400000 <= System.currentTimeMillis()) {
                    strD = c();
                }
                if (this.k == null) {
                    j = this.q;
                    if (j != -1 || j + 86400000 <= System.currentTimeMillis()) {
                        if (b.this.f216a.g().b()) {
                            strF = e();
                        } else {
                            strF = f();
                        }
                        this.k = strF;
                    }
                }
                if (this.k != null) {
                    executorServiceB = w.d().b();
                    if (executorServiceB != null) {
                        a(executorServiceB, "https://ofloc.map.baidu.com/offline_loc");
                    } else {
                        a("https://ofloc.map.baidu.com/offline_loc");
                    }
                }
            }
            strD = d();
            this.k = strD;
            if (this.k == null) {
                j = this.q;
                if (j != -1) {
                    if (b.this.f216a.g().b()) {
                        strF = e();
                    } else {
                        strF = f();
                    }
                    this.k = strF;
                } else {
                    if (b.this.f216a.g().b()) {
                        strF = e();
                    } else {
                        strF = f();
                    }
                    this.k = strF;
                }
            }
            if (this.k != null) {
                executorServiceB = w.d().b();
                if (executorServiceB != null) {
                    a(executorServiceB, "https://ofloc.map.baidu.com/offline_loc");
                } else {
                    a("https://ofloc.map.baidu.com/offline_loc");
                }
            }
        }
    }

    public b(a.a.a.f.d dVar) {
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase;
        this.f216a = dVar;
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase2 = null;
        try {
            File file = new File(dVar.h(), "ofl_location.db");
            if (!file.exists()) {
                file.createNewFile();
            }
            sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
        } catch (Exception unused) {
            sQLiteDatabaseOpenOrCreateDatabase = null;
        }
        this.h = sQLiteDatabaseOpenOrCreateDatabase;
        if (sQLiteDatabaseOpenOrCreateDatabase != null) {
            try {
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS AP (id LONG PRIMARY KEY,x DOUBLE,y DOUBLE,r INTEGER,cl DOUBLE,timestamp INTEGER, frequency INTEGER DEFAULT 0);");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS CL (id LONG PRIMARY KEY,x DOUBLE,y DOUBLE,r INTEGER,cl DOUBLE,timestamp INTEGER, frequency INTEGER DEFAULT 0);");
            } catch (Exception unused2) {
            }
        }
        try {
            File file2 = new File(this.f216a.h(), "ofl_statistics.db");
            if (!file2.exists()) {
                file2.createNewFile();
            }
            sQLiteDatabaseOpenOrCreateDatabase2 = SQLiteDatabase.openOrCreateDatabase(file2, (SQLiteDatabase.CursorFactory) null);
        } catch (Exception unused3) {
        }
        this.i = sQLiteDatabaseOpenOrCreateDatabase2;
        if (sQLiteDatabaseOpenOrCreateDatabase2 != null) {
            try {
                sQLiteDatabaseOpenOrCreateDatabase2.execSQL("CREATE TABLE IF NOT EXISTS AP (id LONG PRIMARY KEY, originid VARCHAR(15), frequency INTEGER DEFAULT 0);");
                sQLiteDatabaseOpenOrCreateDatabase2.execSQL("CREATE TABLE IF NOT EXISTS CL (id LONG PRIMARY KEY, originid VARCHAR(40), frequency INTEGER DEFAULT 0);");
            } catch (Exception unused4) {
            }
        }
    }

    public final double a(double d2, double d3, double d4, double d5) {
        double radians = Math.toRadians(d2);
        Math.toRadians(d3);
        double radians2 = Math.toRadians(d4);
        Math.toRadians(d5);
        double radians3 = Math.toRadians(d5 - d3);
        double radians4 = Math.toRadians(d4 - d2) / 2.0d;
        double d6 = radians3 / 2.0d;
        double dSin = (Math.sin(radians4) * Math.sin(radians4)) + (Math.cos(radians) * Math.cos(radians2) * Math.sin(d6) * Math.sin(d6));
        return Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 2.0d * 6378137.0d;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    public final int a(ArrayList<C0011b> arrayList, double d2) {
        boolean z;
        int i = 0;
        if (arrayList.size() == 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            if (arrayList.size() >= 3) {
                double d3 = 0.0d;
                double d4 = 0.0d;
                for (int i3 = i; i3 < arrayList.size(); i3++) {
                    d4 += arrayList.get(i3).f219a;
                    d3 += arrayList.get(i3).f220b;
                }
                double size = d4 / ((double) arrayList.size());
                double size2 = d3 / ((double) arrayList.size());
                double d5 = -1.0d;
                int i4 = i;
                int i5 = -1;
                while (i4 < arrayList.size()) {
                    double d6 = size;
                    int i6 = i4;
                    int i7 = i5;
                    double dA = a(size2, d6, arrayList.get(i4).f220b, arrayList.get(i4).f219a);
                    if (dA > d5) {
                        d5 = dA;
                        i5 = i6;
                    } else {
                        i5 = i7;
                    }
                    i4 = i6 + 1;
                    size = d6;
                }
                int i8 = i5;
                if (d5 <= d2 || i8 < 0 || i8 >= arrayList.size()) {
                    z = false;
                } else {
                    i2++;
                    arrayList.remove(i8);
                    z = true;
                }
            } else {
                z = false;
            }
            if (!z) {
                return i2;
            }
            i = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    public Cursor a(e.a aVar) throws Throwable {
        com.baidu.location.c cVarA;
        Double d2;
        Double dValueOf;
        Double d3;
        Double d4;
        int i;
        com.baidu.location.c cVar;
        int i2;
        List<j> listB;
        int i3;
        String str;
        com.baidu.location.c cVar2;
        String string;
        Double dValueOf2;
        Double dValueOf3;
        Double dValueOf4;
        com.baidu.location.c cVar3 = new com.baidu.location.c();
        cVar3.h(67);
        if (aVar.f243c) {
            String str2 = aVar.f242b;
            LinkedHashMap<String, Integer> linkedHashMap = aVar.i;
            int i4 = aVar.f;
            com.baidu.location.c cVar4 = aVar.g;
            long jD = Long.MIN_VALUE;
            com.baidu.location.c cVarA2 = (str2 == null || this.h == null || (jD = Jni.d(str2)) == null) ? null : a(jD);
            if (linkedHashMap == null || linkedHashMap.size() <= 0 || this.h == null) {
                cVarA = null;
            } else {
                this.m.clear();
                this.l.clear();
                this.n.clear();
                cVarA = a(linkedHashMap, cVarA2, i4);
            }
            if (cVarA2 != null) {
                dValueOf4 = Double.valueOf(cVarA2.t());
                dValueOf = Double.valueOf(cVarA2.q());
                double[] dArrA = Jni.a(cVarA2.t(), cVarA2.q(), "bd09ll2gcj");
                cVarA2.e("gcj02");
                cVarA2.c(dArrA[1]);
                cVarA2.d(dArrA[0]);
                cVarA2.l("cl");
            } else {
                d2 = null;
                dValueOf = null;
            }
            if (cVarA != null) {
                dValueOf2 = Double.valueOf(cVarA.t());
                dValueOf3 = Double.valueOf(cVarA.q());
                double[] dArrA2 = Jni.a(cVarA.t(), cVarA.q(), "bd09ll2gcj");
                cVarA.e("gcj02");
                cVarA.c(dArrA2[1]);
                cVarA.d(dArrA2[0]);
                cVarA.l("wf");
            } else {
                d3 = null;
                d4 = null;
            }
            if (cVarA2 != null && cVarA == null) {
                i = 1;
            } else if (cVarA2 != null || cVarA == null) {
                i = (cVarA2 == null || cVarA == null) ? 0 : 4;
            } else {
                i = 2;
            }
            boolean z = aVar.f > 0;
            boolean z2 = linkedHashMap == 0 || linkedHashMap.size() <= 0;
            if (z) {
                if (cVarA != null) {
                    d2 = d3;
                    dValueOf = d4;
                    cVar = cVarA;
                } else if (!z2 || cVarA2 == null) {
                    cVar = cVar3;
                    d2 = null;
                    dValueOf = null;
                } else {
                    cVar = cVarA2;
                }
            } else if (cVarA != null) {
                d2 = d3;
                dValueOf = d4;
                cVar = cVarA;
            } else if (cVarA2 != null) {
                cVar = cVarA2;
            } else {
                cVar = cVar3;
                d2 = null;
                dValueOf = null;
            }
            if (aVar.e && this.f216a.c().n() && dValueOf != null && d2 != null) {
                cVar.a(this.f216a.g().a(d2.doubleValue(), dValueOf.doubleValue()));
            }
            if (z && aVar.e && cVar.b() == null) {
                cVar = cVar3;
                i2 = 0;
                d2 = null;
                dValueOf = null;
            } else {
                i2 = i;
            }
            if ((!aVar.d && !aVar.h) || dValueOf == null || d2 == null) {
                listB = null;
            } else {
                listB = this.f216a.g().b(d2.doubleValue(), dValueOf.doubleValue());
                if (aVar.d) {
                    cVar.a(listB);
                }
            }
            if (z && aVar.d && (listB == null || listB.size() <= 0)) {
                cVar = cVar3;
                i2 = 0;
            }
            if (!aVar.h || listB == null || listB.size() <= 0) {
                i3 = 0;
                str = null;
            } else {
                i3 = 0;
                str = String.format(Locale.CHINA, "在%s附近", listB.get(0).c());
                cVar.j(str);
            }
            if (z && aVar.h && str == null) {
                cVar2 = cVar3;
            } else {
                cVar2 = cVar;
                i3 = i2;
            }
            StringBuffer stringBuffer = new StringBuffer();
            String str3 = aVar.f241a;
            if (str3 != null) {
                stringBuffer.append(str3);
                stringBuffer.append(e.a(cVarA, cVarA2, aVar));
                stringBuffer.append(e.a(cVar2, i3));
                string = stringBuffer.toString();
            } else {
                string = null;
            }
            new a(this, str2, jD, cVarA2, cVarA, cVar4, string, linkedHashMap).start();
            cVar3 = cVar2;
        }
        return e.a(cVar3);
    }

    public SQLiteDatabase a() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca A[EXC_TOP_SPLITTER, PHI: r0 r1 r3 r6 r7
  0x00ca: PHI (r0v6 int) = (r0v5 int), (r0v12 int) binds: [B:40:0x00c8, B:32:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r1v3 double) = (r1v2 double), (r1v6 double) binds: [B:40:0x00c8, B:32:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r3v6 android.database.Cursor) = (r3v5 android.database.Cursor), (r3v7 android.database.Cursor) binds: [B:40:0x00c8, B:32:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r6v4 boolean) = (r6v3 boolean), (r6v6 boolean) binds: [B:40:0x00c8, B:32:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r7v4 double) = (r7v3 double), (r7v7 double) binds: [B:40:0x00c8, B:32:0x00ba] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public final com.baidu.location.c a(Long l) throws Throwable {
        double d2;
        int i;
        Cursor cursorRawQuery;
        double d3;
        int i2 = 0;
        this.p = false;
        Long l2 = this.e;
        Cursor cursor = null;
        boolean z = true;
        if (l2 == null || !l2.equals(l)) {
            d2 = 0.0d;
            try {
                cursorRawQuery = this.h.rawQuery(String.format(Locale.US, "SELECT * FROM CL WHERE id = %d AND timestamp + %d > %d;", l, 15552000, Long.valueOf(System.currentTimeMillis() / 1000)), null);
                if (cursorRawQuery != null) {
                    try {
                        try {
                            if (!cursorRawQuery.moveToFirst() || cursorRawQuery.getDouble(cursorRawQuery.getColumnIndex("cl")) <= 0.0d) {
                                i = 0;
                                z = false;
                                d3 = 0.0d;
                            } else {
                                try {
                                    double d4 = cursorRawQuery.getDouble(cursorRawQuery.getColumnIndex("x"));
                                    try {
                                        d2 = cursorRawQuery.getDouble(cursorRawQuery.getColumnIndex("y"));
                                        i2 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("r"));
                                        if (cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("timestamp")) + 604800 < System.currentTimeMillis() / 1000) {
                                            this.p = true;
                                        }
                                        if (i2 < 300) {
                                            i2 = 300;
                                        } else if (2000 < i2) {
                                            i2 = 2000;
                                        }
                                        this.f218c = d4;
                                        this.d = d2;
                                        this.f217b = i2;
                                        this.e = l;
                                        i = i2;
                                        d3 = d4;
                                    } catch (Exception unused) {
                                        i = i2;
                                        d3 = d4;
                                        if (cursorRawQuery != null) {
                                            try {
                                                cursorRawQuery.close();
                                            } catch (Exception unused2) {
                                            }
                                        }
                                    }
                                } catch (Exception unused3) {
                                    i = 0;
                                    d3 = 0.0d;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (z) {
                                        return null;
                                    }
                                    com.baidu.location.c cVar = new com.baidu.location.c();
                                    cVar.b(i);
                                    cVar.c(d2);
                                    cVar.d(d3);
                                    cVar.l("cl");
                                    cVar.h(66);
                                    return cVar;
                                }
                            }
                        } catch (Exception unused4) {
                            i = 0;
                            z = false;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused5) {
                            }
                        }
                        throw th;
                    }
                } else {
                    i = 0;
                    z = false;
                    d3 = 0.0d;
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Exception unused6) {
                i = 0;
                z = false;
                cursorRawQuery = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            d3 = this.f218c;
            d2 = this.d;
            i = this.f217b;
        }
        if (z) {
            return null;
        }
        com.baidu.location.c cVar2 = new com.baidu.location.c();
        cVar2.b(i);
        cVar2.c(d2);
        cVar2.d(d3);
        cVar2.l("cl");
        cVar2.h(66);
        return cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x030a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0333  */
    /* JADX WARN: Code duplicated, block: B:147:0x033b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0355  */
    /* JADX WARN: Code duplicated, block: B:163:0x0320 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x028c A[PHI: r1
  0x028c: PHI (r1v35 int) = (r1v32 int), (r1v33 int) binds: [B:91:0x028a, B:94:0x0295] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final com.baidu.location.c a(LinkedHashMap<String, Integer> linkedHashMap, com.baidu.location.c cVar, int i) throws Throwable {
        int i2;
        double dQ;
        double dT;
        int i3;
        Cursor cursor;
        double d2;
        double d3;
        Cursor cursor2;
        int i4;
        int i5;
        int i6;
        Cursor cursor3;
        double d4;
        Cursor cursor4;
        double d5;
        int i7;
        int i8;
        int i9;
        ArrayList<C0011b> arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        this.o.setLength(0);
        int i15 = 1;
        if (cVar != null) {
            dQ = cVar.q();
            dT = cVar.t();
            i2 = 1;
        } else {
            i2 = 0;
            dQ = 0.0d;
            dT = 0.0d;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<Map.Entry<String, Integer>> it = linkedHashMap.entrySet().iterator();
        int i16 = 0;
        boolean z = true;
        while (true) {
            i3 = 30;
            if (i16 >= Math.min(linkedHashMap.size(), 30)) {
                break;
            }
            Map.Entry<String, Integer> next = it.next();
            String key = next.getKey();
            Integer value = next.getValue();
            if (value.intValue() < 0) {
                value = Integer.valueOf(-value.intValue());
            }
            Long lD = Jni.d(key);
            if (lD != null) {
                this.n.put(lD, key);
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append(',');
                }
                this.m.put(lD, value);
                stringBuffer.append(lD);
            }
            i16++;
        }
        int i17 = 3;
        int i18 = 2;
        Cursor cursor5 = null;
        try {
            Cursor cursorRawQuery = this.h.rawQuery(String.format(Locale.US, "SELECT * FROM AP WHERE id IN (%s) AND timestamp+%d>%d;", stringBuffer, 7776000, Long.valueOf(System.currentTimeMillis() / 1000)), null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        ArrayList<C0011b> arrayList2 = new ArrayList<>();
                        while (!cursorRawQuery.isAfterLast()) {
                            Long lValueOf = Long.valueOf(cursorRawQuery.getLong(i14));
                            double d6 = cursorRawQuery.getDouble(i15);
                            double d7 = cursorRawQuery.getDouble(i18);
                            int i19 = cursorRawQuery.getInt(i17);
                            double d8 = cursorRawQuery.getDouble(4);
                            int i20 = cursorRawQuery.getInt(5);
                            this.l.add(lValueOf);
                            Cursor cursor6 = cursorRawQuery;
                            try {
                                if (i20 + 604800 < System.currentTimeMillis() / 1000) {
                                    try {
                                        if (this.o.length() > 0) {
                                            this.o.append(",");
                                        }
                                        StringBuffer stringBuffer2 = this.o;
                                        Locale locale = Locale.US;
                                        Object[] objArr = new Object[i17];
                                        objArr[i14] = lValueOf;
                                        objArr[i15] = this.n.get(lValueOf);
                                        objArr[i18] = 100000;
                                        stringBuffer2.append(String.format(locale, "(%d,\"%s\",%d)", objArr));
                                    } catch (Exception unused) {
                                        cursor4 = cursor6;
                                        d5 = 0.0d;
                                        cursor = null;
                                        d2 = d5;
                                        d3 = d2;
                                        cursor2 = cursor4;
                                        i5 = 0;
                                        i4 = 0;
                                        i6 = i5;
                                        if (cursor2 != null) {
                                            cursor3 = cursor2;
                                            try {
                                                cursor3.close();
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        d4 = d3;
                                        if (i6 == 0) {
                                            return cursor;
                                        }
                                        com.baidu.location.c cVar2 = new com.baidu.location.c();
                                        cVar2.b(i4);
                                        cVar2.c(d4);
                                        cVar2.d(d2);
                                        cVar2.l("wf");
                                        cVar2.h(66);
                                        return cVar2;
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor5 = cursor6;
                                        if (cursor5 != null) {
                                            try {
                                                cursor5.close();
                                            } catch (Exception unused3) {
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                if (d8 > 0.0d && d6 > 0.0d && d7 > 0.0d && i19 > 0 && i19 < 1000) {
                                    if (i2 == i15) {
                                        cursor4 = cursor6;
                                        cursor = null;
                                        arrayList = arrayList2;
                                        i10 = i18;
                                        i13 = 3;
                                        i11 = i2;
                                        i12 = i3;
                                        if (a(dQ, dT, d7, d6) > 10000.0d) {
                                        }
                                    } else {
                                        arrayList = arrayList2;
                                        i10 = i18;
                                        i11 = i2;
                                        i12 = i3;
                                        cursor4 = cursor6;
                                        cursor = null;
                                        i13 = 3;
                                    }
                                    int iMin = Math.min(100, Math.max(i12, this.m.get(lValueOf).intValue()));
                                    arrayList.add(new C0011b(d6, d7, Math.exp(Math.pow(Math.max(50.0d, i19), 0.6d) * (-0.065d) * ((iMin > 70 ? ((double) (iMin - 70)) / 30.0d : ((double) (iMin - 70)) / 50.0d) + 1.0d)), null));
                                } else {
                                    arrayList = arrayList2;
                                    i10 = i18;
                                    i11 = i2;
                                    i12 = i3;
                                    cursor4 = cursor6;
                                    cursor = null;
                                    i13 = 3;
                                }
                                try {
                                    try {
                                        cursor4.moveToNext();
                                        i3 = i12;
                                        arrayList2 = arrayList;
                                        i18 = i10;
                                        cursor5 = cursor;
                                        cursorRawQuery = cursor4;
                                        i17 = i13;
                                        i2 = i11;
                                        i14 = 0;
                                        i15 = 1;
                                    } catch (Exception unused4) {
                                        d5 = 0.0d;
                                        d2 = d5;
                                        d3 = d2;
                                        cursor2 = cursor4;
                                        i5 = 0;
                                        i4 = 0;
                                        i6 = i5;
                                        if (cursor2 != null) {
                                            cursor3 = cursor2;
                                            cursor3.close();
                                        }
                                        d4 = d3;
                                        if (i6 == 0) {
                                            return cursor;
                                        }
                                        com.baidu.location.c cVar3 = new com.baidu.location.c();
                                        cVar3.b(i4);
                                        cVar3.c(d4);
                                        cVar3.d(d2);
                                        cVar3.l("wf");
                                        cVar3.h(66);
                                        return cVar3;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor5 = cursor4;
                                    if (cursor5 != null) {
                                        cursor5.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused5) {
                                cursor4 = cursor6;
                                cursor = null;
                                d5 = 0.0d;
                                d2 = d5;
                                d3 = d2;
                                cursor2 = cursor4;
                                i5 = 0;
                                i4 = 0;
                                i6 = i5;
                                if (cursor2 != null) {
                                    cursor3 = cursor2;
                                    cursor3.close();
                                }
                                d4 = d3;
                                if (i6 == 0) {
                                    return cursor;
                                }
                                com.baidu.location.c cVar4 = new com.baidu.location.c();
                                cVar4.b(i4);
                                cVar4.c(d4);
                                cVar4.d(d2);
                                cVar4.l("wf");
                                cVar4.h(66);
                                return cVar4;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor4 = cursor6;
                                cursor5 = cursor4;
                                if (cursor5 != null) {
                                    cursor5.close();
                                }
                                throw th;
                            }
                        }
                        ArrayList<C0011b> arrayList3 = arrayList2;
                        cursor = cursor5;
                        cursor4 = cursorRawQuery;
                        int i21 = i2;
                        a(arrayList3, 1000.0d);
                        double d9 = 0.0d;
                        double d10 = 0.0d;
                        double d11 = 0.0d;
                        int i22 = 0;
                        while (i22 < arrayList3.size()) {
                            C0011b c0011b = arrayList3.get(i22);
                            double d12 = c0011b.f221c;
                            if (d12 > 0.0d) {
                                d9 += c0011b.f219a * d12;
                                d11 += c0011b.f220b * d12;
                                d10 += d12;
                            }
                            i22++;
                            arrayList3 = arrayList3;
                        }
                        ArrayList<C0011b> arrayList4 = arrayList3;
                        if (d10 <= 0.0d || d9 <= 0.0d || d11 <= 0.0d) {
                            d2 = 0.0d;
                            d3 = 0.0d;
                            i5 = 0;
                            i4 = 0;
                        } else {
                            d2 = d9 / d10;
                            double d13 = d11 / d10;
                            float fA = 0.0f;
                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                try {
                                    ArrayList<C0011b> arrayList5 = arrayList4;
                                    arrayList4 = arrayList5;
                                    fA = (float) (((double) fA) + a(d2, d13, arrayList5.get(i23).f219a, arrayList5.get(i23).f220b));
                                } catch (Exception unused6) {
                                    d3 = d13;
                                    cursor2 = cursor4;
                                    i5 = 1;
                                    i4 = 0;
                                    i6 = i5;
                                    if (cursor2 != null) {
                                        cursor3 = cursor2;
                                        cursor3.close();
                                    }
                                    d4 = d3;
                                    if (i6 == 0) {
                                        return cursor;
                                    }
                                    com.baidu.location.c cVar5 = new com.baidu.location.c();
                                    cVar5.b(i4);
                                    cVar5.c(d4);
                                    cVar5.d(d2);
                                    cVar5.l("wf");
                                    cVar5.h(66);
                                    return cVar5;
                                }
                            }
                            int iRound = Math.round(fA / arrayList4.size());
                            int i24 = 30;
                            if (iRound < 30) {
                                d3 = d13;
                                i4 = i24;
                                i5 = 1;
                            } else {
                                i24 = 100;
                                if (100 < iRound) {
                                    d3 = d13;
                                    i4 = i24;
                                    i5 = 1;
                                } else {
                                    d3 = d13;
                                    i5 = 1;
                                    i4 = iRound;
                                }
                            }
                        }
                        if (i21 == 0) {
                            try {
                                if (arrayList4.size() <= 1) {
                                    i5 = 0;
                                }
                            } catch (Exception unused7) {
                                cursor2 = cursor4;
                                i6 = i5;
                                if (cursor2 != null) {
                                    cursor3 = cursor2;
                                    cursor3.close();
                                }
                                d4 = d3;
                                if (i6 == 0) {
                                    return cursor;
                                }
                                com.baidu.location.c cVar6 = new com.baidu.location.c();
                                cVar6.b(i4);
                                cVar6.c(d4);
                                cVar6.d(d2);
                                cVar6.l("wf");
                                cVar6.h(66);
                                return cVar6;
                            }
                        }
                        if (arrayList4.size() >= i || (((double) arrayList4.size()) * 1.0d) / ((double) linkedHashMap.size()) >= 0.5d) {
                            i7 = i5;
                            i8 = 1;
                        } else {
                            i8 = 1;
                            i7 = 0;
                        }
                        if (i21 == i8 && i7 == i8) {
                            i9 = i7;
                            try {
                                if (a(dQ, dT, d3, d2) > 10000.0d) {
                                }
                            } catch (Exception unused8) {
                                i5 = i9;
                                cursor2 = cursor4;
                                i6 = i5;
                                if (cursor2 != null) {
                                    cursor3 = cursor2;
                                }
                                d4 = d3;
                                if (i6 == 0) {
                                    return cursor;
                                }
                                com.baidu.location.c cVar7 = new com.baidu.location.c();
                                cVar7.b(i4);
                                cVar7.c(d4);
                                cVar7.d(d2);
                                cVar7.l("wf");
                                cVar7.h(66);
                                return cVar7;
                            }
                        } else {
                            i9 = i7;
                        }
                        i6 = i9;
                    } else {
                        cursor = null;
                        cursor4 = cursorRawQuery;
                        d2 = 0.0d;
                        d3 = 0.0d;
                        i4 = 0;
                    }
                    i6 = 0;
                } catch (Exception unused9) {
                    cursor = cursor5;
                    cursor4 = cursorRawQuery;
                } catch (Throwable th4) {
                    th = th4;
                    cursor4 = cursorRawQuery;
                }
            } else {
                cursor = null;
                cursor4 = cursorRawQuery;
                d2 = 0.0d;
                d3 = 0.0d;
                i4 = 0;
                i6 = 0;
            }
            if (cursor4 != null) {
                cursor3 = cursor4;
                cursor3.close();
            }
        } catch (Exception unused10) {
            cursor = null;
            d2 = 0.0d;
            d3 = 0.0d;
            cursor2 = null;
        } catch (Throwable th5) {
            th = th5;
        }
        d4 = d3;
        if (i6 == 0) {
            return cursor;
        }
        com.baidu.location.c cVar8 = new com.baidu.location.c();
        cVar8.b(i4);
        cVar8.c(d4);
        cVar8.d(d2);
        cVar8.l("wf");
        cVar8.h(66);
        return cVar8;
    }

    public final void a(com.baidu.location.c cVar, com.baidu.location.c cVar2, com.baidu.location.c cVar3, String str, Long l) {
        if (cVar == null || cVar.r() != 161) {
            return;
        }
        if (cVar2 != null && cVar.v() != null && cVar.v().equals("cl") && a(cVar2.q(), cVar2.t(), cVar.q(), cVar.t()) > 300.0d) {
            Locale locale = Locale.US;
            String str2 = String.format(locale, "UPDATE CL SET cl = 0 WHERE id = %d;", l);
            String str3 = String.format(locale, "INSERT OR REPLACE INTO CL VALUES (%d,\"%s\",%d);", l, str, 100000);
            try {
                this.h.execSQL(str2);
                this.i.execSQL(str3);
            } catch (Exception unused) {
            }
        }
        if (cVar3 == null || cVar.v() == null || !cVar.v().equals("wf") || a(cVar3.q(), cVar3.t(), cVar.q(), cVar.t()) <= 100.0d) {
            return;
        }
        try {
            String str4 = String.format("UPDATE AP SET cl = 0 WHERE id In (%s);", this.j.toString());
            String str5 = String.format("INSERT OR REPLACE INTO AP VALUES %s;", this.k.toString());
            this.h.execSQL(str4);
            this.i.execSQL(str5);
        } catch (Exception unused2) {
        }
    }

    public final void a(String str, Long l, com.baidu.location.c cVar) {
        String str2;
        SQLiteDatabase sQLiteDatabase;
        if (str != null) {
            try {
                if (cVar != null) {
                    str2 = String.format(Locale.US, "UPDATE CL SET frequency=frequency+1 WHERE id = %d;", l);
                    sQLiteDatabase = this.h;
                } else {
                    Locale locale = Locale.US;
                    String str3 = String.format(locale, "INSERT OR IGNORE INTO CL VALUES (%d,\"%s\",0);", l, str);
                    str2 = String.format(locale, "UPDATE CL SET frequency=frequency+1 WHERE id = %d;", l);
                    this.i.execSQL(str3);
                    sQLiteDatabase = this.i;
                }
                sQLiteDatabase.execSQL(str2);
            } catch (Exception unused) {
            }
            if (this.p) {
                try {
                    this.i.execSQL(String.format(Locale.US, "INSERT OR IGNORE INTO CL VALUES (%d,\"%s\",%d);", l, str, 100000));
                } catch (Exception unused2) {
                }
            }
        }
    }

    public final void a(String str, String str2, String str3) {
        this.f.a(str, str2, str3);
    }

    public final void a(LinkedHashMap<String, Integer> linkedHashMap) {
        if (linkedHashMap == null || linkedHashMap.size() <= 0) {
            return;
        }
        this.j = new StringBuffer();
        this.k = new StringBuffer();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        ConcurrentMap<Long, Integer> concurrentMap = this.m;
        if (concurrentMap != null && concurrentMap.keySet() != null) {
            boolean z = true;
            boolean z2 = true;
            for (Long l : this.m.keySet()) {
                try {
                    if (this.l.contains(l)) {
                        if (z2) {
                            z2 = false;
                        } else {
                            this.j.append(',');
                            this.k.append(',');
                        }
                        this.j.append(l);
                        String str = this.n.get(l);
                        StringBuffer stringBuffer3 = this.k;
                        stringBuffer3.append('(');
                        stringBuffer3.append(l);
                        stringBuffer3.append(',');
                        stringBuffer3.append('\"');
                        stringBuffer3.append(str);
                        stringBuffer3.append('\"');
                        stringBuffer3.append(',');
                        stringBuffer3.append(100000);
                        stringBuffer3.append(')');
                    } else {
                        String str2 = this.n.get(l);
                        if (z) {
                            z = false;
                        } else {
                            stringBuffer.append(',');
                            stringBuffer2.append(',');
                        }
                        stringBuffer.append(l);
                        stringBuffer2.append('(');
                        stringBuffer2.append(l);
                        stringBuffer2.append(',');
                        stringBuffer2.append('\"');
                        stringBuffer2.append(str2);
                        stringBuffer2.append('\"');
                        stringBuffer2.append(",0)");
                    }
                } catch (Exception unused) {
                }
            }
        }
        try {
            this.h.execSQL(String.format(Locale.US, "UPDATE AP SET frequency=frequency+1 WHERE id IN(%s)", this.j.toString()));
        } catch (Exception unused2) {
        }
        StringBuffer stringBuffer4 = this.o;
        if (stringBuffer4 != null && stringBuffer4.length() > 0) {
            if (stringBuffer2.length() > 0) {
                stringBuffer2.append(",");
            }
            stringBuffer2.append(this.o);
        }
        try {
            String str3 = String.format("INSERT OR IGNORE INTO AP VALUES %s;", stringBuffer2.toString());
            String str4 = String.format("UPDATE AP SET frequency=frequency+1 WHERE id in (%s);", stringBuffer.toString());
            if (stringBuffer2.length() > 0) {
                this.i.execSQL(str3);
            }
            if (stringBuffer.length() > 0) {
                this.i.execSQL(str4);
            }
        } catch (Exception unused3) {
        }
    }

    public final void a(String[] strArr) {
        this.f216a.c().a(strArr);
    }

    public void b() throws Throwable {
        this.g.i();
    }
}
