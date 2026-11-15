package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzs;
import com.google.android.gms.internal.common.AbstractC1024a;

/* JADX INFO: loaded from: classes.dex */
public final class zzae extends AbstractC1024a implements zzag {
    zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zze(com.google.android.gms.common.zzo zzoVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.n.c(parcelZza, zzoVar);
        Parcel parcelZzB = zzB(6, parcelZza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) com.google.android.gms.internal.common.n.a(parcelZzB, com.google.android.gms.common.zzq.CREATOR);
        parcelZzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zzf(com.google.android.gms.common.zzo zzoVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.n.c(parcelZza, zzoVar);
        Parcel parcelZzB = zzB(8, parcelZza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) com.google.android.gms.internal.common.n.a(parcelZzB, com.google.android.gms.common.zzq.CREATOR);
        parcelZzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzg() {
        Parcel parcelZzB = zzB(9, zza());
        boolean zF = com.google.android.gms.internal.common.n.f(parcelZzB);
        parcelZzB.recycle();
        return zF;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzh(zzs zzsVar, com.google.android.gms.dynamic.a aVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.n.c(parcelZza, zzsVar);
        com.google.android.gms.internal.common.n.e(parcelZza, aVar);
        Parcel parcelZzB = zzB(5, parcelZza);
        boolean zF = com.google.android.gms.internal.common.n.f(parcelZzB);
        parcelZzB.recycle();
        return zF;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzi() {
        Parcel parcelZzB = zzB(7, zza());
        boolean zF = com.google.android.gms.internal.common.n.f(parcelZzB);
        parcelZzB.recycle();
        return zF;
    }
}
