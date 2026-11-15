package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.m;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.dynamic.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0223a extends m implements a {
        public AbstractBinderC0223a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a i0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new d(iBinder);
        }
    }
}
