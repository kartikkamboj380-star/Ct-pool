package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1323p extends AbstractC1299j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final AbstractC1299j f15282r = new C1323p(new Object[0], 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final transient Object[] f15283p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final transient int f15284q;

    C1323p(Object[] objArr, int i7) {
        this.f15283p = objArr;
        this.f15284q = i7;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1299j, com.google.android.gms.internal.play_billing.AbstractC1287g
    final int c(Object[] objArr, int i7) {
        System.arraycopy(this.f15283p, 0, objArr, 0, this.f15284q);
        return this.f15284q;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    final int f() {
        return this.f15284q;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        AbstractC1267b.a(i7, this.f15284q, "index");
        Object obj = this.f15283p[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    final boolean k() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    final Object[] m() {
        return this.f15283p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15284q;
    }
}
