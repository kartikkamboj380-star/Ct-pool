package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f14136a;

    static {
        f14136a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public static PendingIntent a(Context context, int i7, Intent intent, int i8) {
        return PendingIntent.getBroadcast(context, 0, intent, i8);
    }
}
