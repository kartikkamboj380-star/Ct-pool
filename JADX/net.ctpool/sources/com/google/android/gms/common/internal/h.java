package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* JADX INFO: loaded from: classes.dex */
final class h implements PendingResultUtil.ResultConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Response f13696a;

    h(Response response) {
        this.f13696a = response;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* bridge */ /* synthetic */ Object convert(Result result) {
        this.f13696a.setResult(result);
        return this.f13696a;
    }
}
