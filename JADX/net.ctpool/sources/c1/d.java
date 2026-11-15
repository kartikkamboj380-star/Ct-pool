package c1;

import D1.i;
import O0.j;
import O0.l;
import O0.o;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import d1.C1603a;
import f1.AbstractC1644a;
import g1.AbstractC1686a;
import g1.AbstractC1687b;
import h1.C1705a;
import i1.C1740a;
import j1.p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import m1.InterfaceC1869b;
import w1.x;

/* JADX INFO: loaded from: classes.dex */
public class d extends AbstractC1686a {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final Class f9967M = d.class;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final C1.a f9968A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final O0.f f9969B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final x f9970C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private I0.d f9971D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private o f9972E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f9973F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private O0.f f9974G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private C1603a f9975H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Set f9976I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private J1.b f9977J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private J1.b[] f9978K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private J1.b f9979L;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Resources f9980z;

    public d(Resources resources, AbstractC1644a abstractC1644a, C1.a aVar, Executor executor, x xVar, O0.f fVar) {
        super(abstractC1644a, executor, null, null);
        this.f9980z = resources;
        this.f9968A = new C0710a(resources, aVar);
        this.f9969B = fVar;
        this.f9970C = xVar;
    }

    private void p0(o oVar) {
        this.f9972E = oVar;
        t0(null);
    }

    private Drawable s0(O0.f fVar, D1.d dVar) {
        Drawable drawableA;
        if (fVar == null) {
            return null;
        }
        Iterator<E> it = fVar.iterator();
        while (it.hasNext()) {
            C1.a aVar = (C1.a) it.next();
            if (aVar.b(dVar) && (drawableA = aVar.a(dVar)) != null) {
                return drawableA;
            }
        }
        return null;
    }

    private void t0(D1.d dVar) {
        if (this.f9973F) {
            if (r() == null) {
                C1705a c1705a = new C1705a();
                j(new C1740a(c1705a));
                a0(c1705a);
            }
            if (r() instanceof C1705a) {
                A0(dVar, (C1705a) r());
            }
        }
    }

    protected void A0(D1.d dVar, C1705a c1705a) {
        j1.o oVarA;
        c1705a.j(v());
        InterfaceC1869b interfaceC1869bB = b();
        p.b bVarA = null;
        if (interfaceC1869bB != null && (oVarA = p.a(interfaceC1869bB.g())) != null) {
            bVarA = oVarA.A();
        }
        c1705a.m(bVarA);
        String strL0 = l0();
        if (strL0 != null) {
            c1705a.b("cc", strL0);
        }
        if (dVar == null) {
            c1705a.i();
        } else {
            c1705a.k(dVar.getWidth(), dVar.getHeight());
            c1705a.l(dVar.T0());
        }
    }

    @Override // g1.AbstractC1686a, m1.InterfaceC1868a
    public void d(InterfaceC1869b interfaceC1869b) {
        super.d(interfaceC1869b);
        t0(null);
    }

    public synchronized void i0(F1.e eVar) {
        try {
            if (this.f9976I == null) {
                this.f9976I = new HashSet();
            }
            this.f9976I.add(eVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g1.AbstractC1686a
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public Drawable l(S0.a aVar) {
        try {
            if (K1.b.d()) {
                K1.b.a("PipelineDraweeController#createDrawable");
            }
            l.i(S0.a.B(aVar));
            D1.d dVar = (D1.d) aVar.j();
            t0(dVar);
            Drawable drawableS0 = s0(this.f9974G, dVar);
            if (drawableS0 != null) {
                if (K1.b.d()) {
                    K1.b.b();
                }
                return drawableS0;
            }
            Drawable drawableS02 = s0(this.f9969B, dVar);
            if (drawableS02 != null) {
                if (K1.b.d()) {
                    K1.b.b();
                }
                return drawableS02;
            }
            Drawable drawableA = this.f9968A.a(dVar);
            if (drawableA != null) {
                if (K1.b.d()) {
                    K1.b.b();
                }
                return drawableA;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + dVar);
        } catch (Throwable th) {
            if (K1.b.d()) {
                K1.b.b();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g1.AbstractC1686a
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public S0.a n() {
        I0.d dVar;
        if (K1.b.d()) {
            K1.b.a("PipelineDraweeController#getCachedImage");
        }
        try {
            x xVar = this.f9970C;
            if (xVar != null && (dVar = this.f9971D) != null) {
                S0.a aVar = xVar.get(dVar);
                if (aVar != null && !((D1.d) aVar.j()).t0().a()) {
                    aVar.close();
                    return null;
                }
                if (K1.b.d()) {
                    K1.b.b();
                }
                return aVar;
            }
            if (K1.b.d()) {
                K1.b.b();
            }
            return null;
        } finally {
            if (K1.b.d()) {
                K1.b.b();
            }
        }
    }

    protected String l0() {
        Object objO = o();
        if (objO == null) {
            return null;
        }
        return objO.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g1.AbstractC1686a
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public int x(S0.a aVar) {
        if (aVar != null) {
            return aVar.l();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g1.AbstractC1686a
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public i y(S0.a aVar) {
        l.i(S0.a.B(aVar));
        return ((D1.d) aVar.j()).x0();
    }

    public synchronized F1.e o0() {
        Set set = this.f9976I;
        if (set == null) {
            return null;
        }
        return new F1.c(set);
    }

    public void q0(o oVar, String str, I0.d dVar, Object obj, O0.f fVar) {
        if (K1.b.d()) {
            K1.b.a("PipelineDraweeController#initialize");
        }
        super.D(str, obj);
        p0(oVar);
        this.f9971D = dVar;
        y0(fVar);
        t0(null);
        if (K1.b.d()) {
            K1.b.b();
        }
    }

    protected synchronized void r0(p1.g gVar, AbstractC1687b abstractC1687b, o oVar) {
        try {
            C1603a c1603a = this.f9975H;
            if (c1603a != null) {
                c1603a.f();
            }
            if (gVar != null) {
                if (this.f9975H == null) {
                    this.f9975H = new C1603a(AwakeTimeSinceBootClock.get(), this, oVar);
                }
                this.f9975H.c(gVar);
                this.f9975H.g(true);
            }
            this.f9977J = (J1.b) abstractC1687b.l();
            this.f9978K = (J1.b[]) abstractC1687b.k();
            this.f9979L = (J1.b) abstractC1687b.m();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g1.AbstractC1686a
    protected Y0.c s() {
        if (K1.b.d()) {
            K1.b.a("PipelineDraweeController#getDataSource");
        }
        if (P0.a.u(2)) {
            P0.a.w(f9967M, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        Y0.c cVar = (Y0.c) this.f9972E.get();
        if (K1.b.d()) {
            K1.b.b();
        }
        return cVar;
    }

    @Override // g1.AbstractC1686a
    public String toString() {
        return j.c(this).b("super", super.toString()).b("dataSourceSupplier", this.f9972E).toString();
    }

    @Override // g1.AbstractC1686a
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public Map K(i iVar) {
        if (iVar == null) {
            return null;
        }
        return iVar.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g1.AbstractC1686a
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void M(String str, S0.a aVar) {
        super.M(str, aVar);
        synchronized (this) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g1.AbstractC1686a
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void R(S0.a aVar) {
        S0.a.g(aVar);
    }

    public synchronized void x0(F1.e eVar) {
        Set set = this.f9976I;
        if (set == null) {
            return;
        }
        set.remove(eVar);
    }

    public void y0(O0.f fVar) {
        this.f9974G = fVar;
    }

    @Override // g1.AbstractC1686a
    protected Uri z() {
        return p1.j.a(this.f9977J, this.f9979L, this.f9978K, J1.b.f1656z);
    }

    public void z0(boolean z6) {
        this.f9973F = z6;
    }

    @Override // g1.AbstractC1686a
    protected void P(Drawable drawable) {
    }
}
