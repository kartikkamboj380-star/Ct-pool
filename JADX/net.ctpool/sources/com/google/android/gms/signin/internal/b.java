package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f16407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f16408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Intent f16409o;

    b(int i7, int i8, Intent intent) {
        this.f16407m = i7;
        this.f16408n = i8;
        this.f16409o = intent;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f16408n == 0 ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f16407m;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i8);
        SafeParcelWriter.writeInt(parcel, 2, this.f16408n);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f16409o, i7, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
