package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1331s extends AbstractC1315n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final transient AbstractC1311m f15295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final transient AbstractC1299j f15296p;

    C1331s(AbstractC1311m abstractC1311m, AbstractC1299j abstractC1299j) {
        this.f15295o = abstractC1311m;
        this.f15296p = abstractC1299j;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    final int c(Object[] objArr, int i7) {
        return this.f15296p.c(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f15295o.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1315n, com.google.android.gms.internal.play_billing.AbstractC1287g
    public final AbstractC1299j i() {
        return this.f15296p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f15296p.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15295o.size();
    }
}
