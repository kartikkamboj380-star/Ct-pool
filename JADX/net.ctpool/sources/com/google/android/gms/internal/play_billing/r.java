package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class r extends AbstractC1315n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final transient AbstractC1311m f15292o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final transient Object[] f15293p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final transient int f15294q;

    r(AbstractC1311m abstractC1311m, Object[] objArr, int i7, int i8) {
        this.f15292o = abstractC1311m;
        this.f15293p = objArr;
        this.f15294q = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    final int c(Object[] objArr, int i7) {
        return i().c(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f15292o.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1315n
    final AbstractC1299j n() {
        return new C1326q(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15294q;
    }
}
