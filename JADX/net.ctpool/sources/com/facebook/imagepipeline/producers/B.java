package com.facebook.imagepipeline.producers;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class B implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f10722a;

    public B(Executor executor) {
        if (executor == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f10722a = executor;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void a(Runnable runnable) {
        w5.k.f(runnable, "runnable");
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void b(Runnable runnable) {
        w5.k.f(runnable, "runnable");
        this.f10722a.execute(runnable);
    }
}
