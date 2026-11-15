package T5;

import T5.B;
import T5.D;
import T5.t;
import W5.d;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ImagesContract;
import d6.j;
import i6.i;
import j5.AbstractC1794M;
import j5.AbstractC1809n;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t5.AbstractC2070a;

/* JADX INFO: renamed from: T5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0457c implements Closeable, Flushable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f3368s = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final W5.d f3369m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f3370n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f3371o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f3372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f3373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f3374r;

    /* JADX INFO: renamed from: T5.c$a */
    private static final class a extends E {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final i6.h f3375n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final d.C0096d f3376o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final String f3377p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final String f3378q;

        /* JADX INFO: renamed from: T5.c$a$a, reason: collision with other inner class name */
        public static final class C0078a extends i6.l {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ i6.C f3380o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0078a(i6.C c7, i6.C c8) {
                super(c8);
                this.f3380o = c7;
            }

            @Override // i6.l, i6.C, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                a.this.n().close();
                super.close();
            }
        }

        public a(d.C0096d c0096d, String str, String str2) {
            w5.k.f(c0096d, "snapshot");
            this.f3376o = c0096d;
            this.f3377p = str;
            this.f3378q = str2;
            i6.C cB = c0096d.b(1);
            this.f3375n = i6.q.d(new C0078a(cB, cB));
        }

        @Override // T5.E
        public long e() {
            String str = this.f3378q;
            if (str != null) {
                return U5.c.T(str, -1L);
            }
            return -1L;
        }

        @Override // T5.E
        public x f() {
            String str = this.f3377p;
            if (str != null) {
                return x.f3645g.b(str);
            }
            return null;
        }

        @Override // T5.E
        public i6.h j() {
            return this.f3375n;
        }

        public final d.C0096d n() {
            return this.f3376o;
        }
    }

    /* JADX INFO: renamed from: T5.c$b */
    public static final class b {
        private b() {
        }

        private final Set d(t tVar) {
            int size = tVar.size();
            TreeSet treeSet = null;
            for (int i7 = 0; i7 < size; i7++) {
                if (F5.g.p("Vary", tVar.h(i7), true)) {
                    String strM = tVar.m(i7);
                    if (treeSet == null) {
                        treeSet = new TreeSet(F5.g.q(w5.y.f22743a));
                    }
                    for (String str : F5.g.p0(strM, new char[]{','}, false, 0, 6, null)) {
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        treeSet.add(F5.g.C0(str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : AbstractC1794M.d();
        }

        private final t e(t tVar, t tVar2) {
            Set setD = d(tVar2);
            if (setD.isEmpty()) {
                return U5.c.f3984b;
            }
            t.a aVar = new t.a();
            int size = tVar.size();
            for (int i7 = 0; i7 < size; i7++) {
                String strH = tVar.h(i7);
                if (setD.contains(strH)) {
                    aVar.a(strH, tVar.m(i7));
                }
            }
            return aVar.e();
        }

        public final boolean a(D d7) {
            w5.k.f(d7, "$this$hasVaryAll");
            return d(d7.w()).contains("*");
        }

        public final String b(u uVar) {
            w5.k.f(uVar, ImagesContract.URL);
            return i6.i.f20019q.d(uVar.toString()).u().r();
        }

        public final int c(i6.h hVar) throws IOException {
            w5.k.f(hVar, "source");
            try {
                long jY = hVar.Y();
                String strC0 = hVar.C0();
                if (jY >= 0 && jY <= Api.BaseClientBuilder.API_PRIORITY_OTHER && strC0.length() <= 0) {
                    return (int) jY;
                }
                throw new IOException("expected an int but was \"" + jY + strC0 + '\"');
            } catch (NumberFormatException e7) {
                throw new IOException(e7.getMessage());
            }
        }

        public final t f(D d7) {
            w5.k.f(d7, "$this$varyHeaders");
            D dJ = d7.J();
            w5.k.c(dJ);
            return e(dJ.j0().e(), d7.w());
        }

        public final boolean g(D d7, t tVar, B b7) {
            w5.k.f(d7, "cachedResponse");
            w5.k.f(tVar, "cachedRequest");
            w5.k.f(b7, "newRequest");
            Set<String> setD = d(d7.w());
            if ((setD instanceof Collection) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!w5.k.b(tVar.n(str), b7.f(str))) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: T5.c$c, reason: collision with other inner class name */
    private static final class C0079c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f3381k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f3382l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f3383m = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f3384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f3385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f3386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final A f3387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f3388e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f3389f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final t f3390g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final s f3391h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f3392i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f3393j;

        /* JADX INFO: renamed from: T5.c$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            j.a aVar = d6.j.f18715c;
            sb.append(aVar.g().g());
            sb.append("-Sent-Millis");
            f3381k = sb.toString();
            f3382l = aVar.g().g() + "-Received-Millis";
        }

        public C0079c(D d7) {
            w5.k.f(d7, "response");
            this.f3384a = d7.j0().l().toString();
            this.f3385b = C0457c.f3368s.f(d7);
            this.f3386c = d7.j0().h();
            this.f3387d = d7.a0();
            this.f3388e = d7.f();
            this.f3389f = d7.B();
            this.f3390g = d7.w();
            this.f3391h = d7.j();
            this.f3392i = d7.n0();
            this.f3393j = d7.h0();
        }

        private final boolean a() {
            return F5.g.B(this.f3384a, "https://", false, 2, null);
        }

        private final List c(i6.h hVar) throws IOException {
            int iC = C0457c.f3368s.c(hVar);
            if (iC == -1) {
                return AbstractC1809n.i();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i7 = 0; i7 < iC; i7++) {
                    String strC0 = hVar.C0();
                    i6.f fVar = new i6.f();
                    i6.i iVarA = i6.i.f20019q.a(strC0);
                    w5.k.c(iVarA);
                    fVar.H(iVarA);
                    arrayList.add(certificateFactory.generateCertificate(fVar.e1()));
                }
                return arrayList;
            } catch (CertificateException e7) {
                throw new IOException(e7.getMessage());
            }
        }

        private final void e(i6.g gVar, List list) throws IOException {
            try {
                gVar.X0(list.size()).P(10);
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    byte[] encoded = ((Certificate) list.get(i7)).getEncoded();
                    i.a aVar = i6.i.f20019q;
                    w5.k.e(encoded, "bytes");
                    gVar.k0(i.a.g(aVar, encoded, 0, 0, 3, null).e()).P(10);
                }
            } catch (CertificateEncodingException e7) {
                throw new IOException(e7.getMessage());
            }
        }

        public final boolean b(B b7, D d7) {
            w5.k.f(b7, "request");
            w5.k.f(d7, "response");
            return w5.k.b(this.f3384a, b7.l().toString()) && w5.k.b(this.f3386c, b7.h()) && C0457c.f3368s.g(d7, this.f3385b, b7);
        }

        public final D d(d.C0096d c0096d) {
            w5.k.f(c0096d, "snapshot");
            String strF = this.f3390g.f("Content-Type");
            String strF2 = this.f3390g.f("Content-Length");
            return new D.a().r(new B.a().m(this.f3384a).g(this.f3386c, null).f(this.f3385b).b()).p(this.f3387d).g(this.f3388e).m(this.f3389f).k(this.f3390g).b(new a(c0096d, strF, strF2)).i(this.f3391h).s(this.f3392i).q(this.f3393j).c();
        }

        public final void f(d.b bVar) throws IOException {
            w5.k.f(bVar, "editor");
            i6.g gVarC = i6.q.c(bVar.f(0));
            try {
                gVarC.k0(this.f3384a).P(10);
                gVarC.k0(this.f3386c).P(10);
                gVarC.X0(this.f3385b.size()).P(10);
                int size = this.f3385b.size();
                for (int i7 = 0; i7 < size; i7++) {
                    gVarC.k0(this.f3385b.h(i7)).k0(": ").k0(this.f3385b.m(i7)).P(10);
                }
                gVarC.k0(new Z5.k(this.f3387d, this.f3388e, this.f3389f).toString()).P(10);
                gVarC.X0(this.f3390g.size() + 2).P(10);
                int size2 = this.f3390g.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    gVarC.k0(this.f3390g.h(i8)).k0(": ").k0(this.f3390g.m(i8)).P(10);
                }
                gVarC.k0(f3381k).k0(": ").X0(this.f3392i).P(10);
                gVarC.k0(f3382l).k0(": ").X0(this.f3393j).P(10);
                if (a()) {
                    gVarC.P(10);
                    s sVar = this.f3391h;
                    w5.k.c(sVar);
                    gVarC.k0(sVar.a().c()).P(10);
                    e(gVarC, this.f3391h.d());
                    e(gVarC, this.f3391h.c());
                    gVarC.k0(this.f3391h.e().e()).P(10);
                }
                i5.u uVar = i5.u.f19985a;
                AbstractC2070a.a(gVarC, null);
            } finally {
            }
        }

        public C0079c(i6.C c7) {
            w5.k.f(c7, "rawSource");
            try {
                i6.h hVarD = i6.q.d(c7);
                this.f3384a = hVarD.C0();
                this.f3386c = hVarD.C0();
                t.a aVar = new t.a();
                int iC = C0457c.f3368s.c(hVarD);
                for (int i7 = 0; i7 < iC; i7++) {
                    aVar.b(hVarD.C0());
                }
                this.f3385b = aVar.e();
                Z5.k kVarA = Z5.k.f4663d.a(hVarD.C0());
                this.f3387d = kVarA.f4664a;
                this.f3388e = kVarA.f4665b;
                this.f3389f = kVarA.f4666c;
                t.a aVar2 = new t.a();
                int iC2 = C0457c.f3368s.c(hVarD);
                for (int i8 = 0; i8 < iC2; i8++) {
                    aVar2.b(hVarD.C0());
                }
                String str = f3381k;
                String strF = aVar2.f(str);
                String str2 = f3382l;
                String strF2 = aVar2.f(str2);
                aVar2.h(str);
                aVar2.h(str2);
                this.f3392i = strF != null ? Long.parseLong(strF) : 0L;
                this.f3393j = strF2 != null ? Long.parseLong(strF2) : 0L;
                this.f3390g = aVar2.e();
                if (a()) {
                    String strC0 = hVarD.C0();
                    if (strC0.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strC0 + '\"');
                    }
                    this.f3391h = s.f3610e.a(!hVarD.O() ? G.f3352t.a(hVarD.C0()) : G.SSL_3_0, C0463i.f3541s1.b(hVarD.C0()), c(hVarD), c(hVarD));
                } else {
                    this.f3391h = null;
                }
                c7.close();
            } catch (Throwable th) {
                c7.close();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: T5.c$d */
    private final class d implements W5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i6.A f3394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i6.A f3395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f3396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d.b f3397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ C0457c f3398e;

        /* JADX INFO: renamed from: T5.c$d$a */
        public static final class a extends i6.k {
            a(i6.A a7) {
                super(a7);
            }

            @Override // i6.k, i6.A, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (d.this.f3398e) {
                    if (d.this.d()) {
                        return;
                    }
                    d.this.e(true);
                    C0457c c0457c = d.this.f3398e;
                    c0457c.l(c0457c.e() + 1);
                    super.close();
                    d.this.f3397d.b();
                }
            }
        }

        public d(C0457c c0457c, d.b bVar) {
            w5.k.f(bVar, "editor");
            this.f3398e = c0457c;
            this.f3397d = bVar;
            i6.A aF = bVar.f(1);
            this.f3394a = aF;
            this.f3395b = new a(aF);
        }

        @Override // W5.b
        public void a() {
            synchronized (this.f3398e) {
                if (this.f3396c) {
                    return;
                }
                this.f3396c = true;
                C0457c c0457c = this.f3398e;
                c0457c.j(c0457c.d() + 1);
                U5.c.j(this.f3394a);
                try {
                    this.f3397d.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // W5.b
        public i6.A b() {
            return this.f3395b;
        }

        public final boolean d() {
            return this.f3396c;
        }

        public final void e(boolean z6) {
            this.f3396c = z6;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0457c(File file, long j7) {
        this(file, j7, c6.a.f10120a);
        w5.k.f(file, "directory");
    }

    private final void a(d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public final D b(B b7) {
        w5.k.f(b7, "request");
        try {
            d.C0096d c0096dJ = this.f3369m.J(f3368s.b(b7.l()));
            if (c0096dJ != null) {
                try {
                    C0079c c0079c = new C0079c(c0096dJ.b(0));
                    D d7 = c0079c.d(c0096dJ);
                    if (c0079c.b(b7, d7)) {
                        return d7;
                    }
                    E eA = d7.a();
                    if (eA != null) {
                        U5.c.j(eA);
                    }
                    return null;
                } catch (IOException unused) {
                    U5.c.j(c0096dJ);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3369m.close();
    }

    public final int d() {
        return this.f3371o;
    }

    public final int e() {
        return this.f3370n;
    }

    public final W5.b f(D d7) {
        d.b bVarB;
        w5.k.f(d7, "response");
        String strH = d7.j0().h();
        if (Z5.f.f4647a.a(d7.j0().h())) {
            try {
                g(d7.j0());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!w5.k.b(strH, "GET")) {
            return null;
        }
        b bVar = f3368s;
        if (bVar.a(d7)) {
            return null;
        }
        C0079c c0079c = new C0079c(d7);
        try {
            bVarB = W5.d.B(this.f3369m, bVar.b(d7.j0().l()), 0L, 2, null);
            if (bVarB == null) {
                return null;
            }
            try {
                c0079c.f(bVarB);
                return new d(this, bVarB);
            } catch (IOException unused2) {
                a(bVarB);
                return null;
            }
        } catch (IOException unused3) {
            bVarB = null;
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f3369m.flush();
    }

    public final void g(B b7) {
        w5.k.f(b7, "request");
        this.f3369m.S0(f3368s.b(b7.l()));
    }

    public final void j(int i7) {
        this.f3371o = i7;
    }

    public final void l(int i7) {
        this.f3370n = i7;
    }

    public final synchronized void n() {
        this.f3373q++;
    }

    public final synchronized void o(W5.c cVar) {
        try {
            w5.k.f(cVar, "cacheStrategy");
            this.f3374r++;
            if (cVar.b() != null) {
                this.f3372p++;
            } else if (cVar.a() != null) {
                this.f3373q++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void w(D d7, D d8) {
        d.b bVarA;
        w5.k.f(d7, "cached");
        w5.k.f(d8, "network");
        C0079c c0079c = new C0079c(d8);
        E eA = d7.a();
        if (eA == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        try {
            bVarA = ((a) eA).n().a();
            if (bVarA != null) {
                try {
                    c0079c.f(bVarA);
                    bVarA.b();
                } catch (IOException unused) {
                    a(bVarA);
                }
            }
        } catch (IOException unused2) {
            bVarA = null;
        }
    }

    public C0457c(File file, long j7, c6.a aVar) {
        w5.k.f(file, "directory");
        w5.k.f(aVar, "fileSystem");
        this.f3369m = new W5.d(aVar, file, 201105, 2, j7, X5.e.f4367h);
    }
}
