package H5;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class N extends AbstractC0385b0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final N f1398u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f1399v;

    static {
        Long l7;
        N n7 = new N();
        f1398u = n7;
        AbstractC0383a0.k1(n7, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f1399v = timeUnit.toNanos(l7.longValue());
    }

    private N() {
    }

    private final synchronized void B1() {
        if (E1()) {
            debugStatus = 3;
            z1();
            w5.k.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread C1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean D1() {
        return debugStatus == 4;
    }

    private final boolean E1() {
        int i7 = debugStatus;
        return i7 == 2 || i7 == 3;
    }

    private final synchronized boolean F1() {
        if (E1()) {
            return false;
        }
        debugStatus = 1;
        w5.k.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void G1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // H5.AbstractC0387c0
    protected Thread q1() {
        Thread thread = _thread;
        return thread == null ? C1() : thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zX1;
        L0.f1395a.d(this);
        AbstractC0386c.a();
        try {
            if (!F1()) {
                if (zX1) {
                    return;
                } else {
                    return;
                }
            }
            long j7 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jN1 = n1();
                if (jN1 == Long.MAX_VALUE) {
                    AbstractC0386c.a();
                    long jNanoTime = System.nanoTime();
                    if (j7 == Long.MAX_VALUE) {
                        j7 = f1399v + jNanoTime;
                    }
                    long j8 = j7 - jNanoTime;
                    if (j8 <= 0) {
                        _thread = null;
                        B1();
                        AbstractC0386c.a();
                        if (x1()) {
                            return;
                        }
                        q1();
                        return;
                    }
                    jN1 = C5.g.g(jN1, j8);
                } else {
                    j7 = Long.MAX_VALUE;
                }
                if (jN1 > 0) {
                    if (E1()) {
                        _thread = null;
                        B1();
                        AbstractC0386c.a();
                        if (x1()) {
                            return;
                        }
                        q1();
                        return;
                    }
                    AbstractC0386c.a();
                    LockSupport.parkNanos(this, jN1);
                }
            }
        } finally {
            _thread = null;
            B1();
            AbstractC0386c.a();
            if (!x1()) {
                q1();
            }
        }
    }

    @Override // H5.AbstractC0385b0, H5.AbstractC0383a0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // H5.AbstractC0385b0
    public void u1(Runnable runnable) {
        if (D1()) {
            G1();
        }
        super.u1(runnable);
    }
}
