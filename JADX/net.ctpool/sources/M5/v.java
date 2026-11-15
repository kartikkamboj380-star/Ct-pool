package M5;

import H5.B0;
import i5.C1747d;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v {
    private static final w a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        d();
        throw new C1747d();
    }

    static /* synthetic */ w b(Throwable th, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th = null;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(B0 b02) {
        return b02.S0() instanceof w;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final B0 e(t tVar, List list) {
        try {
            return tVar.b(list);
        } catch (Throwable th) {
            return a(th, tVar.a());
        }
    }
}
