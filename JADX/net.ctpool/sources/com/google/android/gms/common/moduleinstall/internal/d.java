package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class d extends zaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2273m f13723a;

    d(zay zayVar, C2273m c2273m) {
        this.f13723a = c2273m;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zae(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleAvailabilityResponse, this.f13723a);
    }
}
