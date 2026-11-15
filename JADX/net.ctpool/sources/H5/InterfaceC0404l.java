package H5;

import m5.InterfaceC1885d;

/* JADX INFO: renamed from: H5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0404l extends InterfaceC1885d {

    /* JADX INFO: renamed from: H5.l$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC0404l interfaceC0404l, Throwable th, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i7 & 1) != 0) {
                th = null;
            }
            return interfaceC0404l.p(th);
        }
    }

    void c(Object obj, v5.l lVar);

    void k(v5.l lVar);

    boolean p(Throwable th);

    Object q(Object obj, Object obj2, v5.l lVar);

    void r(Object obj);
}
