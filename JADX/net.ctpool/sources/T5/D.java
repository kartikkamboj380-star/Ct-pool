package T5;

import T5.t;
import j5.AbstractC1809n;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C0458d f3312m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final B f3313n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final A f3314o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f3315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f3316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final s f3317r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final t f3318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final E f3319t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final D f3320u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final D f3321v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final D f3322w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final long f3323x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final long f3324y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Y5.c f3325z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private B f3326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private A f3327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f3329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private s f3330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private t.a f3331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private E f3332g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private D f3333h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private D f3334i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private D f3335j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f3336k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f3337l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Y5.c f3338m;

        public a() {
            this.f3328c = -1;
            this.f3331f = new t.a();
        }

        private final void e(D d7) {
            if (d7 != null) {
                if (!(d7.a() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void f(String str, D d7) {
            if (d7 != null) {
                if (!(d7.a() == null)) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (!(d7.J() == null)) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (!(d7.d() == null)) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (d7.W() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public a a(String str, String str2) {
            w5.k.f(str, "name");
            w5.k.f(str2, "value");
            this.f3331f.a(str, str2);
            return this;
        }

        public a b(E e7) {
            this.f3332g = e7;
            return this;
        }

        public D c() {
            int i7 = this.f3328c;
            if (!(i7 >= 0)) {
                throw new IllegalStateException(("code < 0: " + this.f3328c).toString());
            }
            B b7 = this.f3326a;
            if (b7 == null) {
                throw new IllegalStateException("request == null".toString());
            }
            A a7 = this.f3327b;
            if (a7 == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f3329d;
            if (str != null) {
                return new D(b7, a7, str, i7, this.f3330e, this.f3331f.e(), this.f3332g, this.f3333h, this.f3334i, this.f3335j, this.f3336k, this.f3337l, this.f3338m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public a d(D d7) {
            f("cacheResponse", d7);
            this.f3334i = d7;
            return this;
        }

        public a g(int i7) {
            this.f3328c = i7;
            return this;
        }

        public final int h() {
            return this.f3328c;
        }

        public a i(s sVar) {
            this.f3330e = sVar;
            return this;
        }

        public a j(String str, String str2) {
            w5.k.f(str, "name");
            w5.k.f(str2, "value");
            this.f3331f.i(str, str2);
            return this;
        }

        public a k(t tVar) {
            w5.k.f(tVar, "headers");
            this.f3331f = tVar.i();
            return this;
        }

        public final void l(Y5.c cVar) {
            w5.k.f(cVar, "deferredTrailers");
            this.f3338m = cVar;
        }

        public a m(String str) {
            w5.k.f(str, "message");
            this.f3329d = str;
            return this;
        }

        public a n(D d7) {
            f("networkResponse", d7);
            this.f3333h = d7;
            return this;
        }

        public a o(D d7) {
            e(d7);
            this.f3335j = d7;
            return this;
        }

        public a p(A a7) {
            w5.k.f(a7, "protocol");
            this.f3327b = a7;
            return this;
        }

        public a q(long j7) {
            this.f3337l = j7;
            return this;
        }

        public a r(B b7) {
            w5.k.f(b7, "request");
            this.f3326a = b7;
            return this;
        }

        public a s(long j7) {
            this.f3336k = j7;
            return this;
        }

        public a(D d7) {
            w5.k.f(d7, "response");
            this.f3328c = -1;
            this.f3326a = d7.j0();
            this.f3327b = d7.a0();
            this.f3328c = d7.f();
            this.f3329d = d7.B();
            this.f3330e = d7.j();
            this.f3331f = d7.w().i();
            this.f3332g = d7.a();
            this.f3333h = d7.J();
            this.f3334i = d7.d();
            this.f3335j = d7.W();
            this.f3336k = d7.n0();
            this.f3337l = d7.h0();
            this.f3338m = d7.g();
        }
    }

    public D(B b7, A a7, String str, int i7, s sVar, t tVar, E e7, D d7, D d8, D d9, long j7, long j8, Y5.c cVar) {
        w5.k.f(b7, "request");
        w5.k.f(a7, "protocol");
        w5.k.f(str, "message");
        w5.k.f(tVar, "headers");
        this.f3313n = b7;
        this.f3314o = a7;
        this.f3315p = str;
        this.f3316q = i7;
        this.f3317r = sVar;
        this.f3318s = tVar;
        this.f3319t = e7;
        this.f3320u = d7;
        this.f3321v = d8;
        this.f3322w = d9;
        this.f3323x = j7;
        this.f3324y = j8;
        this.f3325z = cVar;
    }

    public static /* synthetic */ String o(D d7, String str, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        return d7.n(str, str2);
    }

    public final String B() {
        return this.f3315p;
    }

    public final D J() {
        return this.f3320u;
    }

    public final a U() {
        return new a(this);
    }

    public final D W() {
        return this.f3322w;
    }

    public final E a() {
        return this.f3319t;
    }

    public final A a0() {
        return this.f3314o;
    }

    public final C0458d b() {
        C0458d c0458d = this.f3312m;
        if (c0458d != null) {
            return c0458d;
        }
        C0458d c0458dB = C0458d.f3402p.b(this.f3318s);
        this.f3312m = c0458dB;
        return c0458dB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        E e7 = this.f3319t;
        if (e7 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        e7.close();
    }

    public final D d() {
        return this.f3321v;
    }

    public final List e() {
        String str;
        t tVar = this.f3318s;
        int i7 = this.f3316q;
        if (i7 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i7 != 407) {
                return AbstractC1809n.i();
            }
            str = "Proxy-Authenticate";
        }
        return Z5.e.a(tVar, str);
    }

    public final int f() {
        return this.f3316q;
    }

    public final Y5.c g() {
        return this.f3325z;
    }

    public final long h0() {
        return this.f3324y;
    }

    public final s j() {
        return this.f3317r;
    }

    public final B j0() {
        return this.f3313n;
    }

    public final String l(String str) {
        return o(this, str, null, 2, null);
    }

    public final String n(String str, String str2) {
        w5.k.f(str, "name");
        String strF = this.f3318s.f(str);
        return strF != null ? strF : str2;
    }

    public final long n0() {
        return this.f3323x;
    }

    public String toString() {
        return "Response{protocol=" + this.f3314o + ", code=" + this.f3316q + ", message=" + this.f3315p + ", url=" + this.f3313n.l() + '}';
    }

    public final t w() {
        return this.f3318s;
    }

    public final boolean z() {
        int i7 = this.f3316q;
        return 200 <= i7 && 299 >= i7;
    }
}
