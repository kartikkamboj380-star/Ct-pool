package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;

/* JADX INFO: loaded from: classes.dex */
final class b implements PendingResult.StatusListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Batch f13548a;

    b(Batch batch) {
        this.f13548a = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        synchronized (this.f13548a.zai) {
            try {
                if (this.f13548a.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    this.f13548a.zag = true;
                } else if (!status.isSuccess()) {
                    this.f13548a.zaf = true;
                }
                Batch batch = this.f13548a;
                batch.zae--;
                Batch batch2 = this.f13548a;
                if (batch2.zae == 0) {
                    if (batch2.zag) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        Status status2 = batch2.zaf ? new Status(13) : Status.RESULT_SUCCESS;
                        Batch batch3 = this.f13548a;
                        batch3.setResult(new BatchResult(status2, batch3.zah));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
