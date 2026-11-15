package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class X0 extends Y implements V0 {
    X0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.V0
    public final void L(String str, String str2, Bundle bundle, long j7) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        AbstractC1036a0.d(parcelI0, bundle);
        parcelI0.writeLong(j7);
        k0(1, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.V0
    public final int a() {
        Parcel parcelJ0 = j0(2, i0());
        int i7 = parcelJ0.readInt();
        parcelJ0.recycle();
        return i7;
    }
}
