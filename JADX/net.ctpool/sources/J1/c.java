package J1;

import F1.e;
import J1.b;
import W0.f;
import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import x1.C2210a;
import x1.C2212c;
import x1.C2215f;
import x1.C2216g;
import x1.EnumC2214e;
import y1.l;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Set f1690s = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f1704n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1707q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f1691a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.c f1692b = b.c.FULL_FETCH;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1693c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2215f f1694d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2216g f1695e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2212c f1696f = C2212c.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.EnumC0030b f1697g = b.EnumC0030b.DEFAULT;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1698h = l.K().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1699i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1700j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private EnumC2214e f1701k = EnumC2214e.HIGH;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f1702l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f1703m = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C2210a f1705o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f1706p = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f1708r = null;

    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private c() {
    }

    private c A(int i7) {
        this.f1693c = i7;
        if (this.f1697g != b.EnumC0030b.DYNAMIC) {
            this.f1708r = null;
        }
        return this;
    }

    public static c b(b bVar) {
        return w(bVar.u()).D(bVar.g()).y(bVar.b()).z(bVar.c()).F(bVar.i()).E(bVar.h()).G(bVar.j()).A(bVar.d()).H(bVar.k()).I(bVar.o()).K(bVar.n()).L(bVar.q()).J(bVar.p()).M(bVar.s()).N(bVar.y()).B(bVar.e()).C(bVar.f());
    }

    public static boolean r(Uri uri) {
        Set set = f1690s;
        if (set != null && uri != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static c w(Uri uri) {
        return new c().O(uri);
    }

    public c B(int i7) {
        this.f1707q = i7;
        return this;
    }

    public c C(String str) {
        this.f1708r = str;
        return this;
    }

    public c D(C2212c c2212c) {
        this.f1696f = c2212c;
        return this;
    }

    public c E(boolean z6) {
        this.f1700j = z6;
        return this;
    }

    public c F(boolean z6) {
        this.f1699i = z6;
        return this;
    }

    public c G(b.c cVar) {
        this.f1692b = cVar;
        return this;
    }

    public c H(d dVar) {
        this.f1702l = dVar;
        return this;
    }

    public c I(boolean z6) {
        this.f1698h = z6;
        return this;
    }

    public c J(e eVar) {
        this.f1704n = eVar;
        return this;
    }

    public c K(EnumC2214e enumC2214e) {
        this.f1701k = enumC2214e;
        return this;
    }

    public c L(C2215f c2215f) {
        this.f1694d = c2215f;
        return this;
    }

    public c M(C2216g c2216g) {
        this.f1695e = c2216g;
        return this;
    }

    public c N(Boolean bool) {
        this.f1703m = bool;
        return this;
    }

    public c O(Uri uri) {
        O0.l.g(uri);
        this.f1691a = uri;
        return this;
    }

    public Boolean P() {
        return this.f1703m;
    }

    protected void Q() {
        Uri uri = this.f1691a;
        if (uri == null) {
            throw new a("Source must be set!");
        }
        if (f.m(uri)) {
            if (!this.f1691a.isAbsolute()) {
                throw new a("Resource URI path must be absolute.");
            }
            if (this.f1691a.getPath().isEmpty()) {
                throw new a("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f1691a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new a("Resource URI path must be a resource id.");
            }
        }
        if (f.h(this.f1691a) && !this.f1691a.isAbsolute()) {
            throw new a("Asset URI path must be absolute.");
        }
        if (this.f1697g == b.EnumC0030b.DYNAMIC) {
            if (this.f1708r == null) {
                throw new a("Disk cache id must be set for dynamic cache choice");
            }
        } else {
            String str = this.f1708r;
            if (str != null && str.length() != 0) {
                throw new a("Ensure that if you want to use a disk cache id, you set the CacheChoice to DYNAMIC");
            }
        }
    }

    public b a() {
        Q();
        return new b(this);
    }

    public C2210a c() {
        return this.f1705o;
    }

    public b.EnumC0030b d() {
        return this.f1697g;
    }

    public int e() {
        return this.f1693c;
    }

    public int f() {
        return this.f1707q;
    }

    public String g() {
        return this.f1708r;
    }

    public C2212c h() {
        return this.f1696f;
    }

    public boolean i() {
        return this.f1700j;
    }

    public b.c j() {
        return this.f1692b;
    }

    public d k() {
        return this.f1702l;
    }

    public e l() {
        return this.f1704n;
    }

    public EnumC2214e m() {
        return this.f1701k;
    }

    public C2215f n() {
        return this.f1694d;
    }

    public Boolean o() {
        return this.f1706p;
    }

    public C2216g p() {
        return this.f1695e;
    }

    public Uri q() {
        return this.f1691a;
    }

    public boolean s() {
        return (this.f1693c & 48) == 0 && (f.n(this.f1691a) || r(this.f1691a));
    }

    public boolean t() {
        return this.f1699i;
    }

    public boolean u() {
        return (this.f1693c & 15) == 0;
    }

    public boolean v() {
        return this.f1698h;
    }

    public c x(boolean z6) {
        return M(z6 ? C2216g.c() : C2216g.e());
    }

    public c y(C2210a c2210a) {
        this.f1705o = c2210a;
        return this;
    }

    public c z(b.EnumC0030b enumC0030b) {
        this.f1697g = enumC0030b;
        return this;
    }
}
