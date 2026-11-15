package h6;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import i6.f;
import i6.i;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i6.f f19906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final i6.f f19907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f19909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final byte[] f19910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f.a f19911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f19912s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final i6.g f19913t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Random f19914u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f19915v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f19916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final long f19917x;

    public h(boolean z6, i6.g gVar, Random random, boolean z7, boolean z8, long j7) {
        k.f(gVar, "sink");
        k.f(random, "random");
        this.f19912s = z6;
        this.f19913t = gVar;
        this.f19914u = random;
        this.f19915v = z7;
        this.f19916w = z8;
        this.f19917x = j7;
        this.f19906m = new i6.f();
        this.f19907n = gVar.h();
        this.f19910q = z6 ? new byte[4] : null;
        this.f19911r = z6 ? new f.a() : null;
    }

    private final void b(int i7, i iVar) throws IOException {
        if (this.f19908o) {
            throw new IOException("closed");
        }
        int iC = iVar.C();
        if (!(((long) iC) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.f19907n.P(i7 | 128);
        if (this.f19912s) {
            this.f19907n.P(iC | 128);
            Random random = this.f19914u;
            byte[] bArr = this.f19910q;
            k.c(bArr);
            random.nextBytes(bArr);
            this.f19907n.K0(this.f19910q);
            if (iC > 0) {
                long jM1 = this.f19907n.m1();
                this.f19907n.H(iVar);
                i6.f fVar = this.f19907n;
                f.a aVar = this.f19911r;
                k.c(aVar);
                fVar.R0(aVar);
                this.f19911r.d(jM1);
                f.f19889a.b(this.f19911r, this.f19910q);
                this.f19911r.close();
            }
        } else {
            this.f19907n.P(iC);
            this.f19907n.H(iVar);
        }
        this.f19913t.flush();
    }

    public final void a(int i7, i iVar) {
        i iVarF1 = i.f20018p;
        if (i7 != 0 || iVar != null) {
            if (i7 != 0) {
                f.f19889a.c(i7);
            }
            i6.f fVar = new i6.f();
            fVar.C(i7);
            if (iVar != null) {
                fVar.H(iVar);
            }
            iVarF1 = fVar.f1();
        }
        try {
            b(8, iVarF1);
        } finally {
            this.f19908o = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        a aVar = this.f19909p;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void d(int i7, i iVar) throws IOException {
        k.f(iVar, "data");
        if (this.f19908o) {
            throw new IOException("closed");
        }
        this.f19906m.H(iVar);
        int i8 = i7 | 128;
        if (this.f19915v && iVar.C() >= this.f19917x) {
            a aVar = this.f19909p;
            if (aVar == null) {
                aVar = new a(this.f19916w);
                this.f19909p = aVar;
            }
            aVar.a(this.f19906m);
            i8 = i7 | 192;
        }
        long jM1 = this.f19906m.m1();
        this.f19907n.P(i8);
        int i9 = this.f19912s ? 128 : 0;
        if (jM1 <= 125) {
            this.f19907n.P(i9 | ((int) jM1));
        } else if (jM1 <= 65535) {
            this.f19907n.P(i9 | 126);
            this.f19907n.C((int) jM1);
        } else {
            this.f19907n.P(i9 | ModuleDescriptor.MODULE_VERSION);
            this.f19907n.x1(jM1);
        }
        if (this.f19912s) {
            Random random = this.f19914u;
            byte[] bArr = this.f19910q;
            k.c(bArr);
            random.nextBytes(bArr);
            this.f19907n.K0(this.f19910q);
            if (jM1 > 0) {
                i6.f fVar = this.f19906m;
                f.a aVar2 = this.f19911r;
                k.c(aVar2);
                fVar.R0(aVar2);
                this.f19911r.d(0L);
                f.f19889a.b(this.f19911r, this.f19910q);
                this.f19911r.close();
            }
        }
        this.f19907n.w0(this.f19906m, jM1);
        this.f19913t.A();
    }

    public final void e(i iVar) throws IOException {
        k.f(iVar, "payload");
        b(9, iVar);
    }

    public final void f(i iVar) throws IOException {
        k.f(iVar, "payload");
        b(10, iVar);
    }
}
