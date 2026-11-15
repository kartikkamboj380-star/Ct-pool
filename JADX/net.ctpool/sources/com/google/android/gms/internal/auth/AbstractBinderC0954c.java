package com.google.android.gms.internal.auth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0954c extends Binder implements IInterface {
    protected AbstractBinderC0954c(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    protected abstract boolean i0(int i7, Parcel parcel, Parcel parcel2, int i8);

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i7, parcel, parcel2, i8)) {
            return true;
        }
        return i0(i7, parcel, parcel2, i8);
    }
}
