package n0;

/* JADX INFO: renamed from: n0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1892b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21331d;

    public C1892b(boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f21328a = z6;
        this.f21329b = z7;
        this.f21330c = z8;
        this.f21331d = z9;
    }

    public final boolean a() {
        return this.f21328a;
    }

    public final boolean b() {
        return this.f21330c;
    }

    public final boolean c() {
        return this.f21331d;
    }

    public final boolean d() {
        return this.f21329b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1892b)) {
            return false;
        }
        C1892b c1892b = (C1892b) obj;
        return this.f21328a == c1892b.f21328a && this.f21329b == c1892b.f21329b && this.f21330c == c1892b.f21330c && this.f21331d == c1892b.f21331d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        boolean z6 = this.f21328a;
        ?? r02 = z6;
        if (z6) {
            r02 = 1;
        }
        int i7 = r02 * 31;
        boolean z7 = this.f21329b;
        ?? r22 = z7;
        if (z7) {
            r22 = 1;
        }
        int i8 = (i7 + r22) * 31;
        boolean z8 = this.f21330c;
        ?? r23 = z8;
        if (z8) {
            r23 = 1;
        }
        int i9 = (i8 + r23) * 31;
        boolean z9 = this.f21331d;
        return i9 + (z9 ? 1 : z9);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f21328a + ", isValidated=" + this.f21329b + ", isMetered=" + this.f21330c + ", isNotRoaming=" + this.f21331d + ')';
    }
}
