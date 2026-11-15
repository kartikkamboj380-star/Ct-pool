package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1107i implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14607m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ C1089g f14608n;

    C1107i(C1089g c1089g) {
        this.f14608n = c1089g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14607m < this.f14608n.q();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f14607m < this.f14608n.q()) {
            C1089g c1089g = this.f14608n;
            int i7 = this.f14607m;
            this.f14607m = i7 + 1;
            return c1089g.n(i7);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f14607m);
    }
}
