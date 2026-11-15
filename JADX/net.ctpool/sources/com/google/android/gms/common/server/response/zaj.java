package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* JADX INFO: loaded from: classes.dex */
public final class zaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        zaa zaaVar = null;
        int i7 = 0;
        int i8 = 0;
        boolean z6 = false;
        int i9 = 0;
        boolean z7 = false;
        int i10 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i8 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    i9 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    z7 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    zaaVar = (zaa) SafeParcelReader.createParcelable(parcel, header, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new FastJsonResponse.Field(i7, i8, z6, i9, z7, strCreateString, i10, strCreateString2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new FastJsonResponse.Field[i7];
    }
}
