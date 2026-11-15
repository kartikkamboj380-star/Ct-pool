package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0776m implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f10939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f10940b;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.m$a */
    private class a extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e0 f10941c;

        private a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
            super(interfaceC0777n);
            this.f10941c = e0Var;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0782t, com.facebook.imagepipeline.producers.AbstractC0766c
        protected void h(Throwable th) {
            C0776m.this.f10940b.a(p(), this.f10941c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(D1.g gVar, int i7) {
            J1.b bVarD = this.f10941c.d();
            boolean zE = AbstractC0766c.e(i7);
            boolean zC = v0.c(gVar, bVarD.q());
            if (gVar != null && (zC || bVarD.i())) {
                if (!zE || !zC) {
                    i7 = AbstractC0766c.o(i7, 1);
                }
                p().d(gVar, i7);
            }
            if (!zE || zC || bVarD.h()) {
                return;
            }
            D1.g.d(gVar);
            C0776m.this.f10940b.a(p(), this.f10941c);
        }
    }

    public C0776m(d0 d0Var, d0 d0Var2) {
        this.f10939a = d0Var;
        this.f10940b = d0Var2;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        this.f10939a.a(new a(interfaceC0777n, e0Var), e0Var);
    }
}
