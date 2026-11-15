package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.G;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import s1.C2037b;
import s1.C2038c;
import x1.C2215f;
import x1.C2216g;

/* JADX INFO: loaded from: classes.dex */
public class k0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f10923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R0.i f10924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f10925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L1.d f10927e;

    private class a extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f10928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final L1.d f10929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final e0 f10930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f10931f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final G f10932g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k0$a$a, reason: collision with other inner class name */
        class C0205a implements G.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f10934a;

            C0205a(k0 k0Var) {
                this.f10934a = k0Var;
            }

            @Override // com.facebook.imagepipeline.producers.G.d
            public void a(D1.g gVar, int i7) throws Throwable {
                if (gVar == null) {
                    a.this.p().d(null, i7);
                } else {
                    a aVar = a.this;
                    aVar.w(gVar, i7, (L1.c) O0.l.g(aVar.f10929d.createImageTranscoder(gVar.n(), a.this.f10928c)));
                }
            }
        }

        class b extends AbstractC0769f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f10936a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC0777n f10937b;

            b(k0 k0Var, InterfaceC0777n interfaceC0777n) {
                this.f10936a = k0Var;
                this.f10937b = interfaceC0777n;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void a() {
                a.this.f10932g.c();
                a.this.f10931f = true;
                this.f10937b.b();
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC0769f, com.facebook.imagepipeline.producers.f0
            public void b() {
                if (a.this.f10930e.J()) {
                    a.this.f10932g.h();
                }
            }
        }

        a(InterfaceC0777n interfaceC0777n, e0 e0Var, boolean z6, L1.d dVar) {
            super(interfaceC0777n);
            this.f10931f = false;
            this.f10930e = e0Var;
            Boolean boolR = e0Var.d().r();
            this.f10928c = boolR != null ? boolR.booleanValue() : z6;
            this.f10929d = dVar;
            this.f10932g = new G(k0.this.f10923a, new C0205a(k0.this), 100);
            e0Var.e(new b(k0.this, interfaceC0777n));
        }

        private D1.g A(D1.g gVar) {
            C2216g c2216gS = this.f10930e.d().s();
            return (c2216gS.h() || !c2216gS.g()) ? gVar : y(gVar, c2216gS.f());
        }

        private D1.g B(D1.g gVar) {
            return (this.f10930e.d().s().d() || gVar.T() == 0 || gVar.T() == -1) ? gVar : y(gVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(D1.g gVar, int i7, L1.c cVar) throws Throwable {
            this.f10930e.B().e(this.f10930e, "ResizeAndRotateProducer");
            J1.b bVarD = this.f10930e.d();
            R0.k kVarA = k0.this.f10924b.a();
            try {
                L1.b bVarB = cVar.b(gVar, kVarA, bVarD.s(), bVarD.q(), null, 85, gVar.j());
                if (bVarB.a() == 2) {
                    throw new RuntimeException("Error while transcoding the image");
                }
                Map mapZ = z(gVar, bVarD.q(), bVarB, cVar.a());
                S0.a aVarJ = S0.a.J(kVarA.a());
                try {
                    D1.g gVar2 = new D1.g(aVarJ);
                    gVar2.b1(C2037b.f22237b);
                    try {
                        gVar2.n0();
                        this.f10930e.B().j(this.f10930e, "ResizeAndRotateProducer", mapZ);
                        if (bVarB.a() != 1) {
                            i7 |= 16;
                        }
                        p().d(gVar2, i7);
                    } finally {
                        D1.g.d(gVar2);
                    }
                } finally {
                    S0.a.g(aVarJ);
                }
            } catch (Exception e7) {
                this.f10930e.B().k(this.f10930e, "ResizeAndRotateProducer", e7, null);
                if (AbstractC0766c.e(i7)) {
                    p().a(e7);
                }
            } finally {
                kVarA.close();
            }
        }

        private void x(D1.g gVar, int i7, C2038c c2038c) {
            p().d((c2038c == C2037b.f22237b || c2038c == C2037b.f22247l) ? B(gVar) : A(gVar), i7);
        }

        private D1.g y(D1.g gVar, int i7) {
            D1.g gVarB = D1.g.b(gVar);
            if (gVarB != null) {
                gVarB.f1(i7);
            }
            return gVarB;
        }

        private Map z(D1.g gVar, C2215f c2215f, L1.b bVar, String str) {
            String str2;
            if (!this.f10930e.B().g(this.f10930e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = gVar.getWidth() + "x" + gVar.getHeight();
            if (c2215f != null) {
                str2 = c2215f.f22824a + "x" + c2215f.f22825b;
            } else {
                str2 = "Unspecified";
            }
            HashMap map = new HashMap();
            map.put("Image format", String.valueOf(gVar.n()));
            map.put("Original size", str3);
            map.put("Requested size", str2);
            map.put("queueTime", String.valueOf(this.f10932g.f()));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(bVar));
            return O0.g.a(map);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public void i(D1.g gVar, int i7) {
            if (this.f10931f) {
                return;
            }
            boolean zE = AbstractC0766c.e(i7);
            if (gVar == null) {
                if (zE) {
                    p().d(null, 1);
                    return;
                }
                return;
            }
            C2038c c2038cN = gVar.n();
            W0.e eVarH = k0.h(this.f10930e.d(), gVar, (L1.c) O0.l.g(this.f10929d.createImageTranscoder(c2038cN, this.f10928c)));
            if (zE || eVarH != W0.e.UNSET) {
                if (eVarH != W0.e.YES) {
                    x(gVar, i7, c2038cN);
                } else if (this.f10932g.k(gVar, i7)) {
                    if (zE || this.f10930e.J()) {
                        this.f10932g.h();
                    }
                }
            }
        }
    }

    public k0(Executor executor, R0.i iVar, d0 d0Var, boolean z6, L1.d dVar) {
        this.f10923a = (Executor) O0.l.g(executor);
        this.f10924b = (R0.i) O0.l.g(iVar);
        this.f10925c = (d0) O0.l.g(d0Var);
        this.f10927e = (L1.d) O0.l.g(dVar);
        this.f10926d = z6;
    }

    private static boolean f(C2216g c2216g, D1.g gVar) {
        return !c2216g.d() && (L1.e.e(c2216g, gVar) != 0 || g(c2216g, gVar));
    }

    private static boolean g(C2216g c2216g, D1.g gVar) {
        if (c2216g.g() && !c2216g.d()) {
            return L1.e.f1959b.contains(Integer.valueOf(gVar.g1()));
        }
        gVar.R0(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static W0.e h(J1.b bVar, D1.g gVar, L1.c cVar) {
        if (gVar == null || gVar.n() == C2038c.f22251d) {
            return W0.e.UNSET;
        }
        if (cVar.c(gVar.n())) {
            return W0.e.j(f(bVar.s(), gVar) || cVar.d(gVar, bVar.s(), bVar.q()));
        }
        return W0.e.NO;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        this.f10925c.a(new a(interfaceC0777n, e0Var, this.f10926d, this.f10927e), e0Var);
    }
}
