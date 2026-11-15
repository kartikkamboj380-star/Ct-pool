package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class A1 implements ListIterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ListIterator f15015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f15016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ C1 f15017o;

    A1(C1 c12, int i7) {
        this.f15016n = i7;
        this.f15017o = c12;
        this.f15015m = c12.f15037m.listIterator(i7);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f15015m.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15015m.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f15015m.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15015m.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f15015m.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15015m.previousIndex();
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
