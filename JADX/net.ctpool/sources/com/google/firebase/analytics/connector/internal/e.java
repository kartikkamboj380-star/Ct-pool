package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import v3.C2169a;

/* JADX INFO: loaded from: classes.dex */
final class e implements C2169a.InterfaceC0323a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ f f17361a;

    public e(f fVar) {
        this.f17361a = fVar;
    }

    @Override // w3.v
    public final void a(String str, String str2, Bundle bundle, long j7) {
        if (str == null || !a.f(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j7);
        bundle2.putBundle("params", bundle);
        this.f17361a.f17362a.a(3, bundle2);
    }
}
