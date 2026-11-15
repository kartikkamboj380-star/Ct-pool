package z3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class I implements InterfaceC2268h, InterfaceC2267g, InterfaceC2265e, J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f23270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2271k f23271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f23272c;

    public I(Executor executor, InterfaceC2271k interfaceC2271k, O o6) {
        this.f23270a = executor;
        this.f23271b = interfaceC2271k;
        this.f23272c = o6;
    }

    @Override // z3.InterfaceC2265e
    public final void a() {
        this.f23272c.u();
    }

    @Override // z3.InterfaceC2268h
    public final void b(Object obj) {
        this.f23272c.t(obj);
    }

    @Override // z3.InterfaceC2267g
    public final void c(Exception exc) {
        this.f23272c.s(exc);
    }

    @Override // z3.J
    public final void d(AbstractC2272l abstractC2272l) {
        this.f23270a.execute(new H(this, abstractC2272l));
    }
}
