package b.b.c.a.d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static int a(int i, float f) {
        return (i & 16777215) | (Math.round(Color.alpha(i) * f) << 24);
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return a(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return b(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static TypedArray a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    private static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int i;
        int attributeCount;
        int i2;
        int[] iArrTrimStateSet;
        int attributeNameResource;
        int i3 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrA = new int[20];
        int i4 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i3 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayA = a(resources, theme, attributeSet, b.b.a.c.ColorStateListItem);
                int color = typedArrayA.getColor(b.b.a.c.ColorStateListItem_android_color, -65281);
                float f = 1.0f;
                if (typedArrayA.hasValue(b.b.a.c.ColorStateListItem_android_alpha)) {
                    i = b.b.a.c.ColorStateListItem_android_alpha;
                } else {
                    if (typedArrayA.hasValue(b.b.a.c.ColorStateListItem_alpha)) {
                        i = b.b.a.c.ColorStateListItem_alpha;
                    }
                    typedArrayA.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr2 = new int[attributeCount];
                    int i5 = 0;
                    for (i2 = 0; i2 < attributeCount; i2++) {
                        attributeNameResource = attributeSet.getAttributeNameResource(i2);
                        if (attributeNameResource == 16843173 && attributeNameResource != 16843551 && attributeNameResource != b.b.a.a.alpha) {
                            int i6 = i5 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr2[i5] = attributeNameResource;
                            i5 = i6;
                        }
                    }
                    iArrTrimStateSet = StateSet.trimStateSet(iArr2, i5);
                    int iA = a(color, f);
                    if (i4 != 0) {
                        int length = iArrTrimStateSet.length;
                    }
                    iArrA = e.a(iArrA, i4, iA);
                    iArr = (int[][]) e.a(iArr, i4, iArrTrimStateSet);
                    i4++;
                }
                f = typedArrayA.getFloat(i, 1.0f);
                typedArrayA.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i7 = 0;
                while (i2 < attributeCount) {
                    attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource == 16843173) {
                    }
                }
                iArrTrimStateSet = StateSet.trimStateSet(iArr3, i7);
                int iA2 = a(color, f);
                if (i4 != 0) {
                    int length2 = iArrTrimStateSet.length;
                }
                iArrA = e.a(iArrA, i4, iA2);
                iArr = (int[][]) e.a(iArr, i4, iArrTrimStateSet);
                i4++;
            }
            i3 = 1;
        }
        int[] iArr4 = new int[i4];
        int[][] iArr5 = new int[i4][];
        System.arraycopy(iArrA, 0, iArr4, 0, i4);
        System.arraycopy(iArr, 0, iArr5, 0, i4);
        return new ColorStateList(iArr5, iArr4);
    }
}
