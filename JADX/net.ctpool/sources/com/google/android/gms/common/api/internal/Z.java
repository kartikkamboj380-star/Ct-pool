package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f13595a;

    /* synthetic */ Z(BasePendingResult basePendingResult, zar zarVar) {
        this.f13595a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        BasePendingResult.zal(this.f13595a.zaj);
        super.finalize();
    }
}
