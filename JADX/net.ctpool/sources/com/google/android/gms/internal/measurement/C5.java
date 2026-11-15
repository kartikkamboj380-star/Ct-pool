package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class C5 extends D5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ AbstractC1237w5 f14156n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C5(AbstractC1237w5 abstractC1237w5) {
        super(abstractC1237w5);
        this.f14156n = abstractC1237w5;
    }

    @Override // com.google.android.gms.internal.measurement.D5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1253y5(this.f14156n);
    }
}
