package V3;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    class a extends b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Set f4073m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Set f4074n;

        /* JADX INFO: renamed from: V3.M$a$a, reason: collision with other inner class name */
        class C0090a extends AbstractC0474b {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final Iterator f4075o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final Iterator f4076p;

            C0090a() {
                this.f4075o = a.this.f4073m.iterator();
                this.f4076p = a.this.f4074n.iterator();
            }

            @Override // V3.AbstractC0474b
            protected Object c() {
                if (this.f4075o.hasNext()) {
                    return this.f4075o.next();
                }
                while (this.f4076p.hasNext()) {
                    Object next = this.f4076p.next();
                    if (!a.this.f4073m.contains(next)) {
                        return next;
                    }
                }
                return d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f4073m = set;
            this.f4074n = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public S iterator() {
            return new C0090a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f4073m.contains(obj) || this.f4074n.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f4073m.isEmpty() && this.f4074n.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f4073m.size();
            Iterator it = this.f4074n.iterator();
            while (it.hasNext()) {
                if (!this.f4073m.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    public static abstract class b extends AbstractSet {
        private b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: c */
        public abstract S iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static int b(Set set) {
        Iterator it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 = ~(~(i7 + (next != null ? next.hashCode() : 0)));
        }
        return i7;
    }

    public static b c(Set set, Set set2) {
        U3.h.j(set, "set1");
        U3.h.j(set2, "set2");
        return new a(set, set2);
    }
}
