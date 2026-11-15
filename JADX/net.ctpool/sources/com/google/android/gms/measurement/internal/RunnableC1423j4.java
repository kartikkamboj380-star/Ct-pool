package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1423j4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ Boolean f16101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F3 f16102n;

    RunnableC1423j4(F3 f32, Boolean bool) {
        this.f16101m = bool;
        this.f16102n = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16102n.Y(this.f16101m, true);
    }
}
