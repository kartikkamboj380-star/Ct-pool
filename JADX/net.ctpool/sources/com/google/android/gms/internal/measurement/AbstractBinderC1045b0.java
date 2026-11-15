package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1045b0 extends Binder implements IInterface {
    protected AbstractBinderC1045b0(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected abstract boolean i0(int i7, Parcel parcel, Parcel parcel2, int i8);

    @Override // android.os.Binder
    public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        boolean zOnTransact;
        if (i7 > 16777215) {
            zOnTransact = super.onTransact(i7, parcel, parcel2, i8);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return i0(i7, parcel, parcel2, i8);
    }
}
