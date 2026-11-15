package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0619n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f7663a = c();

    public static C0620o a() {
        if (f7663a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C0620o.f7667e;
    }

    private static final C0620o b(String str) {
        return (C0620o) f7663a.getDeclaredMethod(str, null).invoke(null, null);
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
