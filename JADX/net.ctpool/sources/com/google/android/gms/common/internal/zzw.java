package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.AbstractC1024a;

/* JADX INFO: loaded from: classes.dex */
public final class zzw extends AbstractC1024a implements IAccountAccessor {
    zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() {
        Parcel parcelZzB = zzB(2, zza());
        Account account = (Account) com.google.android.gms.internal.common.n.a(parcelZzB, Account.CREATOR);
        parcelZzB.recycle();
        return account;
    }
}
