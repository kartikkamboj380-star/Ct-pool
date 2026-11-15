package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class j extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2273m f13732a;

    j(zay zayVar, C2273m c2273m) {
        this.f13732a = c2273m;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.trySetResultOrApiException(status, null, this.f13732a);
    }
}
