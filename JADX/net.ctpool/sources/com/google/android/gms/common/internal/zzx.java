package com.google.android.gms.common.internal;

import android.os.IBinder;
import com.google.android.gms.internal.common.AbstractC1024a;

/* JADX INFO: loaded from: classes.dex */
public final class zzx extends AbstractC1024a implements ICancelToken {
    zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() {
        zzD(2, zza());
    }
}
