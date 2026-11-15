package t4;

import android.net.Uri;
import android.os.Bundle;
import u4.C2141g;
import z3.AbstractC2272l;

/* JADX INFO: renamed from: t4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2066a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f22319a;

    /* JADX INFO: renamed from: t4.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f22320a;

        /* JADX INFO: renamed from: t4.a$b$a, reason: collision with other inner class name */
        public static final class C0314a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Bundle f22321a;

            public C0314a(String str) {
                Bundle bundle = new Bundle();
                this.f22321a = bundle;
                bundle.putString("apn", str);
            }

            public b a() {
                return new b(this.f22321a);
            }

            public C0314a b(Uri uri) {
                this.f22321a.putParcelable("afl", uri);
                return this;
            }

            public C0314a c(int i7) {
                this.f22321a.putInt("amv", i7);
                return this;
            }
        }

        private b(Bundle bundle) {
            this.f22320a = bundle;
        }
    }

    /* JADX INFO: renamed from: t4.a$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C2141g f22322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f22323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f22324c;

        public c(C2141g c2141g) {
            this.f22322a = c2141g;
            Bundle bundle = new Bundle();
            this.f22323b = bundle;
            bundle.putString("apiKey", c2141g.h().r().b());
            Bundle bundle2 = new Bundle();
            this.f22324c = bundle2;
            bundle.putBundle("parameters", bundle2);
        }

        private void m() {
            if (this.f22323b.getString("apiKey") == null) {
                throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
            }
        }

        public C2066a a() {
            C2141g.j(this.f22323b);
            return new C2066a(this.f22323b);
        }

        public AbstractC2272l b() {
            m();
            return this.f22322a.g(this.f22323b);
        }

        public AbstractC2272l c(int i7) {
            m();
            this.f22323b.putInt("suffix", i7);
            return this.f22322a.g(this.f22323b);
        }

        public c d(b bVar) {
            this.f22324c.putAll(bVar.f22320a);
            return this;
        }

        public c e(String str) {
            if (str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$") || str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$")) {
                this.f22323b.putString("domain", str.replace("https://", ""));
            }
            this.f22323b.putString("domainUriPrefix", str);
            return this;
        }

        public c f(d dVar) {
            this.f22324c.putAll(dVar.f22325a);
            return this;
        }

        public c g(e eVar) {
            this.f22324c.putAll(eVar.f22327a);
            return this;
        }

        public c h(f fVar) {
            this.f22324c.putAll(fVar.f22329a);
            return this;
        }

        public c i(Uri uri) {
            this.f22324c.putParcelable("link", uri);
            return this;
        }

        public c j(Uri uri) {
            this.f22323b.putParcelable("dynamicLink", uri);
            return this;
        }

        public c k(g gVar) {
            this.f22324c.putAll(gVar.f22331a);
            return this;
        }

        public c l(h hVar) {
            this.f22324c.putAll(hVar.f22333a);
            return this;
        }
    }

    /* JADX INFO: renamed from: t4.a$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Bundle f22325a;

        /* JADX INFO: renamed from: t4.a$d$a, reason: collision with other inner class name */
        public static final class C0315a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Bundle f22326a = new Bundle();

            public d a() {
                return new d(this.f22326a);
            }

            public C0315a b(String str) {
                this.f22326a.putString("utm_campaign", str);
                return this;
            }

            public C0315a c(String str) {
                this.f22326a.putString("utm_content", str);
                return this;
            }

            public C0315a d(String str) {
                this.f22326a.putString("utm_medium", str);
                return this;
            }

            public C0315a e(String str) {
                this.f22326a.putString("utm_source", str);
                return this;
            }

            public C0315a f(String str) {
                this.f22326a.putString("utm_term", str);
                return this;
            }
        }

        private d(Bundle bundle) {
            this.f22325a = bundle;
        }
    }

    /* JADX INFO: renamed from: t4.a$e */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f22327a;

        /* JADX INFO: renamed from: t4.a$e$a, reason: collision with other inner class name */
        public static final class C0316a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Bundle f22328a;

            public C0316a(String str) {
                Bundle bundle = new Bundle();
                this.f22328a = bundle;
                bundle.putString("ibi", str);
            }

            public e a() {
                return new e(this.f22328a);
            }

            public C0316a b(String str) {
                this.f22328a.putString("isi", str);
                return this;
            }

            public C0316a c(String str) {
                this.f22328a.putString("ius", str);
                return this;
            }

            public C0316a d(Uri uri) {
                this.f22328a.putParcelable("ifl", uri);
                return this;
            }

            public C0316a e(String str) {
                this.f22328a.putString("ipbi", str);
                return this;
            }

            public C0316a f(Uri uri) {
                this.f22328a.putParcelable("ipfl", uri);
                return this;
            }

            public C0316a g(String str) {
                this.f22328a.putString("imv", str);
                return this;
            }
        }

        private e(Bundle bundle) {
            this.f22327a = bundle;
        }
    }

    /* JADX INFO: renamed from: t4.a$f */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f22329a;

        /* JADX INFO: renamed from: t4.a$f$a, reason: collision with other inner class name */
        public static final class C0317a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Bundle f22330a = new Bundle();

            public f a() {
                return new f(this.f22330a);
            }

            public C0317a b(String str) {
                this.f22330a.putString("at", str);
                return this;
            }

            public C0317a c(String str) {
                this.f22330a.putString("ct", str);
                return this;
            }

            public C0317a d(String str) {
                this.f22330a.putString("pt", str);
                return this;
            }
        }

        private f(Bundle bundle) {
            this.f22329a = bundle;
        }
    }

    /* JADX INFO: renamed from: t4.a$g */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f22331a;

        /* JADX INFO: renamed from: t4.a$g$a, reason: collision with other inner class name */
        public static final class C0318a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Bundle f22332a = new Bundle();

            public g a() {
                return new g(this.f22332a);
            }

            public C0318a b(boolean z6) {
                this.f22332a.putInt("efr", z6 ? 1 : 0);
                return this;
            }
        }

        private g(Bundle bundle) {
            this.f22331a = bundle;
        }
    }

    /* JADX INFO: renamed from: t4.a$h */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f22333a;

        /* JADX INFO: renamed from: t4.a$h$a, reason: collision with other inner class name */
        public static final class C0319a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Bundle f22334a = new Bundle();

            public h a() {
                return new h(this.f22334a);
            }

            public C0319a b(String str) {
                this.f22334a.putString("sd", str);
                return this;
            }

            public C0319a c(Uri uri) {
                this.f22334a.putParcelable("si", uri);
                return this;
            }

            public C0319a d(String str) {
                this.f22334a.putString("st", str);
                return this;
            }
        }

        private h(Bundle bundle) {
            this.f22333a = bundle;
        }
    }

    C2066a(Bundle bundle) {
        this.f22319a = bundle;
    }

    public Uri a() {
        return C2141g.f(this.f22319a);
    }
}
