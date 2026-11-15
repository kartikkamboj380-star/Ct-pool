package O1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(boolean z6) {
        if (!z6) {
            throw new AssertionError();
        }
    }

    public static void b(boolean z6, String str) {
        if (!z6) {
            throw new AssertionError(str);
        }
    }

    public static Object c(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new AssertionError();
    }

    public static Object d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new AssertionError(str);
    }

    public static Object e(Object obj) {
        return obj;
    }
}
