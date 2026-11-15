package com.google.android.gms.internal.common;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1029f extends K {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AbstractC1031h f14099o;

    C1029f(AbstractC1031h abstractC1031h, int i7) {
        super(abstractC1031h.size(), i7);
        this.f14099o = abstractC1031h;
    }

    @Override // com.google.android.gms.internal.common.K
    protected final Object c(int i7) {
        return this.f14099o.get(i7);
    }
}
