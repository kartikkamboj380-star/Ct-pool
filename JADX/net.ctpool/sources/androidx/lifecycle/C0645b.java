package androidx.lifecycle;

import androidx.lifecycle.AbstractC0651h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0645b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static C0645b f8337c = new C0645b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8338a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8339b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.b$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f8340a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f8341b;

        a(Map map) {
            this.f8341b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC0651h.b bVar = (AbstractC0651h.b) entry.getValue();
                List arrayList = (List) this.f8340a.get(bVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f8340a.put(bVar, arrayList);
                }
                arrayList.add((C0162b) entry.getKey());
            }
        }

        private static void b(List list, l lVar, AbstractC0651h.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0162b) list.get(size)).a(lVar, bVar, obj);
                }
            }
        }

        void a(l lVar, AbstractC0651h.b bVar, Object obj) {
            b((List) this.f8340a.get(bVar), lVar, bVar, obj);
            b((List) this.f8340a.get(AbstractC0651h.b.ON_ANY), lVar, bVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    static final class C0162b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f8342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f8343b;

        C0162b(int i7, Method method) {
            this.f8342a = i7;
            this.f8343b = method;
            method.setAccessible(true);
        }

        void a(l lVar, AbstractC0651h.b bVar, Object obj) {
            try {
                int i7 = this.f8342a;
                if (i7 == 0) {
                    this.f8343b.invoke(obj, null);
                } else if (i7 == 1) {
                    this.f8343b.invoke(obj, lVar);
                } else {
                    if (i7 != 2) {
                        return;
                    }
                    this.f8343b.invoke(obj, lVar, bVar);
                }
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException("Failed to call observer method", e8.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0162b)) {
                return false;
            }
            C0162b c0162b = (C0162b) obj;
            return this.f8342a == c0162b.f8342a && this.f8343b.getName().equals(c0162b.f8343b.getName());
        }

        public int hashCode() {
            return (this.f8342a * 31) + this.f8343b.getName().hashCode();
        }
    }

    C0645b() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i7;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f8341b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f8341b.entrySet()) {
                e(map, (C0162b) entry.getKey(), (AbstractC0651h.b) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            s sVar = (s) method.getAnnotation(s.class);
            if (sVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(l.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                AbstractC0651h.b bVarValue = sVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0651h.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (bVarValue != AbstractC0651h.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new C0162b(i7, method), bVarValue, cls);
                z6 = true;
            }
        }
        a aVar = new a(map);
        this.f8338a.put(cls, aVar);
        this.f8339b.put(cls, Boolean.valueOf(z6));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e7) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
        }
    }

    private void e(Map map, C0162b c0162b, AbstractC0651h.b bVar, Class cls) {
        AbstractC0651h.b bVar2 = (AbstractC0651h.b) map.get(c0162b);
        if (bVar2 == null || bVar == bVar2) {
            if (bVar2 == null) {
                map.put(c0162b, bVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0162b.f8343b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar2 + ", new value " + bVar);
    }

    a c(Class cls) {
        a aVar = (a) this.f8338a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f8339b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((s) method.getAnnotation(s.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f8339b.put(cls, Boolean.FALSE);
        return false;
    }
}
