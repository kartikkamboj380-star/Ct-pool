package a6;

import T5.B;
import T5.D;
import T5.n;
import T5.t;
import T5.u;
import T5.z;
import Z5.i;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ImagesContract;
import i6.A;
import i6.C;
import i6.D;
import i6.h;
import i6.m;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Z5.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f4810h = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a6.a f4812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t f4813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f4814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y5.f f4815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f4816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i6.g f4817g;

    private abstract class a implements C {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final m f4818m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f4819n;

        public a() {
            this.f4818m = new m(b.this.f4816f.i());
        }

        @Override // i6.C
        public long L0(i6.f fVar, long j7) throws IOException {
            k.f(fVar, "sink");
            try {
                return b.this.f4816f.L0(fVar, j7);
            } catch (IOException e7) {
                b.this.e().z();
                b();
                throw e7;
            }
        }

        protected final boolean a() {
            return this.f4819n;
        }

        public final void b() {
            if (b.this.f4811a == 6) {
                return;
            }
            if (b.this.f4811a == 5) {
                b.this.r(this.f4818m);
                b.this.f4811a = 6;
            } else {
                throw new IllegalStateException("state: " + b.this.f4811a);
            }
        }

        protected final void d(boolean z6) {
            this.f4819n = z6;
        }

        @Override // i6.C
        public D i() {
            return this.f4818m;
        }
    }

    /* JADX INFO: renamed from: a6.b$b, reason: collision with other inner class name */
    private final class C0116b implements A {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final m f4821m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f4822n;

        public C0116b() {
            this.f4821m = new m(b.this.f4817g.i());
        }

        @Override // i6.A, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f4822n) {
                return;
            }
            this.f4822n = true;
            b.this.f4817g.k0("0\r\n\r\n");
            b.this.r(this.f4821m);
            b.this.f4811a = 3;
        }

        @Override // i6.A, java.io.Flushable
        public synchronized void flush() {
            if (this.f4822n) {
                return;
            }
            b.this.f4817g.flush();
        }

        @Override // i6.A
        public D i() {
            return this.f4821m;
        }

        @Override // i6.A
        public void w0(i6.f fVar, long j7) {
            k.f(fVar, "source");
            if (!(!this.f4822n)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j7 == 0) {
                return;
            }
            b.this.f4817g.v0(j7);
            b.this.f4817g.k0("\r\n");
            b.this.f4817g.w0(fVar, j7);
            b.this.f4817g.k0("\r\n");
        }
    }

    private final class c extends a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f4824p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f4825q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final u f4826r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ b f4827s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, u uVar) {
            super();
            k.f(uVar, ImagesContract.URL);
            this.f4827s = bVar;
            this.f4826r = uVar;
            this.f4824p = -1L;
            this.f4825q = true;
        }

        private final void e() throws ProtocolException {
            if (this.f4824p != -1) {
                this.f4827s.f4816f.C0();
            }
            try {
                this.f4824p = this.f4827s.f4816f.c1();
                String strC0 = this.f4827s.f4816f.C0();
                if (strC0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string = F5.g.C0(strC0).toString();
                if (this.f4824p < 0 || (string.length() > 0 && !F5.g.B(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f4824p + string + '\"');
                }
                if (this.f4824p == 0) {
                    this.f4825q = false;
                    b bVar = this.f4827s;
                    bVar.f4813c = bVar.f4812b.a();
                    z zVar = this.f4827s.f4814d;
                    k.c(zVar);
                    n nVarP = zVar.p();
                    u uVar = this.f4826r;
                    t tVar = this.f4827s.f4813c;
                    k.c(tVar);
                    Z5.e.f(nVarP, uVar, tVar);
                    b();
                }
            } catch (NumberFormatException e7) {
                throw new ProtocolException(e7.getMessage());
            }
        }

        @Override // a6.b.a, i6.C
        public long L0(i6.f fVar, long j7) throws IOException {
            k.f(fVar, "sink");
            if (!(j7 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
            }
            if (!(!a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f4825q) {
                return -1L;
            }
            long j8 = this.f4824p;
            if (j8 == 0 || j8 == -1) {
                e();
                if (!this.f4825q) {
                    return -1L;
                }
            }
            long jL0 = super.L0(fVar, Math.min(j7, this.f4824p));
            if (jL0 != -1) {
                this.f4824p -= jL0;
                return jL0;
            }
            this.f4827s.e().z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }

        @Override // i6.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f4825q && !U5.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f4827s.e().z();
                b();
            }
            d(true);
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final class e extends a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f4828p;

        public e(long j7) {
            super();
            this.f4828p = j7;
            if (j7 == 0) {
                b();
            }
        }

        @Override // a6.b.a, i6.C
        public long L0(i6.f fVar, long j7) throws IOException {
            k.f(fVar, "sink");
            if (!(j7 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
            }
            if (!(!a())) {
                throw new IllegalStateException("closed".toString());
            }
            long j8 = this.f4828p;
            if (j8 == 0) {
                return -1L;
            }
            long jL0 = super.L0(fVar, Math.min(j8, j7));
            if (jL0 == -1) {
                b.this.e().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j9 = this.f4828p - jL0;
            this.f4828p = j9;
            if (j9 == 0) {
                b();
            }
            return jL0;
        }

        @Override // i6.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f4828p != 0 && !U5.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.e().z();
                b();
            }
            d(true);
        }
    }

    private final class f implements A {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final m f4830m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f4831n;

        public f() {
            this.f4830m = new m(b.this.f4817g.i());
        }

        @Override // i6.A, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4831n) {
                return;
            }
            this.f4831n = true;
            b.this.r(this.f4830m);
            b.this.f4811a = 3;
        }

        @Override // i6.A, java.io.Flushable
        public void flush() {
            if (this.f4831n) {
                return;
            }
            b.this.f4817g.flush();
        }

        @Override // i6.A
        public D i() {
            return this.f4830m;
        }

        @Override // i6.A
        public void w0(i6.f fVar, long j7) {
            k.f(fVar, "source");
            if (!(!this.f4831n)) {
                throw new IllegalStateException("closed".toString());
            }
            U5.c.i(fVar.m1(), 0L, j7);
            b.this.f4817g.w0(fVar, j7);
        }
    }

    private final class g extends a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f4833p;

        public g() {
            super();
        }

        @Override // a6.b.a, i6.C
        public long L0(i6.f fVar, long j7) throws IOException {
            k.f(fVar, "sink");
            if (!(j7 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
            }
            if (!(!a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f4833p) {
                return -1L;
            }
            long jL0 = super.L0(fVar, j7);
            if (jL0 != -1) {
                return jL0;
            }
            this.f4833p = true;
            b();
            return -1L;
        }

        @Override // i6.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.f4833p) {
                b();
            }
            d(true);
        }
    }

    public b(z zVar, Y5.f fVar, h hVar, i6.g gVar) {
        k.f(fVar, "connection");
        k.f(hVar, "source");
        k.f(gVar, "sink");
        this.f4814d = zVar;
        this.f4815e = fVar;
        this.f4816f = hVar;
        this.f4817g = gVar;
        this.f4812b = new a6.a(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(m mVar) {
        D dI = mVar.i();
        mVar.j(D.f19989d);
        dI.a();
        dI.b();
    }

    private final boolean s(B b7) {
        return F5.g.p("chunked", b7.d("Transfer-Encoding"), true);
    }

    private final boolean t(T5.D d7) {
        return F5.g.p("chunked", T5.D.o(d7, "Transfer-Encoding", null, 2, null), true);
    }

    private final A u() {
        if (this.f4811a == 1) {
            this.f4811a = 2;
            return new C0116b();
        }
        throw new IllegalStateException(("state: " + this.f4811a).toString());
    }

    private final C v(u uVar) {
        if (this.f4811a == 4) {
            this.f4811a = 5;
            return new c(this, uVar);
        }
        throw new IllegalStateException(("state: " + this.f4811a).toString());
    }

    private final C w(long j7) {
        if (this.f4811a == 4) {
            this.f4811a = 5;
            return new e(j7);
        }
        throw new IllegalStateException(("state: " + this.f4811a).toString());
    }

    private final A x() {
        if (this.f4811a == 1) {
            this.f4811a = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f4811a).toString());
    }

    private final C y() {
        if (this.f4811a == 4) {
            this.f4811a = 5;
            e().z();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f4811a).toString());
    }

    public final void A(t tVar, String str) {
        k.f(tVar, "headers");
        k.f(str, "requestLine");
        if (!(this.f4811a == 0)) {
            throw new IllegalStateException(("state: " + this.f4811a).toString());
        }
        this.f4817g.k0(str).k0("\r\n");
        int size = tVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f4817g.k0(tVar.h(i7)).k0(": ").k0(tVar.m(i7)).k0("\r\n");
        }
        this.f4817g.k0("\r\n");
        this.f4811a = 1;
    }

    @Override // Z5.d
    public void a() {
        this.f4817g.flush();
    }

    @Override // Z5.d
    public A b(B b7, long j7) throws ProtocolException {
        k.f(b7, "request");
        if (b7.a() != null && b7.a().f()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(b7)) {
            return u();
        }
        if (j7 != -1) {
            return x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // Z5.d
    public long c(T5.D d7) {
        k.f(d7, "response");
        if (!Z5.e.b(d7)) {
            return 0L;
        }
        if (t(d7)) {
            return -1L;
        }
        return U5.c.s(d7);
    }

    @Override // Z5.d
    public void cancel() {
        e().d();
    }

    @Override // Z5.d
    public D.a d(boolean z6) {
        int i7 = this.f4811a;
        boolean z7 = true;
        if (i7 != 1 && i7 != 3) {
            z7 = false;
        }
        if (!z7) {
            throw new IllegalStateException(("state: " + this.f4811a).toString());
        }
        try {
            Z5.k kVarA = Z5.k.f4663d.a(this.f4812b.b());
            D.a aVarK = new D.a().p(kVarA.f4664a).g(kVarA.f4665b).m(kVarA.f4666c).k(this.f4812b.a());
            if (z6 && kVarA.f4665b == 100) {
                return null;
            }
            if (kVarA.f4665b == 100) {
                this.f4811a = 3;
                return aVarK;
            }
            this.f4811a = 4;
            return aVarK;
        } catch (EOFException e7) {
            throw new IOException("unexpected end of stream on " + e().A().a().l().n(), e7);
        }
    }

    @Override // Z5.d
    public Y5.f e() {
        return this.f4815e;
    }

    @Override // Z5.d
    public C f(T5.D d7) {
        long jS;
        k.f(d7, "response");
        if (!Z5.e.b(d7)) {
            jS = 0;
        } else {
            if (t(d7)) {
                return v(d7.j0().l());
            }
            jS = U5.c.s(d7);
            if (jS == -1) {
                return y();
            }
        }
        return w(jS);
    }

    @Override // Z5.d
    public void g() {
        this.f4817g.flush();
    }

    @Override // Z5.d
    public void h(B b7) {
        k.f(b7, "request");
        i iVar = i.f4660a;
        Proxy.Type type = e().A().b().type();
        k.e(type, "connection.route().proxy.type()");
        A(b7.e(), iVar.a(b7, type));
    }

    public final void z(T5.D d7) {
        k.f(d7, "response");
        long jS = U5.c.s(d7);
        if (jS == -1) {
            return;
        }
        C cW = w(jS);
        U5.c.J(cW, Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
        cW.close();
    }
}
