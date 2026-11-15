package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zan implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        long j7 = 0;
        long j8 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i8 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i9 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    j7 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 5:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new MethodInvocation(i8, i9, i10, j7, j8, strCreateString, strCreateString2, i11, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new MethodInvocation[i7];
    }
}
