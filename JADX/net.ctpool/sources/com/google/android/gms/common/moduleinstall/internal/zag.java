package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* JADX INFO: loaded from: classes.dex */
public abstract class zag extends com.google.android.gms.internal.base.b implements zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // com.google.android.gms.internal.base.b
    protected final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        ModuleInstallStatusUpdate moduleInstallStatusUpdate = (ModuleInstallStatusUpdate) com.google.android.gms.internal.base.c.a(parcel, ModuleInstallStatusUpdate.CREATOR);
        com.google.android.gms.internal.base.c.b(parcel);
        zab(moduleInstallStatusUpdate);
        return true;
    }
}
