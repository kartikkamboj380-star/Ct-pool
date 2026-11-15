package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Batch extends BasePendingResult<BatchResult> {
    private int zae;
    private boolean zaf;
    private boolean zag;
    private final PendingResult[] zah;
    private final Object zai;

    public static final class Builder {
        private final List zaa = new ArrayList();
        private final GoogleApiClient zab;

        public Builder(GoogleApiClient googleApiClient) {
            this.zab = googleApiClient;
        }

        @ResultIgnorabilityUnspecified
        public <R extends Result> BatchResultToken<R> add(PendingResult<R> pendingResult) {
            BatchResultToken<R> batchResultToken = new BatchResultToken<>(this.zaa.size());
            this.zaa.add(pendingResult);
            return batchResultToken;
        }

        public Batch build() {
            return new Batch(this.zaa, this.zab, null);
        }
    }

    /* synthetic */ Batch(List list, GoogleApiClient googleApiClient, zac zacVar) {
        super(googleApiClient);
        this.zai = new Object();
        int size = list.size();
        this.zae = size;
        PendingResult[] pendingResultArr = new PendingResult[size];
        this.zah = pendingResultArr;
        if (list.isEmpty()) {
            setResult(new BatchResult(Status.RESULT_SUCCESS, pendingResultArr));
            return;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            PendingResult pendingResult = (PendingResult) list.get(i7);
            this.zah[i7] = pendingResult;
            pendingResult.addStatusListener(new b(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public void cancel() {
        super.cancel();
        int i7 = 0;
        while (true) {
            PendingResult[] pendingResultArr = this.zah;
            if (i7 >= pendingResultArr.length) {
                return;
            }
            pendingResultArr[i7].cancel();
            i7++;
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public BatchResult createFailedResult(Status status) {
        return new BatchResult(status, this.zah);
    }
}
