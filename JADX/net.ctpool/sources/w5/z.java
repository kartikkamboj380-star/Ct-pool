package w5;

import i5.InterfaceC1746c;
import java.util.Collection;
import v5.InterfaceC2171a;
import x5.InterfaceC2227a;
import x5.InterfaceC2228b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z {
    public static Collection a(Object obj) {
        if ((obj instanceof InterfaceC2227a) && !(obj instanceof InterfaceC2228b)) {
            h(obj, "kotlin.collections.MutableCollection");
        }
        return c(obj);
    }

    public static Object b(Object obj, int i7) {
        if (obj != null && !e(obj, i7)) {
            h(obj, "kotlin.jvm.functions.Function" + i7);
        }
        return obj;
    }

    public static Collection c(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e7) {
            throw g(e7);
        }
    }

    public static int d(Object obj) {
        if (obj instanceof g) {
            return ((g) obj).getArity();
        }
        if (obj instanceof InterfaceC2171a) {
            return 0;
        }
        if (obj instanceof v5.l) {
            return 1;
        }
        if (obj instanceof v5.p) {
            return 2;
        }
        if (obj instanceof v5.q) {
            return 3;
        }
        return obj instanceof v5.r ? 4 : -1;
    }

    public static boolean e(Object obj, int i7) {
        return (obj instanceof InterfaceC1746c) && d(obj) == i7;
    }

    private static Throwable f(Throwable th) {
        return k.l(th, z.class.getName());
    }

    public static ClassCastException g(ClassCastException classCastException) {
        throw ((ClassCastException) f(classCastException));
    }

    public static void h(Object obj, String str) {
        i((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void i(String str) {
        throw g(new ClassCastException(str));
    }
}
