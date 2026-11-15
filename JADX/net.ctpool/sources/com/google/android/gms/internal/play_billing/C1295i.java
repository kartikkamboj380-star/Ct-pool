package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1295i extends AbstractC1299j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final transient int f15194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final transient int f15195q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ AbstractC1299j f15196r;

    C1295i(AbstractC1299j abstractC1299j, int i7, int i8) {
        this.f15196r = abstractC1299j;
        this.f15194p = i7;
        this.f15195q = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    final int f() {
        return this.f15196r.h() + this.f15194p + this.f15195q;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        AbstractC1267b.a(i7, this.f15195q, "index");
        return this.f15196r.get(i7 + this.f15194p);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    final int h() {
        return this.f15196r.h() + this.f15194p;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    final boolean k() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    final Object[] m() {
        return this.f15196r.m();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1299j
    /* JADX INFO: renamed from: n */
    public final AbstractC1299j subList(int i7, int i8) {
        AbstractC1267b.d(i7, i8, this.f15195q);
        int i9 = this.f15194p;
        return this.f15196r.subList(i7 + i9, i8 + i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15195q;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1299j, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
