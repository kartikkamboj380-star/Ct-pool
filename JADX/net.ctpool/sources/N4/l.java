package N4;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2391a;

    public l(String str) {
        this.f2391a = str;
    }

    public final String a() {
        return this.f2391a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && w5.k.b(this.f2391a, ((l) obj).f2391a);
    }

    public int hashCode() {
        String str = this.f2391a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f2391a + ')';
    }
}
