package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class zae extends zai {
    protected final BaseImplementation.ApiMethodImpl zaa;

    public zae(int i7, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        super(i7);
        this.zaa = (BaseImplementation.ApiMethodImpl) Preconditions.checkNotNull(apiMethodImpl, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(Status status) {
        try {
            this.zaa.setFailedResult(status);
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(Exception exc) {
        try {
            this.zaa.setFailedResult(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq zabqVar) throws DeadObjectException {
        try {
            this.zaa.run(zabqVar.zaf());
        } catch (RuntimeException e7) {
            zae(e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(zaad zaadVar, boolean z6) {
        zaadVar.zac(this.zaa, z6);
    }
}
