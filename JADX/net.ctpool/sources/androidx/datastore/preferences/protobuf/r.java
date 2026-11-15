package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC0621p f7703a = new C0622q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC0621p f7704b = c();

    static AbstractC0621p a() {
        AbstractC0621p abstractC0621p = f7704b;
        if (abstractC0621p != null) {
            return abstractC0621p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC0621p b() {
        return f7703a;
    }

    private static AbstractC0621p c() {
        try {
            return (AbstractC0621p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
