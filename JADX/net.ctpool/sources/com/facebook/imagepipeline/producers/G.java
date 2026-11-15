package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f10746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f10747b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10750e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f10748c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f10749d = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    D1.g f10751f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f10752g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    f f10753h = f.IDLE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f10754i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f10755j = 0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.d();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.j();
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10758a;

        static {
            int[] iArr = new int[f.values().length];
            f10758a = iArr;
            try {
                iArr[f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10758a[f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10758a[f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10758a[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface d {
        void a(D1.g gVar, int i7);
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static ScheduledExecutorService f10759a;

        static ScheduledExecutorService a() {
            if (f10759a == null) {
                f10759a = Executors.newSingleThreadScheduledExecutor();
            }
            return f10759a;
        }
    }

    enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public G(Executor executor, d dVar, int i7) {
        this.f10746a = executor;
        this.f10747b = dVar;
        this.f10750e = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        D1.g gVar;
        int i7;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            gVar = this.f10751f;
            i7 = this.f10752g;
            this.f10751f = null;
            this.f10752g = 0;
            this.f10753h = f.RUNNING;
            this.f10755j = jUptimeMillis;
        }
        try {
            if (i(gVar, i7)) {
                this.f10747b.a(gVar, i7);
            }
        } finally {
            D1.g.d(gVar);
            g();
        }
    }

    private void e(long j7) {
        Runnable runnableA = E1.a.a(this.f10749d, "JobScheduler_enqueueJob");
        if (j7 > 0) {
            e.a().schedule(runnableA, j7, TimeUnit.MILLISECONDS);
        } else {
            runnableA.run();
        }
    }

    private void g() {
        long jMax;
        boolean z6;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f10753h == f.RUNNING_AND_PENDING) {
                    jMax = Math.max(this.f10755j + ((long) this.f10750e), jUptimeMillis);
                    this.f10754i = jUptimeMillis;
                    this.f10753h = f.QUEUED;
                    z6 = true;
                } else {
                    this.f10753h = f.IDLE;
                    jMax = 0;
                    z6 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            e(jMax - jUptimeMillis);
        }
    }

    private static boolean i(D1.g gVar, int i7) {
        return AbstractC0766c.e(i7) || AbstractC0766c.n(i7, 4) || D1.g.j0(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f10746a.execute(E1.a.a(this.f10748c, "JobScheduler_submitJob"));
    }

    public void c() {
        D1.g gVar;
        synchronized (this) {
            gVar = this.f10751f;
            this.f10751f = null;
            this.f10752g = 0;
        }
        D1.g.d(gVar);
    }

    public synchronized long f() {
        return this.f10755j - this.f10754i;
    }

    public boolean h() {
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                boolean z6 = false;
                if (!i(this.f10751f, this.f10752g)) {
                    return false;
                }
                int i7 = c.f10758a[this.f10753h.ordinal()];
                if (i7 != 1) {
                    if (i7 == 3) {
                        this.f10753h = f.RUNNING_AND_PENDING;
                    }
                    jMax = 0;
                } else {
                    jMax = Math.max(this.f10755j + ((long) this.f10750e), jUptimeMillis);
                    this.f10754i = jUptimeMillis;
                    this.f10753h = f.QUEUED;
                    z6 = true;
                }
                if (z6) {
                    e(jMax - jUptimeMillis);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean k(D1.g gVar, int i7) {
        D1.g gVar2;
        if (!i(gVar, i7)) {
            return false;
        }
        synchronized (this) {
            gVar2 = this.f10751f;
            this.f10751f = D1.g.b(gVar);
            this.f10752g = i7;
        }
        D1.g.d(gVar2);
        return true;
    }
}
