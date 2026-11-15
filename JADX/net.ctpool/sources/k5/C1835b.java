package k5;

import j5.AbstractC1797b;
import j5.AbstractC1799d;
import j5.AbstractC1803h;
import j5.AbstractC1809n;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;
import x5.InterfaceC2227a;
import x5.InterfaceC2228b;

/* JADX INFO: renamed from: k5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1835b extends AbstractC1799d implements List, RandomAccess, Serializable, InterfaceC2228b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final a f20972s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final C1835b f20973t;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Object[] f20974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f20975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f20976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f20977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1835b f20978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1835b f20979r;

    /* JADX INFO: renamed from: k5.b$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: k5.b$b, reason: collision with other inner class name */
    private static final class C0296b implements ListIterator, InterfaceC2227a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final C1835b f20980m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f20981n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f20982o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f20983p;

        public C0296b(C1835b c1835b, int i7) {
            k.f(c1835b, "list");
            this.f20980m = c1835b;
            this.f20981n = i7;
            this.f20982o = -1;
            this.f20983p = ((AbstractList) c1835b).modCount;
        }

        private final void d() {
            if (((AbstractList) this.f20980m).modCount != this.f20983p) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            d();
            C1835b c1835b = this.f20980m;
            int i7 = this.f20981n;
            this.f20981n = i7 + 1;
            c1835b.add(i7, obj);
            this.f20982o = -1;
            this.f20983p = ((AbstractList) this.f20980m).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f20981n < this.f20980m.f20976o;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f20981n > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            d();
            if (this.f20981n >= this.f20980m.f20976o) {
                throw new NoSuchElementException();
            }
            int i7 = this.f20981n;
            this.f20981n = i7 + 1;
            this.f20982o = i7;
            return this.f20980m.f20974m[this.f20980m.f20975n + this.f20982o];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f20981n;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            d();
            int i7 = this.f20981n;
            if (i7 <= 0) {
                throw new NoSuchElementException();
            }
            int i8 = i7 - 1;
            this.f20981n = i8;
            this.f20982o = i8;
            return this.f20980m.f20974m[this.f20980m.f20975n + this.f20982o];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f20981n - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            d();
            int i7 = this.f20982o;
            if (i7 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f20980m.remove(i7);
            this.f20981n = this.f20982o;
            this.f20982o = -1;
            this.f20983p = ((AbstractList) this.f20980m).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            d();
            int i7 = this.f20982o;
            if (i7 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f20980m.set(i7, obj);
        }
    }

    static {
        C1835b c1835b = new C1835b(0);
        c1835b.f20977p = true;
        f20973t = c1835b;
    }

    public C1835b() {
        this(10);
    }

    private final Object A(int i7) {
        y();
        C1835b c1835b = this.f20978q;
        if (c1835b != null) {
            this.f20976o--;
            return c1835b.A(i7);
        }
        Object[] objArr = this.f20974m;
        Object obj = objArr[i7];
        AbstractC1803h.e(objArr, objArr, i7, i7 + 1, this.f20975n + this.f20976o);
        AbstractC1836c.f(this.f20974m, (this.f20975n + this.f20976o) - 1);
        this.f20976o--;
        return obj;
    }

    private final void C(int i7, int i8) {
        if (i8 > 0) {
            y();
        }
        C1835b c1835b = this.f20978q;
        if (c1835b != null) {
            c1835b.C(i7, i8);
        } else {
            Object[] objArr = this.f20974m;
            AbstractC1803h.e(objArr, objArr, i7, i7 + i8, this.f20976o);
            Object[] objArr2 = this.f20974m;
            int i9 = this.f20976o;
            AbstractC1836c.g(objArr2, i9 - i8, i9);
        }
        this.f20976o -= i8;
    }

    private final int D(int i7, int i8, Collection collection, boolean z6) {
        int iD;
        C1835b c1835b = this.f20978q;
        if (c1835b != null) {
            iD = c1835b.D(i7, i8, collection, z6);
        } else {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i8) {
                int i11 = i7 + i9;
                if (collection.contains(this.f20974m[i11]) == z6) {
                    Object[] objArr = this.f20974m;
                    i9++;
                    objArr[i10 + i7] = objArr[i11];
                    i10++;
                } else {
                    i9++;
                }
            }
            int i12 = i8 - i10;
            Object[] objArr2 = this.f20974m;
            AbstractC1803h.e(objArr2, objArr2, i7 + i10, i8 + i7, this.f20976o);
            Object[] objArr3 = this.f20974m;
            int i13 = this.f20976o;
            AbstractC1836c.g(objArr3, i13 - i12, i13);
            iD = i12;
        }
        if (iD > 0) {
            y();
        }
        this.f20976o -= iD;
        return iD;
    }

    private final void o(int i7, Collection collection, int i8) {
        y();
        C1835b c1835b = this.f20978q;
        if (c1835b != null) {
            c1835b.o(i7, collection, i8);
            this.f20974m = this.f20978q.f20974m;
            this.f20976o += i8;
        } else {
            w(i7, i8);
            Iterator it = collection.iterator();
            for (int i9 = 0; i9 < i8; i9++) {
                this.f20974m[i7 + i9] = it.next();
            }
        }
    }

    private final void p(int i7, Object obj) {
        y();
        C1835b c1835b = this.f20978q;
        if (c1835b == null) {
            w(i7, 1);
            this.f20974m[i7] = obj;
        } else {
            c1835b.p(i7, obj);
            this.f20974m = this.f20978q.f20974m;
            this.f20976o++;
        }
    }

    private final void r() {
        C1835b c1835b = this.f20979r;
        if (c1835b != null && ((AbstractList) c1835b).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void s() {
        if (x()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean t(List list) {
        return AbstractC1836c.h(this.f20974m, this.f20975n, this.f20976o, list);
    }

    private final void u(int i7) {
        if (i7 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f20974m;
        if (i7 > objArr.length) {
            this.f20974m = AbstractC1836c.e(this.f20974m, AbstractC1797b.f20415m.d(objArr.length, i7));
        }
    }

    private final void v(int i7) {
        u(this.f20976o + i7);
    }

    private final void w(int i7, int i8) {
        v(i8);
        Object[] objArr = this.f20974m;
        AbstractC1803h.e(objArr, objArr, i7 + i8, i7, this.f20975n + this.f20976o);
        this.f20976o += i8;
    }

    private final boolean x() {
        C1835b c1835b;
        return this.f20977p || ((c1835b = this.f20979r) != null && c1835b.f20977p);
    }

    private final void y() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        s();
        r();
        AbstractC1797b.f20415m.b(i7, this.f20976o);
        p(this.f20975n + i7, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection collection) {
        k.f(collection, "elements");
        s();
        r();
        AbstractC1797b.f20415m.b(i7, this.f20976o);
        int size = collection.size();
        o(this.f20975n + i7, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        s();
        r();
        C(this.f20975n, this.f20976o);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        r();
        return obj == this || ((obj instanceof List) && t((List) obj));
    }

    @Override // j5.AbstractC1799d
    public int f() {
        r();
        return this.f20976o;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        r();
        AbstractC1797b.f20415m.a(i7, this.f20976o);
        return this.f20974m[this.f20975n + i7];
    }

    @Override // j5.AbstractC1799d
    public Object h(int i7) {
        s();
        r();
        AbstractC1797b.f20415m.a(i7, this.f20976o);
        return A(this.f20975n + i7);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        r();
        return AbstractC1836c.i(this.f20974m, this.f20975n, this.f20976o);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        r();
        for (int i7 = 0; i7 < this.f20976o; i7++) {
            if (k.b(this.f20974m[this.f20975n + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        r();
        return this.f20976o == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        r();
        for (int i7 = this.f20976o - 1; i7 >= 0; i7--) {
            if (k.b(this.f20974m[this.f20975n + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final List q() {
        if (this.f20978q != null) {
            throw new IllegalStateException();
        }
        s();
        this.f20977p = true;
        return this.f20976o > 0 ? this : f20973t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        s();
        r();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        k.f(collection, "elements");
        s();
        r();
        return D(this.f20975n, this.f20976o, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        k.f(collection, "elements");
        s();
        r();
        return D(this.f20975n, this.f20976o, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        s();
        r();
        AbstractC1797b.f20415m.a(i7, this.f20976o);
        Object[] objArr = this.f20974m;
        int i8 = this.f20975n;
        Object obj2 = objArr[i8 + i7];
        objArr[i8 + i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i7, int i8) {
        AbstractC1797b.f20415m.c(i7, i8, this.f20976o);
        Object[] objArr = this.f20974m;
        int i9 = this.f20975n + i7;
        int i10 = i8 - i7;
        boolean z6 = this.f20977p;
        C1835b c1835b = this.f20979r;
        return new C1835b(objArr, i9, i10, z6, this, c1835b == null ? this : c1835b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        r();
        Object[] objArr = this.f20974m;
        int i7 = this.f20975n;
        return AbstractC1803h.i(objArr, i7, this.f20976o + i7);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        r();
        return AbstractC1836c.j(this.f20974m, this.f20975n, this.f20976o, this);
    }

    public C1835b(int i7) {
        this(AbstractC1836c.d(i7), 0, 0, false, null, null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        s();
        r();
        p(this.f20975n + this.f20976o, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        k.f(collection, "elements");
        s();
        r();
        int size = collection.size();
        o(this.f20975n + this.f20976o, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i7) {
        r();
        AbstractC1797b.f20415m.b(i7, this.f20976o);
        return new C0296b(this, i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        k.f(objArr, "destination");
        r();
        int length = objArr.length;
        int i7 = this.f20976o;
        if (length >= i7) {
            Object[] objArr2 = this.f20974m;
            int i8 = this.f20975n;
            AbstractC1803h.e(objArr2, objArr, 0, i8, i7 + i8);
            return AbstractC1809n.e(this.f20976o, objArr);
        }
        Object[] objArr3 = this.f20974m;
        int i9 = this.f20975n;
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr3, i9, i7 + i9, objArr.getClass());
        k.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    private C1835b(Object[] objArr, int i7, int i8, boolean z6, C1835b c1835b, C1835b c1835b2) {
        this.f20974m = objArr;
        this.f20975n = i7;
        this.f20976o = i8;
        this.f20977p = z6;
        this.f20978q = c1835b;
        this.f20979r = c1835b2;
        if (c1835b != null) {
            ((AbstractList) this).modCount = ((AbstractList) c1835b).modCount;
        }
    }
}
