package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements X3.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final boolean f9481p = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Logger f9482q = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final b f9483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Object f9484s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    volatile Object f9485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    volatile e f9486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    volatile i f9487o;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f9488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f9489d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f9490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f9491b;

        static {
            if (a.f9481p) {
                f9489d = null;
                f9488c = null;
            } else {
                f9489d = new c(false, null);
                f9488c = new c(true, null);
            }
        }

        c(boolean z6, Throwable th) {
            this.f9490a = z6;
            this.f9491b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f9492b = new d(new C0184a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f9493a;

        /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        class C0184a extends Throwable {
            C0184a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f9493a = (Throwable) a.d(th);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f9494d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f9495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f9496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f9497c;

        e(Runnable runnable, Executor executor) {
            this.f9495a = runnable;
            this.f9496b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f9498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f9499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f9500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f9501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f9502e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f9498a = atomicReferenceFieldUpdater;
            this.f9499b = atomicReferenceFieldUpdater2;
            this.f9500c = atomicReferenceFieldUpdater3;
            this.f9501d = atomicReferenceFieldUpdater4;
            this.f9502e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f9501d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f9502e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f9500c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f9499b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f9498a.lazySet(iVar, thread);
        }
    }

    private static final class g implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final a f9503m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final X3.d f9504n;

        g(a aVar, X3.d dVar) {
            this.f9503m = aVar;
            this.f9504n = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9503m.f9485m != this) {
                return;
            }
            if (a.f9483r.b(this.f9503m, this, a.j(this.f9504n))) {
                a.g(this.f9503m);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f9486n != eVar) {
                        return false;
                    }
                    aVar.f9486n = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f9485m != obj) {
                        return false;
                    }
                    aVar.f9485m = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f9487o != iVar) {
                        return false;
                    }
                    aVar.f9487o = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f9507b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f9506a = thread;
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f9505c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f9506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile i f9507b;

        i() {
            a.f9483r.e(this, Thread.currentThread());
        }

        void a(i iVar) {
            a.f9483r.d(this, iVar);
        }

        void b() {
            Thread thread = this.f9506a;
            if (thread != null) {
                this.f9506a = null;
                LockSupport.unpark(thread);
            }
        }

        i(boolean z6) {
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "o"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "n"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "m"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f9483r = hVar;
        if (th != null) {
            f9482q.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f9484s = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb) {
        String str = "]";
        try {
            Object objK = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(objK));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append(str);
        }
    }

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f9486n;
        } while (!f9483r.a(this, eVar2, e.f9494d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f9497c;
            eVar4.f9497c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void g(a aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.b();
            e eVarF = aVar.f(eVar);
            while (eVarF != null) {
                eVar = eVarF.f9497c;
                Runnable runnable = eVarF.f9495a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f9503m;
                    if (aVar.f9485m == gVar) {
                        if (f9483r.b(aVar, gVar, j(gVar.f9504n))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, eVarF.f9496b);
                }
                eVarF = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f9482q.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    private Object i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f9491b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f9493a);
        }
        if (obj == f9484s) {
            return null;
        }
        return obj;
    }

    static Object j(X3.d dVar) {
        if (dVar instanceof a) {
            Object obj = ((a) dVar).f9485m;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f9490a ? cVar.f9491b != null ? new c(false, cVar.f9491b) : c.f9489d : obj;
        }
        boolean zIsCancelled = dVar.isCancelled();
        if ((!f9481p) && zIsCancelled) {
            return c.f9489d;
        }
        try {
            Object objK = k(dVar);
            return objK == null ? f9484s : objK;
        } catch (CancellationException e7) {
            if (zIsCancelled) {
                return new c(false, e7);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dVar, e7));
        } catch (ExecutionException e8) {
            return new d(e8.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static Object k(Future future) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.f9487o;
        } while (!f9483r.c(this, iVar, i.f9505c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f9507b;
        }
    }

    private void o(i iVar) {
        iVar.f9506a = null;
        while (true) {
            i iVar2 = this.f9487o;
            if (iVar2 == i.f9505c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f9507b;
                if (iVar2.f9506a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f9507b = iVar4;
                    if (iVar3.f9506a == null) {
                        break;
                    }
                } else if (!f9483r.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        Object obj = this.f9485m;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f9481p ? new c(z6, new CancellationException("Future.cancel() was called.")) : z6 ? c.f9488c : c.f9489d;
        a aVar = this;
        boolean z7 = false;
        while (true) {
            if (f9483r.b(aVar, obj, cVar)) {
                if (z6) {
                    aVar.l();
                }
                g(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                X3.d dVar = ((g) obj).f9504n;
                if (!(dVar instanceof a)) {
                    dVar.cancel(z6);
                    return true;
                }
                aVar = (a) dVar;
                obj = aVar.f9485m;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z7 = true;
            } else {
                obj = aVar.f9485m;
                if (!(obj instanceof g)) {
                    return z7;
                }
            }
        }
    }

    @Override // X3.d
    public final void e(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f9486n;
        if (eVar != e.f9494d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f9497c = eVar;
                if (f9483r.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f9486n;
                }
            } while (eVar != e.f9494d);
        }
        h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f9485m;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return i(obj2);
        }
        i iVar = this.f9487o;
        if (iVar != i.f9505c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f9483r.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            o(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f9485m;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return i(obj);
                }
                iVar = this.f9487o;
            } while (iVar != i.f9505c);
        }
        return i(this.f9485m);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9485m instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f9485m != null);
    }

    protected void l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String m() {
        Object obj = this.f9485m;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f9504n) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean p(Object obj) {
        if (obj == null) {
            obj = f9484s;
        }
        if (!f9483r.b(this, null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    protected boolean q(Throwable th) {
        if (!f9483r.b(this, null, new d((Throwable) d(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    protected boolean r(X3.d dVar) {
        d dVar2;
        d(dVar);
        Object obj = this.f9485m;
        if (obj == null) {
            if (dVar.isDone()) {
                if (!f9483r.b(this, null, j(dVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            g gVar = new g(this, dVar);
            if (f9483r.b(this, null, gVar)) {
                try {
                    dVar.e(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar2 = new d(th);
                    } catch (Throwable unused) {
                        dVar2 = d.f9492b;
                    }
                    f9483r.b(this, gVar, dVar2);
                }
                return true;
            }
            obj = this.f9485m;
        }
        if (obj instanceof c) {
            dVar.cancel(((c) obj).f9490a);
        }
        return false;
    }

    public String toString() {
        String strM;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (isDone()) {
                a(sb);
            } else {
                try {
                    strM = m();
                } catch (RuntimeException e7) {
                    strM = "Exception thrown from implementation: " + e7.getClass();
                }
                if (strM == null || strM.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    a(sb);
                } else {
                    sb.append("PENDING, info=[");
                    sb.append(strM);
                    sb.append("]");
                }
            }
            sb.append("]");
            return sb.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f9485m;
        if ((obj != null) && (!(obj instanceof g))) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f9487o;
            if (iVar != i.f9505c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f9483r.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f9485m;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                    } else {
                        iVar = this.f9487o;
                    }
                } while (iVar != i.f9505c);
            }
            return i(this.f9485m);
        }
        while (nanos > 0) {
            Object obj3 = this.f9485m;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j7 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j8 = -nanos;
            long jConvert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(jConvert);
            boolean z6 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z6) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z6) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }
}
