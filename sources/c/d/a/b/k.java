package c.d.a.b;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object a(Method method, Object obj, Object... objArr) {
        try {
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
