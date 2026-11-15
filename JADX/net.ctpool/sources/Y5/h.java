package Y5;

import T5.C0455a;
import Y5.e;
import i5.u;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f4585f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X5.d f4587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f4588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue f4589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4590e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends X5.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // X5.a
        public long f() {
            return h.this.b(System.nanoTime());
        }
    }

    public h(X5.e eVar, int i7, long j7, TimeUnit timeUnit) {
        w5.k.f(eVar, "taskRunner");
        w5.k.f(timeUnit, "timeUnit");
        this.f4590e = i7;
        this.f4586a = timeUnit.toNanos(j7);
        this.f4587b = eVar.i();
        this.f4588c = new b(U5.c.f3991i + " ConnectionPool");
        this.f4589d = new ConcurrentLinkedQueue();
        if (j7 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j7).toString());
    }

    private final int d(f fVar, long j7) {
        if (U5.c.f3990h && !Thread.holdsLock(fVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            w5.k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(fVar);
            throw new AssertionError(sb.toString());
        }
        List listN = fVar.n();
        int i7 = 0;
        while (i7 < listN.size()) {
            Reference reference = (Reference) listN.get(i7);
            if (reference.get() != null) {
                i7++;
            } else {
                d6.j.f18715c.g().m("A connection to " + fVar.A().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                listN.remove(i7);
                fVar.D(true);
                if (listN.isEmpty()) {
                    fVar.C(j7 - this.f4586a);
                    return 0;
                }
            }
        }
        return listN.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:8:0x0024, B:15:0x0033, B:13:0x002d, B:18:0x0037), top: B:26:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(C0455a c0455a, e eVar, List list, boolean z6) {
        w5.k.f(c0455a, "address");
        w5.k.f(eVar, "call");
        for (f fVar : this.f4589d) {
            w5.k.e(fVar, "connection");
            synchronized (fVar) {
                if (z6) {
                    try {
                        if (fVar.v()) {
                            if (fVar.t(c0455a, list)) {
                                eVar.c(fVar);
                                return true;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                u uVar = u.f19985a;
            }
        }
        return false;
    }

    public final long b(long j7) {
        int i7 = 0;
        long j8 = Long.MIN_VALUE;
        f fVar = null;
        int i8 = 0;
        for (f fVar2 : this.f4589d) {
            w5.k.e(fVar2, "connection");
            synchronized (fVar2) {
                try {
                    if (d(fVar2, j7) > 0) {
                        i8++;
                    } else {
                        i7++;
                        long jO = j7 - fVar2.o();
                        if (jO > j8) {
                            u uVar = u.f19985a;
                            fVar = fVar2;
                            j8 = jO;
                        } else {
                            u uVar2 = u.f19985a;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        long j9 = this.f4586a;
        if (j8 < j9 && i7 <= this.f4590e) {
            if (i7 > 0) {
                return j9 - j8;
            }
            if (i8 > 0) {
                return j9;
            }
            return -1L;
        }
        w5.k.c(fVar);
        synchronized (fVar) {
            if (!fVar.n().isEmpty()) {
                return 0L;
            }
            if (fVar.o() + j8 != j7) {
                return 0L;
            }
            fVar.D(true);
            this.f4589d.remove(fVar);
            U5.c.k(fVar.E());
            if (this.f4589d.isEmpty()) {
                this.f4587b.a();
            }
            return 0L;
        }
    }

    public final boolean c(f fVar) {
        w5.k.f(fVar, "connection");
        if (U5.c.f3990h && !Thread.holdsLock(fVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            w5.k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(fVar);
            throw new AssertionError(sb.toString());
        }
        if (!fVar.p() && this.f4590e != 0) {
            X5.d.j(this.f4587b, this.f4588c, 0L, 2, null);
            return false;
        }
        fVar.D(true);
        this.f4589d.remove(fVar);
        if (this.f4589d.isEmpty()) {
            this.f4587b.a();
        }
        return true;
    }

    public final void e(f fVar) {
        w5.k.f(fVar, "connection");
        if (!U5.c.f3990h || Thread.holdsLock(fVar)) {
            this.f4589d.add(fVar);
            X5.d.j(this.f4587b, this.f4588c, 0L, 2, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        w5.k.e(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(fVar);
        throw new AssertionError(sb.toString());
    }
}
