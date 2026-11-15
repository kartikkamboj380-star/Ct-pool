package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class H extends J {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f15048m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f15049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ S f15050o;

    H(S s6) {
        this.f15050o = s6;
        this.f15049n = s6.h();
    }

    @Override // com.google.android.gms.internal.play_billing.L
    public final byte a() {
        int i7 = this.f15048m;
        if (i7 >= this.f15049n) {
            throw new NoSuchElementException();
        }
        this.f15048m = i7 + 1;
        return this.f15050o.f(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15048m < this.f15049n;
    }
}
