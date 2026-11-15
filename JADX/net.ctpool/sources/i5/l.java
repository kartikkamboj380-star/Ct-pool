package i5;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f19971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f19972n;

    public l(Object obj, Object obj2) {
        this.f19971m = obj;
        this.f19972n = obj2;
    }

    public final Object a() {
        return this.f19971m;
    }

    public final Object b() {
        return this.f19972n;
    }

    public final Object c() {
        return this.f19971m;
    }

    public final Object d() {
        return this.f19972n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return w5.k.b(this.f19971m, lVar.f19971m) && w5.k.b(this.f19972n, lVar.f19972n);
    }

    public int hashCode() {
        Object obj = this.f19971m;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f19972n;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f19971m + ", " + this.f19972n + ')';
    }
}
