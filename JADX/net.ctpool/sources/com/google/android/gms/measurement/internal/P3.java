package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class P3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f15736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F3 f15737n;

    P3(F3 f32, AtomicReference atomicReference) {
        this.f15736m = atomicReference;
        this.f15737n = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15736m) {
            try {
                try {
                    this.f15736m.set(Boolean.valueOf(this.f15737n.b().K(this.f15737n.n().D())));
                } finally {
                    this.f15736m.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
