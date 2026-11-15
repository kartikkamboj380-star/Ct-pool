package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends Y implements U0 {
    W0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.U0
    public final void b(Bundle bundle) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, bundle);
        k0(1, parcelI0);
    }
}
