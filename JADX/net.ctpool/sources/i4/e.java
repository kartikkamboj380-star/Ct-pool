package i4;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.InterfaceC2263c;

/* JADX INFO: loaded from: classes.dex */
public class e implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ExecutorService f19946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f19947n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AbstractC2272l f19948o = AbstractC2275o.f(null);

    e(ExecutorService executorService) {
        this.f19946m = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2272l d(Runnable runnable, AbstractC2272l abstractC2272l) {
        runnable.run();
        return AbstractC2275o.f(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2272l e(Callable callable, AbstractC2272l abstractC2272l) {
        return (AbstractC2272l) callable.call();
    }

    public ExecutorService c() {
        return this.f19946m;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f19946m.execute(runnable);
    }

    public AbstractC2272l f(final Runnable runnable) {
        AbstractC2272l abstractC2272lJ;
        synchronized (this.f19947n) {
            abstractC2272lJ = this.f19948o.j(this.f19946m, new InterfaceC2263c() { // from class: i4.d
                @Override // z3.InterfaceC2263c
                public final Object a(AbstractC2272l abstractC2272l) {
                    return e.d(runnable, abstractC2272l);
                }
            });
            this.f19948o = abstractC2272lJ;
        }
        return abstractC2272lJ;
    }

    public AbstractC2272l g(final Callable callable) {
        AbstractC2272l abstractC2272lJ;
        synchronized (this.f19947n) {
            abstractC2272lJ = this.f19948o.j(this.f19946m, new InterfaceC2263c() { // from class: i4.c
                @Override // z3.InterfaceC2263c
                public final Object a(AbstractC2272l abstractC2272l) {
                    return e.e(callable, abstractC2272l);
                }
            });
            this.f19948o = abstractC2272lJ;
        }
        return abstractC2272lJ;
    }
}
