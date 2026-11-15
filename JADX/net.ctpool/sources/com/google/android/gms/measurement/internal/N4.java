package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class N4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ M5 f15711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F4 f15712n;

    N4(F4 f42, M5 m52) {
        this.f15711m = m52;
        this.f15712n = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2195f interfaceC2195f = this.f15712n.f15449d;
        if (interfaceC2195f == null) {
            this.f15712n.d().E().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f15711m);
            interfaceC2195f.p(this.f15711m);
        } catch (RemoteException e7) {
            this.f15712n.d().E().b("Failed to reset data on the service: remote exception", e7);
        }
        this.f15712n.k0();
    }
}
