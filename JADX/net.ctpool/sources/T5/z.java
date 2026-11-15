package T5;

import T5.InterfaceC0459e;
import T5.r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import d6.j;
import g6.c;
import j5.AbstractC1809n;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public class z implements Cloneable, InterfaceC0459e.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final InterfaceC0456b f3673A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final SocketFactory f3674B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final SSLSocketFactory f3675C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final X509TrustManager f3676D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final List f3677E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final List f3678F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final HostnameVerifier f3679G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final C0461g f3680H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final g6.c f3681I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final int f3682J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final int f3683K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final int f3684L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f3685M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final int f3686N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f3687O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final Y5.i f3688P;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p f3689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k f3690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f3691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f3692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final r.c f3693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f3694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC0456b f3695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f3696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f3697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final n f3698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final C0457c f3699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final q f3700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Proxy f3701y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ProxySelector f3702z;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final b f3672S = new b(null);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final List f3670Q = U5.c.t(A.HTTP_2, A.HTTP_1_1);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final List f3671R = U5.c.t(l.f3561h, l.f3563j);

    public static final class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private int f3703A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private int f3704B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private long f3705C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private Y5.i f3706D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f3707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private k f3708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f3709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f3710d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r.c f3711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f3712f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private InterfaceC0456b f3713g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f3714h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f3715i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private n f3716j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private C0457c f3717k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private q f3718l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Proxy f3719m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ProxySelector f3720n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private InterfaceC0456b f3721o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private SocketFactory f3722p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private SSLSocketFactory f3723q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private X509TrustManager f3724r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List f3725s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f3726t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private HostnameVerifier f3727u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private C0461g f3728v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private g6.c f3729w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f3730x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f3731y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f3732z;

        public a() {
            this.f3707a = new p();
            this.f3708b = new k();
            this.f3709c = new ArrayList();
            this.f3710d = new ArrayList();
            this.f3711e = U5.c.e(r.f3608a);
            this.f3712f = true;
            InterfaceC0456b interfaceC0456b = InterfaceC0456b.f3365a;
            this.f3713g = interfaceC0456b;
            this.f3714h = true;
            this.f3715i = true;
            this.f3716j = n.f3596a;
            this.f3718l = q.f3606a;
            this.f3721o = interfaceC0456b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            w5.k.e(socketFactory, "SocketFactory.getDefault()");
            this.f3722p = socketFactory;
            b bVar = z.f3672S;
            this.f3725s = bVar.a();
            this.f3726t = bVar.b();
            this.f3727u = g6.d.f19558a;
            this.f3728v = C0461g.f3424c;
            this.f3731y = 10000;
            this.f3732z = 10000;
            this.f3703A = 10000;
            this.f3705C = 1024L;
        }

        public final List A() {
            return this.f3726t;
        }

        public final Proxy B() {
            return this.f3719m;
        }

        public final InterfaceC0456b C() {
            return this.f3721o;
        }

        public final ProxySelector D() {
            return this.f3720n;
        }

        public final int E() {
            return this.f3732z;
        }

        public final boolean F() {
            return this.f3712f;
        }

        public final Y5.i G() {
            return this.f3706D;
        }

        public final SocketFactory H() {
            return this.f3722p;
        }

        public final SSLSocketFactory I() {
            return this.f3723q;
        }

        public final int J() {
            return this.f3703A;
        }

        public final X509TrustManager K() {
            return this.f3724r;
        }

        public final a L(List list) {
            w5.k.f(list, "protocols");
            List listD0 = AbstractC1809n.d0(list);
            A a7 = A.H2_PRIOR_KNOWLEDGE;
            if (!(listD0.contains(a7) || listD0.contains(A.HTTP_1_1))) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listD0).toString());
            }
            if (!(!listD0.contains(a7) || listD0.size() <= 1)) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listD0).toString());
            }
            if (!(!listD0.contains(A.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listD0).toString());
            }
            if (!(!listD0.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            listD0.remove(A.SPDY_3);
            if (!w5.k.b(listD0, this.f3726t)) {
                this.f3706D = null;
            }
            List listUnmodifiableList = Collections.unmodifiableList(listD0);
            w5.k.e(listUnmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
            this.f3726t = listUnmodifiableList;
            return this;
        }

        public final a M(long j7, TimeUnit timeUnit) {
            w5.k.f(timeUnit, "unit");
            this.f3732z = U5.c.h("timeout", j7, timeUnit);
            return this;
        }

        public final a N(long j7, TimeUnit timeUnit) {
            w5.k.f(timeUnit, "unit");
            this.f3703A = U5.c.h("timeout", j7, timeUnit);
            return this;
        }

        public final a a(v vVar) {
            w5.k.f(vVar, "interceptor");
            this.f3710d.add(vVar);
            return this;
        }

        public final z b() {
            return new z(this);
        }

        public final a c(C0457c c0457c) {
            this.f3717k = c0457c;
            return this;
        }

        public final a d(long j7, TimeUnit timeUnit) {
            w5.k.f(timeUnit, "unit");
            this.f3730x = U5.c.h("timeout", j7, timeUnit);
            return this;
        }

        public final a e(long j7, TimeUnit timeUnit) {
            w5.k.f(timeUnit, "unit");
            this.f3731y = U5.c.h("timeout", j7, timeUnit);
            return this;
        }

        public final a f(n nVar) {
            w5.k.f(nVar, "cookieJar");
            this.f3716j = nVar;
            return this;
        }

        public final a g(r rVar) {
            w5.k.f(rVar, "eventListener");
            this.f3711e = U5.c.e(rVar);
            return this;
        }

        public final InterfaceC0456b h() {
            return this.f3713g;
        }

        public final C0457c i() {
            return this.f3717k;
        }

        public final int j() {
            return this.f3730x;
        }

        public final g6.c k() {
            return this.f3729w;
        }

        public final C0461g l() {
            return this.f3728v;
        }

        public final int m() {
            return this.f3731y;
        }

        public final k n() {
            return this.f3708b;
        }

        public final List o() {
            return this.f3725s;
        }

        public final n p() {
            return this.f3716j;
        }

        public final p q() {
            return this.f3707a;
        }

        public final q r() {
            return this.f3718l;
        }

        public final r.c s() {
            return this.f3711e;
        }

        public final boolean t() {
            return this.f3714h;
        }

        public final boolean u() {
            return this.f3715i;
        }

        public final HostnameVerifier v() {
            return this.f3727u;
        }

        public final List w() {
            return this.f3709c;
        }

        public final long x() {
            return this.f3705C;
        }

        public final List y() {
            return this.f3710d;
        }

        public final int z() {
            return this.f3704B;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(z zVar) {
            this();
            w5.k.f(zVar, "okHttpClient");
            this.f3707a = zVar.q();
            this.f3708b = zVar.l();
            AbstractC1809n.t(this.f3709c, zVar.y());
            AbstractC1809n.t(this.f3710d, zVar.A());
            this.f3711e = zVar.s();
            this.f3712f = zVar.J();
            this.f3713g = zVar.e();
            this.f3714h = zVar.t();
            this.f3715i = zVar.u();
            this.f3716j = zVar.p();
            this.f3717k = zVar.g();
            this.f3718l = zVar.r();
            this.f3719m = zVar.F();
            this.f3720n = zVar.H();
            this.f3721o = zVar.G();
            this.f3722p = zVar.K();
            this.f3723q = zVar.f3675C;
            this.f3724r = zVar.O();
            this.f3725s = zVar.m();
            this.f3726t = zVar.E();
            this.f3727u = zVar.x();
            this.f3728v = zVar.j();
            this.f3729w = zVar.i();
            this.f3730x = zVar.h();
            this.f3731y = zVar.k();
            this.f3732z = zVar.I();
            this.f3703A = zVar.N();
            this.f3704B = zVar.D();
            this.f3705C = zVar.z();
            this.f3706D = zVar.v();
        }
    }

    public static final class b {
        private b() {
        }

        public final List a() {
            return z.f3671R;
        }

        public final List b() {
            return z.f3670Q;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public z() {
        this(new a());
    }

    private final void M() {
        if (this.f3691o == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + this.f3691o).toString());
        }
        if (this.f3692p == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + this.f3692p).toString());
        }
        List list = this.f3677E;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (this.f3675C == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (this.f3681I == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (this.f3676D == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (!(this.f3675C == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f3681I == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f3676D == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!w5.k.b(this.f3680H, C0461g.f3424c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final List A() {
        return this.f3692p;
    }

    public a B() {
        return new a(this);
    }

    public H C(B b7, I i7) {
        w5.k.f(b7, "request");
        w5.k.f(i7, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        h6.d dVar = new h6.d(X5.e.f4367h, b7, i7, new Random(), this.f3686N, null, this.f3687O);
        dVar.p(this);
        return dVar;
    }

    public final int D() {
        return this.f3686N;
    }

    public final List E() {
        return this.f3678F;
    }

    public final Proxy F() {
        return this.f3701y;
    }

    public final InterfaceC0456b G() {
        return this.f3673A;
    }

    public final ProxySelector H() {
        return this.f3702z;
    }

    public final int I() {
        return this.f3684L;
    }

    public final boolean J() {
        return this.f3694r;
    }

    public final SocketFactory K() {
        return this.f3674B;
    }

    public final SSLSocketFactory L() {
        SSLSocketFactory sSLSocketFactory = this.f3675C;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int N() {
        return this.f3685M;
    }

    public final X509TrustManager O() {
        return this.f3676D;
    }

    @Override // T5.InterfaceC0459e.a
    public InterfaceC0459e a(B b7) {
        w5.k.f(b7, "request");
        return new Y5.e(this, b7, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final InterfaceC0456b e() {
        return this.f3695s;
    }

    public final C0457c g() {
        return this.f3699w;
    }

    public final int h() {
        return this.f3682J;
    }

    public final g6.c i() {
        return this.f3681I;
    }

    public final C0461g j() {
        return this.f3680H;
    }

    public final int k() {
        return this.f3683K;
    }

    public final k l() {
        return this.f3690n;
    }

    public final List m() {
        return this.f3677E;
    }

    public final n p() {
        return this.f3698v;
    }

    public final p q() {
        return this.f3689m;
    }

    public final q r() {
        return this.f3700x;
    }

    public final r.c s() {
        return this.f3693q;
    }

    public final boolean t() {
        return this.f3696t;
    }

    public final boolean u() {
        return this.f3697u;
    }

    public final Y5.i v() {
        return this.f3688P;
    }

    public final HostnameVerifier x() {
        return this.f3679G;
    }

    public final List y() {
        return this.f3691o;
    }

    public final long z() {
        return this.f3687O;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z(a aVar) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorD;
        g6.c cVarA;
        C0461g c0461gE;
        w5.k.f(aVar, "builder");
        this.f3689m = aVar.q();
        this.f3690n = aVar.n();
        this.f3691o = U5.c.R(aVar.w());
        this.f3692p = U5.c.R(aVar.y());
        this.f3693q = aVar.s();
        this.f3694r = aVar.F();
        this.f3695s = aVar.h();
        this.f3696t = aVar.t();
        this.f3697u = aVar.u();
        this.f3698v = aVar.p();
        this.f3699w = aVar.i();
        this.f3700x = aVar.r();
        this.f3701y = aVar.B();
        if (aVar.B() == null) {
            proxySelectorD = aVar.D();
            proxySelectorD = proxySelectorD == null ? ProxySelector.getDefault() : proxySelectorD;
            proxySelectorD = proxySelectorD == null ? f6.a.f19309a : proxySelectorD;
        }
        this.f3702z = proxySelectorD;
        this.f3673A = aVar.C();
        this.f3674B = aVar.H();
        List listO = aVar.o();
        this.f3677E = listO;
        this.f3678F = aVar.A();
        this.f3679G = aVar.v();
        this.f3682J = aVar.j();
        this.f3683K = aVar.m();
        this.f3684L = aVar.E();
        this.f3685M = aVar.J();
        this.f3686N = aVar.z();
        this.f3687O = aVar.x();
        Y5.i iVarG = aVar.G();
        this.f3688P = iVarG == null ? new Y5.i() : iVarG;
        List list = listO;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.f3675C = null;
            this.f3681I = null;
            this.f3676D = null;
            c0461gE = C0461g.f3424c;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (aVar.I() != null) {
                        this.f3675C = aVar.I();
                        cVarA = aVar.k();
                        w5.k.c(cVarA);
                        this.f3681I = cVarA;
                        X509TrustManager x509TrustManagerK = aVar.K();
                        w5.k.c(x509TrustManagerK);
                        this.f3676D = x509TrustManagerK;
                    } else {
                        j.a aVar2 = d6.j.f18715c;
                        X509TrustManager x509TrustManagerP = aVar2.g().p();
                        this.f3676D = x509TrustManagerP;
                        d6.j jVarG = aVar2.g();
                        w5.k.c(x509TrustManagerP);
                        this.f3675C = jVarG.o(x509TrustManagerP);
                        c.a aVar3 = g6.c.f19557a;
                        w5.k.c(x509TrustManagerP);
                        cVarA = aVar3.a(x509TrustManagerP);
                        this.f3681I = cVarA;
                    }
                    C0461g c0461gL = aVar.l();
                    w5.k.c(cVarA);
                    c0461gE = c0461gL.e(cVarA);
                }
            }
            this.f3675C = null;
            this.f3681I = null;
            this.f3676D = null;
            c0461gE = C0461g.f3424c;
        }
        this.f3680H = c0461gE;
        M();
    }
}
