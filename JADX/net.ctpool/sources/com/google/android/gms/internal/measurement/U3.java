package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class U3 extends W3 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14381m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f14382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ R3 f14383o;

    U3(R3 r32) {
        this.f14383o = r32;
        this.f14382n = r32.r();
    }

    @Override // com.google.android.gms.internal.measurement.X3
    public final byte a() {
        int i7 = this.f14381m;
        if (i7 >= this.f14382n) {
            throw new NoSuchElementException();
        }
        this.f14381m = i7 + 1;
        return this.f14383o.q(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14381m < this.f14382n;
    }
}
