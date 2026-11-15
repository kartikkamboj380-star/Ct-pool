package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f10907a;

    private final class a extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f10908c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, InterfaceC0777n interfaceC0777n) {
            super(interfaceC0777n);
            w5.k.f(interfaceC0777n, "consumer");
            this.f10908c = j0Var;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(D1.g gVar, int i7) {
            S0.a aVarF = null;
            try {
                if (D1.g.j0(gVar) && gVar != null) {
                    aVarF = gVar.f();
                }
                p().d(aVarF, i7);
                S0.a.g(aVarF);
            } catch (Throwable th) {
                S0.a.g(aVarF);
                throw th;
            }
        }
    }

    public j0(d0 d0Var) {
        w5.k.f(d0Var, "inputProducer");
        this.f10907a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        w5.k.f(interfaceC0777n, "consumer");
        w5.k.f(e0Var, "context");
        this.f10907a.a(new a(this, interfaceC0777n), e0Var);
    }
}
