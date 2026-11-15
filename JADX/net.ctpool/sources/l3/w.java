package l3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import r3.AbstractC2026a;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC2026a implements IInterface {
    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void k0(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelI0 = i0();
        r3.d.d(parcelI0, vVar);
        r3.d.c(parcelI0, googleSignInOptions);
        j0(103, parcelI0);
    }

    public final void l0(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelI0 = i0();
        r3.d.d(parcelI0, vVar);
        r3.d.c(parcelI0, googleSignInOptions);
        j0(102, parcelI0);
    }

    public final void m0(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelI0 = i0();
        r3.d.d(parcelI0, vVar);
        r3.d.c(parcelI0, googleSignInOptions);
        j0(101, parcelI0);
    }
}
