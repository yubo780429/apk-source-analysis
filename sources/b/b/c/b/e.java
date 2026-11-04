package b.b.c.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import b.b.c.f.k;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f1030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Constructor f1031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f1032c;
    private static final Method d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f1031b = constructor;
        f1030a = cls;
        f1032c = method2;
        d = method;
    }

    e() {
    }

    private static Typeface a(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f1030a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean a() {
        if (f1032c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f1032c != null;
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f1032c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static Object b() {
        try {
            return f1031b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // b.b.c.b.h
    public Typeface a(Context context, CancellationSignal cancellationSignal, b.b.c.d.b.f[] fVarArr, int i) {
        Object objB = b();
        k kVar = new k();
        for (b.b.c.d.b.f fVar : fVarArr) {
            Uri uriC = fVar.c();
            ByteBuffer byteBufferA = (ByteBuffer) kVar.get(uriC);
            if (byteBufferA == null) {
                byteBufferA = i.a(context, cancellationSignal, uriC);
                kVar.put(uriC, byteBufferA);
            }
            if (!a(objB, byteBufferA, fVar.b(), fVar.d(), fVar.e())) {
                return null;
            }
        }
        return Typeface.create(a(objB), i);
    }

    @Override // b.b.c.b.h
    public Typeface a(Context context, b.b.c.a.d.c.b bVar, Resources resources, int i) {
        Object objB = b();
        for (b.b.c.a.d.c.C0039c c0039c : bVar.a()) {
            ByteBuffer byteBufferA = i.a(context, resources, c0039c.b());
            if (byteBufferA == null || !a(objB, byteBufferA, c0039c.c(), c0039c.e(), c0039c.f())) {
                return null;
            }
        }
        return a(objB);
    }
}
