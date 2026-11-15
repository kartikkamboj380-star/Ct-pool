package Q3;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends g implements m {
    public l() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // Q3.g
    protected final boolean i0(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 2) {
            Bundle bundle = (Bundle) h.a(parcel, Bundle.CREATOR);
            h.b(parcel);
            I(bundle);
            return true;
        }
        if (i7 != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) h.a(parcel, Bundle.CREATOR);
        h.b(parcel);
        O(bundle2);
        return true;
    }
}
