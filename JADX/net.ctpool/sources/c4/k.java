package c4;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
final class k implements Executor {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Logger f10078r = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Executor f10079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Deque f10080n = new ArrayDeque();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f10081o = c.IDLE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f10082p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b f10083q = new b(this, null);

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Runnable f10084m;

        a(Runnable runnable) {
            this.f10084m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10084m.run();
        }

        public String toString() {
            return this.f10084m.toString();
        }
    }

    private final class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Runnable f10086m;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r8.f10086m.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        
            c4.k.f10078r.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f10086m, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        
            r8.f10086m = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a() {
            boolean z6 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (k.this.f10080n) {
                        if (!z6) {
                            c cVar = k.this.f10081o;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                k.d(k.this);
                                k.this.f10081o = cVar2;
                                z6 = true;
                            }
                        }
                        Runnable runnable = (Runnable) k.this.f10080n.poll();
                        this.f10086m = runnable;
                        if (runnable == null) {
                            k.this.f10081o = c.IDLE;
                        }
                    }
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } finally {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e7) {
                synchronized (k.this.f10080n) {
                    k.this.f10081o = c.IDLE;
                    throw e7;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f10086m;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + k.this.f10081o + "}";
        }

        /* synthetic */ b(k kVar, a aVar) {
            this();
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    k(Executor executor) {
        this.f10079m = (Executor) Preconditions.checkNotNull(executor);
    }

    static /* synthetic */ long d(k kVar) {
        long j7 = kVar.f10082p;
        kVar.f10082p = 1 + j7;
        return j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(Runnable runnable) {
        c cVar;
        boolean z6;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f10080n) {
            c cVar2 = this.f10081o;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j7 = this.f10082p;
                a aVar = new a(runnable);
                this.f10080n.add(aVar);
                c cVar3 = c.QUEUING;
                this.f10081o = cVar3;
                try {
                    this.f10079m.execute(this.f10083q);
                    if (this.f10081o != cVar3) {
                        return;
                    }
                    synchronized (this.f10080n) {
                        try {
                            if (this.f10082p == j7 && this.f10081o == cVar3) {
                                this.f10081o = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f10080n) {
                        try {
                            c cVar4 = this.f10081o;
                            if (cVar4 == c.IDLE || cVar4 == c.QUEUING) {
                                z6 = this.f10080n.removeLastOccurrence(aVar);
                            }
                            if (!(e7 instanceof RejectedExecutionException) || z6) {
                                throw e7;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f10080n.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f10079m + "}";
    }
}
