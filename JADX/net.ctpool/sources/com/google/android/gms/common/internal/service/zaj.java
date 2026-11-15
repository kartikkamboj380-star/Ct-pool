package com.google.android.gms.common.internal.service;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zaj extends com.google.android.gms.internal.base.b implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.b
    protected final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        int i9 = parcel.readInt();
        com.google.android.gms.internal.base.c.b(parcel);
        zab(i9);
        return true;
    }
}
