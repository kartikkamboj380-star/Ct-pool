package P3;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f2601a;

    static synchronized e a(Context context) {
        try {
            if (f2601a == null) {
                g gVar = new g(null);
                gVar.b(new n(Q3.C.a(context)));
                f2601a = gVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2601a;
    }
}
