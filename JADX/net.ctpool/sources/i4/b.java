package i4;

import U.m;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.C2262b;
import z3.C2273m;
import z3.InterfaceC2263c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f19943a = new m();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2272l b(C2273m c2273m, AtomicBoolean atomicBoolean, C2262b c2262b, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            c2273m.e(abstractC2272l.l());
        } else if (abstractC2272l.k() != null) {
            c2273m.d(abstractC2272l.k());
        } else if (atomicBoolean.getAndSet(true)) {
            c2262b.a();
        }
        return AbstractC2275o.f(null);
    }

    public static AbstractC2272l c(AbstractC2272l abstractC2272l, AbstractC2272l abstractC2272l2) {
        final C2262b c2262b = new C2262b();
        final C2273m c2273m = new C2273m(c2262b.b());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        InterfaceC2263c interfaceC2263c = new InterfaceC2263c() { // from class: i4.a
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l3) {
                return b.b(c2273m, atomicBoolean, c2262b, abstractC2272l3);
            }
        };
        Executor executor = f19943a;
        abstractC2272l.j(executor, interfaceC2263c);
        abstractC2272l2.j(executor, interfaceC2263c);
        return c2273m.a();
    }
}
