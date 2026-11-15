package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.AbstractC1024a;

/* JADX INFO: loaded from: classes.dex */
public final class zzab extends AbstractC1024a implements IGmsCallbacks {
    zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i7, IBinder iBinder, Bundle bundle) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.n.c(parcelZza, bundle);
        zzC(1, parcelZza);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i7, Bundle bundle) {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i7, IBinder iBinder, zzk zzkVar) {
        throw null;
    }
}
