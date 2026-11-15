package P0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f2556a = b.l();

    public static void A(Class cls, String str, Object... objArr) {
        if (f2556a.j(2)) {
            f2556a.e(o(cls), n(str, objArr));
        }
    }

    public static void B(String str, String str2, Object... objArr) {
        if (f2556a.j(2)) {
            f2556a.e(str, n(str2, objArr));
        }
    }

    public static void C(Class cls, String str) {
        if (f2556a.j(5)) {
            f2556a.b(o(cls), str);
        }
    }

    public static void D(Class cls, String str, Throwable th) {
        if (f2556a.j(5)) {
            f2556a.c(o(cls), str, th);
        }
    }

    public static void E(Class cls, String str, Object... objArr) {
        if (f2556a.j(5)) {
            f2556a.b(o(cls), n(str, objArr));
        }
    }

    public static void F(Class cls, Throwable th, String str, Object... objArr) {
        if (u(5)) {
            D(cls, n(str, objArr), th);
        }
    }

    public static void G(String str, String str2) {
        if (f2556a.j(5)) {
            f2556a.b(str, str2);
        }
    }

    public static void H(String str, String str2, Throwable th) {
        if (f2556a.j(5)) {
            f2556a.c(str, str2, th);
        }
    }

    public static void I(String str, String str2, Object... objArr) {
        if (f2556a.j(5)) {
            f2556a.b(str, n(str2, objArr));
        }
    }

    public static void J(String str, Throwable th, String str2, Object... objArr) {
        if (f2556a.j(5)) {
            f2556a.c(str, n(str2, objArr), th);
        }
    }

    public static void K(Class cls, String str, Throwable th) {
        if (f2556a.j(6)) {
            f2556a.a(o(cls), str, th);
        }
    }

    public static void L(String str, String str2, Throwable th) {
        if (f2556a.j(6)) {
            f2556a.a(str, str2, th);
        }
    }

    public static void M(String str, String str2, Object... objArr) {
        if (f2556a.j(6)) {
            f2556a.f(str, n(str2, objArr));
        }
    }

    public static void a(Class cls, String str, Object obj) {
        if (f2556a.j(3)) {
            f2556a.h(o(cls), n(str, obj));
        }
    }

    public static void b(String str, String str2) {
        if (f2556a.j(3)) {
            f2556a.h(str, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        if (f2556a.j(3)) {
            f2556a.h(str, n(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (f2556a.j(3)) {
            f2556a.h(str, n(str2, obj, obj2));
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (f2556a.j(3)) {
            f2556a.i(str, str2, th);
        }
    }

    public static void f(Class cls, String str) {
        if (f2556a.j(6)) {
            f2556a.d(o(cls), str);
        }
    }

    public static void g(Class cls, String str, Throwable th) {
        if (f2556a.j(6)) {
            f2556a.g(o(cls), str, th);
        }
    }

    public static void h(Class cls, String str, Object... objArr) {
        if (f2556a.j(6)) {
            f2556a.d(o(cls), n(str, objArr));
        }
    }

    public static void i(Class cls, Throwable th, String str, Object... objArr) {
        if (f2556a.j(6)) {
            f2556a.g(o(cls), n(str, objArr), th);
        }
    }

    public static void j(String str, String str2) {
        if (f2556a.j(6)) {
            f2556a.d(str, str2);
        }
    }

    public static void k(String str, String str2, Throwable th) {
        if (f2556a.j(6)) {
            f2556a.g(str, str2, th);
        }
    }

    public static void l(String str, String str2, Object... objArr) {
        if (f2556a.j(6)) {
            f2556a.d(str, n(str2, objArr));
        }
    }

    public static void m(String str, Throwable th, String str2, Object... objArr) {
        if (f2556a.j(6)) {
            f2556a.g(str, n(str2, objArr), th);
        }
    }

    private static String n(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    private static String o(Class cls) {
        return cls.getSimpleName();
    }

    public static void p(String str, String str2) {
        if (f2556a.j(4)) {
            f2556a.k(str, str2);
        }
    }

    public static void q(String str, String str2, Object obj, Object obj2) {
        if (f2556a.j(4)) {
            f2556a.k(str, n(str2, obj, obj2));
        }
    }

    public static void r(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f2556a.j(4)) {
            f2556a.k(str, n(str2, obj, obj2, obj3));
        }
    }

    public static void s(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f2556a.j(4)) {
            f2556a.k(str, n(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void t(String str, String str2, Object... objArr) {
        if (f2556a.j(4)) {
            f2556a.k(str, n(str2, objArr));
        }
    }

    public static boolean u(int i7) {
        return f2556a.j(i7);
    }

    public static void v(Class cls, String str) {
        if (f2556a.j(2)) {
            f2556a.e(o(cls), str);
        }
    }

    public static void w(Class cls, String str, Object obj) {
        if (f2556a.j(2)) {
            f2556a.e(o(cls), n(str, obj));
        }
    }

    public static void x(Class cls, String str, Object obj, Object obj2) {
        if (f2556a.j(2)) {
            f2556a.e(o(cls), n(str, obj, obj2));
        }
    }

    public static void y(Class cls, String str, Object obj, Object obj2, Object obj3) {
        if (u(2)) {
            v(cls, n(str, obj, obj2, obj3));
        }
    }

    public static void z(Class cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f2556a.j(2)) {
            f2556a.e(o(cls), n(str, obj, obj2, obj3, obj4));
        }
    }
}
