package H5;

import i5.m;
import m5.InterfaceC1885d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D {
    public static final Object a(Object obj, InterfaceC1885d interfaceC1885d) {
        if (obj instanceof C0423z) {
            m.a aVar = i5.m.f19973m;
            obj = i5.n.a(((C0423z) obj).f1476a);
        }
        return i5.m.a(obj);
    }

    public static final Object b(Object obj, InterfaceC0404l interfaceC0404l) {
        Throwable thB = i5.m.b(obj);
        return thB == null ? obj : new C0423z(thB, false, 2, null);
    }

    public static final Object c(Object obj, v5.l lVar) {
        Throwable thB = i5.m.b(obj);
        return thB == null ? lVar != null ? new A(obj, lVar) : obj : new C0423z(thB, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, v5.l lVar, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
