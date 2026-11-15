package z3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class G implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f23265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f23266b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2268h f23267c;

    public G(Executor executor, InterfaceC2268h interfaceC2268h) {
        this.f23265a = executor;
        this.f23267c = interfaceC2268h;
    }

    @Override // z3.J
    public final void d(AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            synchronized (this.f23266b) {
                try {
                    if (this.f23267c == null) {
                        return;
                    }
                    this.f23265a.execute(new F(this, abstractC2272l));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
