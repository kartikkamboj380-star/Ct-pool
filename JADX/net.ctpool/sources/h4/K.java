package h4;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19691b;

    public K(String str, String str2) {
        this.f19690a = str;
        this.f19691b = str2;
    }

    public final String a() {
        return this.f19691b;
    }

    public final String b() {
        return this.f19690a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k7 = (K) obj;
        return w5.k.b(this.f19690a, k7.f19690a) && w5.k.b(this.f19691b, k7.f19691b);
    }

    public int hashCode() {
        String str = this.f19690a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19691b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f19690a + ", authToken=" + this.f19691b + ')';
    }
}
