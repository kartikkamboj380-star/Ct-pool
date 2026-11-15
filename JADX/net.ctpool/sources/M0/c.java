package M0;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class c implements RunnableFuture, ScheduledFuture {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Handler f2021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FutureTask f2022n;

    public c(Handler handler, Runnable runnable, Object obj) {
        this.f2021m = handler;
        this.f2022n = new FutureTask(runnable, obj);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        return this.f2022n.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f2022n.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f2022n.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f2022n.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f2022n.run();
    }

    public c(Handler handler, Callable callable) {
        this.f2021m = handler;
        this.f2022n = new FutureTask(callable);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j7, TimeUnit timeUnit) {
        return this.f2022n.get(j7, timeUnit);
    }
}
