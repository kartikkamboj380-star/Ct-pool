package Y5;

import T5.B;
import T5.C0455a;
import T5.C0461g;
import T5.D;
import T5.InterfaceC0459e;
import T5.InterfaceC0460f;
import T5.p;
import T5.r;
import T5.z;
import i5.AbstractC1744a;
import i5.u;
import i6.C1752d;
import j5.AbstractC1809n;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements InterfaceC0459e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private volatile f f4536A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final z f4537B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final B f4538C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f4539D;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final h f4540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final r f4541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c f4542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f4543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Object f4544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private d f4545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private f f4546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f4547t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Y5.c f4548u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f4549v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f4550w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f4551x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile boolean f4552y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile Y5.c f4553z;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private volatile AtomicInteger f4554m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final InterfaceC0460f f4555n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ e f4556o;

        public a(e eVar, InterfaceC0460f interfaceC0460f) {
            w5.k.f(interfaceC0460f, "responseCallback");
            this.f4556o = eVar;
            this.f4555n = interfaceC0460f;
            this.f4554m = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            w5.k.f(executorService, "executorService");
            p pVarQ = this.f4556o.k().q();
            if (U5.c.f3990h && Thread.holdsLock(pVarQ)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                w5.k.e(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(pVarQ);
                throw new AssertionError(sb.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e7) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e7);
                    this.f4556o.v(interruptedIOException);
                    this.f4555n.b(this.f4556o, interruptedIOException);
                    this.f4556o.k().q().f(this);
                }
            } catch (Throwable th) {
                this.f4556o.k().q().f(this);
                throw th;
            }
        }

        public final e b() {
            return this.f4556o;
        }

        public final AtomicInteger c() {
            return this.f4554m;
        }

        public final String d() {
            return this.f4556o.r().l().h();
        }

        public final void e(a aVar) {
            w5.k.f(aVar, "other");
            this.f4554m = aVar.f4554m;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            Throwable th;
            IOException e7;
            p pVarQ;
            String str = "OkHttp " + this.f4556o.x();
            Thread threadCurrentThread = Thread.currentThread();
            w5.k.e(threadCurrentThread, "currentThread");
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                this.f4556o.f4542o.r();
                try {
                    try {
                        z6 = true;
                        try {
                            this.f4555n.a(this.f4556o, this.f4556o.s());
                            pVarQ = this.f4556o.k().q();
                        } catch (IOException e8) {
                            e7 = e8;
                            if (z6) {
                                d6.j.f18715c.g().k("Callback failure for " + this.f4556o.D(), 4, e7);
                            } else {
                                this.f4555n.b(this.f4556o, e7);
                            }
                            pVarQ = this.f4556o.k().q();
                        } catch (Throwable th2) {
                            th = th2;
                            this.f4556o.cancel();
                            if (!z6) {
                                IOException iOException = new IOException("canceled due to " + th);
                                AbstractC1744a.a(iOException, th);
                                this.f4555n.b(this.f4556o, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        this.f4556o.k().q().f(this);
                        throw th3;
                    }
                } catch (IOException e9) {
                    z6 = false;
                    e7 = e9;
                } catch (Throwable th4) {
                    z6 = false;
                    th = th4;
                }
                pVarQ.f(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    public static final class b extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f4557a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            w5.k.f(eVar, "referent");
            this.f4557a = obj;
        }

        public final Object a() {
            return this.f4557a;
        }
    }

    public static final class c extends C1752d {
        c() {
        }

        @Override // i6.C1752d
        protected void x() {
            e.this.cancel();
        }
    }

    public e(z zVar, B b7, boolean z6) {
        w5.k.f(zVar, "client");
        w5.k.f(b7, "originalRequest");
        this.f4537B = zVar;
        this.f4538C = b7;
        this.f4539D = z6;
        this.f4540m = zVar.l().a();
        this.f4541n = zVar.s().a(this);
        c cVar = new c();
        cVar.g(zVar.h(), TimeUnit.MILLISECONDS);
        u uVar = u.f19985a;
        this.f4542o = cVar;
        this.f4543p = new AtomicBoolean();
        this.f4551x = true;
    }

    private final IOException C(IOException iOException) {
        if (this.f4547t || !this.f4542o.s()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D() {
        StringBuilder sb = new StringBuilder();
        sb.append(n0() ? "canceled " : "");
        sb.append(this.f4539D ? "web socket" : "call");
        sb.append(" to ");
        sb.append(x());
        return sb.toString();
    }

    private final IOException d(IOException iOException) {
        Socket socketY;
        boolean z6 = U5.c.f3990h;
        if (z6 && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            w5.k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        f fVar = this.f4546s;
        if (fVar != null) {
            if (z6 && Thread.holdsLock(fVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread threadCurrentThread2 = Thread.currentThread();
                w5.k.e(threadCurrentThread2, "Thread.currentThread()");
                sb2.append(threadCurrentThread2.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(fVar);
                throw new AssertionError(sb2.toString());
            }
            synchronized (fVar) {
                socketY = y();
            }
            if (this.f4546s == null) {
                if (socketY != null) {
                    U5.c.k(socketY);
                }
                this.f4541n.l(this, fVar);
            } else {
                if (!(socketY == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        IOException iOExceptionC = C(iOException);
        if (iOException != null) {
            r rVar = this.f4541n;
            w5.k.c(iOExceptionC);
            rVar.e(this, iOExceptionC);
        } else {
            this.f4541n.d(this);
        }
        return iOExceptionC;
    }

    private final void e() {
        this.f4544q = d6.j.f18715c.g().i("response.body().close()");
        this.f4541n.f(this);
    }

    private final C0455a h(T5.u uVar) {
        SSLSocketFactory sSLSocketFactoryL;
        HostnameVerifier hostnameVerifierX;
        C0461g c0461gJ;
        if (uVar.i()) {
            sSLSocketFactoryL = this.f4537B.L();
            hostnameVerifierX = this.f4537B.x();
            c0461gJ = this.f4537B.j();
        } else {
            sSLSocketFactoryL = null;
            hostnameVerifierX = null;
            c0461gJ = null;
        }
        return new C0455a(uVar.h(), uVar.l(), this.f4537B.r(), this.f4537B.K(), sSLSocketFactoryL, hostnameVerifierX, c0461gJ, this.f4537B.G(), this.f4537B.F(), this.f4537B.E(), this.f4537B.m(), this.f4537B.H());
    }

    public final void A(f fVar) {
        this.f4536A = fVar;
    }

    public final void B() {
        if (!(!this.f4547t)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f4547t = true;
        this.f4542o.s();
    }

    @Override // T5.InterfaceC0459e
    public void S0(InterfaceC0460f interfaceC0460f) {
        w5.k.f(interfaceC0460f, "responseCallback");
        if (!this.f4543p.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        e();
        this.f4537B.q().a(new a(this, interfaceC0460f));
    }

    public final void c(f fVar) {
        w5.k.f(fVar, "connection");
        if (!U5.c.f3990h || Thread.holdsLock(fVar)) {
            if (!(this.f4546s == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f4546s = fVar;
            fVar.n().add(new b(this, this.f4544q));
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

    @Override // T5.InterfaceC0459e
    public void cancel() {
        if (this.f4552y) {
            return;
        }
        this.f4552y = true;
        Y5.c cVar = this.f4553z;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.f4536A;
        if (fVar != null) {
            fVar.d();
        }
        this.f4541n.g(this);
    }

    @Override // T5.InterfaceC0459e
    public D f() {
        if (!this.f4543p.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f4542o.r();
        e();
        try {
            this.f4537B.q().b(this);
            return s();
        } finally {
            this.f4537B.q().g(this);
        }
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return new e(this.f4537B, this.f4538C, this.f4539D);
    }

    public final void i(B b7, boolean z6) {
        w5.k.f(b7, "request");
        if (!(this.f4548u == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.f4550w)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.f4549v)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            u uVar = u.f19985a;
        }
        if (z6) {
            this.f4545r = new d(this.f4540m, h(b7.l()), this, this.f4541n);
        }
    }

    public final void j(boolean z6) {
        Y5.c cVar;
        synchronized (this) {
            if (!this.f4551x) {
                throw new IllegalStateException("released".toString());
            }
            u uVar = u.f19985a;
        }
        if (z6 && (cVar = this.f4553z) != null) {
            cVar.d();
        }
        this.f4548u = null;
    }

    public final z k() {
        return this.f4537B;
    }

    public final f l() {
        return this.f4546s;
    }

    public final r m() {
        return this.f4541n;
    }

    @Override // T5.InterfaceC0459e
    public boolean n0() {
        return this.f4552y;
    }

    @Override // T5.InterfaceC0459e
    public B o() {
        return this.f4538C;
    }

    public final boolean p() {
        return this.f4539D;
    }

    public final Y5.c q() {
        return this.f4548u;
    }

    public final B r() {
        return this.f4538C;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D s() throws Throwable {
        ArrayList arrayList = new ArrayList();
        AbstractC1809n.t(arrayList, this.f4537B.y());
        arrayList.add(new Z5.j(this.f4537B));
        arrayList.add(new Z5.a(this.f4537B.p()));
        arrayList.add(new W5.a(this.f4537B.g()));
        arrayList.add(Y5.a.f4504a);
        if (!this.f4539D) {
            AbstractC1809n.t(arrayList, this.f4537B.A());
        }
        arrayList.add(new Z5.b(this.f4539D));
        boolean z6 = false;
        try {
            D dA = new Z5.g(this, arrayList, 0, null, this.f4538C, this.f4537B.k(), this.f4537B.I(), this.f4537B.N()).a(this.f4538C);
            if (n0()) {
                U5.c.j(dA);
                throw new IOException("Canceled");
            }
            v(null);
            return dA;
        } catch (IOException e7) {
            try {
                IOException iOExceptionV = v(e7);
                if (iOExceptionV == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionV;
            } catch (Throwable th) {
                th = th;
                z6 = true;
                if (!z6) {
                    v(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z6) {
            }
            throw th;
        }
    }

    public final Y5.c t(Z5.g gVar) throws IOException {
        w5.k.f(gVar, "chain");
        synchronized (this) {
            if (!this.f4551x) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.f4550w)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f4549v)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            u uVar = u.f19985a;
        }
        d dVar = this.f4545r;
        w5.k.c(dVar);
        Y5.c cVar = new Y5.c(this, this.f4541n, dVar, dVar.a(this.f4537B, gVar));
        this.f4548u = cVar;
        this.f4553z = cVar;
        synchronized (this) {
            this.f4549v = true;
            this.f4550w = true;
        }
        if (this.f4552y) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    public final IOException u(Y5.c cVar, boolean z6, boolean z7, IOException iOException) {
        boolean z8;
        w5.k.f(cVar, "exchange");
        boolean z9 = true;
        if (!w5.k.b(cVar, this.f4553z)) {
            return iOException;
        }
        synchronized (this) {
            z8 = false;
            if (z6) {
                try {
                    if (!this.f4549v) {
                        if (z7 || !this.f4550w) {
                            z9 = false;
                        }
                    }
                    if (z6) {
                        this.f4549v = false;
                    }
                    if (z7) {
                        this.f4550w = false;
                    }
                    boolean z10 = this.f4549v;
                    boolean z11 = (z10 || this.f4550w) ? false : true;
                    if (z10 || this.f4550w || this.f4551x) {
                        z9 = false;
                    }
                    z8 = z11;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z7) {
                }
                z9 = false;
            }
            u uVar = u.f19985a;
        }
        if (z8) {
            this.f4553z = null;
            f fVar = this.f4546s;
            if (fVar != null) {
                fVar.s();
            }
        }
        return z9 ? d(iOException) : iOException;
    }

    public final IOException v(IOException iOException) {
        boolean z6;
        synchronized (this) {
            try {
                z6 = false;
                if (this.f4551x) {
                    this.f4551x = false;
                    if (!this.f4549v && !this.f4550w) {
                        z6 = true;
                    }
                }
                u uVar = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6 ? d(iOException) : iOException;
    }

    public final String x() {
        return this.f4538C.l().n();
    }

    public final Socket y() {
        f fVar = this.f4546s;
        w5.k.c(fVar);
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
        Iterator it = listN.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (w5.k.b((e) ((Reference) it.next()).get(), this)) {
                break;
            }
            i7++;
        }
        if (!(i7 != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        listN.remove(i7);
        this.f4546s = null;
        if (listN.isEmpty()) {
            fVar.C(System.nanoTime());
            if (this.f4540m.c(fVar)) {
                return fVar.E();
            }
        }
        return null;
    }

    public final boolean z() {
        d dVar = this.f4545r;
        w5.k.c(dVar);
        return dVar.e();
    }
}
