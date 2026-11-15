package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1299j extends AbstractC1287g implements List, RandomAccess {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AbstractC1346x f15200n = new C1291h(C1323p.f15282r, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f15201o = 0;

    AbstractC1299j() {
    }

    static AbstractC1299j o(Object[] objArr, int i7) {
        return i7 == 0 ? C1323p.f15282r : new C1323p(objArr, i7);
    }

    public static AbstractC1299j p(Collection collection) {
        if (collection instanceof AbstractC1287g) {
            AbstractC1299j abstractC1299jI = ((AbstractC1287g) collection).i();
            if (!abstractC1299jI.k()) {
                return abstractC1299jI;
            }
            Object[] array = abstractC1299jI.toArray();
            return o(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (array2[i7] == null) {
                throw new NullPointerException("at index " + i7);
            }
        }
        return o(array2, array2.length);
    }

    public static AbstractC1299j q() {
        return C1323p.f15282r;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    int c(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i8] = get(i8);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i7 = 0; i7 < size; i7++) {
                        if (O2.a(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !O2.a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i7 = 0; i7 < size; i7++) {
            iHashCode = (iHashCode * 31) + get(i7).hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    public final AbstractC1299j i() {
        return this;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC1299j subList(int i7, int i8) {
        AbstractC1267b.d(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? C1323p.f15282r : new C1295i(this, i7, i9);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final AbstractC1346x listIterator(int i7) {
        AbstractC1267b.b(i7, size(), "index");
        return isEmpty() ? f15200n : new C1291h(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }
}
