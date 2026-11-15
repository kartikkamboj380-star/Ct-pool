package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0948a implements F0 {
    J(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.F0
    public final Bundle Q(String str, Bundle bundle) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        AbstractC0975j.c(parcelI0, bundle);
        Parcel parcelJ0 = j0(2, parcelI0);
        Bundle bundle2 = (Bundle) AbstractC0975j.a(parcelJ0, Bundle.CREATOR);
        parcelJ0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.F0
    public final Bundle j(Account account, String str, Bundle bundle) {
        Parcel parcelI0 = i0();
        AbstractC0975j.c(parcelI0, account);
        parcelI0.writeString(str);
        AbstractC0975j.c(parcelI0, bundle);
        Parcel parcelJ0 = j0(5, parcelI0);
        Bundle bundle2 = (Bundle) AbstractC0975j.a(parcelJ0, Bundle.CREATOR);
        parcelJ0.recycle();
        return bundle2;
    }
}
