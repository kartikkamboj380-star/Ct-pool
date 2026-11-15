package V3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class D extends G implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final D f4046m = new D();

    private D() {
    }

    @Override // V3.G, java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        U3.h.i(comparable);
        U3.h.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
