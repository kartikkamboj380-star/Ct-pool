package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
class b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f17372e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f17373a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f17376d;

    b(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f17374b = str;
        this.f17375c = i7;
        this.f17376d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f17375c);
        StrictMode.ThreadPolicy threadPolicy = this.f17376d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f17372e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f17370m.b(runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f17374b, Long.valueOf(this.f17373a.getAndIncrement())));
        return threadNewThread;
    }
}
