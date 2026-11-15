package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
public final class zag extends zac {
    private final TaskApiCall zaa;
    private final C2273m zab;
    private final StatusExceptionMapper zad;

    public zag(int i7, TaskApiCall taskApiCall, C2273m c2273m, StatusExceptionMapper statusExceptionMapper) {
        super(i7);
        this.zab = c2273m;
        this.zaa = taskApiCall;
        this.zad = statusExceptionMapper;
        if (i7 == 2 && taskApiCall.shouldAutoResolveMissingFeatures()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(zabq zabqVar) {
        return this.zaa.shouldAutoResolveMissingFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] zab(zabq zabqVar) {
        return this.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(Status status) {
        this.zab.d(this.zad.getException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(Exception exc) {
        this.zab.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq zabqVar) throws DeadObjectException {
        try {
            this.zaa.doExecute(zabqVar.zaf(), this.zab);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e8) {
            zad(zai.zah(e8));
        } catch (RuntimeException e9) {
            this.zab.d(e9);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(zaad zaadVar, boolean z6) {
        zaadVar.zad(this.zab, z6);
    }
}
