package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zat;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractSafeParcelable {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f16412m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final zat f16413n;

    j(int i7, zat zatVar) {
        this.f16412m = i7;
        this.f16413n = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f16412m);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f16413n, i7, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
