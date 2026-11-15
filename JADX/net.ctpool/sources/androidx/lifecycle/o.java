package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map f8365a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map f8366b = new HashMap();

    private static InterfaceC0649f a(Constructor constructor, Object obj) {
        try {
            androidx.appcompat.app.y.a(constructor.newInstance(obj));
            return null;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    private static Constructor b(Class cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strC = c(canonicalName);
            if (!name.isEmpty()) {
                strC = name + "." + strC;
            }
            Constructor<?> declaredConstructor = Class.forName(strC).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    private static int d(Class cls) {
        Integer num = (Integer) f8365a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        f8365a.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private static boolean e(Class cls) {
        return cls != null && InterfaceC0654k.class.isAssignableFrom(cls);
    }

    static InterfaceC0653j f(Object obj) {
        boolean z6 = obj instanceof InterfaceC0653j;
        boolean z7 = obj instanceof InterfaceC0648e;
        if (z6 && z7) {
            return new FullLifecycleObserverAdapter((InterfaceC0648e) obj, (InterfaceC0653j) obj);
        }
        if (z7) {
            return new FullLifecycleObserverAdapter((InterfaceC0648e) obj, null);
        }
        if (z6) {
            return (InterfaceC0653j) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f8366b.get(cls);
        if (list.size() == 1) {
            a((Constructor) list.get(0), obj);
            return new SingleGeneratedAdapterObserver(null);
        }
        InterfaceC0649f[] interfaceC0649fArr = new InterfaceC0649f[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            a((Constructor) list.get(i7), obj);
            interfaceC0649fArr[i7] = null;
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC0649fArr);
    }

    private static int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f8366b.put(cls, Collections.singletonList(constructorB));
            return 2;
        }
        if (C0645b.f8337c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (!e(superclass)) {
            arrayList = null;
        } else {
            if (d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList((Collection) f8366b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (e(cls2)) {
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll((Collection) f8366b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f8366b.put(cls, arrayList);
        return 2;
    }
}
