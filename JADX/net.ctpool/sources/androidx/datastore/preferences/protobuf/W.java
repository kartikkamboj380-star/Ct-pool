package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U f7563a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U f7564b = new V();

    static U a() {
        return f7563a;
    }

    static U b() {
        return f7564b;
    }

    private static U c() {
        try {
            return (U) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
