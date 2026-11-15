package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0932k extends AbstractC0944x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f13634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0932k(C0933l c0933l, zabf zabfVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabfVar);
        this.f13634b = connectionProgressReportCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0944x
    public final void a() {
        this.f13634b.onReportServiceBinding(new ConnectionResult(16, null));
    }
}
