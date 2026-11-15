package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* JADX INFO: loaded from: classes.dex */
final class R2 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ P2 f15753b;

    public R2(P2 p22, String str) {
        this.f15753b = p22;
        Preconditions.checkNotNull(str);
        this.f15752a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f15753b.d().E().b(this.f15752a, th);
    }
}
