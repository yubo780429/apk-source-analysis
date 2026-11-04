package b.b.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class i extends b.b.b.a.h {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f992c;
    private PorterDuffColorFilter d;
    private ColorFilter e;
    private boolean f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    private static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        private void a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f997b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f996a = b.b.c.b.b.a(string2);
            }
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (b.b.c.a.d.g.a(xmlPullParser, "pathData")) {
                TypedArray typedArrayA = b.b.c.a.d.g.a(resources, theme, attributeSet, b.b.b.a.a.d);
                a(typedArrayA);
                typedArrayA.recycle();
            }
        }

        @Override // b.b.b.a.i.f
        public boolean b() {
            return true;
        }
    }

    private static class c extends f {
        private int[] d;
        b.b.c.a.d.b e;
        float f;
        b.b.c.a.d.b g;
        float h;
        int i;
        float j;
        float k;
        float l;
        float m;
        Paint.Cap n;
        Paint.Join o;
        float p;

        public c() {
            this.f = 0.0f;
            this.h = 1.0f;
            this.i = 0;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        public c(c cVar) {
            super(cVar);
            this.f = 0.0f;
            this.h = 1.0f;
            this.i = 0;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.h = cVar.h;
            this.g = cVar.g;
            this.i = cVar.i;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        private Paint.Cap a(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join a(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.d = null;
            if (b.b.c.a.d.g.a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f997b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f996a = b.b.c.b.b.a(string2);
                }
                this.g = b.b.c.a.d.g.a(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.j = b.b.c.a.d.g.a(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
                this.n = a(b.b.c.a.d.g.b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = a(b.b.c.a.d.g.b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = b.b.c.a.d.g.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.e = b.b.c.a.d.g.a(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.h = b.b.c.a.d.g.a(typedArray, xmlPullParser, "strokeAlpha", 11, this.h);
                this.f = b.b.c.a.d.g.a(typedArray, xmlPullParser, "strokeWidth", 4, this.f);
                this.l = b.b.c.a.d.g.a(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
                this.m = b.b.c.a.d.g.a(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
                this.k = b.b.c.a.d.g.a(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
                this.i = b.b.c.a.d.g.b(typedArray, xmlPullParser, "fillType", 13, this.i);
            }
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayA = b.b.c.a.d.g.a(resources, theme, attributeSet, b.b.b.a.a.f980c);
            a(typedArrayA, xmlPullParser, theme);
            typedArrayA.recycle();
        }

        @Override // b.b.b.a.i.e
        public boolean a() {
            return this.g.d() || this.e.d();
        }

        @Override // b.b.b.a.i.e
        public boolean a(int[] iArr) {
            return this.e.a(iArr) | this.g.a(iArr);
        }

        float getFillAlpha() {
            return this.j;
        }

        int getFillColor() {
            return this.g.a();
        }

        float getStrokeAlpha() {
            return this.h;
        }

        int getStrokeColor() {
            return this.e.a();
        }

        float getStrokeWidth() {
            return this.f;
        }

        float getTrimPathEnd() {
            return this.l;
        }

        float getTrimPathOffset() {
            return this.m;
        }

        float getTrimPathStart() {
            return this.k;
        }

        void setFillAlpha(float f) {
            this.j = f;
        }

        void setFillColor(int i) {
            this.g.a(i);
        }

        void setStrokeAlpha(float f) {
            this.h = f;
        }

        void setStrokeColor(int i) {
            this.e.a(i);
        }

        void setStrokeWidth(float f) {
            this.f = f;
        }

        void setTrimPathEnd(float f) {
            this.l = f;
        }

        void setTrimPathOffset(float f) {
            this.m = f;
        }

        void setTrimPathStart(float f) {
            this.k = f;
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<e> f994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f995c;
        private float d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        final Matrix j;
        int k;
        private int[] l;
        private String m;

        public d() {
            super();
            this.f993a = new Matrix();
            this.f994b = new ArrayList<>();
            this.f995c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }

        public d(d dVar, b.b.c.f.a<String, Object> aVar) {
            f bVar;
            super();
            this.f993a = new Matrix();
            this.f994b = new ArrayList<>();
            this.f995c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
            this.f995c = dVar.f995c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.j.set(dVar.j);
            ArrayList<e> arrayList = dVar.f994b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.f994b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f994b.add(bVar);
                    String str2 = bVar.f997b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f995c = b.b.c.a.d.g.a(typedArray, xmlPullParser, "rotation", 5, this.f995c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = b.b.c.a.d.g.a(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = b.b.c.a.d.g.a(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = b.b.c.a.d.g.a(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = b.b.c.a.d.g.a(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            b();
        }

        private void b() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.f995c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayA = b.b.c.a.d.g.a(resources, theme, attributeSet, b.b.b.a.a.f979b);
            a(typedArrayA, xmlPullParser);
            typedArrayA.recycle();
        }

        @Override // b.b.b.a.i.e
        public boolean a() {
            for (int i = 0; i < this.f994b.size(); i++) {
                if (this.f994b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // b.b.b.a.i.e
        public boolean a(int[] iArr) {
            boolean zA = false;
            for (int i = 0; i < this.f994b.size(); i++) {
                zA |= this.f994b.get(i).a(iArr);
            }
            return zA;
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.f995c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f995c) {
                this.f995c = f;
                b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                b();
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean a(int[] iArr) {
            return false;
        }
    }

    private static abstract class f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected b.b.c.b.b.C0041b[] f996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f998c;

        public f() {
            super();
            this.f996a = null;
        }

        public f(f fVar) {
            super();
            this.f996a = null;
            this.f997b = fVar.f997b;
            this.f998c = fVar.f998c;
            this.f996a = b.b.c.b.b.a(fVar.f996a);
        }

        public void a(Path path) {
            path.reset();
            b.b.c.b.b.C0041b[] c0041bArr = this.f996a;
            if (c0041bArr != null) {
                b.b.c.b.b.C0041b.a(c0041bArr, path);
            }
        }

        public boolean b() {
            return false;
        }

        public b.b.c.b.b.C0041b[] getPathData() {
            return this.f996a;
        }

        public String getPathName() {
            return this.f997b;
        }

        public void setPathData(b.b.c.b.b.C0041b[] c0041bArr) {
            if (b.b.c.b.b.a(this.f996a, c0041bArr)) {
                b.b.c.b.b.b(this.f996a, c0041bArr);
            } else {
                this.f996a = b.b.c.b.b.a(c0041bArr);
            }
        }
    }

    private static class g {
        private static final Matrix q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f1000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f1001c;
        Paint d;
        Paint e;
        private PathMeasure f;
        private int g;
        final d h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final b.b.c.f.a<String, Object> p;

        public g() {
            this.f1001c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new b.b.c.f.a<>();
            this.h = new d();
            this.f999a = new Path();
            this.f1000b = new Path();
        }

        public g(g gVar) {
            this.f1001c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            b.b.c.f.a<String, Object> aVar = new b.b.c.f.a<>();
            this.p = aVar;
            this.h = new d(gVar.h, aVar);
            this.f999a = new Path(gVar.f999a);
            this.f1000b = new Path(gVar.f1000b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }

        private static float a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private float a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        private void a(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f993a.set(matrix);
            dVar.f993a.preConcat(dVar.j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f994b.size(); i3++) {
                e eVar = dVar.f994b.get(i3);
                if (eVar instanceof d) {
                    a((d) eVar, dVar.f993a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof f) {
                    a(dVar, (f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        private void a(d dVar, f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.k;
            float f2 = i2 / this.l;
            float fMin = Math.min(f, f2);
            Matrix matrix = dVar.f993a;
            this.f1001c.set(matrix);
            this.f1001c.postScale(f, f2);
            float fA = a(matrix);
            if (fA == 0.0f) {
                return;
            }
            fVar.a(this.f999a);
            Path path = this.f999a;
            this.f1000b.reset();
            if (fVar.b()) {
                this.f1000b.addPath(path, this.f1001c);
                canvas.clipPath(this.f1000b);
                return;
            }
            c cVar = (c) fVar;
            if (cVar.k != 0.0f || cVar.l != 1.0f) {
                float f3 = cVar.k;
                float f4 = cVar.m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (cVar.l + f4) % 1.0f;
                if (this.f == null) {
                    this.f = new PathMeasure();
                }
                this.f.setPath(this.f999a, false);
                float length = this.f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f.getSegment(f7, length, path, true);
                    this.f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f1000b.addPath(path, this.f1001c);
            if (cVar.g.e()) {
                b.b.c.a.d.b bVar = cVar.g;
                if (this.e == null) {
                    Paint paint = new Paint(1);
                    this.e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.e;
                if (bVar.c()) {
                    Shader shaderB = bVar.b();
                    shaderB.setLocalMatrix(this.f1001c);
                    paint2.setShader(shaderB);
                    paint2.setAlpha(Math.round(cVar.j * 255.0f));
                } else {
                    paint2.setColor(i.a(bVar.a(), cVar.j));
                }
                paint2.setColorFilter(colorFilter);
                this.f1000b.setFillType(cVar.i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f1000b, paint2);
            }
            if (cVar.e.e()) {
                b.b.c.a.d.b bVar2 = cVar.e;
                if (this.d == null) {
                    Paint paint3 = new Paint(1);
                    this.d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.d;
                Paint.Join join = cVar.o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.p);
                if (bVar2.c()) {
                    Shader shaderB2 = bVar2.b();
                    shaderB2.setLocalMatrix(this.f1001c);
                    paint4.setShader(shaderB2);
                    paint4.setAlpha(Math.round(cVar.h * 255.0f));
                } else {
                    paint4.setColor(i.a(bVar2.a(), cVar.h));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f * fMin * fA);
                canvas.drawPath(this.f1000b, paint4);
            }
        }

        public void a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            a(this.h, q, canvas, i, i2, colorFilter);
        }

        public boolean a() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean a(int[] iArr) {
            return this.h.a(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.m = i;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f1003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorStateList f1004c;
        PorterDuff.Mode d;
        boolean e;
        Bitmap f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public h() {
            this.f1004c = null;
            this.d = i.k;
            this.f1003b = new g();
        }

        public h(h hVar) {
            this.f1004c = null;
            this.d = i.k;
            if (hVar != null) {
                this.f1002a = hVar.f1002a;
                g gVar = new g(hVar.f1003b);
                this.f1003b = gVar;
                if (hVar.f1003b.e != null) {
                    gVar.e = new Paint(hVar.f1003b.e);
                }
                if (hVar.f1003b.d != null) {
                    this.f1003b.d = new Paint(hVar.f1003b.d);
                }
                this.f1004c = hVar.f1004c;
                this.d = hVar.d;
                this.e = hVar.e;
            }
        }

        public Paint a(ColorFilter colorFilter) {
            if (!b() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint = new Paint();
                this.l = paint;
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.f1003b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public void a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, a(colorFilter));
        }

        public boolean a() {
            return !this.k && this.g == this.f1004c && this.h == this.d && this.j == this.e && this.i == this.f1003b.getRootAlpha();
        }

        public boolean a(int i, int i2) {
            return i == this.f.getWidth() && i2 == this.f.getHeight();
        }

        public boolean a(int[] iArr) {
            boolean zA = this.f1003b.a(iArr);
            this.k |= zA;
            return zA;
        }

        public void b(int i, int i2) {
            if (this.f == null || !a(i, i2)) {
                this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public boolean b() {
            return this.f1003b.getRootAlpha() < 255;
        }

        public void c(int i, int i2) {
            this.f.eraseColor(0);
            this.f1003b.a(new Canvas(this.f), i, i2, (ColorFilter) null);
        }

        public boolean c() {
            return this.f1003b.a();
        }

        public void d() {
            this.g = this.f1004c;
            this.h = this.d;
            this.i = this.f1003b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1002a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }
    }

    /* JADX INFO: renamed from: b.b.b.a.i$i, reason: collision with other inner class name */
    private static class C0038i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f1005a;

        public C0038i(Drawable.ConstantState constantState) {
            this.f1005a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1005a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1005a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f991b = (VectorDrawable) this.f1005a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f991b = (VectorDrawable) this.f1005a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f991b = (VectorDrawable) this.f1005a.newDrawable(resources, theme);
            return iVar;
        }
    }

    i() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f992c = new h();
    }

    i(h hVar) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f992c = hVar;
        this.d = a(this.d, hVar.f1004c, hVar.d);
    }

    static int a(int i, float f2) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f2)) << 24);
    }

    private static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static i a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            i iVar = new i();
            iVar.f991b = b.b.c.a.d.f.a(resources, i, theme);
            new C0038i(iVar.f991b.getConstantState());
            return iVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return createFromXmlInner(resources, (XmlPullParser) xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        b bVar;
        f fVar;
        h hVar = this.f992c;
        g gVar = hVar.f1003b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f994b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    fVar = cVar;
                } else if ("clip-path".equals(name)) {
                    bVar = new b();
                    bVar.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f994b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar = bVar;
                        gVar.p.put(bVar.getPathName(), bVar);
                        fVar = bVar;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f994b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    i = hVar.f1002a;
                    i2 = dVar2.k;
                    hVar.f1002a = i2 | i;
                }
                fVar = bVar;
                i = hVar.f1002a;
                i2 = fVar.f998c;
                hVar.f1002a = i2 | i;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser) throws XmlPullParserException {
        h hVar = this.f992c;
        g gVar = hVar.f1003b;
        hVar.d = a(b.b.c.a.d.g.b(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            hVar.f1004c = colorStateList;
        }
        hVar.e = b.b.c.a.d.g.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.e);
        gVar.k = b.b.c.a.d.g.a(typedArray, xmlPullParser, "viewportWidth", 7, gVar.k);
        float fA = b.b.c.a.d.g.a(typedArray, xmlPullParser, "viewportHeight", 8, gVar.l);
        gVar.l = fA;
        if (gVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fA <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.i = typedArray.getDimension(3, gVar.i);
        float dimension = typedArray.getDimension(2, gVar.j);
        gVar.j = dimension;
        if (gVar.i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(b.b.c.a.d.g.a(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.n = string;
            gVar.p.put(string, gVar);
        }
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && android.support.v4.graphics.drawable.a.d(this) == 1;
    }

    public static i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    Object a(String str) {
        return this.f992c.f1003b.p.get(str);
    }

    void a(boolean z) {
        this.g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f991b;
        if (drawable == null) {
            return false;
        }
        android.support.v4.graphics.drawable.a.a(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.e;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.h);
        float fAbs = Math.abs(this.h[0]);
        float fAbs2 = Math.abs(this.h[4]);
        float fAbs3 = Math.abs(this.h[1]);
        float fAbs4 = Math.abs(this.h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.j.width() * fAbs);
        int iHeight = (int) (this.j.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.j;
        canvas.translate(rect.left, rect.top);
        if (a()) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        this.f992c.b(iMin, iMin2);
        if (!this.g) {
            this.f992c.c(iMin, iMin2);
        } else if (!this.f992c.a()) {
            this.f992c.c(iMin, iMin2);
            this.f992c.d();
        }
        this.f992c.a(canvas, colorFilter, this.j);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f991b;
        return drawable != null ? android.support.v4.graphics.drawable.a.b(drawable) : this.f992c.f1003b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f992c.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f991b != null && Build.VERSION.SDK_INT >= 24) {
            return new C0038i(this.f991b.getConstantState());
        }
        this.f992c.f1002a = getChangingConfigurations();
        return this.f992c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f991b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f992c.f1003b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f991b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f992c.f1003b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f992c;
        hVar.f1003b = new g();
        TypedArray typedArrayA = b.b.c.a.d.g.a(resources, theme, attributeSet, b.b.b.a.a.f978a);
        a(typedArrayA, xmlPullParser);
        typedArrayA.recycle();
        hVar.f1002a = getChangingConfigurations();
        hVar.k = true;
        a(resources, xmlPullParser, attributeSet, theme);
        this.d = a(this.d, hVar.f1004c, hVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f991b;
        return drawable != null ? android.support.v4.graphics.drawable.a.e(drawable) : this.f992c.e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f991b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f992c) != null && (hVar.c() || ((colorStateList = this.f992c.f1004c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.f992c = new h(this.f992c);
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f991b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f992c;
        ColorStateList colorStateList = hVar.f1004c;
        if (colorStateList != null && (mode = hVar.d) != null) {
            this.d = a(this.d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.c() || !hVar.a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f992c.f1003b.getRootAlpha() != i) {
            this.f992c.f1003b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, z);
        } else {
            this.f992c.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTint(int i) {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.b(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, colorStateList);
            return;
        }
        h hVar = this.f992c;
        if (hVar.f1004c != colorStateList) {
            hVar.f1004c = colorStateList;
            this.d = a(this.d, colorStateList, hVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, mode);
            return;
        }
        h hVar = this.f992c;
        if (hVar.d != mode) {
            hVar.d = mode;
            this.d = a(this.d, hVar.f1004c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f991b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f991b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
