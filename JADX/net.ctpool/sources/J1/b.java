package J1;

import O0.e;
import O0.j;
import O0.l;
import W0.f;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import x1.C2210a;
import x1.C2212c;
import x1.C2215f;
import x1.C2216g;
import x1.EnumC2214e;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static boolean f1654x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static boolean f1655y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e f1656z = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC0030b f1658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f1659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f1661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f1662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f1663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f1664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C2212c f1665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C2215f f1666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C2216g f1667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C2210a f1668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final EnumC2214e f1669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f1670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f1671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f1672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f1673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Boolean f1674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final d f1675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final F1.e f1676t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Boolean f1677u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f1678v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f1679w;

    class a implements e {
        a() {
        }

        @Override // O0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uri apply(b bVar) {
            if (bVar != null) {
                return bVar.u();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: J1.b$b, reason: collision with other inner class name */
    public enum EnumC0030b {
        SMALL,
        DEFAULT,
        DYNAMIC
    }

    public enum c {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f1689m;

        c(int i7) {
            this.f1689m = i7;
        }

        public static c e(c cVar, c cVar2) {
            return cVar.h() > cVar2.h() ? cVar : cVar2;
        }

        public int h() {
            return this.f1689m;
        }
    }

    protected b(J1.c cVar) {
        this.f1658b = cVar.d();
        Uri uriQ = cVar.q();
        this.f1659c = uriQ;
        this.f1660d = w(uriQ);
        this.f1662f = cVar.v();
        this.f1663g = cVar.t();
        this.f1664h = cVar.i();
        this.f1665i = cVar.h();
        this.f1666j = cVar.n();
        this.f1667k = cVar.p() == null ? C2216g.c() : cVar.p();
        this.f1668l = cVar.c();
        this.f1669m = cVar.m();
        this.f1670n = cVar.j();
        boolean zS = cVar.s();
        this.f1672p = zS;
        int iE = cVar.e();
        this.f1671o = zS ? iE : iE | 48;
        this.f1673q = cVar.u();
        this.f1674r = cVar.P();
        this.f1675s = cVar.k();
        this.f1676t = cVar.l();
        this.f1677u = cVar.o();
        this.f1679w = cVar.f();
        this.f1678v = cVar.g();
    }

    public static b a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return J1.c.w(uri).a();
    }

    private static int w(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (f.n(uri)) {
            return 0;
        }
        if (uri.getPath() != null && f.l(uri)) {
            return Q0.a.c(Q0.a.b(uri.getPath())) ? 2 : 3;
        }
        if (f.k(uri)) {
            return 4;
        }
        if (f.h(uri)) {
            return 5;
        }
        if (f.m(uri)) {
            return 6;
        }
        if (f.g(uri)) {
            return 7;
        }
        return f.o(uri) ? 8 : -1;
    }

    public C2210a b() {
        return this.f1668l;
    }

    public EnumC0030b c() {
        return this.f1658b;
    }

    public int d() {
        return this.f1671o;
    }

    public int e() {
        return this.f1679w;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (f1654x) {
            int i7 = this.f1657a;
            int i8 = bVar.f1657a;
            if (i7 != 0 && i8 != 0 && i7 != i8) {
                return false;
            }
        }
        if (this.f1663g != bVar.f1663g || this.f1672p != bVar.f1672p || this.f1673q != bVar.f1673q || !j.a(this.f1659c, bVar.f1659c) || !j.a(this.f1658b, bVar.f1658b) || !j.a(this.f1678v, bVar.f1678v) || !j.a(this.f1661e, bVar.f1661e) || !j.a(this.f1668l, bVar.f1668l) || !j.a(this.f1665i, bVar.f1665i) || !j.a(this.f1666j, bVar.f1666j) || !j.a(this.f1669m, bVar.f1669m) || !j.a(this.f1670n, bVar.f1670n) || !j.a(Integer.valueOf(this.f1671o), Integer.valueOf(bVar.f1671o)) || !j.a(this.f1674r, bVar.f1674r) || !j.a(this.f1677u, bVar.f1677u) || !j.a(this.f1667k, bVar.f1667k) || this.f1664h != bVar.f1664h) {
            return false;
        }
        d dVar = this.f1675s;
        I0.d dVarB = dVar != null ? dVar.b() : null;
        d dVar2 = bVar.f1675s;
        return j.a(dVarB, dVar2 != null ? dVar2.b() : null) && this.f1679w == bVar.f1679w;
    }

    public String f() {
        return this.f1678v;
    }

    public C2212c g() {
        return this.f1665i;
    }

    public boolean h() {
        return Build.VERSION.SDK_INT >= 29 && this.f1664h;
    }

    public int hashCode() {
        boolean z6 = f1655y;
        int iB = z6 ? this.f1657a : 0;
        if (iB == 0) {
            d dVar = this.f1675s;
            I0.d dVarB = dVar != null ? dVar.b() : null;
            iB = !P1.a.a() ? j.b(this.f1658b, this.f1678v, this.f1659c, Boolean.valueOf(this.f1663g), this.f1668l, this.f1669m, this.f1670n, Integer.valueOf(this.f1671o), Boolean.valueOf(this.f1672p), Boolean.valueOf(this.f1673q), this.f1665i, this.f1674r, this.f1666j, this.f1667k, dVarB, this.f1677u, Integer.valueOf(this.f1679w), Boolean.valueOf(this.f1664h)) : Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(Q1.a.a(0, this.f1658b), this.f1659c), Boolean.valueOf(this.f1663g)), this.f1668l), this.f1669m), this.f1670n), Integer.valueOf(this.f1671o)), Boolean.valueOf(this.f1672p)), Boolean.valueOf(this.f1673q)), this.f1665i), this.f1674r), this.f1666j), this.f1667k), dVarB), this.f1677u), Integer.valueOf(this.f1679w)), Boolean.valueOf(this.f1664h));
            if (z6) {
                this.f1657a = iB;
            }
        }
        return iB;
    }

    public boolean i() {
        return this.f1663g;
    }

    public c j() {
        return this.f1670n;
    }

    public d k() {
        return this.f1675s;
    }

    public int l() {
        C2215f c2215f = this.f1666j;
        if (c2215f != null) {
            return c2215f.f22825b;
        }
        return 2048;
    }

    public int m() {
        C2215f c2215f = this.f1666j;
        if (c2215f != null) {
            return c2215f.f22824a;
        }
        return 2048;
    }

    public EnumC2214e n() {
        return this.f1669m;
    }

    public boolean o() {
        return this.f1662f;
    }

    public F1.e p() {
        return this.f1676t;
    }

    public C2215f q() {
        return this.f1666j;
    }

    public Boolean r() {
        return this.f1677u;
    }

    public C2216g s() {
        return this.f1667k;
    }

    public synchronized File t() {
        try {
            if (this.f1661e == null) {
                l.g(this.f1659c.getPath());
                this.f1661e = new File(this.f1659c.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1661e;
    }

    public String toString() {
        return j.c(this).b("uri", this.f1659c).b("cacheChoice", this.f1658b).b("decodeOptions", this.f1665i).b("postprocessor", this.f1675s).b("priority", this.f1669m).b("resizeOptions", this.f1666j).b("rotationOptions", this.f1667k).b("bytesRange", this.f1668l).b("resizingAllowedOverride", this.f1677u).c("progressiveRenderingEnabled", this.f1662f).c("localThumbnailPreviewsEnabled", this.f1663g).c("loadThumbnailOnly", this.f1664h).b("lowestPermittedRequestLevel", this.f1670n).a("cachesDisabled", this.f1671o).c("isDiskCacheEnabled", this.f1672p).c("isMemoryCacheEnabled", this.f1673q).b("decodePrefetches", this.f1674r).a("delayMs", this.f1679w).toString();
    }

    public Uri u() {
        return this.f1659c;
    }

    public int v() {
        return this.f1660d;
    }

    public boolean x(int i7) {
        return (i7 & d()) == 0;
    }

    public Boolean y() {
        return this.f1674r;
    }
}
