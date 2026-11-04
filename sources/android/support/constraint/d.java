package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SparseArray<a> f423a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SparseArray<e> f424b = new SparseArray<>();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<b> f426b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f427c;
        e d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f427c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == k.State_android_id) {
                    this.f425a = typedArrayObtainStyledAttributes.getResourceId(index, this.f425a);
                } else if (index == k.State_constraints) {
                    this.f427c = typedArrayObtainStyledAttributes.getResourceId(index, this.f427c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f427c);
                    context.getResources().getResourceName(this.f427c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.d = eVar;
                        eVar.a(context, this.f427c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f426b.add(bVar);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f430c;
        float d;
        int e;
        e f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f428a = Float.NaN;
            this.f429b = Float.NaN;
            this.f430c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == k.Variant_constraints) {
                    this.e = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f = eVar;
                        eVar.a(context, this.e);
                    }
                } else if (index == k.Variant_region_heightLessThan) {
                    this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
                } else if (index == k.Variant_region_heightMoreThan) {
                    this.f429b = typedArrayObtainStyledAttributes.getDimension(index, this.f429b);
                } else if (index == k.Variant_region_widthLessThan) {
                    this.f430c = typedArrayObtainStyledAttributes.getDimension(index, this.f430c);
                } else if (index == k.Variant_region_widthMoreThan) {
                    this.f428a = typedArrayObtainStyledAttributes.getDimension(index, this.f428a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i) {
        a(context, i);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    byte b2 = -1;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b2 = 4;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b2 = 2;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b2 = 1;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b2 = 0;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b2 = 3;
                            }
                            break;
                    }
                    if (b2 != 0 && b2 != 1) {
                        if (b2 == 2) {
                            aVar = new a(context, xml);
                            this.f423a.put(aVar.f425a, aVar);
                        } else if (b2 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (b2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            a(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    private void a(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue == null || attributeValue.length() <= 1) {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    } else {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    }
                }
                eVar.a(context, xmlPullParser);
                this.f424b.put(identifier, eVar);
                return;
            }
        }
    }

    public void a(g gVar) {
    }
}
