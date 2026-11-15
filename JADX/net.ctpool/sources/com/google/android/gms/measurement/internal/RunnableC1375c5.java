package com.google.android.gms.measurement.internal;

import w3.InterfaceC2195f;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1375c5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2195f f15983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC1382d5 f15984n;

    RunnableC1375c5(ServiceConnectionC1382d5 serviceConnectionC1382d5, InterfaceC2195f interfaceC2195f) {
        this.f15983m = interfaceC2195f;
        this.f15984n = serviceConnectionC1382d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15984n) {
            try {
                this.f15984n.f15994a = false;
                if (!this.f15984n.f15996c.e0()) {
                    this.f15984n.f15996c.d().I().a("Connected to service");
                    this.f15984n.f15996c.Q(this.f15983m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
