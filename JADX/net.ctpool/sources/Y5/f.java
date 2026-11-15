package Y5;

import T5.A;
import T5.B;
import T5.C0455a;
import T5.C0461g;
import T5.D;
import T5.F;
import T5.InterfaceC0459e;
import T5.r;
import T5.s;
import T5.u;
import T5.z;
import b6.f;
import b6.m;
import b6.n;
import h6.d;
import i6.q;
import j5.AbstractC1809n;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.InterfaceC2171a;
import w5.l;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends f.d implements T5.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f4559t = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Socket f4560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Socket f4561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s f4562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private A f4563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b6.f f4564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i6.h f4565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i6.g f4566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4567j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f4568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f4569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f4570m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f4571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f4572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f4573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f4574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final h f4575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final F f4576s;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class b extends l implements InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C0461g f4577m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ s f4578n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ C0455a f4579o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0461g c0461g, s sVar, C0455a c0455a) {
            super(0);
            this.f4577m = c0461g;
            this.f4578n = sVar;
            this.f4579o = c0455a;
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            g6.c cVarD = this.f4577m.d();
            w5.k.c(cVarD);
            return cVarD.a(this.f4578n.d(), this.f4579o.l().h());
        }
    }

    static final class c extends l implements InterfaceC2171a {
        c() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            s sVar = f.this.f4562e;
            w5.k.c(sVar);
            List<Certificate> listD = sVar.d();
            ArrayList arrayList = new ArrayList(AbstractC1809n.q(listD, 10));
            for (Certificate certificate : listD) {
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public static final class d extends d.AbstractC0265d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Y5.c f4581p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ i6.h f4582q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ i6.g f4583r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Y5.c cVar, i6.h hVar, i6.g gVar, boolean z6, i6.h hVar2, i6.g gVar2) {
            super(z6, hVar2, gVar2);
            this.f4581p = cVar;
            this.f4582q = hVar;
            this.f4583r = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f4581p.a(-1L, true, true, null);
        }
    }

    public f(h hVar, F f7) {
        w5.k.f(hVar, "connectionPool");
        w5.k.f(f7, "route");
        this.f4575r = hVar;
        this.f4576s = f7;
        this.f4572o = 1;
        this.f4573p = new ArrayList();
        this.f4574q = Long.MAX_VALUE;
    }

    private final boolean B(List list) {
        List<F> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (F f7 : list2) {
            Proxy.Type type = f7.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f4576s.b().type() == type2 && w5.k.b(this.f4576s.d(), f7.d())) {
                return true;
            }
        }
        return false;
    }

    private final void F(int i7) throws SocketException {
        Socket socket = this.f4561d;
        w5.k.c(socket);
        i6.h hVar = this.f4565h;
        w5.k.c(hVar);
        i6.g gVar = this.f4566i;
        w5.k.c(gVar);
        socket.setSoTimeout(0);
        b6.f fVarA = new f.b(true, X5.e.f4367h).m(socket, this.f4576s.a().l().h(), hVar, gVar).k(this).l(i7).a();
        this.f4564g = fVarA;
        this.f4572o = b6.f.f9782P.a().d();
        b6.f.y1(fVarA, false, null, 3, null);
    }

    private final boolean G(u uVar) {
        s sVar;
        if (U5.c.f3990h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            w5.k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        u uVarL = this.f4576s.a().l();
        if (uVar.l() != uVarL.l()) {
            return false;
        }
        if (w5.k.b(uVar.h(), uVarL.h())) {
            return true;
        }
        if (this.f4568k || (sVar = this.f4562e) == null) {
            return false;
        }
        w5.k.c(sVar);
        return e(uVar, sVar);
    }

    private final boolean e(u uVar, s sVar) {
        List listD = sVar.d();
        if (!listD.isEmpty()) {
            g6.d dVar = g6.d.f19558a;
            String strH = uVar.h();
            Object obj = listD.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            if (dVar.e(strH, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    private final void h(int i7, int i8, InterfaceC0459e interfaceC0459e, r rVar) throws IOException {
        Socket socket;
        int i9;
        Proxy proxyB = this.f4576s.b();
        C0455a c0455aA = this.f4576s.a();
        Proxy.Type type = proxyB.type();
        if (type != null && ((i9 = g.f4584a[type.ordinal()]) == 1 || i9 == 2)) {
            socket = c0455aA.j().createSocket();
            w5.k.c(socket);
        } else {
            socket = new Socket(proxyB);
        }
        this.f4560c = socket;
        rVar.j(interfaceC0459e, this.f4576s.d(), proxyB);
        socket.setSoTimeout(i8);
        try {
            d6.j.f18715c.g().f(socket, this.f4576s.d(), i7);
            try {
                this.f4565h = q.d(q.m(socket));
                this.f4566i = q.c(q.i(socket));
            } catch (NullPointerException e7) {
                if (w5.k.b(e7.getMessage(), "throw with null exception")) {
                    throw new IOException(e7);
                }
            }
        } catch (ConnectException e8) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f4576s.d());
            connectException.initCause(e8);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void i(Y5.b bVar) throws Throwable {
        C0455a c0455aA = this.f4576s.a();
        SSLSocketFactory sSLSocketFactoryK = c0455aA.k();
        SSLSocket sSLSocket = null;
        try {
            w5.k.c(sSLSocketFactoryK);
            Socket socketCreateSocket = sSLSocketFactoryK.createSocket(this.f4560c, c0455aA.l().h(), c0455aA.l().l(), true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                T5.l lVarA = bVar.a(sSLSocket2);
                if (lVarA.h()) {
                    d6.j.f18715c.g().e(sSLSocket2, c0455aA.l().h(), c0455aA.f());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                s.a aVar = s.f3610e;
                w5.k.e(session, "sslSocketSession");
                s sVarB = aVar.b(session);
                HostnameVerifier hostnameVerifierE = c0455aA.e();
                w5.k.c(hostnameVerifierE);
                if (hostnameVerifierE.verify(c0455aA.l().h(), session)) {
                    C0461g c0461gA = c0455aA.a();
                    w5.k.c(c0461gA);
                    this.f4562e = new s(sVarB.e(), sVarB.a(), sVarB.c(), new b(c0461gA, sVarB, c0455aA));
                    c0461gA.b(c0455aA.l().h(), new c());
                    String strH = lVarA.h() ? d6.j.f18715c.g().h(sSLSocket2) : null;
                    this.f4561d = sSLSocket2;
                    this.f4565h = q.d(q.m(sSLSocket2));
                    this.f4566i = q.c(q.i(sSLSocket2));
                    this.f4563f = strH != null ? A.f3292u.a(strH) : A.HTTP_1_1;
                    d6.j.f18715c.g().b(sSLSocket2);
                    return;
                }
                List listD = sVarB.d();
                if (!(!listD.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0455aA.l().h() + " not verified (no certificates)");
                }
                Object obj = listD.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder();
                sb.append("\n              |Hostname ");
                sb.append(c0455aA.l().h());
                sb.append(" not verified:\n              |    certificate: ");
                sb.append(C0461g.f3425d.a(x509Certificate));
                sb.append("\n              |    DN: ");
                Principal subjectDN = x509Certificate.getSubjectDN();
                w5.k.e(subjectDN, "cert.subjectDN");
                sb.append(subjectDN.getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(g6.d.f19558a.a(x509Certificate));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(F5.g.h(sb.toString(), null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    d6.j.f18715c.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    U5.c.k(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void j(int i7, int i8, int i9, InterfaceC0459e interfaceC0459e, r rVar) throws IOException {
        B bL = l();
        u uVarL = bL.l();
        for (int i10 = 0; i10 < 21; i10++) {
            h(i7, i8, interfaceC0459e, rVar);
            bL = k(i8, i9, bL, uVarL);
            if (bL == null) {
                return;
            }
            Socket socket = this.f4560c;
            if (socket != null) {
                U5.c.k(socket);
            }
            this.f4560c = null;
            this.f4566i = null;
            this.f4565h = null;
            rVar.h(interfaceC0459e, this.f4576s.d(), this.f4576s.b(), null);
        }
    }

    private final B k(int i7, int i8, B b7, u uVar) throws IOException {
        String str = "CONNECT " + U5.c.P(uVar, true) + " HTTP/1.1";
        while (true) {
            i6.h hVar = this.f4565h;
            w5.k.c(hVar);
            i6.g gVar = this.f4566i;
            w5.k.c(gVar);
            a6.b bVar = new a6.b(null, this, hVar, gVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            hVar.i().g(i7, timeUnit);
            gVar.i().g(i8, timeUnit);
            bVar.A(b7.e(), str);
            bVar.a();
            D.a aVarD = bVar.d(false);
            w5.k.c(aVarD);
            D dC = aVarD.r(b7).c();
            bVar.z(dC);
            int iF = dC.f();
            if (iF == 200) {
                if (hVar.h().O() && gVar.h().O()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iF != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + dC.f());
            }
            B bA = this.f4576s.a().h().a(this.f4576s, dC);
            if (bA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (F5.g.p("close", D.o(dC, "Connection", null, 2, null), true)) {
                return bA;
            }
            b7 = bA;
        }
    }

    private final B l() {
        B b7 = new B.a().l(this.f4576s.a().l()).g("CONNECT", null).e("Host", U5.c.P(this.f4576s.a().l(), true)).e("Proxy-Connection", "Keep-Alive").e("User-Agent", "okhttp/4.9.2").b();
        B bA = this.f4576s.a().h().a(this.f4576s, new D.a().r(b7).p(A.HTTP_1_1).g(407).m("Preemptive Authenticate").b(U5.c.f3985c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return bA != null ? bA : b7;
    }

    private final void m(Y5.b bVar, int i7, InterfaceC0459e interfaceC0459e, r rVar) throws Throwable {
        if (this.f4576s.a().k() != null) {
            rVar.C(interfaceC0459e);
            i(bVar);
            rVar.B(interfaceC0459e, this.f4562e);
            if (this.f4563f == A.HTTP_2) {
                F(i7);
                return;
            }
            return;
        }
        List listF = this.f4576s.a().f();
        A a7 = A.H2_PRIOR_KNOWLEDGE;
        if (!listF.contains(a7)) {
            this.f4561d = this.f4560c;
            this.f4563f = A.HTTP_1_1;
        } else {
            this.f4561d = this.f4560c;
            this.f4563f = a7;
            F(i7);
        }
    }

    public F A() {
        return this.f4576s;
    }

    public final void C(long j7) {
        this.f4574q = j7;
    }

    public final void D(boolean z6) {
        this.f4567j = z6;
    }

    public Socket E() {
        Socket socket = this.f4561d;
        w5.k.c(socket);
        return socket;
    }

    public final synchronized void H(e eVar, IOException iOException) {
        int i7;
        try {
            w5.k.f(eVar, "call");
            if (iOException instanceof n) {
                if (((n) iOException).f9958m == b6.b.REFUSED_STREAM) {
                    int i8 = this.f4571n + 1;
                    this.f4571n = i8;
                    if (i8 > 1) {
                        this.f4567j = true;
                        i7 = this.f4569l;
                        this.f4569l = i7 + 1;
                    }
                } else if (((n) iOException).f9958m != b6.b.CANCEL || !eVar.n0()) {
                    this.f4567j = true;
                    i7 = this.f4569l;
                    this.f4569l = i7 + 1;
                }
            } else if (!v() || (iOException instanceof b6.a)) {
                this.f4567j = true;
                if (this.f4570m == 0) {
                    if (iOException != null) {
                        g(eVar.k(), this.f4576s, iOException);
                    }
                    i7 = this.f4569l;
                    this.f4569l = i7 + 1;
                }
            }
        } finally {
        }
    }

    @Override // b6.f.d
    public synchronized void a(b6.f fVar, m mVar) {
        w5.k.f(fVar, "connection");
        w5.k.f(mVar, "settings");
        this.f4572o = mVar.d();
    }

    @Override // b6.f.d
    public void b(b6.i iVar) {
        w5.k.f(iVar, "stream");
        iVar.d(b6.b.REFUSED_STREAM, null);
    }

    public final void d() {
        Socket socket = this.f4560c;
        if (socket != null) {
            U5.c.k(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i7, int i8, int i9, int i10, boolean z6, InterfaceC0459e interfaceC0459e, r rVar) throws Throwable {
        Socket socket;
        Socket socket2;
        w5.k.f(interfaceC0459e, "call");
        w5.k.f(rVar, "eventListener");
        if (!(this.f4563f == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        List listB = this.f4576s.a().b();
        Y5.b bVar = new Y5.b(listB);
        if (this.f4576s.a().k() == null) {
            if (!listB.contains(T5.l.f3563j)) {
                throw new j(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strH = this.f4576s.a().l().h();
            if (!d6.j.f18715c.g().j(strH)) {
                throw new j(new UnknownServiceException("CLEARTEXT communication to " + strH + " not permitted by network security policy"));
            }
        } else if (this.f4576s.a().f().contains(A.H2_PRIOR_KNOWLEDGE)) {
            throw new j(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        j jVar = null;
        do {
            try {
                try {
                    if (this.f4576s.c()) {
                        j(i7, i8, i9, interfaceC0459e, rVar);
                        if (this.f4560c == null) {
                            if (!this.f4576s.c() && this.f4560c == null) {
                                throw new j(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            this.f4574q = System.nanoTime();
                            return;
                        }
                    } else {
                        try {
                            h(i7, i8, interfaceC0459e, rVar);
                        } catch (IOException e7) {
                            e = e7;
                            socket = this.f4561d;
                            if (socket != null) {
                                U5.c.k(socket);
                            }
                            socket2 = this.f4560c;
                            if (socket2 != null) {
                                U5.c.k(socket2);
                            }
                            this.f4561d = null;
                            this.f4560c = null;
                            this.f4565h = null;
                            this.f4566i = null;
                            this.f4562e = null;
                            this.f4563f = null;
                            this.f4564g = null;
                            this.f4572o = 1;
                            rVar.i(interfaceC0459e, this.f4576s.d(), this.f4576s.b(), null, e);
                            if (jVar != null) {
                                jVar = new j(e);
                            } else {
                                jVar.a(e);
                            }
                            if (z6) {
                                throw jVar;
                            }
                        }
                    }
                    m(bVar, i10, interfaceC0459e, rVar);
                    rVar.h(interfaceC0459e, this.f4576s.d(), this.f4576s.b(), this.f4563f);
                    if (!this.f4576s.c()) {
                    }
                    this.f4574q = System.nanoTime();
                    return;
                } catch (IOException e8) {
                    e = e8;
                    socket = this.f4561d;
                    if (socket != null) {
                    }
                    socket2 = this.f4560c;
                    if (socket2 != null) {
                    }
                    this.f4561d = null;
                    this.f4560c = null;
                    this.f4565h = null;
                    this.f4566i = null;
                    this.f4562e = null;
                    this.f4563f = null;
                    this.f4564g = null;
                    this.f4572o = 1;
                    rVar.i(interfaceC0459e, this.f4576s.d(), this.f4576s.b(), null, e);
                    if (jVar != null) {
                    }
                    if (z6) {
                    }
                }
            } catch (IOException e9) {
                e = e9;
            }
        } while (bVar.b(e));
        throw jVar;
    }

    public final void g(z zVar, F f7, IOException iOException) {
        w5.k.f(zVar, "client");
        w5.k.f(f7, "failedRoute");
        w5.k.f(iOException, "failure");
        if (f7.b().type() != Proxy.Type.DIRECT) {
            C0455a c0455aA = f7.a();
            c0455aA.i().connectFailed(c0455aA.l().q(), f7.b().address(), iOException);
        }
        zVar.v().b(f7);
    }

    public final List n() {
        return this.f4573p;
    }

    public final long o() {
        return this.f4574q;
    }

    public final boolean p() {
        return this.f4567j;
    }

    public final int q() {
        return this.f4569l;
    }

    public s r() {
        return this.f4562e;
    }

    public final synchronized void s() {
        this.f4570m++;
    }

    public final boolean t(C0455a c0455a, List list) {
        w5.k.f(c0455a, "address");
        if (U5.c.f3990h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            w5.k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (this.f4573p.size() >= this.f4572o || this.f4567j || !this.f4576s.a().d(c0455a)) {
            return false;
        }
        if (w5.k.b(c0455a.l().h(), A().a().l().h())) {
            return true;
        }
        if (this.f4564g == null || list == null || !B(list) || c0455a.e() != g6.d.f19558a || !G(c0455a.l())) {
            return false;
        }
        try {
            C0461g c0461gA = c0455a.a();
            w5.k.c(c0461gA);
            String strH = c0455a.l().h();
            s sVarR = r();
            w5.k.c(sVarR);
            c0461gA.a(strH, sVarR.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        Object objA;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f4576s.a().l().h());
        sb.append(':');
        sb.append(this.f4576s.a().l().l());
        sb.append(',');
        sb.append(" proxy=");
        sb.append(this.f4576s.b());
        sb.append(" hostAddress=");
        sb.append(this.f4576s.d());
        sb.append(" cipherSuite=");
        s sVar = this.f4562e;
        if (sVar == null || (objA = sVar.a()) == null) {
            objA = "none";
        }
        sb.append(objA);
        sb.append(" protocol=");
        sb.append(this.f4563f);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u(boolean z6) {
        long j7;
        if (U5.c.f3990h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            w5.k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f4560c;
        w5.k.c(socket);
        Socket socket2 = this.f4561d;
        w5.k.c(socket2);
        i6.h hVar = this.f4565h;
        w5.k.c(hVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        b6.f fVar = this.f4564g;
        if (fVar != null) {
            return fVar.k1(jNanoTime);
        }
        synchronized (this) {
            j7 = jNanoTime - this.f4574q;
        }
        if (j7 < 10000000000L || !z6) {
            return true;
        }
        return U5.c.D(socket2, hVar);
    }

    public final boolean v() {
        return this.f4564g != null;
    }

    public final Z5.d w(z zVar, Z5.g gVar) throws SocketException {
        w5.k.f(zVar, "client");
        w5.k.f(gVar, "chain");
        Socket socket = this.f4561d;
        w5.k.c(socket);
        i6.h hVar = this.f4565h;
        w5.k.c(hVar);
        i6.g gVar2 = this.f4566i;
        w5.k.c(gVar2);
        b6.f fVar = this.f4564g;
        if (fVar != null) {
            return new b6.g(zVar, this, gVar, fVar);
        }
        socket.setSoTimeout(gVar.j());
        i6.D dI = hVar.i();
        long jG = gVar.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dI.g(jG, timeUnit);
        gVar2.i().g(gVar.i(), timeUnit);
        return new a6.b(zVar, this, hVar, gVar2);
    }

    public final d.AbstractC0265d x(Y5.c cVar) throws SocketException {
        w5.k.f(cVar, "exchange");
        Socket socket = this.f4561d;
        w5.k.c(socket);
        i6.h hVar = this.f4565h;
        w5.k.c(hVar);
        i6.g gVar = this.f4566i;
        w5.k.c(gVar);
        socket.setSoTimeout(0);
        z();
        return new d(cVar, hVar, gVar, true, hVar, gVar);
    }

    public final synchronized void y() {
        this.f4568k = true;
    }

    public final synchronized void z() {
        this.f4567j = true;
    }
}
