package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

/* JADX INFO: loaded from: classes.dex */
public final class zam extends com.google.android.gms.internal.base.a implements IInterface {
    zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final com.google.android.gms.dynamic.a zae(com.google.android.gms.dynamic.a aVar, zax zaxVar) {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.c.d(parcelZaa, aVar);
        com.google.android.gms.internal.base.c.c(parcelZaa, zaxVar);
        Parcel parcelZab = zab(2, parcelZaa);
        com.google.android.gms.dynamic.a aVarI0 = a.AbstractBinderC0223a.i0(parcelZab.readStrongBinder());
        parcelZab.recycle();
        return aVarI0;
    }
}
