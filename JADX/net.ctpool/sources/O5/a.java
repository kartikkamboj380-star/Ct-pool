package O5;

import H5.AbstractC0386c;
import H5.M;
import M5.A;
import M5.F;
import com.google.android.gms.common.api.Api;
import i5.u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.v;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0051a f2494t = new C0051a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f2495u = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f2496v = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f2497w = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final F f2498x = new F("NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f2501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f2502p;
    private volatile long parkedWorkersStack;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final O5.d f2503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final O5.d f2504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final A f2505s;

    /* JADX INFO: renamed from: O5.a$a, reason: collision with other inner class name */
    public static final class C0051a {
        private C0051a() {
        }

        public /* synthetic */ C0051a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2506a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f2506a = iArr;
        }
    }

    public final class c extends Thread {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f2507u = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final n f2508m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final v f2509n;
        private volatile Object nextParkedWorker;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public d f2510o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f2511p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f2512q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f2513r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f2514s;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f2508m = new n();
            this.f2509n = new v();
            this.f2510o = d.DORMANT;
            this.nextParkedWorker = a.f2498x;
            this.f2513r = A5.c.f655m.b();
        }

        private final void b(int i7) {
            if (i7 == 0) {
                return;
            }
            a.f2496v.addAndGet(a.this, -2097152L);
            if (this.f2510o != d.TERMINATED) {
                this.f2510o = d.DORMANT;
            }
        }

        private final void c(int i7) {
            if (i7 != 0 && u(d.BLOCKING)) {
                a.this.W();
            }
        }

        private final void d(h hVar) {
            int iB = hVar.f2532n.b();
            k(iB);
            c(iB);
            a.this.z(hVar);
            b(iB);
        }

        private final h e(boolean z6) {
            h hVarO;
            h hVarO2;
            if (z6) {
                boolean z7 = m(a.this.f2499m * 2) == 0;
                if (z7 && (hVarO2 = o()) != null) {
                    return hVarO2;
                }
                h hVarG = this.f2508m.g();
                if (hVarG != null) {
                    return hVarG;
                }
                if (!z7 && (hVarO = o()) != null) {
                    return hVarO;
                }
            } else {
                h hVarO3 = o();
                if (hVarO3 != null) {
                    return hVarO3;
                }
            }
            return v(3);
        }

        private final h f() {
            h hVarH = this.f2508m.h();
            if (hVarH != null) {
                return hVarH;
            }
            h hVar = (h) a.this.f2504r.d();
            return hVar == null ? v(1) : hVar;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f2507u;
        }

        private final void k(int i7) {
            this.f2511p = 0L;
            if (this.f2510o == d.PARKING) {
                this.f2510o = d.BLOCKING;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != a.f2498x;
        }

        private final void n() {
            if (this.f2511p == 0) {
                this.f2511p = System.nanoTime() + a.this.f2501o;
            }
            LockSupport.parkNanos(a.this.f2501o);
            if (System.nanoTime() - this.f2511p >= 0) {
                this.f2511p = 0L;
                w();
            }
        }

        private final h o() {
            O5.d dVar;
            if (m(2) == 0) {
                h hVar = (h) a.this.f2503q.d();
                if (hVar != null) {
                    return hVar;
                }
                dVar = a.this.f2504r;
            } else {
                h hVar2 = (h) a.this.f2504r.d();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = a.this.f2503q;
            }
            return (h) dVar.d();
        }

        private final void p() {
            loop0: while (true) {
                boolean z6 = false;
                while (!a.this.isTerminated() && this.f2510o != d.TERMINATED) {
                    h hVarG = g(this.f2514s);
                    if (hVarG != null) {
                        this.f2512q = 0L;
                        d(hVarG);
                    } else {
                        this.f2514s = false;
                        if (this.f2512q == 0) {
                            t();
                        } else if (z6) {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f2512q);
                            this.f2512q = 0L;
                        } else {
                            z6 = true;
                        }
                    }
                }
                break loop0;
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            long j7;
            if (this.f2510o == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f2496v;
            do {
                j7 = atomicLongFieldUpdater.get(aVar);
                if (((int) ((9223367638808264704L & j7) >> 42)) == 0) {
                    return false;
                }
            } while (!a.f2496v.compareAndSet(aVar, j7, j7 - 4398046511104L));
            this.f2510o = d.CPU_ACQUIRED;
            return true;
        }

        private final void t() {
            if (!l()) {
                a.this.o(this);
                return;
            }
            f2507u.set(this, -1);
            while (l() && f2507u.get(this) == -1 && !a.this.isTerminated() && this.f2510o != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int i7) {
            int i8 = (int) (a.f2496v.get(a.this) & 2097151);
            if (i8 < 2) {
                return null;
            }
            int iM = m(i8);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i9 = 0; i9 < i8; i9++) {
                iM++;
                if (iM > i8) {
                    iM = 1;
                }
                c cVar = (c) aVar.f2505s.b(iM);
                if (cVar != null && cVar != this) {
                    long jN = cVar.f2508m.n(i7, this.f2509n);
                    if (jN == -1) {
                        v vVar = this.f2509n;
                        h hVar = (h) vVar.f22740m;
                        vVar.f22740m = null;
                        return hVar;
                    }
                    if (jN > 0) {
                        jMin = Math.min(jMin, jN);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f2512q = jMin;
            return null;
        }

        private final void w() {
            a aVar = a.this;
            synchronized (aVar.f2505s) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.f2496v.get(aVar) & 2097151)) <= aVar.f2499m) {
                        return;
                    }
                    if (f2507u.compareAndSet(this, -1, 1)) {
                        int i7 = this.indexInArray;
                        q(0);
                        aVar.w(this, i7, 0);
                        int andDecrement = (int) (a.f2496v.getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i7) {
                            Object objB = aVar.f2505s.b(andDecrement);
                            w5.k.c(objB);
                            c cVar = (c) objB;
                            aVar.f2505s.c(i7, cVar);
                            cVar.q(i7);
                            aVar.w(cVar, andDecrement, i7);
                        }
                        aVar.f2505s.c(andDecrement, null);
                        u uVar = u.f19985a;
                        this.f2510o = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final h g(boolean z6) {
            return s() ? e(z6) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i7) {
            int i8 = this.f2513r;
            int i9 = i8 ^ (i8 << 13);
            int i10 = i9 ^ (i9 >> 17);
            int i11 = i10 ^ (i10 << 5);
            this.f2513r = i11;
            int i12 = i7 - 1;
            return (i12 & i7) == 0 ? i11 & i12 : (i11 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i7;
        }

        public final void q(int i7) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f2502p);
            sb.append("-worker-");
            sb.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
            setName(sb.toString());
            this.indexInArray = i7;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f2510o;
            boolean z6 = dVar2 == d.CPU_ACQUIRED;
            if (z6) {
                a.f2496v.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f2510o = dVar;
            }
            return z6;
        }

        public c(a aVar, int i7) {
            this();
            q(i7);
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i7, int i8, long j7, String str) {
        this.f2499m = i7;
        this.f2500n = i8;
        this.f2501o = j7;
        this.f2502p = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i7 + " should be at least 1").toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should be greater than or equals to core pool size " + i7).toString());
        }
        if (i8 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j7 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j7 + " must be positive").toString());
        }
        this.f2503q = new O5.d();
        this.f2504r = new O5.d();
        this.f2505s = new A((i7 + 1) * 2);
        this.controlState = ((long) i7) << 42;
        this._isTerminated = 0;
    }

    private final void J(long j7, boolean z6) {
        if (z6 || n0() || h0(j7)) {
            return;
        }
        n0();
    }

    private final h a0(c cVar, h hVar, boolean z6) {
        if (cVar == null || cVar.f2510o == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f2532n.b() == 0 && cVar.f2510o == d.BLOCKING) {
            return hVar;
        }
        cVar.f2514s = true;
        return cVar.f2508m.a(hVar, z6);
    }

    private final boolean b(h hVar) {
        return (hVar.f2532n.b() == 1 ? this.f2504r : this.f2503q).a(hVar);
    }

    private final int d() {
        synchronized (this.f2505s) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f2496v;
                long j7 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j7 & 2097151);
                int iC = C5.g.c(i7 - ((int) ((j7 & 4398044413952L) >> 21)), 0);
                if (iC >= this.f2499m) {
                    return 0;
                }
                if (i7 >= this.f2500n) {
                    return 0;
                }
                int i8 = ((int) (f2496v.get(this) & 2097151)) + 1;
                if (i8 <= 0 || this.f2505s.b(i8) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(this, i8);
                this.f2505s.c(i8, cVar);
                if (i8 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i9 = iC + 1;
                cVar.start();
                return i9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final c f() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !w5.k.b(a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final boolean h0(long j7) {
        if (C5.g.c(((int) (2097151 & j7)) - ((int) ((j7 & 4398044413952L) >> 21)), 0) < this.f2499m) {
            int iD = d();
            if (iD == 1 && this.f2499m > 1) {
                d();
            }
            if (iD > 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void j(a aVar, Runnable runnable, i iVar, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            iVar = l.f2541g;
        }
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        aVar.g(runnable, iVar, z6);
    }

    static /* synthetic */ boolean j0(a aVar, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = f2496v.get(aVar);
        }
        return aVar.h0(j7);
    }

    private final int l(c cVar) {
        int iH;
        do {
            Object objI = cVar.i();
            if (objI == f2498x) {
                return -1;
            }
            if (objI == null) {
                return 0;
            }
            cVar = (c) objI;
            iH = cVar.h();
        } while (iH == 0);
        return iH;
    }

    private final c n() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2495u;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f2505s.b((int) (2097151 & j7));
            if (cVar == null) {
                return null;
            }
            long j8 = (2097152 + j7) & (-2097152);
            int iL = l(cVar);
            if (iL >= 0 && f2495u.compareAndSet(this, j7, ((long) iL) | j8)) {
                cVar.r(f2498x);
                return cVar;
            }
        }
    }

    private final boolean n0() {
        c cVarN;
        do {
            cVarN = n();
            if (cVarN == null) {
                return false;
            }
        } while (!c.j().compareAndSet(cVarN, -1, 0));
        LockSupport.unpark(cVarN);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(long j7) throws InterruptedException {
        int i7;
        h hVarG;
        if (f2497w.compareAndSet(this, 0, 1)) {
            c cVarF = f();
            synchronized (this.f2505s) {
                i7 = (int) (f2496v.get(this) & 2097151);
            }
            if (1 <= i7) {
                int i8 = 1;
                while (true) {
                    Object objB = this.f2505s.b(i8);
                    w5.k.c(objB);
                    c cVar = (c) objB;
                    if (cVar != cVarF) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j7);
                        }
                        cVar.f2508m.f(this.f2504r);
                    }
                    if (i8 == i7) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f2504r.b();
            this.f2503q.b();
            while (true) {
                if (cVarF == null) {
                    hVarG = (h) this.f2503q.d();
                    if (hVarG == null && (hVarG = (h) this.f2504r.d()) == null) {
                        break;
                    }
                } else {
                    hVarG = cVarF.g(true);
                    if (hVarG != null) {
                        continue;
                    }
                }
                z(hVarG);
            }
            if (cVarF != null) {
                cVarF.u(d.TERMINATED);
            }
            f2495u.set(this, 0L);
            f2496v.set(this, 0L);
        }
    }

    public final void W() {
        if (n0() || j0(this, 0L, 1, null)) {
            return;
        }
        n0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        B(10000L);
    }

    public final h e(Runnable runnable, i iVar) {
        long jA = l.f2540f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, jA, iVar);
        }
        h hVar = (h) runnable;
        hVar.f2531m = jA;
        hVar.f2532n = iVar;
        return hVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        j(this, runnable, null, false, 6, null);
    }

    public final void g(Runnable runnable, i iVar, boolean z6) {
        AbstractC0386c.a();
        h hVarE = e(runnable, iVar);
        boolean z7 = false;
        boolean z8 = hVarE.f2532n.b() == 1;
        long jAddAndGet = z8 ? f2496v.addAndGet(this, 2097152L) : 0L;
        c cVarF = f();
        h hVarA0 = a0(cVarF, hVarE, z6);
        if (hVarA0 != null && !b(hVarA0)) {
            throw new RejectedExecutionException(this.f2502p + " was terminated");
        }
        if (z6 && cVarF != null) {
            z7 = true;
        }
        if (z8) {
            J(jAddAndGet, z7);
        } else {
            if (z7) {
                return;
            }
            W();
        }
    }

    public final boolean isTerminated() {
        return f2497w.get(this) != 0;
    }

    public final boolean o(c cVar) {
        long j7;
        int iH;
        if (cVar.i() != f2498x) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2495u;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            iH = cVar.h();
            cVar.r(this.f2505s.b((int) (2097151 & j7)));
        } while (!f2495u.compareAndSet(this, j7, ((2097152 + j7) & (-2097152)) | ((long) iH)));
        return true;
    }

    public String toString() {
        StringBuilder sb;
        char c7;
        ArrayList arrayList = new ArrayList();
        int iA = this.f2505s.a();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < iA; i12++) {
            c cVar = (c) this.f2505s.b(i12);
            if (cVar != null) {
                int iE = cVar.f2508m.e();
                int i13 = b.f2506a[cVar.f2510o.ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        i8++;
                        sb = new StringBuilder();
                        sb.append(iE);
                        c7 = 'b';
                    } else if (i13 == 3) {
                        i7++;
                        sb = new StringBuilder();
                        sb.append(iE);
                        c7 = 'c';
                    } else if (i13 == 4) {
                        i10++;
                        if (iE > 0) {
                            sb = new StringBuilder();
                            sb.append(iE);
                            c7 = 'd';
                        }
                    } else if (i13 == 5) {
                        i11++;
                    }
                    sb.append(c7);
                    arrayList.add(sb.toString());
                } else {
                    i9++;
                }
            }
        }
        long j7 = f2496v.get(this);
        return this.f2502p + '@' + M.b(this) + "[Pool Size {core = " + this.f2499m + ", max = " + this.f2500n + "}, Worker States {CPU = " + i7 + ", blocking = " + i8 + ", parked = " + i9 + ", dormant = " + i10 + ", terminated = " + i11 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f2503q.c() + ", global blocking queue size = " + this.f2504r.c() + ", Control State {created workers= " + ((int) (2097151 & j7)) + ", blocking tasks = " + ((int) ((4398044413952L & j7) >> 21)) + ", CPUs acquired = " + (this.f2499m - ((int) ((9223367638808264704L & j7) >> 42))) + "}]";
    }

    public final void w(c cVar, int i7, int i8) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2495u;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            int iL = (int) (2097151 & j7);
            long j8 = (2097152 + j7) & (-2097152);
            if (iL == i7) {
                iL = i8 == 0 ? l(cVar) : i8;
            }
            if (iL >= 0 && f2495u.compareAndSet(this, j7, j8 | ((long) iL))) {
                return;
            }
        }
    }

    public final void z(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }
}
