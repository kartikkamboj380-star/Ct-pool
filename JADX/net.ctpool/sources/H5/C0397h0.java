package H5;

import M5.AbstractC0426c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import m5.InterfaceC1888g;

/* JADX INFO: renamed from: H5.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0397h0 extends AbstractC0395g0 implements S {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Executor f1428p;

    public C0397h0(Executor executor) {
        this.f1428p = executor;
        AbstractC0426c.a(b1());
    }

    private final void S0(InterfaceC1888g interfaceC1888g, RejectedExecutionException rejectedExecutionException) {
        u0.c(interfaceC1888g, AbstractC0393f0.a("The task was rejected", rejectedExecutionException));
    }

    @Override // H5.F
    public void a(InterfaceC1888g interfaceC1888g, Runnable runnable) {
        try {
            Executor executorB1 = b1();
            AbstractC0386c.a();
            executorB1.execute(runnable);
        } catch (RejectedExecutionException e7) {
            AbstractC0386c.a();
            S0(interfaceC1888g, e7);
            W.b().a(interfaceC1888g, runnable);
        }
    }

    public Executor b1() {
        return this.f1428p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorB1 = b1();
        ExecutorService executorService = executorB1 instanceof ExecutorService ? (ExecutorService) executorB1 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0397h0) && ((C0397h0) obj).b1() == b1();
    }

    public int hashCode() {
        return System.identityHashCode(b1());
    }

    @Override // H5.F
    public String toString() {
        return b1().toString();
    }
}
