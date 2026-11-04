package a.a.a.d;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static final char[] m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static e n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentMap<String, ScanResult> f127a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BluetoothAdapter f129c;
    public volatile boolean d;
    public long e;
    public Object f;
    public long g;
    public int h;
    public String i;
    public long j;
    public long k;
    public long l;

    public class a extends ScanCallback {
        public a() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            long jElapsedRealtimeNanos;
            if (e.this.f127a == null || scanResult.getDevice() == null || TextUtils.isEmpty(scanResult.getDevice().getAddress())) {
                return;
            }
            e.this.g = System.currentTimeMillis();
            e.this.f127a.put(scanResult.getDevice().getAddress(), scanResult);
            long jCurrentTimeMillis = System.currentTimeMillis() - e.this.j;
            if (jCurrentTimeMillis > 800 || jCurrentTimeMillis < -100) {
                e.this.f127a.values().size();
                e.this.j = System.currentTimeMillis();
                long timestampNanos = scanResult.getTimestampNanos() / 1000000;
                if (Build.VERSION.SDK_INT >= 17) {
                    try {
                        jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000000;
                    } catch (Error unused) {
                        jElapsedRealtimeNanos = 0;
                    }
                } else {
                    jElapsedRealtimeNanos = 0;
                }
                Iterator it = e.this.f127a.entrySet().iterator();
                while (it.hasNext()) {
                    ScanResult scanResult2 = (ScanResult) ((Map.Entry) it.next()).getValue();
                    boolean z = false;
                    if (timestampNanos - (scanResult2.getTimestampNanos() / 1000000) > 2500) {
                        it.remove();
                        z = true;
                    }
                    if (jElapsedRealtimeNanos != 0 && !z && jElapsedRealtimeNanos - (scanResult2.getTimestampNanos() / 1000000) > 2500) {
                        it.remove();
                    }
                }
                e.this.f127a.values().size();
                e.this.b();
            }
            a.a.a.d.b bVarA = a.a.a.d.d.b().a();
            if (bVarA == null) {
                return;
            }
            bVarA.d();
            throw null;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.j();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.j();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.i();
        }
    }

    /* JADX INFO: renamed from: a.a.a.d.e$e, reason: collision with other inner class name */
    public class C0006e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f136c;
        public int d;
        public int e;
        public int f;
        public long g;

        public C0006e(e eVar, String str, String str2, int i, long j) {
            this.f134a = str;
            this.f135b = str2;
            this.f = -i;
            this.g = j / 1000000;
        }

        public void a(int i) {
            this.d = i;
        }

        public void a(String str) {
            this.f134a = str;
        }

        public void b(int i) {
            this.e = i;
        }

        public void b(String str) {
            this.f136c = str;
        }

        public String toString() {
            return this.f135b + ";" + this.f134a + ";" + this.f136c + ";" + this.d + ";" + this.e + ";" + this.f + ";" + this.g;
        }
    }

    public class f implements Comparator<C0006e> {
        public f(e eVar) {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0006e c0006e, C0006e c0006e2) {
            return c0006e.f - c0006e2.f;
        }
    }

    public e() {
        new ConcurrentHashMap();
        this.d = false;
        this.e = -1L;
        this.f = null;
        this.g = -1L;
        this.j = 0L;
        this.k = -1L;
        this.l = 0L;
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = m;
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

    public static synchronized e k() {
        if (n == null) {
            n = new e();
        }
        return n;
    }

    public final C0006e a(C0006e c0006e, String str, int i, int i2, String str2) {
        a.a.a.d.b bVarA = a.a.a.d.d.b().a();
        if (a.a.a.b.d.i().M == 1 && bVarA != null) {
            bVarA.c();
            throw null;
        }
        c0006e.b(str);
        c0006e.a(i);
        c0006e.b(i2);
        c0006e.a(str2);
        return c0006e;
    }

    @TargetApi(21)
    public final C0006e a(ScanResult scanResult) {
        if (TextUtils.isEmpty(scanResult.getDevice().getAddress()) || scanResult.getRssi() > 0) {
            return null;
        }
        boolean z = false;
        String strReplaceAll = scanResult.getDevice().getAddress().replaceAll(":", "");
        C0006e c0006e = new C0006e(this, strReplaceAll, scanResult.getDevice().getName(), scanResult.getRssi(), scanResult.getTimestampNanos());
        if (scanResult.getScanRecord() != null) {
            byte[] bytes = scanResult.getScanRecord().getBytes();
            int i = 2;
            while (i <= 5) {
                int i2 = i + 2;
                if ((bytes[i2] & 255) == 2 && (bytes[i + 3] & 255) == 21) {
                    z = true;
                    break;
                }
                if (((bytes[i] & 255) != 45 || (bytes[i + 1] & 255) != 36 || (bytes[i2] & 255) != 191 || (bytes[i + 3] & 255) != 22) && (bytes[i] & 255) == 173 && (bytes[i + 1] & 255) == 119 && (bytes[i2] & 255) == 0) {
                    byte b2 = bytes[i + 3];
                }
                i++;
            }
            if (!z) {
                return c0006e;
            }
            int i3 = ((bytes[i + 20] & 255) * 256) + (bytes[i + 21] & 255);
            int i4 = ((bytes[i + 22] & 255) * 256) + (bytes[i + 23] & 255);
            if (bytes.length > 26) {
                a(c0006e, a(Arrays.copyOfRange(bytes, 9, 25)), i3, i4, strReplaceAll);
            }
        }
        return c0006e;
    }

    public final void a() {
        this.f127a.clear();
        this.h = -1;
        this.i = "";
        this.g = -1L;
    }

    public final void b() {
        ConcurrentMap<String, ScanResult> concurrentMap = this.f127a;
        if (concurrentMap == null || concurrentMap.values().size() <= 0) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(this.f127a.values());
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            a.a.a.d.b bVarA = a.a.a.d.d.b().a();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0006e c0006eA = a((ScanResult) it.next());
                if (c0006eA != null) {
                    arrayList2.add(c0006eA);
                }
            }
            if (arrayList2.size() > 0) {
                Collections.sort(arrayList2, new f(this));
                sb.append(((C0006e) arrayList2.get(0)).toString());
                for (int i = 1; i < arrayList2.size(); i++) {
                    sb.append("|");
                    sb.append(((C0006e) arrayList2.get(i)).toString());
                }
                if (bVarA != null) {
                    arrayList2.size();
                    bVarA.b();
                    throw null;
                }
            }
            if (!TextUtils.isEmpty(sb2) && !TextUtils.isEmpty(sb2.toString())) {
                sb2.toString();
            }
            this.i = (TextUtils.isEmpty(sb3) || TextUtils.isEmpty(sb3.toString())) ? "" : sb3.toString();
            sb.toString();
            this.e = System.currentTimeMillis();
        } catch (Exception unused) {
        }
    }

    public synchronized String c() {
        if (!e() || TextUtils.isEmpty(this.i)) {
            return null;
        }
        return this.i;
    }

    public int d() {
        return this.h;
    }

    public final boolean e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.g;
        long j2 = jCurrentTimeMillis - j;
        if (j2 > 10000 && j > 100000 && this.d) {
            g();
        }
        return Math.abs(j2) <= 5000 && Math.abs(jCurrentTimeMillis - this.e) <= 5000;
    }

    public final boolean f() {
        boolean z;
        try {
            z = this.f128b.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") || this.f128b.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
        } catch (Exception e) {
            e.printStackTrace();
        }
        BluetoothAdapter bluetoothAdapter = this.f129c;
        if (bluetoothAdapter != null && z) {
            try {
                return bluetoothAdapter.isEnabled();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public final void g() {
        if (System.currentTimeMillis() - this.l <= 10000 || a.a.a.d.d.b().a() == null) {
            return;
        }
        this.l = System.currentTimeMillis();
        Handler handlerE = a.a.a.h.a.e();
        if (handlerE != null) {
            handlerE.postDelayed(new c(), 1000L);
            handlerE.postDelayed(new d(), 2000L);
        }
    }

    @TargetApi(21)
    public final void h() {
        if (this.f129c == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f = new a();
                this.f129c.getBluetoothLeScanner().startScan((List<ScanFilter>) null, new ScanSettings.Builder().setScanMode(2).build(), (ScanCallback) this.f);
                this.d = true;
                if (a.a.a.d.d.b().a() != null || a.a.a.h.a.e() == null) {
                    return;
                }
                a.a.a.h.a.e().postDelayed(new b(), a.a.a.i.i.H0 * 1000);
            }
        } catch (Exception unused) {
        }
    }

    public synchronized void i() {
        if (f()) {
            if (!this.d) {
                h();
            }
        }
    }

    @TargetApi(21)
    public synchronized void j() {
        if (this.d) {
            try {
                BluetoothAdapter bluetoothAdapter = this.f129c;
                if (bluetoothAdapter != null && bluetoothAdapter.getBluetoothLeScanner() != null) {
                    this.f129c.getBluetoothLeScanner().stopScan((ScanCallback) this.f);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.d = false;
            this.k = System.currentTimeMillis();
            Context context = this.f128b;
            if (context != null) {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences("BluetoothManager", 0).edit();
                editorEdit.putLong("lastStopScanBluetoothTime", this.k);
                editorEdit.apply();
            }
            a();
        }
    }
}
