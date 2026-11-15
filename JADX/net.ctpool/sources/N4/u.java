package N4;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f2408d;

    public u(String str, int i7, int i8, boolean z6) {
        w5.k.f(str, "processName");
        this.f2405a = str;
        this.f2406b = i7;
        this.f2407c = i8;
        this.f2408d = z6;
    }

    public final int a() {
        return this.f2407c;
    }

    public final int b() {
        return this.f2406b;
    }

    public final String c() {
        return this.f2405a;
    }

    public final boolean d() {
        return this.f2408d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return w5.k.b(this.f2405a, uVar.f2405a) && this.f2406b == uVar.f2406b && this.f2407c == uVar.f2407c && this.f2408d == uVar.f2408d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((this.f2405a.hashCode() * 31) + Integer.hashCode(this.f2406b)) * 31) + Integer.hashCode(this.f2407c)) * 31;
        boolean z6 = this.f2408d;
        ?? r12 = z6;
        if (z6) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f2405a + ", pid=" + this.f2406b + ", importance=" + this.f2407c + ", isDefaultProcess=" + this.f2408d + ')';
    }
}
