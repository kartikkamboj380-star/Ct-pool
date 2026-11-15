package z3;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z3.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2259C implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f23255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f23256b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2266f f23257c;

    public C2259C(Executor executor, InterfaceC2266f interfaceC2266f) {
        this.f23255a = executor;
        this.f23257c = interfaceC2266f;
    }

    @Override // z3.J
    public final void d(AbstractC2272l abstractC2272l) {
        synchronized (this.f23256b) {
            try {
                if (this.f23257c == null) {
                    return;
                }
                this.f23255a.execute(new RunnableC2258B(this, abstractC2272l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
