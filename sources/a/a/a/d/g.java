package a.a.a.d;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public class g {
    public static final char[] n = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f138a;
    public BluetoothAdapter d;
    public boolean e;
    public c f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f139b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f140c = false;
    public boolean g = false;
    public String h = null;
    public long i = -1;
    public ConcurrentMap<String, ScanResult> j = new ConcurrentHashMap();
    public Object k = null;
    public boolean l = false;
    public long m = -1;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f143c;

        public a(g gVar, String str, int i, long j) {
            this.f141a = str;
            this.f142b = i;
            this.f143c = j / 1000000;
        }

        public String toString() {
            return this.f141a.toUpperCase() + ";" + this.f142b + ";" + this.f143c;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f146c;
        public String d;
        public String e;

        public String toString() {
            return this.d + "," + this.f144a + "," + this.f145b + "," + this.f146c;
        }
    }

    public interface c {
        void a(boolean z, String str, String str2, String str3);
    }

    public class d implements Comparator<b> {
        public d(g gVar) {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.f146c - bVar2.f146c;
        }
    }

    public class e implements Comparator<a> {
        public e(g gVar) {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(a aVar, a aVar2) {
            return aVar2.f142b - aVar.f142b;
        }
    }

    @TargetApi(21)
    public g(Context context) {
        this.e = false;
        this.f138a = context;
        if (this.d == null) {
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    this.d = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
                    this.e = this.f138a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
                } else {
                    this.d = BluetoothAdapter.getDefaultAdapter();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = n;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        String str = new String(cArr);
        try {
            return str.toUpperCase();
        } catch (Exception unused) {
            return str;
        }
    }

    public b a(byte[] bArr, int i, String str) {
        a.a.a.d.b bVarA;
        int i2 = -i;
        if (str == null || i2 < 0 || (bVarA = a.a.a.d.d.b().a()) == null) {
            return null;
        }
        boolean z = false;
        for (int i3 = 2; i3 <= 5; i3++) {
            int i4 = i3 + 2;
            if ((bArr[i4] & 255) == 2 && (bArr[i3 + 3] & 255) == 21) {
                z = true;
                break;
            }
            if (((bArr[i3] & 255) != 45 || (bArr[i3 + 1] & 255) != 36 || (bArr[i4] & 255) != 191 || (bArr[i3 + 3] & 255) != 22) && (bArr[i3] & 255) == 173 && (bArr[i3 + 1] & 255) == 119 && (bArr[i4] & 255) == 0) {
                byte b2 = bArr[i3 + 3];
            }
        }
        if (!z) {
            return null;
        }
        a(Arrays.copyOfRange(bArr, 9, 25));
        bVarA.a();
        throw null;
    }

    public final String a(List<a> list, int i) {
        StringBuilder sb = new StringBuilder();
        Collections.sort(list, new e(this));
        sb.append(list.get(0).toString());
        for (int i2 = 1; i2 < list.size() && i2 < i; i2++) {
            sb.append("|");
            sb.append(list.get(i2).toString());
        }
        list.size();
        return sb.toString();
    }

    @TargetApi(21)
    public final void a(ConcurrentMap<String, ScanResult> concurrentMap) {
        ArrayList<ScanResult> arrayList = new ArrayList(concurrentMap.values());
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (ScanResult scanResult : arrayList) {
            byte[] bytes = scanResult.getScanRecord().getBytes();
            if (bytes.length >= 26) {
                b bVarA = a(bytes, scanResult.getRssi(), scanResult.getDevice().getAddress().replaceAll(":", ""));
                if (bVarA != null) {
                    arrayList4.add(bVarA);
                    arrayList3.add(new a(this, bVarA.e, scanResult.getRssi(), scanResult.getTimestampNanos()));
                }
                String strA = a(Arrays.copyOfRange(bytes, 9, 25));
                arrayList2.add(strA);
                map.put(strA, scanResult.getDevice().getName());
                map2.put(strA, a(Arrays.copyOfRange(bytes, 0, 9)));
                if (map3.get(strA) == null) {
                    map3.put(strA, 0);
                }
                map3.put(strA, Integer.valueOf(((Integer) map3.get(strA)).intValue() + 1));
            }
        }
        String str = null;
        int iIntValue = 0;
        for (String str2 : map3.keySet()) {
            if (((Integer) map3.get(str2)).intValue() > iIntValue) {
                iIntValue = ((Integer) map3.get(str2)).intValue();
                str = str2;
            }
        }
        boolean z = iIntValue > 3;
        c cVar = this.f;
        if (cVar != null && this.f139b) {
            cVar.a(z, str, (String) map.get(str), (String) map2.get(str));
            this.f139b = false;
        }
        if (arrayList3.size() > 2) {
            this.h = a(arrayList3, 32);
            b(arrayList4, 32);
        } else {
            this.h = "";
        }
        if (this.g && a.a.a.d.d.b().a() != null && a() && !this.l && b()) {
            j();
        }
    }

    public final boolean a() {
        return System.currentTimeMillis() - this.i > 5000;
    }

    public boolean a(c cVar) {
        if (this.f139b || this.f140c) {
            return false;
        }
        this.f140c = true;
        if (!h() || f()) {
            return false;
        }
        k();
        this.f = cVar;
        return true;
    }

    public final String b(List<b> list, int i) {
        if (list == null || list.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(list, new d(this));
        sb.append(list.get(0).toString());
        for (int i2 = 1; i2 < list.size() && i2 < i; i2++) {
            sb.append("|");
            sb.append(list.get(i2).toString());
        }
        list.size();
        return sb.toString();
    }

    public final boolean b() {
        return System.currentTimeMillis() - this.m > 5000;
    }

    public final void c() {
        this.h = "";
        this.i = -1L;
    }

    public String d() {
        a(this.j);
        return this.h;
    }

    public long e() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069 A[RETURN] */
    public final boolean f() {
        String line;
        Exception e2;
        File file = new File(this.f138a.getCacheDir(), "ibct");
        if (!file.exists()) {
            return false;
        }
        String str = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            line = null;
            str = "";
            while (true) {
                try {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    str = str + line;
                } catch (Exception e3) {
                    e2 = e3;
                    e2.printStackTrace();
                    str = line;
                }
                e2.printStackTrace();
                str = line;
                if (str != null && !str.trim().equals("")) {
                    try {
                        if (System.currentTimeMillis() - Long.valueOf(str).longValue() < 259200) {
                            return true;
                        }
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            bufferedReader.close();
        } catch (Exception e4) {
            line = str;
            e2 = e4;
        }
        if (str != null) {
            if (System.currentTimeMillis() - Long.valueOf(str).longValue() < 259200) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        return System.currentTimeMillis() - this.i <= 20000;
    }

    public boolean h() {
        BluetoothAdapter bluetoothAdapter = this.d;
        if (bluetoothAdapter != null && this.e) {
            try {
                return bluetoothAdapter.isEnabled();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public void i() {
        this.f140c = false;
        this.f139b = false;
        this.l = false;
        this.m = -1L;
    }

    public final void j() {
        h();
    }

    public final void k() {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.f138a.getCacheDir(), "ibct"));
            fileWriter.write(System.currentTimeMillis() + "");
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception unused) {
        }
    }

    @TargetApi(21)
    public void l() {
        if (this.g) {
            try {
                BluetoothLeScanner bluetoothLeScanner = this.d.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan((ScanCallback) this.k);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.g = false;
            this.l = false;
            this.m = -1L;
            c();
        }
    }
}
