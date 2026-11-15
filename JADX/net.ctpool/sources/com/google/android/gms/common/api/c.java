package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
final class c extends BasePendingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Result f13549a;

    public c(Result result) {
        super(Looper.getMainLooper());
        this.f13549a = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final Result createFailedResult(Status status) {
        if (status.getStatusCode() == this.f13549a.getStatus().getStatusCode()) {
            return this.f13549a;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
