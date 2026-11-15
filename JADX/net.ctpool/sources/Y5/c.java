package Y5;

import T5.B;
import T5.D;
import T5.E;
import T5.r;
import h6.d;
import i6.A;
import i6.C;
import i6.l;
import i6.q;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f4510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f4511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f4512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f4513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Z5.d f4514f;

    private final class a extends i6.k {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f4515n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f4516o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f4517p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final long f4518q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f4519r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, A a7, long j7) {
            super(a7);
            w5.k.f(a7, "delegate");
            this.f4519r = cVar;
            this.f4518q = j7;
        }

        private final IOException a(IOException iOException) {
            if (this.f4515n) {
                return iOException;
            }
            this.f4515n = true;
            return this.f4519r.a(this.f4516o, false, true, iOException);
        }

        @Override // i6.k, i6.A, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f4517p) {
                return;
            }
            this.f4517p = true;
            long j7 = this.f4518q;
            if (j7 != -1 && this.f4516o != j7) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e7) {
                throw a(e7);
            }
        }

        @Override // i6.k, i6.A, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e7) {
                throw a(e7);
            }
        }

        @Override // i6.k, i6.A
        public void w0(i6.f fVar, long j7) throws IOException {
            w5.k.f(fVar, "source");
            if (!(!this.f4517p)) {
                throw new IllegalStateException("closed".toString());
            }
            long j8 = this.f4518q;
            if (j8 == -1 || this.f4516o + j7 <= j8) {
                try {
                    super.w0(fVar, j7);
                    this.f4516o += j7;
                    return;
                } catch (IOException e7) {
                    throw a(e7);
                }
            }
            throw new ProtocolException("expected " + this.f4518q + " bytes but received " + (this.f4516o + j7));
        }
    }

    public final class b extends l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f4520n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f4521o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f4522p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f4523q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final long f4524r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ c f4525s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, C c7, long j7) {
            super(c7);
            w5.k.f(c7, "delegate");
            this.f4525s = cVar;
            this.f4524r = j7;
            this.f4521o = true;
            if (j7 == 0) {
                b(null);
            }
        }

        @Override // i6.l, i6.C
        public long L0(i6.f fVar, long j7) throws IOException {
            w5.k.f(fVar, "sink");
            if (!(!this.f4523q)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jL0 = a().L0(fVar, j7);
                if (this.f4521o) {
                    this.f4521o = false;
                    this.f4525s.i().w(this.f4525s.g());
                }
                if (jL0 == -1) {
                    b(null);
                    return -1L;
                }
                long j8 = this.f4520n + jL0;
                long j9 = this.f4524r;
                if (j9 != -1 && j8 > j9) {
                    throw new ProtocolException("expected " + this.f4524r + " bytes but received " + j8);
                }
                this.f4520n = j8;
                if (j8 == j9) {
                    b(null);
                }
                return jL0;
            } catch (IOException e7) {
                throw b(e7);
            }
        }

        public final IOException b(IOException iOException) {
            if (this.f4522p) {
                return iOException;
            }
            this.f4522p = true;
            if (iOException == null && this.f4521o) {
                this.f4521o = false;
                this.f4525s.i().w(this.f4525s.g());
            }
            return this.f4525s.a(this.f4520n, true, false, iOException);
        }

        @Override // i6.l, i6.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f4523q) {
                return;
            }
            this.f4523q = true;
            try {
                super.close();
                b(null);
            } catch (IOException e7) {
                throw b(e7);
            }
        }
    }

    public c(e eVar, r rVar, d dVar, Z5.d dVar2) {
        w5.k.f(eVar, "call");
        w5.k.f(rVar, "eventListener");
        w5.k.f(dVar, "finder");
        w5.k.f(dVar2, "codec");
        this.f4511c = eVar;
        this.f4512d = rVar;
        this.f4513e = dVar;
        this.f4514f = dVar2;
        this.f4510b = dVar2.e();
    }

    private final void t(IOException iOException) {
        this.f4513e.h(iOException);
        this.f4514f.e().H(this.f4511c, iOException);
    }

    public final IOException a(long j7, boolean z6, boolean z7, IOException iOException) {
        if (iOException != null) {
            t(iOException);
        }
        if (z7) {
            r rVar = this.f4512d;
            e eVar = this.f4511c;
            if (iOException != null) {
                rVar.s(eVar, iOException);
            } else {
                rVar.q(eVar, j7);
            }
        }
        if (z6) {
            if (iOException != null) {
                this.f4512d.x(this.f4511c, iOException);
            } else {
                this.f4512d.v(this.f4511c, j7);
            }
        }
        return this.f4511c.u(this, z7, z6, iOException);
    }

    public final void b() {
        this.f4514f.cancel();
    }

    public final A c(B b7, boolean z6) {
        w5.k.f(b7, "request");
        this.f4509a = z6;
        T5.C cA = b7.a();
        w5.k.c(cA);
        long jA = cA.a();
        this.f4512d.r(this.f4511c);
        return new a(this, this.f4514f.b(b7, jA), jA);
    }

    public final void d() {
        this.f4514f.cancel();
        this.f4511c.u(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f4514f.a();
        } catch (IOException e7) {
            this.f4512d.s(this.f4511c, e7);
            t(e7);
            throw e7;
        }
    }

    public final void f() throws IOException {
        try {
            this.f4514f.g();
        } catch (IOException e7) {
            this.f4512d.s(this.f4511c, e7);
            t(e7);
            throw e7;
        }
    }

    public final e g() {
        return this.f4511c;
    }

    public final f h() {
        return this.f4510b;
    }

    public final r i() {
        return this.f4512d;
    }

    public final d j() {
        return this.f4513e;
    }

    public final boolean k() {
        return !w5.k.b(this.f4513e.d().l().h(), this.f4510b.A().a().l().h());
    }

    public final boolean l() {
        return this.f4509a;
    }

    public final d.AbstractC0265d m() {
        this.f4511c.B();
        return this.f4514f.e().x(this);
    }

    public final void n() {
        this.f4514f.e().z();
    }

    public final void o() {
        this.f4511c.u(this, true, false, null);
    }

    public final E p(D d7) throws IOException {
        w5.k.f(d7, "response");
        try {
            String strO = D.o(d7, "Content-Type", null, 2, null);
            long jC = this.f4514f.c(d7);
            return new Z5.h(strO, jC, q.d(new b(this, this.f4514f.f(d7), jC)));
        } catch (IOException e7) {
            this.f4512d.x(this.f4511c, e7);
            t(e7);
            throw e7;
        }
    }

    public final D.a q(boolean z6) throws IOException {
        try {
            D.a aVarD = this.f4514f.d(z6);
            if (aVarD != null) {
                aVarD.l(this);
            }
            return aVarD;
        } catch (IOException e7) {
            this.f4512d.x(this.f4511c, e7);
            t(e7);
            throw e7;
        }
    }

    public final void r(D d7) {
        w5.k.f(d7, "response");
        this.f4512d.y(this.f4511c, d7);
    }

    public final void s() {
        this.f4512d.z(this.f4511c);
    }

    public final void u() {
        a(-1L, true, true, null);
    }

    public final void v(B b7) throws IOException {
        w5.k.f(b7, "request");
        try {
            this.f4512d.u(this.f4511c);
            this.f4514f.h(b7);
            this.f4512d.t(this.f4511c, b7);
        } catch (IOException e7) {
            this.f4512d.s(this.f4511c, e7);
            t(e7);
            throw e7;
        }
    }
}
