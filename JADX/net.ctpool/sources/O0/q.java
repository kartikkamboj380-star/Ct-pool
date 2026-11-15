package O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static RuntimeException a(Throwable th) throws Throwable {
        c((Throwable) l.g(th));
        throw new RuntimeException(th);
    }

    public static void b(Throwable th, Class cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void c(Throwable th) throws Throwable {
        b(th, Error.class);
        b(th, RuntimeException.class);
    }
}
