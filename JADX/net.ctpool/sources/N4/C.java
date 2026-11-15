package N4;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f2295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0443e f2296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f2297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f2298g;

    public C(String str, String str2, int i7, long j7, C0443e c0443e, String str3, String str4) {
        w5.k.f(str, "sessionId");
        w5.k.f(str2, "firstSessionId");
        w5.k.f(c0443e, "dataCollectionStatus");
        w5.k.f(str3, "firebaseInstallationId");
        w5.k.f(str4, "firebaseAuthenticationToken");
        this.f2292a = str;
        this.f2293b = str2;
        this.f2294c = i7;
        this.f2295d = j7;
        this.f2296e = c0443e;
        this.f2297f = str3;
        this.f2298g = str4;
    }

    public final C0443e a() {
        return this.f2296e;
    }

    public final long b() {
        return this.f2295d;
    }

    public final String c() {
        return this.f2298g;
    }

    public final String d() {
        return this.f2297f;
    }

    public final String e() {
        return this.f2293b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c7 = (C) obj;
        return w5.k.b(this.f2292a, c7.f2292a) && w5.k.b(this.f2293b, c7.f2293b) && this.f2294c == c7.f2294c && this.f2295d == c7.f2295d && w5.k.b(this.f2296e, c7.f2296e) && w5.k.b(this.f2297f, c7.f2297f) && w5.k.b(this.f2298g, c7.f2298g);
    }

    public final String f() {
        return this.f2292a;
    }

    public final int g() {
        return this.f2294c;
    }

    public int hashCode() {
        return (((((((((((this.f2292a.hashCode() * 31) + this.f2293b.hashCode()) * 31) + Integer.hashCode(this.f2294c)) * 31) + Long.hashCode(this.f2295d)) * 31) + this.f2296e.hashCode()) * 31) + this.f2297f.hashCode()) * 31) + this.f2298g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f2292a + ", firstSessionId=" + this.f2293b + ", sessionIndex=" + this.f2294c + ", eventTimestampUs=" + this.f2295d + ", dataCollectionStatus=" + this.f2296e + ", firebaseInstallationId=" + this.f2297f + ", firebaseAuthenticationToken=" + this.f2298g + ')';
    }
}
