package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1334t extends AbstractC1299j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final transient Object[] f15302p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final transient int f15303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final transient int f15304r;

    C1334t(Object[] objArr, int i7, int i8) {
        this.f15302p = objArr;
        this.f15303q = i7;
        this.f15304r = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        AbstractC1267b.a(i7, this.f15304r, "index");
        Object obj = this.f15302p[i7 + i7 + this.f15303q];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15304r;
    }
}
