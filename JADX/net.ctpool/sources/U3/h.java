package U3;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    private static String a(int i7, int i8, String str) {
        if (i7 < 0) {
            return j.a("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return j.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String b(int i7, int i8, String str) {
        if (i7 < 0) {
            return j.a("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return j.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String c(int i7, int i8, int i9) {
        return (i7 < 0 || i7 > i9) ? b(i7, i9, "start index") : (i8 < 0 || i8 > i9) ? b(i8, i9, "end index") : j.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
    }

    public static void d(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z6, String str, int i7, int i8) {
        if (!z6) {
            throw new IllegalArgumentException(j.a(str, Integer.valueOf(i7), Integer.valueOf(i8)));
        }
    }

    public static int g(int i7, int i8) {
        return h(i7, i8, "index");
    }

    public static int h(int i7, int i8, String str) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(a(i7, i8, str));
        }
        return i7;
    }

    public static Object i(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object j(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int k(int i7, int i8) {
        return l(i7, i8, "index");
    }

    public static int l(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(b(i7, i8, str));
        }
        return i7;
    }

    public static void m(int i7, int i8, int i9) {
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            throw new IndexOutOfBoundsException(c(i7, i8, i9));
        }
    }

    public static void n(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    public static void o(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void p(boolean z6, String str, Object obj) {
        if (!z6) {
            throw new IllegalStateException(j.a(str, obj));
        }
    }
}
