package K4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final K4.a f1877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile K4.a f1878b;

    /* JADX INFO: renamed from: K4.b$b, reason: collision with other inner class name */
    private static class C0036b implements K4.a {
        private C0036b() {
        }

        @Override // K4.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i7, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i7, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0036b c0036b = new C0036b();
        f1877a = c0036b;
        f1878b = c0036b;
    }

    public static K4.a a() {
        return f1878b;
    }
}
