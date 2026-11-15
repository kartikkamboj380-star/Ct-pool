package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class PendingResults {
    private PendingResults() {
    }

    public static PendingResult<Status> canceledPendingResult() {
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.cancel();
        return statusPendingResult;
    }

    @KeepForSdk
    public static <R extends Result> PendingResult<R> immediateFailedResult(R r6, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r6, "Result must not be null");
        Preconditions.checkArgument(!r6.getStatus().isSuccess(), "Status code must not be SUCCESS");
        d dVar = new d(googleApiClient, r6);
        dVar.setResult(r6);
        return dVar;
    }

    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r6) {
        Preconditions.checkNotNull(r6, "Result must not be null");
        e eVar = new e(null);
        eVar.setResult(r6);
        return new OptionalPendingResultImpl(eVar);
    }

    public static <R extends Result> PendingResult<R> canceledPendingResult(R r6) {
        Preconditions.checkNotNull(r6, "Result must not be null");
        Preconditions.checkArgument(r6.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        c cVar = new c(r6);
        cVar.cancel();
        return cVar;
    }

    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r6, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r6, "Result must not be null");
        e eVar = new e(googleApiClient);
        eVar.setResult(r6);
        return new OptionalPendingResultImpl(eVar);
    }

    public static PendingResult<Status> immediatePendingResult(Status status) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(Status status, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }
}
