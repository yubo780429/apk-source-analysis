package android.arch.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static a f383c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class, C0022a> f384a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class, Boolean> f385b = new HashMap();

    /* JADX INFO: renamed from: android.arch.lifecycle.a$a, reason: collision with other inner class name */
    static class C0022a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<c.a, List<b>> f386a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<b, c.a> f387b;

        C0022a(Map<b, c.a> map) {
            this.f387b = map;
            for (Map.Entry<b, c.a> entry : map.entrySet()) {
                c.a value = entry.getValue();
                List<b> arrayList = this.f386a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f386a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void a(List<b> list, e eVar, c.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(eVar, aVar, obj);
                }
            }
        }

        void a(e eVar, c.a aVar, Object obj) {
            a(this.f386a.get(aVar), eVar, aVar, obj);
            a(this.f386a.get(c.a.ON_ANY), eVar, aVar, obj);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f389b;

        b(int i, Method method) {
            this.f388a = i;
            this.f389b = method;
            method.setAccessible(true);
        }

        void a(e eVar, c.a aVar, Object obj) {
            try {
                int i = this.f388a;
                if (i == 0) {
                    this.f389b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f389b.invoke(obj, eVar);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.f389b.invoke(obj, eVar, aVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f388a == bVar.f388a && this.f389b.getName().equals(bVar.f389b.getName());
        }

        public int hashCode() {
            return (this.f388a * 31) + this.f389b.getName().hashCode();
        }
    }

    a() {
    }

    private C0022a a(Class cls, Method[] methodArr) {
        int i;
        C0022a c0022aA;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0022aA = a(superclass)) != null) {
            map.putAll(c0022aA.f387b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, c.a> entry : a(cls2).f387b.entrySet()) {
                a(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            l lVar = (l) method.getAnnotation(l.class);
            if (lVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(e.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                c.a aVarValue = lVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(c.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != c.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                a(map, new b(i, method), aVarValue, cls);
                z = true;
            }
        }
        C0022a c0022a = new C0022a(map);
        this.f384a.put(cls, c0022a);
        this.f385b.put(cls, Boolean.valueOf(z));
        return c0022a;
    }

    private void a(Map<b, c.a> map, b bVar, c.a aVar, Class cls) {
        c.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f389b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    private Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    C0022a a(Class cls) {
        C0022a c0022a = this.f384a.get(cls);
        return c0022a != null ? c0022a : a(cls, null);
    }

    boolean b(Class cls) {
        if (this.f385b.containsKey(cls)) {
            return this.f385b.get(cls).booleanValue();
        }
        Method[] methodArrC = c(cls);
        for (Method method : methodArrC) {
            if (((l) method.getAnnotation(l.class)) != null) {
                a(cls, methodArrC);
                return true;
            }
        }
        this.f385b.put(cls, false);
        return false;
    }
}
