package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class ThreadFactoryC1181q1 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreadFactory f14785a = Executors.defaultThreadFactory();

    ThreadFactoryC1181q1(C1073e1 c1073e1) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f14785a.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
