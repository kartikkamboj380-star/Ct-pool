package L0;

/* JADX INFO: loaded from: classes.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f1955a;

    private c() {
    }

    public static synchronized c b() {
        try {
            if (f1955a == null) {
                f1955a = new c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1955a;
    }

    @Override // L0.b
    public void a(a aVar) {
    }
}
