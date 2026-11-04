package c.a.b.c;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import c.a.b.n;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e extends c.a.b.c.a {
    private Context f;
    private f g;

    static final class a implements Comparable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f1218c = {"read0", "read1", "read2", "read3", "access0", "access1", "access2", "access3", "sync0", "sync1", "sync2", "sync3", "open0", "open1", "open2", "open3"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1219b;

        private a(int i) {
            this.f1219b = i;
        }

        public static a a(byte b2, boolean z) {
            int i = b2 & 255;
            return a(z ? i >> 4 : i & 15);
        }

        public static a a(int i) {
            if (i >= 0 && i < 16) {
                return new a(i);
            }
            throw new IllegalArgumentException("invalid idx " + i);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f1219b - aVar.f1219b;
        }

        public String a() {
            return f1218c[this.f1219b];
        }

        public byte b() {
            return (byte) this.f1219b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && a.class == obj.getClass() && this.f1219b == ((a) obj).f1219b;
        }

        public int hashCode() {
            return this.f1219b;
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a[] f1220a = new a[33];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1221b;

        public b(e eVar) {
        }

        private void b(int i) {
            a[] aVarArr = this.f1220a;
            if (i - aVarArr.length > 0) {
                int length = aVarArr.length;
                int i2 = length + (length >> 1);
                if (i2 - i >= 0) {
                    i = i2;
                }
                this.f1220a = (a[]) Arrays.copyOf(this.f1220a, i);
            }
        }

        public int a() {
            return this.f1221b;
        }

        public a a(int i) {
            if (i < this.f1221b) {
                return this.f1220a[i];
            }
            throw new IndexOutOfBoundsException("idx " + i + " size " + this.f1221b);
        }

        public void a(a aVar) {
            b(this.f1221b + 1);
            a[] aVarArr = this.f1220a;
            int i = this.f1221b;
            this.f1221b = i + 1;
            aVarArr[i] = aVar;
        }

        public byte[] b() {
            int i;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i2 = 0;
            while (true) {
                i = this.f1221b;
                if (i2 >= i / 2) {
                    break;
                }
                int i3 = i2 * 2;
                byteArrayOutputStream.write((byte) (((a(i3 + 1).b() & 255) << 4) | (a(i3).b() & 255)));
                i2++;
            }
            if (i % 2 != 0) {
                byteArrayOutputStream.write((byte) (a(i - 1).b() & 255));
            }
            return byteArrayOutputStream.toByteArray();
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f1222a = new ArrayList();

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f1223a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private a f1224b;

            public a(a aVar) {
                this.f1224b = aVar;
            }

            public void a() {
                this.f1223a++;
            }
        }

        c() {
        }

        public List a() {
            ArrayList arrayList = new ArrayList(this.f1222a);
            Collections.sort(arrayList, new c.a.b.c.f(this));
            return arrayList;
        }

        public void a(a aVar) {
            this.f1222a.add(new a(aVar));
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte[] f1225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte f1226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte[] f1227c;

        public d(byte[] bArr, byte b2, byte[] bArr2) {
            this.f1225a = bArr;
            this.f1226b = b2;
            this.f1227c = bArr2;
        }

        public n.a a() {
            try {
                return n.a(c.a.b.g.b.a(this.f1225a, "", true), new String(new byte[]{this.f1226b}, "UTF-8"), this.f1227c != null ? new String(this.f1227c, "UTF-8") : null);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: c.a.b.c.e$e, reason: collision with other inner class name */
    static class C0052e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1229b;

        C0052e() {
        }

        public String toString() {
            return "";
        }
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f1230a;

        f() {
        }

        public int a(Context context, Uri uri, int i, int i2, int i3) throws c.a.b.a.e.a {
            try {
                return ((Integer) this.f1230a.invoke(context, uri, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3))).intValue();
            } catch (Exception e) {
                throw new c.a.b.a.e.a(e);
            }
        }

        void a() {
            try {
                this.f1230a = c.a.b.a.e.a(Context.class, c.a.b.a.e.a(c.a.b.a.d.d()), new Class[]{Uri.class, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                c.a.b.a.e.a(Context.class, c.a.b.a.e.a(c.a.b.a.d.e()), new Class[]{String.class, Uri.class, Integer.TYPE});
                c.a.b.a.e.a(ContentResolver.class, c.a.b.a.e.a(c.a.b.a.d.f()), new Class[]{Uri.class, Integer.TYPE});
                c.a.b.a.e.a(Context.class, c.a.b.a.e.a(c.a.b.a.d.g()), new Class[]{Uri.class, Integer.TYPE});
                c.a.b.a.e.a(ContentResolver.class, c.a.b.a.e.a(c.a.b.a.d.h()), new Class[]{Uri.class, Integer.TYPE});
            } catch (Exception unused) {
            }
        }
    }

    public e() {
        super("upc", 9000000L);
        f fVar = new f();
        this.g = fVar;
        fVar.a();
    }

    private a a(String str, int i, List list, int i2, C0052e c0052e) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c.a aVar = (c.a) it.next();
            if (a(str, i, aVar.f1224b, i2, c0052e)) {
                aVar.a();
                return aVar.f1224b;
            }
        }
        return null;
    }

    private String a(String str) {
        return str + ".cesium";
    }

    private String a(String str, int i, a aVar) {
        return String.format("content://%s/dat/v1/i%d/%s", a(str), Integer.valueOf(i), aVar.a());
    }

    private String a(String str, a aVar) {
        return String.format("content://%s/dic/v1/%s", a(str), aVar.a());
    }

    private boolean a(String str, int i, a aVar, int i2, C0052e c0052e) {
        int iA;
        Uri uri = Uri.parse(a(str, i, aVar));
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                iA = -1;
                break;
            }
            if (c0052e != null) {
                try {
                    c0052e.f1228a++;
                } catch (Throwable unused) {
                    try {
                        Thread.sleep(5L);
                    } catch (Exception unused2) {
                    }
                    i3++;
                }
            }
            iA = this.g.a(this.f, uri, 0, i2, 1);
            break;
        }
        if (iA == 0) {
            return true;
        }
        if (c0052e != null) {
            c0052e.f1229b++;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[RETURN] */
    private boolean a(String str, a aVar, int i) {
        int iA;
        Uri uri = Uri.parse(a(str, aVar));
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                iA = this.g.a(this.f, uri, 0, i, 1);
                if (iA == 0) {
                    return true;
                }
                return false;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(5L);
                } catch (Exception unused2) {
                }
            }
        }
        iA = -1;
        if (iA == 0) {
            return true;
        }
        return false;
    }

    @Override // c.a.b.c.a
    public c.a.b.c.a.e a(String str, c.a.b.c.a.d dVar) {
        byte[] bArrB;
        boolean z;
        Byte bValueOf;
        if (Build.VERSION.SDK_INT < 26) {
            return c.a.b.c.a.e.b();
        }
        int packageUid = -1;
        try {
            packageUid = this.f.getPackageManager().getPackageUid(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        int i = packageUid;
        if (i < 0) {
            return c.a.b.c.a.e.b();
        }
        C0052e c0052e = new C0052e();
        b bVar = new b(this);
        c cVar = new c();
        c cVar2 = new c();
        for (int i2 = 0; i2 < 16; i2++) {
            a aVarA = a.a(i2);
            if (a(str, aVarA, i)) {
                cVar.a(aVarA);
            } else {
                cVar2.a(aVarA);
            }
        }
        for (int i3 = 0; i3 < 32; i3++) {
            a aVarA2 = a(str, i3, cVar.a(), i, c0052e);
            if (aVarA2 == null) {
                aVarA2 = a(str, i3, cVar2.a(), i, c0052e);
            }
            if (aVarA2 == null) {
                return c.a.b.c.a.e.b();
            }
            bVar.a(aVarA2);
        }
        byte[] bArrB2 = bVar.b();
        int i4 = 3;
        boolean z2 = true;
        byte[] bArr = {"0".getBytes()[0], "O".getBytes()[0], "V".getBytes()[0]};
        int i5 = 0;
        while (true) {
            bArrB = null;
            if (i5 >= i4) {
                z = z2;
                bValueOf = null;
                break;
            }
            byte b2 = bArr[i5];
            a aVarA3 = a.a(b2, false);
            int i6 = i5;
            z = z2;
            byte[] bArr2 = bArr;
            if (a(str, 32, aVarA3, i, c0052e)) {
                a aVarA4 = a.a(b2, z);
                if (a(str, 33, aVarA4, i, c0052e)) {
                    b bVar2 = new b(this);
                    bVar2.a(aVarA3);
                    bVar2.a(aVarA4);
                    bValueOf = Byte.valueOf(bVar2.b()[0]);
                    break;
                }
            }
            i5 = i6 + 1;
            z2 = z;
            bArr = bArr2;
            i4 = 3;
        }
        if (bValueOf == null) {
            b bVar3 = new b(this);
            int i7 = 32;
            for (int i8 = 34; i7 < i8; i8 = 34) {
                int i9 = i7;
                b bVar4 = bVar3;
                a aVarA5 = a(str, i7, cVar.a(), i, c0052e);
                if (aVarA5 == null) {
                    aVarA5 = a(str, i9, cVar2.a(), i, c0052e);
                }
                if (aVarA5 == null) {
                    return c.a.b.c.a.e.b();
                }
                bVar4.a(aVarA5);
                i7 = i9 + 1;
                bVar3 = bVar4;
            }
            bValueOf = Byte.valueOf(bVar3.b()[0]);
        } else {
            z = false;
        }
        Byte b3 = bValueOf;
        if (z) {
            b bVar5 = new b(this);
            for (int i10 = 34; i10 < 94; i10++) {
                a aVarA6 = a(str, i10, cVar.a(), i, c0052e);
                if (aVarA6 == null) {
                    aVarA6 = a(str, i10, cVar2.a(), i, c0052e);
                }
                if (aVarA6 == null) {
                    break;
                }
                bVar5.a(aVarA6);
            }
            if (bVar5.a() > 0) {
                bArrB = bVar5.b();
            }
        }
        return c.a.b.c.a.e.a(new d(bArrB2, b3.byteValue(), bArrB).a());
    }

    @Override // c.a.b.c.a
    public void a(c.a.b.c.a.c cVar) {
        this.f = this.f1203a.f1206a;
    }
}
