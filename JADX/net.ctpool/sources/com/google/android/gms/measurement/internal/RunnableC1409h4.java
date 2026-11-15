package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1409h4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f16067m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F3 f16068n;

    RunnableC1409h4(F3 f32, AtomicReference atomicReference) {
        this.f16067m = atomicReference;
        this.f16068n = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16067m) {
            try {
                try {
                    this.f16067m.set(Integer.valueOf(this.f16068n.b().u(this.f16068n.n().D(), G.f15488Q)));
                } finally {
                    this.f16067m.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
