package com.facebook.imagepipeline.producers;

import J1.b;
import com.facebook.imagepipeline.producers.C0783u;
import java.util.Map;
import s1.C2038c;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0786x implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.j f11023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.j f11024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f11025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w1.k f11026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f11027e;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.x$a */
    private static class a extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f11028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final w1.j f11029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final w1.j f11030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f11031f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final w1.k f11032g;

        private a(InterfaceC0777n interfaceC0777n, e0 e0Var, w1.j jVar, w1.j jVar2, Map map, w1.k kVar) {
            super(interfaceC0777n);
            this.f11028c = e0Var;
            this.f11029d = jVar;
            this.f11030e = jVar2;
            this.f11031f = map;
            this.f11032g = kVar;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(D1.g gVar, int i7) {
            this.f11028c.B().e(this.f11028c, "DiskCacheWriteProducer");
            if (AbstractC0766c.f(i7) || gVar == null || AbstractC0766c.m(i7, 10) || gVar.n() == C2038c.f22251d) {
                this.f11028c.B().j(this.f11028c, "DiskCacheWriteProducer", null);
            } else {
                J1.b bVarD = this.f11028c.d();
                I0.d dVarC = this.f11032g.c(bVarD, this.f11028c.a());
                w1.j jVarA = C0783u.a(bVarD, this.f11030e, this.f11029d, this.f11031f);
                if (jVarA == null) {
                    this.f11028c.B().k(this.f11028c, "DiskCacheWriteProducer", new C0783u.a("Got no disk cache for CacheChoice: " + Integer.valueOf(bVarD.c().ordinal()).toString()), null);
                } else {
                    jVarA.p(dVarC, gVar);
                    this.f11028c.B().j(this.f11028c, "DiskCacheWriteProducer", null);
                }
            }
            p().d(gVar, i7);
        }
    }

    public C0786x(w1.j jVar, w1.j jVar2, Map map, w1.k kVar, d0 d0Var) {
        this.f11023a = jVar;
        this.f11024b = jVar2;
        this.f11025c = map;
        this.f11026d = kVar;
        this.f11027e = d0Var;
    }

    private void c(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        if (e0Var.U().h() >= b.c.DISK_CACHE.h()) {
            e0Var.g("disk", "nil-result_write");
            interfaceC0777n.d(null, 1);
        } else {
            if (e0Var.d().x(32)) {
                interfaceC0777n = new a(interfaceC0777n, e0Var, this.f11023a, this.f11024b, this.f11025c, this.f11026d);
            }
            this.f11027e.a(interfaceC0777n, e0Var);
        }
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        c(interfaceC0777n, e0Var);
    }
}
