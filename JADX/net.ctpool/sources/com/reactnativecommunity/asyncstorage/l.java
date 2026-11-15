package com.reactnativecommunity.asyncstorage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class l implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayDeque f18195m = new ArrayDeque();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Runnable f18196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Executor f18197o;

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Runnable f18198m;

        a(Runnable runnable) {
            this.f18198m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f18198m.run();
            } finally {
                l.this.a();
            }
        }
    }

    public l(Executor executor) {
        this.f18197o = executor;
    }

    synchronized void a() {
        Runnable runnable = (Runnable) this.f18195m.poll();
        this.f18196n = runnable;
        if (runnable != null) {
            this.f18197o.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f18195m.offer(new a(runnable));
        if (this.f18196n == null) {
            a();
        }
    }
}
