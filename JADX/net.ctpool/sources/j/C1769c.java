package j;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: j.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1769c extends AbstractC1770d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20193a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f20194b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Handler f20195c;

    /* JADX INFO: renamed from: j.c$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f20196a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f20196a.getAndIncrement())));
            return thread;
        }
    }

    private static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // j.AbstractC1770d
    public void a(Runnable runnable) {
        this.f20194b.execute(runnable);
    }

    @Override // j.AbstractC1770d
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // j.AbstractC1770d
    public void c(Runnable runnable) {
        if (this.f20195c == null) {
            synchronized (this.f20193a) {
                try {
                    if (this.f20195c == null) {
                        this.f20195c = d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f20195c.post(runnable);
    }
}
