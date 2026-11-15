package com.facebook.react.devsupport;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f11664a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11665b;

    static {
        f11665b = Build.VERSION.SDK_INT < 26 ? 2006 : 2038;
    }

    private i0() {
    }
}
