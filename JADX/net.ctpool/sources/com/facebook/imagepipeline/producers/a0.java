package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public class a0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.x f10851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.k f10852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f10853c;

    public static class a extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final I0.d f10854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f10855d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final w1.x f10856e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f10857f;

        public a(InterfaceC0777n interfaceC0777n, I0.d dVar, boolean z6, w1.x xVar, boolean z7) {
            super(interfaceC0777n);
            this.f10854c = dVar;
            this.f10855d = z6;
            this.f10856e = xVar;
            this.f10857f = z7;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(S0.a aVar, int i7) {
            if (aVar == null) {
                if (AbstractC0766c.e(i7)) {
                    p().d(null, i7);
                }
            } else if (!AbstractC0766c.f(i7) || this.f10855d) {
                S0.a aVarD = this.f10857f ? this.f10856e.d(this.f10854c, aVar) : null;
                try {
                    p().c(1.0f);
                    InterfaceC0777n interfaceC0777nP = p();
                    if (aVarD != null) {
                        aVar = aVarD;
                    }
                    interfaceC0777nP.d(aVar, i7);
                } finally {
                    S0.a.g(aVarD);
                }
            }
        }
    }

    public a0(w1.x xVar, w1.k kVar, d0 d0Var) {
        this.f10851a = xVar;
        this.f10852b = kVar;
        this.f10853c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        g0 g0VarB = e0Var.B();
        J1.b bVarD = e0Var.d();
        Object objA = e0Var.a();
        J1.d dVarK = bVarD.k();
        if (dVarK == null || dVarK.b() == null) {
            this.f10853c.a(interfaceC0777n, e0Var);
            return;
        }
        g0VarB.e(e0Var, c());
        I0.d dVarB = this.f10852b.b(bVarD, objA);
        S0.a aVar = e0Var.d().x(1) ? this.f10851a.get(dVarB) : null;
        if (aVar == null) {
            a aVar2 = new a(interfaceC0777n, dVarB, false, this.f10851a, e0Var.d().x(2));
            g0VarB.j(e0Var, c(), g0VarB.g(e0Var, c()) ? O0.g.of("cached_value_found", "false") : null);
            this.f10853c.a(aVar2, e0Var);
        } else {
            g0VarB.j(e0Var, c(), g0VarB.g(e0Var, c()) ? O0.g.of("cached_value_found", "true") : null);
            g0VarB.c(e0Var, "PostprocessedBitmapMemoryCacheProducer", true);
            e0Var.g("memory_bitmap", "postprocessed");
            interfaceC0777n.c(1.0f);
            interfaceC0777n.d(aVar, 1);
            aVar.close();
        }
    }

    protected String c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
