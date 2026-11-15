package M0;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class a extends AbstractExecutorService {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a f2019m = new a();

    private a() {
    }

    public static a a() {
        return f2019m;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j7, TimeUnit timeUnit) {
        return true;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
    }
}
