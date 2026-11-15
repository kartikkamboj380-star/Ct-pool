package com.facebook.imagepipeline.producers;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import s1.C2038c;
import x1.C2210a;

/* JADX INFO: loaded from: classes.dex */
public class Y implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.j f10833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.k f10834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final R0.i f10835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final R0.a f10836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f10837e;

    class a implements x0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f10838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f10839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0777n f10840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ I0.d f10841d;

        a(g0 g0Var, e0 e0Var, InterfaceC0777n interfaceC0777n, I0.d dVar) {
            this.f10838a = g0Var;
            this.f10839b = e0Var;
            this.f10840c = interfaceC0777n;
            this.f10841d = dVar;
        }

        @Override // x0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(x0.f fVar) {
            if (Y.g(fVar)) {
                this.f10838a.d(this.f10839b, "PartialDiskCacheProducer", null);
                this.f10840c.b();
            } else if (fVar.n()) {
                this.f10838a.k(this.f10839b, "PartialDiskCacheProducer", fVar.i(), null);
                Y.this.i(this.f10840c, this.f10839b, this.f10841d, null);
            } else {
                D1.g gVar = (D1.g) fVar.j();
                g0 g0Var = this.f10838a;
                e0 e0Var = this.f10839b;
                if (gVar != null) {
                    g0Var.j(e0Var, "PartialDiskCacheProducer", Y.f(g0Var, e0Var, true, gVar.B()));
                    C2210a c2210aE = C2210a.e(gVar.B() - 1);
                    gVar.M0(c2210aE);
                    int iB = gVar.B();
                    J1.b bVarD = this.f10839b.d();
                    if (c2210aE.b(bVarD.b())) {
                        this.f10839b.g("disk", "partial");
                        this.f10838a.c(this.f10839b, "PartialDiskCacheProducer", true);
                        this.f10840c.d(gVar, 9);
                    } else {
                        this.f10840c.d(gVar, 8);
                        Y.this.i(this.f10840c, new l0(J1.c.b(bVarD).y(C2210a.c(iB - 1)).a(), this.f10839b), this.f10841d, gVar);
                    }
                } else {
                    g0Var.j(e0Var, "PartialDiskCacheProducer", Y.f(g0Var, e0Var, false, 0));
                    Y.this.i(this.f10840c, this.f10839b, this.f10841d, gVar);
                }
            }
            return null;
        }
    }

    class b extends AbstractC0769f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f10843a;

        b(AtomicBoolean atomicBoolean) {
            this.f10843a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f10843a.set(true);
        }
    }

    private static class c extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w1.j f10845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final I0.d f10846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final R0.i f10847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final R0.a f10848f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final D1.g f10849g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f10850h;

        private c(InterfaceC0777n interfaceC0777n, w1.j jVar, I0.d dVar, R0.i iVar, R0.a aVar, D1.g gVar, boolean z6) {
            super(interfaceC0777n);
            this.f10845c = jVar;
            this.f10846d = dVar;
            this.f10847e = iVar;
            this.f10848f = aVar;
            this.f10849g = gVar;
            this.f10850h = z6;
        }

        private void q(InputStream inputStream, OutputStream outputStream, int i7) throws IOException {
            byte[] bArr = (byte[]) this.f10848f.get(16384);
            int i8 = i7;
            while (i8 > 0) {
                try {
                    int i9 = inputStream.read(bArr, 0, Math.min(16384, i8));
                    if (i9 < 0) {
                        break;
                    } else if (i9 > 0) {
                        outputStream.write(bArr, 0, i9);
                        i8 -= i9;
                    }
                } finally {
                    this.f10848f.a(bArr);
                }
            }
            if (i8 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i7), Integer.valueOf(i8)));
            }
        }

        private R0.k r(D1.g gVar, D1.g gVar2) throws IOException {
            int i7 = ((C2210a) O0.l.g(gVar2.g())).f22790a;
            R0.k kVarE = this.f10847e.e(gVar2.B() + i7);
            q(gVar.w(), kVarE, i7);
            q(gVar2.w(), kVarE, gVar2.B());
            return kVarE;
        }

        private void t(R0.k kVar) throws Throwable {
            D1.g gVar;
            Throwable th;
            S0.a aVarJ = S0.a.J(kVar.a());
            try {
                gVar = new D1.g(aVarJ);
                try {
                    gVar.n0();
                    p().d(gVar, 1);
                    D1.g.d(gVar);
                    S0.a.g(aVarJ);
                } catch (Throwable th2) {
                    th = th2;
                    D1.g.d(gVar);
                    S0.a.g(aVarJ);
                    throw th;
                }
            } catch (Throwable th3) {
                gVar = null;
                th = th3;
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(D1.g gVar, int i7) {
            if (AbstractC0766c.f(i7)) {
                return;
            }
            if (this.f10849g == null || gVar == null || gVar.g() == null) {
                if (this.f10850h && AbstractC0766c.n(i7, 8) && AbstractC0766c.e(i7) && gVar != null && gVar.n() != C2038c.f22251d) {
                    this.f10845c.p(this.f10846d, gVar);
                }
                p().d(gVar, i7);
                return;
            }
            try {
                try {
                    t(r(this.f10849g, gVar));
                } catch (IOException e7) {
                    P0.a.k("PartialDiskCacheProducer", "Error while merging image data", e7);
                    p().a(e7);
                }
                this.f10845c.s(this.f10846d);
            } finally {
                gVar.close();
                this.f10849g.close();
            }
        }
    }

    public Y(w1.j jVar, w1.k kVar, R0.i iVar, R0.a aVar, d0 d0Var) {
        this.f10833a = jVar;
        this.f10834b = kVar;
        this.f10835c = iVar;
        this.f10836d = aVar;
        this.f10837e = d0Var;
    }

    private static Uri e(J1.b bVar) {
        return bVar.u().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    static Map f(g0 g0Var, e0 e0Var, boolean z6, int i7) {
        if (!g0Var.g(e0Var, "PartialDiskCacheProducer")) {
            return null;
        }
        String strValueOf = String.valueOf(z6);
        return z6 ? O0.g.of("cached_value_found", strValueOf, "encodedImageSize", String.valueOf(i7)) : O0.g.of("cached_value_found", strValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(x0.f fVar) {
        return fVar.l() || (fVar.n() && (fVar.i() instanceof CancellationException));
    }

    private x0.d h(InterfaceC0777n interfaceC0777n, e0 e0Var, I0.d dVar) {
        return new a(e0Var.B(), e0Var, interfaceC0777n, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(InterfaceC0777n interfaceC0777n, e0 e0Var, I0.d dVar, D1.g gVar) {
        this.f10837e.a(new c(interfaceC0777n, this.f10833a, dVar, this.f10835c, this.f10836d, gVar, e0Var.d().x(32)), e0Var);
    }

    private void j(AtomicBoolean atomicBoolean, e0 e0Var) {
        e0Var.e(new b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        J1.b bVarD = e0Var.d();
        boolean zX = e0Var.d().x(16);
        boolean zX2 = e0Var.d().x(32);
        if (!zX && !zX2) {
            this.f10837e.a(interfaceC0777n, e0Var);
            return;
        }
        g0 g0VarB = e0Var.B();
        g0VarB.e(e0Var, "PartialDiskCacheProducer");
        I0.d dVarD = this.f10834b.d(bVarD, e(bVarD), e0Var.a());
        if (!zX) {
            g0VarB.j(e0Var, "PartialDiskCacheProducer", f(g0VarB, e0Var, false, 0));
            i(interfaceC0777n, e0Var, dVarD, null);
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f10833a.m(dVarD, atomicBoolean).e(h(interfaceC0777n, e0Var, dVarD));
            j(atomicBoolean, e0Var);
        }
    }
}
