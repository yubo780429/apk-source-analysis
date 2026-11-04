package b.b.c.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Class f1033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Constructor f1034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Method f1035c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;

    public f() throws NoSuchMethodException {
        Method methodD;
        Constructor constructorE;
        Method methodB;
        Method methodC;
        Method methodF;
        Method methodA;
        Class cls = null;
        try {
            Class clsA = a();
            constructorE = e(clsA);
            methodB = b(clsA);
            methodC = c(clsA);
            methodF = f(clsA);
            methodA = a(clsA);
            methodD = d(clsA);
            cls = clsA;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            methodD = null;
            constructorE = null;
            methodB = null;
            methodC = null;
            methodF = null;
            methodA = null;
        }
        this.f1033a = cls;
        this.f1034b = constructorE;
        this.f1035c = methodB;
        this.d = methodC;
        this.e = methodF;
        this.f = methodA;
        this.g = methodD;
    }

    private boolean a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1035c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private void b(Object obj) {
        try {
            this.f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean b() {
        if (this.f1035c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1035c != null;
    }

    private Object c() {
        try {
            return this.f1034b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean c(Object obj) {
        try {
            return ((Boolean) this.e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // b.b.c.b.h
    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        if (!b()) {
            return super.a(context, resources, i, str, i2);
        }
        Object objC = c();
        if (!a(context, objC, str, 0, -1, -1, null)) {
            b(objC);
            return null;
        }
        if (c(objC)) {
            return a(objC);
        }
        return null;
    }

    @Override // b.b.c.b.d, b.b.c.b.h
    public Typeface a(Context context, CancellationSignal cancellationSignal, b.b.c.d.b.f[] fVarArr, int i) {
        if (fVarArr.length < 1) {
            return null;
        }
        if (b()) {
            Map<Uri, ByteBuffer> mapA = b.b.c.d.b.a(context, fVarArr, cancellationSignal);
            Object objC = c();
            boolean z = false;
            for (b.b.c.d.b.f fVar : fVarArr) {
                ByteBuffer byteBuffer = mapA.get(fVar.c());
                if (byteBuffer != null) {
                    if (!a(objC, byteBuffer, fVar.b(), fVar.d(), fVar.e() ? 1 : 0)) {
                        b(objC);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                b(objC);
                return null;
            }
            if (c(objC)) {
                return Typeface.create(a(objC), i);
            }
            return null;
        }
        b.b.c.d.b.f fVarA = a(fVarArr, i);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(fVarA.c(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(fVarA.d()).setItalic(fVarA.e()).build();
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return typefaceBuild;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // b.b.c.b.h
    public Typeface a(Context context, b.b.c.a.d.c.b bVar, Resources resources, int i) {
        if (!b()) {
            return super.a(context, bVar, resources, i);
        }
        Object objC = c();
        for (b.b.c.a.d.c.C0039c c0039c : bVar.a()) {
            if (!a(context, objC, c0039c.a(), c0039c.c(), c0039c.e(), c0039c.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0039c.d()))) {
                b(objC);
                return null;
            }
        }
        if (c(objC)) {
            return a(objC);
        }
        return null;
    }

    protected Typeface a(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f1033a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.g.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    protected Class a() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Method a(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method b(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method c(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method d(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Constructor e(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    protected Method f(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
