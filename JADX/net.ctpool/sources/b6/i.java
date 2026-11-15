package b6;

import T5.t;
import i5.u;
import i6.A;
import i6.C;
import i6.C1752d;
import i6.D;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f9910o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f9911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f9912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f9913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f9914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f9915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f9917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f9918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d f9919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d f9920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b6.b f9921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private IOException f9922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f9923m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f f9924n;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final class b implements A {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final i6.f f9925m = new i6.f();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private t f9926n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f9927o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f9928p;

        public b(boolean z6) {
            this.f9928p = z6;
        }

        private final void a(boolean z6) throws IOException {
            long jMin;
            boolean z7;
            synchronized (i.this) {
                try {
                    i.this.s().r();
                    while (i.this.r() >= i.this.q() && !this.f9928p && !this.f9927o && i.this.h() == null) {
                        try {
                            i.this.D();
                        } finally {
                        }
                    }
                    i.this.s().y();
                    i.this.c();
                    jMin = Math.min(i.this.q() - i.this.r(), this.f9925m.m1());
                    i iVar = i.this;
                    iVar.B(iVar.r() + jMin);
                    z7 = z6 && jMin == this.f9925m.m1() && i.this.h() == null;
                    u uVar = u.f19985a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            i.this.s().r();
            try {
                i.this.g().A1(i.this.j(), z7, this.f9925m, jMin);
            } finally {
            }
        }

        public final boolean b() {
            return this.f9927o;
        }

        @Override // i6.A, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i iVar = i.this;
            if (U5.c.f3990h && Thread.holdsLock(iVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                w5.k.e(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(iVar);
                throw new AssertionError(sb.toString());
            }
            synchronized (i.this) {
                if (this.f9927o) {
                    return;
                }
                boolean z6 = i.this.h() == null;
                u uVar = u.f19985a;
                if (!i.this.o().f9928p) {
                    boolean z7 = this.f9925m.m1() > 0;
                    if (this.f9926n != null) {
                        while (this.f9925m.m1() > 0) {
                            a(false);
                        }
                        f fVarG = i.this.g();
                        int iJ = i.this.j();
                        t tVar = this.f9926n;
                        w5.k.c(tVar);
                        fVarG.B1(iJ, z6, U5.c.L(tVar));
                    } else if (z7) {
                        while (this.f9925m.m1() > 0) {
                            a(true);
                        }
                    } else if (z6) {
                        i.this.g().A1(i.this.j(), true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f9927o = true;
                    u uVar2 = u.f19985a;
                }
                i.this.g().flush();
                i.this.b();
            }
        }

        public final boolean d() {
            return this.f9928p;
        }

        @Override // i6.A, java.io.Flushable
        public void flush() throws IOException {
            i iVar = i.this;
            if (U5.c.f3990h && Thread.holdsLock(iVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                w5.k.e(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(iVar);
                throw new AssertionError(sb.toString());
            }
            synchronized (i.this) {
                i.this.c();
                u uVar = u.f19985a;
            }
            while (this.f9925m.m1() > 0) {
                a(false);
                i.this.g().flush();
            }
        }

        @Override // i6.A
        public D i() {
            return i.this.s();
        }

        @Override // i6.A
        public void w0(i6.f fVar, long j7) throws IOException {
            w5.k.f(fVar, "source");
            i iVar = i.this;
            if (!U5.c.f3990h || !Thread.holdsLock(iVar)) {
                this.f9925m.w0(fVar, j7);
                while (this.f9925m.m1() >= 16384) {
                    a(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            w5.k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }
    }

    public final class c implements C {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final i6.f f9930m = new i6.f();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final i6.f f9931n = new i6.f();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private t f9932o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f9933p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final long f9934q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f9935r;

        public c(long j7, boolean z6) {
            this.f9934q = j7;
            this.f9935r = z6;
        }

        private final void g(long j7) {
            i iVar = i.this;
            if (!U5.c.f3990h || !Thread.holdsLock(iVar)) {
                i.this.g().z1(j7);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            w5.k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }

        /* JADX WARN: Finally extract failed */
        @Override // i6.C
        public long L0(i6.f fVar, long j7) throws IOException {
            IOException iOExceptionI;
            long jL0;
            boolean z6;
            w5.k.f(fVar, "sink");
            long j8 = 0;
            if (!(j7 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
            }
            while (true) {
                synchronized (i.this) {
                    i.this.m().r();
                    try {
                        if (i.this.h() != null) {
                            iOExceptionI = i.this.i();
                            if (iOExceptionI == null) {
                                b6.b bVarH = i.this.h();
                                w5.k.c(bVarH);
                                iOExceptionI = new n(bVarH);
                            }
                        } else {
                            iOExceptionI = null;
                        }
                        if (this.f9933p) {
                            throw new IOException("stream closed");
                        }
                        if (this.f9931n.m1() > j8) {
                            i6.f fVar2 = this.f9931n;
                            jL0 = fVar2.L0(fVar, Math.min(j7, fVar2.m1()));
                            i iVar = i.this;
                            iVar.A(iVar.l() + jL0);
                            long jL = i.this.l() - i.this.k();
                            if (iOExceptionI == null && jL >= i.this.g().S0().c() / 2) {
                                i.this.g().F1(i.this.j(), jL);
                                i iVar2 = i.this;
                                iVar2.z(iVar2.l());
                            }
                        } else if (this.f9935r || iOExceptionI != null) {
                            jL0 = -1;
                        } else {
                            i.this.D();
                            jL0 = -1;
                            z6 = true;
                            i.this.m().y();
                            u uVar = u.f19985a;
                        }
                        z6 = false;
                        i.this.m().y();
                        u uVar2 = u.f19985a;
                    } catch (Throwable th) {
                        i.this.m().y();
                        throw th;
                    }
                }
                if (!z6) {
                    if (jL0 != -1) {
                        g(jL0);
                        return jL0;
                    }
                    if (iOExceptionI == null) {
                        return -1L;
                    }
                    w5.k.c(iOExceptionI);
                    throw iOExceptionI;
                }
                j8 = 0;
            }
        }

        public final boolean a() {
            return this.f9933p;
        }

        public final boolean b() {
            return this.f9935r;
        }

        @Override // i6.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long jM1;
            synchronized (i.this) {
                this.f9933p = true;
                jM1 = this.f9931n.m1();
                this.f9931n.a();
                i iVar = i.this;
                if (iVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                iVar.notifyAll();
                u uVar = u.f19985a;
            }
            if (jM1 > 0) {
                g(jM1);
            }
            i.this.b();
        }

        public final void d(i6.h hVar, long j7) throws EOFException {
            boolean z6;
            boolean z7;
            long jM1;
            w5.k.f(hVar, "source");
            i iVar = i.this;
            if (U5.c.f3990h && Thread.holdsLock(iVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                w5.k.e(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(iVar);
                throw new AssertionError(sb.toString());
            }
            while (j7 > 0) {
                synchronized (i.this) {
                    z6 = this.f9935r;
                    z7 = this.f9931n.m1() + j7 > this.f9934q;
                    u uVar = u.f19985a;
                }
                if (z7) {
                    hVar.y0(j7);
                    i.this.f(b6.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z6) {
                    hVar.y0(j7);
                    return;
                }
                long jL0 = hVar.L0(this.f9930m, j7);
                if (jL0 == -1) {
                    throw new EOFException();
                }
                j7 -= jL0;
                synchronized (i.this) {
                    try {
                        if (this.f9933p) {
                            jM1 = this.f9930m.m1();
                            this.f9930m.a();
                        } else {
                            boolean z8 = this.f9931n.m1() == 0;
                            this.f9931n.x(this.f9930m);
                            if (z8) {
                                i iVar2 = i.this;
                                if (iVar2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                }
                                iVar2.notifyAll();
                            }
                            jM1 = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (jM1 > 0) {
                    g(jM1);
                }
            }
        }

        public final void e(boolean z6) {
            this.f9935r = z6;
        }

        public final void f(t tVar) {
            this.f9932o = tVar;
        }

        @Override // i6.C
        public D i() {
            return i.this.m();
        }
    }

    public final class d extends C1752d {
        public d() {
        }

        @Override // i6.C1752d
        protected IOException t(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // i6.C1752d
        protected void x() {
            i.this.f(b6.b.CANCEL);
            i.this.g().t1();
        }

        public final void y() throws IOException {
            if (s()) {
                throw t(null);
            }
        }
    }

    public i(int i7, f fVar, boolean z6, boolean z7, t tVar) {
        w5.k.f(fVar, "connection");
        this.f9923m = i7;
        this.f9924n = fVar;
        this.f9914d = fVar.b1().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f9915e = arrayDeque;
        this.f9917g = new c(fVar.S0().c(), z7);
        this.f9918h = new b(z6);
        this.f9919i = new d();
        this.f9920j = new d();
        if (tVar == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!t())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(tVar);
        }
    }

    private final boolean e(b6.b bVar, IOException iOException) {
        if (U5.c.f3990h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            w5.k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            if (this.f9921k != null) {
                return false;
            }
            if (this.f9917g.b() && this.f9918h.d()) {
                return false;
            }
            this.f9921k = bVar;
            this.f9922l = iOException;
            notifyAll();
            u uVar = u.f19985a;
            this.f9924n.s1(this.f9923m);
            return true;
        }
    }

    public final void A(long j7) {
        this.f9911a = j7;
    }

    public final void B(long j7) {
        this.f9913c = j7;
    }

    public final synchronized t C() {
        Object objRemoveFirst;
        this.f9919i.r();
        while (this.f9915e.isEmpty() && this.f9921k == null) {
            try {
                D();
            } catch (Throwable th) {
                this.f9919i.y();
                throw th;
            }
        }
        this.f9919i.y();
        if (!(!this.f9915e.isEmpty())) {
            IOException iOException = this.f9922l;
            if (iOException != null) {
                throw iOException;
            }
            b6.b bVar = this.f9921k;
            w5.k.c(bVar);
            throw new n(bVar);
        }
        objRemoveFirst = this.f9915e.removeFirst();
        w5.k.e(objRemoveFirst, "headersQueue.removeFirst()");
        return (t) objRemoveFirst;
    }

    public final void D() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final D E() {
        return this.f9920j;
    }

    public final void a(long j7) {
        this.f9914d += j7;
        if (j7 > 0) {
            notifyAll();
        }
    }

    public final void b() {
        boolean z6;
        boolean zU;
        if (U5.c.f3990h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            w5.k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            try {
                z6 = !this.f9917g.b() && this.f9917g.a() && (this.f9918h.d() || this.f9918h.b());
                zU = u();
                u uVar = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            d(b6.b.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.f9924n.s1(this.f9923m);
        }
    }

    public final void c() throws IOException {
        if (this.f9918h.b()) {
            throw new IOException("stream closed");
        }
        if (this.f9918h.d()) {
            throw new IOException("stream finished");
        }
        if (this.f9921k != null) {
            IOException iOException = this.f9922l;
            if (iOException != null) {
                throw iOException;
            }
            b6.b bVar = this.f9921k;
            w5.k.c(bVar);
            throw new n(bVar);
        }
    }

    public final void d(b6.b bVar, IOException iOException) {
        w5.k.f(bVar, "rstStatusCode");
        if (e(bVar, iOException)) {
            this.f9924n.D1(this.f9923m, bVar);
        }
    }

    public final void f(b6.b bVar) {
        w5.k.f(bVar, "errorCode");
        if (e(bVar, null)) {
            this.f9924n.E1(this.f9923m, bVar);
        }
    }

    public final f g() {
        return this.f9924n;
    }

    public final synchronized b6.b h() {
        return this.f9921k;
    }

    public final IOException i() {
        return this.f9922l;
    }

    public final int j() {
        return this.f9923m;
    }

    public final long k() {
        return this.f9912b;
    }

    public final long l() {
        return this.f9911a;
    }

    public final d m() {
        return this.f9919i;
    }

    public final A n() {
        synchronized (this) {
            try {
                if (!(this.f9916f || t())) {
                    throw new IllegalStateException("reply before requesting the sink".toString());
                }
                u uVar = u.f19985a;
            } finally {
            }
        }
        return this.f9918h;
    }

    public final b o() {
        return this.f9918h;
    }

    public final c p() {
        return this.f9917g;
    }

    public final long q() {
        return this.f9914d;
    }

    public final long r() {
        return this.f9913c;
    }

    public final d s() {
        return this.f9920j;
    }

    public final boolean t() {
        return this.f9924n.B0() == ((this.f9923m & 1) == 1);
    }

    public final synchronized boolean u() {
        try {
            if (this.f9921k != null) {
                return false;
            }
            if (this.f9917g.b() || this.f9917g.a()) {
                if (this.f9918h.d() || this.f9918h.b()) {
                    if (this.f9916f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final D v() {
        return this.f9919i;
    }

    public final void w(i6.h hVar, int i7) {
        w5.k.f(hVar, "source");
        if (!U5.c.f3990h || !Thread.holdsLock(this)) {
            this.f9917g.d(hVar, i7);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        w5.k.e(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void x(t tVar, boolean z6) {
        boolean zU;
        w5.k.f(tVar, "headers");
        if (U5.c.f3990h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            w5.k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            try {
                if (this.f9916f && z6) {
                    this.f9917g.f(tVar);
                } else {
                    this.f9916f = true;
                    this.f9915e.add(tVar);
                }
                if (z6) {
                    this.f9917g.e(true);
                }
                zU = u();
                notifyAll();
                u uVar = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zU) {
            return;
        }
        this.f9924n.s1(this.f9923m);
    }

    public final synchronized void y(b6.b bVar) {
        w5.k.f(bVar, "errorCode");
        if (this.f9921k == null) {
            this.f9921k = bVar;
            notifyAll();
        }
    }

    public final void z(long j7) {
        this.f9912b = j7;
    }
}
