package l3;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends r3.c implements v {
    public u() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // r3.c
    protected final boolean i0(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) r3.d.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) r3.d.a(parcel, Status.CREATOR);
                r3.d.b(parcel);
                H(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) r3.d.a(parcel, Status.CREATOR);
                r3.d.b(parcel);
                K(status2);
                break;
            case 103:
                Status status3 = (Status) r3.d.a(parcel, Status.CREATOR);
                r3.d.b(parcel);
                G(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
