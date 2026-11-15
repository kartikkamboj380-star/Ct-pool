package q0;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21779b;

    public m(String str, int i7) {
        w5.k.f(str, "workSpecId");
        this.f21778a = str;
        this.f21779b = i7;
    }

    public final int a() {
        return this.f21779b;
    }

    public final String b() {
        return this.f21778a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return w5.k.b(this.f21778a, mVar.f21778a) && this.f21779b == mVar.f21779b;
    }

    public int hashCode() {
        return (this.f21778a.hashCode() * 31) + Integer.hashCode(this.f21779b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f21778a + ", generation=" + this.f21779b + ')';
    }
}
