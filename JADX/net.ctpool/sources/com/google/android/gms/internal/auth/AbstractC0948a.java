package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0948a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f13873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13874b;

    protected AbstractC0948a(IBinder iBinder, String str) {
        this.f13873a = iBinder;
        this.f13874b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13873a;
    }

    protected final Parcel i0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f13874b);
        return parcelObtain;
    }

    protected final Parcel j0(int i7, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f13873a.transact(i7, parcel, parcelObtain, 0);
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
            this.f13873a.transact(i7, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
