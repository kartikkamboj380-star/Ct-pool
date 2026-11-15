package k5;

import j5.AbstractC1798c;
import java.util.Collection;
import java.util.Iterator;
import w5.k;
import x5.InterfaceC2228b;

/* JADX INFO: renamed from: k5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1840g extends AbstractC1798c implements Collection, InterfaceC2228b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1837d f21007m;

    public C1840g(C1837d c1837d) {
        k.f(c1837d, "backing");
        this.f21007m = c1837d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        k.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f21007m.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f21007m.containsValue(obj);
    }

    @Override // j5.AbstractC1798c
    public int f() {
        return this.f21007m.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f21007m.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f21007m.P();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f21007m.N(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        k.f(collection, "elements");
        this.f21007m.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        k.f(collection, "elements");
        this.f21007m.m();
        return super.retainAll(collection);
    }
}
