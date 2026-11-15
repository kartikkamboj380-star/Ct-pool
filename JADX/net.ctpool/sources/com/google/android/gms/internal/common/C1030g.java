package com.google.android.gms.internal.common;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1030g extends AbstractC1031h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final transient int f14100o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final transient int f14101p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ AbstractC1031h f14102q;

    C1030g(AbstractC1031h abstractC1031h, int i7, int i8) {
        this.f14102q = abstractC1031h;
        this.f14100o = i7;
        this.f14101p = i8;
    }

    @Override // com.google.android.gms.internal.common.AbstractC1027d
    final int f() {
        return this.f14102q.h() + this.f14100o + this.f14101p;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        D.a(i7, this.f14101p, "index");
        return this.f14102q.get(i7 + this.f14100o);
    }

    @Override // com.google.android.gms.internal.common.AbstractC1027d
    final int h() {
        return this.f14102q.h() + this.f14100o;
    }

    @Override // com.google.android.gms.internal.common.AbstractC1027d
    final boolean k() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.AbstractC1027d
    final Object[] m() {
        return this.f14102q.m();
    }

    @Override // com.google.android.gms.internal.common.AbstractC1031h
    /* JADX INFO: renamed from: n */
    public final AbstractC1031h subList(int i7, int i8) {
        D.c(i7, i8, this.f14101p);
        int i9 = this.f14100o;
        return this.f14102q.subList(i7 + i9, i8 + i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14101p;
    }

    @Override // com.google.android.gms.internal.common.AbstractC1031h, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
