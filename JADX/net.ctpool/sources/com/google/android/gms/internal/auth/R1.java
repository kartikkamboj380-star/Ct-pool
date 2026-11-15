package com.google.android.gms.internal.auth;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class R1 extends AbstractBinderC0954c implements S1 {
    public R1() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override // com.google.android.gms.internal.auth.AbstractBinderC0954c
    protected final boolean i0(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        Status status = (Status) AbstractC0975j.a(parcel, Status.CREATOR);
        Bundle bundle = (Bundle) AbstractC0975j.a(parcel, Bundle.CREATOR);
        AbstractC0975j.b(parcel);
        W(status, bundle);
        return true;
    }
}
