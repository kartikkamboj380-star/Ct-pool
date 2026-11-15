package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1239x implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14958m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ C1214u f14959n;

    C1239x(C1214u c1214u) {
        this.f14959n = c1214u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14958m < this.f14959n.f14920m.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f14958m >= this.f14959n.f14920m.length()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f14958m;
        this.f14958m = i7 + 1;
        return new C1214u(String.valueOf(i7));
    }
}
