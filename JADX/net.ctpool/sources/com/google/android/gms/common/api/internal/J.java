package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class J extends RegisterListenerMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ RegistrationMethods.Builder f13575a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z6, int i7) {
        super(listenerHolder, featureArr, z6, i7);
        this.f13575a = builder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    protected final void registerListener(Api.AnyClient anyClient, C2273m c2273m) {
        this.f13575a.zaa.accept(anyClient, c2273m);
    }
}
