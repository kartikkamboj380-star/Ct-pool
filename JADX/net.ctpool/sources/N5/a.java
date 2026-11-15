package N5;

import M5.AbstractC0434k;
import i5.m;
import i5.n;
import i5.u;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import v5.l;
import v5.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    private static final void a(InterfaceC1885d interfaceC1885d, Throwable th) throws Throwable {
        m.a aVar = m.f19973m;
        interfaceC1885d.h(m.a(n.a(th)));
        throw th;
    }

    public static final void b(InterfaceC1885d interfaceC1885d, InterfaceC1885d interfaceC1885d2) throws Throwable {
        try {
            InterfaceC1885d interfaceC1885dB = AbstractC1930b.b(interfaceC1885d);
            m.a aVar = m.f19973m;
            AbstractC0434k.c(interfaceC1885dB, m.a(u.f19985a), null, 2, null);
        } catch (Throwable th) {
            a(interfaceC1885d2, th);
        }
    }

    public static final void c(p pVar, Object obj, InterfaceC1885d interfaceC1885d, l lVar) throws Throwable {
        try {
            InterfaceC1885d interfaceC1885dB = AbstractC1930b.b(AbstractC1930b.a(pVar, obj, interfaceC1885d));
            m.a aVar = m.f19973m;
            AbstractC0434k.b(interfaceC1885dB, m.a(u.f19985a), lVar);
        } catch (Throwable th) {
            a(interfaceC1885d, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, InterfaceC1885d interfaceC1885d, l lVar, int i7, Object obj2) throws Throwable {
        if ((i7 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, interfaceC1885d, lVar);
    }
}
