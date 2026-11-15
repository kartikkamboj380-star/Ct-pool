package z3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class w implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f23303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2263c f23304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f23305c;

    public w(Executor executor, InterfaceC2263c interfaceC2263c, O o6) {
        this.f23303a = executor;
        this.f23304b = interfaceC2263c;
        this.f23305c = o6;
    }

    @Override // z3.J
    public final void d(AbstractC2272l abstractC2272l) {
        this.f23303a.execute(new v(this, abstractC2272l));
    }
}
