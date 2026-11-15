package H5;

import m5.InterfaceC1885d;
import m5.InterfaceC1886e;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
public final class N0 extends M5.B {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ThreadLocal f1400q;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public N0(InterfaceC1888g interfaceC1888g, InterfaceC1885d interfaceC1885d) {
        O0 o02 = O0.f1403m;
        super(interfaceC1888g.b(o02) == null ? interfaceC1888g.o(o02) : interfaceC1888g, interfaceC1885d);
        this.f1400q = new ThreadLocal();
        if (interfaceC1885d.a().b(InterfaceC1886e.f21264l) instanceof F) {
            return;
        }
        Object objC = M5.J.c(interfaceC1888g, null);
        M5.J.a(interfaceC1888g, objC);
        O0(interfaceC1888g, objC);
    }

    @Override // M5.B, H5.AbstractC0382a
    protected void I0(Object obj) {
        if (this.threadLocalIsSet) {
            i5.l lVar = (i5.l) this.f1400q.get();
            if (lVar != null) {
                M5.J.a((InterfaceC1888g) lVar.a(), lVar.b());
            }
            this.f1400q.remove();
        }
        Object objA = D.a(obj, this.f2060p);
        InterfaceC1885d interfaceC1885d = this.f2060p;
        InterfaceC1888g interfaceC1888gA = interfaceC1885d.a();
        Object objC = M5.J.c(interfaceC1888gA, null);
        N0 n0G = objC != M5.J.f2068a ? E.g(interfaceC1885d, interfaceC1888gA, objC) : null;
        try {
            this.f2060p.h(objA);
            i5.u uVar = i5.u.f19985a;
        } finally {
            if (n0G == null || n0G.N0()) {
                M5.J.a(interfaceC1888gA, objC);
            }
        }
    }

    public final boolean N0() {
        boolean z6 = this.threadLocalIsSet && this.f1400q.get() == null;
        this.f1400q.remove();
        return !z6;
    }

    public final void O0(InterfaceC1888g interfaceC1888g, Object obj) {
        this.threadLocalIsSet = true;
        this.f1400q.set(i5.q.a(interfaceC1888g, obj));
    }
}
