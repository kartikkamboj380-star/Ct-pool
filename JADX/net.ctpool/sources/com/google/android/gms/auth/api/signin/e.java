package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import l3.C1848a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayListCreateTypedList = null;
        Account account = null;
        String strCreateString = null;
        String strCreateString2 = null;
        ArrayList arrayListCreateTypedList2 = null;
        String strCreateString3 = null;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.createParcelable(parcel, header, Account.CREATOR);
                    break;
                case 4:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    z7 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    z8 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header, C1848a.CREATOR);
                    break;
                case 10:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GoogleSignInOptions(i7, arrayListCreateTypedList, account, z6, z7, z8, strCreateString, strCreateString2, arrayListCreateTypedList2, strCreateString3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new GoogleSignInOptions[i7];
    }
}
