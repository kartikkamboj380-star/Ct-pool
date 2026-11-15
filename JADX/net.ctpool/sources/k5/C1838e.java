package k5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import w5.k;

/* JADX INFO: renamed from: k5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1838e extends AbstractC1834a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1837d f21005m;

    public C1838e(C1837d c1837d) {
        k.f(c1837d, "backing");
        this.f21005m = c1837d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        k.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f21005m.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        k.f(collection, "elements");
        return this.f21005m.o(collection);
    }

    @Override // j5.AbstractC1800e
    public int f() {
        return this.f21005m.size();
    }

    @Override // k5.AbstractC1834a
    public boolean i(Map.Entry entry) {
        k.f(entry, "element");
        return this.f21005m.p(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f21005m.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f21005m.t();
    }

    @Override // k5.AbstractC1834a
    public boolean k(Map.Entry entry) {
        k.f(entry, "element");
        return this.f21005m.J(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        k.f(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        k.f(collection, "elements");
        this.f21005m.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        k.f(collection, "elements");
        this.f21005m.m();
        return super.retainAll(collection);
    }
}
