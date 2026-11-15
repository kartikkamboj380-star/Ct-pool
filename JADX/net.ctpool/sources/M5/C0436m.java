package M5;

import H5.S;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m5.C1889h;
import m5.InterfaceC1888g;

/* JADX INFO: renamed from: M5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0436m extends H5.F implements S {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f2095t = AtomicIntegerFieldUpdater.newUpdater(C0436m.class, "runningWorkers");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final H5.F f2096o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f2097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ S f2098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final r f2099r;
    private volatile int runningWorkers;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f2100s;

    /* JADX INFO: renamed from: M5.m$a */
    private final class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Runnable f2101m;

        public a(Runnable runnable) {
            this.f2101m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i7 = 0;
            while (true) {
                try {
                    this.f2101m.run();
                } catch (Throwable th) {
                    H5.H.a(C1889h.f21267m, th);
                }
                Runnable runnableF1 = C0436m.this.f1();
                if (runnableF1 == null) {
                    return;
                }
                this.f2101m = runnableF1;
                i7++;
                if (i7 >= 16 && C0436m.this.f2096o.g(C0436m.this)) {
                    C0436m.this.f2096o.a(C0436m.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0436m(H5.F f7, int i7) {
        this.f2096o = f7;
        this.f2097p = i7;
        S s6 = f7 instanceof S ? (S) f7 : null;
        this.f2098q = s6 == null ? H5.O.a() : s6;
        this.f2099r = new r(false);
        this.f2100s = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable f1() {
        while (true) {
            Runnable runnable = (Runnable) this.f2099r.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f2100s) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2095t;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f2099r.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean h1() {
        synchronized (this.f2100s) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2095t;
            if (atomicIntegerFieldUpdater.get(this) >= this.f2097p) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // H5.F
    public void a(InterfaceC1888g interfaceC1888g, Runnable runnable) {
        Runnable runnableF1;
        this.f2099r.a(runnable);
        if (f2095t.get(this) >= this.f2097p || !h1() || (runnableF1 = f1()) == null) {
            return;
        }
        this.f2096o.a(this, new a(runnableF1));
    }
}
