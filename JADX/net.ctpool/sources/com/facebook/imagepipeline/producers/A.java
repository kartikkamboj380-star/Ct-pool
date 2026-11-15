package com.facebook.imagepipeline.producers;

import J1.b;
import s1.C2038c;
import w1.C2183d;

/* JADX INFO: loaded from: classes.dex */
public class A implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.j f10710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.j f10711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.k f10712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f10713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2183d f10714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2183d f10715f;

    private static class a extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f10716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final w1.j f10717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final w1.j f10718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final w1.k f10719f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C2183d f10720g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C2183d f10721h;

        public a(InterfaceC0777n interfaceC0777n, e0 e0Var, w1.j jVar, w1.j jVar2, w1.k kVar, C2183d c2183d, C2183d c2183d2) {
            super(interfaceC0777n);
            this.f10716c = e0Var;
            this.f10717d = jVar;
            this.f10718e = jVar2;
            this.f10719f = kVar;
            this.f10720g = c2183d;
            this.f10721h = c2183d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(D1.g gVar, int i7) {
            C2183d c2183d;
            try {
                if (K1.b.d()) {
                    K1.b.a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!AbstractC0766c.f(i7) && gVar != null && !AbstractC0766c.m(i7, 10) && gVar.n() != C2038c.f22251d) {
                    J1.b bVarD = this.f10716c.d();
                    I0.d dVarC = this.f10719f.c(bVarD, this.f10716c.a());
                    this.f10720g.a(dVarC);
                    if ("memory_encoded".equals(this.f10716c.n("origin"))) {
                        if (!this.f10721h.b(dVarC)) {
                            (bVarD.c() == b.EnumC0030b.SMALL ? this.f10718e : this.f10717d).f(dVarC);
                            c2183d = this.f10721h;
                            c2183d.a(dVarC);
                        }
                    } else if ("disk".equals(this.f10716c.n("origin"))) {
                        c2183d = this.f10721h;
                        c2183d.a(dVarC);
                    }
                    p().d(gVar, i7);
                    if (K1.b.d()) {
                        K1.b.b();
                        return;
                    }
                    return;
                }
                p().d(gVar, i7);
                if (K1.b.d()) {
                    K1.b.b();
                }
            } catch (Throwable th) {
                if (K1.b.d()) {
                    K1.b.b();
                }
                throw th;
            }
        }
    }

    public A(w1.j jVar, w1.j jVar2, w1.k kVar, C2183d c2183d, C2183d c2183d2, d0 d0Var) {
        this.f10710a = jVar;
        this.f10711b = jVar2;
        this.f10712c = kVar;
        this.f10714e = c2183d;
        this.f10715f = c2183d2;
        this.f10713d = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        try {
            if (K1.b.d()) {
                K1.b.a("EncodedProbeProducer#produceResults");
            }
            g0 g0VarB = e0Var.B();
            g0VarB.e(e0Var, c());
            a aVar = new a(interfaceC0777n, e0Var, this.f10710a, this.f10711b, this.f10712c, this.f10714e, this.f10715f);
            g0VarB.j(e0Var, "EncodedProbeProducer", null);
            if (K1.b.d()) {
                K1.b.a("mInputProducer.produceResult");
            }
            this.f10713d.a(aVar, e0Var);
            if (K1.b.d()) {
                K1.b.b();
            }
            if (K1.b.d()) {
                K1.b.b();
            }
        } catch (Throwable th) {
            if (K1.b.d()) {
                K1.b.b();
            }
            throw th;
        }
    }

    protected String c() {
        return "EncodedProbeProducer";
    }
}
