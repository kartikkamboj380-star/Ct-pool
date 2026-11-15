package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzz;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    @SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    private final k zzb;

    @SafeParcelable.Field(getter = "getAllowTestKeys", id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    private final boolean zzd;

    @SafeParcelable.Constructor
    zzs(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z6, @SafeParcelable.Param(id = 4) boolean z7) {
        this.zza = str;
        l lVar = null;
        if (iBinder != null) {
            try {
                com.google.android.gms.dynamic.a aVarZzd = zzz.zzg(iBinder).zzd();
                byte[] bArr = aVarZzd == null ? null : (byte[]) com.google.android.gms.dynamic.b.j0(aVarZzd);
                if (bArr != null) {
                    lVar = new l(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e7) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e7);
            }
        }
        this.zzb = lVar;
        this.zzc = z6;
        this.zzd = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        k kVar = this.zzb;
        if (kVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            kVar = null;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, kVar, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzs(String str, k kVar, boolean z6, boolean z7) {
        this.zza = str;
        this.zzb = kVar;
        this.zzc = z6;
        this.zzd = z7;
    }
}
