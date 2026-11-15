package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.common.AbstractC1024a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC1024a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int i0() {
        Parcel parcelZzB = zzB(6, zza());
        int i7 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i7;
    }

    public final int j0(com.google.android.gms.dynamic.a aVar, String str, boolean z6) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.n.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z6 ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i7 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i7;
    }

    public final int k0(com.google.android.gms.dynamic.a aVar, String str, boolean z6) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.n.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z6 ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i7 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i7;
    }

    public final com.google.android.gms.dynamic.a l0(com.google.android.gms.dynamic.a aVar, String str, int i7) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.n.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        Parcel parcelZzB = zzB(2, parcelZza);
        com.google.android.gms.dynamic.a aVarI0 = a.AbstractBinderC0223a.i0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarI0;
    }

    public final com.google.android.gms.dynamic.a m0(com.google.android.gms.dynamic.a aVar, String str, int i7, com.google.android.gms.dynamic.a aVar2) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.n.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        com.google.android.gms.internal.common.n.e(parcelZza, aVar2);
        Parcel parcelZzB = zzB(8, parcelZza);
        com.google.android.gms.dynamic.a aVarI0 = a.AbstractBinderC0223a.i0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarI0;
    }

    public final com.google.android.gms.dynamic.a n0(com.google.android.gms.dynamic.a aVar, String str, int i7) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.n.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        Parcel parcelZzB = zzB(4, parcelZza);
        com.google.android.gms.dynamic.a aVarI0 = a.AbstractBinderC0223a.i0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarI0;
    }

    public final com.google.android.gms.dynamic.a o0(com.google.android.gms.dynamic.a aVar, String str, boolean z6, long j7) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.n.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z6 ? 1 : 0);
        parcelZza.writeLong(j7);
        Parcel parcelZzB = zzB(7, parcelZza);
        com.google.android.gms.dynamic.a aVarI0 = a.AbstractBinderC0223a.i0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarI0;
    }
}
