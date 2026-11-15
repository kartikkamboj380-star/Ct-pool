package H4;

/* JADX INFO: loaded from: classes.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f1375a;

    private b() {
    }

    public static b a() {
        if (f1375a == null) {
            f1375a = new b();
        }
        return f1375a;
    }

    @Override // H4.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
