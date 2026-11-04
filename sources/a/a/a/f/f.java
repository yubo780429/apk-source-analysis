package a.a.a.f;

import a.a.a.b.w;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.baidu.location.Jni;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final String d;
    public static final String e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f245b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f244a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f246c = new a(this, this);

    public class a extends a.a.a.i.g {
        public int i;
        public long j;
        public String k = null;
        public boolean l = false;
        public boolean m = false;
        public f n;

        public a(f fVar, f fVar2) {
            this.n = fVar2;
            this.d = new HashMap();
            this.i = 0;
            this.j = -1L;
        }

        @Override // a.a.a.i.g
        public void a() {
            this.d.clear();
            this.d.put("qt", "ofbh");
            this.d.put("req", this.k);
            this.f337a = d.j;
        }

        @Override // a.a.a.i.g
        public void a(boolean z) {
            String str;
            this.m = false;
            if (z && (str = this.f339c) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("error") && jSONObject.getInt("error") == 161) {
                        this.m = true;
                    }
                } catch (Exception unused) {
                }
            }
            if (!this.m) {
                this.i++;
                this.j = System.currentTimeMillis();
            }
            this.n.a(this.m);
            this.l = false;
        }

        public final void b() {
            if (this.l) {
                return;
            }
            this.k = this.n.a();
            long j = this.j;
            if (j != -1 && j + 86400000 <= System.currentTimeMillis()) {
                this.i = 0;
                this.j = -1L;
            }
            if (this.k == null || this.i >= 2) {
                return;
            }
            this.l = true;
            ExecutorService executorServiceB = w.d().b();
            if (executorServiceB != null) {
                a(executorServiceB, "https://ofloc.map.baidu.com/offline_loc");
            } else {
                a("https://ofloc.map.baidu.com/offline_loc");
            }
        }
    }

    static {
        Locale locale = Locale.US;
        d = String.format(locale, "DELETE FROM LOG WHERE timestamp NOT IN (SELECT timestamp FROM LOG ORDER BY timestamp DESC LIMIT %d);", 3000);
        e = String.format(locale, "SELECT * FROM LOG ORDER BY timestamp DESC LIMIT %d;", 3);
    }

    public f(SQLiteDatabase sQLiteDatabase) {
        this.f245b = sQLiteDatabase;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS LOG(timestamp LONG PRIMARY KEY, log VARCHAR(4000))");
        } catch (Exception unused) {
        }
    }

    public final String a() throws Throwable {
        String str;
        Cursor cursorRawQuery;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        Cursor cursor = null;
        string = null;
        string = null;
        string = null;
        String string = null;
        Cursor cursor2 = null;
        try {
            cursorRawQuery = this.f245b.rawQuery(e, null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.getCount() > 0) {
                        StringBuffer stringBuffer = new StringBuffer();
                        cursorRawQuery.moveToFirst();
                        while (!cursorRawQuery.isAfterLast()) {
                            jSONArray.put(cursorRawQuery.getString(1));
                            if (stringBuffer.length() != 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(cursorRawQuery.getLong(0));
                            cursorRawQuery.moveToNext();
                        }
                        try {
                            jSONObject.put("ofloc", jSONArray);
                            string = jSONObject.toString();
                        } catch (JSONException unused) {
                        }
                        this.f244a = stringBuffer.toString();
                    }
                } catch (Exception unused2) {
                    str = string;
                    cursor2 = cursorRawQuery;
                    if (cursor2 == null) {
                        return str;
                    }
                    cursorRawQuery = cursor2;
                    string = str;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            }
            if (cursorRawQuery == null) {
                return string;
            }
        } catch (Exception unused4) {
            str = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            cursorRawQuery.close();
            return string;
        } catch (Exception unused5) {
            return string;
        }
    }

    public void a(String str) {
        try {
            this.f245b.execSQL(String.format(Locale.US, "INSERT OR IGNORE INTO LOG VALUES (%d,\"%s\");", Long.valueOf(System.currentTimeMillis()), Jni.e(str)));
            this.f245b.execSQL(d);
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z) {
        String str;
        if (z && (str = this.f244a) != null) {
            String str2 = String.format("DELETE FROM LOG WHERE timestamp in (%s);", str);
            try {
                if (this.f244a.length() > 0) {
                    this.f245b.execSQL(str2);
                }
            } catch (Exception unused) {
            }
        }
        this.f244a = null;
    }

    public void b() {
        this.f246c.b();
    }
}
