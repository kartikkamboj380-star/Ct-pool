package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f10988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque f10990c;

    public q0(Executor executor) {
        w5.k.f(executor, "executor");
        this.f10988a = executor;
        this.f10990c = new ArrayDeque();
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void a(Runnable runnable) {
        w5.k.f(runnable, "runnable");
        this.f10990c.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void b(Runnable runnable) {
        try {
            w5.k.f(runnable, "runnable");
            if (this.f10989b) {
                this.f10990c.add(runnable);
            } else {
                this.f10988a.execute(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
