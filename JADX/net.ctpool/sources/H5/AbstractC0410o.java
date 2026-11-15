package H5;

import M5.C0433j;
import m5.InterfaceC1885d;

/* JADX INFO: renamed from: H5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0410o {
    public static final void a(InterfaceC0404l interfaceC0404l, X x6) {
        interfaceC0404l.k(new Y(x6));
    }

    public static final C0406m b(InterfaceC1885d interfaceC1885d) {
        if (!(interfaceC1885d instanceof C0433j)) {
            return new C0406m(interfaceC1885d, 1);
        }
        C0406m c0406mN = ((C0433j) interfaceC1885d).n();
        if (c0406mN != null) {
            if (!c0406mN.M()) {
                c0406mN = null;
            }
            if (c0406mN != null) {
                return c0406mN;
            }
        }
        return new C0406m(interfaceC1885d, 2);
    }
}
