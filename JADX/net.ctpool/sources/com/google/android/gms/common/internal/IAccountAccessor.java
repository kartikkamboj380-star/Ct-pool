package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IAccountAccessor extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.m implements IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static IAccountAccessor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzw(iBinder);
        }

        @Override // com.google.android.gms.internal.common.m
        protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 != 2) {
                return false;
            }
            Account accountZzb = zzb();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.n.d(parcel2, accountZzb);
            return true;
        }
    }

    Account zzb();
}
