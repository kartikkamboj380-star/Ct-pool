package z3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class E implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f23260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f23261b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2267g f23262c;

    public E(Executor executor, InterfaceC2267g interfaceC2267g) {
        this.f23260a = executor;
        this.f23262c = interfaceC2267g;
    }

    @Override // z3.J
    public final void d(AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p() || abstractC2272l.n()) {
            return;
        }
        synchronized (this.f23261b) {
            try {
                if (this.f23262c == null) {
                    return;
                }
                this.f23260a.execute(new RunnableC2260D(this, abstractC2272l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
