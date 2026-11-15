package q5;

import j5.AbstractC1803h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w5.k;

/* JADX INFO: renamed from: q5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2001a {

    /* JADX INFO: renamed from: q5.a$a, reason: collision with other inner class name */
    private static final class C0306a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0306a f21890a = new C0306a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f21891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f21892c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            k.c(methods);
            int length = methods.length;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                method = null;
                if (i8 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i8];
                if (k.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    k.e(parameterTypes, "getParameterTypes(...)");
                    if (k.b(AbstractC1803h.D(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i8++;
            }
            f21891b = method2;
            int length2 = methods.length;
            while (true) {
                if (i7 >= length2) {
                    break;
                }
                Method method3 = methods[i7];
                if (k.b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i7++;
            }
            f21892c = method;
        }

        private C0306a() {
        }
    }

    public void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        k.f(th, "cause");
        k.f(th2, "exception");
        Method method = C0306a.f21891b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public A5.c b() {
        return new A5.b();
    }
}
