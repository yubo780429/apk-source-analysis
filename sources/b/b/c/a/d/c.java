package b.b.c.a.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    public interface a {
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0039c[] f1011a;

        public b(C0039c[] c0039cArr) {
            this.f1011a = c0039cArr;
        }

        public C0039c[] a() {
            return this.f1011a;
        }
    }

    /* JADX INFO: renamed from: b.b.c.a.d.c$c, reason: collision with other inner class name */
    public static final class C0039c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1014c;
        private String d;
        private int e;
        private int f;

        public C0039c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f1012a = str;
            this.f1013b = i;
            this.f1014c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }

        public String a() {
            return this.f1012a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.f1013b;
        }

        public boolean f() {
            return this.f1014c;
        }
    }

    public static final class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b.b.c.d.a f1015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1017c;

        public d(b.b.c.d.a aVar, int i, int i2) {
            this.f1015a = aVar;
            this.f1017c = i;
            this.f1016b = i2;
        }

        public int a() {
            return this.f1017c;
        }

        public b.b.c.d.a b() {
            return this.f1015a;
        }

        public int c() {
            return this.f1016b;
        }
    }

    private static int a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static a a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(a(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static List<byte[]> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    private static void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return c(xmlPullParser, resources);
        }
        a(xmlPullParser);
        return null;
    }

    private static a c(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.b.a.c.FontFamily);
        String string = typedArrayObtainAttributes.getString(b.b.a.c.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(b.b.a.c.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(b.b.a.c.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(b.b.a.c.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(b.b.a.c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(b.b.a.c.FontFamily_fontProviderFetchTimeout, 500);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                a(xmlPullParser);
            }
            return new d(new b.b.c.d.a(string, string2, string3, a(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(d(xmlPullParser, resources));
                } else {
                    a(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((C0039c[]) arrayList.toArray(new C0039c[arrayList.size()]));
    }

    private static C0039c d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.b.a.c.FontFamilyFont);
        int i = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(b.b.a.c.FontFamilyFont_fontWeight) ? b.b.a.c.FontFamilyFont_fontWeight : b.b.a.c.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(b.b.a.c.FontFamilyFont_fontStyle) ? b.b.a.c.FontFamilyFont_fontStyle : b.b.a.c.FontFamilyFont_android_fontStyle, 0);
        int i2 = typedArrayObtainAttributes.hasValue(b.b.a.c.FontFamilyFont_ttcIndex) ? b.b.a.c.FontFamilyFont_ttcIndex : b.b.a.c.FontFamilyFont_android_ttcIndex;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(b.b.a.c.FontFamilyFont_fontVariationSettings) ? b.b.a.c.FontFamilyFont_fontVariationSettings : b.b.a.c.FontFamilyFont_android_fontVariationSettings);
        int i3 = typedArrayObtainAttributes.getInt(i2, 0);
        int i4 = typedArrayObtainAttributes.hasValue(b.b.a.c.FontFamilyFont_font) ? b.b.a.c.FontFamilyFont_font : b.b.a.c.FontFamilyFont_android_font;
        int resourceId = typedArrayObtainAttributes.getResourceId(i4, 0);
        String string2 = typedArrayObtainAttributes.getString(i4);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        return new C0039c(string2, i, z, string, i3, resourceId);
    }
}
