package androidx.lifecycle;

import android.app.Application;
import j5.AbstractC1803h;
import j5.AbstractC1809n;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f8279a = AbstractC1809n.k(Application.class, x.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f8280b = AbstractC1809n.d(x.class);

    public static final Constructor c(Class cls, List list) {
        w5.k.f(cls, "modelClass");
        w5.k.f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        w5.k.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            w5.k.e(parameterTypes, "constructor.parameterTypes");
            List listF = AbstractC1803h.F(parameterTypes);
            if (w5.k.b(list, listF)) {
                return constructor;
            }
            if (list.size() == listF.size() && listF.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final E d(Class cls, Constructor constructor, Object... objArr) {
        w5.k.f(cls, "modelClass");
        w5.k.f(constructor, "constructor");
        w5.k.f(objArr, "params");
        try {
            return (E) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e9.getCause());
        }
    }
}
