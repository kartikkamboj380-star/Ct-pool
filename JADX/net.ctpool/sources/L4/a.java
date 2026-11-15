package L4;

/* JADX INFO: loaded from: classes.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1986b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f1985a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f1986b = str2;
    }

    @Override // L4.f
    public String b() {
        return this.f1985a;
    }

    @Override // L4.f
    public String c() {
        return this.f1986b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f1985a.equals(fVar.b()) && this.f1986b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f1985a.hashCode() ^ 1000003) * 1000003) ^ this.f1986b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f1985a + ", version=" + this.f1986b + "}";
    }
}
