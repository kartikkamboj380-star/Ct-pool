package M5;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f2067a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f2067a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
