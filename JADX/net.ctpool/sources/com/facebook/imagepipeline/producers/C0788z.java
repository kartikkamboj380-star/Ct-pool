package com.facebook.imagepipeline.producers;

import J1.b;
import s1.C2038c;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0788z implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.x f11034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.k f11035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f11036c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.z$a */
    private static class a extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w1.x f11037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final I0.d f11038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f11039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f11040f;

        public a(InterfaceC0777n interfaceC0777n, w1.x xVar, I0.d dVar, boolean z6, boolean z7) {
            super(interfaceC0777n);
            this.f11037c = xVar;
            this.f11038d = dVar;
            this.f11039e = z6;
            this.f11040f = z7;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(D1.g gVar, int i7) {
            try {
                if (K1.b.d()) {
                    K1.b.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!AbstractC0766c.f(i7) && gVar != null && !AbstractC0766c.m(i7, 10) && gVar.n() != C2038c.f22251d) {
                    S0.a aVarF = gVar.f();
                    if (aVarF != null) {
                        try {
                            S0.a aVarD = (this.f11040f && this.f11039e) ? this.f11037c.d(this.f11038d, aVarF) : null;
                            if (aVarD != null) {
                                try {
                                    D1.g gVar2 = new D1.g(aVarD);
                                    gVar2.e(gVar);
                                    try {
                                        p().c(1.0f);
                                        p().d(gVar2, i7);
                                        if (K1.b.d()) {
                                            K1.b.b();
                                            return;
                                        }
                                        return;
                                    } finally {
                                        D1.g.d(gVar2);
                                    }
                                } finally {
                                    S0.a.g(aVarD);
                                }
                            }
                        } finally {
                            S0.a.g(aVarF);
                        }
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

    public C0788z(w1.x xVar, w1.k kVar, d0 d0Var) {
        this.f11034a = xVar;
        this.f11035b = kVar;
        this.f11036c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        try {
            if (K1.b.d()) {
                K1.b.a("EncodedMemoryCacheProducer#produceResults");
            }
            g0 g0VarB = e0Var.B();
            g0VarB.e(e0Var, "EncodedMemoryCacheProducer");
            I0.d dVarC = this.f11035b.c(e0Var.d(), e0Var.a());
            S0.a aVar = e0Var.d().x(4) ? this.f11034a.get(dVarC) : null;
            try {
                if (aVar != null) {
                    D1.g gVar = new D1.g(aVar);
                    try {
                        g0VarB.j(e0Var, "EncodedMemoryCacheProducer", g0VarB.g(e0Var, "EncodedMemoryCacheProducer") ? O0.g.of("cached_value_found", "true") : null);
                        g0VarB.c(e0Var, "EncodedMemoryCacheProducer", true);
                        e0Var.z("memory_encoded");
                        interfaceC0777n.c(1.0f);
                        interfaceC0777n.d(gVar, 1);
                        D1.g.d(gVar);
                        if (K1.b.d()) {
                            K1.b.b();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        D1.g.d(gVar);
                        throw th;
                    }
                }
                if (e0Var.U().h() < b.c.ENCODED_MEMORY_CACHE.h()) {
                    a aVar2 = new a(interfaceC0777n, this.f11034a, dVarC, e0Var.d().x(8), e0Var.f().G().A());
                    g0VarB.j(e0Var, "EncodedMemoryCacheProducer", g0VarB.g(e0Var, "EncodedMemoryCacheProducer") ? O0.g.of("cached_value_found", "false") : null);
                    this.f11036c.a(aVar2, e0Var);
                    if (K1.b.d()) {
                        K1.b.b();
                        return;
                    }
                    return;
                }
                g0VarB.j(e0Var, "EncodedMemoryCacheProducer", g0VarB.g(e0Var, "EncodedMemoryCacheProducer") ? O0.g.of("cached_value_found", "false") : null);
                g0VarB.c(e0Var, "EncodedMemoryCacheProducer", false);
                e0Var.g("memory_encoded", "nil-result");
                interfaceC0777n.d(null, 1);
                if (K1.b.d()) {
                    K1.b.b();
                }
            } finally {
                S0.a.g(aVar);
            }
        } catch (Throwable th2) {
            if (K1.b.d()) {
                K1.b.b();
            }
            throw th2;
        }
    }
}
