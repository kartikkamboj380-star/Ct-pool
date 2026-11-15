package b4;

/* JADX INFO: renamed from: b4.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0683D {
    public static void a(boolean z6, String str) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Object b(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z6, String str) {
        if (!z6) {
            throw new IllegalStateException(str);
        }
    }
}
