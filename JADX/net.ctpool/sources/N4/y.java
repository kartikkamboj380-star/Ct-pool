package N4;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f2446d;

    public y(String str, String str2, int i7, long j7) {
        w5.k.f(str, "sessionId");
        w5.k.f(str2, "firstSessionId");
        this.f2443a = str;
        this.f2444b = str2;
        this.f2445c = i7;
        this.f2446d = j7;
    }

    public final String a() {
        return this.f2444b;
    }

    public final String b() {
        return this.f2443a;
    }

    public final int c() {
        return this.f2445c;
    }

    public final long d() {
        return this.f2446d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return w5.k.b(this.f2443a, yVar.f2443a) && w5.k.b(this.f2444b, yVar.f2444b) && this.f2445c == yVar.f2445c && this.f2446d == yVar.f2446d;
    }

    public int hashCode() {
        return (((((this.f2443a.hashCode() * 31) + this.f2444b.hashCode()) * 31) + Integer.hashCode(this.f2445c)) * 31) + Long.hashCode(this.f2446d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f2443a + ", firstSessionId=" + this.f2444b + ", sessionIndex=" + this.f2445c + ", sessionStartTimestampUs=" + this.f2446d + ')';
    }
}
