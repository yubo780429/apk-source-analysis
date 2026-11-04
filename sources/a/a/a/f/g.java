package a.a.a.f;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.baidu.location.Jni;
import com.baidu.location.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final double[] f = {45.0d, 135.0d, 225.0d, 315.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteDatabase f249c;
    public int d = -1;
    public int e = -1;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f251b;

        public b(double d, double d2) {
            this.f250a = d;
            this.f251b = d2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class c {
        public static final c g;
        public static final c h;
        public static final c i;
        public static final c j;
        public static final /* synthetic */ c[] k;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f253c;
        public final String d;
        public final String e;
        public final int f;

        public static enum a extends c {
            public a(String str, int i, String str2, String str3, String str4, int i2, int i3) {
                super(str, i, str2, str3, str4, i2, i3);
            }

            @Override // a.a.a.f.g.c
            public List<String> a(JSONObject jSONObject, String str, int i) {
                int i2;
                String str2;
                String str3 = "dist";
                String str4 = "ct";
                String str5 = "ctc";
                String str6 = "prov";
                String str7 = "cyc";
                String str8 = "cy";
                Iterator<String> itKeys = jSONObject.keys();
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Iterator<String> it = itKeys;
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        String string = jSONObject2.has(str8) ? jSONObject2.getString(str8) : null;
                        try {
                            String string2 = jSONObject2.has(str7) ? jSONObject2.getString(str7) : null;
                            try {
                                String string3 = jSONObject2.has(str6) ? jSONObject2.getString(str6) : null;
                                try {
                                    String string4 = jSONObject2.has(str5) ? jSONObject2.getString(str5) : null;
                                    try {
                                        String string5 = jSONObject2.has(str4) ? jSONObject2.getString(str4) : null;
                                        try {
                                            String string6 = jSONObject2.has(str3) ? jSONObject2.getString(str3) : null;
                                            if (stringBuffer.length() > 0) {
                                                str2 = str3;
                                                try {
                                                    stringBuffer.append(",");
                                                } catch (JSONException unused) {
                                                }
                                            } else {
                                                str2 = str3;
                                            }
                                            stringBuffer.append("(\"");
                                            stringBuffer.append(next);
                                            stringBuffer.append("\",\"");
                                            stringBuffer.append(string);
                                            stringBuffer.append("\",\"");
                                            stringBuffer.append(string2);
                                            stringBuffer.append("\",\"");
                                            stringBuffer.append(string3);
                                            stringBuffer.append("\",\"");
                                            stringBuffer.append(string5);
                                            stringBuffer.append("\",\"");
                                            stringBuffer.append(string4);
                                            stringBuffer.append("\",\"");
                                            stringBuffer.append(string6);
                                            stringBuffer.append("\",");
                                            stringBuffer.append(System.currentTimeMillis() / 1000);
                                            stringBuffer.append(",\"\")");
                                            try {
                                                c.b(stringBuffer2, next, str, 0);
                                            } catch (JSONException unused2) {
                                            }
                                        } catch (JSONException unused3) {
                                            str2 = str3;
                                        }
                                    } catch (JSONException unused4) {
                                        str2 = str3;
                                        str4 = str4;
                                    }
                                } catch (JSONException unused5) {
                                    str2 = str3;
                                    str4 = str4;
                                    str5 = str5;
                                }
                            } catch (JSONException unused6) {
                                str2 = str3;
                                str4 = str4;
                                str5 = str5;
                                str6 = str6;
                            }
                        } catch (JSONException unused7) {
                            str2 = str3;
                            str4 = str4;
                            str5 = str5;
                            str6 = str6;
                            str7 = str7;
                        }
                    } catch (JSONException unused8) {
                        str2 = str3;
                        str4 = str4;
                        str5 = str5;
                        str6 = str6;
                        str7 = str7;
                        str8 = str8;
                    }
                    if (i3 % 50 == 49 && stringBuffer.length() > 0) {
                        Locale locale = Locale.US;
                        arrayList.add(String.format(locale, "INSERT OR REPLACE INTO %s VALUES %s", "RGCAREA", stringBuffer));
                        arrayList.add(String.format(locale, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer2));
                        stringBuffer.setLength(0);
                    }
                    i3++;
                    itKeys = it;
                    str8 = str8;
                    str3 = str2;
                    str7 = str7;
                    str6 = str6;
                    str5 = str5;
                    str4 = str4;
                }
                if (stringBuffer.length() > 0) {
                    Locale locale2 = Locale.US;
                    i2 = 1;
                    arrayList.add(String.format(locale2, "INSERT OR REPLACE INTO %s VALUES %s", "RGCAREA", stringBuffer));
                    arrayList.add(String.format(locale2, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer2));
                    stringBuffer.setLength(0);
                } else {
                    i2 = 1;
                }
                Locale locale3 = Locale.US;
                Object[] objArr = new Object[i2];
                objArr[0] = Integer.valueOf(i);
                arrayList.add(String.format(locale3, "DELETE FROM RGCAREA WHERE gridkey NOT IN (SELECT gridkey FROM RGCAREA LIMIT %d);", objArr));
                return arrayList;
            }
        }

        public static enum b extends c {
            public b(String str, int i, String str2, String str3, String str4, int i2, int i3) {
                super(str, i, str2, str3, str4, i2, i3);
            }

            /* JADX WARN: Code duplicated, block: B:59:0x0149  */
            @Override // a.a.a.f.g.c
            public List<String> a(JSONObject jSONObject, String str, int i) throws JSONException {
                int i2;
                char c2;
                JSONArray jSONArray;
                String str2;
                Iterator<String> it;
                String str3 = "y2";
                String str4 = "x2";
                String str5 = "y1";
                String str6 = "x1";
                String str7 = "st";
                Iterator<String> itKeys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    int i3 = 0;
                    if (!itKeys.hasNext()) {
                        break;
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    String next = itKeys.next();
                    c.b(stringBuffer, next, str, 0);
                    try {
                        jSONArray = jSONObject.getJSONArray(next);
                    } catch (JSONException unused) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        while (i3 < jSONArray.length()) {
                            try {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                String string = jSONObject2.has(str7) ? jSONObject2.getString(str7) : null;
                                try {
                                    Double dValueOf = jSONObject2.has(str6) ? Double.valueOf(jSONObject2.getDouble(str6)) : null;
                                    try {
                                        Double dValueOf2 = jSONObject2.has(str5) ? Double.valueOf(jSONObject2.getDouble(str5)) : null;
                                        try {
                                            Double dValueOf3 = jSONObject2.has(str4) ? Double.valueOf(jSONObject2.getDouble(str4)) : null;
                                            try {
                                                Double dValueOf4 = jSONObject2.has(str3) ? Double.valueOf(jSONObject2.getDouble(str3)) : null;
                                                if (string == null || dValueOf == null || dValueOf2 == null || dValueOf3 == null || dValueOf4 == null) {
                                                    str2 = str3;
                                                } else {
                                                    str2 = str3;
                                                    if (stringBuffer2.length() > 0) {
                                                        try {
                                                            stringBuffer2.append(",");
                                                        } catch (JSONException unused2) {
                                                            it = itKeys;
                                                        }
                                                    }
                                                    it = itKeys;
                                                    try {
                                                        stringBuffer2.append("(NULL,\"");
                                                        stringBuffer2.append(next);
                                                        stringBuffer2.append("\",\"");
                                                        stringBuffer2.append(string);
                                                        stringBuffer2.append("\",");
                                                        stringBuffer2.append(dValueOf);
                                                        stringBuffer2.append(",");
                                                        stringBuffer2.append(dValueOf2);
                                                        stringBuffer2.append(",");
                                                        stringBuffer2.append(dValueOf3);
                                                        stringBuffer2.append(",");
                                                        stringBuffer2.append(dValueOf4);
                                                        stringBuffer2.append(")");
                                                    } catch (JSONException unused3) {
                                                    }
                                                    if (i3 % 50 != 49 && stringBuffer2.length() > 0) {
                                                        arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCROAD", stringBuffer2.toString()));
                                                        stringBuffer2.setLength(0);
                                                    }
                                                    i3++;
                                                    str7 = str7;
                                                    str6 = str6;
                                                    str5 = str5;
                                                    str4 = str4;
                                                    itKeys = it;
                                                    str3 = str2;
                                                }
                                            } catch (JSONException unused4) {
                                            }
                                        } catch (JSONException unused5) {
                                            str2 = str3;
                                            str4 = str4;
                                        }
                                    } catch (JSONException unused6) {
                                        str2 = str3;
                                        str4 = str4;
                                        str5 = str5;
                                    }
                                } catch (JSONException unused7) {
                                    str2 = str3;
                                    str4 = str4;
                                    str5 = str5;
                                    str6 = str6;
                                }
                            } catch (JSONException unused8) {
                                str2 = str3;
                                str4 = str4;
                                str5 = str5;
                                str6 = str6;
                                str7 = str7;
                            }
                            it = itKeys;
                            if (i3 % 50 != 49) {
                            }
                            i3++;
                            str7 = str7;
                            str6 = str6;
                            str5 = str5;
                            str4 = str4;
                            itKeys = it;
                            str3 = str2;
                        }
                        String str8 = str3;
                        String str9 = str4;
                        String str10 = str5;
                        String str11 = str6;
                        String str12 = str7;
                        Iterator<String> it2 = itKeys;
                        if (stringBuffer2.length() > 0) {
                            arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCROAD", stringBuffer2.toString()));
                        }
                        str7 = str12;
                        str6 = str11;
                        str5 = str10;
                        str4 = str9;
                        itKeys = it2;
                        str3 = str8;
                    }
                }
                if (stringBuffer.length() > 0) {
                    c2 = 0;
                    i2 = 1;
                    arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer));
                } else {
                    i2 = 1;
                    c2 = 0;
                }
                Locale locale = Locale.US;
                Object[] objArr = new Object[i2];
                objArr[c2] = Integer.valueOf(i);
                arrayList.add(String.format(locale, "DELETE FROM RGCROAD WHERE _id NOT IN (SELECT _id FROM RGCROAD LIMIT %d);", objArr));
                return arrayList;
            }
        }

        /* JADX INFO: renamed from: a.a.a.f.g$c$c, reason: collision with other inner class name */
        public static enum C0013c extends c {
            public C0013c(String str, int i, String str2, String str3, String str4, int i2, int i3) {
                super(str, i, str2, str3, str4, i2, i3);
            }

            @Override // a.a.a.f.g.c
            public List<String> a(JSONObject jSONObject, String str, int i) throws JSONException {
                int i2;
                char c2;
                JSONArray jSONArray;
                String str2;
                Iterator<String> it;
                String str3 = "y";
                String str4 = "x";
                String str5 = "stn";
                String str6 = "st";
                Iterator<String> itKeys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    int i3 = 0;
                    if (!itKeys.hasNext()) {
                        break;
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    String next = itKeys.next();
                    c.b(stringBuffer, next, str, 0);
                    try {
                        jSONArray = jSONObject.getJSONArray(next);
                    } catch (JSONException unused) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        while (i3 < jSONArray.length()) {
                            try {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                String string = jSONObject2.has(str6) ? jSONObject2.getString(str6) : null;
                                try {
                                    String string2 = jSONObject2.has(str5) ? jSONObject2.getString(str5) : null;
                                    try {
                                        Double dValueOf = jSONObject2.has(str4) ? Double.valueOf(jSONObject2.getDouble(str4)) : null;
                                        try {
                                            Double dValueOf2 = jSONObject2.has(str3) ? Double.valueOf(jSONObject2.getDouble(str3)) : null;
                                            str2 = str3;
                                            if (stringBuffer2.length() > 0) {
                                                try {
                                                    stringBuffer2.append(",");
                                                } catch (JSONException unused2) {
                                                    it = itKeys;
                                                }
                                            }
                                            it = itKeys;
                                            try {
                                                stringBuffer2.append("(NULL,\"");
                                                stringBuffer2.append(next);
                                                stringBuffer2.append("\",\"");
                                                stringBuffer2.append(string);
                                                stringBuffer2.append("\",\"");
                                                stringBuffer2.append(string2);
                                                stringBuffer2.append("\",");
                                                stringBuffer2.append(dValueOf);
                                                stringBuffer2.append(",");
                                                stringBuffer2.append(dValueOf2);
                                                stringBuffer2.append(")");
                                            } catch (JSONException unused3) {
                                            }
                                        } catch (JSONException unused4) {
                                            str2 = str3;
                                        }
                                    } catch (JSONException unused5) {
                                        str2 = str3;
                                        str4 = str4;
                                    }
                                } catch (JSONException unused6) {
                                    str2 = str3;
                                    str4 = str4;
                                    str5 = str5;
                                }
                            } catch (JSONException unused7) {
                                str2 = str3;
                                str4 = str4;
                                str5 = str5;
                                str6 = str6;
                            }
                            if (i3 % 50 == 49 && stringBuffer2.length() > 0) {
                                arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCSITE", stringBuffer2.toString()));
                                stringBuffer2.setLength(0);
                            }
                            i3++;
                            str6 = str6;
                            str5 = str5;
                            str4 = str4;
                            itKeys = it;
                            str3 = str2;
                        }
                        String str7 = str3;
                        String str8 = str4;
                        String str9 = str5;
                        String str10 = str6;
                        Iterator<String> it2 = itKeys;
                        if (stringBuffer2.length() > 0) {
                            arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCSITE", stringBuffer2.toString()));
                        }
                        str6 = str10;
                        str5 = str9;
                        str4 = str8;
                        itKeys = it2;
                        str3 = str7;
                    }
                }
                if (stringBuffer.length() > 0) {
                    c2 = 0;
                    i2 = 1;
                    arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer));
                } else {
                    i2 = 1;
                    c2 = 0;
                }
                Locale locale = Locale.US;
                Object[] objArr = new Object[i2];
                objArr[c2] = Integer.valueOf(i);
                arrayList.add(String.format(locale, "DELETE FROM RGCSITE WHERE _id NOT IN (SELECT _id FROM RGCSITE LIMIT %d);", objArr));
                return arrayList;
            }
        }

        public static enum d extends c {
            public d(String str, int i, String str2, String str3, String str4, int i2, int i3) {
                super(str, i, str2, str3, str4, i2, i3);
            }

            @Override // a.a.a.f.g.c
            public List<String> a(JSONObject jSONObject, String str, int i) throws JSONException {
                int i2;
                char c2;
                JSONArray jSONArray;
                String str2;
                JSONArray jSONArray2;
                String str3 = "y";
                String str4 = "x";
                String str5 = "rk";
                String str6 = "tp";
                String str7 = "ne";
                String str8 = "pid";
                Iterator<String> itKeys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                StringBuffer stringBuffer = new StringBuffer();
                while (itKeys.hasNext()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    String next = itKeys.next();
                    c.b(stringBuffer, next, str, 1);
                    try {
                        jSONArray = jSONObject.getJSONArray(next);
                    } catch (JSONException unused) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        Iterator<String> it = itKeys;
                        int i3 = 0;
                        while (i3 < jSONArray.length()) {
                            try {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                String string = jSONObject2.has(str8) ? jSONObject2.getString(str8) : null;
                                try {
                                    String string2 = jSONObject2.has(str7) ? jSONObject2.getString(str7) : null;
                                    try {
                                        String string3 = jSONObject2.has(str6) ? jSONObject2.getString(str6) : null;
                                        try {
                                            Integer numValueOf = jSONObject2.has(str5) ? Integer.valueOf(jSONObject2.getInt(str5)) : null;
                                            try {
                                                Double dValueOf = jSONObject2.has(str4) ? Double.valueOf(jSONObject2.getDouble(str4)) : null;
                                                try {
                                                    Double dValueOf2 = jSONObject2.has(str3) ? Double.valueOf(jSONObject2.getDouble(str3)) : null;
                                                    str2 = str3;
                                                    if (stringBuffer2.length() > 0) {
                                                        try {
                                                            stringBuffer2.append(",");
                                                        } catch (JSONException unused2) {
                                                            jSONArray2 = jSONArray;
                                                        }
                                                    }
                                                    jSONArray2 = jSONArray;
                                                    try {
                                                        stringBuffer2.append("(\"");
                                                        stringBuffer2.append(string);
                                                        stringBuffer2.append("\",\"");
                                                        stringBuffer2.append(next);
                                                        stringBuffer2.append("\",\"");
                                                        stringBuffer2.append(string2);
                                                        stringBuffer2.append("\",\"");
                                                        stringBuffer2.append(string3);
                                                        stringBuffer2.append("\",");
                                                        stringBuffer2.append(dValueOf);
                                                        stringBuffer2.append(",");
                                                        stringBuffer2.append(dValueOf2);
                                                        stringBuffer2.append(",");
                                                        stringBuffer2.append(numValueOf);
                                                        stringBuffer2.append(")");
                                                    } catch (JSONException unused3) {
                                                    }
                                                } catch (JSONException unused4) {
                                                    str2 = str3;
                                                }
                                            } catch (JSONException unused5) {
                                                str2 = str3;
                                                str4 = str4;
                                            }
                                        } catch (JSONException unused6) {
                                            str2 = str3;
                                            str4 = str4;
                                            str5 = str5;
                                        }
                                    } catch (JSONException unused7) {
                                        str2 = str3;
                                        str4 = str4;
                                        str5 = str5;
                                        str6 = str6;
                                    }
                                } catch (JSONException unused8) {
                                    str2 = str3;
                                    str4 = str4;
                                    str5 = str5;
                                    str6 = str6;
                                    str7 = str7;
                                }
                            } catch (JSONException unused9) {
                                str2 = str3;
                                str4 = str4;
                                str5 = str5;
                                str6 = str6;
                                str7 = str7;
                                str8 = str8;
                            }
                            if (i3 % 50 == 49) {
                                arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCPOI", stringBuffer2.toString()));
                                stringBuffer2.setLength(0);
                            }
                            i3++;
                            str8 = str8;
                            str7 = str7;
                            str6 = str6;
                            str5 = str5;
                            str4 = str4;
                            jSONArray = jSONArray2;
                            str3 = str2;
                        }
                        String str9 = str3;
                        String str10 = str4;
                        String str11 = str5;
                        String str12 = str6;
                        String str13 = str7;
                        String str14 = str8;
                        if (stringBuffer2.length() > 0) {
                            arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCPOI", stringBuffer2.toString()));
                        }
                        itKeys = it;
                        str8 = str14;
                        str7 = str13;
                        str6 = str12;
                        str5 = str11;
                        str4 = str10;
                        str3 = str9;
                    }
                }
                if (stringBuffer.length() > 0) {
                    c2 = 0;
                    i2 = 1;
                    arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer));
                } else {
                    i2 = 1;
                    c2 = 0;
                }
                Locale locale = Locale.US;
                Object[] objArr = new Object[i2];
                objArr[c2] = Integer.valueOf(i);
                arrayList.add(String.format(locale, "DELETE FROM RGCPOI WHERE pid NOT IN (SELECT pid FROM RGCPOI LIMIT %d);", objArr));
                return arrayList;
            }
        }

        static {
            a aVar = new a("AREA", 0, "RGCAREA", "area", "addrv", 0, 1000);
            g = aVar;
            b bVar = new b("ROAD", 1, "RGCROAD", "road", "addrv", 1000, 10000);
            h = bVar;
            C0013c c0013c = new C0013c("SITE", 2, "RGCSITE", "site", "addrv", 100, 50000);
            i = c0013c;
            d dVar = new d("POI", 3, "RGCPOI", "poi", "poiv", 1000, 5000);
            j = dVar;
            k = new c[]{aVar, bVar, c0013c, dVar};
        }

        public c(String str, int i2, String str2, String str3, String str4, int i3, int i4) {
            super(str, i2);
            this.f253c = str2;
            this.d = str3;
            this.e = str4;
            this.f252b = i3;
            this.f = i4;
        }

        public static void b(StringBuffer stringBuffer, String str, String str2, int i2) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(",");
            }
            stringBuffer.append("(\"");
            stringBuffer.append(str);
            stringBuffer.append("\",\"");
            stringBuffer.append(str2);
            stringBuffer.append("\",");
            stringBuffer.append(i2);
            stringBuffer.append(",");
            stringBuffer.append(System.currentTimeMillis() / 86400000);
            stringBuffer.append(")");
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) k.clone();
        }

        public final String a(int i2, double d2, double d3) {
            HashSet<String> hashSet = new HashSet();
            hashSet.add(g.b(i2, d2, d3));
            int i3 = this.f252b;
            double d4 = ((double) i3) * 1.414d;
            if (i3 > 0) {
                for (int i4 = 0; i4 < g.f.length; i4++) {
                    double[] dArrC = g.c(d3, d2, d4, g.f[i4]);
                    hashSet.add(g.b(i2, dArrC[1], dArrC[0]));
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            boolean z = true;
            for (String str : hashSet) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append("\"");
                stringBuffer.append(str);
                stringBuffer.append("\"");
            }
            return String.format("SELECT * FROM %s WHERE gridkey IN (%s);", this.f253c, stringBuffer.toString());
        }

        public final String a(JSONObject jSONObject) {
            Iterator<String> itKeys = jSONObject.keys();
            StringBuffer stringBuffer = new StringBuffer();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (stringBuffer.length() != 0) {
                    stringBuffer.append(",");
                }
                stringBuffer.append("\"");
                stringBuffer.append(next);
                stringBuffer.append("\"");
            }
            return String.format(Locale.US, "DELETE FROM %s WHERE gridkey IN (%s)", this.f253c, stringBuffer);
        }

        public abstract List<String> a(JSONObject jSONObject, String str, int i2);
    }

    public g(d dVar, SQLiteDatabase sQLiteDatabase, int i) {
        this.f247a = dVar;
        this.f249c = sQLiteDatabase;
        this.f248b = i;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCAREA(gridkey VARCHAR(10) PRIMARY KEY, country VARCHAR(100),countrycode VARCHAR(100), province VARCHAR(100), city VARCHAR(100), citycode VARCHAR(100), district VARCHAR(100), timestamp INTEGER, version VARCHAR(50))");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCROAD(_id INTEGER PRIMARY KEY AUTOINCREMENT, gridkey VARCHAR(10), street VARCHAR(100), x1 DOUBLE, y1 DOUBLE, x2 DOUBLE, y2 DOUBLE)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCSITE(_id INTEGER PRIMARY KEY AUTOINCREMENT, gridkey VARCHAR(10), street VARCHAR(100), streetnumber VARCHAR(100), x DOUBLE, y DOUBLE)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCPOI(pid VARCHAR(50) PRIMARY KEY , gridkey VARCHAR(10), name VARCHAR(100), type VARCHAR(50), x DOUBLE, y DOUBLE, rank INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCUPDATE(gridkey VARCHAR(10), version VARCHAR(50), type INTEGER, timestamp INTEGER, PRIMARY KEY(gridkey, type))");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int a(int i, int i2) {
        double d;
        int i3;
        if (100 > i2) {
            d = -0.1d;
            i3 = 60000;
        } else if (500 > i2) {
            d = -0.75d;
            i3 = 55500;
        } else {
            d = -0.5d;
            i3 = 0;
        }
        return ((int) ((d * ((double) i2)) + ((double) i3))) + i;
    }

    public static String b(int i, double d, double d2) {
        double d3;
        b bVar;
        int i2 = i * 5;
        char[] cArr = new char[i + 1];
        b bVar2 = new b(90.0d, -90.0d);
        b bVar3 = new b(180.0d, -180.0d);
        int i3 = 1;
        boolean z = true;
        int i4 = 0;
        for (int i5 = 1; i5 <= i2; i5++) {
            if (z) {
                d3 = d;
                bVar = bVar3;
            } else {
                d3 = d2;
                bVar = bVar2;
            }
            double d4 = (bVar.f251b + bVar.f250a) / 2.0d;
            i4 <<= i3;
            if (((int) (d3 * 1000000.0d)) > ((int) (d4 * 1000000.0d))) {
                bVar.f251b = d4;
                i4 |= 1;
            } else {
                bVar.f250a = d4;
            }
            if (i5 % 5 == 0) {
                i3 = 1;
                cArr[(i5 / 5) - 1] = "0123456789bcdefghjkmnpqrstuvwxyz".charAt(i4);
                i4 = 0;
            } else {
                i3 = 1;
            }
            z = !z;
        }
        cArr[i] = 0;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i6 = 0; i6 < i; i6++) {
            stringBuffer.append(cArr[i6]);
        }
        return stringBuffer.toString();
    }

    public static double[] c(double d, double d2, double d3, double d4) {
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(d2);
        double radians3 = Math.toRadians(d4);
        double d5 = d3 / 6378137.0d;
        double dAsin = Math.asin((Math.sin(radians) * Math.cos(d5)) + (Math.cos(radians) * Math.sin(d5) * Math.cos(radians3)));
        return new double[]{Math.toDegrees(dAsin), Math.toDegrees(radians2 + Math.atan2(Math.sin(radians3) * Math.sin(d5) * Math.cos(radians), Math.cos(d5) - (Math.sin(radians) * Math.sin(dAsin))))};
    }

    public final double a(double d, double d2, double d3, double d4) {
        double radians = Math.toRadians(d);
        Math.toRadians(d2);
        double radians2 = Math.toRadians(d3);
        Math.toRadians(d4);
        double radians3 = Math.toRadians(d4 - d2);
        double radians4 = Math.toRadians(d3 - d) / 2.0d;
        double d5 = radians3 / 2.0d;
        double dSin = (Math.sin(radians4) * Math.sin(radians4)) + (Math.cos(radians) * Math.cos(radians2) * Math.sin(d5) * Math.sin(d5));
        return Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 2.0d * 6378137.0d;
    }

    public final double a(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d5 - d3;
        double d8 = d - d3;
        double d9 = d6 - d4;
        double d10 = d2 - d4;
        double d11 = (d7 * d8) + (d9 * d10);
        if (d11 <= 0.0d) {
            return Math.sqrt((d8 * d8) + (d10 * d10));
        }
        double d12 = (d7 * d7) + (d9 * d9);
        if (d11 >= d12) {
            double d13 = d - d5;
            double d14 = d2 - d6;
            return Math.sqrt((d13 * d13) + (d14 * d14));
        }
        double d15 = d11 / d12;
        double d16 = d - (d3 + (d7 * d15));
        double d17 = (d4 + (d9 * d15)) - d2;
        return Math.sqrt((d16 * d16) + (d17 * d17));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:120:0x0202  */
    /* JADX WARN: Code duplicated, block: B:122:0x0212  */
    /* JADX WARN: Code duplicated, block: B:124:0x0222  */
    /* JADX WARN: Code duplicated, block: B:126:0x0232  */
    /* JADX WARN: Code duplicated, block: B:128:0x0242  */
    /* JADX WARN: Code duplicated, block: B:130:0x0252  */
    /* JADX WARN: Code duplicated, block: B:131:0x0260  */
    /* JADX WARN: Code duplicated, block: B:133:0x0264  */
    /* JADX WARN: Code duplicated, block: B:134:0x0272  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e8 A[EXC_TOP_SPLITTER, PHI: r0 r1 r2 r3 r4 r11 r15
  0x01e8: PHI (r0v23 ??) = (r0v11 ??), (r0v31 ??) binds: [B:113:0x01e6, B:99:0x01cb] A[DONT_GENERATE, DONT_INLINE]
  0x01e8: PHI (r1v17 ??) = (r1v10 ??), (r1v23 ??) binds: [B:113:0x01e6, B:99:0x01cb] A[DONT_GENERATE, DONT_INLINE]
  0x01e8: PHI (r2v14 ??) = (r2v7 ??), (r2v19 ??) binds: [B:113:0x01e6, B:99:0x01cb] A[DONT_GENERATE, DONT_INLINE]
  0x01e8: PHI (r3v16 ??) = (r3v9 ??), (r3v20 ??) binds: [B:113:0x01e6, B:99:0x01cb] A[DONT_GENERATE, DONT_INLINE]
  0x01e8: PHI (r4v12 ??) = (r4v5 ??), (r4v15 ??) binds: [B:113:0x01e6, B:99:0x01cb] A[DONT_GENERATE, DONT_INLINE]
  0x01e8: PHI (r11v19 ??) = (r11v14 ??), (r11v20 ??) binds: [B:113:0x01e6, B:99:0x01cb] A[DONT_GENERATE, DONT_INLINE]
  0x01e8: PHI (r15v19 ??) = (r15v13 ??), (r15v21 ??) binds: [B:113:0x01e6, B:99:0x01cb] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x015b A[EXC_TOP_SPLITTER, PHI: r9 r15 r21
  0x015b: PHI (r9v1 android.database.Cursor) = (r9v2 android.database.Cursor), (r9v7 android.database.Cursor) binds: [B:76:0x0159, B:63:0x013f] A[DONT_GENERATE, DONT_INLINE]
  0x015b: PHI (r15v4 ??) = (r15v5 ??), (r15v8 ??) binds: [B:76:0x0159, B:63:0x013f] A[DONT_GENERATE, DONT_INLINE]
  0x015b: PHI (r21v4 java.lang.String) = (r21v5 java.lang.String), (r21v8 java.lang.String) binds: [B:76:0x0159, B:63:0x013f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x009a A[EXC_TOP_SPLITTER, PHI: r8 r18 r21
  0x009a: PHI (r8v2 android.database.Cursor) = (r8v7 android.database.Cursor), (r8v10 android.database.Cursor) binds: [B:36:0x0098, B:25:0x007e] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r18v2 java.lang.String) = (r18v4 java.lang.String), (r18v7 java.lang.String) binds: [B:36:0x0098, B:25:0x007e] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r21v1 java.lang.String) = (r21v13 java.lang.String), (r21v15 java.lang.String) binds: [B:36:0x0098, B:25:0x007e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8 A[Catch: all -> 0x0142, Exception -> 0x0148, TryCatch #13 {all -> 0x0142, blocks: (B:41:0x00b2, B:43:0x00b8, B:44:0x00c0, B:46:0x00c6, B:47:0x00ce), top: B:165:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6 A[Catch: all -> 0x0142, Exception -> 0x0148, TRY_LEAVE, TryCatch #13 {all -> 0x0142, blocks: (B:41:0x00b2, B:43:0x00b8, B:44:0x00c0, B:46:0x00c6, B:47:0x00ce), top: B:165:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010f A[Catch: all -> 0x0134, Exception -> 0x014b, TRY_LEAVE, TryCatch #10 {all -> 0x0134, blocks: (B:49:0x0107, B:51:0x010f, B:55:0x011e), top: B:160:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:79:0x015f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0178 A[Catch: all -> 0x01d0, Exception -> 0x01d2, TryCatch #20 {Exception -> 0x01d2, blocks: (B:82:0x0172, B:84:0x0178, B:86:0x017e), top: B:171:0x0172 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v20, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.baidu.location.a$a] */
    public com.baidu.location.a a(double d, double d2) throws Throwable {
        Cursor cursorRawQuery;
        String str;
        String str2;
        char c2;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        ?? r15;
        Cursor cursorRawQuery2;
        Cursor cursor4;
        Cursor cursor5;
        Cursor cursor6;
        double[] dArrA;
        String string;
        double dA;
        ?? RawQuery;
        ?? string2;
        ?? string3;
        ?? string4;
        ?? string5;
        ?? string6;
        ?? r16;
        ?? str3;
        ?? str4;
        ?? str5;
        ?? str6;
        ?? str7;
        int i;
        ?? str8;
        String str9;
        String str10;
        ?? r1;
        ?? r0;
        ?? r2;
        ?? r3;
        ?? r4;
        ?? string7;
        ?? r17;
        Cursor cursor7;
        Cursor cursor8;
        int i2 = 4;
        int i3 = 5;
        int i4 = 3;
        int i5 = 2;
        double d3 = Double.MAX_VALUE;
        Cursor cursor9 = null;
        try {
            cursorRawQuery = this.f249c.rawQuery(c.i.a(this.f248b, d, d2), null);
            try {
                try {
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            str = null;
                            str2 = null;
                            double d4 = Double.MAX_VALUE;
                            while (!cursorRawQuery.isAfterLast()) {
                                try {
                                    String string8 = cursorRawQuery.getString(2);
                                    String string9 = cursorRawQuery.getString(3);
                                    cursor7 = cursorRawQuery;
                                    try {
                                        double dA2 = a(d2, d, cursorRawQuery.getDouble(5), cursorRawQuery.getDouble(4));
                                        if (dA2 < d4 && dA2 <= c.i.f252b) {
                                            d4 = dA2;
                                            str2 = string8;
                                            str = string9;
                                        }
                                        cursor7.moveToNext();
                                        cursorRawQuery = cursor7;
                                    } catch (Exception unused) {
                                        cursorRawQuery = cursor7;
                                        if (cursorRawQuery != null) {
                                            try {
                                                cursorRawQuery.close();
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        c2 = 0;
                                        if (str == null) {
                                            try {
                                                cursorRawQuery2 = this.f249c.rawQuery(c.h.a(this.f248b, d, d2), null);
                                                try {
                                                    try {
                                                        if (cursorRawQuery2.moveToFirst()) {
                                                            dArrA = Jni.a(d, d2, "wgs842mc");
                                                            while (!cursorRawQuery2.isAfterLast()) {
                                                                string = cursorRawQuery2.getString(i5);
                                                                try {
                                                                    double[] dArrA2 = Jni.a(cursorRawQuery2.getDouble(i4), cursorRawQuery2.getDouble(i2), "wgs842mc");
                                                                    double[] dArrA3 = Jni.a(cursorRawQuery2.getDouble(i3), cursorRawQuery2.getDouble(6), "wgs842mc");
                                                                    cursor4 = cursorRawQuery2;
                                                                    cursor5 = null;
                                                                    r15 = 0;
                                                                    int i6 = i3;
                                                                    int i7 = i4;
                                                                    try {
                                                                        try {
                                                                            dA = a(dArrA[c2], dArrA[1], dArrA2[c2], dArrA2[1], dArrA3[c2], dArrA3[1]);
                                                                            if (dA < d3) {
                                                                                d3 = dA;
                                                                                str2 = string;
                                                                            }
                                                                            try {
                                                                                cursor4.moveToNext();
                                                                                cursor9 = null;
                                                                                i5 = 2;
                                                                                i3 = i6;
                                                                                cursorRawQuery2 = cursor4;
                                                                                i4 = i7;
                                                                                c2 = 0;
                                                                                i2 = 4;
                                                                            } catch (Exception unused3) {
                                                                                cursor3 = cursor4;
                                                                                if (cursor3 != null) {
                                                                                    try {
                                                                                        cursor3.close();
                                                                                    } catch (Exception unused4) {
                                                                                    }
                                                                                }
                                                                                RawQuery = this.f249c.rawQuery(c.g.a(this.f248b, d, d2), r15);
                                                                                if (RawQuery.moveToFirst()) {
                                                                                    ?? r5 = r15;
                                                                                    ?? r6 = r5;
                                                                                    ?? r7 = r6;
                                                                                    ?? r8 = r7;
                                                                                    string7 = r8;
                                                                                    string3 = r5;
                                                                                    string4 = r6;
                                                                                    string5 = r7;
                                                                                    string6 = r8;
                                                                                    r17 = r15;
                                                                                } else {
                                                                                    ?? r9 = r15;
                                                                                    ?? r10 = r9;
                                                                                    ?? r11 = r10;
                                                                                    ?? r12 = r11;
                                                                                    string7 = r12;
                                                                                    string3 = r9;
                                                                                    string4 = r10;
                                                                                    string5 = r11;
                                                                                    string6 = r12;
                                                                                    r17 = r15;
                                                                                }
                                                                                if (RawQuery != 0) {
                                                                                    string2 = r17;
                                                                                    r15 = string7;
                                                                                    try {
                                                                                        RawQuery.close();
                                                                                    } catch (Exception unused5) {
                                                                                    }
                                                                                    str3 = r15;
                                                                                    r16 = string2;
                                                                                    str7 = string3;
                                                                                    str6 = string4;
                                                                                    str5 = string5;
                                                                                    str4 = string6;
                                                                                } else {
                                                                                    str3 = string7;
                                                                                }
                                                                                if (r16 != 0) {
                                                                                    str7 = string3;
                                                                                    str6 = string4;
                                                                                    str5 = string5;
                                                                                    str4 = string6;
                                                                                    r16 = r17;
                                                                                    i = 0;
                                                                                    str8 = new String(Base64.decode(r16.getBytes(), 0));
                                                                                } else {
                                                                                    str7 = string3;
                                                                                    str6 = string4;
                                                                                    str5 = string5;
                                                                                    str4 = string6;
                                                                                    r16 = r17;
                                                                                    i = 0;
                                                                                }
                                                                                if (str7 != 0) {
                                                                                    str8 = r16;
                                                                                    str7 = new String(Base64.decode(str7.getBytes(), i));
                                                                                }
                                                                                if (str6 != 0) {
                                                                                    str6 = new String(Base64.decode(str6.getBytes(), i));
                                                                                }
                                                                                if (str5 != 0) {
                                                                                    str5 = new String(Base64.decode(str5.getBytes(), i));
                                                                                }
                                                                                if (str4 != 0) {
                                                                                    str4 = new String(Base64.decode(str4.getBytes(), i));
                                                                                }
                                                                                if (str3 != 0) {
                                                                                    str3 = new String(Base64.decode(str3.getBytes(), i));
                                                                                }
                                                                                if (str2 != null) {
                                                                                    str9 = new String(Base64.decode(str2.getBytes(), i));
                                                                                } else {
                                                                                    str9 = str2;
                                                                                }
                                                                                if (str != null) {
                                                                                    str10 = new String(Base64.decode(str.getBytes(), i));
                                                                                } else {
                                                                                    str10 = str;
                                                                                }
                                                                                ?? c0056a = new com.baidu.location.a.C0056a();
                                                                                c0056a.d(str8);
                                                                                c0056a.e(str7);
                                                                                c0056a.g(str6);
                                                                                c0056a.b(str5);
                                                                                c0056a.c(str4);
                                                                                c0056a.f(str3);
                                                                                c0056a.h(str9);
                                                                                c0056a.i(str10);
                                                                                return c0056a.a();
                                                                            }
                                                                        } catch (Exception unused6) {
                                                                            cursor2 = cursor4;
                                                                            cursor = cursor5;
                                                                            cursor3 = cursor2;
                                                                            r15 = cursor;
                                                                            if (cursor3 != null) {
                                                                                cursor3.close();
                                                                            }
                                                                            RawQuery = this.f249c.rawQuery(c.g.a(this.f248b, d, d2), r15);
                                                                            if (RawQuery.moveToFirst()) {
                                                                                ?? r13 = r15;
                                                                                ?? r14 = r13;
                                                                                ?? r18 = r14;
                                                                                ?? r19 = r18;
                                                                                string7 = r19;
                                                                                string3 = r13;
                                                                                string4 = r14;
                                                                                string5 = r18;
                                                                                string6 = r19;
                                                                                r17 = r15;
                                                                            } else {
                                                                                ?? r110 = r15;
                                                                                ?? r111 = r110;
                                                                                ?? r112 = r111;
                                                                                ?? r113 = r112;
                                                                                string7 = r113;
                                                                                string3 = r110;
                                                                                string4 = r111;
                                                                                string5 = r112;
                                                                                string6 = r113;
                                                                                r17 = r15;
                                                                            }
                                                                            if (RawQuery != 0) {
                                                                                string2 = r17;
                                                                                r15 = string7;
                                                                                RawQuery.close();
                                                                                str3 = r15;
                                                                                r16 = string2;
                                                                                str7 = string3;
                                                                                str6 = string4;
                                                                                str5 = string5;
                                                                                str4 = string6;
                                                                            } else {
                                                                                str3 = string7;
                                                                            }
                                                                            if (r16 != 0) {
                                                                                str7 = string3;
                                                                                str6 = string4;
                                                                                str5 = string5;
                                                                                str4 = string6;
                                                                                r16 = r17;
                                                                                i = 0;
                                                                                str8 = new String(Base64.decode(r16.getBytes(), 0));
                                                                            } else {
                                                                                str7 = string3;
                                                                                str6 = string4;
                                                                                str5 = string5;
                                                                                str4 = string6;
                                                                                r16 = r17;
                                                                                i = 0;
                                                                            }
                                                                            if (str7 != 0) {
                                                                                str8 = r16;
                                                                                str7 = new String(Base64.decode(str7.getBytes(), i));
                                                                            }
                                                                            if (str6 != 0) {
                                                                                str6 = new String(Base64.decode(str6.getBytes(), i));
                                                                            }
                                                                            if (str5 != 0) {
                                                                                str5 = new String(Base64.decode(str5.getBytes(), i));
                                                                            }
                                                                            if (str4 != 0) {
                                                                                str4 = new String(Base64.decode(str4.getBytes(), i));
                                                                            }
                                                                            if (str3 != 0) {
                                                                                str3 = new String(Base64.decode(str3.getBytes(), i));
                                                                            }
                                                                            if (str2 != null) {
                                                                                str9 = new String(Base64.decode(str2.getBytes(), i));
                                                                            } else {
                                                                                str9 = str2;
                                                                            }
                                                                            if (str != null) {
                                                                                str10 = new String(Base64.decode(str.getBytes(), i));
                                                                            } else {
                                                                                str10 = str;
                                                                            }
                                                                            ?? c0056a2 = new com.baidu.location.a.C0056a();
                                                                            c0056a2.d(str8);
                                                                            c0056a2.e(str7);
                                                                            c0056a2.g(str6);
                                                                            c0056a2.b(str5);
                                                                            c0056a2.c(str4);
                                                                            c0056a2.f(str3);
                                                                            c0056a2.h(str9);
                                                                            c0056a2.i(str10);
                                                                            return c0056a2.a();
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        cursor9 = cursor4;
                                                                        if (cursor9 != null) {
                                                                            try {
                                                                                cursor9.close();
                                                                            } catch (Exception unused7) {
                                                                            }
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Exception unused8) {
                                                                    cursor4 = cursorRawQuery2;
                                                                    cursor5 = null;
                                                                }
                                                            }
                                                        }
                                                        cursor6 = cursorRawQuery2;
                                                        r15 = cursor9;
                                                        if (cursor6 != null) {
                                                            cursor3 = cursor6;
                                                            cursor3.close();
                                                        }
                                                    } catch (Exception unused9) {
                                                        cursor4 = cursorRawQuery2;
                                                        cursor5 = cursor9;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    cursor4 = cursorRawQuery2;
                                                }
                                            } catch (Exception unused10) {
                                                cursor = null;
                                                cursor2 = null;
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } else {
                                            r15 = 0;
                                        }
                                        RawQuery = this.f249c.rawQuery(c.g.a(this.f248b, d, d2), r15);
                                        try {
                                            if (RawQuery.moveToFirst()) {
                                                ?? r114 = r15;
                                                ?? r115 = r114;
                                                ?? r116 = r115;
                                                ?? r117 = r116;
                                                string7 = r117;
                                                string3 = r114;
                                                string4 = r115;
                                                string5 = r116;
                                                string6 = r117;
                                                r17 = r15;
                                            } else {
                                                ?? r118 = r15;
                                                ?? r119 = r118;
                                                ?? r1110 = r119;
                                                ?? r1111 = r1110;
                                                string7 = r1111;
                                                string3 = r118;
                                                string4 = r119;
                                                string5 = r1110;
                                                string6 = r1111;
                                                r17 = r15;
                                            }
                                            if (RawQuery != 0) {
                                                string2 = r17;
                                                r15 = string7;
                                                RawQuery.close();
                                                str3 = r15;
                                                r16 = string2;
                                                str7 = string3;
                                                str6 = string4;
                                                str5 = string5;
                                                str4 = string6;
                                            } else {
                                                str3 = string7;
                                            }
                                            if (r16 != 0) {
                                                str7 = string3;
                                                str6 = string4;
                                                str5 = string5;
                                                str4 = string6;
                                                r16 = r17;
                                                i = 0;
                                                str8 = new String(Base64.decode(r16.getBytes(), 0));
                                            } else {
                                                str7 = string3;
                                                str6 = string4;
                                                str5 = string5;
                                                str4 = string6;
                                                r16 = r17;
                                                i = 0;
                                            }
                                            if (str7 != 0) {
                                                str8 = r16;
                                                str7 = new String(Base64.decode(str7.getBytes(), i));
                                            }
                                            if (str6 != 0) {
                                                str6 = new String(Base64.decode(str6.getBytes(), i));
                                            }
                                            if (str5 != 0) {
                                                str5 = new String(Base64.decode(str5.getBytes(), i));
                                            }
                                            if (str4 != 0) {
                                                str4 = new String(Base64.decode(str4.getBytes(), i));
                                            }
                                            if (str3 != 0) {
                                                str3 = new String(Base64.decode(str3.getBytes(), i));
                                            }
                                            if (str2 != null) {
                                                str9 = new String(Base64.decode(str2.getBytes(), i));
                                            } else {
                                                str9 = str2;
                                            }
                                            if (str != null) {
                                                str10 = new String(Base64.decode(str.getBytes(), i));
                                            } else {
                                                str10 = str;
                                            }
                                            ?? c0056a3 = new com.baidu.location.a.C0056a();
                                            c0056a3.d(str8);
                                            c0056a3.e(str7);
                                            c0056a3.g(str6);
                                            c0056a3.b(str5);
                                            c0056a3.c(str4);
                                            c0056a3.f(str3);
                                            c0056a3.h(str9);
                                            c0056a3.i(str10);
                                            return c0056a3.a();
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (RawQuery != 0) {
                                                try {
                                                    RawQuery.close();
                                                } catch (Exception unused11) {
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        cursor9 = cursor7;
                                        if (cursor9 != null) {
                                            try {
                                                cursor9.close();
                                            } catch (Exception unused12) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused13) {
                                    cursor7 = cursorRawQuery;
                                }
                            }
                            cursor8 = cursorRawQuery;
                        } else {
                            cursor8 = cursorRawQuery;
                            str = null;
                            str2 = null;
                        }
                        if (cursor8 != null) {
                            cursorRawQuery = cursor8;
                            cursorRawQuery.close();
                        }
                    } catch (Exception unused14) {
                        str = null;
                        str2 = str;
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        c2 = 0;
                        if (str == null) {
                            cursorRawQuery2 = this.f249c.rawQuery(c.h.a(this.f248b, d, d2), null);
                            if (cursorRawQuery2.moveToFirst()) {
                                dArrA = Jni.a(d, d2, "wgs842mc");
                                while (!cursorRawQuery2.isAfterLast()) {
                                    string = cursorRawQuery2.getString(i5);
                                    double[] dArrA4 = Jni.a(cursorRawQuery2.getDouble(i4), cursorRawQuery2.getDouble(i2), "wgs842mc");
                                    double[] dArrA5 = Jni.a(cursorRawQuery2.getDouble(i3), cursorRawQuery2.getDouble(6), "wgs842mc");
                                    cursor4 = cursorRawQuery2;
                                    cursor5 = null;
                                    r15 = 0;
                                    int i8 = i3;
                                    int i9 = i4;
                                    dA = a(dArrA[c2], dArrA[1], dArrA4[c2], dArrA4[1], dArrA5[c2], dArrA5[1]);
                                    if (dA < d3) {
                                        d3 = dA;
                                        str2 = string;
                                    }
                                    cursor4.moveToNext();
                                    cursor9 = null;
                                    i5 = 2;
                                    i3 = i8;
                                    cursorRawQuery2 = cursor4;
                                    i4 = i9;
                                    c2 = 0;
                                    i2 = 4;
                                }
                            }
                            cursor6 = cursorRawQuery2;
                            r15 = cursor9;
                            if (cursor6 != null) {
                                cursor3 = cursor6;
                                cursor3.close();
                            }
                        } else {
                            r15 = 0;
                        }
                        RawQuery = this.f249c.rawQuery(c.g.a(this.f248b, d, d2), r15);
                        if (RawQuery.moveToFirst()) {
                            ?? r1112 = r15;
                            ?? r1113 = r1112;
                            ?? r1114 = r1113;
                            ?? r1115 = r1114;
                            string7 = r1115;
                            string3 = r1112;
                            string4 = r1113;
                            string5 = r1114;
                            string6 = r1115;
                            r17 = r15;
                        } else {
                            ?? r1116 = r15;
                            ?? r1117 = r1116;
                            ?? r1118 = r1117;
                            ?? r1119 = r1118;
                            string7 = r1119;
                            string3 = r1116;
                            string4 = r1117;
                            string5 = r1118;
                            string6 = r1119;
                            r17 = r15;
                        }
                        if (RawQuery != 0) {
                            string2 = r17;
                            r15 = string7;
                            RawQuery.close();
                            str3 = r15;
                            r16 = string2;
                            str7 = string3;
                            str6 = string4;
                            str5 = string5;
                            str4 = string6;
                        } else {
                            str3 = string7;
                        }
                        if (r16 != 0) {
                            str7 = string3;
                            str6 = string4;
                            str5 = string5;
                            str4 = string6;
                            r16 = r17;
                            i = 0;
                            str8 = new String(Base64.decode(r16.getBytes(), 0));
                        } else {
                            str7 = string3;
                            str6 = string4;
                            str5 = string5;
                            str4 = string6;
                            r16 = r17;
                            i = 0;
                        }
                        if (str7 != 0) {
                            str8 = r16;
                            str7 = new String(Base64.decode(str7.getBytes(), i));
                        }
                        if (str6 != 0) {
                            str6 = new String(Base64.decode(str6.getBytes(), i));
                        }
                        if (str5 != 0) {
                            str5 = new String(Base64.decode(str5.getBytes(), i));
                        }
                        if (str4 != 0) {
                            str4 = new String(Base64.decode(str4.getBytes(), i));
                        }
                        if (str3 != 0) {
                            str3 = new String(Base64.decode(str3.getBytes(), i));
                        }
                        if (str2 != null) {
                            str9 = new String(Base64.decode(str2.getBytes(), i));
                        } else {
                            str9 = str2;
                        }
                        if (str != null) {
                            str10 = new String(Base64.decode(str.getBytes(), i));
                        } else {
                            str10 = str;
                        }
                        ?? c0056a4 = new com.baidu.location.a.C0056a();
                        c0056a4.d(str8);
                        c0056a4.e(str7);
                        c0056a4.g(str6);
                        c0056a4.b(str5);
                        c0056a4.c(str4);
                        c0056a4.f(str3);
                        c0056a4.h(str9);
                        c0056a4.i(str10);
                        return c0056a4.a();
                    }
                    RawQuery = this.f249c.rawQuery(c.g.a(this.f248b, d, d2), r15);
                    try {
                        if (RawQuery.moveToFirst() || RawQuery.isAfterLast()) {
                            ?? r11110 = r15;
                            ?? r11111 = r11110;
                            ?? r11112 = r11111;
                            ?? r11113 = r11112;
                            string7 = r11113;
                            string3 = r11110;
                            string4 = r11111;
                            string5 = r11112;
                            string6 = r11113;
                            r17 = r15;
                        } else {
                            string2 = RawQuery.getString(RawQuery.getColumnIndex("country"));
                            try {
                                string3 = RawQuery.getString(RawQuery.getColumnIndex("countrycode"));
                                try {
                                    string4 = RawQuery.getString(RawQuery.getColumnIndex("province"));
                                    try {
                                        string5 = RawQuery.getString(RawQuery.getColumnIndex("city"));
                                        try {
                                            string6 = RawQuery.getString(RawQuery.getColumnIndex("citycode"));
                                            try {
                                                r17 = string2;
                                                string3 = string3;
                                                string4 = string4;
                                                string5 = string5;
                                                string6 = string6;
                                                string7 = RawQuery.getString(RawQuery.getColumnIndex("district"));
                                            } catch (Exception unused15) {
                                                if (RawQuery != 0) {
                                                }
                                                str3 = r15;
                                                r16 = string2;
                                                str7 = string3;
                                                str6 = string4;
                                                str5 = string5;
                                                str4 = string6;
                                                if (r16 != 0) {
                                                    str7 = string3;
                                                    str6 = string4;
                                                    str5 = string5;
                                                    str4 = string6;
                                                    r16 = r17;
                                                    i = 0;
                                                    str8 = new String(Base64.decode(r16.getBytes(), 0));
                                                } else {
                                                    str7 = string3;
                                                    str6 = string4;
                                                    str5 = string5;
                                                    str4 = string6;
                                                    r16 = r17;
                                                    i = 0;
                                                }
                                                if (str7 != 0) {
                                                    str8 = r16;
                                                    str7 = new String(Base64.decode(str7.getBytes(), i));
                                                }
                                                if (str6 != 0) {
                                                    str6 = new String(Base64.decode(str6.getBytes(), i));
                                                }
                                                if (str5 != 0) {
                                                    str5 = new String(Base64.decode(str5.getBytes(), i));
                                                }
                                                if (str4 != 0) {
                                                    str4 = new String(Base64.decode(str4.getBytes(), i));
                                                }
                                                if (str3 != 0) {
                                                    str3 = new String(Base64.decode(str3.getBytes(), i));
                                                }
                                                if (str2 != null) {
                                                    str9 = new String(Base64.decode(str2.getBytes(), i));
                                                } else {
                                                    str9 = str2;
                                                }
                                                if (str != null) {
                                                    str10 = new String(Base64.decode(str.getBytes(), i));
                                                } else {
                                                    str10 = str;
                                                }
                                                ?? c0056a5 = new com.baidu.location.a.C0056a();
                                                c0056a5.d(str8);
                                                c0056a5.e(str7);
                                                c0056a5.g(str6);
                                                c0056a5.b(str5);
                                                c0056a5.c(str4);
                                                c0056a5.f(str3);
                                                c0056a5.h(str9);
                                                c0056a5.i(str10);
                                                return c0056a5.a();
                                            }
                                        } catch (Exception unused16) {
                                            string6 = r15;
                                        }
                                    } catch (Exception unused17) {
                                        string5 = r15;
                                        string2 = string2;
                                        string3 = string3;
                                        string4 = string4;
                                        string6 = string5;
                                        if (RawQuery != 0) {
                                            RawQuery.close();
                                        }
                                        str3 = r15;
                                        r16 = string2;
                                        str7 = string3;
                                        str6 = string4;
                                        str5 = string5;
                                        str4 = string6;
                                        if (r16 != 0) {
                                            str7 = string3;
                                            str6 = string4;
                                            str5 = string5;
                                            str4 = string6;
                                            r16 = r17;
                                            i = 0;
                                            str8 = new String(Base64.decode(r16.getBytes(), 0));
                                        } else {
                                            str7 = string3;
                                            str6 = string4;
                                            str5 = string5;
                                            str4 = string6;
                                            r16 = r17;
                                            i = 0;
                                        }
                                        if (str7 != 0) {
                                            str8 = r16;
                                            str7 = new String(Base64.decode(str7.getBytes(), i));
                                        }
                                        if (str6 != 0) {
                                            str6 = new String(Base64.decode(str6.getBytes(), i));
                                        }
                                        if (str5 != 0) {
                                            str5 = new String(Base64.decode(str5.getBytes(), i));
                                        }
                                        if (str4 != 0) {
                                            str4 = new String(Base64.decode(str4.getBytes(), i));
                                        }
                                        if (str3 != 0) {
                                            str3 = new String(Base64.decode(str3.getBytes(), i));
                                        }
                                        if (str2 != null) {
                                            str9 = new String(Base64.decode(str2.getBytes(), i));
                                        } else {
                                            str9 = str2;
                                        }
                                        if (str != null) {
                                            str10 = new String(Base64.decode(str.getBytes(), i));
                                        } else {
                                            str10 = str;
                                        }
                                        ?? c0056a6 = new com.baidu.location.a.C0056a();
                                        c0056a6.d(str8);
                                        c0056a6.e(str7);
                                        c0056a6.g(str6);
                                        c0056a6.b(str5);
                                        c0056a6.c(str4);
                                        c0056a6.f(str3);
                                        c0056a6.h(str9);
                                        c0056a6.i(str10);
                                        return c0056a6.a();
                                    }
                                } catch (Exception unused18) {
                                    r2 = r15;
                                    r4 = string2;
                                    r3 = string3;
                                    string5 = r2;
                                    string2 = r4;
                                    string3 = r3;
                                    string4 = r2;
                                    string6 = string5;
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    str3 = r15;
                                    r16 = string2;
                                    str7 = string3;
                                    str6 = string4;
                                    str5 = string5;
                                    str4 = string6;
                                    if (r16 != 0) {
                                        str7 = string3;
                                        str6 = string4;
                                        str5 = string5;
                                        str4 = string6;
                                        r16 = r17;
                                        i = 0;
                                        str8 = new String(Base64.decode(r16.getBytes(), 0));
                                    } else {
                                        str7 = string3;
                                        str6 = string4;
                                        str5 = string5;
                                        str4 = string6;
                                        r16 = r17;
                                        i = 0;
                                    }
                                    if (str7 != 0) {
                                        str8 = r16;
                                        str7 = new String(Base64.decode(str7.getBytes(), i));
                                    }
                                    if (str6 != 0) {
                                        str6 = new String(Base64.decode(str6.getBytes(), i));
                                    }
                                    if (str5 != 0) {
                                        str5 = new String(Base64.decode(str5.getBytes(), i));
                                    }
                                    if (str4 != 0) {
                                        str4 = new String(Base64.decode(str4.getBytes(), i));
                                    }
                                    if (str3 != 0) {
                                        str3 = new String(Base64.decode(str3.getBytes(), i));
                                    }
                                    if (str2 != null) {
                                        str9 = new String(Base64.decode(str2.getBytes(), i));
                                    } else {
                                        str9 = str2;
                                    }
                                    if (str != null) {
                                        str10 = new String(Base64.decode(str.getBytes(), i));
                                    } else {
                                        str10 = str;
                                    }
                                    ?? c0056a7 = new com.baidu.location.a.C0056a();
                                    c0056a7.d(str8);
                                    c0056a7.e(str7);
                                    c0056a7.g(str6);
                                    c0056a7.b(str5);
                                    c0056a7.c(str4);
                                    c0056a7.f(str3);
                                    c0056a7.h(str9);
                                    c0056a7.i(str10);
                                    return c0056a7.a();
                                }
                            } catch (Exception unused19) {
                                r1 = r15;
                                r0 = string2;
                                r2 = r1;
                                r4 = r0;
                                r3 = r1;
                                string5 = r2;
                                string2 = r4;
                                string3 = r3;
                                string4 = r2;
                                string6 = string5;
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                str3 = r15;
                                r16 = string2;
                                str7 = string3;
                                str6 = string4;
                                str5 = string5;
                                str4 = string6;
                                if (r16 != 0) {
                                    str7 = string3;
                                    str6 = string4;
                                    str5 = string5;
                                    str4 = string6;
                                    r16 = r17;
                                    i = 0;
                                    str8 = new String(Base64.decode(r16.getBytes(), 0));
                                } else {
                                    str7 = string3;
                                    str6 = string4;
                                    str5 = string5;
                                    str4 = string6;
                                    r16 = r17;
                                    i = 0;
                                }
                                if (str7 != 0) {
                                    str8 = r16;
                                    str7 = new String(Base64.decode(str7.getBytes(), i));
                                }
                                if (str6 != 0) {
                                    str6 = new String(Base64.decode(str6.getBytes(), i));
                                }
                                if (str5 != 0) {
                                    str5 = new String(Base64.decode(str5.getBytes(), i));
                                }
                                if (str4 != 0) {
                                    str4 = new String(Base64.decode(str4.getBytes(), i));
                                }
                                if (str3 != 0) {
                                    str3 = new String(Base64.decode(str3.getBytes(), i));
                                }
                                if (str2 != null) {
                                    str9 = new String(Base64.decode(str2.getBytes(), i));
                                } else {
                                    str9 = str2;
                                }
                                if (str != null) {
                                    str10 = new String(Base64.decode(str.getBytes(), i));
                                } else {
                                    str10 = str;
                                }
                                ?? c0056a8 = new com.baidu.location.a.C0056a();
                                c0056a8.d(str8);
                                c0056a8.e(str7);
                                c0056a8.g(str6);
                                c0056a8.b(str5);
                                c0056a8.c(str4);
                                c0056a8.f(str3);
                                c0056a8.h(str9);
                                c0056a8.i(str10);
                                return c0056a8.a();
                            }
                        }
                        if (RawQuery != 0) {
                            string2 = r17;
                            r15 = string7;
                            RawQuery.close();
                            str3 = r15;
                            r16 = string2;
                            str7 = string3;
                            str6 = string4;
                            str5 = string5;
                            str4 = string6;
                        } else {
                            str3 = string7;
                        }
                    } catch (Exception unused20) {
                        ?? r20 = r15;
                        r1 = r20;
                        r0 = r20;
                    }
                } catch (Exception unused21) {
                    string2 = r15;
                    string3 = string2;
                    string4 = string3;
                    string5 = string4;
                    string6 = string5;
                    RawQuery = string6;
                } catch (Throwable th6) {
                    th = th6;
                    RawQuery = r15;
                }
                c2 = 0;
                if (str == null) {
                    cursorRawQuery2 = this.f249c.rawQuery(c.h.a(this.f248b, d, d2), null);
                    if (cursorRawQuery2.moveToFirst()) {
                        dArrA = Jni.a(d, d2, "wgs842mc");
                        while (!cursorRawQuery2.isAfterLast()) {
                            string = cursorRawQuery2.getString(i5);
                            double[] dArrA6 = Jni.a(cursorRawQuery2.getDouble(i4), cursorRawQuery2.getDouble(i2), "wgs842mc");
                            double[] dArrA7 = Jni.a(cursorRawQuery2.getDouble(i3), cursorRawQuery2.getDouble(6), "wgs842mc");
                            cursor4 = cursorRawQuery2;
                            cursor5 = null;
                            r15 = 0;
                            int i10 = i3;
                            int i11 = i4;
                            dA = a(dArrA[c2], dArrA[1], dArrA6[c2], dArrA6[1], dArrA7[c2], dArrA7[1]);
                            if (dA < d3 && dA <= c.h.f252b) {
                                d3 = dA;
                                str2 = string;
                            }
                            cursor4.moveToNext();
                            cursor9 = null;
                            i5 = 2;
                            i3 = i10;
                            cursorRawQuery2 = cursor4;
                            i4 = i11;
                            c2 = 0;
                            i2 = 4;
                        }
                    }
                    cursor6 = cursorRawQuery2;
                    r15 = cursor9;
                    if (cursor6 != null) {
                        cursor3 = cursor6;
                        cursor3.close();
                    }
                } else {
                    r15 = 0;
                }
                if (r16 != 0) {
                    str7 = string3;
                    str6 = string4;
                    str5 = string5;
                    str4 = string6;
                    r16 = r17;
                    i = 0;
                    str8 = new String(Base64.decode(r16.getBytes(), 0));
                } else {
                    str7 = string3;
                    str6 = string4;
                    str5 = string5;
                    str4 = string6;
                    r16 = r17;
                    i = 0;
                }
                if (str7 != 0) {
                    str8 = r16;
                    str7 = new String(Base64.decode(str7.getBytes(), i));
                }
                if (str6 != 0) {
                    str6 = new String(Base64.decode(str6.getBytes(), i));
                }
                if (str5 != 0) {
                    str5 = new String(Base64.decode(str5.getBytes(), i));
                }
                if (str4 != 0) {
                    str4 = new String(Base64.decode(str4.getBytes(), i));
                }
                if (str3 != 0) {
                    str3 = new String(Base64.decode(str3.getBytes(), i));
                }
                if (str2 != null) {
                    str9 = new String(Base64.decode(str2.getBytes(), i));
                } else {
                    str9 = str2;
                }
                if (str != null) {
                    str10 = new String(Base64.decode(str.getBytes(), i));
                } else {
                    str10 = str;
                }
                ?? c0056a9 = new com.baidu.location.a.C0056a();
                c0056a9.d(str8);
                c0056a9.e(str7);
                c0056a9.g(str6);
                c0056a9.b(str5);
                c0056a9.c(str4);
                c0056a9.f(str3);
                c0056a9.h(str9);
                c0056a9.i(str10);
                return c0056a9.a();
            } catch (Throwable th7) {
                th = th7;
                cursor7 = cursorRawQuery;
            }
        } catch (Exception unused22) {
            cursorRawQuery = null;
            str = null;
        } catch (Throwable th8) {
            th = th8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x01f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x0201  */
    public JSONObject a() {
        Cursor cursorRawQuery;
        Cursor cursorRawQuery2;
        Cursor cursor;
        Cursor cursor2;
        g gVar;
        String str;
        String str2 = "poi";
        JSONObject jSONObject = new JSONObject();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 86400000);
        try {
            SQLiteDatabase sQLiteDatabase = this.f249c;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                cursorRawQuery2 = null;
                cursor2 = null;
            } else {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                JSONArray jSONArray4 = new JSONArray();
                cursorRawQuery2 = this.f249c.rawQuery(String.format("SELECT * FROM RGCUPDATE WHERE type=%d AND %d > timestamp+%d ORDER BY gridkey", 0, Integer.valueOf(iCurrentTimeMillis), Integer.valueOf(this.f247a.c().b())), null);
                try {
                    cursorRawQuery = this.f249c.rawQuery(String.format("SELECT * FROM RGCUPDATE WHERE type=%d AND %d > timestamp+%d ORDER BY gridkey", 1, Integer.valueOf(iCurrentTimeMillis), Integer.valueOf(this.f247a.c().e())), null);
                    try {
                        try {
                            if (cursorRawQuery2.moveToFirst()) {
                                HashSet hashSet = new HashSet();
                                while (!cursorRawQuery2.isAfterLast()) {
                                    String string = cursorRawQuery2.getString(0);
                                    str = str2;
                                    try {
                                        String string2 = cursorRawQuery2.getString(1);
                                        jSONArray3.put(string);
                                        hashSet.add(string2);
                                        if (stringBuffer2.length() > 0) {
                                            stringBuffer2.append(",");
                                        }
                                        stringBuffer2.append("\"");
                                        stringBuffer2.append(string);
                                        stringBuffer2.append("\"");
                                        cursorRawQuery2.moveToNext();
                                        str2 = str;
                                    } catch (Exception unused) {
                                        str2 = str;
                                        cursor = cursorRawQuery2;
                                        if (cursor != null) {
                                            try {
                                                cursor.close();
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        if (cursorRawQuery != null) {
                                            cursor2 = cursorRawQuery;
                                            try {
                                                cursor2.close();
                                            } catch (Exception unused3) {
                                            }
                                        }
                                        if (jSONObject.has(str2)) {
                                            return jSONObject;
                                        }
                                        return jSONObject;
                                    }
                                }
                                str = str2;
                                int size = hashSet.size();
                                String[] strArr = new String[size];
                                hashSet.toArray(strArr);
                                for (int i = 0; i < size; i++) {
                                    jSONArray4.put(strArr[i]);
                                }
                            } else {
                                str = "poi";
                            }
                            if (cursorRawQuery.moveToFirst()) {
                                HashSet hashSet2 = new HashSet();
                                while (!cursorRawQuery.isAfterLast()) {
                                    String string3 = cursorRawQuery.getString(0);
                                    String string4 = cursorRawQuery.getString(1);
                                    jSONArray.put(string3);
                                    hashSet2.add(string4);
                                    if (stringBuffer.length() > 0) {
                                        stringBuffer.append(",");
                                    }
                                    stringBuffer.append("\"");
                                    stringBuffer.append(string3);
                                    stringBuffer.append("\"");
                                    cursorRawQuery.moveToNext();
                                }
                                int size2 = hashSet2.size();
                                String[] strArr2 = new String[size2];
                                hashSet2.toArray(strArr2);
                                for (int i2 = 0; i2 < size2; i2++) {
                                    jSONArray2.put(strArr2[i2]);
                                }
                            }
                            if (jSONArray3.length() != 0) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("gk", jSONArray3);
                                jSONObject2.put("ver", jSONArray4);
                                jSONObject.put("addr", jSONObject2);
                            }
                            if (jSONArray.length() != 0) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("gk", jSONArray);
                                jSONObject3.put("ver", jSONArray2);
                                str2 = str;
                                jSONObject.put(str2, jSONObject3);
                            } else {
                                str2 = str;
                            }
                            cursor2 = cursorRawQuery;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorRawQuery2 != null) {
                                try {
                                    cursorRawQuery2.close();
                                } catch (Exception unused4) {
                                }
                            }
                            if (cursorRawQuery != null) {
                                throw th;
                            }
                            try {
                                cursorRawQuery.close();
                                throw th;
                            } catch (Exception unused5) {
                                throw th;
                            }
                        }
                    } catch (Exception unused6) {
                    }
                } catch (Exception unused7) {
                    cursor = cursorRawQuery2;
                    cursorRawQuery = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (cursorRawQuery != null) {
                        cursor2 = cursorRawQuery;
                    }
                    if (jSONObject.has(str2)) {
                        return jSONObject;
                    }
                    return jSONObject;
                } catch (Throwable th2) {
                    th = th2;
                    cursorRawQuery = null;
                }
            }
            try {
                if (stringBuffer2.length() > 0) {
                    String str3 = String.format(Locale.US, "UPDATE RGCUPDATE SET timestamp=timestamp+1 WHERE type = %d AND gridkey IN (%s)", 0, stringBuffer2.toString());
                    gVar = this;
                    SQLiteDatabase sQLiteDatabase2 = gVar.f249c;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.execSQL(str3);
                    }
                } else {
                    gVar = this;
                }
                if (stringBuffer.length() > 0) {
                    String str4 = String.format(Locale.US, "UPDATE RGCUPDATE SET timestamp=timestamp+1 WHERE type = %d AND gridkey IN (%s)", 1, stringBuffer.toString());
                    SQLiteDatabase sQLiteDatabase3 = gVar.f249c;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.execSQL(str4);
                    }
                }
                if (cursorRawQuery2 != null) {
                    try {
                        cursorRawQuery2.close();
                    } catch (Exception unused8) {
                    }
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
            } catch (Exception unused9) {
                cursorRawQuery = cursor2;
                cursor = cursorRawQuery2;
                if (cursor != null) {
                    cursor.close();
                }
                if (cursorRawQuery != null) {
                    cursor2 = cursorRawQuery;
                }
                if (jSONObject.has(str2)) {
                    return jSONObject;
                }
                return jSONObject;
            } catch (Throwable th3) {
                th = th3;
                cursorRawQuery = cursor2;
                if (cursorRawQuery2 != null) {
                    cursorRawQuery2.close();
                }
                if (cursorRawQuery != null) {
                    throw th;
                }
                cursorRawQuery.close();
                throw th;
            }
        } catch (Exception unused10) {
            cursorRawQuery = null;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            cursorRawQuery = null;
            cursorRawQuery2 = null;
        }
        if (jSONObject.has(str2) || jSONObject.has("addr")) {
            return jSONObject;
        }
        return null;
    }

    public void a(JSONObject jSONObject) {
        SQLiteDatabase sQLiteDatabase = this.f249c;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        try {
            this.f249c.beginTransaction();
            for (c cVar : c.values()) {
                if (jSONObject.has(cVar.d)) {
                    String string = jSONObject.has(cVar.e) ? jSONObject.getString(cVar.e) : "";
                    ArrayList arrayList = new ArrayList();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(cVar.d);
                    arrayList.add(cVar.a(jSONObject2));
                    arrayList.addAll(cVar.a(jSONObject2, string, cVar.f));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.f249c.execSQL((String) it.next());
                    }
                }
            }
            this.f249c.setTransactionSuccessful();
            this.d = -1;
            this.e = -1;
        } catch (Exception unused) {
        } catch (Throwable th) {
            try {
                this.f249c.endTransaction();
            } catch (Exception unused2) {
            }
            throw th;
        }
        try {
            this.f249c.endTransaction();
        } catch (Exception unused3) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac A[EXC_TOP_SPLITTER, PHI: r2 r11
  0x00ac: PHI (r2v4 com.baidu.location.j) = (r2v6 com.baidu.location.j), (r2v9 com.baidu.location.j) binds: [B:30:0x00aa, B:17:0x0097] A[DONT_GENERATE, DONT_INLINE]
  0x00ac: PHI (r11v1 android.database.Cursor) = (r11v2 android.database.Cursor), (r11v3 android.database.Cursor) binds: [B:30:0x00aa, B:17:0x0097] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public List<j> b(double d, double d2) {
        j jVar;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        j jVar2 = null;
        Cursor cursor2 = null;
        try {
            Cursor cursorRawQuery = this.f249c.rawQuery(c.j.a(this.f248b, d, d2), null);
            try {
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        jVar = null;
                        int i = 0;
                        while (!cursorRawQuery.isAfterLast()) {
                            try {
                                String string = cursorRawQuery.getString(0);
                                String string2 = cursorRawQuery.getString(2);
                                double d3 = cursorRawQuery.getDouble(4);
                                double d4 = cursorRawQuery.getDouble(5);
                                int i2 = cursorRawQuery.getInt(6);
                                double dA = a(d2, d, d4, d3);
                                if (dA < c.j.f252b) {
                                    j jVar3 = new j(new String(Base64.decode(string.getBytes(), 0)), new String(Base64.decode(string2.getBytes(), 0)), 1.0d, "", "");
                                    int iA = a(i2, Math.round((float) dA));
                                    if (iA > i) {
                                        i = iA;
                                        jVar = jVar3;
                                    }
                                }
                                try {
                                    cursorRawQuery.moveToNext();
                                } catch (Exception unused) {
                                    jVar2 = jVar;
                                    if (cursorRawQuery != null) {
                                        try {
                                            cursorRawQuery.close();
                                        } catch (Exception unused2) {
                                        }
                                    }
                                    if (jVar2 != null) {
                                        arrayList.add(jVar2);
                                    }
                                    return arrayList;
                                }
                            } catch (Exception unused3) {
                                cursor2 = cursorRawQuery;
                                cursorRawQuery = cursor2;
                                jVar2 = jVar;
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                if (jVar2 != null) {
                                    arrayList.add(jVar2);
                                }
                                return arrayList;
                            }
                        }
                        jVar2 = jVar;
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused5) {
                jVar = null;
            }
        } catch (Exception unused6) {
            jVar = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (jVar2 != null) {
            arrayList.add(jVar2);
        }
        return arrayList;
    }

    public boolean b() throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        Cursor cursor2;
        if (this.f247a.c().n() && this.e == -1 && this.d == -1 && (sQLiteDatabase = this.f249c) != null && sQLiteDatabase.isOpen()) {
            Cursor cursorRawQuery = null;
            try {
                Cursor cursorRawQuery2 = this.f249c.rawQuery("SELECT COUNT(*) FROM RGCSITE;", null);
                try {
                    cursorRawQuery2.moveToFirst();
                    this.e = cursorRawQuery2.getInt(0);
                    cursorRawQuery = this.f249c.rawQuery("SELECT COUNT(*) FROM RGCAREA;", null);
                    cursorRawQuery.moveToFirst();
                    this.d = cursorRawQuery.getInt(0);
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
                    }
                    if (this.e != 0) {
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
        }
        return this.e != 0 && this.d == 0;
    }
}
