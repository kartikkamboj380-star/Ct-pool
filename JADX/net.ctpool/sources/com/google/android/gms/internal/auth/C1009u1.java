package com.google.android.gms.internal.auth;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1009u1 implements ListIterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ListIterator f14036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f14037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ C1015w1 f14038o;

    C1009u1(C1015w1 c1015w1, int i7) {
        this.f14038o = c1015w1;
        this.f14037n = i7;
        this.f14036m = c1015w1.f14045m.listIterator(i7);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f14036m.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14036m.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f14036m.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14036m.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f14036m.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14036m.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
