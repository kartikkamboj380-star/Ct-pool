package i6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1752d extends D {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f19996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f19997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static C1752d f19998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f19999l = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1752d f20001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f20002h;

    /* JADX INFO: renamed from: i6.d$a */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(C1752d c1752d) {
            synchronized (C1752d.class) {
                for (C1752d c1752d2 = C1752d.f19998k; c1752d2 != null; c1752d2 = c1752d2.f20001g) {
                    if (c1752d2.f20001g == c1752d) {
                        c1752d2.f20001g = c1752d.f20001g;
                        c1752d.f20001g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x001c, B:12:0x0028, B:13:0x0031, B:18:0x0042, B:19:0x004a, B:21:0x0053, B:24:0x0063, B:25:0x0068, B:27:0x0078, B:28:0x007d, B:17:0x003b, B:31:0x0081, B:32:0x0086), top: B:35:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x001c, B:12:0x0028, B:13:0x0031, B:18:0x0042, B:19:0x004a, B:21:0x0053, B:24:0x0063, B:25:0x0068, B:27:0x0078, B:28:0x007d, B:17:0x003b, B:31:0x0081, B:32:0x0086), top: B:35:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[EDGE_INSN: B:36:0x0068->B:25:0x0068 BREAK  A[LOOP:0: B:19:0x004a->B:24:0x0063], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void e(C1752d c1752d, long j7, boolean z6) {
            C1752d c1752d2;
            synchronized (C1752d.class) {
                try {
                    if (C1752d.f19998k == null) {
                        C1752d.f19998k = new C1752d();
                        new b().start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j7 != 0 && z6) {
                        j7 = Math.min(j7, c1752d.c() - jNanoTime);
                    } else if (j7 == 0) {
                        if (!z6) {
                            throw new AssertionError();
                        }
                        c1752d.f20002h = c1752d.c();
                        long jU = c1752d.u(jNanoTime);
                        c1752d2 = C1752d.f19998k;
                        while (true) {
                            w5.k.c(c1752d2);
                            if (c1752d2.f20001g != null) {
                                break;
                            }
                            C1752d c1752d3 = c1752d2.f20001g;
                            w5.k.c(c1752d3);
                            if (jU < c1752d3.u(jNanoTime)) {
                                break;
                            } else {
                                c1752d2 = c1752d2.f20001g;
                            }
                        }
                        c1752d.f20001g = c1752d2.f20001g;
                        c1752d2.f20001g = c1752d;
                        if (c1752d2 == C1752d.f19998k) {
                            C1752d.class.notify();
                        }
                        i5.u uVar = i5.u.f19985a;
                    }
                    c1752d.f20002h = j7 + jNanoTime;
                    long jU2 = c1752d.u(jNanoTime);
                    c1752d2 = C1752d.f19998k;
                    while (true) {
                        w5.k.c(c1752d2);
                        if (c1752d2.f20001g != null) {
                        }
                        c1752d2 = c1752d2.f20001g;
                    }
                    c1752d.f20001g = c1752d2.f20001g;
                    c1752d2.f20001g = c1752d;
                    if (c1752d2 == C1752d.f19998k) {
                    }
                    i5.u uVar2 = i5.u.f19985a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final C1752d c() throws InterruptedException {
            C1752d c1752d = C1752d.f19998k;
            w5.k.c(c1752d);
            C1752d c1752d2 = c1752d.f20001g;
            long jNanoTime = System.nanoTime();
            if (c1752d2 == null) {
                C1752d.class.wait(C1752d.f19996i);
                C1752d c1752d3 = C1752d.f19998k;
                w5.k.c(c1752d3);
                if (c1752d3.f20001g != null || System.nanoTime() - jNanoTime < C1752d.f19997j) {
                    return null;
                }
                return C1752d.f19998k;
            }
            long jU = c1752d2.u(jNanoTime);
            if (jU > 0) {
                long j7 = jU / 1000000;
                C1752d.class.wait(j7, (int) (jU - (1000000 * j7)));
                return null;
            }
            C1752d c1752d4 = C1752d.f19998k;
            w5.k.c(c1752d4);
            c1752d4.f20001g = c1752d2.f20001g;
            c1752d2.f20001g = null;
            return c1752d2;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: i6.d$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C1752d c1752dC;
            while (true) {
                try {
                    synchronized (C1752d.class) {
                        c1752dC = C1752d.f19999l.c();
                        if (c1752dC == C1752d.f19998k) {
                            C1752d.f19998k = null;
                            return;
                        }
                        i5.u uVar = i5.u.f19985a;
                    }
                    if (c1752dC != null) {
                        c1752dC.x();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i6.d$c */
    public static final class c implements A {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ A f20004n;

        c(A a7) {
            this.f20004n = a7;
        }

        @Override // i6.A
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1752d i() {
            return C1752d.this;
        }

        @Override // i6.A, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C1752d c1752d = C1752d.this;
            c1752d.r();
            try {
                this.f20004n.close();
                i5.u uVar = i5.u.f19985a;
                if (c1752d.s()) {
                    throw c1752d.m(null);
                }
            } catch (IOException e7) {
                if (!c1752d.s()) {
                    throw e7;
                }
                throw c1752d.m(e7);
            } finally {
                c1752d.s();
            }
        }

        @Override // i6.A, java.io.Flushable
        public void flush() throws IOException {
            C1752d c1752d = C1752d.this;
            c1752d.r();
            try {
                this.f20004n.flush();
                i5.u uVar = i5.u.f19985a;
                if (c1752d.s()) {
                    throw c1752d.m(null);
                }
            } catch (IOException e7) {
                if (!c1752d.s()) {
                    throw e7;
                }
                throw c1752d.m(e7);
            } finally {
                c1752d.s();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f20004n + ')';
        }

        @Override // i6.A
        public void w0(f fVar, long j7) throws IOException {
            w5.k.f(fVar, "source");
            AbstractC1751c.b(fVar.m1(), 0L, j7);
            while (true) {
                long j8 = 0;
                if (j7 <= 0) {
                    return;
                }
                x xVar = fVar.f20007m;
                while (true) {
                    w5.k.c(xVar);
                    if (j8 >= 65536) {
                        break;
                    }
                    j8 += (long) (xVar.f20057c - xVar.f20056b);
                    if (j8 >= j7) {
                        j8 = j7;
                        break;
                    }
                    xVar = xVar.f20060f;
                }
                C1752d c1752d = C1752d.this;
                c1752d.r();
                try {
                    this.f20004n.w0(fVar, j8);
                    i5.u uVar = i5.u.f19985a;
                    if (c1752d.s()) {
                        throw c1752d.m(null);
                    }
                    j7 -= j8;
                } catch (IOException e7) {
                    if (!c1752d.s()) {
                        throw e7;
                    }
                    throw c1752d.m(e7);
                } finally {
                    c1752d.s();
                }
            }
        }
    }

    /* JADX INFO: renamed from: i6.d$d, reason: collision with other inner class name */
    public static final class C0268d implements C {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ C f20006n;

        C0268d(C c7) {
            this.f20006n = c7;
        }

        @Override // i6.C
        public long L0(f fVar, long j7) throws IOException {
            w5.k.f(fVar, "sink");
            C1752d c1752d = C1752d.this;
            c1752d.r();
            try {
                long jL0 = this.f20006n.L0(fVar, j7);
                if (c1752d.s()) {
                    throw c1752d.m(null);
                }
                return jL0;
            } catch (IOException e7) {
                if (c1752d.s()) {
                    throw c1752d.m(e7);
                }
                throw e7;
            } finally {
                c1752d.s();
            }
        }

        @Override // i6.C
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1752d i() {
            return C1752d.this;
        }

        @Override // i6.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C1752d c1752d = C1752d.this;
            c1752d.r();
            try {
                this.f20006n.close();
                i5.u uVar = i5.u.f19985a;
                if (c1752d.s()) {
                    throw c1752d.m(null);
                }
            } catch (IOException e7) {
                if (!c1752d.s()) {
                    throw e7;
                }
                throw c1752d.m(e7);
            } finally {
                c1752d.s();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f20006n + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f19996i = millis;
        f19997j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long u(long j7) {
        return this.f20002h - j7;
    }

    public final IOException m(IOException iOException) {
        return t(iOException);
    }

    public final void r() {
        if (!(!this.f20000f)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            this.f20000f = true;
            f19999l.e(this, jH, zE);
        }
    }

    public final boolean s() {
        if (!this.f20000f) {
            return false;
        }
        this.f20000f = false;
        return f19999l.d(this);
    }

    protected IOException t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final A v(A a7) {
        w5.k.f(a7, "sink");
        return new c(a7);
    }

    public final C w(C c7) {
        w5.k.f(c7, "source");
        return new C0268d(c7);
    }

    protected void x() {
    }
}
