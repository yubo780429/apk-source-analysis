package a.a.a.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.util.Base64;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f18a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Deque<String> f20c = new LinkedList();
    public Deque<String> d = new LinkedList();
    public Deque<String> e = new LinkedList();
    public int f = 5;
    public int g = 5;
    public int h = 1;
    public int i = 1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static f f21a = new f();
    }

    public static f c() {
        return a.f21a;
    }

    public synchronized String a() {
        return a(this.i, this.h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public final String a(int i, int i2) {
        String str;
        if (i == 1) {
            String strB = b(this.e);
            if ("".equals(strB)) {
                str = "";
            } else {
                str = "&ll_pre=" + strB;
            }
        } else {
            str = "";
        }
        if (i2 != 1) {
            return str;
        }
        String strA = a(this.f20c);
        if (!"".equals(strA)) {
            str = str + "&cl_pre=" + strA;
        }
        String strA2 = a(this.d);
        if ("".equals(strA2)) {
            return str;
        }
        return str + "&wf_pre=" + strA2;
    }

    public final String a(Deque<String> deque) {
        if (deque == null || deque.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String strPeekFirst = deque.peekFirst();
        if (strPeekFirst != null) {
            try {
                String[] strArrSplit = strPeekFirst.split(",");
                int i = 0;
                for (String str : deque) {
                    if (strArrSplit.length != 3) {
                        break;
                    }
                    String[] strArrSplit2 = str.split(",");
                    if (i == 0) {
                        sb.append(strPeekFirst);
                    } else {
                        if (strArrSplit2.length == 3) {
                            try {
                                sb.append((int) ((Double.parseDouble(strArrSplit[0]) - Double.parseDouble(strArrSplit2[0])) * Math.pow(10.0d, 6.0d)));
                                sb.append(",");
                                sb.append((int) ((Double.parseDouble(strArrSplit[1]) - Double.parseDouble(strArrSplit2[1])) * Math.pow(10.0d, 6.0d)));
                                sb.append(",");
                                sb.append(Long.parseLong(strArrSplit[2]) - Long.parseLong(strArrSplit2[2]));
                            } catch (Exception unused) {
                            }
                        }
                        i++;
                    }
                    if (i != deque.size() - 1) {
                        sb.append("|");
                    }
                    i++;
                }
            } catch (Exception unused2) {
            }
        }
        return sb.toString();
    }

    public void a(Context context) {
        if (this.f18a == null) {
            this.f18a = r.a().a(context);
        }
        SharedPreferences sharedPreferences = this.f18a;
        if (sharedPreferences == null || this.f19b) {
            return;
        }
        try {
            String string = sharedPreferences.getString("cl_pre", "");
            String string2 = this.f18a.getString("wf_pre", "");
            String string3 = this.f18a.getString("ll_pre", "");
            b(string, this.f20c);
            b(string2, this.d);
            a(string3, this.e);
        } catch (Exception unused) {
        }
        this.f19b = true;
    }

    public synchronized void a(com.baidu.location.c cVar, String str, Location location) {
        Deque<String> deque;
        String str2;
        if (cVar != null) {
            if ("gcj02".equals(str)) {
                String strV = cVar.v();
                int iR = cVar.r();
                if (iR == 61 || iR == 161) {
                    if (strV == null) {
                        strV = "null";
                    }
                    try {
                        if (!strV.contains("wf") || this.h != 1) {
                            if (strV.contains("cl") && this.h == 1) {
                                this.f20c.offerFirst(cVar.t() + "," + cVar.q() + "," + a.a.a.i.i.a(cVar.C()));
                                deque = this.f20c;
                                str2 = "cl";
                            } else if (iR == 61 && this.i == 1 && location != null) {
                                int iZ = (int) cVar.z();
                                DecimalFormat decimalFormat = new DecimalFormat("0.00");
                                DecimalFormat decimalFormat2 = new DecimalFormat("0.0");
                                DecimalFormat decimalFormat3 = new DecimalFormat("0.000000");
                                this.e.offerFirst(cVar.A() + "," + iZ + "," + decimalFormat.format(cVar.d()) + "," + a.a.a.i.i.a(cVar.C()) + "," + decimalFormat2.format(cVar.B()) + "," + decimalFormat3.format(location.getLongitude()) + "," + decimalFormat3.format(location.getLatitude()));
                                c(this.e);
                            }
                        }
                        this.d.offerFirst(cVar.t() + "," + cVar.q() + "," + a.a.a.i.i.a(cVar.C()));
                        deque = this.d;
                        str2 = "wf";
                        a(deque, str2);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public final void a(String str, Deque<String> deque) {
        if (str == null || "".equals(str)) {
            return;
        }
        deque.addAll(Arrays.asList(new String(Base64.decode(str.getBytes(), 0)).split("\\|")));
    }

    public final void a(Deque<String> deque, String str) {
        if (deque == null || deque.isEmpty()) {
            return;
        }
        while (deque.size() > this.f) {
            deque.pollLast();
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = deque.iterator();
        int i = 0;
        while (it.hasNext()) {
            sb.append(it.next());
            if (i != deque.size() - 1) {
                sb.append("|");
            }
            i++;
        }
        try {
            String str2 = new String(Base64.encode(sb.toString().getBytes(), 0));
            SharedPreferences.Editor editorEdit = this.f18a.edit();
            editorEdit.putString(str + "_pre", str2);
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }

    public String b() {
        return a(this.i, this.h);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0103 A[Catch: Exception -> 0x010d, TRY_LEAVE, TryCatch #1 {Exception -> 0x010d, blocks: (B:9:0x0019, B:10:0x0023, B:12:0x0029, B:15:0x0035, B:17:0x003c, B:25:0x00fc, B:27:0x0103, B:19:0x0042), top: B:38:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0108 A[SYNTHETIC] */
    public final String b(Deque<String> deque) {
        int i;
        if (deque == null || deque.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String strPeekFirst = deque.peekFirst();
        if (strPeekFirst != null) {
            try {
                String[] strArrSplit = strPeekFirst.split(",");
                char c2 = 0;
                int i2 = 0;
                for (String str : deque) {
                    if (strArrSplit.length != 7) {
                        break;
                    }
                    String[] strArrSplit2 = str.split(",");
                    if (i2 == 0) {
                        sb.append(strPeekFirst);
                    } else {
                        if (strArrSplit2.length != 7) {
                            i = i2;
                        } else {
                            try {
                                sb.append(Integer.parseInt(strArrSplit[c2]) - Integer.parseInt(strArrSplit2[c2]));
                                sb.append(",");
                                sb.append(Integer.parseInt(strArrSplit[1]) - Integer.parseInt(strArrSplit2[1]));
                                sb.append(",");
                                sb.append(new BigDecimal(strArrSplit[2]).subtract(new BigDecimal(strArrSplit2[2])));
                                sb.append(",");
                                sb.append(Long.parseLong(strArrSplit[3]) - Long.parseLong(strArrSplit2[3]));
                                sb.append(",");
                                sb.append(new BigDecimal(strArrSplit[4]).subtract(new BigDecimal(strArrSplit2[4])));
                                sb.append(",");
                                double dDoubleValue = new BigDecimal(strArrSplit[5]).subtract(new BigDecimal(strArrSplit2[5])).doubleValue();
                                double dDoubleValue2 = new BigDecimal(strArrSplit[6]).subtract(new BigDecimal(strArrSplit2[6])).doubleValue();
                                i = i2;
                                try {
                                    sb.append((int) (dDoubleValue * Math.pow(10.0d, 6.0d)));
                                    sb.append(",");
                                    sb.append((int) (dDoubleValue2 * Math.pow(10.0d, 6.0d)));
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                i = i2;
                            }
                            if (i != deque.size() - 1) {
                                sb.append("|");
                            }
                        }
                        i2 = i + 1;
                        c2 = 0;
                    }
                    i = i2;
                    if (i != deque.size() - 1) {
                        sb.append("|");
                    }
                    i2 = i + 1;
                    c2 = 0;
                }
            } catch (Exception unused3) {
            }
        }
        return sb.toString();
    }

    public final void b(String str, Deque<String> deque) {
        if (str == null || "".equals(str)) {
            return;
        }
        deque.addAll(Arrays.asList(new String(Base64.decode(str.getBytes(), 0)).split("\\|")));
    }

    public final void c(Deque<String> deque) {
        if (deque == null || deque.isEmpty()) {
            return;
        }
        while (deque.size() > this.g) {
            deque.pollLast();
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = deque.iterator();
        int i = 0;
        while (it.hasNext()) {
            sb.append(it.next());
            if (i != deque.size() - 1) {
                sb.append("|");
            }
            i++;
        }
        try {
            String str = new String(Base64.encode(sb.toString().getBytes(), 0));
            SharedPreferences.Editor editorEdit = this.f18a.edit();
            editorEdit.putString("ll_pre", str);
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }
}
