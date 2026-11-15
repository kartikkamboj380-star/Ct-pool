package com.google.android.gms.measurement.internal;

import w3.InterfaceC2195f;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1389e5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2195f f16023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC1382d5 f16024n;

    RunnableC1389e5(ServiceConnectionC1382d5 serviceConnectionC1382d5, InterfaceC2195f interfaceC2195f) {
        this.f16023m = interfaceC2195f;
        this.f16024n = serviceConnectionC1382d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16024n) {
            try {
                this.f16024n.f15994a = false;
                if (!this.f16024n.f15996c.e0()) {
                    this.f16024n.f15996c.d().D().a("Connected to remote service");
                    this.f16024n.f15996c.Q(this.f16023m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
