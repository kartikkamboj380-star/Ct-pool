package h6;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import i6.f;
import i6.i;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final boolean f19890A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final boolean f19891B;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19893n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f19894o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f19896q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f19897r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final i6.f f19898s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final i6.f f19899t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f19900u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final byte[] f19901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final f.a f19902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f19903x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final i6.h f19904y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final a f19905z;

    public interface a {
        void a(i iVar);

        void d(i iVar);

        void e(String str);

        void g(i iVar);

        void h(int i7, String str);
    }

    public g(boolean z6, i6.h hVar, a aVar, boolean z7, boolean z8) {
        k.f(hVar, "source");
        k.f(aVar, "frameCallback");
        this.f19903x = z6;
        this.f19904y = hVar;
        this.f19905z = aVar;
        this.f19890A = z7;
        this.f19891B = z8;
        this.f19898s = new i6.f();
        this.f19899t = new i6.f();
        this.f19901v = z6 ? null : new byte[4];
        this.f19902w = z6 ? null : new f.a();
    }

    private final void b() throws ProtocolException, EOFException {
        short sO0;
        String strJ0;
        long j7 = this.f19894o;
        if (j7 > 0) {
            this.f19904y.m0(this.f19898s, j7);
            if (!this.f19903x) {
                i6.f fVar = this.f19898s;
                f.a aVar = this.f19902w;
                k.c(aVar);
                fVar.R0(aVar);
                this.f19902w.d(0L);
                f fVar2 = f.f19889a;
                f.a aVar2 = this.f19902w;
                byte[] bArr = this.f19901v;
                k.c(bArr);
                fVar2.b(aVar2, bArr);
                this.f19902w.close();
            }
        }
        switch (this.f19893n) {
            case 8:
                long jM1 = this.f19898s.m1();
                if (jM1 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (jM1 != 0) {
                    sO0 = this.f19898s.O0();
                    strJ0 = this.f19898s.J0();
                    String strA = f.f19889a.a(sO0);
                    if (strA != null) {
                        throw new ProtocolException(strA);
                    }
                } else {
                    sO0 = 1005;
                    strJ0 = "";
                }
                this.f19905z.h(sO0, strJ0);
                this.f19892m = true;
                return;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                this.f19905z.d(this.f19898s.f1());
                return;
            case 10:
                this.f19905z.g(this.f19898s.f1());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + U5.c.N(this.f19893n));
        }
    }

    private final void d() throws IOException {
        boolean z6;
        if (this.f19892m) {
            throw new IOException("closed");
        }
        long jH = this.f19904y.i().h();
        this.f19904y.i().b();
        try {
            int iB = U5.c.b(this.f19904y.q0(), 255);
            this.f19904y.i().g(jH, TimeUnit.NANOSECONDS);
            int i7 = iB & 15;
            this.f19893n = i7;
            boolean z7 = (iB & 128) != 0;
            this.f19895p = z7;
            boolean z8 = (iB & 8) != 0;
            this.f19896q = z8;
            if (z8 && !z7) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z9 = (iB & 64) != 0;
            if (i7 == 1 || i7 == 2) {
                if (!z9) {
                    z6 = false;
                } else {
                    if (!this.f19890A) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z6 = true;
                }
                this.f19897r = z6;
            } else if (z9) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iB & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iB & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iB2 = U5.c.b(this.f19904y.q0(), 255);
            boolean z10 = (iB2 & 128) != 0;
            if (z10 == this.f19903x) {
                throw new ProtocolException(this.f19903x ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j7 = iB2 & ModuleDescriptor.MODULE_VERSION;
            this.f19894o = j7;
            if (j7 == 126) {
                this.f19894o = U5.c.c(this.f19904y.O0(), 65535);
            } else if (j7 == ModuleDescriptor.MODULE_VERSION) {
                long jK = this.f19904y.K();
                this.f19894o = jK;
                if (jK < 0) {
                    throw new ProtocolException("Frame length 0x" + U5.c.O(this.f19894o) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f19896q && this.f19894o > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z10) {
                i6.h hVar = this.f19904y;
                byte[] bArr = this.f19901v;
                k.c(bArr);
                hVar.u0(bArr);
            }
        } catch (Throwable th) {
            this.f19904y.i().g(jH, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void e() throws IOException {
        while (!this.f19892m) {
            long j7 = this.f19894o;
            if (j7 > 0) {
                this.f19904y.m0(this.f19899t, j7);
                if (!this.f19903x) {
                    i6.f fVar = this.f19899t;
                    f.a aVar = this.f19902w;
                    k.c(aVar);
                    fVar.R0(aVar);
                    this.f19902w.d(this.f19899t.m1() - this.f19894o);
                    f fVar2 = f.f19889a;
                    f.a aVar2 = this.f19902w;
                    byte[] bArr = this.f19901v;
                    k.c(bArr);
                    fVar2.b(aVar2, bArr);
                    this.f19902w.close();
                }
            }
            if (this.f19895p) {
                return;
            }
            g();
            if (this.f19893n != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + U5.c.N(this.f19893n));
            }
        }
        throw new IOException("closed");
    }

    private final void f() throws IOException {
        int i7 = this.f19893n;
        if (i7 != 1 && i7 != 2) {
            throw new ProtocolException("Unknown opcode: " + U5.c.N(i7));
        }
        e();
        if (this.f19897r) {
            c cVar = this.f19900u;
            if (cVar == null) {
                cVar = new c(this.f19891B);
                this.f19900u = cVar;
            }
            cVar.a(this.f19899t);
        }
        if (i7 == 1) {
            this.f19905z.e(this.f19899t.J0());
        } else {
            this.f19905z.a(this.f19899t.f1());
        }
    }

    private final void g() throws IOException {
        while (!this.f19892m) {
            d();
            if (!this.f19896q) {
                return;
            } else {
                b();
            }
        }
    }

    public final void a() {
        d();
        if (this.f19896q) {
            b();
        } else {
            f();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c cVar = this.f19900u;
        if (cVar != null) {
            cVar.close();
        }
    }
}
