package com.facebook.react.bridge.queue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public interface MessageQueueThread {
    @R1.a
    void assertIsOnThread();

    @R1.a
    void assertIsOnThread(String str);

    @R1.a
    <T> Future<T> callOnQueue(Callable<T> callable);

    @R1.a
    MessageQueueThreadPerfStats getPerfStats();

    @R1.a
    boolean isIdle();

    @R1.a
    boolean isOnThread();

    @R1.a
    void quitSynchronous();

    @R1.a
    void resetPerfStats();

    @R1.a
    boolean runOnQueue(Runnable runnable);
}
