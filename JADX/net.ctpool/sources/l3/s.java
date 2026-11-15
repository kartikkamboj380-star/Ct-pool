package l3;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends r3.c implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // r3.c
    protected final boolean i0(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            t();
        } else {
            if (i7 != 2) {
                return false;
            }
            g();
        }
        return true;
    }
}
