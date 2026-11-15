package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: loaded from: classes.dex */
public final class g extends com.google.android.gms.internal.base.a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void i0(int i7) {
        Parcel parcelZaa = zaa();
        parcelZaa.writeInt(i7);
        zac(7, parcelZaa);
    }

    public final void j0(IAccountAccessor iAccountAccessor, int i7, boolean z6) {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.c.d(parcelZaa, iAccountAccessor);
        parcelZaa.writeInt(i7);
        parcelZaa.writeInt(z6 ? 1 : 0);
        zac(9, parcelZaa);
    }

    public final void k0(j jVar, f fVar) {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.c.c(parcelZaa, jVar);
        com.google.android.gms.internal.base.c.d(parcelZaa, fVar);
        zac(12, parcelZaa);
    }
}
