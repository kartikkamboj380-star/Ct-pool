package H5;

import m5.C1889h;
import m5.InterfaceC1886e;
import m5.InterfaceC1888g;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: H5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0396h {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InterfaceC1888g interfaceC1888g, v5.p pVar) {
        AbstractC0383a0 abstractC0383a0A;
        C0401j0 c0401j0;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC1886e interfaceC1886e = (InterfaceC1886e) interfaceC1888g.b(InterfaceC1886e.f21264l);
        if (interfaceC1886e == null) {
            abstractC0383a0A = L0.f1395a.b();
            c0401j0 = C0401j0.f1429m;
            interfaceC1888g = interfaceC1888g.o(abstractC0383a0A);
        } else {
            AbstractC0383a0 abstractC0383a0 = interfaceC1886e instanceof AbstractC0383a0 ? (AbstractC0383a0) interfaceC1886e : null;
            if (abstractC0383a0 == null) {
                abstractC0383a0A = L0.f1395a.a();
                c0401j0 = C0401j0.f1429m;
            } else {
                AbstractC0383a0 abstractC0383a02 = abstractC0383a0.p1() ? abstractC0383a0 : null;
                if (abstractC0383a02 != null) {
                    abstractC0383a0A = abstractC0383a02;
                }
                c0401j0 = C0401j0.f1429m;
            }
        }
        C0390e c0390e = new C0390e(E.d(c0401j0, interfaceC1888g), threadCurrentThread, abstractC0383a0A);
        c0390e.L0(K.DEFAULT, c0390e, pVar);
        return c0390e.N0();
    }

    public static /* synthetic */ Object b(InterfaceC1888g interfaceC1888g, v5.p pVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC1888g = C1889h.f21267m;
        }
        return AbstractC0394g.e(interfaceC1888g, pVar);
    }
}
