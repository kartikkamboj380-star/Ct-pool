package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.c;

/* JADX INFO: loaded from: classes.dex */
public final class zaz extends com.google.android.gms.dynamic.c {
    private static final zaz zaa = new zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i7, int i8) throws c.a {
        zaz zazVar = zaa;
        try {
            return (View) com.google.android.gms.dynamic.b.j0(((zam) zazVar.getRemoteCreatorInstance(context)).zae(com.google.android.gms.dynamic.b.k0(context), new zax(1, i7, i8, null)));
        } catch (Exception e7) {
            throw new c.a("Could not get button with size " + i7 + " and color " + i8, e7);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof zam ? (zam) iInterfaceQueryLocalInterface : new zam(iBinder);
    }
}
