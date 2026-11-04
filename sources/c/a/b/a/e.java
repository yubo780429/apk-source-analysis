package c.a.b.a;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class e {

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    public static String a(byte[] bArr) {
        byte[] bArrA = c.a.b.e.a.g.a();
        return new String(c.a.b.e.a.c.a(bArrA, bArrA, bArr));
    }

    public static Method a(Class cls, String str, Class[] clsArr) throws NoSuchMethodException {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
