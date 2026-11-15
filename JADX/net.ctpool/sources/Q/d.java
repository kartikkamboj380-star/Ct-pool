package Q;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static Handler f2726q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile e f2728n = e.PENDING;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final AtomicBoolean f2729o = new AtomicBoolean();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final AtomicBoolean f2730p = new AtomicBoolean();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final FutureTask f2727m = new b(new a());

    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            d.this.f2730p.set(true);
            Object objB = null;
            try {
                Process.setThreadPriority(10);
                objB = d.this.b();
                Binder.flushPendingCommands();
                return objB;
            } finally {
            }
        }
    }

    class b extends FutureTask {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                d.this.j(get());
            } catch (InterruptedException e7) {
                Log.w("AsyncTask", e7);
            } catch (CancellationException unused) {
                d.this.j(null);
            } catch (ExecutionException e8) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e8.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Object f2733m;

        c(Object obj) {
            this.f2733m = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.d(this.f2733m);
        }
    }

    /* JADX INFO: renamed from: Q.d$d, reason: collision with other inner class name */
    static /* synthetic */ class C0057d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2735a;

        static {
            int[] iArr = new int[e.values().length];
            f2735a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2735a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    d() {
    }

    private static Handler e() {
        Handler handler;
        synchronized (d.class) {
            try {
                if (f2726q == null) {
                    f2726q = new Handler(Looper.getMainLooper());
                }
                handler = f2726q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final boolean a(boolean z6) {
        this.f2729o.set(true);
        return this.f2727m.cancel(z6);
    }

    protected abstract Object b();

    public final void c(Executor executor) {
        if (this.f2728n == e.PENDING) {
            this.f2728n = e.RUNNING;
            executor.execute(this.f2727m);
            return;
        }
        int i7 = C0057d.f2735a[this.f2728n.ordinal()];
        if (i7 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i7 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f2728n = e.FINISHED;
    }

    public final boolean f() {
        return this.f2729o.get();
    }

    protected abstract void g(Object obj);

    protected abstract void h(Object obj);

    void i(Object obj) {
        e().post(new c(obj));
    }

    void j(Object obj) {
        if (this.f2730p.get()) {
            return;
        }
        i(obj);
    }
}
