package com.facebook.imagepipeline.producers;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class L implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f10776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R0.i f10777b;

    class a extends m0 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ J1.b f10778r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ g0 f10779s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ e0 f10780t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0777n interfaceC0777n, g0 g0Var, e0 e0Var, String str, J1.b bVar, g0 g0Var2, e0 e0Var2) {
            super(interfaceC0777n, g0Var, e0Var, str);
            this.f10778r = bVar;
            this.f10779s = g0Var2;
            this.f10780t = e0Var2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M0.e
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(D1.g gVar) {
            D1.g.d(gVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M0.e
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public D1.g c() {
            D1.g gVarD = L.this.d(this.f10778r);
            if (gVarD == null) {
                this.f10779s.c(this.f10780t, L.this.f(), false);
                this.f10780t.g(ImagesContract.LOCAL, "fetch");
                return null;
            }
            gVarD.n0();
            this.f10779s.c(this.f10780t, L.this.f(), true);
            this.f10780t.g(ImagesContract.LOCAL, "fetch");
            this.f10780t.w("image_color_space", gVarD.j());
            return gVarD;
        }
    }

    class b extends AbstractC0769f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f10782a;

        b(m0 m0Var) {
            this.f10782a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f10782a.a();
        }
    }

    protected L(Executor executor, R0.i iVar) {
        this.f10776a = executor;
        this.f10777b = iVar;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        g0 g0VarB = e0Var.B();
        J1.b bVarD = e0Var.d();
        e0Var.g(ImagesContract.LOCAL, "fetch");
        a aVar = new a(interfaceC0777n, g0VarB, e0Var, f(), bVarD, g0VarB, e0Var);
        e0Var.e(new b(aVar));
        this.f10776a.execute(aVar);
    }

    protected D1.g c(InputStream inputStream, int i7) {
        S0.a aVarJ = null;
        try {
            aVarJ = S0.a.J(i7 <= 0 ? this.f10777b.c(inputStream) : this.f10777b.d(inputStream, i7));
            D1.g gVar = new D1.g(aVarJ);
            O0.b.b(inputStream);
            S0.a.g(aVarJ);
            return gVar;
        } catch (Throwable th) {
            O0.b.b(inputStream);
            S0.a.g(aVarJ);
            throw th;
        }
    }

    protected abstract D1.g d(J1.b bVar);

    protected D1.g e(InputStream inputStream, int i7) {
        return c(inputStream, i7);
    }

    protected abstract String f();
}
