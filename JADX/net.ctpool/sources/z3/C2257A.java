package z3;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z3.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2257A implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f23250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f23251b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2265e f23252c;

    public C2257A(Executor executor, InterfaceC2265e interfaceC2265e) {
        this.f23250a = executor;
        this.f23252c = interfaceC2265e;
    }

    @Override // z3.J
    public final void d(AbstractC2272l abstractC2272l) {
        if (abstractC2272l.n()) {
            synchronized (this.f23251b) {
                try {
                    if (this.f23252c == null) {
                        return;
                    }
                    this.f23250a.execute(new z(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
