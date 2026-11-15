package com.facebook.imagepipeline.producers;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f10859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1.b f10860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f10861c;

    private class a extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g0 f10862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e0 f10863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final J1.d f10864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f10865f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private S0.a f10866g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f10867h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f10868i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f10869j;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b0$a$a, reason: collision with other inner class name */
        class C0204a extends AbstractC0769f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0 f10871a;

            C0204a(b0 b0Var) {
                this.f10871a = b0Var;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void a() {
                a.this.C();
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                S0.a aVar;
                int i7;
                synchronized (a.this) {
                    aVar = a.this.f10866g;
                    i7 = a.this.f10867h;
                    a.this.f10866g = null;
                    a.this.f10868i = false;
                }
                if (S0.a.B(aVar)) {
                    try {
                        a.this.z(aVar, i7);
                    } finally {
                        S0.a.g(aVar);
                    }
                }
                a.this.x();
            }
        }

        public a(InterfaceC0777n interfaceC0777n, g0 g0Var, J1.d dVar, e0 e0Var) {
            super(interfaceC0777n);
            this.f10866g = null;
            this.f10867h = 0;
            this.f10868i = false;
            this.f10869j = false;
            this.f10862c = g0Var;
            this.f10864e = dVar;
            this.f10863d = e0Var;
            e0Var.e(new C0204a(b0.this));
        }

        private Map A(g0 g0Var, e0 e0Var, J1.d dVar) {
            if (g0Var.g(e0Var, "PostprocessorProducer")) {
                return O0.g.of("Postprocessor", dVar.getName());
            }
            return null;
        }

        private synchronized boolean B() {
            return this.f10865f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C() {
            if (y()) {
                p().b();
            }
        }

        private void D(Throwable th) {
            if (y()) {
                p().a(th);
            }
        }

        private void E(S0.a aVar, int i7) {
            boolean zE = AbstractC0766c.e(i7);
            if ((zE || B()) && !(zE && y())) {
                return;
            }
            p().d(aVar, i7);
        }

        private S0.a G(D1.d dVar) {
            D1.e eVar = (D1.e) dVar;
            S0.a aVarA = this.f10864e.a(eVar.z0(), b0.this.f10860b);
            try {
                D1.e eVarQ0 = D1.e.Q0(aVarA, dVar.t0(), eVar.T(), eVar.g1());
                eVarQ0.j(eVar.getExtras());
                return S0.a.J(eVarQ0);
            } finally {
                S0.a.g(aVarA);
            }
        }

        private synchronized boolean H() {
            if (this.f10865f || !this.f10868i || this.f10869j || !S0.a.B(this.f10866g)) {
                return false;
            }
            this.f10869j = true;
            return true;
        }

        private boolean I(D1.d dVar) {
            return dVar instanceof D1.e;
        }

        private void J() {
            b0.this.f10861c.execute(new b());
        }

        private void K(S0.a aVar, int i7) {
            synchronized (this) {
                try {
                    if (this.f10865f) {
                        return;
                    }
                    S0.a aVar2 = this.f10866g;
                    this.f10866g = S0.a.e(aVar);
                    this.f10867h = i7;
                    this.f10868i = true;
                    boolean zH = H();
                    S0.a.g(aVar2);
                    if (zH) {
                        J();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x() {
            boolean zH;
            synchronized (this) {
                this.f10869j = false;
                zH = H();
            }
            if (zH) {
                J();
            }
        }

        private boolean y() {
            synchronized (this) {
                try {
                    if (this.f10865f) {
                        return false;
                    }
                    S0.a aVar = this.f10866g;
                    this.f10866g = null;
                    this.f10865f = true;
                    S0.a.g(aVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z(S0.a aVar, int i7) {
            O0.l.b(Boolean.valueOf(S0.a.B(aVar)));
            if (!I((D1.d) aVar.j())) {
                E(aVar, i7);
                return;
            }
            this.f10862c.e(this.f10863d, "PostprocessorProducer");
            try {
                try {
                    S0.a aVarG = G((D1.d) aVar.j());
                    g0 g0Var = this.f10862c;
                    e0 e0Var = this.f10863d;
                    g0Var.j(e0Var, "PostprocessorProducer", A(g0Var, e0Var, this.f10864e));
                    E(aVarG, i7);
                    S0.a.g(aVarG);
                } catch (Exception e7) {
                    g0 g0Var2 = this.f10862c;
                    e0 e0Var2 = this.f10863d;
                    g0Var2.k(e0Var2, "PostprocessorProducer", e7, A(g0Var2, e0Var2, this.f10864e));
                    D(e7);
                    S0.a.g(null);
                }
            } catch (Throwable th) {
                S0.a.g(null);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void i(S0.a aVar, int i7) {
            if (S0.a.B(aVar)) {
                K(aVar, i7);
            } else if (AbstractC0766c.e(i7)) {
                E(null, i7);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0782t, com.facebook.imagepipeline.producers.AbstractC0766c
        protected void g() {
            C();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0782t, com.facebook.imagepipeline.producers.AbstractC0766c
        protected void h(Throwable th) {
            D(th);
        }
    }

    class b extends AbstractC0782t {
        private b(a aVar) {
            super(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(S0.a aVar, int i7) {
            if (AbstractC0766c.f(i7)) {
                return;
            }
            p().d(aVar, i7);
        }
    }

    public b0(d0 d0Var, v1.b bVar, Executor executor) {
        this.f10859a = (d0) O0.l.g(d0Var);
        this.f10860b = bVar;
        this.f10861c = (Executor) O0.l.g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        g0 g0VarB = e0Var.B();
        J1.d dVarK = e0Var.d().k();
        O0.l.g(dVarK);
        this.f10859a.a(new b(new a(interfaceC0777n, g0VarB, dVarK, e0Var)), e0Var);
    }
}
