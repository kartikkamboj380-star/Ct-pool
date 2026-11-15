package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class f extends zaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2273m f13725a;

    f(zay zayVar, C2273m c2273m) {
        this.f13725a = c2273m;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(Status status, ModuleInstallResponse moduleInstallResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleInstallResponse, this.f13725a);
    }
}
