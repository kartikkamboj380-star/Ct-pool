package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0782t extends AbstractC0766c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0777n f11004b;

    public AbstractC0782t(InterfaceC0777n interfaceC0777n) {
        w5.k.f(interfaceC0777n, "consumer");
        this.f11004b = interfaceC0777n;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0766c
    protected void g() {
        this.f11004b.b();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0766c
    protected void h(Throwable th) {
        w5.k.f(th, "t");
        this.f11004b.a(th);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0766c
    protected void j(float f7) {
        this.f11004b.c(f7);
    }

    public final InterfaceC0777n p() {
        return this.f11004b;
    }
}
