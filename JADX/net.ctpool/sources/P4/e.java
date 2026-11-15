package P4;

import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f2667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f2668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f2669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f2670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f2671e;

    public e(Boolean bool, Double d7, Integer num, Integer num2, Long l7) {
        this.f2667a = bool;
        this.f2668b = d7;
        this.f2669c = num;
        this.f2670d = num2;
        this.f2671e = l7;
    }

    public final Integer a() {
        return this.f2670d;
    }

    public final Long b() {
        return this.f2671e;
    }

    public final Boolean c() {
        return this.f2667a;
    }

    public final Integer d() {
        return this.f2669c;
    }

    public final Double e() {
        return this.f2668b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.f2667a, eVar.f2667a) && k.b(this.f2668b, eVar.f2668b) && k.b(this.f2669c, eVar.f2669c) && k.b(this.f2670d, eVar.f2670d) && k.b(this.f2671e, eVar.f2671e);
    }

    public int hashCode() {
        Boolean bool = this.f2667a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d7 = this.f2668b;
        int iHashCode2 = (iHashCode + (d7 == null ? 0 : d7.hashCode())) * 31;
        Integer num = this.f2669c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f2670d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l7 = this.f2671e;
        return iHashCode4 + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f2667a + ", sessionSamplingRate=" + this.f2668b + ", sessionRestartTimeout=" + this.f2669c + ", cacheDuration=" + this.f2670d + ", cacheUpdatedTime=" + this.f2671e + ')';
    }
}
