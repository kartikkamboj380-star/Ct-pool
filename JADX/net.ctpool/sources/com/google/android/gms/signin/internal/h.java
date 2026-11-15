package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f16410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f16411n;

    public h(List list, String str) {
        this.f16410m = list;
        this.f16411n = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f16411n != null ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f16410m;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, list, false);
        SafeParcelWriter.writeString(parcel, 2, this.f16411n, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
