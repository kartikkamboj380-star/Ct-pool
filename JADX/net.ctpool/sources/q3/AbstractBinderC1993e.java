package q3;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: q3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1993e extends AbstractBinderC1990b implements InterfaceC1994f {
    public static InterfaceC1994f i0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1994f ? (InterfaceC1994f) iInterfaceQueryLocalInterface : new C1992d(iBinder);
    }
}
