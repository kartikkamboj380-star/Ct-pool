package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1256z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f14993a = new C1248y0();

    public static SharedPreferences a(Context context, String str, int i7, AbstractC1188r0 abstractC1188r0) {
        SharedPreferencesC1215u0 sharedPreferencesC1215u0 = AbstractC1126k0.a().a(str, abstractC1188r0, EnumC1162o0.SHARED_PREFS_TYPE).equals("") ? new SharedPreferencesC1215u0() : null;
        if (sharedPreferencesC1215u0 != null) {
            return sharedPreferencesC1215u0;
        }
        ThreadLocal threadLocal = f14993a;
        U3.h.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            f14993a.set(Boolean.TRUE);
            throw th;
        }
    }
}
