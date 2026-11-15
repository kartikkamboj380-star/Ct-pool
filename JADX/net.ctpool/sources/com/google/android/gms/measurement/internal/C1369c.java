package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1369c {
    C1369c(Context context) {
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
