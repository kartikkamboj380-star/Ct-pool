package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public class W implements Parcelable.Creator {
    static void c(V v6, Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, v6.f17548m, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public V createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) != 2) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new V(bundleCreateBundle);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public V[] newArray(int i7) {
        return new V[i7];
    }
}
