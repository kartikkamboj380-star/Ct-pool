package N4;

/* JADX INFO: renamed from: N4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0443e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0442d f2374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC0442d f2375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f2376c;

    public C0443e(EnumC0442d enumC0442d, EnumC0442d enumC0442d2, double d7) {
        w5.k.f(enumC0442d, "performance");
        w5.k.f(enumC0442d2, "crashlytics");
        this.f2374a = enumC0442d;
        this.f2375b = enumC0442d2;
        this.f2376c = d7;
    }

    public final EnumC0442d a() {
        return this.f2375b;
    }

    public final EnumC0442d b() {
        return this.f2374a;
    }

    public final double c() {
        return this.f2376c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0443e)) {
            return false;
        }
        C0443e c0443e = (C0443e) obj;
        return this.f2374a == c0443e.f2374a && this.f2375b == c0443e.f2375b && Double.compare(this.f2376c, c0443e.f2376c) == 0;
    }

    public int hashCode() {
        return (((this.f2374a.hashCode() * 31) + this.f2375b.hashCode()) * 31) + Double.hashCode(this.f2376c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f2374a + ", crashlytics=" + this.f2375b + ", sessionSamplingRate=" + this.f2376c + ')';
    }
}
