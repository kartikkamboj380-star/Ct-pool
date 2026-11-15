package H5;

import M5.C0433j;
import i5.m;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class V {
    public static final void a(U u6, int i7) {
        InterfaceC1885d interfaceC1885dE = u6.e();
        boolean z6 = i7 == 4;
        if (z6 || !(interfaceC1885dE instanceof C0433j) || b(i7) != b(u6.f1406o)) {
            d(u6, interfaceC1885dE, z6);
            return;
        }
        F f7 = ((C0433j) interfaceC1885dE).f2089p;
        InterfaceC1888g interfaceC1888gA = interfaceC1885dE.a();
        if (f7.g(interfaceC1888gA)) {
            f7.a(interfaceC1888gA, u6);
        } else {
            e(u6);
        }
    }

    public static final boolean b(int i7) {
        return i7 == 1 || i7 == 2;
    }

    public static final boolean c(int i7) {
        return i7 == 2;
    }

    public static final void d(U u6, InterfaceC1885d interfaceC1885d, boolean z6) {
        Object objI;
        Object objL = u6.l();
        Throwable thF = u6.f(objL);
        if (thF != null) {
            m.a aVar = i5.m.f19973m;
            objI = i5.n.a(thF);
        } else {
            m.a aVar2 = i5.m.f19973m;
            objI = u6.i(objL);
        }
        Object objA = i5.m.a(objI);
        if (!z6) {
            interfaceC1885d.h(objA);
            return;
        }
        w5.k.d(interfaceC1885d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C0433j c0433j = (C0433j) interfaceC1885d;
        InterfaceC1885d interfaceC1885d2 = c0433j.f2090q;
        Object obj = c0433j.f2092s;
        InterfaceC1888g interfaceC1888gA = interfaceC1885d2.a();
        Object objC = M5.J.c(interfaceC1888gA, obj);
        N0 n0G = objC != M5.J.f2068a ? E.g(interfaceC1885d2, interfaceC1888gA, objC) : null;
        try {
            c0433j.f2090q.h(objA);
            i5.u uVar = i5.u.f19985a;
        } finally {
            if (n0G == null || n0G.N0()) {
                M5.J.a(interfaceC1888gA, objC);
            }
        }
    }

    private static final void e(U u6) {
        AbstractC0383a0 abstractC0383a0B = L0.f1395a.b();
        if (abstractC0383a0B.l1()) {
            abstractC0383a0B.h1(u6);
            return;
        }
        abstractC0383a0B.j1(true);
        try {
            d(u6, u6.e(), true);
            do {
            } while (abstractC0383a0B.o1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
