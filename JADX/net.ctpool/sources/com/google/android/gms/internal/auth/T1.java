package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* JADX INFO: loaded from: classes.dex */
public final class T1 extends AbstractC0948a implements IInterface {
    T1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void l0(IStatusCallback iStatusCallback, C0966g c0966g) {
        Parcel parcelI0 = i0();
        AbstractC0975j.d(parcelI0, iStatusCallback);
        AbstractC0975j.c(parcelI0, c0966g);
        k0(2, parcelI0);
    }

    public final void m0(S1 s12, Account account, String str, Bundle bundle) {
        Parcel parcelI0 = i0();
        AbstractC0975j.d(parcelI0, s12);
        AbstractC0975j.c(parcelI0, account);
        parcelI0.writeString(str);
        AbstractC0975j.c(parcelI0, bundle);
        k0(1, parcelI0);
    }
}
