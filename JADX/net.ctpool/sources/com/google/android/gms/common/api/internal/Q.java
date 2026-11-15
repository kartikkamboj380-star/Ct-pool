package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class Q extends com.google.android.gms.internal.base.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zada f13583a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(zada zadaVar, Looper looper) {
        super(looper);
        this.f13583a = zadaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Status statusZaa;
        int i7 = message.what;
        if (i7 != 0) {
            if (i7 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i7);
            return;
        }
        PendingResult pendingResult = (PendingResult) message.obj;
        synchronized (this.f13583a.zae) {
            try {
                zada zadaVar = (zada) Preconditions.checkNotNull(this.f13583a.zab);
                if (pendingResult == null) {
                    statusZaa = new Status(13, "Transform returned null");
                } else if (pendingResult instanceof zacp) {
                    statusZaa = ((zacp) pendingResult).zaa();
                } else {
                    zadaVar.zai(pendingResult);
                }
                zadaVar.zaj(statusZaa);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
