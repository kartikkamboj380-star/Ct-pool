package com.google.android.gms.internal.common;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1033j extends AbstractC1031h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final AbstractC1031h f14104q = new C1033j(new Object[0], 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final transient Object[] f14105o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final transient int f14106p;

    C1033j(Object[] objArr, int i7) {
        this.f14105o = objArr;
        this.f14106p = i7;
    }

    @Override // com.google.android.gms.internal.common.AbstractC1031h, com.google.android.gms.internal.common.AbstractC1027d
    final int c(Object[] objArr, int i7) {
        System.arraycopy(this.f14105o, 0, objArr, 0, this.f14106p);
        return this.f14106p;
    }

    @Override // com.google.android.gms.internal.common.AbstractC1027d
    final int f() {
        return this.f14106p;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        D.a(i7, this.f14106p, "index");
        Object obj = this.f14105o[i7];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.common.AbstractC1027d
    final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.AbstractC1027d
    final boolean k() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.AbstractC1027d
    final Object[] m() {
        return this.f14105o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14106p;
    }
}
