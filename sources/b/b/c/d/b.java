package b.b.c.d;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import b.b.c.b.i;
import b.b.c.f.j;
import b.b.c.f.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final b.b.c.f.g<String, Typeface> f1039a = new b.b.c.f.g<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b.b.c.d.c f1040b = new b.b.c.d.c("fonts", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f1041c = new Object();
    static final k<String, ArrayList<b.b.c.d.c.d<g>>> d = new k<>();
    private static final Comparator<byte[]> e = new d();

    static class a implements Callable<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.b.c.d.a f1043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1044c;
        final /* synthetic */ String d;

        a(Context context, b.b.c.d.a aVar, int i, String str) {
            this.f1042a = context;
            this.f1043b = aVar;
            this.f1044c = i;
            this.d = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public g call() {
            g gVarA = b.a(this.f1042a, this.f1043b, this.f1044c);
            Typeface typeface = gVarA.f1053a;
            if (typeface != null) {
                b.f1039a.a(this.d, typeface);
            }
            return gVarA;
        }
    }

    /* JADX INFO: renamed from: b.b.c.d.b$b, reason: collision with other inner class name */
    static class C0042b implements b.b.c.d.c.d<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.b.c.a.d.f.a f1045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f1046b;

        C0042b(b.b.c.a.d.f.a aVar, Handler handler) {
            this.f1045a = aVar;
            this.f1046b = handler;
        }

        @Override // b.b.c.d.c.d
        public void a(g gVar) {
            int i;
            b.b.c.a.d.f.a aVar;
            if (gVar == null) {
                aVar = this.f1045a;
                i = 1;
            } else {
                i = gVar.f1054b;
                if (i == 0) {
                    this.f1045a.a(gVar.f1053a, this.f1046b);
                    return;
                }
                aVar = this.f1045a;
            }
            aVar.a(i, this.f1046b);
        }
    }

    static class c implements b.b.c.d.c.d<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1047a;

        c(String str) {
            this.f1047a = str;
        }

        @Override // b.b.c.d.c.d
        public void a(g gVar) {
            synchronized (b.f1041c) {
                ArrayList<b.b.c.d.c.d<g>> arrayList = b.d.get(this.f1047a);
                if (arrayList == null) {
                    return;
                }
                b.d.remove(this.f1047a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).a(gVar);
                }
            }
        }
    }

    static class d implements Comparator<byte[]> {
        d() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            if (bArr.length == bArr2.length) {
                for (int i = 0; i < bArr.length; i++) {
                    if (bArr[i] != bArr2[i]) {
                        length = bArr[i];
                        length2 = bArr2[i];
                    }
                }
                return 0;
            }
            length = bArr.length;
            length2 = bArr2.length;
            return length - length2;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f[] f1049b;

        public e(int i, f[] fVarArr) {
            this.f1048a = i;
            this.f1049b = fVarArr;
        }

        public f[] a() {
            return this.f1049b;
        }

        public int b() {
            return this.f1048a;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f1050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1052c;
        private final boolean d;
        private final int e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            j.a(uri);
            this.f1050a = uri;
            this.f1051b = i;
            this.f1052c = i2;
            this.d = z;
            this.e = i3;
        }

        public int a() {
            return this.e;
        }

        public int b() {
            return this.f1051b;
        }

        public Uri c() {
            return this.f1050a;
        }

        public int d() {
            return this.f1052c;
        }

        public boolean e() {
            return this.d;
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f1053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f1054b;

        g(Typeface typeface, int i) {
            this.f1053a = typeface;
            this.f1054b = i;
        }
    }

    public static ProviderInfo a(PackageManager packageManager, b.b.c.d.a aVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strD = aVar.d();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strD, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strD);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(aVar.e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strD + ", but package was not " + aVar.e());
        }
        List<byte[]> listA = a(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listA, e);
        List<List<byte[]>> listA2 = a(aVar, resources);
        for (int i = 0; i < listA2.size(); i++) {
            ArrayList arrayList = new ArrayList(listA2.get(i));
            Collections.sort(arrayList, e);
            if (a(listA, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    public static Typeface a(Context context, b.b.c.d.a aVar, b.b.c.a.d.f.a aVar2, Handler handler, boolean z, int i, int i2) {
        String str = aVar.c() + "-" + i2;
        Typeface typefaceB = f1039a.b(str);
        if (typefaceB != null) {
            if (aVar2 != null) {
                aVar2.a(typefaceB);
            }
            return typefaceB;
        }
        if (z && i == -1) {
            g gVarA = a(context, aVar, i2);
            if (aVar2 != null) {
                int i3 = gVarA.f1054b;
                if (i3 == 0) {
                    aVar2.a(gVarA.f1053a, handler);
                } else {
                    aVar2.a(i3, handler);
                }
            }
            return gVarA.f1053a;
        }
        a aVar3 = new a(context, aVar, i2, str);
        if (z) {
            try {
                return ((g) f1040b.a(aVar3, i)).f1053a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        C0042b c0042b = aVar2 == null ? null : new C0042b(aVar2, handler);
        synchronized (f1041c) {
            if (d.containsKey(str)) {
                if (c0042b != null) {
                    d.get(str).add(c0042b);
                }
                return null;
            }
            if (c0042b != null) {
                ArrayList<b.b.c.d.c.d<g>> arrayList = new ArrayList<>();
                arrayList.add(c0042b);
                d.put(str, arrayList);
            }
            f1040b.a(aVar3, new c(str));
            return null;
        }
    }

    public static e a(Context context, CancellationSignal cancellationSignal, b.b.c.d.a aVar) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoA = a(context.getPackageManager(), aVar, context.getResources());
        return providerInfoA == null ? new e(1, null) : new e(0, a(context, aVar, providerInfoA.authority, cancellationSignal));
    }

    static g a(Context context, b.b.c.d.a aVar, int i) {
        try {
            e eVarA = a(context, (CancellationSignal) null, aVar);
            if (eVarA.b() != 0) {
                return new g(null, eVarA.b() == 1 ? -2 : -3);
            }
            Typeface typefaceA = b.b.c.b.c.a(context, null, eVarA.a(), i);
            return new g(typefaceA, typefaceA != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    private static List<List<byte[]>> a(b.b.c.d.a aVar, Resources resources) {
        return aVar.a() != null ? aVar.a() : b.b.c.a.d.c.a(resources, aVar.b());
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static Map<Uri, ByteBuffer> a(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri uriC = fVar.c();
                if (!map.containsKey(uriC)) {
                    map.put(uriC, i.a(context, cancellationSignal, uriC));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }

    private static boolean a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    static f[] a(Context context, b.b.c.d.a aVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursorQuery = null;
        try {
            cursorQuery = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null, cancellationSignal) : context.getContentResolver().query(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                while (cursorQuery.moveToNext()) {
                    int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                    arrayList2.add(new f(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (f[]) arrayList.toArray(new f[0]);
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }
}
