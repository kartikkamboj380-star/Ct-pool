package j5;

import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x5.InterfaceC2227a;

/* JADX INFO: renamed from: j5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1797b extends AbstractC1796a implements List, InterfaceC2227a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f20415m = new a(null);

    /* JADX INFO: renamed from: j5.b$a */
    public static final class a {
        private a() {
        }

        public final void a(int i7, int i8) {
            if (i7 < 0 || i7 >= i8) {
                throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
            }
        }

        public final void b(int i7, int i8) {
            if (i7 < 0 || i7 > i8) {
                throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
            }
        }

        public final void c(int i7, int i8, int i9) {
            if (i7 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
            }
            if (i7 <= i8) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i7 + " > toIndex: " + i8);
        }

        public final int d(int i7, int i8) {
            int i9 = i7 + (i7 >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - 2147483639 <= 0) {
                return i9;
            }
            if (i8 > 2147483639) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }

        public final boolean e(Collection collection, Collection collection2) {
            w5.k.f(collection, "c");
            w5.k.f(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!w5.k.b(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(Collection collection) {
            w5.k.f(collection, "c");
            Iterator it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: j5.b$b, reason: collision with other inner class name */
    private class C0274b implements Iterator, InterfaceC2227a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f20416m;

        public C0274b() {
        }

        protected final int d() {
            return this.f20416m;
        }

        protected final void e(int i7) {
            this.f20416m = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20416m < AbstractC1797b.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC1797b abstractC1797b = AbstractC1797b.this;
            int i7 = this.f20416m;
            this.f20416m = i7 + 1;
            return abstractC1797b.get(i7);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: j5.b$c */
    private class c extends C0274b implements ListIterator, InterfaceC2227a {
        public c(int i7) {
            super();
            AbstractC1797b.f20415m.b(i7, AbstractC1797b.this.size());
            e(i7);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return d() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return d();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC1797b abstractC1797b = AbstractC1797b.this;
            e(d() - 1);
            return abstractC1797b.get(d());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return d() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: j5.b$d */
    private static final class d extends AbstractC1797b implements RandomAccess {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AbstractC1797b f20419n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f20420o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f20421p;

        public d(AbstractC1797b abstractC1797b, int i7, int i8) {
            w5.k.f(abstractC1797b, "list");
            this.f20419n = abstractC1797b;
            this.f20420o = i7;
            AbstractC1797b.f20415m.c(i7, i8, abstractC1797b.size());
            this.f20421p = i8 - i7;
        }

        @Override // j5.AbstractC1796a
        public int f() {
            return this.f20421p;
        }

        @Override // j5.AbstractC1797b, java.util.List
        public Object get(int i7) {
            AbstractC1797b.f20415m.a(i7, this.f20421p);
            return this.f20419n.get(this.f20420o + i7);
        }
    }

    protected AbstractC1797b() {
    }

    @Override // java.util.List
    public void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f20415m.e(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i7);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f20415m.f(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (w5.k.b(it.next(), obj)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0274b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (w5.k.b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i7, int i8) {
        return new d(this, i7, i8);
    }

    public ListIterator listIterator(int i7) {
        return new c(i7);
    }
}
