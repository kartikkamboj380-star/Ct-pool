package b6;

import b6.d;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i6.f f9940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f9941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f9942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d.b f9943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i6.g f9944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f9945r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f9939t = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Logger f9938s = Logger.getLogger(e.class.getName());

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(i6.g gVar, boolean z6) {
        w5.k.f(gVar, "sink");
        this.f9944q = gVar;
        this.f9945r = z6;
        i6.f fVar = new i6.f();
        this.f9940m = fVar;
        this.f9941n = 16384;
        this.f9943p = new d.b(0, false, fVar, 3, null);
    }

    private final void J(int i7, long j7) {
        while (j7 > 0) {
            long jMin = Math.min(this.f9941n, j7);
            j7 -= jMin;
            f(i7, (int) jMin, 9, j7 == 0 ? 4 : 0);
            this.f9944q.w0(this.f9940m, jMin);
        }
    }

    public final synchronized void B(int i7, long j7) {
        if (this.f9942o) {
            throw new IOException("closed");
        }
        if (!(j7 != 0 && j7 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j7).toString());
        }
        f(i7, 4, 8, 0);
        this.f9944q.G((int) j7);
        this.f9944q.flush();
    }

    public final synchronized void a(m mVar) {
        try {
            w5.k.f(mVar, "peerSettings");
            if (this.f9942o) {
                throw new IOException("closed");
            }
            this.f9941n = mVar.e(this.f9941n);
            if (mVar.b() != -1) {
                this.f9943p.e(mVar.b());
            }
            f(0, 0, 4, 1);
            this.f9944q.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f9942o) {
                throw new IOException("closed");
            }
            if (this.f9945r) {
                Logger logger = f9938s;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(U5.c.q(">> CONNECTION " + e.f9776a.r(), new Object[0]));
                }
                this.f9944q.H(e.f9776a);
                this.f9944q.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f9942o = true;
        this.f9944q.close();
    }

    public final synchronized void d(boolean z6, int i7, i6.f fVar, int i8) {
        if (this.f9942o) {
            throw new IOException("closed");
        }
        e(i7, z6 ? 1 : 0, fVar, i8);
    }

    public final void e(int i7, int i8, i6.f fVar, int i9) {
        f(i7, i9, 0, i8);
        if (i9 > 0) {
            i6.g gVar = this.f9944q;
            w5.k.c(fVar);
            gVar.w0(fVar, i9);
        }
    }

    public final void f(int i7, int i8, int i9, int i10) {
        Logger logger = f9938s;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.f9780e.c(false, i7, i8, i9, i10));
        }
        if (!(i8 <= this.f9941n)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f9941n + ": " + i8).toString());
        }
        if (!((((int) 2147483648L) & i7) == 0)) {
            throw new IllegalArgumentException(("reserved bit set: " + i7).toString());
        }
        U5.c.Y(this.f9944q, i8);
        this.f9944q.P(i9 & 255);
        this.f9944q.P(i10 & 255);
        this.f9944q.G(i7 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final synchronized void flush() {
        if (this.f9942o) {
            throw new IOException("closed");
        }
        this.f9944q.flush();
    }

    public final synchronized void g(int i7, b bVar, byte[] bArr) {
        try {
            w5.k.f(bVar, "errorCode");
            w5.k.f(bArr, "debugData");
            if (this.f9942o) {
                throw new IOException("closed");
            }
            if (!(bVar.e() != -1)) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            f(0, bArr.length + 8, 7, 0);
            this.f9944q.G(i7);
            this.f9944q.G(bVar.e());
            if (!(bArr.length == 0)) {
                this.f9944q.K0(bArr);
            }
            this.f9944q.flush();
        } finally {
        }
    }

    public final synchronized void j(boolean z6, int i7, List list) {
        w5.k.f(list, "headerBlock");
        if (this.f9942o) {
            throw new IOException("closed");
        }
        this.f9943p.g(list);
        long jM1 = this.f9940m.m1();
        long jMin = Math.min(this.f9941n, jM1);
        int i8 = jM1 == jMin ? 4 : 0;
        if (z6) {
            i8 |= 1;
        }
        f(i7, (int) jMin, 1, i8);
        this.f9944q.w0(this.f9940m, jMin);
        if (jM1 > jMin) {
            J(i7, jM1 - jMin);
        }
    }

    public final int l() {
        return this.f9941n;
    }

    public final synchronized void n(boolean z6, int i7, int i8) {
        if (this.f9942o) {
            throw new IOException("closed");
        }
        f(0, 8, 6, z6 ? 1 : 0);
        this.f9944q.G(i7);
        this.f9944q.G(i8);
        this.f9944q.flush();
    }

    public final synchronized void o(int i7, int i8, List list) {
        w5.k.f(list, "requestHeaders");
        if (this.f9942o) {
            throw new IOException("closed");
        }
        this.f9943p.g(list);
        long jM1 = this.f9940m.m1();
        int iMin = (int) Math.min(((long) this.f9941n) - 4, jM1);
        long j7 = iMin;
        f(i7, iMin + 4, 5, jM1 == j7 ? 4 : 0);
        this.f9944q.G(i8 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f9944q.w0(this.f9940m, j7);
        if (jM1 > j7) {
            J(i7, jM1 - j7);
        }
    }

    public final synchronized void w(int i7, b bVar) {
        w5.k.f(bVar, "errorCode");
        if (this.f9942o) {
            throw new IOException("closed");
        }
        if (!(bVar.e() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        f(i7, 4, 3, 0);
        this.f9944q.G(bVar.e());
        this.f9944q.flush();
    }

    public final synchronized void z(m mVar) {
        try {
            w5.k.f(mVar, "settings");
            if (this.f9942o) {
                throw new IOException("closed");
            }
            int i7 = 0;
            f(0, mVar.i() * 6, 4, 0);
            while (i7 < 10) {
                if (mVar.f(i7)) {
                    this.f9944q.C(i7 != 4 ? i7 != 7 ? i7 : 4 : 3);
                    this.f9944q.G(mVar.a(i7));
                }
                i7++;
            }
            this.f9944q.flush();
        } catch (Throwable th) {
            throw th;
        }
    }
}
