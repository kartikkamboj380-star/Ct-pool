package H5;

import M5.C0433j;
import i5.m;
import m5.InterfaceC1885d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(InterfaceC1885d interfaceC1885d) {
        Object objA;
        if (interfaceC1885d instanceof C0433j) {
            return interfaceC1885d.toString();
        }
        try {
            m.a aVar = i5.m.f19973m;
            objA = i5.m.a(interfaceC1885d + '@' + b(interfaceC1885d));
        } catch (Throwable th) {
            m.a aVar2 = i5.m.f19973m;
            objA = i5.m.a(i5.n.a(th));
        }
        if (i5.m.b(objA) != null) {
            objA = interfaceC1885d.getClass().getName() + '@' + b(interfaceC1885d);
        }
        return (String) objA;
    }
}
