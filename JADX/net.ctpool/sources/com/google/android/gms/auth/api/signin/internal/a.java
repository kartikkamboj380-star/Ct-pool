package com.google.android.gms.auth.api.signin.internal;

import Q.c;
import android.os.Bundle;
import androidx.loader.app.a;
import com.google.android.gms.common.api.GoogleApiClient;
import l3.g;
import l3.z;

/* JADX INFO: loaded from: classes.dex */
final class a implements a.InterfaceC0163a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f13543a;

    /* synthetic */ a(SignInHubActivity signInHubActivity, z zVar) {
        this.f13543a = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0163a
    public final c a(int i7, Bundle bundle) {
        return new g(this.f13543a, GoogleApiClient.getAllClients());
    }

    @Override // androidx.loader.app.a.InterfaceC0163a
    public final /* bridge */ /* synthetic */ void c(c cVar, Object obj) {
        SignInHubActivity signInHubActivity = this.f13543a;
        signInHubActivity.setResult(signInHubActivity.f13541M, signInHubActivity.f13542N);
        this.f13543a.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0163a
    public final void b(c cVar) {
    }
}
