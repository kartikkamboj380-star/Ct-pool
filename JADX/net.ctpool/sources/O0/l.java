package O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    private static String a(int i7, int i8, String str) {
        if (i7 < 0) {
            return k("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return k("%s (%s) must be less than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException("negative size: " + i8);
    }

    public static void b(Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void d(boolean z6, String str, Object... objArr) {
        if (!z6) {
            throw new IllegalArgumentException(k(str, objArr));
        }
    }

    public static int e(int i7, int i8) {
        return f(i7, i8, "index");
    }

    public static int f(int i7, int i8, String str) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(a(i7, i8, str));
        }
        return i7;
    }

    public static Object g(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object h(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void i(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    public static void j(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    static String k(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i7 = 0;
        int i8 = 0;
        while (i7 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i8)) != -1) {
            sb.append(strValueOf.substring(i8, iIndexOf));
            sb.append(objArr[i7]);
            i8 = iIndexOf + 2;
            i7++;
        }
        sb.append(strValueOf.substring(i8));
        if (i7 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i7]);
            for (int i9 = i7 + 1; i9 < objArr.length; i9++) {
                sb.append(", ");
                sb.append(objArr[i9]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
