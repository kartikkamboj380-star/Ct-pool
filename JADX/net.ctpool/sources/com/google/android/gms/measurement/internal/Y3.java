package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class Y3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f15867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F3 f15868n;

    Y3(F3 f32, AtomicReference atomicReference) {
        this.f15867m = atomicReference;
        this.f15868n = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15867m) {
            try {
                try {
                    this.f15867m.set(this.f15868n.b().E(this.f15868n.n().D()));
                } finally {
                    this.f15867m.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
