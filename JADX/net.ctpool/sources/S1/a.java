package S1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2922a = new a();

    private a() {
    }

    public static final boolean a() {
        return false;
    }

    public static final Class b(String str) {
        w5.k.f(str, "className");
        if (a()) {
            return Class.forName(str);
        }
        return null;
    }
}
