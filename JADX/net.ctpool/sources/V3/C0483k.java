package V3;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: V3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0483k extends G implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Comparator f4114m;

    C0483k(Comparator comparator) {
        this.f4114m = (Comparator) U3.h.i(comparator);
    }

    @Override // V3.G, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f4114m.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0483k) {
            return this.f4114m.equals(((C0483k) obj).f4114m);
        }
        return false;
    }

    public int hashCode() {
        return this.f4114m.hashCode();
    }

    public String toString() {
        return this.f4114m.toString();
    }
}
