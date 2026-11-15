package o4;

import S2.f;
import S2.i;
import S2.k;
import U2.l;
import android.os.SystemClock;
import e4.C1629g;
import h4.D;
import h4.Q;
import h4.f0;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p4.C1973d;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f21472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f21473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f21474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f21475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue f21477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f21478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f21479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q f21480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f21482k;

    private final class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final D f21483m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final C2273m f21484n;

        private b(D d7, C2273m c2273m) {
            this.f21483m = d7;
            this.f21484n = c2273m;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.p(this.f21483m, this.f21484n);
            e.this.f21480i.c();
            double dG = e.this.g();
            C1629g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f21483m.d());
            e.q(dG);
        }
    }

    e(double d7, double d8, long j7, i iVar, Q q6) {
        this.f21472a = d7;
        this.f21473b = d8;
        this.f21474c = j7;
        this.f21479h = iVar;
        this.f21480i = q6;
        this.f21475d = SystemClock.elapsedRealtime();
        int i7 = (int) d7;
        this.f21476e = i7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i7);
        this.f21477f = arrayBlockingQueue;
        this.f21478g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f21481j = 0;
        this.f21482k = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f21472a) * Math.pow(this.f21473b, h()));
    }

    private int h() {
        if (this.f21482k == 0) {
            this.f21482k = o();
        }
        int iO = (int) ((o() - this.f21482k) / this.f21474c);
        int iMin = l() ? Math.min(100, this.f21481j + iO) : Math.max(0, this.f21481j - iO);
        if (this.f21481j != iMin) {
            this.f21481j = iMin;
            this.f21482k = o();
        }
        return iMin;
    }

    private boolean k() {
        return this.f21477f.size() < this.f21476e;
    }

    private boolean l() {
        return this.f21477f.size() == this.f21476e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.f21479h, f.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(C2273m c2273m, boolean z6, D d7, Exception exc) {
        if (exc != null) {
            c2273m.d(exc);
            return;
        }
        if (z6) {
            j();
        }
        c2273m.e(d7);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final D d7, final C2273m c2273m) {
        C1629g.f().b("Sending report through Google DataTransport: " + d7.d());
        final boolean z6 = SystemClock.elapsedRealtime() - this.f21475d < 2000;
        this.f21479h.b(S2.d.h(d7.b()), new k() { // from class: o4.c
            @Override // S2.k
            public final void a(Exception exc) {
                this.f21466a.n(c2273m, z6, d7, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d7) {
        try {
            Thread.sleep((long) d7);
        } catch (InterruptedException unused) {
        }
    }

    C2273m i(D d7, boolean z6) {
        synchronized (this.f21477f) {
            try {
                C2273m c2273m = new C2273m();
                if (!z6) {
                    p(d7, c2273m);
                    return c2273m;
                }
                this.f21480i.b();
                if (!k()) {
                    h();
                    C1629g.f().b("Dropping report due to queue being full: " + d7.d());
                    this.f21480i.a();
                    c2273m.e(d7);
                    return c2273m;
                }
                C1629g.f().b("Enqueueing report: " + d7.d());
                C1629g.f().b("Queue size: " + this.f21477f.size());
                this.f21478g.execute(new b(d7, c2273m));
                C1629g.f().b("Closing task for report: " + d7.d());
                c2273m.e(d7);
                return c2273m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: o4.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f21470m.m(countDownLatch);
            }
        }).start();
        f0.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    e(i iVar, C1973d c1973d, Q q6) {
        this(c1973d.f21623f, c1973d.f21624g, ((long) c1973d.f21625h) * 1000, iVar, q6);
    }
}
