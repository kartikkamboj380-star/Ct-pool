package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class o implements ScheduledExecutorService {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ExecutorService f17415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ScheduledExecutorService f17416n;

    o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f17415m = executorService;
        this.f17416n = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e7) {
            bVar.a(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(final Runnable runnable, final p.b bVar) {
        this.f17415m.execute(new Runnable() { // from class: com.google.firebase.concurrent.m
            @Override // java.lang.Runnable
            public final void run() {
                o.m(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture o(final Runnable runnable, long j7, TimeUnit timeUnit, final p.b bVar) {
        return this.f17416n.schedule(new Runnable() { // from class: com.google.firebase.concurrent.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f17402m.n(runnable, bVar);
            }
        }, j7, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e7) {
            bVar.a(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Future q(final Callable callable, final p.b bVar) {
        return this.f17415m.submit(new Runnable() { // from class: com.google.firebase.concurrent.n
            @Override // java.lang.Runnable
            public final void run() {
                o.p(callable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture r(final Callable callable, long j7, TimeUnit timeUnit, final p.b bVar) {
        return this.f17416n.schedule(new Callable() { // from class: com.google.firebase.concurrent.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f17405a.q(callable, bVar);
            }
        }, j7, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Runnable runnable, p.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e7) {
            bVar.a(e7);
            throw e7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final Runnable runnable, final p.b bVar) {
        this.f17415m.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                o.s(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture u(final Runnable runnable, long j7, long j8, TimeUnit timeUnit, final p.b bVar) {
        return this.f17416n.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f17399m.t(runnable, bVar);
            }
        }, j7, j8, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(final Runnable runnable, final p.b bVar) {
        this.f17415m.execute(new Runnable() { // from class: com.google.firebase.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                o.x(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture w(final Runnable runnable, long j7, long j8, TimeUnit timeUnit, final p.b bVar) {
        return this.f17416n.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f17408m.v(runnable, bVar);
            }
        }, j7, j8, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e7) {
            bVar.a(e7);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j7, TimeUnit timeUnit) {
        return this.f17415m.awaitTermination(j7, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f17415m.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f17415m.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f17415m.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f17415m.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f17415m.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j7, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.c
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f17377a.o(runnable, j7, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j7, final long j8, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f17385a.u(runnable, j7, j8, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j7, final long j8, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f17390a.w(runnable, j7, j8, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f17415m.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f17415m.invokeAll(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f17415m.invokeAny(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j7, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f17395a.r(callable, j7, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f17415m.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f17415m.submit(callable);
    }
}
