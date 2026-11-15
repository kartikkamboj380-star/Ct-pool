package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0609d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f7580a = a("libcore.io.Memory");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f7581b;

    static {
        f7581b = a("org.robolectric.Robolectric") != null;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f7580a;
    }

    static boolean c() {
        return (f7580a == null || f7581b) ? false : true;
    }
}
