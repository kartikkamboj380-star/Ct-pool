package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1315n extends AbstractC1287g implements Set {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient AbstractC1299j f15275n;

    AbstractC1315n() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC1340v.a(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1287g
    public AbstractC1299j i() {
        AbstractC1299j abstractC1299j = this.f15275n;
        if (abstractC1299j != null) {
            return abstractC1299j;
        }
        AbstractC1299j abstractC1299jN = n();
        this.f15275n = abstractC1299jN;
        return abstractC1299jN;
    }

    AbstractC1299j n() {
        Object[] array = toArray();
        int i7 = AbstractC1299j.f15201o;
        return AbstractC1299j.o(array, array.length);
    }
}
