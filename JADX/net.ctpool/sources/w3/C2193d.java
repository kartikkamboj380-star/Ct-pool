package w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: w3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2193d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        com.google.android.gms.measurement.internal.D d7 = null;
        String strCreateString2 = null;
        long j7 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                d7 = (com.google.android.gms.measurement.internal.D) SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.measurement.internal.D.CREATOR);
            } else if (fieldId == 4) {
                strCreateString2 = SafeParcelReader.createString(parcel, header);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                j7 = SafeParcelReader.readLong(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.measurement.internal.E(strCreateString, d7, strCreateString2, j7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new com.google.android.gms.measurement.internal.E[i7];
    }
}
