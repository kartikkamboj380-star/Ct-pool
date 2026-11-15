package h4;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z3.AbstractC2272l;
import z3.InterfaceC2263c;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f19732a = I.c("awaitEvenIfOnMainThread task continuation executor");

    public static Object b(AbstractC2272l abstractC2272l) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC2272l.h(f19732a, new InterfaceC2263c() { // from class: h4.e0
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l2) {
                return f0.d(countDownLatch, abstractC2272l2);
            }
        });
        countDownLatch.await(Looper.getMainLooper() == Looper.myLooper() ? 3000L : 4000L, TimeUnit.MILLISECONDS);
        if (abstractC2272l.p()) {
            return abstractC2272l.l();
        }
        if (abstractC2272l.n()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC2272l.o()) {
            throw new IllegalStateException(abstractC2272l.k());
        }
        throw new TimeoutException();
    }

    public static boolean c(CountDownLatch countDownLatch, long j7, TimeUnit timeUnit) {
        boolean z6 = false;
        try {
            long nanos = timeUnit.toNanos(j7);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z6 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z6) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d(CountDownLatch countDownLatch, AbstractC2272l abstractC2272l) {
        countDownLatch.countDown();
        return null;
    }
}
