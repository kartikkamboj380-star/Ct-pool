package W5;

import F5.g;
import T5.B;
import T5.C0457c;
import T5.D;
import T5.E;
import T5.InterfaceC0459e;
import T5.r;
import T5.t;
import T5.v;
import W5.c;
import i6.A;
import i6.C;
import i6.f;
import i6.h;
import i6.q;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0095a f4176b = new C0095a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0457c f4177a;

    /* JADX INFO: renamed from: W5.a$a, reason: collision with other inner class name */
    public static final class C0095a {
        private C0095a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final t c(t tVar, t tVar2) {
            t.a aVar = new t.a();
            int size = tVar.size();
            for (int i7 = 0; i7 < size; i7++) {
                String strH = tVar.h(i7);
                String strM = tVar.m(i7);
                if ((!g.p("Warning", strH, true) || !g.B(strM, "1", false, 2, null)) && (d(strH) || !e(strH) || tVar2.f(strH) == null)) {
                    aVar.c(strH, strM);
                }
            }
            int size2 = tVar2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                String strH2 = tVar2.h(i8);
                if (!d(strH2) && e(strH2)) {
                    aVar.c(strH2, tVar2.m(i8));
                }
            }
            return aVar.e();
        }

        private final boolean d(String str) {
            return g.p("Content-Length", str, true) || g.p("Content-Encoding", str, true) || g.p("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return (g.p("Connection", str, true) || g.p("Keep-Alive", str, true) || g.p("Proxy-Authenticate", str, true) || g.p("Proxy-Authorization", str, true) || g.p("TE", str, true) || g.p("Trailers", str, true) || g.p("Transfer-Encoding", str, true) || g.p("Upgrade", str, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final D f(D d7) {
            return (d7 != null ? d7.a() : null) != null ? d7.U().b(null).c() : d7;
        }

        public /* synthetic */ C0095a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b implements C {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f4178m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ h f4179n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ W5.b f4180o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ i6.g f4181p;

        b(h hVar, W5.b bVar, i6.g gVar) {
            this.f4179n = hVar;
            this.f4180o = bVar;
            this.f4181p = gVar;
        }

        @Override // i6.C
        public long L0(f fVar, long j7) throws IOException {
            k.f(fVar, "sink");
            try {
                long jL0 = this.f4179n.L0(fVar, j7);
                if (jL0 != -1) {
                    fVar.g(this.f4181p.h(), fVar.m1() - jL0, jL0);
                    this.f4181p.X();
                    return jL0;
                }
                if (!this.f4178m) {
                    this.f4178m = true;
                    this.f4181p.close();
                }
                return -1L;
            } catch (IOException e7) {
                if (!this.f4178m) {
                    this.f4178m = true;
                    this.f4180o.a();
                }
                throw e7;
            }
        }

        @Override // i6.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f4178m && !U5.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f4178m = true;
                this.f4180o.a();
            }
            this.f4179n.close();
        }

        @Override // i6.C
        public i6.D i() {
            return this.f4179n.i();
        }
    }

    public a(C0457c c0457c) {
        this.f4177a = c0457c;
    }

    private final D b(W5.b bVar, D d7) {
        if (bVar == null) {
            return d7;
        }
        A aB = bVar.b();
        E eA = d7.a();
        k.c(eA);
        b bVar2 = new b(eA.j(), bVar, q.c(aB));
        return d7.U().b(new Z5.h(D.o(d7, "Content-Type", null, 2, null), d7.a().e(), q.d(bVar2))).c();
    }

    @Override // T5.v
    public D a(v.a aVar) {
        r rVarM;
        E eA;
        E eA2;
        k.f(aVar, "chain");
        InterfaceC0459e interfaceC0459eCall = aVar.call();
        C0457c c0457c = this.f4177a;
        D dB = c0457c != null ? c0457c.b(aVar.o()) : null;
        c cVarB = new c.b(System.currentTimeMillis(), aVar.o(), dB).b();
        B b7 = cVarB.b();
        D dA = cVarB.a();
        C0457c c0457c2 = this.f4177a;
        if (c0457c2 != null) {
            c0457c2.o(cVarB);
        }
        Y5.e eVar = (Y5.e) (interfaceC0459eCall instanceof Y5.e ? interfaceC0459eCall : null);
        if (eVar == null || (rVarM = eVar.m()) == null) {
            rVarM = r.f3608a;
        }
        if (dB != null && dA == null && (eA2 = dB.a()) != null) {
            U5.c.j(eA2);
        }
        if (b7 == null && dA == null) {
            D dC = new D.a().r(aVar.o()).p(T5.A.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(U5.c.f3985c).s(-1L).q(System.currentTimeMillis()).c();
            rVarM.A(interfaceC0459eCall, dC);
            return dC;
        }
        if (b7 == null) {
            k.c(dA);
            D dC2 = dA.U().d(f4176b.f(dA)).c();
            rVarM.b(interfaceC0459eCall, dC2);
            return dC2;
        }
        if (dA != null) {
            rVarM.a(interfaceC0459eCall, dA);
        } else if (this.f4177a != null) {
            rVarM.c(interfaceC0459eCall);
        }
        try {
            D dA2 = aVar.a(b7);
            if (dA2 == null && dB != null && eA != null) {
            }
            if (dA != null) {
                if (dA2 != null && dA2.f() == 304) {
                    D.a aVarU = dA.U();
                    C0095a c0095a = f4176b;
                    D dC3 = aVarU.k(c0095a.c(dA.w(), dA2.w())).s(dA2.n0()).q(dA2.h0()).d(c0095a.f(dA)).n(c0095a.f(dA2)).c();
                    E eA3 = dA2.a();
                    k.c(eA3);
                    eA3.close();
                    C0457c c0457c3 = this.f4177a;
                    k.c(c0457c3);
                    c0457c3.n();
                    this.f4177a.w(dA, dC3);
                    rVarM.b(interfaceC0459eCall, dC3);
                    return dC3;
                }
                E eA4 = dA.a();
                if (eA4 != null) {
                    U5.c.j(eA4);
                }
            }
            k.c(dA2);
            D.a aVarU2 = dA2.U();
            C0095a c0095a2 = f4176b;
            D dC4 = aVarU2.d(c0095a2.f(dA)).n(c0095a2.f(dA2)).c();
            if (this.f4177a != null) {
                if (Z5.e.b(dC4) && c.f4182c.a(dC4, b7)) {
                    D dB2 = b(this.f4177a.f(dC4), dC4);
                    if (dA != null) {
                        rVarM.c(interfaceC0459eCall);
                    }
                    return dB2;
                }
                if (Z5.f.f4647a.a(b7.h())) {
                    try {
                        this.f4177a.g(b7);
                    } catch (IOException unused) {
                    }
                }
            }
            return dC4;
        } finally {
            if (dB != null && (eA = dB.a()) != null) {
                U5.c.j(eA);
            }
        }
    }
}
