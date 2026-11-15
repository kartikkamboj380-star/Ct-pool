package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class B1 implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Iterator f15020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ C1 f15021n;

    B1(C1 c12) {
        this.f15021n = c12;
        this.f15020m = c12.f15037m.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15020m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f15020m.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
