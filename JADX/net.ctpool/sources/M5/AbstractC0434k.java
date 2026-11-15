package M5;

import H5.AbstractC0383a0;
import H5.InterfaceC0415q0;
import H5.L0;
import H5.N0;
import i5.m;
import java.util.concurrent.CancellationException;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;

/* JADX INFO: renamed from: M5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0434k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F f2093a = new F("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f2094b = new F("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: all -> 0x0068, DONT_GENERATE, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x003f, B:13:0x004d, B:15:0x0053, B:28:0x0092, B:18:0x006a, B:20:0x007a, B:25:0x0089, B:27:0x008f, B:33:0x009f, B:36:0x00a8, B:35:0x00a5, B:23:0x0080), top: B:44:0x003f, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(InterfaceC1885d interfaceC1885d, Object obj, v5.l lVar) {
        InterfaceC0415q0 interfaceC0415q0;
        if (!(interfaceC1885d instanceof C0433j)) {
            interfaceC1885d.h(obj);
            return;
        }
        C0433j c0433j = (C0433j) interfaceC1885d;
        Object objC = H5.D.c(obj, lVar);
        if (c0433j.f2089p.g(c0433j.a())) {
            c0433j.f2091r = objC;
            c0433j.f1406o = 1;
            c0433j.f2089p.a(c0433j.a(), c0433j);
            return;
        }
        AbstractC0383a0 abstractC0383a0B = L0.f1395a.b();
        if (abstractC0383a0B.l1()) {
            c0433j.f2091r = objC;
            c0433j.f1406o = 1;
            abstractC0383a0B.h1(c0433j);
            return;
        }
        abstractC0383a0B.j1(true);
        try {
            interfaceC0415q0 = (InterfaceC0415q0) c0433j.a().b(InterfaceC0415q0.f1444b);
        } finally {
            try {
            } finally {
            }
        }
        if (interfaceC0415q0 == null || interfaceC0415q0.d()) {
            InterfaceC1885d interfaceC1885d2 = c0433j.f2090q;
            Object obj2 = c0433j.f2092s;
            InterfaceC1888g interfaceC1888gA = interfaceC1885d2.a();
            Object objC2 = J.c(interfaceC1888gA, obj2);
            N0 n0G = objC2 != J.f2068a ? H5.E.g(interfaceC1885d2, interfaceC1888gA, objC2) : null;
            try {
                c0433j.f2090q.h(obj);
                i5.u uVar = i5.u.f19985a;
            } finally {
                if (n0G == null || n0G.N0()) {
                    J.a(interfaceC1888gA, objC2);
                }
            }
        }
        CancellationException cancellationExceptionW = interfaceC0415q0.w();
        c0433j.d(objC, cancellationExceptionW);
        m.a aVar = i5.m.f19973m;
        c0433j.h(i5.m.a(i5.n.a(cancellationExceptionW)));
        while (abstractC0383a0B.o1()) {
        }
    }

    public static /* synthetic */ void c(InterfaceC1885d interfaceC1885d, Object obj, v5.l lVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            lVar = null;
        }
        b(interfaceC1885d, obj, lVar);
    }
}
