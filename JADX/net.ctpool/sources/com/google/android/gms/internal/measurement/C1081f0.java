package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1081f0 extends Y implements InterfaceC1063d0 {
    C1081f0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1063d0
    public final Bundle b(Bundle bundle) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, bundle);
        Parcel parcelJ0 = j0(1, parcelI0);
        Bundle bundle2 = (Bundle) AbstractC1036a0.a(parcelJ0, Bundle.CREATOR);
        parcelJ0.recycle();
        return bundle2;
    }
}
