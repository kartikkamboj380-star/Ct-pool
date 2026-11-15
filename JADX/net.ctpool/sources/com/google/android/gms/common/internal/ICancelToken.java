package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface ICancelToken extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.m implements ICancelToken {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        public static ICancelToken asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return iInterfaceQueryLocalInterface instanceof ICancelToken ? (ICancelToken) iInterfaceQueryLocalInterface : new zzx(iBinder);
        }

        @Override // com.google.android.gms.internal.common.m
        protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel();
}
