package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import z3.AbstractC2272l;
import z3.C2273m;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0951b extends GoogleApi implements InterfaceC0956c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Api.ClientKey f13875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f13876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Api f13877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f13878e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13879a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f13875b = clientKey;
        W1 w12 = new W1();
        f13876c = w12;
        f13877d = new Api("GoogleAuthService.API", w12, clientKey);
        f13878e = h3.d.a("GoogleAuthServiceClient");
    }

    C0951b(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f13877d, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f13879a = context;
    }

    static /* bridge */ /* synthetic */ void c(Status status, Object obj, C2273m c2273m) {
        if (TaskUtil.trySetResultOrApiException(status, obj, c2273m)) {
            return;
        }
        f13878e.w("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0956c1
    public final AbstractC2272l a(final Account account, final String str, final Bundle bundle) {
        Preconditions.checkNotNull(account, "Account name cannot be null!");
        Preconditions.checkNotEmpty(str, "Scope cannot be null!");
        return doWrite(TaskApiCall.builder().setFeatures(h3.e.f19617l).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth.U1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                C0951b c0951b = this.f13855a;
                ((T1) ((Q1) obj).getService()).m0(new X1(c0951b, (C2273m) obj2), account, str, bundle);
            }
        }).setMethodKey(1512).build());
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0956c1
    public final AbstractC2272l b(final C0966g c0966g) {
        return doWrite(TaskApiCall.builder().setFeatures(h3.e.f19617l).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth.V1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                C0951b c0951b = this.f13864a;
                ((T1) ((Q1) obj).getService()).l0(new Y1(c0951b, (C2273m) obj2), c0966g);
            }
        }).setMethodKey(1513).build());
    }
}
