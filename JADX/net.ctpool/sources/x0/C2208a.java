package x0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: x0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2208a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C2208a f22753b = new C2208a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f22755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f22756e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f22757a = new b();

    /* JADX INFO: renamed from: x0.a$b */
    private static class b implements Executor {
        private b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f22754c = iAvailableProcessors;
        f22755d = iAvailableProcessors + 1;
        f22756e = (iAvailableProcessors * 2) + 1;
    }

    private C2208a() {
    }

    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z6) {
        threadPoolExecutor.allowCoreThreadTimeOut(z6);
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f22755d, f22756e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor c() {
        return f22753b.f22757a;
    }
}
