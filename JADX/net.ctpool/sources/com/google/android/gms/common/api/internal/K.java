package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class K extends UnregisterListenerMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ RegistrationMethods.Builder f13576a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.f13576a = builder;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    protected final void unregisterListener(Api.AnyClient anyClient, C2273m c2273m) {
        this.f13576a.zab.accept(anyClient, c2273m);
    }
}
