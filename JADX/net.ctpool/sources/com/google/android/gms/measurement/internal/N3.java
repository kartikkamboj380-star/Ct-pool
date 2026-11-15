package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class N3 implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ F3 f15710m;

    N3(F3 f32) {
        this.f15710m = f32;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f15710m.f().B(runnable);
    }
}
