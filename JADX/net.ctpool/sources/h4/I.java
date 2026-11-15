package h4;

import e4.C1629g;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f19680b;

        /* JADX INFO: renamed from: h4.I$a$a, reason: collision with other inner class name */
        class C0264a extends AbstractRunnableC1716e {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ Runnable f19681m;

            C0264a(Runnable runnable) {
                this.f19681m = runnable;
            }

            @Override // h4.AbstractRunnableC1716e
            public void a() {
                this.f19681m.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f19679a = str;
            this.f19680b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0264a(runnable));
            threadNewThread.setName(this.f19679a + this.f19680b.getAndIncrement());
            return threadNewThread;
        }
    }

    class b extends AbstractRunnableC1716e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f19683m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ExecutorService f19684n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f19685o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ TimeUnit f19686p;

        b(String str, ExecutorService executorService, long j7, TimeUnit timeUnit) {
            this.f19683m = str;
            this.f19684n = executorService;
            this.f19685o = j7;
            this.f19686p = timeUnit;
        }

        @Override // h4.AbstractRunnableC1716e
        public void a() {
            try {
                C1629g.f().b("Executing shutdown hook for " + this.f19683m);
                this.f19684n.shutdown();
                if (this.f19684n.awaitTermination(this.f19685o, this.f19686p)) {
                    return;
                }
                C1629g.f().b(this.f19683m + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f19684n.shutdownNow();
            } catch (InterruptedException unused) {
                C1629g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f19683m));
                this.f19684n.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j7, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j7, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
