package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1291h extends AbstractC1275d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AbstractC1299j f15193o;

    C1291h(AbstractC1299j abstractC1299j, int i7) {
        super(abstractC1299j.size(), i7);
        this.f15193o = abstractC1299j;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1275d
    protected final Object c(int i7) {
        return this.f15193o.get(i7);
    }
}
