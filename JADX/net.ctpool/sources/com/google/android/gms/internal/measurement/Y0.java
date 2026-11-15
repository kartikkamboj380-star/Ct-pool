package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y0 extends AbstractBinderC1045b0 implements V0 {
    public Y0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1045b0
    protected final boolean i0(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
            long j7 = parcel.readLong();
            AbstractC1036a0.f(parcel);
            L(string, string2, bundle, j7);
            parcel2.writeNoException();
        } else {
            if (i7 != 2) {
                return false;
            }
            int iA = a();
            parcel2.writeNoException();
            parcel2.writeInt(iA);
        }
        return true;
    }
}
