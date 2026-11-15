package S2;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2948a;

    private c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f2948a = str;
    }

    public static c b(String str) {
        return new c(str);
    }

    public String a() {
        return this.f2948a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f2948a.equals(((c) obj).f2948a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2948a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f2948a + "\"}";
    }
}
