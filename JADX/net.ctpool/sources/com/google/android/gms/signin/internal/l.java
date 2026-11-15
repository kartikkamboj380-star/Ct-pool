package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractSafeParcelable {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f16414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConnectionResult f16415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final zav f16416o;

    l(int i7, ConnectionResult connectionResult, zav zavVar) {
        this.f16414m = i7;
        this.f16415n = connectionResult;
        this.f16416o = zavVar;
    }

    public final zav w() {
        return this.f16416o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f16414m);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f16415n, i7, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f16416o, i7, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.f16415n;
    }
}
