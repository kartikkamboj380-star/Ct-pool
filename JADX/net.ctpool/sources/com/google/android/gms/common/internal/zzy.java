package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.common.AbstractC1024a;

/* JADX INFO: loaded from: classes.dex */
public final class zzy extends AbstractC1024a implements zzaa {
    zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
        Parcel parcelZzB = zzB(2, zza());
        int i7 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i7;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final com.google.android.gms.dynamic.a zzd() {
        Parcel parcelZzB = zzB(1, zza());
        com.google.android.gms.dynamic.a aVarI0 = a.AbstractBinderC0223a.i0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarI0;
    }
}
