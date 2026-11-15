package b6;

import b6.d;
import com.google.android.gms.common.api.Api;
import i6.C;
import i6.D;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Logger f9898q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f9899r = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b f9900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d.a f9901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final i6.h f9902o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f9903p;

    public static final class a {
        private a() {
        }

        public final Logger a() {
            return h.f9898q;
        }

        public final int b(int i7, int i8, int i9) throws IOException {
            if ((i8 & 8) != 0) {
                i7--;
            }
            if (i9 <= i7) {
                return i7 - i9;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i9 + " > remaining length " + i7);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public interface c {
        void a();

        void b(boolean z6, int i7, int i8, List list);

        void c(int i7, long j7);

        void d(boolean z6, m mVar);

        void g(int i7, b6.b bVar, i6.i iVar);

        void h(boolean z6, int i7, i6.h hVar, int i8);

        void k(boolean z6, int i7, int i8);

        void l(int i7, b6.b bVar);

        void n(int i7, int i8, int i9, boolean z6);

        void p(int i7, int i8, List list);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        w5.k.e(logger, "Logger.getLogger(Http2::class.java.name)");
        f9898q = logger;
    }

    public h(i6.h hVar, boolean z6) {
        w5.k.f(hVar, "source");
        this.f9902o = hVar;
        this.f9903p = z6;
        b bVar = new b(hVar);
        this.f9900m = bVar;
        this.f9901n = new d.a(bVar, 4096, 0, 4, null);
    }

    private final void B(c cVar, int i7, int i8, int i9) throws IOException {
        int iF;
        if (i9 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i8 & 1) != 0) {
            if (i7 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.a();
            return;
        }
        if (i7 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i7);
        }
        m mVar = new m();
        C5.a aVarK = C5.g.k(C5.g.l(0, i7), 6);
        int iF2 = aVarK.f();
        int iH = aVarK.h();
        int i10 = aVarK.i();
        if (i10 < 0 ? iF2 >= iH : iF2 <= iH) {
            while (true) {
                int iC = U5.c.c(this.f9902o.O0(), 65535);
                iF = this.f9902o.F();
                if (iC != 2) {
                    if (iC == 3) {
                        iC = 4;
                    } else if (iC != 4) {
                        if (iC == 5 && (iF < 16384 || iF > 16777215)) {
                            break;
                        }
                    } else {
                        if (iF < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iC = 7;
                    }
                } else if (iF != 0 && iF != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                mVar.h(iC, iF);
                if (iF2 == iH) {
                    break;
                } else {
                    iF2 += i10;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + iF);
        }
        cVar.d(false, mVar);
    }

    private final void J(c cVar, int i7, int i8, int i9) throws IOException {
        if (i7 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i7);
        }
        long jD = U5.c.d(this.f9902o.F(), 2147483647L);
        if (jD == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.c(i9, jD);
    }

    private final void e(c cVar, int i7, int i8, int i9) throws IOException {
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z6 = (i8 & 1) != 0;
        if ((i8 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iB = (i8 & 8) != 0 ? U5.c.b(this.f9902o.q0(), 255) : 0;
        cVar.h(z6, i9, this.f9902o, f9899r.b(i7, i8, iB));
        this.f9902o.y0(iB);
    }

    private final void f(c cVar, int i7, int i8, int i9) throws IOException {
        if (i7 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i7);
        }
        if (i9 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int iF = this.f9902o.F();
        int iF2 = this.f9902o.F();
        int i10 = i7 - 8;
        b6.b bVarA = b6.b.f9730C.a(iF2);
        if (bVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + iF2);
        }
        i6.i iVarT = i6.i.f20018p;
        if (i10 > 0) {
            iVarT = this.f9902o.t(i10);
        }
        cVar.g(iF, bVarA, iVarT);
    }

    private final List g(int i7, int i8, int i9, int i10) throws IOException {
        this.f9900m.e(i7);
        b bVar = this.f9900m;
        bVar.f(bVar.a());
        this.f9900m.g(i8);
        this.f9900m.d(i9);
        this.f9900m.j(i10);
        this.f9901n.k();
        return this.f9901n.e();
    }

    private final void j(c cVar, int i7, int i8, int i9) throws IOException {
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z6 = (i8 & 1) != 0;
        int iB = (i8 & 8) != 0 ? U5.c.b(this.f9902o.q0(), 255) : 0;
        if ((i8 & 32) != 0) {
            n(cVar, i9);
            i7 -= 5;
        }
        cVar.b(z6, i9, -1, g(f9899r.b(i7, i8, iB), iB, i8, i9));
    }

    private final void l(c cVar, int i7, int i8, int i9) throws IOException {
        if (i7 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i7);
        }
        if (i9 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.k((i8 & 1) != 0, this.f9902o.F(), this.f9902o.F());
    }

    private final void n(c cVar, int i7) {
        int iF = this.f9902o.F();
        cVar.n(i7, iF & Api.BaseClientBuilder.API_PRIORITY_OTHER, U5.c.b(this.f9902o.q0(), 255) + 1, (((int) 2147483648L) & iF) != 0);
    }

    private final void o(c cVar, int i7, int i8, int i9) throws IOException {
        if (i7 == 5) {
            if (i9 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            n(cVar, i9);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i7 + " != 5");
        }
    }

    private final void w(c cVar, int i7, int i8, int i9) throws IOException {
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iB = (i8 & 8) != 0 ? U5.c.b(this.f9902o.q0(), 255) : 0;
        cVar.p(i9, this.f9902o.F() & Api.BaseClientBuilder.API_PRIORITY_OTHER, g(f9899r.b(i7 - 4, i8, iB), iB, i8, i9));
    }

    private final void z(c cVar, int i7, int i8, int i9) throws IOException {
        if (i7 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i7 + " != 4");
        }
        if (i9 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int iF = this.f9902o.F();
        b6.b bVarA = b6.b.f9730C.a(iF);
        if (bVarA != null) {
            cVar.l(i9, bVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + iF);
    }

    public final boolean b(boolean z6, c cVar) throws IOException {
        w5.k.f(cVar, "handler");
        try {
            this.f9902o.W0(9L);
            int iH = U5.c.H(this.f9902o);
            if (iH > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iH);
            }
            int iB = U5.c.b(this.f9902o.q0(), 255);
            int iB2 = U5.c.b(this.f9902o.q0(), 255);
            int iF = this.f9902o.F() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            Logger logger = f9898q;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.f9780e.c(true, iF, iH, iB, iB2));
            }
            if (z6 && iB != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + e.f9780e.b(iB));
            }
            switch (iB) {
                case 0:
                    e(cVar, iH, iB2, iF);
                    return true;
                case 1:
                    j(cVar, iH, iB2, iF);
                    return true;
                case 2:
                    o(cVar, iH, iB2, iF);
                    return true;
                case 3:
                    z(cVar, iH, iB2, iF);
                    return true;
                case 4:
                    B(cVar, iH, iB2, iF);
                    return true;
                case 5:
                    w(cVar, iH, iB2, iF);
                    return true;
                case 6:
                    l(cVar, iH, iB2, iF);
                    return true;
                case 7:
                    f(cVar, iH, iB2, iF);
                    return true;
                case 8:
                    J(cVar, iH, iB2, iF);
                    return true;
                default:
                    this.f9902o.y0(iH);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9902o.close();
    }

    public final void d(c cVar) throws IOException {
        w5.k.f(cVar, "handler");
        if (this.f9903p) {
            if (!b(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        i6.h hVar = this.f9902o;
        i6.i iVar = e.f9776a;
        i6.i iVarT = hVar.t(iVar.C());
        Logger logger = f9898q;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(U5.c.q("<< CONNECTION " + iVarT.r(), new Object[0]));
        }
        if (!w5.k.b(iVar, iVarT)) {
            throw new IOException("Expected a connection header but was " + iVarT.G());
        }
    }

    public static final class b implements C {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f9904m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f9905n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f9906o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f9907p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f9908q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final i6.h f9909r;

        public b(i6.h hVar) {
            w5.k.f(hVar, "source");
            this.f9909r = hVar;
        }

        private final void b() throws IOException {
            int i7 = this.f9906o;
            int iH = U5.c.H(this.f9909r);
            this.f9907p = iH;
            this.f9904m = iH;
            int iB = U5.c.b(this.f9909r.q0(), 255);
            this.f9905n = U5.c.b(this.f9909r.q0(), 255);
            a aVar = h.f9899r;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f9780e.c(true, this.f9906o, this.f9904m, iB, this.f9905n));
            }
            int iF = this.f9909r.F() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f9906o = iF;
            if (iB == 9) {
                if (iF != i7) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iB + " != TYPE_CONTINUATION");
            }
        }

        @Override // i6.C
        public long L0(i6.f fVar, long j7) throws IOException {
            w5.k.f(fVar, "sink");
            while (true) {
                int i7 = this.f9907p;
                if (i7 != 0) {
                    long jL0 = this.f9909r.L0(fVar, Math.min(j7, i7));
                    if (jL0 == -1) {
                        return -1L;
                    }
                    this.f9907p -= (int) jL0;
                    return jL0;
                }
                this.f9909r.y0(this.f9908q);
                this.f9908q = 0;
                if ((this.f9905n & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        public final int a() {
            return this.f9907p;
        }

        public final void d(int i7) {
            this.f9905n = i7;
        }

        public final void e(int i7) {
            this.f9907p = i7;
        }

        public final void f(int i7) {
            this.f9904m = i7;
        }

        public final void g(int i7) {
            this.f9908q = i7;
        }

        @Override // i6.C
        public D i() {
            return this.f9909r.i();
        }

        public final void j(int i7) {
            this.f9906o = i7;
        }

        @Override // i6.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
