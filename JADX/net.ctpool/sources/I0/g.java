package I0;

import I0.a;

/* JADX INFO: loaded from: classes.dex */
public class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static g f1509a;

    private g() {
    }

    public static synchronized g b() {
        try {
            if (f1509a == null) {
                f1509a = new g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1509a;
    }

    @Override // I0.a
    public void a(a.EnumC0026a enumC0026a, Class cls, String str, Throwable th) {
    }
}
