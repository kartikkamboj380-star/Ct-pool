package X5;

import com.google.android.gms.common.api.Api;
import i5.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Logger f4368i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f4372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f4373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f4374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f4375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f4376g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f4369j = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f4367h = new e(new c(U5.c.K(U5.c.f3991i + " TaskRunner", true)));

    public interface a {
        void a(e eVar, long j7);

        void b(e eVar);

        void execute(Runnable runnable);

        long nanoTime();
    }

    public static final class b {
        private b() {
        }

        public final Logger a() {
            return e.f4368i;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f4377a;

        public c(ThreadFactory threadFactory) {
            k.f(threadFactory, "threadFactory");
            this.f4377a = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // X5.e.a
        public void a(e eVar, long j7) throws InterruptedException {
            k.f(eVar, "taskRunner");
            long j8 = j7 / 1000000;
            long j9 = j7 - (1000000 * j8);
            if (j8 > 0 || j7 > 0) {
                eVar.wait(j8, (int) j9);
            }
        }

        @Override // X5.e.a
        public void b(e eVar) {
            k.f(eVar, "taskRunner");
            eVar.notify();
        }

        @Override // X5.e.a
        public void execute(Runnable runnable) {
            k.f(runnable, "runnable");
            this.f4377a.execute(runnable);
        }

        @Override // X5.e.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            X5.a aVarD;
            long jNanoTime;
            while (true) {
                synchronized (e.this) {
                    aVarD = e.this.d();
                }
                if (aVarD == null) {
                    return;
                }
                X5.d dVarD = aVarD.d();
                k.c(dVarD);
                boolean zIsLoggable = e.f4369j.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = dVarD.h().g().nanoTime();
                    X5.b.c(aVarD, dVarD, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    try {
                        e.this.j(aVarD);
                        u uVar = u.f19985a;
                        if (zIsLoggable) {
                            X5.b.c(aVarD, dVarD, "finished run in " + X5.b.b(dVarD.h().g().nanoTime() - jNanoTime));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        X5.b.c(aVarD, dVarD, "failed a run in " + X5.b.b(dVarD.h().g().nanoTime() - jNanoTime));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        k.e(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f4368i = logger;
    }

    public e(a aVar) {
        k.f(aVar, "backend");
        this.f4376g = aVar;
        this.f4370a = 10000;
        this.f4373d = new ArrayList();
        this.f4374e = new ArrayList();
        this.f4375f = new d();
    }

    private final void c(X5.a aVar, long j7) {
        if (U5.c.f3990h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        X5.d dVarD = aVar.d();
        k.c(dVarD);
        if (!(dVarD.c() == aVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zD = dVarD.d();
        dVarD.m(false);
        dVarD.l(null);
        this.f4373d.remove(dVarD);
        if (j7 != -1 && !zD && !dVarD.g()) {
            dVarD.k(aVar, j7, true);
        }
        if (!dVarD.e().isEmpty()) {
            this.f4374e.add(dVarD);
        }
    }

    private final void e(X5.a aVar) {
        if (!U5.c.f3990h || Thread.holdsLock(this)) {
            aVar.g(-1L);
            X5.d dVarD = aVar.d();
            k.c(dVarD);
            dVarD.e().remove(aVar);
            this.f4374e.remove(dVarD);
            dVarD.l(aVar);
            this.f4373d.add(dVarD);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        k.e(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(X5.a aVar) {
        if (U5.c.f3990h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        k.e(threadCurrentThread2, "currentThread");
        String name = threadCurrentThread2.getName();
        threadCurrentThread2.setName(aVar.b());
        try {
            long jF = aVar.f();
            synchronized (this) {
                c(aVar, jF);
                u uVar = u.f19985a;
            }
            threadCurrentThread2.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                c(aVar, -1L);
                u uVar2 = u.f19985a;
                threadCurrentThread2.setName(name);
                throw th;
            }
        }
    }

    public final X5.a d() {
        boolean z6;
        if (U5.c.f3990h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        while (!this.f4374e.isEmpty()) {
            long jNanoTime = this.f4376g.nanoTime();
            Iterator it = this.f4374e.iterator();
            long jMin = Long.MAX_VALUE;
            X5.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                X5.a aVar2 = (X5.a) ((X5.d) it.next()).e().get(0);
                long jMax = Math.max(0L, aVar2.c() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z6 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z6 || (!this.f4371b && (!this.f4374e.isEmpty()))) {
                    this.f4376g.execute(this.f4375f);
                }
                return aVar;
            }
            if (this.f4371b) {
                if (jMin < this.f4372c - jNanoTime) {
                    this.f4376g.b(this);
                }
                return null;
            }
            this.f4371b = true;
            this.f4372c = jNanoTime + jMin;
            try {
                try {
                    this.f4376g.a(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
            } finally {
                this.f4371b = false;
            }
        }
        return null;
    }

    public final void f() {
        for (int size = this.f4373d.size() - 1; size >= 0; size--) {
            ((X5.d) this.f4373d.get(size)).b();
        }
        for (int size2 = this.f4374e.size() - 1; size2 >= 0; size2--) {
            X5.d dVar = (X5.d) this.f4374e.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f4374e.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f4376g;
    }

    public final void h(X5.d dVar) {
        k.f(dVar, "taskQueue");
        if (U5.c.f3990h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (dVar.c() == null) {
            if (!dVar.e().isEmpty()) {
                U5.c.a(this.f4374e, dVar);
            } else {
                this.f4374e.remove(dVar);
            }
        }
        if (this.f4371b) {
            this.f4376g.b(this);
        } else {
            this.f4376g.execute(this.f4375f);
        }
    }

    public final X5.d i() {
        int i7;
        synchronized (this) {
            i7 = this.f4370a;
            this.f4370a = i7 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i7);
        return new X5.d(this, sb.toString());
    }
}
