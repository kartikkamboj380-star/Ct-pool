package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class O4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ M5 f15721m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F4 f15722n;

    O4(F4 f42, M5 m52) {
        this.f15721m = m52;
        this.f15722n = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2195f interfaceC2195f = this.f15722n.f15449d;
        if (interfaceC2195f == null) {
            this.f15722n.d().E().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f15721m);
            interfaceC2195f.e(this.f15721m);
            this.f15722n.o().H();
            this.f15722n.R(interfaceC2195f, null, this.f15721m);
            this.f15722n.k0();
        } catch (RemoteException e7) {
            this.f15722n.d().E().b("Failed to send app launch to the service", e7);
        }
    }
}
