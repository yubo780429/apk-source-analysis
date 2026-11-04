package b.b.c.a.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
final class d {

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f1018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f1019b;

        a(int i, int i2) {
            this.f1018a = new int[]{i, i2};
            this.f1019b = new float[]{0.0f, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.f1018a = new int[]{i, i2, i3};
            this.f1019b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f1018a = new int[size];
            this.f1019b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f1018a[i] = list.get(i).intValue();
                this.f1019b[i] = list2.get(i).floatValue();
            }
        }
    }

    private static Shader.TileMode a(int i) {
        if (i != 1) {
            return i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    static Shader a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayA = g.a(resources, theme, attributeSet, b.b.a.c.GradientColor);
        float fA = g.a(typedArrayA, xmlPullParser, "startX", b.b.a.c.GradientColor_android_startX, 0.0f);
        float fA2 = g.a(typedArrayA, xmlPullParser, "startY", b.b.a.c.GradientColor_android_startY, 0.0f);
        float fA3 = g.a(typedArrayA, xmlPullParser, "endX", b.b.a.c.GradientColor_android_endX, 0.0f);
        float fA4 = g.a(typedArrayA, xmlPullParser, "endY", b.b.a.c.GradientColor_android_endY, 0.0f);
        float fA5 = g.a(typedArrayA, xmlPullParser, "centerX", b.b.a.c.GradientColor_android_centerX, 0.0f);
        float fA6 = g.a(typedArrayA, xmlPullParser, "centerY", b.b.a.c.GradientColor_android_centerY, 0.0f);
        int iB = g.b(typedArrayA, xmlPullParser, "type", b.b.a.c.GradientColor_android_type, 0);
        int iA = g.a(typedArrayA, xmlPullParser, "startColor", b.b.a.c.GradientColor_android_startColor, 0);
        boolean zA = g.a(xmlPullParser, "centerColor");
        int iA2 = g.a(typedArrayA, xmlPullParser, "centerColor", b.b.a.c.GradientColor_android_centerColor, 0);
        int iA3 = g.a(typedArrayA, xmlPullParser, "endColor", b.b.a.c.GradientColor_android_endColor, 0);
        int iB2 = g.b(typedArrayA, xmlPullParser, "tileMode", b.b.a.c.GradientColor_android_tileMode, 0);
        float fA7 = g.a(typedArrayA, xmlPullParser, "gradientRadius", b.b.a.c.GradientColor_android_gradientRadius, 0.0f);
        typedArrayA.recycle();
        a aVarA = a(b(resources, xmlPullParser, attributeSet, theme), iA, iA3, zA, iA2);
        if (iB != 1) {
            return iB != 2 ? new LinearGradient(fA, fA2, fA3, fA4, aVarA.f1018a, aVarA.f1019b, a(iB2)) : new SweepGradient(fA5, fA6, aVarA.f1018a, aVarA.f1019b);
        }
        if (fA7 > 0.0f) {
            return new RadialGradient(fA5, fA6, fA7, aVarA.f1018a, aVarA.f1019b, a(iB2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static a a(a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        return z ? new a(i, i3, i2) : new a(i, i2);
    }

    private static a b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayA = g.a(resources, theme, attributeSet, b.b.a.c.GradientColorItem);
                boolean zHasValue = typedArrayA.hasValue(b.b.a.c.GradientColorItem_android_color);
                boolean zHasValue2 = typedArrayA.hasValue(b.b.a.c.GradientColorItem_android_offset);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayA.getColor(b.b.a.c.GradientColorItem_android_color, 0);
                float f = typedArrayA.getFloat(b.b.a.c.GradientColorItem_android_offset, 0.0f);
                typedArrayA.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }
}
