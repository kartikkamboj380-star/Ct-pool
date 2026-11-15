package W0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static int a(int i7, int i8) {
        return ((i7 + 31) * 31) + i8;
    }

    public static int b(Object obj, Object obj2) {
        return a(obj == null ? 0 : obj.hashCode(), obj2 != null ? obj2.hashCode() : 0);
    }
}
