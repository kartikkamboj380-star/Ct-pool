package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class T0 extends AbstractBinderC1045b0 implements U0 {
    public T0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1045b0
    protected final boolean i0(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
        AbstractC1036a0.f(parcel);
        b(bundle);
        parcel2.writeNoException();
        return true;
    }
}
