package j5;

import java.util.Collection;
import java.util.Iterator;
import x5.InterfaceC2227a;

/* JADX INFO: renamed from: j5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1796a implements Collection, InterfaceC2227a {

    /* JADX INFO: renamed from: j5.a$a, reason: collision with other inner class name */
    static final class C0273a extends w5.l implements v5.l {
        C0273a() {
            super(1);
        }

        @Override // v5.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence i(Object obj) {
            return obj == AbstractC1796a.this ? "(this Collection)" : String.valueOf(obj);
        }
    }

    protected AbstractC1796a() {
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

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (w5.k.b(it.next(), obj)) {
                return true;
            }
        }
        return false;
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

    public abstract int f();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
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
    public Object[] toArray() {
        return w5.f.a(this);
    }

    public String toString() {
        return AbstractC1809n.O(this, ", ", "[", "]", 0, null, new C0273a(), 24, null);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        w5.k.f(objArr, "array");
        return w5.f.b(this, objArr);
    }
}
