package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public interface IStatusCallback extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.base.b implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        public static IStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return iInterfaceQueryLocalInterface instanceof IStatusCallback ? (IStatusCallback) iInterfaceQueryLocalInterface : new zaby(iBinder);
        }

        @Override // com.google.android.gms.internal.base.b
        protected final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 != 1) {
                return false;
            }
            Status status = (Status) com.google.android.gms.internal.base.c.a(parcel, Status.CREATOR);
            com.google.android.gms.internal.base.c.b(parcel);
            onResult(status);
            return true;
        }
    }

    void onResult(Status status);
}
