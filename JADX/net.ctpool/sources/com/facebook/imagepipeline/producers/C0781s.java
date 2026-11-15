package com.facebook.imagepipeline.producers;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0781s implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f11002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f11003b;

    public C0781s(d0 d0Var, ScheduledExecutorService scheduledExecutorService) {
        w5.k.f(d0Var, "inputProducer");
        this.f11002a = d0Var;
        this.f11003b = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C0781s c0781s, InterfaceC0777n interfaceC0777n, e0 e0Var) {
        w5.k.f(c0781s, "this$0");
        w5.k.f(interfaceC0777n, "$consumer");
        w5.k.f(e0Var, "$context");
        c0781s.f11002a.a(interfaceC0777n, e0Var);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(final InterfaceC0777n interfaceC0777n, final e0 e0Var) {
        w5.k.f(interfaceC0777n, "consumer");
        w5.k.f(e0Var, "context");
        J1.b bVarD = e0Var.d();
        ScheduledExecutorService scheduledExecutorService = this.f11003b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable() { // from class: com.facebook.imagepipeline.producers.r
                @Override // java.lang.Runnable
                public final void run() {
                    C0781s.d(this.f10991m, interfaceC0777n, e0Var);
                }
            }, bVarD.e(), TimeUnit.MILLISECONDS);
        } else {
            this.f11002a.a(interfaceC0777n, e0Var);
        }
    }
}
