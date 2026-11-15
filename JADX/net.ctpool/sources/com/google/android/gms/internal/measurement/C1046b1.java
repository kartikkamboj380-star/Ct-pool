package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1046b1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j7 = 0;
        long j8 = 0;
        boolean z6 = false;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        Bundle bundleCreateBundle = null;
        String strCreateString4 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    j7 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 2:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 8:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C1055c1(j7, j8, z6, strCreateString, strCreateString2, strCreateString3, bundleCreateBundle, strCreateString4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1055c1[i7];
    }
}
