package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC0942v extends com.google.android.gms.internal.base.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zabe f13653a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC0942v(zabe zabeVar, Looper looper) {
        super(looper);
        this.f13653a = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 1) {
            zabe.zaj(this.f13653a);
            return;
        }
        if (i7 == 2) {
            zabe.zai(this.f13653a);
            return;
        }
        Log.w("GoogleApiClientImpl", "Unknown message id: " + i7);
    }
}
