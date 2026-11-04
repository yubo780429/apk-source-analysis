package a.a.a.g;

import android.net.wifi.ScanResult;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<ScanResult> f295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f297c;
    public boolean d = false;
    public boolean e;

    public k(List<ScanResult> list, long j) {
        this.f295a = null;
        this.f296b = 0L;
        this.f297c = 0L;
        this.f296b = j;
        this.f295a = list;
        this.f297c = System.currentTimeMillis();
        try {
            d();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean a() {
        return System.currentTimeMillis() - this.f296b > 0 && System.currentTimeMillis() - this.f296b < 5000;
    }

    public boolean a(k kVar) {
        List<ScanResult> list = this.f295a;
        if (list == null || kVar == null || kVar.f295a == null) {
            return false;
        }
        int iMin = Math.min(list.size(), kVar.f295a.size());
        for (int i = 0; i < iMin; i++) {
            if (this.f295a.get(i) != null) {
                String str = this.f295a.get(i).BSSID;
                int i2 = this.f295a.get(i).level;
                String str2 = kVar.f295a.get(i).BSSID;
                int i3 = kVar.f295a.get(i).level;
                if ((!TextUtils.isEmpty(str) && !str.equals(str2)) || i2 != i3) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean a(k kVar, float f) {
        return a.a.a.g.l.b.a(kVar, this, f);
    }

    public boolean b() {
        return System.currentTimeMillis() - this.f297c > 0 && System.currentTimeMillis() - this.f297c < 5000;
    }

    public int c() {
        List<ScanResult> list = this.f295a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void d() {
        /*
            r7 = this;
            int r0 = r7.c()
            r1 = 1
            if (r0 >= r1) goto L8
            return
        L8:
            java.util.List<android.net.wifi.ScanResult> r0 = r7.f295a
            int r0 = r0.size()
            int r0 = r0 - r1
            r2 = r1
        L10:
            if (r0 < r1) goto L5e
            if (r2 == 0) goto L5e
            r2 = 0
            r3 = r2
        L16:
            if (r2 >= r0) goto L5a
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f295a
            java.lang.Object r4 = r4.get(r2)
            if (r4 == 0) goto L57
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f295a
            int r5 = r2 + 1
            java.lang.Object r4 = r4.get(r5)
            if (r4 == 0) goto L57
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f295a
            java.lang.Object r4 = r4.get(r2)
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4
            int r4 = r4.level
            java.util.List<android.net.wifi.ScanResult> r6 = r7.f295a
            java.lang.Object r6 = r6.get(r5)
            android.net.wifi.ScanResult r6 = (android.net.wifi.ScanResult) r6
            int r6 = r6.level
            if (r4 >= r6) goto L57
            java.util.List<android.net.wifi.ScanResult> r3 = r7.f295a
            java.lang.Object r3 = r3.get(r5)
            android.net.wifi.ScanResult r3 = (android.net.wifi.ScanResult) r3
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f295a
            java.lang.Object r6 = r4.get(r2)
            r4.set(r5, r6)
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f295a
            r4.set(r2, r3)
            r3 = r1
        L57:
            int r2 = r2 + 1
            goto L16
        L5a:
            int r0 = r0 + (-1)
            r2 = r3
            goto L10
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.g.k.d():void");
    }
}
