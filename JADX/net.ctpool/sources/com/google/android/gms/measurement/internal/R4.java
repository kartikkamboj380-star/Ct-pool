package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class R4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ M5 f15756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F4 f15757n;

    R4(F4 f42, M5 m52) {
        this.f15756m = m52;
        this.f15757n = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2195f interfaceC2195f = this.f15757n.f15449d;
        if (interfaceC2195f == null) {
            this.f15757n.d().J().a("Failed to send app backgrounded");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f15756m);
            interfaceC2195f.C(this.f15756m);
            this.f15757n.k0();
        } catch (RemoteException e7) {
            this.f15757n.d().E().b("Failed to send app backgrounded to the service", e7);
        }
    }
}
