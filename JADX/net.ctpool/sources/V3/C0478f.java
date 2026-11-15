package V3;

import java.io.Serializable;

/* JADX INFO: renamed from: V3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0478f extends G implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final U3.c f4089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final G f4090n;

    C0478f(U3.c cVar, G g7) {
        this.f4089m = (U3.c) U3.h.i(cVar);
        this.f4090n = (G) U3.h.i(g7);
    }

    @Override // V3.G, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f4090n.compare(this.f4089m.apply(obj), this.f4089m.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0478f)) {
            return false;
        }
        C0478f c0478f = (C0478f) obj;
        return this.f4089m.equals(c0478f.f4089m) && this.f4090n.equals(c0478f.f4090n);
    }

    public int hashCode() {
        return U3.f.b(this.f4089m, this.f4090n);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f4090n);
        String strValueOf2 = String.valueOf(this.f4089m);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
