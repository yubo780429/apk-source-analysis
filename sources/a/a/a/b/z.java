package a.a.a.b;

import android.annotation.TargetApi;
import android.location.GnssNavigationMessage;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class z {
    public static Object d = new Object();
    public static z e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HandlerThread f96a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f97b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f98c = false;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Bundle data = message.getData();
                    try {
                        Location location = (Location) data.getParcelable("loc");
                        data.getInt("satnum");
                        if (location != null) {
                            j.k().e(location);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    y.a(u.d(), a.a.a.g.f.w().j(), u.c(), u.b(), u.a());
                    break;
                case 3:
                    y.a(u.d(), (a.a.a.g.k) null, u.c(), c.h().d(), u.a());
                    break;
                case 4:
                    boolean zP = a.a.a.g.f.w().p();
                    boolean z = false;
                    if (a.a.a.i.i.l()) {
                        zP = false;
                    }
                    if (!zP) {
                        z = zP;
                    } else if (l.f().a() != 1) {
                        z = true;
                    }
                    if (z) {
                        if (a.a.a.c.c.f().c()) {
                            a.a.a.f.d.r().o();
                            a.a.a.f.d.r().p();
                        }
                        a.a.a.c.f.d().a();
                        if (a.a.a.c.c.f().c()) {
                            y.c().a();
                        }
                    }
                    try {
                        if (z.this.f97b != null) {
                            z.this.f97b.sendEmptyMessageDelayed(4, a.a.a.i.i.N);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    x.b().a();
                    break;
                case 5:
                    a.a.a.c.f.d().b();
                    break;
                case 7:
                    y.c().a();
                    a.a.a.c.f.d().a();
                    break;
                case 8:
                case 9:
                    message.getData();
                    break;
                case 11:
                    Bundle data2 = message.getData();
                    try {
                        x.b().a((GnssNavigationMessage) data2.getParcelable("gnss_navigation_message"), data2.getLong("gps_time"));
                    } catch (Exception unused) {
                        return;
                    }
                    break;
            }
        }
    }

    public static z f() {
        z zVar;
        synchronized (d) {
            if (e == null) {
                e = new z();
            }
            zVar = e;
        }
        return zVar;
    }

    public void a() {
        if (this.f98c) {
            return;
        }
        this.f98c = true;
        if (this.f96a == null) {
            HandlerThread handlerThread = new HandlerThread("LocUploadThreadManager");
            this.f96a = handlerThread;
            handlerThread.start();
            if (this.f96a != null) {
                this.f97b = new a(this.f96a.getLooper());
            }
        }
        try {
            Handler handler = this.f97b;
            if (handler != null) {
                handler.obtainMessage(5).sendToTarget();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            Handler handler2 = this.f97b;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(4, a.a.a.i.i.N);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    @TargetApi(24)
    public void a(GnssNavigationMessage gnssNavigationMessage, long j) {
        if (!this.f98c || gnssNavigationMessage == null) {
            return;
        }
        try {
            Handler handler = this.f97b;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage(11);
                Bundle bundle = new Bundle();
                bundle.putParcelable("gnss_navigation_message", gnssNavigationMessage);
                bundle.putLong("gps_time", j);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(Location location, int i) {
        if (!this.f98c || location == null) {
            return;
        }
        try {
            Handler handler = this.f97b;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage(1);
                Bundle bundle = new Bundle();
                bundle.putParcelable("loc", new Location(location));
                bundle.putInt("satnum", i);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void b() {
        if (this.f98c) {
            j.k().i();
            try {
                Handler handler = this.f97b;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.f97b = null;
            try {
                HandlerThread handlerThread = this.f96a;
                if (handlerThread != null) {
                    handlerThread.quit();
                    this.f96a.interrupt();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            this.f96a = null;
            this.f98c = false;
        }
    }

    public void c() {
        if (this.f98c) {
            try {
                Handler handler = this.f97b;
                if (handler != null) {
                    handler.obtainMessage(7).sendToTarget();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void d() {
        if (this.f98c) {
            try {
                Handler handler = this.f97b;
                if (handler != null) {
                    handler.obtainMessage(3).sendToTarget();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void e() {
        if (this.f98c) {
            try {
                Handler handler = this.f97b;
                if (handler != null) {
                    handler.obtainMessage(2).sendToTarget();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
