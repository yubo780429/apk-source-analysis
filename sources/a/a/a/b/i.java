package a.a.a.b;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f33b = "NULL";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34a = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f35a = new i();
    }

    public static i d() {
        return a.f35a;
    }

    public final int a(String str) {
        return e.a(str);
    }

    public final String a(Location location) {
        StringBuilder sb = new StringBuilder();
        sb.append(location.getAccuracy());
        sb.append("|");
        sb.append(a.a.a.g.d.X);
        sb.append("|");
        Bundle extras = location.getExtras();
        if (extras == null || !extras.containsKey("meanCn0")) {
            sb.append(-1);
        } else {
            sb.append(extras.get("meanCn0"));
        }
        sb.append("|");
        if (extras == null || !extras.containsKey("SourceType")) {
            sb.append(-1);
        } else {
            sb.append(extras.get("SourceType"));
        }
        sb.append("|");
        sb.append(f33b);
        return sb.toString();
    }

    public void a() {
        e.b();
        this.f34a = false;
        f33b = "";
    }

    public void a(ArrayList<ArrayList<Float>> arrayList) {
        String string;
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() == 0) {
            string = "NULL";
        } else {
            boolean z = true;
            for (ArrayList<Float> arrayList2 : arrayList) {
                if (arrayList2.size() == 6) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(";");
                    }
                    sb.append(String.format("%.1f,", arrayList2.get(2)));
                    sb.append(String.format("%.0f", arrayList2.get(3)));
                }
            }
            string = sb.toString();
        }
        f33b = string;
    }

    public int b(Location location) {
        if (location == null) {
            return -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (!c()) {
            b();
        }
        if (c()) {
            return a(a(location));
        }
        return -1;
    }

    public final void b() {
        String strA = a.a.a.i.j.h.a().a(a.a.a.i.j.h.c.GPS_CHECKER_STATUS);
        if (strA != null && e.a(strA, d.i().G) == 0) {
            this.f34a = true;
        }
    }

    public boolean c() {
        return this.f34a;
    }
}
