package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class C implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Iterator f15387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ D f15388n;

    C(D d7) {
        this.f15388n = d7;
        this.f15387m = d7.f15396m.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15387m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f15387m.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
