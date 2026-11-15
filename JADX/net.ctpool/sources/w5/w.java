package w5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x f22741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final D5.b[] f22742b;

    static {
        x xVar = null;
        try {
            xVar = (x) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (xVar == null) {
            xVar = new x();
        }
        f22741a = xVar;
        f22742b = new D5.b[0];
    }

    public static D5.d a(h hVar) {
        return f22741a.a(hVar);
    }

    public static D5.b b(Class cls) {
        return f22741a.b(cls);
    }

    public static D5.c c(Class cls) {
        return f22741a.c(cls, "");
    }

    public static D5.e d(n nVar) {
        return f22741a.d(nVar);
    }

    public static D5.f e(p pVar) {
        return f22741a.e(pVar);
    }

    public static String f(g gVar) {
        return f22741a.f(gVar);
    }

    public static String g(l lVar) {
        return f22741a.g(lVar);
    }
}
