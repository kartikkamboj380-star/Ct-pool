package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0765b implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f10858a;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b$a */
    private static class a extends AbstractC0782t {
        private a(InterfaceC0777n interfaceC0777n) {
            super(interfaceC0777n);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(D1.g gVar, int i7) {
            if (gVar == null) {
                p().d(null, i7);
                return;
            }
            if (!D1.g.a0(gVar)) {
                gVar.n0();
            }
            p().d(gVar, i7);
        }
    }

    public C0765b(d0 d0Var) {
        this.f10858a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        this.f10858a.a(new a(interfaceC0777n), e0Var);
    }
}
