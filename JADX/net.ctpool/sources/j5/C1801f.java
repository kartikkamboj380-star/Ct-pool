package j5;

import java.util.Collection;
import java.util.Iterator;
import w5.AbstractC2198b;
import x5.InterfaceC2227a;

/* JADX INFO: renamed from: j5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1801f implements Collection, InterfaceC2227a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object[] f20422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f20423n;

    public C1801f(Object[] objArr, boolean z6) {
        w5.k.f(objArr, "values");
        this.f20422m = objArr;
        this.f20423n = z6;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC1807l.o(this.f20422m, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        w5.k.f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int f() {
        return this.f20422m.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f20422m.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC2198b.a(this.f20422m);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1810o.b(this.f20422m, this.f20423n);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        w5.k.f(objArr, "array");
        return w5.f.b(this, objArr);
    }
}
