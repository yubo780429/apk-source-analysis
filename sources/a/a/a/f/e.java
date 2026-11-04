package a.a.a.f;

import a.a.a.g.k;
import a.a.a.i.i;
import android.database.Cursor;
import android.database.MatrixCursor;
import com.baidu.location.j;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f240a = {"CoorType", "Time", "LocType", "Longitude", "Latitude", "Radius", "NetworkLocationType", "Country", "CountryCode", "Province", "City", "CityCode", "District", "Street", "StreetNumber", "PoiList", "LocationDescription"};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f243c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final com.baidu.location.c g;
        public final boolean h;
        public final LinkedHashMap<String, Integer> i;

        public a(String[] strArr) {
            com.baidu.location.c cVar;
            boolean z;
            com.baidu.location.c cVar2;
            boolean z2;
            String str;
            com.baidu.location.c cVar3;
            String str2;
            int iIntValue = 8;
            boolean z3 = false;
            if (strArr == null) {
                this.f241a = null;
                this.f242b = null;
                this.i = null;
                this.f243c = false;
                this.d = false;
                this.e = false;
                this.g = null;
                this.h = false;
                this.f = 8;
                return;
            }
            LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
            com.baidu.location.c cVar4 = null;
            String str3 = null;
            String strSubstring = null;
            int i = 0;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            while (i < strArr.length) {
                try {
                    if (strArr[i].equals("-loc")) {
                        try {
                            str3 = strArr[i + 1];
                            try {
                                String[] strArrSplit = str3.split("&");
                                int i2 = 0;
                                while (i2 < strArrSplit.length) {
                                    try {
                                        cVar = cVar4;
                                        try {
                                            if (strArrSplit[i2].startsWith("cl=")) {
                                                strSubstring = strArrSplit[i2].substring(3);
                                            } else if (strArrSplit[i2].startsWith("wf=")) {
                                                String[] strArrSplit2 = strArrSplit[i2].substring(3).split("\\|");
                                                int i3 = 0;
                                                while (i3 < strArrSplit2.length) {
                                                    String[] strArrSplit3 = strArrSplit2[i3].split(";");
                                                    String[] strArr2 = strArrSplit2;
                                                    str2 = str3;
                                                    if (strArrSplit3.length >= 2) {
                                                        try {
                                                            linkedHashMap.put(strArrSplit3[0], Integer.valueOf(strArrSplit3[1]));
                                                        } catch (Exception unused) {
                                                            str3 = str2;
                                                            z = false;
                                                            cVar3 = cVar;
                                                            str = str3;
                                                            boolean z8 = z;
                                                            cVar2 = cVar3;
                                                            z2 = z8;
                                                            this.f241a = str;
                                                            this.f242b = strSubstring;
                                                            this.i = linkedHashMap;
                                                            this.f243c = z2;
                                                            this.d = z5;
                                                            this.e = z6;
                                                            this.f = iIntValue;
                                                            this.g = cVar2;
                                                            this.h = z7;
                                                        }
                                                    }
                                                    i3++;
                                                    strArrSplit2 = strArr2;
                                                    str3 = str2;
                                                }
                                            }
                                            i2++;
                                            cVar4 = cVar;
                                            strArrSplit = strArrSplit;
                                            str3 = str3;
                                        } catch (Exception unused2) {
                                            str2 = str3;
                                            str3 = str2;
                                            z = false;
                                            cVar3 = cVar;
                                            str = str3;
                                            boolean z9 = z;
                                            cVar2 = cVar3;
                                            z2 = z9;
                                            this.f241a = str;
                                            this.f242b = strSubstring;
                                            this.i = linkedHashMap;
                                            this.f243c = z2;
                                            this.d = z5;
                                            this.e = z6;
                                            this.f = iIntValue;
                                            this.g = cVar2;
                                            this.h = z7;
                                        }
                                    } catch (Exception unused3) {
                                        cVar = cVar4;
                                    }
                                }
                                cVar = cVar4;
                                z = false;
                                i += 2;
                                z3 = z;
                                cVar4 = cVar;
                            } catch (Exception unused4) {
                                cVar = cVar4;
                            }
                        } catch (Exception unused5) {
                            cVar = cVar4;
                        }
                    } else {
                        cVar = cVar4;
                        try {
                            if (strArr[i].equals("-com")) {
                                String[] strArrSplit4 = strArr[i + 1].split(";");
                                if (strArrSplit4.length > 0) {
                                    cVar3 = new com.baidu.location.c();
                                    z = false;
                                    try {
                                        cVar3.c(Double.valueOf(strArrSplit4[0]).doubleValue());
                                        cVar3.d(Double.valueOf(strArrSplit4[1]).doubleValue());
                                        cVar3.h(Integer.valueOf(strArrSplit4[2]).intValue());
                                        cVar3.l(strArrSplit4[3]);
                                        cVar = cVar3;
                                    } catch (Exception unused6) {
                                    }
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                                try {
                                    if (strArr[i].equals("-log")) {
                                        if (strArr[i + 1].equals("true")) {
                                            z4 = true;
                                        }
                                    } else if (strArr[i].equals("-rgc")) {
                                        if (strArr[i + 1].equals("true")) {
                                            z6 = true;
                                        }
                                    } else if (strArr[i].equals("-poi")) {
                                        if (strArr[i + 1].equals("true")) {
                                            z5 = true;
                                        }
                                    } else if (strArr[i].equals("-minap")) {
                                        try {
                                            iIntValue = Integer.valueOf(strArr[i + 1]).intValue();
                                        } catch (Exception unused7) {
                                        }
                                    } else if (strArr[i].equals("-des") && strArr[i + 1].equals("true")) {
                                        z7 = true;
                                    }
                                } catch (Exception unused8) {
                                    cVar3 = cVar;
                                    str = str3;
                                    boolean z10 = z;
                                    cVar2 = cVar3;
                                    z2 = z10;
                                    this.f241a = str;
                                    this.f242b = strSubstring;
                                    this.i = linkedHashMap;
                                    this.f243c = z2;
                                    this.d = z5;
                                    this.e = z6;
                                    this.f = iIntValue;
                                    this.g = cVar2;
                                    this.h = z7;
                                }
                            }
                            i += 2;
                            z3 = z;
                            cVar4 = cVar;
                        } catch (Exception unused9) {
                            z = false;
                            cVar3 = cVar;
                            str = str3;
                            boolean z11 = z;
                            cVar2 = cVar3;
                            z2 = z11;
                            this.f241a = str;
                            this.f242b = strSubstring;
                            this.i = linkedHashMap;
                            this.f243c = z2;
                            this.d = z5;
                            this.e = z6;
                            this.f = iIntValue;
                            this.g = cVar2;
                            this.h = z7;
                        }
                    }
                } catch (Exception unused10) {
                    cVar = cVar4;
                    z = z3;
                }
                str = str3;
                boolean z12 = z;
                cVar2 = cVar3;
                z2 = z12;
                this.f241a = str;
                this.f242b = strSubstring;
                this.i = linkedHashMap;
                this.f243c = z2;
                this.d = z5;
                this.e = z6;
                this.f = iIntValue;
                this.g = cVar2;
                this.h = z7;
            }
            com.baidu.location.c cVar5 = cVar4;
            str = !z4 ? null : str3;
            z2 = true;
            cVar2 = cVar5;
            this.f241a = str;
            this.f242b = strSubstring;
            this.i = linkedHashMap;
            this.f243c = z2;
            this.d = z5;
            this.e = z6;
            this.f = iIntValue;
            this.g = cVar2;
            this.h = z7;
        }
    }

    public static Cursor a(com.baidu.location.c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(System.currentTimeMillis()));
        String[] strArr = f240a;
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        Object[] objArr = new Object[strArr.length];
        objArr[matrixCursor.getColumnIndex("CoorType")] = "gcj02";
        objArr[matrixCursor.getColumnIndex("Time")] = str9;
        objArr[matrixCursor.getColumnIndex("LocType")] = Integer.valueOf(cVar.r());
        objArr[matrixCursor.getColumnIndex("Longitude")] = Double.valueOf(cVar.t());
        objArr[matrixCursor.getColumnIndex("Latitude")] = Double.valueOf(cVar.q());
        objArr[matrixCursor.getColumnIndex("Radius")] = Float.valueOf(cVar.z());
        objArr[matrixCursor.getColumnIndex("NetworkLocationType")] = cVar.v();
        com.baidu.location.a aVarC = cVar.c();
        if (aVarC != null) {
            str2 = aVarC.f1349a;
            str3 = aVarC.f1350b;
            str4 = aVarC.f1351c;
            str5 = aVarC.d;
            str6 = aVarC.e;
            str7 = aVarC.f;
            str8 = aVarC.g;
            str = aVarC.h;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
        }
        objArr[matrixCursor.getColumnIndex("Country")] = str2;
        objArr[matrixCursor.getColumnIndex("CountryCode")] = str3;
        objArr[matrixCursor.getColumnIndex("Province")] = str4;
        objArr[matrixCursor.getColumnIndex("City")] = str5;
        objArr[matrixCursor.getColumnIndex("CityCode")] = str6;
        objArr[matrixCursor.getColumnIndex("District")] = str7;
        objArr[matrixCursor.getColumnIndex("Street")] = str8;
        objArr[matrixCursor.getColumnIndex("StreetNumber")] = str;
        List<j> listX = cVar.x();
        if (listX == null) {
            objArr[matrixCursor.getColumnIndex("PoiList")] = null;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < listX.size(); i++) {
                j jVar = listX.get(i);
                stringBuffer.append(jVar.b());
                stringBuffer.append(";");
                stringBuffer.append(jVar.c());
                stringBuffer.append(";");
                stringBuffer.append(jVar.d());
                stringBuffer.append(";|");
            }
            objArr[matrixCursor.getColumnIndex("PoiList")] = stringBuffer.toString();
        }
        objArr[matrixCursor.getColumnIndex("LocationDescription")] = cVar.s();
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01ad  */
    public static com.baidu.location.c a(Cursor cursor) {
        ArrayList arrayList;
        com.baidu.location.c cVar = new com.baidu.location.c();
        if (cursor == null || cursor.getCount() <= 0 || !cursor.moveToFirst()) {
            cVar.h(67);
        } else {
            int i = cursor.getColumnIndex("LocType") != -1 ? cursor.getInt(cursor.getColumnIndex("LocType")) : 0;
            double d = cursor.getColumnIndex("Latitude") != -1 ? cursor.getDouble(cursor.getColumnIndex("Latitude")) : 0.0d;
            double d2 = cursor.getColumnIndex("Longitude") != -1 ? cursor.getDouble(cursor.getColumnIndex("Longitude")) : 0.0d;
            String string = cursor.getColumnIndex("CoorType") != -1 ? cursor.getString(cursor.getColumnIndex("CoorType")) : null;
            String string2 = cursor.getColumnIndex("NetworkLocationType") != -1 ? cursor.getString(cursor.getColumnIndex("NetworkLocationType")) : null;
            float f = cursor.getColumnIndex("Radius") != -1 ? cursor.getFloat(cursor.getColumnIndex("Radius")) : 0.0f;
            String string3 = cursor.getColumnIndex("Time") != -1 ? cursor.getString(cursor.getColumnIndex("Time")) : null;
            String string4 = cursor.getColumnIndex("Country") != -1 ? cursor.getString(cursor.getColumnIndex("Country")) : null;
            String string5 = cursor.getColumnIndex("CountryCode") != -1 ? cursor.getString(cursor.getColumnIndex("CountryCode")) : null;
            String string6 = cursor.getColumnIndex("Province") != -1 ? cursor.getString(cursor.getColumnIndex("Province")) : null;
            String str = string2;
            String string7 = cursor.getColumnIndex("City") != -1 ? cursor.getString(cursor.getColumnIndex("City")) : null;
            double d3 = d2;
            String string8 = cursor.getColumnIndex("CityCode") != -1 ? cursor.getString(cursor.getColumnIndex("CityCode")) : null;
            String string9 = cursor.getColumnIndex("District") != -1 ? cursor.getString(cursor.getColumnIndex("District")) : null;
            double d4 = d;
            String string10 = cursor.getColumnIndex("Street") != -1 ? cursor.getString(cursor.getColumnIndex("Street")) : null;
            String string11 = cursor.getColumnIndex("StreetNumber") != -1 ? cursor.getString(cursor.getColumnIndex("StreetNumber")) : null;
            com.baidu.location.a.C0056a c0056a = new com.baidu.location.a.C0056a();
            c0056a.d(string4);
            c0056a.e(string5);
            c0056a.g(string6);
            c0056a.b(string7);
            c0056a.c(string8);
            c0056a.f(string9);
            c0056a.h(string10);
            c0056a.i(string11);
            com.baidu.location.a aVarA = c0056a.a();
            if (cursor.getColumnIndex("PoiList") != -1) {
                arrayList = new ArrayList();
                String string12 = cursor.getString(cursor.getColumnIndex("PoiList"));
                if (string12 != null) {
                    try {
                        for (String str2 : string12.split("\\|")) {
                            String[] strArrSplit = str2.split(";");
                            if (strArrSplit.length >= 3) {
                                arrayList.add(new j(strArrSplit[0], strArrSplit[1], Double.valueOf(strArrSplit[2]).doubleValue(), "", ""));
                            }
                        }
                        if (arrayList.size() == 0) {
                            arrayList = null;
                        }
                    } catch (Exception unused) {
                        if (arrayList.size() == 0) {
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        arrayList.size();
                        throw th;
                    }
                } else if (arrayList.size() == 0) {
                    arrayList = null;
                }
            } else {
                arrayList = null;
            }
            String string13 = cursor.getColumnIndex("LocationDescription") != -1 ? cursor.getString(cursor.getColumnIndex("LocationDescription")) : null;
            cVar.n(string3);
            cVar.b(f);
            cVar.h(i);
            cVar.e(string);
            cVar.c(d4);
            cVar.d(d3);
            cVar.l(str);
            cVar.a(aVarA);
            cVar.a(arrayList);
            cVar.j(string13);
        }
        return cVar;
    }

    public static String a(com.baidu.location.c cVar, int i) {
        if (cVar == null || cVar.r() == 67) {
            return String.format(Locale.CHINA, "&ofl=%s|%d", "1", Integer.valueOf(i));
        }
        String str = String.format(Locale.CHINA, "&ofl=%s|%d|%f|%f|%d", "1", Integer.valueOf(i), Double.valueOf(cVar.t()), Double.valueOf(cVar.q()), Integer.valueOf((int) cVar.z()));
        if (cVar.c() != null) {
            str = str + "&ofaddr=" + cVar.c().i;
        }
        if (cVar.x() != null && cVar.x().size() > 0) {
            j jVar = cVar.x().get(0);
            str = str + String.format(Locale.US, "&ofpoi=%s|%s", jVar.b(), jVar.c());
        }
        if (a.a.a.i.b.f == null) {
            return str;
        }
        return str + String.format(Locale.US, "&pack=%s&sdk=%.3f", a.a.a.i.b.f, Float.valueOf(9.521f));
    }

    public static String a(com.baidu.location.c cVar, com.baidu.location.c cVar2, a aVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cVar2 == null ? "&ofcl=0" : String.format(Locale.US, "&ofcl=1|%f|%f|%d", Double.valueOf(cVar2.t()), Double.valueOf(cVar2.q()), Integer.valueOf((int) cVar2.z())));
        stringBuffer.append(cVar == null ? "&ofwf=0" : String.format(Locale.US, "&ofwf=1|%f|%f|%d", Double.valueOf(cVar.t()), Double.valueOf(cVar.q()), Integer.valueOf((int) cVar.z())));
        stringBuffer.append((aVar == null || !aVar.e) ? "&rgcn=0" : "&rgcn=1");
        stringBuffer.append((aVar == null || !aVar.d) ? "&poin=0" : "&poin=1");
        stringBuffer.append((aVar == null || !aVar.h) ? "&desc=0" : "&desc=1");
        if (aVar != null) {
            stringBuffer.append(String.format(Locale.US, "&aps=%d", Integer.valueOf(aVar.f)));
        }
        return stringBuffer.toString();
    }

    public static String[] a(a.a.a.g.a aVar, k kVar, com.baidu.location.c cVar, String str, boolean z, int i) {
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (aVar != null) {
            stringBuffer.append(a.a.a.g.f.w().a(aVar));
        }
        if (kVar != null) {
            stringBuffer.append(a.a.a.g.f.w().a(30, false, kVar, i.q0));
        }
        if (stringBuffer.length() > 0) {
            if (str != null) {
                stringBuffer.append(str);
            }
            arrayList.add("-loc");
            arrayList.add(stringBuffer.toString());
        }
        if (cVar != null) {
            String str2 = String.format(Locale.US, "%f;%f;%d;%s", Double.valueOf(cVar.q()), Double.valueOf(cVar.t()), Integer.valueOf(cVar.r()), cVar.v());
            arrayList.add("-com");
            arrayList.add(str2);
        }
        if (z) {
            arrayList.add("-log");
            arrayList.add("true");
        }
        if (i.d.equals("all")) {
            arrayList.add("-rgc");
            arrayList.add("true");
        }
        if (i.h) {
            arrayList.add("-poi");
            arrayList.add("true");
        }
        if (i.f) {
            arrayList.add("-des");
            arrayList.add("true");
        }
        arrayList.add("-minap");
        arrayList.add(Integer.toString(i));
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }
}
