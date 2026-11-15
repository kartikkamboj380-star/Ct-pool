package androidx.concurrent.futures;

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
    static final boolean f6238p = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Logger f6239q = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final b f6240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Object f6241s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    volatile Object f6242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    volatile e f6243n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    volatile h f6244o;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f6245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f6246d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f6247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f6248b;

        static {
            if (a.f6238p) {
                f6246d = null;
                f6245c = null;
            } else {
                f6246d = new c(false, null);
                f6245c = new c(true, null);
            }
        }

        c(boolean z6, Throwable th) {
            this.f6247a = z6;
            this.f6248b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f6249b = new d(new C0126a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f6250a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0126a extends Throwable {
            C0126a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f6250a = (Throwable) a.l(th);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f6251d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f6252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f6253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f6254c;

        e(Runnable runnable, Executor executor) {
            this.f6252a = runnable;
            this.f6253b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f6255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f6256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f6257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f6258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f6259e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f6255a = atomicReferenceFieldUpdater;
            this.f6256b = atomicReferenceFieldUpdater2;
            this.f6257c = atomicReferenceFieldUpdater3;
            this.f6258d = atomicReferenceFieldUpdater4;
            this.f6259e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f6258d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f6259e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            return androidx.concurrent.futures.b.a(this.f6257c, aVar, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            this.f6256b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            this.f6255a.lazySet(hVar, thread);
        }
    }

    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6243n != eVar) {
                        return false;
                    }
                    aVar.f6243n = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6242m != obj) {
                        return false;
                    }
                    aVar.f6242m = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6244o != hVar) {
                        return false;
                    }
                    aVar.f6244o = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            hVar.f6262b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            hVar.f6261a = thread;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final h f6260c = new h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f6261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile h f6262b;

        h() {
            a.f6240r.e(this, Thread.currentThread());
        }

        void a(h hVar) {
            a.f6240r.d(this, hVar);
        }

        void b() {
            Thread thread = this.f6261a;
            if (thread != null) {
                this.f6261a = null;
                LockSupport.unpark(thread);
            }
        }

        h(boolean z6) {
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "o"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "n"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "m"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f6240r = gVar;
        if (th != null) {
            f6239q.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f6241s = new Object();
    }

    protected a() {
    }

    private void h(StringBuilder sb) {
        String str = "]";
        try {
            Object objQ = q(this);
            sb.append("SUCCESS, result=[");
            sb.append(x(objQ));
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

    private static CancellationException k(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object l(Object obj) {
        obj.getClass();
        return obj;
    }

    private e m(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f6243n;
        } while (!f6240r.a(this, eVar2, e.f6251d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f6254c;
            eVar4.f6254c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void n(a aVar) {
        aVar.t();
        aVar.j();
        e eVarM = aVar.m(null);
        while (eVarM != null) {
            e eVar = eVarM.f6254c;
            o(eVarM.f6252a, eVarM.f6253b);
            eVarM = eVar;
        }
    }

    private static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f6239q.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    private Object p(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw k("Task was cancelled.", ((c) obj).f6248b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f6250a);
        }
        if (obj == f6241s) {
            return null;
        }
        return obj;
    }

    static Object q(Future future) {
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

    private void t() {
        h hVar;
        do {
            hVar = this.f6244o;
        } while (!f6240r.c(this, hVar, h.f6260c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f6262b;
        }
    }

    private void u(h hVar) {
        hVar.f6261a = null;
        while (true) {
            h hVar2 = this.f6244o;
            if (hVar2 == h.f6260c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f6262b;
                if (hVar2.f6261a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f6262b = hVar4;
                    if (hVar3.f6261a == null) {
                        break;
                    }
                } else if (!f6240r.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    private String x(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        Object obj = this.f6242m;
        if (obj == null) {
            if (f6240r.b(this, obj, f6238p ? new c(z6, new CancellationException("Future.cancel() was called.")) : z6 ? c.f6245c : c.f6246d)) {
                if (z6) {
                    r();
                }
                n(this);
                return true;
            }
        }
        return false;
    }

    @Override // X3.d
    public final void e(Runnable runnable, Executor executor) {
        l(runnable);
        l(executor);
        e eVar = this.f6243n;
        if (eVar != e.f6251d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f6254c = eVar;
                if (f6240r.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f6243n;
                }
            } while (eVar != e.f6251d);
        }
        o(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f6242m;
        if (obj2 != null) {
            return p(obj2);
        }
        h hVar = this.f6244o;
        if (hVar != h.f6260c) {
            h hVar2 = new h();
            do {
                hVar2.a(hVar);
                if (f6240r.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            u(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f6242m;
                    } while (!(obj != null));
                    return p(obj);
                }
                hVar = this.f6244o;
            } while (hVar != h.f6260c);
        }
        return p(this.f6242m);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6242m instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6242m != null;
    }

    protected void j() {
    }

    protected void r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String s() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public String toString() {
        String strS;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (isDone()) {
                h(sb);
            } else {
                try {
                    strS = s();
                } catch (RuntimeException e7) {
                    strS = "Exception thrown from implementation: " + e7.getClass();
                }
                if (strS == null || strS.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    h(sb);
                } else {
                    sb.append("PENDING, info=[");
                    sb.append(strS);
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

    protected boolean v(Object obj) {
        if (obj == null) {
            obj = f6241s;
        }
        if (!f6240r.b(this, null, obj)) {
            return false;
        }
        n(this);
        return true;
    }

    protected boolean w(Throwable th) {
        if (!f6240r.b(this, null, new d((Throwable) l(th)))) {
            return false;
        }
        n(this);
        return true;
    }

    protected final boolean y() {
        Object obj = this.f6242m;
        return (obj instanceof c) && ((c) obj).f6247a;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f6242m;
        if (obj != null) {
            return p(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f6244o;
            if (hVar != h.f6260c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f6240r.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                u(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f6242m;
                            if (obj2 != null) {
                                return p(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        u(hVar2);
                    } else {
                        hVar = this.f6244o;
                    }
                } while (hVar != h.f6260c);
            }
            return p(this.f6242m);
        }
        while (nanos > 0) {
            Object obj3 = this.f6242m;
            if (obj3 != null) {
                return p(obj3);
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
