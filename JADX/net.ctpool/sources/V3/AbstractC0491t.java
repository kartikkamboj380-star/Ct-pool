package V3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: renamed from: V3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0491t extends u implements NavigableSet, O {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final transient Comparator f4145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    transient AbstractC0491t f4146p;

    AbstractC0491t(Comparator comparator) {
        this.f4145o = comparator;
    }

    public static AbstractC0491t A(Comparator comparator, Collection collection) {
        return y(comparator, collection);
    }

    static L E(Comparator comparator) {
        return G.c().equals(comparator) ? L.f4071r : new L(AbstractC0487o.s(), comparator);
    }

    static int Q(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    static AbstractC0491t x(Comparator comparator, int i7, Object... objArr) {
        if (i7 == 0) {
            return E(comparator);
        }
        F.c(objArr, i7);
        Arrays.sort(objArr, 0, i7, comparator);
        int i8 = 1;
        for (int i9 = 1; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (comparator.compare(obj, objArr[i8 - 1]) != 0) {
                objArr[i8] = obj;
                i8++;
            }
        }
        Arrays.fill(objArr, i8, i7, (Object) null);
        if (i8 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i8);
        }
        return new L(AbstractC0487o.n(objArr, i8), comparator);
    }

    public static AbstractC0491t y(Comparator comparator, Iterable iterable) {
        U3.h.i(comparator);
        if (P.b(comparator, iterable) && (iterable instanceof AbstractC0491t)) {
            AbstractC0491t abstractC0491t = (AbstractC0491t) iterable;
            if (!abstractC0491t.k()) {
                return abstractC0491t;
            }
        }
        Object[] objArrB = v.b(iterable);
        return x(comparator, objArrB.length, objArrB);
    }

    abstract AbstractC0491t C();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public AbstractC0491t descendingSet() {
        AbstractC0491t abstractC0491t = this.f4146p;
        if (abstractC0491t != null) {
            return abstractC0491t;
        }
        AbstractC0491t abstractC0491tC = C();
        this.f4146p = abstractC0491tC;
        abstractC0491tC.f4146p = this;
        return abstractC0491tC;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public AbstractC0491t headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public AbstractC0491t headSet(Object obj, boolean z6) {
        return H(U3.h.i(obj), z6);
    }

    abstract AbstractC0491t H(Object obj, boolean z6);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public AbstractC0491t subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public AbstractC0491t subSet(Object obj, boolean z6, Object obj2, boolean z7) {
        U3.h.i(obj);
        U3.h.i(obj2);
        U3.h.d(this.f4145o.compare(obj, obj2) <= 0);
        return L(obj, z6, obj2, z7);
    }

    abstract AbstractC0491t L(Object obj, boolean z6, Object obj2, boolean z7);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public AbstractC0491t tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public AbstractC0491t tailSet(Object obj, boolean z6) {
        return O(U3.h.i(obj), z6);
    }

    abstract AbstractC0491t O(Object obj, boolean z6);

    int P(Object obj, Object obj2) {
        return Q(this.f4145o, obj, obj2);
    }

    @Override // java.util.SortedSet, V3.O
    public Comparator comparator() {
        return this.f4145o;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }
}
