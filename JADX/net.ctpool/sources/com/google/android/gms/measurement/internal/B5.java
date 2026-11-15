package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class B5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<B5> CREATOR = new A5();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f15385n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f15386o;

    B5(String str, long j7, int i7) {
        this.f15384m = str;
        this.f15385n = j7;
        this.f15386o = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f15384m, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f15385n);
        SafeParcelWriter.writeInt(parcel, 3, this.f15386o);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
