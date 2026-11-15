package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
final class d extends BasePendingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Result f13550a;

    public d(GoogleApiClient googleApiClient, Result result) {
        super(googleApiClient);
        this.f13550a = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final Result createFailedResult(Status status) {
        return this.f13550a;
    }
}
