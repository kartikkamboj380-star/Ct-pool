package l5;

import java.util.Comparator;
import w5.k;

/* JADX INFO: renamed from: l5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1864f implements Comparator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C1864f f21119m = new C1864f();

    private C1864f() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        k.f(comparable, "a");
        k.f(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C1863e.f21118m;
    }
}
