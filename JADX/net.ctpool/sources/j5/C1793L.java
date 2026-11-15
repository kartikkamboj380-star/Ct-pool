package j5;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import x5.InterfaceC2227a;

/* JADX INFO: renamed from: j5.L, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1793L extends AbstractC1797b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f20411n;

    /* JADX INFO: renamed from: j5.L$a */
    public static final class a implements ListIterator, InterfaceC2227a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final ListIterator f20412m;

        a(int i7) {
            this.f20412m = C1793L.this.f20411n.listIterator(v.B(C1793L.this, i7));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f20412m.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f20412m.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f20412m.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return v.A(C1793L.this, this.f20412m.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f20412m.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return v.A(C1793L.this, this.f20412m.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1793L(List list) {
        w5.k.f(list, "delegate");
        this.f20411n = list;
    }

    @Override // j5.AbstractC1796a
    public int f() {
        return this.f20411n.size();
    }

    @Override // j5.AbstractC1797b, java.util.List
    public Object get(int i7) {
        return this.f20411n.get(v.z(this, i7));
    }

    @Override // j5.AbstractC1797b, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // j5.AbstractC1797b, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // j5.AbstractC1797b, java.util.List
    public ListIterator listIterator(int i7) {
        return new a(i7);
    }
}
