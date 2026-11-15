package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final J f7538a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final J f7539b = new K();

    static J a() {
        return f7538a;
    }

    static J b() {
        return f7539b;
    }

    private static J c() {
        try {
            return (J) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
