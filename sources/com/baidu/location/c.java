package com.baidu.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public String A;
    public String B;
    public String C;
    public double D;
    public boolean E;
    public int F;
    public int G;
    public String H;
    public int I;
    public String J;
    public int K;
    public int L;
    public int M;
    public int N;
    public String O;
    public String P;
    public String Q;
    public int R;
    public List<j> S;
    public String T;
    public String U;
    public String V;
    public Bundle W;
    public int X;
    public int Y;
    public long Z;
    public String a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1355b;
    public String b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1356c;
    public double c0;
    public double d;
    public double d0;
    public double e;
    public boolean e0;
    public boolean f;
    public k f0;
    public double g;
    public float g0;
    public boolean h;
    public double h0;
    public float i;
    public int i0;
    public boolean j;
    public int j0;
    public float k;
    public c k0;
    public String l;
    public Bundle l0;
    public float m;
    public String m0;
    public int n;
    public long n0;
    public float o;
    public boolean p;
    public int q;
    public float r;
    public String s;
    public boolean t;
    public String u;
    public String v;
    public String w;
    public String x;
    public boolean y;
    public com.baidu.location.a z;

    public static class a implements Parcelable.Creator<c> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    public c() {
        this.f1355b = 0;
        this.f1356c = null;
        this.d = Double.MIN_VALUE;
        this.e = Double.MIN_VALUE;
        this.f = false;
        this.g = Double.MIN_VALUE;
        this.h = false;
        this.i = 0.0f;
        this.j = false;
        this.k = 0.0f;
        this.m = 0.0f;
        this.n = -1;
        this.o = 0.0f;
        this.p = false;
        this.q = -1;
        this.r = -1.0f;
        this.s = null;
        this.t = false;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = false;
        this.z = new com.baidu.location.a.C0056a().a();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.a0 = null;
        this.b0 = null;
        this.c0 = Double.MIN_VALUE;
        this.d0 = Double.MIN_VALUE;
        this.e0 = false;
        this.f0 = null;
        this.g0 = -1.0f;
        this.h0 = -1.0d;
        this.i0 = 0;
        this.j0 = -1;
        this.l0 = null;
        this.m0 = null;
        this.n0 = -1L;
    }

    public c(Parcel parcel) {
        this.f1355b = 0;
        this.f1356c = null;
        this.d = Double.MIN_VALUE;
        this.e = Double.MIN_VALUE;
        this.f = false;
        this.g = Double.MIN_VALUE;
        this.h = false;
        this.i = 0.0f;
        this.j = false;
        this.k = 0.0f;
        this.m = 0.0f;
        this.n = -1;
        this.o = 0.0f;
        this.p = false;
        this.q = -1;
        this.r = -1.0f;
        this.s = null;
        this.t = false;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = false;
        this.z = new com.baidu.location.a.C0056a().a();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.a0 = null;
        this.b0 = null;
        this.c0 = Double.MIN_VALUE;
        this.d0 = Double.MIN_VALUE;
        this.e0 = false;
        this.f0 = null;
        this.g0 = -1.0f;
        this.h0 = -1.0d;
        this.i0 = 0;
        this.j0 = -1;
        this.l0 = null;
        this.m0 = null;
        this.n0 = -1L;
        this.f1355b = parcel.readInt();
        this.f1356c = parcel.readString();
        this.n0 = parcel.readLong();
        this.d = parcel.readDouble();
        this.e = parcel.readDouble();
        this.g = parcel.readDouble();
        this.i = parcel.readFloat();
        this.k = parcel.readFloat();
        this.l = parcel.readString();
        this.m = parcel.readFloat();
        this.n = parcel.readInt();
        this.o = parcel.readFloat();
        this.q = parcel.readInt();
        this.r = parcel.readFloat();
        this.A = parcel.readString();
        this.F = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readDouble();
        this.H = parcel.readString();
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        String string10 = parcel.readString();
        com.baidu.location.a.C0056a c0056a = new com.baidu.location.a.C0056a();
        c0056a.d(string7);
        c0056a.e(string8);
        c0056a.g(string);
        c0056a.b(string2);
        c0056a.c(string6);
        c0056a.f(string3);
        c0056a.h(string4);
        c0056a.i(string5);
        c0056a.a(string9);
        c0056a.j(string10);
        this.z = c0056a.a();
        boolean[] zArr = new boolean[8];
        this.I = parcel.readInt();
        this.J = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.G = parcel.readInt();
        this.T = parcel.readString();
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readInt();
        this.N = parcel.readInt();
        this.O = parcel.readString();
        this.P = parcel.readString();
        this.Q = parcel.readString();
        this.R = parcel.readInt();
        this.X = parcel.readInt();
        this.U = parcel.readString();
        this.Y = parcel.readInt();
        this.V = parcel.readString();
        this.a0 = parcel.readString();
        this.b0 = parcel.readString();
        this.Z = parcel.readLong();
        this.c0 = parcel.readDouble();
        this.d0 = parcel.readDouble();
        this.g0 = parcel.readFloat();
        this.h0 = parcel.readDouble();
        this.i0 = parcel.readInt();
        this.j0 = parcel.readInt();
        this.s = parcel.readString();
        this.m0 = parcel.readString();
        try {
            this.k0 = (c) parcel.readParcelable(c.class.getClassLoader());
        } catch (Exception e) {
            this.k0 = null;
            e.printStackTrace();
        }
        try {
            parcel.readBooleanArray(zArr);
            this.f = zArr[0];
            this.h = zArr[1];
            this.j = zArr[2];
            this.p = zArr[3];
            this.t = zArr[4];
            this.y = zArr[5];
            this.E = zArr[6];
            this.e0 = zArr[7];
        } catch (Exception unused) {
        }
        ArrayList arrayList = new ArrayList();
        try {
            parcel.readList(arrayList, j.class.getClassLoader());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (arrayList.size() == 0) {
            this.S = null;
        } else {
            this.S = arrayList;
        }
        try {
            this.W = parcel.readBundle();
        } catch (Exception e3) {
            e3.printStackTrace();
            this.W = new Bundle();
        }
        try {
            this.l0 = parcel.readBundle();
        } catch (Exception e4) {
            e4.printStackTrace();
            this.l0 = new Bundle();
        }
        try {
            this.f0 = (k) parcel.readParcelable(k.class.getClassLoader());
        } catch (Exception e5) {
            this.f0 = null;
            e5.printStackTrace();
        }
    }

    public /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
    }

    public c(c cVar) {
        this.f1355b = 0;
        ArrayList arrayList = null;
        this.f1356c = null;
        this.d = Double.MIN_VALUE;
        this.e = Double.MIN_VALUE;
        this.f = false;
        this.g = Double.MIN_VALUE;
        this.h = false;
        this.i = 0.0f;
        this.j = false;
        this.k = 0.0f;
        this.m = 0.0f;
        this.n = -1;
        this.o = 0.0f;
        this.p = false;
        this.q = -1;
        this.r = -1.0f;
        this.s = null;
        this.t = false;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = false;
        this.z = new com.baidu.location.a.C0056a().a();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.a0 = null;
        this.b0 = null;
        this.c0 = Double.MIN_VALUE;
        this.d0 = Double.MIN_VALUE;
        this.e0 = false;
        this.f0 = null;
        this.g0 = -1.0f;
        this.h0 = -1.0d;
        this.i0 = 0;
        this.j0 = -1;
        this.l0 = null;
        this.m0 = null;
        this.n0 = -1L;
        this.f1355b = cVar.f1355b;
        this.f1356c = cVar.f1356c;
        this.n0 = cVar.n0;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f = cVar.f;
        this.g = cVar.g;
        this.h = cVar.h;
        this.i = cVar.i;
        this.j = cVar.j;
        this.k = cVar.k;
        this.l = cVar.l;
        this.m = cVar.m;
        this.n = cVar.n;
        this.o = cVar.o;
        this.p = cVar.p;
        this.q = cVar.q;
        this.r = cVar.r;
        this.s = cVar.s;
        this.t = cVar.t;
        this.u = cVar.u;
        this.y = cVar.y;
        com.baidu.location.a.C0056a c0056a = new com.baidu.location.a.C0056a();
        c0056a.d(cVar.z.f1349a);
        c0056a.e(cVar.z.f1350b);
        c0056a.g(cVar.z.f1351c);
        c0056a.b(cVar.z.d);
        c0056a.c(cVar.z.e);
        c0056a.f(cVar.z.f);
        c0056a.h(cVar.z.g);
        c0056a.i(cVar.z.h);
        c0056a.a(cVar.z.j);
        c0056a.j(cVar.z.k);
        this.z = c0056a.a();
        this.A = cVar.A;
        this.B = cVar.B;
        this.C = cVar.C;
        this.D = cVar.D;
        this.G = cVar.G;
        this.F = cVar.F;
        this.E = cVar.E;
        this.H = cVar.H;
        this.I = cVar.I;
        this.J = cVar.J;
        this.v = cVar.v;
        this.w = cVar.w;
        this.x = cVar.x;
        this.K = cVar.K;
        this.L = cVar.L;
        this.M = cVar.L;
        this.N = cVar.N;
        this.O = cVar.O;
        this.P = cVar.P;
        this.Q = cVar.Q;
        this.R = cVar.R;
        this.X = cVar.X;
        this.V = cVar.V;
        this.a0 = cVar.a0;
        this.b0 = cVar.b0;
        this.c0 = cVar.c0;
        this.d0 = cVar.d0;
        this.Z = cVar.Z;
        this.h0 = cVar.h0;
        this.i0 = cVar.i0;
        this.j0 = cVar.j0;
        this.k0 = cVar.k0;
        this.U = cVar.U;
        if (cVar.S != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < cVar.S.size(); i++) {
                j jVar = cVar.S.get(i);
                arrayList.add(new j(jVar.b(), jVar.c(), jVar.d(), jVar.e(), jVar.a()));
            }
        }
        this.S = arrayList;
        this.T = cVar.T;
        this.W = cVar.W;
        this.Y = cVar.Y;
        this.e0 = cVar.e0;
        this.f0 = cVar.f0;
        this.g0 = cVar.g0;
        this.l0 = cVar.l0;
        this.m0 = cVar.m0;
    }

    /* JADX WARN: Code duplicated, block: B:219:0x048c A[Catch: Exception -> 0x0184, Error -> 0x0779, TRY_LEAVE, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:228:0x04d3 A[Catch: Exception -> 0x0184, Error -> 0x0779, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x04e1 A[Catch: Exception -> 0x0184, Error -> 0x0779, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x04ec A[Catch: Exception -> 0x0184, Error -> 0x0779, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x04f8 A[Catch: Exception -> 0x0184, Error -> 0x0779, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x050b A[Catch: Exception -> 0x0184, Error -> 0x0779, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x0519 A[Catch: Exception -> 0x0184, Error -> 0x0779, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x0524 A[Catch: Exception -> 0x0184, Error -> 0x0779, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x0532 A[Catch: Exception -> 0x0184, Error -> 0x0779, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x053d A[Catch: Exception -> 0x0184, Error -> 0x0779, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x054b A[Catch: Exception -> 0x0184, Error -> 0x0779, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x0556 A[Catch: Exception -> 0x0184, Error -> 0x0779, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:256:0x0566 A[Catch: Exception -> 0x0184, Error -> 0x0779, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:258:0x0572  */
    /* JADX WARN: Code duplicated, block: B:259:0x0574 A[Catch: Exception -> 0x0184, Error -> 0x0779, TRY_LEAVE, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x05a0 A[Catch: Exception -> 0x065b, Error -> 0x0779, TryCatch #13 {Exception -> 0x065b, blocks: (B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656), top: B:402:0x0592 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x05b0 A[Catch: Exception -> 0x065b, Error -> 0x0779, TryCatch #13 {Exception -> 0x065b, blocks: (B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656), top: B:402:0x0592 }] */
    /* JADX WARN: Code duplicated, block: B:272:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:274:0x05b8 A[Catch: Exception -> 0x065b, Error -> 0x0779, TryCatch #13 {Exception -> 0x065b, blocks: (B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656), top: B:402:0x0592 }] */
    /* JADX WARN: Code duplicated, block: B:277:0x05c3 A[Catch: Exception -> 0x065b, Error -> 0x0779, TryCatch #13 {Exception -> 0x065b, blocks: (B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656), top: B:402:0x0592 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x05dc A[Catch: Exception -> 0x065b, Error -> 0x0779, TryCatch #13 {Exception -> 0x065b, blocks: (B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656), top: B:402:0x0592 }] */
    /* JADX WARN: Code duplicated, block: B:283:0x05ec A[Catch: Exception -> 0x065b, Error -> 0x0779, TryCatch #13 {Exception -> 0x065b, blocks: (B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656), top: B:402:0x0592 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x05fc A[Catch: Exception -> 0x065b, Error -> 0x0779, TryCatch #13 {Exception -> 0x065b, blocks: (B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656), top: B:402:0x0592 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x061d A[Catch: Exception -> 0x0639, Error -> 0x0779, TryCatch #15 {Exception -> 0x0639, blocks: (B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b), top: B:405:0x060d }] */
    /* JADX WARN: Code duplicated, block: B:293:0x0627 A[Catch: Exception -> 0x0639, Error -> 0x0779, TryCatch #15 {Exception -> 0x0639, blocks: (B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b), top: B:405:0x060d }] */
    /* JADX WARN: Code duplicated, block: B:299:0x0641 A[Catch: Exception -> 0x065b, Error -> 0x0779, TryCatch #13 {Exception -> 0x065b, blocks: (B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656), top: B:402:0x0592 }] */
    /* JADX WARN: Code duplicated, block: B:301:0x064d A[Catch: Exception -> 0x065b, Error -> 0x0779, TryCatch #13 {Exception -> 0x065b, blocks: (B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656), top: B:402:0x0592 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x0651 A[Catch: Exception -> 0x065b, Error -> 0x0779, TryCatch #13 {Exception -> 0x065b, blocks: (B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656), top: B:402:0x0592 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x0656 A[Catch: Exception -> 0x065b, Error -> 0x0779, TRY_LEAVE, TryCatch #13 {Exception -> 0x065b, blocks: (B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656), top: B:402:0x0592 }] */
    /* JADX WARN: Code duplicated, block: B:310:0x0668 A[Catch: Exception -> 0x0184, Error -> 0x0779, TRY_LEAVE, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:312:0x0672  */
    /* JADX WARN: Code duplicated, block: B:316:0x067c A[Catch: Exception -> 0x068c, Error -> 0x0779, TryCatch #2 {Exception -> 0x068c, blocks: (B:314:0x0676, B:316:0x067c, B:317:0x0688), top: B:382:0x0676 }] */
    /* JADX WARN: Code duplicated, block: B:317:0x0688 A[Catch: Exception -> 0x068c, Error -> 0x0779, TRY_LEAVE, TryCatch #2 {Exception -> 0x068c, blocks: (B:314:0x0676, B:316:0x067c, B:317:0x0688), top: B:382:0x0676 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x0690  */
    /* JADX WARN: Code duplicated, block: B:323:0x069d A[Catch: Exception -> 0x0184, Error -> 0x0779, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:326:0x06ad A[Catch: Exception -> 0x0184, Error -> 0x0779, TRY_LEAVE, TryCatch #17 {Error -> 0x0779, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04cb, B:228:0x04d3, B:230:0x04e1, B:231:0x04e4, B:233:0x04ec, B:235:0x04f8, B:236:0x0503, B:238:0x050b, B:240:0x0519, B:241:0x051c, B:243:0x0524, B:245:0x0532, B:246:0x0535, B:248:0x053d, B:250:0x054b, B:251:0x054e, B:253:0x0556, B:254:0x055e, B:256:0x0566, B:262:0x057d, B:259:0x0574, B:264:0x0580, B:265:0x058a, B:267:0x0592, B:269:0x05a0, B:271:0x05b0, B:274:0x05b8, B:275:0x05bb, B:277:0x05c3, B:278:0x05d4, B:280:0x05dc, B:281:0x05e4, B:283:0x05ec, B:284:0x05f4, B:286:0x05fc, B:287:0x0605, B:289:0x060d, B:291:0x061d, B:293:0x0627, B:295:0x062b, B:297:0x0639, B:299:0x0641, B:301:0x064d, B:302:0x0651, B:303:0x0656, B:308:0x0660, B:310:0x0668, B:314:0x0676, B:316:0x067c, B:317:0x0688, B:318:0x068c, B:321:0x0692, B:323:0x069d, B:324:0x06a5, B:326:0x06ad, B:341:0x06e3, B:342:0x06e6, B:351:0x071c, B:313:0x0673, B:307:0x065d, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04c5, B:225:0x04c8, B:361:0x0734, B:362:0x0739), top: B:396:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x06bd A[Catch: all -> 0x06e1, TryCatch #0 {all -> 0x06e1, blocks: (B:329:0x06b7, B:331:0x06bd, B:333:0x06c3, B:335:0x06c7, B:337:0x06de), top: B:378:0x06b7 }] */
    /* JADX WARN: Code duplicated, block: B:337:0x06de A[Catch: all -> 0x06e1, TRY_LEAVE, TryCatch #0 {all -> 0x06e1, blocks: (B:329:0x06b7, B:331:0x06bd, B:333:0x06c3, B:335:0x06c7, B:337:0x06de), top: B:378:0x06b7 }] */
    /* JADX WARN: Code duplicated, block: B:346:0x06fc A[Catch: all -> 0x071a, TryCatch #19 {all -> 0x071a, blocks: (B:344:0x06ee, B:346:0x06fc, B:348:0x0704), top: B:411:0x06ee }] */
    /* JADX WARN: Code duplicated, block: B:348:0x0704 A[Catch: all -> 0x071a, TRY_LEAVE, TryCatch #19 {all -> 0x071a, blocks: (B:344:0x06ee, B:346:0x06fc, B:348:0x0704), top: B:411:0x06ee }] */
    /* JADX WARN: Code duplicated, block: B:402:0x0592 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x060d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x06ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0636 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v46 */
    public c(String str) {
        ?? r2;
        boolean z;
        Exception exc;
        boolean z2;
        String str2;
        String str3;
        JSONObject jSONObject;
        boolean z3;
        Exception exc2;
        String string;
        String str4;
        String str5;
        String string2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String string3;
        String string4;
        String str11;
        String string5;
        String str12;
        String string6;
        int i;
        int i2;
        String str13;
        boolean z4;
        JSONObject jSONObject2;
        int i3;
        String[] strArrSplit;
        int iOptInt;
        int iIntValue;
        JSONObject jSONObject3;
        String str14;
        String str15;
        String string7;
        String[] strArrSplit2;
        int iIntValue2;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        this.f1355b = 0;
        this.f1356c = null;
        this.d = Double.MIN_VALUE;
        this.e = Double.MIN_VALUE;
        this.f = false;
        this.g = Double.MIN_VALUE;
        this.h = false;
        this.i = 0.0f;
        this.j = false;
        this.k = 0.0f;
        this.m = 0.0f;
        this.n = -1;
        this.o = 0.0f;
        this.p = false;
        this.q = -1;
        this.r = -1.0f;
        this.s = null;
        this.t = false;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = false;
        this.z = new com.baidu.location.a.C0056a().a();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.a0 = null;
        this.b0 = null;
        this.c0 = Double.MIN_VALUE;
        this.d0 = Double.MIN_VALUE;
        this.e0 = false;
        this.f0 = null;
        this.g0 = -1.0f;
        this.h0 = -1.0d;
        this.i0 = 0;
        this.j0 = -1;
        this.l0 = null;
        this.m0 = null;
        this.n0 = -1L;
        if (str == null || str.equals("")) {
            return;
        }
        try {
            try {
                try {
                    JSONObject jSONObject4 = new JSONObject(str);
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("result");
                    int i4 = Integer.parseInt(jSONObject5.getString("error"));
                    h(i4);
                    n(jSONObject5.getString("time"));
                    String str16 = "x";
                    String str17 = "y";
                    try {
                        if (i4 == 61) {
                            JSONObject jSONObject6 = jSONObject4.getJSONObject("content");
                            JSONObject jSONObject7 = jSONObject6.getJSONObject("point");
                            c(Double.parseDouble(jSONObject7.getString("y")));
                            d(Double.parseDouble(jSONObject7.getString("x")));
                            b(Float.parseFloat(jSONObject6.getString("radius")));
                            c(Float.parseFloat(jSONObject6.getString("s")));
                            a(Float.parseFloat(jSONObject6.getString("d")));
                            m(Integer.parseInt(jSONObject6.getString("n")));
                            if (jSONObject6.has("is_mock")) {
                                k(jSONObject6.getInt("is_mock"));
                            }
                            if (jSONObject6.has("h")) {
                                try {
                                    a(jSONObject6.getDouble("h"));
                                } catch (Exception unused) {
                                }
                            }
                            try {
                                if (jSONObject6.has("in_cn")) {
                                    i(Integer.parseInt(jSONObject6.getString("in_cn")));
                                } else {
                                    i(1);
                                }
                            } catch (Exception unused2) {
                            }
                            if (this.G != 0) {
                                e("gcj02");
                                return;
                            }
                            str2 = "wgs84";
                        } else {
                            str2 = "gcj02";
                            if (i4 == 161) {
                                JSONObject jSONObject8 = jSONObject4.getJSONObject("content");
                                JSONObject jSONObject9 = jSONObject8.getJSONObject("point");
                                c(Double.parseDouble(jSONObject9.getString("y")));
                                d(Double.parseDouble(jSONObject9.getString("x")));
                                b(Float.parseFloat(jSONObject8.getString("radius")));
                                if (jSONObject8.has("traffic")) {
                                    o(jSONObject8.getString("traffic"));
                                }
                                if (jSONObject8.has("traffic_prop")) {
                                    d(Float.parseFloat(jSONObject8.optString("traffic_prop")));
                                }
                                if (jSONObject8.has("is_station")) {
                                    g(jSONObject8.optInt("is_station"));
                                }
                                if (jSONObject8.has("traffic_skip_prop")) {
                                    e(Float.parseFloat(jSONObject8.optString("traffic_skip_prop")));
                                }
                                if (jSONObject8.has("sema")) {
                                    JSONObject jSONObject10 = jSONObject8.getJSONObject("sema");
                                    if (jSONObject10.has("aptag")) {
                                        String string14 = jSONObject10.getString("aptag");
                                        if (TextUtils.isEmpty(string14)) {
                                            str3 = "";
                                            this.v = str3;
                                        } else {
                                            this.v = string14;
                                            str3 = "";
                                        }
                                    } else {
                                        str3 = "";
                                    }
                                    if (jSONObject10.has("aptagd")) {
                                        JSONArray jSONArray = jSONObject10.getJSONObject("aptagd").getJSONArray("pois");
                                        ArrayList arrayList = new ArrayList();
                                        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                                            JSONObject jSONObject11 = jSONArray.getJSONObject(i5);
                                            arrayList.add(new j(jSONObject11.getString("pid"), jSONObject11.getString("pname"), jSONObject11.getDouble("pr"), jSONObject11.has("tags") ? jSONObject11.getString("tags") : str3, jSONObject11.has("addr") ? jSONObject11.getString("addr") : str3));
                                        }
                                        this.S = arrayList;
                                    }
                                    if (jSONObject10.has("poiregion")) {
                                        String string15 = jSONObject10.getString("poiregion");
                                        if (!TextUtils.isEmpty(string15)) {
                                            this.w = string15;
                                        }
                                    }
                                    if (jSONObject10.has("poi_regions")) {
                                        JSONObject jSONObject12 = jSONObject10.getJSONObject("poi_regions");
                                        this.f0 = new k(jSONObject12.has("direction_desc") ? jSONObject12.getString("direction_desc") : str3, jSONObject12.has("name") ? jSONObject12.getString("name") : str3, jSONObject12.has("tag") ? jSONObject12.getString("tag") : str3);
                                    }
                                    if (jSONObject10.has("regular")) {
                                        String string16 = jSONObject10.getString("regular");
                                        if (!TextUtils.isEmpty(string16)) {
                                            this.x = string16;
                                        }
                                    }
                                } else {
                                    str3 = "";
                                }
                                if (jSONObject8.has("addr")) {
                                    try {
                                        jSONObject = jSONObject8.getJSONObject("addr");
                                        z3 = true;
                                    } catch (Exception unused3) {
                                        jSONObject = null;
                                        z3 = false;
                                    }
                                    if (jSONObject != null) {
                                        String string17 = jSONObject.has("city") ? jSONObject.getString("city") : str3;
                                        string6 = jSONObject.has("city_code") ? jSONObject.getString("city_code") : str3;
                                        string3 = jSONObject.has("country") ? jSONObject.getString("country") : str3;
                                        string4 = jSONObject.has("country_code") ? jSONObject.getString("country_code") : str3;
                                        String string18 = jSONObject.has("province") ? jSONObject.getString("province") : str3;
                                        string2 = jSONObject.has("district") ? jSONObject.getString("district") : str3;
                                        string = jSONObject.has("street") ? jSONObject.getString("street") : str3;
                                        String string19 = jSONObject.has("street_number") ? jSONObject.getString("street_number") : str3;
                                        String string20 = jSONObject.has("adcode") ? jSONObject.getString("adcode") : str3;
                                        string5 = jSONObject.has("town") ? jSONObject.getString("town") : null;
                                        str12 = string18;
                                        str6 = string19;
                                        String str18 = string20;
                                        str10 = string17;
                                        str17 = "y";
                                        str11 = str18;
                                    } else {
                                        try {
                                            String[] strArrSplit3 = jSONObject8.getString("addr").split(",");
                                            int length = strArrSplit3.length;
                                            if (length > 0) {
                                                str4 = strArrSplit3[0];
                                                i = 1;
                                            } else {
                                                i = 1;
                                                str4 = null;
                                            }
                                            if (length > i) {
                                                try {
                                                    str5 = strArrSplit3[i];
                                                    i2 = 2;
                                                } catch (Exception e) {
                                                    exc2 = e;
                                                    string = null;
                                                    str5 = null;
                                                    string2 = null;
                                                    str6 = null;
                                                    str7 = null;
                                                    str8 = null;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z3 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str19 = str7;
                                                    str12 = str4;
                                                    string6 = str19;
                                                    if (z3) {
                                                        com.baidu.location.a.C0056a c0056a = new com.baidu.location.a.C0056a();
                                                        c0056a.d(string3);
                                                        c0056a.e(string4);
                                                        c0056a.g(str12);
                                                        c0056a.b(str10);
                                                        c0056a.c(string6);
                                                        c0056a.f(string2);
                                                        c0056a.h(string);
                                                        c0056a.i(str6);
                                                        c0056a.a(str11);
                                                        c0056a.j(string5);
                                                        this.z = c0056a.a();
                                                        this.t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            n(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        try {
                                                            jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                            if (jSONObject2.has("area")) {
                                                                iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                                if (iIntValue == 0) {
                                                                    e(2);
                                                                } else if (iIntValue == 1) {
                                                                    e(1);
                                                                }
                                                            }
                                                            if (jSONObject2.has("support")) {
                                                                d(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                            }
                                                            if (jSONObject2.has("inbldg")) {
                                                                this.O = jSONObject2.getString("inbldg");
                                                            }
                                                            if (jSONObject2.has("inbldgid")) {
                                                                this.P = jSONObject2.getString("inbldgid");
                                                            }
                                                            if (jSONObject2.has("polygon")) {
                                                                h(jSONObject2.getString("polygon"));
                                                            }
                                                            if (jSONObject2.has("ret_fields")) {
                                                                try {
                                                                    for (String str20 : jSONObject2.getString("ret_fields").split("\\|")) {
                                                                        strArrSplit = str20.split("=");
                                                                        if (strArrSplit == null) {
                                                                        }
                                                                    }
                                                                } catch (Exception unused4) {
                                                                }
                                                            }
                                                            if (jSONObject2.has("inout_ble")) {
                                                                iOptInt = jSONObject2.optInt("inout_ble");
                                                                c(iOptInt);
                                                                if (iOptInt == 1) {
                                                                    b(true);
                                                                } else {
                                                                    b(false);
                                                                }
                                                            } else {
                                                                c(-1);
                                                            }
                                                        } catch (Exception e2) {
                                                            e2.printStackTrace();
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        b(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z4 = false;
                                                        b(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        i(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        i(1);
                                                    }
                                                    e(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        try {
                                                            if (string7.contains(",")) {
                                                                iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                                Integer.valueOf(strArrSplit2[1]).intValue();
                                                                if (iIntValue2 > 0) {
                                                                    this.e0 = true;
                                                                }
                                                            }
                                                        } catch (Throwable th) {
                                                            th.printStackTrace();
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        try {
                                                            jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                            str14 = str16;
                                                            if (jSONObject3.has(str14)) {
                                                                str15 = str17;
                                                                if (jSONObject3.has(str15)) {
                                                                    this.c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                    this.d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        } catch (Throwable unused5) {
                                                            this.c0 = Double.MIN_VALUE;
                                                            this.d0 = Double.MIN_VALUE;
                                                            return;
                                                        }
                                                    }
                                                    return;
                                                }
                                            } else {
                                                i2 = 2;
                                                str5 = null;
                                            }
                                            if (length > i2) {
                                                try {
                                                    string2 = strArrSplit3[i2];
                                                } catch (Exception e3) {
                                                    exc2 = e3;
                                                    string = null;
                                                    string2 = null;
                                                    str6 = null;
                                                    str7 = null;
                                                    str8 = null;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z3 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str110 = str7;
                                                    str12 = str4;
                                                    string6 = str110;
                                                    if (z3) {
                                                        com.baidu.location.a.C0056a c0056a2 = new com.baidu.location.a.C0056a();
                                                        c0056a2.d(string3);
                                                        c0056a2.e(string4);
                                                        c0056a2.g(str12);
                                                        c0056a2.b(str10);
                                                        c0056a2.c(string6);
                                                        c0056a2.f(string2);
                                                        c0056a2.h(string);
                                                        c0056a2.i(str6);
                                                        c0056a2.a(str11);
                                                        c0056a2.j(string5);
                                                        this.z = c0056a2.a();
                                                        this.t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            n(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                        if (jSONObject2.has("area")) {
                                                            iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                            if (iIntValue == 0) {
                                                                e(2);
                                                            } else if (iIntValue == 1) {
                                                                e(1);
                                                            }
                                                        }
                                                        if (jSONObject2.has("support")) {
                                                            d(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                        }
                                                        if (jSONObject2.has("inbldg")) {
                                                            this.O = jSONObject2.getString("inbldg");
                                                        }
                                                        if (jSONObject2.has("inbldgid")) {
                                                            this.P = jSONObject2.getString("inbldgid");
                                                        }
                                                        if (jSONObject2.has("polygon")) {
                                                            h(jSONObject2.getString("polygon"));
                                                        }
                                                        if (jSONObject2.has("ret_fields")) {
                                                            while (i3 < r5) {
                                                                strArrSplit = str20.split("=");
                                                                if (strArrSplit == null) {
                                                                }
                                                            }
                                                        }
                                                        if (jSONObject2.has("inout_ble")) {
                                                            iOptInt = jSONObject2.optInt("inout_ble");
                                                            c(iOptInt);
                                                            if (iOptInt == 1) {
                                                                b(true);
                                                            } else {
                                                                b(false);
                                                            }
                                                        } else {
                                                            c(-1);
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        b(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z4 = false;
                                                        b(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        i(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        i(1);
                                                    }
                                                    e(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        if (string7.contains(",")) {
                                                            iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                            Integer.valueOf(strArrSplit2[1]).intValue();
                                                            if (iIntValue2 > 0) {
                                                                this.e0 = true;
                                                            }
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                        str14 = str16;
                                                        if (jSONObject3.has(str14)) {
                                                            str15 = str17;
                                                            if (jSONObject3.has(str15)) {
                                                                this.c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                this.d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                string2 = null;
                                            }
                                            if (length > 3) {
                                                try {
                                                    string = strArrSplit3[3];
                                                } catch (Exception e4) {
                                                    exc2 = e4;
                                                    string = null;
                                                    str6 = null;
                                                    str7 = null;
                                                    str8 = null;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z3 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str111 = str7;
                                                    str12 = str4;
                                                    string6 = str111;
                                                    if (z3) {
                                                        com.baidu.location.a.C0056a c0056a3 = new com.baidu.location.a.C0056a();
                                                        c0056a3.d(string3);
                                                        c0056a3.e(string4);
                                                        c0056a3.g(str12);
                                                        c0056a3.b(str10);
                                                        c0056a3.c(string6);
                                                        c0056a3.f(string2);
                                                        c0056a3.h(string);
                                                        c0056a3.i(str6);
                                                        c0056a3.a(str11);
                                                        c0056a3.j(string5);
                                                        this.z = c0056a3.a();
                                                        this.t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            n(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                        if (jSONObject2.has("area")) {
                                                            iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                            if (iIntValue == 0) {
                                                                e(2);
                                                            } else if (iIntValue == 1) {
                                                                e(1);
                                                            }
                                                        }
                                                        if (jSONObject2.has("support")) {
                                                            d(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                        }
                                                        if (jSONObject2.has("inbldg")) {
                                                            this.O = jSONObject2.getString("inbldg");
                                                        }
                                                        if (jSONObject2.has("inbldgid")) {
                                                            this.P = jSONObject2.getString("inbldgid");
                                                        }
                                                        if (jSONObject2.has("polygon")) {
                                                            h(jSONObject2.getString("polygon"));
                                                        }
                                                        if (jSONObject2.has("ret_fields")) {
                                                            while (i3 < r5) {
                                                                strArrSplit = str20.split("=");
                                                                if (strArrSplit == null) {
                                                                }
                                                            }
                                                        }
                                                        if (jSONObject2.has("inout_ble")) {
                                                            iOptInt = jSONObject2.optInt("inout_ble");
                                                            c(iOptInt);
                                                            if (iOptInt == 1) {
                                                                b(true);
                                                            } else {
                                                                b(false);
                                                            }
                                                        } else {
                                                            c(-1);
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        b(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z4 = false;
                                                        b(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        i(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        i(1);
                                                    }
                                                    e(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        if (string7.contains(",")) {
                                                            iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                            Integer.valueOf(strArrSplit2[1]).intValue();
                                                            if (iIntValue2 > 0) {
                                                                this.e0 = true;
                                                            }
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                        str14 = str16;
                                                        if (jSONObject3.has(str14)) {
                                                            str15 = str17;
                                                            if (jSONObject3.has(str15)) {
                                                                this.c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                this.d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                string = null;
                                            }
                                            if (length > 4) {
                                                try {
                                                    str6 = strArrSplit3[4];
                                                } catch (Exception e5) {
                                                    exc2 = e5;
                                                    str6 = null;
                                                    str7 = null;
                                                    str8 = null;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z3 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str112 = str7;
                                                    str12 = str4;
                                                    string6 = str112;
                                                    if (z3) {
                                                        com.baidu.location.a.C0056a c0056a4 = new com.baidu.location.a.C0056a();
                                                        c0056a4.d(string3);
                                                        c0056a4.e(string4);
                                                        c0056a4.g(str12);
                                                        c0056a4.b(str10);
                                                        c0056a4.c(string6);
                                                        c0056a4.f(string2);
                                                        c0056a4.h(string);
                                                        c0056a4.i(str6);
                                                        c0056a4.a(str11);
                                                        c0056a4.j(string5);
                                                        this.z = c0056a4.a();
                                                        this.t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            n(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                        if (jSONObject2.has("area")) {
                                                            iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                            if (iIntValue == 0) {
                                                                e(2);
                                                            } else if (iIntValue == 1) {
                                                                e(1);
                                                            }
                                                        }
                                                        if (jSONObject2.has("support")) {
                                                            d(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                        }
                                                        if (jSONObject2.has("inbldg")) {
                                                            this.O = jSONObject2.getString("inbldg");
                                                        }
                                                        if (jSONObject2.has("inbldgid")) {
                                                            this.P = jSONObject2.getString("inbldgid");
                                                        }
                                                        if (jSONObject2.has("polygon")) {
                                                            h(jSONObject2.getString("polygon"));
                                                        }
                                                        if (jSONObject2.has("ret_fields")) {
                                                            while (i3 < r5) {
                                                                strArrSplit = str20.split("=");
                                                                if (strArrSplit == null) {
                                                                }
                                                            }
                                                        }
                                                        if (jSONObject2.has("inout_ble")) {
                                                            iOptInt = jSONObject2.optInt("inout_ble");
                                                            c(iOptInt);
                                                            if (iOptInt == 1) {
                                                                b(true);
                                                            } else {
                                                                b(false);
                                                            }
                                                        } else {
                                                            c(-1);
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        b(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z4 = false;
                                                        b(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        i(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        i(1);
                                                    }
                                                    e(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        if (string7.contains(",")) {
                                                            iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                            Integer.valueOf(strArrSplit2[1]).intValue();
                                                            if (iIntValue2 > 0) {
                                                                this.e0 = true;
                                                            }
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                        str14 = str16;
                                                        if (jSONObject3.has(str14)) {
                                                            str15 = str17;
                                                            if (jSONObject3.has(str15)) {
                                                                this.c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                this.d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                str6 = null;
                                            }
                                            if (length > 5) {
                                                try {
                                                    str7 = strArrSplit3[5];
                                                } catch (Exception e6) {
                                                    exc2 = e6;
                                                    str7 = null;
                                                    str8 = null;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z3 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str113 = str7;
                                                    str12 = str4;
                                                    string6 = str113;
                                                    if (z3) {
                                                        com.baidu.location.a.C0056a c0056a5 = new com.baidu.location.a.C0056a();
                                                        c0056a5.d(string3);
                                                        c0056a5.e(string4);
                                                        c0056a5.g(str12);
                                                        c0056a5.b(str10);
                                                        c0056a5.c(string6);
                                                        c0056a5.f(string2);
                                                        c0056a5.h(string);
                                                        c0056a5.i(str6);
                                                        c0056a5.a(str11);
                                                        c0056a5.j(string5);
                                                        this.z = c0056a5.a();
                                                        this.t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            n(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                        if (jSONObject2.has("area")) {
                                                            iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                            if (iIntValue == 0) {
                                                                e(2);
                                                            } else if (iIntValue == 1) {
                                                                e(1);
                                                            }
                                                        }
                                                        if (jSONObject2.has("support")) {
                                                            d(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                        }
                                                        if (jSONObject2.has("inbldg")) {
                                                            this.O = jSONObject2.getString("inbldg");
                                                        }
                                                        if (jSONObject2.has("inbldgid")) {
                                                            this.P = jSONObject2.getString("inbldgid");
                                                        }
                                                        if (jSONObject2.has("polygon")) {
                                                            h(jSONObject2.getString("polygon"));
                                                        }
                                                        if (jSONObject2.has("ret_fields")) {
                                                            while (i3 < r5) {
                                                                strArrSplit = str20.split("=");
                                                                if (strArrSplit == null) {
                                                                }
                                                            }
                                                        }
                                                        if (jSONObject2.has("inout_ble")) {
                                                            iOptInt = jSONObject2.optInt("inout_ble");
                                                            c(iOptInt);
                                                            if (iOptInt == 1) {
                                                                b(true);
                                                            } else {
                                                                b(false);
                                                            }
                                                        } else {
                                                            c(-1);
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        b(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z4 = false;
                                                        b(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        i(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        i(1);
                                                    }
                                                    e(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        if (string7.contains(",")) {
                                                            iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                            Integer.valueOf(strArrSplit2[1]).intValue();
                                                            if (iIntValue2 > 0) {
                                                                this.e0 = true;
                                                            }
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                        str14 = str16;
                                                        if (jSONObject3.has(str14)) {
                                                            str15 = str17;
                                                            if (jSONObject3.has(str15)) {
                                                                this.c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                this.d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                str7 = null;
                                            }
                                            if (length > 6) {
                                                try {
                                                    str8 = strArrSplit3[6];
                                                } catch (Exception e7) {
                                                    string = string;
                                                    exc2 = e7;
                                                    str8 = null;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z3 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str114 = str7;
                                                    str12 = str4;
                                                    string6 = str114;
                                                    if (z3) {
                                                        com.baidu.location.a.C0056a c0056a6 = new com.baidu.location.a.C0056a();
                                                        c0056a6.d(string3);
                                                        c0056a6.e(string4);
                                                        c0056a6.g(str12);
                                                        c0056a6.b(str10);
                                                        c0056a6.c(string6);
                                                        c0056a6.f(string2);
                                                        c0056a6.h(string);
                                                        c0056a6.i(str6);
                                                        c0056a6.a(str11);
                                                        c0056a6.j(string5);
                                                        this.z = c0056a6.a();
                                                        this.t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            n(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                        if (jSONObject2.has("area")) {
                                                            iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                            if (iIntValue == 0) {
                                                                e(2);
                                                            } else if (iIntValue == 1) {
                                                                e(1);
                                                            }
                                                        }
                                                        if (jSONObject2.has("support")) {
                                                            d(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                        }
                                                        if (jSONObject2.has("inbldg")) {
                                                            this.O = jSONObject2.getString("inbldg");
                                                        }
                                                        if (jSONObject2.has("inbldgid")) {
                                                            this.P = jSONObject2.getString("inbldgid");
                                                        }
                                                        if (jSONObject2.has("polygon")) {
                                                            h(jSONObject2.getString("polygon"));
                                                        }
                                                        if (jSONObject2.has("ret_fields")) {
                                                            while (i3 < r5) {
                                                                strArrSplit = str20.split("=");
                                                                if (strArrSplit == null) {
                                                                }
                                                            }
                                                        }
                                                        if (jSONObject2.has("inout_ble")) {
                                                            iOptInt = jSONObject2.optInt("inout_ble");
                                                            c(iOptInt);
                                                            if (iOptInt == 1) {
                                                                b(true);
                                                            } else {
                                                                b(false);
                                                            }
                                                        } else {
                                                            c(-1);
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        b(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z4 = false;
                                                        b(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        i(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        i(1);
                                                    }
                                                    e(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        if (string7.contains(",")) {
                                                            iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                            Integer.valueOf(strArrSplit2[1]).intValue();
                                                            if (iIntValue2 > 0) {
                                                                this.e0 = true;
                                                            }
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                        str14 = str16;
                                                        if (jSONObject3.has(str14)) {
                                                            str15 = str17;
                                                            if (jSONObject3.has(str15)) {
                                                                this.c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                this.d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                str8 = null;
                                            }
                                            if (length > 7) {
                                                try {
                                                    str9 = strArrSplit3[7];
                                                } catch (Exception e8) {
                                                    string = string;
                                                    exc2 = e8;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z3 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str115 = str7;
                                                    str12 = str4;
                                                    string6 = str115;
                                                    if (z3) {
                                                        com.baidu.location.a.C0056a c0056a7 = new com.baidu.location.a.C0056a();
                                                        c0056a7.d(string3);
                                                        c0056a7.e(string4);
                                                        c0056a7.g(str12);
                                                        c0056a7.b(str10);
                                                        c0056a7.c(string6);
                                                        c0056a7.f(string2);
                                                        c0056a7.h(string);
                                                        c0056a7.i(str6);
                                                        c0056a7.a(str11);
                                                        c0056a7.j(string5);
                                                        this.z = c0056a7.a();
                                                        this.t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            n(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                        if (jSONObject2.has("area")) {
                                                            iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                            if (iIntValue == 0) {
                                                                e(2);
                                                            } else if (iIntValue == 1) {
                                                                e(1);
                                                            }
                                                        }
                                                        if (jSONObject2.has("support")) {
                                                            d(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                        }
                                                        if (jSONObject2.has("inbldg")) {
                                                            this.O = jSONObject2.getString("inbldg");
                                                        }
                                                        if (jSONObject2.has("inbldgid")) {
                                                            this.P = jSONObject2.getString("inbldgid");
                                                        }
                                                        if (jSONObject2.has("polygon")) {
                                                            h(jSONObject2.getString("polygon"));
                                                        }
                                                        if (jSONObject2.has("ret_fields")) {
                                                            while (i3 < r5) {
                                                                strArrSplit = str20.split("=");
                                                                if (strArrSplit == null) {
                                                                }
                                                            }
                                                        }
                                                        if (jSONObject2.has("inout_ble")) {
                                                            iOptInt = jSONObject2.optInt("inout_ble");
                                                            c(iOptInt);
                                                            if (iOptInt == 1) {
                                                                b(true);
                                                            } else {
                                                                b(false);
                                                            }
                                                        } else {
                                                            c(-1);
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        b(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z4 = false;
                                                        b(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        i(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        i(1);
                                                    }
                                                    e(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        if (string7.contains(",")) {
                                                            iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                            Integer.valueOf(strArrSplit2[1]).intValue();
                                                            if (iIntValue2 > 0) {
                                                                this.e0 = true;
                                                            }
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                        str14 = str16;
                                                        if (jSONObject3.has(str14)) {
                                                            str15 = str17;
                                                            if (jSONObject3.has(str15)) {
                                                                this.c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                this.d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                str9 = null;
                                            }
                                            if (length > 8) {
                                                try {
                                                    str13 = strArrSplit3[8];
                                                } catch (Exception e9) {
                                                    string = string;
                                                    exc2 = e9;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z3 = false;
                                                }
                                            } else {
                                                str13 = null;
                                            }
                                            string = string;
                                            str10 = str5;
                                            string3 = str8;
                                            z3 = true;
                                            str11 = str13;
                                            string4 = str9;
                                        } catch (Exception e10) {
                                            exc2 = e10;
                                            string = null;
                                            str4 = null;
                                        }
                                        str16 = "x";
                                        string5 = null;
                                        String str116 = str7;
                                        str12 = str4;
                                        string6 = str116;
                                    }
                                    if (z3) {
                                        com.baidu.location.a.C0056a c0056a8 = new com.baidu.location.a.C0056a();
                                        c0056a8.d(string3);
                                        c0056a8.e(string4);
                                        c0056a8.g(str12);
                                        c0056a8.b(str10);
                                        c0056a8.c(string6);
                                        c0056a8.f(string2);
                                        c0056a8.h(string);
                                        c0056a8.i(str6);
                                        c0056a8.a(str11);
                                        c0056a8.j(string5);
                                        this.z = c0056a8.a();
                                        this.t = true;
                                    }
                                } else {
                                    str16 = "x";
                                    str17 = "y";
                                    z4 = false;
                                    try {
                                        this.t = false;
                                        b((String) null);
                                    } catch (Exception e11) {
                                        e = e11;
                                        z = z4;
                                        exc = e;
                                        z2 = z;
                                        exc.printStackTrace();
                                        r2 = z2;
                                        this.f1355b = r2;
                                        this.t = r2;
                                    }
                                }
                                if (jSONObject8.has("floor")) {
                                    string13 = jSONObject8.getString("floor");
                                    this.A = string13;
                                    if (TextUtils.isEmpty(string13)) {
                                        this.A = null;
                                    }
                                }
                                if (jSONObject8.has("indoor")) {
                                    string12 = jSONObject8.getString("indoor");
                                    if (!TextUtils.isEmpty(string12)) {
                                        n(Integer.valueOf(string12).intValue());
                                    }
                                }
                                if (jSONObject8.has("loctp")) {
                                    string11 = jSONObject8.getString("loctp");
                                    this.H = string11;
                                    if (TextUtils.isEmpty(string11)) {
                                        this.H = null;
                                    }
                                }
                                if (jSONObject8.has("bldgid")) {
                                    string10 = jSONObject8.getString("bldgid");
                                    this.B = string10;
                                    if (TextUtils.isEmpty(string10)) {
                                        this.B = null;
                                    }
                                }
                                if (jSONObject8.has("bldg")) {
                                    string9 = jSONObject8.getString("bldg");
                                    this.C = string9;
                                    if (TextUtils.isEmpty(string9)) {
                                        this.C = null;
                                    }
                                }
                                if (jSONObject8.has("acc")) {
                                    this.D = jSONObject8.getDouble("acc");
                                }
                                if (jSONObject8.has("ibav")) {
                                    string8 = jSONObject8.getString("ibav");
                                    if (TextUtils.isEmpty(string8) && !string8.equals("0")) {
                                        this.F = Integer.valueOf(string8).intValue();
                                    } else {
                                        this.F = 0;
                                    }
                                }
                                if (jSONObject8.has("indoorflags")) {
                                    jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                    if (jSONObject2.has("area")) {
                                        iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                        if (iIntValue == 0) {
                                            e(2);
                                        } else if (iIntValue == 1) {
                                            e(1);
                                        }
                                    }
                                    if (jSONObject2.has("support")) {
                                        d(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                    }
                                    if (jSONObject2.has("inbldg")) {
                                        this.O = jSONObject2.getString("inbldg");
                                    }
                                    if (jSONObject2.has("inbldgid")) {
                                        this.P = jSONObject2.getString("inbldgid");
                                    }
                                    if (jSONObject2.has("polygon")) {
                                        h(jSONObject2.getString("polygon"));
                                    }
                                    if (jSONObject2.has("ret_fields")) {
                                        while (i3 < r5) {
                                            strArrSplit = str20.split("=");
                                            if (strArrSplit == null && strArrSplit.length >= 2) {
                                                this.W.putString(strArrSplit[0], strArrSplit[1]);
                                            }
                                        }
                                    }
                                    if (jSONObject2.has("inout_ble")) {
                                        iOptInt = jSONObject2.optInt("inout_ble");
                                        c(iOptInt);
                                        if (iOptInt == 1) {
                                            b(true);
                                        } else {
                                            b(false);
                                        }
                                    } else {
                                        c(-1);
                                    }
                                }
                                if (jSONObject8.has("gpscs")) {
                                    b(jSONObject8.getInt("gpscs"));
                                } else {
                                    z4 = false;
                                    b(0);
                                }
                                try {
                                    if (jSONObject8.has("in_cn")) {
                                        i(Integer.parseInt(jSONObject8.getString("in_cn")));
                                    } else {
                                        i(1);
                                    }
                                } catch (Exception unused6) {
                                }
                                e(this.G == 0 ? "wgs84" : "gcj02");
                                if (jSONObject8.has("navi")) {
                                    this.a0 = jSONObject8.getString("navi");
                                }
                                if (jSONObject8.has("navi_client") && (string7 = jSONObject8.getString("navi_client")) != null) {
                                    if (string7.contains(",") && (strArrSplit2 = string7.split(",")) != null && strArrSplit2.length >= 2) {
                                        iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                        Integer.valueOf(strArrSplit2[1]).intValue();
                                        if (iIntValue2 > 0) {
                                            this.e0 = true;
                                        }
                                    }
                                }
                                if (jSONObject8.has("nrl_point")) {
                                    jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                    str14 = str16;
                                    if (jSONObject3.has(str14)) {
                                        str15 = str17;
                                        if (jSONObject3.has(str15)) {
                                            this.c0 = Double.parseDouble(jSONObject3.getString(str15));
                                            this.d0 = Double.parseDouble(jSONObject3.getString(str14));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (i4 != 66 && i4 != 68) {
                                if (i4 == 167) {
                                    i(2);
                                    return;
                                }
                                return;
                            }
                            JSONObject jSONObject13 = jSONObject4.getJSONObject("content");
                            JSONObject jSONObject14 = jSONObject13.getJSONObject("point");
                            c(Double.parseDouble(jSONObject14.getString("y")));
                            d(Double.parseDouble(jSONObject14.getString("x")));
                            b(Float.parseFloat(jSONObject13.getString("radius")));
                            a(Boolean.valueOf(Boolean.parseBoolean(jSONObject13.getString("isCellChanged"))));
                        }
                        e(str2);
                    } catch (Exception e12) {
                        exc = e12;
                        z2 = false;
                        exc.printStackTrace();
                        r2 = z2;
                        this.f1355b = r2;
                        this.t = r2;
                    }
                } catch (Exception e13) {
                    exc = e13;
                    z2 = false;
                }
            } catch (Error e14) {
                e14.printStackTrace();
                r2 = 0;
                this.f1355b = r2;
                this.t = r2;
            }
        } catch (Exception e15) {
            e = e15;
            z = false;
        }
    }

    public int A() {
        this.p = true;
        return this.q;
    }

    public float B() {
        return this.i;
    }

    public String C() {
        return this.f1356c;
    }

    public long D() {
        return this.n0;
    }

    public String E() {
        return this.l;
    }

    public int F() {
        return this.K;
    }

    public boolean G() {
        return this.t;
    }

    public boolean H() {
        return this.f;
    }

    public boolean I() {
        return this.e0;
    }

    public int J() {
        return this.F;
    }

    public double a() {
        return this.D;
    }

    public String a(String str) {
        return this.W.getString(str);
    }

    public void a(double d) {
        if (d < 9999.0d) {
            this.g = d;
            this.f = true;
        }
    }

    public void a(float f) {
        this.r = f;
    }

    public void a(float f, float f2, String str, String str2) {
        String str3 = ((double) f) > 0.001d ? String.format("%.2f", Float.valueOf(f)) : "";
        String str4 = ((double) f2) > 0.001d ? String.format("%.2f", Float.valueOf(f2)) : "";
        String str5 = null;
        String str6 = this.a0;
        if (str6 != null) {
            Locale locale = Locale.US;
            String str7 = String.format(locale, "%s|%s,%s", str6, str3, str4);
            String str8 = this.b0;
            str5 = str8 != null ? String.format(locale, "%s|%s", str7, str8) : str7;
        }
        if (str == null) {
            str = str5;
        } else if (str5 != null) {
            str = String.format(Locale.US, "%s|%s", str5, str);
        }
        if (str2 == null) {
            str2 = str;
        } else if (str != null) {
            str2 = String.format(Locale.US, "%s|%s", str, str2);
        }
        this.V = str2;
    }

    @Deprecated
    public void a(int i) {
        this.X = i;
    }

    public void a(long j) {
        this.Z = j;
    }

    public void a(Bundle bundle) {
        this.l0 = bundle == null ? null : new Bundle(bundle);
    }

    public void a(com.baidu.location.a aVar) {
        if (aVar != null) {
            this.z = aVar;
            this.t = true;
        }
    }

    public void a(c cVar) {
        if (u() > 0) {
            this.k0 = cVar;
        }
    }

    public void a(k kVar) {
        this.f0 = kVar;
    }

    public final void a(Boolean bool) {
        this.y = bool.booleanValue();
    }

    public void a(String str, double[] dArr) {
        if (this.W == null) {
            this.W = new Bundle();
        }
        this.W.putDoubleArray(str, dArr);
    }

    public void a(List<j> list) {
        this.S = list;
    }

    public void a(boolean z) {
        this.E = z;
    }

    public String b() {
        return this.z.i;
    }

    public void b(double d) {
        this.h0 = d;
    }

    public void b(float f) {
        this.k = f;
        this.j = true;
    }

    @Deprecated
    public void b(int i) {
        this.Y = i;
    }

    public void b(String str) {
        this.u = str;
        this.t = str != null;
    }

    public void b(boolean z) {
        this.e0 = z;
    }

    public com.baidu.location.a c() {
        return this.z;
    }

    public void c(double d) {
        this.d = d;
    }

    public void c(float f) {
        this.i = f;
        this.h = true;
    }

    public void c(int i) {
        this.R = i;
    }

    public void c(String str) {
        this.B = str;
    }

    public double d() {
        return this.g;
    }

    public void d(double d) {
        this.e = d;
    }

    public void d(float f) {
        this.m = f;
    }

    public void d(int i) {
        this.N = i;
    }

    public void d(String str) {
        this.C = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.B;
    }

    public void e(float f) {
        this.o = f;
    }

    public void e(int i) {
        this.L = i;
    }

    public void e(String str) {
        this.s = str;
    }

    public String f() {
        return this.C;
    }

    public void f(int i) {
        this.M = i;
    }

    public void f(String str) {
        this.A = str;
    }

    public String g() {
        return this.z.e;
    }

    public void g(int i) {
        this.n = i;
    }

    public void g(String str) {
        this.m0 = str;
    }

    public String h() {
        return this.s;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    public void h(int i) {
        String str;
        this.f1355b = i;
        if (i == 66) {
            str = "Offline location successful!";
        } else if (i == 67) {
            str = "Offline location failed, please check the net (wifi/cell)!";
        } else if (i == 167) {
            str = "NetWork location failed because baidu location service can not caculate the location!";
        } else if (i != 505) {
            switch (i) {
                case 61:
                    i("GPS location successful!");
                    n(0);
                    g("system");
                    return;
                case 62:
                    str = "Location failed beacuse we can not get any loc information!";
                    break;
                case 63:
                    str = "Offline location failed, please check the net (wifi/cell)!";
                    break;
                default:
                    switch (i) {
                        case 69:
                            str = "Location failed because the location service switch is not on";
                            break;
                        case 70:
                            str = "Location failed because the location permission is not enabled";
                            break;
                        case 71:
                            str = "Location failed because the location service switch is not on and the location permission is not enabled";
                            break;
                        default:
                            switch (i) {
                                case 160:
                                    str = "Coarse location successful";
                                    break;
                                case 161:
                                    str = "NetWork location successful!";
                                    break;
                                case 162:
                                    str = "NetWork location failed because baidu location service can not decrypt the request query, please check the so file !";
                                    break;
                                default:
                                    str = "UnKnown!";
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            str = "NetWork location failed because baidu location service check the key is unlegal, please check the key in AndroidManifest.xml !";
        }
        i(str);
    }

    public void h(String str) {
        this.Q = str;
    }

    public float i() {
        return this.r;
    }

    public void i(int i) {
        this.G = i;
    }

    public void i(String str) {
        this.T = str;
    }

    public Bundle j() {
        return this.l0;
    }

    @Deprecated
    public void j(int i) {
        this.j0 = i;
    }

    public void j(String str) {
        this.v = str;
    }

    public String k() {
        return this.A;
    }

    @Deprecated
    public void k(int i) {
        this.i0 = i;
    }

    public void k(String str) {
        this.U = str;
    }

    @Deprecated
    public float l() {
        return this.g0;
    }

    public void l(int i) {
        this.F = i;
    }

    public void l(String str) {
        this.H = str;
    }

    public int m() {
        return this.R;
    }

    public void m(int i) {
        this.q = i;
    }

    public void m(String str) {
        this.a0 = str;
    }

    public String n() {
        return this.P;
    }

    public void n(int i) {
        this.K = i;
    }

    public void n(String str) {
        this.f1356c = str;
        k(a.a.a.i.i.b(str));
    }

    public String o() {
        return this.O;
    }

    public void o(String str) {
        this.l = str;
    }

    public String p() {
        return this.Q;
    }

    public double q() {
        return this.d;
    }

    public int r() {
        return this.f1355b;
    }

    public String s() {
        return this.v;
    }

    public double t() {
        return this.e;
    }

    public String toString() {
        return "&loctype=" + r() + "&lat=" + q() + "&lon=" + t() + "&radius=" + z() + "&biasprob=" + l() + "&altitude=" + d() + "&speed=" + B() + "&time=" + D() + "&extrainfo=" + j();
    }

    @Deprecated
    public int u() {
        return this.i0;
    }

    public String v() {
        return this.H;
    }

    public String w() {
        return this.a0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1355b);
        parcel.writeString(this.f1356c);
        parcel.writeLong(this.n0);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.g);
        parcel.writeFloat(this.i);
        parcel.writeFloat(this.k);
        parcel.writeString(this.l);
        parcel.writeFloat(this.m);
        parcel.writeInt(this.n);
        parcel.writeFloat(this.o);
        parcel.writeInt(this.q);
        parcel.writeFloat(this.r);
        parcel.writeString(this.A);
        parcel.writeInt(this.F);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeDouble(this.D);
        parcel.writeString(this.H);
        parcel.writeString(this.z.f1351c);
        parcel.writeString(this.z.d);
        parcel.writeString(this.z.f);
        parcel.writeString(this.z.g);
        parcel.writeString(this.z.h);
        parcel.writeString(this.z.e);
        parcel.writeString(this.z.i);
        parcel.writeString(this.z.f1349a);
        parcel.writeString(this.z.f1350b);
        parcel.writeString(this.z.j);
        parcel.writeString(this.z.k);
        parcel.writeInt(this.I);
        parcel.writeString(this.J);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.G);
        parcel.writeString(this.T);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeInt(this.M);
        parcel.writeInt(this.N);
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.X);
        parcel.writeString(this.U);
        parcel.writeInt(this.Y);
        parcel.writeString(this.V);
        parcel.writeString(this.a0);
        parcel.writeString(this.b0);
        parcel.writeLong(this.Z);
        parcel.writeDouble(this.c0);
        parcel.writeDouble(this.d0);
        parcel.writeFloat(this.g0);
        parcel.writeDouble(this.h0);
        parcel.writeInt(this.i0);
        parcel.writeInt(this.j0);
        parcel.writeString(this.s);
        parcel.writeString(this.m0);
        parcel.writeParcelable(this.k0, i);
        parcel.writeBooleanArray(new boolean[]{this.f, this.h, this.j, this.p, this.t, this.y, this.E, this.e0});
        parcel.writeList(this.S);
        parcel.writeBundle(this.W);
        parcel.writeBundle(this.l0);
        parcel.writeParcelable(this.f0, i);
    }

    public List<j> x() {
        return this.S;
    }

    public k y() {
        return this.f0;
    }

    public float z() {
        return this.k;
    }
}
