package B4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class a extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f752b;

    a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f751a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f752b = list;
    }

    @Override // B4.r
    public List b() {
        return this.f752b;
    }

    @Override // B4.r
    public String c() {
        return this.f751a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f751a.equals(rVar.c()) && this.f752b.equals(rVar.b());
    }

    public int hashCode() {
        return ((this.f751a.hashCode() ^ 1000003) * 1000003) ^ this.f752b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f751a + ", usedDates=" + this.f752b + "}";
    }
}
