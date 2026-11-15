package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1430k4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f16136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F3 f16137n;

    RunnableC1430k4(F3 f32, AtomicReference atomicReference) {
        this.f16136m = atomicReference;
        this.f16137n = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16136m) {
            try {
                try {
                    this.f16136m.set(Double.valueOf(this.f16137n.b().m(this.f16137n.n().D(), G.f15490R)));
                } finally {
                    this.f16136m.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
