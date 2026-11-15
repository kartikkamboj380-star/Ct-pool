package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1416i4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f16079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F3 f16080n;

    RunnableC1416i4(F3 f32, AtomicReference atomicReference) {
        this.f16079m = atomicReference;
        this.f16080n = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16079m) {
            try {
                try {
                    this.f16079m.set(Long.valueOf(this.f16080n.b().y(this.f16080n.n().D(), G.f15486P)));
                } finally {
                    this.f16079m.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
