package b6;

import T5.A;
import T5.B;
import T5.D;
import T5.t;
import T5.z;
import i6.C;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Z5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile i f9892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f9893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f9894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Y5.f f9895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Z5.g f9896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f9897f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f9891i = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f9889g = U5.c.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List f9890h = U5.c.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public static final class a {
        private a() {
        }

        public final List a(B b7) {
            w5.k.f(b7, "request");
            t tVarE = b7.e();
            ArrayList arrayList = new ArrayList(tVarE.size() + 4);
            arrayList.add(new c(c.f9747f, b7.h()));
            arrayList.add(new c(c.f9748g, Z5.i.f4660a.c(b7.l())));
            String strD = b7.d("Host");
            if (strD != null) {
                arrayList.add(new c(c.f9750i, strD));
            }
            arrayList.add(new c(c.f9749h, b7.l().p()));
            int size = tVarE.size();
            for (int i7 = 0; i7 < size; i7++) {
                String strH = tVarE.h(i7);
                Locale locale = Locale.US;
                w5.k.e(locale, "Locale.US");
                if (strH == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = strH.toLowerCase(locale);
                w5.k.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!g.f9889g.contains(lowerCase) || (w5.k.b(lowerCase, "te") && w5.k.b(tVarE.m(i7), "trailers"))) {
                    arrayList.add(new c(lowerCase, tVarE.m(i7)));
                }
            }
            return arrayList;
        }

        public final D.a b(t tVar, A a7) throws ProtocolException {
            w5.k.f(tVar, "headerBlock");
            w5.k.f(a7, "protocol");
            t.a aVar = new t.a();
            int size = tVar.size();
            Z5.k kVarA = null;
            for (int i7 = 0; i7 < size; i7++) {
                String strH = tVar.h(i7);
                String strM = tVar.m(i7);
                if (w5.k.b(strH, ":status")) {
                    kVarA = Z5.k.f4663d.a("HTTP/1.1 " + strM);
                } else if (!g.f9890h.contains(strH)) {
                    aVar.c(strH, strM);
                }
            }
            if (kVarA != null) {
                return new D.a().p(a7).g(kVarA.f4665b).m(kVarA.f4666c).k(aVar.e());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g(z zVar, Y5.f fVar, Z5.g gVar, f fVar2) {
        w5.k.f(zVar, "client");
        w5.k.f(fVar, "connection");
        w5.k.f(gVar, "chain");
        w5.k.f(fVar2, "http2Connection");
        this.f9895d = fVar;
        this.f9896e = gVar;
        this.f9897f = fVar2;
        List listE = zVar.E();
        A a7 = A.H2_PRIOR_KNOWLEDGE;
        this.f9893b = listE.contains(a7) ? a7 : A.HTTP_2;
    }

    @Override // Z5.d
    public void a() {
        i iVar = this.f9892a;
        w5.k.c(iVar);
        iVar.n().close();
    }

    @Override // Z5.d
    public i6.A b(B b7, long j7) {
        w5.k.f(b7, "request");
        i iVar = this.f9892a;
        w5.k.c(iVar);
        return iVar.n();
    }

    @Override // Z5.d
    public long c(D d7) {
        w5.k.f(d7, "response");
        if (Z5.e.b(d7)) {
            return U5.c.s(d7);
        }
        return 0L;
    }

    @Override // Z5.d
    public void cancel() {
        this.f9894c = true;
        i iVar = this.f9892a;
        if (iVar != null) {
            iVar.f(b.CANCEL);
        }
    }

    @Override // Z5.d
    public D.a d(boolean z6) throws ProtocolException {
        i iVar = this.f9892a;
        w5.k.c(iVar);
        D.a aVarB = f9891i.b(iVar.C(), this.f9893b);
        if (z6 && aVarB.h() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // Z5.d
    public Y5.f e() {
        return this.f9895d;
    }

    @Override // Z5.d
    public C f(D d7) {
        w5.k.f(d7, "response");
        i iVar = this.f9892a;
        w5.k.c(iVar);
        return iVar.p();
    }

    @Override // Z5.d
    public void g() {
        this.f9897f.flush();
    }

    @Override // Z5.d
    public void h(B b7) throws IOException {
        w5.k.f(b7, "request");
        if (this.f9892a != null) {
            return;
        }
        this.f9892a = this.f9897f.m1(f9891i.a(b7), b7.a() != null);
        if (this.f9894c) {
            i iVar = this.f9892a;
            w5.k.c(iVar);
            iVar.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        i iVar2 = this.f9892a;
        w5.k.c(iVar2);
        i6.D dV = iVar2.v();
        long jG = this.f9896e.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dV.g(jG, timeUnit);
        i iVar3 = this.f9892a;
        w5.k.c(iVar3);
        iVar3.E().g(this.f9896e.i(), timeUnit);
    }
}
