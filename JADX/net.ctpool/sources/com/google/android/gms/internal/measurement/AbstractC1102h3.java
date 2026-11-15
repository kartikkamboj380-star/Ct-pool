package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1102h3 {
    public static Object a(InterfaceC1129k3 interfaceC1129k3) {
        try {
            return interfaceC1129k3.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC1129k3.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
