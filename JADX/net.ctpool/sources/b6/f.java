package b6;

import b6.h;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import i5.u;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.InterfaceC2171a;
import w5.v;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final m f9781O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final c f9782P = new c(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f9783A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f9784B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f9785C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f9786D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final m f9787E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private m f9788F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f9789G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f9790H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private long f9791I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f9792J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Socket f9793K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final b6.j f9794L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final e f9795M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Set f9796N;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f9797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d f9798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f9799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f9800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f9801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f9802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f9803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final X5.e f9804t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final X5.d f9805u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final X5.d f9806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final X5.d f9807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final b6.l f9808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f9809y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f9810z;

    public static final class a extends X5.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f9811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f9812f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f9813g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, f fVar, long j7) {
            super(str2, false, 2, null);
            this.f9811e = str;
            this.f9812f = fVar;
            this.f9813g = j7;
        }

        @Override // X5.a
        public long f() {
            boolean z6;
            synchronized (this.f9812f) {
                if (this.f9812f.f9810z < this.f9812f.f9809y) {
                    z6 = true;
                } else {
                    this.f9812f.f9809y++;
                    z6 = false;
                }
            }
            f fVar = this.f9812f;
            if (z6) {
                fVar.n0(null);
                return -1L;
            }
            fVar.C1(false, 1, 0);
            return this.f9813g;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Socket f9814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f9815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i6.h f9816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i6.g f9817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f9818e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private b6.l f9819f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f9820g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f9821h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final X5.e f9822i;

        public b(boolean z6, X5.e eVar) {
            w5.k.f(eVar, "taskRunner");
            this.f9821h = z6;
            this.f9822i = eVar;
            this.f9818e = d.f9823a;
            this.f9819f = b6.l.f9953a;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f9821h;
        }

        public final String c() {
            String str = this.f9815b;
            if (str == null) {
                w5.k.t("connectionName");
            }
            return str;
        }

        public final d d() {
            return this.f9818e;
        }

        public final int e() {
            return this.f9820g;
        }

        public final b6.l f() {
            return this.f9819f;
        }

        public final i6.g g() {
            i6.g gVar = this.f9817d;
            if (gVar == null) {
                w5.k.t("sink");
            }
            return gVar;
        }

        public final Socket h() {
            Socket socket = this.f9814a;
            if (socket == null) {
                w5.k.t("socket");
            }
            return socket;
        }

        public final i6.h i() {
            i6.h hVar = this.f9816c;
            if (hVar == null) {
                w5.k.t("source");
            }
            return hVar;
        }

        public final X5.e j() {
            return this.f9822i;
        }

        public final b k(d dVar) {
            w5.k.f(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f9818e = dVar;
            return this;
        }

        public final b l(int i7) {
            this.f9820g = i7;
            return this;
        }

        public final b m(Socket socket, String str, i6.h hVar, i6.g gVar) {
            StringBuilder sb;
            w5.k.f(socket, "socket");
            w5.k.f(str, "peerName");
            w5.k.f(hVar, "source");
            w5.k.f(gVar, "sink");
            this.f9814a = socket;
            if (this.f9821h) {
                sb = new StringBuilder();
                sb.append(U5.c.f3991i);
                sb.append(' ');
            } else {
                sb = new StringBuilder();
                sb.append("MockWebServer ");
            }
            sb.append(str);
            this.f9815b = sb.toString();
            this.f9816c = hVar;
            this.f9817d = gVar;
            return this;
        }
    }

    public static final class c {
        private c() {
        }

        public final m a() {
            return f.f9781O;
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f9824b = new b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f9823a = new a();

        public static final class a extends d {
            a() {
            }

            @Override // b6.f.d
            public void b(b6.i iVar) {
                w5.k.f(iVar, "stream");
                iVar.d(b6.b.REFUSED_STREAM, null);
            }
        }

        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public void a(f fVar, m mVar) {
            w5.k.f(fVar, "connection");
            w5.k.f(mVar, "settings");
        }

        public abstract void b(b6.i iVar);
    }

    /* JADX INFO: renamed from: b6.f$f, reason: collision with other inner class name */
    public static final class C0188f extends X5.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f9853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9854f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f9855g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9856h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ i6.f f9857i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f9858j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f9859k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0188f(String str, boolean z6, String str2, boolean z7, f fVar, int i7, i6.f fVar2, int i8, boolean z8) {
            super(str2, z7);
            this.f9853e = str;
            this.f9854f = z6;
            this.f9855g = fVar;
            this.f9856h = i7;
            this.f9857i = fVar2;
            this.f9858j = i8;
            this.f9859k = z8;
        }

        @Override // X5.a
        public long f() {
            try {
                boolean zB = this.f9855g.f9808x.b(this.f9856h, this.f9857i, this.f9858j, this.f9859k);
                if (zB) {
                    this.f9855g.j1().w(this.f9856h, b6.b.CANCEL);
                }
                if (!zB && !this.f9859k) {
                    return -1L;
                }
                synchronized (this.f9855g) {
                    this.f9855g.f9796N.remove(Integer.valueOf(this.f9856h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class g extends X5.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f9860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9861f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f9862g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9863h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f9864i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f9865j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z6, String str2, boolean z7, f fVar, int i7, List list, boolean z8) {
            super(str2, z7);
            this.f9860e = str;
            this.f9861f = z6;
            this.f9862g = fVar;
            this.f9863h = i7;
            this.f9864i = list;
            this.f9865j = z8;
        }

        @Override // X5.a
        public long f() {
            boolean zD = this.f9862g.f9808x.d(this.f9863h, this.f9864i, this.f9865j);
            if (zD) {
                try {
                    this.f9862g.j1().w(this.f9863h, b6.b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zD && !this.f9865j) {
                return -1L;
            }
            synchronized (this.f9862g) {
                this.f9862g.f9796N.remove(Integer.valueOf(this.f9863h));
            }
            return -1L;
        }
    }

    public static final class h extends X5.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f9866e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9867f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f9868g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9869h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f9870i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z6, String str2, boolean z7, f fVar, int i7, List list) {
            super(str2, z7);
            this.f9866e = str;
            this.f9867f = z6;
            this.f9868g = fVar;
            this.f9869h = i7;
            this.f9870i = list;
        }

        @Override // X5.a
        public long f() {
            if (!this.f9868g.f9808x.c(this.f9869h, this.f9870i)) {
                return -1L;
            }
            try {
                this.f9868g.j1().w(this.f9869h, b6.b.CANCEL);
                synchronized (this.f9868g) {
                    this.f9868g.f9796N.remove(Integer.valueOf(this.f9869h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class i extends X5.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f9871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f9873g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9874h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ b6.b f9875i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z6, String str2, boolean z7, f fVar, int i7, b6.b bVar) {
            super(str2, z7);
            this.f9871e = str;
            this.f9872f = z6;
            this.f9873g = fVar;
            this.f9874h = i7;
            this.f9875i = bVar;
        }

        @Override // X5.a
        public long f() {
            this.f9873g.f9808x.a(this.f9874h, this.f9875i);
            synchronized (this.f9873g) {
                this.f9873g.f9796N.remove(Integer.valueOf(this.f9874h));
                u uVar = u.f19985a;
            }
            return -1L;
        }
    }

    public static final class j extends X5.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f9876e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9877f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f9878g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z6, String str2, boolean z7, f fVar) {
            super(str2, z7);
            this.f9876e = str;
            this.f9877f = z6;
            this.f9878g = fVar;
        }

        @Override // X5.a
        public long f() {
            this.f9878g.C1(false, 2, 0);
            return -1L;
        }
    }

    public static final class k extends X5.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f9879e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9880f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f9881g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9882h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ b6.b f9883i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z6, String str2, boolean z7, f fVar, int i7, b6.b bVar) {
            super(str2, z7);
            this.f9879e = str;
            this.f9880f = z6;
            this.f9881g = fVar;
            this.f9882h = i7;
            this.f9883i = bVar;
        }

        @Override // X5.a
        public long f() {
            try {
                this.f9881g.D1(this.f9882h, this.f9883i);
                return -1L;
            } catch (IOException e7) {
                this.f9881g.n0(e7);
                return -1L;
            }
        }
    }

    public static final class l extends X5.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f9884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f9886g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9887h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f9888i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z6, String str2, boolean z7, f fVar, int i7, long j7) {
            super(str2, z7);
            this.f9884e = str;
            this.f9885f = z6;
            this.f9886g = fVar;
            this.f9887h = i7;
            this.f9888i = j7;
        }

        @Override // X5.a
        public long f() {
            try {
                this.f9886g.j1().B(this.f9887h, this.f9888i);
                return -1L;
            } catch (IOException e7) {
                this.f9886g.n0(e7);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        f9781O = mVar;
    }

    public f(b bVar) {
        w5.k.f(bVar, "builder");
        boolean zB = bVar.b();
        this.f9797m = zB;
        this.f9798n = bVar.d();
        this.f9799o = new LinkedHashMap();
        String strC = bVar.c();
        this.f9800p = strC;
        this.f9802r = bVar.b() ? 3 : 2;
        X5.e eVarJ = bVar.j();
        this.f9804t = eVarJ;
        X5.d dVarI = eVarJ.i();
        this.f9805u = dVarI;
        this.f9806v = eVarJ.i();
        this.f9807w = eVarJ.i();
        this.f9808x = bVar.f();
        m mVar = new m();
        if (bVar.b()) {
            mVar.h(7, 16777216);
        }
        u uVar = u.f19985a;
        this.f9787E = mVar;
        this.f9788F = f9781O;
        this.f9792J = r2.c();
        this.f9793K = bVar.h();
        this.f9794L = new b6.j(bVar.g(), zB);
        this.f9795M = new e(this, new b6.h(bVar.i(), zB));
        this.f9796N = new LinkedHashSet();
        if (bVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(bVar.e());
            String str = strC + " ping";
            dVarI.i(new a(str, str, this, nanos), nanos);
        }
    }

    private final b6.i l1(int i7, List list, boolean z6) {
        int i8;
        b6.i iVar;
        boolean z7;
        boolean z8 = !z6;
        synchronized (this.f9794L) {
            try {
                synchronized (this) {
                    try {
                        if (this.f9802r > 1073741823) {
                            w1(b6.b.REFUSED_STREAM);
                        }
                        if (this.f9803s) {
                            throw new b6.a();
                        }
                        i8 = this.f9802r;
                        this.f9802r = i8 + 2;
                        iVar = new b6.i(i8, this, z8, false, null);
                        z7 = !z6 || this.f9791I >= this.f9792J || iVar.r() >= iVar.q();
                        if (iVar.u()) {
                            this.f9799o.put(Integer.valueOf(i8), iVar);
                        }
                        u uVar = u.f19985a;
                    } finally {
                    }
                }
                if (i7 == 0) {
                    this.f9794L.j(z8, i8, list);
                } else {
                    if (!(true ^ this.f9797m)) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                    }
                    this.f9794L.o(i7, i8, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            this.f9794L.flush();
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(IOException iOException) {
        b6.b bVar = b6.b.PROTOCOL_ERROR;
        j0(bVar, bVar, iOException);
    }

    public static /* synthetic */ void y1(f fVar, boolean z6, X5.e eVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = true;
        }
        if ((i7 & 2) != 0) {
            eVar = X5.e.f4367h;
        }
        fVar.x1(z6, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f9794L.l());
        r6 = r2;
        r8.f9791I += r6;
        r4 = i5.u.f19985a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1(int i7, boolean z6, i6.f fVar, long j7) {
        int iMin;
        long j8;
        if (j7 == 0) {
            this.f9794L.d(z6, i7, fVar, 0);
            return;
        }
        while (j7 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j9 = this.f9791I;
                            long j10 = this.f9792J;
                            if (j9 < j10) {
                                break;
                            } else {
                                if (!this.f9799o.containsKey(Integer.valueOf(i7))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
            }
            j7 -= j8;
            this.f9794L.d(z6 && j7 == 0, i7, fVar, iMin);
        }
    }

    public final boolean B0() {
        return this.f9797m;
    }

    public final void B1(int i7, boolean z6, List list) {
        w5.k.f(list, "alternating");
        this.f9794L.j(z6, i7, list);
    }

    public final void C1(boolean z6, int i7, int i8) {
        try {
            this.f9794L.n(z6, i7, i8);
        } catch (IOException e7) {
            n0(e7);
        }
    }

    public final String D0() {
        return this.f9800p;
    }

    public final void D1(int i7, b6.b bVar) {
        w5.k.f(bVar, "statusCode");
        this.f9794L.w(i7, bVar);
    }

    public final void E1(int i7, b6.b bVar) {
        w5.k.f(bVar, "errorCode");
        X5.d dVar = this.f9805u;
        String str = this.f9800p + '[' + i7 + "] writeSynReset";
        dVar.i(new k(str, true, str, true, this, i7, bVar), 0L);
    }

    public final void F1(int i7, long j7) {
        X5.d dVar = this.f9805u;
        String str = this.f9800p + '[' + i7 + "] windowUpdate";
        dVar.i(new l(str, true, str, true, this, i7, j7), 0L);
    }

    public final int H0() {
        return this.f9801q;
    }

    public final d M0() {
        return this.f9798n;
    }

    public final int R0() {
        return this.f9802r;
    }

    public final m S0() {
        return this.f9787E;
    }

    public final m b1() {
        return this.f9788F;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j0(b6.b.NO_ERROR, b6.b.CANCEL, null);
    }

    public final synchronized b6.i f1(int i7) {
        return (b6.i) this.f9799o.get(Integer.valueOf(i7));
    }

    public final void flush() {
        this.f9794L.flush();
    }

    public final Map h1() {
        return this.f9799o;
    }

    public final long i1() {
        return this.f9792J;
    }

    public final void j0(b6.b bVar, b6.b bVar2, IOException iOException) {
        int i7;
        b6.i[] iVarArr;
        w5.k.f(bVar, "connectionCode");
        w5.k.f(bVar2, "streamCode");
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
        try {
            w1(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (!this.f9799o.isEmpty()) {
                    Object[] array = this.f9799o.values().toArray(new b6.i[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    iVarArr = (b6.i[]) array;
                    this.f9799o.clear();
                } else {
                    iVarArr = null;
                }
                u uVar = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVarArr != null) {
            for (b6.i iVar : iVarArr) {
                try {
                    iVar.d(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f9794L.close();
        } catch (IOException unused3) {
        }
        try {
            this.f9793K.close();
        } catch (IOException unused4) {
        }
        this.f9805u.n();
        this.f9806v.n();
        this.f9807w.n();
    }

    public final b6.j j1() {
        return this.f9794L;
    }

    public final synchronized boolean k1(long j7) {
        if (this.f9803s) {
            return false;
        }
        if (this.f9784B < this.f9783A) {
            if (j7 >= this.f9786D) {
                return false;
            }
        }
        return true;
    }

    public final b6.i m1(List list, boolean z6) {
        w5.k.f(list, "requestHeaders");
        return l1(0, list, z6);
    }

    public final void n1(int i7, i6.h hVar, int i8, boolean z6) {
        w5.k.f(hVar, "source");
        i6.f fVar = new i6.f();
        long j7 = i8;
        hVar.W0(j7);
        hVar.L0(fVar, j7);
        X5.d dVar = this.f9806v;
        String str = this.f9800p + '[' + i7 + "] onData";
        dVar.i(new C0188f(str, true, str, true, this, i7, fVar, i8, z6), 0L);
    }

    public final void o1(int i7, List list, boolean z6) {
        w5.k.f(list, "requestHeaders");
        X5.d dVar = this.f9806v;
        String str = this.f9800p + '[' + i7 + "] onHeaders";
        dVar.i(new g(str, true, str, true, this, i7, list, z6), 0L);
    }

    public final void p1(int i7, List list) {
        w5.k.f(list, "requestHeaders");
        synchronized (this) {
            if (this.f9796N.contains(Integer.valueOf(i7))) {
                E1(i7, b6.b.PROTOCOL_ERROR);
                return;
            }
            this.f9796N.add(Integer.valueOf(i7));
            X5.d dVar = this.f9806v;
            String str = this.f9800p + '[' + i7 + "] onRequest";
            dVar.i(new h(str, true, str, true, this, i7, list), 0L);
        }
    }

    public final void q1(int i7, b6.b bVar) {
        w5.k.f(bVar, "errorCode");
        X5.d dVar = this.f9806v;
        String str = this.f9800p + '[' + i7 + "] onReset";
        dVar.i(new i(str, true, str, true, this, i7, bVar), 0L);
    }

    public final boolean r1(int i7) {
        return i7 != 0 && (i7 & 1) == 0;
    }

    public final synchronized b6.i s1(int i7) {
        b6.i iVar;
        iVar = (b6.i) this.f9799o.remove(Integer.valueOf(i7));
        notifyAll();
        return iVar;
    }

    public final void t1() {
        synchronized (this) {
            long j7 = this.f9784B;
            long j8 = this.f9783A;
            if (j7 < j8) {
                return;
            }
            this.f9783A = j8 + 1;
            this.f9786D = System.nanoTime() + ((long) 1000000000);
            u uVar = u.f19985a;
            X5.d dVar = this.f9805u;
            String str = this.f9800p + " ping";
            dVar.i(new j(str, true, str, true, this), 0L);
        }
    }

    public final void u1(int i7) {
        this.f9801q = i7;
    }

    public final void v1(m mVar) {
        w5.k.f(mVar, "<set-?>");
        this.f9788F = mVar;
    }

    public final void w1(b6.b bVar) {
        w5.k.f(bVar, "statusCode");
        synchronized (this.f9794L) {
            synchronized (this) {
                if (this.f9803s) {
                    return;
                }
                this.f9803s = true;
                int i7 = this.f9801q;
                u uVar = u.f19985a;
                this.f9794L.g(i7, bVar, U5.c.f3983a);
            }
        }
    }

    public final void x1(boolean z6, X5.e eVar) {
        w5.k.f(eVar, "taskRunner");
        if (z6) {
            this.f9794L.b();
            this.f9794L.z(this.f9787E);
            if (this.f9787E.c() != 65535) {
                this.f9794L.B(0, r7 - 65535);
            }
        }
        X5.d dVarI = eVar.i();
        String str = this.f9800p;
        dVarI.i(new X5.c(this.f9795M, str, true, str, true), 0L);
    }

    public final synchronized void z1(long j7) {
        long j8 = this.f9789G + j7;
        this.f9789G = j8;
        long j9 = j8 - this.f9790H;
        if (j9 >= this.f9787E.c() / 2) {
            F1(0, j9);
            this.f9790H += j9;
        }
    }

    public final class e implements h.c, InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final b6.h f9825m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ f f9826n;

        public static final class a extends X5.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f9827e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f9828f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f9829g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ v f9830h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f9831i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ m f9832j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ w5.u f9833k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ v f9834l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z6, String str2, boolean z7, e eVar, v vVar, boolean z8, m mVar, w5.u uVar, v vVar2) {
                super(str2, z7);
                this.f9827e = str;
                this.f9828f = z6;
                this.f9829g = eVar;
                this.f9830h = vVar;
                this.f9831i = z8;
                this.f9832j = mVar;
                this.f9833k = uVar;
                this.f9834l = vVar2;
            }

            @Override // X5.a
            public long f() {
                this.f9829g.f9826n.M0().a(this.f9829g.f9826n, (m) this.f9830h.f22740m);
                return -1L;
            }
        }

        public static final class b extends X5.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f9835e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f9836f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ b6.i f9837g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ e f9838h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ b6.i f9839i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f9840j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ List f9841k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ boolean f9842l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z6, String str2, boolean z7, b6.i iVar, e eVar, b6.i iVar2, int i7, List list, boolean z8) {
                super(str2, z7);
                this.f9835e = str;
                this.f9836f = z6;
                this.f9837g = iVar;
                this.f9838h = eVar;
                this.f9839i = iVar2;
                this.f9840j = i7;
                this.f9841k = list;
                this.f9842l = z8;
            }

            @Override // X5.a
            public long f() {
                try {
                    this.f9838h.f9826n.M0().b(this.f9837g);
                    return -1L;
                } catch (IOException e7) {
                    d6.j.f18715c.g().k("Http2Connection.Listener failure for " + this.f9838h.f9826n.D0(), 4, e7);
                    try {
                        this.f9837g.d(b6.b.PROTOCOL_ERROR, e7);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        public static final class c extends X5.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f9843e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f9844f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f9845g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f9846h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f9847i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z6, String str2, boolean z7, e eVar, int i7, int i8) {
                super(str2, z7);
                this.f9843e = str;
                this.f9844f = z6;
                this.f9845g = eVar;
                this.f9846h = i7;
                this.f9847i = i8;
            }

            @Override // X5.a
            public long f() {
                this.f9845g.f9826n.C1(true, this.f9846h, this.f9847i);
                return -1L;
            }
        }

        public static final class d extends X5.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f9848e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f9849f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f9850g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f9851h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ m f9852i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z6, String str2, boolean z7, e eVar, boolean z8, m mVar) {
                super(str2, z7);
                this.f9848e = str;
                this.f9849f = z6;
                this.f9850g = eVar;
                this.f9851h = z8;
                this.f9852i = mVar;
            }

            @Override // X5.a
            public long f() {
                this.f9850g.q(this.f9851h, this.f9852i);
                return -1L;
            }
        }

        public e(f fVar, b6.h hVar) {
            w5.k.f(hVar, "reader");
            this.f9826n = fVar;
            this.f9825m = hVar;
        }

        @Override // b6.h.c
        public void b(boolean z6, int i7, int i8, List list) {
            w5.k.f(list, "headerBlock");
            if (this.f9826n.r1(i7)) {
                this.f9826n.o1(i7, list, z6);
                return;
            }
            synchronized (this.f9826n) {
                b6.i iVarF1 = this.f9826n.f1(i7);
                if (iVarF1 != null) {
                    u uVar = u.f19985a;
                    iVarF1.x(U5.c.M(list), z6);
                    return;
                }
                if (this.f9826n.f9803s) {
                    return;
                }
                if (i7 <= this.f9826n.H0()) {
                    return;
                }
                if (i7 % 2 == this.f9826n.R0() % 2) {
                    return;
                }
                b6.i iVar = new b6.i(i7, this.f9826n, false, z6, U5.c.M(list));
                this.f9826n.u1(i7);
                this.f9826n.h1().put(Integer.valueOf(i7), iVar);
                X5.d dVarI = this.f9826n.f9804t.i();
                String str = this.f9826n.D0() + '[' + i7 + "] onStream";
                dVarI.i(new b(str, true, str, true, iVar, this, iVarF1, i7, list, z6), 0L);
            }
        }

        @Override // b6.h.c
        public void c(int i7, long j7) {
            Object obj;
            if (i7 == 0) {
                f fVar = this.f9826n;
                synchronized (fVar) {
                    f fVar2 = this.f9826n;
                    fVar2.f9792J = fVar2.i1() + j7;
                    f fVar3 = this.f9826n;
                    if (fVar3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    fVar3.notifyAll();
                    u uVar = u.f19985a;
                    obj = fVar;
                }
            } else {
                b6.i iVarF1 = this.f9826n.f1(i7);
                if (iVarF1 == null) {
                    return;
                }
                synchronized (iVarF1) {
                    iVarF1.a(j7);
                    u uVar2 = u.f19985a;
                    obj = iVarF1;
                }
            }
        }

        @Override // b6.h.c
        public void d(boolean z6, m mVar) {
            w5.k.f(mVar, "settings");
            X5.d dVar = this.f9826n.f9805u;
            String str = this.f9826n.D0() + " applyAndAckSettings";
            dVar.i(new d(str, true, str, true, this, z6, mVar), 0L);
        }

        @Override // b6.h.c
        public void g(int i7, b6.b bVar, i6.i iVar) {
            int i8;
            b6.i[] iVarArr;
            w5.k.f(bVar, "errorCode");
            w5.k.f(iVar, "debugData");
            iVar.C();
            synchronized (this.f9826n) {
                Object[] array = this.f9826n.h1().values().toArray(new b6.i[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                iVarArr = (b6.i[]) array;
                this.f9826n.f9803s = true;
                u uVar = u.f19985a;
            }
            for (b6.i iVar2 : iVarArr) {
                if (iVar2.j() > i7 && iVar2.t()) {
                    iVar2.y(b6.b.REFUSED_STREAM);
                    this.f9826n.s1(iVar2.j());
                }
            }
        }

        @Override // b6.h.c
        public void h(boolean z6, int i7, i6.h hVar, int i8) {
            w5.k.f(hVar, "source");
            if (this.f9826n.r1(i7)) {
                this.f9826n.n1(i7, hVar, i8, z6);
                return;
            }
            b6.i iVarF1 = this.f9826n.f1(i7);
            if (iVarF1 == null) {
                this.f9826n.E1(i7, b6.b.PROTOCOL_ERROR);
                long j7 = i8;
                this.f9826n.z1(j7);
                hVar.y0(j7);
                return;
            }
            iVarF1.w(hVar, i8);
            if (z6) {
                iVarF1.x(U5.c.f3984b, true);
            }
        }

        @Override // v5.InterfaceC2171a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            r();
            return u.f19985a;
        }

        @Override // b6.h.c
        public void k(boolean z6, int i7, int i8) {
            if (!z6) {
                X5.d dVar = this.f9826n.f9805u;
                String str = this.f9826n.D0() + " ping";
                dVar.i(new c(str, true, str, true, this, i7, i8), 0L);
                return;
            }
            synchronized (this.f9826n) {
                try {
                    if (i7 == 1) {
                        this.f9826n.f9810z++;
                    } else if (i7 != 2) {
                        if (i7 == 3) {
                            this.f9826n.f9785C++;
                            f fVar = this.f9826n;
                            if (fVar == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            fVar.notifyAll();
                        }
                        u uVar = u.f19985a;
                    } else {
                        this.f9826n.f9784B++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // b6.h.c
        public void l(int i7, b6.b bVar) {
            w5.k.f(bVar, "errorCode");
            if (this.f9826n.r1(i7)) {
                this.f9826n.q1(i7, bVar);
                return;
            }
            b6.i iVarS1 = this.f9826n.s1(i7);
            if (iVarS1 != null) {
                iVarS1.y(bVar);
            }
        }

        @Override // b6.h.c
        public void p(int i7, int i8, List list) {
            w5.k.f(list, "requestHeaders");
            this.f9826n.p1(i8, list);
        }

        public final void q(boolean z6, m mVar) {
            f fVar;
            m mVar2;
            b6.i[] iVarArr;
            X5.d dVar;
            String str;
            w5.k.f(mVar, "settings");
            w5.u uVar = new w5.u();
            v vVar = new v();
            v vVar2 = new v();
            synchronized (this.f9826n.j1()) {
                f fVar2 = this.f9826n;
                synchronized (fVar2) {
                    try {
                        m mVarB1 = this.f9826n.b1();
                        if (z6) {
                            mVar2 = mVar;
                        } else {
                            mVar2 = new m();
                            mVar2.g(mVarB1);
                            mVar2.g(mVar);
                            u uVar2 = u.f19985a;
                        }
                        vVar2.f22740m = mVar2;
                        long jC = ((long) mVar2.c()) - ((long) mVarB1.c());
                        uVar.f22739m = jC;
                        if (jC == 0 || this.f9826n.h1().isEmpty()) {
                            iVarArr = null;
                        } else {
                            Object[] array = this.f9826n.h1().values().toArray(new b6.i[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                            iVarArr = (b6.i[]) array;
                        }
                        vVar.f22740m = iVarArr;
                        this.f9826n.v1((m) vVar2.f22740m);
                        dVar = this.f9826n.f9807w;
                        str = this.f9826n.D0() + " onSettings";
                        fVar = fVar2;
                    } catch (Throwable th) {
                        th = th;
                        fVar = fVar2;
                    }
                    try {
                        dVar.i(new a(str, true, str, true, this, vVar2, z6, mVar, uVar, vVar), 0L);
                        u uVar3 = u.f19985a;
                        try {
                            this.f9826n.j1().a((m) vVar2.f22740m);
                        } catch (IOException e7) {
                            this.f9826n.n0(e7);
                        }
                        u uVar4 = u.f19985a;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
            Object obj = vVar.f22740m;
            if (((b6.i[]) obj) != null) {
                b6.i[] iVarArr2 = (b6.i[]) obj;
                w5.k.c(iVarArr2);
                for (b6.i iVar : iVarArr2) {
                    synchronized (iVar) {
                        iVar.a(uVar.f22739m);
                        u uVar5 = u.f19985a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [b6.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [b6.h, java.io.Closeable] */
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
        public void r() throws Throwable {
            b6.b bVar;
            b6.b bVar2 = b6.b.INTERNAL_ERROR;
            IOException e7 = null;
            try {
                try {
                    this.f9825m.d(this);
                    while (this.f9825m.b(false, this)) {
                    }
                    b6.b bVar3 = b6.b.NO_ERROR;
                    try {
                        this.f9826n.j0(bVar3, b6.b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e8) {
                        e7 = e8;
                        b6.b bVar4 = b6.b.PROTOCOL_ERROR;
                        f fVar = this.f9826n;
                        fVar.j0(bVar4, bVar4, e7);
                        bVar = fVar;
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f9826n.j0(bVar, bVar2, e7);
                    U5.c.j(this.f9825m);
                    throw th;
                }
            } catch (IOException e9) {
                e7 = e9;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                this.f9826n.j0(bVar, bVar2, e7);
                U5.c.j(this.f9825m);
                throw th;
            }
            bVar2 = this.f9825m;
            U5.c.j(bVar2);
        }

        @Override // b6.h.c
        public void a() {
        }

        @Override // b6.h.c
        public void n(int i7, int i8, int i9, boolean z6) {
        }
    }
}
