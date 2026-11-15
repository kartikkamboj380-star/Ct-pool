package com.facebook.imagepipeline.producers;

import J1.b;
import com.facebook.imagepipeline.producers.C0783u;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0784v implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.j f11011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.j f11012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.k f11013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f11014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f11015e;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.v$a */
    class a implements x0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f11016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f11017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0777n f11018c;

        a(g0 g0Var, e0 e0Var, InterfaceC0777n interfaceC0777n) {
            this.f11016a = g0Var;
            this.f11017b = e0Var;
            this.f11018c = interfaceC0777n;
        }

        @Override // x0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(x0.f fVar) {
            if (C0784v.f(fVar)) {
                this.f11016a.d(this.f11017b, "DiskCacheProducer", null);
                this.f11018c.b();
            } else {
                if (fVar.n()) {
                    this.f11016a.k(this.f11017b, "DiskCacheProducer", fVar.i(), null);
                } else {
                    D1.g gVar = (D1.g) fVar.j();
                    if (gVar != null) {
                        g0 g0Var = this.f11016a;
                        e0 e0Var = this.f11017b;
                        g0Var.j(e0Var, "DiskCacheProducer", C0784v.e(g0Var, e0Var, true, gVar.B()));
                        this.f11016a.c(this.f11017b, "DiskCacheProducer", true);
                        this.f11017b.z("disk");
                        this.f11018c.c(1.0f);
                        this.f11018c.d(gVar, 1);
                        gVar.close();
                    } else {
                        g0 g0Var2 = this.f11016a;
                        e0 e0Var2 = this.f11017b;
                        g0Var2.j(e0Var2, "DiskCacheProducer", C0784v.e(g0Var2, e0Var2, false, 0));
                    }
                }
                C0784v.this.f11014d.a(this.f11018c, this.f11017b);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.v$b */
    class b extends AbstractC0769f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f11020a;

        b(AtomicBoolean atomicBoolean) {
            this.f11020a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f11020a.set(true);
        }
    }

    public C0784v(w1.j jVar, w1.j jVar2, Map map, w1.k kVar, d0 d0Var) {
        this.f11011a = jVar;
        this.f11012b = jVar2;
        this.f11015e = map;
        this.f11013c = kVar;
        this.f11014d = d0Var;
    }

    static Map e(g0 g0Var, e0 e0Var, boolean z6, int i7) {
        if (!g0Var.g(e0Var, "DiskCacheProducer")) {
            return null;
        }
        String strValueOf = String.valueOf(z6);
        return z6 ? O0.g.of("cached_value_found", strValueOf, "encodedImageSize", String.valueOf(i7)) : O0.g.of("cached_value_found", strValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(x0.f fVar) {
        return fVar.l() || (fVar.n() && (fVar.i() instanceof CancellationException));
    }

    private void g(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        if (e0Var.U().h() < b.c.DISK_CACHE.h()) {
            this.f11014d.a(interfaceC0777n, e0Var);
        } else {
            e0Var.g("disk", "nil-result_read");
            interfaceC0777n.d(null, 1);
        }
    }

    private x0.d h(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        return new a(e0Var.B(), e0Var, interfaceC0777n);
    }

    private void i(AtomicBoolean atomicBoolean, e0 e0Var) {
        e0Var.e(new b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        J1.b bVarD = e0Var.d();
        if (!e0Var.d().x(16)) {
            g(interfaceC0777n, e0Var);
            return;
        }
        e0Var.B().e(e0Var, "DiskCacheProducer");
        I0.d dVarC = this.f11013c.c(bVarD, e0Var.a());
        w1.j jVarA = C0783u.a(bVarD, this.f11012b, this.f11011a, this.f11015e);
        if (jVarA != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            jVarA.m(dVarC, atomicBoolean).e(h(interfaceC0777n, e0Var));
            i(atomicBoolean, e0Var);
        } else {
            e0Var.B().k(e0Var, "DiskCacheProducer", new C0783u.a("Got no disk cache for CacheChoice: " + Integer.valueOf(bVarD.c().ordinal()).toString()), null);
            g(interfaceC0777n, e0Var);
        }
    }
}
