package N4;

/* JADX INFO: renamed from: N4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0440b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f2327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f2328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0439a f2329f;

    public C0440b(String str, String str2, String str3, String str4, t tVar, C0439a c0439a) {
        w5.k.f(str, "appId");
        w5.k.f(str2, "deviceModel");
        w5.k.f(str3, "sessionSdkVersion");
        w5.k.f(str4, "osVersion");
        w5.k.f(tVar, "logEnvironment");
        w5.k.f(c0439a, "androidAppInfo");
        this.f2324a = str;
        this.f2325b = str2;
        this.f2326c = str3;
        this.f2327d = str4;
        this.f2328e = tVar;
        this.f2329f = c0439a;
    }

    public final C0439a a() {
        return this.f2329f;
    }

    public final String b() {
        return this.f2324a;
    }

    public final String c() {
        return this.f2325b;
    }

    public final t d() {
        return this.f2328e;
    }

    public final String e() {
        return this.f2327d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0440b)) {
            return false;
        }
        C0440b c0440b = (C0440b) obj;
        return w5.k.b(this.f2324a, c0440b.f2324a) && w5.k.b(this.f2325b, c0440b.f2325b) && w5.k.b(this.f2326c, c0440b.f2326c) && w5.k.b(this.f2327d, c0440b.f2327d) && this.f2328e == c0440b.f2328e && w5.k.b(this.f2329f, c0440b.f2329f);
    }

    public final String f() {
        return this.f2326c;
    }

    public int hashCode() {
        return (((((((((this.f2324a.hashCode() * 31) + this.f2325b.hashCode()) * 31) + this.f2326c.hashCode()) * 31) + this.f2327d.hashCode()) * 31) + this.f2328e.hashCode()) * 31) + this.f2329f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f2324a + ", deviceModel=" + this.f2325b + ", sessionSdkVersion=" + this.f2326c + ", osVersion=" + this.f2327d + ", logEnvironment=" + this.f2328e + ", androidAppInfo=" + this.f2329f + ')';
    }
}
