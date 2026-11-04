package a.a.a.d;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Location> f174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Location f176c = null;

    public j(String str, Location[] locationArr) {
        if (locationArr == null || locationArr.length <= 0) {
            return;
        }
        a(locationArr);
        this.f175b = str;
    }

    public String a() {
        return this.f175b;
    }

    public final void a(Location[] locationArr) {
        if (locationArr == null || locationArr.length <= 0) {
            return;
        }
        if (this.f174a == null) {
            this.f174a = new ArrayList();
        }
        double longitude = 0.0d;
        double latitude = 0.0d;
        for (int i = 0; i < locationArr.length; i++) {
            latitude += locationArr[i].getLatitude();
            longitude += locationArr[i].getLongitude();
            this.f174a.add(locationArr[i]);
        }
        if (this.f176c == null) {
            Location location = new Location("gps");
            this.f176c = location;
            location.setLatitude(latitude / ((double) locationArr.length));
            this.f176c.setLongitude(longitude / ((double) locationArr.length));
        }
    }
}
