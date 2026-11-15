package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class U4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ M5 f15813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F4 f15814n;

    U4(F4 f42, M5 m52) {
        this.f15813m = m52;
        this.f15814n = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2195f interfaceC2195f = this.f15814n.f15449d;
        if (interfaceC2195f == null) {
            this.f15814n.d().E().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f15813m);
            interfaceC2195f.d0(this.f15813m);
            this.f15814n.k0();
        } catch (RemoteException e7) {
            this.f15814n.d().E().b("Failed to send measurementEnabled to the service", e7);
        }
    }
}
