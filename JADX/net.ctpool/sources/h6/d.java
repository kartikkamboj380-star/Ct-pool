package h6;

import T5.A;
import T5.B;
import T5.D;
import T5.H;
import T5.I;
import T5.InterfaceC0459e;
import T5.InterfaceC0460f;
import T5.r;
import T5.z;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import h6.g;
import i5.u;
import i6.i;
import j5.AbstractC1809n;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;
import w5.t;
import w5.v;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements H, g.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final b f19827A = new b(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final List f19828z = AbstractC1809n.d(A.HTTP_1_1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0459e f19830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private X5.a f19831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h6.g f19832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h6.h f19833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private X5.d f19834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f19835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AbstractC0265d f19836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayDeque f19837i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque f19838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19839k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19840l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19841m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f19842n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19843o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f19845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f19846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f19847s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final B f19848t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final I f19849u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Random f19850v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f19851w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private h6.e f19852x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f19853y;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i f19855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f19856c;

        public a(int i7, i iVar, long j7) {
            this.f19854a = i7;
            this.f19855b = iVar;
            this.f19856c = j7;
        }

        public final long a() {
            return this.f19856c;
        }

        public final int b() {
            return this.f19854a;
        }

        public final i c() {
            return this.f19855b;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i f19858b;

        public c(int i7, i iVar) {
            k.f(iVar, "data");
            this.f19857a = i7;
            this.f19858b = iVar;
        }

        public final i a() {
            return this.f19858b;
        }

        public final int b() {
            return this.f19857a;
        }
    }

    /* JADX INFO: renamed from: h6.d$d, reason: collision with other inner class name */
    public static abstract class AbstractC0265d implements Closeable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f19859m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final i6.h f19860n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final i6.g f19861o;

        public AbstractC0265d(boolean z6, i6.h hVar, i6.g gVar) {
            k.f(hVar, "source");
            k.f(gVar, "sink");
            this.f19859m = z6;
            this.f19860n = hVar;
            this.f19861o = gVar;
        }

        public final boolean a() {
            return this.f19859m;
        }

        public final i6.g b() {
            return this.f19861o;
        }

        public final i6.h d() {
            return this.f19860n;
        }
    }

    private final class e extends X5.a {
        public e() {
            super(d.this.f19835g + " writer", false, 2, null);
        }

        @Override // X5.a
        public long f() {
            try {
                return d.this.x() ? 0L : -1L;
            } catch (IOException e7) {
                d.this.q(e7, null);
                return -1L;
            }
        }
    }

    public static final class f implements InterfaceC0460f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f19864b;

        f(B b7) {
            this.f19864b = b7;
        }

        @Override // T5.InterfaceC0460f
        public void a(InterfaceC0459e interfaceC0459e, D d7) {
            k.f(interfaceC0459e, "call");
            k.f(d7, "response");
            Y5.c cVarG = d7.g();
            try {
                d.this.n(d7, cVarG);
                k.c(cVarG);
                AbstractC0265d abstractC0265dM = cVarG.m();
                h6.e eVarA = h6.e.f19882g.a(d7.w());
                d.this.f19852x = eVarA;
                if (!d.this.t(eVarA)) {
                    synchronized (d.this) {
                        d.this.f19838j.clear();
                        d.this.f(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    d.this.s(U5.c.f3991i + " WebSocket " + this.f19864b.l().n(), abstractC0265dM);
                    d.this.r().f(d.this, d7);
                    d.this.u();
                } catch (Exception e7) {
                    d.this.q(e7, null);
                }
            } catch (IOException e8) {
                if (cVarG != null) {
                    cVarG.u();
                }
                d.this.q(e8, d7);
                U5.c.j(d7);
            }
        }

        @Override // T5.InterfaceC0460f
        public void b(InterfaceC0459e interfaceC0459e, IOException iOException) {
            k.f(interfaceC0459e, "call");
            k.f(iOException, "e");
            d.this.q(iOException, null);
        }
    }

    public static final class g extends X5.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f19865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f19866f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f19867g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f19868h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ AbstractC0265d f19869i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ h6.e f19870j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, long j7, d dVar, String str3, AbstractC0265d abstractC0265d, h6.e eVar) {
            super(str2, false, 2, null);
            this.f19865e = str;
            this.f19866f = j7;
            this.f19867g = dVar;
            this.f19868h = str3;
            this.f19869i = abstractC0265d;
            this.f19870j = eVar;
        }

        @Override // X5.a
        public long f() {
            this.f19867g.y();
            return this.f19866f;
        }
    }

    public static final class h extends X5.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f19871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f19872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f19873g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h6.h f19874h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ i f19875i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ v f19876j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ t f19877k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ v f19878l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ v f19879m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ v f19880n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ v f19881o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z6, String str2, boolean z7, d dVar, h6.h hVar, i iVar, v vVar, t tVar, v vVar2, v vVar3, v vVar4, v vVar5) {
            super(str2, z7);
            this.f19871e = str;
            this.f19872f = z6;
            this.f19873g = dVar;
            this.f19874h = hVar;
            this.f19875i = iVar;
            this.f19876j = vVar;
            this.f19877k = tVar;
            this.f19878l = vVar2;
            this.f19879m = vVar3;
            this.f19880n = vVar4;
            this.f19881o = vVar5;
        }

        @Override // X5.a
        public long f() {
            this.f19873g.m();
            return -1L;
        }
    }

    public d(X5.e eVar, B b7, I i7, Random random, long j7, h6.e eVar2, long j8) {
        k.f(eVar, "taskRunner");
        k.f(b7, "originalRequest");
        k.f(i7, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        k.f(random, "random");
        this.f19848t = b7;
        this.f19849u = i7;
        this.f19850v = random;
        this.f19851w = j7;
        this.f19852x = eVar2;
        this.f19853y = j8;
        this.f19834f = eVar.i();
        this.f19837i = new ArrayDeque();
        this.f19838j = new ArrayDeque();
        this.f19841m = -1;
        if (!k.b("GET", b7.h())) {
            throw new IllegalArgumentException(("Request must be GET: " + b7.h()).toString());
        }
        i.a aVar = i.f20019q;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        u uVar = u.f19985a;
        this.f19829a = i.a.g(aVar, bArr, 0, 0, 3, null).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(h6.e eVar) {
        if (eVar.f19888f || eVar.f19884b != null) {
            return false;
        }
        Integer num = eVar.f19886d;
        if (num == null) {
            return true;
        }
        int iIntValue = num.intValue();
        return 8 <= iIntValue && 15 >= iIntValue;
    }

    private final void v() {
        if (!U5.c.f3990h || Thread.holdsLock(this)) {
            X5.a aVar = this.f19831c;
            if (aVar != null) {
                X5.d.j(this.f19834f, aVar, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        k.e(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    private final synchronized boolean w(i iVar, int i7) {
        if (!this.f19843o && !this.f19840l) {
            if (this.f19839k + ((long) iVar.C()) > 16777216) {
                f(1001, null);
                return false;
            }
            this.f19839k += (long) iVar.C();
            this.f19838j.add(new c(i7, iVar));
            v();
            return true;
        }
        return false;
    }

    @Override // h6.g.a
    public void a(i iVar) {
        k.f(iVar, "bytes");
        this.f19849u.d(this, iVar);
    }

    @Override // T5.H
    public boolean b(String str) {
        k.f(str, "text");
        return w(i.f20019q.d(str), 1);
    }

    @Override // T5.H
    public boolean c(i iVar) {
        k.f(iVar, "bytes");
        return w(iVar, 2);
    }

    @Override // h6.g.a
    public synchronized void d(i iVar) {
        try {
            k.f(iVar, "payload");
            if (!this.f19843o && (!this.f19840l || !this.f19838j.isEmpty())) {
                this.f19837i.add(iVar);
                v();
                this.f19845q++;
            }
        } finally {
        }
    }

    @Override // h6.g.a
    public void e(String str) {
        k.f(str, "text");
        this.f19849u.e(this, str);
    }

    @Override // T5.H
    public boolean f(int i7, String str) {
        return o(i7, str, 60000L);
    }

    @Override // h6.g.a
    public synchronized void g(i iVar) {
        k.f(iVar, "payload");
        this.f19846r++;
        this.f19847s = false;
    }

    @Override // h6.g.a
    public void h(int i7, String str) {
        AbstractC0265d abstractC0265d;
        h6.g gVar;
        h6.h hVar;
        k.f(str, "reason");
        if (!(i7 != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            try {
                if (!(this.f19841m == -1)) {
                    throw new IllegalStateException("already closed".toString());
                }
                this.f19841m = i7;
                this.f19842n = str;
                abstractC0265d = null;
                if (this.f19840l && this.f19838j.isEmpty()) {
                    AbstractC0265d abstractC0265d2 = this.f19836h;
                    this.f19836h = null;
                    gVar = this.f19832d;
                    this.f19832d = null;
                    hVar = this.f19833e;
                    this.f19833e = null;
                    this.f19834f.n();
                    abstractC0265d = abstractC0265d2;
                } else {
                    gVar = null;
                    hVar = null;
                }
                u uVar = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f19849u.b(this, i7, str);
            if (abstractC0265d != null) {
                this.f19849u.a(this, i7, str);
            }
        } finally {
            if (abstractC0265d != null) {
                U5.c.j(abstractC0265d);
            }
            if (gVar != null) {
                U5.c.j(gVar);
            }
            if (hVar != null) {
                U5.c.j(hVar);
            }
        }
    }

    public void m() {
        InterfaceC0459e interfaceC0459e = this.f19830b;
        k.c(interfaceC0459e);
        interfaceC0459e.cancel();
    }

    public final void n(D d7, Y5.c cVar) throws ProtocolException {
        k.f(d7, "response");
        if (d7.f() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + d7.f() + ' ' + d7.B() + '\'');
        }
        String strO = D.o(d7, "Connection", null, 2, null);
        if (!F5.g.p("Upgrade", strO, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strO + '\'');
        }
        String strO2 = D.o(d7, "Upgrade", null, 2, null);
        if (!F5.g.p("websocket", strO2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strO2 + '\'');
        }
        String strO3 = D.o(d7, "Sec-WebSocket-Accept", null, 2, null);
        String strE = i.f20019q.d(this.f19829a + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").A().e();
        if (!(!k.b(strE, strO3))) {
            if (cVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strE + "' but was '" + strO3 + '\'');
    }

    public final synchronized boolean o(int i7, String str, long j7) {
        i iVarD;
        try {
            h6.f.f19889a.c(i7);
            if (str != null) {
                iVarD = i.f20019q.d(str);
                if (!(((long) iVarD.C()) <= 123)) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                iVarD = null;
            }
            if (!this.f19843o && !this.f19840l) {
                this.f19840l = true;
                this.f19838j.add(new a(i7, iVarD, j7));
                v();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void p(z zVar) {
        k.f(zVar, "client");
        if (this.f19848t.d("Sec-WebSocket-Extensions") != null) {
            q(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        z zVarB = zVar.B().g(r.f3608a).L(f19828z).b();
        B b7 = this.f19848t.i().e("Upgrade", "websocket").e("Connection", "Upgrade").e("Sec-WebSocket-Key", this.f19829a).e("Sec-WebSocket-Version", "13").e("Sec-WebSocket-Extensions", "permessage-deflate").b();
        Y5.e eVar = new Y5.e(zVarB, b7, true);
        this.f19830b = eVar;
        k.c(eVar);
        eVar.S0(new f(b7));
    }

    public final void q(Exception exc, D d7) {
        k.f(exc, "e");
        synchronized (this) {
            if (this.f19843o) {
                return;
            }
            this.f19843o = true;
            AbstractC0265d abstractC0265d = this.f19836h;
            this.f19836h = null;
            h6.g gVar = this.f19832d;
            this.f19832d = null;
            h6.h hVar = this.f19833e;
            this.f19833e = null;
            this.f19834f.n();
            u uVar = u.f19985a;
            try {
                this.f19849u.c(this, exc, d7);
            } finally {
                if (abstractC0265d != null) {
                    U5.c.j(abstractC0265d);
                }
                if (gVar != null) {
                    U5.c.j(gVar);
                }
                if (hVar != null) {
                    U5.c.j(hVar);
                }
            }
        }
    }

    public final I r() {
        return this.f19849u;
    }

    public final void s(String str, AbstractC0265d abstractC0265d) {
        k.f(str, "name");
        k.f(abstractC0265d, "streams");
        h6.e eVar = this.f19852x;
        k.c(eVar);
        synchronized (this) {
            try {
                this.f19835g = str;
                this.f19836h = abstractC0265d;
                this.f19833e = new h6.h(abstractC0265d.a(), abstractC0265d.b(), this.f19850v, eVar.f19883a, eVar.a(abstractC0265d.a()), this.f19853y);
                this.f19831c = new e();
                long j7 = this.f19851w;
                if (j7 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j7);
                    String str2 = str + " ping";
                    this.f19834f.i(new g(str2, str2, nanos, this, str, abstractC0265d, eVar), nanos);
                }
                if (!this.f19838j.isEmpty()) {
                    v();
                }
                u uVar = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f19832d = new h6.g(abstractC0265d.a(), abstractC0265d.d(), this, eVar.f19883a, eVar.a(!abstractC0265d.a()));
    }

    public final void u() {
        while (this.f19841m == -1) {
            h6.g gVar = this.f19832d;
            k.c(gVar);
            gVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x() throws Throwable {
        i iVar;
        h6.h hVar;
        v vVar;
        v vVar2;
        v vVar3;
        v vVar4;
        t tVar;
        v vVar5;
        v vVar6;
        v vVar7;
        v vVar8;
        AbstractC0265d abstractC0265d;
        h6.g gVar;
        h6.h hVar2;
        v vVar9 = new v();
        vVar9.f22740m = null;
        t tVar2 = new t();
        tVar2.f22738m = -1;
        v vVar10 = new v();
        vVar10.f22740m = null;
        v vVar11 = new v();
        vVar11.f22740m = null;
        v vVar12 = new v();
        vVar12.f22740m = null;
        v vVar13 = new v();
        vVar13.f22740m = null;
        synchronized (this) {
            try {
                if (this.f19843o) {
                    return false;
                }
                h6.h hVar3 = this.f19833e;
                i iVar2 = (i) this.f19837i.poll();
                if (iVar2 == null) {
                    Object objPoll = this.f19838j.poll();
                    vVar9.f22740m = objPoll;
                    if (objPoll instanceof a) {
                        int i7 = this.f19841m;
                        tVar2.f22738m = i7;
                        vVar10.f22740m = this.f19842n;
                        if (i7 != -1) {
                            vVar11.f22740m = this.f19836h;
                            this.f19836h = null;
                            vVar12.f22740m = this.f19832d;
                            this.f19832d = null;
                            vVar13.f22740m = this.f19833e;
                            this.f19833e = null;
                            this.f19834f.n();
                            iVar = iVar2;
                            hVar = hVar3;
                            vVar = vVar13;
                            vVar2 = vVar12;
                            vVar3 = vVar11;
                            vVar4 = vVar10;
                            tVar = tVar2;
                        } else {
                            Object obj = vVar9.f22740m;
                            if (obj == null) {
                                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                            }
                            long jA = ((a) obj).a();
                            X5.d dVar = this.f19834f;
                            String str = this.f19835g + " cancel";
                            iVar = iVar2;
                            hVar = hVar3;
                            vVar = vVar13;
                            vVar2 = vVar12;
                            vVar3 = vVar11;
                            vVar4 = vVar10;
                            tVar = tVar2;
                            dVar.i(new h(str, true, str, true, this, hVar3, iVar2, vVar9, tVar2, vVar10, vVar11, vVar2, vVar), TimeUnit.MILLISECONDS.toNanos(jA));
                        }
                    } else {
                        iVar = iVar2;
                        hVar = hVar3;
                        vVar = vVar13;
                        vVar2 = vVar12;
                        vVar3 = vVar11;
                        vVar4 = vVar10;
                        tVar = tVar2;
                        if (objPoll == null) {
                            return false;
                        }
                    }
                } else {
                    iVar = iVar2;
                    hVar = hVar3;
                    vVar = vVar13;
                    vVar2 = vVar12;
                    vVar3 = vVar11;
                    vVar4 = vVar10;
                    tVar = tVar2;
                }
                u uVar = u.f19985a;
                i iVar3 = iVar;
                try {
                } catch (Throwable th) {
                    th = th;
                    vVar5 = vVar;
                    vVar6 = vVar2;
                    vVar7 = vVar3;
                }
                if (iVar3 == null) {
                    h6.h hVar4 = hVar;
                    Object obj2 = vVar9.f22740m;
                    if (!(obj2 instanceof c)) {
                        boolean z6 = obj2 instanceof a;
                        try {
                            if (!z6) {
                                throw new AssertionError();
                            }
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                            }
                            a aVar = (a) obj2;
                            k.c(hVar4);
                            hVar4.a(aVar.b(), aVar.c());
                            v vVar14 = vVar3;
                            try {
                                AbstractC0265d abstractC0265d2 = (AbstractC0265d) vVar14.f22740m;
                                vVar8 = vVar14;
                                if (abstractC0265d2 != null) {
                                    I i8 = this.f19849u;
                                    int i9 = tVar.f22738m;
                                    String str2 = (String) vVar4.f22740m;
                                    k.c(str2);
                                    i8.a(this, i9, str2);
                                    vVar8 = vVar14;
                                }
                                abstractC0265d = (AbstractC0265d) vVar8.f22740m;
                                if (abstractC0265d != null) {
                                    U5.c.j(abstractC0265d);
                                }
                                gVar = (h6.g) vVar2.f22740m;
                                if (gVar != null) {
                                    U5.c.j(gVar);
                                }
                                hVar2 = (h6.h) vVar.f22740m;
                                if (hVar2 != null) {
                                    return true;
                                }
                                U5.c.j(hVar2);
                                return true;
                            } catch (Throwable th2) {
                                th = th2;
                                vVar5 = vVar;
                                vVar6 = vVar2;
                                vVar7 = vVar14;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            vVar7 = hVar4;
                            vVar6 = z6;
                            vVar5 = iVar3;
                        }
                    } else {
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message");
                        }
                        c cVar = (c) obj2;
                        k.c(hVar4);
                        hVar4.d(cVar.b(), cVar.a());
                        synchronized (this) {
                            this.f19839k -= (long) cVar.a().C();
                        }
                    }
                    AbstractC0265d abstractC0265d3 = (AbstractC0265d) vVar7.f22740m;
                    if (abstractC0265d3 != null) {
                        U5.c.j(abstractC0265d3);
                    }
                    h6.g gVar2 = (h6.g) vVar6.f22740m;
                    if (gVar2 != null) {
                        U5.c.j(gVar2);
                    }
                    h6.h hVar5 = (h6.h) vVar5.f22740m;
                    if (hVar5 != null) {
                        U5.c.j(hVar5);
                    }
                    throw th;
                }
                k.c(hVar);
                hVar.f(iVar3);
                vVar8 = vVar3;
                abstractC0265d = (AbstractC0265d) vVar8.f22740m;
                if (abstractC0265d != null) {
                }
                gVar = (h6.g) vVar2.f22740m;
                if (gVar != null) {
                }
                hVar2 = (h6.h) vVar.f22740m;
                if (hVar2 != null) {
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void y() {
        synchronized (this) {
            try {
                if (this.f19843o) {
                    return;
                }
                h6.h hVar = this.f19833e;
                if (hVar != null) {
                    int i7 = this.f19847s ? this.f19844p : -1;
                    this.f19844p++;
                    this.f19847s = true;
                    u uVar = u.f19985a;
                    if (i7 == -1) {
                        try {
                            hVar.e(i.f20018p);
                            return;
                        } catch (IOException e7) {
                            q(e7, null);
                            return;
                        }
                    }
                    q(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f19851w + "ms (after " + (i7 - 1) + " successful ping/pongs)"), null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
