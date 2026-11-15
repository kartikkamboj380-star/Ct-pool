package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.common.AbstractC1024a;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC1024a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final com.google.android.gms.dynamic.a i0(com.google.android.gms.dynamic.a aVar, String str, int i7, com.google.android.gms.dynamic.a aVar2) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.n.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        com.google.android.gms.internal.common.n.e(parcelZza, aVar2);
        Parcel parcelZzB = zzB(2, parcelZza);
        com.google.android.gms.dynamic.a aVarI0 = a.AbstractBinderC0223a.i0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarI0;
    }

    public final com.google.android.gms.dynamic.a j0(com.google.android.gms.dynamic.a aVar, String str, int i7, com.google.android.gms.dynamic.a aVar2) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.n.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        com.google.android.gms.internal.common.n.e(parcelZza, aVar2);
        Parcel parcelZzB = zzB(3, parcelZza);
        com.google.android.gms.dynamic.a aVarI0 = a.AbstractBinderC0223a.i0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarI0;
    }
}
