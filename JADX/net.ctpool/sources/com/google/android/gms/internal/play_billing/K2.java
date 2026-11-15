package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class K2 implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f15061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15062b = "com.android.vending.billing.IInAppBillingService";

    protected K2(IBinder iBinder, String str) {
        this.f15061a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15061a;
    }

    protected final Parcel i0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f15062b);
        return parcelObtain;
    }

    protected final Parcel j0(int i7, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f15061a.transact(i7, parcel, parcelObtain, 0);
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
}
