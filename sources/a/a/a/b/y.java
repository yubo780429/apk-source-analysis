package a.a.a.b;

import android.location.Location;
import android.net.wifi.ScanResult;
import android.os.Build;
import com.baidu.location.Jni;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ArrayList<String> f93b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList<String> f94c = new ArrayList<>();
    public static ArrayList<String> d = new ArrayList<>();
    public static String e = a.a.a.i.h.f353a + "/yo.dat";
    public static String f = a.a.a.i.h.f353a + "/yoh.dat";
    public static String g = a.a.a.i.h.f353a + "/yom.dat";
    public static String h = a.a.a.i.h.f353a + "/yol.dat";
    public static String i = a.a.a.i.h.f353a + "/yor.dat";
    public static File j = null;
    public static int k = 8;
    public static int l = 8;
    public static int m = 16;
    public static int n = 2048;
    public static int o = 0;
    public static int p = 64;
    public static int q = 128;
    public static Location r = null;
    public static Location s = null;
    public static Location t = null;
    public static a.a.a.g.k u = null;
    public static y v = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f95a;

    public class a extends a.a.a.i.g {
        public boolean i = false;
        public int j = 0;
        public int k = 0;
        public ArrayList<String> l = new ArrayList<>();
        public boolean m = true;

        public a(y yVar) {
            this.d = new HashMap();
        }

        @Override // a.a.a.i.g
        public void a() {
            Map<String, Object> map;
            StringBuilder sb;
            String str;
            if (this.j != 1) {
                this.f337a = a.a.a.i.i.j();
            }
            this.f338b = 2;
            if (this.l != null) {
                for (int i = 0; i < this.l.size(); i++) {
                    if (this.j == 1) {
                        map = this.d;
                        sb = new StringBuilder();
                        str = "cldc[";
                    } else {
                        map = this.d;
                        sb = new StringBuilder();
                        str = "cltr[";
                    }
                    sb.append(str);
                    sb.append(i);
                    sb.append("]");
                    map.put(sb.toString(), this.l.get(i));
                }
                this.d.put("trtm", String.format(Locale.CHINA, "%d", Long.valueOf(System.currentTimeMillis())));
                if (this.j != 1) {
                    this.d.put("qt", "cltrg");
                }
            }
        }

        @Override // a.a.a.i.g
        public void a(boolean z) {
            if (z && this.f339c != null) {
                ArrayList<String> arrayList = this.l;
                if (arrayList != null) {
                    arrayList.clear();
                }
                try {
                    JSONObject jSONObject = new JSONObject(this.f339c);
                    if (jSONObject.has("ison") && jSONObject.getInt("ison") == 0) {
                        this.m = false;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Map<String, Object> map = this.d;
            if (map != null) {
                map.clear();
            }
            this.i = false;
        }

        public synchronized void b() {
            ExecutorService executorServiceB;
            String strJ;
            String strJ2;
            int i;
            if (this.i) {
                return;
            }
            int i2 = a.a.a.i.g.h;
            if (i2 > 4 && (i = this.k) < i2) {
                this.k = i + 1;
                return;
            }
            this.k = 0;
            this.i = true;
            this.j = 0;
            try {
                ArrayList<String> arrayList = this.l;
                if (arrayList == null || arrayList.size() < 1) {
                    if (this.l == null) {
                        this.l = new ArrayList<>();
                    }
                    this.j = 0;
                    int length = 0;
                    while (true) {
                        String strB = null;
                        String strF = this.j < 2 ? y.f() : null;
                        if (strF == null && this.j != 1 && this.m) {
                            this.j = 2;
                            try {
                                strB = k.b();
                            } catch (Exception unused) {
                            }
                        } else {
                            this.j = 1;
                            strB = strF;
                        }
                        if (strB == null) {
                            break;
                        }
                        if (!strB.contains("err!")) {
                            this.l.add(strB);
                            length += strB.length();
                            if (length >= a.a.a.i.a.d) {
                                break;
                            }
                        }
                    }
                }
                ArrayList<String> arrayList2 = this.l;
                if (arrayList2 == null || arrayList2.size() < 1) {
                    ArrayList<String> arrayList3 = this.l;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    this.i = false;
                    return;
                }
                if (this.j != 1) {
                    executorServiceB = w.d().b();
                    if (executorServiceB != null) {
                        strJ2 = a.a.a.i.i.j();
                        a(executorServiceB, strJ2);
                    } else {
                        strJ = a.a.a.i.i.j();
                        a(strJ);
                    }
                } else {
                    executorServiceB = w.d().b();
                    if (executorServiceB != null) {
                        strJ2 = a.a.a.i.d.f324b;
                        a(executorServiceB, strJ2);
                    } else {
                        strJ = a.a.a.i.d.f324b;
                        a(strJ);
                    }
                }
            } catch (Exception unused2) {
                ArrayList<String> arrayList4 = this.l;
                if (arrayList4 != null) {
                    arrayList4.clear();
                }
            }
        }
    }

    public y() {
        String strE;
        this.f95a = null;
        this.f95a = new a(this);
        if (Build.VERSION.SDK_INT <= 28 || (strE = a.a.a.i.i.e()) == null) {
            return;
        }
        e = strE + "/yo2.dat";
        f = strE + "/yoh2.dat";
        g = strE + "/yom2.dat";
        h = strE + "/yol2.dat";
        i = strE + "/yor2.dat";
    }

    public static synchronized int a(List<String> list, int i2) {
        if (list != null && i2 <= 256) {
            if (i2 >= 0) {
                try {
                    if (j == null) {
                        File file = new File(e);
                        j = file;
                        if (!file.exists()) {
                            j = null;
                            return -2;
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(j, "rw");
                    if (randomAccessFile.length() < 1) {
                        randomAccessFile.close();
                        return -3;
                    }
                    long j2 = i2;
                    randomAccessFile.seek(j2);
                    int i3 = randomAccessFile.readInt();
                    int i4 = randomAccessFile.readInt();
                    int i5 = randomAccessFile.readInt();
                    int i6 = randomAccessFile.readInt();
                    long j3 = randomAccessFile.readLong();
                    long j4 = j3;
                    if (a(i3, i4, i5, i6, j3)) {
                        int i7 = 1;
                        if (i4 >= 1) {
                            byte[] bArr = new byte[n];
                            int i8 = k;
                            while (i8 > 0 && i4 > 0) {
                                long j5 = (((i3 + i4) - i7) % i5) * i6;
                                byte[] bArr2 = bArr;
                                long j6 = j4;
                                randomAccessFile.seek(j5 + j6);
                                int i9 = randomAccessFile.readInt();
                                if (i9 > 0 && i9 < i6) {
                                    randomAccessFile.read(bArr2, 0, i9);
                                    int i10 = i9 - 1;
                                    if (bArr2[i10] == 0) {
                                        list.add(new String(bArr2, 0, i10));
                                    }
                                }
                                i8--;
                                i4--;
                                j4 = j6;
                                bArr = bArr2;
                                i7 = 1;
                            }
                            randomAccessFile.seek(j2);
                            randomAccessFile.writeInt(i3);
                            randomAccessFile.writeInt(i4);
                            randomAccessFile.writeInt(i5);
                            randomAccessFile.writeInt(i6);
                            randomAccessFile.writeLong(j4);
                            randomAccessFile.close();
                            return k - i8;
                        }
                    }
                    randomAccessFile.close();
                    return -4;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return -5;
                }
            }
        }
        return -1;
    }

    public static String a(int i2) {
        String str;
        ArrayList<String> arrayList;
        String str2 = null;
        if (i2 == 1) {
            str = f;
            arrayList = f93b;
        } else if (i2 == 2) {
            str = g;
            arrayList = f94c;
        } else {
            if (i2 == 3) {
                str = h;
            } else {
                if (i2 != 4) {
                    return null;
                }
                str = i;
            }
            arrayList = d;
        }
        if (arrayList == null) {
            return null;
        }
        if (arrayList.size() < 1) {
            a(str, arrayList);
        }
        synchronized (y.class) {
            int size = arrayList.size();
            if (size > 0) {
                int i3 = size - 1;
                try {
                    String str3 = arrayList.get(i3);
                    try {
                        arrayList.remove(i3);
                    } catch (Exception unused) {
                    }
                    str2 = str3;
                } catch (Exception unused2) {
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x005e A[Catch: Exception -> 0x00e1, TryCatch #0 {Exception -> 0x00e1, blocks: (B:24:0x0033, B:25:0x0057, B:28:0x005e, B:30:0x0062, B:35:0x00c4, B:32:0x0093, B:37:0x00c8, B:40:0x00dd), top: B:43:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0062 A[Catch: Exception -> 0x00e1, TryCatch #0 {Exception -> 0x00e1, blocks: (B:24:0x0033, B:25:0x0057, B:28:0x005e, B:30:0x0062, B:35:0x00c4, B:32:0x0093, B:37:0x00c8, B:40:0x00dd), top: B:43:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[Catch: Exception -> 0x00e1, TryCatch #0 {Exception -> 0x00e1, blocks: (B:24:0x0033, B:25:0x0057, B:28:0x005e, B:30:0x0062, B:35:0x00c4, B:32:0x0093, B:37:0x00c8, B:40:0x00dd), top: B:43:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8 A[EDGE_INSN: B:45:0x00c8->B:37:0x00c8 BREAK  A[LOOP:0: B:25:0x0057->B:35:0x00c4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0062, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0093, please report this as an issue */
    public static void a(int i2, boolean z) {
        String str;
        ArrayList<String> arrayList;
        File file;
        RandomAccessFile randomAccessFile;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int size;
        boolean z2;
        try {
            if (i2 != 1) {
                if (i2 == 2) {
                    str = g;
                    if (z) {
                    }
                    file = new File(str);
                    if (!file.exists()) {
                        a(str);
                    }
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    randomAccessFile.seek(4L);
                    i3 = randomAccessFile.readInt();
                    i4 = randomAccessFile.readInt();
                    i5 = randomAccessFile.readInt();
                    i6 = randomAccessFile.readInt();
                    i7 = randomAccessFile.readInt();
                    size = arrayList.size();
                    while (true) {
                        z2 = false;
                        if (size <= l) {
                            break;
                        }
                        if (z) {
                            i7++;
                        }
                        if (i5 >= i3) {
                            if (!z) {
                                z2 = true;
                                break;
                            }
                            randomAccessFile.seek((i6 * i4) + 128);
                            byte[] bytes = (arrayList.get(0) + (char) 0).getBytes();
                            randomAccessFile.writeInt(bytes.length);
                            randomAccessFile.write(bytes, 0, bytes.length);
                            arrayList.remove(0);
                            i6++;
                            if (i6 > i5) {
                                i6 = 0;
                            }
                        } else {
                            randomAccessFile.seek((i4 * i5) + 128);
                            byte[] bytes2 = (arrayList.get(0) + (char) 0).getBytes();
                            randomAccessFile.writeInt(bytes2.length);
                            randomAccessFile.write(bytes2, 0, bytes2.length);
                            arrayList.remove(0);
                            i5++;
                        }
                        size--;
                    }
                    randomAccessFile.seek(12L);
                    randomAccessFile.writeInt(i5);
                    randomAccessFile.writeInt(i6);
                    randomAccessFile.writeInt(i7);
                    randomAccessFile.close();
                    if (z2 || i2 >= 4) {
                        return;
                    }
                    a(i2 + 1, true);
                    return;
                }
                if (i2 == 3) {
                    str = h;
                    if (z) {
                    }
                    file = new File(str);
                    if (!file.exists()) {
                        a(str);
                    }
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    randomAccessFile.seek(4L);
                    i3 = randomAccessFile.readInt();
                    i4 = randomAccessFile.readInt();
                    i5 = randomAccessFile.readInt();
                    i6 = randomAccessFile.readInt();
                    i7 = randomAccessFile.readInt();
                    size = arrayList.size();
                    while (true) {
                        z2 = false;
                        if (size <= l) {
                            break;
                            break;
                        }
                        if (z) {
                            i7++;
                        }
                        if (i5 >= i3) {
                            if (!z) {
                                z2 = true;
                                break;
                            }
                            randomAccessFile.seek((i6 * i4) + 128);
                            byte[] bytes3 = (arrayList.get(0) + (char) 0).getBytes();
                            randomAccessFile.writeInt(bytes3.length);
                            randomAccessFile.write(bytes3, 0, bytes3.length);
                            arrayList.remove(0);
                            i6++;
                            if (i6 > i5) {
                                i6 = 0;
                            }
                        } else {
                            randomAccessFile.seek((i4 * i5) + 128);
                            byte[] bytes4 = (arrayList.get(0) + (char) 0).getBytes();
                            randomAccessFile.writeInt(bytes4.length);
                            randomAccessFile.write(bytes4, 0, bytes4.length);
                            arrayList.remove(0);
                            i5++;
                        }
                        size--;
                    }
                    randomAccessFile.seek(12L);
                    randomAccessFile.writeInt(i5);
                    randomAccessFile.writeInt(i6);
                    randomAccessFile.writeInt(i7);
                    randomAccessFile.close();
                    if (z2) {
                        return;
                    } else {
                        return;
                    }
                }
                if (i2 != 4) {
                    return;
                }
                str = i;
                if (!z) {
                    return;
                }
                arrayList = d;
                file = new File(str);
                if (!file.exists()) {
                    a(str);
                }
                randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(4L);
                i3 = randomAccessFile.readInt();
                i4 = randomAccessFile.readInt();
                i5 = randomAccessFile.readInt();
                i6 = randomAccessFile.readInt();
                i7 = randomAccessFile.readInt();
                size = arrayList.size();
                while (true) {
                    z2 = false;
                    if (size <= l) {
                        break;
                        break;
                    }
                    if (z) {
                        i7++;
                    }
                    if (i5 >= i3) {
                        if (!z) {
                            z2 = true;
                            break;
                        }
                        randomAccessFile.seek((i6 * i4) + 128);
                        byte[] bytes5 = (arrayList.get(0) + (char) 0).getBytes();
                        randomAccessFile.writeInt(bytes5.length);
                        randomAccessFile.write(bytes5, 0, bytes5.length);
                        arrayList.remove(0);
                        i6++;
                        if (i6 > i5) {
                            i6 = 0;
                        }
                    } else {
                        randomAccessFile.seek((i4 * i5) + 128);
                        byte[] bytes6 = (arrayList.get(0) + (char) 0).getBytes();
                        randomAccessFile.writeInt(bytes6.length);
                        randomAccessFile.write(bytes6, 0, bytes6.length);
                        arrayList.remove(0);
                        i5++;
                    }
                    size--;
                }
                randomAccessFile.seek(12L);
                randomAccessFile.writeInt(i5);
                randomAccessFile.writeInt(i6);
                randomAccessFile.writeInt(i7);
                randomAccessFile.close();
                if (z2) {
                    return;
                } else {
                    return;
                }
                arrayList = f94c;
                file = new File(str);
                if (!file.exists()) {
                    a(str);
                }
                randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(4L);
                i3 = randomAccessFile.readInt();
                i4 = randomAccessFile.readInt();
                i5 = randomAccessFile.readInt();
                i6 = randomAccessFile.readInt();
                i7 = randomAccessFile.readInt();
                size = arrayList.size();
                while (true) {
                    z2 = false;
                    if (size <= l) {
                        break;
                        break;
                    }
                    if (z) {
                        i7++;
                    }
                    if (i5 >= i3) {
                        if (!z) {
                            z2 = true;
                            break;
                        }
                        randomAccessFile.seek((i6 * i4) + 128);
                        byte[] bytes7 = (arrayList.get(0) + (char) 0).getBytes();
                        randomAccessFile.writeInt(bytes7.length);
                        randomAccessFile.write(bytes7, 0, bytes7.length);
                        arrayList.remove(0);
                        i6++;
                        if (i6 > i5) {
                            i6 = 0;
                        }
                    } else {
                        randomAccessFile.seek((i4 * i5) + 128);
                        byte[] bytes8 = (arrayList.get(0) + (char) 0).getBytes();
                        randomAccessFile.writeInt(bytes8.length);
                        randomAccessFile.write(bytes8, 0, bytes8.length);
                        arrayList.remove(0);
                        i5++;
                    }
                    size--;
                }
                randomAccessFile.seek(12L);
                randomAccessFile.writeInt(i5);
                randomAccessFile.writeInt(i6);
                randomAccessFile.writeInt(i7);
                randomAccessFile.close();
                if (z2) {
                    return;
                } else {
                    return;
                }
            }
            str = f;
            if (z) {
                return;
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(4L);
            i3 = randomAccessFile.readInt();
            i4 = randomAccessFile.readInt();
            i5 = randomAccessFile.readInt();
            i6 = randomAccessFile.readInt();
            i7 = randomAccessFile.readInt();
            size = arrayList.size();
            while (true) {
                z2 = false;
                if (size <= l) {
                    break;
                    break;
                }
                if (z) {
                    i7++;
                }
                if (i5 >= i3) {
                    if (!z) {
                        z2 = true;
                        break;
                    }
                    randomAccessFile.seek((i6 * i4) + 128);
                    byte[] bytes9 = (arrayList.get(0) + (char) 0).getBytes();
                    randomAccessFile.writeInt(bytes9.length);
                    randomAccessFile.write(bytes9, 0, bytes9.length);
                    arrayList.remove(0);
                    i6++;
                    if (i6 > i5) {
                        i6 = 0;
                    }
                } else {
                    randomAccessFile.seek((i4 * i5) + 128);
                    byte[] bytes10 = (arrayList.get(0) + (char) 0).getBytes();
                    randomAccessFile.writeInt(bytes10.length);
                    randomAccessFile.write(bytes10, 0, bytes10.length);
                    arrayList.remove(0);
                    i5++;
                }
                size--;
            }
            randomAccessFile.seek(12L);
            randomAccessFile.writeInt(i5);
            randomAccessFile.writeInt(i6);
            randomAccessFile.writeInt(i7);
            randomAccessFile.close();
            if (z2) {
                return;
            } else {
                return;
            }
        } catch (Exception unused) {
            return;
        }
        arrayList = f93b;
        file = new File(str);
        if (!file.exists()) {
            a(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x021e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0238  */
    /* JADX WARN: Code duplicated, block: B:122:0x023c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0241  */
    /* JADX WARN: Code duplicated, block: B:128:0x024f  */
    /* JADX WARN: Code duplicated, block: B:131:0x025a  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x019e  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c2  */
    public static void a(a.a.a.g.a aVar, a.a.a.g.k kVar, Location location, String str, String str2) {
        StringBuilder sb;
        String str3;
        String strF;
        String strB;
        StringBuilder sb2;
        String str4;
        String strF2;
        String strB2;
        String strB3;
        int i2;
        if (a.a.a.c.d.j().f114c) {
            if ((a.a.a.i.i.s == 3 && !a(location, kVar) && !a(location, false)) || aVar == null || aVar.b()) {
                return;
            }
            com.baidu.location.c cVarA = a.a.a.f.d.r().a(aVar, kVar, null, a.a.a.i.i.h(com.baidu.location.f.c()) ? a.a.a.f.d.c.IS_MIX_MODE : a.a.a.f.d.c.IS_NOT_MIX_MODE, a.a.a.f.d.b.NO_NEED_TO_LOG);
            if (cVarA == null || cVarA.r() == 67) {
                str = str + String.format(Locale.CHINA, "&ofl=%s|0", "1");
            } else {
                String strV = (cVarA == null || cVarA.v() == null) ? null : cVarA.v();
                if (strV == null || !strV.equals("cl")) {
                    i2 = (strV == null || !strV.equals("wf")) ? 0 : 2;
                } else {
                    i2 = 1;
                }
                if (cVarA != null) {
                    str = str + String.format(Locale.CHINA, "&ofl=%s|%d|%f|%f|%d", "1", Integer.valueOf(i2), Double.valueOf(cVarA.t()), Double.valueOf(cVarA.q()), Integer.valueOf((int) cVarA.z()));
                }
            }
            if (aVar != null && aVar.a()) {
                if (!a(location, kVar)) {
                    kVar = null;
                }
                String str5 = a.a.a.i.i.a(aVar, kVar, location, str, 1) + str2;
                if (str5 != null) {
                    if (Build.VERSION.SDK_INT > 28) {
                        strB3 = Jni.f(str5);
                    } else {
                        String strF3 = Jni.f(str5);
                        strB3 = (strF3 == null || strF3.length() >= 1000) ? Jni.b(str5) : strF3;
                    }
                    b(strB3);
                    s = location;
                    r = location;
                    if (kVar != null) {
                        u = kVar;
                        return;
                    }
                    return;
                }
                return;
            }
            if (kVar != null && kVar.a() && a(location, kVar)) {
                if (!a(location) && !a.a.a.g.f.w().n()) {
                    sb2 = new StringBuilder();
                    sb2.append("&cfr=1");
                } else {
                    if (a(location) || !a.a.a.g.f.w().n()) {
                        if (a.a.a.g.f.w().n()) {
                            sb2 = new StringBuilder();
                            sb2.append("&cfr=2");
                        }
                        str4 = a.a.a.i.i.a(aVar, kVar, location, str, 2) + str2;
                        if (str4 != null) {
                            if (Build.VERSION.SDK_INT > 28) {
                                strB2 = Jni.f(str4);
                            } else {
                                strF2 = Jni.f(str4);
                                if (strF2 != null || strF2.length() >= 1000) {
                                    strB2 = Jni.b(str4);
                                } else {
                                    strB2 = strF2;
                                }
                            }
                            d(strB2);
                            t = location;
                            r = location;
                            if (kVar != null) {
                                u = kVar;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    sb2 = new StringBuilder();
                    sb2.append("&cfr=3");
                }
                sb2.append(str);
                str = sb2.toString();
                str4 = a.a.a.i.i.a(aVar, kVar, location, str, 2) + str2;
                if (str4 != null) {
                    if (Build.VERSION.SDK_INT > 28) {
                        strB2 = Jni.f(str4);
                    } else {
                        strF2 = Jni.f(str4);
                        if (strF2 != null) {
                            strB2 = Jni.b(str4);
                        } else {
                            strB2 = Jni.b(str4);
                        }
                    }
                    d(strB2);
                    t = location;
                    r = location;
                    if (kVar != null) {
                        u = kVar;
                        return;
                    }
                    return;
                }
                return;
            }
            if (a(location) || a.a.a.g.f.w().n()) {
                if (!a(location) && a.a.a.g.f.w().n()) {
                    str = "&cfr=3" + str;
                } else if (a.a.a.g.f.w().n()) {
                    sb = new StringBuilder();
                    sb.append("&cfr=2");
                }
                if (!a(location, kVar)) {
                    kVar = null;
                }
                if (aVar == null || kVar != null) {
                    str3 = a.a.a.i.i.a(aVar, kVar, location, str, 3) + str2;
                    if (str3 != null) {
                        if (Build.VERSION.SDK_INT > 28) {
                            strB = Jni.f(str3);
                        } else {
                            strF = Jni.f(str3);
                            if (strF != null || strF.length() >= 1000) {
                                strB = Jni.b(str3);
                            } else {
                                strB = strF;
                            }
                        }
                        c(strB);
                        r = location;
                        if (kVar != null) {
                            u = kVar;
                        }
                    }
                }
                return;
            }
            sb = new StringBuilder();
            sb.append("&cfr=1");
            sb.append(str);
            str = sb.toString();
            if (!a(location, kVar)) {
                kVar = null;
            }
            if (aVar == null) {
            }
            str3 = a.a.a.i.i.a(aVar, kVar, location, str, 3) + str2;
            if (str3 != null) {
                if (Build.VERSION.SDK_INT > 28) {
                    strB = Jni.f(str3);
                } else {
                    strF = Jni.f(str3);
                    if (strF != null) {
                        strB = Jni.b(str3);
                    } else {
                        strB = Jni.b(str3);
                    }
                }
                c(strB);
                r = location;
                if (kVar != null) {
                    u = kVar;
                }
            }
        }
    }

    public static void a(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return;
            }
            File file2 = new File(a.a.a.i.h.f353a);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (!file.createNewFile()) {
                file = null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.writeInt(32);
            randomAccessFile.writeInt(2048);
            randomAccessFile.writeInt(5120);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(0);
            randomAccessFile.close();
        } catch (Exception unused) {
        }
    }

    public static boolean a(int i2, int i3, int i4, int i5, long j2) {
        return i2 >= 0 && i2 < i4 && i3 >= 0 && i3 <= i4 && i4 >= 0 && i4 <= 1024 && i5 >= 128 && i5 <= 1024;
    }

    public static boolean a(Location location) {
        if (location == null) {
            return false;
        }
        Location location2 = s;
        if (location2 == null || r == null) {
            s = location;
            return true;
        }
        double dDistanceTo = location.distanceTo(location2);
        return ((double) location.distanceTo(r)) > (((((double) a.a.a.i.i.P) * dDistanceTo) * dDistanceTo) + (((double) a.a.a.i.i.Q) * dDistanceTo)) + ((double) a.a.a.i.i.R);
    }

    public static boolean a(Location location, a.a.a.g.k kVar) {
        List<ScanResult> list;
        boolean z = false;
        if (location != null && kVar != null && (list = kVar.f295a) != null && !list.isEmpty()) {
            if (kVar.a(u)) {
                return false;
            }
            z = true;
            if (t == null) {
                t = location;
            }
        }
        return z;
    }

    public static boolean a(Location location, boolean z) {
        return a.a.a.g.d.a(r, location, z);
    }

    public static boolean a(String str, List<String> list) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(8L);
            int i2 = randomAccessFile.readInt();
            int i3 = randomAccessFile.readInt();
            int i4 = randomAccessFile.readInt();
            byte[] bArr = new byte[n];
            int i5 = l + 1;
            boolean z = false;
            while (i5 > 0 && i3 > 0) {
                if (i3 < i4) {
                    i4 = 0;
                }
                try {
                    randomAccessFile.seek(((i3 - 1) * i2) + 128);
                    int i6 = randomAccessFile.readInt();
                    if (i6 > 0 && i6 < i2) {
                        randomAccessFile.read(bArr, 0, i6);
                        int i7 = i6 - 1;
                        if (bArr[i7] == 0) {
                            list.add(0, new String(bArr, 0, i7));
                            z = true;
                        }
                    }
                    i5--;
                    i3--;
                } catch (Exception unused) {
                    return z;
                }
            }
            randomAccessFile.seek(12L);
            randomAccessFile.writeInt(i3);
            randomAccessFile.writeInt(i4);
            randomAccessFile.close();
            return z;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static void b() {
        l = 0;
        a(1, false);
        a(2, false);
        a(3, false);
        l = 8;
    }

    public static void b(String str) {
        e(str);
    }

    public static synchronized y c() {
        if (v == null) {
            v = new y();
        }
        return v;
    }

    public static void c(String str) {
        e(str);
    }

    public static String d() {
        File file = new File(g);
        String str = null;
        if (file.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(20L);
                int i2 = randomAccessFile.readInt();
                if (i2 > 128) {
                    String str2 = "&p1=" + i2;
                    try {
                        randomAccessFile.seek(20L);
                        randomAccessFile.writeInt(0);
                        randomAccessFile.close();
                        return str2;
                    } catch (Exception unused) {
                        str = str2;
                    }
                } else {
                    randomAccessFile.close();
                }
            } catch (Exception unused2) {
            }
        }
        File file2 = new File(h);
        if (file2.exists()) {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                randomAccessFile2.seek(20L);
                int i3 = randomAccessFile2.readInt();
                if (i3 > 256) {
                    String str3 = "&p2=" + i3;
                    try {
                        randomAccessFile2.seek(20L);
                        randomAccessFile2.writeInt(0);
                        randomAccessFile2.close();
                        return str3;
                    } catch (Exception unused3) {
                        str = str3;
                    }
                } else {
                    randomAccessFile2.close();
                }
            } catch (Exception unused4) {
            }
        }
        File file3 = new File(i);
        if (file3.exists()) {
            try {
                RandomAccessFile randomAccessFile3 = new RandomAccessFile(file3, "rw");
                randomAccessFile3.seek(20L);
                int i4 = randomAccessFile3.readInt();
                if (i4 > 512) {
                    String str4 = "&p3=" + i4;
                    try {
                        randomAccessFile3.seek(20L);
                        randomAccessFile3.writeInt(0);
                        randomAccessFile3.close();
                        return str4;
                    } catch (Exception unused5) {
                        str = str4;
                    }
                } else {
                    randomAccessFile3.close();
                }
            } catch (Exception unused6) {
            }
        }
        return str;
    }

    public static void d(String str) {
        e(str);
    }

    public static String e() {
        String strA = null;
        for (int i2 = 1; i2 < 5; i2++) {
            strA = a(i2);
            if (strA != null) {
                return strA;
            }
        }
        a(d, p);
        try {
            if (d.size() > 0) {
                String str = d.get(0);
                try {
                    d.remove(0);
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                strA = str;
            }
        } catch (ArrayIndexOutOfBoundsException unused2) {
        }
        if (strA != null) {
            return strA;
        }
        a(d, o);
        try {
            if (d.size() > 0) {
                String str2 = d.get(0);
                try {
                    d.remove(0);
                } catch (ArrayIndexOutOfBoundsException unused3) {
                }
                strA = str2;
            }
        } catch (ArrayIndexOutOfBoundsException unused4) {
        }
        if (strA != null) {
            return strA;
        }
        a(d, q);
        try {
            if (d.size() <= 0) {
                return strA;
            }
            String str3 = d.get(0);
            try {
                d.remove(0);
            } catch (ArrayIndexOutOfBoundsException unused5) {
            }
            return str3;
        } catch (ArrayIndexOutOfBoundsException unused6) {
            return strA;
        }
    }

    public static synchronized void e(String str) {
        ArrayList<String> arrayList;
        if (str.contains("err!")) {
            return;
        }
        int i2 = a.a.a.i.i.n;
        if (i2 == 1) {
            arrayList = f93b;
        } else if (i2 == 2) {
            arrayList = f94c;
        } else if (i2 != 3) {
            return;
        } else {
            arrayList = d;
        }
        if (arrayList == null) {
            return;
        }
        if (arrayList.size() <= m) {
            arrayList.add(str);
        }
        if (arrayList.size() >= m) {
            a(i2, false);
        }
        while (arrayList.size() > m) {
            arrayList.remove(0);
        }
    }

    public static String f() {
        return e();
    }

    public void a() {
        if (a.a.a.g.f.w().p() && !a.a.a.i.i.l()) {
            this.f95a.b();
        }
    }
}
