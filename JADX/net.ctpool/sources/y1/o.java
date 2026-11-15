package y1;

import android.content.Context;
import com.facebook.imagepipeline.producers.B;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.q0;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import t1.C2056b;
import t1.InterfaceC2055a;
import w1.InterfaceC2180a;
import w1.u;
import w1.v;
import w1.x;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Class f23080t = o.class;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static o f23081u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static k f23082v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static boolean f23083w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f23084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f23085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2238a f23086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w1.n f23087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u f23088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w1.n f23089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u f23090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w1.j f23091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private J0.n f23092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private B1.c f23093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private L1.d f23094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private s f23095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private t f23096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private w1.j f23097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private J0.n f23098o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map f23099p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private O0.g f23100q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private v1.b f23101r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private H1.f f23102s;

    public o(m mVar) {
        if (K1.b.d()) {
            K1.b.a("ImagePipelineConfig()");
        }
        m mVar2 = (m) O0.l.g(mVar);
        this.f23085b = mVar2;
        this.f23084a = mVar2.G().D() ? new B(mVar.I().b()) : new q0(mVar.I().b());
        this.f23086c = new C2238a(mVar.f());
        if (K1.b.d()) {
            K1.b.b();
        }
    }

    private k a() {
        t tVarT = t();
        Set setK = this.f23085b.k();
        Set setC = this.f23085b.c();
        O0.o oVarV = this.f23085b.v();
        u uVarE = e();
        u uVarJ = j();
        w1.j jVarO = o();
        w1.j jVarU = u();
        w1.k kVarM = this.f23085b.m();
        p0 p0Var = this.f23084a;
        O0.o oVarS = this.f23085b.G().s();
        O0.o oVarF = this.f23085b.G().F();
        this.f23085b.D();
        return new k(tVarT, setK, setC, oVarV, uVarE, uVarJ, jVarO, jVarU, kVarM, p0Var, oVarS, oVarF, null, this.f23085b);
    }

    private InterfaceC2055a c() {
        v1.b bVarQ = q();
        g gVarI = this.f23085b.I();
        w1.n nVarD = d();
        boolean zI = this.f23085b.G().i();
        boolean zU = this.f23085b.G().u();
        int iC = this.f23085b.G().c();
        this.f23085b.w();
        C2056b.a(bVarQ, gVarI, nVarD, zI, zU, iC, null);
        return null;
    }

    private O0.g g() {
        if (this.f23100q == null) {
            HashMap map = new HashMap();
            for (Map.Entry entry : h().entrySet()) {
                map.put((String) entry.getKey(), new w1.j((J0.n) entry.getValue(), this.f23085b.b().g(this.f23085b.d()), this.f23085b.b().h(), this.f23085b.I().e(), this.f23085b.I().d(), this.f23085b.t()));
            }
            this.f23100q = O0.g.a(map);
        }
        return this.f23100q;
    }

    private Map h() {
        if (this.f23099p == null) {
            this.f23099p = new HashMap();
            if (this.f23085b.r() != null) {
                for (Map.Entry entry : this.f23085b.r().entrySet()) {
                    this.f23099p.put((String) entry.getKey(), this.f23085b.e().a((J0.g) entry.getValue()));
                }
            }
        }
        return this.f23099p;
    }

    private B1.c k() {
        B1.c bVar;
        if (this.f23093j == null) {
            if (this.f23085b.F() != null) {
                bVar = this.f23085b.F();
            } else {
                c();
                this.f23085b.A();
                bVar = new B1.b(null, null, r());
            }
            this.f23093j = bVar;
        }
        return this.f23093j;
    }

    private L1.d m() {
        if (this.f23094k == null) {
            this.f23094k = (this.f23085b.y() == null && this.f23085b.x() == null && this.f23085b.G().G()) ? new L1.h(this.f23085b.G().l()) : new L1.f(this.f23085b.G().l(), this.f23085b.G().w(), this.f23085b.y(), this.f23085b.x(), this.f23085b.G().C());
        }
        return this.f23094k;
    }

    public static o n() {
        return (o) O0.l.h(f23081u, "ImagePipelineFactory was not initialized!");
    }

    private s s() {
        if (this.f23095l == null) {
            this.f23095l = this.f23085b.G().o().a(this.f23085b.a(), this.f23085b.b().i(), k(), this.f23085b.q(), this.f23085b.C(), this.f23085b.n(), this.f23085b.G().y(), this.f23085b.I(), this.f23085b.b().g(this.f23085b.d()), this.f23085b.b().h(), e(), j(), o(), u(), g(), this.f23085b.m(), q(), this.f23085b.G().f(), this.f23085b.G().e(), this.f23085b.G().d(), this.f23085b.G().l(), f(), this.f23085b.G().k(), this.f23085b.G().t());
        }
        return this.f23095l;
    }

    private t t() {
        boolean zV = this.f23085b.G().v();
        if (this.f23096m == null) {
            this.f23096m = new t(this.f23085b.a().getApplicationContext().getContentResolver(), s(), this.f23085b.h(), this.f23085b.n(), this.f23085b.G().I(), this.f23084a, this.f23085b.C(), zV, this.f23085b.G().H(), this.f23085b.B(), m(), this.f23085b.G().B(), this.f23085b.G().z(), this.f23085b.G().a(), this.f23085b.p());
        }
        return this.f23096m;
    }

    private w1.j u() {
        if (this.f23097n == null) {
            this.f23097n = new w1.j(v(), this.f23085b.b().g(this.f23085b.d()), this.f23085b.b().h(), this.f23085b.I().e(), this.f23085b.I().d(), this.f23085b.t());
        }
        return this.f23097n;
    }

    public static synchronized void w(Context context) {
        try {
            if (K1.b.d()) {
                K1.b.a("ImagePipelineFactory#initialize");
            }
            x(l.L(context).a());
            if (K1.b.d()) {
                K1.b.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void x(m mVar) {
        if (f23081u != null) {
            P0.a.C(f23080t, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            if (f23083w) {
                return;
            }
        }
        f23081u = new o(mVar);
    }

    public C1.a b(Context context) {
        c();
        return null;
    }

    public w1.n d() {
        if (this.f23087d == null) {
            InterfaceC2180a interfaceC2180aG = this.f23085b.g();
            O0.o oVarE = this.f23085b.E();
            R0.d dVarZ = this.f23085b.z();
            x.a aVarO = this.f23085b.o();
            boolean zQ = this.f23085b.G().q();
            boolean zP = this.f23085b.G().p();
            this.f23085b.u();
            this.f23087d = interfaceC2180aG.a(oVarE, dVarZ, aVarO, zQ, zP, null);
        }
        return this.f23087d;
    }

    public u e() {
        if (this.f23088e == null) {
            this.f23088e = v.a(d(), this.f23085b.t());
        }
        return this.f23088e;
    }

    public C2238a f() {
        return this.f23086c;
    }

    public w1.n i() {
        if (this.f23089f == null) {
            this.f23089f = w1.r.a(this.f23085b.H(), this.f23085b.z(), this.f23085b.l());
        }
        return this.f23089f;
    }

    public u j() {
        if (this.f23090g == null) {
            this.f23090g = w1.s.a(this.f23085b.i() != null ? this.f23085b.i() : i(), this.f23085b.t());
        }
        return this.f23090g;
    }

    public k l() {
        if (f23082v == null) {
            f23082v = a();
        }
        return f23082v;
    }

    public w1.j o() {
        if (this.f23091h == null) {
            this.f23091h = new w1.j(p(), this.f23085b.b().g(this.f23085b.d()), this.f23085b.b().h(), this.f23085b.I().e(), this.f23085b.I().d(), this.f23085b.t());
        }
        return this.f23091h;
    }

    public J0.n p() {
        if (this.f23092i == null) {
            this.f23092i = this.f23085b.e().a(this.f23085b.j());
        }
        return this.f23092i;
    }

    public v1.b q() {
        if (this.f23101r == null) {
            this.f23101r = v1.c.a(this.f23085b.b(), r(), f());
        }
        return this.f23101r;
    }

    public H1.f r() {
        if (this.f23102s == null) {
            this.f23102s = H1.g.a(this.f23085b.b(), this.f23085b.G().E(), this.f23085b.G().r(), this.f23085b.G().n());
        }
        return this.f23102s;
    }

    public J0.n v() {
        if (this.f23098o == null) {
            this.f23098o = this.f23085b.e().a(this.f23085b.s());
        }
        return this.f23098o;
    }
}
