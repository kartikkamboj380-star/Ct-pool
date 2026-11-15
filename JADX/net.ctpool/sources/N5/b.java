package N5;

import H5.C0423z;
import H5.y0;
import M5.B;
import M5.J;
import i5.m;
import i5.n;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1953h;
import v5.p;
import w5.z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final void a(p pVar, Object obj, InterfaceC1885d interfaceC1885d) {
        Object objA;
        InterfaceC1885d interfaceC1885dA = AbstractC1953h.a(interfaceC1885d);
        try {
            InterfaceC1888g interfaceC1888gA = interfaceC1885d.a();
            Object objC = J.c(interfaceC1888gA, null);
            try {
                objA = ((p) z.b(pVar, 2)).m(obj, interfaceC1885dA);
                if (objA == AbstractC1930b.c()) {
                    return;
                }
            } finally {
                J.a(interfaceC1888gA, objC);
            }
        } catch (Throwable th) {
            m.a aVar = m.f19973m;
            objA = n.a(th);
        }
        interfaceC1885dA.h(m.a(objA));
    }

    public static final Object b(B b7, Object obj, p pVar) {
        Object c0423z;
        Object objF0;
        try {
            c0423z = ((p) z.b(pVar, 2)).m(obj, b7);
        } catch (Throwable th) {
            c0423z = new C0423z(th, false, 2, null);
        }
        if (c0423z == AbstractC1930b.c() || (objF0 = b7.f0(c0423z)) == y0.f1469b) {
            return AbstractC1930b.c();
        }
        if (objF0 instanceof C0423z) {
            throw ((C0423z) objF0).f1476a;
        }
        return y0.h(objF0);
    }
}
