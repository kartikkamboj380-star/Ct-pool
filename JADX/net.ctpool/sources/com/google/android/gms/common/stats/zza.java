package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        boolean z6 = false;
        String strCreateString = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        float f7 = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    j7 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                case 7:
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 4:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    i9 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 8:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 10:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    i8 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 14:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 15:
                    f7 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 16:
                    j9 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 17:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new WakeLockEvent(i7, j7, i8, strCreateString, i9, arrayListCreateStringList, strCreateString2, j8, i10, strCreateString3, strCreateString4, f7, j9, strCreateString5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new WakeLockEvent[i7];
    }
}
