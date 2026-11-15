package u4;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: u4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2136b implements Parcelable.Creator {
    static void c(C2135a c2135a, Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, c2135a.n0(), false);
        SafeParcelWriter.writeString(parcel, 2, c2135a.a0(), false);
        SafeParcelWriter.writeInt(parcel, 3, c2135a.H0());
        SafeParcelWriter.writeLong(parcel, 4, c2135a.w());
        SafeParcelWriter.writeBundle(parcel, 5, c2135a.B0(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, c2135a.S0(), i7, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2135a createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        Bundle bundleCreateBundle = null;
        Uri uri = null;
        int i7 = 0;
        long j7 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    j7 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 5:
                    bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C2135a(strCreateString, strCreateString2, i7, j7, bundleCreateBundle, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2135a[] newArray(int i7) {
        return new C2135a[i7];
    }
}
