package Q3;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends g implements k {
    public static k j0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new i(iBinder);
    }
}
