package H5;

import m5.C1889h;
import m5.InterfaceC1885d;
import m5.InterfaceC1886e;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1953h;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: H5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0398i {
    public static final P a(I i7, InterfaceC1888g interfaceC1888g, K k7, v5.p pVar) {
        InterfaceC1888g interfaceC1888gD = E.d(i7, interfaceC1888g);
        Q z0Var = k7.j() ? new z0(interfaceC1888gD, pVar) : new Q(interfaceC1888gD, true);
        z0Var.L0(k7, z0Var, pVar);
        return z0Var;
    }

    public static /* synthetic */ P b(I i7, InterfaceC1888g interfaceC1888g, K k7, v5.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC1888g = C1889h.f21267m;
        }
        if ((i8 & 2) != 0) {
            k7 = K.DEFAULT;
        }
        return AbstractC0394g.a(i7, interfaceC1888g, k7, pVar);
    }

    public static final InterfaceC0415q0 c(I i7, InterfaceC1888g interfaceC1888g, K k7, v5.p pVar) {
        InterfaceC1888g interfaceC1888gD = E.d(i7, interfaceC1888g);
        H0 a02 = k7.j() ? new A0(interfaceC1888gD, pVar) : new H0(interfaceC1888gD, true);
        a02.L0(k7, a02, pVar);
        return a02;
    }

    public static /* synthetic */ InterfaceC0415q0 d(I i7, InterfaceC1888g interfaceC1888g, K k7, v5.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC1888g = C1889h.f21267m;
        }
        if ((i8 & 2) != 0) {
            k7 = K.DEFAULT;
        }
        return AbstractC0394g.c(i7, interfaceC1888g, k7, pVar);
    }

    public static final Object e(InterfaceC1888g interfaceC1888g, v5.p pVar, InterfaceC1885d interfaceC1885d) throws Throwable {
        Object objN0;
        InterfaceC1888g interfaceC1888gA = interfaceC1885d.a();
        InterfaceC1888g interfaceC1888gE = E.e(interfaceC1888gA, interfaceC1888g);
        u0.e(interfaceC1888gE);
        if (interfaceC1888gE == interfaceC1888gA) {
            M5.B b7 = new M5.B(interfaceC1888gE, interfaceC1885d);
            objN0 = N5.b.b(b7, b7, pVar);
        } else {
            InterfaceC1886e.b bVar = InterfaceC1886e.f21264l;
            if (w5.k.b(interfaceC1888gE.b(bVar), interfaceC1888gA.b(bVar))) {
                N0 n02 = new N0(interfaceC1888gE, interfaceC1885d);
                InterfaceC1888g interfaceC1888gA2 = n02.a();
                Object objC = M5.J.c(interfaceC1888gA2, null);
                try {
                    Object objB = N5.b.b(n02, n02, pVar);
                    M5.J.a(interfaceC1888gA2, objC);
                    objN0 = objB;
                } catch (Throwable th) {
                    M5.J.a(interfaceC1888gA2, objC);
                    throw th;
                }
            } else {
                T t6 = new T(interfaceC1888gE, interfaceC1885d);
                N5.a.d(pVar, t6, t6, null, 4, null);
                objN0 = t6.N0();
            }
        }
        if (objN0 == AbstractC1930b.c()) {
            AbstractC1953h.c(interfaceC1885d);
        }
        return objN0;
    }
}
