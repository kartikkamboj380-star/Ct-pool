package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.M0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class a extends ThreadPoolExecutor {
    a(FirebaseAnalytics firebaseAnalytics, int i7, int i8, long j7, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(M0.a().b(runnable));
    }
}
