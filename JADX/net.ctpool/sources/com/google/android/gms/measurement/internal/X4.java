package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class X4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ M5 f15856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F4 f15857n;

    X4(F4 f42, M5 m52) {
        this.f15856m = m52;
        this.f15857n = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2195f interfaceC2195f = this.f15857n.f15449d;
        if (interfaceC2195f == null) {
            this.f15857n.d().E().a("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f15856m);
            interfaceC2195f.r(this.f15856m);
            this.f15857n.k0();
        } catch (RemoteException e7) {
            this.f15857n.d().E().b("Failed to send consent settings to the service", e7);
        }
    }
}
