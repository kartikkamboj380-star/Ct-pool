package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
abstract class h {

    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7212b;

        /* JADX INFO: renamed from: androidx.core.provider.h$a$a, reason: collision with other inner class name */
        private static class C0142a extends Thread {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private final int f7213m;

            C0142a(Runnable runnable, String str, int i7) {
                super(runnable, str);
                this.f7213m = i7;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f7213m);
                super.run();
            }
        }

        a(String str, int i7) {
            this.f7211a = str;
            this.f7212b = i7;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0142a(runnable, this.f7211a, this.f7212b);
        }
    }

    private static class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Callable f7214m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private androidx.core.util.a f7215n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Handler f7216o;

        class a implements Runnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f7217m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Object f7218n;

            a(androidx.core.util.a aVar, Object obj) {
                this.f7217m = aVar;
                this.f7218n = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f7217m.a(this.f7218n);
            }
        }

        b(Handler handler, Callable callable, androidx.core.util.a aVar) {
            this.f7214m = callable;
            this.f7215n = aVar;
            this.f7216o = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f7214m.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f7216o.post(new a(this.f7215n, objCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i7, int i8) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i8, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i7));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static void b(Executor executor, Callable callable, androidx.core.util.a aVar) {
        executor.execute(new b(androidx.core.provider.b.a(), callable, aVar));
    }

    static Object c(ExecutorService executorService, Callable callable, int i7) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i7, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            throw e7;
        } catch (ExecutionException e8) {
            throw new RuntimeException(e8);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
