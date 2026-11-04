package a.a.a.b;

import android.annotation.TargetApi;
import android.location.GnssNavigationMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double[] f69c = {1999.0d, 8.0d, 22.0d, 0.0d, 0.0d, 0.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, c> f70a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, String> f71b = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static s f72a = new s();
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f74b = 0.0d;

        public b(s sVar) {
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f75a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f76b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f77c;
        public int d;
        public int e;
        public ArrayList<String> f;
        public ArrayList<Integer> g;
        public int h;
        public double i;
        public double j;
        public double k;
        public int l;
        public b m;

        public c(int i, int i2) {
            a(i, i2);
            this.h = 0;
            this.i = 0.0d;
            this.j = 0.0d;
            this.k = 0.0d;
            this.l = 0;
            this.m = new b(s.this);
        }

        public final b a(int i, double d) {
            b bVarA = a(s.f69c);
            if (d < -1.0E9d || 1.0E9d < d) {
                d = 0.0d;
            }
            int i2 = (int) d;
            bVarA.f73a += (i * 604800) + i2;
            bVarA.f74b = d - ((double) i2);
            return bVarA;
        }

        public final b a(double[] dArr) {
            int[] iArr = {1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
            b bVar = new b(s.this);
            int i = 0;
            int i2 = (int) dArr[0];
            int i3 = (int) dArr[1];
            int i4 = (int) dArr[2];
            if (i2 >= 1970 && 2099 >= i2 && i3 >= 1 && 12 >= i3) {
                int i5 = (((((i2 - 1970) * 365) + ((i2 - 1969) / 4)) + iArr[i3 - 1]) + i4) - 2;
                if (i2 % 4 == 0 && i3 >= 3) {
                    i = 1;
                }
                int iFloor = (int) Math.floor(dArr[5]);
                bVar.f73a = ((i5 + i) * 86400) + (((int) dArr[3]) * 3600) + (((int) dArr[4]) * 60) + iFloor;
                bVar.f74b = dArr[5] - ((double) iFloor);
            }
            return bVar;
        }

        @TargetApi(24)
        public final String a(GnssNavigationMessage gnssNavigationMessage) {
            StringBuilder sb = new StringBuilder();
            for (byte b2 : gnssNavigationMessage.getData()) {
                sb.append(String.format("%8s", Integer.toBinaryString(b2 & 255)).replace(' ', '0'));
            }
            return sb.toString();
        }

        public final void a() {
            boolean z;
            if (this.f.size() == 0) {
                z = false;
                break;
            }
            int i = 0;
            while (true) {
                if (i >= this.f.size()) {
                    z = true;
                    break;
                } else {
                    if (this.f.get(i).contains("None")) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            if (z) {
                this.f76b = true;
            } else {
                this.f76b = false;
            }
        }

        public final void a(int i, int i2) {
            int i3;
            int i4 = this.e;
            if (i4 == 257 || i4 == 769) {
                i3 = 5;
            } else if (i4 == 1537) {
                i3 = 6;
            } else if (i4 != 1281) {
                i3 = i4 != 1282 ? 0 : 10;
            } else {
                i3 = 3;
            }
            ArrayList<String> arrayList = this.f;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                this.f = new ArrayList<>();
            }
            ArrayList<Integer> arrayList2 = this.g;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                this.g = new ArrayList<>();
            }
            for (int i5 = 0; i5 < i3; i5++) {
                this.f.add("None");
            }
            this.d = i;
            this.e = i2;
            this.f75a = false;
            this.f76b = false;
            this.f77c = 0L;
        }

        @TargetApi(24)
        public final void a(GnssNavigationMessage gnssNavigationMessage, long j) {
            int type = gnssNavigationMessage.getType();
            int svid = gnssNavigationMessage.getSvid();
            int submessageId = gnssNavigationMessage.getSubmessageId();
            byte[] data = gnssNavigationMessage.getData();
            if (j - this.f77c > 1200 || this.f75a || this.f.size() == 0 || type != this.e || svid != this.d) {
                a(svid, type);
            }
            if ((type == 1282 || type == 1281) && !b()) {
                a(svid, type);
            }
            if (this.f.size() == 0) {
                return;
            }
            int i = this.e;
            boolean z = true;
            int i2 = i == 1537 ? 0 : 1;
            if (i == 1282) {
                if (submessageId != 1) {
                    return;
                }
                a(b(gnssNavigationMessage));
                submessageId = this.l;
            }
            int i3 = submessageId - i2;
            if (i3 >= this.f.size()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (byte b2 : data) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append((int) b2);
            }
            this.f.set(i3, sb.toString());
            if (type == 1281 || type == 1282) {
                this.g.add(Integer.valueOf(i3));
            }
            if (this.e == 1537) {
                b(a(gnssNavigationMessage));
            }
            a();
            this.f77c = j;
        }

        public final void a(String str) {
            this.l = Integer.parseInt(str.substring(42, 46), 2);
        }

        @TargetApi(24)
        public final String b(GnssNavigationMessage gnssNavigationMessage) {
            StringBuilder sb = new StringBuilder();
            byte[] data = gnssNavigationMessage.getData();
            int length = data.length;
            for (int i = 0; i < length; i++) {
                String strReplace = String.format("%8s", Integer.toBinaryString(data[i] & 255)).replace(' ', '0');
                if (i % 4 == 0) {
                    strReplace = strReplace.substring(2, 8);
                }
                sb.append(strReplace);
            }
            return sb.toString();
        }

        public final void b(String str) {
            StringBuilder sb;
            int i;
            char cCharAt = str.charAt(0);
            char cCharAt2 = str.charAt(android.support.constraint.k.AppCompatTheme_windowNoTitle);
            if (cCharAt == '1' && cCharAt2 == '0') {
                sb = new StringBuilder();
                sb.append(str.substring(2, 18));
                i = 234;
            } else {
                if (cCharAt != '0' || cCharAt2 != '1') {
                    return;
                }
                sb = new StringBuilder();
                sb.append(str.substring(2, android.support.constraint.k.AppCompatTheme_windowFixedHeightMajor));
                i = 138;
            }
            sb.append(str.substring(122, i));
            String string = sb.toString();
            int i2 = Integer.parseInt(string.substring(0, 6), 2);
            if (i2 == 0) {
                e(string);
            } else if (i2 == 1) {
                d(string);
            } else if (i2 == 4) {
                c(string);
            }
        }

        public final boolean b() {
            if (this.g == null) {
                return false;
            }
            for (int i = 0; i < this.g.size(); i++) {
                if (this.g.get(i).intValue() != i) {
                    return false;
                }
            }
            return true;
        }

        public final String c() {
            StringBuilder sb = new StringBuilder();
            if (!this.f76b) {
                return sb.toString();
            }
            if (this.e == 1537) {
                d();
            }
            sb.append(this.m.f73a);
            sb.append('|');
            boolean z = true;
            for (int i = 0; i < this.f.size(); i++) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(this.f.get(i));
            }
            this.f75a = true;
            return sb.toString();
        }

        public final void c(String str) {
            this.k = Long.parseLong(str.substring(54, 68), 2) * 60;
        }

        public final void d() {
            int i;
            b bVarA = a(this.h, this.i);
            b bVarA2 = a(this.h, this.j);
            double d = (((double) (bVarA2.f73a - bVarA.f73a)) + bVarA2.f74b) - bVarA.f74b;
            if (d <= 302400.0d) {
                if (d < -302400.0d) {
                    i = this.h + 1;
                }
                this.m = a(this.h, this.k);
            }
            i = this.h - 1;
            this.h = i;
            this.m = a(this.h, this.k);
        }

        public final void d(String str) {
            this.j = Long.parseLong(str.substring(16, 30), 2) * 60.0d;
        }

        public final void e(String str) {
            this.h = Integer.parseInt(str.substring(96, 108), 2);
            this.i = Long.parseLong(str.substring(108, 128), 2);
        }
    }

    public static s c() {
        return a.f72a;
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, c> entry : this.f70a.entrySet()) {
            String key = entry.getKey();
            String strC = entry.getValue().c();
            if (strC != null && strC.length() != 0) {
                if (this.f71b.containsKey(key)) {
                    if (strC.substring(0, 100).equals(this.f71b.get(key).substring(0, 100))) {
                    }
                } else {
                    this.f71b.put(key, strC);
                }
                arrayList.add(key + '|' + strC);
            }
        }
        return arrayList;
    }

    @TargetApi(24)
    public void a(GnssNavigationMessage gnssNavigationMessage, long j) {
        String str;
        HashMap<String, c> map;
        int svid = gnssNavigationMessage.getSvid();
        int type = gnssNavigationMessage.getType();
        if (type == 257) {
            str = "G";
        } else if (type == 769) {
            str = "R";
        } else if (type == 1537) {
            str = "E";
        } else if (type != 1281) {
            str = type != 1282 ? "none" : "CT";
        } else {
            str = "CO";
        }
        String str2 = str + svid;
        if (str2.contains("none") || (map = this.f70a) == null) {
            return;
        }
        if (!map.containsKey(str2)) {
            this.f70a.put(str2, new c(svid, type));
        }
        this.f70a.get(str2).a(gnssNavigationMessage, j);
    }
}
