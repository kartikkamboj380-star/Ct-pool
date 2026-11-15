package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f14406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14407b;

    protected Y(IBinder iBinder, String str) {
        this.f14406a = iBinder;
        this.f14407b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f14406a;
    }

    protected final Parcel i0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f14407b);
        return parcelObtain;
    }

    protected final Parcel j0(int i7, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f14406a.transact(i7, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e7) {
                parcelObtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void k0(int i7, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f14406a.transact(i7, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
