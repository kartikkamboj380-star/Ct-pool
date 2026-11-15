package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
abstract class S extends zac {
    protected final C2273m zaa;

    public S(int i7, C2273m c2273m) {
        super(i7);
        this.zaa = c2273m;
    }

    protected abstract void zac(zabq zabqVar);

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(Status status) {
        this.zaa.d(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(Exception exc) {
        this.zaa.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq zabqVar) throws DeadObjectException {
        try {
            zac(zabqVar);
        } catch (DeadObjectException e7) {
            zad(zai.zah(e7));
            throw e7;
        } catch (RemoteException e8) {
            zad(zai.zah(e8));
        } catch (RuntimeException e9) {
            this.zaa.d(e9);
        }
    }
}
