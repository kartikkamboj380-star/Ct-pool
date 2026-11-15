package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1376d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        Y5 y52 = null;
        String strCreateString3 = null;
        E e7 = null;
        E e8 = null;
        E e9 = null;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        boolean z6 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    y52 = (Y5) SafeParcelReader.createParcelable(parcel, header, Y5.CREATOR);
                    break;
                case 5:
                    j7 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    e7 = (E) SafeParcelReader.createParcelable(parcel, header, E.CREATOR);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 10:
                    e8 = (E) SafeParcelReader.createParcelable(parcel, header, E.CREATOR);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    j9 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    e9 = (E) SafeParcelReader.createParcelable(parcel, header, E.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C1383e(strCreateString, strCreateString2, y52, j7, z6, strCreateString3, e7, j8, e8, j9, e9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1383e[i7];
    }
}
