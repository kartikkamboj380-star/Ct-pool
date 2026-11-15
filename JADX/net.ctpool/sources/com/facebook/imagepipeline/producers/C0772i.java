package com.facebook.imagepipeline.producers;

import J1.b;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0772i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.x f10893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.k f10894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f10895c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i$a */
    class a extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ I0.d f10896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f10897d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0777n interfaceC0777n, I0.d dVar, boolean z6) {
            super(interfaceC0777n);
            this.f10896c = dVar;
            this.f10897d = z6;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(S0.a aVar, int i7) {
            S0.a aVar2;
            try {
                if (K1.b.d()) {
                    K1.b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean zE = AbstractC0766c.e(i7);
                if (aVar == null) {
                    if (zE) {
                        p().d(null, i7);
                    }
                    if (K1.b.d()) {
                        K1.b.b();
                        return;
                    }
                    return;
                }
                if (!((D1.d) aVar.j()).a1() && !AbstractC0766c.n(i7, 8)) {
                    if (!zE && (aVar2 = C0772i.this.f10893a.get(this.f10896c)) != null) {
                        try {
                            D1.l lVarT0 = ((D1.d) aVar.j()).t0();
                            D1.l lVarT02 = ((D1.d) aVar2.j()).t0();
                            if (lVarT02.a() || lVarT02.c() >= lVarT0.c()) {
                                p().d(aVar2, i7);
                                if (K1.b.d()) {
                                    K1.b.b();
                                    return;
                                }
                                return;
                            }
                        } finally {
                            S0.a.g(aVar2);
                        }
                    }
                    S0.a aVarD = this.f10897d ? C0772i.this.f10893a.d(this.f10896c, aVar) : null;
                    if (zE) {
                        try {
                            p().c(1.0f);
                        } catch (Throwable th) {
                            S0.a.g(aVarD);
                            throw th;
                        }
                    }
                    InterfaceC0777n interfaceC0777nP = p();
                    if (aVarD != null) {
                        aVar = aVarD;
                    }
                    interfaceC0777nP.d(aVar, i7);
                    S0.a.g(aVarD);
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
            } catch (Throwable th2) {
                if (K1.b.d()) {
                    K1.b.b();
                }
                throw th2;
            }
        }
    }

    public C0772i(w1.x xVar, w1.k kVar, d0 d0Var) {
        this.f10893a = xVar;
        this.f10894b = kVar;
        this.f10895c = d0Var;
    }

    private static void f(D1.h hVar, e0 e0Var) {
        e0Var.j(hVar.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        try {
            if (K1.b.d()) {
                K1.b.a("BitmapMemoryCacheProducer#produceResults");
            }
            g0 g0VarB = e0Var.B();
            g0VarB.e(e0Var, e());
            I0.d dVarA = this.f10894b.a(e0Var.d(), e0Var.a());
            S0.a aVar = e0Var.d().x(1) ? this.f10893a.get(dVarA) : null;
            if (aVar != null) {
                f((D1.h) aVar.j(), e0Var);
                boolean zA = ((D1.d) aVar.j()).t0().a();
                if (zA) {
                    g0VarB.j(e0Var, e(), g0VarB.g(e0Var, e()) ? O0.g.of("cached_value_found", "true") : null);
                    g0VarB.c(e0Var, e(), true);
                    e0Var.g("memory_bitmap", d());
                    interfaceC0777n.c(1.0f);
                }
                interfaceC0777n.d(aVar, AbstractC0766c.l(zA));
                aVar.close();
                if (zA) {
                    if (K1.b.d()) {
                        K1.b.b();
                        return;
                    }
                    return;
                }
            }
            if (e0Var.U().h() >= b.c.BITMAP_MEMORY_CACHE.h()) {
                g0VarB.j(e0Var, e(), g0VarB.g(e0Var, e()) ? O0.g.of("cached_value_found", "false") : null);
                g0VarB.c(e0Var, e(), false);
                e0Var.g("memory_bitmap", d());
                interfaceC0777n.d(null, 1);
                if (K1.b.d()) {
                    K1.b.b();
                    return;
                }
                return;
            }
            InterfaceC0777n interfaceC0777nG = g(interfaceC0777n, dVarA, e0Var.d().x(2));
            g0VarB.j(e0Var, e(), g0VarB.g(e0Var, e()) ? O0.g.of("cached_value_found", "false") : null);
            if (K1.b.d()) {
                K1.b.a("mInputProducer.produceResult");
            }
            this.f10895c.a(interfaceC0777nG, e0Var);
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

    protected String d() {
        return "pipe_bg";
    }

    protected String e() {
        return "BitmapMemoryCacheProducer";
    }

    protected InterfaceC0777n g(InterfaceC0777n interfaceC0777n, I0.d dVar, boolean z6) {
        return new a(interfaceC0777n, dVar, z6);
    }
}
