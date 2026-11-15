package com.facebook.imagepipeline.producers;

import J1.b;
import w1.C2183d;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0774k implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.x f10909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.j f10910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.j f10911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w1.k f10912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f10913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2183d f10914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2183d f10915g;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k$a */
    private static class a extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f10916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final w1.x f10917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final w1.j f10918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final w1.j f10919f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final w1.k f10920g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C2183d f10921h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final C2183d f10922i;

        public a(InterfaceC0777n interfaceC0777n, e0 e0Var, w1.x xVar, w1.j jVar, w1.j jVar2, w1.k kVar, C2183d c2183d, C2183d c2183d2) {
            super(interfaceC0777n);
            this.f10916c = e0Var;
            this.f10917d = xVar;
            this.f10918e = jVar;
            this.f10919f = jVar2;
            this.f10920g = kVar;
            this.f10921h = c2183d;
            this.f10922i = c2183d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(S0.a aVar, int i7) {
            try {
                if (K1.b.d()) {
                    K1.b.a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!AbstractC0766c.f(i7) && aVar != null && !AbstractC0766c.m(i7, 8)) {
                    J1.b bVarD = this.f10916c.d();
                    I0.d dVarC = this.f10920g.c(bVarD, this.f10916c.a());
                    String str = (String) this.f10916c.n("origin");
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f10916c.f().G().B() && !this.f10921h.b(dVarC)) {
                            this.f10917d.c(dVarC);
                            this.f10921h.a(dVarC);
                        }
                        if (this.f10916c.f().G().z() && !this.f10922i.b(dVarC)) {
                            (bVarD.c() == b.EnumC0030b.SMALL ? this.f10919f : this.f10918e).f(dVarC);
                            this.f10922i.a(dVarC);
                        }
                    }
                    p().d(aVar, i7);
                    if (K1.b.d()) {
                        K1.b.b();
                        return;
                    }
                    return;
                }
                p().d(aVar, i7);
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

    public C0774k(w1.x xVar, w1.j jVar, w1.j jVar2, w1.k kVar, C2183d c2183d, C2183d c2183d2, d0 d0Var) {
        this.f10909a = xVar;
        this.f10910b = jVar;
        this.f10911c = jVar2;
        this.f10912d = kVar;
        this.f10914f = c2183d;
        this.f10915g = c2183d2;
        this.f10913e = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        try {
            if (K1.b.d()) {
                K1.b.a("BitmapProbeProducer#produceResults");
            }
            g0 g0VarB = e0Var.B();
            g0VarB.e(e0Var, c());
            a aVar = new a(interfaceC0777n, e0Var, this.f10909a, this.f10910b, this.f10911c, this.f10912d, this.f10914f, this.f10915g);
            g0VarB.j(e0Var, "BitmapProbeProducer", null);
            if (K1.b.d()) {
                K1.b.a("mInputProducer.produceResult");
            }
            this.f10913e.a(aVar, e0Var);
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
        return "BitmapProbeProducer";
    }
}
