package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class N extends TaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskApiCall.Builder f13580a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(TaskApiCall.Builder builder, Feature[] featureArr, boolean z6, int i7) {
        super(featureArr, z6, i7);
        this.f13580a = builder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final void doExecute(Api.AnyClient anyClient, C2273m c2273m) {
        this.f13580a.zaa.accept(anyClient, c2273m);
    }
}
