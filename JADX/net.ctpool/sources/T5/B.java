package T5;

import T5.t;
import com.google.android.gms.common.internal.ImagesContract;
import j5.AbstractC1787F;
import j5.AbstractC1809n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0458d f3294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f3295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f3297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C f3298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f3299f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u f3300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t.a f3302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C f3303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f3304e;

        public a() {
            this.f3304e = new LinkedHashMap();
            this.f3301b = "GET";
            this.f3302c = new t.a();
        }

        public a a(String str, String str2) {
            w5.k.f(str, "name");
            w5.k.f(str2, "value");
            this.f3302c.a(str, str2);
            return this;
        }

        public B b() {
            u uVar = this.f3300a;
            if (uVar != null) {
                return new B(uVar, this.f3301b, this.f3302c.e(), this.f3303d, U5.c.S(this.f3304e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public a c(C0458d c0458d) {
            w5.k.f(c0458d, "cacheControl");
            String string = c0458d.toString();
            return string.length() == 0 ? i("Cache-Control") : e("Cache-Control", string);
        }

        public a d() {
            return g("GET", null);
        }

        public a e(String str, String str2) {
            w5.k.f(str, "name");
            w5.k.f(str2, "value");
            this.f3302c.i(str, str2);
            return this;
        }

        public a f(t tVar) {
            w5.k.f(tVar, "headers");
            this.f3302c = tVar.i();
            return this;
        }

        public a g(String str, C c7) {
            w5.k.f(str, "method");
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (c7 == null) {
                if (!(true ^ Z5.f.e(str))) {
                    throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                }
            } else if (!Z5.f.b(str)) {
                throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
            }
            this.f3301b = str;
            this.f3303d = c7;
            return this;
        }

        public a h(C c7) {
            w5.k.f(c7, "body");
            return g("POST", c7);
        }

        public a i(String str) {
            w5.k.f(str, "name");
            this.f3302c.h(str);
            return this;
        }

        public a j(Class cls, Object obj) {
            w5.k.f(cls, "type");
            if (obj == null) {
                this.f3304e.remove(cls);
            } else {
                if (this.f3304e.isEmpty()) {
                    this.f3304e = new LinkedHashMap();
                }
                Map map = this.f3304e;
                Object objCast = cls.cast(obj);
                w5.k.c(objCast);
                map.put(cls, objCast);
            }
            return this;
        }

        public a k(Object obj) {
            return j(Object.class, obj);
        }

        public a l(u uVar) {
            w5.k.f(uVar, ImagesContract.URL);
            this.f3300a = uVar;
            return this;
        }

        public a m(String str) {
            StringBuilder sb;
            int i7;
            w5.k.f(str, ImagesContract.URL);
            if (!F5.g.z(str, "ws:", true)) {
                if (F5.g.z(str, "wss:", true)) {
                    sb = new StringBuilder();
                    sb.append("https:");
                    i7 = 4;
                }
                return l(u.f3622l.d(str));
            }
            sb = new StringBuilder();
            sb.append("http:");
            i7 = 3;
            String strSubstring = str.substring(i7);
            w5.k.e(strSubstring, "(this as java.lang.String).substring(startIndex)");
            sb.append(strSubstring);
            str = sb.toString();
            return l(u.f3622l.d(str));
        }

        public a(B b7) {
            w5.k.f(b7, "request");
            this.f3304e = new LinkedHashMap();
            this.f3300a = b7.l();
            this.f3301b = b7.h();
            this.f3303d = b7.a();
            this.f3304e = b7.c().isEmpty() ? new LinkedHashMap() : AbstractC1787F.s(b7.c());
            this.f3302c = b7.e().i();
        }
    }

    public B(u uVar, String str, t tVar, C c7, Map map) {
        w5.k.f(uVar, ImagesContract.URL);
        w5.k.f(str, "method");
        w5.k.f(tVar, "headers");
        w5.k.f(map, "tags");
        this.f3295b = uVar;
        this.f3296c = str;
        this.f3297d = tVar;
        this.f3298e = c7;
        this.f3299f = map;
    }

    public final C a() {
        return this.f3298e;
    }

    public final C0458d b() {
        C0458d c0458d = this.f3294a;
        if (c0458d != null) {
            return c0458d;
        }
        C0458d c0458dB = C0458d.f3402p.b(this.f3297d);
        this.f3294a = c0458dB;
        return c0458dB;
    }

    public final Map c() {
        return this.f3299f;
    }

    public final String d(String str) {
        w5.k.f(str, "name");
        return this.f3297d.f(str);
    }

    public final t e() {
        return this.f3297d;
    }

    public final List f(String str) {
        w5.k.f(str, "name");
        return this.f3297d.n(str);
    }

    public final boolean g() {
        return this.f3295b.i();
    }

    public final String h() {
        return this.f3296c;
    }

    public final a i() {
        return new a(this);
    }

    public final Object j() {
        return k(Object.class);
    }

    public final Object k(Class cls) {
        w5.k.f(cls, "type");
        return cls.cast(this.f3299f.get(cls));
    }

    public final u l() {
        return this.f3295b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f3296c);
        sb.append(", url=");
        sb.append(this.f3295b);
        if (this.f3297d.size() != 0) {
            sb.append(", headers=[");
            int i7 = 0;
            for (Object obj : this.f3297d) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    AbstractC1809n.p();
                }
                i5.l lVar = (i5.l) obj;
                String str = (String) lVar.a();
                String str2 = (String) lVar.b();
                if (i7 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i7 = i8;
            }
            sb.append(']');
        }
        if (!this.f3299f.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f3299f);
        }
        sb.append('}');
        String string = sb.toString();
        w5.k.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
