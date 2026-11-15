package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectionResult f13590b;

    V(ConnectionResult connectionResult, int i7) {
        Preconditions.checkNotNull(connectionResult);
        this.f13590b = connectionResult;
        this.f13589a = i7;
    }

    final int a() {
        return this.f13589a;
    }

    final ConnectionResult b() {
        return this.f13590b;
    }
}
