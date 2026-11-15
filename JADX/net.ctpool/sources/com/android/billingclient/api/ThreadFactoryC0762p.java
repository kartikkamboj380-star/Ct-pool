package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.android.billingclient.api.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class ThreadFactoryC0762p implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadFactory f10333a = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f10334b = new AtomicInteger(1);

    ThreadFactoryC0762p(C0749c c0749c) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f10334b;
        Thread threadNewThread = this.f10333a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
