package V3;

import V3.AbstractC0486n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: V3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0487o extends AbstractC0486n implements List, RandomAccess {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final T f4120n = new b(I.f4047q, 0);

    /* JADX INFO: renamed from: V3.o$a */
    public static final class a extends AbstractC0486n.a {
        public a() {
            this(4);
        }

        public a e(Object... objArr) {
            super.b(objArr);
            return this;
        }

        public AbstractC0487o f() {
            this.f4119c = true;
            return AbstractC0487o.n(this.f4117a, this.f4118b);
        }

        a(int i7) {
            super(i7);
        }
    }

    /* JADX INFO: renamed from: V3.o$b */
    static class b extends AbstractC0473a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final AbstractC0487o f4121o;

        b(AbstractC0487o abstractC0487o, int i7) {
            super(abstractC0487o.size(), i7);
            this.f4121o = abstractC0487o;
        }

        @Override // V3.AbstractC0473a
        protected Object c(int i7) {
            return this.f4121o.get(i7);
        }
    }

    /* JADX INFO: renamed from: V3.o$c */
    private static class c extends AbstractC0487o {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final transient AbstractC0487o f4122o;

        c(AbstractC0487o abstractC0487o) {
            this.f4122o = abstractC0487o;
        }

        private int C(int i7) {
            return (size() - 1) - i7;
        }

        private int D(int i7) {
            return size() - i7;
        }

        @Override // V3.AbstractC0487o, V3.AbstractC0486n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f4122o.contains(obj);
        }

        @Override // java.util.List
        public Object get(int i7) {
            U3.h.g(i7, size());
            return this.f4122o.get(C(i7));
        }

        @Override // V3.AbstractC0487o, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f4122o.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return C(iLastIndexOf);
            }
            return -1;
        }

        @Override // V3.AbstractC0487o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // V3.AbstractC0486n
        boolean k() {
            return this.f4122o.k();
        }

        @Override // V3.AbstractC0487o, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f4122o.indexOf(obj);
            if (iIndexOf >= 0) {
                return C(iIndexOf);
            }
            return -1;
        }

        @Override // V3.AbstractC0487o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4122o.size();
        }

        @Override // V3.AbstractC0487o
        public AbstractC0487o w() {
            return this.f4122o;
        }

        @Override // V3.AbstractC0487o, java.util.List
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public AbstractC0487o subList(int i7, int i8) {
            U3.h.m(i7, i8, size());
            return this.f4122o.subList(D(i8), D(i7)).w();
        }

        @Override // V3.AbstractC0487o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
            return super.listIterator(i7);
        }
    }

    /* JADX INFO: renamed from: V3.o$d */
    class d extends AbstractC0487o {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final transient int f4123o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final transient int f4124p;

        d(int i7, int i8) {
            this.f4123o = i7;
            this.f4124p = i8;
        }

        @Override // V3.AbstractC0486n
        Object[] f() {
            return AbstractC0487o.this.f();
        }

        @Override // java.util.List
        public Object get(int i7) {
            U3.h.g(i7, this.f4124p);
            return AbstractC0487o.this.get(i7 + this.f4123o);
        }

        @Override // V3.AbstractC0486n
        int h() {
            return AbstractC0487o.this.i() + this.f4123o + this.f4124p;
        }

        @Override // V3.AbstractC0486n
        int i() {
            return AbstractC0487o.this.i() + this.f4123o;
        }

        @Override // V3.AbstractC0487o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // V3.AbstractC0486n
        boolean k() {
            return true;
        }

        @Override // V3.AbstractC0487o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4124p;
        }

        @Override // V3.AbstractC0487o, java.util.List
        /* JADX INFO: renamed from: y */
        public AbstractC0487o subList(int i7, int i8) {
            U3.h.m(i7, i8, this.f4124p);
            AbstractC0487o abstractC0487o = AbstractC0487o.this;
            int i9 = this.f4123o;
            return abstractC0487o.subList(i7 + i9, i8 + i9);
        }

        @Override // V3.AbstractC0487o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
            return super.listIterator(i7);
        }
    }

    AbstractC0487o() {
    }

    static AbstractC0487o m(Object[] objArr) {
        return n(objArr, objArr.length);
    }

    static AbstractC0487o n(Object[] objArr, int i7) {
        return i7 == 0 ? s() : new I(objArr, i7);
    }

    private static AbstractC0487o o(Object... objArr) {
        return m(F.b(objArr));
    }

    public static AbstractC0487o s() {
        return I.f4047q;
    }

    public static AbstractC0487o t(Object obj, Object obj2) {
        return o(obj, obj2);
    }

    public static AbstractC0487o u(Object obj, Object obj2, Object obj3) {
        return o(obj, obj2, obj3);
    }

    public static AbstractC0487o v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return o(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static AbstractC0487o x(Comparator comparator, Iterable iterable) {
        U3.h.i(comparator);
        Object[] objArrB = v.b(iterable);
        F.b(objArrB);
        Arrays.sort(objArrB, comparator);
        return m(objArrB);
    }

    AbstractC0487o A(int i7, int i8) {
        return new d(i7, i8 - i7);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // V3.AbstractC0486n
    int c(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // V3.AbstractC0486n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return x.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~((i7 * 31) + get(i8).hashCode()));
        }
        return i7;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return x.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return x.d(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public T listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public T listIterator(int i7) {
        U3.h.k(i7, size());
        return isEmpty() ? f4120n : new b(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    public AbstractC0487o w() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y */
    public AbstractC0487o subList(int i7, int i8) {
        U3.h.m(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? s() : A(i7, i8);
    }
}
