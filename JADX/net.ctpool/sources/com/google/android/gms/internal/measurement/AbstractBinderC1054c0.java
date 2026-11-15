package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1054c0 extends AbstractBinderC1045b0 implements InterfaceC1063d0 {
    public static InterfaceC1063d0 j0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1063d0 ? (InterfaceC1063d0) iInterfaceQueryLocalInterface : new C1081f0(iBinder);
    }
}
