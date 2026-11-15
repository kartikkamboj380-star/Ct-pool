package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class i extends zaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2273m f13731a;

    i(zay zayVar, C2273m c2273m) {
        this.f13731a = c2273m;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zac(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleInstallIntentResponse, this.f13731a);
    }
}
