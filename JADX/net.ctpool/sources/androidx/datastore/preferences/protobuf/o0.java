package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends AbstractList implements D, RandomAccess {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final D f7671m;

    class a implements ListIterator {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        ListIterator f7672m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f7673n;

        a(int i7) {
            this.f7673n = i7;
            this.f7672m = o0.this.f7671m.listIterator(i7);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f7672m.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f7672m.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f7672m.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f7672m.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f7672m.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f7672m.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Iterator f7675m;

        b() {
            this.f7675m = o0.this.f7671m.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f7675m.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7675m.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public o0(D d7) {
        this.f7671m = d7;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public D M0() {
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public Object R0(int i7) {
        return this.f7671m.R0(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void W(AbstractC0612g abstractC0612g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i7) {
        return (String) this.f7671m.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public List h0() {
        return this.f7671m.h0();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i7) {
        return new a(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7671m.size();
    }
}
