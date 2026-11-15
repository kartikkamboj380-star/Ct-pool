package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
final class T2 extends Thread {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f15801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final BlockingQueue f15802n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f15803o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ P2 f15804p;

    public T2(P2 p22, String str, BlockingQueue blockingQueue) {
        this.f15804p = p22;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f15801m = new Object();
        this.f15802n = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.f15804p.d().J().b(getName() + " was interrupted", interruptedException);
    }

    private final void c() {
        synchronized (this.f15804p.f15733i) {
            try {
                if (!this.f15803o) {
                    this.f15804p.f15734j.release();
                    this.f15804p.f15733i.notifyAll();
                    if (this == this.f15804p.f15727c) {
                        this.f15804p.f15727c = null;
                    } else if (this == this.f15804p.f15728d) {
                        this.f15804p.f15728d = null;
                    } else {
                        this.f15804p.d().E().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f15803o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        synchronized (this.f15801m) {
            this.f15801m.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z6 = false;
        while (!z6) {
            try {
                this.f15804p.f15734j.acquire();
                z6 = true;
            } catch (InterruptedException e7) {
                b(e7);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                Q2 q22 = (Q2) this.f15802n.poll();
                if (q22 != null) {
                    Process.setThreadPriority(q22.f15745n ? threadPriority : 10);
                    q22.run();
                } else {
                    synchronized (this.f15801m) {
                        if (this.f15802n.peek() == null && !this.f15804p.f15735k) {
                            try {
                                this.f15801m.wait(30000L);
                            } catch (InterruptedException e8) {
                                b(e8);
                            }
                        }
                    }
                    synchronized (this.f15804p.f15733i) {
                        if (this.f15802n.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
