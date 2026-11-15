package com.google.android.gms.internal.auth;

import android.os.Binder;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1001s {
    public static Object a(InterfaceC1004t interfaceC1004t) {
        try {
            return interfaceC1004t.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC1004t.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
