package c.c.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: c.c.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0054a extends Binder implements a {

        /* JADX INFO: renamed from: c.c.a.a$a$a, reason: collision with other inner class name */
        private static class C0055a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f1322a;

            C0055a(IBinder iBinder) {
                this.f1322a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1322a;
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.gree.telephonymanager.IGreeTelephonyManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0055a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }
}
