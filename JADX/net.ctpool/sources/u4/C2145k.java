package u4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import u4.C2144j;

/* JADX INFO: renamed from: u4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2145k implements Parcelable.Creator {
    static void c(C2144j c2144j, Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, c2144j.f(), i7, false);
        SafeParcelWriter.writeParcelable(parcel, 2, c2144j.w(), i7, false);
        SafeParcelWriter.writeTypedList(parcel, 3, c2144j.a0(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2144j createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayListCreateTypedList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                uri = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
            } else if (fieldId == 2) {
                uri2 = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, C2144j.a.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C2144j(uri, uri2, arrayListCreateTypedList);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2144j[] newArray(int i7) {
        return new C2144j[i7];
    }
}
