package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class Y1 extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2273m f13872a;

    Y1(C0951b c0951b, C2273m c2273m) {
        this.f13872a = c2273m;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        C0951b.c(status, null, this.f13872a);
    }
}
