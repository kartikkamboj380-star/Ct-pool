package b4;

import java.util.Set;

/* JADX INFO: renamed from: b4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0689d {
    default Object a(Class cls) {
        return e(C0684E.b(cls));
    }

    default D4.b b(Class cls) {
        return f(C0684E.b(cls));
    }

    D4.b c(C0684E c0684e);

    default Set d(C0684E c0684e) {
        return (Set) c(c0684e).get();
    }

    default Object e(C0684E c0684e) {
        D4.b bVarF = f(c0684e);
        if (bVarF == null) {
            return null;
        }
        return bVarF.get();
    }

    D4.b f(C0684E c0684e);

    default Set g(Class cls) {
        return d(C0684E.b(cls));
    }

    D4.a h(C0684E c0684e);

    default D4.a i(Class cls) {
        return h(C0684E.b(cls));
    }
}
