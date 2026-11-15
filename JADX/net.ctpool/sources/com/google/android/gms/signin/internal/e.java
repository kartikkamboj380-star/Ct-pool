package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends com.google.android.gms.internal.base.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.b
    protected final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 3:
                com.google.android.gms.internal.base.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
            case 6:
                com.google.android.gms.internal.base.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
            default:
                return false;
            case 7:
                com.google.android.gms.internal.base.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                l lVar = (l) com.google.android.gms.internal.base.c.a(parcel, l.CREATOR);
                com.google.android.gms.internal.base.c.b(parcel);
                zab(lVar);
                parcel2.writeNoException();
                return true;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                com.google.android.gms.internal.base.c.b(parcel);
                parcel2.writeNoException();
                return true;
        }
    }
}
