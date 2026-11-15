package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzac extends com.google.android.gms.internal.common.m implements IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.m
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            int i9 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.gms.internal.common.n.a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.n.b(parcel);
            onPostInitComplete(i9, strongBinder, bundle);
        } else if (i7 == 2) {
            int i10 = parcel.readInt();
            Bundle bundle2 = (Bundle) com.google.android.gms.internal.common.n.a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.n.b(parcel);
            zzb(i10, bundle2);
        } else {
            if (i7 != 3) {
                return false;
            }
            int i11 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) com.google.android.gms.internal.common.n.a(parcel, zzk.CREATOR);
            com.google.android.gms.internal.common.n.b(parcel);
            zzc(i11, strongBinder2, zzkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
