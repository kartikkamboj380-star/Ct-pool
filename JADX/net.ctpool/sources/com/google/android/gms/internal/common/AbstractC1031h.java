package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1031h extends AbstractC1027d implements List, RandomAccess {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final l f14103n = new C1029f(C1033j.f14104q, 0);

    AbstractC1031h() {
    }

    static AbstractC1031h o(Object[] objArr, int i7) {
        return i7 == 0 ? C1033j.f14104q : new C1033j(objArr, i7);
    }

    public static AbstractC1031h p(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return q((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return C1033j.f14104q;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return s(next);
        }
        C1028e c1028e = new C1028e(4);
        c1028e.b(next);
        c1028e.c(it);
        c1028e.f14097c = true;
        return o(c1028e.f14095a, c1028e.f14096b);
    }

    public static AbstractC1031h q(Collection collection) {
        if (!(collection instanceof AbstractC1027d)) {
            Object[] array = collection.toArray();
            int length = array.length;
            AbstractC1032i.a(array, length);
            return o(array, length);
        }
        AbstractC1031h abstractC1031hI = ((AbstractC1027d) collection).i();
        if (!abstractC1031hI.k()) {
            return abstractC1031hI;
        }
        Object[] array2 = abstractC1031hI.toArray();
        return o(array2, array2.length);
    }

    public static AbstractC1031h r() {
        return C1033j.f14104q;
    }

    public static AbstractC1031h s(Object obj) {
        Object[] objArr = {obj};
        AbstractC1032i.a(objArr, 1);
        return o(objArr, 1);
    }

    public static AbstractC1031h t(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC1032i.a(objArr, 2);
        return o(objArr, 2);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.common.AbstractC1027d
    int c(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i8] = get(i8);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
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
                        if (C.a(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !C.a(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.common.AbstractC1027d
    public final AbstractC1031h i() {
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
    public AbstractC1031h subList(int i7, int i8) {
        D.c(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? C1033j.f14104q : new C1030g(this, i7, i9);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final l listIterator(int i7) {
        D.b(i7, size(), "index");
        return isEmpty() ? f14103n : new C1029f(this, i7);
    }
}
