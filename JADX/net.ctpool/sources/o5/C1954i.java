package o5;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: o5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1954i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1954i f21490a = new C1954i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f21491b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f21492c;

    /* JADX INFO: renamed from: o5.i$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f21493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f21494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f21495c;

        public a(Method method, Method method2, Method method3) {
            this.f21493a = method;
            this.f21494b = method2;
            this.f21495c = method3;
        }
    }

    private C1954i() {
    }

    private final a a(AbstractC1946a abstractC1946a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), abstractC1946a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC1946a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f21492c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f21491b;
            f21492c = aVar2;
            return aVar2;
        }
    }

    public final String b(AbstractC1946a abstractC1946a) {
        w5.k.f(abstractC1946a, "continuation");
        a aVarA = f21492c;
        if (aVarA == null) {
            aVarA = a(abstractC1946a);
        }
        if (aVarA == f21491b) {
            return null;
        }
        Method method = aVarA.f21493a;
        Object objInvoke = method != null ? method.invoke(abstractC1946a.getClass(), null) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = aVarA.f21494b;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = aVarA.f21495c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
