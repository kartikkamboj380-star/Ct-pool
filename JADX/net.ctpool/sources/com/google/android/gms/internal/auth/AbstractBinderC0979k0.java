package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0979k0 extends AbstractBinderC0954c implements F0 {
    public static F0 j0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        return iInterfaceQueryLocalInterface instanceof F0 ? (F0) iInterfaceQueryLocalInterface : new J(iBinder);
    }
}
