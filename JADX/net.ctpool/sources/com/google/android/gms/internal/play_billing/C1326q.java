package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1326q extends AbstractC1299j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ r f15287p;

    C1326q(r rVar) {
        this.f15287p = rVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        AbstractC1267b.a(i7, this.f15287p.f15294q, "index");
        int i8 = i7 + i7;
        Object obj = this.f15287p.f15293p[i8];
        Objects.requireNonNull(obj);
        Object obj2 = this.f15287p.f15293p[i8 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15287p.f15294q;
    }
}
