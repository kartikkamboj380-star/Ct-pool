package T5;

import T5.x;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends C {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x f3650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f3651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x f3652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f3653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x f3654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f3655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f3656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f3657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f3658o = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f3659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f3660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i6.i f3661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f3662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f3663f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i6.i f3664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private x f3665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f3666c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(t tVar, C c7) {
            w5.k.f(c7, "body");
            b(c.f3667c.a(tVar, c7));
            return this;
        }

        public final a b(c cVar) {
            w5.k.f(cVar, "part");
            this.f3666c.add(cVar);
            return this;
        }

        public final y c() {
            if (!this.f3666c.isEmpty()) {
                return new y(this.f3664a, this.f3665b, U5.c.R(this.f3666c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final a d(x xVar) {
            w5.k.f(xVar, "type");
            if (w5.k.b(xVar.g(), "multipart")) {
                this.f3665b = xVar;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + xVar).toString());
        }

        public a(String str) {
            w5.k.f(str, "boundary");
            this.f3664a = i6.i.f20019q.d(str);
            this.f3665b = y.f3650g;
            this.f3666c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i7 & 1) != 0) {
                str = UUID.randomUUID().toString();
                w5.k.e(str, "UUID.randomUUID().toString()");
            }
            this(str);
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

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f3667c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f3668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C f3669b;

        public static final class a {
            private a() {
            }

            public final c a(t tVar, C c7) {
                w5.k.f(c7, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (!((tVar != null ? tVar.f("Content-Type") : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((tVar != null ? tVar.f("Content-Length") : null) == null) {
                    return new c(tVar, c7, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private c(t tVar, C c7) {
            this.f3668a = tVar;
            this.f3669b = c7;
        }

        public final C a() {
            return this.f3669b;
        }

        public final t b() {
            return this.f3668a;
        }

        public /* synthetic */ c(t tVar, C c7, DefaultConstructorMarker defaultConstructorMarker) {
            this(tVar, c7);
        }
    }

    static {
        x.a aVar = x.f3645g;
        f3650g = aVar.a("multipart/mixed");
        f3651h = aVar.a("multipart/alternative");
        f3652i = aVar.a("multipart/digest");
        f3653j = aVar.a("multipart/parallel");
        f3654k = aVar.a("multipart/form-data");
        f3655l = new byte[]{(byte) 58, (byte) 32};
        f3656m = new byte[]{(byte) 13, (byte) 10};
        byte b7 = (byte) 45;
        f3657n = new byte[]{b7, b7};
    }

    public y(i6.i iVar, x xVar, List list) {
        w5.k.f(iVar, "boundaryByteString");
        w5.k.f(xVar, "type");
        w5.k.f(list, "parts");
        this.f3661d = iVar;
        this.f3662e = xVar;
        this.f3663f = list;
        this.f3659b = x.f3645g.a(xVar + "; boundary=" + i());
        this.f3660c = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long j(i6.g gVar, boolean z6) throws EOFException {
        i6.f fVar;
        if (z6) {
            gVar = new i6.f();
            fVar = gVar;
        } else {
            fVar = 0;
        }
        int size = this.f3663f.size();
        long j7 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            c cVar = (c) this.f3663f.get(i7);
            t tVarB = cVar.b();
            C cA = cVar.a();
            w5.k.c(gVar);
            gVar.K0(f3657n);
            gVar.H(this.f3661d);
            gVar.K0(f3656m);
            if (tVarB != null) {
                int size2 = tVarB.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    gVar.k0(tVarB.h(i8)).K0(f3655l).k0(tVarB.m(i8)).K0(f3656m);
                }
            }
            x xVarB = cA.b();
            if (xVarB != null) {
                gVar.k0("Content-Type: ").k0(xVarB.toString()).K0(f3656m);
            }
            long jA = cA.a();
            if (jA != -1) {
                gVar.k0("Content-Length: ").X0(jA).K0(f3656m);
            } else if (z6) {
                w5.k.c(fVar);
                fVar.a();
                return -1L;
            }
            byte[] bArr = f3656m;
            gVar.K0(bArr);
            if (z6) {
                j7 += jA;
            } else {
                cA.h(gVar);
            }
            gVar.K0(bArr);
        }
        w5.k.c(gVar);
        byte[] bArr2 = f3657n;
        gVar.K0(bArr2);
        gVar.H(this.f3661d);
        gVar.K0(bArr2);
        gVar.K0(f3656m);
        if (!z6) {
            return j7;
        }
        w5.k.c(fVar);
        long jM1 = j7 + fVar.m1();
        fVar.a();
        return jM1;
    }

    @Override // T5.C
    public long a() throws EOFException {
        long j7 = this.f3660c;
        if (j7 != -1) {
            return j7;
        }
        long j8 = j(null, true);
        this.f3660c = j8;
        return j8;
    }

    @Override // T5.C
    public x b() {
        return this.f3659b;
    }

    @Override // T5.C
    public void h(i6.g gVar) throws EOFException {
        w5.k.f(gVar, "sink");
        j(gVar, false);
    }

    public final String i() {
        return this.f3661d.G();
    }
}
