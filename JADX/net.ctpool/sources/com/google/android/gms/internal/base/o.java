package com.google.android.gms.internal.base;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f14076a;

    static {
        f14076a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
