package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC0945y extends com.google.android.gms.internal.base.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zabi f13656a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC0945y(zabi zabiVar, Looper looper) {
        super(looper);
        this.f13656a = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 1) {
            ((AbstractC0944x) message.obj).b(this.f13656a);
        } else {
            if (i7 == 2) {
                throw ((RuntimeException) message.obj);
            }
            Log.w("GACStateManager", "Unknown message id: " + i7);
        }
    }
}
