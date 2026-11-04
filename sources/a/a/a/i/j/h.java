package a.a.a.i.j;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f363a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f364b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f365c = -1;
    public static int d = -1;
    public static int e = -1;
    public static int f = -1;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f366a;

        static {
            int[] iArr = new int[c.values().length];
            f366a = iArr;
            try {
                iArr[c.SUBWAY_STATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f366a[c.TRAFFIC_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f366a[c.VDR_INDOOR_SPEED_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f366a[c.INDOOR_POI_DATA_STATUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f366a[c.OUTDOOR_POI_DATA_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f366a[c.GPS_CHECKER_STATUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f367a = new h(null);
    }

    public enum c {
        SUBWAY_STATIC,
        TRAFFIC_STATUS,
        VDR_INDOOR_SPEED_STATUS,
        INDOOR_POI_DATA_STATUS,
        OUTDOOR_POI_DATA_STATUS,
        GPS_CHECKER_STATUS
    }

    public h() {
    }

    public /* synthetic */ h(g gVar) {
        this();
    }

    public static h a() {
        return b.f367a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public String a(c cVar) {
        switch (a.f366a[cVar.ordinal()]) {
            case 1:
                if (f363a == 0) {
                    return e.f361a;
                }
                return null;
            case 2:
                if (f364b == 0) {
                    return f.f362a;
                }
                return null;
            case 3:
                if (f365c == 0) {
                    return a.a.a.i.j.c.f359a;
                }
                return null;
            case 4:
                if (d == 0) {
                    return a.a.a.i.j.b.f358a;
                }
                return null;
            case 5:
                if (e == 0) {
                    return d.f360a;
                }
                return null;
            case 6:
                if (f == 0) {
                    return a.a.a.i.j.a.f357a;
                }
                return null;
            default:
                return null;
        }
    }
}
