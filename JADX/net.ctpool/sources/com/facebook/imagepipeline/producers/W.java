package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.producers.X;
import java.io.InputStream;
import java.util.Map;
import x1.C2210a;

/* JADX INFO: loaded from: classes.dex */
public class W implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final R0.i f10828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R0.a f10829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X f10830c;

    class a implements X.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f10831a;

        a(C c7) {
            this.f10831a = c7;
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void a(Throwable th) {
            W.this.l(this.f10831a, th);
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void b() {
            W.this.k(this.f10831a);
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void c(InputStream inputStream, int i7) throws Throwable {
            if (K1.b.d()) {
                K1.b.a("NetworkFetcher->onResponse");
            }
            W.this.m(this.f10831a, inputStream, i7);
            if (K1.b.d()) {
                K1.b.b();
            }
        }
    }

    public W(R0.i iVar, R0.a aVar, X x6) {
        this.f10828a = iVar;
        this.f10829b = aVar;
        this.f10830c = x6;
    }

    protected static float e(int i7, int i8) {
        return i8 > 0 ? i7 / i8 : 1.0f - ((float) Math.exp(((double) (-i7)) / 50000.0d));
    }

    private Map f(C c7, int i7) {
        if (c7.d().g(c7.b(), "NetworkFetchProducer")) {
            return this.f10830c.c(c7, i7);
        }
        return null;
    }

    protected static void j(R0.k kVar, int i7, C2210a c2210a, InterfaceC0777n interfaceC0777n, e0 e0Var) throws Throwable {
        D1.g gVar;
        S0.a aVarJ = S0.a.J(kVar.a());
        D1.g gVar2 = null;
        try {
            gVar = new D1.g(aVarJ);
        } catch (Throwable th) {
            th = th;
        }
        try {
            gVar.M0(c2210a);
            gVar.n0();
            interfaceC0777n.d(gVar, i7);
            D1.g.d(gVar);
            S0.a.g(aVarJ);
        } catch (Throwable th2) {
            th = th2;
            gVar2 = gVar;
            D1.g.d(gVar2);
            S0.a.g(aVarJ);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(C c7) {
        c7.d().d(c7.b(), "NetworkFetchProducer", null);
        c7.a().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(C c7, Throwable th) {
        c7.d().k(c7.b(), "NetworkFetchProducer", th, null);
        c7.d().c(c7.b(), "NetworkFetchProducer", false);
        c7.b().z("network");
        c7.a().a(th);
    }

    private boolean n(C c7, e0 e0Var) {
        B1.e eVarQ = e0Var.f().q();
        if (eVarQ != null && eVarQ.c() && c7.b().J()) {
            return this.f10830c.b(c7);
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        e0Var.B().e(e0Var, "NetworkFetchProducer");
        C cE = this.f10830c.e(interfaceC0777n, e0Var);
        this.f10830c.d(cE, new a(cE));
    }

    protected long g() {
        return SystemClock.uptimeMillis();
    }

    protected void h(R0.k kVar, C c7) throws Throwable {
        Map mapF = f(c7, kVar.size());
        g0 g0VarD = c7.d();
        g0VarD.j(c7.b(), "NetworkFetchProducer", mapF);
        g0VarD.c(c7.b(), "NetworkFetchProducer", true);
        c7.b().z("network");
        j(kVar, c7.e() | 1, c7.f(), c7.a(), c7.b());
    }

    protected void i(R0.k kVar, C c7) throws Throwable {
        if (n(c7, c7.b())) {
            long jG = g();
            if (jG - c7.c() >= 100) {
                c7.h(jG);
                c7.d().a(c7.b(), "NetworkFetchProducer", "intermediate_result");
                j(kVar, c7.e(), c7.f(), c7.a(), c7.b());
            }
        }
    }

    protected void m(C c7, InputStream inputStream, int i7) throws Throwable {
        R0.i iVar = this.f10828a;
        R0.k kVarE = i7 > 0 ? iVar.e(i7) : iVar.a();
        byte[] bArr = (byte[]) this.f10829b.get(16384);
        while (true) {
            try {
                int i8 = inputStream.read(bArr);
                if (i8 < 0) {
                    this.f10830c.a(c7, kVarE.size());
                    h(kVarE, c7);
                    this.f10829b.a(bArr);
                    kVarE.close();
                    return;
                }
                if (i8 > 0) {
                    kVarE.write(bArr, 0, i8);
                    i(kVarE, c7);
                    c7.a().c(e(kVarE.size(), i7));
                }
            } catch (Throwable th) {
                this.f10829b.a(bArr);
                kVarE.close();
                throw th;
            }
        }
    }
}
