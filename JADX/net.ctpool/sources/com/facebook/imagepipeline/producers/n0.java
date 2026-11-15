package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public class n0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f10947a;

    class a extends AbstractC0782t {
        a(InterfaceC0777n interfaceC0777n) {
            super(interfaceC0777n);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        protected void i(Object obj, int i7) {
            if (AbstractC0766c.e(i7)) {
                p().d(null, i7);
            }
        }
    }

    public n0(d0 d0Var) {
        this.f10947a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        this.f10947a.a(new a(interfaceC0777n), e0Var);
    }
}
