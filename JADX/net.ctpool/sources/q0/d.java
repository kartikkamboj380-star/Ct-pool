package q0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f21764b;

    public d(String str, Long l7) {
        w5.k.f(str, "key");
        this.f21763a = str;
        this.f21764b = l7;
    }

    public final String a() {
        return this.f21763a;
    }

    public final Long b() {
        return this.f21764b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return w5.k.b(this.f21763a, dVar.f21763a) && w5.k.b(this.f21764b, dVar.f21764b);
    }

    public int hashCode() {
        int iHashCode = this.f21763a.hashCode() * 31;
        Long l7 = this.f21764b;
        return iHashCode + (l7 == null ? 0 : l7.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f21763a + ", value=" + this.f21764b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z6) {
        this(str, Long.valueOf(z6 ? 1L : 0L));
        w5.k.f(str, "key");
    }
}
