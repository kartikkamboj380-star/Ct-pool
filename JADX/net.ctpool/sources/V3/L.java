package V3;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class L extends AbstractC0491t {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final L f4071r = new L(AbstractC0487o.s(), G.c());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final transient AbstractC0487o f4072q;

    L(AbstractC0487o abstractC0487o, Comparator comparator) {
        super(comparator);
        this.f4072q = abstractC0487o;
    }

    private int Y(Object obj) {
        return Collections.binarySearch(this.f4072q, obj, Z());
    }

    @Override // V3.AbstractC0491t
    AbstractC0491t C() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f4145o);
        return isEmpty() ? AbstractC0491t.E(comparatorReverseOrder) : new L(this.f4072q.w(), comparatorReverseOrder);
    }

    @Override // V3.AbstractC0491t
    AbstractC0491t H(Object obj, boolean z6) {
        return S(0, T(obj, z6));
    }

    @Override // V3.AbstractC0491t
    AbstractC0491t L(Object obj, boolean z6, Object obj2, boolean z7) {
        return O(obj, z6).H(obj2, z7);
    }

    @Override // V3.AbstractC0491t
    AbstractC0491t O(Object obj, boolean z6) {
        return S(X(obj, z6), size());
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public S descendingIterator() {
        return this.f4072q.w().iterator();
    }

    L S(int i7, int i8) {
        return (i7 == 0 && i8 == size()) ? this : i7 < i8 ? new L(this.f4072q.subList(i7, i8), this.f4145o) : AbstractC0491t.E(this.f4145o);
    }

    int T(Object obj, boolean z6) {
        int iBinarySearch = Collections.binarySearch(this.f4072q, U3.h.i(obj), comparator());
        return iBinarySearch >= 0 ? z6 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return this.f4072q.iterator();
    }

    int X(Object obj, boolean z6) {
        int iBinarySearch = Collections.binarySearch(this.f4072q, U3.h.i(obj), comparator());
        return iBinarySearch >= 0 ? z6 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    Comparator Z() {
        return this.f4145o;
    }

    @Override // V3.AbstractC0486n
    int c(Object[] objArr, int i7) {
        return this.f4072q.c(objArr, i7);
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        int iX = X(obj, true);
        if (iX == size()) {
            return null;
        }
        return this.f4072q.get(iX);
    }

    @Override // V3.AbstractC0486n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Y(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        if (collection instanceof C) {
            collection = ((C) collection).B();
        }
        if (!P.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        S it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int iP = P(next2, next);
                if (iP < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iP == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iP > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // V3.r, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!P.b(this.f4145o, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            S it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 == null || P(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // V3.AbstractC0486n
    Object[] f() {
        return this.f4072q.f();
    }

    @Override // java.util.SortedSet
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f4072q.get(0);
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        int iT = T(obj, true) - 1;
        if (iT == -1) {
            return null;
        }
        return this.f4072q.get(iT);
    }

    @Override // V3.AbstractC0486n
    int h() {
        return this.f4072q.h();
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        int iX = X(obj, false);
        if (iX == size()) {
            return null;
        }
        return this.f4072q.get(iX);
    }

    @Override // V3.AbstractC0486n
    int i() {
        return this.f4072q.i();
    }

    @Override // V3.AbstractC0486n
    boolean k() {
        return this.f4072q.k();
    }

    @Override // java.util.SortedSet
    public Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f4072q.get(size() - 1);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        int iT = T(obj, false) - 1;
        if (iT == -1) {
            return null;
        }
        return this.f4072q.get(iT);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f4072q.size();
    }
}
