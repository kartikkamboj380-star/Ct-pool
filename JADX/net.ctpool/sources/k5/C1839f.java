package k5;

import j5.AbstractC1800e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import w5.k;
import x5.InterfaceC2228b;

/* JADX INFO: renamed from: k5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1839f extends AbstractC1800e implements Set, InterfaceC2228b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1837d f21006m;

    public C1839f(C1837d c1837d) {
        k.f(c1837d, "backing");
        this.f21006m = c1837d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        k.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f21006m.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f21006m.containsKey(obj);
    }

    @Override // j5.AbstractC1800e
    public int f() {
        return this.f21006m.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f21006m.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f21006m.D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f21006m.L(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        k.f(collection, "elements");
        this.f21006m.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        k.f(collection, "elements");
        this.f21006m.m();
        return super.retainAll(collection);
    }
}
