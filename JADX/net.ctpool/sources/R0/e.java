package R0;

/* JADX INFO: loaded from: classes.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f2828a;

    public static synchronized e b() {
        try {
            if (f2828a == null) {
                f2828a = new e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2828a;
    }

    @Override // R0.d
    public void a(c cVar) {
    }
}
