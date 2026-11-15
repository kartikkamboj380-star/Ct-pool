package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import java.util.concurrent.TimeUnit;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class g implements PendingResult.StatusListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ PendingResult f13692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2273m f13693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PendingResultUtil.ResultConverter f13694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ zas f13695d;

    g(PendingResult pendingResult, C2273m c2273m, PendingResultUtil.ResultConverter resultConverter, zas zasVar) {
        this.f13692a = pendingResult;
        this.f13693b = c2273m;
        this.f13694c = resultConverter;
        this.f13695d = zasVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        if (!status.isSuccess()) {
            this.f13693b.b(ApiExceptionUtil.fromStatus(status));
        } else {
            this.f13693b.c(this.f13694c.convert(this.f13692a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
