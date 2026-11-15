package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class H2 extends K2 implements J2 {
    H2(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.J2
    public final Bundle A(int i7, String str, String str2, String str3, String str4) {
        Parcel parcelI0 = i0();
        parcelI0.writeInt(3);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        parcelI0.writeString(str3);
        parcelI0.writeString(null);
        Parcel parcelJ0 = j0(3, parcelI0);
        Bundle bundle = (Bundle) M2.a(parcelJ0, Bundle.CREATOR);
        parcelJ0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.J2
    public final Bundle N(int i7, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelI0 = i0();
        parcelI0.writeInt(i7);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        parcelI0.writeString(str3);
        parcelI0.writeString(null);
        M2.b(parcelI0, bundle);
        Parcel parcelJ0 = j0(8, parcelI0);
        Bundle bundle2 = (Bundle) M2.a(parcelJ0, Bundle.CREATOR);
        parcelJ0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.J2
    public final int V(int i7, String str, String str2, Bundle bundle) {
        Parcel parcelI0 = i0();
        parcelI0.writeInt(i7);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        M2.b(parcelI0, bundle);
        Parcel parcelJ0 = j0(10, parcelI0);
        int i8 = parcelJ0.readInt();
        parcelJ0.recycle();
        return i8;
    }

    @Override // com.google.android.gms.internal.play_billing.J2
    public final Bundle Z(int i7, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelI0 = i0();
        parcelI0.writeInt(i7);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        parcelI0.writeString(str3);
        M2.b(parcelI0, bundle);
        Parcel parcelJ0 = j0(11, parcelI0);
        Bundle bundle2 = (Bundle) M2.a(parcelJ0, Bundle.CREATOR);
        parcelJ0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.J2
    public final Bundle f(int i7, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelI0 = i0();
        parcelI0.writeInt(i7);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        M2.b(parcelI0, bundle);
        M2.b(parcelI0, bundle2);
        Parcel parcelJ0 = j0(901, parcelI0);
        Bundle bundle3 = (Bundle) M2.a(parcelJ0, Bundle.CREATOR);
        parcelJ0.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.J2
    public final Bundle f0(int i7, String str, String str2, Bundle bundle) {
        Parcel parcelI0 = i0();
        parcelI0.writeInt(9);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        M2.b(parcelI0, bundle);
        Parcel parcelJ0 = j0(902, parcelI0);
        Bundle bundle2 = (Bundle) M2.a(parcelJ0, Bundle.CREATOR);
        parcelJ0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.J2
    public final int h(int i7, String str, String str2) {
        Parcel parcelI0 = i0();
        parcelI0.writeInt(3);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        Parcel parcelJ0 = j0(5, parcelI0);
        int i8 = parcelJ0.readInt();
        parcelJ0.recycle();
        return i8;
    }

    @Override // com.google.android.gms.internal.play_billing.J2
    public final Bundle i(int i7, String str, String str2, Bundle bundle) {
        Parcel parcelI0 = i0();
        parcelI0.writeInt(9);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        M2.b(parcelI0, bundle);
        Parcel parcelJ0 = j0(12, parcelI0);
        Bundle bundle2 = (Bundle) M2.a(parcelJ0, Bundle.CREATOR);
        parcelJ0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.J2
    public final int k(int i7, String str, String str2) {
        Parcel parcelI0 = i0();
        parcelI0.writeInt(i7);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        Parcel parcelJ0 = j0(1, parcelI0);
        int i8 = parcelJ0.readInt();
        parcelJ0.recycle();
        return i8;
    }

    @Override // com.google.android.gms.internal.play_billing.J2
    public final Bundle o(int i7, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelI0 = i0();
        parcelI0.writeInt(6);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        parcelI0.writeString(str3);
        M2.b(parcelI0, bundle);
        Parcel parcelJ0 = j0(9, parcelI0);
        Bundle bundle2 = (Bundle) M2.a(parcelJ0, Bundle.CREATOR);
        parcelJ0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.J2
    public final Bundle z(int i7, String str, String str2, String str3) {
        Parcel parcelI0 = i0();
        parcelI0.writeInt(3);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        parcelI0.writeString(str3);
        Parcel parcelJ0 = j0(4, parcelI0);
        Bundle bundle = (Bundle) M2.a(parcelJ0, Bundle.CREATOR);
        parcelJ0.recycle();
        return bundle;
    }
}
