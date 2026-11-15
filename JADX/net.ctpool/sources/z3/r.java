package z3;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f23291a = new CountDownLatch(1);

    /* synthetic */ r(q qVar) {
    }

    @Override // z3.InterfaceC2265e
    public final void a() {
        this.f23291a.countDown();
    }

    @Override // z3.InterfaceC2268h
    public final void b(Object obj) {
        this.f23291a.countDown();
    }

    @Override // z3.InterfaceC2267g
    public final void c(Exception exc) {
        this.f23291a.countDown();
    }

    public final void d() throws InterruptedException {
        this.f23291a.await();
    }

    public final boolean e(long j7, TimeUnit timeUnit) {
        return this.f23291a.await(j7, timeUnit);
    }
}
