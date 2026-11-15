package Q3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0452a implements k {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Q3.k
    public final void u(String str, Bundle bundle, m mVar) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        h.c(parcelI0, bundle);
        parcelI0.writeStrongBinder(mVar);
        j0(2, parcelI0);
    }
}
