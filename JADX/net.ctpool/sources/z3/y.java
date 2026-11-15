package z3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class y implements InterfaceC2268h, InterfaceC2267g, InterfaceC2265e, J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f23308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2263c f23309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f23310c;

    public y(Executor executor, InterfaceC2263c interfaceC2263c, O o6) {
        this.f23308a = executor;
        this.f23309b = interfaceC2263c;
        this.f23310c = o6;
    }

    @Override // z3.InterfaceC2265e
    public final void a() {
        this.f23310c.u();
    }

    @Override // z3.InterfaceC2268h
    public final void b(Object obj) {
        this.f23310c.t(obj);
    }

    @Override // z3.InterfaceC2267g
    public final void c(Exception exc) {
        this.f23310c.s(exc);
    }

    @Override // z3.J
    public final void d(AbstractC2272l abstractC2272l) {
        this.f23308a.execute(new x(this, abstractC2272l));
    }
}
