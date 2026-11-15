package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class t extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f14111a;

    public t(Looper looper) {
        super(looper);
        this.f14111a = Looper.getMainLooper();
    }

    public t(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f14111a = Looper.getMainLooper();
    }
}
