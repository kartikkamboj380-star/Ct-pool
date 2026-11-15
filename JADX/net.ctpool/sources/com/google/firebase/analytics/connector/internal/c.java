package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import v3.C2169a;

/* JADX INFO: loaded from: classes.dex */
final class c implements C2169a.InterfaceC0323a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f17356a;

    public c(d dVar) {
        this.f17356a = dVar;
    }

    @Override // w3.v
    public final void a(String str, String str2, Bundle bundle, long j7) {
        if (this.f17356a.f17357a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", a.a(str2));
            this.f17356a.f17358b.a(2, bundle2);
        }
    }
}
