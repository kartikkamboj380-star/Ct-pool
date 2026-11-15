package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class S4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ M5 f15797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ Bundle f15798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ F4 f15799o;

    S4(F4 f42, M5 m52, Bundle bundle) {
        this.f15797m = m52;
        this.f15798n = bundle;
        this.f15799o = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2195f interfaceC2195f = this.f15799o.f15449d;
        if (interfaceC2195f == null) {
            this.f15799o.d().E().a("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f15797m);
            interfaceC2195f.q(this.f15798n, this.f15797m);
        } catch (RemoteException e7) {
            this.f15799o.d().E().b("Failed to send default event parameters to service", e7);
        }
    }
}
